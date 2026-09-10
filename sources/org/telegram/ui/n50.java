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
public final class n50 extends org.telegram.ui.Components.aw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final j60 D0;
    public boolean f35116w0;
    public final RectF f35117x0;
    public int f35118y0;
    public boolean f35119z0;

    public n50(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = j60Var;
        this.f35116w0 = false;
        this.f35117x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        j60 j60Var = this.D0;
        o30 o30Var = j60Var.e;
        x30 x30Var = j60Var.f33984m2;
        p50 p50Var = j60Var.Q;
        b40 b40Var = j60Var.a2;
        if (j60Var.f34011s2) {
            if (view == p50Var) {
                int childCount = p50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = p50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == b40Var || view == o30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (j60.G3 || b40Var.f28243c != 1.0f || (view != j60Var.O && view != j60Var.f33961g0 && view != j60Var.N && view != j60Var.f33953e1 && view != j60Var.f34040z1 && view != j60Var.U0)) {
            if (j60Var.F2 && view == b40Var) {
                canvas.save();
                canvas.translate(x30Var.getX() + b40Var.getX(), x30Var.getY() + b40Var.getY());
                x30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != j60Var.C2 && view != j60Var.f33954e2 && view != j60Var.X2 && (!j60Var.f33981l2 || !j60Var.f33963g2 || (view != p50Var && view != o30Var && view != j60Var.f33944c0))) {
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
        j60 j60Var = this.D0;
        ImageReceiver imageReceiver = j60Var.Z;
        Drawable drawable = j60Var.f33957f0;
        b40 b40Var = j60Var.a2;
        float f10 = j60Var.f34036y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        j60Var.Q1();
        if (b40Var.f28243c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f18212t0.setColor(j60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f35117x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f18212t0);
            }
            org.telegram.ui.ActionBar.j6.f18212t0.setColor(Color.argb((int) (j60Var.O.getAlpha() * 255.0f), (int) (Color.red(j60Var.V1) * 0.8f), (int) (Color.green(j60Var.V1) * 0.8f), (int) (Color.blue(j60Var.V1) * 0.8f)));
            float statusBarHeight = j60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.f18212t0);
            v40 v40Var = j60Var.f34039z0;
            if (v40Var != null) {
                org.telegram.ui.ActionBar.j6.f18212t0.setColor(v40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, j60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.f18212t0);
            }
        }
        if (b40Var.f28243c != 0.0f) {
            org.telegram.ui.ActionBar.j6.f18212t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17990gg, false), (int) (b40Var.f28243c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18212t0);
        }
        if (j60Var.r1() && LiteMode.isEnabled(512)) {
            if (b40Var.f28243c < 0.15d) {
                if (!j60Var.f34041z2) {
                    j60Var.f34041z2 = true;
                    j60Var.z1();
                }
            } else if (j60Var.f34041z2) {
                j60Var.f34041z2 = false;
                AndroidUtilities.cancelRunOnUIThread(j60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j60 j60Var = this.D0;
        e40 e40Var = j60Var.C2;
        if (j60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = j60Var.f33954e2.getX();
            float y10 = j60Var.f33954e2.getY();
            float x12 = j60Var.f33954e2.getX() + j60Var.f33954e2.getMeasuredWidth();
            float y11 = j60Var.f33954e2.getY() + j60Var.f33954e2.getMeasuredHeight();
            RectF rectF = this.f35117x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(e40Var.getX(), e40Var.getY(), e40Var.getX() + e40Var.getMeasuredWidth(), e40Var.getY() + e40Var.getMeasuredWidth() + j60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                j60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && j60Var.f34036y0 != 0.0f && motionEvent.getY() < j60Var.f34036y0 - AndroidUtilities.dp(37.0f) && j60Var.O.getAlpha() == 0.0f && !j60Var.f33959f2 && j60Var.f34039z0 == null && !j60Var.a2.f28241b) {
            j60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        j60 j60Var = this.D0;
        if (j60Var.X2 != null && i10 == 4) {
            j60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        j60 j60Var = this.D0;
        View view = j60Var.K2;
        View view2 = j60Var.J2;
        o30 o30Var = j60Var.e;
        b40 b40Var = j60Var.a2;
        p50 p50Var = j60Var.Q;
        if (j60.G3 && this.A0 != j60Var.I2 && this.B0) {
            f7 = p50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = j60Var.I2;
        b40Var.f28262s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        b40Var.f28262s = false;
        j60.J0(j60Var);
        this.B0 = true;
        if (z11 && p50Var.getLeft() != f7) {
            float left = f7 - p50Var.getLeft();
            p50Var.setTranslationX(left);
            o30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = p50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
            duration.setInterpolator(wrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(wrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(wrVar).start();
            o30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(wrVar).start();
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
        j60 j60Var = this.D0;
        l40 l40Var = j60Var.G;
        u30 u30Var = j60Var.N;
        LinearLayout linearLayout = j60Var.f34040z1;
        f50 f50Var = j60Var.O;
        p60 p60Var = j60Var.f33993o2;
        org.telegram.ui.Components.b30 b30Var = j60Var.f33997p2;
        org.telegram.ui.Components.vz vzVar = j60Var.Y;
        org.telegram.ui.Components.voip.u2 u2Var = j60Var.f34025w;
        org.telegram.ui.ActionBar.l5 l5Var = j60Var.U;
        View view = j60Var.f33961g0;
        o30 o30Var = j60Var.e;
        View view2 = j60Var.K2;
        View view3 = j60Var.J2;
        ArrayList arrayList = j60Var.Y1;
        org.telegram.ui.ActionBar.l5 l5Var2 = j60Var.W;
        j40 j40Var = j60Var.H;
        ArrayList arrayList2 = j60Var.Z1;
        org.telegram.ui.Components.vl0 vl0Var = j60Var.f33989n2;
        p50 p50Var = j60Var.Q;
        b40 b40Var = j60Var.a2;
        x30 x30Var = j60Var.f33984m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f35116w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        b40Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !j60Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j60.F3 != z10) {
            j60.F3 = z10;
            if (u2Var.getMeasuredWidth() == 0) {
                int i23 = u2Var.getLayoutParams().width;
            }
            j60.H0(j60Var);
            if (j60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            vzVar.y1(i21);
            p50Var.a0();
            x30Var.a0();
            this.f35119z0 = true;
            TextView textView = j60Var.S;
            if (textView != null) {
                if (!j60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (j60Var.q1() == z10 && j60Var.r1() && !b40Var.f28241b && !j60Var.f33936a1.visibleVideoParticipants.isEmpty()) {
                j60Var.e1(j60Var.f33936a1.visibleVideoParticipants.get(0));
                b40Var.e();
            }
        }
        if (j60.G3 != z11) {
            j60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            vl0Var.setVisibility(i20);
            p50Var.a0();
            x30Var.a0();
            z12 = true;
            this.f35119z0 = true;
        } else {
            z12 = true;
        }
        if (this.f35119z0) {
            j60Var.O0(z12);
            j60Var.P.l();
            b30Var.G(vl0Var, false);
            if (j60.G3) {
                p60Var.I(vl0Var, false);
            }
            if (j60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            vl0Var.setVisibility(i16);
            if (j60.G3 && !b40Var.f28241b) {
                z13 = true;
            } else {
                z13 = false;
            }
            p60Var.H(vl0Var, z13, true);
            boolean z16 = j60.G3;
            if (z16 && !b40Var.f28241b) {
                z14 = false;
            } else {
                z14 = true;
            }
            j60Var.P2 = z14;
            if (!z16 && b40Var.f28241b) {
                z15 = true;
            } else {
                z15 = false;
            }
            b30Var.F(x30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            x30Var.setVisibility(i17);
            if (!j60.G3 && b40Var.f28241b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            p50Var.setVisibility(i18);
            if (j60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            vzVar.y1(i19);
            j60Var.N1(false, false);
            p50Var.a0();
            x30Var.a0();
            AndroidUtilities.updateVisibleRows(p50Var);
            this.f35119z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            b40Var.setIsTablet(j60.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (j60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b40Var.getLayoutParams();
        if (j60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j60Var.f33973j0[i26].getLayoutParams();
            if (j60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (vl0Var != null) {
            ((FrameLayout.LayoutParams) vl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (j40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (j60Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p50Var.getLayoutParams();
        if (j60.G3) {
            if (j60Var.I2) {
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
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            dp2 = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (j60.F3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp2 = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp3;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int dp5 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp5;
                layoutParams3.rightMargin = dp5;
            }
        }
        int i27 = 81;
        if (j60.F3 && !j60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (j60.G3) {
                if (j60Var.I2) {
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
            if (j60.G3) {
                if (j60Var.I2) {
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
        if (j60.F3) {
            x30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            x30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) o30Var.getLayoutParams();
        if (j60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (j60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (j60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (j60.F3 && !j60.G3) {
            ((FrameLayout.LayoutParams) f50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) u30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) f50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) u30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) x30Var.getLayoutParams();
        if (j60.F3) {
            if (((s4.c0) x30Var.getLayoutManager()).f41598o != 1) {
                ((s4.c0) x30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) x30Var.getLayoutManager()).f41598o != 0) {
                ((s4.c0) x30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        l40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) l40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (j40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (j60.G3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.a2.b(8.0f, i25 - max, 0);
        }
        if (p50Var.getPaddingTop() != b10 || p50Var.getPaddingBottom() != dp2) {
            p50Var.setPadding(i14, b10, i14, dp2);
        }
        h60 h60Var = j60Var.B1;
        if (h60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) h60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = j60.I0(j60Var);
            if (I0 != null) {
                int measuredHeight = ((o30Var.getMeasuredHeight() / 2) + o30Var.getTop()) - (j60Var.f34008s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = hc.b.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        y50 y50Var = j60Var.U0;
        if (y50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) y50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = j60.I0(j60Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) j60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
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
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(b40Var.f28241b, true);
        }
        this.f35116w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f35118y0) {
            this.f35118y0 = measuredHeight3;
            j60Var.d1(false);
        }
        j60Var.f34006r2.f28147f = getMeasuredWidth();
        j60Var.Y0();
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
        if (this.f35116w0) {
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
