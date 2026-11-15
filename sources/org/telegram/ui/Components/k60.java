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
public final class k60 extends View {
    public final Bitmap f36303a;
    public final Paint f36304b;
    public Bitmap f36305c;
    public final Paint d;
    public final float f36306e;
    public final float f36307f;
    public final int h;
    public final Path f36308n;
    public final RectF f36309r;
    public float f36310s;
    public float f36311w;
    public float f36312x;
    public final m60 f36313y;

    public k60(m60 m60Var, Context context) {
        super(context);
        float f10;
        this.f36313y = m60Var;
        this.f36308n = new Path();
        this.f36309r = new RectF();
        View view = m60Var.f37088f;
        Rect rect = m60Var.f37117z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f36306e = view.getY() + ((View) view.getParent()).getY();
            if (m60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f36307f = f10;
        } else {
            this.f36306e = 0.0f;
            this.f36307f = 0.0f;
        }
        this.h = i0.a.o(0, m60Var.f37111s);
        if (m60Var.f37112t && (view instanceof org.telegram.ui.Cells.pa) && (m60Var.f37083c instanceof ProfileActivity)) {
            this.f36304b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f36303a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f36304b = null;
            this.f36303a = null;
        }
        if (!m60Var.f37113u && !m60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = m60Var.f37081b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            ok0.d(dVar);
            return;
        }
        int i7 = ok0.P;
        org.telegram.messenger.g0.l2(new gh(8, viewGroup, dVar), 15.0f);
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
        m60 m60Var = this.f36313y;
        float[] fArr = m60Var.f37104o;
        View view = m60Var.f37088f;
        Rect rect = m60Var.f37117z;
        super.onDraw(canvas);
        if (this.f36305c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f36305c.getWidth(), getHeight() / this.f36305c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f36312x * 255.0f));
            canvas2.drawBitmap(this.f36305c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(this.f36312x, this.h));
        }
        if (m60Var.f37112t) {
            float f15 = this.f36306e;
            Bitmap bitmap = this.f36303a;
            Path path = this.f36308n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (m60Var.f37113u) {
                        f14 = 1.0f - this.f36312x;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (m60Var.L) {
                    m60.A(view, m60Var.f37081b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.f36310s, this.f36312x), org.telegram.messenger.g0.T1(fArr[1], this.f36311w, this.f36312x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = m60Var.f37090g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && m60Var.f37090g.getIntrinsicHeight() > 0) {
                        m60Var.f37090g.setBounds((((view.getWidth() + rect.right) - m60Var.f37090g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - m60Var.f37090g.getIntrinsicHeight()) / 2) + (-rect.top), ((m60Var.f37090g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((m60Var.f37090g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        m60Var.f37090g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    m60Var.f37090g.draw(canvas2);
                }
                if (m60Var.f37097k > 0 || m60Var.f37099l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f18 = m60Var.f37097k;
                    rectF.set((this.f36312x * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * m60Var.f37097k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * m60Var.f37097k));
                    float f19 = m60Var.f37099l * this.f36312x;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f36304b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i7 = (f15 > 1.0f ? 1 : (f15 == 1.0f ? 0 : -1));
                float f20 = this.f36307f;
                if (i7 >= 0 && f20 == 0.0f) {
                    f10 = 255.0f;
                    c10 = 0;
                } else if (m60Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (m60Var.f37113u) {
                        f12 = 1.0f - this.f36312x;
                    } else {
                        f12 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f21, org.telegram.messenger.g0.T1((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f36312x), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.t(1.0f, this.f36312x, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (m60Var.f37113u) {
                        f11 = 1.0f - this.f36312x;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f36312x;
                if (m60Var.L) {
                    m60.A(view, m60Var.f37081b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[c10], this.f36310s, f25), org.telegram.messenger.g0.T1(fArr[1], this.f36311w, f25));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (m60Var.N != 0 && m60Var.O != 0) {
                    width = org.telegram.messenger.g0.W1(f25, view.getWidth(), m60Var.N);
                    height = org.telegram.messenger.g0.W1(f25, view.getHeight(), m60Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = m60Var.f37090g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && m60Var.f37090g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        m60Var.f37090g.setBounds((((view.getWidth() + rect.right) - m60Var.f37090g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - m60Var.f37090g.getIntrinsicHeight()) / 2) + (-rect.top), ((m60Var.f37090g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((m60Var.f37090g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        m60Var.f37090g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    m60Var.f37090g.setAlpha((int) (this.f36312x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = m60Var.f37090g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.r1(this.f36312x, m60Var.h));
                        }
                    }
                    m60Var.f37090g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (m60Var.f37097k > 0 || m60Var.f37099l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof l60;
                    RectF rectF2 = this.f36309r;
                    if (z10) {
                        ((l60) view).f(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f27 = -rect.left;
                    float f28 = m60Var.f37097k * this.f36312x;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = m60Var.f37099l * this.f36312x;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.n7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.n7) view).a(canvas2, width, f26, this.f36312x);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f36312x * f10), 31);
                        float T1 = org.telegram.messenger.g0.T1(f13, 0.9f, this.f36312x);
                        canvas2.scale(T1, T1, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.n7) view).a(canvas2, f31, f26, this.f36312x);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof bi.i2) && m60Var.N != 0 && m60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((bi.i2) view).b(this, canvas2, width, f26, this.f36312x);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f36312x * f10), 31);
                            float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.f36312x);
                            canvas.scale(T12, T12, width / 2.0f, f26 / 2.0f);
                            ((bi.i2) view).b(this, canvas, width, f26, this.f36312x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (m60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f36312x * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof l60) {
                            ((l60) view).h(canvas2, this.f36312x);
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
        m60 m60Var = this.f36313y;
        ih.d.c(m60Var.f37102n, this);
        ViewGroup viewGroup = m60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f36312x == f10) {
            return;
        }
        this.f36312x = f10;
        invalidate();
    }
}
