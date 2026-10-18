package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.u61;
public final class y4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35125a;
    public final View f35126b;

    public y4(int i10, View view) {
        this.f35125a = i10;
        this.f35126b = view;
    }

    @Override
    public final boolean onPreDraw() {
        u61 u61Var;
        boolean z10;
        ei.m5 m5Var;
        ei.m5 m5Var2;
        ei.m5 m5Var3;
        switch (this.f35125a) {
            case 0:
                ah.v vVar = (ah.v) this.f35126b;
                m5 m5Var4 = (m5) vVar.f897c;
                if (m5Var4.F || m5Var4.G) {
                    m5Var4.L0();
                }
                if (m5Var4.G) {
                    vVar.invalidate();
                    return true;
                }
                return true;
            case 1:
                a5 a5Var = (a5) this.f35126b;
                m5 m5Var5 = a5Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (m5Var5.f34567a0 != null && (u61Var = m5Var5.f31197a) != null) {
                    if (m5Var5.f34583p0 && !u61Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m5Var5.f34569c0 != z10) {
                        m5Var5.f34569c0 = z10;
                        m5Var5.f34567a0.animate().cancel();
                        if (z10) {
                            m5Var5.f34567a0.setVisibility(0);
                            m5Var5.f34567a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.f25038g).start();
                        } else {
                            m5Var5.f34567a0.setAlpha(0.0f);
                            m5Var5.f34567a0.setVisibility(4);
                        }
                    }
                }
                View m10 = m5Var5.f31197a.V2.m(m5Var5.f34572f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != a5Var.f33983a || f7 != a5Var.f33984b || i10 != a5Var.f33985c) {
                    a5Var.f33983a = m10;
                    a5Var.f33984b = f7;
                    a5Var.f33985c = i10;
                    m5Var5.M0();
                }
                return true;
            case 2:
                z7 z7Var = (z7) this.f35126b;
                x5 x5Var = z7Var.f35184c;
                float cardRotationX = x5Var.getCardRotationX();
                float cardRotationY = x5Var.getCardRotationY();
                if (cardRotationX != z7Var.f35179a0 || cardRotationY != z7Var.f35182b0) {
                    z7Var.f35179a0 = cardRotationX;
                    z7Var.f35182b0 = cardRotationY;
                    z7Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                o9 o9Var = (o9) ((ei.m5) this.f35126b).f9470c;
                ei.m5 m5Var6 = o9Var.v;
                if (m5Var6 != null && o9Var.W != null && m5Var6.getHeight() > 0 && o9Var.W.getHeight() > 0) {
                    float paddingTop = o9Var.fragmentView.getPaddingTop();
                    if (o9Var.f34709s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (o9Var.f34709s.getScaleY() * (o9Var.f34709s.getContentBottom() - o9Var.f34709s.getPivotY())) + o9Var.f34709s.getPivotY() + o9Var.f34709s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(o9Var.fragmentView.getHeight() - o9Var.fragmentView.getPaddingBottom(), o9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / o9Var.v.getHeight());
                    o9Var.v.setPivotX(m5Var.getWidth() / 2.0f);
                    o9Var.v.setPivotY(m5Var2.getHeight() / 2.0f);
                    o9Var.v.setScaleX(min);
                    o9Var.v.setScaleY(min);
                    o9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - m5Var3.getTop()) - (o9Var.v.getHeight() / 2.0f));
                }
                if (o9Var.X != null || o9Var.Y < 1.0f) {
                    o9Var.A0();
                    return true;
                }
                return true;
        }
    }
}
