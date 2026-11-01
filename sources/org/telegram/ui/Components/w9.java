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
    public final s9 f32174a;
    public final View f32175b;
    public final ColorMatrix f32176c;
    public final boolean d;
    public boolean e;
    public float f32177f;
    public Paint f32178g;
    public Paint h;
    public final int f32179i;
    public final Integer f32180j;
    public final Path f32181k;
    public int f32182l;
    public int f32183m;
    public Bitmap f32184n;
    public BitmapShader f32185o;
    public final Matrix f32186p;
    public final RectF f32187q;
    public boolean f32188r;
    public Paint[] f32189s;
    public ValueAnimator f32190t;
    public final int[] f32191u;
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
        s9 s9Var = this.f32174a;
        if (s9Var.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f32180j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i13 = num.intValue();
                } else {
                    i13 = s9Var.f30244i;
                }
                canvas.drawColor(i13);
                return;
            }
            RenderNode renderNode = (RenderNode) s9Var.f30247l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) s9Var.f30246k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = s9Var.f30244i;
                }
                beginRecording.drawColor(i12);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = s9Var.f30244i;
                }
                canvas.drawColor(i11);
                return;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = s9Var.f30244i;
            }
            canvas.drawColor(i10);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f32186p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i14 = this.f32182l;
                    int width = renderNode.getWidth();
                    Path path = this.f32181k;
                    if (i14 != width || this.f32183m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = org.telegram.messenger.i0.P;
                        int width2 = renderNode.getWidth();
                        this.f32182l = width2;
                        int height = renderNode.getHeight();
                        this.f32183m = height;
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
        s9 s9Var = this.f32174a;
        if (s9Var == null || (b10 = s9Var.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f32185o;
        if (bitmapShader == null || this.f32184n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f32184n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f32178g;
                this.f32178g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.f32190t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32190t = null;
                }
                this.f32177f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f32190t = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 6));
                this.f32190t.start();
            }
            this.f32184n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f32185o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f32186p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f32185o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f7 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c10 = c(1.0f);
        boolean z10 = this.e;
        if (z10) {
            paint = this.f32178g;
        } else {
            paint = null;
        }
        if (c10 != null && z10) {
            c10.setAlpha((int) org.telegram.messenger.m5.A(1.0f, this.f32177f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f32189s == null) {
            this.f32189s = new Paint[2];
        }
        Paint[] paintArr = this.f32189s;
        paintArr[0] = paint;
        paintArr[1] = c10;
        return paintArr;
    }

    public final void e(float f7, float f10, float f11, float f12) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = this.f32187q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f32174a.b();
            if (b10 == null) {
                return;
            }
            if (this.f32185o == null || this.f32184n != b10) {
                this.f32184n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f32185o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f32184n.getWidth();
            float height = rectF2.height() / this.f32184n.getHeight();
            Matrix matrix = this.f32186p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f32185o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f32186p;
        matrix.reset();
        s9 s9Var = this.f32174a;
        if (s9Var != null) {
            if (z10) {
                view = s9Var.f30245j;
            } else {
                view = s9Var.f30240b;
            }
        } else {
            view = null;
        }
        if (s9Var != null) {
            ArrayList arrayList = s9Var.f30241c;
            View view3 = this.f32175b;
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
                    int[] iArr = this.f32191u;
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
        this.f32178g = new Paint(3);
        this.h = new Paint(3);
        this.f32181k = new Path();
        this.f32186p = new Matrix();
        this.f32187q = new RectF();
        this.f32188r = false;
        this.f32191u = new int[2];
        this.v = new int[2];
        this.f32174a = s9Var;
        this.f32175b = view;
        this.f32179i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f32176c = colorMatrix;
        if (i10 == 0) {
            org.telegram.messenger.i0.i(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f32178g.setXfermode(new PorterDuffXfermode(mode));
            org.telegram.messenger.i0.i(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f32178g.setXfermode(new PorterDuffXfermode(mode2));
            org.telegram.messenger.i0.h(colorMatrix, 0.4f);
            org.telegram.messenger.i0.i(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            org.telegram.messenger.i0.i(colorMatrix, 0.35f);
            org.telegram.messenger.i0.h(colorMatrix, 0.7f);
            org.telegram.messenger.i0.n2(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            org.telegram.messenger.i0.i(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f32180j = -10329502;
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
            this.f32178g.setXfermode(new PorterDuffXfermode(mode3));
            org.telegram.messenger.i0.h(colorMatrix, 0.4f);
            org.telegram.messenger.i0.i(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.i0.n2(colorMatrix, this.f32188r ? 0.97f : 0.92f);
            org.telegram.messenger.i0.h(colorMatrix, this.f32188r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f32178g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && s9Var != null) {
            s9Var.d.add(this);
        }
        view.addOnAttachStateChangeListener(new u9(0, this, s9Var));
    }
}
