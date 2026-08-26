package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;

public class PinchToZoomHelper {
    public ImageReceiver blurImage;
    public Callback callback;
    public ViewGroup child;
    public ImageReceiver childImage;
    public ClipBoundsListener clipBoundsListener;
    public final float[] clipTopBottom;
    public float enterProgress;
    public ColorMatrixColorFilter fancyBlurFilter;
    public float finishProgress;
    public ValueAnimator finishTransition;
    public float fragmentOffsetX;
    public float fragmentOffsetY;
    public final ViewGroup fragmentView;
    public ImageReceiver fullImage;
    public float fullImageHeight;
    public float fullImageWidth;
    public boolean hasMediaSpoiler;
    public float imageHeight;
    public float imageWidth;
    public float imageX;
    public float imageY;
    public boolean inOverlayMode;
    public boolean isHardwareVideo;
    public boolean isInPinchToZoomTouchMode;
    public final boolean isSimple;
    public final SpoilerEffect mediaSpoilerEffect;
    public SpoilerEffect2 mediaSpoilerEffect2;
    public MessageObject messageObject;
    public ZoomOverlayView overlayView;
    public float parentOffsetX;
    public float parentOffsetY;
    public final ViewGroup parentView;
    public final Path path;
    public float pinchCenterX;
    public float pinchCenterY;
    public float pinchScale;
    public float pinchStartCenterX;
    public float pinchStartCenterY;
    public float pinchStartDistance;
    public float pinchTranslationX;
    public float pinchTranslationY;
    public int pointerId1;
    public int pointerId2;
    public float progressToFullView;
    public final float[] spoilerRadii;

    public interface Callback {
        TextureView getCurrentTextureView();

        void onZoomFinished(MessageObject messageObject);

        void onZoomStarted(MessageObject messageObject);
    }

    public interface ClipBoundsListener {
        void getClipTopBottom(float[] fArr);
    }

    public final class ZoomOverlayView extends FrameLayout {
        public final AspectRatioFrameLayout aspectRatioFrameLayout;
        public final BackupImageView backupImageView;
        public final FrameLayout videoPlayerContainer;
        public final TextureView videoTextureView;

        public final class AnonymousClass1 extends ViewOutlineProvider {
            @Override
            public final void getOutline(View view, Outline outline) {
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver == null) {
                    int i = AndroidUtilities.roundMessageSize;
                    outline.setOval(0, 0, i, i);
                    return;
                }
                int[] roundRadius = imageReceiver.getRoundRadius(true);
                int iMax = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    iMax = Math.max(iMax, roundRadius[i2]);
                }
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), iMax);
            }
        }

        public ZoomOverlayView(Context context) {
            super(context);
            new Path();
            new Paint(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.videoPlayerContainer = frameLayout;
            frameLayout.setOutlineProvider(new AnonymousClass1());
            frameLayout.setClipToOutline(true);
            BackupImageView backupImageView = new BackupImageView(context);
            this.backupImageView = backupImageView;
            frameLayout.addView(backupImageView);
            frameLayout.setWillNotDraw(false);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setBackgroundColor(0);
            frameLayout.addView(aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1, 17));
            TextureView textureView = new TextureView(context);
            this.videoTextureView = textureView;
            textureView.setOpaque(false);
            aspectRatioFrameLayout.addView(textureView, LayoutHelper.createFrame(-1.0f, -1));
            addView(frameLayout, LayoutHelper.createFrame(-2.0f, -2));
            setWillNotDraw(false);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            ClipBoundsListener clipBoundsListener;
            PinchToZoomHelper pinchToZoomHelper = PinchToZoomHelper.this;
            if (pinchToZoomHelper.finishTransition == null) {
                float f2 = pinchToZoomHelper.enterProgress;
                if (f2 != 1.0f) {
                    float f3 = f2 + 0.07272727f;
                    pinchToZoomHelper.enterProgress = f3;
                    if (f3 > 1.0f) {
                        pinchToZoomHelper.enterProgress = 1.0f;
                    } else {
                        pinchToZoomHelper.invalidateViews();
                    }
                }
            }
            float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(pinchToZoomHelper.enterProgress) * pinchToZoomHelper.finishProgress;
            float measuredHeight = getMeasuredHeight();
            if (interpolation == 1.0f || (clipBoundsListener = pinchToZoomHelper.clipBoundsListener) == null) {
                drawImage(canvas);
                super.dispatchDraw(canvas);
                f = 0.0f;
            } else {
                float[] fArr = pinchToZoomHelper.clipTopBottom;
                clipBoundsListener.getClipTopBottom(fArr);
                canvas.save();
                float f4 = 1.0f - interpolation;
                float f5 = fArr[0] * f4;
                measuredHeight = (fArr[1] * f4) + (getMeasuredHeight() * interpolation);
                canvas.clipRect(0.0f, f5, getMeasuredWidth(), measuredHeight);
                drawImage(canvas);
                super.dispatchDraw(canvas);
                canvas.restore();
                f = f5;
            }
            PinchToZoomHelper.this.drawOverlays(canvas, 1.0f - interpolation, pinchToZoomHelper.parentOffsetX - getLeft(), pinchToZoomHelper.parentOffsetY - getTop(), f, measuredHeight);
        }

        public final void drawImage(Canvas canvas) {
            float f;
            Canvas canvas2;
            PinchToZoomHelper pinchToZoomHelper = PinchToZoomHelper.this;
            if (!pinchToZoomHelper.inOverlayMode || pinchToZoomHelper.child == null || pinchToZoomHelper.parentView == null) {
                return;
            }
            pinchToZoomHelper.updateViewsLocation();
            float left = pinchToZoomHelper.parentOffsetX - getLeft();
            float top = pinchToZoomHelper.parentOffsetY - getTop();
            canvas.save();
            float f2 = pinchToZoomHelper.pinchScale;
            float f3 = pinchToZoomHelper.finishProgress;
            float f4 = ((f2 * f3) + 1.0f) - f3;
            canvas.scale(f4, f4, pinchToZoomHelper.pinchCenterX + left, pinchToZoomHelper.pinchCenterY + top);
            float f5 = pinchToZoomHelper.pinchTranslationX;
            float f6 = pinchToZoomHelper.finishProgress;
            canvas.translate((f5 * f6) + left, (pinchToZoomHelper.pinchTranslationY * f6) + top);
            ImageReceiver imageReceiver = pinchToZoomHelper.fullImage;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f7 = pinchToZoomHelper.progressToFullView;
                if (f7 != 1.0f) {
                    float f8 = f7 + 0.10666667f;
                    pinchToZoomHelper.progressToFullView = f8;
                    if (f8 > 1.0f) {
                        pinchToZoomHelper.progressToFullView = 1.0f;
                    } else {
                        pinchToZoomHelper.invalidateViews();
                    }
                }
                pinchToZoomHelper.fullImage.setAlpha(pinchToZoomHelper.progressToFullView);
            }
            float f9 = pinchToZoomHelper.imageX;
            float f10 = pinchToZoomHelper.imageY;
            float f11 = pinchToZoomHelper.imageHeight;
            float f12 = pinchToZoomHelper.fullImageHeight;
            if (f11 != f12 || pinchToZoomHelper.imageWidth != pinchToZoomHelper.fullImageWidth) {
                if (f4 < 1.0f) {
                    f = 0.0f;
                } else {
                    f = f4 < 1.4f ? (f4 - 1.0f) / 0.4f : 1.0f;
                }
                float f13 = pinchToZoomHelper.fullImageWidth;
                float f14 = pinchToZoomHelper.imageWidth;
                float f15 = ((f13 - f14) / 2.0f) * f;
                f9 -= f15;
                float f16 = ((f12 - f11) / 2.0f) * f;
                f10 -= f16;
                ImageReceiver imageReceiver2 = pinchToZoomHelper.childImage;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f9, f10, (f15 * 2.0f) + f14, (f16 * 2.0f) + f11);
                }
            }
            if (pinchToZoomHelper.isHardwareVideo) {
                FrameLayout frameLayout = this.videoPlayerContainer;
                frameLayout.setPivotX(pinchToZoomHelper.pinchCenterX - pinchToZoomHelper.imageX);
                frameLayout.setPivotY(pinchToZoomHelper.pinchCenterY - pinchToZoomHelper.imageY);
                frameLayout.setScaleY(f4);
                frameLayout.setScaleX(f4);
                frameLayout.setTranslationX((pinchToZoomHelper.pinchTranslationX * f4 * pinchToZoomHelper.finishProgress) + f9 + left);
                frameLayout.setTranslationY((pinchToZoomHelper.pinchTranslationY * f4 * pinchToZoomHelper.finishProgress) + f10 + top);
            } else {
                ImageReceiver imageReceiver3 = pinchToZoomHelper.childImage;
                if (imageReceiver3 != null) {
                    if (pinchToZoomHelper.progressToFullView != 1.0f) {
                        if (imageReceiver3.getLottieAnimation() != null || pinchToZoomHelper.childImage.getAnimation() != null || pinchToZoomHelper.fullImage.getLottieAnimation() != null || pinchToZoomHelper.fullImage.getAnimation() != null) {
                            invalidate();
                        }
                        pinchToZoomHelper.childImage.draw(canvas);
                        pinchToZoomHelper.fullImage.setImageCoords(pinchToZoomHelper.childImage.getImageX(), pinchToZoomHelper.childImage.getImageY(), pinchToZoomHelper.childImage.getImageWidth(), pinchToZoomHelper.childImage.getImageHeight());
                        pinchToZoomHelper.fullImage.draw(canvas);
                    } else {
                        pinchToZoomHelper.fullImage.setImageCoords(imageReceiver3.getImageX(), pinchToZoomHelper.childImage.getImageY(), pinchToZoomHelper.childImage.getImageWidth(), pinchToZoomHelper.childImage.getImageHeight());
                        pinchToZoomHelper.fullImage.draw(canvas);
                        if (pinchToZoomHelper.fullImage.getLottieAnimation() != null || pinchToZoomHelper.fullImage.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            }
            if (pinchToZoomHelper.hasMediaSpoiler) {
                pinchToZoomHelper.blurImage.setAlpha(pinchToZoomHelper.childImage.getAlpha());
                pinchToZoomHelper.blurImage.setRoundRadius(pinchToZoomHelper.childImage.getRoundRadius(true));
                pinchToZoomHelper.blurImage.setImageCoords(pinchToZoomHelper.childImage.getImageX(), pinchToZoomHelper.childImage.getImageY(), pinchToZoomHelper.childImage.getImageWidth(), pinchToZoomHelper.childImage.getImageHeight());
                pinchToZoomHelper.blurImage.draw(canvas);
                int[] roundRadius = pinchToZoomHelper.childImage.getRoundRadius(true);
                float f17 = roundRadius[0];
                float[] fArr = pinchToZoomHelper.spoilerRadii;
                fArr[1] = f17;
                fArr[0] = f17;
                float f18 = roundRadius[1];
                fArr[3] = f18;
                fArr[2] = f18;
                float f19 = roundRadius[2];
                fArr[5] = f19;
                fArr[4] = f19;
                float f20 = roundRadius[3];
                fArr[7] = f20;
                fArr[6] = f20;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pinchToZoomHelper.childImage.getImageX(), pinchToZoomHelper.childImage.getImageY(), pinchToZoomHelper.childImage.getImageX2(), pinchToZoomHelper.childImage.getImageY2());
                Path path = pinchToZoomHelper.path;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (pinchToZoomHelper.mediaSpoilerEffect2 != null) {
                    canvas.translate(pinchToZoomHelper.childImage.getImageX(), pinchToZoomHelper.childImage.getImageY());
                    canvas2 = canvas;
                    pinchToZoomHelper.mediaSpoilerEffect2.draw(canvas2, pinchToZoomHelper.overlayView, (int) pinchToZoomHelper.childImage.getImageWidth(), (int) pinchToZoomHelper.childImage.getImageHeight(), 1.0f, false);
                } else {
                    canvas2 = canvas;
                    int alphaComponent = ColorUtils.setAlphaComponent(-1, (int) (pinchToZoomHelper.childImage.getAlpha() * Color.alpha(-1) * 0.325f));
                    SpoilerEffect spoilerEffect = pinchToZoomHelper.mediaSpoilerEffect;
                    spoilerEffect.setColor(alphaComponent);
                    spoilerEffect.setBounds((int) pinchToZoomHelper.childImage.getImageX(), (int) pinchToZoomHelper.childImage.getImageY(), (int) pinchToZoomHelper.childImage.getImageX2(), (int) pinchToZoomHelper.childImage.getImageY2());
                    spoilerEffect.draw(canvas2);
                }
                canvas2.restore();
                invalidate();
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
    }

    public PinchToZoomHelper(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.fullImage = new ImageReceiver();
        this.blurImage = new ImageReceiver();
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.path = new Path();
        this.spoilerRadii = new float[8];
        this.clipTopBottom = new float[2];
        this.parentView = viewGroup;
        this.fragmentView = viewGroup2;
        this.isSimple = false;
    }

    public final boolean checkPinchToZoom(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!zoomEnabled(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (!this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                this.pinchCenterX = x;
                this.pinchStartCenterX = x;
                float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                this.pinchCenterY = y;
                this.pinchStartCenterY = y;
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.isInPinchToZoomTouchMode = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && this.isInPinchToZoomTouchMode) {
            int i6 = -1;
            int i7 = -1;
            for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
                if (this.pointerId1 == motionEvent.getPointerId(i8)) {
                    i6 = i8;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i8)) {
                    i7 = i8;
                }
            }
            if (i6 == -1 || i7 == -1) {
                this.isInPinchToZoomTouchMode = false;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                finishZoom();
                return false;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i7) - motionEvent.getX(i6), motionEvent.getY(i7) - motionEvent.getY(i6))) / this.pinchStartDistance;
            this.pinchScale = fHypot;
            if (fHypot <= 1.005f || this.inOverlayMode) {
                i2 = i7;
                i3 = i6;
            } else {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i7) - motionEvent.getX(i6), motionEvent.getY(i7) - motionEvent.getY(i6));
                float x2 = (motionEvent.getX(i7) + motionEvent.getX(i6)) / 2.0f;
                this.pinchCenterX = x2;
                this.pinchStartCenterX = x2;
                float y2 = (motionEvent.getY(i7) + motionEvent.getY(i6)) / 2.0f;
                this.pinchCenterY = y2;
                this.pinchStartCenterY = y2;
                this.pinchScale = 1.0f;
                this.pinchTranslationX = 0.0f;
                this.pinchTranslationY = 0.0f;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                this.child = viewGroup;
                this.messageObject = messageObject;
                ZoomOverlayView zoomOverlayView = this.overlayView;
                ViewGroup viewGroup2 = this.parentView;
                boolean z = this.isSimple;
                if (zoomOverlayView != null || z) {
                    i4 = -1;
                } else {
                    i4 = -1;
                    ZoomOverlayView zoomOverlayView2 = new ZoomOverlayView(viewGroup2.getContext());
                    this.overlayView = zoomOverlayView2;
                    zoomOverlayView2.setFocusable(false);
                    this.overlayView.setFocusableInTouchMode(false);
                    this.overlayView.setEnabled(false);
                }
                if (this.fullImage == null) {
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    this.fullImage = imageReceiver2;
                    imageReceiver2.setCrossfadeAlpha((byte) 2);
                    this.fullImage.setCrossfadeWithOldImage(false);
                    this.fullImage.onAttachedToWindow();
                    ImageReceiver imageReceiver3 = new ImageReceiver();
                    this.blurImage = imageReceiver3;
                    imageReceiver3.setCrossfadeAlpha((byte) 2);
                    this.blurImage.setCrossfadeWithOldImage(false);
                    this.blurImage.onAttachedToWindow();
                }
                this.inOverlayMode = true;
                this.finishProgress = 1.0f;
                this.progressToFullView = 0.0f;
                if (z) {
                    i5 = i6;
                    i2 = i7;
                } else {
                    viewGroup2.addView(this.overlayView);
                    boolean z2 = (messageObject == null || !messageObject.hasMediaSpoilers() || messageObject.isMediaSpoilersRevealed) ? false : true;
                    this.hasMediaSpoiler = z2;
                    if (z2 && this.mediaSpoilerEffect2 == null) {
                        SpoilerEffect2 spoilerEffect2 = SpoilerEffect2.getInstance(this.overlayView);
                        this.mediaSpoilerEffect2 = spoilerEffect2;
                        if (spoilerEffect2 != null) {
                            spoilerEffect2.holdersToIndex.put(this.overlayView, Integer.valueOf(i));
                        }
                    }
                    ImageLocation forDocument = null;
                    if (this.blurImage.getBitmap() != null) {
                        this.blurImage.getBitmap().recycle();
                        this.blurImage.setImageBitmap((Bitmap) null);
                    }
                    if (imageReceiver.getBitmap() == null || imageReceiver.getBitmap().isRecycled() || !this.hasMediaSpoiler) {
                        this.blurImage.setColorFilter(null);
                    } else {
                        this.blurImage.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                        ImageReceiver imageReceiver4 = this.blurImage;
                        if (this.fancyBlurFilter == null) {
                            ColorMatrix colorMatrix = new ColorMatrix();
                            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                            this.fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
                        }
                        imageReceiver4.setColorFilter(this.fancyBlurFilter);
                    }
                    if (messageObject != null && messageObject.isPhoto()) {
                        int[] iArr = new int[1];
                        TLRPC.Message message = messageObject.messageOwner;
                        if (!(message instanceof TLRPC.TL_messageService)) {
                            TLRPC.MessageMedia messageMedia = message.media;
                            if ((!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null) && (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || messageMedia.webpage == null)) {
                                if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                    forDocument = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                } else if (messageObject.getDocument() != null) {
                                    TLRPC.Document document = messageObject.getDocument();
                                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                        int i9 = closestPhotoSizeWithSize.size;
                                        iArr[0] = i9;
                                        if (i9 == 0) {
                                            iArr[0] = i4;
                                        }
                                        forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                                    }
                                }
                            } else if (messageObject.isGif()) {
                                forDocument = ImageLocation.getForDocument(messageObject.getDocument());
                            } else {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                if (closestPhotoSizeWithSize2 != null) {
                                    int i10 = closestPhotoSizeWithSize2.size;
                                    iArr[0] = i10;
                                    if (i10 == 0) {
                                        iArr[0] = i4;
                                    }
                                    forDocument = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                } else {
                                    iArr[0] = i4;
                                }
                            }
                        } else if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                            if (closestPhotoSizeWithSize3 != null) {
                                int i11 = closestPhotoSizeWithSize3.size;
                                iArr[0] = i11;
                                if (i11 == 0) {
                                    iArr[0] = i4;
                                }
                                forDocument = ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                            } else {
                                iArr[0] = i4;
                            }
                        }
                        if (forDocument != null) {
                            i2 = i7;
                            i5 = i6;
                            this.fullImage.setImage(forDocument, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                            this.fullImage.setCrossfadeAlpha((byte) 2);
                        } else {
                            i5 = i6;
                            i2 = i7;
                        }
                        updateViewsLocation();
                    } else {
                        i5 = i6;
                        i2 = i7;
                    }
                    this.imageX = imageReceiver.getImageX();
                    this.imageY = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                    this.imageHeight = imageReceiver.getImageHeight();
                    this.imageWidth = imageReceiver.getImageWidth();
                    this.fullImageHeight = imageReceiver.getBitmapHeight();
                    float bitmapWidth = imageReceiver.getBitmapWidth();
                    this.fullImageWidth = bitmapWidth;
                    float f = this.fullImageHeight;
                    float f2 = f / bitmapWidth;
                    float f3 = this.imageHeight;
                    float f4 = this.imageWidth;
                    float f5 = f3 / f4;
                    if (f2 == f5) {
                        this.fullImageHeight = f3;
                        this.fullImageWidth = f4;
                    } else if (f2 < f5) {
                        this.fullImageWidth = (bitmapWidth / f) * f3;
                        this.fullImageHeight = f3;
                    } else {
                        this.fullImageHeight = f2 * f4;
                        this.fullImageWidth = f4;
                    }
                    if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        this.isHardwareVideo = true;
                        MediaController mediaController = MediaController.getInstance();
                        ZoomOverlayView zoomOverlayView3 = this.overlayView;
                        mediaController.setTextureView(zoomOverlayView3.videoTextureView, zoomOverlayView3.aspectRatioFrameLayout, zoomOverlayView3.videoPlayerContainer, true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayView.videoPlayerContainer.getLayoutParams();
                        this.overlayView.videoPlayerContainer.setTag(R.id.parent_tag, imageReceiver);
                        if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                            this.overlayView.aspectRatioFrameLayout.setResizeMode(3);
                            layoutParams.width = (int) imageReceiver.getImageWidth();
                            layoutParams.height = (int) imageReceiver.getImageHeight();
                            this.overlayView.videoPlayerContainer.setLayoutParams(layoutParams);
                        }
                        this.overlayView.videoTextureView.setScaleX(1.0f);
                        this.overlayView.videoTextureView.setScaleY(1.0f);
                        Callback callback = this.callback;
                        if (callback != null) {
                            this.overlayView.backupImageView.setImageBitmap(callback.getCurrentTextureView().getBitmap((int) this.fullImageWidth, (int) this.fullImageHeight));
                            BackupImageView backupImageView = this.overlayView.backupImageView;
                            int i12 = (int) this.fullImageWidth;
                            int i13 = (int) this.fullImageHeight;
                            backupImageView.width = i12;
                            backupImageView.height = i13;
                            backupImageView.invalidate();
                            this.overlayView.backupImageView.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                        }
                        this.overlayView.videoPlayerContainer.setVisibility(0);
                    } else {
                        this.isHardwareVideo = false;
                        ImageReceiver imageReceiver5 = new ImageReceiver();
                        this.childImage = imageReceiver5;
                        imageReceiver5.onAttachedToWindow();
                        Drawable drawable = imageReceiver.getDrawable();
                        this.childImage.setImageBitmap(drawable);
                        if (drawable instanceof AnimatedFileDrawable) {
                            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                            animatedFileDrawable.addSecondParentView(this.overlayView);
                            animatedFileDrawable.invalidateParentViewWithSecond = true;
                        }
                        this.childImage.setImageCoords(this.imageX, this.imageY, this.imageWidth, this.imageHeight);
                        this.childImage.setAspectFit(imageReceiver.isAspectFit());
                        this.childImage.setRoundRadius(imageReceiver.getRoundRadius(true));
                        this.fullImage.setRoundRadius(imageReceiver.getRoundRadius(true));
                        this.fullImage.setAspectFit(imageReceiver.isAspectFit());
                        this.overlayView.videoPlayerContainer.setVisibility(8);
                    }
                }
                Callback callback2 = this.callback;
                if (callback2 != null) {
                    callback2.onZoomStarted(messageObject);
                }
                this.enterProgress = 0.0f;
                i3 = i5;
            }
            int i14 = i2;
            float x3 = (motionEvent.getX(i14) + motionEvent.getX(i3)) / 2.0f;
            float y3 = (motionEvent.getY(i14) + motionEvent.getY(i3)) / 2.0f;
            float f6 = this.pinchStartCenterX - x3;
            float f7 = this.pinchStartCenterY - y3;
            float f8 = -f6;
            float f9 = this.pinchScale;
            this.pinchTranslationX = f8 / f9;
            this.pinchTranslationY = (-f7) / f9;
            invalidateViews();
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) || (this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
            this.isInPinchToZoomTouchMode = false;
            if (viewGroup != null && viewGroup.getParent() != null) {
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
            }
            finishZoom();
        }
        return isInOverlayModeFor(viewGroup);
    }

    public final void clear() {
        if (this.inOverlayMode) {
            Callback callback = this.callback;
            if (callback != null) {
                callback.onZoomFinished(this.messageObject);
            }
            this.inOverlayMode = false;
        }
        ZoomOverlayView zoomOverlayView = this.overlayView;
        if (zoomOverlayView != null && zoomOverlayView.getParent() != null) {
            this.parentView.removeView(this.overlayView);
            this.overlayView.backupImageView.getImageReceiver().clearImage();
            SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
            if (spoilerEffect2 != null) {
                spoilerEffect2.detach(this.overlayView);
                this.mediaSpoilerEffect2 = null;
            }
            ImageReceiver imageReceiver = this.childImage;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof AnimatedFileDrawable) {
                    ((AnimatedFileDrawable) drawable).removeSecondParentView(this.overlayView);
                }
            }
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup != null) {
            viewGroup.invalidate();
            this.child = null;
        }
        ImageReceiver imageReceiver2 = this.childImage;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.childImage.clearImage();
            this.childImage = null;
        }
        ImageReceiver imageReceiver3 = this.fullImage;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.fullImage.clearImage();
            this.fullImage = null;
        }
        ImageReceiver imageReceiver4 = this.blurImage;
        if (imageReceiver4 != null) {
            imageReceiver4.onDetachedFromWindow();
            this.blurImage.clearImage();
            this.blurImage = null;
        }
        this.messageObject = null;
    }

    public void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
    }

    public final void finishZoom() {
        if (this.finishTransition == null && this.inOverlayMode) {
            if (!this.isSimple && !updateViewsLocation()) {
                clear();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.finishTransition = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 24));
            this.finishTransition.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 3));
            this.finishTransition.setDuration(220L);
            this.finishTransition.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.finishTransition.start();
        }
    }

    public void invalidateViews() {
        ViewGroup viewGroup;
        if (this.isSimple && (viewGroup = this.child) != null) {
            viewGroup.invalidate();
        }
        ZoomOverlayView zoomOverlayView = this.overlayView;
        if (zoomOverlayView != null) {
            zoomOverlayView.invalidate();
        }
    }

    public final boolean isInOverlayModeFor(ViewGroup viewGroup) {
        return this.inOverlayMode && viewGroup == this.child;
    }

    public final void setClipBoundsListener(ChatActivity$$ExternalSyntheticLambda50 chatActivity$$ExternalSyntheticLambda50) {
        this.clipBoundsListener = chatActivity$$ExternalSyntheticLambda50;
    }

    public final boolean updateViewsLocation() {
        float left = 0.0f;
        float top = 0.0f;
        float left2 = 0.0f;
        for (View view = this.child; view != this.parentView; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            left2 += view.getLeft();
            top += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float top2 = 0.0f;
        for (View view2 = this.child; view2 != this.fragmentView; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            left += view2.getLeft();
            top2 += view2.getTop();
        }
        this.fragmentOffsetX = left;
        this.fragmentOffsetY = top2;
        this.parentOffsetX = left2;
        this.parentOffsetY = top;
        return true;
    }

    public boolean zoomEnabled(ViewGroup viewGroup, ImageReceiver imageReceiver) {
        if (this.isSimple) {
            return true;
        }
        if (!(imageReceiver.getDrawable() instanceof AnimatedFileDrawable)) {
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = ((AnimatedFileDrawable) imageReceiver.getDrawable()).stream;
        return animatedFileDrawableStream == null || !animatedFileDrawableStream.isWaitingForLoad();
    }

    public PinchToZoomHelper() {
        this.fullImage = new ImageReceiver();
        this.blurImage = new ImageReceiver();
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.path = new Path();
        this.spoilerRadii = new float[8];
        this.clipTopBottom = new float[2];
        this.parentView = null;
        this.fragmentView = null;
        this.isSimple = true;
    }
}
