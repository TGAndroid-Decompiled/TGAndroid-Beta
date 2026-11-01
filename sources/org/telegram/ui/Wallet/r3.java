package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35117a;
    public final Object f35118b;

    public r3(Object obj, int i10) {
        this.f35117a = i10;
        this.f35118b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10;
        View view;
        View view2;
        switch (this.f35117a) {
            case 0:
                w3.a((w3) this.f35118b, valueAnimator);
                return;
            case 1:
                q5 q5Var = (q5) this.f35118b;
                q5Var.getClass();
                q5Var.f35088y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                return;
            case 2:
                z5 z5Var = (z5) this.f35118b;
                z5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.f35467b.setRotationY(floatValue);
                int i11 = 0;
                if (floatValue > 90.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                FrameLayout frameLayout = z5Var.f35468c;
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
                s6 s6Var = (s6) this.f35118b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6 q6Var = s6Var.f35201q;
                a7 a7Var = s6Var.f35193i;
                RectF rectF = s6Var.f35198n;
                RectF rectF2 = s6Var.f35199o;
                if (!s6Var.v) {
                    s6Var.e();
                    float interpolation = s6Var.f35195k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    bi biVar = s6Var.f35190c;
                    if (biVar != null) {
                        biVar.w1(interpolation);
                    } else {
                        s6Var.f35189b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (s6Var.f35200p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.s0 F8 = s6Var.e.F8(s6Var.f35191f);
                        org.telegram.ui.Cells.s0 s0Var = s6Var.f35200p;
                        if (F8 != s0Var) {
                            s0Var.I0.i(false);
                            s6Var.f35200p = F8;
                        }
                        org.telegram.ui.Cells.s0 s0Var2 = s6Var.f35200p;
                        if (s0Var2 != null && !s6Var.f35203s) {
                            s0Var2.I0.i(true);
                            c4 c4Var = s6Var.f35200p.I0.f34403m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(s6Var.c(c4Var));
                                s6Var.f35202r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float D = c3.i0.D(max, 2.0f, 3.0f, max * max);
                                a7Var.setAlpha((1.0f - D) * s6Var.f35196l);
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
                                    s6Var.f35194j.g(centerX2, centerY);
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
                a7 a7Var2 = (a7) this.f35118b;
                a7Var2.getClass();
                a7Var2.f34203i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7Var2.e();
                return;
            case 5:
                u7 u7Var = (u7) this.f35118b;
                u7Var.getClass();
                u7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                v8 v8Var = (v8) this.f35118b;
                v8Var.getClass();
                v8Var.f35330x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                return;
            case 7:
                y8 y8Var = (y8) this.f35118b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                y8Var.f35429w = f13.floatValue();
                y8Var.f35425f.a(f13);
                View view3 = y8Var.f35422a;
                view3.setAlpha(1.0f - y8.c(0.05f, 0.45f, y8Var.f35429w));
                view3.setScaleX(1.0f - (y8Var.f35429w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = y8Var.f35423b;
                editTextBoldCursor.setAlpha(y8.c(0.3f, 0.9f, y8Var.f35429w));
                editTextBoldCursor.setTranslationX((1.0f - y8Var.f35429w) * i0.a.d(80.0f, y8Var.getWidth(), 0));
                y8Var.invalidate();
                return;
            case 8:
                r9 r9Var = (r9) this.f35118b;
                r9Var.getClass();
                r9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                q9 q9Var = (q9) this.f35118b;
                q9Var.getClass();
                q9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.c();
                return;
            default:
                fa faVar = (fa) this.f35118b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = faVar.f34520n;
                RectF rectF4 = faVar.f34521o;
                if (!faVar.f34525s) {
                    faVar.e();
                    float interpolation2 = faVar.f34517k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    bi biVar2 = faVar.f34510a;
                    if (biVar2 != null) {
                        biVar2.w1(interpolation2);
                    } else {
                        faVar.f34512c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (faVar.f34522p != null && !rectF4.isEmpty()) {
                        a7 pendingDiamond = faVar.f34522p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = faVar.f34522p;
                            TL_wallet.walletTransaction wallettransaction = faVar.f34513f;
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
                            faVar.f34516j.g(centerX4, centerY2);
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
