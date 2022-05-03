package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_messageActionUserUpdatedPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaInvoice;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public class PinchToZoomHelper {
    Callback callback;
    private View child;
    private ImageReceiver childImage;
    ClipBoundsListener clipBoundsListener;
    private float enterProgress;
    private float finishProgress;
    ValueAnimator finishTransition;
    float fragmentOffsetX;
    float fragmentOffsetY;
    private final ViewGroup fragmentView;
    private float fullImageHeight;
    private float fullImageWidth;
    private float imageHeight;
    private float imageWidth;
    private float imageX;
    private float imageY;
    private boolean inOverlayMode;
    private boolean isHardwareVideo;
    boolean isInPinchToZoomTouchMode;
    private MessageObject messageObject;
    private ZoomOverlayView overlayView;
    float parentOffsetX;
    float parentOffsetY;
    private final ViewGroup parentView;
    float pinchCenterX;
    float pinchCenterY;
    float pinchScale;
    float pinchStartCenterX;
    float pinchStartCenterY;
    float pinchStartDistance;
    float pinchTranslationX;
    float pinchTranslationY;
    private int pointerId1;
    private int pointerId2;
    private float progressToFullView;
    private ImageReceiver fullImage = new ImageReceiver();
    private float[] clipTopBottom = new float[2];

    public interface Callback {

        public final class CC {
            public static TextureView $default$getCurrentTextureView(Callback callback) {
                return null;
            }

            public static void $default$onZoomFinished(Callback callback, MessageObject messageObject) {
            }
        }

        TextureView getCurrentTextureView();

        void onZoomFinished(MessageObject messageObject);

        void onZoomStarted(MessageObject messageObject);
    }

    public interface ClipBoundsListener {
        void getClipTopBottom(float[] fArr);
    }

    protected void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
    }

    static float access$1416(PinchToZoomHelper pinchToZoomHelper, float f) {
        float f2 = pinchToZoomHelper.progressToFullView + f;
        pinchToZoomHelper.progressToFullView = f2;
        return f2;
    }

    static float access$616(PinchToZoomHelper pinchToZoomHelper, float f) {
        float f2 = pinchToZoomHelper.enterProgress + f;
        pinchToZoomHelper.enterProgress = f2;
        return f2;
    }

    public PinchToZoomHelper(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.parentView = viewGroup;
        this.fragmentView = viewGroup2;
    }

    public void startZoom(View view, ImageReceiver imageReceiver, MessageObject messageObject) {
        this.child = view;
        this.messageObject = messageObject;
        if (this.overlayView == null) {
            ZoomOverlayView zoomOverlayView = new ZoomOverlayView(this.parentView.getContext());
            this.overlayView = zoomOverlayView;
            zoomOverlayView.setFocusable(false);
            this.overlayView.setFocusableInTouchMode(false);
            this.overlayView.setEnabled(false);
        }
        if (this.fullImage == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.fullImage = imageReceiver2;
            imageReceiver2.setCrossfadeAlpha((byte) 2);
            this.fullImage.setCrossfadeWithOldImage(false);
            this.fullImage.onAttachedToWindow();
        }
        this.inOverlayMode = true;
        this.parentView.addView(this.overlayView);
        this.finishProgress = 1.0f;
        this.progressToFullView = 0.0f;
        setFullImage(messageObject);
        this.imageX = imageReceiver.getImageX();
        this.imageY = imageReceiver.getImageY();
        this.imageHeight = imageReceiver.getImageHeight();
        this.imageWidth = imageReceiver.getImageWidth();
        this.fullImageHeight = imageReceiver.getBitmapHeight();
        float bitmapWidth = imageReceiver.getBitmapWidth();
        this.fullImageWidth = bitmapWidth;
        float f = this.fullImageHeight;
        float f2 = this.imageHeight;
        float f3 = this.imageWidth;
        if (f / bitmapWidth == f2 / f3) {
            this.fullImageHeight = f2;
            this.fullImageWidth = f3;
        } else if (f / bitmapWidth < f2 / f3) {
            this.fullImageWidth = (bitmapWidth / f) * f2;
            this.fullImageHeight = f2;
        } else {
            this.fullImageHeight = (f / bitmapWidth) * f3;
            this.fullImageWidth = f3;
        }
        if (messageObject == null || !messageObject.isVideo() || !MediaController.getInstance().isPlayingMessage(messageObject)) {
            this.isHardwareVideo = false;
            ImageReceiver imageReceiver3 = new ImageReceiver();
            this.childImage = imageReceiver3;
            imageReceiver3.onAttachedToWindow();
            Drawable drawable = imageReceiver.getDrawable();
            this.childImage.setImageBitmap(drawable);
            if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                animatedFileDrawable.addSecondParentView(this.overlayView);
                animatedFileDrawable.setInvalidateParentViewWithSecond(true);
            }
            this.childImage.setImageCoords(this.imageX, this.imageY, this.imageWidth, this.imageHeight);
            this.childImage.setRoundRadius(imageReceiver.getRoundRadius());
            this.fullImage.setRoundRadius(imageReceiver.getRoundRadius());
            this.overlayView.videoPlayerContainer.setVisibility(8);
        } else {
            this.isHardwareVideo = true;
            MediaController.getInstance().setTextureView(this.overlayView.videoTextureView, this.overlayView.aspectRatioFrameLayout, this.overlayView.videoPlayerContainer, true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayView.videoPlayerContainer.getLayoutParams();
            this.overlayView.videoPlayerContainer.setTag(R.id.parent_tag, imageReceiver);
            if (!(layoutParams.width == imageReceiver.getImageWidth() && layoutParams.height == imageReceiver.getImageHeight())) {
                this.overlayView.aspectRatioFrameLayout.setResizeMode(3);
                layoutParams.width = (int) imageReceiver.getImageWidth();
                layoutParams.height = (int) imageReceiver.getImageHeight();
                this.overlayView.videoPlayerContainer.setLayoutParams(layoutParams);
            }
            this.overlayView.videoTextureView.setScaleX(1.0f);
            this.overlayView.videoTextureView.setScaleY(1.0f);
            if (this.callback != null) {
                this.overlayView.backupImageView.setImageBitmap(this.callback.getCurrentTextureView().getBitmap((int) this.fullImageWidth, (int) this.fullImageHeight));
                this.overlayView.backupImageView.setSize((int) this.fullImageWidth, (int) this.fullImageHeight);
                this.overlayView.backupImageView.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius());
            }
            this.overlayView.videoPlayerContainer.setVisibility(0);
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onZoomStarted(messageObject);
        }
        this.enterProgress = 0.0f;
    }

    private void setFullImage(MessageObject messageObject) {
        if (messageObject != null && messageObject.isPhoto()) {
            int[] iArr = new int[1];
            ImageLocation imageLocation = getImageLocation(messageObject, iArr);
            if (imageLocation != null) {
                this.fullImage.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                this.fullImage.setCrossfadeAlpha((byte) 2);
            }
            updateViewsLocation();
        }
    }

    public boolean updateViewsLocation() {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (View view = this.child; view != this.parentView; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f2 += view.getLeft();
            f3 += view.getTop();
        }
        float f4 = 0.0f;
        for (View view2 = this.child; view2 != this.fragmentView; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f += view2.getLeft();
            f4 += view2.getTop();
        }
        this.fragmentOffsetX = f;
        this.fragmentOffsetY = f4;
        this.parentOffsetX = f2;
        this.parentOffsetY = f3;
        return true;
    }

    public void finishZoom() {
        if (this.finishTransition == null && this.inOverlayMode) {
            if (!updateViewsLocation()) {
                clear();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.finishTransition = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PinchToZoomHelper.this.lambda$finishZoom$0(valueAnimator);
                }
            });
            this.finishTransition.addListener(new AnimatorListenerAdapter() {
                {
                    PinchToZoomHelper.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    PinchToZoomHelper pinchToZoomHelper = PinchToZoomHelper.this;
                    if (pinchToZoomHelper.finishTransition != null) {
                        pinchToZoomHelper.finishTransition = null;
                        pinchToZoomHelper.clear();
                    }
                }
            });
            this.finishTransition.setDuration(220L);
            this.finishTransition.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.finishTransition.start();
        }
    }

    public void lambda$finishZoom$0(ValueAnimator valueAnimator) {
        this.finishProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateViews();
    }

    public void clear() {
        if (this.inOverlayMode) {
            Callback callback = this.callback;
            if (callback != null) {
                callback.onZoomFinished(this.messageObject);
            }
            this.inOverlayMode = false;
        }
        ZoomOverlayView zoomOverlayView = this.overlayView;
        if (!(zoomOverlayView == null || zoomOverlayView.getParent() == null)) {
            this.parentView.removeView(this.overlayView);
            this.overlayView.backupImageView.getImageReceiver().clearImage();
            ImageReceiver imageReceiver = this.childImage;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof AnimatedFileDrawable) {
                    ((AnimatedFileDrawable) drawable).removeSecondParentView(this.overlayView);
                }
            }
        }
        View view = this.child;
        if (view != null) {
            view.invalidate();
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
        this.messageObject = null;
    }

    public boolean isInOverlayMode() {
        return this.inOverlayMode;
    }

    public boolean isInOverlayModeFor(View view) {
        return this.inOverlayMode && view == this.child;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!updateViewsLocation() || this.child == null) {
            return false;
        }
        motionEvent.offsetLocation(-this.fragmentOffsetX, -this.fragmentOffsetY);
        return this.child.onTouchEvent(motionEvent);
    }

    public Bitmap getVideoBitmap(int i, int i2) {
        ZoomOverlayView zoomOverlayView = this.overlayView;
        if (zoomOverlayView == null) {
            return null;
        }
        return zoomOverlayView.videoTextureView.getBitmap(i, i2);
    }

    public ImageReceiver getPhotoImage() {
        return this.childImage;
    }

    public boolean zoomEnabled(View view, ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof AnimatedFileDrawable) {
            return !((AnimatedFileDrawable) imageReceiver.getDrawable()).isLoadingStream();
        }
        return imageReceiver.hasNotThumb();
    }

    public class ZoomOverlayView extends FrameLayout {
        private Paint aspectPaint;
        private Path aspectPath;
        private AspectRatioFrameLayout aspectRatioFrameLayout;
        private BackupImageView backupImageView;
        private FrameLayout videoPlayerContainer;
        private TextureView videoTextureView;

        public ZoomOverlayView(Context context) {
            super(context);
            PinchToZoomHelper.this = r5;
            this.aspectPath = new Path();
            this.aspectPaint = new Paint(1);
            if (Build.VERSION.SDK_INT >= 21) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.videoPlayerContainer = frameLayout;
                frameLayout.setOutlineProvider(new ViewOutlineProvider(this, r5) {
                    @Override
                    @TargetApi(R.styleable.MapAttrs_uiZoomGestures)
                    public void getOutline(View view, Outline outline) {
                        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                        if (imageReceiver != null) {
                            int[] roundRadius = imageReceiver.getRoundRadius();
                            int i = 0;
                            for (int i2 = 0; i2 < 4; i2++) {
                                i = Math.max(i, roundRadius[i2]);
                            }
                            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i);
                            return;
                        }
                        int i3 = AndroidUtilities.roundMessageSize;
                        outline.setOval(0, 0, i3, i3);
                    }
                });
                this.videoPlayerContainer.setClipToOutline(true);
            } else {
                this.videoPlayerContainer = new FrameLayout(context, r5) {
                    RectF rect = new RectF();

                    {
                        ZoomOverlayView.this = this;
                    }

                    @Override
                    protected void onSizeChanged(int i, int i2, int i3, int i4) {
                        super.onSizeChanged(i, i2, i3, i4);
                        ZoomOverlayView.this.aspectPath.reset();
                        ImageReceiver imageReceiver = (ImageReceiver) getTag(R.id.parent_tag);
                        if (imageReceiver != null) {
                            int[] roundRadius = imageReceiver.getRoundRadius();
                            int i5 = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                i5 = Math.max(i5, roundRadius[i6]);
                            }
                            this.rect.set(0.0f, 0.0f, i, i2);
                            ZoomOverlayView.this.aspectPath.addRoundRect(this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
                        } else {
                            float f = i / 2;
                            ZoomOverlayView.this.aspectPath.addCircle(f, i2 / 2, f, Path.Direction.CW);
                        }
                        ZoomOverlayView.this.aspectPath.toggleInverseFillType();
                    }

                    @Override
                    public void setVisibility(int i) {
                        super.setVisibility(i);
                        if (i == 0) {
                            setLayerType(2, null);
                        }
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        super.dispatchDraw(canvas);
                        if (getTag() == null) {
                            canvas.drawPath(ZoomOverlayView.this.aspectPath, ZoomOverlayView.this.aspectPaint);
                        }
                    }
                };
                this.aspectPath = new Path();
                Paint paint = new Paint(1);
                this.aspectPaint = paint;
                paint.setColor(-16777216);
                this.aspectPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            BackupImageView backupImageView = new BackupImageView(context);
            this.backupImageView = backupImageView;
            this.videoPlayerContainer.addView(backupImageView);
            this.videoPlayerContainer.setWillNotDraw(false);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setBackgroundColor(0);
            this.videoPlayerContainer.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1, 17));
            TextureView textureView = new TextureView(context);
            this.videoTextureView = textureView;
            textureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1.0f));
            addView(this.videoPlayerContainer, LayoutHelper.createFrame(-2, -2.0f));
            setWillNotDraw(false);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f;
            PinchToZoomHelper pinchToZoomHelper;
            ClipBoundsListener clipBoundsListener;
            PinchToZoomHelper pinchToZoomHelper2 = PinchToZoomHelper.this;
            if (pinchToZoomHelper2.finishTransition == null && pinchToZoomHelper2.enterProgress != 1.0f) {
                PinchToZoomHelper.access$616(PinchToZoomHelper.this, 0.07272727f);
                if (PinchToZoomHelper.this.enterProgress > 1.0f) {
                    PinchToZoomHelper.this.enterProgress = 1.0f;
                } else {
                    PinchToZoomHelper.this.invalidateViews();
                }
            }
            float interpolation = PinchToZoomHelper.this.finishProgress * CubicBezierInterpolator.DEFAULT.getInterpolation(PinchToZoomHelper.this.enterProgress);
            float f2 = getMeasuredHeight();
            if (interpolation == 1.0f || (clipBoundsListener = (pinchToZoomHelper = PinchToZoomHelper.this).clipBoundsListener) == null) {
                drawImage(canvas);
                super.dispatchDraw(canvas);
                f = 0.0f;
            } else {
                clipBoundsListener.getClipTopBottom(pinchToZoomHelper.clipTopBottom);
                canvas.save();
                float f3 = 1.0f - interpolation;
                float f4 = PinchToZoomHelper.this.clipTopBottom[0] * f3;
                float measuredHeight = (getMeasuredHeight() * interpolation) + (PinchToZoomHelper.this.clipTopBottom[1] * f3);
                canvas.clipRect(0.0f, f4, getMeasuredWidth(), measuredHeight);
                drawImage(canvas);
                super.dispatchDraw(canvas);
                canvas.restore();
                f = f4;
                f2 = measuredHeight;
            }
            PinchToZoomHelper.this.drawOverlays(canvas, 1.0f - interpolation, PinchToZoomHelper.this.parentOffsetX - getLeft(), PinchToZoomHelper.this.parentOffsetY - getTop(), f, f2);
        }

        private void drawImage(Canvas canvas) {
            if (PinchToZoomHelper.this.inOverlayMode && PinchToZoomHelper.this.child != null && PinchToZoomHelper.this.parentView != null) {
                PinchToZoomHelper.this.updateViewsLocation();
                float left = PinchToZoomHelper.this.parentOffsetX - getLeft();
                float top = PinchToZoomHelper.this.parentOffsetY - getTop();
                canvas.save();
                PinchToZoomHelper pinchToZoomHelper = PinchToZoomHelper.this;
                float f = ((pinchToZoomHelper.pinchScale * pinchToZoomHelper.finishProgress) + 1.0f) - PinchToZoomHelper.this.finishProgress;
                PinchToZoomHelper pinchToZoomHelper2 = PinchToZoomHelper.this;
                canvas.scale(f, f, pinchToZoomHelper2.pinchCenterX + left, pinchToZoomHelper2.pinchCenterY + top);
                PinchToZoomHelper pinchToZoomHelper3 = PinchToZoomHelper.this;
                PinchToZoomHelper pinchToZoomHelper4 = PinchToZoomHelper.this;
                canvas.translate((pinchToZoomHelper3.pinchTranslationX * pinchToZoomHelper3.finishProgress) + left, (pinchToZoomHelper4.pinchTranslationY * pinchToZoomHelper4.finishProgress) + top);
                if (PinchToZoomHelper.this.fullImage != null && PinchToZoomHelper.this.fullImage.hasNotThumb()) {
                    if (PinchToZoomHelper.this.progressToFullView != 1.0f) {
                        PinchToZoomHelper.access$1416(PinchToZoomHelper.this, 0.10666667f);
                        if (PinchToZoomHelper.this.progressToFullView > 1.0f) {
                            PinchToZoomHelper.this.progressToFullView = 1.0f;
                        } else {
                            PinchToZoomHelper.this.invalidateViews();
                        }
                    }
                    PinchToZoomHelper.this.fullImage.setAlpha(PinchToZoomHelper.this.progressToFullView);
                }
                float f2 = PinchToZoomHelper.this.imageX;
                float f3 = PinchToZoomHelper.this.imageY;
                if (!(PinchToZoomHelper.this.imageHeight == PinchToZoomHelper.this.fullImageHeight && PinchToZoomHelper.this.imageWidth == PinchToZoomHelper.this.fullImageWidth)) {
                    float f4 = f < 1.0f ? 0.0f : f < 1.4f ? (f - 1.0f) / 0.4f : 1.0f;
                    float f5 = ((PinchToZoomHelper.this.fullImageWidth - PinchToZoomHelper.this.imageWidth) / 2.0f) * f4;
                    float f6 = PinchToZoomHelper.this.imageX - f5;
                    float f7 = ((PinchToZoomHelper.this.fullImageHeight - PinchToZoomHelper.this.imageHeight) / 2.0f) * f4;
                    float f8 = PinchToZoomHelper.this.imageY - f7;
                    if (PinchToZoomHelper.this.childImage != null) {
                        PinchToZoomHelper.this.childImage.setImageCoords(f6, f8, PinchToZoomHelper.this.imageWidth + (f5 * 2.0f), PinchToZoomHelper.this.imageHeight + (f7 * 2.0f));
                    }
                    f3 = f8;
                    f2 = f6;
                }
                if (PinchToZoomHelper.this.isHardwareVideo) {
                    FrameLayout frameLayout = this.videoPlayerContainer;
                    PinchToZoomHelper pinchToZoomHelper5 = PinchToZoomHelper.this;
                    frameLayout.setPivotX(pinchToZoomHelper5.pinchCenterX - pinchToZoomHelper5.imageX);
                    FrameLayout frameLayout2 = this.videoPlayerContainer;
                    PinchToZoomHelper pinchToZoomHelper6 = PinchToZoomHelper.this;
                    frameLayout2.setPivotY(pinchToZoomHelper6.pinchCenterY - pinchToZoomHelper6.imageY);
                    this.videoPlayerContainer.setScaleY(f);
                    this.videoPlayerContainer.setScaleX(f);
                    FrameLayout frameLayout3 = this.videoPlayerContainer;
                    float f9 = f2 + left;
                    PinchToZoomHelper pinchToZoomHelper7 = PinchToZoomHelper.this;
                    frameLayout3.setTranslationX(f9 + (pinchToZoomHelper7.pinchTranslationX * f * pinchToZoomHelper7.finishProgress));
                    FrameLayout frameLayout4 = this.videoPlayerContainer;
                    float f10 = f3 + top;
                    PinchToZoomHelper pinchToZoomHelper8 = PinchToZoomHelper.this;
                    frameLayout4.setTranslationY(f10 + (pinchToZoomHelper8.pinchTranslationY * f * pinchToZoomHelper8.finishProgress));
                } else if (PinchToZoomHelper.this.childImage != null) {
                    if (PinchToZoomHelper.this.progressToFullView != 1.0f) {
                        PinchToZoomHelper.this.childImage.draw(canvas);
                        PinchToZoomHelper.this.fullImage.setImageCoords(PinchToZoomHelper.this.childImage.getImageX(), PinchToZoomHelper.this.childImage.getImageY(), PinchToZoomHelper.this.childImage.getImageWidth(), PinchToZoomHelper.this.childImage.getImageHeight());
                        PinchToZoomHelper.this.fullImage.draw(canvas);
                    } else {
                        PinchToZoomHelper.this.fullImage.setImageCoords(PinchToZoomHelper.this.childImage.getImageX(), PinchToZoomHelper.this.childImage.getImageY(), PinchToZoomHelper.this.childImage.getImageWidth(), PinchToZoomHelper.this.childImage.getImageHeight());
                        PinchToZoomHelper.this.fullImage.draw(canvas);
                    }
                }
                canvas.restore();
            }
        }
    }

    private ImageLocation getImageLocation(MessageObject messageObject, int[] iArr) {
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        if (!(tLRPC$Message instanceof TLRPC$TL_messageService)) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if ((!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) || tLRPC$MessageMedia.photo == null) && (!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaWebPage) || tLRPC$MessageMedia.webpage == null)) {
                if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaInvoice) {
                    return ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC$TL_messageMediaInvoice) tLRPC$MessageMedia).photo));
                }
                if (messageObject.getDocument() != null) {
                    TLRPC$Document document = messageObject.getDocument();
                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (iArr != null) {
                            iArr[0] = closestPhotoSizeWithSize.size;
                            if (iArr[0] == 0) {
                                iArr[0] = -1;
                            }
                        }
                        return ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                    }
                }
            } else if (messageObject.isGif()) {
                return ImageLocation.getForDocument(messageObject.getDocument());
            } else {
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                if (closestPhotoSizeWithSize2 != null) {
                    if (iArr != null) {
                        iArr[0] = closestPhotoSizeWithSize2.size;
                        if (iArr[0] == 0) {
                            iArr[0] = -1;
                        }
                    }
                    return ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                } else if (iArr != null) {
                    iArr[0] = -1;
                }
            }
        } else if (tLRPC$Message.action instanceof TLRPC$TL_messageActionUserUpdatedPhoto) {
            return null;
        } else {
            TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize3 != null) {
                if (iArr != null) {
                    iArr[0] = closestPhotoSizeWithSize3.size;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                }
                return ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
            } else if (iArr != null) {
                iArr[0] = -1;
            }
        }
        return null;
    }

    public void setClipBoundsListener(ClipBoundsListener clipBoundsListener) {
        this.clipBoundsListener = clipBoundsListener;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent, View view, ImageReceiver imageReceiver, MessageObject messageObject) {
        if (!zoomEnabled(view, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (!this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                this.pinchCenterX = x;
                this.pinchStartCenterX = x;
                float y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                this.pinchCenterY = y;
                this.pinchStartCenterY = y;
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.isInPinchToZoomTouchMode = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && this.isInPinchToZoomTouchMode) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                if (this.pointerId1 == motionEvent.getPointerId(i3)) {
                    i = i3;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i3)) {
                    i2 = i3;
                }
            }
            if (i == -1 || i2 == -1) {
                this.isInPinchToZoomTouchMode = false;
                view.getParent().requestDisallowInterceptTouchEvent(false);
                finishZoom();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / this.pinchStartDistance;
            this.pinchScale = hypot;
            if (hypot > 1.005f && !isInOverlayMode()) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                float x2 = (motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f;
                this.pinchCenterX = x2;
                this.pinchStartCenterX = x2;
                float y2 = (motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f;
                this.pinchCenterY = y2;
                this.pinchStartCenterY = y2;
                this.pinchScale = 1.0f;
                this.pinchTranslationX = 0.0f;
                this.pinchTranslationY = 0.0f;
                view.getParent().requestDisallowInterceptTouchEvent(true);
                startZoom(view, imageReceiver, messageObject);
            }
            float x3 = this.pinchStartCenterX - ((motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f);
            float y3 = this.pinchStartCenterY - ((motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f);
            float f = this.pinchScale;
            this.pinchTranslationX = (-x3) / f;
            this.pinchTranslationY = (-y3) / f;
            invalidateViews();
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
            this.isInPinchToZoomTouchMode = false;
            view.getParent().requestDisallowInterceptTouchEvent(false);
            finishZoom();
        }
        return isInOverlayModeFor(view);
    }

    private boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public void invalidateViews() {
        ZoomOverlayView zoomOverlayView = this.overlayView;
        if (zoomOverlayView != null) {
            zoomOverlayView.invalidate();
        }
    }

    public View getChild() {
        return this.child;
    }
}
