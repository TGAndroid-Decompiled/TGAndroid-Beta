package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;
public final class a4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44045a;
    public final Object f44046b;

    public a4(Object obj, int i7) {
        this.f44045a = i7;
        this.f44046b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7;
        View view;
        View view2;
        switch (this.f44045a) {
            case 0:
                g4.a((g4) this.f44046b, valueAnimator);
                return;
            case 1:
                e6 e6Var = (e6) this.f44046b;
                e6Var.getClass();
                e6Var.f44218y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                return;
            case 2:
                m6 m6Var = (m6) this.f44046b;
                m6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.f44664c.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = m6Var.d;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = m6Var.f44665e;
                if (!z10) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                f7 f7Var = (f7) this.f44046b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7 d7Var = f7Var.f44301q;
                n7 n7Var = f7Var.f44293i;
                RectF rectF = f7Var.f44298n;
                RectF rectF2 = f7Var.f44299o;
                if (!f7Var.v) {
                    f7Var.e();
                    float interpolation = f7Var.f44295k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = f7Var.f44289c;
                    if (tiVar != null) {
                        tiVar.y1(interpolation);
                    } else {
                        f7Var.f44288b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (f7Var.f44300p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 K8 = f7Var.f44290e.K8(f7Var.f44291f);
                        org.telegram.ui.Cells.v0 v0Var = f7Var.f44300p;
                        if (K8 != v0Var) {
                            v0Var.J0.i(false);
                            f7Var.f44300p = K8;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = f7Var.f44300p;
                        if (v0Var2 != null && !f7Var.f44303s) {
                            v0Var2.J0.i(true);
                            m4 m4Var = f7Var.f44300p.J0.f44717m;
                            if (m4Var != null && m4Var.isAttachedToWindow()) {
                                rectF2.set(f7Var.c(m4Var));
                                f7Var.f44302r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                                n7Var.setAlpha((1.0f - C) * f7Var.f44296l);
                                d7Var.setAlpha(C);
                                f7Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                f7Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    f7Var.f44294j.g(centerX2, centerY);
                                }
                                f7Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            n7Var.setAlpha(0.0f);
                            d7Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        n7Var.setAlpha(0.0f);
                        d7Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                n7 n7Var2 = (n7) this.f44046b;
                n7Var2.getClass();
                n7Var2.f44766j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var2.e();
                return;
            case 5:
                f8 f8Var = (f8) this.f44046b;
                f8Var.getClass();
                f8Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                g9 g9Var = (g9) this.f44046b;
                g9Var.getClass();
                g9Var.f44401x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.invalidate();
                return;
            case 7:
                k9 k9Var = (k9) this.f44046b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                k9Var.f44594w = f14.floatValue();
                k9Var.f44590f.a(f14);
                View view3 = k9Var.f44586a;
                view3.setAlpha(1.0f - k9.c(0.05f, 0.45f, k9Var.f44594w));
                view3.setScaleX(1.0f - (k9Var.f44594w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = k9Var.f44587b;
                editTextBoldCursor.setAlpha(k9.c(0.3f, 0.9f, k9Var.f44594w));
                editTextBoldCursor.setTranslationX((1.0f - k9Var.f44594w) * i5.c.d(80.0f, k9Var.getWidth(), 0));
                k9Var.invalidate();
                return;
            case 8:
                ea eaVar = (ea) this.f44046b;
                eaVar.getClass();
                eaVar.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                da daVar = (da) this.f44046b;
                daVar.getClass();
                daVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.c();
                return;
            default:
                sa saVar = (sa) this.f44046b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = saVar.f45128n;
                RectF rectF4 = saVar.f45129o;
                if (!saVar.f45133s) {
                    saVar.e();
                    float interpolation2 = saVar.f45125k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = saVar.f45117a;
                    if (tiVar2 != null) {
                        tiVar2.y1(interpolation2);
                    } else {
                        saVar.f45119c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (saVar.f45130p != null && !rectF4.isEmpty()) {
                        n7 pendingDiamond = saVar.f45130p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            g4 g4Var = saVar.f45130p;
                            TL_wallet.walletTransaction wallettransaction = saVar.f45121f;
                            TL_wallet.walletTransaction wallettransaction2 = g4Var.S;
                            if (wallettransaction2 != null && e4.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(saVar.d(pendingDiamond));
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
                        saVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            saVar.f45124j.g(centerX4, centerY2);
                        }
                        saVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
