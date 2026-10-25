package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36349a;
    public final Object f36350b;

    public a3(Object obj, int i10) {
        this.f36349a = i10;
        this.f36350b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f36349a) {
            case 0:
                f3.a((f3) this.f36350b, valueAnimator);
                return;
            case 1:
                a5 a5Var = (a5) this.f36350b;
                a5Var.getClass();
                a5Var.f36362x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.invalidate();
                return;
            case 2:
                k5 k5Var = (k5) this.f36350b;
                k5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.f36783b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = k5Var.f36784c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = k5Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 3:
                d6 d6Var = (d6) this.f36350b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6 b6Var = d6Var.f36474q;
                l6 l6Var = d6Var.f36466i;
                RectF rectF = d6Var.f36471n;
                RectF rectF2 = d6Var.f36472o;
                if (!d6Var.v) {
                    d6Var.e();
                    float interpolation = d6Var.f36468k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = d6Var.f36463c;
                    if (tiVar != null) {
                        tiVar.P1(interpolation);
                    } else {
                        d6Var.f36462b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (d6Var.f36473p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 y82 = d6Var.e.y8(d6Var.f36464f);
                        org.telegram.ui.Cells.v0 v0Var = d6Var.f36473p;
                        if (y82 != v0Var) {
                            v0Var.I0.i(false);
                            d6Var.f36473p = y82;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = d6Var.f36473p;
                        if (v0Var2 != null && !d6Var.f36476s) {
                            v0Var2.I0.i(true);
                            l3 l3Var = d6Var.f36473p.I0.f36905m;
                            if (l3Var != null && l3Var.isAttachedToWindow()) {
                                rectF2.set(d6Var.c(l3Var));
                                d6Var.f36475r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float D = c3.h0.D(max, 2.0f, 3.0f, max * max);
                                l6Var.setAlpha((1.0f - D) * d6Var.f36469l);
                                b6Var.setAlpha(D);
                                d6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                d6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    d6Var.f36467j.g(centerX2, centerY);
                                }
                                d6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            l6Var.setAlpha(0.0f);
                            b6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        l6Var.setAlpha(0.0f);
                        b6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                l6 l6Var2 = (l6) this.f36350b;
                l6Var2.getClass();
                l6Var2.f36855i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var2.e();
                return;
            case 5:
                g7 g7Var = (g7) this.f36350b;
                g7Var.getClass();
                g7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                j8 j8Var = (j8) this.f36350b;
                j8Var.getClass();
                j8Var.f36744w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.invalidate();
                return;
            case 7:
                n8 n8Var = (n8) this.f36350b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                n8Var.v = f13.floatValue();
                n8Var.f37031f.run(f13);
                View view3 = n8Var.f37028a;
                view3.setAlpha(1.0f - n8.c(0.05f, 0.45f, n8Var.v));
                view3.setScaleX(1.0f - (n8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = n8Var.f37029b;
                editTextBoldCursor.setAlpha(n8.c(0.3f, 0.9f, n8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - n8Var.v) * org.telegram.messenger.t.c(80.0f, n8Var.getWidth(), 0));
                n8Var.invalidate();
                return;
            case 8:
                i9 i9Var = (i9) this.f36350b;
                i9Var.getClass();
                i9Var.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                h9 h9Var = (h9) this.f36350b;
                h9Var.getClass();
                h9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.c();
                return;
            default:
                v9 v9Var = (v9) this.f36350b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = v9Var.f37394n;
                RectF rectF4 = v9Var.f37395o;
                if (!v9Var.f37399s) {
                    v9Var.e();
                    float interpolation2 = v9Var.f37391k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = v9Var.f37384a;
                    if (tiVar2 != null) {
                        tiVar2.P1(interpolation2);
                    } else {
                        v9Var.f37386c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (v9Var.f37396p != null && !rectF4.isEmpty()) {
                        l6 pendingDiamond = v9Var.f37396p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            f3 f3Var = v9Var.f37396p;
                            TL_wallet.walletTransaction wallettransaction = v9Var.f37387f;
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
                            v9Var.f37390j.g(centerX4, centerY2);
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
