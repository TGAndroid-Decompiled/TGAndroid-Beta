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
public final class mi extends pv0 {
    public final li A0;
    public final wi B0;
    public int f26175w0;
    public final RectF f26176x0;
    public boolean f26177y0;
    public float f26178z0;

    public mi(wi wiVar, Context context) {
        super(context, null);
        this.B0 = wiVar;
        this.f26176x0 = new RectF();
        this.A0 = new li(this, this);
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
        oi oiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        wi wiVar = this.B0;
        fh.d dVar = wiVar.E2;
        fh.d dVar2 = wiVar.D2;
        if (Build.VERSION.SDK_INT >= 31 && wiVar.C2 != null) {
            wiVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        oi oiVar2 = wiVar.f29726y0;
        rm rmVar = wiVar.f29697q0;
        if ((oiVar2 == rmVar || (oiVar = wiVar.f29729z0) == rmVar || (oiVar2 == wiVar.f29677j0 && oiVar == null)) && oiVar2 != null) {
            canvas.save();
            float f15 = wiVar.f29684l2;
            boolean z10 = wiVar.f29668g0;
            ci.m6 m6Var = wiVar.O0;
            yh yhVar = wiVar.f29675i1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (oiVar2.getAlpha() * 255.0f);
            int h = oiVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (yhVar != null) {
                f7 = yhVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f7 * AndroidUtilities.dp(26.0f)));
            if (m6Var != null) {
                f10 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i27 = dp4 + ((int) f10);
            int p12 = wiVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
            int i28 = (p12 - i10) - i27;
            i11 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType;
            if (i11 == 1 || wiVar.f29709t1 != null) {
                i28 = (int) (oiVar2.getTranslationY() + i28);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i28;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (h == 2) {
                if (i28 < i12) {
                    float f17 = i12 - i28;
                    i26 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                } else {
                    f13 = 1.0f;
                }
                f11 = 0.0f;
            } else {
                float f18 = i27;
                f11 = 0.0f;
                if (oiVar2 == wiVar.f29691o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (oiVar2 == wiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (oiVar2 == wiVar.f29688n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = wiVar.X0.getAlpha();
                    int i29 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i28 -= i29;
                    dp5 -= i29;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = wiVar.X0.getAlpha();
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
            if (wiVar.f29726y0.f()) {
                q12 = wiVar.f29726y0.getCustomBackground();
            } else {
                q12 = wiVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.f3) wiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) wiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i28, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.f3) wiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f26176x0;
            if (h == 2) {
                org.telegram.ui.ActionBar.h6.f19076t0.setColor(q12);
                org.telegram.ui.ActionBar.h6.f19076t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i28);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && h != 2) || wiVar.f29726y0.e()) {
                Paint paint = org.telegram.ui.ActionBar.h6.f19076t0;
                if (wiVar.f29726y0.e()) {
                    q12 = wiVar.f29726y0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.h6.f19076t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i28);
            }
            if (wiVar.f29726y0.e()) {
                org.telegram.ui.ActionBar.h6.f19076t0.setColor(wiVar.f29726y0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.h6.f19076t0.setAlpha(alpha2);
                int p13 = wiVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i28) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.h6.f19076t0);
                canvas.restore();
            }
            if ((yhVar == null || yhVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (wiVar.f29726y0.e()) {
                    int customActionBarBackground = wiVar.f29726y0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (yhVar != null) {
                        alpha = yhVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                } else {
                    themedColor = wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    if (yhVar != null) {
                        alpha = yhVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.f19076t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.f19076t0.setAlpha((int) (oiVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19076t0);
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
        oi oiVar;
        int i30;
        wi wiVar = this.B0;
        boolean z11 = wiVar.f29668g0;
        ci.m6 m6Var = wiVar.O0;
        ch.d dVar = wiVar.A0;
        yh yhVar = wiVar.f29675i1;
        y7 y7Var = wiVar.X0;
        if ((view instanceof oi) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, wiVar.f29684l2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            oi oiVar2 = (oi) view;
            int h = oiVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (yhVar != null) {
                i14 = AndroidUtilities.dp(yhVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i31 = dp5 + i14;
            if (m6Var != null) {
                f13 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i32 = i31 + ((int) f13);
            if (oiVar2 == wiVar.f29726y0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int p12 = wiVar.p1(i15);
            i16 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
            int i33 = (p12 - i16) - i32;
            i17 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType;
            if (i17 == 1 || wiVar.f29709t1 != null) {
                i33 = (int) (view.getTranslationY() + i33);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i33;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
            int i34 = i18 + dp7;
            if (h == 0) {
                i19 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i35 = i19;
            if (h != 2) {
                i20 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i33 < i35) {
                    float f17 = i32;
                    if (oiVar2 == wiVar.f29691o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (oiVar2 == wiVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (oiVar2 == wiVar.f29688n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                        int i36 = (int) ((i35 - f15) * min);
                        i33 -= i36;
                        dp6 -= i36;
                        i34 += i36;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                    int i362 = (int) ((i35 - f15) * min2);
                    i33 -= i362;
                    dp6 -= i362;
                    i34 += i362;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i33 < i35) {
                i30 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
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
            if (wiVar.f29726y0.f()) {
                q12 = wiVar.f29726y0.getCustomBackground();
            } else {
                q12 = wiVar.q1(true);
            }
            oi oiVar3 = wiVar.f29726y0;
            rm rmVar = wiVar.f29697q0;
            if (oiVar3 != rmVar && (oiVar = wiVar.f29729z0) != rmVar && (oiVar3 != wiVar.f29677j0 || oiVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f26176x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.f3) wiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.f3) wiVar).shadowDrawable;
                drawable2.setBounds(0, i33, getMeasuredWidth(), i38);
                drawable3 = ((org.telegram.ui.ActionBar.f3) wiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.h6.f19076t0.setColor(q12);
                    org.telegram.ui.ActionBar.h6.f19076t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i33, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i33);
                }
            }
            if (view != wiVar.f29680k0 && view != wiVar.f29705s0 && view != wiVar.f29683l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f16 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.h6.f19076t0.setColor(q12);
                    org.telegram.ui.ActionBar.h6.f19076t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i33, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i33);
                }
                if ((yhVar == null || yhVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                        if (yhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - yhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f19076t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.h6.f19076t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19076t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == y7Var) {
            float alpha4 = y7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = y7Var.getX();
            oi oiVar4 = wiVar.f29726y0;
            if (oiVar4 != null) {
                int h10 = oiVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (yhVar != null) {
                    f10 = yhVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (m6Var != null) {
                    f11 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i39 = dp10 + ((int) f11);
                int p13 = wiVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                int i40 = (p13 - i10) - i39;
                i11 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType;
                if (i11 == 1 || wiVar.f29709t1 != null) {
                    i40 = (int) (oiVar4.getTranslationY() + i40);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i40;
                if (h10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (h10 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                    if (i13 + i40 < i12) {
                        float f18 = i39;
                        if (oiVar4 == wiVar.f29691o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (oiVar4 == wiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (oiVar4 == wiVar.f29688n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f12 = f18 - dp2;
                            dp11 -= (int) (y7Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                        }
                        f12 = f18 + dp;
                        dp11 -= (int) (y7Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp11;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, y7Var.getX() + y7Var.getWidth(), y7Var.getY() + y7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof lz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.f4280j.f4269k);
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
        li liVar = this.A0;
        liVar.f19443b = this;
        liVar.c();
        wi wiVar = this.B0;
        wiVar.E0.setAdjustPanLayoutHelper(liVar);
        wiVar.P0.setAdjustPanLayoutHelper(liVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f29668g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        wi wiVar = this.B0;
        int[] iArr = wiVar.f29653b2;
        if (wiVar.f29726y0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = wiVar.O0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                yh yhVar = wiVar.f29675i1;
                if (yhVar != null) {
                    i11 = AndroidUtilities.dp(yhVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (m6Var != null) {
                    f7 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!wiVar.f29668g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && wiVar.X0.getAlpha() == 0.0f) {
                    wiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        vn vnVar;
        vn vnVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        mi miVar = this;
        wi wiVar = miVar.B0;
        boolean z11 = wiVar.f29668g0;
        org.telegram.ui.ActionBar.v0 v0Var = wiVar.f29649a1;
        if (miVar.getLayoutParams().height > 0) {
            size = miVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            miVar.f26177y0 = true;
            i18 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
            miVar.setPadding(i18, 0, i19, 0);
            miVar.f26177y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
        int i20 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            v0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                v0Var.setAdditionalYOffset(0);
            } else {
                v0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) wiVar.f29666f1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        miVar.f26177y0 = true;
        int min = (int) (i20 / Math.min(4.5f, wiVar.A1.h()));
        if (wiVar.Y1 != min) {
            wiVar.Y1 = min;
            AndroidUtilities.runOnUIThread(new og(miVar, 21));
        }
        miVar.f26177y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        miVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) wiVar).backgroundPaddingLeft;
        ei eiVar = wiVar.P0;
        bi biVar = wiVar.E0;
        int i21 = size3 - (i13 * 2);
        if (!biVar.N && AndroidUtilities.dp(20.0f) >= 0 && !biVar.e && !biVar.O) {
            miVar.f26177y0 = true;
            biVar.j();
            miVar.f26177y0 = false;
        }
        if (!eiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !eiVar.e && !eiVar.O) {
            miVar.f26177y0 = true;
            eiVar.j();
            miVar.f26177y0 = false;
        }
        if (wiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            vn vnVar3 = wiVar.m0;
            if (!vnVar3.G && !vnVar3.f28776a1 && !vnVar3.f28786f1 && !vnVar3.f28790h1) {
                miVar.f26177y0 = true;
                vnVar3.a0();
                miVar.f26177y0 = false;
            }
        }
        if (wiVar.f29688n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            vn vnVar4 = wiVar.f29688n0;
            if (!vnVar4.G && !vnVar4.f28776a1 && !vnVar4.f28786f1 && !vnVar4.f28790h1) {
                miVar.f26177y0 = true;
                vnVar4.a0();
                miVar.f26177y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) wiVar).keyboardVisible;
            if (z10) {
                oi oiVar = wiVar.f29726y0;
                vn vnVar5 = wiVar.m0;
                if (oiVar == vnVar5 && vnVar5.E != null && vnVar5.f28790h1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    vn vnVar6 = wiVar.f29688n0;
                    if (oiVar == vnVar6 && vnVar6.E != null && vnVar6.f28790h1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = wiVar.o1();
            }
            r0.l1 f10 = r0.i0.f(miVar);
            if (f10 != null) {
                i15 = f10.f41807a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.l1 f11 = r0.i0.f(miVar);
            if (f11 != null) {
                i16 = f11.f41807a.f(527).d;
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
            miVar.f26177y0 = true;
            oi oiVar2 = wiVar.f29726y0;
            if (oiVar2.f26746f) {
                oiVar2.e = AndroidUtilities.dp(62.0f) + max;
                wiVar.f29726y0.y(i21, size4);
            } else {
                oiVar2.e = AndroidUtilities.navigationBarHeight;
                oiVar2.y(i21, size4 - o12);
            }
            oi oiVar3 = wiVar.f29729z0;
            if (oiVar3 != null) {
                if (oiVar3.f26746f) {
                    oiVar3.e = AndroidUtilities.dp(62.0f) + max;
                    wiVar.f29729z0.y(i21, size4);
                } else {
                    oiVar3.e = AndroidUtilities.navigationBarHeight;
                    oiVar3.y(i21, size4 - o12);
                }
            }
            miVar.f26177y0 = false;
        }
        int childCount = miVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = miVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == wiVar.f29715v1) {
                i14 = i23;
                miVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof oi) {
                    oi oiVar4 = (oi) childAt;
                    if (oiVar4.h) {
                        i24 = 0;
                    }
                    if (oiVar4.f26746f) {
                        i25 = 0;
                    }
                }
                if (!biVar.l(childAt) && !eiVar.l(childAt) && (((vnVar = wiVar.m0) == null || childAt != vnVar.E) && ((vnVar2 = wiVar.f29688n0) == null || childAt != vnVar2.E))) {
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
            miVar = this;
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
        ch.d dVar = this.B0.A0;
        if (dVar != null) {
            dVar.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.B0;
        if (wiVar.f29726y0.l(motionEvent)) {
            return true;
        }
        if (!wiVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f26177y0) {
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
        wi wiVar = this.B0;
        yh yhVar = wiVar.f29723x1;
        float f10 = f7 + wiVar.f29684l2;
        i10 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f26178z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                wiVar.f29726y0.setTranslationY(f10);
                if (wiVar.Q0 != 0 || wiVar.T0) {
                    wiVar.f29675i1.setTranslationY((wiVar.f29695p1 + f10) - wiVar.f29684l2);
                }
                yhVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                wiVar.f29726y0.setTranslationY(0.0f);
                yhVar.setTranslationY(((f10 / this.f26178z0) * yhVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - wiVar.f29684l2);
        i12 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType;
        if (i12 != 1) {
            wiVar.f29726y0.k(wiVar.f29684l2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
