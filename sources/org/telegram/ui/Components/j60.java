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
public final class j60 extends View {
    public final Bitmap f34939a;
    public final Paint f34940b;
    public Bitmap f34941c;
    public final Paint d;
    public final float f34942e;
    public final float f34943f;
    public final int h;
    public final Path f34944n;
    public final RectF f34945r;
    public float f34946s;
    public float f34947w;
    public float f34948x;
    public final l60 f34949y;

    public j60(l60 l60Var, Context context) {
        super(context);
        float f10;
        this.f34949y = l60Var;
        this.f34944n = new Path();
        this.f34945r = new RectF();
        View view = l60Var.f35594f;
        Rect rect = l60Var.f35623z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f34942e = view.getY() + ((View) view.getParent()).getY();
            if (l60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f34943f = f10;
        } else {
            this.f34942e = 0.0f;
            this.f34943f = 0.0f;
        }
        this.h = i0.a.o(0, l60Var.f35617s);
        if (l60Var.f35618t && (view instanceof org.telegram.ui.Cells.pa) && (l60Var.f35589c instanceof ProfileActivity)) {
            this.f34940b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f34939a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f34940b = null;
            this.f34939a = null;
        }
        if (!l60Var.f35619u && !l60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = l60Var.f35587b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            kk0.d(dVar);
            return;
        }
        int i7 = kk0.O;
        org.telegram.messenger.g0.l2(new fx(3, viewGroup, dVar), 15.0f);
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
        l60 l60Var = this.f34949y;
        float[] fArr = l60Var.f35610o;
        View view = l60Var.f35594f;
        Rect rect = l60Var.f35623z;
        super.onDraw(canvas);
        if (this.f34941c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f34941c.getWidth(), getHeight() / this.f34941c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f34948x * 255.0f));
            canvas2.drawBitmap(this.f34941c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.l6.r1(this.f34948x, this.h));
        }
        if (l60Var.f35618t) {
            float f15 = this.f34942e;
            Bitmap bitmap = this.f34939a;
            Path path = this.f34944n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (l60Var.f35619u) {
                        f14 = 1.0f - this.f34948x;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (l60Var.L) {
                    l60.A(view, l60Var.f35587b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.f34946s, this.f34948x), org.telegram.messenger.g0.T1(fArr[1], this.f34947w, this.f34948x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = l60Var.f35596g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && l60Var.f35596g.getIntrinsicHeight() > 0) {
                        l60Var.f35596g.setBounds((((view.getWidth() + rect.right) - l60Var.f35596g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - l60Var.f35596g.getIntrinsicHeight()) / 2) + (-rect.top), ((l60Var.f35596g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((l60Var.f35596g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        l60Var.f35596g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    l60Var.f35596g.draw(canvas2);
                }
                if (l60Var.f35603k > 0 || l60Var.f35605l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f18 = l60Var.f35603k;
                    rectF.set((this.f34948x * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * l60Var.f35603k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * l60Var.f35603k));
                    float f19 = l60Var.f35605l * this.f34948x;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f34940b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i7 = (f15 > 1.0f ? 1 : (f15 == 1.0f ? 0 : -1));
                float f20 = this.f34943f;
                if (i7 >= 0 && f20 == 0.0f) {
                    f10 = 255.0f;
                    c10 = 0;
                } else if (l60Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (l60Var.f35619u) {
                        f12 = 1.0f - this.f34948x;
                    } else {
                        f12 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f21, org.telegram.messenger.g0.T1((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f34948x), getMeasuredWidth() + rect.right, com.google.android.recaptcha.internal.a.v(1.0f, this.f34948x, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (l60Var.f35619u) {
                        f11 = 1.0f - this.f34948x;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f34948x;
                if (l60Var.L) {
                    l60.A(view, l60Var.f35587b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[c10], this.f34946s, f25), org.telegram.messenger.g0.T1(fArr[1], this.f34947w, f25));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (l60Var.N != 0 && l60Var.O != 0) {
                    width = org.telegram.messenger.g0.W1(f25, view.getWidth(), l60Var.N);
                    height = org.telegram.messenger.g0.W1(f25, view.getHeight(), l60Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = l60Var.f35596g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && l60Var.f35596g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        l60Var.f35596g.setBounds((((view.getWidth() + rect.right) - l60Var.f35596g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - l60Var.f35596g.getIntrinsicHeight()) / 2) + (-rect.top), ((l60Var.f35596g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((l60Var.f35596g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        l60Var.f35596g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    l60Var.f35596g.setAlpha((int) (this.f34948x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = l60Var.f35596g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.l6.r1(this.f34948x, l60Var.h));
                        }
                    }
                    l60Var.f35596g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (l60Var.f35603k > 0 || l60Var.f35605l > 0) {
                    path.rewind();
                    boolean z9 = view instanceof k60;
                    RectF rectF2 = this.f34945r;
                    if (z9) {
                        ((k60) view).g(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f27 = -rect.left;
                    float f28 = l60Var.f35603k * this.f34948x;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = l60Var.f35605l * this.f34948x;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.o7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.o7) view).a(canvas2, width, f26, this.f34948x);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f34948x * f10), 31);
                        float T1 = org.telegram.messenger.g0.T1(f13, 0.9f, this.f34948x);
                        canvas2.scale(T1, T1, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.o7) view).a(canvas2, f31, f26, this.f34948x);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof zh.y0) && l60Var.N != 0 && l60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((zh.y0) view).b(this, canvas2, width, f26, this.f34948x);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f34948x * f10), 31);
                            float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.f34948x);
                            canvas.scale(T12, T12, width / 2.0f, f26 / 2.0f);
                            ((zh.y0) view).b(this, canvas, width, f26, this.f34948x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (l60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f34948x * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof k60) {
                            ((k60) view).h(canvas2, this.f34948x);
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
        l60 l60Var = this.f34949y;
        ih.d.c(l60Var.f35608n, this);
        ViewGroup viewGroup = l60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f34948x == f10) {
            return;
        }
        this.f34948x = f10;
        invalidate();
    }
}
