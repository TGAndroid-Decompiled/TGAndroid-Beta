package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ba extends s4.n0 implements bh.a {
    public int E;
    public boolean G;
    public int I;
    public final zl0 f22894a;
    public final Utilities.CallbackReturn f22895b;
    public final Utilities.CallbackReturn f22896c;
    public final Utilities.Callback5 d;
    public final int e;
    public final float f22897f;
    public final boolean h;
    public Bitmap[] f22901w;
    public int f22903y;
    public final Paint f22898n = new Paint(3);
    public final Paint f22899r = new Paint();
    public final Paint f22900s = new Paint();
    public final RectF v = new RectF();
    public float[] f22902x = new float[32];
    public float F = -1.0f;
    public float[] H = new float[48];

    public ba(zl0 zl0Var, Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, ov ovVar, boolean z10, boolean z11) {
        this.f22894a = zl0Var;
        this.f22895b = callbackReturn;
        this.f22896c = callbackReturn2;
        this.e = i10;
        this.f22897f = f7;
        this.d = ovVar;
        this.h = z10;
        this.G = z11;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        int dp;
        if (m(view)) {
            int i10 = this.e;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.h0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                if (b10 == 0) {
                    if (this.h) {
                        dp = i10;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.top = dp;
                }
                if (b10 == adapter.h() - 1) {
                    rect.bottom = i10;
                }
            }
        }
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        zl0 zl0Var = this.f22894a;
        if (recyclerView != zl0Var) {
            return;
        }
        o();
        if (this.G) {
            float width = zl0Var.getWidth();
            float height = zl0Var.getHeight();
            int paddingLeft = zl0Var.getPaddingLeft();
            int i10 = this.e;
            float max = Math.max(0.0f, Math.min(width, paddingLeft + i10));
            float max2 = Math.max(max, Math.min(width, (width - zl0Var.getPaddingRight()) - i10));
            Paint paint = this.f22899r;
            if (max >= max2) {
                canvas.drawRect(0.0f, 0.0f, width, height, paint);
            } else {
                this.f22903y = 0;
                for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                    View childAt = zl0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    s4.c1 T = zl0Var.T(childAt);
                    if (childAt != zl0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!zl0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && m(childAt) && !zl0Var.i1(R))) {
                        float v12 = zl0.v1(childAt);
                        float H0 = zl0.H0(childAt);
                        if (childAt instanceof y80) {
                            H0 -= ((y80) childAt).getBottomInfoMargin();
                        }
                        e(v12, H0);
                    }
                }
                if (zl0Var.L2 != null) {
                    for (int i12 = 0; i12 < zl0Var.L2.size(); i12++) {
                        long longValue = ((Long) zl0Var.L2.get(i12)).longValue();
                        int unpackA = AndroidUtilities.unpackA(longValue);
                        int unpackB = AndroidUtilities.unpackB(longValue);
                        float f11 = height;
                        float f12 = 0.0f;
                        for (int i13 = 0; i13 < zl0Var.getChildCount(); i13++) {
                            View childAt2 = zl0Var.getChildAt(i13);
                            int R2 = RecyclerView.R(childAt2);
                            if (R2 >= unpackA && R2 <= unpackB) {
                                float min = Math.min(f11, zl0.v1(childAt2));
                                f12 = Math.max(f12, zl0.H0(childAt2));
                                f11 = min;
                            }
                        }
                        e(f11, f12);
                    }
                }
                for (int i14 = 2; i14 < this.f22903y; i14 += 2) {
                    float[] fArr = this.f22902x;
                    float f13 = fArr[i14];
                    float f14 = fArr[i14 + 1];
                    int i15 = i14 - 2;
                    while (i15 >= 0) {
                        float[] fArr2 = this.f22902x;
                        float f15 = fArr2[i15];
                        if (f15 > f13) {
                            fArr2[i15 + 2] = f15;
                            fArr2[i15 + 3] = fArr2[i15 + 1];
                            i15 -= 2;
                        }
                    }
                    float[] fArr3 = this.f22902x;
                    fArr3[i15 + 2] = f13;
                    fArr3[i15 + 3] = f14;
                }
                int i16 = 0;
                for (int i17 = 0; i17 < this.f22903y; i17 += 2) {
                    float max3 = Math.max(0.0f, this.f22902x[i17]);
                    float min2 = Math.min(height, this.f22902x[i17 + 1]);
                    if (min2 > max3) {
                        if (i16 > 0) {
                            float[] fArr4 = this.f22902x;
                            int i18 = i16 - 1;
                            float f16 = fArr4[i18];
                            if (max3 <= f16 + 1.0f) {
                                fArr4[i18] = Math.max(f16, min2);
                            }
                        }
                        float[] fArr5 = this.f22902x;
                        int i19 = i16 + 1;
                        fArr5[i16] = max3;
                        i16 += 2;
                        fArr5[i19] = min2;
                    }
                }
                this.f22903y = i16;
                if (i16 == 0) {
                    canvas.drawRect(0.0f, 0.0f, width, height, paint);
                } else {
                    float[] fArr6 = this.f22902x;
                    float f17 = fArr6[0];
                    float f18 = fArr6[i16 - 1];
                    int i20 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
                    if (i20 > 0) {
                        canvas.drawRect(0.0f, 0.0f, width, Math.min(height, f17 + 1.0f), paint);
                    }
                    int i21 = (f18 > height ? 1 : (f18 == height ? 0 : -1));
                    if (i21 < 0) {
                        canvas.drawRect(0.0f, Math.max(0.0f, f18 - 1.0f), width, height, paint);
                    }
                    if (i20 > 0) {
                        f7 = f17;
                    } else {
                        f7 = 0.0f;
                    }
                    if (i21 < 0) {
                        f10 = f18;
                    } else {
                        f10 = height;
                    }
                    if (f10 > f7) {
                        canvas.drawRect(0.0f, f7, Math.min(width, max + 1.0f), f10, paint);
                        canvas.drawRect(Math.max(0.0f, max2 - 1.0f), f7, width, f10, paint);
                    }
                    for (int i22 = 2; i22 < this.f22903y; i22 += 2) {
                        float[] fArr7 = this.f22902x;
                        float f19 = fArr7[i22 - 1];
                        float f20 = fArr7[i22];
                        if (f20 > f19) {
                            canvas.drawRect(max, Math.max(0.0f, f19 - 1.0f), max2, Math.min(height, f20 + 1.0f), paint);
                        }
                    }
                }
            }
        }
        j(canvas);
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        Paint paint;
        zl0 zl0Var = this.f22894a;
        if (recyclerView == zl0Var) {
            float f7 = this.f22897f;
            if (f7 > 0.0f) {
                o();
                int max = Math.max(1, (int) Math.ceil(f7));
                if (this.f22901w == null || this.E != max || this.F != f7) {
                    this.E = max;
                    this.F = f7;
                    this.f22901w = new Bitmap[4];
                    Paint paint2 = new Paint(1);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    for (int i10 = 0; i10 < this.f22901w.length; i10++) {
                        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        canvas2.drawColor(this.f22899r.getColor());
                        canvas2.drawCircle((i10 != 0 && i10 != 2) ? 0.0f : max, (i10 != 0 && i10 != 1) ? 0.0f : max, f7, paint2);
                        this.f22901w[i10] = createBitmap;
                    }
                }
                int i11 = 0;
                while (true) {
                    int childCount = zl0Var.getChildCount();
                    paint = this.f22898n;
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = zl0Var.getChildAt(i11);
                    s4.c1 T = zl0Var.T(childAt);
                    int R = RecyclerView.R(childAt);
                    if (childAt != zl0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && m(childAt) && !zl0Var.i1(R))) {
                        float x10 = childAt.getX();
                        float width = childAt.getWidth() + x10;
                        if (!n(R - 1)) {
                            float v12 = zl0.v1(childAt);
                            canvas.drawBitmap(this.f22901w[0], x10, v12, paint);
                            canvas.drawBitmap(this.f22901w[1], width - this.E, v12, paint);
                        }
                        if (!n(R + 1)) {
                            g(canvas, x10, width, zl0.H0(childAt));
                        }
                    }
                    i11++;
                }
                if (zl0Var.L2 != null) {
                    for (int i12 = 0; i12 < zl0Var.L2.size(); i12++) {
                        long longValue = ((Long) zl0Var.L2.get(i12)).longValue();
                        View V0 = zl0Var.V0(AndroidUtilities.unpackA(longValue));
                        View V02 = zl0Var.V0(AndroidUtilities.unpackB(longValue));
                        if (V0 != null) {
                            float x11 = V0.getX();
                            float x12 = V0.getX() + V0.getWidth();
                            float v13 = zl0.v1(V0);
                            canvas.drawBitmap(this.f22901w[0], x11, v13, paint);
                            canvas.drawBitmap(this.f22901w[1], x12 - this.E, v13, paint);
                        }
                        if (V02 != null) {
                            g(canvas, V02.getX(), V02.getX() + V02.getWidth(), zl0.H0(V02));
                        }
                    }
                }
            }
        }
    }

    public final void e(float f7, float f10) {
        if (f10 <= f7) {
            return;
        }
        int i10 = this.f22903y;
        int i11 = i10 + 2;
        float[] fArr = this.f22902x;
        if (i11 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f22902x = fArr2;
        }
        float[] fArr3 = this.f22902x;
        int i12 = this.f22903y;
        int i13 = i12 + 1;
        this.f22903y = i13;
        fArr3[i12] = f7;
        this.f22903y = i12 + 2;
        fArr3[i13] = f10;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        o();
        canvas.save();
        canvas.clipRect(rectF);
        j(canvas);
        canvas.restore();
    }

    public final void g(Canvas canvas, float f7, float f10, float f11) {
        Paint paint = this.f22898n;
        canvas.drawBitmap(this.f22901w[2], f7, f11 - this.E, paint);
        Bitmap bitmap = this.f22901w[3];
        int i10 = this.E;
        canvas.drawBitmap(bitmap, f10 - i10, f11 - i10, paint);
    }

    public final void h(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        zl0 zl0Var;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof y80) {
                f7 = ((y80) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            float left = view.getLeft();
            this.f22894a.getClass();
            float f12 = this.f22897f;
            float f13 = -f12;
            float v12 = zl0.v1(view);
            if (z10) {
                f10 = f12;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f13, v12 - f10);
            float right = view.getRight();
            float height = zl0Var.getHeight() - (-f12);
            float H0 = zl0.H0(view2);
            if (z11) {
                f11 = f12;
            }
            float min = Math.min(height, (H0 + f11) - f7);
            RectF rectF = this.v;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                i(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void i(Canvas canvas, RectF rectF, float f7) {
        Float valueOf = Float.valueOf(0.0f);
        if (this.G) {
            int sectionColorForDecoration = this.f22894a.getSectionColorForDecoration();
            int h = i0.a.h(i0.a.k(sectionColorForDecoration, Math.round(Math.max(0.0f, f7) * Color.alpha(sectionColorForDecoration))), this.f22899r.getColor());
            Paint paint = this.f22900s;
            paint.setColor(h);
            canvas.drawRect(rectF, paint);
            return;
        }
        this.d.mo17run(canvas, rectF, valueOf, valueOf, Float.valueOf(f7));
    }

    public final void j(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba.j(android.graphics.Canvas):void");
    }

    public final boolean k(int i10, View view) {
        if (view != null && i10 <= 0) {
            s4.h0 adapter = this.f22894a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.f22896c.run(Integer.valueOf(adapter.j(R - 1)))).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean l(int i10, View view) {
        if (view != null) {
            zl0 zl0Var = this.f22894a;
            if (i10 >= zl0Var.getChildCount() - 1) {
                s4.h0 adapter = zl0Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.h() - 1) {
                    if (((Boolean) this.f22896c.run(Integer.valueOf(adapter.j(R + 1)))).booleanValue()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean m(View view) {
        return ((Boolean) this.f22895b.run(view)).booleanValue();
    }

    public final boolean n(int i10) {
        zl0 zl0Var = this.f22894a;
        s4.h0 adapter = zl0Var.getAdapter();
        if (i10 >= 0 && adapter != null && i10 < adapter.h()) {
            View V0 = zl0Var.V0(i10);
            if (V0 != null) {
                if (!m(V0) || zl0Var.i1(i10)) {
                    return false;
                }
                return true;
            }
            if (((Boolean) this.f22896c.run(Integer.valueOf(adapter.j(i10)))).booleanValue() && !zl0Var.i1(i10)) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int sectionsBackgroundColorForDecoration = this.f22894a.getSectionsBackgroundColorForDecoration();
        Paint paint = this.f22899r;
        if (paint.getColor() == sectionsBackgroundColorForDecoration) {
            return;
        }
        paint.setColor(sectionsBackgroundColorForDecoration);
        this.f22901w = null;
        this.F = -1.0f;
    }
}
