package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Build;
import android.view.View;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity$70$$ExternalSyntheticLambda0;
import org.telegram.ui.ThemePreviewActivity;

public final class BlurringShader {
    public Bitmap bitmap;
    public boolean bitmapAvailable;
    public ByteBuffer buffer;
    public BlurManager currentManager;
    public int gradientBottom;
    public int gradientTop;
    public FloatBuffer padPosBuffer;
    public FloatBuffer posBuffer;
    public boolean setupTransform;
    public FloatBuffer uvBuffer;
    public int width = 1;
    public int height = 1;
    public int padding = 0;
    public final Program[] program = new Program[2];
    public final float[] m3x3 = new float[9];
    public final float[] matrix = new float[16];
    public final Object matrixLock = new Object();
    public final Object bitmapLock = new Object();
    public final int[] framebuffer = new int[3];
    public final int[] texture = new int[3];
    public final Bulletin$2$$ExternalSyntheticLambda1 invalidateViews = new Bulletin$2$$ExternalSyntheticLambda1(this, 6);
    public final Matrix iMatrix = new Matrix();

    public final class BlurManager {
        public Object blurRenderNode;
        public EGLContext context;
        public final Object contextLock;
        public BlurringShader currentShader;
        public Bitmap fallbackBitmap;
        public final ArrayList holders;
        public int i;
        public final ArrayList invalidateHolders;
        public int padding;
        public final ArrayList parents;
        public Object renderNode;
        public int renderNodeBackgroundColor;
        public ThemePreviewActivity.AnonymousClass14 renderNodeView;
        public final Object textureLock;
        public final ThumbBlurer thumbBlurer;
        public final View view;

        public BlurManager(View view) {
            ArrayList arrayList = new ArrayList();
            this.parents = arrayList;
            this.holders = new ArrayList();
            this.invalidateHolders = new ArrayList();
            this.contextLock = new Object();
            this.textureLock = new Object();
            this.thumbBlurer = new ThumbBlurer(0, new Bulletin$2$$ExternalSyntheticLambda1(this, 7));
            this.i = 0;
            this.view = view;
            if (view.isAttachedToWindow()) {
                arrayList.clear();
                for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                    this.parents.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
            }
            view.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 5));
        }

        public final void acquiredContext(EGLContext eGLContext) {
            synchronized (this.contextLock) {
                try {
                    if (this.context == null) {
                        this.context = eGLContext;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Bitmap getBitmap() {
            Bitmap bitmap;
            BlurringShader blurringShader = this.currentShader;
            if (blurringShader == null) {
                return this.fallbackBitmap;
            }
            synchronized (blurringShader.bitmapLock) {
                try {
                    bitmap = !blurringShader.bitmapAvailable ? null : blurringShader.bitmap;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bitmap == null ? this.fallbackBitmap : bitmap;
        }

        public final boolean hasRenderNode() {
            return this.blurRenderNode != null;
        }

        public final void invalidate() {
            ArrayList arrayList = this.holders;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((StoryBlurDrawer) obj).view.invalidate();
            }
            ArrayList arrayList2 = this.invalidateHolders;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((Runnable) obj2).run();
            }
        }

        public final void resetBitmap() {
            BlurringShader blurringShader = this.currentShader;
            if (blurringShader != null) {
                synchronized (blurringShader.bitmapLock) {
                    blurringShader.bitmapAvailable = false;
                }
            }
        }

        public final void setFallbackBlur(Bitmap bitmap, boolean z) {
            StringBuilder sb = new StringBuilder("");
            int i = this.i;
            this.i = i + 1;
            sb.append(i);
            this.fallbackBitmap = this.thumbBlurer.getBitmap(bitmap, 0, 0, sb.toString(), z);
        }
    }

    public final class Program {
        public final int flipyHandle;
        public final int gl;
        public final int gradientBottomHandle;
        public final int gradientTopHandle;
        public final int hasVideoMatrixHandle;
        public final int matrixHandle;
        public final int posHandle;
        public final int stepHandle;
        public final int szHandle;
        public final int texHandle;
        public final int texSzHandle;
        public final int uvHandle;
        public final int videoMatrixHandle;

        public Program(int i) {
            this.gl = i;
            this.posHandle = GLES20.glGetAttribLocation(i, "p");
            this.uvHandle = GLES20.glGetAttribLocation(i, "inputuv");
            this.matrixHandle = GLES20.glGetUniformLocation(i, "matrix");
            this.texHandle = GLES20.glGetUniformLocation(i, "tex");
            this.szHandle = GLES20.glGetUniformLocation(i, "sz");
            this.texSzHandle = GLES20.glGetUniformLocation(i, "texSz");
            this.gradientTopHandle = GLES20.glGetUniformLocation(i, "gtop");
            this.gradientBottomHandle = GLES20.glGetUniformLocation(i, "gbottom");
            this.stepHandle = GLES20.glGetUniformLocation(i, "step");
            this.videoMatrixHandle = GLES20.glGetUniformLocation(i, "videoMatrix");
            this.hasVideoMatrixHandle = GLES20.glGetUniformLocation(i, "hasVideoMatrix");
            this.flipyHandle = GLES20.glGetUniformLocation(i, "flipy");
        }
    }

    public final class StoryBlurDrawer {
        public final boolean animateBitmapChange;
        public final Integer bgColor;
        public BitmapShader bitmapShader;
        public final RectF bounds;
        public final Path clipPath;
        public int clipPathHeight;
        public int clipPathWidth;
        public final ColorMatrix colorMatrix;
        public ValueAnimator crossfadeAnimator;
        public Bitmap lastBitmap;
        public final int[] loc1;
        public final int[] loc2;
        public final BlurManager manager;
        public final Matrix matrix;
        public Paint oldPaint;
        public float oldPaintAlpha;
        public boolean oldPaintSet;
        public Paint paint;
        public Paint[] tempPaints;
        public final int type;
        public final View view;
        public boolean wasDark;

        public final class AnonymousClass2 extends Drawable {
            public final Drawable val$base;
            public final float val$offsetX;
            public final float val$offsetY;
            public final float val$r;
            public float alpha = 1.0f;
            public final Paint dimPaint = new Paint(1);
            public final Rect rect = new Rect();
            public final Path clipPath = new Path();

            public AnonymousClass2(float f, float f2, Drawable drawable, float f3) {
                this.val$offsetX = f;
                this.val$offsetY = f2;
                this.val$base = drawable;
                this.val$r = f3;
            }

            @Override
            public final void draw(Canvas canvas) {
                BlurManager blurManager;
                Bitmap bitmap;
                Bitmap bitmap2;
                BlurManager blurManager2 = StoryBlurDrawer.this.manager;
                Paint paint = null;
                if (blurManager2 != null) {
                    BlurringShader blurringShader = blurManager2.currentShader;
                    if (blurringShader == null) {
                        bitmap2 = blurManager2.fallbackBitmap;
                    } else {
                        synchronized (blurringShader.bitmapLock) {
                            try {
                                bitmap = !blurringShader.bitmapAvailable ? null : blurringShader.bitmap;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        bitmap2 = bitmap == null ? blurManager2.fallbackBitmap : bitmap;
                    }
                    if (bitmap2 != null) {
                        StoryBlurDrawer storyBlurDrawer = StoryBlurDrawer.this;
                        if (storyBlurDrawer.bitmapShader == null || storyBlurDrawer.lastBitmap != bitmap2) {
                            StoryBlurDrawer.this.lastBitmap = bitmap2;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            storyBlurDrawer.bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                            StoryBlurDrawer storyBlurDrawer2 = StoryBlurDrawer.this;
                            storyBlurDrawer2.paint.setShader(storyBlurDrawer2.bitmapShader);
                        }
                        StoryBlurDrawer.this.matrix.reset();
                        StoryBlurDrawer.this.matrix.postTranslate((-0.0f) - this.val$offsetX, (-0.0f) - this.val$offsetY);
                        StoryBlurDrawer storyBlurDrawer3 = StoryBlurDrawer.this;
                        View view = storyBlurDrawer3.manager.view;
                        if (view != null) {
                            storyBlurDrawer3.matrix.preScale(view.getWidth() / bitmap2.getWidth(), StoryBlurDrawer.this.manager.view.getHeight() / bitmap2.getHeight());
                        }
                        StoryBlurDrawer storyBlurDrawer4 = StoryBlurDrawer.this;
                        storyBlurDrawer4.bitmapShader.setLocalMatrix(storyBlurDrawer4.matrix);
                        StoryBlurDrawer.this.paint.setAlpha((int) (this.alpha * 255.0f));
                        paint = StoryBlurDrawer.this.paint;
                    }
                }
                Rect bounds = getBounds();
                if (paint == null && ((blurManager = StoryBlurDrawer.this.manager) == null || !blurManager.hasRenderNode())) {
                    Drawable drawable = this.val$base;
                    if (drawable != null) {
                        drawable.setBounds(bounds);
                        this.val$base.draw(canvas);
                        return;
                    }
                    this.dimPaint.setColor(-14145495);
                    if (this.val$r <= 0.0f) {
                        canvas.drawRect(bounds, this.dimPaint);
                        return;
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(bounds);
                    float f = this.val$r;
                    canvas.drawRoundRect(rectF, f, f, this.dimPaint);
                    return;
                }
                if (this.val$base != null) {
                    canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                    this.val$base.setBounds(bounds);
                    this.val$base.draw(canvas);
                    BlurManager blurManager3 = StoryBlurDrawer.this.manager;
                    if (blurManager3 == null || !blurManager3.hasRenderNode()) {
                        canvas.drawRect(bounds, paint);
                    } else {
                        canvas.save();
                        getPadding(this.rect);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        int i = bounds.left;
                        Rect rect = this.rect;
                        rectF2.set(i + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                        this.clipPath.rewind();
                        Path path = this.clipPath;
                        float f2 = this.val$r;
                        path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                        StoryBlurDrawer.this.drawRect(canvas, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    getPadding(this.rect);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    int i2 = bounds.left;
                    Rect rect2 = this.rect;
                    rectF3.set(i2 + rect2.left, bounds.top + rect2.top, bounds.right - rect2.right, bounds.bottom - rect2.bottom);
                    this.dimPaint.setColor(1711276032);
                    float f3 = this.val$r;
                    canvas.drawRoundRect(rectF3, f3, f3, this.dimPaint);
                    return;
                }
                if (this.val$r > 0.0f) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(bounds);
                    BlurManager blurManager4 = StoryBlurDrawer.this.manager;
                    if (blurManager4 == null || !blurManager4.hasRenderNode()) {
                        float f4 = this.val$r;
                        canvas.drawRoundRect(rectF4, f4, f4, paint);
                    } else {
                        canvas.save();
                        this.clipPath.rewind();
                        Path path2 = this.clipPath;
                        float f5 = this.val$r;
                        path2.addRoundRect(rectF4, f5, f5, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                        StoryBlurDrawer.this.drawRect(canvas, false);
                        canvas.restore();
                    }
                } else {
                    BlurManager blurManager5 = StoryBlurDrawer.this.manager;
                    if (blurManager5 == null || !blurManager5.hasRenderNode()) {
                        canvas.drawRect(bounds, paint);
                    } else {
                        canvas.save();
                        canvas.clipRect(bounds);
                        StoryBlurDrawer.this.drawRect(canvas, false);
                        canvas.restore();
                    }
                }
                this.dimPaint.setColor(1711276032);
                if (this.val$r <= 0.0f) {
                    canvas.drawRect(bounds, this.dimPaint);
                    return;
                }
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(bounds);
                float f6 = this.val$r;
                canvas.drawRoundRect(rectF5, f6, f6, this.dimPaint);
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final boolean getPadding(Rect rect) {
                Drawable drawable = this.val$base;
                if (drawable != null) {
                    return drawable.getPadding(rect);
                }
                rect.set(0, 0, 0, 0);
                return true;
            }

            @Override
            public final void setAlpha(int i) {
                this.alpha = i / 255.0f;
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public StoryBlurDrawer(BlurManager blurManager, View view) {
            this(blurManager, view, 6, false);
        }

        public final void drawRect(Canvas canvas) {
            drawRect(canvas, true);
        }

        public final Paint getPaint$1(float f) {
            Bitmap bitmap;
            Bitmap bitmap2;
            Bitmap bitmap3;
            BlurManager blurManager = this.manager;
            if (blurManager != null) {
                BlurringShader blurringShader = blurManager.currentShader;
                if (blurringShader == null) {
                    bitmap2 = blurManager.fallbackBitmap;
                } else {
                    synchronized (blurringShader.bitmapLock) {
                        try {
                            bitmap = !blurringShader.bitmapAvailable ? null : blurringShader.bitmap;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    bitmap2 = bitmap == null ? blurManager.fallbackBitmap : bitmap;
                }
                if (bitmap2 != null) {
                    BitmapShader bitmapShader = this.bitmapShader;
                    if (bitmapShader == null || this.lastBitmap != bitmap2) {
                        if (this.animateBitmapChange && bitmapShader != null && (bitmap3 = this.lastBitmap) != null && !bitmap3.isRecycled() && !bitmap2.isRecycled()) {
                            Paint paint = this.paint;
                            this.paint = this.oldPaint;
                            this.oldPaint = paint;
                            this.oldPaintSet = true;
                            ValueAnimator valueAnimator = this.crossfadeAnimator;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                this.crossfadeAnimator = null;
                            }
                            this.oldPaintAlpha = 1.0f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            this.crossfadeAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 24));
                            this.crossfadeAnimator.start();
                        }
                        this.lastBitmap = bitmap2;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode, tileMode);
                        this.bitmapShader = bitmapShader2;
                        this.paint.setShader(bitmapShader2);
                    }
                    setupMatrix(bitmap2.getWidth(), bitmap2.getHeight(), false);
                    this.matrix.postTranslate(-0.0f, -0.0f);
                    this.bitmapShader.setLocalMatrix(this.matrix);
                    this.paint.setAlpha((int) (f * 255.0f));
                    return this.paint;
                }
            }
            return null;
        }

        public final Paint[] getPaints() {
            Paint paint$1 = getPaint$1(1.0f);
            boolean z = this.oldPaintSet;
            Paint paint = z ? this.oldPaint : null;
            if (paint$1 != null && z) {
                paint$1.setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.oldPaintAlpha, 255.0f, 1.0f));
            }
            if (paint != null) {
                paint.setAlpha((int) 255.0f);
            }
            if (this.tempPaints == null) {
                this.tempPaints = new Paint[2];
            }
            Paint[] paintArr = this.tempPaints;
            paintArr[0] = paint;
            paintArr[1] = paint$1;
            return paintArr;
        }

        public final void setBounds(float f, float f2, float f3, float f4) {
            Bitmap bitmap;
            Bitmap bitmap2;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f, f2, f3, f4);
            RectF rectF2 = this.bounds;
            if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
                return;
            }
            rectF2.set(rectF);
            BlurManager blurManager = this.manager;
            BlurringShader blurringShader = blurManager.currentShader;
            if (blurringShader == null) {
                bitmap2 = blurManager.fallbackBitmap;
            } else {
                synchronized (blurringShader.bitmapLock) {
                    try {
                        bitmap = !blurringShader.bitmapAvailable ? null : blurringShader.bitmap;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                bitmap2 = bitmap == null ? blurManager.fallbackBitmap : bitmap;
            }
            if (bitmap2 == null) {
                return;
            }
            if (this.bitmapShader == null || this.lastBitmap != bitmap2) {
                this.lastBitmap = bitmap2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                this.bitmapShader = bitmapShader;
                this.paint.setShader(bitmapShader);
            }
            float fWidth = this.bounds.width() / this.lastBitmap.getWidth();
            float fHeight = this.bounds.height() / this.lastBitmap.getHeight();
            this.matrix.reset();
            Matrix matrix = this.matrix;
            RectF rectF3 = this.bounds;
            matrix.postTranslate(rectF3.left, rectF3.top);
            this.matrix.preScale(fWidth, fHeight);
            this.bitmapShader.setLocalMatrix(this.matrix);
        }

        public final void setupMatrix(int i, int i2, boolean z) {
            View view;
            ArrayList arrayList;
            View view2;
            Matrix matrix = this.matrix;
            matrix.reset();
            BlurManager blurManager = this.manager;
            if (blurManager != null) {
                view = z ? blurManager.renderNodeView : blurManager.view;
            } else {
                view = null;
            }
            if (blurManager != null) {
                View view3 = this.view;
                do {
                    matrix.preScale(1.0f / view3.getScaleX(), 1.0f / view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                    matrix.preRotate(-view3.getRotation(), view3.getPivotX(), view3.getPivotY());
                    matrix.preTranslate(-view3.getX(), -view3.getY());
                    boolean z2 = view3.getParent() instanceof View;
                    arrayList = blurManager.parents;
                    if (!z2 || (view3 = (View) view3.getParent()) == null) {
                        break;
                    }
                } while (!arrayList.contains(view3));
                if (view != view3) {
                    int iIndexOf = arrayList.indexOf(view3) + 1;
                    if (iIndexOf == 0 && (view2 = (View) arrayList.get(iIndexOf)) != null) {
                        int[] iArr = this.loc1;
                        view3.getLocationOnScreen(iArr);
                        int[] iArr2 = this.loc2;
                        view2.getLocationOnScreen(iArr2);
                        matrix.preTranslate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                    }
                    while (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                        View view4 = (View) arrayList.get(iIndexOf);
                        if (view4 != null) {
                            matrix.preScale(view4.getScaleX(), view4.getScaleY(), view4.getPivotX(), view4.getPivotY());
                            matrix.preRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                            matrix.preTranslate(view4.getX(), view4.getY());
                            iIndexOf++;
                        }
                    }
                }
            }
            if (view != null) {
                matrix.preScale(view.getWidth() / i, view.getHeight() / i2);
            }
        }

        public StoryBlurDrawer(BlurManager blurManager, View view, int i, boolean z) {
            this.oldPaint = new Paint(3);
            this.paint = new Paint(3);
            this.clipPath = new Path();
            this.matrix = new Matrix();
            this.bounds = new RectF();
            this.wasDark = false;
            this.loc1 = new int[2];
            this.loc2 = new int[2];
            this.manager = blurManager;
            this.view = view;
            this.type = i;
            this.animateBitmapChange = z;
            ColorMatrix colorMatrix = new ColorMatrix();
            this.colorMatrix = colorMatrix;
            if (i == 0) {
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
            } else if (i == 5) {
                Paint paint = this.paint;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.oldPaint.setXfermode(new PorterDuffXfermode(mode));
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
            } else if (i == 2) {
                Paint paint2 = this.paint;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                paint2.setXfermode(new PorterDuffXfermode(mode2));
                this.oldPaint.setXfermode(new PorterDuffXfermode(mode2));
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
            } else if (i == 1) {
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.7f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.5f);
            } else if (i == 3) {
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
            } else if (i == 4) {
                this.bgColor = -10329502;
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.3f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.2f);
            } else if (i == 6) {
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.35f);
            } else if (i == 7) {
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.95f);
            } else if (i == 8) {
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.15f);
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.47f);
            } else if (i == 9) {
                Paint paint3 = this.paint;
                PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode3));
                this.oldPaint.setXfermode(new PorterDuffXfermode(mode3));
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
            } else if (i == 10) {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.wasDark ? 0.97f : 0.92f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.wasDark ? 0.12f : -0.06f);
            }
            this.paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.oldPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            if (view.isAttachedToWindow() && blurManager != null) {
                blurManager.holders.add(this);
            }
            view.addOnAttachStateChangeListener(new Text.AnonymousClass1(1, this, blurManager));
        }

        public final void drawRect(Canvas canvas, boolean z) {
            BlurManager blurManager = this.manager;
            if (!blurManager.hasRenderNode() || Build.VERSION.SDK_INT < 31) {
                Paint paint$1 = getPaint$1(1.0f);
                if (paint$1 != null) {
                    canvas.drawPaint(paint$1);
                    return;
                }
                return;
            }
            boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.bgColor;
            if (!zIsHardwareAccelerated) {
                canvas.drawColor(num != null ? num.intValue() : blurManager.renderNodeBackgroundColor);
                return;
            }
            RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(blurManager.blurRenderNode);
            if (!renderNodeM.hasDisplayList()) {
                RenderNode renderNodeM2 = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(blurManager.renderNode);
                renderNodeM.setPosition(0, 0, renderNodeM2.getWidth(), renderNodeM2.getHeight());
                RecordingCanvas recordingCanvasBeginRecording = renderNodeM.beginRecording();
                recordingCanvasBeginRecording.drawColor(num != null ? num.intValue() : blurManager.renderNodeBackgroundColor);
                recordingCanvasBeginRecording.drawRenderNode(renderNodeM2);
                renderNodeM.endRecording();
            }
            if (!renderNodeM.hasDisplayList()) {
                canvas.drawColor(num != null ? num.intValue() : blurManager.renderNodeBackgroundColor);
                return;
            }
            canvas.drawColor(num != null ? num.intValue() : blurManager.renderNodeBackgroundColor);
            setupMatrix(renderNodeM.getWidth(), renderNodeM.getHeight(), true);
            if (renderNodeM.hasDisplayList()) {
                Matrix matrix = this.matrix;
                matrix.postTranslate(-0.0f, -0.0f);
                this.paint.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.paint);
                canvas.concat(matrix);
                if (z) {
                    int i = this.clipPathWidth;
                    int width = renderNodeM.getWidth();
                    Path path = this.clipPath;
                    if (i != width || this.clipPathHeight != renderNodeM.getHeight()) {
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        int width2 = renderNodeM.getWidth();
                        this.clipPathWidth = width2;
                        int height = renderNodeM.getHeight();
                        this.clipPathHeight = height;
                        rectF.set(0.0f, 0.0f, width2, height);
                        path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    }
                    canvas.clipPath(path);
                }
                canvas.drawRenderNode(renderNodeM);
                canvas.restore();
            }
        }
    }

    public final void draw(float[] fArr, int i, int i2, int i3) {
        char c = fArr != null ? (char) 1 : (char) 0;
        Program program = this.program[c];
        if (program == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.framebuffer[0]);
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glClear(16384);
        GLES20.glUseProgram(program.gl);
        GLES20.glUniform1i(program.texHandle, 0);
        GLES20.glActiveTexture(33984);
        if (c != 0) {
            GLES20.glBindTexture(36197, i);
        } else {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glEnableVertexAttribArray(program.uvHandle);
        GLES20.glVertexAttribPointer(program.uvHandle, 2, 5126, false, 8, (Buffer) this.uvBuffer);
        GLES20.glEnableVertexAttribArray(program.posHandle);
        GLES20.glVertexAttribPointer(program.posHandle, 2, 5126, false, 8, (Buffer) this.posBuffer);
        GLES20.glUniform2f(program.szHandle, this.width, this.height);
        float f = i2;
        float f2 = i3;
        GLES20.glUniform2f(program.texSzHandle, f, f2);
        GLES20.glUniform1i(program.stepHandle, 0);
        GLES20.glUniform1f(program.flipyHandle, c != 0 ? 1.0f : 0.0f);
        if (c != 0) {
            GLES20.glUniformMatrix4fv(program.videoMatrixHandle, 1, false, fArr, 0);
        }
        GLES20.glUniform1f(program.hasVideoMatrixHandle, c == 0 ? 0.0f : 1.0f);
        org.telegram.ui.Components.Paint.Shader.SetColorUniform(program.gradientTopHandle, this.gradientTop);
        org.telegram.ui.Components.Paint.Shader.SetColorUniform(program.gradientBottomHandle, this.gradientBottom);
        synchronized (this.matrixLock) {
            GLES20.glUniformMatrix4fv(program.matrixHandle, 1, false, this.matrix, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        if (c != 0) {
            program = this.program[0];
            if (program == null) {
                return;
            }
            GLES20.glUseProgram(program.gl);
            GLES20.glEnableVertexAttribArray(program.uvHandle);
            GLES20.glVertexAttribPointer(program.uvHandle, 2, 5126, false, 8, (Buffer) this.uvBuffer);
            GLES20.glEnableVertexAttribArray(program.posHandle);
            GLES20.glVertexAttribPointer(program.posHandle, 2, 5126, false, 8, (Buffer) this.posBuffer);
            GLES20.glUniform2f(program.szHandle, this.width, this.height);
            GLES20.glUniform2f(program.texSzHandle, f, f2);
            GLES20.glUniform1i(program.stepHandle, 0);
            org.telegram.ui.Components.Paint.Shader.SetColorUniform(program.gradientTopHandle, this.gradientTop);
            org.telegram.ui.Components.Paint.Shader.SetColorUniform(program.gradientBottomHandle, this.gradientBottom);
            GLES20.glUniform1f(program.flipyHandle, 0.0f);
            synchronized (this.matrixLock) {
                GLES20.glUniformMatrix4fv(program.matrixHandle, 1, false, this.matrix, 0);
            }
        }
        GLES20.glBindFramebuffer(36160, this.framebuffer[1]);
        GLES20.glUniform1i(program.stepHandle, 1);
        GLES20.glUniform1i(program.texHandle, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, this.framebuffer[2]);
        int i4 = this.width;
        int i5 = this.padding * 2;
        GLES20.glViewport(0, 0, i4 + i5, i5 + this.height);
        GLES20.glClear(16384);
        GLES20.glEnableVertexAttribArray(program.posHandle);
        GLES20.glVertexAttribPointer(program.posHandle, 2, 5126, false, 8, (Buffer) this.padPosBuffer);
        GLES20.glUniform1i(program.stepHandle, 2);
        GLES20.glUniform1i(program.texHandle, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture[1]);
        BlurManager blurManager = this.currentManager;
        Object obj = blurManager != null ? blurManager.textureLock : null;
        if (obj != null) {
            synchronized (obj) {
                GLES20.glDrawArrays(5, 0, 4);
            }
        } else {
            GLES20.glDrawArrays(5, 0, 4);
        }
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            int i6 = this.width;
            int i7 = this.padding * 2;
            GLES20.glReadPixels(0, 0, i7 + i6, i7 + this.height, 6408, 5121, this.buffer);
            synchronized (this.bitmapLock) {
                this.bitmap.copyPixelsFromBuffer(this.buffer);
                this.bitmapAvailable = true;
            }
            GLES20.glBindFramebuffer(36160, 0);
        }
        AndroidUtilities.cancelRunOnUIThread(this.invalidateViews);
        AndroidUtilities.runOnUIThread(this.invalidateViews);
    }

    public final void setBlurManager(BlurManager blurManager) {
        BlurManager blurManager2 = this.currentManager;
        if (blurManager2 != null && blurManager2.currentShader != null) {
            blurManager2.currentShader = null;
        }
        this.currentManager = blurManager;
        if (blurManager == null || blurManager.currentShader == this) {
            return;
        }
        blurManager.currentShader = this;
        blurManager.invalidate();
    }

    public final boolean setup(float f, int i) {
        this.width = (int) Math.round(Math.sqrt(f * 324.0f));
        this.height = (int) Math.round(Math.sqrt(324.0f / f));
        this.padding = i;
        if (!this.setupTransform) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.iMatrix;
            matrix.invert(matrix2);
            float f2 = 1;
            matrix2.preScale(f2, f2);
            float f3 = 1.0f / f2;
            matrix2.postScale(f3, f3);
            updateTransform(matrix2);
        }
        float[] fArr = new float[8];
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        fArr[4] = -1.0f;
        fArr[5] = -1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.posBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.posBuffer.position(0);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 * 2;
            float f4 = fArr[i3];
            int i4 = this.width;
            fArr[i3] = ((i4 - i) / i4) * f4;
            int i5 = i3 + 1;
            float f5 = fArr[i5];
            int i6 = this.height;
            fArr[i5] = ((i6 - i) / i6) * f5;
        }
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.padPosBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr);
        this.padPosBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer3 = byteBufferAllocateDirect3.asFloatBuffer();
        this.uvBuffer = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.uvBuffer.position(0);
        String res = AndroidUtilities.readRes(R.raw.blur_vrt);
        String res2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (res != null && res2 != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (i7 == 1) {
                    res2 = "#extension GL_OES_EGL_image_external : require\n" + res2.replace("sampler2D tex", "samplerExternalOES tex");
                }
                int iLoadShader = FilterShaders.loadShader(35633, res);
                int iLoadShader2 = FilterShaders.loadShader(35632, res2);
                if (iLoadShader != 0 && iLoadShader2 != 0) {
                    int iGlCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                    GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
                    GLES20.glBindAttribLocation(iGlCreateProgram, 0, "p");
                    GLES20.glBindAttribLocation(iGlCreateProgram, 1, "inputuv");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        return false;
                    }
                    this.program[i7] = new Program(iGlCreateProgram);
                }
            }
            int[] iArr2 = this.framebuffer;
            GLES20.glGenFramebuffers(3, iArr2, 0);
            int[] iArr3 = this.texture;
            GLES20.glGenTextures(3, iArr3, 0);
            int i8 = 0;
            while (i8 < 3) {
                GLES20.glBindTexture(3553, iArr3[i8]);
                GLES20.glTexImage2D(3553, 0, 6408, this.width + (i8 == 2 ? i * 2 : 0), this.height + (i8 == 2 ? i * 2 : 0), 0, 6408, 5121, null);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glBindFramebuffer(36160, iArr2[i8]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[i8], 0);
                if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                    i8++;
                }
            }
            GLES20.glBindFramebuffer(36160, 0);
            int i9 = i * 2;
            this.bitmap = Bitmap.createBitmap(this.width + i9, this.height + i9, Bitmap.Config.ARGB_8888);
            this.buffer = ByteBuffer.allocateDirect((i9 + this.height) * (this.width + i9) * 4);
            return true;
        }
        return false;
    }

    public final void updateTransform(Matrix matrix) {
        this.setupTransform = true;
        matrix.getValues(this.m3x3);
        synchronized (this.matrixLock) {
            float[] fArr = this.matrix;
            float[] fArr2 = this.m3x3;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
    }

    public final class ThumbBlurer {
        public final Paint clearPaint;
        public ChatActivity$70$$ExternalSyntheticLambda0 generate;
        public final Runnable invalidate;
        public final int padding;
        public Bitmap thumbBitmap;
        public String thumbKey;

        public ThumbBlurer(int i, Runnable runnable) {
            Paint paint = new Paint(1);
            this.clearPaint = paint;
            this.padding = i;
            this.invalidate = runnable;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public final void destroy() {
            this.thumbKey = null;
            if (this.generate != null) {
                Utilities.globalQueue.cancelRunnable(this.generate);
            }
            Bitmap bitmap = this.thumbBitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.thumbBitmap.recycle();
            }
            this.thumbBitmap = null;
        }

        public final android.graphics.Bitmap getBitmap(android.graphics.Bitmap r9, int r10, int r11, java.lang.String r12, boolean r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BlurringShader.ThumbBlurer.getBitmap(android.graphics.Bitmap, int, int, java.lang.String, boolean):android.graphics.Bitmap");
        }

        public final Bitmap getBitmap(ImageReceiver.BitmapHolder bitmapHolder) {
            if (bitmapHolder == null) {
                return null;
            }
            return getBitmap(bitmapHolder.bitmap, bitmapHolder.orientation, 0, bitmapHolder.getKey(), false);
        }
    }
}
