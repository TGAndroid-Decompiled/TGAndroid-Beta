package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.vi;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33678a;
    public final Object f33679b;

    public s2(Object obj, int i10) {
        this.f33678a = i10;
        this.f33679b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f33678a) {
            case 0:
                x2.a((x2) this.f33679b, valueAnimator);
                return;
            case 1:
                z4 z4Var = (z4) this.f33679b;
                z4Var.getClass();
                z4Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                o4 o4Var = (o4) this.f33679b;
                o4Var.getClass();
                o4Var.f33560x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                return;
            case 3:
                x4 x4Var = (x4) this.f33679b;
                x4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var.f33849b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = x4Var.f33850c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = x4Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 4:
                u5 u5Var = (u5) this.f33679b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5 s5Var = u5Var.f33747q;
                b6 b6Var = u5Var.f33739i;
                RectF rectF = u5Var.f33744n;
                RectF rectF2 = u5Var.f33745o;
                if (!u5Var.v) {
                    u5Var.e();
                    float interpolation = u5Var.f33741k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    vi viVar = u5Var.f33736c;
                    if (viVar != null) {
                        viVar.M1(interpolation);
                    } else {
                        u5Var.f33735b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (u5Var.f33746p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f33737f);
                        org.telegram.ui.Cells.x0 x0Var = u5Var.f33746p;
                        if (u82 != x0Var) {
                            x0Var.I0.i(false);
                            u5Var.f33746p = u82;
                        }
                        org.telegram.ui.Cells.x0 x0Var2 = u5Var.f33746p;
                        if (x0Var2 != null && !u5Var.f33749s) {
                            x0Var2.I0.i(true);
                            c3 c3Var = u5Var.f33746p.I0.f33066m;
                            if (c3Var != null && c3Var.isAttachedToWindow()) {
                                rectF2.set(u5Var.c(c3Var));
                                u5Var.f33748r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                b6Var.setAlpha((1.0f - B) * u5Var.f33742l);
                                s5Var.setAlpha(B);
                                u5Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                u5Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    u5Var.f33740j.g(centerX2, centerY);
                                }
                                u5Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            b6Var.setAlpha(0.0f);
                            s5Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        b6Var.setAlpha(0.0f);
                        s5Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                b6 b6Var2 = (b6) this.f33679b;
                b6Var2.getClass();
                b6Var2.f32977i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var2.e();
                return;
            case 6:
                l7 l7Var = (l7) this.f33679b;
                l7Var.getClass();
                l7Var.f33451w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l7Var.invalidate();
                return;
            case 7:
                i8 i8Var = (i8) this.f33679b;
                i8Var.getClass();
                i8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                h8 h8Var = (h8) this.f33679b;
                h8Var.getClass();
                h8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.c();
                return;
            default:
                w8 w8Var = (w8) this.f33679b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = w8Var.f33814n;
                RectF rectF4 = w8Var.f33815o;
                if (!w8Var.f33819s) {
                    w8Var.e();
                    float interpolation2 = w8Var.f33811k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    vi viVar2 = w8Var.f33804a;
                    if (viVar2 != null) {
                        viVar2.M1(interpolation2);
                    } else {
                        w8Var.f33806c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (w8Var.f33816p != null && !rectF4.isEmpty()) {
                        b6 pendingDiamond = w8Var.f33816p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            x2 x2Var = w8Var.f33816p;
                            TL_wallet.walletTransaction wallettransaction = w8Var.f33807f;
                            TL_wallet.walletTransaction wallettransaction2 = x2Var.R;
                            if (wallettransaction2 != null && v2.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(w8Var.d(pendingDiamond));
                            }
                        }
                        float f13 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - AndroidUtilities.dp(150.0f);
                        float f14 = f13 * f13;
                        float f15 = f13 * 2.0f * floatValue3;
                        float f16 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f16) + (centerX3 * f15) + (rectF3.centerX() * f14);
                        float centerY2 = (rectF4.centerY() * f16) + (f15 * min2) + (rectF3.centerY() * f14);
                        w8Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            w8Var.f33810j.g(centerX4, centerY2);
                        }
                        w8Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
