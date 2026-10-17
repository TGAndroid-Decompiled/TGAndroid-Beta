package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ew0 extends FrameLayout {
    public boolean f36598a;
    public boolean f36599b;
    public final Paint f36600c;
    public final PremiumPreviewFragment d;

    public ew0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f36600c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        org.telegram.ui.ActionBar.k kVar4;
        float f10;
        sg.w1 w1Var;
        float f11;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f33496h0;
        sg.z0 z0Var = premiumPreviewFragment.m0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f33511u0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.Z) {
            if (premiumPreviewFragment.f33486a0) {
                float f12 = premiumPreviewFragment.f33488b0 + 0.016f;
                premiumPreviewFragment.f33488b0 = f12;
                if (f12 > 3.0f) {
                    premiumPreviewFragment.f33486a0 = false;
                }
            } else {
                float f13 = premiumPreviewFragment.f33488b0 - 0.016f;
                premiumPreviewFragment.f33488b0 = f13;
                if (f13 < 1.0f) {
                    premiumPreviewFragment.f33486a0 = true;
                }
            }
        }
        if (premiumPreviewFragment.f33485a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f33485a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.f33490c0 = bottom;
        kVar = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        float f14 = 16.0f;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f15 = 1.0f - ((premiumPreviewFragment.f33490c0 - dp) / (premiumPreviewFragment.Y - dp));
        premiumPreviewFragment.f33494f0 = f15;
        premiumPreviewFragment.f33494f0 = Utilities.clamp(f15, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.f33490c0 < dp2) {
            premiumPreviewFragment.f33490c0 = dp2;
        }
        float f16 = premiumPreviewFragment.f33505q0;
        premiumPreviewFragment.f33505q0 = 0.0f;
        if (premiumPreviewFragment.f33490c0 < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.f33505q0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.f33490c0) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.W) {
            premiumPreviewFragment.f33505q0 = 1.0f;
            premiumPreviewFragment.f33494f0 = 1.0f;
        }
        if (f16 != premiumPreviewFragment.f33505q0) {
            premiumPreviewFragment.f33485a.invalidate();
        }
        int i10 = premiumPreviewFragment.f33490c0;
        kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        int measuredHeight = i10 - ((premiumPreviewFragment.U.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.X);
        if (premiumPreviewFragment.U.e.getVisibility() == 0) {
            f7 = 24.0f;
        } else {
            f7 = 16.0f;
        }
        int dp3 = AndroidUtilities.dp(f7) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.X) - premiumPreviewFragment.U.f40248a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.X) - premiumPreviewFragment.U.getTop()) - premiumPreviewFragment.U.f40248a.getTop(), AndroidUtilities.dp(24.0f) + dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.U.setTranslationY(max);
        lw0 lw0Var = premiumPreviewFragment.U.d;
        if (premiumPreviewFragment.f33495g0 == 1) {
            f14 = 9.0f;
        }
        lw0Var.setTranslationY(dp4 + AndroidUtilities.dp(f14));
        float f17 = premiumPreviewFragment.f33494f0;
        float x10 = com.google.android.gms.internal.cast.a6.x(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        premiumPreviewFragment.U.d.setScaleX(x10);
        premiumPreviewFragment.U.d.setScaleY(x10);
        premiumPreviewFragment.U.d.setAlpha(f18);
        premiumPreviewFragment.U.f40249b.setAlpha(f18);
        premiumPreviewFragment.U.e.setAlpha(f18);
        premiumPreviewFragment.V.setAlpha(1.0f - premiumPreviewFragment.f33494f0);
        premiumPreviewFragment.V.setTranslationY(premiumPreviewFragment.U.f40250c.getY() + premiumPreviewFragment.U.getY() + ((-(w1Var.getMeasuredHeight() - premiumPreviewFragment.U.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.U.f40248a.getLeft();
        float f19 = premiumPreviewFragment.f33494f0;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        premiumPreviewFragment.U.f40248a.setTranslationX((1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - f11)) * dp5);
        pw0 pw0Var = premiumPreviewFragment.U;
        pw0Var.d.f47127b.f47105s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.f33488b0) + (premiumPreviewFragment.U.f40250c.getX() + pw0Var.getX())) / getMeasuredWidth();
        pw0 pw0Var2 = premiumPreviewFragment.U;
        pw0Var2.d.f47127b.f47106t = (premiumPreviewFragment.U.f40250c.getY() + pw0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.Z) {
            invalidate();
            premiumPreviewFragment.K.invalidate();
            premiumPreviewFragment.J.invalidate();
        }
        z0Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33488b0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i11 = org.telegram.ui.ActionBar.h6.f20928a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.f36600c;
            paint.setColor(themedColor);
            boolean z11 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f33505q0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.b.f(premiumPreviewFragment.f33505q0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z11;
                }
            }
            canvas2 = canvas;
            r11 = z11;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), z0Var.f46524f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.J.getVisibility() != 0) {
            premiumPreviewFragment.f33510t0.b(premiumPreviewFragment.f33503o0.d, r11);
            premiumPreviewFragment.f33510t0.setBounds(r11, getHeight() - premiumPreviewFragment.f33503o0.d, getWidth(), getHeight());
            premiumPreviewFragment.f33510t0.draw(canvas2);
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).parentLayout;
        if (d5Var != null && z10) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).parentLayout;
            int i12 = (int) (premiumPreviewFragment.f33505q0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) d5Var2).p(canvas2, i12, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.U.f40250c.getX() + premiumPreviewFragment.U.getX();
        float y3 = premiumPreviewFragment.U.f40250c.getY() + premiumPreviewFragment.U.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        lw0 lw0Var = premiumPreviewFragment.U.d;
        if (lw0Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = lw0Var.getMeasuredWidth();
        }
        float f7 = measuredWidth + x10;
        lw0 lw0Var2 = premiumPreviewFragment.U.d;
        if (lw0Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = lw0Var2.getMeasuredHeight();
        }
        rectF.set(x10, y3, f7, measuredHeight + y3);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f36598a) && !premiumPreviewFragment.f33485a.I1) {
            motionEvent.offsetLocation(-x10, -y3);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f36598a = false;
                }
            } else {
                this.f36598a = true;
            }
            premiumPreviewFragment.U.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.U.e.getX() + premiumPreviewFragment.U.getX();
        float y10 = premiumPreviewFragment.U.e.getY() + premiumPreviewFragment.U.getY();
        rectF.set(x11, y10, premiumPreviewFragment.U.e.getWidth() + x11, premiumPreviewFragment.U.e.getHeight() + y10);
        if (premiumPreviewFragment.f33505q0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f36599b) && !premiumPreviewFragment.f33485a.I1)) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0) {
                this.f36599b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f36599b = false;
            }
            premiumPreviewFragment.U.e.dispatchTouchEvent(motionEvent);
            if (this.f36599b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        lw0 lw0Var = premiumPreviewFragment.U.d;
        lw0Var.f47127b.f47107u = lw0Var.getMeasuredWidth() / getMeasuredWidth();
        lw0 lw0Var2 = premiumPreviewFragment.U.d;
        lw0Var2.f47127b.v = lw0Var2.getMeasuredHeight() / getMeasuredHeight();
        pw0 pw0Var = premiumPreviewFragment.U;
        pw0Var.d.f47127b.f47105s = (premiumPreviewFragment.U.d.getX() + pw0Var.getX()) / getMeasuredWidth();
        pw0 pw0Var2 = premiumPreviewFragment.U;
        pw0Var2.d.f47127b.f47106t = (premiumPreviewFragment.U.d.getY() + pw0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12 = 0;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.W = z10;
        premiumPreviewFragment.X = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.U.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.V.getLayoutParams().height = premiumPreviewFragment.U.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.J;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.yz yzVar = premiumPreviewFragment.P;
        yzVar.M = (premiumPreviewFragment.X + i12) - AndroidUtilities.dp(16.0f);
        yzVar.p1();
        premiumPreviewFragment.P.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f33489c;
        ArrayList arrayList2 = premiumPreviewFragment.f33487b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.L.a((qw0) arrayList2.get(i15), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((qw0) arrayList2.get(i15)).e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.L.a((qw0) arrayList.get(i16), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((qw0) arrayList.get(i16)).e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        premiumPreviewFragment.N = i14;
    }
}
