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
public final class d30 extends org.telegram.ui.Components.qt0 {
    public boolean f44524g0;
    public final RectF f44525h0;
    public int f44526i0;
    public boolean f44527j0;
    public boolean f44528k0;
    public boolean f44529l0;
    public final HashMap m0;
    public final x30 f44530n0;

    public d30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f44530n0 = x30Var;
        this.f44524g0 = false;
        this.f44525h0 = new RectF();
        this.m0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x30 x30Var = this.f44530n0;
        h10 h10Var = x30Var.m1;
        q10 q10Var = x30Var.f51733e4;
        f30 f30Var = x30Var.I1;
        u10 u10Var = x30Var.S3;
        if (x30Var.f51757k4) {
            if (view == f30Var) {
                int childCount = f30Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = f30Var.getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == u10Var || view == h10Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (x30.f51714y5 || u10Var.f39672c != 1.0f || (view != x30Var.G1 && view != x30Var.Y1 && view != x30Var.F1 && view != x30Var.W2 && view != x30Var.f51789r3 && view != x30Var.M2)) {
            if (x30Var.f51817x4 && view == u10Var) {
                canvas.save();
                canvas.translate(q10Var.getX() + u10Var.getX(), q10Var.getY() + u10Var.getY());
                q10Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != x30Var.f51804u4 && view != x30Var.W3 && view != x30Var.P4 && (!x30Var.f51729d4 || !x30Var.Y3 || (view != f30Var && view != h10Var && view != x30Var.U1))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44530n0.R1.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44530n0.R1.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        int L2 = org.telegram.messenger.g0.L(74.0f);
        x30 x30Var = this.f44530n0;
        ImageReceiver imageReceiver = x30Var.R1;
        Drawable drawable = x30Var.X1;
        u10 u10Var = x30Var.S3;
        float f11 = x30Var.f51783q2 - L2;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i3 = x30Var.f28617t0;
        int i10 = L3 + i3;
        if (i3 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - x30Var.f28617t0) / ((L2 - x30Var.f28617t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        x30Var.T1();
        if (u10Var.f39672c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(x30Var.N3);
                float L4 = x30Var.f28617t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.f44525h0;
                rectF.set(x30Var.f28618u0, x30Var.f28617t0 + paddingTop, getMeasuredWidth() - x30Var.f28618u0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28171t0);
            }
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(Color.argb((int) (x30Var.G1.getAlpha() * 255.0f), (int) (Color.red(x30Var.N3) * 0.8f), (int) (Color.green(x30Var.N3) * 0.8f), (int) (Color.blue(x30Var.N3) * 0.8f)));
            canvas.drawRect(x30Var.f28618u0, 0.0f, getMeasuredWidth() - x30Var.f28618u0, (int) ((1.0f - x30Var.T0) * x30Var.f28602h0), org.telegram.ui.ActionBar.k6.f28171t0);
            o20 o20Var = x30Var.f51788r2;
            if (o20Var != null) {
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(o20Var.getBackgroundColor());
                canvas.drawRect(x30Var.f28618u0, 0.0f, getMeasuredWidth() - x30Var.f28618u0, (int) ((1.0f - x30Var.T0) * x30Var.f28602h0), org.telegram.ui.ActionBar.k6.f28171t0);
            }
        }
        if (u10Var.f39672c != 0.0f) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false), (int) (u10Var.f39672c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28171t0);
        }
        if (x30Var.t1() && org.telegram.messenger.lc.e(512)) {
            if (u10Var.f39672c < 0.15d) {
                if (!x30Var.f51790r4) {
                    x30Var.f51790r4 = true;
                    x30Var.B1();
                }
            } else if (x30Var.f51790r4) {
                x30Var.f51790r4 = false;
                org.telegram.messenger.g0.r(x30Var.f51794s4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x30 x30Var = this.f44530n0;
        x10 x10Var = x30Var.f51804u4;
        if (x30Var.P4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            float x11 = x30Var.W3.getX();
            float y10 = x30Var.W3.getY();
            float x12 = x30Var.W3.getX() + x30Var.W3.getMeasuredWidth();
            float y11 = x30Var.W3.getY() + x30Var.W3.getMeasuredHeight();
            RectF rectF = this.f44525h0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y9);
            rectF.set(x10Var.getX(), x10Var.getY(), x10Var.getX() + x10Var.getMeasuredWidth(), x10Var.getY() + x10Var.getMeasuredWidth() + x30Var.P4.getMeasuredHeight());
            if (rectF.contains(x10, y9)) {
                z10 = false;
            }
            if (z10) {
                x30Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && x30Var.f51783q2 != 0.0f && motionEvent.getY() < x30Var.f51783q2 - org.telegram.messenger.g0.L(37.0f) && x30Var.G1.getAlpha() == 0.0f && !x30Var.X3 && x30Var.f51788r2 == null && !x30Var.S3.f39670b) {
            x30Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        x30 x30Var = this.f44530n0;
        if (x30Var.P4 != null && i3 == 4) {
            x30Var.f1(true);
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        x30 x30Var = this.f44530n0;
        View view = x30Var.C4;
        View view2 = x30Var.B4;
        h10 h10Var = x30Var.m1;
        u10 u10Var = x30Var.S3;
        f30 f30Var = x30Var.I1;
        if (x30.f51714y5 && this.f44528k0 != x30Var.A4 && this.f44529l0) {
            f10 = f30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.f44528k0 = x30Var.A4;
        u10Var.f39692s = true;
        super.onLayout(z10, i3, i10, i11, i12);
        u10Var.f39692s = false;
        x30.P0(x30Var);
        this.f44529l0 = true;
        if (z11 && f30Var.getLeft() != f10) {
            float left = f10 - f30Var.getLeft();
            f30Var.setTranslationX(left);
            h10Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = f30Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
            duration.setInterpolator(xqVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
            h10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
        x30 x30Var = this.f44530n0;
        e20 e20Var = x30Var.f51818y1;
        n10 n10Var = x30Var.F1;
        LinearLayout linearLayout = x30Var.f51789r3;
        u20 u20Var = x30Var.G1;
        a40 a40Var = x30Var.f51741g4;
        org.telegram.ui.Components.e10 e10Var = x30Var.f51745h4;
        org.telegram.ui.Components.iy iyVar = x30Var.Q1;
        org.telegram.ui.Components.voip.c2 c2Var = x30Var.f51796t1;
        org.telegram.ui.ActionBar.k5 k5Var = x30Var.M1;
        View view = x30Var.Y1;
        h10 h10Var = x30Var.m1;
        View view2 = x30Var.C4;
        View view3 = x30Var.B4;
        ArrayList arrayList = x30Var.Q3;
        org.telegram.ui.ActionBar.k5 k5Var2 = x30Var.O1;
        c20 c20Var = x30Var.f51822z1;
        ArrayList arrayList2 = x30Var.R3;
        org.telegram.ui.Components.tj0 tj0Var = x30Var.f51737f4;
        f30 f30Var = x30Var.I1;
        u10 u10Var = x30Var.S3;
        q10 q10Var = x30Var.f51733e4;
        int size = View.MeasureSpec.getSize(i10);
        this.f44524g0 = true;
        if (View.MeasureSpec.getSize(i3) > size && !org.telegram.messenger.g0.Q1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i3);
        u10Var.getClass();
        if (org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i3) > size && !x30Var.t1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (x30.f51713x5 != z10) {
            x30.f51713x5 = z10;
            if (c2Var.getMeasuredWidth() == 0) {
                int i23 = c2Var.getLayoutParams().width;
            }
            if (x30Var.t1()) {
                if (!u10Var.W && u10Var.f39670b && (x30.f51713x5 == x30Var.s1() || org.telegram.messenger.g0.Q1())) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                Boolean bool = x30Var.f51722b4;
                if (bool == null || z16 != bool.booleanValue()) {
                    int systemUiVisibility = x30Var.f28586b.getSystemUiVisibility();
                    boolean z17 = z16;
                    if (z17) {
                        i22 = systemUiVisibility & (-7);
                        x30Var.getWindow().clearFlags(1024);
                        x30Var.B0(false);
                    } else {
                        x30Var.B0(true);
                        i22 = systemUiVisibility | 6;
                        x30Var.getWindow().addFlags(1024);
                    }
                    x30Var.f28586b.setSystemUiVisibility(i22);
                    x30Var.f51722b4 = Boolean.valueOf(z17);
                    x30Var.K4 = !z17;
                    x30Var.f28586b.requestApplyInsets();
                }
            } else {
                x30Var.W = false;
            }
            if (x30.f51713x5) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            iyVar.y1(i20);
            f30Var.a0();
            q10Var.a0();
            this.f44527j0 = true;
            TextView textView = x30Var.K1;
            if (textView != null) {
                if (!x30.f51713x5) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (x30Var.s1() == z10 && x30Var.t1() && !u10Var.f39670b && !x30Var.S2.f25052f.isEmpty()) {
                x30Var.g1((org.telegram.messenger.s3) x30Var.S2.f25052f.get(0));
                u10Var.e();
            }
        }
        if (x30.f51714y5 != z11) {
            x30.f51714y5 = z11;
            if (z11) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            tj0Var.setVisibility(i19);
            f30Var.a0();
            q10Var.a0();
            z12 = true;
            this.f44527j0 = true;
        } else {
            z12 = true;
        }
        if (this.f44527j0) {
            x30Var.Q0(z12);
            x30Var.H1.f();
            e10Var.G(tj0Var, false);
            if (x30.f51714y5) {
                a40Var.I(tj0Var, false);
            }
            if (x30.f51714y5) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            tj0Var.setVisibility(i15);
            if (x30.f51714y5 && !u10Var.f39670b) {
                z13 = true;
            } else {
                z13 = false;
            }
            a40Var.H(tj0Var, z13, true);
            boolean z18 = x30.f51714y5;
            if (z18 && !u10Var.f39670b) {
                z14 = false;
            } else {
                z14 = true;
            }
            x30Var.H4 = z14;
            if (!z18 && u10Var.f39670b) {
                z15 = true;
            } else {
                z15 = false;
            }
            e10Var.F(q10Var, z15);
            if (z15) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            q10Var.setVisibility(i16);
            if (!x30.f51714y5 && u10Var.f39670b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            f30Var.setVisibility(i17);
            if (x30.f51713x5) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            iyVar.y1(i18);
            x30Var.Q1(false, false);
            f30Var.a0();
            q10Var.a0();
            org.telegram.messenger.g0.b4(f30Var);
            this.f44527j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            u10Var.setIsTablet(x30.f51714y5);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.r) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (x30Var.t1()) {
            L = org.telegram.messenger.g0.L(72.0f);
        } else {
            L = org.telegram.messenger.g0.L(245.0f);
        }
        int i25 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u10Var.getLayoutParams();
        if (x30.f51714y5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x30Var.f51720b2[i26].getLayoutParams();
            if (x30.f51714y5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (tj0Var != null) {
            ((FrameLayout.LayoutParams) tj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (c20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) c20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (x30Var.t1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) f30Var.getLayoutParams();
        if (x30.f51714y5) {
            if (x30Var.A4) {
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
            if (x30.f51713x5) {
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
        if (x30.f51713x5 && !x30.f51714y5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (x30.f51714y5) {
                if (x30Var.A4) {
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
            if (x30.f51714y5) {
                if (x30Var.A4) {
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
        if (x30.f51713x5) {
            q10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            q10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) h10Var.getLayoutParams();
        if (x30.f51714y5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f12);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            if (x30Var.A4) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (x30.f51713x5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (x30.f51713x5 && !x30.f51714y5) {
            ((FrameLayout.LayoutParams) u20Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) n10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
        } else {
            ((FrameLayout.LayoutParams) u20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) n10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) q10Var.getLayoutParams();
        if (x30.f51713x5) {
            if (((u4.b0) q10Var.getLayoutManager()).f55509o != 1) {
                ((u4.b0) q10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((u4.b0) q10Var.getLayoutManager()).f55509o != 0) {
                ((u4.b0) q10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        e20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) e20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (c20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) c20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (i25 / 5) * 3);
        if (x30.f51714y5) {
            b10 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, i25 - max, 0);
        }
        if (f30Var.getPaddingTop() != b10 || f30Var.getPaddingBottom() != L2) {
            f30Var.setPadding(i13, b10, i13, L2);
        }
        v30 v30Var = x30Var.f51798t3;
        if (v30Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) v30Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O0 = x30.O0(x30Var);
            if (O0 != null) {
                int measuredHeight = ((h10Var.getMeasuredHeight() / 2) + h10Var.getTop()) - (x30Var.f51787r1.getMeasuredHeight() / 2);
                int measuredHeight2 = O0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = k2.p1.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        m30 m30Var = x30Var.M2;
        if (m30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O02 = x30.O0(x30Var);
            if (O02 != null) {
                layoutParams10.height = O02.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = O02.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L6 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L6;
                layoutParams10.rightMargin = L6;
            }
        }
        if (k5Var2 != null) {
            int L7 = ((org.telegram.messenger.g0.L(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) k5Var.getLayoutParams();
            layoutParams11.topMargin = L7 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) k5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) x30Var.N1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    k5Var.setVisibility(0);
                    k5Var2.setVisibility(0);
                    layoutParams13.topMargin = L7;
                }
            }
            k5Var.setVisibility(4);
            k5Var2.setVisibility(4);
            layoutParams13.topMargin = L7 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i28)).g(u10Var.f39670b, true);
        }
        this.f44524g0 = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f44526i0) {
            this.f44526i0 = measuredHeight3;
            x30Var.f1(false);
        }
        x30Var.f51753j4.f39349f = getMeasuredWidth();
        x30Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44530n0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f44524g0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f44530n0.T1();
    }
}
