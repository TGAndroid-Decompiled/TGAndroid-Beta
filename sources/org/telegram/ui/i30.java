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
public final class i30 extends org.telegram.ui.Components.st0 {
    public boolean f47879g0;
    public final RectF f47880h0;
    public int f47881i0;
    public boolean f47882j0;
    public boolean f47883k0;
    public boolean f47884l0;
    public final HashMap m0;
    public final c40 f47885n0;

    public i30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f47885n0 = c40Var;
        this.f47879g0 = false;
        this.f47880h0 = new RectF();
        this.m0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i30.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c40 c40Var = this.f47885n0;
        l10 l10Var = c40Var.f45944p1;
        u10 u10Var = c40Var.f45929l4;
        k30 k30Var = c40Var.L1;
        y10 y10Var = c40Var.Z3;
        if (c40Var.f45957r4) {
            if (view == k30Var) {
                int childCount = k30Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = k30Var.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == y10Var || view == l10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (c40.F5 || y10Var.f40729c != 1.0f || (view != c40Var.J1 && view != c40Var.f45889b2 && view != c40Var.I1 && view != c40Var.Z2 && view != c40Var.f45990y3 && view != c40Var.P2)) {
            if (c40Var.E4 && view == y10Var) {
                canvas.save();
                canvas.translate(u10Var.getX() + y10Var.getX(), u10Var.getY() + y10Var.getY());
                u10Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != c40Var.B4 && view != c40Var.f45898d4 && view != c40Var.W4 && (!c40Var.f45925k4 || !c40Var.f45906f4 || (view != k30Var && view != l10Var && view != c40Var.X1 && view != c40Var.f45942o3))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47885n0.U1.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47885n0.U1.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        int L2 = org.telegram.messenger.g0.L(74.0f);
        c40 c40Var = this.f47885n0;
        ImageReceiver imageReceiver = c40Var.U1;
        Drawable drawable = c40Var.f45885a2;
        y10 y10Var = c40Var.Z3;
        float f11 = c40Var.f45964t2 - L2;
        int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = c40Var.f29716t0;
        int i10 = L3 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - c40Var.f29716t0) / ((L2 - c40Var.f29716t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        c40Var.Y1();
        if (y10Var.f40729c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f29140t0.setColor(c40Var.U3);
                float L4 = c40Var.f29716t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.f47880h0;
                rectF.set(c40Var.f29717u0, c40Var.f29716t0 + paddingTop, getMeasuredWidth() - c40Var.f29717u0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.f29140t0);
            }
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(Color.argb((int) (c40Var.J1.getAlpha() * 255.0f), (int) (Color.red(c40Var.U3) * 0.8f), (int) (Color.green(c40Var.U3) * 0.8f), (int) (Color.blue(c40Var.U3) * 0.8f)));
            canvas.drawRect(c40Var.f29717u0, 0.0f, getMeasuredWidth() - c40Var.f29717u0, (int) ((1.0f - c40Var.T0) * c40Var.f29698h0), org.telegram.ui.ActionBar.j6.f29140t0);
            t20 t20Var = c40Var.f45969u2;
            if (t20Var != null) {
                org.telegram.ui.ActionBar.j6.f29140t0.setColor(t20Var.getBackgroundColor());
                canvas.drawRect(c40Var.f29717u0, 0.0f, getMeasuredWidth() - c40Var.f29717u0, (int) ((1.0f - c40Var.T0) * c40Var.f29698h0), org.telegram.ui.ActionBar.j6.f29140t0);
            }
        }
        if (y10Var.f40729c != 0.0f) {
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false), (int) (y10Var.f40729c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f29140t0);
        }
        if (c40Var.u1() && org.telegram.messenger.qc.e(512)) {
            if (y10Var.f40729c < 0.15d) {
                if (!c40Var.f45991y4) {
                    c40Var.f45991y4 = true;
                    c40Var.E1();
                }
            } else if (c40Var.f45991y4) {
                c40Var.f45991y4 = false;
                org.telegram.messenger.g0.r(c40Var.f45996z4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c40 c40Var = this.f47885n0;
        b20 b20Var = c40Var.B4;
        if (c40Var.W4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = c40Var.f45898d4.getX();
            float y11 = c40Var.f45898d4.getY();
            float x12 = c40Var.f45898d4.getX() + c40Var.f45898d4.getMeasuredWidth();
            float y12 = c40Var.f45898d4.getY() + c40Var.f45898d4.getMeasuredHeight();
            RectF rectF = this.f47880h0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(b20Var.getX(), b20Var.getY(), b20Var.getX() + b20Var.getMeasuredWidth(), b20Var.getY() + b20Var.getMeasuredWidth() + c40Var.W4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                c40Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && c40Var.f45964t2 != 0.0f && motionEvent.getY() < c40Var.f45964t2 - org.telegram.messenger.g0.L(37.0f) && c40Var.J1.getAlpha() == 0.0f && !c40Var.f45902e4 && c40Var.f45969u2 == null && !c40Var.Z3.f40727b) {
            c40Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        c40 c40Var = this.f47885n0;
        if (c40Var.W4 != null && i7 == 4) {
            c40Var.f1(true);
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        int O0;
        c40 c40Var = this.f47885n0;
        View view = c40Var.J4;
        View view2 = c40Var.I4;
        l10 l10Var = c40Var.f45944p1;
        a40 a40Var = c40Var.A3;
        y10 y10Var = c40Var.Z3;
        k30 k30Var = c40Var.L1;
        if (c40.F5 && this.f47883k0 != c40Var.H4 && this.f47884l0) {
            f10 = k30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.f47883k0 = c40Var.H4;
        y10Var.f40749s = true;
        super.onLayout(z10, i7, i10, i11, i12);
        y10Var.f40749s = false;
        c40.P0(c40Var);
        this.f47884l0 = true;
        if (a40Var != null && (O0 = c40.O0(c40Var, k30Var.getPaddingTop())) != Integer.MIN_VALUE && O0 != ((FrameLayout.LayoutParams) a40Var.getLayoutParams()).topMargin) {
            post(new iz(this, 6));
        }
        if (z11 && k30Var.getLeft() != f10) {
            float left = f10 - k30Var.getLeft();
            k30Var.setTranslationX(left);
            l10Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = k30Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34419f;
            duration.setInterpolator(erVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
            l10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
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
        c40 c40Var = this.f47885n0;
        j20 j20Var = c40Var.B1;
        r10 r10Var = c40Var.I1;
        LinearLayout linearLayout = c40Var.f45990y3;
        a30 a30Var = c40Var.J1;
        f40 f40Var = c40Var.f45938n4;
        org.telegram.ui.Components.l10 l10Var = c40Var.o4;
        org.telegram.ui.Components.py pyVar = c40Var.T1;
        org.telegram.ui.Components.voip.r2 r2Var = c40Var.f45978w1;
        org.telegram.ui.ActionBar.j5 j5Var = c40Var.P1;
        View view = c40Var.f45889b2;
        View view2 = c40Var.J4;
        View view3 = c40Var.I4;
        ArrayList arrayList = c40Var.X3;
        org.telegram.ui.ActionBar.j5 j5Var2 = c40Var.R1;
        h20 h20Var = c40Var.C1;
        ArrayList arrayList2 = c40Var.Y3;
        org.telegram.ui.Components.uj0 uj0Var = c40Var.f45934m4;
        k30 k30Var = c40Var.L1;
        y10 y10Var = c40Var.Z3;
        u10 u10Var = c40Var.f45929l4;
        int size = View.MeasureSpec.getSize(i10);
        this.f47879g0 = true;
        if (View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        LaunchActivity launchActivity = c40Var.d2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z10 = c40.E5;
        }
        View.MeasureSpec.getSize(i7);
        y10Var.getClass();
        if (org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !c40Var.u1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c40.E5 != z10) {
            c40.E5 = z10;
            if (r2Var.getMeasuredWidth() == 0) {
                int i23 = r2Var.getLayoutParams().width;
            }
            if (c40Var.u1()) {
                if (!y10Var.W && y10Var.f40727b && (c40.E5 == c40Var.t1() || org.telegram.messenger.g0.Q1())) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                Boolean bool = c40Var.f45918i4;
                if (bool == null || z16 != bool.booleanValue()) {
                    int systemUiVisibility = c40Var.f29682b.getSystemUiVisibility();
                    boolean z17 = z16;
                    if (z17) {
                        i22 = systemUiVisibility & (-7);
                        c40Var.getWindow().clearFlags(1024);
                        c40Var.B0(false);
                    } else {
                        c40Var.B0(true);
                        i22 = systemUiVisibility | 6;
                        c40Var.getWindow().addFlags(1024);
                    }
                    c40Var.f29682b.setSystemUiVisibility(i22);
                    c40Var.f45918i4 = Boolean.valueOf(z17);
                    c40Var.R4 = !z17;
                    c40Var.f29682b.requestApplyInsets();
                }
            } else {
                c40Var.W = false;
            }
            if (c40.E5) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            pyVar.y1(i20);
            k30Var.a0();
            u10Var.a0();
            this.f47882j0 = true;
            TextView textView = c40Var.N1;
            if (textView != null) {
                if (!c40.E5) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (c40Var.t1() == z10 && c40Var.u1() && !y10Var.f40727b && !c40Var.V2.f26219f.isEmpty()) {
                c40Var.h1((org.telegram.messenger.s3) c40Var.V2.f26219f.get(0));
                y10Var.e();
            }
        }
        if (c40.F5 != z11) {
            c40.F5 = z11;
            if (z11) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            uj0Var.setVisibility(i19);
            k30Var.a0();
            u10Var.a0();
            z12 = true;
            this.f47882j0 = true;
        } else {
            z12 = true;
        }
        if (this.f47882j0) {
            c40Var.Q0(z12);
            c40Var.K1.f();
            l10Var.G(uj0Var, false);
            if (c40.F5) {
                f40Var.I(uj0Var, false);
            }
            if (c40.F5) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            uj0Var.setVisibility(i15);
            if (c40.F5 && !y10Var.f40727b) {
                z13 = true;
            } else {
                z13 = false;
            }
            f40Var.H(uj0Var, z13, true);
            boolean z18 = c40.F5;
            if (z18 && !y10Var.f40727b) {
                z14 = false;
            } else {
                z14 = true;
            }
            c40Var.O4 = z14;
            if (!z18 && y10Var.f40727b) {
                z15 = true;
            } else {
                z15 = false;
            }
            l10Var.F(u10Var, z15);
            if (z15) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            u10Var.setVisibility(i16);
            if (!c40.F5 && y10Var.f40727b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            k30Var.setVisibility(i17);
            if (c40.E5) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            pyVar.y1(i18);
            c40Var.V1(false, false);
            k30Var.a0();
            u10Var.a0();
            org.telegram.messenger.g0.a4(k30Var);
            this.f47882j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            y10Var.setIsTablet(c40.F5);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (c40Var.u1()) {
            L = org.telegram.messenger.g0.L(72.0f);
        } else {
            L = org.telegram.messenger.g0.L(245.0f);
        }
        int i25 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y10Var.getLayoutParams();
        if (c40.F5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c40Var.f45900e2[i26].getLayoutParams();
            if (c40.F5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (uj0Var != null) {
            ((FrameLayout.LayoutParams) uj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (h20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) h20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (c40Var.u1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (c40.F5) {
            if (c40Var.H4) {
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
            if (c40.E5) {
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
        if (c40.E5 && !c40.F5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (c40.F5) {
                if (c40Var.H4) {
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
            if (c40.F5) {
                if (c40Var.H4) {
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
        if (c40.E5) {
            u10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            u10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) c40Var.f45944p1.getLayoutParams();
        if (c40.F5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f12);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            if (c40Var.H4) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (c40.E5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (c40.E5 && !c40.F5) {
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) r10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11);
        } else {
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) r10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) u10Var.getLayoutParams();
        if (c40.E5) {
            if (((v4.b0) u10Var.getLayoutManager()).f58489o != 1) {
                ((v4.b0) u10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.b0) u10Var.getLayoutManager()).f58489o != 0) {
                ((v4.b0) u10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        j20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) j20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (h20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) h20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (i25 / 5) * 3);
        if (c40.F5) {
            b10 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, i25 - max, 0);
        }
        if (k30Var.getPaddingTop() != b10 || k30Var.getPaddingBottom() != L2) {
            k30Var.setPadding(i13, b10, i13, L2);
        }
        a40 a40Var = c40Var.A3;
        if (a40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
            int O0 = c40.O0(c40Var, b10);
            if (O0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = O0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        r30 r30Var = c40Var.P2;
        if (r30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r g12 = c40Var.g1();
            if (g12 != null) {
                layoutParams10.height = g12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = g12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L6 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L6;
                layoutParams10.rightMargin = L6;
            }
        }
        if (j5Var2 != null) {
            int L7 = ((org.telegram.messenger.g0.L(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = L7 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) c40Var.Q1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = L7;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = L7 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i28)).g(y10Var.f40727b, true);
        }
        this.f47879g0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.f47881i0) {
            this.f47881i0 = measuredHeight;
            c40Var.f1(false);
        }
        c40Var.f45952q4.f40798f = getMeasuredWidth();
        c40Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f47885n0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f47879g0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f47885n0.Y1();
    }
}
