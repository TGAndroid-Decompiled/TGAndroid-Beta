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
public final class j50 extends org.telegram.ui.Components.pv0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final f60 D0;
    public boolean f34327w0;
    public final RectF f34328x0;
    public int f34329y0;
    public boolean f34330z0;

    public j50(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = f60Var;
        this.f34327w0 = false;
        this.f34328x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f60 f60Var = this.D0;
        k30 k30Var = f60Var.e;
        t30 t30Var = f60Var.f33147m2;
        l50 l50Var = f60Var.Q;
        x30 x30Var = f60Var.a2;
        if (f60Var.f33174s2) {
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
                return super.drawChild(canvas, view, j3);
            }
        } else if (f60.G3 || x30Var.f29031c != 1.0f || (view != f60Var.O && view != f60Var.f33124g0 && view != f60Var.N && view != f60Var.f33116e1 && view != f60Var.f33203z1 && view != f60Var.U0)) {
            if (f60Var.F2 && view == x30Var) {
                canvas.save();
                canvas.translate(t30Var.getX() + x30Var.getX(), t30Var.getY() + x30Var.getY());
                t30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != f60Var.C2 && view != f60Var.f33117e2 && view != f60Var.X2 && (!f60Var.f33144l2 || !f60Var.f33126g2 || (view != l50Var && view != k30Var && view != f60Var.f33107c0))) {
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
        f60 f60Var = this.D0;
        ImageReceiver imageReceiver = f60Var.Z;
        Drawable drawable = f60Var.f33120f0;
        x30 x30Var = f60Var.a2;
        float f10 = f60Var.f33199y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        f60Var.Q1();
        if (x30Var.f29031c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f19076t0.setColor(f60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f34328x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f19076t0);
            }
            org.telegram.ui.ActionBar.h6.f19076t0.setColor(Color.argb((int) (f60Var.O.getAlpha() * 255.0f), (int) (Color.red(f60Var.V1) * 0.8f), (int) (Color.green(f60Var.V1) * 0.8f), (int) (Color.blue(f60Var.V1) * 0.8f)));
            float statusBarHeight = f60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.h6.f19076t0);
            r40 r40Var = f60Var.f33202z0;
            if (r40Var != null) {
                org.telegram.ui.ActionBar.h6.f19076t0.setColor(r40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, f60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.h6.f19076t0);
            }
        }
        if (x30Var.f29031c != 0.0f) {
            org.telegram.ui.ActionBar.h6.f19076t0.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18851gg, false), (int) (x30Var.f29031c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f19076t0);
        }
        if (f60Var.r1() && LiteMode.isEnabled(512)) {
            if (x30Var.f29031c < 0.15d) {
                if (!f60Var.f33204z2) {
                    f60Var.f33204z2 = true;
                    f60Var.z1();
                }
            } else if (f60Var.f33204z2) {
                f60Var.f33204z2 = false;
                AndroidUtilities.cancelRunOnUIThread(f60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f60 f60Var = this.D0;
        a40 a40Var = f60Var.C2;
        if (f60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = f60Var.f33117e2.getX();
            float y10 = f60Var.f33117e2.getY();
            float x12 = f60Var.f33117e2.getX() + f60Var.f33117e2.getMeasuredWidth();
            float y11 = f60Var.f33117e2.getY() + f60Var.f33117e2.getMeasuredHeight();
            RectF rectF = this.f34328x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(a40Var.getX(), a40Var.getY(), a40Var.getX() + a40Var.getMeasuredWidth(), a40Var.getY() + a40Var.getMeasuredWidth() + f60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                f60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && f60Var.f33199y0 != 0.0f && motionEvent.getY() < f60Var.f33199y0 - AndroidUtilities.dp(37.0f) && f60Var.O.getAlpha() == 0.0f && !f60Var.f33122f2 && f60Var.f33202z0 == null && !f60Var.a2.f29029b) {
            f60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        f60 f60Var = this.D0;
        if (f60Var.X2 != null && i10 == 4) {
            f60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        f60 f60Var = this.D0;
        View view = f60Var.K2;
        View view2 = f60Var.J2;
        k30 k30Var = f60Var.e;
        x30 x30Var = f60Var.a2;
        l50 l50Var = f60Var.Q;
        if (f60.G3 && this.A0 != f60Var.I2 && this.B0) {
            f7 = l50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = f60Var.I2;
        x30Var.f29050s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        x30Var.f29050s = false;
        f60.J0(f60Var);
        this.B0 = true;
        if (z11 && l50Var.getLeft() != f7) {
            float left = f7 - l50Var.getLeft();
            l50Var.setTranslationX(left);
            k30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = l50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
            duration.setInterpolator(rrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
            k30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
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
        f60 f60Var = this.D0;
        h40 h40Var = f60Var.G;
        q30 q30Var = f60Var.N;
        LinearLayout linearLayout = f60Var.f33203z1;
        b50 b50Var = f60Var.O;
        l60 l60Var = f60Var.f33156o2;
        org.telegram.ui.Components.t20 t20Var = f60Var.f33160p2;
        org.telegram.ui.Components.pz pzVar = f60Var.Y;
        org.telegram.ui.Components.voip.v2 v2Var = f60Var.f33188w;
        org.telegram.ui.ActionBar.i5 i5Var = f60Var.U;
        View view = f60Var.f33124g0;
        k30 k30Var = f60Var.e;
        View view2 = f60Var.K2;
        View view3 = f60Var.J2;
        ArrayList arrayList = f60Var.Y1;
        org.telegram.ui.ActionBar.i5 i5Var2 = f60Var.W;
        f40 f40Var = f60Var.H;
        ArrayList arrayList2 = f60Var.Z1;
        org.telegram.ui.Components.ml0 ml0Var = f60Var.f33152n2;
        l50 l50Var = f60Var.Q;
        x30 x30Var = f60Var.a2;
        t30 t30Var = f60Var.f33147m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f34327w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        x30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !f60Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (f60.F3 != z10) {
            f60.F3 = z10;
            if (v2Var.getMeasuredWidth() == 0) {
                int i23 = v2Var.getLayoutParams().width;
            }
            f60.H0(f60Var);
            if (f60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            pzVar.y1(i21);
            l50Var.a0();
            t30Var.a0();
            this.f34330z0 = true;
            TextView textView = f60Var.S;
            if (textView != null) {
                if (!f60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (f60Var.q1() == z10 && f60Var.r1() && !x30Var.f29029b && !f60Var.f33099a1.visibleVideoParticipants.isEmpty()) {
                f60Var.e1(f60Var.f33099a1.visibleVideoParticipants.get(0));
                x30Var.e();
            }
        }
        if (f60.G3 != z11) {
            f60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            ml0Var.setVisibility(i20);
            l50Var.a0();
            t30Var.a0();
            z12 = true;
            this.f34330z0 = true;
        } else {
            z12 = true;
        }
        if (this.f34330z0) {
            f60Var.O0(z12);
            f60Var.P.l();
            t20Var.G(ml0Var, false);
            if (f60.G3) {
                l60Var.I(ml0Var, false);
            }
            if (f60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            ml0Var.setVisibility(i16);
            if (f60.G3 && !x30Var.f29029b) {
                z13 = true;
            } else {
                z13 = false;
            }
            l60Var.H(ml0Var, z13, true);
            boolean z16 = f60.G3;
            if (z16 && !x30Var.f29029b) {
                z14 = false;
            } else {
                z14 = true;
            }
            f60Var.P2 = z14;
            if (!z16 && x30Var.f29029b) {
                z15 = true;
            } else {
                z15 = false;
            }
            t20Var.F(t30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            t30Var.setVisibility(i17);
            if (!f60.G3 && x30Var.f29029b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            l50Var.setVisibility(i18);
            if (f60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            pzVar.y1(i19);
            f60Var.N1(false, false);
            l50Var.a0();
            t30Var.a0();
            AndroidUtilities.updateVisibleRows(l50Var);
            this.f34330z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            x30Var.setIsTablet(f60.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (f60Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x30Var.getLayoutParams();
        if (f60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f60Var.f33136j0[i26].getLayoutParams();
            if (f60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (ml0Var != null) {
            ((FrameLayout.LayoutParams) ml0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (f40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (f60Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l50Var.getLayoutParams();
        if (f60.G3) {
            if (f60Var.I2) {
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
            if (f60.F3) {
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
        if (f60.F3 && !f60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (f60.G3) {
                if (f60Var.I2) {
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
            if (f60.G3) {
                if (f60Var.I2) {
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
        if (f60.F3) {
            t30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            t30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (f60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (f60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (f60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (f60.F3 && !f60.G3) {
            ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) q30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) q30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
        if (f60.F3) {
            if (((s4.c0) t30Var.getLayoutManager()).f42615o != 1) {
                ((s4.c0) t30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) t30Var.getLayoutManager()).f42615o != 0) {
                ((s4.c0) t30Var.getLayoutManager()).j1(0);
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
        if (f60.G3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.z0.b(8.0f, i25 - max, 0);
        }
        if (l50Var.getPaddingTop() != b10 || l50Var.getPaddingBottom() != dp2) {
            l50Var.setPadding(i14, b10, i14, dp2);
        }
        d60 d60Var = f60Var.B1;
        if (d60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) d60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = f60.I0(f60Var);
            if (I0 != null) {
                int measuredHeight = ((k30Var.getMeasuredHeight() / 2) + k30Var.getTop()) - (f60Var.f33171s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = hg.c.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        u50 u50Var = f60Var.U0;
        if (u50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) u50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = f60.I0(f60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (i5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) i5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) i5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) f60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    i5Var.setVisibility(0);
                    i5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            i5Var.setVisibility(4);
            i5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(x30Var.f29029b, true);
        }
        this.f34327w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f34329y0) {
            this.f34329y0 = measuredHeight3;
            f60Var.d1(false);
        }
        f60Var.f33169r2.f28936f = getMeasuredWidth();
        f60Var.Y0();
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
        if (this.f34327w0) {
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
