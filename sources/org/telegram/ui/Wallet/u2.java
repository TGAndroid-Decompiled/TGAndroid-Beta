package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.yi;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35600a;
    public final Object f35601b;

    public u2(Object obj, int i10) {
        this.f35600a = i10;
        this.f35601b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f35600a) {
            case 0:
                z2.a((z2) this.f35601b, valueAnimator);
                return;
            case 1:
                c5 c5Var = (c5) this.f35601b;
                c5Var.getClass();
                c5Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                q4 q4Var = (q4) this.f35601b;
                q4Var.getClass();
                q4Var.f35471x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                return;
            case 3:
                a5 a5Var = (a5) this.f35601b;
                a5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.f34656b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = a5Var.f34657c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = a5Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 4:
                x5 x5Var = (x5) this.f35601b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5 v5Var = x5Var.f35712q;
                e6 e6Var = x5Var.f35704i;
                RectF rectF = x5Var.f35709n;
                RectF rectF2 = x5Var.f35710o;
                if (!x5Var.v) {
                    x5Var.e();
                    float interpolation = x5Var.f35706k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    yi yiVar = x5Var.f35700c;
                    if (yiVar != null) {
                        yiVar.M1(interpolation);
                    } else {
                        x5Var.f35699b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (x5Var.f35711p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = x5Var.f35701e.u8(x5Var.f35702f);
                        org.telegram.ui.Cells.w0 w0Var = x5Var.f35711p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            x5Var.f35711p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = x5Var.f35711p;
                        if (w0Var2 != null && !x5Var.f35714s) {
                            w0Var2.I0.i(true);
                            e3 e3Var = x5Var.f35711p.I0.f34918m;
                            if (e3Var != null && e3Var.isAttachedToWindow()) {
                                rectF2.set(x5Var.c(e3Var));
                                x5Var.f35713r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
                                e6Var.setAlpha((1.0f - B) * x5Var.f35707l);
                                v5Var.setAlpha(B);
                                x5Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                x5Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    x5Var.f35705j.g(centerX2, centerY);
                                }
                                x5Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            e6Var.setAlpha(0.0f);
                            v5Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        e6Var.setAlpha(0.0f);
                        v5Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                e6 e6Var2 = (e6) this.f35601b;
                e6Var2.getClass();
                e6Var2.f34861i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var2.e();
                return;
            case 6:
                o7 o7Var = (o7) this.f35601b;
                o7Var.getClass();
                o7Var.f35382w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 7:
                l8 l8Var = (l8) this.f35601b;
                l8Var.getClass();
                l8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                k8 k8Var = (k8) this.f35601b;
                k8Var.getClass();
                k8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.c();
                return;
            default:
                y8 y8Var = (y8) this.f35601b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = y8Var.f35751n;
                RectF rectF4 = y8Var.f35752o;
                if (!y8Var.f35756s) {
                    y8Var.e();
                    float interpolation2 = y8Var.f35748k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    yi yiVar2 = y8Var.f35740a;
                    if (yiVar2 != null) {
                        yiVar2.M1(interpolation2);
                    } else {
                        y8Var.f35742c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (y8Var.f35753p != null && !rectF4.isEmpty()) {
                        e6 pendingDiamond = y8Var.f35753p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            z2 z2Var = y8Var.f35753p;
                            TL_wallet.walletTransaction wallettransaction = y8Var.f35744f;
                            TL_wallet.walletTransaction wallettransaction2 = z2Var.R;
                            if (wallettransaction2 != null && x2.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(y8Var.d(pendingDiamond));
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
                        y8Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            y8Var.f35747j.g(centerX4, centerY2);
                        }
                        y8Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
