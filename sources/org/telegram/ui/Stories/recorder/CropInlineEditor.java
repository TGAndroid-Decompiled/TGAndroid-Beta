package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.PhotoCropView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;

public abstract class CropInlineEditor extends FrameLayout {
    public final AnimatedFloat animatedMirror;
    public final AnimatedFloat animatedOrientation;
    public float appearProgress;
    public final FrameLayout buttonsLayout;
    public boolean closing;
    public final ContentView contentView;
    public final FrameLayout controlsLayout;
    public final CropTransform cropTransform;
    public final AnonymousClass1 cropView;
    public PhotoView photoView;
    public final int[] photoViewLocation;
    public final StoryRecorder.AnonymousClass7 previewContainer;
    public final int[] previewLocation;
    public final int[] thisLocation;
    public final CropRotationWheel wheel;

    public final class ContentView extends View {
        public final Paint dimPaint;
        public final Path previewClipPath;
        public final RectF previewClipRect;
        public final StoryRecorder.AnonymousClass37 this$0;

        public ContentView(StoryRecorder.AnonymousClass37 anonymousClass37, Context context) {
            super(context);
            this.this$0 = anonymousClass37;
            this.dimPaint = new Paint(1);
            this.previewClipPath = new Path();
            this.previewClipRect = new RectF();
            new Matrix();
            new Matrix();
            new Matrix();
        }

        private float getContainerHeight() {
            boolean z = getContext() instanceof BubbleActivity;
            AnonymousClass1 anonymousClass1 = this.this$0.cropView;
            return ((getHeight() - (anonymousClass1.topPadding + (!z ? AndroidUtilities.statusBarHeight : 0))) - anonymousClass1.bottomPadding) - AndroidUtilities.dp(32.0f);
        }

        private float getContainerWidth() {
            return getWidth() - AndroidUtilities.dp(32.0f);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            boolean z;
            MediaController.CropState cropState;
            float f;
            float f2;
            StoryRecorder.AnonymousClass37 anonymousClass37 = this.this$0;
            if (anonymousClass37.photoView == null) {
                return;
            }
            canvas.save();
            Paint paint = this.dimPaint;
            paint.setColor(-16777216);
            paint.setAlpha((int) (anonymousClass37.appearProgress * 255.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            float f3 = anonymousClass37.appearProgress;
            StoryRecorder.AnonymousClass7 anonymousClass7 = anonymousClass37.previewContainer;
            if (f3 < 1.0f) {
                Path path = this.previewClipPath;
                path.rewind();
                RectF rectF = this.previewClipRect;
                rectF.set(0.0f, 0.0f, anonymousClass7.getWidth(), anonymousClass7.getHeight());
                int[] iArr = anonymousClass37.previewLocation;
                rectF.offset(iArr[0], iArr[1]);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                AndroidUtilities.lerp(rectF, rectF2, anonymousClass37.appearProgress, rectF);
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, anonymousClass37.appearProgress);
                path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
                canvas.clipPath(path);
            }
            float f4 = anonymousClass37.appearProgress;
            float f5 = 1.0f - f4;
            int[] iArr2 = anonymousClass37.thisLocation;
            canvas.translate((-iArr2[0]) * f5, (-iArr2[1]) * f5);
            if (f5 > 0.0f) {
                boolean z2 = anonymousClass37.closing;
                int[] iArr3 = anonymousClass37.photoViewLocation;
                if (z2) {
                    anonymousClass37.photoView.getLocationOnScreen(iArr3);
                }
                canvas.translate(iArr3[0] * f5, iArr3[1] * f5);
                PhotoView photoView = anonymousClass37.photoView;
                MediaController.CropState cropState2 = photoView.crop;
                if (cropState2 != null) {
                    f2 = cropState2.cropPw;
                    f = cropState2.cropPh;
                } else {
                    f = 1.0f;
                    f2 = 1.0f;
                }
                float fLerp2 = AndroidUtilities.lerp(1.0f, (anonymousClass37.photoView.getScaleX() * (photoView.getWidth() / f2)) / anonymousClass7.getWidth(), f5);
                canvas.scale(fLerp2, fLerp2);
                canvas.rotate(anonymousClass37.photoView.getRotation() * f5);
                canvas.translate(((anonymousClass37.photoView.getContentWidth() * f2) / 2.0f) * f5, ((anonymousClass37.photoView.getContentHeight() * f) / 2.0f) * f5);
            }
            boolean z3 = getContext() instanceof BubbleActivity;
            AnonymousClass1 anonymousClass1 = anonymousClass37.cropView;
            canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f4, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + anonymousClass1.topPadding + (!z3 ? AndroidUtilities.statusBarHeight : 0)) * f4);
            if (f5 > 0.0f) {
                float contentWidth = anonymousClass37.photoView.getContentWidth();
                float contentHeight = anonymousClass37.photoView.getContentHeight();
                MediaController.CropState cropState3 = anonymousClass37.photoView.crop;
                float f6 = cropState3 != null ? cropState3.cropPw : 1.0f;
                float f7 = cropState3 != null ? cropState3.cropPh : 1.0f;
                float fLerp3 = (AndroidUtilities.lerp(1.0f, f6, f5) * contentWidth) / 2.0f;
                float fLerp4 = (AndroidUtilities.lerp(1.0f, f7, f5) * contentHeight) / 2.0f;
                float fLerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f4);
                canvas.clipRect((-fLerp3) * fLerp5, (-fLerp4) * fLerp5, fLerp3 * fLerp5, fLerp4 * fLerp5);
            }
            int currentWidth = anonymousClass37.getCurrentWidth();
            int currentHeight = anonymousClass37.getCurrentHeight();
            CropTransform cropTransform = anonymousClass37.cropTransform;
            int i = cropTransform.cropOrientation;
            if (i == 90 || i == 270) {
                currentHeight = currentWidth;
                currentWidth = currentHeight;
            }
            float fM = DiffUtil.m(cropTransform.trueCropScale, 1.0f, f5, 1.0f);
            float f8 = currentWidth;
            float containerWidth = getContainerWidth() / f8;
            float f9 = currentHeight;
            if (containerWidth * f9 > getContainerHeight()) {
                containerWidth = getContainerHeight() / f9;
            }
            canvas.translate(cropTransform.cropAreaX * 1.0f, cropTransform.cropAreaY * 1.0f);
            float f10 = (cropTransform.cropScale / fM) * containerWidth;
            PhotoView photoView2 = anonymousClass37.photoView;
            float fLerp6 = (photoView2 == null || (cropState = photoView2.crop) == null) ? AndroidUtilities.lerp(1.0f, f10, f4) : AndroidUtilities.lerp(cropState.cropScale, f10, f4);
            canvas.scale(fLerp6, fLerp6);
            canvas.translate(cropTransform.cropPx * f8 * 1.0f, cropTransform.cropPy * f9 * 1.0f);
            float orientation = anonymousClass37.animatedOrientation.set(i, false) + anonymousClass37.photoView.getOrientation() + cropTransform.cropRotation;
            MediaController.CropState cropState4 = anonymousClass37.photoView.crop;
            canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, orientation, anonymousClass37.appearProgress) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, orientation, anonymousClass37.appearProgress));
            canvas.rotate(anonymousClass37.photoView.getOrientation());
            if (anonymousClass37.closing) {
                MediaController.CropState cropState5 = anonymousClass37.photoView.crop;
                if (cropState5 == null || !cropState5.mirrored) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                CropView.CropState cropState6 = anonymousClass1.state;
                if (cropState6 == null) {
                    z = false;
                } else {
                    z = cropState6.mirrored;
                }
            }
            canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, anonymousClass37.animatedMirror.set(z)), 1.0f);
            canvas.translate((-anonymousClass37.photoView.getContentWidth()) / 2.0f, (-anonymousClass37.photoView.getContentHeight()) / 2.0f);
            PhotoView photoView3 = anonymousClass37.photoView;
            if (photoView3.bitmap != null) {
                Paint paint2 = photoView3.bitmapPaint;
                paint2.setAlpha(255);
                canvas.drawBitmap(photoView3.bitmap, 0.0f, 0.0f, paint2);
            }
            canvas.restore();
        }
    }

    public CropInlineEditor(Context context, StoryRecorder.AnonymousClass7 anonymousClass7) {
        super(context);
        this.appearProgress = 0.0f;
        this.thisLocation = new int[2];
        this.previewLocation = new int[2];
        this.photoViewLocation = new int[2];
        this.cropTransform = new CropTransform();
        this.previewContainer = anonymousClass7;
        final StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) this;
        ContentView contentView = new ContentView(anonymousClass37, context);
        this.contentView = contentView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatedMirror = new AnimatedFloat(contentView, 0L, 320L, cubicBezierInterpolator);
        this.animatedOrientation = new AnimatedFloat(contentView, 0L, 320L, cubicBezierInterpolator);
        ?? r0 = new CropView(context) {
            @Override
            public final int getCurrentHeight() {
                return anonymousClass37.getCurrentHeight();
            }

            @Override
            public final int getCurrentWidth() {
                return anonymousClass37.getCurrentWidth();
            }
        };
        this.cropView = r0;
        r0.setListener(new PhotoViewer.AnonymousClass24(anonymousClass37, 6));
        addView(r0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.controlsLayout = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        CropRotationWheel cropRotationWheel = new CropRotationWheel(context);
        this.wheel = cropRotationWheel;
        cropRotationWheel.setListener(new PhotoCropView.AnonymousClass4(anonymousClass37, 2));
        frameLayout.addView(cropRotationWheel, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.buttonsLayout = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        zzkk.m(14.0f, 1, textView);
        textView.setBackground(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(zzlm.m(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -1, 115));
        final StoryRecorder.AnonymousClass37 anonymousClass38 = (StoryRecorder.AnonymousClass37) this;
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass37 anonymousClass39 = anonymousClass38;
                        anonymousClass39.cropView.reset(true);
                        CropRotationWheel cropRotationWheel2 = anonymousClass39.wheel;
                        cropRotationWheel2.setRotated(false);
                        cropRotationWheel2.setMirrored(false);
                        cropRotationWheel2.setRotation$1(0.0f);
                        break;
                    default:
                        StoryRecorder.AnonymousClass37 anonymousClass310 = anonymousClass38;
                        PhotoView photoView = anonymousClass310.photoView;
                        if (photoView != null) {
                            photoView.crop = new MediaController.CropState();
                            anonymousClass310.cropView.applyToCropState(anonymousClass310.photoView.crop);
                            PhotoView photoView2 = anonymousClass310.photoView;
                            photoView2.crop.orientation = photoView2.getOrientation();
                            anonymousClass310.photoView.updatePosition();
                            anonymousClass310.photoView.requestLayout();
                            anonymousClass310.photoView.containerView.requestLayout();
                            anonymousClass310.photoView.containerView.invalidate();
                            anonymousClass310.photoView.containerView.post(new VoIPFragment$12$$ExternalSyntheticLambda0(anonymousClass310, 2));
                        }
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(zzlm.m(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -1, 113));
        final int i2 = 1;
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass37 anonymousClass39 = anonymousClass38;
                        anonymousClass39.cropView.reset(true);
                        CropRotationWheel cropRotationWheel2 = anonymousClass39.wheel;
                        cropRotationWheel2.setRotated(false);
                        cropRotationWheel2.setMirrored(false);
                        cropRotationWheel2.setRotation$1(0.0f);
                        break;
                    default:
                        StoryRecorder.AnonymousClass37 anonymousClass310 = anonymousClass38;
                        PhotoView photoView = anonymousClass310.photoView;
                        if (photoView != null) {
                            photoView.crop = new MediaController.CropState();
                            anonymousClass310.cropView.applyToCropState(anonymousClass310.photoView.crop);
                            PhotoView photoView2 = anonymousClass310.photoView;
                            photoView2.crop.orientation = photoView2.getOrientation();
                            anonymousClass310.photoView.updatePosition();
                            anonymousClass310.photoView.requestLayout();
                            anonymousClass310.photoView.containerView.requestLayout();
                            anonymousClass310.photoView.containerView.invalidate();
                            anonymousClass310.photoView.containerView.post(new VoIPFragment$12$$ExternalSyntheticLambda0(anonymousClass310, 2));
                        }
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(zzlm.m(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, LayoutHelper.createFrame(-2, -1, 117));
        final int i3 = 2;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass37 anonymousClass39 = anonymousClass38;
                        anonymousClass39.cropView.reset(true);
                        CropRotationWheel cropRotationWheel2 = anonymousClass39.wheel;
                        cropRotationWheel2.setRotated(false);
                        cropRotationWheel2.setMirrored(false);
                        cropRotationWheel2.setRotation$1(0.0f);
                        break;
                    default:
                        StoryRecorder.AnonymousClass37 anonymousClass310 = anonymousClass38;
                        PhotoView photoView = anonymousClass310.photoView;
                        if (photoView != null) {
                            photoView.crop = new MediaController.CropState();
                            anonymousClass310.cropView.applyToCropState(anonymousClass310.photoView.crop);
                            PhotoView photoView2 = anonymousClass310.photoView;
                            photoView2.crop.orientation = photoView2.getOrientation();
                            anonymousClass310.photoView.updatePosition();
                            anonymousClass310.photoView.requestLayout();
                            anonymousClass310.photoView.containerView.requestLayout();
                            anonymousClass310.photoView.containerView.invalidate();
                            anonymousClass310.photoView.containerView.post(new VoIPFragment$12$$ExternalSyntheticLambda0(anonymousClass310, 2));
                        }
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        PhotoView photoView = this.photoView;
        if (photoView == null) {
            return 1;
        }
        return (photoView.getOrientation() == 90 || this.photoView.getOrientation() == 270) ? this.photoView.getContentWidth() : this.photoView.getContentHeight();
    }

    public int getCurrentWidth() {
        PhotoView photoView = this.photoView;
        if (photoView == null) {
            return 1;
        }
        return (photoView.getOrientation() == 90 || this.photoView.getOrientation() == 270) ? this.photoView.getContentHeight() : this.photoView.getContentWidth();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.appearProgress;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDp = AndroidUtilities.dp(52.0f);
        AnonymousClass1 anonymousClass1 = this.cropView;
        anonymousClass1.setTopPadding(fDp);
        anonymousClass1.setBottomPadding(AndroidUtilities.dp(116.0f) + this.controlsLayout.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void set(PhotoView photoView) {
        if (photoView == null) {
            return;
        }
        this.photoView = photoView;
        setVisibility(0);
        this.closing = false;
        AnonymousClass1 anonymousClass1 = this.cropView;
        anonymousClass1.isVisible = true;
        getLocationOnScreen(this.thisLocation);
        this.previewContainer.getLocationOnScreen(this.previewLocation);
        photoView.getLocationOnScreen(this.photoViewLocation);
        MediaController.CropState cropState = photoView.crop;
        if (cropState == null) {
            cropState = null;
        }
        anonymousClass1.start(photoView.getOrientation(), this.cropTransform, cropState);
        float rotation = anonymousClass1.getRotation();
        CropRotationWheel cropRotationWheel = this.wheel;
        cropRotationWheel.setRotation(rotation);
        AnimatedFloat animatedFloat = this.animatedMirror;
        if (cropState != null) {
            cropRotationWheel.setRotation$1(cropState.cropRotate);
            cropRotationWheel.setRotated(cropState.transformRotation != 0);
            cropRotationWheel.setMirrored(cropState.mirrored);
            animatedFloat.set(cropState.mirrored, false);
        } else {
            cropRotationWheel.setRotation$1(0.0f);
            cropRotationWheel.setRotated(false);
            cropRotationWheel.setMirrored(false);
            animatedFloat.getClass();
            animatedFloat.set(0.0f, false);
        }
        anonymousClass1.updateMatrix(false);
        ContentView contentView = this.contentView;
        contentView.setVisibility(0);
        contentView.invalidate();
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.appearProgress - f) < 0.001f) {
            return;
        }
        this.appearProgress = f;
        this.contentView.invalidate();
        AnonymousClass1 anonymousClass1 = this.cropView;
        anonymousClass1.areaView.setDimAlpha(0.5f * f);
        anonymousClass1.areaView.setFrameAlpha(f);
        anonymousClass1.areaView.invalidate();
    }
}
