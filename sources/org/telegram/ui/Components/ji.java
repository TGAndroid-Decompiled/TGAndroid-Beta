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
public final class ji extends jw0 {
    public final ii A0;
    public final ti B0;
    public int f27537w0;
    public final RectF f27538x0;
    public boolean f27539y0;
    public float f27540z0;

    public ji(ti tiVar, Context context) {
        super(context, null);
        this.B0 = tiVar;
        this.f27538x0 = new RectF();
        this.A0 = new ii(this, this);
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
        float f15;
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
        li liVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ti tiVar = this.B0;
        gh.d dVar = tiVar.H2;
        gh.d dVar2 = tiVar.G2;
        if (Build.VERSION.SDK_INT >= 31 && tiVar.F2 != null) {
            tiVar.b1();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        li liVar2 = tiVar.B0;
        bn bnVar = tiVar.f30613q0;
        if ((liVar2 == bnVar || (liVar = tiVar.C0) == bnVar || (liVar2 == tiVar.f30593j0 && liVar == null)) && liVar2 != null) {
            canvas.save();
            float f16 = tiVar.f30609o2;
            boolean z10 = tiVar.f30584g0;
            ah.v vVar = tiVar.R0;
            wh whVar = tiVar.l1;
            canvas.translate(0.0f, f16);
            int alpha2 = (int) (liVar2.getAlpha() * 255.0f);
            int i27 = liVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (whVar != null) {
                f7 = whVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f7 * AndroidUtilities.dp(26.0f)));
            if (vVar != null) {
                f10 = vVar.getAlpha() * vVar.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i28 = dp4 + ((int) f10);
            int r12 = tiVar.r1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
            int i29 = (r12 - i10) - i28;
            i11 = ((org.telegram.ui.ActionBar.f3) tiVar).currentSheetAnimationType;
            if (i11 == 1 || tiVar.f30635w1 != null) {
                i29 = (int) (liVar2.getTranslationY() + i29);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i29;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (i27 == 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (i27 == 2) {
                if (i29 < i12) {
                    float f17 = i12 - i29;
                    i26 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    f13 = org.telegram.ui.Cells.c1.v(f17, i26, 1.0f, 0.0f);
                    f11 = 1.0f;
                } else {
                    f13 = 1.0f;
                    f11 = 1.0f;
                }
            } else {
                float f18 = i28;
                f11 = 1.0f;
                if (liVar2 == tiVar.f30607o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (liVar2 == tiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (liVar2 == tiVar.f30604n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = tiVar.f30565a1.getAlpha();
                    int i30 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i29 -= i30;
                    dp5 -= i30;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = tiVar.f30565a1.getAlpha();
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
            if (tiVar.B0.g()) {
                s12 = tiVar.B0.getCustomBackground();
            } else {
                s12 = tiVar.s1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.f3) tiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) tiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i29, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.f3) tiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f27538x0;
            if (i27 == 2) {
                org.telegram.ui.ActionBar.h6.f21283t0.setColor(s12);
                org.telegram.ui.ActionBar.h6.f21283t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                f14 = 24.0f;
                i25 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i29, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i29);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != f11 && i27 != 2) || tiVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.h6.f21283t0;
                if (tiVar.B0.f()) {
                    s12 = tiVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(s12);
                org.telegram.ui.ActionBar.h6.f21283t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i29, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i29);
            }
            if (tiVar.B0.f()) {
                org.telegram.ui.ActionBar.h6.f21283t0.setColor(tiVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.h6.f21283t0.setAlpha(alpha2);
                int r13 = tiVar.r1(0);
                if (!z10) {
                    r13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i29) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + r13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.h6.f21283t0);
                canvas.restore();
            }
            if ((whVar == null || whVar.getAlpha() != f11) && f13 != 0.0f) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (i27 == 2) {
                    themedColor = 536870912;
                    f15 = f13;
                } else if (tiVar.B0.f()) {
                    int customActionBarBackground = tiVar.B0.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.f(0.5f, customActionBarBackground, i14);
                    if (whVar != null) {
                        alpha = whVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                } else {
                    themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    if (whVar != null) {
                        alpha = whVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.f21283t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.f21283t0.setAlpha((int) (liVar2.getAlpha() * alpha4 * f15 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21283t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
        li liVar;
        int i30;
        ti tiVar = this.B0;
        boolean z11 = tiVar.f30584g0;
        ah.v vVar = tiVar.R0;
        dh.d dVar = tiVar.D0;
        wh whVar = tiVar.l1;
        z7 z7Var = tiVar.f30565a1;
        if ((view instanceof li) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, tiVar.f30609o2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            li liVar2 = (li) view;
            int i31 = liVar2.i();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (whVar != null) {
                i14 = AndroidUtilities.dp(whVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i32 = dp5 + i14;
            if (vVar != null) {
                f13 = vVar.getAlpha() * vVar.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i33 = i32 + ((int) f13);
            if (liVar2 == tiVar.B0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int r12 = tiVar.r1(i15);
            i16 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
            int i34 = (r12 - i16) - i33;
            i17 = ((org.telegram.ui.ActionBar.f3) tiVar).currentSheetAnimationType;
            if (i17 == 1 || tiVar.f30635w1 != null) {
                i34 = (int) (view.getTranslationY() + i34);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i34;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
            int i35 = i18 + dp7;
            if (i31 == 0) {
                i19 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i36 = i19;
            if (i31 != 2) {
                i20 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i34 < i36) {
                    float f17 = i33;
                    if (liVar2 == tiVar.f30607o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (liVar2 == tiVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (liVar2 == tiVar.f30604n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                        int i37 = (int) ((i36 - f15) * min);
                        i34 -= i37;
                        dp6 -= i37;
                        i35 += i37;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                    int i372 = (int) ((i36 - f15) * min2);
                    i34 -= i372;
                    dp6 -= i372;
                    i35 += i372;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i34 < i36) {
                i30 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                f16 = org.telegram.ui.Cells.c1.v(i36 - i34, i30, 1.0f, 0.0f);
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
            if (tiVar.B0.g()) {
                s12 = tiVar.B0.getCustomBackground();
            } else {
                s12 = tiVar.s1(true);
            }
            li liVar3 = tiVar.B0;
            bn bnVar = tiVar.f30613q0;
            if (liVar3 != bnVar && (liVar = tiVar.C0) != bnVar && (liVar3 != tiVar.f30593j0 || liVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f27538x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.f3) tiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.f3) tiVar).shadowDrawable;
                drawable2.setBounds(0, i34, getMeasuredWidth(), i39);
                drawable3 = ((org.telegram.ui.ActionBar.f3) tiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (i31 == 2) {
                    org.telegram.ui.ActionBar.h6.f21283t0.setColor(s12);
                    org.telegram.ui.ActionBar.h6.f21283t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i34, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i34);
                }
            }
            if (view != tiVar.f30596k0 && view != tiVar.f30621s0 && view != tiVar.f30599l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f16 != 1.0f && i31 != 2) {
                    org.telegram.ui.ActionBar.h6.f21283t0.setColor(s12);
                    org.telegram.ui.ActionBar.h6.f21283t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i34, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i34);
                }
                if ((whVar == null || whVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (i31 == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                        if (whVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - whVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f21283t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.h6.f21283t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21283t0);
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
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = z7Var.getX();
            li liVar4 = tiVar.B0;
            if (liVar4 != null) {
                int i40 = liVar4.i();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (whVar != null) {
                    f10 = whVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (vVar != null) {
                    f11 = vVar.getAlpha() * vVar.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i41 = dp10 + ((int) f11);
                int r13 = tiVar.r1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                int i42 = (r13 - i10) - i41;
                i11 = ((org.telegram.ui.ActionBar.f3) tiVar).currentSheetAnimationType;
                if (i11 == 1 || tiVar.f30635w1 != null) {
                    i42 = (int) (liVar4.getTranslationY() + i42);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i42;
                if (i40 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (i40 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                    if (i13 + i42 < i12) {
                        float f18 = i41;
                        if (liVar4 == tiVar.f30607o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (liVar4 == tiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (liVar4 == tiVar.f30604n0) {
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
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof tz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.f8017j.f8006k);
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
        ii iiVar = this.A0;
        iiVar.f21637b = this;
        iiVar.c();
        ti tiVar = this.B0;
        tiVar.H0.setAdjustPanLayoutHelper(iiVar);
        tiVar.S0.setAdjustPanLayoutHelper(iiVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f30584g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        ti tiVar = this.B0;
        int[] iArr = tiVar.f30579e2;
        if (tiVar.B0.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ah.v vVar = tiVar.R0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                wh whVar = tiVar.l1;
                if (whVar != null) {
                    i11 = AndroidUtilities.dp(whVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (vVar != null) {
                    f7 = vVar.getAlpha() * vVar.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!tiVar.f30584g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && tiVar.f30565a1.getAlpha() == 0.0f) {
                    tiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ji.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        fo foVar;
        fo foVar2;
        boolean z10;
        int q12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ji jiVar = this;
        ti tiVar = jiVar.B0;
        boolean z11 = tiVar.f30584g0;
        org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30575d1;
        if (jiVar.getLayoutParams().height > 0) {
            size = jiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            jiVar.f27539y0 = true;
            i18 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
            jiVar.setPadding(i18, 0, i19, 0);
            jiVar.f27539y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) tiVar.f30591i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        jiVar.f27539y0 = true;
        int min = (int) (i20 / Math.min(4.5f, tiVar.D1.h()));
        if (tiVar.f30569b2 != min) {
            tiVar.f30569b2 = min;
            AndroidUtilities.runOnUIThread(new pg(jiVar, 21));
        }
        jiVar.f27539y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        jiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) tiVar).backgroundPaddingLeft;
        ci ciVar = tiVar.S0;
        zh zhVar = tiVar.H0;
        int i21 = size3 - (i13 * 2);
        if (!zhVar.N && AndroidUtilities.dp(20.0f) >= 0 && !zhVar.e && !zhVar.O) {
            jiVar.f27539y0 = true;
            zhVar.j();
            jiVar.f27539y0 = false;
        }
        if (!ciVar.N && AndroidUtilities.dp(20.0f) >= 0 && !ciVar.e && !ciVar.O) {
            jiVar.f27539y0 = true;
            ciVar.j();
            jiVar.f27539y0 = false;
        }
        if (tiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            fo foVar3 = tiVar.m0;
            if (!foVar3.G && !foVar3.f26286a1 && !foVar3.f26296f1 && !foVar3.f26300h1) {
                jiVar.f27539y0 = true;
                foVar3.d0();
                jiVar.f27539y0 = false;
            }
        }
        if (tiVar.f30604n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            fo foVar4 = tiVar.f30604n0;
            if (!foVar4.G && !foVar4.f26286a1 && !foVar4.f26296f1 && !foVar4.f26300h1) {
                jiVar.f27539y0 = true;
                foVar4.d0();
                jiVar.f27539y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) tiVar).keyboardVisible;
            if (z10) {
                li liVar = tiVar.B0;
                fo foVar5 = tiVar.m0;
                if (liVar == foVar5 && foVar5.E != null && foVar5.f26300h1) {
                    q12 = AndroidUtilities.dp(120.0f);
                } else {
                    fo foVar6 = tiVar.f30604n0;
                    if (liVar == foVar6 && foVar6.E != null && foVar6.f26300h1) {
                        q12 = AndroidUtilities.dp(120.0f);
                    } else {
                        q12 = 0;
                    }
                }
            } else {
                q12 = tiVar.q1();
            }
            WeakHashMap weakHashMap = r0.i0.f44864a;
            r0.k1 a2 = r0.b0.a(jiVar);
            if (a2 != null) {
                i15 = a2.f44873a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.k1 a10 = r0.b0.a(jiVar);
            if (a10 != null) {
                i16 = a10.f44873a.f(527).d;
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
            jiVar.f27539y0 = true;
            li liVar2 = tiVar.B0;
            if (liVar2.f28247f) {
                liVar2.e = AndroidUtilities.dp(62.0f) + max;
                tiVar.B0.B(i21, size4);
            } else {
                liVar2.e = AndroidUtilities.navigationBarHeight;
                liVar2.B(i21, size4 - q12);
            }
            li liVar3 = tiVar.C0;
            if (liVar3 != null) {
                if (liVar3.f28247f) {
                    liVar3.e = AndroidUtilities.dp(62.0f) + max;
                    tiVar.C0.B(i21, size4);
                } else {
                    liVar3.e = AndroidUtilities.navigationBarHeight;
                    liVar3.B(i21, size4 - q12);
                }
            }
            jiVar.f27539y0 = false;
        }
        int childCount = jiVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = jiVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == tiVar.f30643y1) {
                i14 = i23;
                jiVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof li) {
                    li liVar4 = (li) childAt;
                    if (liVar4.h) {
                        i24 = 0;
                    }
                    if (liVar4.f28247f) {
                        i25 = 0;
                    }
                }
                if (!zhVar.l(childAt) && !ciVar.l(childAt) && (((foVar = tiVar.m0) == null || childAt != foVar.E) && ((foVar2 = tiVar.f30604n0) == null || childAt != foVar2.E))) {
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
            jiVar = this;
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
        dh.d dVar = this.B0.D0;
        if (dVar != null) {
            dVar.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.B0;
        if (tiVar.B0.n(motionEvent)) {
            return true;
        }
        if (!tiVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27539y0) {
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
        ti tiVar = this.B0;
        wh whVar = tiVar.A1;
        float f10 = f7 + tiVar.f30609o2;
        i10 = ((org.telegram.ui.ActionBar.f3) tiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f27540z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) tiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                tiVar.B0.setTranslationY(f10);
                if (tiVar.T0 != 0 || tiVar.W0) {
                    tiVar.l1.setTranslationY((tiVar.f30622s1 + f10) - tiVar.f30609o2);
                }
                whVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                tiVar.B0.setTranslationY(0.0f);
                whVar.setTranslationY(((f10 / this.f27540z0) * whVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - tiVar.f30609o2) + tiVar.f30642y0);
        i12 = ((org.telegram.ui.ActionBar.f3) tiVar).currentSheetAnimationType;
        if (i12 != 1) {
            tiVar.B0.l(tiVar.f30609o2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
