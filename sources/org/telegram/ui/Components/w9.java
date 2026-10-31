package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
public final class w9 {
    public final s9 f32108a;
    public final View f32109b;
    public final ColorMatrix f32110c;
    public final boolean d;
    public boolean e;
    public float f32111f;
    public Paint f32112g;
    public Paint h;
    public final int f32113i;
    public final Integer f32114j;
    public final Path f32115k;
    public int f32116l;
    public int f32117m;
    public Bitmap f32118n;
    public BitmapShader f32119o;
    public final Matrix f32120p;
    public final RectF f32121q;
    public boolean f32122r;
    public Paint[] f32123s;
    public ValueAnimator f32124t;
    public final int[] f32125u;
    public final int[] v;

    public w9(s9 s9Var, View view) {
        this(s9Var, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        s9 s9Var = this.f32108a;
        if (s9Var.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f32114j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i13 = num.intValue();
                } else {
                    i13 = s9Var.f30198i;
                }
                canvas.drawColor(i13);
                return;
            }
            RenderNode renderNode = (RenderNode) s9Var.f30201l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) s9Var.f30200k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = s9Var.f30198i;
                }
                beginRecording.drawColor(i12);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = s9Var.f30198i;
                }
                canvas.drawColor(i11);
                return;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = s9Var.f30198i;
            }
            canvas.drawColor(i10);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f32120p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i14 = this.f32116l;
                    int width = renderNode.getWidth();
                    Path path = this.f32115k;
                    if (i14 != width || this.f32117m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = org.telegram.messenger.i0.P;
                        int width2 = renderNode.getWidth();
                        this.f32116l = width2;
                        int height = renderNode.getHeight();
                        this.f32117m = height;
                        rectF.set(0.0f, 0.0f, width2, height);
                        path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                    }
                    canvas.clipPath(path);
                }
                canvas.drawRenderNode(renderNode);
                canvas.restore();
                return;
            }
            return;
        }
        Paint c10 = c(1.0f);
        if (c10 != null) {
            canvas.drawPaint(c10);
        }
    }

    public final Paint c(float f7) {
        Bitmap b10;
        Bitmap bitmap;
        s9 s9Var = this.f32108a;
        if (s9Var == null || (b10 = s9Var.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f32119o;
        if (bitmapShader == null || this.f32118n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f32118n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f32112g;
                this.f32112g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.f32124t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32124t = null;
                }
                this.f32111f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f32124t = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 6));
                this.f32124t.start();
            }
            this.f32118n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f32119o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f32120p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f32119o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f7 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c10 = c(1.0f);
        boolean z10 = this.e;
        if (z10) {
            paint = this.f32112g;
        } else {
            paint = null;
        }
        if (c10 != null && z10) {
            c10.setAlpha((int) org.telegram.messenger.m5.A(1.0f, this.f32111f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f32123s == null) {
            this.f32123s = new Paint[2];
        }
        Paint[] paintArr = this.f32123s;
        paintArr[0] = paint;
        paintArr[1] = c10;
        return paintArr;
    }

    public final void e(float f7, float f10, float f11, float f12) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = this.f32121q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f32108a.b();
            if (b10 == null) {
                return;
            }
            if (this.f32119o == null || this.f32118n != b10) {
                this.f32118n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f32119o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f32118n.getWidth();
            float height = rectF2.height() / this.f32118n.getHeight();
            Matrix matrix = this.f32120p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f32119o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f32120p;
        matrix.reset();
        s9 s9Var = this.f32108a;
        if (s9Var != null) {
            if (z10) {
                view = s9Var.f30199j;
            } else {
                view = s9Var.f30194b;
            }
        } else {
            view = null;
        }
        if (s9Var != null) {
            ArrayList arrayList = s9Var.f30195c;
            View view3 = this.f32109b;
            do {
                matrix.preScale(1.0f / view3.getScaleX(), 1.0f / view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                matrix.preRotate(-view3.getRotation(), view3.getPivotX(), view3.getPivotY());
                matrix.preTranslate(-view3.getX(), -view3.getY());
                if (!(view3.getParent() instanceof View) || (view3 = (View) view3.getParent()) == null) {
                    break;
                }
            } while (!arrayList.contains(view3));
            if (view != view3) {
                int indexOf = arrayList.indexOf(view3) + 1;
                if (indexOf == 0 && (view2 = (View) arrayList.get(indexOf)) != null) {
                    int[] iArr = this.f32125u;
                    view3.getLocationOnScreen(iArr);
                    int[] iArr2 = this.v;
                    view2.getLocationOnScreen(iArr2);
                    matrix.preTranslate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                }
                while (indexOf >= 0 && indexOf < arrayList.size()) {
                    View view4 = (View) arrayList.get(indexOf);
                    if (view4 != null) {
                        matrix.preScale(view4.getScaleX(), view4.getScaleY(), view4.getPivotX(), view4.getPivotY());
                        matrix.preRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                        matrix.preTranslate(view4.getX(), view4.getY());
                        indexOf++;
                    }
                }
            }
        }
        if (view != null) {
            matrix.preScale(view.getWidth() / i10, view.getHeight() / i11);
        }
    }

    public w9(s9 s9Var, View view, int i10, boolean z10) {
        this.f32112g = new Paint(3);
        this.h = new Paint(3);
        this.f32115k = new Path();
        this.f32120p = new Matrix();
        this.f32121q = new RectF();
        this.f32122r = false;
        this.f32125u = new int[2];
        this.v = new int[2];
        this.f32108a = s9Var;
        this.f32109b = view;
        this.f32113i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f32110c = colorMatrix;
        if (i10 == 0) {
            org.telegram.messenger.i0.i(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f32112g.setXfermode(new PorterDuffXfermode(mode));
            org.telegram.messenger.i0.i(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f32112g.setXfermode(new PorterDuffXfermode(mode2));
            org.telegram.messenger.i0.h(colorMatrix, 0.4f);
            org.telegram.messenger.i0.i(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            org.telegram.messenger.i0.i(colorMatrix, 0.35f);
            org.telegram.messenger.i0.h(colorMatrix, 0.7f);
            org.telegram.messenger.i0.n2(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            org.telegram.messenger.i0.i(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f32114j = -10329502;
            org.telegram.messenger.i0.i(colorMatrix, 0.6f);
            org.telegram.messenger.i0.h(colorMatrix, 0.3f);
            org.telegram.messenger.i0.n2(colorMatrix, 1.2f);
        } else if (i10 == 6) {
            org.telegram.messenger.i0.i(colorMatrix, 0.4f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.35f);
        } else if (i10 == 7) {
            org.telegram.messenger.i0.i(colorMatrix, 0.5f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.95f);
        } else if (i10 == 8) {
            org.telegram.messenger.i0.h(colorMatrix, -0.15f);
            org.telegram.messenger.i0.i(colorMatrix, 0.47f);
        } else if (i10 == 9) {
            Paint paint3 = this.h;
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode3));
            this.f32112g.setXfermode(new PorterDuffXfermode(mode3));
            org.telegram.messenger.i0.h(colorMatrix, 0.4f);
            org.telegram.messenger.i0.i(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.i0.n2(colorMatrix, this.f32122r ? 0.97f : 0.92f);
            org.telegram.messenger.i0.h(colorMatrix, this.f32122r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f32112g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && s9Var != null) {
            s9Var.d.add(this);
        }
        view.addOnAttachStateChangeListener(new u9(0, this, s9Var));
    }
}
