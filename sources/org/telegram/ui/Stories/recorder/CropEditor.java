package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import kotlinx.coroutines.flow.SafeFlow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.LayoutHelper;

public abstract class CropEditor extends FrameLayout {
    public final AnimatedFloat animatedMirror;
    public final AnimatedFloat animatedOrientation;
    public float appearProgress;
    public final FrameLayout buttonsLayout;
    public boolean closing;
    public final ContentView contentView;
    public final FrameLayout controlsLayout;
    public final CropTransform cropTransform;
    public final AnonymousClass1 cropView;
    public StoryEntry entry;
    public final int[] previewLocation;
    public final StoryRecorder.AnonymousClass7 previewView;
    public final int[] thisLocation;
    public final CropRotationWheel wheel;

    public final class AnonymousClass3 implements CropRotationWheel.RotationWheelListener {
        public final int $r8$classId;
        public final FrameLayout this$0;

        public AnonymousClass3(FrameLayout frameLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public final void aspectRatioPressed() {
            switch (this.$r8$classId) {
                case 0:
                    ((StoryRecorder.AnonymousClass36) this.this$0).cropView.showAspectRatioDialog();
                    break;
                default:
                    ((StoryRecorder.AnonymousClass37) this.this$0).cropView.showAspectRatioDialog();
                    break;
            }
        }

        @Override
        public final boolean mirror() {
            switch (this.$r8$classId) {
                case 0:
                    StoryRecorder.AnonymousClass36 anonymousClass36 = (StoryRecorder.AnonymousClass36) this.this$0;
                    anonymousClass36.contentView.invalidate();
                    return anonymousClass36.cropView.mirror();
                default:
                    StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) this.this$0;
                    anonymousClass37.contentView.invalidate();
                    return anonymousClass37.cropView.mirror();
            }
        }

        @Override
        public final void onChange(float f) {
            switch (this.$r8$classId) {
                case 0:
                    ((StoryRecorder.AnonymousClass36) this.this$0).cropView.setRotation(f);
                    break;
                default:
                    ((StoryRecorder.AnonymousClass37) this.this$0).cropView.setRotation(f);
                    break;
            }
        }

        @Override
        public final void onEnd(float f) {
            switch (this.$r8$classId) {
                case 0:
                    ((StoryRecorder.AnonymousClass36) this.this$0).cropView.areaView.setGridType(1, true);
                    break;
                default:
                    ((StoryRecorder.AnonymousClass37) this.this$0).cropView.areaView.setGridType(1, true);
                    break;
            }
        }

        @Override
        public final void onStart() {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass1 anonymousClass1 = ((StoryRecorder.AnonymousClass36) this.this$0).cropView;
                    anonymousClass1.areaView.setGridType(2, false);
                    if (anonymousClass1.rotationStartScale < 1.0E-5f) {
                        anonymousClass1.rotationStartScale = anonymousClass1.state.scale;
                    }
                    break;
                default:
                    CropInlineEditor.AnonymousClass1 anonymousClass2 = ((StoryRecorder.AnonymousClass37) this.this$0).cropView;
                    anonymousClass2.areaView.setGridType(2, false);
                    if (anonymousClass2.rotationStartScale < 1.0E-5f) {
                        anonymousClass2.rotationStartScale = anonymousClass2.state.scale;
                    }
                    break;
            }
        }

        @Override
        public final boolean rotate90Pressed() {
            switch (this.$r8$classId) {
                case 0:
                    StoryRecorder.AnonymousClass36 anonymousClass36 = (StoryRecorder.AnonymousClass36) this.this$0;
                    boolean zRotate = anonymousClass36.cropView.rotate(-90.0f);
                    anonymousClass36.cropView.maximize();
                    anonymousClass36.contentView.invalidate();
                    return zRotate;
                default:
                    StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) this.this$0;
                    boolean zRotate2 = anonymousClass37.cropView.rotate(-90.0f);
                    anonymousClass37.cropView.maximize();
                    anonymousClass37.contentView.invalidate();
                    return zRotate2;
            }
        }
    }

    public final class ContentView extends View {
        public final Matrix clipMatrix;
        public final Matrix cropMatrix;
        public final Paint dimPaint;
        public final Matrix identityMatrix;
        public final Matrix invertedClipMatrix;
        public final Matrix matrix;
        public final Path previewClipPath;
        public final RectF previewClipRect;
        public final Matrix previewMatrix;
        public final StoryRecorder.AnonymousClass36 this$0;

        public ContentView(StoryRecorder.AnonymousClass36 anonymousClass36, Context context) {
            super(context);
            this.this$0 = anonymousClass36;
            this.dimPaint = new Paint(1);
            this.previewClipPath = new Path();
            this.previewClipRect = new RectF();
            this.identityMatrix = new Matrix();
            this.matrix = new Matrix();
            this.previewMatrix = new Matrix();
            this.cropMatrix = new Matrix();
            this.clipMatrix = new Matrix();
            this.invertedClipMatrix = new Matrix();
        }

        private float getContainerHeight() {
            return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f)) - this.this$0.cropView.bottomPadding) - AndroidUtilities.dp(32.0f);
        }

        private float getContainerWidth() {
            return getWidth() - AndroidUtilities.dp(32.0f);
        }

        public final void applyCrop(Matrix matrix, boolean z) {
            float f;
            MediaController.CropState cropState;
            StoryRecorder.AnonymousClass36 anonymousClass36 = this.this$0;
            int currentWidth = anonymousClass36.getCurrentWidth();
            int currentHeight = anonymousClass36.getCurrentHeight();
            CropTransform cropTransform = anonymousClass36.cropTransform;
            int i = cropTransform.cropOrientation;
            if (i == 90 || i == 270) {
                currentHeight = currentWidth;
                currentWidth = currentHeight;
            }
            float f2 = 1.0f;
            float f3 = 0.0f;
            float f4 = ((cropTransform.trueCropScale - 1.0f) * (z ? 1.0f : 0.0f)) + 1.0f;
            float f5 = currentWidth;
            float containerWidth = getContainerWidth() / f5;
            float f6 = currentHeight;
            if (containerWidth * f6 > getContainerHeight()) {
                containerWidth = getContainerHeight() / f6;
            }
            boolean z2 = (anonymousClass36.entry.orientation / 90) % 2 == 1;
            matrix.preTranslate(cropTransform.cropAreaX, cropTransform.cropAreaY);
            float f7 = (cropTransform.cropScale / f4) * containerWidth;
            StoryEntry storyEntry = anonymousClass36.entry;
            if (storyEntry == null || (cropState = storyEntry.crop) == null) {
                if (!z) {
                    f2 = f7;
                }
            } else if (z) {
                f2 = cropState.cropScale;
            } else {
                f2 = f7;
            }
            matrix.preScale(f2, f2);
            float f8 = cropTransform.cropPx;
            float f9 = cropTransform.cropPy;
            if (anonymousClass36.closing && z) {
                MediaController.CropState cropState2 = anonymousClass36.entry.crop;
                if (cropState2 == null) {
                    f = 0.0f;
                } else {
                    f = !z2 ? cropState2.cropPx : cropState2.cropPy;
                }
                if (cropState2 == null) {
                    f8 = f;
                    f9 = 0.0f;
                } else {
                    float f10 = !z2 ? cropState2.cropPy : cropState2.cropPx;
                    f8 = f;
                    f9 = f10;
                }
            }
            matrix.preTranslate(f8 * f5, f9 * f6);
            StoryEntry storyEntry2 = anonymousClass36.entry;
            float f11 = storyEntry2.orientation + cropTransform.cropRotation + i;
            MediaController.CropState cropState3 = storyEntry2.crop;
            if (cropState3 == null) {
                if (!z) {
                    f3 = f11;
                }
            } else if (z) {
                f3 = cropState3.cropRotate + cropState3.transformRotation;
            } else {
                f3 = f11;
            }
            matrix.preRotate(f3);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.this$0.entry == null) {
                return;
            }
            drawImage(canvas, false);
        }

        public final void drawImage(Canvas canvas, boolean z) {
            Canvas canvas2;
            float f;
            StoryRecorder.AnonymousClass36 anonymousClass36 = this.this$0;
            boolean z2 = true;
            int[] iArr = anonymousClass36.thisLocation;
            int[] iArr2 = anonymousClass36.previewLocation;
            StoryRecorder.AnonymousClass7 anonymousClass7 = anonymousClass36.previewView;
            if (!z) {
                canvas2 = canvas;
            } else {
                if (anonymousClass36.appearProgress >= 1.0f) {
                    return;
                }
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, anonymousClass7.getWidth(), anonymousClass7.getHeight(), (int) (Math.min(1.0f, (1.0f - anonymousClass36.appearProgress) * 2.0f) * 255.0f), 31);
                canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            }
            canvas2.save();
            Paint paint = this.dimPaint;
            paint.setColor(-16777216);
            paint.setAlpha((int) (anonymousClass36.appearProgress * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            if (anonymousClass36.appearProgress < 1.0f && !z) {
                Path path = this.previewClipPath;
                path.rewind();
                RectF rectF = this.previewClipRect;
                rectF.set(0.0f, 0.0f, anonymousClass7.getWidth(), anonymousClass7.getHeight());
                rectF.offset(iArr2[0], iArr2[1]);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                AndroidUtilities.lerp(rectF, rectF2, anonymousClass36.appearProgress, rectF);
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, anonymousClass36.appearProgress);
                path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            float f2 = anonymousClass36.appearProgress;
            Matrix matrix = this.previewMatrix;
            matrix.reset();
            Matrix matrix2 = this.cropMatrix;
            matrix2.reset();
            matrix.preTranslate(-iArr[0], -iArr[1]);
            matrix.preTranslate(iArr2[0], iArr2[1]);
            matrix.preScale(anonymousClass7.getWidth() / anonymousClass36.entry.resultWidth, anonymousClass7.getHeight() / anonymousClass36.entry.resultHeight);
            matrix.preConcat(anonymousClass36.entry.matrix);
            matrix.preTranslate(anonymousClass7.getContentWidth() / 2.0f, anonymousClass7.getContentHeight() / 2.0f);
            matrix2.preTranslate((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f), AacUtil.m(getContainerHeight(), AndroidUtilities.dp(32.0f), 2.0f, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
            if (z) {
                Matrix matrix3 = this.identityMatrix;
                float f3 = anonymousClass36.appearProgress;
                Matrix matrix4 = this.clipMatrix;
                AndroidUtilities.lerp(matrix, matrix3, f3, matrix4);
                matrix4.preRotate(-anonymousClass36.entry.orientation);
                Matrix matrix5 = this.invertedClipMatrix;
                if (matrix4.invert(matrix5)) {
                    StoryEntry storyEntry = anonymousClass36.entry;
                    int i = storyEntry.orientation;
                    MediaController.CropState cropState = storyEntry.crop;
                    boolean z3 = ((i + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                    float contentWidth = anonymousClass7.getContentWidth();
                    f = 2.0f;
                    float contentHeight = anonymousClass7.getContentHeight();
                    MediaController.CropState cropState2 = anonymousClass36.entry.crop;
                    float f4 = cropState2 != null ? cropState2.cropPw : 1.0f;
                    float f5 = cropState2 != null ? cropState2.cropPh : 1.0f;
                    float f6 = ((z3 ? contentHeight : contentWidth) * f4) / 2.0f;
                    if (!z3) {
                        contentWidth = contentHeight;
                    }
                    float f7 = (contentWidth * f5) / 2.0f;
                    float fLerp2 = AndroidUtilities.lerp(1.0f, 4.0f, f2);
                    canvas2.concat(matrix4);
                    canvas2.clipRect((-f6) * fLerp2, (-f7) * fLerp2, f6 * fLerp2, f7 * fLerp2);
                    canvas2.concat(matrix5);
                } else {
                    f = 2.0f;
                }
            } else {
                f = 2.0f;
            }
            applyCrop(matrix, true);
            applyCrop(matrix2, false);
            if (anonymousClass36.closing) {
                MediaController.CropState cropState3 = anonymousClass36.entry.crop;
                if (cropState3 == null || !cropState3.mirrored) {
                    z2 = false;
                }
            } else {
                CropView.CropState cropState4 = anonymousClass36.cropView.state;
                if (cropState4 == null) {
                    z2 = false;
                } else {
                    z2 = cropState4.mirrored;
                }
            }
            float f8 = anonymousClass36.animatedMirror.set(z2);
            float f9 = 1.0f - (f8 * f);
            matrix2.preScale(f9, 1.0f);
            matrix.preScale(f9, 1.0f);
            float fM = ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, f8, 4.0f * f8, 0.25f);
            matrix2.preSkew(0.0f, fM);
            matrix.preSkew(0.0f, fM);
            matrix2.preTranslate((-anonymousClass7.getContentWidth()) / f, (-anonymousClass7.getContentHeight()) / f);
            matrix.preTranslate((-anonymousClass7.getContentWidth()) / f, (-anonymousClass7.getContentHeight()) / f);
            float f10 = anonymousClass36.appearProgress;
            Matrix matrix6 = this.matrix;
            AndroidUtilities.lerp(matrix, matrix2, f10, matrix6);
            canvas2.concat(matrix6);
            if (anonymousClass7.textureView != null) {
                canvas2.save();
                canvas2.scale(anonymousClass7.getContentWidth() / anonymousClass7.getWidth(), anonymousClass7.getContentHeight() / anonymousClass7.getHeight());
                canvas2.concat(anonymousClass7.transformBackMatrix);
                anonymousClass7.textureView.draw(canvas2);
                canvas2.restore();
            } else if (anonymousClass7.bitmap != null && anonymousClass7.entry != null) {
                Matrix matrix7 = anonymousClass7.matrix;
                matrix7.reset();
                matrix7.preScale(anonymousClass7.entry.width / anonymousClass7.bitmap.getWidth(), anonymousClass7.entry.height / anonymousClass7.bitmap.getHeight());
                Paint paint2 = anonymousClass7.bitmapPaint;
                paint2.setAlpha(255);
                canvas2.drawBitmap(anonymousClass7.bitmap, matrix7, paint2);
            }
            canvas2.restore();
            if (z) {
                canvas2.restore();
            }
        }
    }

    public CropEditor(Context context, StoryRecorder.AnonymousClass7 anonymousClass7) {
        super(context);
        this.appearProgress = 0.0f;
        this.thisLocation = new int[2];
        this.previewLocation = new int[2];
        this.cropTransform = new CropTransform();
        this.previewView = anonymousClass7;
        final StoryRecorder.AnonymousClass36 anonymousClass36 = (StoryRecorder.AnonymousClass36) this;
        ContentView contentView = new ContentView(anonymousClass36, context);
        this.contentView = contentView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatedMirror = new AnimatedFloat(contentView, 0L, 320L, cubicBezierInterpolator);
        this.animatedOrientation = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        ?? r0 = new CropView(context) {
            @Override
            public final int getCurrentHeight() {
                return anonymousClass36.getCurrentHeight();
            }

            @Override
            public final int getCurrentWidth() {
                return anonymousClass36.getCurrentWidth();
            }
        };
        this.cropView = r0;
        r0.setListener(new SafeFlow(anonymousClass36));
        addView(r0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.controlsLayout = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        CropRotationWheel cropRotationWheel = new CropRotationWheel(context);
        this.wheel = cropRotationWheel;
        cropRotationWheel.setListener(new AnonymousClass3(anonymousClass36, 0));
        frameLayout.addView(cropRotationWheel, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.buttonsLayout = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        zzkb.m(14.0f, 1, textView);
        textView.setBackground(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -1, 115));
        final StoryRecorder.AnonymousClass36 anonymousClass37 = (StoryRecorder.AnonymousClass36) this;
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass36 anonymousClass38 = anonymousClass37;
                        anonymousClass38.cropView.reset(true);
                        CropRotationWheel cropRotationWheel2 = anonymousClass38.wheel;
                        cropRotationWheel2.setRotated(false);
                        cropRotationWheel2.setMirrored(false);
                        cropRotationWheel2.setRotation$1(0.0f);
                        anonymousClass38.contentView.invalidate();
                        break;
                    default:
                        StoryRecorder.AnonymousClass36 anonymousClass39 = anonymousClass37;
                        StoryEntry storyEntry = anonymousClass39.entry;
                        if (storyEntry != null) {
                            storyEntry.crop = new MediaController.CropState();
                            anonymousClass39.cropView.applyToCropState(anonymousClass39.entry.crop);
                            StoryEntry storyEntry2 = anonymousClass39.entry;
                            storyEntry2.crop.orientation = storyEntry2.orientation;
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
        textView2.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
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
                        StoryRecorder.AnonymousClass36 anonymousClass38 = anonymousClass37;
                        anonymousClass38.cropView.reset(true);
                        CropRotationWheel cropRotationWheel2 = anonymousClass38.wheel;
                        cropRotationWheel2.setRotated(false);
                        cropRotationWheel2.setMirrored(false);
                        cropRotationWheel2.setRotation$1(0.0f);
                        anonymousClass38.contentView.invalidate();
                        break;
                    default:
                        StoryRecorder.AnonymousClass36 anonymousClass39 = anonymousClass37;
                        StoryEntry storyEntry = anonymousClass39.entry;
                        if (storyEntry != null) {
                            storyEntry.crop = new MediaController.CropState();
                            anonymousClass39.cropView.applyToCropState(anonymousClass39.entry.crop);
                            StoryEntry storyEntry2 = anonymousClass39.entry;
                            storyEntry2.crop.orientation = storyEntry2.orientation;
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
        textView3.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
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
                        StoryRecorder.AnonymousClass36 anonymousClass38 = anonymousClass37;
                        anonymousClass38.cropView.reset(true);
                        CropRotationWheel cropRotationWheel2 = anonymousClass38.wheel;
                        cropRotationWheel2.setRotated(false);
                        cropRotationWheel2.setMirrored(false);
                        cropRotationWheel2.setRotation$1(0.0f);
                        anonymousClass38.contentView.invalidate();
                        break;
                    default:
                        StoryRecorder.AnonymousClass36 anonymousClass39 = anonymousClass37;
                        StoryEntry storyEntry = anonymousClass39.entry;
                        if (storyEntry != null) {
                            storyEntry.crop = new MediaController.CropState();
                            anonymousClass39.cropView.applyToCropState(anonymousClass39.entry.crop);
                            StoryEntry storyEntry2 = anonymousClass39.entry;
                            storyEntry2.crop.orientation = storyEntry2.orientation;
                        }
                        StoryRecorder.this.switchToEditMode(-1, false, true);
                        break;
                }
            }
        });
    }

    public int getCurrentHeight() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return 1;
        }
        int i = storyEntry.orientation;
        StoryRecorder.AnonymousClass7 anonymousClass7 = this.previewView;
        return (i == 90 || i == 270) ? anonymousClass7.getContentWidth() : anonymousClass7.getContentHeight();
    }

    public int getCurrentWidth() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return 1;
        }
        int i = storyEntry.orientation;
        StoryRecorder.AnonymousClass7 anonymousClass7 = this.previewView;
        return (i == 90 || i == 270) ? anonymousClass7.getContentHeight() : anonymousClass7.getContentWidth();
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
        setBottomPadding(AndroidUtilities.dp(116.0f) + this.controlsLayout.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.appearProgress - f) < 0.001f) {
            return;
        }
        this.appearProgress = f;
        ContentView contentView = this.contentView;
        contentView.setAlpha(f);
        contentView.invalidate();
        AnonymousClass1 anonymousClass1 = this.cropView;
        anonymousClass1.areaView.setDimAlpha(0.5f * f);
        anonymousClass1.areaView.setFrameAlpha(f);
        anonymousClass1.areaView.invalidate();
        this.previewView.invalidate();
    }

    public void setEntry(StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        this.entry = storyEntry;
        this.closing = false;
        AnonymousClass1 anonymousClass1 = this.cropView;
        anonymousClass1.isVisible = true;
        getLocationOnScreen(this.thisLocation);
        int[] iArr = this.previewLocation;
        StoryRecorder.AnonymousClass7 anonymousClass7 = this.previewView;
        anonymousClass7.getLocationOnScreen(iArr);
        MediaController.CropState cropState = storyEntry.crop;
        if (cropState == null) {
            cropState = null;
        }
        int i = storyEntry.orientation;
        CropTransform cropTransform = this.cropTransform;
        anonymousClass1.start(i, cropTransform, cropState);
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
            animatedFloat.set(false, false);
        }
        anonymousClass1.updateMatrix(false);
        this.animatedOrientation.set(cropTransform.cropOrientation, true);
        ContentView contentView = this.contentView;
        contentView.setVisibility(0);
        contentView.invalidate();
        anonymousClass7.setCropEditorDrawing(this);
    }
}
