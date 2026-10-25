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
public final class gi extends vw0 {
    public int f28572l0;
    public final RectF m0;
    public boolean f28573n0;
    public float f28574o0;
    public final fi f28575p0;
    public final ti f28576q0;

    public gi(ti tiVar, Context context) {
        super(context, null);
        this.f28576q0 = tiVar;
        this.m0 = new RectF();
        this.f28575p0 = new fi(this, this);
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
        int u12;
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
        canvas.save();
        ti tiVar = this.f28576q0;
        li liVar2 = tiVar.B0;
        cn cnVar = tiVar.f33050q0;
        if ((liVar2 == cnVar || (liVar = tiVar.C0) == cnVar || (liVar2 == tiVar.f33030j0 && liVar == null)) && liVar2 != null) {
            canvas.save();
            float f16 = tiVar.f33046o2;
            boolean z10 = tiVar.f33021g0;
            bh.p pVar = tiVar.R0;
            th thVar = tiVar.l1;
            canvas.translate(0.0f, f16);
            int alpha2 = (int) (liVar2.getAlpha() * 255.0f);
            int i27 = liVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (thVar != null) {
                f7 = thVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f7 * AndroidUtilities.dp(26.0f)));
            if (pVar != null) {
                f10 = pVar.getAlpha() * pVar.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i28 = dp4 + ((int) f10);
            int t12 = tiVar.t1(0);
            i10 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            int i29 = (t12 - i10) - i28;
            i11 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
            if (i11 == 1 || tiVar.f33072w1 != null) {
                i29 = (int) (liVar2.getTranslationY() + i29);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i29;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (i27 == 0) {
                i12 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (i27 == 2) {
                if (i29 < i12) {
                    float f17 = i12 - i29;
                    i26 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    f13 = org.telegram.ui.d3.v(f17, i26, 1.0f, 0.0f);
                    f11 = 1.0f;
                } else {
                    f13 = 1.0f;
                    f11 = 1.0f;
                }
            } else {
                float f18 = i28;
                f11 = 1.0f;
                if (liVar2 == tiVar.f33044o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (liVar2 == tiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (liVar2 == tiVar.f33041n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = tiVar.f33002a1.getAlpha();
                    int i30 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i29 -= i30;
                    dp5 -= i30;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = tiVar.f33002a1.getAlpha();
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
                u12 = tiVar.B0.getCustomBackground();
            } else {
                u12 = tiVar.u1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            int measuredWidth = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i29, measuredWidth, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.m0;
            if (i27 == 2) {
                org.telegram.ui.ActionBar.y6.f23646t0.setColor(u12);
                org.telegram.ui.ActionBar.y6.f23646t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                f14 = 24.0f;
                i25 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i29, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i29);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != f11 && i27 != 2) || tiVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.y6.f23646t0;
                if (tiVar.B0.f()) {
                    u12 = tiVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(u12);
                org.telegram.ui.ActionBar.y6.f23646t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int measuredWidth3 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i29, measuredWidth3 - i20, AndroidUtilities.dp(f14) + i21 + i29);
            }
            if (tiVar.B0.f()) {
                org.telegram.ui.ActionBar.y6.f23646t0.setColor(tiVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.y6.f23646t0.setAlpha(alpha2);
                int t13 = tiVar.t1(0);
                if (!z10) {
                    t13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth4 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i29) * f13, measuredWidth4 - i17, AndroidUtilities.dp(12.0f) + t13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.y6.f23646t0);
                canvas.restore();
            }
            if ((thVar == null || thVar.getAlpha() != f11) && f13 != 0.0f) {
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
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                } else {
                    themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.y6.f23646t0.setColor(themedColor);
                org.telegram.ui.ActionBar.y6.f23646t0.setAlpha((int) (liVar2.getAlpha() * alpha4 * f15 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23646t0);
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
        int u12;
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
        ti tiVar = this.f28576q0;
        boolean z11 = tiVar.f33021g0;
        bh.p pVar = tiVar.R0;
        eh.d dVar = tiVar.D0;
        th thVar = tiVar.l1;
        b8 b8Var = tiVar.f33002a1;
        if ((view instanceof li) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, tiVar.f33046o2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            li liVar2 = (li) view;
            int i31 = liVar2.i();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (thVar != null) {
                i14 = AndroidUtilities.dp(thVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i32 = dp5 + i14;
            if (pVar != null) {
                f13 = pVar.getAlpha() * pVar.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i33 = i32 + ((int) f13);
            if (liVar2 == tiVar.B0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int t12 = tiVar.t1(i15);
            i16 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            int i34 = (t12 - i16) - i33;
            i17 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
            if (i17 == 1 || tiVar.f33072w1 != null) {
                i34 = (int) (view.getTranslationY() + i34);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i34;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            int i35 = i18 + dp7;
            if (i31 == 0) {
                i19 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i36 = i19;
            if (i31 != 2) {
                i20 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i34 < i36) {
                    float f17 = i33;
                    if (liVar2 == tiVar.f33044o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (liVar2 == tiVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (liVar2 == tiVar.f33041n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                        int i37 = (int) ((i36 - f15) * min);
                        i34 -= i37;
                        dp6 -= i37;
                        i35 += i37;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                    int i372 = (int) ((i36 - f15) * min2);
                    i34 -= i372;
                    dp6 -= i372;
                    i35 += i372;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i34 < i36) {
                i30 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                f16 = org.telegram.ui.d3.v(i36 - i34, i30, 1.0f, 0.0f);
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
                u12 = tiVar.B0.getCustomBackground();
            } else {
                u12 = tiVar.u1(true);
            }
            li liVar3 = tiVar.B0;
            cn cnVar = tiVar.f33050q0;
            if (liVar3 != cnVar && (liVar = tiVar.C0) != cnVar && (liVar3 != tiVar.f33030j0 || liVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.m0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
                drawable2.setBounds(0, i34, getMeasuredWidth(), i39);
                drawable3 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (i31 == 2) {
                    org.telegram.ui.ActionBar.y6.f23646t0.setColor(u12);
                    org.telegram.ui.ActionBar.y6.f23646t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i34, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i34);
                }
            }
            if (view != tiVar.f33033k0 && view != tiVar.f33058s0 && view != tiVar.f33036l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f16 != 1.0f && i31 != 2) {
                    org.telegram.ui.ActionBar.y6.f23646t0.setColor(u12);
                    org.telegram.ui.ActionBar.y6.f23646t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i34, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i34);
                }
                if ((thVar == null || thVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (i31 == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                        if (thVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - thVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.y6.f23646t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.y6.f23646t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23646t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == b8Var) {
            float alpha4 = b8Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x9 = b8Var.getX();
            li liVar4 = tiVar.B0;
            if (liVar4 != null) {
                int i40 = liVar4.i();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (thVar != null) {
                    f10 = thVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (pVar != null) {
                    f11 = pVar.getAlpha() * pVar.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i41 = dp10 + ((int) f11);
                int t13 = tiVar.t1(0);
                i10 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int i42 = (t13 - i10) - i41;
                i11 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
                if (i11 == 1 || tiVar.f33072w1 != null) {
                    i42 = (int) (liVar4.getTranslationY() + i42);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i42;
                if (i40 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (i40 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    if (i13 + i42 < i12) {
                        float f18 = i41;
                        if (liVar4 == tiVar.f33044o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (liVar4 == tiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (liVar4 == tiVar.f33041n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f12 = f18 - dp2;
                            dp11 -= (int) (b8Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                        }
                        f12 = f18 + dp;
                        dp11 -= (int) (b8Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp11;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x9, f7, b8Var.getX() + b8Var.getWidth(), b8Var.getY() + b8Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof sz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.f9966x.f9956k);
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
        fi fiVar = this.f28575p0;
        fiVar.f22963b = this;
        fiVar.c();
        ti tiVar = this.f28576q0;
        tiVar.H0.setAdjustPanLayoutHelper(fiVar);
        tiVar.S0.setAdjustPanLayoutHelper(fiVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28575p0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f28576q0.f33021g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        ti tiVar = this.f28576q0;
        int[] iArr = tiVar.f33016e2;
        if (tiVar.B0.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                bh.p pVar = tiVar.R0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                th thVar = tiVar.l1;
                if (thVar != null) {
                    i11 = AndroidUtilities.dp(thVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (pVar != null) {
                    f7 = pVar.getAlpha() * pVar.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!tiVar.f33021g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && tiVar.f33002a1.getAlpha() == 0.0f) {
                    tiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        go goVar;
        go goVar2;
        boolean z10;
        int n02;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        gi giVar = this;
        ti tiVar = giVar.f28576q0;
        boolean z11 = tiVar.f33021g0;
        org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33012d1;
        if (giVar.getLayoutParams().height > 0) {
            size = giVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            giVar.f28573n0 = true;
            i18 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
            giVar.setPadding(i18, 0, i19, 0);
            giVar.f28573n0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) tiVar.f33028i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        giVar.f28573n0 = true;
        int min = (int) (i20 / Math.min(4.5f, tiVar.D1.h()));
        if (tiVar.f33006b2 != min) {
            tiVar.f33006b2 = min;
            AndroidUtilities.runOnUIThread(new pg(giVar, 22));
        }
        giVar.f28573n0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        giVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
        yh yhVar = tiVar.S0;
        wh whVar = tiVar.H0;
        int i21 = size3 - (i13 * 2);
        if (!whVar.N && AndroidUtilities.dp(20.0f) >= 0 && !whVar.e && !whVar.O) {
            giVar.f28573n0 = true;
            whVar.j();
            giVar.f28573n0 = false;
        }
        if (!yhVar.N && AndroidUtilities.dp(20.0f) >= 0 && !yhVar.e && !yhVar.O) {
            giVar.f28573n0 = true;
            yhVar.j();
            giVar.f28573n0 = false;
        }
        if (tiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            go goVar3 = tiVar.m0;
            if (!goVar3.G && !goVar3.f28613a1 && !goVar3.f28623f1 && !goVar3.f28627h1) {
                giVar.f28573n0 = true;
                goVar3.d0();
                giVar.f28573n0 = false;
            }
        }
        if (tiVar.f33041n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            go goVar4 = tiVar.f33041n0;
            if (!goVar4.G && !goVar4.f28613a1 && !goVar4.f28623f1 && !goVar4.f28627h1) {
                giVar.f28573n0 = true;
                goVar4.d0();
                giVar.f28573n0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.k3) tiVar).keyboardVisible;
            if (z10) {
                li liVar = tiVar.B0;
                go goVar5 = tiVar.m0;
                if (liVar == goVar5 && goVar5.E != null && goVar5.f28627h1) {
                    n02 = AndroidUtilities.dp(120.0f);
                } else {
                    go goVar6 = tiVar.f33041n0;
                    if (liVar == goVar6 && goVar6.E != null && goVar6.f28627h1) {
                        n02 = AndroidUtilities.dp(120.0f);
                    } else {
                        n02 = 0;
                    }
                }
            } else {
                n02 = ti.n0(tiVar);
            }
            WeakHashMap weakHashMap = r0.i0.f47105a;
            r0.k1 a2 = r0.b0.a(giVar);
            if (a2 != null) {
                i15 = a2.f47115a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.k1 a10 = r0.b0.a(giVar);
            if (a10 != null) {
                i16 = a10.f47115a.f(527).d;
            } else {
                i16 = 0;
            }
            Math.max(i16, n02);
            if (i15 > 0) {
                i17 = 0;
            } else {
                i17 = AndroidUtilities.navigationBarHeight;
            }
            int max = Math.max(i17, n02);
            giVar.f28573n0 = true;
            li liVar2 = tiVar.B0;
            if (liVar2.f30215f) {
                liVar2.e = AndroidUtilities.dp(62.0f) + max;
                tiVar.B0.B(i21, size4);
            } else {
                liVar2.e = AndroidUtilities.navigationBarHeight;
                liVar2.B(i21, size4 - n02);
            }
            li liVar3 = tiVar.C0;
            if (liVar3 != null) {
                if (liVar3.f30215f) {
                    liVar3.e = AndroidUtilities.dp(62.0f) + max;
                    tiVar.C0.B(i21, size4);
                } else {
                    liVar3.e = AndroidUtilities.navigationBarHeight;
                    liVar3.B(i21, size4 - n02);
                }
            }
            giVar.f28573n0 = false;
        }
        int childCount = giVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = giVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == tiVar.f33080y1) {
                i14 = i23;
                giVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof li) {
                    li liVar4 = (li) childAt;
                    if (liVar4.h) {
                        i24 = 0;
                    }
                    if (liVar4.f30215f) {
                        i25 = 0;
                    }
                }
                if (!whVar.l(childAt) && !yhVar.l(childAt) && (((goVar = tiVar.m0) == null || childAt != goVar.E) && ((goVar2 = tiVar.f33041n0) == null || childAt != goVar2.E))) {
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
            giVar = this;
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
        eh.d dVar = this.f28576q0.D0;
        if (dVar != null) {
            dVar.z(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f28576q0;
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
        if (this.f28573n0) {
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
        ti tiVar = this.f28576q0;
        th thVar = tiVar.A1;
        float f10 = f7 + tiVar.f33046o2;
        i10 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f28574o0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                tiVar.B0.setTranslationY(f10);
                if (tiVar.T0 != 0 || tiVar.W0) {
                    tiVar.l1.setTranslationY((tiVar.f33059s1 + f10) - tiVar.f33046o2);
                }
                thVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                tiVar.B0.setTranslationY(0.0f);
                thVar.setTranslationY(((f10 / this.f28574o0) * thVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - tiVar.f33046o2) + tiVar.f33079y0);
        i12 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i12 != 1) {
            tiVar.B0.l(tiVar.f33046o2);
        }
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
