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
public final class w60 extends View {
    public final int[] E;
    public final int[] F;
    public final a70 G;
    public final Bitmap f41659a;
    public final Paint f41660b;
    public Bitmap f41661c;
    public final Paint d;
    public final float f41662e;
    public final float f41663f;
    public final int h;
    public final Path f41664n;
    public final RectF f41665r;
    public float f41666s;
    public float f41667w;
    public float f41668x;
    public final Path f41669y;

    public w60(a70 a70Var, Context context) {
        super(context);
        float f10;
        this.G = a70Var;
        this.f41664n = new Path();
        this.f41665r = new RectF();
        this.f41669y = new Path();
        this.E = new int[2];
        this.F = new int[2];
        View view = a70Var.f33360f;
        Rect rect = a70Var.f33392z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f41662e = view.getY() + ((View) view.getParent()).getY();
            if (a70Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f41663f = f10;
        } else {
            this.f41662e = 0.0f;
            this.f41663f = 0.0f;
        }
        this.h = i0.a.o(0, a70Var.f33384s);
        if (a70Var.f33386t && (view instanceof org.telegram.ui.Cells.ra) && (a70Var.f33355c instanceof ProfileActivity)) {
            this.f41660b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f41659a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f41660b = null;
            this.f41659a = null;
        }
        if (!a70Var.f33388u && !a70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = a70Var.f33353b;
        d dVar = new d(this, 18);
        if (viewGroup == null) {
            yk0.d(dVar);
            return;
        }
        int i7 = yk0.P;
        org.telegram.messenger.g0.l2(new rh(8, viewGroup, dVar), 15.0f);
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
        w60 w60Var;
        float f19;
        Canvas canvas2 = canvas;
        a70 a70Var = this.G;
        float[] fArr = a70Var.f33376o;
        View view = a70Var.f33360f;
        Rect rect = a70Var.f33392z;
        super.onDraw(canvas);
        float f20 = 0.0f;
        if (this.f41661c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f41661c.getWidth(), getHeight() / this.f41661c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f41668x * 255.0f));
            canvas2.drawBitmap(this.f41661c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(this.f41668x, this.h));
        }
        if (a70Var.f33386t) {
            float f21 = this.f41662e;
            Bitmap bitmap = this.f41659a;
            Path path = this.f41664n;
            int i10 = 0;
            char c11 = 0;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f21 < 1.0f) {
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (a70Var.f33388u) {
                        f19 = 1.0f - this.f41668x;
                    } else {
                        f19 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f21 * f19)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (a70Var.L) {
                    a70.B(view, a70Var.f33353b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.f41666s, this.f41668x), org.telegram.messenger.g0.T1(fArr[1], this.f41667w, this.f41668x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = a70Var.f33362g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && a70Var.f33362g.getIntrinsicHeight() > 0) {
                        a70Var.f33362g.setBounds((((view.getWidth() + rect.right) - a70Var.f33362g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - a70Var.f33362g.getIntrinsicHeight()) / 2) + (-rect.top), ((a70Var.f33362g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((a70Var.f33362g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        a70Var.f33362g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    a70Var.f33362g.draw(canvas2);
                }
                if (a70Var.f33369k > 0 || a70Var.f33371l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f24 = a70Var.f33369k;
                    rectF.set((this.f41668x * f24) + (-rect.left), (getAlpha() * f24) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * a70Var.f33369k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * a70Var.f33369k));
                    float f25 = a70Var.f33371l * this.f41668x;
                    path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f41660b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                ArrayList arrayList = a70Var.P;
                int[] iArr5 = this.F;
                int[] iArr6 = this.E;
                if (arrayList != null) {
                    Path path2 = this.f41669y;
                    path2.rewind();
                    getLocationInWindow(iArr5);
                    ArrayList arrayList2 = a70Var.P;
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
                            ((x60) view2).c(new v60(iArr6[i12] - iArr5[i12], iArr6[1] - iArr5[1], 0, this));
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
                    float f26 = this.f41663f;
                    if (i13 < 0 || f26 != 0.0f) {
                        if (a70Var.L) {
                            float f27 = -rect.left;
                            float f28 = (-rect.top) + fArr[1];
                            if (a70Var.f33388u) {
                                f13 = 1.0f - this.f41668x;
                            } else {
                                f13 = 1.0f;
                            }
                            canvas2.clipRect(f27, org.telegram.messenger.g0.T1((f28 - (f21 * f13)) + 1.0f, 0.0f, this.f41668x), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.t(1.0f, this.f41668x, f26, getMeasuredHeight() + rect.bottom));
                        } else {
                            float f29 = -rect.left;
                            float f30 = (-rect.top) + fArr[1];
                            if (a70Var.f33388u) {
                                f11 = 1.0f;
                                f12 = 1.0f - this.f41668x;
                            } else {
                                f11 = 1.0f;
                                f12 = 1.0f;
                            }
                            canvas2.clipRect(f29, (f30 - (f21 * f12)) + f11, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                        }
                    }
                }
                float f31 = this.f41668x;
                if (a70Var.L) {
                    a70.B(view, a70Var.f33353b, fArr);
                    f14 = org.telegram.messenger.g0.T1(fArr[i7], this.f41666s, f31);
                    f15 = org.telegram.messenger.g0.T1(fArr[c10], this.f41667w, f31);
                    float T1 = org.telegram.messenger.g0.T1(1.0f, a70Var.R, f31);
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
                if (a70Var.N != 0 && a70Var.O != 0) {
                    width = org.telegram.messenger.g0.W1(f31, view.getWidth(), a70Var.N);
                    height = org.telegram.messenger.g0.W1(f31, view.getHeight(), a70Var.O);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f34 = height;
                float f35 = width;
                Drawable drawable2 = a70Var.f33362g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && a70Var.f33362g.getIntrinsicHeight() > 0) {
                        f17 = 2.0f;
                        iArr2 = iArr6;
                        a70Var.f33362g.setBounds((((view.getWidth() + rect.right) - a70Var.f33362g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - a70Var.f33362g.getIntrinsicHeight()) / 2) + (-rect.top), ((a70Var.f33362g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((a70Var.f33362g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                        f18 = f16;
                    } else {
                        iArr2 = iArr6;
                        f17 = 2.0f;
                        f18 = f16;
                        a70Var.f33362g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    a70Var.f33362g.setAlpha((int) (this.f41668x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = a70Var.f33362g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.m6.r1(this.f41668x, a70Var.h));
                        }
                    }
                    a70Var.f33362g.draw(canvas2);
                } else {
                    iArr2 = iArr6;
                    f17 = 2.0f;
                    f18 = f16;
                }
                if (a70Var.f33369k > 0 || a70Var.f33371l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof z60;
                    RectF rectF2 = this.f41665r;
                    if (z10) {
                        ((z60) view).f(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f36 = -rect.left;
                    float f37 = a70Var.f33369k * this.f41668x;
                    float f38 = -rect.top;
                    rectF3.set(rectF2.left + f36 + f37, rectF2.top + f38 + f37, (f36 + rectF2.right) - f37, (f38 + rectF2.bottom) - f37);
                    float f39 = a70Var.f33371l * this.f41668x;
                    path.addRoundRect(rectF3, f39, f39, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.p7) {
                    if (view.getAlpha() >= 1.0f) {
                        ((org.telegram.ui.Cells.p7) view).a(canvas2, f35, f34, this.f41668x);
                        w60Var = this;
                        iArr3 = iArr;
                        iArr4 = iArr2;
                    } else {
                        iArr3 = iArr;
                        iArr4 = iArr2;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f35, f34, (int) (this.f41668x * f10), 31);
                        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.f41668x);
                        canvas2.scale(T12, T12, f35 / f17, f34 / f17);
                        ((org.telegram.ui.Cells.p7) view).a(canvas2, f35, f34, this.f41668x);
                        canvas2.restore();
                        w60Var = this;
                    }
                } else {
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    if ((view instanceof bi.g3) && a70Var.N != 0 && a70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((bi.g3) view).b(this, canvas, f35, f34, this.f41668x);
                            canvas2 = canvas;
                            w60Var = this;
                        } else {
                            w60Var = this;
                            canvas.saveLayerAlpha(0.0f, 0.0f, f35, f34, (int) (w60Var.f41668x * f10), 31);
                            float T13 = org.telegram.messenger.g0.T1(1.0f, 0.9f, w60Var.f41668x);
                            canvas.scale(T13, T13, f35 / f17, f34 / f17);
                            ((bi.g3) view).b(w60Var, canvas, f35, f34, w60Var.f41668x);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        w60Var = this;
                        if (a70Var.L) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (w60Var.f41668x * f10), 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof z60) {
                            ((z60) view).h(canvas2, w60Var.f41668x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                }
                float f40 = 1.0f - w60Var.f41668x;
                ArrayList arrayList3 = a70Var.Q;
                if (arrayList3 != null && !arrayList3.isEmpty() && f40 > 0.0f) {
                    w60Var.getLocationInWindow(iArr3);
                    canvas2.save();
                    int i14 = i7;
                    canvas2.clipRect(i14, i14, view.getWidth(), view.getHeight());
                    float f41 = 1.0f / f18;
                    canvas2.scale(f41, f41, view.getWidth() / f17, 0.0f);
                    canvas2.translate(-f33, -f32);
                    ArrayList arrayList4 = a70Var.Q;
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
        a70 a70Var = this.G;
        ih.d.c(a70Var.f33374n, this);
        ViewGroup viewGroup = a70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f41668x == f10) {
            return;
        }
        this.f41668x = f10;
        invalidate();
    }
}
