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
public final class o50 extends org.telegram.ui.Components.qv0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final k60 D0;
    public boolean f36231w0;
    public final RectF f36232x0;
    public int f36233y0;
    public boolean f36234z0;

    public o50(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = k60Var;
        this.f36231w0 = false;
        this.f36232x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        k60 k60Var = this.D0;
        p30 p30Var = k60Var.e;
        y30 y30Var = k60Var.f35065m2;
        q50 q50Var = k60Var.Q;
        c40 c40Var = k60Var.a2;
        if (k60Var.f35092s2) {
            if (view == q50Var) {
                int childCount = q50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = q50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == c40Var || view == p30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (k60.G3 || c40Var.f29040c != 1.0f || (view != k60Var.O && view != k60Var.f35042g0 && view != k60Var.N && view != k60Var.f35034e1 && view != k60Var.f35121z1 && view != k60Var.U0)) {
            if (k60Var.F2 && view == c40Var) {
                canvas.save();
                canvas.translate(y30Var.getX() + c40Var.getX(), y30Var.getY() + c40Var.getY());
                y30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != k60Var.C2 && view != k60Var.f35035e2 && view != k60Var.X2 && (!k60Var.f35062l2 || !k60Var.f35044g2 || (view != q50Var && view != p30Var && view != k60Var.f35025c0))) {
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
        k60 k60Var = this.D0;
        ImageReceiver imageReceiver = k60Var.Z;
        Drawable drawable = k60Var.f35038f0;
        c40 c40Var = k60Var.a2;
        float f10 = k60Var.f35117y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        k60Var.Q1();
        if (c40Var.f29040c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f19151t0.setColor(k60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f36232x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f19151t0);
            }
            org.telegram.ui.ActionBar.j6.f19151t0.setColor(Color.argb((int) (k60Var.O.getAlpha() * 255.0f), (int) (Color.red(k60Var.V1) * 0.8f), (int) (Color.green(k60Var.V1) * 0.8f), (int) (Color.blue(k60Var.V1) * 0.8f)));
            float statusBarHeight = k60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.f19151t0);
            w40 w40Var = k60Var.f35120z0;
            if (w40Var != null) {
                org.telegram.ui.ActionBar.j6.f19151t0.setColor(w40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, k60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.f19151t0);
            }
        }
        if (c40Var.f29040c != 0.0f) {
            org.telegram.ui.ActionBar.j6.f19151t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18926gg, false), (int) (c40Var.f29040c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f19151t0);
        }
        if (k60Var.r1() && LiteMode.isEnabled(512)) {
            if (c40Var.f29040c < 0.15d) {
                if (!k60Var.f35122z2) {
                    k60Var.f35122z2 = true;
                    k60Var.z1();
                }
            } else if (k60Var.f35122z2) {
                k60Var.f35122z2 = false;
                AndroidUtilities.cancelRunOnUIThread(k60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k60 k60Var = this.D0;
        f40 f40Var = k60Var.C2;
        if (k60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = k60Var.f35035e2.getX();
            float y10 = k60Var.f35035e2.getY();
            float x12 = k60Var.f35035e2.getX() + k60Var.f35035e2.getMeasuredWidth();
            float y11 = k60Var.f35035e2.getY() + k60Var.f35035e2.getMeasuredHeight();
            RectF rectF = this.f36232x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(f40Var.getX(), f40Var.getY(), f40Var.getX() + f40Var.getMeasuredWidth(), f40Var.getY() + f40Var.getMeasuredWidth() + k60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                k60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && k60Var.f35117y0 != 0.0f && motionEvent.getY() < k60Var.f35117y0 - AndroidUtilities.dp(37.0f) && k60Var.O.getAlpha() == 0.0f && !k60Var.f35040f2 && k60Var.f35120z0 == null && !k60Var.a2.f29038b) {
            k60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        k60 k60Var = this.D0;
        if (k60Var.X2 != null && i10 == 4) {
            k60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        k60 k60Var = this.D0;
        View view = k60Var.K2;
        View view2 = k60Var.J2;
        p30 p30Var = k60Var.e;
        c40 c40Var = k60Var.a2;
        q50 q50Var = k60Var.Q;
        if (k60.G3 && this.A0 != k60Var.I2 && this.B0) {
            f7 = q50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = k60Var.I2;
        c40Var.f29059s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        c40Var.f29059s = false;
        k60.J0(k60Var);
        this.B0 = true;
        if (z11 && q50Var.getLeft() != f7) {
            float left = f7 - q50Var.getLeft();
            q50Var.setTranslationX(left);
            p30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = q50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27383f;
            duration.setInterpolator(qrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
            p30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
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
        k60 k60Var = this.D0;
        m40 m40Var = k60Var.G;
        v30 v30Var = k60Var.N;
        LinearLayout linearLayout = k60Var.f35121z1;
        g50 g50Var = k60Var.O;
        q60 q60Var = k60Var.f35074o2;
        org.telegram.ui.Components.s20 s20Var = k60Var.f35078p2;
        org.telegram.ui.Components.oz ozVar = k60Var.Y;
        org.telegram.ui.Components.voip.v2 v2Var = k60Var.f35106w;
        org.telegram.ui.ActionBar.k5 k5Var = k60Var.U;
        View view = k60Var.f35042g0;
        p30 p30Var = k60Var.e;
        View view2 = k60Var.K2;
        View view3 = k60Var.J2;
        ArrayList arrayList = k60Var.Y1;
        org.telegram.ui.ActionBar.k5 k5Var2 = k60Var.W;
        k40 k40Var = k60Var.H;
        ArrayList arrayList2 = k60Var.Z1;
        org.telegram.ui.Components.ml0 ml0Var = k60Var.f35070n2;
        q50 q50Var = k60Var.Q;
        c40 c40Var = k60Var.a2;
        y30 y30Var = k60Var.f35065m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f36231w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        c40Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !k60Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (k60.F3 != z10) {
            k60.F3 = z10;
            if (v2Var.getMeasuredWidth() == 0) {
                int i23 = v2Var.getLayoutParams().width;
            }
            k60.H0(k60Var);
            if (k60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            ozVar.y1(i21);
            q50Var.b0();
            y30Var.b0();
            this.f36234z0 = true;
            TextView textView = k60Var.S;
            if (textView != null) {
                if (!k60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (k60Var.q1() == z10 && k60Var.r1() && !c40Var.f29038b && !k60Var.f35017a1.visibleVideoParticipants.isEmpty()) {
                k60Var.e1(k60Var.f35017a1.visibleVideoParticipants.get(0));
                c40Var.e();
            }
        }
        if (k60.G3 != z11) {
            k60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            ml0Var.setVisibility(i20);
            q50Var.b0();
            y30Var.b0();
            z12 = true;
            this.f36234z0 = true;
        } else {
            z12 = true;
        }
        if (this.f36234z0) {
            k60Var.O0(z12);
            k60Var.P.l();
            s20Var.G(ml0Var, false);
            if (k60.G3) {
                q60Var.I(ml0Var, false);
            }
            if (k60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            ml0Var.setVisibility(i16);
            if (k60.G3 && !c40Var.f29038b) {
                z13 = true;
            } else {
                z13 = false;
            }
            q60Var.H(ml0Var, z13, true);
            boolean z16 = k60.G3;
            if (z16 && !c40Var.f29038b) {
                z14 = false;
            } else {
                z14 = true;
            }
            k60Var.P2 = z14;
            if (!z16 && c40Var.f29038b) {
                z15 = true;
            } else {
                z15 = false;
            }
            s20Var.F(y30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            y30Var.setVisibility(i17);
            if (!k60.G3 && c40Var.f29038b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            q50Var.setVisibility(i18);
            if (k60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            ozVar.y1(i19);
            k60Var.N1(false, false);
            q50Var.b0();
            y30Var.b0();
            AndroidUtilities.updateVisibleRows(q50Var);
            this.f36234z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            c40Var.setIsTablet(k60.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (k60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c40Var.getLayoutParams();
        if (k60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) k60Var.f35054j0[i26].getLayoutParams();
            if (k60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (ml0Var != null) {
            ((FrameLayout.LayoutParams) ml0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (k40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (k60Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) q50Var.getLayoutParams();
        if (k60.G3) {
            if (k60Var.I2) {
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
            if (k60.F3) {
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
        if (k60.F3 && !k60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (k60.G3) {
                if (k60Var.I2) {
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
            if (k60.G3) {
                if (k60Var.I2) {
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
        if (k60.F3) {
            y30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            y30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) p30Var.getLayoutParams();
        if (k60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (k60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (k60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (k60.F3 && !k60.G3) {
            ((FrameLayout.LayoutParams) g50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) v30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) g50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) v30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) y30Var.getLayoutParams();
        if (k60.F3) {
            if (((s4.c0) y30Var.getLayoutManager()).f42690o != 1) {
                ((s4.c0) y30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) y30Var.getLayoutManager()).f42690o != 0) {
                ((s4.c0) y30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        m40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) m40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (k40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (k60.G3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.w1.b(8.0f, i25 - max, 0);
        }
        if (q50Var.getPaddingTop() != b10 || q50Var.getPaddingBottom() != dp2) {
            q50Var.setPadding(i14, b10, i14, dp2);
        }
        i60 i60Var = k60Var.B1;
        if (i60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) i60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = k60.I0(k60Var);
            if (I0 != null) {
                int measuredHeight = ((p30Var.getMeasuredHeight() / 2) + p30Var.getTop()) - (k60Var.f35089s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = hg.k0.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        z50 z50Var = k60Var.U0;
        if (z50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) z50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = k60.I0(k60Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) k60Var.V.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(c40Var.f29038b, true);
        }
        this.f36231w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f36233y0) {
            this.f36233y0 = measuredHeight3;
            k60Var.d1(false);
        }
        k60Var.f35087r2.f28945f = getMeasuredWidth();
        k60Var.Y0();
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
        if (this.f36231w0) {
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
