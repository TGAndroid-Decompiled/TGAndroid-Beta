package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.yi;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35570a;
    public final Object f35571b;

    public t2(Object obj, int i10) {
        this.f35570a = i10;
        this.f35571b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f35570a) {
            case 0:
                y2.a((y2) this.f35571b, valueAnimator);
                return;
            case 1:
                b5 b5Var = (b5) this.f35571b;
                b5Var.getClass();
                b5Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                p4 p4Var = (p4) this.f35571b;
                p4Var.getClass();
                p4Var.f35441x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                return;
            case 3:
                z4 z4Var = (z4) this.f35571b;
                z4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z4Var.f35793b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = z4Var.f35794c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = z4Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 4:
                w5 w5Var = (w5) this.f35571b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5 u5Var = w5Var.f35682q;
                d6 d6Var = w5Var.f35674i;
                RectF rectF = w5Var.f35679n;
                RectF rectF2 = w5Var.f35680o;
                if (!w5Var.v) {
                    w5Var.e();
                    float interpolation = w5Var.f35676k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    yi yiVar = w5Var.f35670c;
                    if (yiVar != null) {
                        yiVar.M1(interpolation);
                    } else {
                        w5Var.f35669b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (w5Var.f35681p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = w5Var.f35671e.u8(w5Var.f35672f);
                        org.telegram.ui.Cells.w0 w0Var = w5Var.f35681p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            w5Var.f35681p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = w5Var.f35681p;
                        if (w0Var2 != null && !w5Var.f35684s) {
                            w0Var2.I0.i(true);
                            d3 d3Var = w5Var.f35681p.I0.f34886m;
                            if (d3Var != null && d3Var.isAttachedToWindow()) {
                                rectF2.set(w5Var.c(d3Var));
                                w5Var.f35683r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
                                d6Var.setAlpha((1.0f - B) * w5Var.f35677l);
                                u5Var.setAlpha(B);
                                w5Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                w5Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    w5Var.f35675j.g(centerX2, centerY);
                                }
                                w5Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            d6Var.setAlpha(0.0f);
                            u5Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        d6Var.setAlpha(0.0f);
                        u5Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                d6 d6Var2 = (d6) this.f35571b;
                d6Var2.getClass();
                d6Var2.f34831i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var2.e();
                return;
            case 6:
                n7 n7Var = (n7) this.f35571b;
                n7Var.getClass();
                n7Var.f35352w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                return;
            case 7:
                k8 k8Var = (k8) this.f35571b;
                k8Var.getClass();
                k8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                j8 j8Var = (j8) this.f35571b;
                j8Var.getClass();
                j8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.c();
                return;
            default:
                x8 x8Var = (x8) this.f35571b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = x8Var.f35721n;
                RectF rectF4 = x8Var.f35722o;
                if (!x8Var.f35726s) {
                    x8Var.e();
                    float interpolation2 = x8Var.f35718k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    yi yiVar2 = x8Var.f35710a;
                    if (yiVar2 != null) {
                        yiVar2.M1(interpolation2);
                    } else {
                        x8Var.f35712c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (x8Var.f35723p != null && !rectF4.isEmpty()) {
                        d6 pendingDiamond = x8Var.f35723p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            y2 y2Var = x8Var.f35723p;
                            TL_wallet.walletTransaction wallettransaction = x8Var.f35714f;
                            TL_wallet.walletTransaction wallettransaction2 = y2Var.R;
                            if (wallettransaction2 != null && w2.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(x8Var.d(pendingDiamond));
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
                        x8Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            x8Var.f35717j.g(centerX4, centerY2);
                        }
                        x8Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
