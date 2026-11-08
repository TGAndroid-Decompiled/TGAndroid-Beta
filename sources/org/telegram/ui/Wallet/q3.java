package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.di;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43060a;
    public final Object f43061b;

    public q3(Object obj, int i7) {
        this.f43060a = i7;
        this.f43061b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7;
        View view;
        View view2;
        switch (this.f43060a) {
            case 0:
                v3.a((v3) this.f43061b, valueAnimator);
                return;
            case 1:
                n5 n5Var = (n5) this.f43061b;
                n5Var.getClass();
                n5Var.f42876y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var.invalidate();
                return;
            case 2:
                v5 v5Var = (v5) this.f43061b;
                v5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.f43251b.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                FrameLayout frameLayout = v5Var.f43252c;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = v5Var.d;
                if (!z9) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                n6 n6Var = (n6) this.f43061b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6 l6Var = n6Var.f42891q;
                v6 v6Var = n6Var.f42883i;
                RectF rectF = n6Var.f42888n;
                RectF rectF2 = n6Var.f42889o;
                if (!n6Var.v) {
                    n6Var.e();
                    float interpolation = n6Var.f42885k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    di diVar = n6Var.f42879c;
                    if (diVar != null) {
                        diVar.x1(interpolation);
                    } else {
                        n6Var.f42878b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (n6Var.f42890p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 I8 = n6Var.f42880e.I8(n6Var.f42881f);
                        org.telegram.ui.Cells.t0 t0Var = n6Var.f42890p;
                        if (I8 != t0Var) {
                            t0Var.I0.i(false);
                            n6Var.f42890p = I8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = n6Var.f42890p;
                        if (t0Var2 != null && !n6Var.f42893s) {
                            t0Var2.I0.i(true);
                            b4 b4Var = n6Var.f42890p.I0.f42330m;
                            if (b4Var != null && b4Var.isAttachedToWindow()) {
                                rectF2.set(n6Var.c(b4Var));
                                n6Var.f42892r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                v6Var.setAlpha((1.0f - C) * n6Var.f42886l);
                                l6Var.setAlpha(C);
                                n6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                n6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    n6Var.f42884j.g(centerX2, centerY);
                                }
                                n6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            v6Var.setAlpha(0.0f);
                            l6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        v6Var.setAlpha(0.0f);
                        l6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                v6 v6Var2 = (v6) this.f43061b;
                v6Var2.getClass();
                v6Var2.f43269i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v6Var2.e();
                return;
            case 5:
                o7 o7Var = (o7) this.f43061b;
                o7Var.getClass();
                o7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                p8 p8Var = (p8) this.f43061b;
                p8Var.getClass();
                p8Var.f43039x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.invalidate();
                return;
            case 7:
                s8 s8Var = (s8) this.f43061b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                s8Var.f43149w = f14.floatValue();
                s8Var.f43145f.a(f14);
                View view3 = s8Var.f43141a;
                view3.setAlpha(1.0f - s8.c(0.05f, 0.45f, s8Var.f43149w));
                view3.setScaleX(1.0f - (s8Var.f43149w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = s8Var.f43142b;
                editTextBoldCursor.setAlpha(s8.c(0.3f, 0.9f, s8Var.f43149w));
                editTextBoldCursor.setTranslationX((1.0f - s8Var.f43149w) * jg.g.e(80.0f, s8Var.getWidth(), 0));
                s8Var.invalidate();
                return;
            case 8:
                m9 m9Var = (m9) this.f43061b;
                m9Var.getClass();
                m9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                l9 l9Var = (l9) this.f43061b;
                l9Var.getClass();
                l9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.c();
                return;
            default:
                aa aaVar = (aa) this.f43061b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = aaVar.f42163n;
                RectF rectF4 = aaVar.f42164o;
                if (!aaVar.f42168s) {
                    aaVar.e();
                    float interpolation2 = aaVar.f42160k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    di diVar2 = aaVar.f42152a;
                    if (diVar2 != null) {
                        diVar2.x1(interpolation2);
                    } else {
                        aaVar.f42154c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (aaVar.f42165p != null && !rectF4.isEmpty()) {
                        v6 pendingDiamond = aaVar.f42165p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            v3 v3Var = aaVar.f42165p;
                            TL_wallet.walletTransaction wallettransaction = aaVar.f42156f;
                            TL_wallet.walletTransaction wallettransaction2 = v3Var.R;
                            if (wallettransaction2 != null && t3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
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
                            aaVar.f42159j.g(centerX4, centerY2);
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
