package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class di extends hv0 {
    public int f27768s0;
    public final RectF f27769t0;
    public boolean f27770u0;
    public float f27771v0;
    public final ci f27772w0;
    public final ni f27773x0;

    public di(ni niVar, Context context) {
        super(context, null);
        this.f27773x0 = niVar;
        this.f27769t0 = new RectF();
        this.f27772w0 = new ci(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        int dp;
        int dp2;
        float f12;
        float f13;
        int q12;
        Drawable drawable;
        Drawable drawable2;
        int i13;
        Drawable drawable3;
        float f14;
        int themedColor;
        float alpha;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        fi fiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ni niVar = this.f27773x0;
        qg.d dVar = niVar.A2;
        qg.d dVar2 = niVar.f31071z2;
        if (Build.VERSION.SDK_INT >= 31 && niVar.f31068y2 != null) {
            niVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        fi fiVar2 = niVar.f31051u0;
        lm lmVar = niVar.m0;
        if ((fiVar2 == lmVar || (fiVar = niVar.f31054v0) == lmVar || (fiVar2 == niVar.f31005f0 && fiVar == null)) && fiVar2 != null) {
            canvas.save();
            float f15 = niVar.f31013h2;
            boolean z10 = niVar.f30994c0;
            bg.d1 d1Var = niVar.K0;
            ph phVar = niVar.f31002e1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (fiVar2.getAlpha() * 255.0f);
            int h = fiVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (phVar != null) {
                f9 = phVar.getAlpha();
            } else {
                f9 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f9 * AndroidUtilities.dp(26.0f)));
            if (d1Var != null) {
                f10 = d1Var.getAlpha() * d1Var.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i27 = dp4 + ((int) f10);
            int p12 = niVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            int i28 = (p12 - i10) - i27;
            i11 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
            if (i11 == 1 || niVar.f31035p1 != null) {
                i28 = (int) (fiVar2.getTranslationY() + i28);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i28;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (h == 2) {
                if (i28 < i12) {
                    float f17 = i12 - i28;
                    i26 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                } else {
                    f13 = 1.0f;
                }
                f11 = 0.0f;
            } else {
                float f18 = i27;
                f11 = 0.0f;
                if (fiVar2 == niVar.f31020k0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (fiVar2 == niVar.f31014i0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (fiVar2 == niVar.f31017j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = niVar.T0.getAlpha();
                    int i29 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i28 -= i29;
                    dp5 -= i29;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = niVar.T0.getAlpha();
                int i292 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha32);
                i28 -= i292;
                dp5 -= i292;
                f13 = 1.0f - alpha32;
            }
            if (!z10) {
                int i30 = AndroidUtilities.statusBarHeight;
                i28 += i30;
                dp5 += i30;
            }
            if (niVar.f31051u0.f()) {
                q12 = niVar.f31051u0.getCustomBackground();
            } else {
                q12 = niVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            drawable2.setBounds(0, i28, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f27769t0;
            if (h == 2) {
                org.telegram.ui.ActionBar.g6.f23340t0.setColor(q12);
                org.telegram.ui.ActionBar.g6.f23340t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i28);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && h != 2) || niVar.f31051u0.e()) {
                Paint paint = org.telegram.ui.ActionBar.g6.f23340t0;
                if (niVar.f31051u0.e()) {
                    q12 = niVar.f31051u0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.g6.f23340t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i28);
            }
            if (niVar.f31051u0.e()) {
                org.telegram.ui.ActionBar.g6.f23340t0.setColor(niVar.f31051u0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.g6.f23340t0.setAlpha(alpha2);
                int p13 = niVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i28) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.g6.f23340t0);
                canvas.restore();
            }
            if ((phVar == null || phVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (niVar.f31051u0.e()) {
                    int customActionBarBackground = niVar.f31051u0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (phVar != null) {
                        alpha = phVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                } else {
                    themedColor = niVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    if (phVar != null) {
                        alpha = phVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.f23340t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.f23340t0.setAlpha((int) (fiVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f9;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int dp2;
        float f12;
        int i14;
        float f13;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f14;
        int dp3;
        int dp4;
        float f15;
        int i21;
        float f16;
        int q12;
        boolean z10;
        boolean drawChild;
        int themedColor;
        float alpha;
        int i22;
        int i23;
        int i24;
        int i25;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i26;
        int i27;
        int i28;
        int i29;
        fi fiVar;
        int i30;
        ni niVar = this.f27773x0;
        boolean z11 = niVar.f30994c0;
        bg.d1 d1Var = niVar.K0;
        ng.d dVar = niVar.f31058w0;
        ph phVar = niVar.f31002e1;
        cg.m1 m1Var = niVar.T0;
        if ((view instanceof fi) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, niVar.f31013h2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            fi fiVar2 = (fi) view;
            int h = fiVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (phVar != null) {
                i14 = AndroidUtilities.dp(phVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i31 = dp5 + i14;
            if (d1Var != null) {
                f13 = d1Var.getAlpha() * d1Var.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i32 = i31 + ((int) f13);
            if (fiVar2 == niVar.f31051u0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int p12 = niVar.p1(i15);
            i16 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            int i33 = (p12 - i16) - i32;
            i17 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
            if (i17 == 1 || niVar.f31035p1 != null) {
                i33 = (int) (view.getTranslationY() + i33);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i33;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            int i34 = i18 + dp7;
            if (h == 0) {
                i19 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            int i35 = i19;
            if (h != 2) {
                i20 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i33 < i35) {
                    float f17 = i32;
                    if (fiVar2 == niVar.f31020k0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (fiVar2 == niVar.f31014i0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (fiVar2 == niVar.f31017j0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                        int i36 = (int) ((i35 - f15) * min);
                        i33 -= i36;
                        dp6 -= i36;
                        i34 += i36;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                    int i362 = (int) ((i35 - f15) * min2);
                    i33 -= i362;
                    dp6 -= i362;
                    i34 += i362;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i33 < i35) {
                i30 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                f16 = Math.max(0.0f, 1.0f - ((i35 - i33) / i30));
                f14 = 0.0f;
            } else {
                f14 = 0.0f;
                f16 = 1.0f;
            }
            if (!z11) {
                int i37 = AndroidUtilities.statusBarHeight;
                i33 += i37;
                dp6 += i37;
                i34 -= i37;
            }
            int i38 = i34;
            if (niVar.f31051u0.f()) {
                q12 = niVar.f31051u0.getCustomBackground();
            } else {
                q12 = niVar.q1(true);
            }
            fi fiVar3 = niVar.f31051u0;
            lm lmVar = niVar.m0;
            if (fiVar3 != lmVar && (fiVar = niVar.f31054v0) != lmVar && (fiVar3 != niVar.f31005f0 || fiVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f27769t0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
                drawable2.setBounds(0, i33, getMeasuredWidth(), i38);
                drawable3 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.g6.f23340t0.setColor(q12);
                    org.telegram.ui.ActionBar.g6.f23340t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i33, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i33);
                }
            }
            if (view != niVar.f31008g0 && view != niVar.f31031o0 && view != niVar.f31011h0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f16 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.g6.f23340t0.setColor(q12);
                    org.telegram.ui.ActionBar.g6.f23340t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i33, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i33);
                }
                if ((phVar == null || phVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = niVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                        if (phVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - phVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.g6.f23340t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.g6.f23340t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == m1Var) {
            float alpha4 = m1Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x4 = m1Var.getX();
            fi fiVar4 = niVar.f31051u0;
            if (fiVar4 != null) {
                int h10 = fiVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (phVar != null) {
                    f10 = phVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (d1Var != null) {
                    f11 = d1Var.getAlpha() * d1Var.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i39 = dp10 + ((int) f11);
                int p13 = niVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int i40 = (p13 - i10) - i39;
                i11 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
                if (i11 == 1 || niVar.f31035p1 != null) {
                    i40 = (int) (fiVar4.getTranslationY() + i40);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i40;
                if (h10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                }
                if (h10 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    if (i13 + i40 < i12) {
                        float f18 = i39;
                        if (fiVar4 == niVar.f31020k0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (fiVar4 == niVar.f31014i0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (fiVar4 == niVar.f31017j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f12 = f18 - dp2;
                            dp11 -= (int) (m1Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                        }
                        f12 = f18 + dp;
                        dp11 -= (int) (m1Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f9 = dp11;
            } else {
                f9 = 0.0f;
            }
            canvas.clipRect(x4, f9, m1Var.getX() + m1Var.getWidth(), m1Var.getY() + m1Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof fz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.h.f17334k);
            dVar.draw(canvas);
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci ciVar = this.f27772w0;
        ciVar.f23737b = this;
        ciVar.c();
        ni niVar = this.f27773x0;
        niVar.A0.setAdjustPanLayoutHelper(ciVar);
        niVar.L0.setAdjustPanLayoutHelper(ciVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27772w0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f27773x0.f30994c0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f9;
        ni niVar = this.f27773x0;
        int[] iArr = niVar.X1;
        if (niVar.f31051u0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y8 = motionEvent.getY();
                bg.d1 d1Var = niVar.K0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ph phVar = niVar.f31002e1;
                if (phVar != null) {
                    i11 = AndroidUtilities.dp(phVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (d1Var != null) {
                    f9 = d1Var.getAlpha() * d1Var.getMeasuredHeight();
                } else {
                    f9 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f9));
                if (!niVar.f30994c0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y8 < dp2 && niVar.T0.getAlpha() == 0.0f) {
                    niVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f9;
        on onVar;
        on onVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        di diVar = this;
        ni niVar = diVar.f27773x0;
        boolean z11 = niVar.f30994c0;
        org.telegram.ui.ActionBar.w0 w0Var = niVar.W0;
        if (diVar.getLayoutParams().height > 0) {
            size = diVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            diVar.f27770u0 = true;
            i18 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
            diVar.setPadding(i18, 0, i19, 0);
            diVar.f27770u0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
        int i20 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            w0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                w0Var.setAdditionalYOffset(0);
            } else {
                w0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) niVar.f30991b1.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        diVar.f27770u0 = true;
        int min = (int) (i20 / Math.min(4.5f, niVar.f31059w1.h()));
        if (niVar.U1 != min) {
            niVar.U1 = min;
            AndroidUtilities.runOnUIThread(new ig(diVar, 21));
        }
        diVar.f27770u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        diVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
        wh whVar = niVar.L0;
        th thVar = niVar.A0;
        int i21 = size3 - (i13 * 2);
        if (!thVar.J && AndroidUtilities.dp(20.0f) >= 0 && !thVar.f26885e && !thVar.K) {
            diVar.f27770u0 = true;
            thVar.j();
            diVar.f27770u0 = false;
        }
        if (!whVar.J && AndroidUtilities.dp(20.0f) >= 0 && !whVar.f26885e && !whVar.K) {
            diVar.f27770u0 = true;
            whVar.j();
            diVar.f27770u0 = false;
        }
        if (niVar.f31014i0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            on onVar3 = niVar.f31014i0;
            if (!onVar3.C && !onVar3.W0 && !onVar3.f31403b1 && !onVar3.f31407d1) {
                diVar.f27770u0 = true;
                onVar3.a0();
                diVar.f27770u0 = false;
            }
        }
        if (niVar.f31017j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            on onVar4 = niVar.f31017j0;
            if (!onVar4.C && !onVar4.W0 && !onVar4.f31403b1 && !onVar4.f31407d1) {
                diVar.f27770u0 = true;
                onVar4.a0();
                diVar.f27770u0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) niVar).keyboardVisible;
            if (z10) {
                fi fiVar = niVar.f31051u0;
                on onVar5 = niVar.f31014i0;
                if (fiVar == onVar5 && onVar5.A != null && onVar5.f31407d1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    on onVar6 = niVar.f31017j0;
                    if (fiVar == onVar6 && onVar6.A != null && onVar6.f31407d1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = niVar.o1();
            }
            r0.m1 f10 = r0.j0.f(diVar);
            if (f10 != null) {
                i15 = f10.f46843a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.m1 f11 = r0.j0.f(diVar);
            if (f11 != null) {
                i16 = f11.f46843a.f(527).d;
            } else {
                i16 = 0;
            }
            Math.max(i16, o12);
            if (i15 > 0) {
                i17 = 0;
            } else {
                i17 = AndroidUtilities.navigationBarHeight;
            }
            int max = Math.max(i17, o12);
            diVar.f27770u0 = true;
            fi fiVar2 = niVar.f31051u0;
            if (fiVar2.f28406f) {
                fiVar2.f28405e = AndroidUtilities.dp(62.0f) + max;
                niVar.f31051u0.y(i21, size4);
            } else {
                fiVar2.f28405e = AndroidUtilities.navigationBarHeight;
                fiVar2.y(i21, size4 - o12);
            }
            fi fiVar3 = niVar.f31054v0;
            if (fiVar3 != null) {
                if (fiVar3.f28406f) {
                    fiVar3.f28405e = AndroidUtilities.dp(62.0f) + max;
                    niVar.f31054v0.y(i21, size4);
                } else {
                    fiVar3.f28405e = AndroidUtilities.navigationBarHeight;
                    fiVar3.y(i21, size4 - o12);
                }
            }
            diVar.f27770u0 = false;
        }
        int childCount = diVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = diVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == niVar.f31042r1) {
                i14 = i23;
                diVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof fi) {
                    fi fiVar4 = (fi) childAt;
                    if (fiVar4.h) {
                        i24 = 0;
                    }
                    if (fiVar4.f28406f) {
                        i25 = 0;
                    }
                }
                if (!thVar.l(childAt) && !whVar.l(childAt) && (((onVar = niVar.f31014i0) == null || childAt != onVar.A) && ((onVar2 = niVar.f31017j0) == null || childAt != onVar2.A))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i24 + i25);
                } else if (z11) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    if (AndroidUtilities.isTablet()) {
                        f9 = 200.0f;
                    } else {
                        f9 = 320.0f;
                    }
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f9), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), 1073741824));
                }
            }
            i22 = i14 + 1;
            diVar = this;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i10, i11, i12, i13);
        int i15 = 0;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            if (roundedCorner == null) {
                i14 = 0;
            } else {
                i14 = roundedCorner.getRadius();
            }
            if (roundedCorner2 != null) {
                i15 = roundedCorner2.getRadius();
            }
        } else {
            i14 = 0;
        }
        ng.d dVar = this.f27773x0.f31058w0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ni niVar = this.f27773x0;
        if (niVar.f31051u0.l(motionEvent)) {
            return true;
        }
        if (!niVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27770u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f9) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        ni niVar = this.f27773x0;
        ph phVar = niVar.f31049t1;
        float f10 = f9 + niVar.f31013h2;
        i10 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f27771v0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                niVar.f31051u0.setTranslationY(f10);
                if (niVar.M0 != 0 || niVar.P0) {
                    niVar.f31002e1.setTranslationY((niVar.l1 + f10) - niVar.f31013h2);
                }
                phVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                niVar.f31051u0.setTranslationY(0.0f);
                phVar.setTranslationY(((f10 / this.f27771v0) * phVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - niVar.f31013h2);
        i12 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i12 != 1) {
            niVar.f31051u0.k(niVar.f31013h2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
    }
}
