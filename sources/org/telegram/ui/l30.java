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
public final class l30 extends org.telegram.ui.Components.st0 {
    public boolean f47497f0;
    public final RectF f47498g0;
    public int f47499h0;
    public boolean f47500i0;
    public boolean f47501j0;
    public boolean f47502k0;
    public final HashMap f47503l0;
    public final f40 m0;

    public l30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = f40Var;
        this.f47497f0 = false;
        this.f47498g0 = new RectF();
        this.f47503l0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f40 f40Var = this.m0;
        p10 p10Var = f40Var.f45559o1;
        y10 y10Var = f40Var.f45529g4;
        n30 n30Var = f40Var.K1;
        c20 c20Var = f40Var.U3;
        if (f40Var.f45553m4) {
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
            if (view == c20Var || view == p10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (f40.A5 || c20Var.f39304c != 1.0f || (view != f40Var.I1 && view != f40Var.f45504a2 && view != f40Var.H1 && view != f40Var.Y2 && view != f40Var.f45584t3 && view != f40Var.O2)) {
            if (f40Var.f45613z4 && view == c20Var) {
                canvas.save();
                canvas.translate(y10Var.getX() + c20Var.getX(), y10Var.getY() + c20Var.getY());
                y10Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != f40Var.f45600w4 && view != f40Var.Y3 && view != f40Var.R4 && (!f40Var.f45525f4 || !f40Var.f45506a4 || (view != n30Var && view != p10Var && view != f40Var.W1))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.T1.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.T1.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        int L2 = org.telegram.messenger.g0.L(74.0f);
        f40 f40Var = this.m0;
        ImageReceiver imageReceiver = f40Var.T1;
        Drawable drawable = f40Var.Z1;
        c20 c20Var = f40Var.U3;
        float f11 = f40Var.f45579s2 - L2;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = f40Var.f28704s0;
        int i10 = L3 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f11) - f40Var.f28704s0) / ((L2 - f40Var.f28704s0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        f40Var.W1();
        if (c20Var.f39304c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(f40Var.P3);
                float L4 = f40Var.f28704s0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.f47498g0;
                rectF.set(f40Var.f28705t0, f40Var.f28704s0 + paddingTop, getMeasuredWidth() - f40Var.f28705t0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f28181t0);
            }
            org.telegram.ui.ActionBar.m6.f28181t0.setColor(Color.argb((int) (f40Var.I1.getAlpha() * 255.0f), (int) (Color.red(f40Var.P3) * 0.8f), (int) (Color.green(f40Var.P3) * 0.8f), (int) (Color.blue(f40Var.P3) * 0.8f)));
            canvas.drawRect(f40Var.f28705t0, 0.0f, getMeasuredWidth() - f40Var.f28705t0, (int) ((1.0f - f40Var.S0) * f40Var.f28686g0), org.telegram.ui.ActionBar.m6.f28181t0);
            w20 w20Var = f40Var.f45583t2;
            if (w20Var != null) {
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(w20Var.getBackgroundColor());
                canvas.drawRect(f40Var.f28705t0, 0.0f, getMeasuredWidth() - f40Var.f28705t0, (int) ((1.0f - f40Var.S0) * f40Var.f28686g0), org.telegram.ui.ActionBar.m6.f28181t0);
            }
        }
        if (c20Var.f39304c != 0.0f) {
            org.telegram.ui.ActionBar.m6.f28181t0.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false), (int) (c20Var.f39304c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f28181t0);
        }
        if (f40Var.u1() && org.telegram.messenger.sc.e(512)) {
            if (c20Var.f39304c < 0.15d) {
                if (!f40Var.f45585t4) {
                    f40Var.f45585t4 = true;
                    f40Var.E1();
                }
            } else if (f40Var.f45585t4) {
                f40Var.f45585t4 = false;
                org.telegram.messenger.g0.r(f40Var.f45590u4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f40 f40Var = this.m0;
        f20 f20Var = f40Var.f45600w4;
        if (f40Var.R4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = f40Var.Y3.getX();
            float y11 = f40Var.Y3.getY();
            float x12 = f40Var.Y3.getX() + f40Var.Y3.getMeasuredWidth();
            float y12 = f40Var.Y3.getY() + f40Var.Y3.getMeasuredHeight();
            RectF rectF = this.f47498g0;
            rectF.set(x11, y11, x12, y12);
            boolean z9 = !rectF.contains(x10, y10);
            rectF.set(f20Var.getX(), f20Var.getY(), f20Var.getX() + f20Var.getMeasuredWidth(), f20Var.getY() + f20Var.getMeasuredWidth() + f40Var.R4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z9 = false;
            }
            if (z9) {
                f40Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && f40Var.f45579s2 != 0.0f && motionEvent.getY() < f40Var.f45579s2 - org.telegram.messenger.g0.L(37.0f) && f40Var.I1.getAlpha() == 0.0f && !f40Var.Z3 && f40Var.f45583t2 == null && !f40Var.U3.f39302b) {
            f40Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        f40 f40Var = this.m0;
        if (f40Var.R4 != null && i7 == 4) {
            f40Var.f1(true);
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        float f10;
        int O0;
        f40 f40Var = this.m0;
        View view = f40Var.E4;
        View view2 = f40Var.D4;
        p10 p10Var = f40Var.f45559o1;
        d40 d40Var = f40Var.f45594v3;
        c20 c20Var = f40Var.U3;
        n30 n30Var = f40Var.K1;
        if (f40.A5 && this.f47501j0 != f40Var.C4 && this.f47502k0) {
            f10 = n30Var.getX();
            z10 = true;
        } else {
            z10 = false;
            f10 = 0.0f;
        }
        this.f47501j0 = f40Var.C4;
        c20Var.f39324s = true;
        super.onLayout(z9, i7, i10, i11, i12);
        c20Var.f39324s = false;
        f40.P0(f40Var);
        this.f47502k0 = true;
        if (d40Var != null && (O0 = f40.O0(f40Var, n30Var.getPaddingTop())) != Integer.MIN_VALUE && O0 != ((FrameLayout.LayoutParams) d40Var.getLayoutParams()).topMargin) {
            post(new kz(this, 6));
        }
        if (z10 && n30Var.getLeft() != f10) {
            float left = f10 - n30Var.getLeft();
            n30Var.setTranslationX(left);
            p10Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = n30Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
            duration.setInterpolator(wqVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(wqVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(wqVar).start();
            p10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(wqVar).start();
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
        f40 f40Var = this.m0;
        m20 m20Var = f40Var.A1;
        v10 v10Var = f40Var.H1;
        LinearLayout linearLayout = f40Var.f45584t3;
        c30 c30Var = f40Var.I1;
        i40 i40Var = f40Var.f45537i4;
        org.telegram.ui.Components.h10 h10Var = f40Var.f45540j4;
        org.telegram.ui.Components.ky kyVar = f40Var.S1;
        org.telegram.ui.Components.voip.n2 n2Var = f40Var.f45592v1;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.O1;
        View view = f40Var.f45504a2;
        View view2 = f40Var.E4;
        View view3 = f40Var.D4;
        ArrayList arrayList = f40Var.S3;
        org.telegram.ui.ActionBar.m5 m5Var2 = f40Var.Q1;
        k20 k20Var = f40Var.B1;
        ArrayList arrayList2 = f40Var.T3;
        org.telegram.ui.Components.pj0 pj0Var = f40Var.f45533h4;
        n30 n30Var = f40Var.K1;
        c20 c20Var = f40Var.U3;
        y10 y10Var = f40Var.f45529g4;
        int size = View.MeasureSpec.getSize(i10);
        this.f47497f0 = true;
        if (View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1()) {
            z9 = true;
        } else {
            z9 = false;
        }
        LaunchActivity launchActivity = f40Var.f45512c2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z9 = f40.f45503z5;
        }
        View.MeasureSpec.getSize(i7);
        c20Var.getClass();
        if (org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !f40Var.u1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f40.f45503z5 != z9) {
            f40.f45503z5 = z9;
            if (n2Var.getMeasuredWidth() == 0) {
                int i23 = n2Var.getLayoutParams().width;
            }
            if (f40Var.u1()) {
                if (!c20Var.V && c20Var.f39302b && (f40.f45503z5 == f40Var.t1() || org.telegram.messenger.g0.Q1())) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                Boolean bool = f40Var.f45517d4;
                if (bool == null || z15 != bool.booleanValue()) {
                    int systemUiVisibility = f40Var.f28672b.getSystemUiVisibility();
                    boolean z16 = z15;
                    if (z16) {
                        i22 = systemUiVisibility & (-7);
                        f40Var.getWindow().clearFlags(1024);
                        f40Var.B0(false);
                    } else {
                        f40Var.B0(true);
                        i22 = systemUiVisibility | 6;
                        f40Var.getWindow().addFlags(1024);
                    }
                    f40Var.f28672b.setSystemUiVisibility(i22);
                    f40Var.f45517d4 = Boolean.valueOf(z16);
                    f40Var.M4 = !z16;
                    f40Var.f28672b.requestApplyInsets();
                }
            } else {
                f40Var.V = false;
            }
            if (f40.f45503z5) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            kyVar.y1(i20);
            n30Var.a0();
            y10Var.a0();
            this.f47500i0 = true;
            TextView textView = f40Var.M1;
            if (textView != null) {
                if (!f40.f45503z5) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (f40Var.t1() == z9 && f40Var.u1() && !c20Var.f39302b && !f40Var.U2.f25229f.isEmpty()) {
                f40Var.h1((org.telegram.messenger.s3) f40Var.U2.f25229f.get(0));
                c20Var.e();
            }
        }
        if (f40.A5 != z10) {
            f40.A5 = z10;
            if (z10) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            pj0Var.setVisibility(i19);
            n30Var.a0();
            y10Var.a0();
            z11 = true;
            this.f47500i0 = true;
        } else {
            z11 = true;
        }
        if (this.f47500i0) {
            f40Var.Q0(z11);
            f40Var.J1.f();
            h10Var.G(pj0Var, false);
            if (f40.A5) {
                i40Var.I(pj0Var, false);
            }
            if (f40.A5) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            pj0Var.setVisibility(i15);
            if (f40.A5 && !c20Var.f39302b) {
                z12 = true;
            } else {
                z12 = false;
            }
            i40Var.H(pj0Var, z12, true);
            boolean z17 = f40.A5;
            if (z17 && !c20Var.f39302b) {
                z13 = false;
            } else {
                z13 = true;
            }
            f40Var.J4 = z13;
            if (!z17 && c20Var.f39302b) {
                z14 = true;
            } else {
                z14 = false;
            }
            h10Var.F(y10Var, z14);
            if (z14) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            y10Var.setVisibility(i16);
            if (!f40.A5 && c20Var.f39302b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            n30Var.setVisibility(i17);
            if (f40.f45503z5) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            kyVar.y1(i18);
            f40Var.T1(false, false);
            n30Var.a0();
            y10Var.a0();
            org.telegram.messenger.g0.b4(n30Var);
            this.f47500i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            c20Var.setIsTablet(f40.A5);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (f40Var.u1()) {
            L = org.telegram.messenger.g0.L(72.0f);
        } else {
            L = org.telegram.messenger.g0.L(245.0f);
        }
        int i25 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c20Var.getLayoutParams();
        if (f40.A5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f40Var.d2[i26].getLayoutParams();
            if (f40.A5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (pj0Var != null) {
            ((FrameLayout.LayoutParams) pj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (f40Var.u1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (f40.A5) {
            if (f40Var.C4) {
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
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            L2 = org.telegram.messenger.g0.L(60.0f);
            f11 = 90.0f;
        } else {
            f11 = 90.0f;
            if (f40.f45503z5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.g0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.g0.L(14.0f);
                L2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L2 = org.telegram.messenger.g0.L(60.0f);
                layoutParams3.bottomMargin = L3;
                layoutParams3.topMargin = org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L5 = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.leftMargin = L5;
                layoutParams3.rightMargin = L5;
            }
        }
        int i27 = 81;
        if (f40.f45503z5 && !f40.A5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (f40.A5) {
                if (f40Var.C4) {
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
            if (f40.A5) {
                if (f40Var.C4) {
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
        if (f40.f45503z5) {
            y10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            y10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) f40Var.f45559o1.getLayoutParams();
        if (f40.A5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f12);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            if (f40Var.C4) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (f40.f45503z5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (f40.f45503z5 && !f40.A5) {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) v10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
        } else {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) v10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) y10Var.getLayoutParams();
        if (f40.f45503z5) {
            if (((v4.b0) y10Var.getLayoutManager()).f57021o != 1) {
                ((v4.b0) y10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.b0) y10Var.getLayoutManager()).f57021o != 0) {
                ((v4.b0) y10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        m20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) m20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (i25 / 5) * 3);
        if (f40.A5) {
            b10 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, i25 - max, 0);
        }
        if (n30Var.getPaddingTop() != b10 || n30Var.getPaddingBottom() != L2) {
            n30Var.setPadding(i13, b10, i13, L2);
        }
        d40 d40Var = f40Var.f45594v3;
        if (d40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) d40Var.getLayoutParams();
            int O0 = f40.O0(f40Var, b10);
            if (O0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = O0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        u30 u30Var = f40Var.O2;
        if (u30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r g12 = f40Var.g1();
            if (g12 != null) {
                layoutParams10.height = g12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = g12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) f40Var.P1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
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
            ((org.telegram.ui.Components.voip.y) arrayList.get(i28)).g(c20Var.f39302b, true);
        }
        this.f47497f0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.f47499h0) {
            this.f47499h0 = measuredHeight;
            f40Var.f1(false);
        }
        f40Var.f45548l4.f39383f = getMeasuredWidth();
        f40Var.a1();
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
        if (this.f47497f0) {
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
