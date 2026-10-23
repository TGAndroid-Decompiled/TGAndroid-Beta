package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.w61;
public final class a5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34001a;
    public final View f34002b;

    public a5(int i10, View view) {
        this.f34001a = i10;
        this.f34002b = view;
    }

    @Override
    public final boolean onPreDraw() {
        w61 w61Var;
        boolean z10;
        ei.m5 m5Var;
        ei.m5 m5Var2;
        ei.m5 m5Var3;
        switch (this.f34001a) {
            case 0:
                o5 o5Var = (o5) ((ah.v) this.f34002b).f895c;
                if (o5Var.E) {
                    o5Var.M0();
                    return true;
                }
                return true;
            case 1:
                c5 c5Var = (c5) this.f34002b;
                o5 o5Var2 = c5Var.e;
                float f7 = 0.0f;
                int i10 = 0;
                if (o5Var2.Y != null && (w61Var = o5Var2.f32360a) != null) {
                    if (o5Var2.f34660n0 && !w61Var.canScrollVertically(1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (o5Var2.f34646a0 != z10) {
                        o5Var2.f34646a0 = z10;
                        o5Var2.Y.animate().cancel();
                        if (z10) {
                            o5Var2.Y.setVisibility(0);
                            o5Var2.Y.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.f25026g).start();
                        } else {
                            o5Var2.Y.setAlpha(0.0f);
                            o5Var2.Y.setVisibility(4);
                        }
                    }
                }
                View m10 = o5Var2.f32360a.V2.m(o5Var2.f34651f);
                if (m10 != null) {
                    f7 = m10.getY();
                }
                if (m10 != null) {
                    i10 = m10.getHeight();
                }
                if (m10 != c5Var.f34079a || f7 != c5Var.f34080b || i10 != c5Var.f34081c) {
                    c5Var.f34079a = m10;
                    c5Var.f34080b = f7;
                    c5Var.f34081c = i10;
                    o5Var2.N0();
                }
                return true;
            case 2:
                t7 t7Var = (t7) this.f34002b;
                x5 x5Var = t7Var.f34922c;
                float cardRotationX = x5Var.getCardRotationX();
                float cardRotationY = x5Var.getCardRotationY();
                if (cardRotationX != t7Var.f34917a0 || cardRotationY != t7Var.f34920b0) {
                    t7Var.f34917a0 = cardRotationX;
                    t7Var.f34920b0 = cardRotationY;
                    t7Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                i9 i9Var = (i9) ((ei.m5) this.f34002b).f9467c;
                ei.m5 m5Var4 = i9Var.v;
                if (m5Var4 != null && i9Var.W != null && m5Var4.getHeight() > 0 && i9Var.W.getHeight() > 0) {
                    float paddingTop = i9Var.fragmentView.getPaddingTop();
                    if (i9Var.f34369s.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (i9Var.f34369s.getScaleY() * (i9Var.f34369s.getContentBottom() - i9Var.f34369s.getPivotY())) + i9Var.f34369s.getPivotY() + i9Var.f34369s.getY());
                    }
                    float max = Math.max(0.0f, Math.min(i9Var.fragmentView.getHeight() - i9Var.fragmentView.getPaddingBottom(), i9Var.W.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / i9Var.v.getHeight());
                    i9Var.v.setPivotX(m5Var.getWidth() / 2.0f);
                    i9Var.v.setPivotY(m5Var2.getHeight() / 2.0f);
                    i9Var.v.setScaleX(min);
                    i9Var.v.setScaleY(min);
                    i9Var.v.setTranslationY((((max / 2.0f) + paddingTop) - m5Var3.getTop()) - (i9Var.v.getHeight() / 2.0f));
                }
                if (i9Var.X != null || i9Var.Y < 1.0f) {
                    i9Var.A0();
                    return true;
                }
                return true;
        }
    }
}
