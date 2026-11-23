package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ui;
public final class z3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45387a;
    public final Object f45388b;

    public z3(Object obj, int i7) {
        this.f45387a = i7;
        this.f45388b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7;
        View view;
        View view2;
        switch (this.f45387a) {
            case 0:
                f4.a((f4) this.f45388b, valueAnimator);
                return;
            case 1:
                d6 d6Var = (d6) this.f45388b;
                d6Var.getClass();
                d6Var.f44090y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var.invalidate();
                return;
            case 2:
                l6 l6Var = (l6) this.f45388b;
                l6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.f44537c.setRotationY(floatValue);
                int i10 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = l6Var.d;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                frameLayout.setVisibility(i7);
                FrameLayout frameLayout2 = l6Var.f44538e;
                if (!z10) {
                    i10 = 4;
                }
                frameLayout2.setVisibility(i10);
                return;
            case 3:
                e7 e7Var = (e7) this.f45388b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c7 c7Var = e7Var.f44172q;
                m7 m7Var = e7Var.f44164i;
                RectF rectF = e7Var.f44169n;
                RectF rectF2 = e7Var.f44170o;
                if (!e7Var.v) {
                    e7Var.e();
                    float interpolation = e7Var.f44166k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ui uiVar = e7Var.f44160c;
                    if (uiVar != null) {
                        uiVar.y1(interpolation);
                    } else {
                        e7Var.f44159b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (e7Var.f44171p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 K8 = e7Var.f44161e.K8(e7Var.f44162f);
                        org.telegram.ui.Cells.v0 v0Var = e7Var.f44171p;
                        if (K8 != v0Var) {
                            v0Var.J0.i(false);
                            e7Var.f44171p = K8;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = e7Var.f44171p;
                        if (v0Var2 != null && !e7Var.f44174s) {
                            v0Var2.J0.i(true);
                            l4 l4Var = e7Var.f44171p.J0.f44581m;
                            if (l4Var != null && l4Var.isAttachedToWindow()) {
                                rectF2.set(e7Var.c(l4Var));
                                e7Var.f44173r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                                m7Var.setAlpha((1.0f - C) * e7Var.f44167l);
                                c7Var.setAlpha(C);
                                e7Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                e7Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    e7Var.f44165j.g(centerX2, centerY);
                                }
                                e7Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            m7Var.setAlpha(0.0f);
                            c7Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        m7Var.setAlpha(0.0f);
                        c7Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                m7 m7Var2 = (m7) this.f45388b;
                m7Var2.getClass();
                m7Var2.f44626j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7Var2.e();
                return;
            case 5:
                e8 e8Var = (e8) this.f45388b;
                e8Var.getClass();
                e8Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                f9 f9Var = (f9) this.f45388b;
                f9Var.getClass();
                f9Var.f44270x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9Var.invalidate();
                return;
            case 7:
                j9 j9Var = (j9) this.f45388b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                j9Var.f44467w = f14.floatValue();
                j9Var.f44463f.a(f14);
                View view3 = j9Var.f44459a;
                view3.setAlpha(1.0f - j9.c(0.05f, 0.45f, j9Var.f44467w));
                view3.setScaleX(1.0f - (j9Var.f44467w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = j9Var.f44460b;
                editTextBoldCursor.setAlpha(j9.c(0.3f, 0.9f, j9Var.f44467w));
                editTextBoldCursor.setTranslationX((1.0f - j9Var.f44467w) * i5.c.d(80.0f, j9Var.getWidth(), 0));
                j9Var.invalidate();
                return;
            case 8:
                da daVar = (da) this.f45388b;
                daVar.getClass();
                daVar.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                ca caVar = (ca) this.f45388b;
                caVar.getClass();
                caVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.c();
                return;
            default:
                ra raVar = (ra) this.f45388b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = raVar.f45000n;
                RectF rectF4 = raVar.f45001o;
                if (!raVar.f45005s) {
                    raVar.e();
                    float interpolation2 = raVar.f44997k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ui uiVar2 = raVar.f44989a;
                    if (uiVar2 != null) {
                        uiVar2.y1(interpolation2);
                    } else {
                        raVar.f44991c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (raVar.f45002p != null && !rectF4.isEmpty()) {
                        m7 pendingDiamond = raVar.f45002p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            f4 f4Var = raVar.f45002p;
                            TL_wallet.walletTransaction wallettransaction = raVar.f44993f;
                            TL_wallet.walletTransaction wallettransaction2 = f4Var.S;
                            if (wallettransaction2 != null && d4.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(raVar.d(pendingDiamond));
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
                        raVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            raVar.f44996j.g(centerX4, centerY2);
                        }
                        raVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
