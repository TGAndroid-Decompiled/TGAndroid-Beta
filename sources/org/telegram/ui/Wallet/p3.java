package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43038a;
    public final Object f43039b;

    public p3(Object obj, int i3) {
        this.f43038a = i3;
        this.f43039b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i3;
        View view;
        View view2;
        switch (this.f43038a) {
            case 0:
                u3.a((u3) this.f43039b, valueAnimator);
                return;
            case 1:
                m5 m5Var = (m5) this.f43039b;
                m5Var.getClass();
                m5Var.f42843y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.invalidate();
                return;
            case 2:
                u5 u5Var = (u5) this.f43039b;
                u5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5Var.f43240b.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = u5Var.f43241c;
                if (z10) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                frameLayout.setVisibility(i3);
                FrameLayout frameLayout2 = u5Var.d;
                if (!z10) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                m6 m6Var = (m6) this.f43039b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6 k6Var = m6Var.f42858q;
                u6 u6Var = m6Var.f42850i;
                RectF rectF = m6Var.f42855n;
                RectF rectF2 = m6Var.f42856o;
                if (!m6Var.v) {
                    m6Var.e();
                    float interpolation = m6Var.f42852k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    bi biVar = m6Var.f42846c;
                    if (biVar != null) {
                        biVar.x1(interpolation);
                    } else {
                        m6Var.f42845b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (m6Var.f42857p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 I8 = m6Var.f42847e.I8(m6Var.f42848f);
                        org.telegram.ui.Cells.t0 t0Var = m6Var.f42857p;
                        if (I8 != t0Var) {
                            t0Var.J0.i(false);
                            m6Var.f42857p = I8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = m6Var.f42857p;
                        if (t0Var2 != null && !m6Var.f42860s) {
                            t0Var2.J0.i(true);
                            a4 a4Var = m6Var.f42857p.J0.f42254m;
                            if (a4Var != null && a4Var.isAttachedToWindow()) {
                                rectF2.set(m6Var.c(a4Var));
                                m6Var.f42859r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.recaptcha.internal.a.B(max, 2.0f, 3.0f, max * max);
                                u6Var.setAlpha((1.0f - B) * m6Var.f42853l);
                                k6Var.setAlpha(B);
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
                                    m6Var.f42851j.g(centerX2, centerY);
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
                u6 u6Var2 = (u6) this.f43039b;
                u6Var2.getClass();
                u6Var2.f43259j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var2.e();
                return;
            case 5:
                o7 o7Var = (o7) this.f43039b;
                o7Var.getClass();
                o7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                p8 p8Var = (p8) this.f43039b;
                p8Var.getClass();
                p8Var.f43061x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.invalidate();
                return;
            case 7:
                s8 s8Var = (s8) this.f43039b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                s8Var.f43173w = f14.floatValue();
                s8Var.f43169f.a(f14);
                View view3 = s8Var.f43165a;
                view3.setAlpha(1.0f - s8.c(0.05f, 0.45f, s8Var.f43173w));
                view3.setScaleX(1.0f - (s8Var.f43173w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = s8Var.f43166b;
                editTextBoldCursor.setAlpha(s8.c(0.3f, 0.9f, s8Var.f43173w));
                editTextBoldCursor.setTranslationX((1.0f - s8Var.f43173w) * k2.p1.d(80.0f, s8Var.getWidth(), 0));
                s8Var.invalidate();
                return;
            case 8:
                m9 m9Var = (m9) this.f43039b;
                m9Var.getClass();
                m9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                l9 l9Var = (l9) this.f43039b;
                l9Var.getClass();
                l9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.c();
                return;
            default:
                aa aaVar = (aa) this.f43039b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = aaVar.f42202n;
                RectF rectF4 = aaVar.f42203o;
                if (!aaVar.f42207s) {
                    aaVar.e();
                    float interpolation2 = aaVar.f42199k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    bi biVar2 = aaVar.f42191a;
                    if (biVar2 != null) {
                        biVar2.x1(interpolation2);
                    } else {
                        aaVar.f42193c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (aaVar.f42204p != null && !rectF4.isEmpty()) {
                        u6 pendingDiamond = aaVar.f42204p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            u3 u3Var = aaVar.f42204p;
                            TL_wallet.walletTransaction wallettransaction = aaVar.f42195f;
                            TL_wallet.walletTransaction wallettransaction2 = u3Var.S;
                            if (wallettransaction2 != null && s3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(aaVar.d(pendingDiamond));
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
                        aaVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            aaVar.f42198j.g(centerX4, centerY2);
                        }
                        aaVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
