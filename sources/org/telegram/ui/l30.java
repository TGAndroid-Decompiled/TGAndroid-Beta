package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
public final class l30 extends org.telegram.ui.Components.du0 {
    public boolean f49459g0;
    public final RectF f49460h0;
    public int f49461i0;
    public boolean f49462j0;
    public boolean f49463k0;
    public boolean f49464l0;
    public final HashMap m0;
    public final f40 f49465n0;

    public l30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f49465n0 = f40Var;
        this.f49459g0 = false;
        this.f49460h0 = new RectF();
        this.m0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f40 f40Var = this.f49465n0;
        o10 o10Var = f40Var.f47530p1;
        x10 x10Var = f40Var.f47515l4;
        n30 n30Var = f40Var.L1;
        b20 b20Var = f40Var.Z3;
        if (f40Var.f47543r4) {
            if (view == n30Var) {
                int childCount = n30Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = n30Var.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == b20Var || view == o10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (f40.F5 || b20Var.f41111c != 1.0f || (view != f40Var.J1 && view != f40Var.f47475b2 && view != f40Var.I1 && view != f40Var.Z2 && view != f40Var.f47576y3 && view != f40Var.P2)) {
            if (f40Var.E4 && view == b20Var) {
                canvas.save();
                canvas.translate(x10Var.getX() + b20Var.getX(), x10Var.getY() + b20Var.getY());
                x10Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != f40Var.B4 && view != f40Var.f47484d4 && view != f40Var.W4 && (!f40Var.f47511k4 || !f40Var.f47492f4 || (view != n30Var && view != o10Var && view != f40Var.X1 && view != f40Var.f47528o3))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49465n0.U1.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49465n0.U1.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        int L2 = org.telegram.messenger.g0.L(74.0f);
        f40 f40Var = this.f49465n0;
        ImageReceiver imageReceiver = f40Var.U1;
        Drawable drawable = f40Var.f47471a2;
        b20 b20Var = f40Var.Z3;
        float f11 = f40Var.f47550t2 - L2;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = f40Var.f30210t0;
        int i10 = L3 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - f40Var.f30210t0) / ((L2 - f40Var.f30210t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        f40Var.Z1();
        if (b20Var.f41111c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.f29672t0.setColor(f40Var.U3);
                float L4 = f40Var.f30210t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.f49460h0;
                rectF.set(f40Var.f30211u0, f40Var.f30210t0 + paddingTop, getMeasuredWidth() - f40Var.f30211u0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f29672t0);
            }
            org.telegram.ui.ActionBar.m6.f29672t0.setColor(Color.argb((int) (f40Var.J1.getAlpha() * 255.0f), (int) (Color.red(f40Var.U3) * 0.8f), (int) (Color.green(f40Var.U3) * 0.8f), (int) (Color.blue(f40Var.U3) * 0.8f)));
            canvas.drawRect(f40Var.f30211u0, 0.0f, getMeasuredWidth() - f40Var.f30211u0, (int) ((1.0f - f40Var.T0) * f40Var.f30192h0), org.telegram.ui.ActionBar.m6.f29672t0);
            w20 w20Var = f40Var.f47555u2;
            if (w20Var != null) {
                org.telegram.ui.ActionBar.m6.f29672t0.setColor(w20Var.getBackgroundColor());
                canvas.drawRect(f40Var.f30211u0, 0.0f, getMeasuredWidth() - f40Var.f30211u0, (int) ((1.0f - f40Var.T0) * f40Var.f30192h0), org.telegram.ui.ActionBar.m6.f29672t0);
            }
        }
        if (b20Var.f41111c != 0.0f) {
            org.telegram.ui.ActionBar.m6.f29672t0.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false), (int) (b20Var.f41111c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29672t0);
        }
        if (f40Var.v1() && org.telegram.messenger.qc.e(512)) {
            if (b20Var.f41111c < 0.15d) {
                if (!f40Var.f47577y4) {
                    f40Var.f47577y4 = true;
                    f40Var.F1();
                }
            } else if (f40Var.f47577y4) {
                f40Var.f47577y4 = false;
                org.telegram.messenger.g0.r(f40Var.f47582z4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f40 f40Var = this.f49465n0;
        e20 e20Var = f40Var.B4;
        if (f40Var.W4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = f40Var.f47484d4.getX();
            float y11 = f40Var.f47484d4.getY();
            float x12 = f40Var.f47484d4.getX() + f40Var.f47484d4.getMeasuredWidth();
            float y12 = f40Var.f47484d4.getY() + f40Var.f47484d4.getMeasuredHeight();
            RectF rectF = this.f49460h0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(e20Var.getX(), e20Var.getY(), e20Var.getX() + e20Var.getMeasuredWidth(), e20Var.getY() + e20Var.getMeasuredWidth() + f40Var.W4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                f40Var.g1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && f40Var.f47550t2 != 0.0f && motionEvent.getY() < f40Var.f47550t2 - org.telegram.messenger.g0.L(37.0f) && f40Var.J1.getAlpha() == 0.0f && !f40Var.f47488e4 && f40Var.f47555u2 == null && !f40Var.Z3.f41109b) {
            f40Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        f40 f40Var = this.f49465n0;
        if (f40Var.W4 != null && i7 == 4) {
            f40Var.g1(true);
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        int P0;
        f40 f40Var = this.f49465n0;
        View view = f40Var.J4;
        View view2 = f40Var.I4;
        o10 o10Var = f40Var.f47530p1;
        d40 d40Var = f40Var.A3;
        b20 b20Var = f40Var.Z3;
        n30 n30Var = f40Var.L1;
        if (f40.F5 && this.f49463k0 != f40Var.H4 && this.f49464l0) {
            f10 = n30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.f49463k0 = f40Var.H4;
        b20Var.f41131s = true;
        super.onLayout(z10, i7, i10, i11, i12);
        b20Var.f41131s = false;
        f40.Q0(f40Var);
        this.f49464l0 = true;
        if (d40Var != null && (P0 = f40.P0(f40Var, n30Var.getPaddingTop())) != Integer.MIN_VALUE && P0 != ((FrameLayout.LayoutParams) d40Var.getLayoutParams()).topMargin) {
            post(new lz(this, 6));
        }
        if (z11 && n30Var.getLeft() != f10) {
            float left = f10 - n30Var.getLeft();
            n30Var.setTranslationX(left);
            o10Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = n30Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37960f;
            duration.setInterpolator(nrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
            o10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int L;
        float f10;
        float f11;
        int L2;
        float f12;
        int i11;
        int i12;
        int i13;
        int b10;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z16;
        int i22;
        f40 f40Var = this.f49465n0;
        m20 m20Var = f40Var.B1;
        u10 u10Var = f40Var.I1;
        LinearLayout linearLayout = f40Var.f47576y3;
        d30 d30Var = f40Var.J1;
        i40 i40Var = f40Var.f47524n4;
        org.telegram.ui.Components.v10 v10Var = f40Var.o4;
        org.telegram.ui.Components.xy xyVar = f40Var.T1;
        org.telegram.ui.Components.voip.q2 q2Var = f40Var.f47564w1;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.P1;
        View view = f40Var.f47475b2;
        View view2 = f40Var.J4;
        View view3 = f40Var.I4;
        ArrayList arrayList = f40Var.X3;
        org.telegram.ui.ActionBar.m5 m5Var2 = f40Var.R1;
        k20 k20Var = f40Var.C1;
        ArrayList arrayList2 = f40Var.Y3;
        org.telegram.ui.Components.ek0 ek0Var = f40Var.f47520m4;
        n30 n30Var = f40Var.L1;
        b20 b20Var = f40Var.Z3;
        x10 x10Var = f40Var.f47515l4;
        int size = View.MeasureSpec.getSize(i10);
        this.f49459g0 = true;
        if (View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        LaunchActivity launchActivity = f40Var.d2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z10 = f40.E5;
        }
        View.MeasureSpec.getSize(i7);
        b20Var.getClass();
        if (org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !f40Var.v1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (f40.E5 != z10) {
            f40.E5 = z10;
            if (q2Var.getMeasuredWidth() == 0) {
                int i23 = q2Var.getLayoutParams().width;
            }
            if (f40Var.v1()) {
                if (!b20Var.W && b20Var.f41109b && (f40.E5 == f40Var.u1() || org.telegram.messenger.g0.Q1())) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                Boolean bool = f40Var.f47504i4;
                if (bool == null || z16 != bool.booleanValue()) {
                    int systemUiVisibility = f40Var.f30176b.getSystemUiVisibility();
                    boolean z17 = z16;
                    if (z17) {
                        i22 = systemUiVisibility & (-7);
                        f40Var.getWindow().clearFlags(1024);
                        f40Var.B0(false);
                    } else {
                        f40Var.B0(true);
                        i22 = systemUiVisibility | 6;
                        f40Var.getWindow().addFlags(1024);
                    }
                    f40Var.f30176b.setSystemUiVisibility(i22);
                    f40Var.f47504i4 = Boolean.valueOf(z17);
                    f40Var.R4 = !z17;
                    f40Var.f30176b.requestApplyInsets();
                }
            } else {
                f40Var.W = false;
            }
            if (f40.E5) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            xyVar.y1(i20);
            n30Var.a0();
            x10Var.a0();
            this.f49462j0 = true;
            TextView textView = f40Var.N1;
            if (textView != null) {
                if (!f40.E5) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (f40Var.u1() == z10 && f40Var.v1() && !b20Var.f41109b && !f40Var.V2.f26953f.isEmpty()) {
                f40Var.i1((org.telegram.messenger.u3) f40Var.V2.f26953f.get(0));
                b20Var.e();
            }
        }
        if (f40.F5 != z11) {
            f40.F5 = z11;
            if (z11) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            ek0Var.setVisibility(i19);
            n30Var.a0();
            x10Var.a0();
            z12 = true;
            this.f49462j0 = true;
        } else {
            z12 = true;
        }
        if (this.f49462j0) {
            f40Var.R0(z12);
            f40Var.K1.f();
            v10Var.G(ek0Var, false);
            if (f40.F5) {
                i40Var.I(ek0Var, false);
            }
            if (f40.F5) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            ek0Var.setVisibility(i15);
            if (f40.F5 && !b20Var.f41109b) {
                z13 = true;
            } else {
                z13 = false;
            }
            i40Var.H(ek0Var, z13, true);
            boolean z18 = f40.F5;
            if (z18 && !b20Var.f41109b) {
                z14 = false;
            } else {
                z14 = true;
            }
            f40Var.O4 = z14;
            if (!z18 && b20Var.f41109b) {
                z15 = true;
            } else {
                z15 = false;
            }
            v10Var.F(x10Var, z15);
            if (z15) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            x10Var.setVisibility(i16);
            if (!f40.F5 && b20Var.f41109b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            n30Var.setVisibility(i17);
            if (f40.E5) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            xyVar.y1(i18);
            f40Var.W1(false, false);
            n30Var.a0();
            x10Var.a0();
            org.telegram.messenger.g0.Z3(n30Var);
            this.f49462j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            b20Var.setIsTablet(f40.F5);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (f40Var.v1()) {
            L = org.telegram.messenger.g0.L(72.0f);
        } else {
            L = org.telegram.messenger.g0.L(245.0f);
        }
        int i25 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b20Var.getLayoutParams();
        if (f40.F5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f40Var.f47486e2[i26].getLayoutParams();
            if (f40.F5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (ek0Var != null) {
            ((FrameLayout.LayoutParams) ek0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (f40Var.v1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (f40.F5) {
            if (f40Var.H4) {
                i14 = 5;
            } else {
                i14 = 1;
            }
            layoutParams3.gravity = i14;
            layoutParams3.width = org.telegram.messenger.g0.L(320.0f);
            int L4 = org.telegram.messenger.g0.L(4.0f);
            layoutParams3.leftMargin = L4;
            layoutParams3.rightMargin = L4;
            layoutParams3.bottomMargin = L3;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            L2 = org.telegram.messenger.g0.L(60.0f);
            f11 = 90.0f;
        } else {
            f11 = 90.0f;
            if (f40.E5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.g0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.g0.L(14.0f);
                L2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L2 = org.telegram.messenger.g0.L(60.0f);
                layoutParams3.bottomMargin = L3;
                layoutParams3.topMargin = org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L5 = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.leftMargin = L5;
                layoutParams3.rightMargin = L5;
            }
        }
        int i27 = 81;
        if (f40.E5 && !f40.F5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (f40.F5) {
                if (f40Var.H4) {
                    i12 = 85;
                } else {
                    i12 = 81;
                }
                layoutParams4.gravity = i12;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L3;
            if (f40.F5) {
                if (f40Var.H4) {
                    i11 = 85;
                } else {
                    i11 = 81;
                }
                layoutParams5.gravity = i11;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (f40.E5) {
            x10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            x10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) f40Var.f47530p1.getLayoutParams();
        if (f40.F5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f12);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            if (f40Var.H4) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (f40.E5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (f40.E5 && !f40.F5) {
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
        } else {
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) x10Var.getLayoutParams();
        if (f40.E5) {
            if (((v4.c0) x10Var.getLayoutManager()).f59117o != 1) {
                ((v4.c0) x10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.c0) x10Var.getLayoutManager()).f59117o != 0) {
                ((v4.c0) x10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        m20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) m20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (i25 / 5) * 3);
        if (f40.F5) {
            b10 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            b10 = org.telegram.messenger.f3.b(8.0f, i25 - max, 0);
        }
        if (n30Var.getPaddingTop() != b10 || n30Var.getPaddingBottom() != L2) {
            n30Var.setPadding(i13, b10, i13, L2);
        }
        d40 d40Var = f40Var.A3;
        if (d40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) d40Var.getLayoutParams();
            int P0 = f40.P0(f40Var, b10);
            if (P0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = P0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        u30 u30Var = f40Var.P2;
        if (u30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r h12 = f40Var.h1();
            if (h12 != null) {
                layoutParams10.height = h12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = h12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L6 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L6;
                layoutParams10.rightMargin = L6;
            }
        }
        if (m5Var2 != null) {
            int L7 = ((org.telegram.messenger.g0.L(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) m5Var.getLayoutParams();
            layoutParams11.topMargin = L7 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) m5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) f40Var.Q1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    m5Var.setVisibility(0);
                    m5Var2.setVisibility(0);
                    layoutParams13.topMargin = L7;
                }
            }
            m5Var.setVisibility(4);
            m5Var2.setVisibility(4);
            layoutParams13.topMargin = L7 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i28)).g(b20Var.f41109b, true);
        }
        this.f49459g0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.f49461i0) {
            this.f49461i0 = measuredHeight;
            f40Var.g1(false);
        }
        f40Var.f47538q4.f41186f = getMeasuredWidth();
        f40Var.b1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f49465n0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f49459g0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f49465n0.Z1();
    }
}
