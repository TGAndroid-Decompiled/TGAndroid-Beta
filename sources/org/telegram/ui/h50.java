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
public final class h50 extends org.telegram.ui.Components.aw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final d60 D0;
    public boolean f34111w0;
    public final RectF f34112x0;
    public int f34113y0;
    public boolean f34114z0;

    public h50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = d60Var;
        this.f34111w0 = false;
        this.f34112x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d60 d60Var = this.D0;
        i30 i30Var = d60Var.e;
        r30 r30Var = d60Var.f32967m2;
        j50 j50Var = d60Var.Q;
        v30 v30Var = d60Var.a2;
        if (d60Var.f32994s2) {
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
                return super.drawChild(canvas, view, j3);
            }
        } else if (d60.G3 || v30Var.f29454c != 1.0f || (view != d60Var.O && view != d60Var.f32944g0 && view != d60Var.N && view != d60Var.f32936e1 && view != d60Var.f33023z1 && view != d60Var.U0)) {
            if (d60Var.F2 && view == v30Var) {
                canvas.save();
                canvas.translate(r30Var.getX() + v30Var.getX(), r30Var.getY() + v30Var.getY());
                r30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != d60Var.C2 && view != d60Var.f32937e2 && view != d60Var.X2 && (!d60Var.f32964l2 || !d60Var.f32946g2 || (view != j50Var && view != i30Var && view != d60Var.f32927c0))) {
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
        d60 d60Var = this.D0;
        ImageReceiver imageReceiver = d60Var.Z;
        Drawable drawable = d60Var.f32940f0;
        v30 v30Var = d60Var.a2;
        float f10 = d60Var.f33019y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        d60Var.Q1();
        if (v30Var.f29454c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f19334t0.setColor(d60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f34112x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f19334t0);
            }
            org.telegram.ui.ActionBar.h6.f19334t0.setColor(Color.argb((int) (d60Var.O.getAlpha() * 255.0f), (int) (Color.red(d60Var.V1) * 0.8f), (int) (Color.green(d60Var.V1) * 0.8f), (int) (Color.blue(d60Var.V1) * 0.8f)));
            float statusBarHeight = d60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.h6.f19334t0);
            p40 p40Var = d60Var.f33022z0;
            if (p40Var != null) {
                org.telegram.ui.ActionBar.h6.f19334t0.setColor(p40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, d60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.h6.f19334t0);
            }
        }
        if (v30Var.f29454c != 0.0f) {
            org.telegram.ui.ActionBar.h6.f19334t0.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19107gg, false), (int) (v30Var.f29454c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f19334t0);
        }
        if (d60Var.r1() && LiteMode.isEnabled(512)) {
            if (v30Var.f29454c < 0.15d) {
                if (!d60Var.f33024z2) {
                    d60Var.f33024z2 = true;
                    d60Var.z1();
                }
            } else if (d60Var.f33024z2) {
                d60Var.f33024z2 = false;
                AndroidUtilities.cancelRunOnUIThread(d60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d60 d60Var = this.D0;
        y30 y30Var = d60Var.C2;
        if (d60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = d60Var.f32937e2.getX();
            float y10 = d60Var.f32937e2.getY();
            float x12 = d60Var.f32937e2.getX() + d60Var.f32937e2.getMeasuredWidth();
            float y11 = d60Var.f32937e2.getY() + d60Var.f32937e2.getMeasuredHeight();
            RectF rectF = this.f34112x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(y30Var.getX(), y30Var.getY(), y30Var.getX() + y30Var.getMeasuredWidth(), y30Var.getY() + y30Var.getMeasuredWidth() + d60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                d60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && d60Var.f33019y0 != 0.0f && motionEvent.getY() < d60Var.f33019y0 - AndroidUtilities.dp(37.0f) && d60Var.O.getAlpha() == 0.0f && !d60Var.f32942f2 && d60Var.f33022z0 == null && !d60Var.a2.f29452b) {
            d60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        d60 d60Var = this.D0;
        if (d60Var.X2 != null && i10 == 4) {
            d60Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        d60 d60Var = this.D0;
        View view = d60Var.K2;
        View view2 = d60Var.J2;
        i30 i30Var = d60Var.e;
        v30 v30Var = d60Var.a2;
        j50 j50Var = d60Var.Q;
        if (d60.G3 && this.A0 != d60Var.I2 && this.B0) {
            f7 = j50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = d60Var.I2;
        v30Var.f29473s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        v30Var.f29473s = false;
        d60.J0(d60Var);
        this.B0 = true;
        if (z11 && j50Var.getLeft() != f7) {
            float left = f7 - j50Var.getLeft();
            j50Var.setTranslationX(left);
            i30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = j50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
            duration.setInterpolator(rrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
            i30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
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
        d60 d60Var = this.D0;
        f40 f40Var = d60Var.G;
        o30 o30Var = d60Var.N;
        LinearLayout linearLayout = d60Var.f33023z1;
        z40 z40Var = d60Var.O;
        j60 j60Var = d60Var.f32976o2;
        org.telegram.ui.Components.t20 t20Var = d60Var.f32980p2;
        org.telegram.ui.Components.pz pzVar = d60Var.Y;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.f33008w;
        org.telegram.ui.ActionBar.h5 h5Var = d60Var.U;
        View view = d60Var.f32944g0;
        i30 i30Var = d60Var.e;
        View view2 = d60Var.K2;
        View view3 = d60Var.J2;
        ArrayList arrayList = d60Var.Y1;
        org.telegram.ui.ActionBar.h5 h5Var2 = d60Var.W;
        d40 d40Var = d60Var.H;
        ArrayList arrayList2 = d60Var.Z1;
        org.telegram.ui.Components.wl0 wl0Var = d60Var.f32972n2;
        j50 j50Var = d60Var.Q;
        v30 v30Var = d60Var.a2;
        r30 r30Var = d60Var.f32967m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f34111w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        v30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !d60Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d60.F3 != z10) {
            d60.F3 = z10;
            if (w2Var.getMeasuredWidth() == 0) {
                int i23 = w2Var.getLayoutParams().width;
            }
            d60.H0(d60Var);
            if (d60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            pzVar.y1(i21);
            j50Var.a0();
            r30Var.a0();
            this.f34114z0 = true;
            TextView textView = d60Var.S;
            if (textView != null) {
                if (!d60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (d60Var.q1() == z10 && d60Var.r1() && !v30Var.f29452b && !d60Var.f32919a1.visibleVideoParticipants.isEmpty()) {
                d60Var.e1(d60Var.f32919a1.visibleVideoParticipants.get(0));
                v30Var.e();
            }
        }
        if (d60.G3 != z11) {
            d60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            wl0Var.setVisibility(i20);
            j50Var.a0();
            r30Var.a0();
            z12 = true;
            this.f34114z0 = true;
        } else {
            z12 = true;
        }
        if (this.f34114z0) {
            d60Var.O0(z12);
            d60Var.P.l();
            t20Var.G(wl0Var, false);
            if (d60.G3) {
                j60Var.I(wl0Var, false);
            }
            if (d60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            wl0Var.setVisibility(i16);
            if (d60.G3 && !v30Var.f29452b) {
                z13 = true;
            } else {
                z13 = false;
            }
            j60Var.H(wl0Var, z13, true);
            boolean z16 = d60.G3;
            if (z16 && !v30Var.f29452b) {
                z14 = false;
            } else {
                z14 = true;
            }
            d60Var.P2 = z14;
            if (!z16 && v30Var.f29452b) {
                z15 = true;
            } else {
                z15 = false;
            }
            t20Var.F(r30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            r30Var.setVisibility(i17);
            if (!d60.G3 && v30Var.f29452b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            j50Var.setVisibility(i18);
            if (d60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            pzVar.y1(i19);
            d60Var.N1(false, false);
            j50Var.a0();
            r30Var.a0();
            AndroidUtilities.updateVisibleRows(j50Var);
            this.f34114z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            v30Var.setIsTablet(d60.G3);
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v30Var.getLayoutParams();
        if (d60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d60Var.f32956j0[i26].getLayoutParams();
            if (d60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (wl0Var != null) {
            ((FrameLayout.LayoutParams) wl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (d40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) d40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (d60Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j50Var.getLayoutParams();
        if (d60.G3) {
            if (d60Var.I2) {
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
            if (d60.F3) {
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
        if (d60.F3 && !d60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (d60.G3) {
                if (d60Var.I2) {
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
            if (d60.G3) {
                if (d60Var.I2) {
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
        if (d60.F3) {
            r30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            r30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        if (d60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (d60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (d60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (d60.F3 && !d60.G3) {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        if (d60.F3) {
            if (((s4.c0) r30Var.getLayoutManager()).f42934o != 1) {
                ((s4.c0) r30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) r30Var.getLayoutManager()).f42934o != 0) {
                ((s4.c0) r30Var.getLayoutManager()).j1(0);
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
        if (d60.G3) {
            y3 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            y3 = org.telegram.messenger.f0.y(8.0f, i25 - max, 0);
        }
        if (j50Var.getPaddingTop() != y3 || j50Var.getPaddingBottom() != dp2) {
            j50Var.setPadding(i14, y3, i14, dp2);
        }
        b60 b60Var = d60Var.B1;
        if (b60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) b60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = d60.I0(d60Var);
            if (I0 != null) {
                int measuredHeight = ((i30Var.getMeasuredHeight() / 2) + i30Var.getTop()) - (d60Var.f32991s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = hg.c.z(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        s50 s50Var = d60Var.U0;
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
        if (h5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) d60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    h5Var.setVisibility(0);
                    h5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            h5Var.setVisibility(4);
            h5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(v30Var.f29452b, true);
        }
        this.f34111w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f34113y0) {
            this.f34113y0 = measuredHeight3;
            d60Var.d1(false);
        }
        d60Var.f32989r2.f29358f = getMeasuredWidth();
        d60Var.Y0();
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
        if (this.f34111w0) {
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
