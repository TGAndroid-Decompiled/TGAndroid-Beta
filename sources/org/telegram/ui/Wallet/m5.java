package org.telegram.ui.Wallet;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wq;
public final class m5 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42825a;
    public final View f42826b;

    public m5(int i7, View view) {
        this.f42825a = i7;
        this.f42826b = view;
    }

    @Override
    public final boolean onPreDraw() {
        fi.w3 w3Var;
        boolean z9;
        fi.a5 a5Var;
        fi.a5 a5Var2;
        fi.a5 a5Var3;
        switch (this.f42825a) {
            case 0:
                z5 z5Var = (z5) ((bi.x5) this.f42826b).f5030c;
                if (z5Var.F) {
                    z5Var.T0();
                    return true;
                }
                return true;
            case 1:
                o5 o5Var = (o5) this.f42826b;
                z5 z5Var2 = o5Var.f42908e;
                float f10 = 0.0f;
                int i7 = 0;
                if (z5Var2.Z != null && (w3Var = z5Var2.f36518a) != null) {
                    if (z5Var2.f43460o0 && !w3Var.canScrollVertically(1)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z5Var2.f43445b0 != z9) {
                        z5Var2.f43445b0 = z9;
                        z5Var2.Z.animate().cancel();
                        if (z9) {
                            z5Var2.Z.setVisibility(0);
                            z5Var2.Z.animate().alpha(1.0f).setDuration(180L).setInterpolator(wq.f40047g).start();
                        } else {
                            z5Var2.Z.setAlpha(0.0f);
                            z5Var2.Z.setVisibility(4);
                        }
                    }
                }
                View m10 = z5Var2.f36518a.f37495e3.m(z5Var2.h);
                if (m10 != null) {
                    f10 = m10.getY();
                }
                if (m10 != null) {
                    i7 = m10.getHeight();
                }
                if (m10 != o5Var.f42905a || f10 != o5Var.f42906b || i7 != o5Var.f42907c) {
                    o5Var.f42905a = m10;
                    o5Var.f42906b = f10;
                    o5Var.f42907c = i7;
                    z5Var2.U0();
                }
                return true;
            case 2:
                d8 d8Var = (d8) this.f42826b;
                i6 i6Var = d8Var.f42381c;
                float cardRotationX = i6Var.getCardRotationX();
                float cardRotationY = i6Var.getCardRotationY();
                if (cardRotationX != d8Var.f42376a0 || cardRotationY != d8Var.f42379b0) {
                    d8Var.f42376a0 = cardRotationX;
                    d8Var.f42379b0 = cardRotationY;
                    d8Var.L.invalidate();
                    return true;
                }
                return true;
            default:
                o9 o9Var = (o9) ((fi.a5) this.f42826b).f11610c;
                fi.a5 a5Var4 = o9Var.f42944x;
                if (a5Var4 != null && o9Var.Z != null && a5Var4.getHeight() > 0 && o9Var.Z.getHeight() > 0) {
                    float paddingTop = o9Var.fragmentView.getPaddingTop();
                    if (o9Var.f42942w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (o9Var.f42942w.getScaleY() * (o9Var.f42942w.getContentBottom() - o9Var.f42942w.getPivotY())) + o9Var.f42942w.getPivotY() + o9Var.f42942w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(o9Var.fragmentView.getHeight() - o9Var.fragmentView.getPaddingBottom(), o9Var.Z.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / o9Var.f42944x.getHeight());
                    o9Var.f42944x.setPivotX(a5Var.getWidth() / 2.0f);
                    o9Var.f42944x.setPivotY(a5Var2.getHeight() / 2.0f);
                    o9Var.f42944x.setScaleX(min);
                    o9Var.f42944x.setScaleY(min);
                    o9Var.f42944x.setTranslationY((((max / 2.0f) + paddingTop) - a5Var3.getTop()) - (o9Var.f42944x.getHeight() / 2.0f));
                }
                if (o9Var.f42916a0 != null || o9Var.f42917b0 < 1.0f) {
                    o9Var.G0();
                    return true;
                }
                return true;
        }
    }
}
