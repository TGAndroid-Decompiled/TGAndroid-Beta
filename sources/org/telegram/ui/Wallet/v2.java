package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34989a;
    public final Object f34990b;

    public v2(Object obj, int i10) {
        this.f34989a = i10;
        this.f34990b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f34989a) {
            case 0:
                z2 z2Var = (z2) this.f34990b;
                z2Var.getClass();
                z2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.d();
                return;
            case 1:
                f3.a((f3) this.f34990b, valueAnimator);
                return;
            case 2:
                c5 c5Var = (c5) this.f34990b;
                c5Var.getClass();
                c5Var.f34055x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.invalidate();
                return;
            case 3:
                l5 l5Var = (l5) this.f34990b;
                l5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f34438b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = l5Var.f34439c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = l5Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 4:
                e6 e6Var = (e6) this.f34990b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6 c6Var = e6Var.f34139q;
                m6 m6Var = e6Var.f34131i;
                RectF rectF = e6Var.f34136n;
                RectF rectF2 = e6Var.f34137o;
                if (!e6Var.v) {
                    e6Var.e();
                    float interpolation = e6Var.f34133k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = e6Var.f34128c;
                    if (tiVar != null) {
                        tiVar.M1(interpolation);
                    } else {
                        e6Var.f34127b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (e6Var.f34138p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f34129f);
                        org.telegram.ui.Cells.w0 w0Var = e6Var.f34138p;
                        if (u82 != w0Var) {
                            w0Var.I0.k(false);
                            e6Var.f34138p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = e6Var.f34138p;
                        if (w0Var2 != null && !e6Var.f34141s) {
                            w0Var2.I0.k(true);
                            l3 l3Var = e6Var.f34138p.I0.f34503m;
                            if (l3Var != null && l3Var.isAttachedToWindow()) {
                                rectF2.set(e6Var.c(l3Var));
                                e6Var.f34140r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                m6Var.setAlpha((1.0f - B) * e6Var.f34134l);
                                c6Var.setAlpha(B);
                                e6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                e6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    e6Var.f34132j.g(centerX2, centerY);
                                }
                                e6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            m6Var.setAlpha(0.0f);
                            c6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        m6Var.setAlpha(0.0f);
                        c6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                m6 m6Var2 = (m6) this.f34990b;
                m6Var2.getClass();
                m6Var2.f34547i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var2.e();
                return;
            case 6:
                g7 g7Var = (g7) this.f34990b;
                g7Var.getClass();
                g7Var.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                j8 j8Var = (j8) this.f34990b;
                j8Var.getClass();
                j8Var.f34373w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.invalidate();
                return;
            case 8:
                n8 n8Var = (n8) this.f34990b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                n8Var.v = f13.floatValue();
                n8Var.f34618f.run(f13);
                View view3 = n8Var.f34615a;
                view3.setAlpha(1.0f - n8.c(0.05f, 0.45f, n8Var.v));
                view3.setScaleX(1.0f - (n8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = n8Var.f34616b;
                editTextBoldCursor.setAlpha(n8.c(0.3f, 0.9f, n8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - n8Var.v) * org.telegram.messenger.g0.b(80.0f, n8Var.getWidth(), 0));
                n8Var.invalidate();
                return;
            case 9:
                i9 i9Var = (i9) this.f34990b;
                i9Var.getClass();
                i9Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                h9 h9Var = (h9) this.f34990b;
                h9Var.getClass();
                h9Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.c();
                return;
            default:
                v9 v9Var = (v9) this.f34990b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = v9Var.f35014n;
                RectF rectF4 = v9Var.f35015o;
                if (!v9Var.f35019s) {
                    v9Var.e();
                    float interpolation2 = v9Var.f35011k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = v9Var.f35004a;
                    if (tiVar2 != null) {
                        tiVar2.M1(interpolation2);
                    } else {
                        v9Var.f35006c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (v9Var.f35016p != null && !rectF4.isEmpty()) {
                        m6 pendingDiamond = v9Var.f35016p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            f3 f3Var = v9Var.f35016p;
                            TL_wallet.walletTransaction wallettransaction = v9Var.f35007f;
                            TL_wallet.walletTransaction wallettransaction2 = f3Var.R;
                            if (wallettransaction2 != null && d3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(v9Var.d(pendingDiamond));
                            }
                        }
                        float f14 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - AndroidUtilities.dp(150.0f);
                        float f15 = f14 * f14;
                        float f16 = f14 * 2.0f * floatValue3;
                        float f17 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f17) + (centerX3 * f16) + (rectF3.centerX() * f15);
                        float centerY2 = (rectF4.centerY() * f17) + (f16 * min2) + (rectF3.centerY() * f15);
                        v9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            v9Var.f35010j.g(centerX4, centerY2);
                        }
                        v9Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
