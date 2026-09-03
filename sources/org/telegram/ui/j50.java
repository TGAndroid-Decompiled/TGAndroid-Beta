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
public final class j50 extends org.telegram.ui.Components.qv0 {
    public final e60 A0;
    public boolean f35087t0;
    public final RectF f35088u0;
    public int f35089v0;
    public boolean f35090w0;
    public boolean f35091x0;
    public boolean f35092y0;
    public final HashMap f35093z0;

    public j50(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.A0 = e60Var;
        this.f35087t0 = false;
        this.f35088u0 = new RectF();
        this.f35093z0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        e60 e60Var = this.A0;
        k30 k30Var = e60Var.e;
        t30 t30Var = e60Var.f33656j2;
        l50 l50Var = e60Var.N;
        x30 x30Var = e60Var.X1;
        if (e60Var.f33679p2) {
            if (view == l50Var) {
                int childCount = l50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = l50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == x30Var || view == k30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (e60.D3 || x30Var.f29687c != 1.0f || (view != e60Var.L && view != e60Var.f33629d0 && view != e60Var.K && view != e60Var.f33622b1 && view != e60Var.f33709w1 && view != e60Var.R0)) {
            if (e60Var.C2 && view == x30Var) {
                canvas.save();
                canvas.translate(t30Var.getX() + x30Var.getX(), t30Var.getY() + x30Var.getY());
                t30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != e60Var.f33724z2 && view != e60Var.f33623b2 && view != e60Var.U2 && (!e60Var.f33652i2 || !e60Var.f33631d2 || (view != l50Var && view != k30Var && view != e60Var.Z))) {
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
        e60 e60Var = this.A0;
        ImageReceiver imageReceiver = e60Var.W;
        Drawable drawable = e60Var.f33626c0;
        x30 x30Var = e60Var.X1;
        float f11 = e60Var.f33703v0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        e60Var.Q1();
        if (x30Var.f29687c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f20160t0.setColor(e60Var.S1);
                i16 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f35088u0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.j6.f20160t0);
            }
            org.telegram.ui.ActionBar.j6.f20160t0.setColor(Color.argb((int) (e60Var.L.getAlpha() * 255.0f), (int) (Color.red(e60Var.S1) * 0.8f), (int) (Color.green(e60Var.S1) * 0.8f), (int) (Color.blue(e60Var.S1) * 0.8f)));
            float statusBarHeight = e60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.f20160t0);
            r40 r40Var = e60Var.f33708w0;
            if (r40Var != null) {
                org.telegram.ui.ActionBar.j6.f20160t0.setColor(r40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                float f12 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                canvas.drawRect(f12, 0.0f, measuredWidth3 - i15, e60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.f20160t0);
            }
        }
        if (x30Var.f29687c != 0.0f) {
            org.telegram.ui.ActionBar.j6.f20160t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19945gg, false), (int) (x30Var.f29687c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20160t0);
        }
        if (e60Var.r1() && LiteMode.isEnabled(512)) {
            if (x30Var.f29687c < 0.15d) {
                if (!e60Var.f33710w2) {
                    e60Var.f33710w2 = true;
                    e60Var.z1();
                }
            } else if (e60Var.f33710w2) {
                e60Var.f33710w2 = false;
                AndroidUtilities.cancelRunOnUIThread(e60Var.f33715x2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e60 e60Var = this.A0;
        a40 a40Var = e60Var.f33724z2;
        if (e60Var.U2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = e60Var.f33623b2.getX();
            float y11 = e60Var.f33623b2.getY();
            float x12 = e60Var.f33623b2.getX() + e60Var.f33623b2.getMeasuredWidth();
            float y12 = e60Var.f33623b2.getY() + e60Var.f33623b2.getMeasuredHeight();
            RectF rectF = this.f35088u0;
            rectF.set(x11, y11, x12, y12);
            boolean z4 = !rectF.contains(x10, y10);
            rectF.set(a40Var.getX(), a40Var.getY(), a40Var.getX() + a40Var.getMeasuredWidth(), a40Var.getY() + a40Var.getMeasuredWidth() + e60Var.U2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z4 = false;
            }
            if (z4) {
                e60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && e60Var.f33703v0 != 0.0f && motionEvent.getY() < e60Var.f33703v0 - AndroidUtilities.dp(37.0f) && e60Var.L.getAlpha() == 0.0f && !e60Var.f33628c2 && e60Var.f33708w0 == null && !e60Var.X1.f29685b) {
            e60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        e60 e60Var = this.A0;
        if (e60Var.U2 != null && i10 == 4) {
            e60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z10;
        e60 e60Var = this.A0;
        View view = e60Var.H2;
        View view2 = e60Var.G2;
        k30 k30Var = e60Var.e;
        x30 x30Var = e60Var.X1;
        l50 l50Var = e60Var.N;
        if (e60.D3 && this.f35091x0 != e60Var.F2 && this.f35092y0) {
            f10 = l50Var.getX();
            z10 = true;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        this.f35091x0 = e60Var.F2;
        x30Var.f29706s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        x30Var.f29706s = false;
        e60.J0(e60Var);
        this.f35092y0 = true;
        if (z10 && l50Var.getLeft() != f10) {
            float left = f10 - l50Var.getLeft();
            l50Var.setTranslationX(left);
            k30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = l50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
            duration.setInterpolator(mrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(mrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(mrVar).start();
            k30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(mrVar).start();
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
        e60 e60Var = this.A0;
        h40 h40Var = e60Var.D;
        q30 q30Var = e60Var.K;
        LinearLayout linearLayout = e60Var.f33709w1;
        b50 b50Var = e60Var.L;
        k60 k60Var = e60Var.f33663l2;
        org.telegram.ui.Components.u20 u20Var = e60Var.f33666m2;
        org.telegram.ui.Components.oz ozVar = e60Var.V;
        org.telegram.ui.Components.voip.v2 v2Var = e60Var.f33707w;
        org.telegram.ui.ActionBar.k5 k5Var = e60Var.R;
        View view = e60Var.f33629d0;
        k30 k30Var = e60Var.e;
        View view2 = e60Var.H2;
        View view3 = e60Var.G2;
        ArrayList arrayList = e60Var.V1;
        org.telegram.ui.ActionBar.k5 k5Var2 = e60Var.T;
        f40 f40Var = e60Var.E;
        ArrayList arrayList2 = e60Var.W1;
        org.telegram.ui.Components.rl0 rl0Var = e60Var.f33660k2;
        l50 l50Var = e60Var.N;
        x30 x30Var = e60Var.X1;
        t30 t30Var = e60Var.f33656j2;
        int size = View.MeasureSpec.getSize(i11);
        this.f35087t0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z4 = true;
        } else {
            z4 = false;
        }
        View.MeasureSpec.getSize(i10);
        x30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !e60Var.r1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (e60.C3 != z4) {
            e60.C3 = z4;
            if (v2Var.getMeasuredWidth() == 0) {
                int i23 = v2Var.getLayoutParams().width;
            }
            e60.H0(e60Var);
            if (e60.C3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            ozVar.y1(i21);
            l50Var.a0();
            t30Var.a0();
            this.f35090w0 = true;
            TextView textView = e60Var.P;
            if (textView != null) {
                if (!e60.C3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (e60Var.q1() == z4 && e60Var.r1() && !x30Var.f29685b && !e60Var.X0.visibleVideoParticipants.isEmpty()) {
                e60Var.e1(e60Var.X0.visibleVideoParticipants.get(0));
                x30Var.e();
            }
        }
        if (e60.D3 != z10) {
            e60.D3 = z10;
            if (z10) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            rl0Var.setVisibility(i20);
            l50Var.a0();
            t30Var.a0();
            z11 = true;
            this.f35090w0 = true;
        } else {
            z11 = true;
        }
        if (this.f35090w0) {
            e60Var.O0(z11);
            e60Var.M.l();
            u20Var.G(rl0Var, false);
            if (e60.D3) {
                k60Var.I(rl0Var, false);
            }
            if (e60.D3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            rl0Var.setVisibility(i16);
            if (e60.D3 && !x30Var.f29685b) {
                z12 = true;
            } else {
                z12 = false;
            }
            k60Var.H(rl0Var, z12, true);
            boolean z15 = e60.D3;
            if (z15 && !x30Var.f29685b) {
                z13 = false;
            } else {
                z13 = true;
            }
            e60Var.M2 = z13;
            if (!z15 && x30Var.f29685b) {
                z14 = true;
            } else {
                z14 = false;
            }
            u20Var.F(t30Var, z14);
            if (z14) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            t30Var.setVisibility(i17);
            if (!e60.D3 && x30Var.f29685b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            l50Var.setVisibility(i18);
            if (e60.C3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            ozVar.y1(i19);
            e60Var.N1(false, false);
            l50Var.a0();
            t30Var.a0();
            AndroidUtilities.updateVisibleRows(l50Var);
            this.f35090w0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            x30Var.setIsTablet(e60.D3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (e60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x30Var.getLayoutParams();
        if (e60.D3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e60Var.f33642g0[i26].getLayoutParams();
            if (e60.D3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (rl0Var != null) {
            ((FrameLayout.LayoutParams) rl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (f40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (e60Var.r1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l50Var.getLayoutParams();
        if (e60.D3) {
            if (e60Var.F2) {
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
            if (e60.C3) {
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
        if (e60.C3 && !e60.D3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (e60.D3) {
                if (e60Var.F2) {
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
            if (e60.D3) {
                if (e60Var.F2) {
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
        if (e60.C3) {
            t30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            t30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (e60.D3) {
            layoutParams6.width = AndroidUtilities.dp(f12);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (e60Var.F2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (e60.C3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (e60.C3 && !e60.D3) {
            ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) q30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
        } else {
            ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) q30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
        if (e60.C3) {
            if (((f2.i0) t30Var.getLayoutManager()).f5720o != 1) {
                ((f2.i0) t30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.i0) t30Var.getLayoutManager()).f5720o != 0) {
                ((f2.i0) t30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        h40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) h40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (f40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (e60.D3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.y3.b(8.0f, i25 - max, 0);
        }
        if (l50Var.getPaddingTop() != b10 || l50Var.getPaddingBottom() != dp2) {
            l50Var.setPadding(i14, b10, i14, dp2);
        }
        c60 c60Var = e60Var.f33719y1;
        if (c60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) c60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = e60.I0(e60Var);
            if (I0 != null) {
                int measuredHeight = ((k30Var.getMeasuredHeight() / 2) + k30Var.getTop()) - (e60Var.f33690s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = kf.k0.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        t50 t50Var = e60Var.R0;
        if (t50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) t50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = e60.I0(e60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (k5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) k5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) k5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) e60Var.S.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    k5Var.setVisibility(0);
                    k5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            k5Var.setVisibility(4);
            k5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(x30Var.f29685b, true);
        }
        this.f35087t0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f35089v0) {
            this.f35089v0 = measuredHeight3;
            e60Var.d1(false);
        }
        e60Var.f33675o2.f29628f = getMeasuredWidth();
        e60Var.Y0();
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
        if (this.f35087t0) {
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
