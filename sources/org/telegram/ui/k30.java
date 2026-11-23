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
public final class k30 extends org.telegram.ui.Components.cu0 {
    public boolean f49298g0;
    public final RectF f49299h0;
    public int f49300i0;
    public boolean f49301j0;
    public boolean f49302k0;
    public boolean f49303l0;
    public final HashMap m0;
    public final e40 f49304n0;

    public k30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f49304n0 = e40Var;
        this.f49298g0 = false;
        this.f49299h0 = new RectF();
        this.m0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e40 e40Var = this.f49304n0;
        n10 n10Var = e40Var.f47380p1;
        w10 w10Var = e40Var.f47365l4;
        m30 m30Var = e40Var.L1;
        a20 a20Var = e40Var.Z3;
        if (e40Var.f47393r4) {
            if (view == m30Var) {
                int childCount = m30Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = m30Var.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == a20Var || view == n10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (e40.F5 || a20Var.f41005c != 1.0f || (view != e40Var.J1 && view != e40Var.f47325b2 && view != e40Var.I1 && view != e40Var.Z2 && view != e40Var.f47426y3 && view != e40Var.P2)) {
            if (e40Var.E4 && view == a20Var) {
                canvas.save();
                canvas.translate(w10Var.getX() + a20Var.getX(), w10Var.getY() + a20Var.getY());
                w10Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != e40Var.B4 && view != e40Var.f47334d4 && view != e40Var.W4 && (!e40Var.f47361k4 || !e40Var.f47342f4 || (view != m30Var && view != n10Var && view != e40Var.X1 && view != e40Var.f47378o3))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49304n0.U1.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49304n0.U1.S();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        int L2 = org.telegram.messenger.g0.L(74.0f);
        e40 e40Var = this.f49304n0;
        ImageReceiver imageReceiver = e40Var.U1;
        Drawable drawable = e40Var.f47321a2;
        a20 a20Var = e40Var.Z3;
        float f11 = e40Var.f47400t2 - L2;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = e40Var.f30260t0;
        int i10 = L3 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - e40Var.f30260t0) / ((L2 - e40Var.f30260t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        e40Var.Y1();
        if (a20Var.f41005c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(e40Var.U3);
                float L4 = e40Var.f30260t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.f49299h0;
                rectF.set(e40Var.f30261u0, e40Var.f30260t0 + paddingTop, getMeasuredWidth() - e40Var.f30261u0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.f29742t0);
            }
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(Color.argb((int) (e40Var.J1.getAlpha() * 255.0f), (int) (Color.red(e40Var.U3) * 0.8f), (int) (Color.green(e40Var.U3) * 0.8f), (int) (Color.blue(e40Var.U3) * 0.8f)));
            canvas.drawRect(e40Var.f30261u0, 0.0f, getMeasuredWidth() - e40Var.f30261u0, (int) ((1.0f - e40Var.T0) * e40Var.f30242h0), org.telegram.ui.ActionBar.n6.f29742t0);
            v20 v20Var = e40Var.f47405u2;
            if (v20Var != null) {
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(v20Var.getBackgroundColor());
                canvas.drawRect(e40Var.f30261u0, 0.0f, getMeasuredWidth() - e40Var.f30261u0, (int) ((1.0f - e40Var.T0) * e40Var.f30242h0), org.telegram.ui.ActionBar.n6.f29742t0);
            }
        }
        if (a20Var.f41005c != 0.0f) {
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false), (int) (a20Var.f41005c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29742t0);
        }
        if (e40Var.v1() && org.telegram.messenger.pc.e(512)) {
            if (a20Var.f41005c < 0.15d) {
                if (!e40Var.f47427y4) {
                    e40Var.f47427y4 = true;
                    e40Var.F1();
                }
            } else if (e40Var.f47427y4) {
                e40Var.f47427y4 = false;
                org.telegram.messenger.g0.r(e40Var.f47432z4);
            }
        }
        imageReceiver.z0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e40 e40Var = this.f49304n0;
        d20 d20Var = e40Var.B4;
        if (e40Var.W4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = e40Var.f47334d4.getX();
            float y11 = e40Var.f47334d4.getY();
            float x12 = e40Var.f47334d4.getX() + e40Var.f47334d4.getMeasuredWidth();
            float y12 = e40Var.f47334d4.getY() + e40Var.f47334d4.getMeasuredHeight();
            RectF rectF = this.f49299h0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(d20Var.getX(), d20Var.getY(), d20Var.getX() + d20Var.getMeasuredWidth(), d20Var.getY() + d20Var.getMeasuredWidth() + e40Var.W4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                e40Var.g1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && e40Var.f47400t2 != 0.0f && motionEvent.getY() < e40Var.f47400t2 - org.telegram.messenger.g0.L(37.0f) && e40Var.J1.getAlpha() == 0.0f && !e40Var.f47338e4 && e40Var.f47405u2 == null && !e40Var.Z3.f41003b) {
            e40Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        e40 e40Var = this.f49304n0;
        if (e40Var.W4 != null && i7 == 4) {
            e40Var.g1(true);
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        int P0;
        e40 e40Var = this.f49304n0;
        View view = e40Var.J4;
        View view2 = e40Var.I4;
        n10 n10Var = e40Var.f47380p1;
        c40 c40Var = e40Var.A3;
        a20 a20Var = e40Var.Z3;
        m30 m30Var = e40Var.L1;
        if (e40.F5 && this.f49302k0 != e40Var.H4 && this.f49303l0) {
            f10 = m30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.f49302k0 = e40Var.H4;
        a20Var.f41025s = true;
        super.onLayout(z10, i7, i10, i11, i12);
        a20Var.f41025s = false;
        e40.Q0(e40Var);
        this.f49303l0 = true;
        if (c40Var != null && (P0 = e40.P0(e40Var, m30Var.getPaddingTop())) != Integer.MIN_VALUE && P0 != ((FrameLayout.LayoutParams) c40Var.getLayoutParams()).topMargin) {
            post(new kz(this, 6));
        }
        if (z11 && m30Var.getLeft() != f10) {
            float left = f10 - m30Var.getLeft();
            m30Var.setTranslationX(left);
            n10Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = m30Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
            duration.setInterpolator(krVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(krVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(krVar).start();
            n10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(krVar).start();
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
        e40 e40Var = this.f49304n0;
        l20 l20Var = e40Var.B1;
        t10 t10Var = e40Var.I1;
        LinearLayout linearLayout = e40Var.f47426y3;
        c30 c30Var = e40Var.J1;
        h40 h40Var = e40Var.f47374n4;
        org.telegram.ui.Components.t10 t10Var2 = e40Var.o4;
        org.telegram.ui.Components.uy uyVar = e40Var.T1;
        org.telegram.ui.Components.voip.r2 r2Var = e40Var.f47414w1;
        org.telegram.ui.ActionBar.n5 n5Var = e40Var.P1;
        View view = e40Var.f47325b2;
        View view2 = e40Var.J4;
        View view3 = e40Var.I4;
        ArrayList arrayList = e40Var.X3;
        org.telegram.ui.ActionBar.n5 n5Var2 = e40Var.R1;
        j20 j20Var = e40Var.C1;
        ArrayList arrayList2 = e40Var.Y3;
        org.telegram.ui.Components.ek0 ek0Var = e40Var.f47370m4;
        m30 m30Var = e40Var.L1;
        a20 a20Var = e40Var.Z3;
        w10 w10Var = e40Var.f47365l4;
        int size = View.MeasureSpec.getSize(i10);
        this.f49298g0 = true;
        if (View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        LaunchActivity launchActivity = e40Var.d2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z10 = e40.E5;
        }
        View.MeasureSpec.getSize(i7);
        a20Var.getClass();
        if (org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !e40Var.v1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (e40.E5 != z10) {
            e40.E5 = z10;
            if (r2Var.getMeasuredWidth() == 0) {
                int i23 = r2Var.getLayoutParams().width;
            }
            if (e40Var.v1()) {
                if (!a20Var.W && a20Var.f41003b && (e40.E5 == e40Var.u1() || org.telegram.messenger.g0.Q1())) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                Boolean bool = e40Var.f47354i4;
                if (bool == null || z16 != bool.booleanValue()) {
                    int systemUiVisibility = e40Var.f30226b.getSystemUiVisibility();
                    boolean z17 = z16;
                    if (z17) {
                        i22 = systemUiVisibility & (-7);
                        e40Var.getWindow().clearFlags(1024);
                        e40Var.B0(false);
                    } else {
                        e40Var.B0(true);
                        i22 = systemUiVisibility | 6;
                        e40Var.getWindow().addFlags(1024);
                    }
                    e40Var.f30226b.setSystemUiVisibility(i22);
                    e40Var.f47354i4 = Boolean.valueOf(z17);
                    e40Var.R4 = !z17;
                    e40Var.f30226b.requestApplyInsets();
                }
            } else {
                e40Var.W = false;
            }
            if (e40.E5) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            uyVar.y1(i20);
            m30Var.a0();
            w10Var.a0();
            this.f49301j0 = true;
            TextView textView = e40Var.N1;
            if (textView != null) {
                if (!e40.E5) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (e40Var.u1() == z10 && e40Var.v1() && !a20Var.f41003b && !e40Var.V2.f27037f.isEmpty()) {
                e40Var.i1((org.telegram.messenger.u3) e40Var.V2.f27037f.get(0));
                a20Var.e();
            }
        }
        if (e40.F5 != z11) {
            e40.F5 = z11;
            if (z11) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            ek0Var.setVisibility(i19);
            m30Var.a0();
            w10Var.a0();
            z12 = true;
            this.f49301j0 = true;
        } else {
            z12 = true;
        }
        if (this.f49301j0) {
            e40Var.R0(z12);
            e40Var.K1.f();
            t10Var2.G(ek0Var, false);
            if (e40.F5) {
                h40Var.I(ek0Var, false);
            }
            if (e40.F5) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            ek0Var.setVisibility(i15);
            if (e40.F5 && !a20Var.f41003b) {
                z13 = true;
            } else {
                z13 = false;
            }
            h40Var.H(ek0Var, z13, true);
            boolean z18 = e40.F5;
            if (z18 && !a20Var.f41003b) {
                z14 = false;
            } else {
                z14 = true;
            }
            e40Var.O4 = z14;
            if (!z18 && a20Var.f41003b) {
                z15 = true;
            } else {
                z15 = false;
            }
            t10Var2.F(w10Var, z15);
            if (z15) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            w10Var.setVisibility(i16);
            if (!e40.F5 && a20Var.f41003b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            m30Var.setVisibility(i17);
            if (e40.E5) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            uyVar.y1(i18);
            e40Var.V1(false, false);
            m30Var.a0();
            w10Var.a0();
            org.telegram.messenger.g0.Z3(m30Var);
            this.f49301j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            a20Var.setIsTablet(e40.F5);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (e40Var.v1()) {
            L = org.telegram.messenger.g0.L(72.0f);
        } else {
            L = org.telegram.messenger.g0.L(245.0f);
        }
        int i25 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a20Var.getLayoutParams();
        if (e40.F5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e40Var.f47336e2[i26].getLayoutParams();
            if (e40.F5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (ek0Var != null) {
            ((FrameLayout.LayoutParams) ek0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (e40Var.v1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
        if (e40.F5) {
            if (e40Var.H4) {
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
            if (e40.E5) {
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
        if (e40.E5 && !e40.F5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (e40.F5) {
                if (e40Var.H4) {
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
            if (e40.F5) {
                if (e40Var.H4) {
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
        if (e40.E5) {
            w10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            w10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) e40Var.f47380p1.getLayoutParams();
        if (e40.F5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f12);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            if (e40Var.H4) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (e40.E5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (e40.E5 && !e40.F5) {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) t10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
        } else {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) t10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) w10Var.getLayoutParams();
        if (e40.E5) {
            if (((v4.c0) w10Var.getLayoutManager()).f59199o != 1) {
                ((v4.c0) w10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.c0) w10Var.getLayoutManager()).f59199o != 0) {
                ((v4.c0) w10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        l20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) l20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (j20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (i25 / 5) * 3);
        if (e40.F5) {
            b10 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            b10 = org.telegram.messenger.f3.b(8.0f, i25 - max, 0);
        }
        if (m30Var.getPaddingTop() != b10 || m30Var.getPaddingBottom() != L2) {
            m30Var.setPadding(i13, b10, i13, L2);
        }
        c40 c40Var = e40Var.A3;
        if (c40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) c40Var.getLayoutParams();
            int P0 = e40.P0(e40Var, b10);
            if (P0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = P0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        t30 t30Var = e40Var.P2;
        if (t30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
            org.telegram.ui.Components.voip.s h12 = e40Var.h1();
            if (h12 != null) {
                layoutParams10.height = h12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = h12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L6 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L6;
                layoutParams10.rightMargin = L6;
            }
        }
        if (n5Var2 != null) {
            int L7 = ((org.telegram.messenger.g0.L(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            layoutParams11.topMargin = L7 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) n5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) e40Var.Q1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    n5Var.setVisibility(0);
                    n5Var2.setVisibility(0);
                    layoutParams13.topMargin = L7;
                }
            }
            n5Var.setVisibility(4);
            n5Var2.setVisibility(4);
            layoutParams13.topMargin = L7 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i28)).g(a20Var.f41003b, true);
        }
        this.f49298g0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.f49300i0) {
            this.f49300i0 = measuredHeight;
            e40Var.g1(false);
        }
        e40Var.f47388q4.f41074f = getMeasuredWidth();
        e40Var.b1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f49304n0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f49298g0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f49304n0.Y1();
    }
}
