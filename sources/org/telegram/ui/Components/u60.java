package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;
public final class u60 extends View {
    public final int[] E;
    public final int[] F;
    public final y60 G;
    public final Bitmap f40220a;
    public final Paint f40221b;
    public Bitmap f40222c;
    public final Paint d;
    public final float f40223e;
    public final float f40224f;
    public final int h;
    public final Path f40225n;
    public final RectF f40226r;
    public float f40227s;
    public float f40228w;
    public float f40229x;
    public final Path f40230y;

    public u60(y60 y60Var, Context context) {
        super(context);
        float f10;
        this.G = y60Var;
        this.f40225n = new Path();
        this.f40226r = new RectF();
        this.f40230y = new Path();
        this.E = new int[2];
        this.F = new int[2];
        View view = y60Var.f42351f;
        Rect rect = y60Var.f42383z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f40223e = view.getY() + ((View) view.getParent()).getY();
            if (y60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f40224f = f10;
        } else {
            this.f40223e = 0.0f;
            this.f40224f = 0.0f;
        }
        this.h = i0.a.o(0, y60Var.f42375s);
        if (y60Var.f42377t && (view instanceof org.telegram.ui.Cells.ra) && (y60Var.f42346c instanceof ProfileActivity)) {
            this.f40221b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f40220a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f40221b = null;
            this.f40220a = null;
        }
        if (!y60Var.f42379u && !y60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = y60Var.f42344b;
        d dVar = new d(this, 18);
        if (viewGroup == null) {
            wk0.d(dVar);
            return;
        }
        int i7 = wk0.P;
        org.telegram.messenger.g0.l2(new ph(8, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        float f10;
        int i7;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float width;
        int height;
        int[] iArr2;
        float f17;
        float f18;
        int[] iArr3;
        int[] iArr4;
        u60 u60Var;
        float f19;
        Canvas canvas2 = canvas;
        y60 y60Var = this.G;
        float[] fArr = y60Var.f42367o;
        View view = y60Var.f42351f;
        Rect rect = y60Var.f42383z;
        super.onDraw(canvas);
        float f20 = 0.0f;
        if (this.f40222c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f40222c.getWidth(), getHeight() / this.f40222c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f40229x * 255.0f));
            canvas2.drawBitmap(this.f40222c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(this.f40229x, this.h));
        }
        if (y60Var.f42377t) {
            float f21 = this.f40223e;
            Bitmap bitmap = this.f40220a;
            Path path = this.f40225n;
            int i10 = 0;
            char c11 = 0;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f21 < 1.0f) {
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (y60Var.f42379u) {
                        f19 = 1.0f - this.f40229x;
                    } else {
                        f19 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f21 * f19)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (y60Var.L) {
                    y60.B(view, y60Var.f42344b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.f40227s, this.f40229x), org.telegram.messenger.g0.T1(fArr[1], this.f40228w, this.f40229x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = y60Var.f42353g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && y60Var.f42353g.getIntrinsicHeight() > 0) {
                        y60Var.f42353g.setBounds((((view.getWidth() + rect.right) - y60Var.f42353g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - y60Var.f42353g.getIntrinsicHeight()) / 2) + (-rect.top), ((y60Var.f42353g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((y60Var.f42353g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        y60Var.f42353g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    y60Var.f42353g.draw(canvas2);
                }
                if (y60Var.f42360k > 0 || y60Var.f42362l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f24 = y60Var.f42360k;
                    rectF.set((this.f40229x * f24) + (-rect.left), (getAlpha() * f24) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * y60Var.f42360k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * y60Var.f42360k));
                    float f25 = y60Var.f42362l * this.f40229x;
                    path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f40221b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                ArrayList arrayList = y60Var.P;
                int[] iArr5 = this.F;
                int[] iArr6 = this.E;
                if (arrayList != null) {
                    Path path2 = this.f40230y;
                    path2.rewind();
                    getLocationInWindow(iArr5);
                    ArrayList arrayList2 = y60Var.P;
                    f10 = 255.0f;
                    int size = arrayList2.size();
                    c10 = 1;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        int i12 = i10;
                        View view2 = (View) obj;
                        if (!view2.isShown() || view2.getAlpha() <= f20) {
                            i10 = i12;
                        } else {
                            view2.getLocationInWindow(iArr6);
                            ((v60) view2).c(new t60(iArr6[i12] - iArr5[i12], iArr6[1] - iArr5[1], 0, this));
                            arrayList2 = arrayList2;
                            i10 = i12;
                            iArr5 = iArr5;
                            c11 = c11;
                            f20 = f20;
                        }
                    }
                    iArr = iArr5;
                    i7 = i10;
                    if (!path2.isEmpty()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            canvas2.clipOutPath(path2);
                        } else {
                            canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                        }
                    }
                } else {
                    iArr = iArr5;
                    f10 = 255.0f;
                    i7 = 0;
                    c10 = 1;
                    int i13 = (f21 > 1.0f ? 1 : (f21 == 1.0f ? 0 : -1));
                    float f26 = this.f40224f;
                    if (i13 < 0 || f26 != 0.0f) {
                        if (y60Var.L) {
                            float f27 = -rect.left;
                            float f28 = (-rect.top) + fArr[1];
                            if (y60Var.f42379u) {
                                f13 = 1.0f - this.f40229x;
                            } else {
                                f13 = 1.0f;
                            }
                            canvas2.clipRect(f27, org.telegram.messenger.g0.T1((f28 - (f21 * f13)) + 1.0f, 0.0f, this.f40229x), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.t(1.0f, this.f40229x, f26, getMeasuredHeight() + rect.bottom));
                        } else {
                            float f29 = -rect.left;
                            float f30 = (-rect.top) + fArr[1];
                            if (y60Var.f42379u) {
                                f11 = 1.0f;
                                f12 = 1.0f - this.f40229x;
                            } else {
                                f11 = 1.0f;
                                f12 = 1.0f;
                            }
                            canvas2.clipRect(f29, (f30 - (f21 * f12)) + f11, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                        }
                    }
                }
                float f31 = this.f40229x;
                if (y60Var.L) {
                    y60.B(view, y60Var.f42344b, fArr);
                    f14 = org.telegram.messenger.g0.T1(fArr[i7], this.f40227s, f31);
                    f15 = org.telegram.messenger.g0.T1(fArr[c10], this.f40228w, f31);
                    float T1 = org.telegram.messenger.g0.T1(1.0f, y60Var.R, f31);
                    canvas2.translate(f14, f15);
                    if (T1 != 1.0f) {
                        canvas2.scale(T1, T1, view.getWidth() / 2.0f, 0.0f);
                    }
                    f16 = T1;
                } else {
                    f14 = fArr[i7];
                    f15 = fArr[c10];
                    canvas2.translate(f14, f15);
                    f16 = 1.0f;
                }
                float f32 = f15;
                float f33 = f14;
                if (y60Var.N != 0 && y60Var.O != 0) {
                    width = org.telegram.messenger.g0.W1(f31, view.getWidth(), y60Var.N);
                    height = org.telegram.messenger.g0.W1(f31, view.getHeight(), y60Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f34 = height;
                float f35 = width;
                Drawable drawable2 = y60Var.f42353g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && y60Var.f42353g.getIntrinsicHeight() > 0) {
                        f17 = 2.0f;
                        iArr2 = iArr6;
                        y60Var.f42353g.setBounds((((view.getWidth() + rect.right) - y60Var.f42353g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - y60Var.f42353g.getIntrinsicHeight()) / 2) + (-rect.top), ((y60Var.f42353g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((y60Var.f42353g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                        f18 = f16;
                    } else {
                        iArr2 = iArr6;
                        f17 = 2.0f;
                        f18 = f16;
                        y60Var.f42353g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    y60Var.f42353g.setAlpha((int) (this.f40229x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = y60Var.f42353g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.n6.r1(this.f40229x, y60Var.h));
                        }
                    }
                    y60Var.f42353g.draw(canvas2);
                } else {
                    iArr2 = iArr6;
                    f17 = 2.0f;
                    f18 = f16;
                }
                if (y60Var.f42360k > 0 || y60Var.f42362l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof x60;
                    RectF rectF2 = this.f40226r;
                    if (z10) {
                        ((x60) view).f(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f36 = -rect.left;
                    float f37 = y60Var.f42360k * this.f40229x;
                    float f38 = -rect.top;
                    rectF3.set(rectF2.left + f36 + f37, rectF2.top + f38 + f37, (f36 + rectF2.right) - f37, (f38 + rectF2.bottom) - f37);
                    float f39 = y60Var.f42362l * this.f40229x;
                    path.addRoundRect(rectF3, f39, f39, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.p7) {
                    if (view.getAlpha() >= 1.0f) {
                        ((org.telegram.ui.Cells.p7) view).a(canvas2, f35, f34, this.f40229x);
                        u60Var = this;
                        iArr3 = iArr;
                        iArr4 = iArr2;
                    } else {
                        iArr3 = iArr;
                        iArr4 = iArr2;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f35, f34, (int) (this.f40229x * f10), 31);
                        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.f40229x);
                        canvas2.scale(T12, T12, f35 / f17, f34 / f17);
                        ((org.telegram.ui.Cells.p7) view).a(canvas2, f35, f34, this.f40229x);
                        canvas2.restore();
                        u60Var = this;
                    }
                } else {
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    if ((view instanceof bi.c3) && y60Var.N != 0 && y60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((bi.c3) view).b(this, canvas, f35, f34, this.f40229x);
                            canvas2 = canvas;
                            u60Var = this;
                        } else {
                            u60Var = this;
                            canvas.saveLayerAlpha(0.0f, 0.0f, f35, f34, (int) (u60Var.f40229x * f10), 31);
                            float T13 = org.telegram.messenger.g0.T1(1.0f, 0.9f, u60Var.f40229x);
                            canvas.scale(T13, T13, f35 / f17, f34 / f17);
                            ((bi.c3) view).b(u60Var, canvas, f35, f34, u60Var.f40229x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        u60Var = this;
                        if (y60Var.L) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (u60Var.f40229x * f10), 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof x60) {
                            ((x60) view).h(canvas2, u60Var.f40229x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                }
                float f40 = 1.0f - u60Var.f40229x;
                ArrayList arrayList3 = y60Var.Q;
                if (arrayList3 != null && !arrayList3.isEmpty() && f40 > 0.0f) {
                    u60Var.getLocationInWindow(iArr3);
                    canvas2.save();
                    int i14 = i7;
                    canvas2.clipRect(i14, i14, view.getWidth(), view.getHeight());
                    float f41 = 1.0f / f18;
                    canvas2.scale(f41, f41, view.getWidth() / f17, 0.0f);
                    canvas2.translate(-f33, -f32);
                    ArrayList arrayList4 = y60Var.Q;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        int i16 = i15 + 1;
                        View view3 = (View) arrayList4.get(i15);
                        if (view3.isShown() && view3.getAlpha() > 0.0f) {
                            view3.getLocationInWindow(iArr4);
                            canvas2.save();
                            canvas2.translate(iArr4[0] - iArr3[0], iArr4[c10] - iArr3[c10]);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, view3.getWidth(), view3.getHeight(), (int) (view3.getAlpha() * f40 * f10));
                            view3.draw(canvas2);
                            canvas2.restore();
                            canvas2.restore();
                        }
                        i15 = i16;
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
        y60 y60Var = this.G;
        ih.d.c(y60Var.f42365n, this);
        ViewGroup viewGroup = y60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f40229x == f10) {
            return;
        }
        this.f40229x = f10;
        invalidate();
    }
}
