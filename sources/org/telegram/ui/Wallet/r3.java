package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35112a;
    public final Object f35113b;

    public r3(Object obj, int i10) {
        this.f35112a = i10;
        this.f35113b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f35112a) {
            case 0:
                w3.a((w3) this.f35113b, valueAnimator);
                return;
            case 1:
                q5 q5Var = (q5) this.f35113b;
                q5Var.getClass();
                q5Var.f35082y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                return;
            case 2:
                z5 z5Var = (z5) this.f35113b;
                z5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.f35460b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = z5Var.f35461c;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                frameLayout.setVisibility(i10);
                FrameLayout frameLayout2 = z5Var.d;
                if (!z10) {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                return;
            case 3:
                s6 s6Var = (s6) this.f35113b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6 q6Var = s6Var.f35194q;
                a7 a7Var = s6Var.f35186i;
                RectF rectF = s6Var.f35191n;
                RectF rectF2 = s6Var.f35192o;
                if (!s6Var.v) {
                    s6Var.e();
                    float interpolation = s6Var.f35188k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    bi biVar = s6Var.f35183c;
                    if (biVar != null) {
                        biVar.w1(interpolation);
                    } else {
                        s6Var.f35182b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (s6Var.f35193p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f35184f);
                        org.telegram.ui.Cells.s0 s0Var = s6Var.f35193p;
                        if (B8 != s0Var) {
                            s0Var.I0.i(false);
                            s6Var.f35193p = B8;
                        }
                        org.telegram.ui.Cells.s0 s0Var2 = s6Var.f35193p;
                        if (s0Var2 != null && !s6Var.f35196s) {
                            s0Var2.I0.i(true);
                            c4 c4Var = s6Var.f35193p.I0.f34398m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(s6Var.c(c4Var));
                                s6Var.f35195r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float D = c3.i0.D(max, 2.0f, 3.0f, max * max);
                                a7Var.setAlpha((1.0f - D) * s6Var.f35189l);
                                q6Var.setAlpha(D);
                                s6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.i0.L(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                s6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    s6Var.f35187j.g(centerX2, centerY);
                                }
                                s6Var.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            a7Var.setAlpha(0.0f);
                            q6Var.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        a7Var.setAlpha(0.0f);
                        q6Var.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a7 a7Var2 = (a7) this.f35113b;
                a7Var2.getClass();
                a7Var2.f34204i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7Var2.e();
                return;
            case 5:
                u7 u7Var = (u7) this.f35113b;
                u7Var.getClass();
                u7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                v8 v8Var = (v8) this.f35113b;
                v8Var.getClass();
                v8Var.f35326x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                return;
            case 7:
                y8 y8Var = (y8) this.f35113b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                y8Var.f35426w = f13.floatValue();
                y8Var.f35422f.a(f13);
                View view3 = y8Var.f35419a;
                view3.setAlpha(1.0f - y8.c(0.05f, 0.45f, y8Var.f35426w));
                view3.setScaleX(1.0f - (y8Var.f35426w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = y8Var.f35420b;
                editTextBoldCursor.setAlpha(y8.c(0.3f, 0.9f, y8Var.f35426w));
                editTextBoldCursor.setTranslationX((1.0f - y8Var.f35426w) * i0.a.d(80.0f, y8Var.getWidth(), 0));
                y8Var.invalidate();
                return;
            case 8:
                r9 r9Var = (r9) this.f35113b;
                r9Var.getClass();
                r9Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                q9 q9Var = (q9) this.f35113b;
                q9Var.getClass();
                q9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.c();
                return;
            default:
                fa faVar = (fa) this.f35113b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = faVar.f34522n;
                RectF rectF4 = faVar.f34523o;
                if (!faVar.f34527s) {
                    faVar.e();
                    float interpolation2 = faVar.f34519k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    bi biVar2 = faVar.f34512a;
                    if (biVar2 != null) {
                        biVar2.w1(interpolation2);
                    } else {
                        faVar.f34514c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (faVar.f34524p != null && !rectF4.isEmpty()) {
                        a7 pendingDiamond = faVar.f34524p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = faVar.f34524p;
                            TL_wallet.walletTransaction wallettransaction = faVar.f34515f;
                            TL_wallet.walletTransaction wallettransaction2 = w3Var.R;
                            if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(faVar.d(pendingDiamond));
                            }
                        }
                        float f14 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - org.telegram.messenger.i0.L(150.0f);
                        float f15 = f14 * f14;
                        float f16 = f14 * 2.0f * floatValue3;
                        float f17 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f17) + (centerX3 * f16) + (rectF3.centerX() * f15);
                        float centerY2 = (rectF4.centerY() * f17) + (f16 * min2) + (rectF3.centerY() * f15);
                        faVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            faVar.f34518j.g(centerX4, centerY2);
                        }
                        faVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
