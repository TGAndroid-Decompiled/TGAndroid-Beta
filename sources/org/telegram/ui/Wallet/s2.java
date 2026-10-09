package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.yi;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35446a;
    public final Object f35447b;

    public s2(Object obj, int i10) {
        this.f35446a = i10;
        this.f35447b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f35446a) {
            case 0:
                x2.a((x2) this.f35447b, valueAnimator);
                return;
            case 1:
                z4 z4Var = (z4) this.f35447b;
                z4Var.getClass();
                z4Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                n4 n4Var = (n4) this.f35447b;
                n4Var.getClass();
                n4Var.f35277x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                return;
            case 3:
                x4 x4Var = (x4) this.f35447b;
                x4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var.f35625b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = x4Var.f35626c;
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
                u5 u5Var = (u5) this.f35447b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5 s5Var = u5Var.f35520q;
                b6 b6Var = u5Var.f35512i;
                RectF rectF = u5Var.f35517n;
                RectF rectF2 = u5Var.f35518o;
                if (!u5Var.v) {
                    u5Var.e();
                    float interpolation = u5Var.f35514k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    yi yiVar = u5Var.f35508c;
                    if (yiVar != null) {
                        yiVar.M1(interpolation);
                    } else {
                        u5Var.f35507b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (u5Var.f35519p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = u5Var.f35509e.u8(u5Var.f35510f);
                        org.telegram.ui.Cells.w0 w0Var = u5Var.f35519p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            u5Var.f35519p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = u5Var.f35519p;
                        if (w0Var2 != null && !u5Var.f35522s) {
                            w0Var2.I0.i(true);
                            b3 b3Var = u5Var.f35519p.I0.f34730m;
                            if (b3Var != null && b3Var.isAttachedToWindow()) {
                                rectF2.set(u5Var.c(b3Var));
                                u5Var.f35521r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
                                b6Var.setAlpha((1.0f - B) * u5Var.f35515l);
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
                                    u5Var.f35513j.g(centerX2, centerY);
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
                b6 b6Var2 = (b6) this.f35447b;
                b6Var2.getClass();
                b6Var2.f34671i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var2.e();
                return;
            case 6:
                l7 l7Var = (l7) this.f35447b;
                l7Var.getClass();
                l7Var.f35195w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l7Var.invalidate();
                return;
            case 7:
                i8 i8Var = (i8) this.f35447b;
                i8Var.getClass();
                i8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                h8 h8Var = (h8) this.f35447b;
                h8Var.getClass();
                h8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.c();
                return;
            default:
                v8 v8Var = (v8) this.f35447b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = v8Var.f35571n;
                RectF rectF4 = v8Var.f35572o;
                if (!v8Var.f35576s) {
                    v8Var.e();
                    float interpolation2 = v8Var.f35568k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    yi yiVar2 = v8Var.f35560a;
                    if (yiVar2 != null) {
                        yiVar2.M1(interpolation2);
                    } else {
                        v8Var.f35562c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (v8Var.f35573p != null && !rectF4.isEmpty()) {
                        b6 pendingDiamond = v8Var.f35573p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            x2 x2Var = v8Var.f35573p;
                            TL_wallet.walletTransaction wallettransaction = v8Var.f35564f;
                            TL_wallet.walletTransaction wallettransaction2 = x2Var.R;
                            if (wallettransaction2 != null && v2.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(v8Var.d(pendingDiamond));
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
                        v8Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            v8Var.f35567j.g(centerX4, centerY2);
                        }
                        v8Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
