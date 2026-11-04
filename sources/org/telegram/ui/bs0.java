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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bs0 extends FrameLayout {
    public boolean f44135a;
    public boolean f44136b;
    public final Paint f44137c;
    public final PremiumPreviewFragment d;

    public bs0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f44137c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        vg.t1 t1Var;
        float f12;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f41645i0;
        vg.x0 x0Var = premiumPreviewFragment.f41650n0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f41664x0 != null) {
            premiumPreviewFragment.o0();
        }
        if (!premiumPreviewFragment.f41633a0) {
            if (premiumPreviewFragment.f41635b0) {
                float f13 = premiumPreviewFragment.f41637c0 + 0.016f;
                premiumPreviewFragment.f41637c0 = f13;
                if (f13 > 3.0f) {
                    premiumPreviewFragment.f41635b0 = false;
                }
            } else {
                float f14 = premiumPreviewFragment.f41637c0 - 0.016f;
                premiumPreviewFragment.f41637c0 = f14;
                if (f14 < 1.0f) {
                    premiumPreviewFragment.f41635b0 = true;
                }
            }
        }
        if (premiumPreviewFragment.f41632a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f41632a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.f41638d0 = bottom;
        kVar = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        float f15 = 16.0f;
        int L = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
        float f16 = 1.0f - ((premiumPreviewFragment.f41638d0 - L) / (premiumPreviewFragment.Z - L));
        premiumPreviewFragment.f41643g0 = f16;
        premiumPreviewFragment.f41643g0 = Utilities.i(f16, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.f41638d0 < L2) {
            premiumPreviewFragment.f41638d0 = L2;
        }
        float f17 = premiumPreviewFragment.f41655r0;
        premiumPreviewFragment.f41655r0 = 0.0f;
        if (premiumPreviewFragment.f41638d0 < org.telegram.messenger.g0.L(30.0f) + L2) {
            premiumPreviewFragment.f41655r0 = ((org.telegram.messenger.g0.L(30.0f) + L2) - premiumPreviewFragment.f41638d0) / org.telegram.messenger.g0.L(30.0f);
        }
        if (premiumPreviewFragment.X) {
            premiumPreviewFragment.f41655r0 = 1.0f;
            premiumPreviewFragment.f41643g0 = 1.0f;
        }
        if (f17 != premiumPreviewFragment.f41655r0) {
            premiumPreviewFragment.f41632a.invalidate();
        }
        int i3 = premiumPreviewFragment.f41638d0;
        kVar3 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        int measuredHeight = i3 - ((premiumPreviewFragment.V.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.Y);
        if (premiumPreviewFragment.V.f47010e.getVisibility() == 0) {
            f10 = 24.0f;
        } else {
            f10 = 16.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f10) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.Y) - premiumPreviewFragment.V.f47007a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.Y) - premiumPreviewFragment.V.getTop()) - premiumPreviewFragment.V.f47007a.getTop(), org.telegram.messenger.g0.L(24.0f) + L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f);
        premiumPreviewFragment.V.setTranslationY(max);
        ci.ic icVar = premiumPreviewFragment.V.d;
        if (premiumPreviewFragment.f41644h0 == 1) {
            f15 = 9.0f;
        }
        icVar.setTranslationY(L4 + org.telegram.messenger.g0.L(f15));
        float f18 = premiumPreviewFragment.f41643g0;
        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f18, 0.4f, 0.6f);
        if (f18 > 0.5f) {
            f11 = (f18 - 0.5f) / 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f19 = 1.0f - f11;
        premiumPreviewFragment.V.d.setScaleX(y9);
        premiumPreviewFragment.V.d.setScaleY(y9);
        premiumPreviewFragment.V.d.setAlpha(f19);
        premiumPreviewFragment.V.f47008b.setAlpha(f19);
        premiumPreviewFragment.V.f47010e.setAlpha(f19);
        premiumPreviewFragment.W.setAlpha(1.0f - premiumPreviewFragment.f41643g0);
        premiumPreviewFragment.W.setTranslationY(premiumPreviewFragment.V.f47009c.getY() + premiumPreviewFragment.V.getY() + ((-(t1Var.getMeasuredHeight() - premiumPreviewFragment.V.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.g0.L(72.0f) - premiumPreviewFragment.V.f47007a.getLeft();
        float f20 = premiumPreviewFragment.f41643g0;
        if (f20 > 0.3f) {
            f12 = (f20 - 0.3f) / 0.7f;
        } else {
            f12 = 0.0f;
        }
        premiumPreviewFragment.V.f47007a.setTranslationX((1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - f12)) * L5);
        ks0 ks0Var = premiumPreviewFragment.V;
        ks0Var.d.f57666b.f57644s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.f41637c0) + (premiumPreviewFragment.V.f47009c.getX() + ks0Var.getX())) / getMeasuredWidth();
        ks0 ks0Var2 = premiumPreviewFragment.V;
        ks0Var2.d.f57666b.f57645t = (premiumPreviewFragment.V.f47009c.getY() + ks0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.f41633a0) {
            invalidate();
            premiumPreviewFragment.L.invalidate();
            premiumPreviewFragment.K.invalidate();
        }
        x0Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f41637c0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.k6.f27824a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.f44137c;
            paint.setColor(themedColor);
            boolean z11 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f41655r0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.f(premiumPreviewFragment.f41655r0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x0Var.f56911f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.K.getVisibility() != 0) {
            premiumPreviewFragment.f41662w0.b(premiumPreviewFragment.f41652p0.d, r11);
            premiumPreviewFragment.f41662w0.setBounds(r11, getHeight() - premiumPreviewFragment.f41652p0.d, getWidth(), getHeight());
            premiumPreviewFragment.f41662w0.draw(canvas2);
        }
        q4Var = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).parentLayout;
        if (q4Var != null && z10) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).parentLayout;
            int i11 = (int) (premiumPreviewFragment.f41655r0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) q4Var2).p(canvas2, i11, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.V.f47009c.getX() + premiumPreviewFragment.V.getX();
        float y9 = premiumPreviewFragment.V.f47009c.getY() + premiumPreviewFragment.V.getY();
        RectF rectF = org.telegram.messenger.g0.P;
        ci.ic icVar = premiumPreviewFragment.V.d;
        if (icVar == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = icVar.getMeasuredWidth();
        }
        float f10 = measuredWidth + x10;
        ci.ic icVar2 = premiumPreviewFragment.V.d;
        if (icVar2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = icVar2.getMeasuredHeight();
        }
        rectF.set(x10, y9, f10, measuredHeight + y9);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f44135a) && !premiumPreviewFragment.f41632a.J1) {
            motionEvent.offsetLocation(-x10, -y9);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f44135a = false;
                }
            } else {
                this.f44135a = true;
            }
            premiumPreviewFragment.V.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.V.f47010e.getX() + premiumPreviewFragment.V.getX();
        float y10 = premiumPreviewFragment.V.f47010e.getY() + premiumPreviewFragment.V.getY();
        rectF.set(x11, y10, premiumPreviewFragment.V.f47010e.getWidth() + x11, premiumPreviewFragment.V.f47010e.getHeight() + y10);
        if (premiumPreviewFragment.f41655r0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f44136b) && !premiumPreviewFragment.f41632a.J1)) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0) {
                this.f44136b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f44136b = false;
            }
            premiumPreviewFragment.V.f47010e.dispatchTouchEvent(motionEvent);
            if (this.f44136b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ci.ic icVar = premiumPreviewFragment.V.d;
        icVar.f57666b.f57646u = icVar.getMeasuredWidth() / getMeasuredWidth();
        ci.ic icVar2 = premiumPreviewFragment.V.d;
        icVar2.f57666b.v = icVar2.getMeasuredHeight() / getMeasuredHeight();
        ks0 ks0Var = premiumPreviewFragment.V;
        ks0Var.d.f57666b.f57644s = (premiumPreviewFragment.V.d.getX() + ks0Var.getX()) / getMeasuredWidth();
        ks0 ks0Var2 = premiumPreviewFragment.V;
        ks0Var2.d.f57666b.f57645t = (premiumPreviewFragment.V.d.getY() + ks0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        int i11 = 0;
        if (View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.X = z10;
        premiumPreviewFragment.Y = org.telegram.messenger.g0.f22602m;
        premiumPreviewFragment.V.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.W.getLayoutParams().height = premiumPreviewFragment.V.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.K;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(68.0f);
        }
        org.telegram.ui.Components.jy jyVar = premiumPreviewFragment.Q;
        jyVar.M = (premiumPreviewFragment.Y + i11) - org.telegram.messenger.g0.L(16.0f);
        jyVar.p1();
        premiumPreviewFragment.Q.S = i11;
        super.onMeasure(i3, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f41636c;
        ArrayList arrayList2 = premiumPreviewFragment.f41634b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.M.a((ls0) arrayList2.get(i14), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((ls0) arrayList2.get(i14)).f47433e = i13;
            i13 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.M.a((ls0) arrayList.get(i15), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((ls0) arrayList.get(i15)).f47433e = i13;
            i13 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        premiumPreviewFragment.O = i13;
    }
}
