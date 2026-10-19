package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34022a;
    public final Object f34023b;

    public b3(Object obj, int i10) {
        this.f34022a = i10;
        this.f34023b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f34022a) {
            case 0:
                g3.a((g3) this.f34023b, valueAnimator);
                return;
            case 1:
                d5 d5Var = (d5) this.f34023b;
                d5Var.getClass();
                d5Var.f34103x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.invalidate();
                return;
            case 2:
                m5 m5Var = (m5) this.f34023b;
                m5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.f34503b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = m5Var.f34504c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = m5Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 3:
                e6 e6Var = (e6) this.f34023b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6 c6Var = e6Var.f34158q;
                m6 m6Var = e6Var.f34150i;
                RectF rectF = e6Var.f34155n;
                RectF rectF2 = e6Var.f34156o;
                if (!e6Var.v) {
                    e6Var.e();
                    float interpolation = e6Var.f34152k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = e6Var.f34147c;
                    if (tiVar != null) {
                        tiVar.M1(interpolation);
                    } else {
                        e6Var.f34146b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (e6Var.f34157p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f34148f);
                        org.telegram.ui.Cells.w0 w0Var = e6Var.f34157p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            e6Var.f34157p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = e6Var.f34157p;
                        if (w0Var2 != null && !e6Var.f34160s) {
                            w0Var2.I0.i(true);
                            m3 m3Var = e6Var.f34157p.I0.f34567m;
                            if (m3Var != null && m3Var.isAttachedToWindow()) {
                                rectF2.set(e6Var.c(m3Var));
                                e6Var.f34159r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                m6Var.setAlpha((1.0f - B) * e6Var.f34153l);
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
                                    e6Var.f34151j.g(centerX2, centerY);
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
            case 4:
                m6 m6Var2 = (m6) this.f34023b;
                m6Var2.getClass();
                m6Var2.f34519i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var2.e();
                return;
            case 5:
                g7 g7Var = (g7) this.f34023b;
                g7Var.getClass();
                g7Var.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                j8 j8Var = (j8) this.f34023b;
                j8Var.getClass();
                j8Var.f34388w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.invalidate();
                return;
            case 7:
                n8 n8Var = (n8) this.f34023b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                n8Var.v = f13.floatValue();
                n8Var.f34604f.run(f13);
                View view3 = n8Var.f34601a;
                view3.setAlpha(1.0f - n8.c(0.05f, 0.45f, n8Var.v));
                view3.setScaleX(1.0f - (n8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = n8Var.f34602b;
                editTextBoldCursor.setAlpha(n8.c(0.3f, 0.9f, n8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - n8Var.v) * org.telegram.messenger.g0.b(80.0f, n8Var.getWidth(), 0));
                n8Var.invalidate();
                return;
            case 8:
                i9 i9Var = (i9) this.f34023b;
                i9Var.getClass();
                i9Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                h9 h9Var = (h9) this.f34023b;
                h9Var.getClass();
                h9Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.c();
                return;
            default:
                v9 v9Var = (v9) this.f34023b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = v9Var.f35031n;
                RectF rectF4 = v9Var.f35032o;
                if (!v9Var.f35036s) {
                    v9Var.e();
                    float interpolation2 = v9Var.f35028k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = v9Var.f35021a;
                    if (tiVar2 != null) {
                        tiVar2.M1(interpolation2);
                    } else {
                        v9Var.f35023c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (v9Var.f35033p != null && !rectF4.isEmpty()) {
                        m6 pendingDiamond = v9Var.f35033p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            g3 g3Var = v9Var.f35033p;
                            TL_wallet.walletTransaction wallettransaction = v9Var.f35024f;
                            TL_wallet.walletTransaction wallettransaction2 = g3Var.R;
                            if (wallettransaction2 != null && e3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
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
                            v9Var.f35027j.g(centerX4, centerY2);
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
