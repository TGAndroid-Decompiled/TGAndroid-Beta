package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.m71;
public final class x4 implements ViewTreeObserver.OnPreDrawListener {
    public final int f37491a;
    public final View f37492b;

    public x4(int i10, View view) {
        this.f37491a = i10;
        this.f37492b = view;
    }

    @Override
    public final boolean onPreDraw() {
        m71 m71Var;
        boolean z10;
        fi.l5 l5Var;
        fi.l5 l5Var2;
        fi.l5 l5Var3;
        switch (this.f37491a) {
            case 0:
                m5 m5Var = (m5) ((bh.p) this.f37492b).f4102c;
                if (m5Var.F) {
                    m5Var.O0();
                    return true;
                }
                return true;
            case 1:
                z4 z4Var = (z4) this.f37492b;
                m5 m5Var2 = z4Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (m5Var2.Z != null && (m71Var = m5Var2.f30764a) != null) {
                    if (m5Var2.f36956o0 && !m71Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m5Var2.f36942b0 != z10) {
                        m5Var2.f36942b0 = z10;
                        m5Var2.Z.animate().cancel();
                        if (z10) {
                            m5Var2.Z.setVisibility(0);
                            m5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(ds.f27531g).start();
                        } else {
                            m5Var2.Z.setAlpha(0.0f);
                            m5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = m5Var2.f30764a.f32503f3.m(m5Var2.h);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != z4Var.f37583a || f7 != z4Var.f37584b || i10 != z4Var.f37585c) {
                    z4Var.f37583a = m10;
                    z4Var.f37584b = f7;
                    z4Var.f37585c = i10;
                    m5Var2.P0();
                }
                return true;
            case 2:
                t7 t7Var = (t7) this.f37492b;
                w5 w5Var = t7Var.f37305c;
                float cardRotationX = w5Var.getCardRotationX();
                float cardRotationY = w5Var.getCardRotationY();
                if (cardRotationX != t7Var.f37300a0 || cardRotationY != t7Var.f37303b0) {
                    t7Var.f37300a0 = cardRotationX;
                    t7Var.f37303b0 = cardRotationY;
                    t7Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                i9 i9Var = (i9) ((fi.l5) this.f37492b).f11171c;
                fi.l5 l5Var4 = i9Var.f36741w;
                if (l5Var4 != null && i9Var.Z != null && l5Var4.getHeight() > 0 && i9Var.Z.getHeight() > 0) {
                    float paddingTop = i9Var.fragmentView.getPaddingTop();
                    if (i9Var.v.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i9Var.v.getScaleY() * (i9Var.v.getContentBottom() - i9Var.v.getPivotY())) + i9Var.v.getPivotY() + i9Var.v.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i9Var.fragmentView.getHeight() - i9Var.fragmentView.getPaddingBottom(), i9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i9Var.f36741w.getHeight());
                    i9Var.f36741w.setPivotX(l5Var.getWidth() / 2.0f);
                    i9Var.f36741w.setPivotY(l5Var2.getHeight() / 2.0f);
                    i9Var.f36741w.setScaleX(min);
                    i9Var.f36741w.setScaleY(min);
                    i9Var.f36741w.setTranslationY((((max / 2.0f) + paddingTop) - l5Var3.getTop()) - (i9Var.f36741w.getHeight() / 2.0f));
                }
                if (i9Var.f36716a0 != null || i9Var.f36717b0 < 1.0f) {
                    i9Var.C0();
                    return true;
                }
                return true;
        }
    }
}
