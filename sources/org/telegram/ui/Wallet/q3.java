package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ki;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44383a;
    public final Object f44384b;

    public q3(Object obj, int i7) {
        this.f44383a = i7;
        this.f44384b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7;
        View view;
        View view2;
        switch (this.f44383a) {
            case 0:
                v3.a((v3) this.f44384b, valueAnimator);
                return;
            case 1:
                o5 o5Var = (o5) this.f44384b;
                o5Var.getClass();
                o5Var.f44247y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                return;
            case 2:
                w5 w5Var = (w5) this.f44384b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.f44627c.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = w5Var.d;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = w5Var.f44628e;
                if (!z10) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                o6 o6Var = (o6) this.f44384b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6 m6Var = o6Var.f44262q;
                w6 w6Var = o6Var.f44254i;
                RectF rectF = o6Var.f44259n;
                RectF rectF2 = o6Var.f44260o;
                if (!o6Var.v) {
                    o6Var.e();
                    float interpolation = o6Var.f44256k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ki kiVar = o6Var.f44250c;
                    if (kiVar != null) {
                        kiVar.x1(interpolation);
                    } else {
                        o6Var.f44249b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (o6Var.f44261p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 K8 = o6Var.f44251e.K8(o6Var.f44252f);
                        org.telegram.ui.Cells.t0 t0Var = o6Var.f44261p;
                        if (K8 != t0Var) {
                            t0Var.J0.i(false);
                            o6Var.f44261p = K8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = o6Var.f44261p;
                        if (t0Var2 != null && !o6Var.f44264s) {
                            t0Var2.J0.i(true);
                            b4 b4Var = o6Var.f44261p.J0.f43593m;
                            if (b4Var != null && b4Var.isAttachedToWindow()) {
                                rectF2.set(o6Var.c(b4Var));
                                o6Var.f44263r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                                w6Var.setAlpha((1.0f - C) * o6Var.f44257l);
                                m6Var.setAlpha(C);
                                o6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                o6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    o6Var.f44255j.g(centerX2, centerY);
                                }
                                o6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            w6Var.setAlpha(0.0f);
                            m6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        w6Var.setAlpha(0.0f);
                        m6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                w6 w6Var2 = (w6) this.f44384b;
                w6Var2.getClass();
                w6Var2.f44646j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w6Var2.e();
                return;
            case 5:
                p7 p7Var = (p7) this.f44384b;
                p7Var.getClass();
                p7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                r8 r8Var = (r8) this.f44384b;
                r8Var.getClass();
                r8Var.f44455x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.invalidate();
                return;
            case 7:
                u8 u8Var = (u8) this.f44384b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                u8Var.f44573w = f14.floatValue();
                u8Var.f44569f.a(f14);
                View view3 = u8Var.f44565a;
                view3.setAlpha(1.0f - u8.c(0.05f, 0.45f, u8Var.f44573w));
                view3.setScaleX(1.0f - (u8Var.f44573w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = u8Var.f44566b;
                editTextBoldCursor.setAlpha(u8.c(0.3f, 0.9f, u8Var.f44573w));
                editTextBoldCursor.setTranslationX((1.0f - u8Var.f44573w) * i5.c.d(80.0f, u8Var.getWidth(), 0));
                u8Var.invalidate();
                return;
            case 8:
                p9 p9Var = (p9) this.f44384b;
                p9Var.getClass();
                p9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                o9 o9Var = (o9) this.f44384b;
                o9Var.getClass();
                o9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o9Var.c();
                return;
            default:
                da daVar = (da) this.f44384b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = daVar.f43772n;
                RectF rectF4 = daVar.f43773o;
                if (!daVar.f43777s) {
                    daVar.e();
                    float interpolation2 = daVar.f43769k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ki kiVar2 = daVar.f43761a;
                    if (kiVar2 != null) {
                        kiVar2.x1(interpolation2);
                    } else {
                        daVar.f43763c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (daVar.f43774p != null && !rectF4.isEmpty()) {
                        w6 pendingDiamond = daVar.f43774p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            v3 v3Var = daVar.f43774p;
                            TL_wallet.walletTransaction wallettransaction = daVar.f43765f;
                            TL_wallet.walletTransaction wallettransaction2 = v3Var.S;
                            if (wallettransaction2 != null && t3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(daVar.d(pendingDiamond));
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
                        daVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            daVar.f43768j.g(centerX4, centerY2);
                        }
                        daVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
