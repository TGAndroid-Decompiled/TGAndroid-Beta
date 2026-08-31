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
public final class i50 extends org.telegram.ui.Components.qv0 {
    public final d60 A0;
    public boolean f37748t0;
    public final RectF f37749u0;
    public int f37750v0;
    public boolean f37751w0;
    public boolean f37752x0;
    public boolean f37753y0;
    public final HashMap f37754z0;

    public i50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.A0 = d60Var;
        this.f37748t0 = false;
        this.f37749u0 = new RectF();
        this.f37754z0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d60 d60Var = this.A0;
        j30 j30Var = d60Var.f36027e;
        s30 s30Var = d60Var.f36051j2;
        k50 k50Var = d60Var.N;
        w30 w30Var = d60Var.X1;
        if (d60Var.f36074p2) {
            if (view == k50Var) {
                int childCount = k50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = k50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == w30Var || view == j30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (d60.D3 || w30Var.f32142c != 1.0f || (view != d60Var.L && view != d60Var.f36023d0 && view != d60Var.K && view != d60Var.f36016b1 && view != d60Var.f36104w1 && view != d60Var.R0)) {
            if (d60Var.C2 && view == w30Var) {
                canvas.save();
                canvas.translate(s30Var.getX() + w30Var.getX(), s30Var.getY() + w30Var.getY());
                s30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != d60Var.f36119z2 && view != d60Var.f36017b2 && view != d60Var.U2 && (!d60Var.f36047i2 || !d60Var.f36025d2 || (view != k50Var && view != j30Var && view != d60Var.Z))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.W.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
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
        d60 d60Var = this.A0;
        ImageReceiver imageReceiver = d60Var.W;
        Drawable drawable = d60Var.f36020c0;
        w30 w30Var = d60Var.X1;
        float f11 = d60Var.f36098v0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        d60Var.Q1();
        if (w30Var.f32142c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21939t0.setColor(d60Var.S1);
                i16 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f37749u0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.k6.f21939t0);
            }
            org.telegram.ui.ActionBar.k6.f21939t0.setColor(Color.argb((int) (d60Var.L.getAlpha() * 255.0f), (int) (Color.red(d60Var.S1) * 0.8f), (int) (Color.green(d60Var.S1) * 0.8f), (int) (Color.blue(d60Var.S1) * 0.8f)));
            float statusBarHeight = d60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.k6.f21939t0);
            q40 q40Var = d60Var.f36103w0;
            if (q40Var != null) {
                org.telegram.ui.ActionBar.k6.f21939t0.setColor(q40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                float f12 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                canvas.drawRect(f12, 0.0f, measuredWidth3 - i15, d60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.k6.f21939t0);
            }
        }
        if (w30Var.f32142c != 0.0f) {
            org.telegram.ui.ActionBar.k6.f21939t0.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21724gg, false), (int) (w30Var.f32142c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21939t0);
        }
        if (d60Var.r1() && LiteMode.isEnabled(512)) {
            if (w30Var.f32142c < 0.15d) {
                if (!d60Var.f36105w2) {
                    d60Var.f36105w2 = true;
                    d60Var.z1();
                }
            } else if (d60Var.f36105w2) {
                d60Var.f36105w2 = false;
                AndroidUtilities.cancelRunOnUIThread(d60Var.f36110x2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d60 d60Var = this.A0;
        z30 z30Var = d60Var.f36119z2;
        if (d60Var.U2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = d60Var.f36017b2.getX();
            float y11 = d60Var.f36017b2.getY();
            float x12 = d60Var.f36017b2.getX() + d60Var.f36017b2.getMeasuredWidth();
            float y12 = d60Var.f36017b2.getY() + d60Var.f36017b2.getMeasuredHeight();
            RectF rectF = this.f37749u0;
            rectF.set(x11, y11, x12, y12);
            boolean z4 = !rectF.contains(x10, y10);
            rectF.set(z30Var.getX(), z30Var.getY(), z30Var.getX() + z30Var.getMeasuredWidth(), z30Var.getY() + z30Var.getMeasuredWidth() + d60Var.U2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z4 = false;
            }
            if (z4) {
                d60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && d60Var.f36098v0 != 0.0f && motionEvent.getY() < d60Var.f36098v0 - AndroidUtilities.dp(37.0f) && d60Var.L.getAlpha() == 0.0f && !d60Var.f36022c2 && d60Var.f36103w0 == null && !d60Var.X1.f32140b) {
            d60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        d60 d60Var = this.A0;
        if (d60Var.U2 != null && i10 == 4) {
            d60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z10;
        d60 d60Var = this.A0;
        View view = d60Var.H2;
        View view2 = d60Var.G2;
        j30 j30Var = d60Var.f36027e;
        w30 w30Var = d60Var.X1;
        k50 k50Var = d60Var.N;
        if (d60.D3 && this.f37752x0 != d60Var.F2 && this.f37753y0) {
            f10 = k50Var.getX();
            z10 = true;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        this.f37752x0 = d60Var.F2;
        w30Var.f32162s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        w30Var.f32162s = false;
        d60.J0(d60Var);
        this.f37753y0 = true;
        if (z10 && k50Var.getLeft() != f10) {
            float left = f10 - k50Var.getLeft();
            k50Var.setTranslationX(left);
            j30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = k50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
            duration.setInterpolator(prVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
            j30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        boolean z10;
        boolean z11;
        int dp;
        float f10;
        float f11;
        int dp2;
        float f12;
        int i12;
        int i13;
        int i14;
        int b10;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        boolean z14;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        d60 d60Var = this.A0;
        g40 g40Var = d60Var.D;
        p30 p30Var = d60Var.K;
        LinearLayout linearLayout = d60Var.f36104w1;
        a50 a50Var = d60Var.L;
        j60 j60Var = d60Var.f36058l2;
        org.telegram.ui.Components.u20 u20Var = d60Var.f36061m2;
        org.telegram.ui.Components.qz qzVar = d60Var.V;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.f36102w;
        org.telegram.ui.ActionBar.l5 l5Var = d60Var.R;
        View view = d60Var.f36023d0;
        j30 j30Var = d60Var.f36027e;
        View view2 = d60Var.H2;
        View view3 = d60Var.G2;
        ArrayList arrayList = d60Var.V1;
        org.telegram.ui.ActionBar.l5 l5Var2 = d60Var.T;
        e40 e40Var = d60Var.E;
        ArrayList arrayList2 = d60Var.W1;
        org.telegram.ui.Components.tl0 tl0Var = d60Var.f36055k2;
        k50 k50Var = d60Var.N;
        w30 w30Var = d60Var.X1;
        s30 s30Var = d60Var.f36051j2;
        int size = View.MeasureSpec.getSize(i11);
        this.f37748t0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z4 = true;
        } else {
            z4 = false;
        }
        View.MeasureSpec.getSize(i10);
        w30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !d60Var.r1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (d60.C3 != z4) {
            d60.C3 = z4;
            if (w2Var.getMeasuredWidth() == 0) {
                int i23 = w2Var.getLayoutParams().width;
            }
            d60.H0(d60Var);
            if (d60.C3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            qzVar.y1(i21);
            k50Var.a0();
            s30Var.a0();
            this.f37751w0 = true;
            TextView textView = d60Var.P;
            if (textView != null) {
                if (!d60.C3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (d60Var.q1() == z4 && d60Var.r1() && !w30Var.f32140b && !d60Var.X0.visibleVideoParticipants.isEmpty()) {
                d60Var.e1(d60Var.X0.visibleVideoParticipants.get(0));
                w30Var.e();
            }
        }
        if (d60.D3 != z10) {
            d60.D3 = z10;
            if (z10) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            tl0Var.setVisibility(i20);
            k50Var.a0();
            s30Var.a0();
            z11 = true;
            this.f37751w0 = true;
        } else {
            z11 = true;
        }
        if (this.f37751w0) {
            d60Var.O0(z11);
            d60Var.M.l();
            u20Var.G(tl0Var, false);
            if (d60.D3) {
                j60Var.I(tl0Var, false);
            }
            if (d60.D3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            tl0Var.setVisibility(i16);
            if (d60.D3 && !w30Var.f32140b) {
                z12 = true;
            } else {
                z12 = false;
            }
            j60Var.H(tl0Var, z12, true);
            boolean z15 = d60.D3;
            if (z15 && !w30Var.f32140b) {
                z13 = false;
            } else {
                z13 = true;
            }
            d60Var.M2 = z13;
            if (!z15 && w30Var.f32140b) {
                z14 = true;
            } else {
                z14 = false;
            }
            u20Var.F(s30Var, z14);
            if (z14) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            s30Var.setVisibility(i17);
            if (!d60.D3 && w30Var.f32140b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            k50Var.setVisibility(i18);
            if (d60.C3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            qzVar.y1(i19);
            d60Var.N1(false, false);
            k50Var.a0();
            s30Var.a0();
            AndroidUtilities.updateVisibleRows(k50Var);
            this.f37751w0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            w30Var.setIsTablet(d60.D3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (d60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w30Var.getLayoutParams();
        if (d60.D3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d60Var.f36037g0[i26].getLayoutParams();
            if (d60.D3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (tl0Var != null) {
            ((FrameLayout.LayoutParams) tl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (e40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) e40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (d60Var.r1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k50Var.getLayoutParams();
        if (d60.D3) {
            if (d60Var.F2) {
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
            f11 = 90.0f;
        } else {
            f11 = 90.0f;
            if (d60.C3) {
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
        if (d60.C3 && !d60.D3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (d60.D3) {
                if (d60Var.F2) {
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
            if (d60.D3) {
                if (d60Var.F2) {
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
        if (d60.C3) {
            s30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            s30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) j30Var.getLayoutParams();
        if (d60.D3) {
            layoutParams6.width = AndroidUtilities.dp(f12);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (d60Var.F2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (d60.C3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (d60.C3 && !d60.D3) {
            ((FrameLayout.LayoutParams) a50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) p30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
        } else {
            ((FrameLayout.LayoutParams) a50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) p30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) s30Var.getLayoutParams();
        if (d60.C3) {
            if (((f2.j0) s30Var.getLayoutManager()).f5816o != 1) {
                ((f2.j0) s30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.j0) s30Var.getLayoutManager()).f5816o != 0) {
                ((f2.j0) s30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        g40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) g40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (e40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) e40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (d60.D3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.y3.b(8.0f, i25 - max, 0);
        }
        if (k50Var.getPaddingTop() != b10 || k50Var.getPaddingBottom() != dp2) {
            k50Var.setPadding(i14, b10, i14, dp2);
        }
        b60 b60Var = d60Var.f36114y1;
        if (b60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) b60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = d60.I0(d60Var);
            if (I0 != null) {
                int measuredHeight = ((j30Var.getMeasuredHeight() / 2) + j30Var.getTop()) - (d60Var.f36085s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = l.d.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        s50 s50Var = d60Var.R0;
        if (s50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) s50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = d60.I0(d60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (l5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) l5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) l5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) d60Var.S.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    l5Var.setVisibility(0);
                    l5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            l5Var.setVisibility(4);
            l5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(w30Var.f32140b, true);
        }
        this.f37748t0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f37750v0) {
            this.f37750v0 = measuredHeight3;
            d60Var.d1(false);
        }
        d60Var.f36070o2.f32055f = getMeasuredWidth();
        d60Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37748t0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.A0.Q1();
    }
}
