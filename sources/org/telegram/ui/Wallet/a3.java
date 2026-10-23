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
    public final int f34287a;
    public final Object f34288b;

    public a3(Object obj, int i10) {
        this.f34287a = i10;
        this.f34288b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f34287a) {
            case 0:
                f3.a((f3) this.f34288b, valueAnimator);
                return;
            case 1:
                c5 c5Var = (c5) this.f34288b;
                c5Var.getClass();
                c5Var.f34372x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.invalidate();
                return;
            case 2:
                m5 m5Var = (m5) this.f34288b;
                m5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.f34853b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = m5Var.f34854c;
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
                e6 e6Var = (e6) this.f34288b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6 c6Var = e6Var.f34452q;
                m6 m6Var = e6Var.f34444i;
                RectF rectF = e6Var.f34449n;
                RectF rectF2 = e6Var.f34450o;
                if (!e6Var.v) {
                    e6Var.e();
                    float interpolation = e6Var.f34446k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = e6Var.f34441c;
                    if (tiVar != null) {
                        tiVar.Q1(interpolation);
                    } else {
                        e6Var.f34440b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (e6Var.f34451p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f34442f);
                        org.telegram.ui.Cells.v0 v0Var = e6Var.f34451p;
                        if (u82 != v0Var) {
                            v0Var.I0.i(false);
                            e6Var.f34451p = u82;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = e6Var.f34451p;
                        if (v0Var2 != null && !e6Var.f34454s) {
                            v0Var2.I0.i(true);
                            l3 l3Var = e6Var.f34451p.I0.f34825m;
                            if (l3Var != null && l3Var.isAttachedToWindow()) {
                                rectF2.set(e6Var.c(l3Var));
                                e6Var.f34453r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                m6Var.setAlpha((1.0f - B) * e6Var.f34447l);
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
                                    e6Var.f34445j.g(centerX2, centerY);
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
                m6 m6Var2 = (m6) this.f34288b;
                m6Var2.getClass();
                m6Var2.f34869i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var2.e();
                return;
            case 5:
                g7 g7Var = (g7) this.f34288b;
                g7Var.getClass();
                g7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                k8 k8Var = (k8) this.f34288b;
                k8Var.getClass();
                k8Var.f34726w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                return;
            case 7:
                o8 o8Var = (o8) this.f34288b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                o8Var.v = f13.floatValue();
                o8Var.f34971f.run(f13);
                View view3 = o8Var.f34968a;
                view3.setAlpha(1.0f - o8.c(0.05f, 0.45f, o8Var.v));
                view3.setScaleX(1.0f - (o8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = o8Var.f34969b;
                editTextBoldCursor.setAlpha(o8.c(0.3f, 0.9f, o8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - o8Var.v) * i2.o1.g(80.0f, o8Var.getWidth(), 0));
                o8Var.invalidate();
                return;
            case 8:
                j9 j9Var = (j9) this.f34288b;
                j9Var.getClass();
                j9Var.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                i9 i9Var = (i9) this.f34288b;
                i9Var.getClass();
                i9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.c();
                return;
            default:
                w9 w9Var = (w9) this.f34288b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = w9Var.f35369n;
                RectF rectF4 = w9Var.f35370o;
                if (!w9Var.f35374s) {
                    w9Var.e();
                    float interpolation2 = w9Var.f35366k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = w9Var.f35359a;
                    if (tiVar2 != null) {
                        tiVar2.Q1(interpolation2);
                    } else {
                        w9Var.f35361c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (w9Var.f35371p != null && !rectF4.isEmpty()) {
                        m6 pendingDiamond = w9Var.f35371p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            f3 f3Var = w9Var.f35371p;
                            TL_wallet.walletTransaction wallettransaction = w9Var.f35362f;
                            TL_wallet.walletTransaction wallettransaction2 = f3Var.R;
                            if (wallettransaction2 != null && d3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(w9Var.d(pendingDiamond));
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
                        w9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            w9Var.f35365j.g(centerX4, centerY2);
                        }
                        w9Var.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
