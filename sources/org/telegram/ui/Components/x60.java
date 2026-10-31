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
public final class x60 extends View {
    public final Bitmap f32383a;
    public final Paint f32384b;
    public Bitmap f32385c;
    public final Paint d;
    public final float e;
    public final float f32386f;
    public final int h;
    public final Path f32387n;
    public final RectF f32388r;
    public float f32389s;
    public float f32390w;
    public float f32391x;
    public final z60 f32392y;

    public x60(z60 z60Var, Context context) {
        super(context);
        float f7;
        this.f32392y = z60Var;
        this.f32387n = new Path();
        this.f32388r = new RectF();
        View view = z60Var.f32918f;
        Rect rect = z60Var.f32947z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (z60Var.L) {
                f7 = Math.min(org.telegram.messenger.i0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f32386f = f7;
        } else {
            this.e = 0.0f;
            this.f32386f = 0.0f;
        }
        this.h = i0.b.o(0, z60Var.f32941s);
        if (z60Var.f32942t && (view instanceof org.telegram.ui.Cells.pa) && (z60Var.f32914c instanceof ProfileActivity)) {
            this.f32384b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f32383a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f32384b = null;
            this.f32383a = null;
        }
        if (!z60Var.f32943u && !z60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = z60Var.f32912b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            nl0.d(dVar);
            return;
        }
        int i10 = nl0.O;
        org.telegram.messenger.i0.l2(new vg(11, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        char c10;
        float f10;
        float f11;
        float width;
        int height;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        z60 z60Var = this.f32392y;
        float[] fArr = z60Var.f32934o;
        View view = z60Var.f32918f;
        Rect rect = z60Var.f32947z;
        super.onDraw(canvas);
        if (this.f32385c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f32385c.getWidth(), getHeight() / this.f32385c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f32391x * 255.0f));
            canvas2.drawBitmap(this.f32385c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(this.f32391x, this.h));
        }
        if (z60Var.f32942t) {
            float f14 = this.e;
            Bitmap bitmap = this.f32383a;
            Path path = this.f32387n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (z60Var.f32943u) {
                        f13 = 1.0f - this.f32391x;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (z60Var.L) {
                    z60.A(view, z60Var.f32912b, fArr);
                    canvas2.translate(org.telegram.messenger.i0.T1(fArr[0], this.f32389s, this.f32391x), org.telegram.messenger.i0.T1(fArr[1], this.f32390w, this.f32391x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = z60Var.f32920g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && z60Var.f32920g.getIntrinsicHeight() > 0) {
                        z60Var.f32920g.setBounds((((view.getWidth() + rect.right) - z60Var.f32920g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - z60Var.f32920g.getIntrinsicHeight()) / 2) + (-rect.top), ((z60Var.f32920g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((z60Var.f32920g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        z60Var.f32920g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    z60Var.f32920g.draw(canvas2);
                }
                if (z60Var.f32927k > 0 || z60Var.f32929l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f17 = z60Var.f32927k;
                    rectF.set((this.f32391x * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * z60Var.f32927k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * z60Var.f32927k));
                    float f18 = z60Var.f32929l * this.f32391x;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f32384b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f32386f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (z60Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (z60Var.f32943u) {
                        f11 = 1.0f - this.f32391x;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, org.telegram.messenger.i0.T1((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f32391x), getMeasuredWidth() + rect.right, sc.e.z(1.0f, this.f32391x, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (z60Var.f32943u) {
                        f10 = 1.0f - this.f32391x;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f32391x;
                if (z60Var.L) {
                    z60.A(view, z60Var.f32912b, fArr);
                    canvas2.translate(org.telegram.messenger.i0.T1(fArr[c10], this.f32389s, f24), org.telegram.messenger.i0.T1(fArr[1], this.f32390w, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (z60Var.N != 0 && z60Var.O != 0) {
                    width = org.telegram.messenger.i0.W1(f24, view.getWidth(), z60Var.N);
                    height = org.telegram.messenger.i0.W1(f24, view.getHeight(), z60Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = z60Var.f32920g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && z60Var.f32920g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        z60Var.f32920g.setBounds((((view.getWidth() + rect.right) - z60Var.f32920g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - z60Var.f32920g.getIntrinsicHeight()) / 2) + (-rect.top), ((z60Var.f32920g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((z60Var.f32920g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        z60Var.f32920g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    z60Var.f32920g.setAlpha((int) (this.f32391x * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = z60Var.f32920g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.t6.r1(this.f32391x, z60Var.h));
                        }
                    }
                    z60Var.f32920g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (z60Var.f32927k > 0 || z60Var.f32929l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof y60;
                    RectF rectF2 = this.f32388r;
                    if (z10) {
                        ((y60) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    float f26 = -rect.left;
                    float f27 = z60Var.f32927k * this.f32391x;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = z60Var.f32929l * this.f32391x;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.s7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.s7) view).a(canvas2, width, f25, this.f32391x);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f32391x * f7), 31);
                        float T1 = org.telegram.messenger.i0.T1(f12, 0.9f, this.f32391x);
                        canvas2.scale(T1, T1, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.s7) view).a(canvas2, f30, f25, this.f32391x);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof ph.c1) && z60Var.N != 0 && z60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((ph.c1) view).b(this, canvas2, width, f25, this.f32391x);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f32391x * f7), 31);
                            float T12 = org.telegram.messenger.i0.T1(1.0f, 0.9f, this.f32391x);
                            canvas.scale(T12, T12, width / 2.0f, f25 / 2.0f);
                            ((ph.c1) view).b(this, canvas, width, f25, this.f32391x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (z60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f32391x * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof y60) {
                            ((y60) view).b(canvas2, this.f32391x);
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
        z60 z60Var = this.f32392y;
        yg.d.c(z60Var.f32932n, this);
        ViewGroup viewGroup = z60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f32391x == f7) {
            return;
        }
        this.f32391x = f7;
        invalidate();
    }
}
