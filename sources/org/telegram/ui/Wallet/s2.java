package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.yi;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35477a;
    public final Object f35478b;

    public s2(Object obj, int i10) {
        this.f35477a = i10;
        this.f35478b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f35477a) {
            case 0:
                x2.a((x2) this.f35478b, valueAnimator);
                return;
            case 1:
                a5 a5Var = (a5) this.f35478b;
                a5Var.getClass();
                a5Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                o4 o4Var = (o4) this.f35478b;
                o4Var.getClass();
                o4Var.f35346x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                return;
            case 3:
                y4 y4Var = (y4) this.f35478b;
                y4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y4Var.f35691b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = y4Var.f35692c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = y4Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 4:
                v5 v5Var = (v5) this.f35478b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5 t5Var = v5Var.f35588q;
                c6 c6Var = v5Var.f35580i;
                RectF rectF = v5Var.f35585n;
                RectF rectF2 = v5Var.f35586o;
                if (!v5Var.v) {
                    v5Var.e();
                    float interpolation = v5Var.f35582k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    yi yiVar = v5Var.f35576c;
                    if (yiVar != null) {
                        yiVar.M1(interpolation);
                    } else {
                        v5Var.f35575b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (v5Var.f35587p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = v5Var.f35577e.u8(v5Var.f35578f);
                        org.telegram.ui.Cells.w0 w0Var = v5Var.f35587p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            v5Var.f35587p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = v5Var.f35587p;
                        if (w0Var2 != null && !v5Var.f35590s) {
                            w0Var2.I0.i(true);
                            c3 c3Var = v5Var.f35587p.I0.f34795m;
                            if (c3Var != null && c3Var.isAttachedToWindow()) {
                                rectF2.set(v5Var.c(c3Var));
                                v5Var.f35589r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
                                c6Var.setAlpha((1.0f - B) * v5Var.f35583l);
                                t5Var.setAlpha(B);
                                v5Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                v5Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    v5Var.f35581j.g(centerX2, centerY);
                                }
                                v5Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            c6Var.setAlpha(0.0f);
                            t5Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        c6Var.setAlpha(0.0f);
                        t5Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                c6 c6Var2 = (c6) this.f35478b;
                c6Var2.getClass();
                c6Var2.f34742i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var2.e();
                return;
            case 6:
                m7 m7Var = (m7) this.f35478b;
                m7Var.getClass();
                m7Var.f35259w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7Var.invalidate();
                return;
            case 7:
                j8 j8Var = (j8) this.f35478b;
                j8Var.getClass();
                j8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                i8 i8Var = (i8) this.f35478b;
                i8Var.getClass();
                i8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.c();
                return;
            default:
                w8 w8Var = (w8) this.f35478b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = w8Var.f35633n;
                RectF rectF4 = w8Var.f35634o;
                if (!w8Var.f35638s) {
                    w8Var.e();
                    float interpolation2 = w8Var.f35630k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    yi yiVar2 = w8Var.f35622a;
                    if (yiVar2 != null) {
                        yiVar2.M1(interpolation2);
                    } else {
                        w8Var.f35624c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (w8Var.f35635p != null && !rectF4.isEmpty()) {
                        c6 pendingDiamond = w8Var.f35635p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            x2 x2Var = w8Var.f35635p;
                            TL_wallet.walletTransaction wallettransaction = w8Var.f35626f;
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
                            w8Var.f35629j.g(centerX4, centerY2);
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
