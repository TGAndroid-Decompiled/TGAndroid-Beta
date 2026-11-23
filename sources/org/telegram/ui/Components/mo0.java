package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class mo0 extends cu0 {
    public boolean f37506g0;
    public final RectF f37507h0;
    public boolean f37508i0;
    public int f37509j0;
    public int f37510k0;
    public int f37511l0;
    public int m0;
    public int f37512n0;
    public int f37513o0;
    public final c6 f37514p0;
    public final zo0 f37515q0;

    public mo0(zo0 zo0Var, Context context) {
        super(context, null);
        this.f37515q0 = zo0Var;
        this.f37506g0 = false;
        this.f37507h0 = new RectF();
        this.I = new lo0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, zo0Var.J0));
        this.f37514p0 = new c6(this, 0L, 350L, kr.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        zo0 zo0Var = this.f37515q0;
        bo0 bo0Var = zo0Var.C1;
        ek0 ek0Var = zo0Var.A1;
        bo0 bo0Var2 = zo0Var.B1;
        if (bo0Var2.getVisibility() == 0 && bo0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(bo0Var2.getX(), bo0Var2.getY());
            bo0Var2.draw(canvas);
            canvas.restore();
        }
        if (ek0Var.getVisibility() == 0 && ek0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ek0Var.getX(), ek0Var.getY());
            ek0Var.draw(canvas);
            canvas.restore();
        }
        if (bo0Var.getVisibility() == 0 && bo0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(bo0Var.getX(), bo0Var.getY());
            bo0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        zo0 zo0Var = this.f37515q0;
        canvas.clipRect(0.0f, getPaddingTop() + zo0Var.f42987p2, getMeasuredWidth(), getMeasuredHeight() + zo0Var.f42987p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof qy) {
            zo0 zo0Var = this.f37515q0;
            if (zo0Var.Q2 != null) {
                canvas.save();
                zo0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(zo0Var.Q2.R.f11638k);
                zo0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f37515q0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.I;
        i1Var.f29068b = this;
        i1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z10;
        int i7;
        int L;
        Paint paint;
        boolean z11;
        canvas.save();
        zo0 zo0Var = this.f37515q0;
        Drawable drawable = zo0Var.N1;
        FrameLayout frameLayout = zo0Var.f43002x1;
        canvas.translate(0.0f, zo0Var.f42987p2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (zo0Var.f42980l2 - zo0Var.f30260t0) + this.f37509j0;
        int L3 = ((zo0Var.f42980l2 - zo0Var.f30260t0) - org.telegram.messenger.g0.L(13.0f)) + this.f37509j0;
        zo0Var.T1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = zo0Var.f30260t0;
        int i11 = L4 + i10;
        boolean z12 = true;
        if (!zo0Var.W) {
            int i12 = zo0Var.C2.f15979b;
            L2 += i12;
            if (this.f37508i0 && L3 + i10 < i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            f10 = this.f37514p0.d(z11);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = zo0Var.f30260t0 + L3 + zo0Var.f42987p2;
        if (zo0Var.f42992s1 != f11) {
            zo0Var.f42992s1 = f11;
            zo0Var.f42981m1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= zo0Var.C2.f15979b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                fc fcVar = fc.f35083w;
                if (fcVar != null) {
                    kb kbVar = fcVar.f35087e;
                    if (kbVar != null) {
                        kbVar.setTop(true);
                    }
                    fcVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + zo0Var.f30260t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f37507h0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, zo0Var.J0));
            org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, zo0Var.J0)) > 0.721f && 0 > zo0Var.C2.f15979b * 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                i7 = systemUiVisibility | 8192;
            } else {
                i7 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i7);
        }
        canvas.restore();
        this.f37510k0 = this.f37509j0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f37508i0;
        zo0 zo0Var = this.f37515q0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f37509j0 - org.telegram.messenger.g0.L(30.0f)) {
                zo0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && zo0Var.f42980l2 != 0 && motionEvent.getY() < zo0Var.f42980l2 - org.telegram.messenger.g0.L(30.0f)) {
            zo0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mo0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int emojiPadding;
        mo0 mo0Var = this;
        zo0 zo0Var = mo0Var.f37515q0;
        bo0 bo0Var = zo0Var.C1;
        FrameLayout frameLayout = zo0Var.Y1;
        bo0 bo0Var2 = zo0Var.B1;
        ek0 ek0Var = zo0Var.A1;
        if (mo0Var.getLayoutParams().height > 0) {
            size = mo0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        v4.t tVar = zo0Var.D1;
        int i16 = 0;
        if (mo0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tVar.G = z10;
        uy uyVar = zo0Var.F1;
        if (mo0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        uyVar.G = z11;
        if (!zo0Var.W) {
            mo0Var.f37506g0 = true;
            int i17 = zo0Var.f30261u0;
            mo0Var.setPadding(i17, zo0Var.C2.f15979b, i17, 0);
            mo0Var.f37506g0 = false;
        }
        int paddingTop = size - mo0Var.getPaddingTop();
        int max = Math.max(zo0Var.I1.b(), zo0Var.G1.b() - 1);
        int D = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + zo0Var.f30260t0;
        if (ek0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil((zo0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + zo0Var.f30260t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(ek0Var.getAlpha(), D, D2);
            }
        }
        if (D < paddingTop) {
            i11 = 0;
        } else {
            i11 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i18 = 48;
        if (frameLayout != null) {
            i12 = 48;
        } else {
            i12 = 0;
        }
        int L = org.telegram.messenger.g0.L(i12 + 100) + zo0Var.C2.d;
        if (bo0Var2.getPaddingTop() != i11 || bo0Var2.getPaddingBottom() != L) {
            mo0Var.f37506g0 = true;
            bo0Var2.setPadding(0, i11, 0, L);
            ek0Var.setPadding(0, i11, 0, L);
            mo0Var.f37506g0 = false;
        }
        if (zo0Var.d && mo0Var.getLayoutParams().height <= 0 && bo0Var.getPaddingTop() != i11) {
            mo0Var.f37506g0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            bo0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + zo0Var.C2.d);
            mo0Var.f37506g0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        mo0Var.f37508i0 = z12;
        if (z12) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        mo0Var.f37509j0 = i13;
        mo0Var.f37506g0 = true;
        zo0Var.L0(false);
        mo0Var.f37506g0 = false;
        mo0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = zo0Var.f30261u0;
        FrameLayout frameLayout2 = zo0Var.f42996u1;
        fo0 fo0Var = zo0Var.f42984o1;
        int i20 = size2 - (i19 * 2);
        int Q = mo0Var.Q();
        zo0Var.J2 = Q;
        if (!fo0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !fo0Var.f41722e && !fo0Var.P) {
            mo0Var.f37506g0 = true;
            fo0Var.j();
            mo0Var.f37506g0 = false;
        }
        mo0Var.f37506g0 = true;
        if (zo0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (zo0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = fo0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (fo0Var.f41722e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!fo0Var.m()) {
                fo0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        mo0Var.f37506g0 = false;
        int childCount = mo0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = mo0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (fo0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), mo0Var.getPaddingTop() + (i22 - zo0Var.C2.f15979b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(mo0Var.getPaddingTop() + (i22 - zo0Var.C2.f15979b), 1073741824));
                    }
                } else {
                    mo0Var.measureChildWithMargins(childAt, i7, 0, i21, 0);
                }
            }
            i16++;
            mo0Var = this;
        }
        zo0Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37515q0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37506g0) {
            return;
        }
        super.requestLayout();
    }
}
