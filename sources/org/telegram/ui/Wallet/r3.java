package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.di;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43091a;
    public final Object f43092b;

    public r3(Object obj, int i7) {
        this.f43091a = i7;
        this.f43092b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7;
        View view;
        View view2;
        switch (this.f43091a) {
            case 0:
                w3.a((w3) this.f43092b, valueAnimator);
                return;
            case 1:
                o5 o5Var = (o5) this.f43092b;
                o5Var.getClass();
                o5Var.f42906y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                return;
            case 2:
                w5 w5Var = (w5) this.f43092b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.f43280b.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                FrameLayout frameLayout = w5Var.f43281c;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = w5Var.d;
                if (!z9) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                o6 o6Var = (o6) this.f43092b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6 m6Var = o6Var.f42921q;
                w6 w6Var = o6Var.f42913i;
                RectF rectF = o6Var.f42918n;
                RectF rectF2 = o6Var.f42919o;
                if (!o6Var.v) {
                    o6Var.e();
                    float interpolation = o6Var.f42915k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    di diVar = o6Var.f42909c;
                    if (diVar != null) {
                        diVar.x1(interpolation);
                    } else {
                        o6Var.f42908b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (o6Var.f42920p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 I8 = o6Var.f42910e.I8(o6Var.f42911f);
                        org.telegram.ui.Cells.t0 t0Var = o6Var.f42920p;
                        if (I8 != t0Var) {
                            t0Var.I0.i(false);
                            o6Var.f42920p = I8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = o6Var.f42920p;
                        if (t0Var2 != null && !o6Var.f42923s) {
                            t0Var2.I0.i(true);
                            c4 c4Var = o6Var.f42920p.I0.f42359m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(o6Var.c(c4Var));
                                o6Var.f42922r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                w6Var.setAlpha((1.0f - C) * o6Var.f42916l);
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
                                    o6Var.f42914j.g(centerX2, centerY);
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
                w6 w6Var2 = (w6) this.f43092b;
                w6Var2.getClass();
                w6Var2.f43298i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w6Var2.e();
                return;
            case 5:
                p7 p7Var = (p7) this.f43092b;
                p7Var.getClass();
                p7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                q8 q8Var = (q8) this.f43092b;
                q8Var.getClass();
                q8Var.f43070x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.invalidate();
                return;
            case 7:
                t8 t8Var = (t8) this.f43092b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                t8Var.f43179w = f14.floatValue();
                t8Var.f43175f.a(f14);
                View view3 = t8Var.f43171a;
                view3.setAlpha(1.0f - t8.c(0.05f, 0.45f, t8Var.f43179w));
                view3.setScaleX(1.0f - (t8Var.f43179w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = t8Var.f43172b;
                editTextBoldCursor.setAlpha(t8.c(0.3f, 0.9f, t8Var.f43179w));
                editTextBoldCursor.setTranslationX((1.0f - t8Var.f43179w) * jg.g.e(80.0f, t8Var.getWidth(), 0));
                t8Var.invalidate();
                return;
            case 8:
                n9 n9Var = (n9) this.f43092b;
                n9Var.getClass();
                n9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                m9 m9Var = (m9) this.f43092b;
                m9Var.getClass();
                m9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.c();
                return;
            default:
                ba baVar = (ba) this.f43092b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = baVar.f42191n;
                RectF rectF4 = baVar.f42192o;
                if (!baVar.f42196s) {
                    baVar.e();
                    float interpolation2 = baVar.f42188k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    di diVar2 = baVar.f42180a;
                    if (diVar2 != null) {
                        diVar2.x1(interpolation2);
                    } else {
                        baVar.f42182c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (baVar.f42193p != null && !rectF4.isEmpty()) {
                        w6 pendingDiamond = baVar.f42193p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = baVar.f42193p;
                            TL_wallet.walletTransaction wallettransaction = baVar.f42184f;
                            TL_wallet.walletTransaction wallettransaction2 = w3Var.R;
                            if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(baVar.d(pendingDiamond));
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
                        baVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            baVar.f42187j.g(centerX4, centerY2);
                        }
                        baVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
