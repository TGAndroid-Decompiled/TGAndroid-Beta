package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public abstract class CollageLayoutView2 extends FrameLayout implements ItemOptions.ScrimView {
    public static final int $r8$clinit = 0;
    public final AnimatedFloat[] animatedColumns;
    public final AnimatedFloat animatedReordering;
    public final AnimatedFloat animatedRows;
    public boolean attached;
    public final BlurringShader.BlurManager blurManager;
    public Object blurRenderNode;
    public Drawable cameraThumbDrawable;
    public boolean cameraThumbVisible;
    public CameraView cameraView;
    public Object cameraViewBlurRenderNode;
    public Runnable cancelGestures;
    public final Path clipPath;
    public final FrameLayout containerView;
    public CollageLayout currentLayout;
    public Part currentPart;
    public float dx;
    public float dy;
    public boolean fastSeek;
    public final LinearGradient gradient;
    public final Matrix gradientMatrix;
    public final int gradientWidth;
    public final Paint highlightPaint;
    public final Path highlightPath;
    public boolean isMuted;
    public long lastPausedPosition;
    public float ldx;
    public float ldy;
    public final float[] lefts;
    public Part longPressedPart;
    public boolean needsBlur;
    public Part nextPart;
    public Runnable onCameraThumbClick;
    public CollageLayoutView2$$ExternalSyntheticLambda0 onLongPressPart;
    public Runnable onResetState;
    public final ArrayList parts;
    public boolean playing;
    public Part pressedPart;
    public boolean preview;
    public long previewStartTime;
    public PreviewView previewView;
    public final QRScanner.QrRegionDrawer qrDrawer;
    public final float[] radii;
    public final RectF rect;
    public final ArrayList removingParts;
    public Object renderNode;
    public boolean reordering;
    public Part reorderingPart;
    public boolean reorderingTouch;
    public final CollageLayoutView2$$ExternalSyntheticLambda0 resetReordering;
    public final DarkThemeResourceProvider resourcesProvider;
    public boolean restorePositionOnPlaying;
    public final float[] rights;
    public final CollageLayoutView2$$ExternalSyntheticLambda0 syncRunnable;
    public TimelineView timelineView;
    public float tx;
    public float ty;

    public final class Part {
        public ValueAnimator animator;
        public StoryEntry content;
        public boolean current;
        public final AnimatedFloat highlightAnimated;
        public final ImageReceiver imageReceiver;
        public int index;
        public CollageLayout.Part part;
        public TextureView textureView;
        public boolean textureViewReady;
        public VideoScreenPreview.AnonymousClass3 videoPlayer;
        public volatile long pendingSeek = -1;
        public boolean hasBounds = false;
        public final RectF fromBounds = new RectF();
        public final RectF bounds = new RectF();
        public float boundsTransition = 1.0f;

        public Part() {
            this.highlightAnimated = new AnimatedFloat(CollageLayoutView2.this, 0L, 1200L, CubicBezierInterpolator.EASE_OUT);
            this.imageReceiver = new ImageReceiver(CollageLayoutView2.this);
        }

        public final void setContent(StoryEntry storyEntry) {
            float f;
            VideoScreenPreview.AnonymousClass3 anonymousClass3 = this.videoPlayer;
            if (anonymousClass3 != null) {
                anonymousClass3.pause();
                this.videoPlayer.release(null);
                this.videoPlayer = null;
            }
            TextureView textureView = this.textureView;
            if (textureView != null) {
                AndroidUtilities.removeFromParent(textureView);
                this.textureView = null;
            }
            this.textureViewReady = false;
            this.content = storyEntry;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
            sb.append("_");
            sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
            String strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, (storyEntry == null || !storyEntry.isVideo) ? "" : "_g", "_exif");
            StoryEntry storyEntry2 = this.content;
            ImageReceiver imageReceiver = this.imageReceiver;
            CollageLayoutView2 collageLayoutView2 = CollageLayoutView2.this;
            if (storyEntry2 == null) {
                imageReceiver.clearImage();
            } else if (storyEntry2.isVideo) {
                Bitmap bitmap = storyEntry2.blurredVideoThumb;
                if (bitmap != null) {
                    imageReceiver.setImageBitmap(bitmap);
                } else {
                    Bitmap bitmap2 = storyEntry2.thumbBitmap;
                    if (bitmap2 != null) {
                        imageReceiver.setImageBitmap(bitmap2);
                    } else {
                        String str = storyEntry2.thumbPath;
                        if (str != null) {
                            imageReceiver.setImage(str, strM, null, null, 0L);
                        } else {
                            imageReceiver.clearImage();
                        }
                    }
                }
                TextureView textureView2 = new TextureView(collageLayoutView2.getContext());
                this.textureView = textureView2;
                collageLayoutView2.addView(textureView2);
                VideoScreenPreview.AnonymousClass3 anonymousClass4 = new VideoScreenPreview.AnonymousClass3(this, 1);
                this.videoPlayer = anonymousClass4;
                anonymousClass4.allowMultipleInstances(true);
                this.videoPlayer.with(this.textureView);
                this.videoPlayer.preparePlayer(Uri.fromFile(this.content.file), false, 1.0f);
                VideoScreenPreview.AnonymousClass3 anonymousClass5 = this.videoPlayer;
                if (collageLayoutView2.isMuted) {
                    f = 0.0f;
                } else {
                    StoryEntry storyEntry3 = this.content;
                    if (storyEntry3.muted || !collageLayoutView2.preview) {
                        f = 0.0f;
                    } else {
                        f = storyEntry3.videoVolume;
                    }
                }
                anonymousClass5.setVolume(f);
                if (!collageLayoutView2.preview || collageLayoutView2.playing) {
                    this.videoPlayer.play();
                } else {
                    this.videoPlayer.pause();
                }
            } else {
                imageReceiver.setImage(storyEntry2.file.getAbsolutePath(), strM, null, null, 0L);
            }
            collageLayoutView2.invalidate();
        }

        public final void setPart(CollageLayout.Part part, boolean z) {
            CollageLayout.Part part2 = this.part;
            if (part != null) {
                this.part = part;
            }
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            RectF rectF = this.bounds;
            CollageLayoutView2 collageLayoutView2 = CollageLayoutView2.this;
            if (z) {
                boolean z2 = this.hasBounds;
                RectF rectF2 = this.fromBounds;
                if (z2) {
                    AndroidUtilities.lerp(rectF2, rectF, this.boundsTransition, rectF2);
                } else {
                    CollageLayoutView2.access$400(collageLayoutView2, rectF2, part);
                }
                if (part == null) {
                    CollageLayoutView2.access$400(collageLayoutView2, rectF, part2);
                } else {
                    collageLayoutView2.layout(rectF, part);
                }
                this.boundsTransition = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(this, 15));
                this.animator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 28));
                this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.animator.setDuration(360L);
                this.animator.start();
            } else {
                collageLayoutView2.layout(rectF, part);
                this.boundsTransition = 1.0f;
            }
            collageLayoutView2.invalidate();
            this.hasBounds = true;
        }
    }

    public CollageLayoutView2(Activity activity, BlurringShader.BlurManager blurManager, FrameLayout frameLayout, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(activity);
        this.qrDrawer = new QRScanner.QrRegionDrawer(new CollageLayoutView2$$ExternalSyntheticLambda0(this, 1));
        this.currentLayout = new CollageLayout(".");
        ArrayList arrayList = new ArrayList();
        this.parts = arrayList;
        this.removingParts = new ArrayList();
        Paint paint = new Paint(1);
        this.highlightPaint = paint;
        this.highlightPath = new Path();
        this.radii = new float[8];
        this.resetReordering = new CollageLayoutView2$$ExternalSyntheticLambda0(this, 2);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatedRows = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.animatedColumns = new AnimatedFloat[]{new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator), new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator), new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator), new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator), new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator)};
        this.animatedReordering = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.lefts = new float[5];
        this.rights = new float[5];
        this.rect = new RectF();
        this.clipPath = new Path();
        this.cameraThumbVisible = true;
        this.playing = true;
        this.restorePositionOnPlaying = true;
        this.syncRunnable = new CollageLayoutView2$$ExternalSyntheticLambda0(this, 3);
        this.blurManager = blurManager;
        this.containerView = frameLayout;
        this.resourcesProvider = darkThemeResourceProvider;
        setBackgroundColor(-14737633);
        Part part = new Part();
        part.setPart((CollageLayout.Part) this.currentLayout.parts.get(0), false);
        part.current = true;
        if (this.attached) {
            part.imageReceiver.onAttachedToWindow();
        }
        arrayList.add(part);
        this.currentPart = part;
        this.nextPart = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int iDp = AndroidUtilities.dp(300.0f);
        this.gradientWidth = iDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.gradient = linearGradient;
        this.gradientMatrix = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void access$400(CollageLayoutView2 collageLayoutView2, RectF rectF, CollageLayout.Part part) {
        int measuredWidth = collageLayoutView2.getMeasuredWidth();
        int measuredHeight = collageLayoutView2.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            measuredHeight = point.y;
            measuredWidth = i;
        }
        collageLayoutView2.layout(rectF, part);
        float f = rectF.left;
        boolean z = f <= 0.0f;
        float f2 = rectF.top;
        boolean z2 = f2 <= 0.0f;
        float f3 = measuredWidth;
        boolean z3 = rectF.right >= f3;
        float f4 = measuredHeight;
        boolean z4 = rectF.bottom >= f4;
        if (z && z3 && !z2 && !z4) {
            rectF.offset(0.0f, f4 - f2);
            return;
        }
        if (z2 && z4 && !z && !z3) {
            rectF.offset(0.0f, f3 - f);
            return;
        }
        if (z3 && !z) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z4 || z2) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public static void drawDrawable(Canvas canvas, Drawable drawable, RectF rectF, float f) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float fMax = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(fMax, fMax);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f > 0.0f) {
            canvas.drawColor(Theme.multAlpha(drawable.getAlpha() * f, -16777216));
        }
        canvas.restore();
    }

    public final boolean cancelTouch() {
        if (this.pressedPart == null) {
            return false;
        }
        this.pressedPart = null;
        this.reorderingTouch = false;
        invalidate();
        CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0 = this.onLongPressPart;
        if (collageLayoutView2$$ExternalSyntheticLambda0 == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0);
        this.onLongPressPart = null;
        return true;
    }

    public final void clear$2() {
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Part) obj).setContent(null);
        }
        updatePartsState();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvasBeginRecording;
        double d;
        float[] fArr;
        float f;
        float[] fArr2;
        ArrayList arrayList;
        RectF rectF;
        float f2;
        BlurringShader.BlurManager blurManager;
        float fDp;
        float fDp2;
        Part part;
        int i;
        if (this.renderNode == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvasBeginRecording = canvas;
        } else {
            RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(this.renderNode);
            renderNodeM.setPosition(0, 0, getWidth(), getHeight());
            canvasBeginRecording = renderNodeM.beginRecording();
        }
        super.dispatchDraw(canvasBeginRecording);
        boolean zHasLayout = hasLayout();
        AnimatedFloat animatedFloat = this.animatedRows;
        AnimatedFloat[] animatedFloatArr = this.animatedColumns;
        if (!zHasLayout && !this.reordering && !this.reorderingTouch) {
            float f3 = animatedFloat.value;
            CollageLayout collageLayout = this.currentLayout;
            if (f3 == collageLayout.h && animatedFloatArr[0].value == collageLayout.columns[0]) {
                QRScanner.QrRegionDrawer qrRegionDrawer = this.qrDrawer;
                if (!qrRegionDrawer.hasQrResult && qrRegionDrawer.animatedQr.value <= 0.0f) {
                    setCameraNeedsBlur(false);
                    if (this.renderNode == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
                        return;
                    }
                    RenderNode renderNodeM2 = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(this.renderNode);
                    renderNodeM2.endRecording();
                    canvas.drawRenderNode(renderNodeM2);
                    Object obj = this.blurRenderNode;
                    if (obj != null) {
                        RenderNode renderNodeM3 = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(obj);
                        renderNodeM3.setPosition(0, 0, getWidth(), getHeight());
                        renderNodeM3.beginRecording().drawRenderNode(renderNodeM2);
                        renderNodeM3.endRecording();
                        return;
                    }
                    return;
                }
            }
        }
        if (this.preview) {
            setCameraNeedsBlur(false);
        }
        canvasBeginRecording.drawColor(-14737633);
        float f4 = this.animatedReordering.set(this.reorderingTouch);
        float f5 = animatedFloat.set(this.currentLayout.h, false);
        int i2 = 0;
        while (true) {
            double d2 = i2;
            d = f5;
            double dCeil = Math.ceil(d);
            fArr = this.rights;
            f = 0.0f;
            fArr2 = this.lefts;
            if (d2 >= dCeil) {
                break;
            }
            fArr2[i2] = getMeasuredWidth();
            fArr[i2] = 0.0f;
            i2++;
        }
        for (int i3 = this.currentLayout.h; i3 < animatedFloatArr.length; i3++) {
            animatedFloatArr[i3].set(1.0f, false);
        }
        float fMax = 0.0f;
        int i4 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.parts;
            int size = arrayList.size();
            rectF = this.rect;
            if (i4 >= size) {
                break;
            }
            Part part2 = (Part) arrayList.get(i4);
            CollageLayout.Part part3 = part2.part;
            float[] fArr3 = fArr;
            int i5 = part3.y;
            float f6 = f4;
            float f7 = f5;
            float f8 = animatedFloatArr[i5].set(part3.layout.columns[i5], false);
            boolean z2 = this.reordering;
            int i6 = part3.y;
            if (z2 || this.reorderingTouch) {
                i = i6;
                AndroidUtilities.lerp(part2.fromBounds, part2.bounds, part2.boundsTransition, rectF);
            } else {
                float measuredWidth = getMeasuredWidth() / f8;
                int i7 = part3.x;
                i = i6;
                rectF.set(measuredWidth * i7, i6 * (getMeasuredHeight() / f7), (getMeasuredWidth() / f8) * (i7 + 1), (getMeasuredHeight() / f7) * (i + 1));
            }
            fArr2[i] = Math.min(fArr2[i], rectF.left);
            fArr3[i] = Math.max(fArr3[i], rectF.right);
            fMax = Math.max(fMax, rectF.bottom);
            if (f6 <= 0.0f || part2 != this.reorderingPart) {
                if (this.preview && part2.videoPlayer != null) {
                    z = true;
                }
                drawPart(canvasBeginRecording, rectF, part2);
            }
            i4++;
            fArr = fArr3;
            f5 = f7;
            f4 = f6;
            animatedFloatArr = animatedFloatArr;
        }
        float[] fArr4 = fArr;
        float f9 = f4;
        float f10 = f5;
        AnimatedFloat[] animatedFloatArr2 = animatedFloatArr;
        int i8 = 0;
        while (true) {
            ArrayList arrayList2 = this.removingParts;
            if (i8 >= arrayList2.size()) {
                break;
            }
            Part part4 = (Part) arrayList2.get(i8);
            CollageLayout.Part part5 = part4.part;
            int i9 = part5.y;
            AnimatedFloat animatedFloat2 = animatedFloatArr2[i9];
            int[] iArr = this.currentLayout.columns;
            int i10 = i8;
            float f11 = animatedFloat2.set(i9 >= iArr.length ? 1.0f : iArr[i9], false);
            float measuredWidth2 = getMeasuredWidth() / f11;
            int i11 = part5.x;
            float measuredHeight = getMeasuredHeight() / f10;
            int i12 = part5.y;
            rectF.set(measuredWidth2 * i11, measuredHeight * i12, (getMeasuredWidth() / f11) * (i11 + 1), (getMeasuredHeight() / f10) * (i12 + 1));
            fArr2[i12] = Math.min(fArr2[i12], rectF.left);
            fArr4[i12] = Math.max(fArr4[i12], rectF.right);
            fMax = Math.max(fMax, rectF.bottom);
            if (this.preview && part4.videoPlayer != null) {
                z = true;
            }
            drawPart(canvasBeginRecording, rectF, part4);
            i8 = i10 + 1;
        }
        if (this.reorderingTouch) {
            f2 = 0.0f;
        } else {
            int i13 = 0;
            while (i13 < Math.ceil(d)) {
                if (fArr2[i13] >= f) {
                    rectF.set(0.0f, (getMeasuredHeight() / f10) * i13, fArr2[i13], (getMeasuredHeight() / f10) * (i13 + 1));
                    drawPart(canvasBeginRecording, rectF, null);
                }
                if (fArr4[i13] < getMeasuredWidth()) {
                    rectF.set(fArr4[i13], (getMeasuredHeight() / f10) * i13, getMeasuredWidth(), (getMeasuredHeight() / f10) * (i13 + 1));
                    drawPart(canvasBeginRecording, rectF, null);
                }
                i13++;
                f = 0.0f;
            }
            if (fMax < getMeasuredHeight()) {
                f2 = 0.0f;
                rectF.set(0.0f, fMax, getMeasuredWidth(), getMeasuredHeight());
                drawPart(canvasBeginRecording, rectF, null);
            } else {
                f2 = 0.0f;
            }
        }
        if (f9 > f2 && (part = this.reorderingPart) != null) {
            CollageLayout.Part part6 = part.part;
            int i14 = part6.y;
            float f12 = animatedFloatArr2[i14].set(this.currentLayout.columns[i14], false);
            if (this.reorderingTouch) {
                AndroidUtilities.lerp(part.fromBounds, part.bounds, part.boundsTransition, rectF);
            } else {
                float measuredWidth3 = getMeasuredWidth() / f12;
                int i15 = part6.x;
                float measuredHeight2 = getMeasuredHeight() / f10;
                int i16 = part6.y;
                rectF.set(measuredWidth3 * i15, measuredHeight2 * i16, (getMeasuredWidth() / f12) * (i15 + 1), (getMeasuredHeight() / f10) * (i16 + 1));
            }
            canvasBeginRecording.save();
            canvasBeginRecording.translate(AndroidUtilities.lerp(this.ldx, this.dx, part.boundsTransition) * f9, AndroidUtilities.lerp(this.ldy, this.dy, part.boundsTransition) * f9);
            drawPart(canvasBeginRecording, rectF, part);
            canvasBeginRecording.restore();
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            Part part7 = (Part) arrayList.get(i17);
            CollageLayout.Part part8 = part7.part;
            float f13 = part7.highlightAnimated.set(0.0f, false);
            if (f13 > 0.0f) {
                int i18 = part8.y;
                float f14 = animatedFloatArr2[i18].set(part8.layout.columns[i18], false);
                if (this.reordering || this.reorderingTouch) {
                    AndroidUtilities.lerp(part7.fromBounds, part7.bounds, part7.boundsTransition, rectF);
                } else {
                    float measuredWidth4 = getMeasuredWidth() / f14;
                    int i19 = part8.x;
                    float measuredHeight3 = getMeasuredHeight() / f10;
                    int i20 = part8.y;
                    rectF.set(measuredWidth4 * i19, measuredHeight3 * i20, (getMeasuredWidth() / f14) * (i19 + 1), (getMeasuredHeight() / f10) * (i20 + 1));
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                Matrix matrix = this.gradientMatrix;
                matrix.reset();
                float f15 = rectF.left;
                int i21 = this.gradientWidth;
                int i22 = i21 * i21;
                matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i22 + i22)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), 1.0f - f13) + f15, 0.0f);
                matrix.postRotate(-25.0f);
                this.gradient.setLocalMatrix(matrix);
                Paint paint = this.highlightPaint;
                paint.setAlpha(255);
                Path path = this.highlightPath;
                path.rewind();
                CollageLayout.Part part9 = part7.part;
                float fDp3 = (part9.x == 0 && part9.y == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                float[] fArr5 = this.radii;
                fArr5[1] = fDp3;
                fArr5[0] = fDp3;
                CollageLayout.Part part10 = part7.part;
                float fDp4 = (part10.x == part10.layout.w + (-1) && part10.y == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr5[2] = fDp4;
                fArr5[1] = fDp4;
                CollageLayout.Part part11 = part7.part;
                int i23 = part11.x;
                CollageLayout collageLayout2 = part11.layout;
                if (i23 != collageLayout2.w - 1) {
                    fDp = 0.0f;
                } else if (part11.y == collageLayout2.h - 1) {
                    fDp = AndroidUtilities.dp(8.0f);
                } else {
                    fDp = 0.0f;
                }
                fArr5[4] = fDp;
                fArr5[3] = fDp;
                CollageLayout.Part part12 = part7.part;
                if (part12.x != 0) {
                    fDp2 = 0.0f;
                } else if (part12.y == part12.layout.h - 1) {
                    fDp2 = AndroidUtilities.dp(8.0f);
                } else {
                    fDp2 = 0.0f;
                }
                fArr5[6] = fDp2;
                fArr5[5] = fDp2;
                path.addRoundRect(rectF2, fArr5, Path.Direction.CW);
                canvasBeginRecording.drawPath(path, paint);
            }
        }
        if (z && (blurManager = this.blurManager) != null) {
            blurManager.invalidate();
        }
        if (this.renderNode == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode renderNodeM4 = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(this.renderNode);
        renderNodeM4.endRecording();
        canvas.drawRenderNode(renderNodeM4);
        Object obj2 = this.blurRenderNode;
        if (obj2 != null) {
            RenderNode renderNodeM5 = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(obj2);
            renderNodeM5.setPosition(0, 0, getWidth(), getHeight());
            renderNodeM5.beginRecording().drawRenderNode(renderNodeM4);
            renderNodeM5.endRecording();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        RectF rectF;
        AnimatedFloat[] animatedFloatArr;
        Part part;
        CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0;
        if (!hasLayout() || this.preview) {
            cancelTouch();
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            cancelTouch();
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AnimatedFloat animatedFloat = this.animatedRows;
        float f = animatedFloat.value;
        int i = 0;
        while (true) {
            arrayList = this.parts;
            int size = arrayList.size();
            rectF = this.rect;
            animatedFloatArr = this.animatedColumns;
            if (i >= size) {
                part = null;
                break;
            }
            part = (Part) arrayList.get(i);
            CollageLayout.Part part2 = part.part;
            float f2 = animatedFloatArr[part2.y].value;
            float measuredWidth = getMeasuredWidth() / f2;
            int i2 = part2.x;
            float measuredHeight = getMeasuredHeight() / f;
            int i3 = part2.y;
            rectF.set(measuredWidth * i2, measuredHeight * i3, (getMeasuredWidth() / f2) * (i2 + 1), (getMeasuredHeight() / f) * (i3 + 1));
            if (rectF.contains(x, y)) {
                break;
            }
            i++;
        }
        if (motionEvent.getAction() == 0) {
            this.tx = motionEvent.getX();
            this.ty = motionEvent.getY();
            this.reorderingTouch = false;
            this.dx = 0.0f;
            this.ldx = 0.0f;
            this.dy = 0.0f;
            this.ldy = 0.0f;
            this.pressedPart = part;
            if (part != null) {
                CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda1 = new CollageLayoutView2$$ExternalSyntheticLambda0(this, 0);
                this.onLongPressPart = collageLayoutView2$$ExternalSyntheticLambda1;
                AndroidUtilities.runOnUIThread(collageLayoutView2$$ExternalSyntheticLambda1, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (MathUtils.distance(motionEvent.getX(), motionEvent.getY(), this.tx, this.ty) > AndroidUtilities.touchSlop * 1.2f && (collageLayoutView2$$ExternalSyntheticLambda0 = this.onLongPressPart) != null) {
                AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0);
                this.onLongPressPart = null;
            }
            if (!this.reorderingTouch && getFilledProgress() >= 1.0f && this.pressedPart != null && part != null && MathUtils.distance(motionEvent.getX(), motionEvent.getY(), this.tx, this.ty) > AndroidUtilities.touchSlop * 1.2f) {
                this.reorderingTouch = true;
                this.reorderingPart = this.pressedPart;
                this.dx = 0.0f;
                this.ldx = 0.0f;
                this.dy = 0.0f;
                this.ldy = 0.0f;
                invalidate();
                CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda2 = this.onLongPressPart;
                if (collageLayoutView2$$ExternalSyntheticLambda2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda2);
                    this.onLongPressPart = null;
                }
            } else if (this.reorderingTouch && this.reorderingPart != null) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f3 = animatedFloat.value;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    }
                    CollageLayout.Part part3 = ((Part) arrayList.get(i4)).part;
                    float f4 = animatedFloatArr[part3.y].value;
                    float measuredWidth2 = getMeasuredWidth() / f4;
                    int i5 = part3.x;
                    float measuredHeight2 = getMeasuredHeight() / f3;
                    int i6 = part3.y;
                    rectF.set(measuredWidth2 * i5, measuredHeight2 * i6, (getMeasuredWidth() / f4) * (i5 + 1), (getMeasuredHeight() / f3) * (i6 + 1));
                    if (rectF.contains(x2, y2)) {
                        break;
                    }
                    i4++;
                }
                int iIndexOf = arrayList.indexOf(this.reorderingPart);
                if (i4 >= 0 && iIndexOf >= 0 && i4 != iIndexOf) {
                    Collections.swap(arrayList, iIndexOf, i4);
                    setLayout(this.currentLayout);
                    this.reordering = true;
                    invalidate();
                    float f5 = this.currentLayout.h;
                    CollageLayout.Part part4 = this.reorderingPart.part;
                    float f6 = animatedFloatArr[part4.y].value;
                    float measuredWidth3 = getMeasuredWidth() / f6;
                    int i7 = part4.x;
                    float measuredHeight3 = getMeasuredHeight() / f5;
                    int i8 = part4.y;
                    rectF.set(measuredWidth3 * i7, measuredHeight3 * i8, (getMeasuredWidth() / f6) * (i7 + 1), (getMeasuredHeight() / f5) * (i8 + 1));
                    this.ldx = this.dx;
                    this.ldy = this.dy;
                    this.tx = rectF.centerX();
                    this.ty = rectF.centerY();
                }
                this.dx = motionEvent.getX() - this.tx;
                this.dy = motionEvent.getY() - this.ty;
                invalidate();
            } else if (this.pressedPart != part) {
                this.pressedPart = null;
                CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda3 = this.onLongPressPart;
                if (collageLayoutView2$$ExternalSyntheticLambda3 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda3);
                this.onLongPressPart = null;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.pressedPart != null) {
                this.pressedPart = null;
                this.reorderingTouch = false;
                invalidate();
                CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda4 = this.onLongPressPart;
                if (collageLayoutView2$$ExternalSyntheticLambda4 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda4);
                this.onLongPressPart = null;
                return true;
            }
        } else if (motionEvent.getAction() == 3 && cancelTouch()) {
            return true;
        }
        return this.pressedPart != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.cameraView && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void drawPart(Canvas canvas, RectF rectF, Part part) {
        boolean z;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && part == this.longPressedPart) {
            return;
        }
        if (part == this.reorderingPart) {
            AnimatedFloat animatedFloat = this.animatedReordering;
            if (animatedFloat.value > 0.0f) {
                canvas.save();
                Path path = this.clipPath;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(10.0f) * animatedFloat.value, AndroidUtilities.dp(10.0f) * animatedFloat.value);
                float fDp = AndroidUtilities.dp(12.0f) * animatedFloat.value;
                path.addRoundRect(rectF2, fDp, fDp, Path.Direction.CW);
                canvas.clipPath(path);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (part != null && part.content != null) {
            TextureView textureView = part.textureView;
            if (textureView == null || !part.textureViewReady) {
                ImageReceiver imageReceiver = part.imageReceiver;
                imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                if (!imageReceiver.draw(canvas)) {
                    CameraView cameraView = this.cameraView;
                    if (cameraView == null && this.cameraThumbVisible) {
                        drawDrawable(canvas, this.cameraThumbDrawable, rectF, 0.0f);
                    } else {
                        drawView(0.0f, canvas, rectF, cameraView);
                    }
                }
            } else {
                drawView(0.0f, canvas, rectF, textureView);
            }
        } else if ((part == null || !part.current) && !AndroidUtilities.makingGlobalBlurBitmap) {
            setCameraNeedsBlur(!this.preview);
            if (this.cameraViewBlurRenderNode == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
                drawView(0.75f, canvas, rectF, this.cameraView);
            } else {
                RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(this.cameraViewBlurRenderNode);
                float fMax = Math.max(rectF.width() / renderNodeM.getWidth(), rectF.height() / renderNodeM.getHeight());
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                canvas.scale(fMax, fMax);
                canvas.drawRenderNode(renderNodeM);
                canvas.drawColor(1677721600);
                canvas.restore();
            }
            CameraView cameraView2 = this.cameraView;
            if (cameraView2 != null && (imageView = cameraView2.blurredStubView) != null && imageView.getVisibility() == 0 && this.cameraView.blurredStubView.getAlpha() > 0.0f) {
                drawView(0.4f, canvas, rectF, this.cameraView.blurredStubView);
            }
        } else {
            CameraView cameraView3 = this.cameraView;
            if (cameraView3 == null && this.cameraThumbVisible) {
                drawDrawable(canvas, this.cameraThumbDrawable, rectF, (part == null || !part.current) ? 0.4f : 0.0f);
            } else {
                drawView((part == null || !part.current) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public final void drawScrim(Canvas canvas, float f) {
        Part part = this.longPressedPart;
        if (part != null) {
            CollageLayout.Part part2 = part.part;
            CollageLayout collageLayout = part2.layout;
            float f2 = collageLayout.h;
            AnimatedFloat[] animatedFloatArr = this.animatedColumns;
            int i = part2.y;
            float f3 = animatedFloatArr[i].set(collageLayout.columns[i], false);
            RectF rectF = this.rect;
            float measuredWidth = getMeasuredWidth() / f3;
            int i2 = part2.x;
            rectF.set(measuredWidth * i2, (getMeasuredHeight() / f2) * i, (getMeasuredWidth() / f3) * (i2 + 1), (getMeasuredHeight() / f2) * (i + 1));
            drawPart(canvas, rectF, this.longPressedPart);
        }
    }

    public final void drawView(float f, Canvas canvas, RectF rectF, View view) {
        QRScanner.QrRegionDrawer qrRegionDrawer;
        QRScanner.Detected detected;
        TextureView textureView;
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        float fMax = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(fMax, fMax);
        canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            if (view instanceof TextureView) {
                textureView = (TextureView) view;
            } else {
                textureView = view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
            }
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            view.draw(canvas);
        }
        if (f > 0.0f) {
            canvas.drawColor(Theme.multAlpha(view.getAlpha() * f, -16777216));
        }
        canvas.restore();
        if (view != this.cameraView || (qrRegionDrawer = this.qrDrawer) == null || (detected = qrRegionDrawer.qrResult) == null || detected.points.length <= 0) {
            return;
        }
        float f2 = qrRegionDrawer.animatedQr.set(qrRegionDrawer.hasQrResult);
        float f3 = qrRegionDrawer.animatedQrCX.set(qrRegionDrawer.qrResult.cx, false);
        float fWidth = (rectF.width() * f3) + rectF.left;
        float f4 = qrRegionDrawer.animatedQrCY.set(qrRegionDrawer.qrResult.cy, false);
        float fHeight = (rectF.height() * f4) + rectF.top;
        float fLerp = AndroidUtilities.lerp(0.5f, 1.1f, f2);
        canvas.save();
        canvas.scale(fLerp, fLerp, fWidth, fHeight);
        if (f2 > 0.0f) {
            Path path = qrRegionDrawer.qrPath;
            path.rewind();
            int iMin = Math.min(4, qrRegionDrawer.qrResult.points.length);
            int i = 0;
            while (i < iMin) {
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = iMin - 1;
                }
                int i3 = i + 1;
                int i4 = i3 >= iMin ? 0 : i3;
                QRScanner.Detected detected2 = qrRegionDrawer.qrResult;
                PointF[] pointFArr = detected2.points;
                PointF pointF = pointFArr[i2];
                PointF pointF2 = pointFArr[i];
                PointF pointF3 = pointFArr[i4];
                float f5 = f2;
                float f6 = rectF.left;
                AnimatedFloat[] animatedFloatArr = qrRegionDrawer.animatedQPX;
                float f7 = f3;
                float fWidth2 = (rectF.width() * (animatedFloatArr[i2].set(pointF.x - detected2.cx, false) + f7)) + f6;
                float f8 = rectF.top;
                AnimatedFloat[] animatedFloatArr2 = qrRegionDrawer.animatedQPY;
                float fHeight2 = (rectF.height() * (animatedFloatArr2[i2].set(pointF.y - qrRegionDrawer.qrResult.cy, false) + f4)) + f8;
                float f9 = f4;
                float fWidth3 = (rectF.width() * (animatedFloatArr[i].set(pointF2.x - qrRegionDrawer.qrResult.cx, false) + f7)) + rectF.left;
                float fHeight3 = (rectF.height() * (animatedFloatArr2[i].set(pointF2.y - qrRegionDrawer.qrResult.cy, false) + f9)) + rectF.top;
                float fWidth4 = (rectF.width() * (animatedFloatArr[i4].set(pointF3.x - qrRegionDrawer.qrResult.cx, false) + f7)) + rectF.left;
                float fHeight4 = (rectF.height() * (animatedFloatArr2[i4].set(pointF3.y - qrRegionDrawer.qrResult.cy, false) + f9)) + rectF.top;
                path.moveTo(((fWidth2 - fWidth3) * 0.18f) + fWidth3, ((fHeight2 - fHeight3) * 0.18f) + fHeight3);
                path.lineTo(fWidth3, fHeight3);
                path.lineTo(((fWidth4 - fWidth3) * 0.18f) + fWidth3, ((fHeight4 - fHeight3) * 0.18f) + fHeight3);
                f2 = f5;
                i = i3;
                f3 = f7;
                f4 = f9;
            }
            Paint paint = qrRegionDrawer.qrPaint;
            paint.setAlpha((int) (f2 * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public Object getBlurRenderNode() {
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = Theme$$ExternalSyntheticApiModelOutline3.m$1();
            RenderNode renderNodeM$2 = Theme$$ExternalSyntheticApiModelOutline3.m$2();
            this.blurRenderNode = renderNodeM$2;
            Theme$$ExternalSyntheticApiModelOutline3.m1062m((Object) renderNodeM$2);
            float fDp = AndroidUtilities.dp(32.0f);
            float fDp2 = AndroidUtilities.dp(32.0f);
            Shader.TileMode unused = Shader.TileMode.DECAL;
            renderNodeM$2.setRenderEffect(RenderEffect.createBlurEffect(fDp, fDp2, Shader.TileMode.DECAL));
        }
        return this.blurRenderNode;
    }

    @Override
    public final void getBounds(RectF rectF) {
        Part part = this.longPressedPart;
        if (part == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        CollageLayout.Part part2 = part.part;
        CollageLayout collageLayout = part2.layout;
        float f = collageLayout.h;
        AnimatedFloat[] animatedFloatArr = this.animatedColumns;
        int i = part2.y;
        float f2 = animatedFloatArr[i].set(collageLayout.columns[i], false);
        float measuredWidth = getMeasuredWidth() / f2;
        int i2 = part2.x;
        rectF.set(measuredWidth * i2, (getMeasuredHeight() / f) * i, (getMeasuredWidth() / f2) * (i2 + 1), (getMeasuredHeight() / f) * (i + 1));
    }

    public ArrayList<StoryEntry> getContent() {
        ArrayList<StoryEntry> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.parts;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            StoryEntry storyEntry = ((Part) obj).content;
            if (storyEntry != null) {
                arrayList.add(storyEntry);
            }
        }
        return arrayList;
    }

    public Part getCurrent() {
        return this.currentPart;
    }

    public long getDuration() {
        Part mainPart;
        StoryEntry storyEntry;
        if (!this.preview || (mainPart = getMainPart()) == null || (storyEntry = mainPart.content) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((storyEntry.videoRight - storyEntry.videoLeft) * storyEntry.duration), 59500L), 1L);
    }

    public int getFilledCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.parts;
            if (i >= arrayList.size()) {
                return i2;
            }
            if (((Part) arrayList.get(i)).content != null) {
                i2++;
            }
            i++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public CollageLayout getLayout() {
        return this.currentLayout;
    }

    public Part getMainPart() {
        Part part = null;
        if (!this.preview) {
            return null;
        }
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Part part2 = (Part) obj;
            StoryEntry storyEntry = part2.content;
            if (storyEntry != null && storyEntry.isVideo) {
                long duration = storyEntry.duration;
                VideoScreenPreview.AnonymousClass3 anonymousClass3 = part2.videoPlayer;
                if (anonymousClass3 != null && anonymousClass3.getDuration() > 0) {
                    duration = part2.videoPlayer.getDuration();
                }
                if (duration > j) {
                    part = part2;
                    j = duration;
                }
            }
        }
        return part;
    }

    public Part getNext() {
        return this.nextPart;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int iM = 0;
        while (true) {
            ArrayList arrayList2 = this.parts;
            if (iM >= arrayList2.size()) {
                return arrayList;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(((Part) arrayList2.get(iM)).index, iM, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.preview) {
            return 0L;
        }
        if (!this.playing) {
            return this.lastPausedPosition;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.previewStartTime;
        if (j > getDuration()) {
            this.previewStartTime = jCurrentTimeMillis - (j % getDuration());
        }
        return j;
    }

    public long getPositionWithOffset() {
        long j = 0;
        if (!this.preview) {
            return 0L;
        }
        getPosition();
        Part mainPart = getMainPart();
        if (mainPart != null) {
            StoryEntry storyEntry = mainPart.content;
            j = storyEntry.videoOffset + ((long) (storyEntry.videoLeft * storyEntry.duration));
        }
        return getPosition() + j;
    }

    public int getTotalCount() {
        return this.parts.size();
    }

    public final boolean hasLayout() {
        return this.currentLayout.parts.size() > 1;
    }

    public final void layout(RectF rectF, CollageLayout.Part part) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            measuredHeight = point.y;
            measuredWidth = i;
        }
        CollageLayout collageLayout = part.layout;
        int[] iArr = collageLayout.columns;
        int i2 = part.y;
        float f = measuredWidth / iArr[i2];
        int i3 = part.x;
        float f2 = measuredHeight / collageLayout.h;
        rectF.set(i3 * f, i2 * f2, f * (i3 + 1), f2 * (i2 + 1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.parts;
            if (i >= arrayList.size()) {
                this.attached = true;
                return;
            } else {
                ((Part) arrayList.get(i)).imageReceiver.onAttachedToWindow();
                i++;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.parts;
            if (i >= arrayList.size()) {
                this.attached = false;
                AndroidUtilities.cancelRunOnUIThread(this.syncRunnable);
                return;
            } else {
                ((Part) arrayList.get(i)).imageReceiver.onDetachedFromWindow();
                i++;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Part part;
        StoryEntry storyEntry;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.cameraView) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int i6 = 0;
                while (true) {
                    ArrayList arrayList = this.parts;
                    if (i6 >= arrayList.size()) {
                        part = null;
                        break;
                    } else {
                        if (childAt == ((Part) arrayList.get(i6)).textureView) {
                            part = (Part) arrayList.get(i6);
                            break;
                        }
                        i6++;
                    }
                }
                if (part == null || (storyEntry = part.content) == null || (i3 = storyEntry.width) <= 0 || (i4 = storyEntry.height) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else {
                    if (storyEntry.orientation % 90 != 1) {
                        i4 = i3;
                        i3 = i4;
                    }
                    float f = i4;
                    float f2 = i3;
                    float fMin = Math.min(1.0f, Math.max(f / size, f2 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * fMin), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * fMin), 1073741824));
                }
            }
        }
    }

    public final boolean push(StoryEntry storyEntry) {
        if (storyEntry.isVideo) {
            ArrayList arrayList = this.parts;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                StoryEntry storyEntry2 = ((Part) obj).content;
                if (storyEntry2 != null && storyEntry2.isVideo && storyEntry2.videoVolume > 0.0f) {
                    storyEntry.videoVolume = 0.0f;
                    break;
                }
            }
        }
        Part part = this.currentPart;
        if (part != null) {
            part.setContent(storyEntry);
        }
        updatePartsState();
        requestLayout();
        return this.currentPart == null;
    }

    public final void seekTo(long j, boolean z) {
        if (this.preview) {
            long jClamp = Utilities.clamp(j, getDuration(), 0L);
            if (!this.playing) {
                this.lastPausedPosition = jClamp;
            }
            this.previewStartTime = System.currentTimeMillis() - jClamp;
            this.fastSeek = z;
            if (this.preview) {
                CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0 = this.syncRunnable;
                AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0);
                collageLayoutView2$$ExternalSyntheticLambda0.run();
            }
        }
    }

    public void setCameraNeedsBlur(boolean z) {
        if (this.needsBlur == z) {
            return;
        }
        this.needsBlur = z;
        updateCameraNeedsBlur();
    }

    public void setCameraThumb(Drawable drawable) {
        this.cameraThumbDrawable = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z) {
        this.cameraThumbVisible = z;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.cameraView;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new CollageLayoutView2$$ExternalSyntheticLambda0(this, 1));
            AndroidUtilities.removeFromParent(this.cameraView);
            this.cameraView = null;
            updateCameraNeedsBlur();
        }
        this.cameraView = cameraView;
        if (cameraView != null) {
            addView(cameraView, LayoutHelper.createFrame(-1, -1, 119));
        }
        CameraView cameraView3 = this.cameraView;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new CollageLayoutView2$$ExternalSyntheticLambda0(this, 1));
        }
        this.cameraView = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new CollageLayoutView2$$ExternalSyntheticLambda0(this, 1));
        }
        updateCameraNeedsBlur();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.cancelGestures = runnable;
    }

    public final void setLayout(CollageLayout collageLayout) {
        if (collageLayout == null) {
            collageLayout = new CollageLayout(".");
        }
        this.currentLayout = collageLayout;
        CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0 = this.resetReordering;
        AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0);
        int i = 0;
        while (true) {
            ArrayList arrayList = collageLayout.parts;
            int size = arrayList.size();
            ArrayList arrayList2 = this.parts;
            if (i >= Math.max(size, arrayList2.size())) {
                updatePartsState();
                invalidate();
                AndroidUtilities.runOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0, 360L);
                return;
            }
            CollageLayout.Part part = i < arrayList.size() ? (CollageLayout.Part) arrayList.get(i) : null;
            Part part2 = i < arrayList2.size() ? (Part) arrayList2.get(i) : null;
            if (part2 == null && part != null) {
                Part part3 = new Part();
                if (this.attached) {
                    part3.imageReceiver.onAttachedToWindow();
                }
                part3.setPart(part, true);
                arrayList2.add(part3);
            } else if (part != null) {
                part2.setPart(part, true);
            } else if (part2 != null) {
                this.removingParts.add(part2);
                arrayList2.remove(part2);
                part2.setPart(null, true);
                i--;
            }
            i++;
        }
    }

    public void setMuted(boolean z) {
        if (this.isMuted == z) {
            return;
        }
        this.isMuted = z;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.onCameraThumbClick = runnable;
    }

    public void setPlaying(boolean z) {
        boolean z2 = this.restorePositionOnPlaying;
        this.restorePositionOnPlaying = true;
        if (this.playing == z) {
            return;
        }
        this.playing = z;
        if (!z) {
            this.lastPausedPosition = getPosition();
        } else if (z2) {
            seekTo(this.lastPausedPosition, false);
        } else {
            this.fastSeek = false;
        }
        if (this.preview) {
            CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0 = this.syncRunnable;
            AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0);
            collageLayoutView2$$ExternalSyntheticLambda0.run();
        }
    }

    public void setPreview(boolean z) {
        if (this.preview == z) {
            return;
        }
        this.preview = z;
        ArrayList arrayList = this.parts;
        int i = 0;
        if (z) {
            BlurringShader.BlurManager blurManager = this.blurManager;
            if (blurManager != null) {
                blurManager.invalidate();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((Part) arrayList.get(i2)).index = i2;
            }
        }
        this.fastSeek = false;
        this.lastPausedPosition = 0L;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Part part = (Part) obj;
            VideoScreenPreview.AnonymousClass3 anonymousClass3 = part.videoPlayer;
            if (anonymousClass3 != null) {
                anonymousClass3.setAudioEnabled(z, true);
                if (!z || this.playing) {
                    part.videoPlayer.play();
                } else {
                    part.videoPlayer.pause();
                }
            }
        }
        CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0 = this.syncRunnable;
        AndroidUtilities.cancelRunOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0);
        if (z) {
            this.previewStartTime = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(collageLayoutView2$$ExternalSyntheticLambda0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }

    public void setPreviewView(PreviewView previewView) {
        this.previewView = previewView;
    }

    public void setResetState(Runnable runnable) {
        this.onResetState = runnable;
    }

    public void setTimelineView(TimelineView timelineView) {
        this.timelineView = timelineView;
    }

    public final void updateCameraNeedsBlur() {
        CameraView cameraView = this.cameraView;
        boolean z = cameraView != null && this.needsBlur;
        if (z == (this.cameraViewBlurRenderNode != null)) {
            return;
        }
        if (z) {
            this.cameraViewBlurRenderNode = cameraView.getBlurRenderNode();
        } else {
            this.cameraViewBlurRenderNode = null;
        }
    }

    public final void updatePartsState() {
        ArrayList arrayList;
        this.currentPart = null;
        this.nextPart = null;
        int i = 0;
        while (true) {
            arrayList = this.parts;
            if (i >= arrayList.size()) {
                break;
            }
            Part part = (Part) arrayList.get(i);
            if (part.content == null) {
                if (this.currentPart != null) {
                    this.nextPart = part;
                    break;
                }
                this.currentPart = part;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Part part2 = (Part) arrayList.get(i2);
            part2.current = part2 == this.currentPart;
        }
    }
}
