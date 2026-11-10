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
import org.telegram.ui.ProfileActivity;
public final class i60 extends View {
    public final Bitmap f34548a;
    public final Paint f34549b;
    public Bitmap f34550c;
    public final Paint d;
    public final float f34551e;
    public final float f34552f;
    public final int h;
    public final Path f34553n;
    public final RectF f34554r;
    public float f34555s;
    public float f34556w;
    public float f34557x;
    public final k60 f34558y;

    public i60(k60 k60Var, Context context) {
        super(context);
        float f10;
        this.f34558y = k60Var;
        this.f34553n = new Path();
        this.f34554r = new RectF();
        View view = k60Var.f35196f;
        Rect rect = k60Var.f35225z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f34551e = view.getY() + ((View) view.getParent()).getY();
            if (k60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f34552f = f10;
        } else {
            this.f34551e = 0.0f;
            this.f34552f = 0.0f;
        }
        this.h = i0.a.o(0, k60Var.f35219s);
        if (k60Var.f35220t && (view instanceof org.telegram.ui.Cells.pa) && (k60Var.f35191c instanceof ProfileActivity)) {
            this.f34549b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f34548a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f34549b = null;
            this.f34548a = null;
        }
        if (!k60Var.f35221u && !k60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = k60Var.f35189b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            jk0.d(dVar);
            return;
        }
        int i7 = jk0.O;
        org.telegram.messenger.g0.l2(new ex(3, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c10;
        float f11;
        float f12;
        float width;
        int height;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        k60 k60Var = this.f34558y;
        float[] fArr = k60Var.f35212o;
        View view = k60Var.f35196f;
        Rect rect = k60Var.f35225z;
        super.onDraw(canvas);
        if (this.f34550c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f34550c.getWidth(), getHeight() / this.f34550c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f34557x * 255.0f));
            canvas2.drawBitmap(this.f34550c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(this.f34557x, this.h));
        }
        if (k60Var.f35220t) {
            float f15 = this.f34551e;
            Bitmap bitmap = this.f34548a;
            Path path = this.f34553n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (k60Var.f35221u) {
                        f14 = 1.0f - this.f34557x;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (k60Var.L) {
                    k60.A(view, k60Var.f35189b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.f34555s, this.f34557x), org.telegram.messenger.g0.T1(fArr[1], this.f34556w, this.f34557x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = k60Var.f35198g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && k60Var.f35198g.getIntrinsicHeight() > 0) {
                        k60Var.f35198g.setBounds((((view.getWidth() + rect.right) - k60Var.f35198g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - k60Var.f35198g.getIntrinsicHeight()) / 2) + (-rect.top), ((k60Var.f35198g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((k60Var.f35198g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        k60Var.f35198g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    k60Var.f35198g.draw(canvas2);
                }
                if (k60Var.f35205k > 0 || k60Var.f35207l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f18 = k60Var.f35205k;
                    rectF.set((this.f34557x * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * k60Var.f35205k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * k60Var.f35205k));
                    float f19 = k60Var.f35207l * this.f34557x;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f34549b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i7 = (f15 > 1.0f ? 1 : (f15 == 1.0f ? 0 : -1));
                float f20 = this.f34552f;
                if (i7 >= 0 && f20 == 0.0f) {
                    f10 = 255.0f;
                    c10 = 0;
                } else if (k60Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (k60Var.f35221u) {
                        f12 = 1.0f - this.f34557x;
                    } else {
                        f12 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f21, org.telegram.messenger.g0.T1((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f34557x), getMeasuredWidth() + rect.right, com.google.android.recaptcha.internal.a.v(1.0f, this.f34557x, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (k60Var.f35221u) {
                        f11 = 1.0f - this.f34557x;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f34557x;
                if (k60Var.L) {
                    k60.A(view, k60Var.f35189b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[c10], this.f34555s, f25), org.telegram.messenger.g0.T1(fArr[1], this.f34556w, f25));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (k60Var.N != 0 && k60Var.O != 0) {
                    width = org.telegram.messenger.g0.W1(f25, view.getWidth(), k60Var.N);
                    height = org.telegram.messenger.g0.W1(f25, view.getHeight(), k60Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = k60Var.f35198g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && k60Var.f35198g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        k60Var.f35198g.setBounds((((view.getWidth() + rect.right) - k60Var.f35198g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - k60Var.f35198g.getIntrinsicHeight()) / 2) + (-rect.top), ((k60Var.f35198g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((k60Var.f35198g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        k60Var.f35198g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    k60Var.f35198g.setAlpha((int) (this.f34557x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = k60Var.f35198g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.m6.r1(this.f34557x, k60Var.h));
                        }
                    }
                    k60Var.f35198g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (k60Var.f35205k > 0 || k60Var.f35207l > 0) {
                    path.rewind();
                    boolean z9 = view instanceof j60;
                    RectF rectF2 = this.f34554r;
                    if (z9) {
                        ((j60) view).g(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f27 = -rect.left;
                    float f28 = k60Var.f35205k * this.f34557x;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = k60Var.f35207l * this.f34557x;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.o7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.o7) view).a(canvas2, width, f26, this.f34557x);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f34557x * f10), 31);
                        float T1 = org.telegram.messenger.g0.T1(f13, 0.9f, this.f34557x);
                        canvas2.scale(T1, T1, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.o7) view).a(canvas2, f31, f26, this.f34557x);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof zh.y0) && k60Var.N != 0 && k60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((zh.y0) view).b(this, canvas2, width, f26, this.f34557x);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f34557x * f10), 31);
                            float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.f34557x);
                            canvas.scale(T12, T12, width / 2.0f, f26 / 2.0f);
                            ((zh.y0) view).b(this, canvas, width, f26, this.f34557x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (k60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f34557x * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof j60) {
                            ((j60) view).h(canvas2, this.f34557x);
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
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k60 k60Var = this.f34558y;
        ih.d.c(k60Var.f35210n, this);
        ViewGroup viewGroup = k60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f34557x == f10) {
            return;
        }
        this.f34557x = f10;
        invalidate();
    }
}
