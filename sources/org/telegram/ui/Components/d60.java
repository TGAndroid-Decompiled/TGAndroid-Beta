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
public final class d60 extends View {
    public final Bitmap f32959a;
    public final Paint f32960b;
    public Bitmap f32961c;
    public final Paint d;
    public final float f32962e;
    public final float f32963f;
    public final int h;
    public final Path f32964n;
    public final RectF f32965r;
    public float f32966s;
    public float f32967w;
    public float f32968x;
    public final f60 f32969y;

    public d60(f60 f60Var, Context context) {
        super(context);
        float f10;
        this.f32969y = f60Var;
        this.f32964n = new Path();
        this.f32965r = new RectF();
        View view = f60Var.f33724f;
        Rect rect = f60Var.f33753z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f32962e = view.getY() + ((View) view.getParent()).getY();
            if (f60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f32963f = f10;
        } else {
            this.f32962e = 0.0f;
            this.f32963f = 0.0f;
        }
        this.h = i0.a.o(0, f60Var.f33747s);
        if (f60Var.f33748t && (view instanceof org.telegram.ui.Cells.pa) && (f60Var.f33719c instanceof ProfileActivity)) {
            this.f32960b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f32959a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f32960b = null;
            this.f32959a = null;
        }
        if (!f60Var.f33749u && !f60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = f60Var.f33717b;
        e eVar = new e(this, 17);
        if (viewGroup == null) {
            nk0.d(eVar);
            return;
        }
        int i3 = nk0.P;
        org.telegram.messenger.g0.l2(new ei(7, viewGroup, eVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c2;
        float f11;
        float f12;
        float width;
        int height;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        f60 f60Var = this.f32969y;
        float[] fArr = f60Var.f33740o;
        View view = f60Var.f33724f;
        Rect rect = f60Var.f33753z;
        super.onDraw(canvas);
        if (this.f32961c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f32961c.getWidth(), getHeight() / this.f32961c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f32968x * 255.0f));
            canvas2.drawBitmap(this.f32961c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(this.f32968x, this.h));
        }
        if (f60Var.f33748t) {
            float f15 = this.f32962e;
            Bitmap bitmap = this.f32959a;
            Path path = this.f32964n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (f60Var.f33749u) {
                        f14 = 1.0f - this.f32968x;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (f60Var.L) {
                    f60.A(view, f60Var.f33717b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.f32966s, this.f32968x), org.telegram.messenger.g0.T1(fArr[1], this.f32967w, this.f32968x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = f60Var.f33726g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && f60Var.f33726g.getIntrinsicHeight() > 0) {
                        f60Var.f33726g.setBounds((((view.getWidth() + rect.right) - f60Var.f33726g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - f60Var.f33726g.getIntrinsicHeight()) / 2) + (-rect.top), ((f60Var.f33726g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((f60Var.f33726g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f60Var.f33726g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    f60Var.f33726g.draw(canvas2);
                }
                if (f60Var.f33733k > 0 || f60Var.f33735l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f18 = f60Var.f33733k;
                    rectF.set((this.f32968x * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * f60Var.f33733k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * f60Var.f33733k));
                    float f19 = f60Var.f33735l * this.f32968x;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f32960b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i3 = (f15 > 1.0f ? 1 : (f15 == 1.0f ? 0 : -1));
                float f20 = this.f32963f;
                if (i3 >= 0 && f20 == 0.0f) {
                    f10 = 255.0f;
                    c2 = 0;
                } else if (f60Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (f60Var.f33749u) {
                        f12 = 1.0f - this.f32968x;
                    } else {
                        f12 = 1.0f;
                    }
                    c2 = 0;
                    canvas2.clipRect(f21, org.telegram.messenger.g0.T1((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f32968x), getMeasuredWidth() + rect.right, a1.g.D(1.0f, this.f32968x, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c2 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (f60Var.f33749u) {
                        f11 = 1.0f - this.f32968x;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f32968x;
                if (f60Var.L) {
                    f60.A(view, f60Var.f33717b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[c2], this.f32966s, f25), org.telegram.messenger.g0.T1(fArr[1], this.f32967w, f25));
                } else {
                    canvas2.translate(fArr[c2], fArr[1]);
                }
                if (f60Var.N != 0 && f60Var.O != 0) {
                    width = org.telegram.messenger.g0.W1(f25, view.getWidth(), f60Var.N);
                    height = org.telegram.messenger.g0.W1(f25, view.getHeight(), f60Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = f60Var.f33726g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && f60Var.f33726g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        f60Var.f33726g.setBounds((((view.getWidth() + rect.right) - f60Var.f33726g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - f60Var.f33726g.getIntrinsicHeight()) / 2) + (-rect.top), ((f60Var.f33726g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((f60Var.f33726g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        f60Var.f33726g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    f60Var.f33726g.setAlpha((int) (this.f32968x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = f60Var.f33726g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.k6.r1(this.f32968x, f60Var.h));
                        }
                    }
                    f60Var.f33726g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (f60Var.f33733k > 0 || f60Var.f33735l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof e60;
                    RectF rectF2 = this.f32965r;
                    if (z10) {
                        ((e60) view).g(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f27 = -rect.left;
                    float f28 = f60Var.f33733k * this.f32968x;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = f60Var.f33735l * this.f32968x;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.n7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.n7) view).a(canvas2, width, f26, this.f32968x);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f32968x * f10), 31);
                        float T1 = org.telegram.messenger.g0.T1(f13, 0.9f, this.f32968x);
                        canvas2.scale(T1, T1, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.n7) view).a(canvas2, f31, f26, this.f32968x);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof ai.q2) && f60Var.N != 0 && f60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((ai.q2) view).b(this, canvas2, width, f26, this.f32968x);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f32968x * f10), 31);
                            float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.f32968x);
                            canvas.scale(T12, T12, width / 2.0f, f26 / 2.0f);
                            ((ai.q2) view).b(this, canvas, width, f26, this.f32968x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (f60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f32968x * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof e60) {
                            ((e60) view).h(canvas2, this.f32968x);
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
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        f60 f60Var = this.f32969y;
        jh.d.c(f60Var.f33738n, this);
        ViewGroup viewGroup = f60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f32968x == f10) {
            return;
        }
        this.f32968x = f10;
        invalidate();
    }
}
