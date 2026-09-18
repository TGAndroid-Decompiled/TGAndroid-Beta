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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
public final class m50 extends org.telegram.ui.Components.bw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final i60 D0;
    public boolean f35522w0;
    public final RectF f35523x0;
    public int f35524y0;
    public boolean f35525z0;

    public m50(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = i60Var;
        this.f35522w0 = false;
        this.f35523x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        i60 i60Var = this.D0;
        n30 n30Var = i60Var.e;
        w30 w30Var = i60Var.f34377m2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        if (i60Var.f34404s2) {
            if (view == o50Var) {
                int childCount = o50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = o50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == a40Var || view == n30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (i60.G3 || a40Var.f29356c != 1.0f || (view != i60Var.O && view != i60Var.f34354g0 && view != i60Var.N && view != i60Var.f34346e1 && view != i60Var.f34433z1 && view != i60Var.U0)) {
            if (i60Var.F2 && view == a40Var) {
                canvas.save();
                canvas.translate(w30Var.getX() + a40Var.getX(), w30Var.getY() + a40Var.getY());
                w30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != i60Var.C2 && view != i60Var.f34347e2 && view != i60Var.X2 && (!i60Var.f34374l2 || !i60Var.f34356g2 || (view != o50Var && view != n30Var && view != i60Var.f34337c0))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0.Z.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int dp = AndroidUtilities.dp(74.0f);
        i60 i60Var = this.D0;
        ImageReceiver imageReceiver = i60Var.Z;
        Drawable drawable = i60Var.f34350f0;
        a40 a40Var = i60Var.a2;
        float f10 = i60Var.f34429y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        i60Var.Q1();
        if (a40Var.f29356c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f19351t0.setColor(i60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f35523x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f19351t0);
            }
            org.telegram.ui.ActionBar.j6.f19351t0.setColor(Color.argb((int) (i60Var.O.getAlpha() * 255.0f), (int) (Color.red(i60Var.V1) * 0.8f), (int) (Color.green(i60Var.V1) * 0.8f), (int) (Color.blue(i60Var.V1) * 0.8f)));
            float statusBarHeight = i60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.f19351t0);
            u40 u40Var = i60Var.f34432z0;
            if (u40Var != null) {
                org.telegram.ui.ActionBar.j6.f19351t0.setColor(u40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, i60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.f19351t0);
            }
        }
        if (a40Var.f29356c != 0.0f) {
            org.telegram.ui.ActionBar.j6.f19351t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19125gg, false), (int) (a40Var.f29356c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f19351t0);
        }
        if (i60Var.r1() && LiteMode.isEnabled(512)) {
            if (a40Var.f29356c < 0.15d) {
                if (!i60Var.f34434z2) {
                    i60Var.f34434z2 = true;
                    i60Var.z1();
                }
            } else if (i60Var.f34434z2) {
                i60Var.f34434z2 = false;
                AndroidUtilities.cancelRunOnUIThread(i60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i60 i60Var = this.D0;
        d40 d40Var = i60Var.C2;
        if (i60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = i60Var.f34347e2.getX();
            float y10 = i60Var.f34347e2.getY();
            float x12 = i60Var.f34347e2.getX() + i60Var.f34347e2.getMeasuredWidth();
            float y11 = i60Var.f34347e2.getY() + i60Var.f34347e2.getMeasuredHeight();
            RectF rectF = this.f35523x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(d40Var.getX(), d40Var.getY(), d40Var.getX() + d40Var.getMeasuredWidth(), d40Var.getY() + d40Var.getMeasuredWidth() + i60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                i60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && i60Var.f34429y0 != 0.0f && motionEvent.getY() < i60Var.f34429y0 - AndroidUtilities.dp(37.0f) && i60Var.O.getAlpha() == 0.0f && !i60Var.f34352f2 && i60Var.f34432z0 == null && !i60Var.a2.f29354b) {
            i60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        i60 i60Var = this.D0;
        if (i60Var.X2 != null && i10 == 4) {
            i60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        i60 i60Var = this.D0;
        View view = i60Var.K2;
        View view2 = i60Var.J2;
        n30 n30Var = i60Var.e;
        a40 a40Var = i60Var.a2;
        o50 o50Var = i60Var.Q;
        if (i60.G3 && this.A0 != i60Var.I2 && this.B0) {
            f7 = o50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = i60Var.I2;
        a40Var.f29375s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        a40Var.f29375s = false;
        i60.J0(i60Var);
        this.B0 = true;
        if (z11 && o50Var.getLeft() != f7) {
            float left = f7 - o50Var.getLeft();
            o50Var.setTranslationX(left);
            n30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = o50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27715f;
            duration.setInterpolator(qrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
            n30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int dp;
        float f7;
        float f10;
        int dp2;
        float f11;
        int i12;
        int i13;
        int i14;
        int z13;
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        boolean z16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        i60 i60Var = this.D0;
        k40 k40Var = i60Var.G;
        t30 t30Var = i60Var.N;
        LinearLayout linearLayout = i60Var.f34433z1;
        e50 e50Var = i60Var.O;
        o60 o60Var = i60Var.f34386o2;
        org.telegram.ui.Components.s20 s20Var = i60Var.f34390p2;
        org.telegram.ui.Components.oz ozVar = i60Var.Y;
        org.telegram.ui.Components.voip.v2 v2Var = i60Var.f34418w;
        org.telegram.ui.ActionBar.j5 j5Var = i60Var.U;
        View view = i60Var.f34354g0;
        n30 n30Var = i60Var.e;
        View view2 = i60Var.K2;
        View view3 = i60Var.J2;
        ArrayList arrayList = i60Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = i60Var.W;
        i40 i40Var = i60Var.H;
        ArrayList arrayList2 = i60Var.Z1;
        org.telegram.ui.Components.wl0 wl0Var = i60Var.f34382n2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        w30 w30Var = i60Var.f34377m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f35522w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        a40Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !i60Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i60.F3 != z10) {
            i60.F3 = z10;
            if (v2Var.getMeasuredWidth() == 0) {
                int i23 = v2Var.getLayoutParams().width;
            }
            i60.H0(i60Var);
            if (i60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            ozVar.y1(i21);
            o50Var.b0();
            w30Var.b0();
            this.f35525z0 = true;
            TextView textView = i60Var.S;
            if (textView != null) {
                if (!i60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (i60Var.q1() == z10 && i60Var.r1() && !a40Var.f29354b && !i60Var.f34329a1.visibleVideoParticipants.isEmpty()) {
                i60Var.e1(i60Var.f34329a1.visibleVideoParticipants.get(0));
                a40Var.e();
            }
        }
        if (i60.G3 != z11) {
            i60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            wl0Var.setVisibility(i20);
            o50Var.b0();
            w30Var.b0();
            z12 = true;
            this.f35525z0 = true;
        } else {
            z12 = true;
        }
        if (this.f35525z0) {
            i60Var.O0(z12);
            i60Var.P.l();
            s20Var.G(wl0Var, false);
            if (i60.G3) {
                o60Var.I(wl0Var, false);
            }
            if (i60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            wl0Var.setVisibility(i16);
            if (i60.G3 && !a40Var.f29354b) {
                z14 = true;
            } else {
                z14 = false;
            }
            o60Var.H(wl0Var, z14, true);
            boolean z17 = i60.G3;
            if (z17 && !a40Var.f29354b) {
                z15 = false;
            } else {
                z15 = true;
            }
            i60Var.P2 = z15;
            if (!z17 && a40Var.f29354b) {
                z16 = true;
            } else {
                z16 = false;
            }
            s20Var.F(w30Var, z16);
            if (z16) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            w30Var.setVisibility(i17);
            if (!i60.G3 && a40Var.f29354b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            o50Var.setVisibility(i18);
            if (i60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            ozVar.y1(i19);
            i60Var.N1(false, false);
            o50Var.b0();
            w30Var.b0();
            AndroidUtilities.updateVisibleRows(o50Var);
            this.f35525z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            a40Var.setIsTablet(i60.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (i60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
        if (i60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i60Var.f34366j0[i26].getLayoutParams();
            if (i60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (wl0Var != null) {
            ((FrameLayout.LayoutParams) wl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (i40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) i40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (i60Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) o50Var.getLayoutParams();
        if (i60.G3) {
            if (i60Var.I2) {
                i15 = 5;
            } else {
                i15 = 1;
            }
            layoutParams3.gravity = i15;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp4;
            layoutParams3.rightMargin = dp4;
            layoutParams3.bottomMargin = dp3;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp2 = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (i60.F3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp2 = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp3;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp5 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp5;
                layoutParams3.rightMargin = dp5;
            }
        }
        int i27 = 81;
        if (i60.F3 && !i60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (i60.G3) {
                if (i60Var.I2) {
                    i13 = 85;
                } else {
                    i13 = 81;
                }
                layoutParams4.gravity = i13;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp3;
            if (i60.G3) {
                if (i60Var.I2) {
                    i12 = 85;
                } else {
                    i12 = 81;
                }
                layoutParams5.gravity = i12;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (i60.F3) {
            w30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            w30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (i60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (i60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (i60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (i60.F3 && !i60.G3) {
            ((FrameLayout.LayoutParams) e50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) t30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) e50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) t30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) w30Var.getLayoutParams();
        if (i60.F3) {
            if (((s4.c0) w30Var.getLayoutManager()).f42917o != 1) {
                ((s4.c0) w30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) w30Var.getLayoutManager()).f42917o != 0) {
                ((s4.c0) w30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        k40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) k40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (i40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) i40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (i60.G3) {
            z13 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            z13 = org.telegram.messenger.q.z(8.0f, i25 - max, 0);
        }
        if (o50Var.getPaddingTop() != z13 || o50Var.getPaddingBottom() != dp2) {
            o50Var.setPadding(i14, z13, i14, dp2);
        }
        g60 g60Var = i60Var.B1;
        if (g60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) g60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = i60.I0(i60Var);
            if (I0 != null) {
                int measuredHeight = ((n30Var.getMeasuredHeight() / 2) + n30Var.getTop()) - (i60Var.f34401s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z13;
                layoutParams9.topMargin = hg.k0.x(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        x50 x50Var = i60Var.U0;
        if (x50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) x50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = i60.I0(i60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (j5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - z13)) / 2) + z13;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) i60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(a40Var.f29354b, true);
        }
        this.f35522w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f35524y0) {
            this.f35524y0 = measuredHeight3;
            i60Var.d1(false);
        }
        i60Var.f34399r2.f29261f = getMeasuredWidth();
        i60Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.D0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f35522w0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.D0.Q1();
    }
}
