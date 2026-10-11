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
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class oi extends uw0 {
    public final ni A0;
    public final yi B0;
    public int f29407w0;
    public final RectF f29408x0;
    public boolean f29409y0;
    public float f29410z0;

    public oi(yi yiVar, Context context) {
        super(context, null);
        this.B0 = yiVar;
        this.f29408x0 = new RectF();
        this.A0 = new ni(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        int dp;
        int dp2;
        float f12;
        float f13;
        int s12;
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
        qi qiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        yi yiVar = this.B0;
        fh.d dVar = yiVar.H2;
        fh.d dVar2 = yiVar.G2;
        if (Build.VERSION.SDK_INT >= 31 && yiVar.F2 != null) {
            yiVar.b1();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        qi qiVar2 = yiVar.B0;
        hn hnVar = yiVar.f33248q0;
        if ((qiVar2 == hnVar || (qiVar = yiVar.C0) == hnVar || (qiVar2 == yiVar.f33228j0 && qiVar == null)) && qiVar2 != null) {
            canvas.save();
            float f15 = yiVar.f33244o2;
            boolean z10 = yiVar.f33219g0;
            ci.m6 m6Var = yiVar.R0;
            ai aiVar = yiVar.l1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (qiVar2.getAlpha() * 255.0f);
            int i27 = qiVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (aiVar != null) {
                f7 = aiVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f7 * AndroidUtilities.dp(26.0f)));
            if (m6Var != null) {
                f10 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i28 = dp4 + ((int) f10);
            int r12 = yiVar.r1(0);
            i10 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
            int i29 = (r12 - i10) - i28;
            i11 = ((org.telegram.ui.ActionBar.e3) yiVar).currentSheetAnimationType;
            if (i11 == 1 || yiVar.f33270w1 != null) {
                i29 = (int) (qiVar2.getTranslationY() + i29);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i29;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (i27 == 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (i27 == 2) {
                if (i29 < i12) {
                    float f17 = i12 - i29;
                    i26 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f13 = 1.0f;
                }
            } else {
                float f18 = i28;
                f11 = 0.0f;
                if (qiVar2 == yiVar.f33242o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (qiVar2 == yiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (qiVar2 == yiVar.f33239n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = yiVar.f33199a1.getAlpha();
                    int i30 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i29 -= i30;
                    dp5 -= i30;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = yiVar.f33199a1.getAlpha();
                int i302 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha32);
                i29 -= i302;
                dp5 -= i302;
                f13 = 1.0f - alpha32;
            }
            if (!z10) {
                int i31 = AndroidUtilities.statusBarHeight;
                i29 += i31;
                dp5 += i31;
            }
            if (yiVar.B0.g()) {
                s12 = yiVar.B0.getCustomBackground();
            } else {
                s12 = yiVar.s1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.e3) yiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.e3) yiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i29, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.e3) yiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f29408x0;
            if (i27 == 2) {
                org.telegram.ui.ActionBar.h6.f21076t0.setColor(s12);
                org.telegram.ui.ActionBar.h6.f21076t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i29, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i29);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && i27 != 2) || yiVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.h6.f21076t0;
                if (yiVar.B0.f()) {
                    s12 = yiVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(s12);
                org.telegram.ui.ActionBar.h6.f21076t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i29, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i29);
            }
            if (yiVar.B0.f()) {
                org.telegram.ui.ActionBar.h6.f21076t0.setColor(yiVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.h6.f21076t0.setAlpha(alpha2);
                int r13 = yiVar.r1(0);
                if (!z10) {
                    r13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i29) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + r13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.h6.f21076t0);
                canvas.restore();
            }
            if ((aiVar == null || aiVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (i27 == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (yiVar.B0.f()) {
                    int customActionBarBackground = yiVar.B0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (aiVar != null) {
                        alpha = aiVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                } else {
                    themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    if (aiVar != null) {
                        alpha = aiVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.f21076t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.f21076t0.setAlpha((int) (qiVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21076t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
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
        int s12;
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
        qi qiVar;
        int i30;
        yi yiVar = this.B0;
        boolean z11 = yiVar.f33219g0;
        ci.m6 m6Var = yiVar.R0;
        ch.d dVar = yiVar.D0;
        ai aiVar = yiVar.l1;
        a8 a8Var = yiVar.f33199a1;
        if ((view instanceof qi) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, yiVar.f33244o2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            qi qiVar2 = (qi) view;
            int i31 = qiVar2.i();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (aiVar != null) {
                i14 = AndroidUtilities.dp(aiVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i32 = dp5 + i14;
            if (m6Var != null) {
                f13 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i33 = i32 + ((int) f13);
            if (qiVar2 == yiVar.B0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int r12 = yiVar.r1(i15);
            i16 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
            int i34 = (r12 - i16) - i33;
            i17 = ((org.telegram.ui.ActionBar.e3) yiVar).currentSheetAnimationType;
            if (i17 == 1 || yiVar.f33270w1 != null) {
                i34 = (int) (view.getTranslationY() + i34);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i34;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
            int i35 = i18 + dp7;
            if (i31 == 0) {
                i19 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i36 = i19;
            if (i31 != 2) {
                i20 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i34 < i36) {
                    float f17 = i33;
                    if (qiVar2 == yiVar.f33242o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (qiVar2 == yiVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (qiVar2 == yiVar.f33239n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                        int i37 = (int) ((i36 - f15) * min);
                        i34 -= i37;
                        dp6 -= i37;
                        i35 += i37;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                    int i372 = (int) ((i36 - f15) * min2);
                    i34 -= i372;
                    dp6 -= i372;
                    i35 += i372;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i34 < i36) {
                i30 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                f16 = Math.max(0.0f, 1.0f - ((i36 - i34) / i30));
                f14 = 0.0f;
            } else {
                f14 = 0.0f;
                f16 = 1.0f;
            }
            if (!z11) {
                int i38 = AndroidUtilities.statusBarHeight;
                i34 += i38;
                dp6 += i38;
                i35 -= i38;
            }
            int i39 = i35;
            if (yiVar.B0.g()) {
                s12 = yiVar.B0.getCustomBackground();
            } else {
                s12 = yiVar.s1(true);
            }
            qi qiVar3 = yiVar.B0;
            hn hnVar = yiVar.f33248q0;
            if (qiVar3 != hnVar && (qiVar = yiVar.C0) != hnVar && (qiVar3 != yiVar.f33228j0 || qiVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f29408x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.e3) yiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.e3) yiVar).shadowDrawable;
                drawable2.setBounds(0, i34, getMeasuredWidth(), i39);
                drawable3 = ((org.telegram.ui.ActionBar.e3) yiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (i31 == 2) {
                    org.telegram.ui.ActionBar.h6.f21076t0.setColor(s12);
                    org.telegram.ui.ActionBar.h6.f21076t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i34, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i34);
                }
            }
            if (view != yiVar.f33231k0 && view != yiVar.f33256s0 && view != yiVar.f33234l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f16 != 1.0f && i31 != 2) {
                    org.telegram.ui.ActionBar.h6.f21076t0.setColor(s12);
                    org.telegram.ui.ActionBar.h6.f21076t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i34, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i34);
                }
                if ((aiVar == null || aiVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (i31 == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                        if (aiVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - aiVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f21076t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.h6.f21076t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21076t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == a8Var) {
            float alpha4 = a8Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = a8Var.getX();
            qi qiVar4 = yiVar.B0;
            if (qiVar4 != null) {
                int i40 = qiVar4.i();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (aiVar != null) {
                    f10 = aiVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (m6Var != null) {
                    f11 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i41 = dp10 + ((int) f11);
                int r13 = yiVar.r1(0);
                i10 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                int i42 = (r13 - i10) - i41;
                i11 = ((org.telegram.ui.ActionBar.e3) yiVar).currentSheetAnimationType;
                if (i11 == 1 || yiVar.f33270w1 != null) {
                    i42 = (int) (qiVar4.getTranslationY() + i42);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i42;
                if (i40 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (i40 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                    if (i13 + i42 < i12) {
                        float f18 = i41;
                        if (qiVar4 == yiVar.f33242o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (qiVar4 == yiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (qiVar4 == yiVar.f33239n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f12 = f18 - dp2;
                            dp11 -= (int) (a8Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                        }
                        f12 = f18 + dp;
                        dp11 -= (int) (a8Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp11;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, a8Var.getX() + a8Var.getWidth(), a8Var.getY() + a8Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof b00) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.f4684j.f4672k);
            dVar.draw(canvas);
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        } else {
            return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ni niVar = this.A0;
        niVar.f21409b = this;
        niVar.c();
        yi yiVar = this.B0;
        yiVar.H0.setAdjustPanLayoutHelper(niVar);
        yiVar.S0.setAdjustPanLayoutHelper(niVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f33219g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        yi yiVar = this.B0;
        int[] iArr = yiVar.f33214e2;
        if (yiVar.B0.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = yiVar.R0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ai aiVar = yiVar.l1;
                if (aiVar != null) {
                    i11 = AndroidUtilities.dp(aiVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (m6Var != null) {
                    f7 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!yiVar.f33219g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && yiVar.f33199a1.getAlpha() == 0.0f) {
                    yiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        lo loVar;
        lo loVar2;
        boolean z10;
        int q12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        oi oiVar = this;
        yi yiVar = oiVar.B0;
        boolean z11 = yiVar.f33219g0;
        org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33209d1;
        if (oiVar.getLayoutParams().height > 0) {
            size = oiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            oiVar.f29409y0 = true;
            i18 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
            oiVar.setPadding(i18, 0, i19, 0);
            oiVar.f29409y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
        int i20 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            u0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                u0Var.setAdditionalYOffset(0);
            } else {
                u0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) yiVar.f33226i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        oiVar.f29409y0 = true;
        int min = (int) (i20 / Math.min(4.5f, yiVar.D1.h()));
        if (yiVar.f33203b2 != min) {
            yiVar.f33203b2 = min;
            AndroidUtilities.runOnUIThread(new rg(oiVar, 21));
        }
        oiVar.f29409y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        oiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.e3) yiVar).backgroundPaddingLeft;
        gi giVar = yiVar.S0;
        di diVar = yiVar.H0;
        int i21 = size3 - (i13 * 2);
        if (!diVar.N && AndroidUtilities.dp(20.0f) >= 0 && !diVar.f24592e && !diVar.O) {
            oiVar.f29409y0 = true;
            diVar.j();
            oiVar.f29409y0 = false;
        }
        if (!giVar.N && AndroidUtilities.dp(20.0f) >= 0 && !giVar.f24592e && !giVar.O) {
            oiVar.f29409y0 = true;
            giVar.j();
            oiVar.f29409y0 = false;
        }
        if (yiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            lo loVar3 = yiVar.m0;
            if (!loVar3.G && !loVar3.f28374a1 && !loVar3.f28384f1 && !loVar3.f28388h1) {
                oiVar.f29409y0 = true;
                loVar3.d0();
                oiVar.f29409y0 = false;
            }
        }
        if (yiVar.f33239n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            lo loVar4 = yiVar.f33239n0;
            if (!loVar4.G && !loVar4.f28374a1 && !loVar4.f28384f1 && !loVar4.f28388h1) {
                oiVar.f29409y0 = true;
                loVar4.d0();
                oiVar.f29409y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.e3) yiVar).keyboardVisible;
            if (z10) {
                qi qiVar = yiVar.B0;
                lo loVar5 = yiVar.m0;
                if (qiVar == loVar5 && loVar5.E != null && loVar5.f28388h1) {
                    q12 = AndroidUtilities.dp(120.0f);
                } else {
                    lo loVar6 = yiVar.f33239n0;
                    if (qiVar == loVar6 && loVar6.E != null && loVar6.f28388h1) {
                        q12 = AndroidUtilities.dp(120.0f);
                    } else {
                        q12 = 0;
                    }
                }
            } else {
                q12 = yiVar.q1();
            }
            WeakHashMap weakHashMap = r0.i0.f46856a;
            r0.k1 a2 = r0.b0.a(oiVar);
            if (a2 != null) {
                i15 = a2.f46867a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.k1 a10 = r0.b0.a(oiVar);
            if (a10 != null) {
                i16 = a10.f46867a.f(527).d;
            } else {
                i16 = 0;
            }
            Math.max(i16, q12);
            if (i15 > 0) {
                i17 = 0;
            } else {
                i17 = AndroidUtilities.navigationBarHeight;
            }
            int max = Math.max(i17, q12);
            oiVar.f29409y0 = true;
            qi qiVar2 = yiVar.B0;
            if (qiVar2.f30164f) {
                qiVar2.f30163e = AndroidUtilities.dp(62.0f) + max;
                yiVar.B0.C(i21, size4);
            } else {
                qiVar2.f30163e = AndroidUtilities.navigationBarHeight;
                qiVar2.C(i21, size4 - q12);
            }
            qi qiVar3 = yiVar.C0;
            if (qiVar3 != null) {
                if (qiVar3.f30164f) {
                    qiVar3.f30163e = AndroidUtilities.dp(62.0f) + max;
                    yiVar.C0.C(i21, size4);
                } else {
                    qiVar3.f30163e = AndroidUtilities.navigationBarHeight;
                    qiVar3.C(i21, size4 - q12);
                }
            }
            oiVar.f29409y0 = false;
        }
        int childCount = oiVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = oiVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == yiVar.f33278y1) {
                i14 = i23;
                oiVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof qi) {
                    qi qiVar4 = (qi) childAt;
                    if (qiVar4.h) {
                        i24 = 0;
                    }
                    if (qiVar4.f30164f) {
                        i25 = 0;
                    }
                }
                if (!diVar.l(childAt) && !giVar.l(childAt) && (((loVar = yiVar.m0) == null || childAt != loVar.E) && ((loVar2 = yiVar.f33239n0) == null || childAt != loVar2.E))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i24 + i25);
                } else if (z11) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    if (AndroidUtilities.isTablet()) {
                        f7 = 200.0f;
                    } else {
                        f7 = 320.0f;
                    }
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), 1073741824));
                }
            }
            i22 = i14 + 1;
            oiVar = this;
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
        ch.d dVar = this.B0.D0;
        if (dVar != null) {
            dVar.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.B0;
        if (yiVar.B0.o(motionEvent)) {
            return true;
        }
        if (!yiVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29409y0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        yi yiVar = this.B0;
        ai aiVar = yiVar.A1;
        float f10 = f7 + yiVar.f33244o2;
        i10 = ((org.telegram.ui.ActionBar.e3) yiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f29410z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.e3) yiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                yiVar.B0.setTranslationY(f10);
                if (yiVar.T0 != 0 || yiVar.W0) {
                    yiVar.l1.setTranslationY((yiVar.f33257s1 + f10) - yiVar.f33244o2);
                }
                aiVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                yiVar.B0.setTranslationY(0.0f);
                aiVar.setTranslationY(((f10 / this.f29410z0) * aiVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - yiVar.f33244o2) + yiVar.f33277y0);
        i12 = ((org.telegram.ui.ActionBar.e3) yiVar).currentSheetAnimationType;
        if (i12 != 1) {
            yiVar.B0.l(yiVar.f33244o2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
