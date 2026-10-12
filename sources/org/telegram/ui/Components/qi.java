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
public final class qi extends yw0 {
    public final pi A0;
    public final aj B0;
    public int f29840w0;
    public final RectF f29841x0;
    public boolean f29842y0;
    public float f29843z0;

    public qi(aj ajVar, Context context) {
        super(context, null);
        this.B0 = ajVar;
        this.f29841x0 = new RectF();
        this.A0 = new pi(this, this);
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
        si siVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        aj ajVar = this.B0;
        fh.d dVar = ajVar.H2;
        fh.d dVar2 = ajVar.G2;
        if (Build.VERSION.SDK_INT >= 31 && ajVar.F2 != null) {
            ajVar.b1();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        si siVar2 = ajVar.B0;
        jn jnVar = ajVar.f24374q0;
        if ((siVar2 == jnVar || (siVar = ajVar.C0) == jnVar || (siVar2 == ajVar.f24354j0 && siVar == null)) && siVar2 != null) {
            canvas.save();
            float f15 = ajVar.f24370o2;
            boolean z10 = ajVar.f24345g0;
            ci.m6 m6Var = ajVar.R0;
            ci ciVar = ajVar.l1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (siVar2.getAlpha() * 255.0f);
            int i27 = siVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (ciVar != null) {
                f7 = ciVar.getAlpha();
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
            int r12 = ajVar.r1(0);
            i10 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
            int i29 = (r12 - i10) - i28;
            i11 = ((org.telegram.ui.ActionBar.e3) ajVar).currentSheetAnimationType;
            if (i11 == 1 || ajVar.f24396w1 != null) {
                i29 = (int) (siVar2.getTranslationY() + i29);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i29;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (i27 == 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (i27 == 2) {
                if (i29 < i12) {
                    float f17 = i12 - i29;
                    i26 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f13 = 1.0f;
                }
            } else {
                float f18 = i28;
                f11 = 0.0f;
                if (siVar2 == ajVar.f24368o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (siVar2 == ajVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (siVar2 == ajVar.f24365n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = ajVar.f24325a1.getAlpha();
                    int i30 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i29 -= i30;
                    dp5 -= i30;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = ajVar.f24325a1.getAlpha();
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
            if (ajVar.B0.g()) {
                s12 = ajVar.B0.getCustomBackground();
            } else {
                s12 = ajVar.s1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.e3) ajVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.e3) ajVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
            drawable2.setBounds(0, i29, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.e3) ajVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f29841x0;
            if (i27 == 2) {
                org.telegram.ui.ActionBar.h6.f20850t0.setColor(s12);
                org.telegram.ui.ActionBar.h6.f20850t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i29, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i29);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && i27 != 2) || ajVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.h6.f20850t0;
                if (ajVar.B0.f()) {
                    s12 = ajVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(s12);
                org.telegram.ui.ActionBar.h6.f20850t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i29, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i29);
            }
            if (ajVar.B0.f()) {
                org.telegram.ui.ActionBar.h6.f20850t0.setColor(ajVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.h6.f20850t0.setAlpha(alpha2);
                int r13 = ajVar.r1(0);
                if (!z10) {
                    r13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i29) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + r13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.h6.f20850t0);
                canvas.restore();
            }
            if ((ciVar == null || ciVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (i27 == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (ajVar.B0.f()) {
                    int customActionBarBackground = ajVar.B0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (ciVar != null) {
                        alpha = ciVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                } else {
                    themedColor = ajVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    if (ciVar != null) {
                        alpha = ciVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.f20850t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.f20850t0.setAlpha((int) (siVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f20850t0);
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
        si siVar;
        int i30;
        aj ajVar = this.B0;
        boolean z11 = ajVar.f24345g0;
        ci.m6 m6Var = ajVar.R0;
        ch.d dVar = ajVar.D0;
        ci ciVar = ajVar.l1;
        a8 a8Var = ajVar.f24325a1;
        if ((view instanceof si) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, ajVar.f24370o2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            si siVar2 = (si) view;
            int i31 = siVar2.i();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (ciVar != null) {
                i14 = AndroidUtilities.dp(ciVar.getAlpha() * 26.0f);
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
            if (siVar2 == ajVar.B0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int r12 = ajVar.r1(i15);
            i16 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
            int i34 = (r12 - i16) - i33;
            i17 = ((org.telegram.ui.ActionBar.e3) ajVar).currentSheetAnimationType;
            if (i17 == 1 || ajVar.f24396w1 != null) {
                i34 = (int) (view.getTranslationY() + i34);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i34;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
            int i35 = i18 + dp7;
            if (i31 == 0) {
                i19 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i36 = i19;
            if (i31 != 2) {
                i20 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i34 < i36) {
                    float f17 = i33;
                    if (siVar2 == ajVar.f24368o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (siVar2 == ajVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (siVar2 == ajVar.f24365n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                        int i37 = (int) ((i36 - f15) * min);
                        i34 -= i37;
                        dp6 -= i37;
                        i35 += i37;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                    int i372 = (int) ((i36 - f15) * min2);
                    i34 -= i372;
                    dp6 -= i372;
                    i35 += i372;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i34 < i36) {
                i30 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
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
            if (ajVar.B0.g()) {
                s12 = ajVar.B0.getCustomBackground();
            } else {
                s12 = ajVar.s1(true);
            }
            si siVar3 = ajVar.B0;
            jn jnVar = ajVar.f24374q0;
            if (siVar3 != jnVar && (siVar = ajVar.C0) != jnVar && (siVar3 != ajVar.f24354j0 || siVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f29841x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.e3) ajVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.e3) ajVar).shadowDrawable;
                drawable2.setBounds(0, i34, getMeasuredWidth(), i39);
                drawable3 = ((org.telegram.ui.ActionBar.e3) ajVar).shadowDrawable;
                drawable3.draw(canvas);
                if (i31 == 2) {
                    org.telegram.ui.ActionBar.h6.f20850t0.setColor(s12);
                    org.telegram.ui.ActionBar.h6.f20850t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i34, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i34);
                }
            }
            if (view != ajVar.f24357k0 && view != ajVar.f24382s0 && view != ajVar.f24360l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f16 != 1.0f && i31 != 2) {
                    org.telegram.ui.ActionBar.h6.f20850t0.setColor(s12);
                    org.telegram.ui.ActionBar.h6.f20850t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i34, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i34);
                }
                if ((ciVar == null || ciVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (i31 == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = ajVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                        if (ciVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - ciVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f20850t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.h6.f20850t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f20850t0);
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
            si siVar4 = ajVar.B0;
            if (siVar4 != null) {
                int i40 = siVar4.i();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (ciVar != null) {
                    f10 = ciVar.getAlpha();
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
                int r13 = ajVar.r1(0);
                i10 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                int i42 = (r13 - i10) - i41;
                i11 = ((org.telegram.ui.ActionBar.e3) ajVar).currentSheetAnimationType;
                if (i11 == 1 || ajVar.f24396w1 != null) {
                    i42 = (int) (siVar4.getTranslationY() + i42);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i42;
                if (i40 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (i40 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                    if (i13 + i42 < i12) {
                        float f18 = i41;
                        if (siVar4 == ajVar.f24368o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (siVar4 == ajVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (siVar4 == ajVar.f24365n0) {
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
        } else if ((view instanceof d00) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.f4683j.f4671k);
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
        pi piVar = this.A0;
        piVar.f21183b = this;
        piVar.c();
        aj ajVar = this.B0;
        ajVar.H0.setAdjustPanLayoutHelper(piVar);
        ajVar.S0.setAdjustPanLayoutHelper(piVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f24345g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        aj ajVar = this.B0;
        int[] iArr = ajVar.f24340e2;
        if (ajVar.B0.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = ajVar.R0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ci ciVar = ajVar.l1;
                if (ciVar != null) {
                    i11 = AndroidUtilities.dp(ciVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (m6Var != null) {
                    f7 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!ajVar.f24345g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && ajVar.f24325a1.getAlpha() == 0.0f) {
                    ajVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        no noVar;
        no noVar2;
        boolean z10;
        int q12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        qi qiVar = this;
        aj ajVar = qiVar.B0;
        boolean z11 = ajVar.f24345g0;
        org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24335d1;
        if (qiVar.getLayoutParams().height > 0) {
            size = qiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            qiVar.f29842y0 = true;
            i18 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
            qiVar.setPadding(i18, 0, i19, 0);
            qiVar.f29842y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) ajVar.f24352i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        qiVar.f29842y0 = true;
        int min = (int) (i20 / Math.min(4.5f, ajVar.D1.h()));
        if (ajVar.f24329b2 != min) {
            ajVar.f24329b2 = min;
            AndroidUtilities.runOnUIThread(new tg(qiVar, 21));
        }
        qiVar.f29842y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        qiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.e3) ajVar).backgroundPaddingLeft;
        ii iiVar = ajVar.S0;
        fi fiVar = ajVar.H0;
        int i21 = size3 - (i13 * 2);
        if (!fiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !fiVar.f25026e && !fiVar.O) {
            qiVar.f29842y0 = true;
            fiVar.j();
            qiVar.f29842y0 = false;
        }
        if (!iiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !iiVar.f25026e && !iiVar.O) {
            qiVar.f29842y0 = true;
            iiVar.j();
            qiVar.f29842y0 = false;
        }
        if (ajVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            no noVar3 = ajVar.m0;
            if (!noVar3.G && !noVar3.f28874a1 && !noVar3.f28884f1 && !noVar3.f28888h1) {
                qiVar.f29842y0 = true;
                noVar3.d0();
                qiVar.f29842y0 = false;
            }
        }
        if (ajVar.f24365n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            no noVar4 = ajVar.f24365n0;
            if (!noVar4.G && !noVar4.f28874a1 && !noVar4.f28884f1 && !noVar4.f28888h1) {
                qiVar.f29842y0 = true;
                noVar4.d0();
                qiVar.f29842y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.e3) ajVar).keyboardVisible;
            if (z10) {
                si siVar = ajVar.B0;
                no noVar5 = ajVar.m0;
                if (siVar == noVar5 && noVar5.E != null && noVar5.f28888h1) {
                    q12 = AndroidUtilities.dp(120.0f);
                } else {
                    no noVar6 = ajVar.f24365n0;
                    if (siVar == noVar6 && noVar6.E != null && noVar6.f28888h1) {
                        q12 = AndroidUtilities.dp(120.0f);
                    } else {
                        q12 = 0;
                    }
                }
            } else {
                q12 = ajVar.q1();
            }
            WeakHashMap weakHashMap = r0.i0.f46981a;
            r0.k1 a2 = r0.b0.a(qiVar);
            if (a2 != null) {
                i15 = a2.f46992a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.k1 a10 = r0.b0.a(qiVar);
            if (a10 != null) {
                i16 = a10.f46992a.f(527).d;
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
            qiVar.f29842y0 = true;
            si siVar2 = ajVar.B0;
            if (siVar2.f30577f) {
                siVar2.f30576e = AndroidUtilities.dp(62.0f) + max;
                ajVar.B0.B(i21, size4);
            } else {
                siVar2.f30576e = AndroidUtilities.navigationBarHeight;
                siVar2.B(i21, size4 - q12);
            }
            si siVar3 = ajVar.C0;
            if (siVar3 != null) {
                if (siVar3.f30577f) {
                    siVar3.f30576e = AndroidUtilities.dp(62.0f) + max;
                    ajVar.C0.B(i21, size4);
                } else {
                    siVar3.f30576e = AndroidUtilities.navigationBarHeight;
                    siVar3.B(i21, size4 - q12);
                }
            }
            qiVar.f29842y0 = false;
        }
        int childCount = qiVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = qiVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == ajVar.f24404y1) {
                i14 = i23;
                qiVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof si) {
                    si siVar4 = (si) childAt;
                    if (siVar4.h) {
                        i24 = 0;
                    }
                    if (siVar4.f30577f) {
                        i25 = 0;
                    }
                }
                if (!fiVar.l(childAt) && !iiVar.l(childAt) && (((noVar = ajVar.m0) == null || childAt != noVar.E) && ((noVar2 = ajVar.f24365n0) == null || childAt != noVar2.E))) {
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
            qiVar = this;
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
        aj ajVar = this.B0;
        if (ajVar.B0.o(motionEvent)) {
            return true;
        }
        if (!ajVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29842y0) {
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
        aj ajVar = this.B0;
        ci ciVar = ajVar.A1;
        float f10 = f7 + ajVar.f24370o2;
        i10 = ((org.telegram.ui.ActionBar.e3) ajVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f29843z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.e3) ajVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                ajVar.B0.setTranslationY(f10);
                if (ajVar.T0 != 0 || ajVar.W0) {
                    ajVar.l1.setTranslationY((ajVar.f24383s1 + f10) - ajVar.f24370o2);
                }
                ciVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                ajVar.B0.setTranslationY(0.0f);
                ciVar.setTranslationY(((f10 / this.f29843z0) * ciVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - ajVar.f24370o2) + ajVar.f24403y0);
        i12 = ((org.telegram.ui.ActionBar.e3) ajVar).currentSheetAnimationType;
        if (i12 != 1) {
            ajVar.B0.l(ajVar.f24370o2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
