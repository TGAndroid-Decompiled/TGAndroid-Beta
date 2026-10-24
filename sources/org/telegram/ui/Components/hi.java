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
public final class hi extends nw0 {
    public final gi A0;
    public final ri B0;
    public int f27036w0;
    public final RectF f27037x0;
    public boolean f27038y0;
    public float f27039z0;

    public hi(ri riVar, Context context) {
        super(context, null);
        this.B0 = riVar;
        this.f27037x0 = new RectF();
        this.A0 = new gi(this, this);
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
        int v12;
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
        ji jiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ri riVar = this.B0;
        gh.d dVar = riVar.K2;
        gh.d dVar2 = riVar.J2;
        if (Build.VERSION.SDK_INT >= 31 && riVar.I2 != null) {
            riVar.e1();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        ji jiVar2 = riVar.B0;
        zm zmVar = riVar.f30178q0;
        if ((jiVar2 == zmVar || (jiVar = riVar.C0) == zmVar || (jiVar2 == riVar.f30158j0 && jiVar == null)) && jiVar2 != null) {
            canvas.save();
            float f16 = riVar.f30174o2;
            boolean z10 = riVar.f30149g0;
            ah.v vVar = riVar.R0;
            uh uhVar = riVar.l1;
            canvas.translate(0.0f, f16);
            int alpha2 = (int) (jiVar2.getAlpha() * 255.0f);
            int i27 = jiVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (uhVar != null) {
                f7 = uhVar.getAlpha();
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
            int u12 = riVar.u1(0);
            i10 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
            int i29 = (u12 - i10) - i28;
            i11 = ((org.telegram.ui.ActionBar.h3) riVar).currentSheetAnimationType;
            if (i11 == 1 || riVar.f30200w1 != null) {
                i29 = (int) (jiVar2.getTranslationY() + i29);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i29;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (i27 == 0) {
                i12 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (i27 == 2) {
                if (i29 < i12) {
                    float f17 = i12 - i29;
                    i26 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    f13 = org.telegram.ui.Cells.b1.t(f17, i26, 1.0f, 0.0f);
                    f11 = 1.0f;
                } else {
                    f13 = 1.0f;
                    f11 = 1.0f;
                }
            } else {
                float f18 = i28;
                f11 = 1.0f;
                if (jiVar2 == riVar.f30172o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (jiVar2 == riVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (jiVar2 == riVar.f30169n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = riVar.f30130a1.getAlpha();
                    int i30 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i29 -= i30;
                    dp5 -= i30;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = riVar.f30130a1.getAlpha();
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
            if (riVar.B0.g()) {
                v12 = riVar.B0.getCustomBackground();
            } else {
                v12 = riVar.v1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.h3) riVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.h3) riVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
            drawable2.setBounds(0, i29, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.h3) riVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f27037x0;
            if (i27 == 2) {
                org.telegram.ui.ActionBar.k6.f21474t0.setColor(v12);
                org.telegram.ui.ActionBar.k6.f21474t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                f14 = 24.0f;
                i25 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i29, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i29);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != f11 && i27 != 2) || riVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.k6.f21474t0;
                if (riVar.B0.f()) {
                    v12 = riVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(v12);
                org.telegram.ui.ActionBar.k6.f21474t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i29, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i29);
            }
            if (riVar.B0.f()) {
                org.telegram.ui.ActionBar.k6.f21474t0.setColor(riVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.k6.f21474t0.setAlpha(alpha2);
                int u13 = riVar.u1(0);
                if (!z10) {
                    u13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i29) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + u13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.k6.f21474t0);
                canvas.restore();
            }
            if ((uhVar == null || uhVar.getAlpha() != f11) && f13 != 0.0f) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (i27 == 2) {
                    themedColor = 536870912;
                    f15 = f13;
                } else if (riVar.B0.f()) {
                    int customActionBarBackground = riVar.B0.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.f(0.5f, customActionBarBackground, i14);
                    if (uhVar != null) {
                        alpha = uhVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                } else {
                    themedColor = riVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ii);
                    if (uhVar != null) {
                        alpha = uhVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.k6.f21474t0.setColor(themedColor);
                org.telegram.ui.ActionBar.k6.f21474t0.setAlpha((int) (jiVar2.getAlpha() * alpha4 * f15 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21474t0);
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
        int v12;
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
        ji jiVar;
        int i30;
        ri riVar = this.B0;
        boolean z11 = riVar.f30149g0;
        ah.v vVar = riVar.R0;
        dh.d dVar = riVar.D0;
        uh uhVar = riVar.l1;
        x7 x7Var = riVar.f30130a1;
        if ((view instanceof ji) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, riVar.f30174o2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            ji jiVar2 = (ji) view;
            int i31 = jiVar2.i();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (uhVar != null) {
                i14 = AndroidUtilities.dp(uhVar.getAlpha() * 26.0f);
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
            if (jiVar2 == riVar.B0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int u12 = riVar.u1(i15);
            i16 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
            int i34 = (u12 - i16) - i33;
            i17 = ((org.telegram.ui.ActionBar.h3) riVar).currentSheetAnimationType;
            if (i17 == 1 || riVar.f30200w1 != null) {
                i34 = (int) (view.getTranslationY() + i34);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i34;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
            int i35 = i18 + dp7;
            if (i31 == 0) {
                i19 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i36 = i19;
            if (i31 != 2) {
                i20 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i34 < i36) {
                    float f17 = i33;
                    if (jiVar2 == riVar.f30172o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (jiVar2 == riVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (jiVar2 == riVar.f30169n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                        int i37 = (int) ((i36 - f15) * min);
                        i34 -= i37;
                        dp6 -= i37;
                        i35 += i37;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i36 - i34) - i21) / f15);
                    int i372 = (int) ((i36 - f15) * min2);
                    i34 -= i372;
                    dp6 -= i372;
                    i35 += i372;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i34 < i36) {
                i30 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                f16 = org.telegram.ui.Cells.b1.t(i36 - i34, i30, 1.0f, 0.0f);
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
            if (riVar.B0.g()) {
                v12 = riVar.B0.getCustomBackground();
            } else {
                v12 = riVar.v1(true);
            }
            ji jiVar3 = riVar.B0;
            zm zmVar = riVar.f30178q0;
            if (jiVar3 != zmVar && (jiVar = riVar.C0) != zmVar && (jiVar3 != riVar.f30158j0 || jiVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f27037x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.h3) riVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.h3) riVar).shadowDrawable;
                drawable2.setBounds(0, i34, getMeasuredWidth(), i39);
                drawable3 = ((org.telegram.ui.ActionBar.h3) riVar).shadowDrawable;
                drawable3.draw(canvas);
                if (i31 == 2) {
                    org.telegram.ui.ActionBar.k6.f21474t0.setColor(v12);
                    org.telegram.ui.ActionBar.k6.f21474t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i34, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i34);
                }
            }
            if (view != riVar.f30161k0 && view != riVar.f30186s0 && view != riVar.f30164l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f16 != 1.0f && i31 != 2) {
                    org.telegram.ui.ActionBar.k6.f21474t0.setColor(v12);
                    org.telegram.ui.ActionBar.k6.f21474t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i34, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i34);
                }
                if ((uhVar == null || uhVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (i31 == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = riVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ii);
                        if (uhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - uhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.k6.f21474t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.k6.f21474t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21474t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == x7Var) {
            float alpha4 = x7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = x7Var.getX();
            ji jiVar4 = riVar.B0;
            if (jiVar4 != null) {
                int i40 = jiVar4.i();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (uhVar != null) {
                    f10 = uhVar.getAlpha();
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
                int u13 = riVar.u1(0);
                i10 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                int i42 = (u13 - i10) - i41;
                i11 = ((org.telegram.ui.ActionBar.h3) riVar).currentSheetAnimationType;
                if (i11 == 1 || riVar.f30200w1 != null) {
                    i42 = (int) (jiVar4.getTranslationY() + i42);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i42;
                if (i40 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (i40 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                    if (i13 + i42 < i12) {
                        float f18 = i41;
                        if (jiVar4 == riVar.f30172o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (jiVar4 == riVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (jiVar4 == riVar.f30169n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f12 = f18 - dp2;
                            dp11 -= (int) (x7Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                        }
                        f12 = f18 + dp;
                        dp11 -= (int) (x7Var.getAlpha() * ((i12 - f12) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp11;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, x7Var.getX() + x7Var.getWidth(), x7Var.getY() + x7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof rz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.v.f8015k);
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
        gi giVar = this.A0;
        giVar.f21720b = this;
        giVar.c();
        ri riVar = this.B0;
        riVar.H0.setAdjustPanLayoutHelper(giVar);
        riVar.S0.setAdjustPanLayoutHelper(giVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f30149g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        ri riVar = this.B0;
        int[] iArr = riVar.f30144e2;
        if (riVar.B0.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ah.v vVar = riVar.R0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                uh uhVar = riVar.l1;
                if (uhVar != null) {
                    i11 = AndroidUtilities.dp(uhVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (vVar != null) {
                    f7 = vVar.getAlpha() * vVar.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!riVar.f30149g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && riVar.f30130a1.getAlpha() == 0.0f) {
                    riVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        co coVar;
        co coVar2;
        boolean z10;
        int t12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        hi hiVar = this;
        ri riVar = hiVar.B0;
        boolean z11 = riVar.f30149g0;
        org.telegram.ui.ActionBar.u0 u0Var = riVar.f30140d1;
        if (hiVar.getLayoutParams().height > 0) {
            size = hiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            hiVar.f27038y0 = true;
            i18 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
            hiVar.setPadding(i18, 0, i19, 0);
            hiVar.f27038y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) riVar.f30156i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        hiVar.f27038y0 = true;
        int min = (int) (i20 / Math.min(4.5f, riVar.D1.h()));
        if (riVar.f30134b2 != min) {
            riVar.f30134b2 = min;
            AndroidUtilities.runOnUIThread(new ng(hiVar, 22));
        }
        hiVar.f27038y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        hiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.h3) riVar).backgroundPaddingLeft;
        ai aiVar = riVar.S0;
        xh xhVar = riVar.H0;
        int i21 = size3 - (i13 * 2);
        if (!xhVar.N && AndroidUtilities.dp(20.0f) >= 0 && !xhVar.e && !xhVar.O) {
            hiVar.f27038y0 = true;
            xhVar.j();
            hiVar.f27038y0 = false;
        }
        if (!aiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !aiVar.e && !aiVar.O) {
            hiVar.f27038y0 = true;
            aiVar.j();
            hiVar.f27038y0 = false;
        }
        if (riVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            co coVar3 = riVar.m0;
            if (!coVar3.G && !coVar3.f25358a1 && !coVar3.f25368f1 && !coVar3.f25372h1) {
                hiVar.f27038y0 = true;
                coVar3.d0();
                hiVar.f27038y0 = false;
            }
        }
        if (riVar.f30169n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            co coVar4 = riVar.f30169n0;
            if (!coVar4.G && !coVar4.f25358a1 && !coVar4.f25368f1 && !coVar4.f25372h1) {
                hiVar.f27038y0 = true;
                coVar4.d0();
                hiVar.f27038y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.h3) riVar).keyboardVisible;
            if (z10) {
                ji jiVar = riVar.B0;
                co coVar5 = riVar.m0;
                if (jiVar == coVar5 && coVar5.E != null && coVar5.f25372h1) {
                    t12 = AndroidUtilities.dp(120.0f);
                } else {
                    co coVar6 = riVar.f30169n0;
                    if (jiVar == coVar6 && coVar6.E != null && coVar6.f25372h1) {
                        t12 = AndroidUtilities.dp(120.0f);
                    } else {
                        t12 = 0;
                    }
                }
            } else {
                t12 = riVar.t1();
            }
            WeakHashMap weakHashMap = r0.i0.f45241a;
            r0.k1 a2 = r0.b0.a(hiVar);
            if (a2 != null) {
                i15 = a2.f45250a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.k1 a10 = r0.b0.a(hiVar);
            if (a10 != null) {
                i16 = a10.f45250a.f(527).d;
            } else {
                i16 = 0;
            }
            Math.max(i16, t12);
            if (i15 > 0) {
                i17 = 0;
            } else {
                i17 = AndroidUtilities.navigationBarHeight;
            }
            int max = Math.max(i17, t12);
            hiVar.f27038y0 = true;
            ji jiVar2 = riVar.B0;
            if (jiVar2.f27706f) {
                jiVar2.e = AndroidUtilities.dp(62.0f) + max;
                riVar.B0.B(i21, size4);
            } else {
                jiVar2.e = AndroidUtilities.navigationBarHeight;
                jiVar2.B(i21, size4 - t12);
            }
            ji jiVar3 = riVar.C0;
            if (jiVar3 != null) {
                if (jiVar3.f27706f) {
                    jiVar3.e = AndroidUtilities.dp(62.0f) + max;
                    riVar.C0.B(i21, size4);
                } else {
                    jiVar3.e = AndroidUtilities.navigationBarHeight;
                    jiVar3.B(i21, size4 - t12);
                }
            }
            hiVar.f27038y0 = false;
        }
        int childCount = hiVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = hiVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == riVar.f30208y1) {
                i14 = i23;
                hiVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof ji) {
                    ji jiVar4 = (ji) childAt;
                    if (jiVar4.h) {
                        i24 = 0;
                    }
                    if (jiVar4.f27706f) {
                        i25 = 0;
                    }
                }
                if (!xhVar.l(childAt) && !aiVar.l(childAt) && (((coVar = riVar.m0) == null || childAt != coVar.E) && ((coVar2 = riVar.f30169n0) == null || childAt != coVar2.E))) {
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
            hiVar = this;
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
        ri riVar = this.B0;
        if (riVar.B0.n(motionEvent)) {
            return true;
        }
        if (!riVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27038y0) {
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
        ri riVar = this.B0;
        uh uhVar = riVar.A1;
        float f10 = f7 + riVar.f30174o2;
        i10 = ((org.telegram.ui.ActionBar.h3) riVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f27039z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.h3) riVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                riVar.B0.setTranslationY(f10);
                if (riVar.T0 != 0 || riVar.W0) {
                    riVar.l1.setTranslationY((riVar.f30187s1 + f10) - riVar.f30174o2);
                }
                uhVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                riVar.B0.setTranslationY(0.0f);
                uhVar.setTranslationY(((f10 / this.f27039z0) * uhVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - riVar.f30174o2) + riVar.f30207y0);
        i12 = ((org.telegram.ui.ActionBar.h3) riVar).currentSheetAnimationType;
        if (i12 != 1) {
            riVar.B0.l(riVar.f30174o2);
        }
    }

    @Override
    public final void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
