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
public final class b50 extends org.telegram.ui.Components.ww0 {
    public boolean f37884l0;
    public final RectF m0;
    public int f37885n0;
    public boolean f37886o0;
    public boolean f37887p0;
    public boolean f37888q0;
    public final HashMap f37889r0;
    public final x50 f37890s0;

    public b50(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f37890s0 = x50Var;
        this.f37884l0 = false;
        this.m0 = new RectF();
        this.f37889r0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x50 x50Var = this.f37890s0;
        b30 b30Var = x50Var.e;
        k30 k30Var = x50Var.f45540m2;
        d50 d50Var = x50Var.Q;
        o30 o30Var = x50Var.a2;
        if (x50Var.f45567s2) {
            if (view == d50Var) {
                int childCount = d50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = d50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == o30Var || view == b30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (x50.G3 || o30Var.f34010c != 1.0f || (view != x50Var.O && view != x50Var.f45516g0 && view != x50Var.N && view != x50Var.f45508e1 && view != x50Var.f45596z1 && view != x50Var.U0)) {
            if (x50Var.F2 && view == o30Var) {
                canvas.save();
                canvas.translate(k30Var.getX() + o30Var.getX(), k30Var.getY() + o30Var.getY());
                k30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != x50Var.C2 && view != x50Var.f45509e2 && view != x50Var.X2 && (!x50Var.f45537l2 || !x50Var.f45518g2 || (view != d50Var && view != b30Var && view != x50Var.f45499c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37890s0.Z.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37890s0.Z.onDetachedFromWindow();
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
        x50 x50Var = this.f37890s0;
        ImageReceiver imageReceiver = x50Var.Z;
        Drawable drawable = x50Var.f45512f0;
        o30 o30Var = x50Var.a2;
        float f10 = x50Var.f45592y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        x50Var.R1();
        if (o30Var.f34010c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.y6.f23649t0.setColor(x50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.m0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.y6.f23649t0);
            }
            org.telegram.ui.ActionBar.y6.f23649t0.setColor(Color.argb((int) (x50Var.O.getAlpha() * 255.0f), (int) (Color.red(x50Var.V1) * 0.8f), (int) (Color.green(x50Var.V1) * 0.8f), (int) (Color.blue(x50Var.V1) * 0.8f)));
            float statusBarHeight = x50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.y6.f23649t0);
            i40 i40Var = x50Var.f45595z0;
            if (i40Var != null) {
                org.telegram.ui.ActionBar.y6.f23649t0.setColor(i40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, x50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.y6.f23649t0);
            }
        }
        if (o30Var.f34010c != 0.0f) {
            org.telegram.ui.ActionBar.y6.f23649t0.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false), (int) (o30Var.f34010c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23649t0);
        }
        if (x50Var.r1() && LiteMode.isEnabled(512)) {
            if (o30Var.f34010c < 0.15d) {
                if (!x50Var.f45597z2) {
                    x50Var.f45597z2 = true;
                    x50Var.z1();
                }
            } else if (x50Var.f45597z2) {
                x50Var.f45597z2 = false;
                AndroidUtilities.cancelRunOnUIThread(x50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x50 x50Var = this.f37890s0;
        r30 r30Var = x50Var.C2;
        if (x50Var.X2 != null && motionEvent.getAction() == 0) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x10 = x50Var.f45509e2.getX();
            float y10 = x50Var.f45509e2.getY();
            float x11 = x50Var.f45509e2.getX() + x50Var.f45509e2.getMeasuredWidth();
            float y11 = x50Var.f45509e2.getY() + x50Var.f45509e2.getMeasuredHeight();
            RectF rectF = this.m0;
            rectF.set(x10, y10, x11, y11);
            boolean z10 = !rectF.contains(x9, y3);
            rectF.set(r30Var.getX(), r30Var.getY(), r30Var.getX() + r30Var.getMeasuredWidth(), r30Var.getY() + r30Var.getMeasuredWidth() + x50Var.X2.getMeasuredHeight());
            if (rectF.contains(x9, y3)) {
                z10 = false;
            }
            if (z10) {
                x50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && x50Var.f45592y0 != 0.0f && motionEvent.getY() < x50Var.f45592y0 - AndroidUtilities.dp(37.0f) && x50Var.O.getAlpha() == 0.0f && !x50Var.f45514f2 && x50Var.f45595z0 == null && !x50Var.a2.f34008b) {
            x50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        x50 x50Var = this.f37890s0;
        if (x50Var.X2 != null && i10 == 4) {
            x50Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        x50 x50Var = this.f37890s0;
        View view = x50Var.K2;
        View view2 = x50Var.J2;
        b30 b30Var = x50Var.e;
        o30 o30Var = x50Var.a2;
        d50 d50Var = x50Var.Q;
        if (x50.G3 && this.f37887p0 != x50Var.I2 && this.f37888q0) {
            f7 = d50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.f37887p0 = x50Var.I2;
        o30Var.f34029s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        o30Var.f34029s = false;
        x50.J0(x50Var);
        this.f37888q0 = true;
        if (z11 && d50Var.getLeft() != f7) {
            float left = f7 - d50Var.getLeft();
            d50Var.setTranslationX(left);
            b30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = d50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
            duration.setInterpolator(dsVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
            b30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
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
        x50 x50Var = this.f37890s0;
        y30 y30Var = x50Var.G;
        h30 h30Var = x50Var.N;
        LinearLayout linearLayout = x50Var.f45596z1;
        t40 t40Var = x50Var.O;
        d60 d60Var = x50Var.f45549o2;
        org.telegram.ui.Components.c30 c30Var = x50Var.f45553p2;
        org.telegram.ui.Components.xz xzVar = x50Var.Y;
        org.telegram.ui.Components.voip.w2 w2Var = x50Var.f45581w;
        org.telegram.ui.ActionBar.b6 b6Var = x50Var.U;
        View view = x50Var.f45516g0;
        b30 b30Var = x50Var.e;
        View view2 = x50Var.K2;
        View view3 = x50Var.J2;
        ArrayList arrayList = x50Var.Y1;
        org.telegram.ui.ActionBar.b6 b6Var2 = x50Var.W;
        w30 w30Var = x50Var.H;
        ArrayList arrayList2 = x50Var.Z1;
        org.telegram.ui.Components.nm0 nm0Var = x50Var.f45545n2;
        d50 d50Var = x50Var.Q;
        o30 o30Var = x50Var.a2;
        k30 k30Var = x50Var.f45540m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f37884l0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        o30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !x50Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (x50.F3 != z10) {
            x50.F3 = z10;
            if (w2Var.getMeasuredWidth() == 0) {
                int i23 = w2Var.getLayoutParams().width;
            }
            x50.H0(x50Var);
            if (x50.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            xzVar.z1(i21);
            d50Var.a0();
            k30Var.a0();
            this.f37886o0 = true;
            TextView textView = x50Var.S;
            if (textView != null) {
                if (!x50.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (x50Var.q1() == z10 && x50Var.r1() && !o30Var.f34008b && !x50Var.f45491a1.visibleVideoParticipants.isEmpty()) {
                x50Var.e1(x50Var.f45491a1.visibleVideoParticipants.get(0));
                o30Var.e();
            }
        }
        if (x50.G3 != z11) {
            x50.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            nm0Var.setVisibility(i20);
            d50Var.a0();
            k30Var.a0();
            z12 = true;
            this.f37886o0 = true;
        } else {
            z12 = true;
        }
        if (this.f37886o0) {
            x50Var.O0(z12);
            x50Var.P.l();
            c30Var.G(nm0Var, false);
            if (x50.G3) {
                d60Var.I(nm0Var, false);
            }
            if (x50.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            nm0Var.setVisibility(i16);
            if (x50.G3 && !o30Var.f34008b) {
                z14 = true;
            } else {
                z14 = false;
            }
            d60Var.H(nm0Var, z14, true);
            boolean z17 = x50.G3;
            if (z17 && !o30Var.f34008b) {
                z15 = false;
            } else {
                z15 = true;
            }
            x50Var.P2 = z15;
            if (!z17 && o30Var.f34008b) {
                z16 = true;
            } else {
                z16 = false;
            }
            c30Var.F(k30Var, z16);
            if (z16) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            k30Var.setVisibility(i17);
            if (!x50.G3 && o30Var.f34008b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            d50Var.setVisibility(i18);
            if (x50.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            xzVar.z1(i19);
            x50Var.O1(false, false);
            d50Var.a0();
            k30Var.a0();
            AndroidUtilities.updateVisibleRows(d50Var);
            this.f37886o0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            o30Var.setIsTablet(x50.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (x50Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o30Var.getLayoutParams();
        if (x50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x50Var.f45528j0[i26].getLayoutParams();
            if (x50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (nm0Var != null) {
            ((FrameLayout.LayoutParams) nm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (w30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) w30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (x50Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d50Var.getLayoutParams();
        if (x50.G3) {
            if (x50Var.I2) {
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
            if (x50.F3) {
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
        if (x50.F3 && !x50.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (x50.G3) {
                if (x50Var.I2) {
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
            if (x50.G3) {
                if (x50Var.I2) {
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
        if (x50.F3) {
            k30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            k30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) b30Var.getLayoutParams();
        if (x50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (x50Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (x50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (x50.F3 && !x50.G3) {
            ((FrameLayout.LayoutParams) t40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) h30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) t40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) h30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (x50.F3) {
            if (((s4.c0) k30Var.getLayoutManager()).f47743o != 1) {
                ((s4.c0) k30Var.getLayoutManager()).k1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) k30Var.getLayoutManager()).f47743o != 0) {
                ((s4.c0) k30Var.getLayoutManager()).k1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        y30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) y30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (w30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) w30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (x50.G3) {
            z13 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            z13 = org.telegram.messenger.t.z(8.0f, i25 - max, 0);
        }
        if (d50Var.getPaddingTop() != z13 || d50Var.getPaddingBottom() != dp2) {
            d50Var.setPadding(i14, z13, i14, dp2);
        }
        v50 v50Var = x50Var.B1;
        if (v50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) v50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = x50.I0(x50Var);
            if (I0 != null) {
                int measuredHeight = ((b30Var.getMeasuredHeight() / 2) + b30Var.getTop()) - (x50Var.f45564s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z13;
                layoutParams9.topMargin = ic.a.A(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        m50 m50Var = x50Var.U0;
        if (m50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) m50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = x50.I0(x50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (b6Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - z13)) / 2) + z13;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) b6Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) x50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    b6Var.setVisibility(0);
                    b6Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            b6Var.setVisibility(4);
            b6Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(o30Var.f34008b, true);
        }
        this.f37884l0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f37885n0) {
            this.f37885n0 = measuredHeight3;
            x50Var.d1(false);
        }
        x50Var.f45562r2.f33925f = getMeasuredWidth();
        x50Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37890s0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37884l0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f37890s0.R1();
    }
}
