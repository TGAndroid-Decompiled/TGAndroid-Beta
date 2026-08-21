package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.widget.TextView;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline2;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;

public abstract class CollageLayoutView2 extends FrameLayout implements ItemOptions.ScrimView {
    private final AnimatedFloat[] animatedColumns;
    private final AnimatedFloat animatedReordering;
    private final AnimatedFloat animatedRows;
    private boolean attached;
    private final BlurringShader.BlurManager blurManager;
    private Object blurRenderNode;
    private Drawable cameraThumbDrawable;
    private boolean cameraThumbVisible;
    public CameraView cameraView;
    private Object cameraViewBlurRenderNode;
    private Runnable cancelGestures;
    private final Path clipPath;
    private final FrameLayout containerView;
    private CollageLayout currentLayout;
    public Part currentPart;
    public float dx;
    public float dy;
    private boolean fastSeek;
    private final LinearGradient gradient;
    private final Matrix gradientMatrix;
    private final int gradientWidth;
    private final Paint highlightPaint;
    private final Path highlightPath;
    public boolean isMuted;
    private long lastPausedPosition;
    public float ldx;
    public float ldy;
    private final float[] lefts;
    public Part longPressedPart;
    private boolean needsBlur;
    public Part nextPart;
    private Runnable onCameraThumbClick;
    public Runnable onLongPressPart;
    private Runnable onResetState;
    public final ArrayList parts;
    private boolean playing;
    public Part pressedPart;
    private boolean preview;
    private long previewStartTime;
    private PreviewView previewView;
    public final QRScanner.QrRegionDrawer qrDrawer;
    private final float[] radii;
    private final RectF rect;
    public final ArrayList removingParts;
    private Object renderNode;
    public boolean reordering;
    public Part reorderingPart;
    public boolean reorderingTouch;
    private final Runnable resetReordering;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean restorePositionOnPlaying;
    private final float[] rights;
    private final Runnable syncRunnable;
    private TimelineView timelineView;
    public float tx;
    public float ty;

    public static void $r8$lambda$BlCGMwGoirt0UuyA9LBLKQe06xM() {
    }

    public void forceNotRestorePosition() {
    }

    protected abstract void onLayoutUpdate(CollageLayout collageLayout);

    public CollageLayoutView2(Context context, BlurringShader.BlurManager blurManager, FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.qrDrawer = new QRScanner.QrRegionDrawer(new CollageLayoutView2$$ExternalSyntheticLambda1(this));
        this.currentLayout = new CollageLayout(".");
        ArrayList arrayList = new ArrayList();
        this.parts = arrayList;
        this.removingParts = new ArrayList();
        Paint paint = new Paint(1);
        this.highlightPaint = paint;
        this.highlightPath = new Path();
        this.radii = new float[8];
        this.resetReordering = new Runnable() {
            @Override
            public final void run() {
                CollageLayoutView2.m4481$r8$lambda$P7qOu7nozUq6fnqFdYd1EmnXjk(this.f$0);
            }
        };
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
        this.syncRunnable = new Runnable() {
            @Override
            public final void run() {
                CollageLayoutView2.$r8$lambda$hICzZDaoQf58xK02j4568ahW3K0(this.f$0);
            }
        };
        this.blurManager = blurManager;
        this.containerView = frameLayout;
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(-14737633);
        Part part = new Part();
        part.setPart((CollageLayout.Part) this.currentLayout.parts.get(0), false);
        part.setCurrent(true);
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

    public Part getCurrent() {
        return this.currentPart;
    }

    public Part getNext() {
        return this.nextPart;
    }

    public static void m4481$r8$lambda$P7qOu7nozUq6fnqFdYd1EmnXjk(CollageLayoutView2 collageLayoutView2) {
        if (collageLayoutView2.reordering) {
            collageLayoutView2.reordering = false;
            collageLayoutView2.invalidate();
        }
    }

    public void setLayout(CollageLayout collageLayout, boolean z) {
        if (collageLayout == null) {
            collageLayout = new CollageLayout(".");
        }
        this.currentLayout = collageLayout;
        AndroidUtilities.cancelRunOnUIThread(this.resetReordering);
        int i = 0;
        while (i < Math.max(collageLayout.parts.size(), this.parts.size())) {
            CollageLayout.Part part = i < collageLayout.parts.size() ? (CollageLayout.Part) collageLayout.parts.get(i) : null;
            Part part2 = i < this.parts.size() ? (Part) this.parts.get(i) : null;
            if (part2 == null && part != null) {
                Part part3 = new Part();
                if (this.attached) {
                    part3.imageReceiver.onAttachedToWindow();
                }
                part3.setPart(part, z);
                this.parts.add(part3);
            } else if (part != null) {
                part2.setPart(part, z);
            } else if (part2 != null) {
                this.removingParts.add(part2);
                this.parts.remove(part2);
                part2.setPart(null, z);
                i--;
            }
            i++;
        }
        updatePartsState();
        invalidate();
        if (z) {
            AndroidUtilities.runOnUIThread(this.resetReordering, 360L);
        }
    }

    public void highlight(int i) {
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Part part = (Part) obj;
            if (part.index == i) {
                part.highlightAnimated.set(1.0f, true);
                invalidate();
                return;
            }
        }
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.parts.size(); i++) {
            arrayList.add(Integer.valueOf(((Part) this.parts.get(i)).index));
        }
        return arrayList;
    }

    public void swap(int i, int i2) {
        Collections.swap(this.parts, i, i2);
        setLayout(this.currentLayout, true);
        this.reordering = true;
        invalidate();
    }

    public void layoutOut(RectF rectF, CollageLayout.Part part) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            measuredHeight = point.y;
            measuredWidth = i;
        }
        layout(rectF, part);
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

    public void layout(RectF rectF, CollageLayout.Part part) {
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
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.cameraView && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        Part part;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt == this.cameraView) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.parts.size()) {
                        part = null;
                        break;
                    } else {
                        if (childAt == ((Part) this.parts.get(i4)).textureView) {
                            part = (Part) this.parts.get(i4);
                            break;
                        }
                        i4++;
                    }
                }
                if (part == null || part.content == null || part.content.width <= 0 || part.content.height <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else {
                    int i5 = part.content.width;
                    int i6 = part.content.height;
                    if (part.content.orientation % 90 != 1) {
                        i6 = i5;
                        i5 = i6;
                    }
                    float f = i6;
                    float f2 = i5;
                    float fMin = Math.min(1.0f, Math.max(f / size, f2 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * fMin), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * fMin), 1073741824));
                }
            }
        }
    }

    public void set(StoryEntry storyEntry, boolean z) {
        if (storyEntry == null || storyEntry.collageContent == null) {
            clear(true);
            return;
        }
        setLayout(storyEntry.collage, z);
        for (int i = 0; i < this.parts.size(); i++) {
            ((Part) this.parts.get(i)).setContent((StoryEntry) storyEntry.collageContent.get(i));
        }
    }

    @Override
    public void drawScrim(Canvas canvas, float f) {
        Part part = this.longPressedPart;
        if (part != null) {
            CollageLayout.Part part2 = part.part;
            CollageLayout collageLayout = part2.layout;
            float f2 = collageLayout.h;
            AnimatedFloat[] animatedFloatArr = this.animatedColumns;
            int i = part2.y;
            float f3 = animatedFloatArr[i].set(collageLayout.columns[i]);
            this.rect.set((getMeasuredWidth() / f3) * part2.x, (getMeasuredHeight() / f2) * part2.y, (getMeasuredWidth() / f3) * (part2.x + 1), (getMeasuredHeight() / f2) * (part2.y + 1));
            drawPart(canvas, this.rect, this.longPressedPart);
        }
    }

    @Override
    public void getBounds(RectF rectF) {
        Part part = this.longPressedPart;
        if (part != null) {
            CollageLayout.Part part2 = part.part;
            CollageLayout collageLayout = part2.layout;
            float f = collageLayout.h;
            AnimatedFloat[] animatedFloatArr = this.animatedColumns;
            int i = part2.y;
            float f2 = animatedFloatArr[i].set(collageLayout.columns[i]);
            rectF.set((getMeasuredWidth() / f2) * part2.x, (getMeasuredHeight() / f) * part2.y, (getMeasuredWidth() / f2) * (part2.x + 1), (getMeasuredHeight() / f) * (part2.y + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public Object getBlurRenderNode() {
        if (this.renderNode == null && Build.VERSION.SDK_INT >= 31) {
            this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("CameraViewRenderNode");
            RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("CameraViewRenderNodeBlur");
            this.blurRenderNode = renderNodeM;
            BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(renderNodeM);
            renderNodeM.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Shader.TileMode.DECAL));
        }
        return this.blurRenderNode;
    }

    private void finishNode(Canvas canvas) {
        if (this.renderNode == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(this.renderNode);
        renderNodeM.endRecording();
        canvas.drawRenderNode(renderNodeM);
        Object obj = this.blurRenderNode;
        if (obj != null) {
            RenderNode renderNodeM2 = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj);
            renderNodeM2.setPosition(0, 0, getWidth(), getHeight());
            renderNodeM2.beginRecording().drawRenderNode(renderNodeM);
            renderNodeM2.endRecording();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Canvas canvasBeginRecording;
        double d;
        float f;
        BlurringShader.BlurManager blurManager;
        Part part;
        float f2;
        if (this.renderNode == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvasBeginRecording = canvas;
        } else {
            RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(this.renderNode);
            renderNodeM.setPosition(0, 0, getWidth(), getHeight());
            canvasBeginRecording = renderNodeM.beginRecording();
        }
        super.dispatchDraw(canvasBeginRecording);
        if (!hasLayout() && !this.reordering && !this.reorderingTouch && this.animatedRows.get() == this.currentLayout.h && this.animatedColumns[0].get() == this.currentLayout.columns[0] && this.qrDrawer.hasNoDraw()) {
            setCameraNeedsBlur(false);
            finishNode(canvas);
            return;
        }
        if (this.preview) {
            setCameraNeedsBlur(false);
        }
        canvasBeginRecording.drawColor(-14737633);
        float f3 = this.animatedReordering.set(this.reorderingTouch);
        float f4 = this.animatedRows.set(this.currentLayout.h);
        int i = 0;
        while (true) {
            d = f4;
            if (i >= Math.ceil(d)) {
                break;
            }
            this.lefts[i] = getMeasuredWidth();
            this.rights[i] = 0.0f;
            i++;
        }
        int i2 = this.currentLayout.h;
        while (true) {
            AnimatedFloat[] animatedFloatArr = this.animatedColumns;
            if (i2 >= animatedFloatArr.length) {
                break;
            }
            animatedFloatArr[i2].set(1.0f);
            i2++;
        }
        float fMax = 0.0f;
        boolean z = false;
        for (int i3 = 0; i3 < this.parts.size(); i3++) {
            Part part2 = (Part) this.parts.get(i3);
            CollageLayout.Part part3 = part2.part;
            AnimatedFloat[] animatedFloatArr2 = this.animatedColumns;
            int i4 = part3.y;
            float f5 = animatedFloatArr2[i4].set(part3.layout.columns[i4]);
            if (this.reordering || this.reorderingTouch) {
                f2 = 0.0f;
                AndroidUtilities.lerp(part2.fromBounds, part2.bounds, part2.boundsTransition, this.rect);
            } else {
                f2 = 0.0f;
                this.rect.set((getMeasuredWidth() / f5) * part3.x, (getMeasuredHeight() / f4) * part3.y, (getMeasuredWidth() / f5) * (part3.x + 1), (part3.y + 1) * (getMeasuredHeight() / f4));
            }
            float[] fArr = this.lefts;
            int i5 = part3.y;
            fArr[i5] = Math.min(fArr[i5], this.rect.left);
            float[] fArr2 = this.rights;
            int i6 = part3.y;
            fArr2[i6] = Math.max(fArr2[i6], this.rect.right);
            fMax = Math.max(fMax, this.rect.bottom);
            if (f3 <= f2 || part2 != this.reorderingPart) {
                if (this.preview && part2.videoPlayer != null) {
                    z = true;
                }
                drawPart(canvasBeginRecording, this.rect, part2);
            }
        }
        float f6 = 0.0f;
        int i7 = 0;
        while (i7 < this.removingParts.size()) {
            Part part4 = (Part) this.removingParts.get(i7);
            CollageLayout.Part part5 = part4.part;
            AnimatedFloat[] animatedFloatArr3 = this.animatedColumns;
            int i8 = part5.y;
            AnimatedFloat animatedFloat = animatedFloatArr3[i8];
            int[] iArr = this.currentLayout.columns;
            float f7 = animatedFloat.set(i8 >= iArr.length ? 1.0f : iArr[i8]);
            int i9 = i7;
            this.rect.set((getMeasuredWidth() / f7) * part5.x, (getMeasuredHeight() / f4) * part5.y, (getMeasuredWidth() / f7) * (part5.x + 1), (getMeasuredHeight() / f4) * (part5.y + 1));
            float[] fArr3 = this.lefts;
            int i10 = part5.y;
            fArr3[i10] = Math.min(fArr3[i10], this.rect.left);
            float[] fArr4 = this.rights;
            int i11 = part5.y;
            fArr4[i11] = Math.max(fArr4[i11], this.rect.right);
            fMax = Math.max(fMax, this.rect.bottom);
            if (this.preview && part4.videoPlayer != null) {
                z = true;
            }
            drawPart(canvasBeginRecording, this.rect, part4);
            i7 = i9 + 1;
        }
        if (this.reorderingTouch) {
            f = 0.0f;
        } else {
            int i12 = 0;
            while (i12 < Math.ceil(d)) {
                if (this.lefts[i12] >= f6) {
                    this.rect.set(0.0f, (getMeasuredHeight() / f4) * i12, this.lefts[i12], (getMeasuredHeight() / f4) * (i12 + 1));
                    drawPart(canvasBeginRecording, this.rect, null);
                }
                if (this.rights[i12] < getMeasuredWidth()) {
                    this.rect.set(this.rights[i12], (getMeasuredHeight() / f4) * i12, getMeasuredWidth(), (getMeasuredHeight() / f4) * (i12 + 1));
                    drawPart(canvasBeginRecording, this.rect, null);
                }
                i12++;
                f6 = 0.0f;
            }
            if (fMax < getMeasuredHeight()) {
                f = 0.0f;
                this.rect.set(0.0f, fMax, getMeasuredWidth(), getMeasuredHeight());
                drawPart(canvasBeginRecording, this.rect, null);
            } else {
                f = 0.0f;
            }
        }
        if (f3 > f && (part = this.reorderingPart) != null) {
            CollageLayout.Part part6 = part.part;
            AnimatedFloat[] animatedFloatArr4 = this.animatedColumns;
            int i13 = part6.y;
            float f8 = animatedFloatArr4[i13].set(this.currentLayout.columns[i13]);
            if (this.reorderingTouch) {
                AndroidUtilities.lerp(part.fromBounds, part.bounds, part.boundsTransition, this.rect);
            } else {
                this.rect.set((getMeasuredWidth() / f8) * part6.x, (getMeasuredHeight() / f4) * part6.y, (getMeasuredWidth() / f8) * (part6.x + 1), (getMeasuredHeight() / f4) * (part6.y + 1));
            }
            canvasBeginRecording.save();
            canvasBeginRecording.translate(AndroidUtilities.lerp(this.ldx, this.dx, part.boundsTransition) * f3, AndroidUtilities.lerp(this.ldy, this.dy, part.boundsTransition) * f3);
            drawPart(canvasBeginRecording, this.rect, part);
            canvasBeginRecording.restore();
        }
        for (int i14 = 0; i14 < this.parts.size(); i14++) {
            Part part7 = (Part) this.parts.get(i14);
            CollageLayout.Part part8 = part7.part;
            float f9 = part7.highlightAnimated.set(0.0f);
            if (f9 > 0.0f) {
                AnimatedFloat[] animatedFloatArr5 = this.animatedColumns;
                int i15 = part8.y;
                float f10 = animatedFloatArr5[i15].set(part8.layout.columns[i15]);
                if (this.reordering || this.reorderingTouch) {
                    AndroidUtilities.lerp(part7.fromBounds, part7.bounds, part7.boundsTransition, this.rect);
                } else {
                    this.rect.set((getMeasuredWidth() / f10) * part8.x, (getMeasuredHeight() / f4) * part8.y, (getMeasuredWidth() / f10) * (part8.x + 1), (getMeasuredHeight() / f4) * (part8.y + 1));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.rect);
                rectF.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                this.gradientMatrix.reset();
                Matrix matrix = this.gradientMatrix;
                float f11 = this.rect.left;
                int i16 = this.gradientWidth;
                int i17 = i16 * i16;
                matrix.postTranslate(f11 + AndroidUtilities.lerp(((float) Math.sqrt(i17 + i17)) * (-1.4f), (float) Math.sqrt((this.rect.width() * this.rect.width()) + (this.rect.height() * this.rect.height())), 1.0f - f9), 0.0f);
                this.gradientMatrix.postRotate(-25.0f);
                this.gradient.setLocalMatrix(this.gradientMatrix);
                this.highlightPaint.setAlpha(255);
                this.highlightPath.rewind();
                float[] fArr5 = this.radii;
                CollageLayout.Part part9 = part7.part;
                float fDp = (part9.x == 0 && part9.y == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr5[1] = fDp;
                fArr5[0] = fDp;
                float[] fArr6 = this.radii;
                CollageLayout.Part part10 = part7.part;
                float fDp2 = (part10.x == part10.layout.w + (-1) && part10.y == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr6[2] = fDp2;
                fArr6[1] = fDp2;
                float[] fArr7 = this.radii;
                CollageLayout.Part part11 = part7.part;
                int i18 = part11.x;
                CollageLayout collageLayout = part11.layout;
                float fDp3 = (i18 == collageLayout.w + (-1) && part11.y == collageLayout.h + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr7[4] = fDp3;
                fArr7[3] = fDp3;
                float[] fArr8 = this.radii;
                CollageLayout.Part part12 = part7.part;
                float fDp4 = (part12.x == 0 && part12.y == part12.layout.h + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr8[6] = fDp4;
                fArr8[5] = fDp4;
                this.highlightPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                canvasBeginRecording.drawPath(this.highlightPath, this.highlightPaint);
            }
        }
        if (z && (blurManager = this.blurManager) != null) {
            blurManager.invalidate();
        }
        finishNode(canvas);
    }

    public int getTotalCount() {
        return this.parts.size();
    }

    public int getFilledCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.parts.size(); i2++) {
            if (((Part) this.parts.get(i2)).hasContent()) {
                i++;
            }
        }
        return i;
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    private void drawPart(Canvas canvas, RectF rectF, Part part) {
        boolean z;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && part == this.longPressedPart) {
            return;
        }
        if (part != this.reorderingPart || this.animatedReordering.get() <= 0.0f) {
            z = false;
        } else {
            canvas.save();
            this.clipPath.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(10.0f) * this.animatedReordering.get(), AndroidUtilities.dp(10.0f) * this.animatedReordering.get());
            float fDp = AndroidUtilities.dp(12.0f) * this.animatedReordering.get();
            this.clipPath.addRoundRect(rectF2, fDp, fDp, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            z = true;
        }
        if (part != null && part.content != null) {
            TextureView textureView = part.textureView;
            if (textureView != null && part.textureViewReady) {
                drawView(canvas, textureView, rectF, 0.0f);
            } else {
                part.imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                if (!part.imageReceiver.draw(canvas)) {
                    CameraView cameraView = this.cameraView;
                    if (cameraView == null && this.cameraThumbVisible) {
                        drawDrawable(canvas, this.cameraThumbDrawable, rectF, 0.0f);
                    } else {
                        drawView(canvas, cameraView, rectF, 0.0f);
                    }
                }
            }
        } else if ((part != null && part.current) || AndroidUtilities.makingGlobalBlurBitmap) {
            CameraView cameraView2 = this.cameraView;
            if (cameraView2 != null || !this.cameraThumbVisible) {
                drawView(canvas, cameraView2, rectF, (part == null || !part.current) ? 0.4f : 0.0f);
            } else {
                drawDrawable(canvas, this.cameraThumbDrawable, rectF, (part == null || !part.current) ? 0.4f : 0.0f);
            }
        } else {
            setCameraNeedsBlur(!this.preview);
            if (this.cameraViewBlurRenderNode != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(this.cameraViewBlurRenderNode);
                float fMax = Math.max(rectF.width() / renderNodeM.getWidth(), rectF.height() / renderNodeM.getHeight());
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                canvas.scale(fMax, fMax);
                canvas.drawRenderNode(renderNodeM);
                canvas.drawColor(1677721600);
                canvas.restore();
            } else {
                drawView(canvas, this.cameraView, rectF, 0.75f);
            }
            CameraView cameraView3 = this.cameraView;
            if (cameraView3 != null && (imageView = cameraView3.blurredStubView) != null && imageView.getVisibility() == 0 && this.cameraView.blurredStubView.getAlpha() > 0.0f) {
                drawView(canvas, this.cameraView.blurredStubView, rectF, 0.4f);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private void drawView(Canvas canvas, View view, RectF rectF, float f) {
        QRScanner.QrRegionDrawer qrRegionDrawer;
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
            canvas.drawColor(Theme.multAlpha(-16777216, view.getAlpha() * f));
        }
        canvas.restore();
        if (view != this.cameraView || (qrRegionDrawer = this.qrDrawer) == null) {
            return;
        }
        qrRegionDrawer.draw(canvas, rectF);
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, RectF rectF, float f) {
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
            canvas.drawColor(Theme.multAlpha(-16777216, drawable.getAlpha() * f));
        }
        canvas.restore();
    }

    public void updatePartsState() {
        this.currentPart = null;
        this.nextPart = null;
        for (int i = 0; i < this.parts.size(); i++) {
            Part part = (Part) this.parts.get(i);
            if (!part.hasContent()) {
                if (this.currentPart == null) {
                    this.currentPart = part;
                } else {
                    this.nextPart = part;
                    break;
                }
            }
        }
        for (int i2 = 0; i2 < this.parts.size(); i2++) {
            Part part2 = (Part) this.parts.get(i2);
            part2.setCurrent(part2 == this.currentPart);
        }
    }

    public boolean push(StoryEntry storyEntry) {
        if (storyEntry != null && storyEntry.isVideo) {
            ArrayList arrayList = this.parts;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Part part = (Part) obj;
                if (part.content != null && part.content.isVideo && part.content.videoVolume > 0.0f) {
                    storyEntry.videoVolume = 0.0f;
                    break;
                }
            }
        }
        Part part2 = this.currentPart;
        if (part2 != null) {
            part2.setContent(storyEntry);
        }
        updatePartsState();
        requestLayout();
        return this.currentPart == null;
    }

    public ArrayList<StoryEntry> getContent() {
        ArrayList<StoryEntry> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.parts;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Part part = (Part) obj;
            if (part.hasContent()) {
                arrayList.add(part.content);
            }
        }
        return arrayList;
    }

    public void clear(boolean z) {
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

    public CollageLayout getLayout() {
        return this.currentLayout;
    }

    public boolean hasLayout() {
        return this.currentLayout.parts.size() > 1;
    }

    public boolean hasContent() {
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((Part) obj).hasContent()) {
                return true;
            }
        }
        return false;
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.cameraView;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new CollageLayoutView2$$ExternalSyntheticLambda1(this));
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
            cameraView3.unlistenDraw(new CollageLayoutView2$$ExternalSyntheticLambda1(this));
        }
        this.cameraView = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new CollageLayoutView2$$ExternalSyntheticLambda1(this));
        }
        updateCameraNeedsBlur();
        invalidate();
    }

    public void setCameraThumb(Drawable drawable) {
        this.cameraThumbDrawable = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z) {
        this.cameraThumbVisible = z;
        invalidate();
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.onCameraThumbClick = runnable;
    }

    public void setCameraNeedsBlur(boolean z) {
        if (this.needsBlur == z) {
            return;
        }
        this.needsBlur = z;
        updateCameraNeedsBlur();
    }

    public void updateCameraNeedsBlur() {
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

    public Part getPartAt(float f, float f2) {
        float f3 = this.animatedRows.get();
        for (int i = 0; i < this.parts.size(); i++) {
            Part part = (Part) this.parts.get(i);
            CollageLayout.Part part2 = part.part;
            float f4 = this.animatedColumns[part2.y].get();
            this.rect.set((getMeasuredWidth() / f4) * part2.x, (getMeasuredHeight() / f3) * part2.y, (getMeasuredWidth() / f4) * (part2.x + 1), (getMeasuredHeight() / f3) * (part2.y + 1));
            if (this.rect.contains(f, f2)) {
                return part;
            }
        }
        return null;
    }

    public int getPartIndexAt(float f, float f2) {
        float f3 = this.animatedRows.get();
        for (int i = 0; i < this.parts.size(); i++) {
            CollageLayout.Part part = ((Part) this.parts.get(i)).part;
            float f4 = this.animatedColumns[part.y].get();
            this.rect.set((getMeasuredWidth() / f4) * part.x, (getMeasuredHeight() / f3) * part.y, (getMeasuredWidth() / f4) * (part.x + 1), (getMeasuredHeight() / f3) * (part.y + 1));
            if (this.rect.contains(f, f2)) {
                return i;
            }
        }
        return -1;
    }

    public void onLongPress() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        if (this.reorderingTouch || this.preview) {
            return;
        }
        Part part = this.longPressedPart;
        if (part != null && (videoPlayerHolderBase = part.videoPlayer) != null) {
            videoPlayerHolderBase.setVolume(0.0f);
        }
        Part part2 = this.pressedPart;
        this.longPressedPart = part2;
        if (part2 == null || part2.content == null) {
            return;
        }
        Runnable runnable = this.cancelGestures;
        if (runnable != null) {
            runnable.run();
        }
        Part part3 = this.longPressedPart;
        VideoPlayerHolderBase videoPlayerHolderBase2 = part3.videoPlayer;
        if (videoPlayerHolderBase2 != null) {
            videoPlayerHolderBase2.setVolume(part3.content.videoVolume);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.menu_lightbulb);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, this.resourcesProvider, this);
        if (this.longPressedPart.content.isVideo) {
            SliderView onValueChange = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.longPressedPart.content.videoVolume).setOnValueChange(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    CollageLayoutView2.$r8$lambda$kGTLtM34PtYgDB87yEvaFQmveu0(this.f$0, (Float) obj);
                }
            });
            onValueChange.fixWidth = AndroidUtilities.dp(220.0f);
            itemOptionsMakeOptions.addView(onValueChange).addSpaceGap();
        }
        itemOptionsMakeOptions.setFixedWidth(220).add(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new Runnable() {
            @Override
            public final void run() {
                CollageLayoutView2 collageLayoutView2 = this.f$0;
                collageLayoutView2.retake(collageLayoutView2.longPressedPart);
            }
        }).add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() {
            @Override
            public final void run() {
                CollageLayoutView2 collageLayoutView2 = this.f$0;
                collageLayoutView2.delete(collageLayoutView2.longPressedPart);
            }
        }).addSpaceGap().addView(frameLayout, LayoutHelper.createLinear(220, -2)).setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                CollageLayoutView2.$r8$lambda$BlCGMwGoirt0UuyA9LBLKQe06xM();
            }
        }).setGravity(1).allowCenter(true).setBlur(true, false).setRoundRadius(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f)).setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                CollageLayoutView2.$r8$lambda$TUL9p2q7ODcdeeAdsx5UxP2caqE(this.f$0);
            }
        }).show();
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
    }

    public static void $r8$lambda$kGTLtM34PtYgDB87yEvaFQmveu0(CollageLayoutView2 collageLayoutView2, Float f) {
        collageLayoutView2.longPressedPart.content.videoVolume = f.floatValue();
        Part part = collageLayoutView2.longPressedPart;
        VideoPlayerHolderBase videoPlayerHolderBase = part.videoPlayer;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.setVolume(part.content.videoVolume);
        }
    }

    public static void $r8$lambda$TUL9p2q7ODcdeeAdsx5UxP2caqE(CollageLayoutView2 collageLayoutView2) {
        VideoPlayerHolderBase videoPlayerHolderBase;
        Part part = collageLayoutView2.longPressedPart;
        if (part == null || (videoPlayerHolderBase = part.videoPlayer) == null) {
            return;
        }
        videoPlayerHolderBase.setVolume(0.0f);
    }

    public void retake(Part part) {
        if (part == null) {
            return;
        }
        part.setContent(null);
        updatePartsState();
        invalidate();
        Runnable runnable = this.onResetState;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void delete(Part part) {
        if (part != null && this.parts.indexOf(part) >= 0) {
            CollageLayout collageLayout = this.currentLayout;
            CollageLayout collageLayoutDelete = collageLayout.delete(collageLayout.parts.indexOf(part.part));
            if (collageLayoutDelete.parts.size() <= 1) {
                clear(true);
                invalidate();
            }
            setLayout(collageLayoutDelete, true);
            this.reordering = true;
            updatePartsState();
            invalidate();
            Runnable runnable = this.onResetState;
            if (runnable != null) {
                runnable.run();
            }
            onLayoutUpdate(collageLayoutDelete);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (!hasLayout() || this.preview) {
            cancelTouch();
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            cancelTouch();
            return false;
        }
        Part partAt = getPartAt(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.tx = motionEvent.getX();
            this.ty = motionEvent.getY();
            this.reorderingTouch = false;
            this.dx = 0.0f;
            this.ldx = 0.0f;
            this.dy = 0.0f;
            this.ldy = 0.0f;
            this.pressedPart = partAt;
            if (partAt != null) {
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onLongPress();
                    }
                };
                this.onLongPressPart = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (MathUtils.distance(motionEvent.getX(), motionEvent.getY(), this.tx, this.ty) > AndroidUtilities.touchSlop * 1.2f && (runnable = this.onLongPressPart) != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.onLongPressPart = null;
            }
            if (!this.reorderingTouch && getFilledProgress() >= 1.0f && this.pressedPart != null && partAt != null && MathUtils.distance(motionEvent.getX(), motionEvent.getY(), this.tx, this.ty) > AndroidUtilities.touchSlop * 1.2f) {
                this.reorderingTouch = true;
                this.reorderingPart = this.pressedPart;
                this.dx = 0.0f;
                this.ldx = 0.0f;
                this.dy = 0.0f;
                this.ldy = 0.0f;
                invalidate();
                Runnable runnable3 = this.onLongPressPart;
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                    this.onLongPressPart = null;
                }
            } else if (this.reorderingTouch && this.reorderingPart != null) {
                int partIndexAt = getPartIndexAt(motionEvent.getX(), motionEvent.getY());
                int iIndexOf = this.parts.indexOf(this.reorderingPart);
                if (partIndexAt >= 0 && iIndexOf >= 0 && partIndexAt != iIndexOf) {
                    swap(iIndexOf, partIndexAt);
                    float f = this.currentLayout.h;
                    CollageLayout.Part part = this.reorderingPart.part;
                    float f2 = this.animatedColumns[part.y].get();
                    this.rect.set((getMeasuredWidth() / f2) * part.x, (getMeasuredHeight() / f) * part.y, (getMeasuredWidth() / f2) * (part.x + 1), (getMeasuredHeight() / f) * (part.y + 1));
                    this.ldx = this.dx;
                    this.ldy = this.dy;
                    this.tx = this.rect.centerX();
                    this.ty = this.rect.centerY();
                }
                this.dx = motionEvent.getX() - this.tx;
                this.dy = motionEvent.getY() - this.ty;
                invalidate();
            } else if (this.pressedPart != partAt) {
                this.pressedPart = null;
                Runnable runnable4 = this.onLongPressPart;
                if (runnable4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable4);
                    this.onLongPressPart = null;
                }
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.pressedPart != null) {
                this.pressedPart = null;
                this.reorderingTouch = false;
                invalidate();
                Runnable runnable5 = this.onLongPressPart;
                if (runnable5 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable5);
                    this.onLongPressPart = null;
                }
                return true;
            }
        } else if (motionEvent.getAction() == 3 && cancelTouch()) {
            return true;
        }
        return this.pressedPart != null || super.dispatchTouchEvent(motionEvent);
    }

    public boolean cancelTouch() {
        if (this.pressedPart == null) {
            return false;
        }
        this.pressedPart = null;
        this.reorderingTouch = false;
        invalidate();
        Runnable runnable = this.onLongPressPart;
        if (runnable == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        this.onLongPressPart = null;
        return true;
    }

    public class Part {
        private ValueAnimator animator;
        private StoryEntry content;
        private boolean current;
        private final AnimatedFloat highlightAnimated;
        public final ImageReceiver imageReceiver;
        private int index;
        public CollageLayout.Part part;
        public TextureView textureView;
        public boolean textureViewReady;
        public VideoPlayerHolderBase videoPlayer;
        private volatile long pendingSeek = -1;
        public boolean hasBounds = false;
        public RectF fromBounds = new RectF();
        public RectF bounds = new RectF();
        public float boundsTransition = 1.0f;

        public Part() {
            this.highlightAnimated = new AnimatedFloat(CollageLayoutView2.this, 0L, 1200L, CubicBezierInterpolator.EASE_OUT);
            this.imageReceiver = new ImageReceiver(CollageLayoutView2.this);
        }

        public void setPart(CollageLayout.Part part, boolean z) {
            CollageLayout.Part part2 = this.part;
            if (part != null) {
                this.part = part;
            }
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            if (!z) {
                CollageLayoutView2.this.layout(this.bounds, part);
                this.boundsTransition = 1.0f;
                if (part == null) {
                    this.imageReceiver.onDetachedFromWindow();
                    destroyContent();
                    CollageLayoutView2.this.removingParts.remove(this);
                }
            } else {
                if (!this.hasBounds) {
                    CollageLayoutView2.this.layoutOut(this.fromBounds, part);
                } else {
                    RectF rectF = this.fromBounds;
                    AndroidUtilities.lerp(rectF, this.bounds, this.boundsTransition, rectF);
                }
                if (part == null) {
                    CollageLayoutView2.this.layoutOut(this.bounds, part2);
                } else {
                    CollageLayoutView2.this.layout(this.bounds, part);
                }
                this.boundsTransition = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Part.this.boundsTransition = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        CollageLayoutView2.this.invalidate();
                    }
                });
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Part part3 = Part.this;
                        part3.boundsTransition = 1.0f;
                        if (CollageLayoutView2.this.removingParts.contains(part3)) {
                            Part.this.imageReceiver.onDetachedFromWindow();
                            Part.this.destroyContent();
                            Part part4 = Part.this;
                            CollageLayoutView2.this.removingParts.remove(part4);
                        }
                        CollageLayoutView2.this.invalidate();
                    }
                });
                this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.animator.setDuration(360L);
                this.animator.start();
            }
            CollageLayoutView2.this.invalidate();
            this.hasBounds = true;
        }

        public void setCurrent(boolean z) {
            this.current = z;
        }

        public void setContent(StoryEntry storyEntry) {
            destroyContent();
            this.content = storyEntry;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
            sb.append("_");
            sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
            sb.append((storyEntry == null || !storyEntry.isVideo) ? "" : "_g");
            sb.append("_exif");
            String string = sb.toString();
            StoryEntry storyEntry2 = this.content;
            if (storyEntry2 == null) {
                this.imageReceiver.clearImage();
            } else if (storyEntry2.isVideo) {
                Bitmap bitmap = storyEntry2.blurredVideoThumb;
                if (bitmap != null) {
                    this.imageReceiver.setImageBitmap(bitmap);
                } else {
                    Bitmap bitmap2 = storyEntry2.thumbBitmap;
                    if (bitmap2 != null) {
                        this.imageReceiver.setImageBitmap(bitmap2);
                    } else {
                        String str = storyEntry2.thumbPath;
                        if (str != null) {
                            this.imageReceiver.setImage(str, string, null, null, 0L);
                        } else {
                            this.imageReceiver.clearImage();
                        }
                    }
                }
                TextureView textureView = new TextureView(CollageLayoutView2.this.getContext());
                this.textureView = textureView;
                CollageLayoutView2.this.addView(textureView);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3();
                this.videoPlayer = anonymousClass3;
                anonymousClass3.allowMultipleInstances(true);
                this.videoPlayer.with(this.textureView);
                this.videoPlayer.preparePlayer(Uri.fromFile(this.content.file), false, 1.0f);
                VideoPlayerHolderBase videoPlayerHolderBase = this.videoPlayer;
                CollageLayoutView2 collageLayoutView2 = CollageLayoutView2.this;
                videoPlayerHolderBase.setVolume((collageLayoutView2.isMuted || this.content.muted || !collageLayoutView2.preview) ? 0.0f : this.content.videoVolume);
                if (!CollageLayoutView2.this.preview || CollageLayoutView2.this.playing) {
                    this.videoPlayer.play();
                } else {
                    this.videoPlayer.pause();
                }
            } else {
                this.imageReceiver.setImage(storyEntry2.file.getAbsolutePath(), string, null, null, 0L);
            }
            CollageLayoutView2.this.invalidate();
        }

        class AnonymousClass3 extends VideoPlayerHolderBase {
            AnonymousClass3() {
            }

            @Override
            public void onRenderedFirstFrame() {
                Part part = Part.this;
                part.textureViewReady = true;
                CollageLayoutView2.this.invalidate();
            }

            @Override
            protected void onVideoSizeChanged(final int i, final int i2, final int i3, float f) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        CollageLayoutView2.Part.AnonymousClass3.$r8$lambda$_Je7MVtkR1GChAOhzUYZQ3_bSvY(this.f$0, i, i2, i3);
                    }
                });
            }

            public static void $r8$lambda$_Je7MVtkR1GChAOhzUYZQ3_bSvY(AnonymousClass3 anonymousClass3, int i, int i2, int i3) {
                StoryEntry storyEntry = Part.this.content;
                if (storyEntry == null) {
                    return;
                }
                if (storyEntry.width == i && storyEntry.height == i2 && storyEntry.orientation == i3) {
                    return;
                }
                storyEntry.width = i;
                storyEntry.height = i2;
                storyEntry.orientation = i3;
                TextureView textureView = Part.this.textureView;
                if (textureView != null) {
                    textureView.requestLayout();
                }
            }

            @Override
            public boolean needRepeat() {
                return !CollageLayoutView2.this.preview;
            }
        }

        public boolean hasContent() {
            return this.content != null;
        }

        public void destroyContent() {
            VideoPlayerHolderBase videoPlayerHolderBase = this.videoPlayer;
            if (videoPlayerHolderBase != null) {
                videoPlayerHolderBase.pause();
                this.videoPlayer.release(null);
                this.videoPlayer = null;
            }
            TextureView textureView = this.textureView;
            if (textureView != null) {
                AndroidUtilities.removeFromParent(textureView);
                this.textureView = null;
            }
            this.textureViewReady = false;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < this.parts.size(); i++) {
            ((Part) this.parts.get(i)).imageReceiver.onAttachedToWindow();
        }
        this.attached = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < this.parts.size(); i++) {
            ((Part) this.parts.get(i)).imageReceiver.onDetachedFromWindow();
        }
        this.attached = false;
        AndroidUtilities.cancelRunOnUIThread(this.syncRunnable);
    }

    public void setCancelGestures(Runnable runnable) {
        this.cancelGestures = runnable;
    }

    public void setResetState(Runnable runnable) {
        this.onResetState = runnable;
    }

    public void setPreview(boolean z) {
        if (this.preview == z) {
            return;
        }
        this.preview = z;
        int i = 0;
        if (z) {
            BlurringShader.BlurManager blurManager = this.blurManager;
            if (blurManager != null) {
                blurManager.invalidate();
            }
            for (int i2 = 0; i2 < this.parts.size(); i2++) {
                ((Part) this.parts.get(i2)).index = i2;
            }
        }
        this.fastSeek = false;
        this.lastPausedPosition = 0L;
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Part part = (Part) obj;
            VideoPlayerHolderBase videoPlayerHolderBase = part.videoPlayer;
            if (videoPlayerHolderBase != null) {
                videoPlayerHolderBase.setAudioEnabled(z, true);
                if (!z || this.playing) {
                    part.videoPlayer.play();
                } else {
                    part.videoPlayer.pause();
                }
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.syncRunnable);
        if (z) {
            this.previewStartTime = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.syncRunnable, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
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
            if (part2.content != null && part2.content.isVideo) {
                long duration = part2.content.duration;
                VideoPlayerHolderBase videoPlayerHolderBase = part2.videoPlayer;
                if (videoPlayerHolderBase != null && videoPlayerHolderBase.getDuration() > 0) {
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

    public void setTimelineView(TimelineView timelineView) {
        this.timelineView = timelineView;
    }

    public void setPreviewView(PreviewView previewView) {
        this.previewView = previewView;
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
        if (!this.preview) {
            return 0L;
        }
        getPosition();
        Part mainPart = getMainPart();
        return getPosition() + (mainPart != null ? mainPart.content.videoOffset + ((long) (mainPart.content.videoLeft * mainPart.content.duration)) : 0L);
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
            AndroidUtilities.cancelRunOnUIThread(this.syncRunnable);
            this.syncRunnable.run();
        }
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public void setMuted(boolean z) {
        if (this.isMuted == z) {
            return;
        }
        this.isMuted = z;
    }

    public boolean hasVideo() {
        ArrayList arrayList = this.parts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Part part = (Part) obj;
            if (part.content != null && part.content.isVideo) {
                return true;
            }
        }
        return false;
    }

    public long getDuration() {
        Part mainPart;
        if (!this.preview || (mainPart = getMainPart()) == null || mainPart.content == null) {
            return 1L;
        }
        return Math.max(Math.min((long) (mainPart.content.duration * (mainPart.content.videoRight - mainPart.content.videoLeft)), 59500L), 1L);
    }

    public void seekTo(long j, boolean z) {
        if (this.preview) {
            long jClamp = Utilities.clamp(j, getDuration(), 0L);
            if (!this.playing) {
                this.lastPausedPosition = jClamp;
            }
            this.previewStartTime = System.currentTimeMillis() - jClamp;
            this.fastSeek = z;
            if (this.preview) {
                AndroidUtilities.cancelRunOnUIThread(this.syncRunnable);
                this.syncRunnable.run();
            }
        }
    }

    public static void $r8$lambda$hICzZDaoQf58xK02j4568ahW3K0(CollageLayoutView2 collageLayoutView2) {
        VideoPlayerHolderBase videoPlayerHolderBase;
        boolean z;
        long position = collageLayoutView2.getPosition();
        Part mainPart = collageLayoutView2.getMainPart();
        long j = mainPart == null ? 0L : mainPart.content.videoOffset + ((long) (mainPart.content.videoLeft * mainPart.content.duration));
        int i = 0;
        while (true) {
            if (i >= collageLayoutView2.parts.size()) {
                break;
            }
            final Part part = (Part) collageLayoutView2.parts.get(i);
            if (part.content != null && (videoPlayerHolderBase = part.videoPlayer) != null) {
                long duration = videoPlayerHolderBase.getDuration();
                long jClamp = Utilities.clamp((position + j) - part.content.videoOffset, duration, 0L);
                if (!collageLayoutView2.preview || collageLayoutView2.playing) {
                    float f = jClamp;
                    float f2 = duration;
                    z = f > part.content.videoLeft * f2 && f < part.content.videoRight * f2;
                }
                float f3 = duration;
                long jClamp2 = Utilities.clamp(jClamp, (long) (part.content.videoRight * f3), (long) (part.content.videoLeft * f3));
                if (part.videoPlayer.isPlaying() != z) {
                    if (z) {
                        part.videoPlayer.play();
                    } else {
                        part.videoPlayer.pause();
                    }
                }
                part.videoPlayer.setVolume((collageLayoutView2.isMuted || part.content.muted || !collageLayoutView2.preview) ? 0.0f : part.content.videoVolume);
                if (Math.abs((part.pendingSeek >= 0 ? part.pendingSeek : part.videoPlayer.getCurrentPosition()) - jClamp2) > 450 && part.pendingSeek < 0) {
                    part.videoPlayer.seekTo(part.pendingSeek = jClamp2, collageLayoutView2.fastSeek, new Runnable() {
                        @Override
                        public final void run() {
                            part.pendingSeek = -1L;
                        }
                    });
                }
            }
            i++;
        }
        TimelineView timelineView = collageLayoutView2.timelineView;
        if (timelineView != null) {
            timelineView.setProgress(position);
        }
        PreviewView previewView = collageLayoutView2.previewView;
        if (previewView != null) {
            previewView.updateAudioPlayer(true);
            collageLayoutView2.previewView.updateRoundPlayer(true);
        }
        if (collageLayoutView2.preview && collageLayoutView2.playing) {
            AndroidUtilities.runOnUIThread(collageLayoutView2.syncRunnable, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }
}
