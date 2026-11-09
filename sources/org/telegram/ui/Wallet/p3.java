package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.di;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42978a;
    public final Object f42979b;

    public p3(Object obj, int i7) {
        this.f42978a = i7;
        this.f42979b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7;
        View view;
        View view2;
        switch (this.f42978a) {
            case 0:
                u3.a((u3) this.f42979b, valueAnimator);
                return;
            case 1:
                m5 m5Var = (m5) this.f42979b;
                m5Var.getClass();
                m5Var.f42794y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.invalidate();
                return;
            case 2:
                u5 u5Var = (u5) this.f42979b;
                u5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5Var.f43169b.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                FrameLayout frameLayout = u5Var.f43170c;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = u5Var.d;
                if (!z9) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                m6 m6Var = (m6) this.f42979b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6 k6Var = m6Var.f42809q;
                u6 u6Var = m6Var.f42801i;
                RectF rectF = m6Var.f42806n;
                RectF rectF2 = m6Var.f42807o;
                if (!m6Var.v) {
                    m6Var.e();
                    float interpolation = m6Var.f42803k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    di diVar = m6Var.f42797c;
                    if (diVar != null) {
                        diVar.x1(interpolation);
                    } else {
                        m6Var.f42796b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (m6Var.f42808p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 J8 = m6Var.f42798e.J8(m6Var.f42799f);
                        org.telegram.ui.Cells.t0 t0Var = m6Var.f42808p;
                        if (J8 != t0Var) {
                            t0Var.I0.i(false);
                            m6Var.f42808p = J8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = m6Var.f42808p;
                        if (t0Var2 != null && !m6Var.f42811s) {
                            t0Var2.I0.i(true);
                            a4 a4Var = m6Var.f42808p.I0.f42244m;
                            if (a4Var != null && a4Var.isAttachedToWindow()) {
                                rectF2.set(m6Var.c(a4Var));
                                m6Var.f42810r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                u6Var.setAlpha((1.0f - C) * m6Var.f42804l);
                                k6Var.setAlpha(C);
                                m6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                m6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    m6Var.f42802j.g(centerX2, centerY);
                                }
                                m6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            u6Var.setAlpha(0.0f);
                            k6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        u6Var.setAlpha(0.0f);
                        k6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                u6 u6Var2 = (u6) this.f42979b;
                u6Var2.getClass();
                u6Var2.f43187i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var2.e();
                return;
            case 5:
                n7 n7Var = (n7) this.f42979b;
                n7Var.getClass();
                n7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                o8 o8Var = (o8) this.f42979b;
                o8Var.getClass();
                o8Var.f42957x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                return;
            case 7:
                r8 r8Var = (r8) this.f42979b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                r8Var.f43067w = f14.floatValue();
                r8Var.f43063f.a(f14);
                View view3 = r8Var.f43059a;
                view3.setAlpha(1.0f - r8.c(0.05f, 0.45f, r8Var.f43067w));
                view3.setScaleX(1.0f - (r8Var.f43067w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = r8Var.f43060b;
                editTextBoldCursor.setAlpha(r8.c(0.3f, 0.9f, r8Var.f43067w));
                editTextBoldCursor.setTranslationX((1.0f - r8Var.f43067w) * jg.g.e(80.0f, r8Var.getWidth(), 0));
                r8Var.invalidate();
                return;
            case 8:
                l9 l9Var = (l9) this.f42979b;
                l9Var.getClass();
                l9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                k9 k9Var = (k9) this.f42979b;
                k9Var.getClass();
                k9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.c();
                return;
            default:
                z9 z9Var = (z9) this.f42979b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = z9Var.f43475n;
                RectF rectF4 = z9Var.f43476o;
                if (!z9Var.f43480s) {
                    z9Var.e();
                    float interpolation2 = z9Var.f43472k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    di diVar2 = z9Var.f43464a;
                    if (diVar2 != null) {
                        diVar2.x1(interpolation2);
                    } else {
                        z9Var.f43466c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (z9Var.f43477p != null && !rectF4.isEmpty()) {
                        u6 pendingDiamond = z9Var.f43477p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            u3 u3Var = z9Var.f43477p;
                            TL_wallet.walletTransaction wallettransaction = z9Var.f43468f;
                            TL_wallet.walletTransaction wallettransaction2 = u3Var.R;
                            if (wallettransaction2 != null && s3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(z9Var.d(pendingDiamond));
                            }
                        }
                        float f15 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - org.telegram.messenger.g0.L(150.0f);
                        float f16 = f15 * f15;
                        float f17 = f15 * 2.0f * floatValue3;
                        float f18 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f18) + (centerX3 * f17) + (rectF3.centerX() * f16);
                        float centerY2 = (rectF4.centerY() * f18) + (f17 * min2) + (rectF3.centerY() * f16);
                        z9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            z9Var.f43471j.g(centerX4, centerY2);
                        }
                        z9Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
