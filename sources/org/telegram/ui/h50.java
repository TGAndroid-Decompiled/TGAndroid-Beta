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
public final class h50 extends org.telegram.ui.Components.qv0 {
    public final c60 A0;
    public boolean f34757t0;
    public final RectF f34758u0;
    public int f34759v0;
    public boolean f34760w0;
    public boolean f34761x0;
    public boolean f34762y0;
    public final HashMap f34763z0;

    public h50(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.A0 = c60Var;
        this.f34757t0 = false;
        this.f34758u0 = new RectF();
        this.f34763z0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c60 c60Var = this.A0;
        i30 i30Var = c60Var.e;
        r30 r30Var = c60Var.f33137j2;
        j50 j50Var = c60Var.N;
        v30 v30Var = c60Var.X1;
        if (c60Var.f33160p2) {
            if (view == j50Var) {
                int childCount = j50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = j50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == v30Var || view == i30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (c60.D3 || v30Var.f29715c != 1.0f || (view != c60Var.L && view != c60Var.f33110d0 && view != c60Var.K && view != c60Var.f33103b1 && view != c60Var.f33190w1 && view != c60Var.R0)) {
            if (c60Var.C2 && view == v30Var) {
                canvas.save();
                canvas.translate(r30Var.getX() + v30Var.getX(), r30Var.getY() + v30Var.getY());
                r30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != c60Var.f33205z2 && view != c60Var.f33104b2 && view != c60Var.U2 && (!c60Var.f33133i2 || !c60Var.f33112d2 || (view != j50Var && view != i30Var && view != c60Var.Z))) {
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
        c60 c60Var = this.A0;
        ImageReceiver imageReceiver = c60Var.W;
        Drawable drawable = c60Var.f33107c0;
        v30 v30Var = c60Var.X1;
        float f11 = c60Var.f33184v0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        c60Var.Q1();
        if (v30Var.f29715c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f20185t0.setColor(c60Var.S1);
                i16 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f34758u0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.j6.f20185t0);
            }
            org.telegram.ui.ActionBar.j6.f20185t0.setColor(Color.argb((int) (c60Var.L.getAlpha() * 255.0f), (int) (Color.red(c60Var.S1) * 0.8f), (int) (Color.green(c60Var.S1) * 0.8f), (int) (Color.blue(c60Var.S1) * 0.8f)));
            float statusBarHeight = c60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.f20185t0);
            p40 p40Var = c60Var.f33189w0;
            if (p40Var != null) {
                org.telegram.ui.ActionBar.j6.f20185t0.setColor(p40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                float f12 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                canvas.drawRect(f12, 0.0f, measuredWidth3 - i15, c60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.f20185t0);
            }
        }
        if (v30Var.f29715c != 0.0f) {
            org.telegram.ui.ActionBar.j6.f20185t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970gg, false), (int) (v30Var.f29715c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20185t0);
        }
        if (c60Var.r1() && LiteMode.isEnabled(512)) {
            if (v30Var.f29715c < 0.15d) {
                if (!c60Var.f33191w2) {
                    c60Var.f33191w2 = true;
                    c60Var.z1();
                }
            } else if (c60Var.f33191w2) {
                c60Var.f33191w2 = false;
                AndroidUtilities.cancelRunOnUIThread(c60Var.f33196x2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c60 c60Var = this.A0;
        y30 y30Var = c60Var.f33205z2;
        if (c60Var.U2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = c60Var.f33104b2.getX();
            float y11 = c60Var.f33104b2.getY();
            float x12 = c60Var.f33104b2.getX() + c60Var.f33104b2.getMeasuredWidth();
            float y12 = c60Var.f33104b2.getY() + c60Var.f33104b2.getMeasuredHeight();
            RectF rectF = this.f34758u0;
            rectF.set(x11, y11, x12, y12);
            boolean z4 = !rectF.contains(x10, y10);
            rectF.set(y30Var.getX(), y30Var.getY(), y30Var.getX() + y30Var.getMeasuredWidth(), y30Var.getY() + y30Var.getMeasuredWidth() + c60Var.U2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z4 = false;
            }
            if (z4) {
                c60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && c60Var.f33184v0 != 0.0f && motionEvent.getY() < c60Var.f33184v0 - AndroidUtilities.dp(37.0f) && c60Var.L.getAlpha() == 0.0f && !c60Var.f33109c2 && c60Var.f33189w0 == null && !c60Var.X1.f29713b) {
            c60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        c60 c60Var = this.A0;
        if (c60Var.U2 != null && i10 == 4) {
            c60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z10;
        c60 c60Var = this.A0;
        View view = c60Var.H2;
        View view2 = c60Var.G2;
        i30 i30Var = c60Var.e;
        v30 v30Var = c60Var.X1;
        j50 j50Var = c60Var.N;
        if (c60.D3 && this.f34761x0 != c60Var.F2 && this.f34762y0) {
            f10 = j50Var.getX();
            z10 = true;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        this.f34761x0 = c60Var.F2;
        v30Var.f29734s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        v30Var.f29734s = false;
        c60.J0(c60Var);
        this.f34762y0 = true;
        if (z10 && j50Var.getLeft() != f10) {
            float left = f10 - j50Var.getLeft();
            j50Var.setTranslationX(left);
            i30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = j50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
            duration.setInterpolator(nrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
            i30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
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
        c60 c60Var = this.A0;
        f40 f40Var = c60Var.D;
        o30 o30Var = c60Var.K;
        LinearLayout linearLayout = c60Var.f33190w1;
        z40 z40Var = c60Var.L;
        i60 i60Var = c60Var.f33144l2;
        org.telegram.ui.Components.t20 t20Var = c60Var.f33147m2;
        org.telegram.ui.Components.oz ozVar = c60Var.V;
        org.telegram.ui.Components.voip.v2 v2Var = c60Var.f33188w;
        org.telegram.ui.ActionBar.k5 k5Var = c60Var.R;
        View view = c60Var.f33110d0;
        i30 i30Var = c60Var.e;
        View view2 = c60Var.H2;
        View view3 = c60Var.G2;
        ArrayList arrayList = c60Var.V1;
        org.telegram.ui.ActionBar.k5 k5Var2 = c60Var.T;
        d40 d40Var = c60Var.E;
        ArrayList arrayList2 = c60Var.W1;
        org.telegram.ui.Components.sl0 sl0Var = c60Var.f33141k2;
        j50 j50Var = c60Var.N;
        v30 v30Var = c60Var.X1;
        r30 r30Var = c60Var.f33137j2;
        int size = View.MeasureSpec.getSize(i11);
        this.f34757t0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z4 = true;
        } else {
            z4 = false;
        }
        View.MeasureSpec.getSize(i10);
        v30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !c60Var.r1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c60.C3 != z4) {
            c60.C3 = z4;
            if (v2Var.getMeasuredWidth() == 0) {
                int i23 = v2Var.getLayoutParams().width;
            }
            c60.H0(c60Var);
            if (c60.C3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            ozVar.y1(i21);
            j50Var.a0();
            r30Var.a0();
            this.f34760w0 = true;
            TextView textView = c60Var.P;
            if (textView != null) {
                if (!c60.C3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (c60Var.q1() == z4 && c60Var.r1() && !v30Var.f29713b && !c60Var.X0.visibleVideoParticipants.isEmpty()) {
                c60Var.e1(c60Var.X0.visibleVideoParticipants.get(0));
                v30Var.e();
            }
        }
        if (c60.D3 != z10) {
            c60.D3 = z10;
            if (z10) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            sl0Var.setVisibility(i20);
            j50Var.a0();
            r30Var.a0();
            z11 = true;
            this.f34760w0 = true;
        } else {
            z11 = true;
        }
        if (this.f34760w0) {
            c60Var.O0(z11);
            c60Var.M.l();
            t20Var.G(sl0Var, false);
            if (c60.D3) {
                i60Var.I(sl0Var, false);
            }
            if (c60.D3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            sl0Var.setVisibility(i16);
            if (c60.D3 && !v30Var.f29713b) {
                z12 = true;
            } else {
                z12 = false;
            }
            i60Var.H(sl0Var, z12, true);
            boolean z15 = c60.D3;
            if (z15 && !v30Var.f29713b) {
                z13 = false;
            } else {
                z13 = true;
            }
            c60Var.M2 = z13;
            if (!z15 && v30Var.f29713b) {
                z14 = true;
            } else {
                z14 = false;
            }
            t20Var.F(r30Var, z14);
            if (z14) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            r30Var.setVisibility(i17);
            if (!c60.D3 && v30Var.f29713b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            j50Var.setVisibility(i18);
            if (c60.C3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            ozVar.y1(i19);
            c60Var.N1(false, false);
            j50Var.a0();
            r30Var.a0();
            AndroidUtilities.updateVisibleRows(j50Var);
            this.f34760w0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            v30Var.setIsTablet(c60.D3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (c60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v30Var.getLayoutParams();
        if (c60.D3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c60Var.f33123g0[i26].getLayoutParams();
            if (c60.D3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (sl0Var != null) {
            ((FrameLayout.LayoutParams) sl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (d40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) d40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (c60Var.r1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j50Var.getLayoutParams();
        if (c60.D3) {
            if (c60Var.F2) {
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
            if (c60.C3) {
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
        if (c60.C3 && !c60.D3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (c60.D3) {
                if (c60Var.F2) {
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
            if (c60.D3) {
                if (c60Var.F2) {
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
        if (c60.C3) {
            r30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            r30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        if (c60.D3) {
            layoutParams6.width = AndroidUtilities.dp(f12);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (c60Var.F2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (c60.C3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (c60.C3 && !c60.D3) {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
        } else {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        if (c60.C3) {
            if (((f2.i0) r30Var.getLayoutManager()).f5731o != 1) {
                ((f2.i0) r30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.i0) r30Var.getLayoutManager()).f5731o != 0) {
                ((f2.i0) r30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        f40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) f40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (d40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) d40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (c60.D3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.y3.b(8.0f, i25 - max, 0);
        }
        if (j50Var.getPaddingTop() != b10 || j50Var.getPaddingBottom() != dp2) {
            j50Var.setPadding(i14, b10, i14, dp2);
        }
        a60 a60Var = c60Var.f33200y1;
        if (a60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) a60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = c60.I0(c60Var);
            if (I0 != null) {
                int measuredHeight = ((i30Var.getMeasuredHeight() / 2) + i30Var.getTop()) - (c60Var.f33171s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = kh.a2.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        r50 r50Var = c60Var.R0;
        if (r50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) r50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = c60.I0(c60Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) c60Var.S.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(v30Var.f29713b, true);
        }
        this.f34757t0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f34759v0) {
            this.f34759v0 = measuredHeight3;
            c60Var.d1(false);
        }
        c60Var.f33156o2.f29656f = getMeasuredWidth();
        c60Var.Y0();
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
        if (this.f34757t0) {
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
