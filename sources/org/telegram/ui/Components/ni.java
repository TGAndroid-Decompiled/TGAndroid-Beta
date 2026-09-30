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
public final class ni extends dw0 {
    public final mi A0;
    public final xi B0;
    public int f26714w0;
    public final RectF f26715x0;
    public boolean f26716y0;
    public float f26717z0;

    public ni(xi xiVar, Context context) {
        super(context, null);
        this.B0 = xiVar;
        this.f26715x0 = new RectF();
        this.A0 = new mi(this, this);
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
        pi piVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        xi xiVar = this.B0;
        fh.d dVar = xiVar.E2;
        fh.d dVar2 = xiVar.D2;
        if (Build.VERSION.SDK_INT >= 31 && xiVar.C2 != null) {
            xiVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        pi piVar2 = xiVar.f30331y0;
        tm tmVar = xiVar.f30302q0;
        if ((piVar2 == tmVar || (piVar = xiVar.f30334z0) == tmVar || (piVar2 == xiVar.f30282j0 && piVar == null)) && piVar2 != null) {
            canvas.save();
            float f15 = xiVar.f30289l2;
            boolean z10 = xiVar.f30273g0;
            ci.m6 m6Var = xiVar.O0;
            zh zhVar = xiVar.f30280i1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (piVar2.getAlpha() * 255.0f);
            int h = piVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (zhVar != null) {
                f7 = zhVar.getAlpha();
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
            int p12 = xiVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
            int i28 = (p12 - i10) - i27;
            i11 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType;
            if (i11 == 1 || xiVar.f30314t1 != null) {
                i28 = (int) (piVar2.getTranslationY() + i28);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i28;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (h == 2) {
                if (i28 < i12) {
                    float f17 = i12 - i28;
                    i26 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                } else {
                    f13 = 1.0f;
                }
                f11 = 0.0f;
            } else {
                float f18 = i27;
                f11 = 0.0f;
                if (piVar2 == xiVar.f30296o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (piVar2 == xiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (piVar2 == xiVar.f30293n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = xiVar.X0.getAlpha();
                    int i29 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i28 -= i29;
                    dp5 -= i29;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = xiVar.X0.getAlpha();
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
            if (xiVar.f30331y0.f()) {
                q12 = xiVar.f30331y0.getCustomBackground();
            } else {
                q12 = xiVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.e3) xiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.e3) xiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i28, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.e3) xiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f26715x0;
            if (h == 2) {
                org.telegram.ui.ActionBar.h6.f19365t0.setColor(q12);
                org.telegram.ui.ActionBar.h6.f19365t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i28);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && h != 2) || xiVar.f30331y0.e()) {
                Paint paint = org.telegram.ui.ActionBar.h6.f19365t0;
                if (xiVar.f30331y0.e()) {
                    q12 = xiVar.f30331y0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.h6.f19365t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i28);
            }
            if (xiVar.f30331y0.e()) {
                org.telegram.ui.ActionBar.h6.f19365t0.setColor(xiVar.f30331y0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.h6.f19365t0.setAlpha(alpha2);
                int p13 = xiVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i28) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.h6.f19365t0);
                canvas.restore();
            }
            if ((zhVar == null || zhVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (xiVar.f30331y0.e()) {
                    int customActionBarBackground = xiVar.f30331y0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (zhVar != null) {
                        alpha = zhVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                } else {
                    themedColor = xiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    if (zhVar != null) {
                        alpha = zhVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.f19365t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.f19365t0.setAlpha((int) (piVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19365t0);
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
        pi piVar;
        int i30;
        xi xiVar = this.B0;
        boolean z11 = xiVar.f30273g0;
        ci.m6 m6Var = xiVar.O0;
        ch.d dVar = xiVar.A0;
        zh zhVar = xiVar.f30280i1;
        y7 y7Var = xiVar.X0;
        if ((view instanceof pi) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, xiVar.f30289l2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            pi piVar2 = (pi) view;
            int h = piVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (zhVar != null) {
                i14 = AndroidUtilities.dp(zhVar.getAlpha() * 26.0f);
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
            if (piVar2 == xiVar.f30331y0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int p12 = xiVar.p1(i15);
            i16 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
            int i33 = (p12 - i16) - i32;
            i17 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType;
            if (i17 == 1 || xiVar.f30314t1 != null) {
                i33 = (int) (view.getTranslationY() + i33);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i33;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
            int i34 = i18 + dp7;
            if (h == 0) {
                i19 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i35 = i19;
            if (h != 2) {
                i20 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i33 < i35) {
                    float f17 = i32;
                    if (piVar2 == xiVar.f30296o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (piVar2 == xiVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (piVar2 == xiVar.f30293n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                        int i36 = (int) ((i35 - f15) * min);
                        i33 -= i36;
                        dp6 -= i36;
                        i34 += i36;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                    int i362 = (int) ((i35 - f15) * min2);
                    i33 -= i362;
                    dp6 -= i362;
                    i34 += i362;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i33 < i35) {
                i30 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
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
            if (xiVar.f30331y0.f()) {
                q12 = xiVar.f30331y0.getCustomBackground();
            } else {
                q12 = xiVar.q1(true);
            }
            pi piVar3 = xiVar.f30331y0;
            tm tmVar = xiVar.f30302q0;
            if (piVar3 != tmVar && (piVar = xiVar.f30334z0) != tmVar && (piVar3 != xiVar.f30282j0 || piVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f26715x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.e3) xiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.e3) xiVar).shadowDrawable;
                drawable2.setBounds(0, i33, getMeasuredWidth(), i38);
                drawable3 = ((org.telegram.ui.ActionBar.e3) xiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.h6.f19365t0.setColor(q12);
                    org.telegram.ui.ActionBar.h6.f19365t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i33, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i33);
                }
            }
            if (view != xiVar.f30285k0 && view != xiVar.f30310s0 && view != xiVar.f30288l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f16 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.h6.f19365t0.setColor(q12);
                    org.telegram.ui.ActionBar.h6.f19365t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i33, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i33);
                }
                if ((zhVar == null || zhVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = xiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                        if (zhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - zhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f19365t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.h6.f19365t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19365t0);
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
            pi piVar4 = xiVar.f30331y0;
            if (piVar4 != null) {
                int h10 = piVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (zhVar != null) {
                    f10 = zhVar.getAlpha();
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
                int p13 = xiVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                int i40 = (p13 - i10) - i39;
                i11 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType;
                if (i11 == 1 || xiVar.f30314t1 != null) {
                    i40 = (int) (piVar4.getTranslationY() + i40);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i40;
                if (h10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (h10 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                    if (i13 + i40 < i12) {
                        float f18 = i39;
                        if (piVar4 == xiVar.f30296o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (piVar4 == xiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (piVar4 == xiVar.f30293n0) {
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
        } else if ((view instanceof nz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.f4287j.f4276k);
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
        mi miVar = this.A0;
        miVar.f19687b = this;
        miVar.c();
        xi xiVar = this.B0;
        xiVar.E0.setAdjustPanLayoutHelper(miVar);
        xiVar.P0.setAdjustPanLayoutHelper(miVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f30273g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        xi xiVar = this.B0;
        int[] iArr = xiVar.f30258b2;
        if (xiVar.f30331y0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = xiVar.O0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                zh zhVar = xiVar.f30280i1;
                if (zhVar != null) {
                    i11 = AndroidUtilities.dp(zhVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (m6Var != null) {
                    f7 = m6Var.getAlpha() * m6Var.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!xiVar.f30273g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && xiVar.X0.getAlpha() == 0.0f) {
                    xiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f7;
        xn xnVar;
        xn xnVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ni niVar = this;
        xi xiVar = niVar.B0;
        boolean z11 = xiVar.f30273g0;
        org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30254a1;
        if (niVar.getLayoutParams().height > 0) {
            size = niVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            niVar.f26716y0 = true;
            i18 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
            niVar.setPadding(i18, 0, i19, 0);
            niVar.f26716y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) xiVar.f30271f1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        niVar.f26716y0 = true;
        int min = (int) (i20 / Math.min(4.5f, xiVar.A1.h()));
        if (xiVar.Y1 != min) {
            xiVar.Y1 = min;
            AndroidUtilities.runOnUIThread(new qg(niVar, 21));
        }
        niVar.f26716y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        niVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.e3) xiVar).backgroundPaddingLeft;
        fi fiVar = xiVar.P0;
        ci ciVar = xiVar.E0;
        int i21 = size3 - (i13 * 2);
        if (!ciVar.N && AndroidUtilities.dp(20.0f) >= 0 && !ciVar.e && !ciVar.O) {
            niVar.f26716y0 = true;
            ciVar.j();
            niVar.f26716y0 = false;
        }
        if (!fiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !fiVar.e && !fiVar.O) {
            niVar.f26716y0 = true;
            fiVar.j();
            niVar.f26716y0 = false;
        }
        if (xiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            xn xnVar3 = xiVar.m0;
            if (!xnVar3.G && !xnVar3.f30385a1 && !xnVar3.f30395f1 && !xnVar3.f30399h1) {
                niVar.f26716y0 = true;
                xnVar3.a0();
                niVar.f26716y0 = false;
            }
        }
        if (xiVar.f30293n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            xn xnVar4 = xiVar.f30293n0;
            if (!xnVar4.G && !xnVar4.f30385a1 && !xnVar4.f30395f1 && !xnVar4.f30399h1) {
                niVar.f26716y0 = true;
                xnVar4.a0();
                niVar.f26716y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.e3) xiVar).keyboardVisible;
            if (z10) {
                pi piVar = xiVar.f30331y0;
                xn xnVar5 = xiVar.m0;
                if (piVar == xnVar5 && xnVar5.E != null && xnVar5.f30399h1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    xn xnVar6 = xiVar.f30293n0;
                    if (piVar == xnVar6 && xnVar6.E != null && xnVar6.f30399h1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = xiVar.o1();
            }
            r0.l1 f10 = r0.i0.f(niVar);
            if (f10 != null) {
                i15 = f10.f42245a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.l1 f11 = r0.i0.f(niVar);
            if (f11 != null) {
                i16 = f11.f42245a.f(527).d;
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
            niVar.f26716y0 = true;
            pi piVar2 = xiVar.f30331y0;
            if (piVar2.f27364f) {
                piVar2.e = AndroidUtilities.dp(62.0f) + max;
                xiVar.f30331y0.y(i21, size4);
            } else {
                piVar2.e = AndroidUtilities.navigationBarHeight;
                piVar2.y(i21, size4 - o12);
            }
            pi piVar3 = xiVar.f30334z0;
            if (piVar3 != null) {
                if (piVar3.f27364f) {
                    piVar3.e = AndroidUtilities.dp(62.0f) + max;
                    xiVar.f30334z0.y(i21, size4);
                } else {
                    piVar3.e = AndroidUtilities.navigationBarHeight;
                    piVar3.y(i21, size4 - o12);
                }
            }
            niVar.f26716y0 = false;
        }
        int childCount = niVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = niVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == xiVar.f30320v1) {
                i14 = i23;
                niVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof pi) {
                    pi piVar4 = (pi) childAt;
                    if (piVar4.h) {
                        i24 = 0;
                    }
                    if (piVar4.f27364f) {
                        i25 = 0;
                    }
                }
                if (!ciVar.l(childAt) && !fiVar.l(childAt) && (((xnVar = xiVar.m0) == null || childAt != xnVar.E) && ((xnVar2 = xiVar.f30293n0) == null || childAt != xnVar2.E))) {
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
            niVar = this;
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
        xi xiVar = this.B0;
        if (xiVar.f30331y0.l(motionEvent)) {
            return true;
        }
        if (!xiVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f26716y0) {
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
        xi xiVar = this.B0;
        zh zhVar = xiVar.f30328x1;
        float f10 = f7 + xiVar.f30289l2;
        i10 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f26717z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                xiVar.f30331y0.setTranslationY(f10);
                if (xiVar.Q0 != 0 || xiVar.T0) {
                    xiVar.f30280i1.setTranslationY((xiVar.f30300p1 + f10) - xiVar.f30289l2);
                }
                zhVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                xiVar.f30331y0.setTranslationY(0.0f);
                zhVar.setTranslationY(((f10 / this.f26717z0) * zhVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - xiVar.f30289l2);
        i12 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType;
        if (i12 != 1) {
            xiVar.f30331y0.k(xiVar.f30289l2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
