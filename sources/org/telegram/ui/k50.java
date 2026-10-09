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
public final class k50 extends org.telegram.ui.Components.sw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final g60 D0;
    public boolean f39083w0;
    public final RectF f39084x0;
    public int f39085y0;
    public boolean f39086z0;

    public k50(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = g60Var;
        this.f39083w0 = false;
        this.f39084x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g60 g60Var = this.D0;
        l30 l30Var = g60Var.f37805e;
        u30 u30Var = g60Var.f37838m2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        if (g60Var.f37865s2) {
            if (view == m50Var) {
                int childCount = m50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = m50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == y30Var || view == l30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (g60.G3 || y30Var.f32057c != 1.0f || (view != g60Var.O && view != g60Var.f37815g0 && view != g60Var.N && view != g60Var.f37807e1 && view != g60Var.f37894z1 && view != g60Var.U0)) {
            if (g60Var.F2 && view == y30Var) {
                canvas.save();
                canvas.translate(u30Var.getX() + y30Var.getX(), u30Var.getY() + y30Var.getY());
                u30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != g60Var.C2 && view != g60Var.f37808e2 && view != g60Var.X2 && (!g60Var.f37835l2 || !g60Var.f37817g2 || (view != m50Var && view != l30Var && view != g60Var.f37797c0))) {
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
        g60 g60Var = this.D0;
        ImageReceiver imageReceiver = g60Var.Z;
        Drawable drawable = g60Var.f37811f0;
        y30 y30Var = g60Var.a2;
        float f10 = g60Var.f37890y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        g60Var.R1();
        if (y30Var.f32057c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.i6.f21086t0.setColor(g60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f39084x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.f21086t0);
            }
            org.telegram.ui.ActionBar.i6.f21086t0.setColor(Color.argb((int) (g60Var.O.getAlpha() * 255.0f), (int) (Color.red(g60Var.V1) * 0.8f), (int) (Color.green(g60Var.V1) * 0.8f), (int) (Color.blue(g60Var.V1) * 0.8f)));
            float statusBarHeight = g60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.i6.f21086t0);
            s40 s40Var = g60Var.f37893z0;
            if (s40Var != null) {
                org.telegram.ui.ActionBar.i6.f21086t0.setColor(s40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, g60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.i6.f21086t0);
            }
        }
        if (y30Var.f32057c != 0.0f) {
            org.telegram.ui.ActionBar.i6.f21086t0.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20860gg, false), (int) (y30Var.f32057c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f21086t0);
        }
        if (g60Var.s1() && LiteMode.isEnabled(512)) {
            if (y30Var.f32057c < 0.15d) {
                if (!g60Var.f37895z2) {
                    g60Var.f37895z2 = true;
                    g60Var.A1();
                }
            } else if (g60Var.f37895z2) {
                g60Var.f37895z2 = false;
                AndroidUtilities.cancelRunOnUIThread(g60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g60 g60Var = this.D0;
        b40 b40Var = g60Var.C2;
        if (g60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = g60Var.f37808e2.getX();
            float y10 = g60Var.f37808e2.getY();
            float x12 = g60Var.f37808e2.getX() + g60Var.f37808e2.getMeasuredWidth();
            float y11 = g60Var.f37808e2.getY() + g60Var.f37808e2.getMeasuredHeight();
            RectF rectF = this.f39084x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(b40Var.getX(), b40Var.getY(), b40Var.getX() + b40Var.getMeasuredWidth(), b40Var.getY() + b40Var.getMeasuredWidth() + g60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                g60Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && g60Var.f37890y0 != 0.0f && motionEvent.getY() < g60Var.f37890y0 - AndroidUtilities.dp(37.0f) && g60Var.O.getAlpha() == 0.0f && !g60Var.f37813f2 && g60Var.f37893z0 == null && !g60Var.a2.f32055b) {
            g60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        g60 g60Var = this.D0;
        if (g60Var.X2 != null && i10 == 4) {
            g60Var.e1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        g60 g60Var = this.D0;
        View view = g60Var.K2;
        View view2 = g60Var.J2;
        l30 l30Var = g60Var.f37805e;
        y30 y30Var = g60Var.a2;
        m50 m50Var = g60Var.Q;
        if (g60.G3 && this.A0 != g60Var.I2 && this.B0) {
            f7 = m50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = g60Var.I2;
        y30Var.f32077s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        y30Var.f32077s = false;
        g60.K0(g60Var);
        this.B0 = true;
        if (z11 && m50Var.getLeft() != f7) {
            float left = f7 - m50Var.getLeft();
            m50Var.setTranslationX(left);
            l30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = m50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f27118f;
            duration.setInterpolator(hsVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(hsVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(hsVar).start();
            l30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(hsVar).start();
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
        int y3;
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
        g60 g60Var = this.D0;
        i40 i40Var = g60Var.G;
        r30 r30Var = g60Var.N;
        LinearLayout linearLayout = g60Var.f37894z1;
        c50 c50Var = g60Var.O;
        l60 l60Var = g60Var.f37847o2;
        org.telegram.ui.Components.j30 j30Var = g60Var.f37851p2;
        org.telegram.ui.Components.e00 e00Var = g60Var.Y;
        org.telegram.ui.Components.voip.v2 v2Var = g60Var.f37879w;
        org.telegram.ui.ActionBar.j5 j5Var = g60Var.U;
        View view = g60Var.f37815g0;
        l30 l30Var = g60Var.f37805e;
        View view2 = g60Var.K2;
        View view3 = g60Var.J2;
        ArrayList arrayList = g60Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = g60Var.W;
        g40 g40Var = g60Var.H;
        ArrayList arrayList2 = g60Var.Z1;
        org.telegram.ui.Components.qm0 qm0Var = g60Var.f37843n2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        u30 u30Var = g60Var.f37838m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f39083w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        y30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !g60Var.s1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g60.F3 != z10) {
            g60.F3 = z10;
            if (v2Var.getMeasuredWidth() == 0) {
                int i23 = v2Var.getLayoutParams().width;
            }
            g60.I0(g60Var);
            if (g60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            e00Var.y1(i21);
            m50Var.a0();
            u30Var.a0();
            this.f39086z0 = true;
            TextView textView = g60Var.S;
            if (textView != null) {
                if (!g60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (g60Var.r1() == z10 && g60Var.s1() && !y30Var.f32055b && !g60Var.f37789a1.visibleVideoParticipants.isEmpty()) {
                g60Var.f1(g60Var.f37789a1.visibleVideoParticipants.get(0));
                y30Var.e();
            }
        }
        if (g60.G3 != z11) {
            g60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            qm0Var.setVisibility(i20);
            m50Var.a0();
            u30Var.a0();
            z12 = true;
            this.f39086z0 = true;
        } else {
            z12 = true;
        }
        if (this.f39086z0) {
            g60Var.P0(z12);
            g60Var.P.l();
            j30Var.G(qm0Var, false);
            if (g60.G3) {
                l60Var.I(qm0Var, false);
            }
            if (g60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            qm0Var.setVisibility(i16);
            if (g60.G3 && !y30Var.f32055b) {
                z13 = true;
            } else {
                z13 = false;
            }
            l60Var.H(qm0Var, z13, true);
            boolean z16 = g60.G3;
            if (z16 && !y30Var.f32055b) {
                z14 = false;
            } else {
                z14 = true;
            }
            g60Var.P2 = z14;
            if (!z16 && y30Var.f32055b) {
                z15 = true;
            } else {
                z15 = false;
            }
            j30Var.F(u30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            u30Var.setVisibility(i17);
            if (!g60.G3 && y30Var.f32055b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            m50Var.setVisibility(i18);
            if (g60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            e00Var.y1(i19);
            g60Var.O1(false, false);
            m50Var.a0();
            u30Var.a0();
            AndroidUtilities.updateVisibleRows(m50Var);
            this.f39086z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            y30Var.setIsTablet(g60.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (g60Var.s1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y30Var.getLayoutParams();
        if (g60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g60Var.f37827j0[i26].getLayoutParams();
            if (g60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (qm0Var != null) {
            ((FrameLayout.LayoutParams) qm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (g40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (g60Var.s1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m50Var.getLayoutParams();
        if (g60.G3) {
            if (g60Var.I2) {
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
            if (g60.F3) {
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
        if (g60.F3 && !g60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (g60.G3) {
                if (g60Var.I2) {
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
            if (g60.G3) {
                if (g60Var.I2) {
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
        if (g60.F3) {
            u30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            u30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) l30Var.getLayoutParams();
        if (g60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (g60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (g60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (g60.F3 && !g60.G3) {
            ((FrameLayout.LayoutParams) c50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) r30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) c50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) r30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
        if (g60.F3) {
            if (((s4.d0) u30Var.getLayoutManager()).f47646o != 1) {
                ((s4.d0) u30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.d0) u30Var.getLayoutManager()).f47646o != 0) {
                ((s4.d0) u30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        i40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) i40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (g40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (g60.G3) {
            y3 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            y3 = org.telegram.messenger.q.y(8.0f, i25 - max, 0);
        }
        if (m50Var.getPaddingTop() != y3 || m50Var.getPaddingBottom() != dp2) {
            m50Var.setPadding(i14, y3, i14, dp2);
        }
        e60 e60Var = g60Var.B1;
        if (e60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) e60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = g60.J0(g60Var);
            if (J0 != null) {
                int measuredHeight = ((l30Var.getMeasuredHeight() / 2) + l30Var.getTop()) - (g60Var.f37862s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = hg.c.z(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        v50 v50Var = g60Var.U0;
        if (v50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) v50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = g60.J0(g60Var);
            if (J02 != null) {
                layoutParams10.height = J02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = J02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (j5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) g60Var.V.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(y30Var.f32055b, true);
        }
        this.f39083w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f39085y0) {
            this.f39085y0 = measuredHeight3;
            g60Var.e1(false);
        }
        g60Var.f37860r2.f31955f = getMeasuredWidth();
        g60Var.Z0();
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
        if (this.f39083w0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.D0.R1();
    }
}
