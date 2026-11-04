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
public final class ba {
    public final x9 f32124a;
    public final View f32125b;
    public final ColorMatrix f32126c;
    public final boolean d;
    public boolean f32127e;
    public float f32128f;
    public Paint f32129g;
    public Paint h;
    public final int f32130i;
    public final Integer f32131j;
    public final Path f32132k;
    public int f32133l;
    public int f32134m;
    public Bitmap f32135n;
    public BitmapShader f32136o;
    public final Matrix f32137p;
    public final RectF f32138q;
    public boolean f32139r;
    public Paint[] f32140s;
    public ValueAnimator f32141t;
    public final int[] f32142u;
    public final int[] v;

    public ba(x9 x9Var, View view) {
        this(x9Var, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        x9 x9Var = this.f32124a;
        if (x9Var.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f32131j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = x9Var.f40277i;
                }
                canvas.drawColor(i12);
                return;
            }
            RenderNode renderNode = (RenderNode) x9Var.f40280l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) x9Var.f40279k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = x9Var.f40277i;
                }
                beginRecording.drawColor(i11);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = x9Var.f40277i;
                }
                canvas.drawColor(i10);
                return;
            }
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = x9Var.f40277i;
            }
            canvas.drawColor(i3);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f32137p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i13 = this.f32133l;
                    int width = renderNode.getWidth();
                    Path path = this.f32132k;
                    if (i13 != width || this.f32134m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = org.telegram.messenger.g0.P;
                        int width2 = renderNode.getWidth();
                        this.f32133l = width2;
                        int height = renderNode.getHeight();
                        this.f32134m = height;
                        rectF.set(0.0f, 0.0f, width2, height);
                        path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                    }
                    canvas.clipPath(path);
                }
                canvas.drawRenderNode(renderNode);
                canvas.restore();
                return;
            }
            return;
        }
        Paint c2 = c(1.0f);
        if (c2 != null) {
            canvas.drawPaint(c2);
        }
    }

    public final Paint c(float f10) {
        Bitmap b10;
        Bitmap bitmap;
        x9 x9Var = this.f32124a;
        if (x9Var == null || (b10 = x9Var.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f32136o;
        if (bitmapShader == null || this.f32135n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f32135n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f32129g;
                this.f32129g = paint;
                this.f32127e = true;
                ValueAnimator valueAnimator = this.f32141t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32141t = null;
                }
                this.f32128f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f32141t = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 6));
                this.f32141t.start();
            }
            this.f32135n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f32136o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f32137p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f32136o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f10 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c2 = c(1.0f);
        boolean z10 = this.f32127e;
        if (z10) {
            paint = this.f32129g;
        } else {
            paint = null;
        }
        if (c2 != null && z10) {
            c2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f32128f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f32140s == null) {
            this.f32140s = new Paint[2];
        }
        Paint[] paintArr = this.f32140s;
        paintArr[0] = paint;
        paintArr[1] = c2;
        return paintArr;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = this.f32138q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f32124a.b();
            if (b10 == null) {
                return;
            }
            if (this.f32136o == null || this.f32135n != b10) {
                this.f32135n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f32136o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f32135n.getWidth();
            float height = rectF2.height() / this.f32135n.getHeight();
            Matrix matrix = this.f32137p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f32136o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i3, int i10, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f32137p;
        matrix.reset();
        x9 x9Var = this.f32124a;
        if (x9Var != null) {
            if (z10) {
                view = x9Var.f40278j;
            } else {
                view = x9Var.f40272b;
            }
        } else {
            view = null;
        }
        if (x9Var != null) {
            ArrayList arrayList = x9Var.f40273c;
            View view3 = this.f32125b;
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
                    int[] iArr = this.f32142u;
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
            matrix.preScale(view.getWidth() / i3, view.getHeight() / i10);
        }
    }

    public ba(x9 x9Var, View view, int i3, boolean z10) {
        this.f32129g = new Paint(3);
        this.h = new Paint(3);
        this.f32132k = new Path();
        this.f32137p = new Matrix();
        this.f32138q = new RectF();
        this.f32139r = false;
        this.f32142u = new int[2];
        this.v = new int[2];
        this.f32124a = x9Var;
        this.f32125b = view;
        this.f32130i = i3;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f32126c = colorMatrix;
        if (i3 == 0) {
            org.telegram.messenger.g0.i(colorMatrix, 0.45f);
        } else if (i3 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f32129g.setXfermode(new PorterDuffXfermode(mode));
            org.telegram.messenger.g0.i(colorMatrix, 0.3f);
        } else if (i3 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f32129g.setXfermode(new PorterDuffXfermode(mode2));
            org.telegram.messenger.g0.h(colorMatrix, 0.4f);
            org.telegram.messenger.g0.i(colorMatrix, 0.3f);
        } else if (i3 == 1) {
            org.telegram.messenger.g0.i(colorMatrix, 0.35f);
            org.telegram.messenger.g0.h(colorMatrix, 0.7f);
            org.telegram.messenger.g0.n2(colorMatrix, 1.5f);
        } else if (i3 == 3) {
            org.telegram.messenger.g0.i(colorMatrix, 0.5f);
        } else if (i3 == 4) {
            this.f32131j = -10329502;
            org.telegram.messenger.g0.i(colorMatrix, 0.6f);
            org.telegram.messenger.g0.h(colorMatrix, 0.3f);
            org.telegram.messenger.g0.n2(colorMatrix, 1.2f);
        } else if (i3 == 6) {
            org.telegram.messenger.g0.i(colorMatrix, 0.4f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.35f);
        } else if (i3 == 7) {
            org.telegram.messenger.g0.i(colorMatrix, 0.5f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.95f);
        } else if (i3 == 8) {
            org.telegram.messenger.g0.h(colorMatrix, -0.15f);
            org.telegram.messenger.g0.i(colorMatrix, 0.47f);
        } else if (i3 == 9) {
            Paint paint3 = this.h;
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode3));
            this.f32129g.setXfermode(new PorterDuffXfermode(mode3));
            org.telegram.messenger.g0.h(colorMatrix, 0.4f);
            org.telegram.messenger.g0.i(colorMatrix, 0.45f);
        } else if (i3 == 10) {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix, this.f32139r ? 0.97f : 0.92f);
            org.telegram.messenger.g0.h(colorMatrix, this.f32139r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f32129g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && x9Var != null) {
            x9Var.d.add(this);
        }
        view.addOnAttachStateChangeListener(new z9(0, this, x9Var));
    }
}
