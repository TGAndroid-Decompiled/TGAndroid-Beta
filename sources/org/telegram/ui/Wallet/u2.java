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
    public final int f34966a;
    public final Object f34967b;

    public u2(Object obj, int i10) {
        this.f34966a = i10;
        this.f34967b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f34966a) {
            case 0:
                y2 y2Var = (y2) this.f34967b;
                y2Var.getClass();
                y2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.d();
                return;
            case 1:
                e3.a((e3) this.f34967b, valueAnimator);
                return;
            case 2:
                b5 b5Var = (b5) this.f34967b;
                b5Var.getClass();
                b5Var.f34043x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var.invalidate();
                return;
            case 3:
                k5 k5Var = (k5) this.f34967b;
                k5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.f34390b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = k5Var.f34391c;
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
            case 4:
                k6 k6Var = (k6) this.f34967b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6 i6Var = k6Var.f34407q;
                s6 s6Var = k6Var.f34399i;
                RectF rectF = k6Var.f34404n;
                RectF rectF2 = k6Var.f34405o;
                if (!k6Var.v) {
                    k6Var.e();
                    float interpolation = k6Var.f34401k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = k6Var.f34396c;
                    if (tiVar != null) {
                        tiVar.M1(interpolation);
                    } else {
                        k6Var.f34395b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (k6Var.f34406p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f34397f);
                        org.telegram.ui.Cells.w0 w0Var = k6Var.f34406p;
                        if (u82 != w0Var) {
                            w0Var.I0.k(false);
                            k6Var.f34406p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = k6Var.f34406p;
                        if (w0Var2 != null && !k6Var.f34409s) {
                            w0Var2.I0.k(true);
                            k3 k3Var = k6Var.f34406p.I0.f34467m;
                            if (k3Var != null && k3Var.isAttachedToWindow()) {
                                rectF2.set(k6Var.c(k3Var));
                                k6Var.f34408r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                s6Var.setAlpha((1.0f - B) * k6Var.f34402l);
                                i6Var.setAlpha(B);
                                k6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                k6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    k6Var.f34400j.g(centerX2, centerY);
                                }
                                k6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            s6Var.setAlpha(0.0f);
                            i6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        s6Var.setAlpha(0.0f);
                        i6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                s6 s6Var2 = (s6) this.f34967b;
                s6Var2.getClass();
                s6Var2.f34909i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var2.e();
                return;
            case 6:
                m7 m7Var = (m7) this.f34967b;
                m7Var.getClass();
                m7Var.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                p8 p8Var = (p8) this.f34967b;
                p8Var.getClass();
                p8Var.f34754w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.invalidate();
                return;
            case 8:
                t8 t8Var = (t8) this.f34967b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                t8Var.v = f13.floatValue();
                t8Var.f34948f.run(f13);
                View view3 = t8Var.f34945a;
                view3.setAlpha(1.0f - t8.c(0.05f, 0.45f, t8Var.v));
                view3.setScaleX(1.0f - (t8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = t8Var.f34946b;
                editTextBoldCursor.setAlpha(t8.c(0.3f, 0.9f, t8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - t8Var.v) * org.telegram.messenger.g0.b(80.0f, t8Var.getWidth(), 0));
                t8Var.invalidate();
                return;
            case 9:
                o9 o9Var = (o9) this.f34967b;
                o9Var.getClass();
                o9Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                n9 n9Var = (n9) this.f34967b;
                n9Var.getClass();
                n9Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.c();
                return;
            default:
                aa aaVar = (aa) this.f34967b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = aaVar.f34002n;
                RectF rectF4 = aaVar.f34003o;
                if (!aaVar.f34007s) {
                    aaVar.e();
                    float interpolation2 = aaVar.f33999k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = aaVar.f33992a;
                    if (tiVar2 != null) {
                        tiVar2.M1(interpolation2);
                    } else {
                        aaVar.f33994c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (aaVar.f34004p != null && !rectF4.isEmpty()) {
                        s6 pendingDiamond = aaVar.f34004p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            e3 e3Var = aaVar.f34004p;
                            TL_wallet.walletTransaction wallettransaction = aaVar.f33995f;
                            TL_wallet.walletTransaction wallettransaction2 = e3Var.R;
                            if (wallettransaction2 != null && c3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(aaVar.d(pendingDiamond));
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
                        aaVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            aaVar.f33998j.g(centerX4, centerY2);
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
