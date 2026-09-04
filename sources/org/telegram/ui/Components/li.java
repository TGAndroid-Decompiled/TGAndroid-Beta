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
public final class li extends ov0 {
    public final ki A0;
    public final vi B0;
    public int f28175w0;
    public final RectF f28176x0;
    public boolean f28177y0;
    public float f28178z0;

    public li(vi viVar, Context context) {
        super(context, null);
        this.B0 = viVar;
        this.f28176x0 = new RectF();
        this.A0 = new ki(this, this);
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
        ni niVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        vi viVar = this.B0;
        gh.d dVar = viVar.E2;
        gh.d dVar2 = viVar.D2;
        if (Build.VERSION.SDK_INT >= 31 && viVar.C2 != null) {
            viVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        ni niVar2 = viVar.f31340y0;
        qm qmVar = viVar.f31311q0;
        if ((niVar2 == qmVar || (niVar = viVar.f31343z0) == qmVar || (niVar2 == viVar.f31291j0 && niVar == null)) && niVar2 != null) {
            canvas.save();
            float f15 = viVar.f31298l2;
            boolean z10 = viVar.f31282g0;
            ah.w wVar = viVar.O0;
            xh xhVar = viVar.f31289i1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (niVar2.getAlpha() * 255.0f);
            int h = niVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (xhVar != null) {
                f7 = xhVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f7 * AndroidUtilities.dp(26.0f)));
            if (wVar != null) {
                f10 = wVar.getAlpha() * wVar.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i27 = dp4 + ((int) f10);
            int p12 = viVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
            int i28 = (p12 - i10) - i27;
            i11 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType;
            if (i11 == 1 || viVar.f31323t1 != null) {
                i28 = (int) (niVar2.getTranslationY() + i28);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i28;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (h == 2) {
                if (i28 < i12) {
                    float f17 = i12 - i28;
                    i26 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                } else {
                    f13 = 1.0f;
                }
                f11 = 0.0f;
            } else {
                float f18 = i27;
                f11 = 0.0f;
                if (niVar2 == viVar.f31305o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (niVar2 == viVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (niVar2 == viVar.f31302n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = viVar.X0.getAlpha();
                    int i29 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i28 -= i29;
                    dp5 -= i29;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = viVar.X0.getAlpha();
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
            if (viVar.f31340y0.f()) {
                q12 = viVar.f31340y0.getCustomBackground();
            } else {
                q12 = viVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.f3) viVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) viVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
            drawable2.setBounds(0, i28, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.f3) viVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f28176x0;
            if (h == 2) {
                org.telegram.ui.ActionBar.j6.f20948t0.setColor(q12);
                org.telegram.ui.ActionBar.j6.f20948t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i28);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && h != 2) || viVar.f31340y0.e()) {
                Paint paint = org.telegram.ui.ActionBar.j6.f20948t0;
                if (viVar.f31340y0.e()) {
                    q12 = viVar.f31340y0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.j6.f20948t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i28);
            }
            if (viVar.f31340y0.e()) {
                org.telegram.ui.ActionBar.j6.f20948t0.setColor(viVar.f31340y0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.j6.f20948t0.setAlpha(alpha2);
                int p13 = viVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i28) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.j6.f20948t0);
                canvas.restore();
            }
            if ((xhVar == null || xhVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (viVar.f31340y0.e()) {
                    int customActionBarBackground = viVar.f31340y0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (xhVar != null) {
                        alpha = xhVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                } else {
                    themedColor = viVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    if (xhVar != null) {
                        alpha = xhVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.j6.f20948t0.setColor(themedColor);
                org.telegram.ui.ActionBar.j6.f20948t0.setAlpha((int) (niVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20948t0);
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
        ni niVar;
        int i30;
        vi viVar = this.B0;
        boolean z11 = viVar.f31282g0;
        ah.w wVar = viVar.O0;
        dh.d dVar = viVar.A0;
        xh xhVar = viVar.f31289i1;
        z7 z7Var = viVar.X0;
        if ((view instanceof ni) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, viVar.f31298l2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            ni niVar2 = (ni) view;
            int h = niVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (xhVar != null) {
                i14 = AndroidUtilities.dp(xhVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i31 = dp5 + i14;
            if (wVar != null) {
                f13 = wVar.getAlpha() * wVar.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i32 = i31 + ((int) f13);
            if (niVar2 == viVar.f31340y0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int p12 = viVar.p1(i15);
            i16 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
            int i33 = (p12 - i16) - i32;
            i17 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType;
            if (i17 == 1 || viVar.f31323t1 != null) {
                i33 = (int) (view.getTranslationY() + i33);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i33;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
            int i34 = i18 + dp7;
            if (h == 0) {
                i19 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i35 = i19;
            if (h != 2) {
                i20 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i33 < i35) {
                    float f17 = i32;
                    if (niVar2 == viVar.f31305o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (niVar2 == viVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (niVar2 == viVar.f31302n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                        int i36 = (int) ((i35 - f15) * min);
                        i33 -= i36;
                        dp6 -= i36;
                        i34 += i36;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                    int i362 = (int) ((i35 - f15) * min2);
                    i33 -= i362;
                    dp6 -= i362;
                    i34 += i362;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i33 < i35) {
                i30 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
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
            if (viVar.f31340y0.f()) {
                q12 = viVar.f31340y0.getCustomBackground();
            } else {
                q12 = viVar.q1(true);
            }
            ni niVar3 = viVar.f31340y0;
            qm qmVar = viVar.f31311q0;
            if (niVar3 != qmVar && (niVar = viVar.f31343z0) != qmVar && (niVar3 != viVar.f31291j0 || niVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f28176x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.f3) viVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.f3) viVar).shadowDrawable;
                drawable2.setBounds(0, i33, getMeasuredWidth(), i38);
                drawable3 = ((org.telegram.ui.ActionBar.f3) viVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.j6.f20948t0.setColor(q12);
                    org.telegram.ui.ActionBar.j6.f20948t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i33, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i33);
                }
            }
            if (view != viVar.f31294k0 && view != viVar.f31319s0 && view != viVar.f31297l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f16 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.j6.f20948t0.setColor(q12);
                    org.telegram.ui.ActionBar.j6.f20948t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i33, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i33);
                }
                if ((xhVar == null || xhVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = viVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                        if (xhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - xhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f20948t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.j6.f20948t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20948t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == z7Var) {
            float alpha4 = z7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = z7Var.getX();
            ni niVar4 = viVar.f31340y0;
            if (niVar4 != null) {
                int h10 = niVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (xhVar != null) {
                    f10 = xhVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (wVar != null) {
                    f11 = wVar.getAlpha() * wVar.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i39 = dp10 + ((int) f11);
                int p13 = viVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                int i40 = (p13 - i10) - i39;
                i11 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType;
                if (i11 == 1 || viVar.f31323t1 != null) {
                    i40 = (int) (niVar4.getTranslationY() + i40);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i40;
                if (h10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (h10 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                    if (i13 + i40 < i12) {
                        float f18 = i39;
                        if (niVar4 == viVar.f31305o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (niVar4 == viVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (niVar4 == viVar.f31302n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f12 = f18 - dp2;
                            dp11 -= (int) (z7Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                        }
                        f12 = f18 + dp;
                        dp11 -= (int) (z7Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp11;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, z7Var.getX() + z7Var.getWidth(), z7Var.getY() + z7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof kz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.h.f6826k);
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
        ki kiVar = this.A0;
        kiVar.f21277b = this;
        kiVar.c();
        vi viVar = this.B0;
        viVar.E0.setAdjustPanLayoutHelper(kiVar);
        viVar.P0.setAdjustPanLayoutHelper(kiVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f31282g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        vi viVar = this.B0;
        int[] iArr = viVar.f31266b2;
        if (viVar.f31340y0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ah.w wVar = viVar.O0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                xh xhVar = viVar.f31289i1;
                if (xhVar != null) {
                    i11 = AndroidUtilities.dp(xhVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (wVar != null) {
                    f7 = wVar.getAlpha() * wVar.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!viVar.f31282g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && viVar.X0.getAlpha() == 0.0f) {
                    viVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        tn tnVar;
        tn tnVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        li liVar = this;
        vi viVar = liVar.B0;
        boolean z11 = viVar.f31282g0;
        org.telegram.ui.ActionBar.v0 v0Var = viVar.f31262a1;
        if (liVar.getLayoutParams().height > 0) {
            size = liVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            liVar.f28177y0 = true;
            i18 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
            liVar.setPadding(i18, 0, i19, 0);
            liVar.f28177y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) viVar.f31280f1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        liVar.f28177y0 = true;
        int min = (int) (i20 / Math.min(4.5f, viVar.A1.h()));
        if (viVar.Y1 != min) {
            viVar.Y1 = min;
            AndroidUtilities.runOnUIThread(new pg(liVar, 21));
        }
        liVar.f28177y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        liVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) viVar).backgroundPaddingLeft;
        di diVar = viVar.P0;
        ai aiVar = viVar.E0;
        int i21 = size3 - (i13 * 2);
        if (!aiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !aiVar.f26850e && !aiVar.O) {
            liVar.f28177y0 = true;
            aiVar.j();
            liVar.f28177y0 = false;
        }
        if (!diVar.N && AndroidUtilities.dp(20.0f) >= 0 && !diVar.f26850e && !diVar.O) {
            liVar.f28177y0 = true;
            diVar.j();
            liVar.f28177y0 = false;
        }
        if (viVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            tn tnVar3 = viVar.m0;
            if (!tnVar3.G && !tnVar3.f30625a1 && !tnVar3.f30635f1 && !tnVar3.f30639h1) {
                liVar.f28177y0 = true;
                tnVar3.a0();
                liVar.f28177y0 = false;
            }
        }
        if (viVar.f31302n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            tn tnVar4 = viVar.f31302n0;
            if (!tnVar4.G && !tnVar4.f30625a1 && !tnVar4.f30635f1 && !tnVar4.f30639h1) {
                liVar.f28177y0 = true;
                tnVar4.a0();
                liVar.f28177y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) viVar).keyboardVisible;
            if (z10) {
                ni niVar = viVar.f31340y0;
                tn tnVar5 = viVar.m0;
                if (niVar == tnVar5 && tnVar5.E != null && tnVar5.f30639h1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    tn tnVar6 = viVar.f31302n0;
                    if (niVar == tnVar6 && tnVar6.E != null && tnVar6.f30639h1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = viVar.o1();
            }
            r0.l1 f10 = r0.i0.f(liVar);
            if (f10 != null) {
                i15 = f10.f44711a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.l1 f11 = r0.i0.f(liVar);
            if (f11 != null) {
                i16 = f11.f44711a.f(527).d;
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
            liVar.f28177y0 = true;
            ni niVar2 = viVar.f31340y0;
            if (niVar2.f28756f) {
                niVar2.f28755e = AndroidUtilities.dp(62.0f) + max;
                viVar.f31340y0.y(i21, size4);
            } else {
                niVar2.f28755e = AndroidUtilities.navigationBarHeight;
                niVar2.y(i21, size4 - o12);
            }
            ni niVar3 = viVar.f31343z0;
            if (niVar3 != null) {
                if (niVar3.f28756f) {
                    niVar3.f28755e = AndroidUtilities.dp(62.0f) + max;
                    viVar.f31343z0.y(i21, size4);
                } else {
                    niVar3.f28755e = AndroidUtilities.navigationBarHeight;
                    niVar3.y(i21, size4 - o12);
                }
            }
            liVar.f28177y0 = false;
        }
        int childCount = liVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = liVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == viVar.f31329v1) {
                i14 = i23;
                liVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof ni) {
                    ni niVar4 = (ni) childAt;
                    if (niVar4.h) {
                        i24 = 0;
                    }
                    if (niVar4.f28756f) {
                        i25 = 0;
                    }
                }
                if (!aiVar.l(childAt) && !diVar.l(childAt) && (((tnVar = viVar.m0) == null || childAt != tnVar.E) && ((tnVar2 = viVar.f31302n0) == null || childAt != tnVar2.E))) {
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
            liVar = this;
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
        dh.d dVar = this.B0.A0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.B0;
        if (viVar.f31340y0.l(motionEvent)) {
            return true;
        }
        if (!viVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28177y0) {
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
        vi viVar = this.B0;
        xh xhVar = viVar.f31337x1;
        float f10 = f7 + viVar.f31298l2;
        i10 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f28178z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                viVar.f31340y0.setTranslationY(f10);
                if (viVar.Q0 != 0 || viVar.T0) {
                    viVar.f31289i1.setTranslationY((viVar.f31309p1 + f10) - viVar.f31298l2);
                }
                xhVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                viVar.f31340y0.setTranslationY(0.0f);
                xhVar.setTranslationY(((f10 / this.f28178z0) * xhVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - viVar.f31298l2);
        i12 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType;
        if (i12 != 1) {
            viVar.f31340y0.k(viVar.f31298l2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
