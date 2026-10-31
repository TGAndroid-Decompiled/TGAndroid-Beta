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
public final class g40 extends org.telegram.ui.Components.uu0 {
    public boolean f37413f0;
    public final RectF f37414g0;
    public int f37415h0;
    public boolean f37416i0;
    public boolean f37417j0;
    public boolean f37418k0;
    public final HashMap f37419l0;
    public final b50 m0;

    public g40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = b50Var;
        this.f37413f0 = false;
        this.f37414g0 = new RectF();
        this.f37419l0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b50 b50Var = this.m0;
        l20 l20Var = b50Var.l1;
        u20 u20Var = b50Var.f36008d4;
        i40 i40Var = b50Var.H1;
        y20 y20Var = b50Var.R3;
        if (b50Var.f36034j4) {
            if (view == i40Var) {
                int childCount = i40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == y20Var || view == l20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (b50.f35992x5 || y20Var.f31714c != 1.0f || (view != b50Var.F1 && view != b50Var.X1 && view != b50Var.E1 && view != b50Var.V2 && view != b50Var.f36065q3 && view != b50Var.L2)) {
            if (b50Var.f36094w4 && view == y20Var) {
                canvas.save();
                canvas.translate(u20Var.getX() + y20Var.getX(), u20Var.getY() + y20Var.getY());
                u20Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != b50Var.f36081t4 && view != b50Var.V3 && view != b50Var.O4 && (!b50Var.f36004c4 || !b50Var.X3 || (view != i40Var && view != l20Var && view != b50Var.T1))) {
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
        b50 b50Var = this.m0;
        ImageReceiver imageReceiver = b50Var.Q1;
        Drawable drawable = b50Var.W1;
        y20 y20Var = b50Var.R3;
        float f10 = b50Var.f36060p2 - L2;
        int L3 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
        int i10 = b50Var.f21614s0;
        int i11 = L3 + i10;
        if (i10 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - b50Var.f21614s0) / ((L2 - b50Var.f21614s0) - org.telegram.messenger.i0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L) * min);
            f10 -= currentActionBarHeight;
            i11 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        b50Var.T1();
        if (y20Var.f31714c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i11);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f21217t0.setColor(b50Var.M3);
                float L4 = b50Var.f21614s0 + paddingTop + org.telegram.messenger.i0.L(24.0f);
                RectF rectF = this.f37414g0;
                rectF.set(b50Var.f21615t0, b50Var.f21614s0 + paddingTop, getMeasuredWidth() - b50Var.f21615t0, L4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21217t0);
            }
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(Color.argb((int) (b50Var.F1.getAlpha() * 255.0f), (int) (Color.red(b50Var.M3) * 0.8f), (int) (Color.green(b50Var.M3) * 0.8f), (int) (Color.blue(b50Var.M3) * 0.8f)));
            canvas.drawRect(b50Var.f21615t0, 0.0f, getMeasuredWidth() - b50Var.f21615t0, (int) ((1.0f - b50Var.S0) * b50Var.f21599g0), org.telegram.ui.ActionBar.t6.f21217t0);
            s30 s30Var = b50Var.f36064q2;
            if (s30Var != null) {
                org.telegram.ui.ActionBar.t6.f21217t0.setColor(s30Var.getBackgroundColor());
                canvas.drawRect(b50Var.f21615t0, 0.0f, getMeasuredWidth() - b50Var.f21615t0, (int) ((1.0f - b50Var.S0) * b50Var.f21599g0), org.telegram.ui.ActionBar.t6.f21217t0);
            }
        }
        if (y20Var.f31714c != 0.0f) {
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false), (int) (y20Var.f31714c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21217t0);
        }
        if (b50Var.t1() && org.telegram.messenger.sc.e(512)) {
            if (y20Var.f31714c < 0.15d) {
                if (!b50Var.f36066q4) {
                    b50Var.f36066q4 = true;
                    b50Var.B1();
                }
            } else if (b50Var.f36066q4) {
                b50Var.f36066q4 = false;
                org.telegram.messenger.i0.r(b50Var.f36071r4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b50 b50Var = this.m0;
        b30 b30Var = b50Var.f36081t4;
        if (b50Var.O4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = b50Var.V3.getX();
            float y10 = b50Var.V3.getY();
            float x12 = b50Var.V3.getX() + b50Var.V3.getMeasuredWidth();
            float y11 = b50Var.V3.getY() + b50Var.V3.getMeasuredHeight();
            RectF rectF = this.f37414g0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(b30Var.getX(), b30Var.getY(), b30Var.getX() + b30Var.getMeasuredWidth(), b30Var.getY() + b30Var.getMeasuredWidth() + b50Var.O4.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                b50Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && b50Var.f36060p2 != 0.0f && motionEvent.getY() < b50Var.f36060p2 - org.telegram.messenger.i0.L(37.0f) && b50Var.F1.getAlpha() == 0.0f && !b50Var.W3 && b50Var.f36064q2 == null && !b50Var.R3.f31712b) {
            b50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        b50 b50Var = this.m0;
        if (b50Var.O4 != null && i10 == 4) {
            b50Var.f1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        b50 b50Var = this.m0;
        View view = b50Var.B4;
        View view2 = b50Var.A4;
        l20 l20Var = b50Var.l1;
        y20 y20Var = b50Var.R3;
        i40 i40Var = b50Var.H1;
        if (b50.f35992x5 && this.f37417j0 != b50Var.f36105z4 && this.f37418k0) {
            f7 = i40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.f37417j0 = b50Var.f36105z4;
        y20Var.f31733s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        y20Var.f31733s = false;
        b50.P0(b50Var);
        this.f37418k0 = true;
        if (z11 && i40Var.getLeft() != f7) {
            float left = f7 - i40Var.getLeft();
            i40Var.setTranslationX(left);
            l20Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = i40Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
            duration.setInterpolator(grVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
            l20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
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
        b50 b50Var = this.m0;
        i30 i30Var = b50Var.f36095x1;
        r20 r20Var = b50Var.E1;
        LinearLayout linearLayout = b50Var.f36065q3;
        y30 y30Var = b50Var.F1;
        e50 e50Var = b50Var.f36016f4;
        org.telegram.ui.Components.z10 z10Var = b50Var.f36020g4;
        org.telegram.ui.Components.zy zyVar = b50Var.P1;
        org.telegram.ui.Components.voip.b2 b2Var = b50Var.f36073s1;
        org.telegram.ui.ActionBar.u5 u5Var = b50Var.L1;
        View view = b50Var.X1;
        l20 l20Var = b50Var.l1;
        View view2 = b50Var.B4;
        View view3 = b50Var.A4;
        ArrayList arrayList = b50Var.P3;
        org.telegram.ui.ActionBar.u5 u5Var2 = b50Var.N1;
        g30 g30Var = b50Var.f36099y1;
        ArrayList arrayList2 = b50Var.Q3;
        org.telegram.ui.Components.tk0 tk0Var = b50Var.f36012e4;
        i40 i40Var = b50Var.H1;
        y20 y20Var = b50Var.R3;
        u20 u20Var = b50Var.f36008d4;
        int size = View.MeasureSpec.getSize(i11);
        this.f37413f0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !org.telegram.messenger.i0.Q1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        y20Var.getClass();
        if (org.telegram.messenger.i0.Q1() && View.MeasureSpec.getSize(i10) > size && !b50Var.t1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (b50.f35991w5 != z10) {
            b50.f35991w5 = z10;
            if (b2Var.getMeasuredWidth() == 0) {
                int i24 = b2Var.getLayoutParams().width;
            }
            if (b50Var.t1()) {
                if (!y20Var.V && y20Var.f31712b && (b50.f35991w5 == b50Var.s1() || org.telegram.messenger.i0.Q1())) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                Boolean bool = b50Var.f35996a4;
                if (bool == null || z16 != bool.booleanValue()) {
                    int systemUiVisibility = b50Var.f21586b.getSystemUiVisibility();
                    boolean z17 = z16;
                    if (z17) {
                        i23 = systemUiVisibility & (-7);
                        b50Var.getWindow().clearFlags(1024);
                        b50Var.B0(false);
                    } else {
                        b50Var.B0(true);
                        i23 = systemUiVisibility | 6;
                        b50Var.getWindow().addFlags(1024);
                    }
                    b50Var.f21586b.setSystemUiVisibility(i23);
                    b50Var.f35996a4 = Boolean.valueOf(z17);
                    b50Var.J4 = !z17;
                    b50Var.f21586b.requestApplyInsets();
                }
            } else {
                b50Var.V = false;
            }
            if (b50.f35991w5) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            zyVar.y1(i21);
            i40Var.a0();
            u20Var.a0();
            this.f37416i0 = true;
            TextView textView = b50Var.J1;
            if (textView != null) {
                if (!b50.f35991w5) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (b50Var.s1() == z10 && b50Var.t1() && !y20Var.f31712b && !b50Var.R2.f18230f.isEmpty()) {
                b50Var.g1((org.telegram.messenger.v3) b50Var.R2.f18230f.get(0));
                y20Var.e();
            }
        }
        if (b50.f35992x5 != z11) {
            b50.f35992x5 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            tk0Var.setVisibility(i20);
            i40Var.a0();
            u20Var.a0();
            z12 = true;
            this.f37416i0 = true;
        } else {
            z12 = true;
        }
        if (this.f37416i0) {
            b50Var.Q0(z12);
            b50Var.G1.f();
            z10Var.G(tk0Var, false);
            if (b50.f35992x5) {
                e50Var.I(tk0Var, false);
            }
            if (b50.f35992x5) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            tk0Var.setVisibility(i16);
            if (b50.f35992x5 && !y20Var.f31712b) {
                z13 = true;
            } else {
                z13 = false;
            }
            e50Var.H(tk0Var, z13, true);
            boolean z18 = b50.f35992x5;
            if (z18 && !y20Var.f31712b) {
                z14 = false;
            } else {
                z14 = true;
            }
            b50Var.G4 = z14;
            if (!z18 && y20Var.f31712b) {
                z15 = true;
            } else {
                z15 = false;
            }
            z10Var.F(u20Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            u20Var.setVisibility(i17);
            if (!b50.f35992x5 && y20Var.f31712b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            i40Var.setVisibility(i18);
            if (b50.f35991w5) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            zyVar.y1(i19);
            b50Var.Q1(false, false);
            i40Var.a0();
            u20Var.a0();
            org.telegram.messenger.i0.a4(i40Var);
            this.f37416i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            y20Var.setIsTablet(b50.f35992x5);
            for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                ((org.telegram.ui.Components.voip.r) arrayList2.get(i25)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (b50Var.t1()) {
            L = org.telegram.messenger.i0.L(72.0f);
        } else {
            L = org.telegram.messenger.i0.L(245.0f);
        }
        int i26 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y20Var.getLayoutParams();
        if (b50.f35992x5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i27 = 0; i27 < 2; i27++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b50Var.a2[i27].getLayoutParams();
            if (b50.f35992x5) {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(8.0f);
            }
        }
        if (tk0Var != null) {
            ((FrameLayout.LayoutParams) tk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (g30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (b50Var.t1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int L3 = org.telegram.messenger.i0.L(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i40Var.getLayoutParams();
        if (b50.f35992x5) {
            if (b50Var.f36105z4) {
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
            if (b50.f35991w5) {
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
        if (b50.f35991w5 && !b50.f35992x5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (b50.f35992x5) {
                if (b50Var.f36105z4) {
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
            if (b50.f35992x5) {
                if (b50Var.f36105z4) {
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
        if (b50.f35991w5) {
            u20Var.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
        } else {
            u20Var.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) l20Var.getLayoutParams();
        if (b50.f35992x5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f11);
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            if (b50Var.f36105z4) {
                i28 = 85;
            }
            layoutParams6.gravity = i28;
            layoutParams6.rightMargin = 0;
        } else if (b50.f35991w5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (b50.f35991w5 && !b50.f35992x5) {
            ((FrameLayout.LayoutParams) y30Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
            ((FrameLayout.LayoutParams) r20Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10);
        } else {
            ((FrameLayout.LayoutParams) y30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) r20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) u20Var.getLayoutParams();
        if (b50.f35991w5) {
            if (((s4.a0) u20Var.getLayoutManager()).f47868o != 1) {
                ((s4.a0) u20Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.i0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.a0) u20Var.getLayoutManager()).f47868o != 0) {
                ((s4.a0) u20Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.i0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        i30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (g30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.i0.L(259.0f), (i26 / 5) * 3);
        if (b50.f35992x5) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.m5.b(8.0f, i26 - max, 0);
        }
        if (i40Var.getPaddingTop() != b10 || i40Var.getPaddingBottom() != L2) {
            i40Var.setPadding(i14, b10, i14, L2);
        }
        z40 z40Var = b50Var.f36075s3;
        if (z40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) z40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O0 = b50.O0(b50Var);
            if (O0 != null) {
                int measuredHeight = ((l20Var.getMeasuredHeight() / 2) + l20Var.getTop()) - (b50Var.f36063q1.getMeasuredHeight() / 2);
                int measuredHeight2 = O0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i0.a.u(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.i0.L(32.0f);
                layoutParams9.height = org.telegram.messenger.i0.L(70.0f);
            }
        }
        q40 q40Var = b50Var.L2;
        if (q40Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) q40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O02 = b50.O0(b50Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) b50Var.M1.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.r) arrayList.get(i29)).g(y20Var.f31712b, true);
        }
        this.f37413f0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f37415h0) {
            this.f37415h0 = measuredHeight3;
            b50Var.f1(false);
        }
        b50Var.f36029i4.f31436f = getMeasuredWidth();
        b50Var.a1();
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
        if (this.f37413f0) {
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
