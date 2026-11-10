package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ci;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43110a;
    public final Object f43111b;

    public r3(Object obj, int i7) {
        this.f43110a = i7;
        this.f43111b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7;
        View view;
        View view2;
        switch (this.f43110a) {
            case 0:
                w3.a((w3) this.f43111b, valueAnimator);
                return;
            case 1:
                p5 p5Var = (p5) this.f43111b;
                p5Var.getClass();
                p5Var.f42989y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.invalidate();
                return;
            case 2:
                x5 x5Var = (x5) this.f43111b;
                x5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.f43328c.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                FrameLayout frameLayout = x5Var.d;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = x5Var.f43329e;
                if (!z9) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                p6 p6Var = (p6) this.f43111b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6 n6Var = p6Var.f43004q;
                x6 x6Var = p6Var.f42996i;
                RectF rectF = p6Var.f43001n;
                RectF rectF2 = p6Var.f43002o;
                if (!p6Var.v) {
                    p6Var.e();
                    float interpolation = p6Var.f42998k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ci ciVar = p6Var.f42992c;
                    if (ciVar != null) {
                        ciVar.x1(interpolation);
                    } else {
                        p6Var.f42991b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (p6Var.f43003p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 J8 = p6Var.f42993e.J8(p6Var.f42994f);
                        org.telegram.ui.Cells.t0 t0Var = p6Var.f43003p;
                        if (J8 != t0Var) {
                            t0Var.I0.i(false);
                            p6Var.f43003p = J8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = p6Var.f43003p;
                        if (t0Var2 != null && !p6Var.f43006s) {
                            t0Var2.I0.i(true);
                            c4 c4Var = p6Var.f43003p.I0.f42324m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(p6Var.c(c4Var));
                                p6Var.f43005r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                x6Var.setAlpha((1.0f - C) * p6Var.f42999l);
                                n6Var.setAlpha(C);
                                p6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                p6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    p6Var.f42997j.g(centerX2, centerY);
                                }
                                p6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            x6Var.setAlpha(0.0f);
                            n6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        x6Var.setAlpha(0.0f);
                        n6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                x6 x6Var2 = (x6) this.f43111b;
                x6Var2.getClass();
                x6Var2.f43346i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x6Var2.e();
                return;
            case 5:
                q7 q7Var = (q7) this.f43111b;
                q7Var.getClass();
                q7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                r8 r8Var = (r8) this.f43111b;
                r8Var.getClass();
                r8Var.f43131x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.invalidate();
                return;
            case 7:
                u8 u8Var = (u8) this.f43111b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                u8Var.f43241w = f14.floatValue();
                u8Var.f43237f.a(f14);
                View view3 = u8Var.f43233a;
                view3.setAlpha(1.0f - u8.c(0.05f, 0.45f, u8Var.f43241w));
                view3.setScaleX(1.0f - (u8Var.f43241w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = u8Var.f43234b;
                editTextBoldCursor.setAlpha(u8.c(0.3f, 0.9f, u8Var.f43241w));
                editTextBoldCursor.setTranslationX((1.0f - u8Var.f43241w) * jg.g.e(80.0f, u8Var.getWidth(), 0));
                u8Var.invalidate();
                return;
            case 8:
                o9 o9Var = (o9) this.f43111b;
                o9Var.getClass();
                o9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                n9 n9Var = (n9) this.f43111b;
                n9Var.getClass();
                n9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.c();
                return;
            default:
                ca caVar = (ca) this.f43111b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = caVar.f42259n;
                RectF rectF4 = caVar.f42260o;
                if (!caVar.f42264s) {
                    caVar.e();
                    float interpolation2 = caVar.f42256k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ci ciVar2 = caVar.f42248a;
                    if (ciVar2 != null) {
                        ciVar2.x1(interpolation2);
                    } else {
                        caVar.f42250c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (caVar.f42261p != null && !rectF4.isEmpty()) {
                        x6 pendingDiamond = caVar.f42261p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = caVar.f42261p;
                            TL_wallet.walletTransaction wallettransaction = caVar.f42252f;
                            TL_wallet.walletTransaction wallettransaction2 = w3Var.R;
                            if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(caVar.d(pendingDiamond));
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
                        caVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            caVar.f42255j.g(centerX4, centerY2);
                        }
                        caVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
