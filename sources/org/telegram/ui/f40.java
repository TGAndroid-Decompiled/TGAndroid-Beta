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
public final class f40 extends org.telegram.ui.Components.vu0 {
    public boolean f36990f0;
    public final RectF f36991g0;
    public int f36992h0;
    public boolean f36993i0;
    public boolean f36994j0;
    public boolean f36995k0;
    public final HashMap f36996l0;
    public final a50 m0;

    public f40(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = a50Var;
        this.f36990f0 = false;
        this.f36991g0 = new RectF();
        this.f36996l0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a50 a50Var = this.m0;
        k20 k20Var = a50Var.l1;
        t20 t20Var = a50Var.f35592d4;
        h40 h40Var = a50Var.H1;
        x20 x20Var = a50Var.R3;
        if (a50Var.f35618j4) {
            if (view == h40Var) {
                int childCount = h40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = h40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == x20Var || view == k20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (a50.f35576x5 || x20Var.f31794c != 1.0f || (view != a50Var.F1 && view != a50Var.X1 && view != a50Var.E1 && view != a50Var.V2 && view != a50Var.f35649q3 && view != a50Var.L2)) {
            if (a50Var.f35678w4 && view == x20Var) {
                canvas.save();
                canvas.translate(t20Var.getX() + x20Var.getX(), t20Var.getY() + x20Var.getY());
                t20Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != a50Var.f35665t4 && view != a50Var.V3 && view != a50Var.O4 && (!a50Var.f35588c4 || !a50Var.X3 || (view != h40Var && view != k20Var && view != a50Var.T1))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.Q1.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.Q1.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int L;
        int L2 = org.telegram.messenger.i0.L(74.0f);
        a50 a50Var = this.m0;
        ImageReceiver imageReceiver = a50Var.Q1;
        Drawable drawable = a50Var.W1;
        x20 x20Var = a50Var.R3;
        float f10 = a50Var.f35644p2 - L2;
        int L3 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
        int i10 = a50Var.f21615s0;
        int i11 = L3 + i10;
        if (i10 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - a50Var.f21615s0) / ((L2 - a50Var.f21615s0) - org.telegram.messenger.i0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L) * min);
            f10 -= currentActionBarHeight;
            i11 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        a50Var.T1();
        if (x20Var.f31794c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i11);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f21218t0.setColor(a50Var.M3);
                float L4 = a50Var.f21615s0 + paddingTop + org.telegram.messenger.i0.L(24.0f);
                RectF rectF = this.f36991g0;
                rectF.set(a50Var.f21616t0, a50Var.f21615s0 + paddingTop, getMeasuredWidth() - a50Var.f21616t0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21218t0);
            }
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(Color.argb((int) (a50Var.F1.getAlpha() * 255.0f), (int) (Color.red(a50Var.M3) * 0.8f), (int) (Color.green(a50Var.M3) * 0.8f), (int) (Color.blue(a50Var.M3) * 0.8f)));
            canvas.drawRect(a50Var.f21616t0, 0.0f, getMeasuredWidth() - a50Var.f21616t0, (int) ((1.0f - a50Var.S0) * a50Var.f21600g0), org.telegram.ui.ActionBar.t6.f21218t0);
            r30 r30Var = a50Var.f35648q2;
            if (r30Var != null) {
                org.telegram.ui.ActionBar.t6.f21218t0.setColor(r30Var.getBackgroundColor());
                canvas.drawRect(a50Var.f21616t0, 0.0f, getMeasuredWidth() - a50Var.f21616t0, (int) ((1.0f - a50Var.S0) * a50Var.f21600g0), org.telegram.ui.ActionBar.t6.f21218t0);
            }
        }
        if (x20Var.f31794c != 0.0f) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false), (int) (x20Var.f31794c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21218t0);
        }
        if (a50Var.t1() && org.telegram.messenger.tc.e(512)) {
            if (x20Var.f31794c < 0.15d) {
                if (!a50Var.f35650q4) {
                    a50Var.f35650q4 = true;
                    a50Var.B1();
                }
            } else if (a50Var.f35650q4) {
                a50Var.f35650q4 = false;
                org.telegram.messenger.i0.r(a50Var.f35655r4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a50 a50Var = this.m0;
        a30 a30Var = a50Var.f35665t4;
        if (a50Var.O4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = a50Var.V3.getX();
            float y10 = a50Var.V3.getY();
            float x12 = a50Var.V3.getX() + a50Var.V3.getMeasuredWidth();
            float y11 = a50Var.V3.getY() + a50Var.V3.getMeasuredHeight();
            RectF rectF = this.f36991g0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(a30Var.getX(), a30Var.getY(), a30Var.getX() + a30Var.getMeasuredWidth(), a30Var.getY() + a30Var.getMeasuredWidth() + a50Var.O4.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                a50Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && a50Var.f35644p2 != 0.0f && motionEvent.getY() < a50Var.f35644p2 - org.telegram.messenger.i0.L(37.0f) && a50Var.F1.getAlpha() == 0.0f && !a50Var.W3 && a50Var.f35648q2 == null && !a50Var.R3.f31792b) {
            a50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        a50 a50Var = this.m0;
        if (a50Var.O4 != null && i10 == 4) {
            a50Var.f1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        a50 a50Var = this.m0;
        View view = a50Var.B4;
        View view2 = a50Var.A4;
        k20 k20Var = a50Var.l1;
        x20 x20Var = a50Var.R3;
        h40 h40Var = a50Var.H1;
        if (a50.f35576x5 && this.f36994j0 != a50Var.f35689z4 && this.f36995k0) {
            f7 = h40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.f36994j0 = a50Var.f35689z4;
        x20Var.f31813s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        x20Var.f31813s = false;
        a50.P0(a50Var);
        this.f36995k0 = true;
        if (z11 && h40Var.getLeft() != f7) {
            float left = f7 - h40Var.getLeft();
            h40Var.setTranslationX(left);
            k20Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = h40Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
            duration.setInterpolator(grVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
            k20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int L;
        float f7;
        float f10;
        int L2;
        float f11;
        int i12;
        int i13;
        int i14;
        int b10;
        int i15;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z16;
        int i23;
        a50 a50Var = this.m0;
        h30 h30Var = a50Var.f35679x1;
        q20 q20Var = a50Var.E1;
        LinearLayout linearLayout = a50Var.f35649q3;
        x30 x30Var = a50Var.F1;
        d50 d50Var = a50Var.f35600f4;
        org.telegram.ui.Components.z10 z10Var = a50Var.f35604g4;
        org.telegram.ui.Components.zy zyVar = a50Var.P1;
        org.telegram.ui.Components.voip.c2 c2Var = a50Var.f35657s1;
        org.telegram.ui.ActionBar.u5 u5Var = a50Var.L1;
        View view = a50Var.X1;
        k20 k20Var = a50Var.l1;
        View view2 = a50Var.B4;
        View view3 = a50Var.A4;
        ArrayList arrayList = a50Var.P3;
        org.telegram.ui.ActionBar.u5 u5Var2 = a50Var.N1;
        f30 f30Var = a50Var.f35683y1;
        ArrayList arrayList2 = a50Var.Q3;
        org.telegram.ui.Components.uk0 uk0Var = a50Var.f35596e4;
        h40 h40Var = a50Var.H1;
        x20 x20Var = a50Var.R3;
        t20 t20Var = a50Var.f35592d4;
        int size = View.MeasureSpec.getSize(i11);
        this.f36990f0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !org.telegram.messenger.i0.Q1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        x20Var.getClass();
        if (org.telegram.messenger.i0.Q1() && View.MeasureSpec.getSize(i10) > size && !a50Var.t1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a50.f35575w5 != z10) {
            a50.f35575w5 = z10;
            if (c2Var.getMeasuredWidth() == 0) {
                int i24 = c2Var.getLayoutParams().width;
            }
            if (a50Var.t1()) {
                if (!x20Var.V && x20Var.f31792b && (a50.f35575w5 == a50Var.s1() || org.telegram.messenger.i0.Q1())) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                Boolean bool = a50Var.f35580a4;
                if (bool == null || z16 != bool.booleanValue()) {
                    int systemUiVisibility = a50Var.f21587b.getSystemUiVisibility();
                    boolean z17 = z16;
                    if (z17) {
                        i23 = systemUiVisibility & (-7);
                        a50Var.getWindow().clearFlags(1024);
                        a50Var.B0(false);
                    } else {
                        a50Var.B0(true);
                        i23 = systemUiVisibility | 6;
                        a50Var.getWindow().addFlags(1024);
                    }
                    a50Var.f21587b.setSystemUiVisibility(i23);
                    a50Var.f35580a4 = Boolean.valueOf(z17);
                    a50Var.J4 = !z17;
                    a50Var.f21587b.requestApplyInsets();
                }
            } else {
                a50Var.V = false;
            }
            if (a50.f35575w5) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            zyVar.y1(i21);
            h40Var.a0();
            t20Var.a0();
            this.f36993i0 = true;
            TextView textView = a50Var.J1;
            if (textView != null) {
                if (!a50.f35575w5) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (a50Var.s1() == z10 && a50Var.t1() && !x20Var.f31792b && !a50Var.R2.f18363f.isEmpty()) {
                a50Var.g1((org.telegram.messenger.v3) a50Var.R2.f18363f.get(0));
                x20Var.e();
            }
        }
        if (a50.f35576x5 != z11) {
            a50.f35576x5 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            uk0Var.setVisibility(i20);
            h40Var.a0();
            t20Var.a0();
            z12 = true;
            this.f36993i0 = true;
        } else {
            z12 = true;
        }
        if (this.f36993i0) {
            a50Var.Q0(z12);
            a50Var.G1.f();
            z10Var.G(uk0Var, false);
            if (a50.f35576x5) {
                d50Var.I(uk0Var, false);
            }
            if (a50.f35576x5) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            uk0Var.setVisibility(i16);
            if (a50.f35576x5 && !x20Var.f31792b) {
                z13 = true;
            } else {
                z13 = false;
            }
            d50Var.H(uk0Var, z13, true);
            boolean z18 = a50.f35576x5;
            if (z18 && !x20Var.f31792b) {
                z14 = false;
            } else {
                z14 = true;
            }
            a50Var.G4 = z14;
            if (!z18 && x20Var.f31792b) {
                z15 = true;
            } else {
                z15 = false;
            }
            z10Var.F(t20Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            t20Var.setVisibility(i17);
            if (!a50.f35576x5 && x20Var.f31792b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            h40Var.setVisibility(i18);
            if (a50.f35575w5) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            zyVar.y1(i19);
            a50Var.Q1(false, false);
            h40Var.a0();
            t20Var.a0();
            org.telegram.messenger.i0.a4(h40Var);
            this.f36993i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            x20Var.setIsTablet(a50.f35576x5);
            for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                ((org.telegram.ui.Components.voip.r) arrayList2.get(i25)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (a50Var.t1()) {
            L = org.telegram.messenger.i0.L(72.0f);
        } else {
            L = org.telegram.messenger.i0.L(245.0f);
        }
        int i26 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x20Var.getLayoutParams();
        if (a50.f35576x5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i27 = 0; i27 < 2; i27++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a50Var.a2[i27].getLayoutParams();
            if (a50.f35576x5) {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(8.0f);
            }
        }
        if (uk0Var != null) {
            ((FrameLayout.LayoutParams) uk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (f30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (a50Var.t1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int L3 = org.telegram.messenger.i0.L(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h40Var.getLayoutParams();
        if (a50.f35576x5) {
            if (a50Var.f35689z4) {
                i15 = 5;
            } else {
                i15 = 1;
            }
            layoutParams3.gravity = i15;
            layoutParams3.width = org.telegram.messenger.i0.L(320.0f);
            int L4 = org.telegram.messenger.i0.L(4.0f);
            layoutParams3.leftMargin = L4;
            layoutParams3.rightMargin = L4;
            layoutParams3.bottomMargin = L3;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            L2 = org.telegram.messenger.i0.L(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (a50.f35575w5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.i0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.i0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.i0.L(14.0f);
                L2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L2 = org.telegram.messenger.i0.L(60.0f);
                layoutParams3.bottomMargin = L3;
                layoutParams3.topMargin = org.telegram.messenger.i0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L5 = org.telegram.messenger.i0.L(14.0f);
                layoutParams3.leftMargin = L5;
                layoutParams3.rightMargin = L5;
            }
        }
        int i28 = 81;
        if (a50.f35575w5 && !a50.f35576x5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (a50.f35576x5) {
                if (a50Var.f35689z4) {
                    i13 = 85;
                } else {
                    i13 = 81;
                }
                layoutParams4.gravity = i13;
                layoutParams4.width = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L3;
            if (a50.f35576x5) {
                if (a50Var.f35689z4) {
                    i12 = 85;
                } else {
                    i12 = 81;
                }
                layoutParams5.gravity = i12;
                layoutParams5.width = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (a50.f35575w5) {
            t20Var.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
        } else {
            t20Var.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) k20Var.getLayoutParams();
        if (a50.f35576x5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f11);
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            if (a50Var.f35689z4) {
                i28 = 85;
            }
            layoutParams6.gravity = i28;
            layoutParams6.rightMargin = 0;
        } else if (a50.f35575w5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (a50.f35575w5 && !a50.f35576x5) {
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
            ((FrameLayout.LayoutParams) q20Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
        } else {
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) q20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) t20Var.getLayoutParams();
        if (a50.f35575w5) {
            if (((s4.a0) t20Var.getLayoutManager()).f47879o != 1) {
                ((s4.a0) t20Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.i0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.a0) t20Var.getLayoutManager()).f47879o != 0) {
                ((s4.a0) t20Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.i0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        h30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) h30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (f30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.i0.L(259.0f), (i26 / 5) * 3);
        if (a50.f35576x5) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.m5.b(8.0f, i26 - max, 0);
        }
        if (h40Var.getPaddingTop() != b10 || h40Var.getPaddingBottom() != L2) {
            h40Var.setPadding(i14, b10, i14, L2);
        }
        y40 y40Var = a50Var.f35659s3;
        if (y40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) y40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O0 = a50.O0(a50Var);
            if (O0 != null) {
                int measuredHeight = ((k20Var.getMeasuredHeight() / 2) + k20Var.getTop()) - (a50Var.f35647q1.getMeasuredHeight() / 2);
                int measuredHeight2 = O0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i0.a.u(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.i0.L(32.0f);
                layoutParams9.height = org.telegram.messenger.i0.L(70.0f);
            }
        }
        p40 p40Var = a50Var.L2;
        if (p40Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) p40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O02 = a50.O0(a50Var);
            if (O02 != null) {
                layoutParams10.height = O02.getMeasuredHeight() - org.telegram.messenger.i0.L(14.0f);
                layoutParams10.width = O02.getMeasuredWidth() - org.telegram.messenger.i0.L(7.0f);
                int L6 = org.telegram.messenger.i0.L(16.0f);
                layoutParams10.leftMargin = L6;
                layoutParams10.rightMargin = L6;
            }
        }
        if (u5Var2 != null) {
            int L7 = ((org.telegram.messenger.i0.L(60.0f) + (i26 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) u5Var.getLayoutParams();
            layoutParams11.topMargin = L7 - org.telegram.messenger.i0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) u5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.i0.L(80.0f) + L7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) a50Var.M1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.i0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.i0.L(231.0f)) {
                    u5Var.setVisibility(0);
                    u5Var2.setVisibility(0);
                    layoutParams13.topMargin = L7;
                }
            }
            u5Var.setVisibility(4);
            u5Var2.setVisibility(4);
            layoutParams13.topMargin = L7 - org.telegram.messenger.i0.L(20.0f);
        }
        for (int i29 = 0; i29 < arrayList.size(); i29++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i29)).g(x20Var.f31792b, true);
        }
        this.f36990f0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f36992h0) {
            this.f36992h0 = measuredHeight3;
            a50Var.f1(false);
        }
        a50Var.f35613i4.f31494f = getMeasuredWidth();
        a50Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36990f0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.m0.T1();
    }
}
