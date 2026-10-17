package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34924a;
    public final Object f34925b;

    public u2(Object obj, int i10) {
        this.f34924a = i10;
        this.f34925b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f34924a) {
            case 0:
                x2 x2Var = (x2) this.f34925b;
                x2Var.getClass();
                x2Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.d();
                return;
            case 1:
                d3.a((d3) this.f34925b, valueAnimator);
                return;
            case 2:
                a5 a5Var = (a5) this.f34925b;
                a5Var.getClass();
                a5Var.f33985x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.invalidate();
                return;
            case 3:
                j5 j5Var = (j5) this.f34925b;
                j5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5Var.f34354b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = j5Var.f34355c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = j5Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 4:
                h6 h6Var = (h6) this.f34925b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6 f6Var = h6Var.f34280q;
                p6 p6Var = h6Var.f34272i;
                RectF rectF = h6Var.f34277n;
                RectF rectF2 = h6Var.f34278o;
                if (!h6Var.v) {
                    h6Var.e();
                    float interpolation = h6Var.f34274k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = h6Var.f34269c;
                    if (tiVar != null) {
                        tiVar.M1(interpolation);
                    } else {
                        h6Var.f34268b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (h6Var.f34279p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f34270f);
                        org.telegram.ui.Cells.x0 x0Var = h6Var.f34279p;
                        if (u82 != x0Var) {
                            x0Var.I0.k(false);
                            h6Var.f34279p = u82;
                        }
                        org.telegram.ui.Cells.x0 x0Var2 = h6Var.f34279p;
                        if (x0Var2 != null && !h6Var.f34282s) {
                            x0Var2.I0.k(true);
                            j3 j3Var = h6Var.f34279p.I0.f34406m;
                            if (j3Var != null && j3Var.isAttachedToWindow()) {
                                rectF2.set(h6Var.c(j3Var));
                                h6Var.f34281r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.cast.a6.B(max, 2.0f, 3.0f, max * max);
                                p6Var.setAlpha((1.0f - B) * h6Var.f34275l);
                                f6Var.setAlpha(B);
                                h6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                h6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    h6Var.f34273j.g(centerX2, centerY);
                                }
                                h6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            p6Var.setAlpha(0.0f);
                            f6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        p6Var.setAlpha(0.0f);
                        f6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                p6 p6Var2 = (p6) this.f34925b;
                p6Var2.getClass();
                p6Var2.f34739i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var2.e();
                return;
            case 6:
                j7 j7Var = (j7) this.f34925b;
                j7Var.getClass();
                j7Var.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                m8 m8Var = (m8) this.f34925b;
                m8Var.getClass();
                m8Var.f34608w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.invalidate();
                return;
            case 8:
                q8 q8Var = (q8) this.f34925b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                q8Var.v = f13.floatValue();
                q8Var.f34810f.run(f13);
                View view3 = q8Var.f34807a;
                view3.setAlpha(1.0f - q8.c(0.05f, 0.45f, q8Var.v));
                view3.setScaleX(1.0f - (q8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = q8Var.f34808b;
                editTextBoldCursor.setAlpha(q8.c(0.3f, 0.9f, q8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - q8Var.v) * org.telegram.messenger.q.b(80.0f, q8Var.getWidth(), 0));
                q8Var.invalidate();
                return;
            case 9:
                l9 l9Var = (l9) this.f34925b;
                l9Var.getClass();
                l9Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                k9 k9Var = (k9) this.f34925b;
                k9Var.getClass();
                k9Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.c();
                return;
            default:
                x9 x9Var = (x9) this.f34925b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = x9Var.f35149n;
                RectF rectF4 = x9Var.f35150o;
                if (!x9Var.f35154s) {
                    x9Var.e();
                    float interpolation2 = x9Var.f35146k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = x9Var.f35139a;
                    if (tiVar2 != null) {
                        tiVar2.M1(interpolation2);
                    } else {
                        x9Var.f35141c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (x9Var.f35151p != null && !rectF4.isEmpty()) {
                        p6 pendingDiamond = x9Var.f35151p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            d3 d3Var = x9Var.f35151p;
                            TL_wallet.walletTransaction wallettransaction = x9Var.f35142f;
                            TL_wallet.walletTransaction wallettransaction2 = d3Var.R;
                            if (wallettransaction2 != null && b3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(x9Var.d(pendingDiamond));
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
                        x9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            x9Var.f35145j.g(centerX4, centerY2);
                        }
                        x9Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
