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
public final class k30 extends org.telegram.ui.Components.tt0 {
    public boolean f47177f0;
    public final RectF f47178g0;
    public int f47179h0;
    public boolean f47180i0;
    public boolean f47181j0;
    public boolean f47182k0;
    public final HashMap f47183l0;
    public final e40 m0;

    public k30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = e40Var;
        this.f47177f0 = false;
        this.f47178g0 = new RectF();
        this.f47183l0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e40 e40Var = this.m0;
        n10 n10Var = e40Var.l1;
        x10 x10Var = e40Var.f45201d4;
        m30 m30Var = e40Var.H1;
        b20 b20Var = e40Var.R3;
        if (e40Var.f45226j4) {
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
            if (view == b20Var || view == n10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (e40.f45185x5 || b20Var.f39384c != 1.0f || (view != e40Var.F1 && view != e40Var.X1 && view != e40Var.E1 && view != e40Var.V2 && view != e40Var.f45257q3 && view != e40Var.L2)) {
            if (e40Var.f45285w4 && view == b20Var) {
                canvas.save();
                canvas.translate(x10Var.getX() + b20Var.getX(), x10Var.getY() + b20Var.getY());
                x10Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != e40Var.f45272t4 && view != e40Var.V3 && view != e40Var.O4 && (!e40Var.f45198c4 || !e40Var.X3 || (view != m30Var && view != n10Var && view != e40Var.T1))) {
                return super.drawChild(canvas, view, j3);
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
        float f10;
        int L;
        int L2 = org.telegram.messenger.g0.L(74.0f);
        e40 e40Var = this.m0;
        ImageReceiver imageReceiver = e40Var.Q1;
        Drawable drawable = e40Var.W1;
        b20 b20Var = e40Var.R3;
        float f11 = e40Var.f45251p2 - L2;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = e40Var.f28653s0;
        int i10 = L3 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - e40Var.f28653s0) / ((L2 - e40Var.f28653s0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        e40Var.W1();
        if (b20Var.f39384c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(e40Var.M3);
                float L4 = e40Var.f28653s0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.f47178g0;
                rectF.set(e40Var.f28654t0, e40Var.f28653s0 + paddingTop, getMeasuredWidth() - e40Var.f28654t0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.f28156t0);
            }
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(Color.argb((int) (e40Var.F1.getAlpha() * 255.0f), (int) (Color.red(e40Var.M3) * 0.8f), (int) (Color.green(e40Var.M3) * 0.8f), (int) (Color.blue(e40Var.M3) * 0.8f)));
            canvas.drawRect(e40Var.f28654t0, 0.0f, getMeasuredWidth() - e40Var.f28654t0, (int) ((1.0f - e40Var.S0) * e40Var.f28638g0), org.telegram.ui.ActionBar.l6.f28156t0);
            v20 v20Var = e40Var.f45256q2;
            if (v20Var != null) {
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(v20Var.getBackgroundColor());
                canvas.drawRect(e40Var.f28654t0, 0.0f, getMeasuredWidth() - e40Var.f28654t0, (int) ((1.0f - e40Var.S0) * e40Var.f28638g0), org.telegram.ui.ActionBar.l6.f28156t0);
            }
        }
        if (b20Var.f39384c != 0.0f) {
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false), (int) (b20Var.f39384c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.f28156t0);
        }
        if (e40Var.u1() && org.telegram.messenger.sc.e(512)) {
            if (b20Var.f39384c < 0.15d) {
                if (!e40Var.f45258q4) {
                    e40Var.f45258q4 = true;
                    e40Var.E1();
                }
            } else if (e40Var.f45258q4) {
                e40Var.f45258q4 = false;
                org.telegram.messenger.g0.r(e40Var.f45263r4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e40 e40Var = this.m0;
        e20 e20Var = e40Var.f45272t4;
        if (e40Var.O4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = e40Var.V3.getX();
            float y11 = e40Var.V3.getY();
            float x12 = e40Var.V3.getX() + e40Var.V3.getMeasuredWidth();
            float y12 = e40Var.V3.getY() + e40Var.V3.getMeasuredHeight();
            RectF rectF = this.f47178g0;
            rectF.set(x11, y11, x12, y12);
            boolean z9 = !rectF.contains(x10, y10);
            rectF.set(e20Var.getX(), e20Var.getY(), e20Var.getX() + e20Var.getMeasuredWidth(), e20Var.getY() + e20Var.getMeasuredWidth() + e40Var.O4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z9 = false;
            }
            if (z9) {
                e40Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && e40Var.f45251p2 != 0.0f && motionEvent.getY() < e40Var.f45251p2 - org.telegram.messenger.g0.L(37.0f) && e40Var.F1.getAlpha() == 0.0f && !e40Var.W3 && e40Var.f45256q2 == null && !e40Var.R3.f39382b) {
            e40Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        e40 e40Var = this.m0;
        if (e40Var.O4 != null && i7 == 4) {
            e40Var.f1(true);
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        float f10;
        int O0;
        e40 e40Var = this.m0;
        View view = e40Var.B4;
        View view2 = e40Var.A4;
        n10 n10Var = e40Var.l1;
        c40 c40Var = e40Var.f45267s3;
        b20 b20Var = e40Var.R3;
        m30 m30Var = e40Var.H1;
        if (e40.f45185x5 && this.f47181j0 != e40Var.f45297z4 && this.f47182k0) {
            f10 = m30Var.getX();
            z10 = true;
        } else {
            z10 = false;
            f10 = 0.0f;
        }
        this.f47181j0 = e40Var.f45297z4;
        b20Var.f39404s = true;
        super.onLayout(z9, i7, i10, i11, i12);
        b20Var.f39404s = false;
        e40.P0(e40Var);
        this.f47182k0 = true;
        if (c40Var != null && (O0 = e40.O0(e40Var, m30Var.getPaddingTop())) != Integer.MIN_VALUE && O0 != ((FrameLayout.LayoutParams) c40Var.getLayoutParams()).topMargin) {
            post(new jz(this, 6));
        }
        if (z10 && m30Var.getLeft() != f10) {
            float left = f10 - m30Var.getLeft();
            m30Var.setTranslationX(left);
            n10Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = m30Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
            duration.setInterpolator(xqVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
            n10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
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
        boolean z12;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z15;
        int i22;
        e40 e40Var = this.m0;
        l20 l20Var = e40Var.f45286x1;
        u10 u10Var = e40Var.E1;
        LinearLayout linearLayout = e40Var.f45257q3;
        b30 b30Var = e40Var.F1;
        h40 h40Var = e40Var.f45209f4;
        org.telegram.ui.Components.i10 i10Var = e40Var.f45213g4;
        org.telegram.ui.Components.ly lyVar = e40Var.P1;
        org.telegram.ui.Components.voip.n2 n2Var = e40Var.f45265s1;
        org.telegram.ui.ActionBar.l5 l5Var = e40Var.L1;
        View view = e40Var.X1;
        View view2 = e40Var.B4;
        View view3 = e40Var.A4;
        ArrayList arrayList = e40Var.P3;
        org.telegram.ui.ActionBar.l5 l5Var2 = e40Var.N1;
        j20 j20Var = e40Var.f45290y1;
        ArrayList arrayList2 = e40Var.Q3;
        org.telegram.ui.Components.qj0 qj0Var = e40Var.f45205e4;
        m30 m30Var = e40Var.H1;
        b20 b20Var = e40Var.R3;
        x10 x10Var = e40Var.f45201d4;
        int size = View.MeasureSpec.getSize(i10);
        this.f47177f0 = true;
        if (View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1()) {
            z9 = true;
        } else {
            z9 = false;
        }
        LaunchActivity launchActivity = e40Var.Z1;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z9 = e40.f45184w5;
        }
        View.MeasureSpec.getSize(i7);
        b20Var.getClass();
        if (org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !e40Var.u1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (e40.f45184w5 != z9) {
            e40.f45184w5 = z9;
            if (n2Var.getMeasuredWidth() == 0) {
                int i23 = n2Var.getLayoutParams().width;
            }
            if (e40Var.u1()) {
                if (!b20Var.V && b20Var.f39382b && (e40.f45184w5 == e40Var.t1() || org.telegram.messenger.g0.Q1())) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                Boolean bool = e40Var.f45190a4;
                if (bool == null || z15 != bool.booleanValue()) {
                    int systemUiVisibility = e40Var.f28624b.getSystemUiVisibility();
                    boolean z16 = z15;
                    if (z16) {
                        i22 = systemUiVisibility & (-7);
                        e40Var.getWindow().clearFlags(1024);
                        e40Var.B0(false);
                    } else {
                        e40Var.B0(true);
                        i22 = systemUiVisibility | 6;
                        e40Var.getWindow().addFlags(1024);
                    }
                    e40Var.f28624b.setSystemUiVisibility(i22);
                    e40Var.f45190a4 = Boolean.valueOf(z16);
                    e40Var.J4 = !z16;
                    e40Var.f28624b.requestApplyInsets();
                }
            } else {
                e40Var.V = false;
            }
            if (e40.f45184w5) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            lyVar.y1(i20);
            m30Var.a0();
            x10Var.a0();
            this.f47180i0 = true;
            TextView textView = e40Var.J1;
            if (textView != null) {
                if (!e40.f45184w5) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (e40Var.t1() == z9 && e40Var.u1() && !b20Var.f39382b && !e40Var.R2.f25225f.isEmpty()) {
                e40Var.h1((org.telegram.messenger.s3) e40Var.R2.f25225f.get(0));
                b20Var.e();
            }
        }
        if (e40.f45185x5 != z10) {
            e40.f45185x5 = z10;
            if (z10) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            qj0Var.setVisibility(i19);
            m30Var.a0();
            x10Var.a0();
            z11 = true;
            this.f47180i0 = true;
        } else {
            z11 = true;
        }
        if (this.f47180i0) {
            e40Var.Q0(z11);
            e40Var.G1.f();
            i10Var.G(qj0Var, false);
            if (e40.f45185x5) {
                h40Var.I(qj0Var, false);
            }
            if (e40.f45185x5) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            qj0Var.setVisibility(i15);
            if (e40.f45185x5 && !b20Var.f39382b) {
                z12 = true;
            } else {
                z12 = false;
            }
            h40Var.H(qj0Var, z12, true);
            boolean z17 = e40.f45185x5;
            if (z17 && !b20Var.f39382b) {
                z13 = false;
            } else {
                z13 = true;
            }
            e40Var.G4 = z13;
            if (!z17 && b20Var.f39382b) {
                z14 = true;
            } else {
                z14 = false;
            }
            i10Var.F(x10Var, z14);
            if (z14) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            x10Var.setVisibility(i16);
            if (!e40.f45185x5 && b20Var.f39382b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            m30Var.setVisibility(i17);
            if (e40.f45184w5) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            lyVar.y1(i18);
            e40Var.T1(false, false);
            m30Var.a0();
            x10Var.a0();
            org.telegram.messenger.g0.b4(m30Var);
            this.f47180i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            b20Var.setIsTablet(e40.f45185x5);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (e40Var.u1()) {
            L = org.telegram.messenger.g0.L(72.0f);
        } else {
            L = org.telegram.messenger.g0.L(245.0f);
        }
        int i25 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b20Var.getLayoutParams();
        if (e40.f45185x5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e40Var.f45188a2[i26].getLayoutParams();
            if (e40.f45185x5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (qj0Var != null) {
            ((FrameLayout.LayoutParams) qj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (e40Var.u1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
        if (e40.f45185x5) {
            if (e40Var.f45297z4) {
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
            if (e40.f45184w5) {
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
        if (e40.f45184w5 && !e40.f45185x5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (e40.f45185x5) {
                if (e40Var.f45297z4) {
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
            if (e40.f45185x5) {
                if (e40Var.f45297z4) {
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
        if (e40.f45184w5) {
            x10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            x10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) e40Var.l1.getLayoutParams();
        if (e40.f45185x5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f12);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            if (e40Var.f45297z4) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (e40.f45184w5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (e40.f45184w5 && !e40.f45185x5) {
            ((FrameLayout.LayoutParams) b30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
        } else {
            ((FrameLayout.LayoutParams) b30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) x10Var.getLayoutParams();
        if (e40.f45184w5) {
            if (((v4.b0) x10Var.getLayoutManager()).f57025o != 1) {
                ((v4.b0) x10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.b0) x10Var.getLayoutManager()).f57025o != 0) {
                ((v4.b0) x10Var.getLayoutManager()).j1(0);
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
        if (e40.f45185x5) {
            b10 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, i25 - max, 0);
        }
        if (m30Var.getPaddingTop() != b10 || m30Var.getPaddingBottom() != L2) {
            m30Var.setPadding(i13, b10, i13, L2);
        }
        c40 c40Var = e40Var.f45267s3;
        if (c40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) c40Var.getLayoutParams();
            int O0 = e40.O0(e40Var, b10);
            if (O0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = O0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        t30 t30Var = e40Var.L2;
        if (t30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r g12 = e40Var.g1();
            if (g12 != null) {
                layoutParams10.height = g12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = g12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L6 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L6;
                layoutParams10.rightMargin = L6;
            }
        }
        if (l5Var2 != null) {
            int L7 = ((org.telegram.messenger.g0.L(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) l5Var.getLayoutParams();
            layoutParams11.topMargin = L7 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) l5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) e40Var.M1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    l5Var.setVisibility(0);
                    l5Var2.setVisibility(0);
                    layoutParams13.topMargin = L7;
                }
            }
            l5Var.setVisibility(4);
            l5Var2.setVisibility(4);
            layoutParams13.topMargin = L7 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i28)).g(b20Var.f39382b, true);
        }
        this.f47177f0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.f47179h0) {
            this.f47179h0 = measuredHeight;
            e40Var.f1(false);
        }
        e40Var.f45222i4.f39463f = getMeasuredWidth();
        e40Var.a1();
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
        if (this.f47177f0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.m0.W1();
    }
}
