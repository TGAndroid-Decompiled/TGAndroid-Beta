package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class m70 extends View {
    public final Bitmap f26961a;
    public final Paint f26962b;
    public Bitmap f26963c;
    public final Paint d;
    public final float e;
    public final float f26964f;
    public final int h;
    public final Path f26965n;
    public final RectF f26966r;
    public float f26967s;
    public float v;
    public float f26968w;
    public final o70 f26969x;

    public m70(o70 o70Var, Context context) {
        super(context);
        float f10;
        this.f26969x = o70Var;
        this.f26965n = new Path();
        this.f26966r = new RectF();
        View view = o70Var.f27466f;
        Rect rect = o70Var.f27495z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (o70Var.L) {
                f10 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f26964f = f10;
        } else {
            this.e = 0.0f;
            this.f26964f = 0.0f;
        }
        this.h = i0.a.k(0, o70Var.f27489s);
        if (o70Var.f27490t && (view instanceof org.telegram.ui.Cells.va) && (o70Var.f27462c instanceof ProfileActivity)) {
            this.f26962b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f26961a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f26962b = null;
            this.f26961a = null;
        }
        if (!o70Var.f27491u && !o70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = o70Var.f27460b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            im0.d(dVar);
            return;
        }
        int i10 = im0.L;
        AndroidUtilities.makeGlobalBlurBitmap(new vk(7, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c3;
        float f11;
        float f12;
        float width;
        int height;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        o70 o70Var = this.f26969x;
        float[] fArr = o70Var.f27482o;
        View view = o70Var.f27466f;
        Rect rect = o70Var.f27495z;
        super.onDraw(canvas);
        if (this.f26963c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f26963c.getWidth(), getHeight() / this.f26963c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f26968w * 255.0f));
            canvas2.drawBitmap(this.f26963c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.f26968w, this.h));
        }
        if (o70Var.f27490t) {
            float f15 = this.e;
            Bitmap bitmap = this.f26961a;
            Path path = this.f26965n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (o70Var.f27491u) {
                        f14 = 1.0f - this.f26968w;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (o70Var.L) {
                    o70.A(view, o70Var.f27460b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f26967s, this.f26968w), AndroidUtilities.lerp(fArr[1], this.v, this.f26968w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = o70Var.f27468g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && o70Var.f27468g.getIntrinsicHeight() > 0) {
                        o70Var.f27468g.setBounds((((view.getWidth() + rect.right) - o70Var.f27468g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - o70Var.f27468g.getIntrinsicHeight()) / 2) + (-rect.top), ((o70Var.f27468g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((o70Var.f27468g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        o70Var.f27468g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    o70Var.f27468g.draw(canvas2);
                }
                if (o70Var.f27475k > 0 || o70Var.f27477l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = o70Var.f27475k;
                    rectF.set((this.f26968w * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * o70Var.f27475k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * o70Var.f27475k));
                    float f19 = o70Var.f27477l * this.f26968w;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f26962b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f20 = this.f26964f;
                if (f15 >= 1.0f && f20 == 0.0f) {
                    f10 = 255.0f;
                    c3 = 0;
                } else if (o70Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (o70Var.f27491u) {
                        f12 = 1.0f - this.f26968w;
                    } else {
                        f12 = 1.0f;
                    }
                    c3 = 0;
                    canvas2.clipRect(f21, AndroidUtilities.lerp((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f26968w), getMeasuredWidth() + rect.right, org.telegram.ui.yh.c(1.0f, this.f26968w, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c3 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (o70Var.f27491u) {
                        f11 = 1.0f - this.f26968w;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f26968w;
                if (o70Var.L) {
                    o70.A(view, o70Var.f27460b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c3], this.f26967s, f25), AndroidUtilities.lerp(fArr[1], this.v, f25));
                } else {
                    canvas2.translate(fArr[c3], fArr[1]);
                }
                if (o70Var.N != 0 && o70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), o70Var.N, f25);
                    height = AndroidUtilities.lerp(view.getHeight(), o70Var.O, f25);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = o70Var.f27468g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && o70Var.f27468g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        o70Var.f27468g.setBounds((((view.getWidth() + rect.right) - o70Var.f27468g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - o70Var.f27468g.getIntrinsicHeight()) / 2) + (-rect.top), ((o70Var.f27468g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((o70Var.f27468g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        o70Var.f27468g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    o70Var.f27468g.setAlpha((int) (this.f26968w * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = o70Var.f27468g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.f26968w, o70Var.h));
                        }
                    }
                    o70Var.f27468g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (o70Var.f27475k > 0 || o70Var.f27477l > 0) {
                    path.rewind();
                    boolean z4 = view instanceof n70;
                    RectF rectF2 = this.f26966r;
                    if (z4) {
                        ((n70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f27 = -rect.left;
                    float f28 = o70Var.f27475k * this.f26968w;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = o70Var.f27477l * this.f26968w;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.r7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.r7) view).a(canvas2, width, f26, this.f26968w);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f26968w * f10), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f26968w);
                        canvas2.scale(lerp, lerp, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.r7) view).a(canvas2, f31, f26, this.f26968w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof kh.x1) && o70Var.N != 0 && o70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((kh.x1) view).a(this, canvas2, width, f26, this.f26968w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f26968w * f10), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f26968w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f26 / 2.0f);
                            ((kh.x1) view).a(this, canvas, width, f26, this.f26968w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (o70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f26968w * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof n70) {
                            ((n70) view).b(canvas2, this.f26968w);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        o70 o70Var = this.f26969x;
        tg.c.c(o70Var.f27480n, this);
        ViewGroup viewGroup = o70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f26968w == f10) {
            return;
        }
        this.f26968w = f10;
        invalidate();
    }
}
