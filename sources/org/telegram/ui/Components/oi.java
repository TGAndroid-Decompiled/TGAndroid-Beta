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
public final class oi extends aw0 {
    public final ni A0;
    public final yi B0;
    public int f25808w0;
    public final RectF f25809x0;
    public boolean f25810y0;
    public float f25811z0;

    public oi(yi yiVar, Context context) {
        super(context, null);
        this.B0 = yiVar;
        this.f25809x0 = new RectF();
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
        qi qiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        yi yiVar = this.B0;
        eh.d dVar = yiVar.E2;
        eh.d dVar2 = yiVar.D2;
        if (Build.VERSION.SDK_INT >= 31 && yiVar.C2 != null) {
            yiVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        qi qiVar2 = yiVar.f29427y0;
        xm xmVar = yiVar.f29398q0;
        if ((qiVar2 == xmVar || (qiVar = yiVar.f29430z0) == xmVar || (qiVar2 == yiVar.f29378j0 && qiVar == null)) && qiVar2 != null) {
            canvas.save();
            float f15 = yiVar.f29385l2;
            boolean z10 = yiVar.f29369g0;
            bi.n7 n7Var = yiVar.O0;
            ai aiVar = yiVar.f29376i1;
            canvas.translate(0.0f, f15);
            int alpha2 = (int) (qiVar2.getAlpha() * 255.0f);
            int h = qiVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (aiVar != null) {
                f7 = aiVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f7 * AndroidUtilities.dp(26.0f)));
            if (n7Var != null) {
                f10 = n7Var.getAlpha() * n7Var.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i27 = dp4 + ((int) f10);
            int p12 = yiVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
            int i28 = (p12 - i10) - i27;
            i11 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType;
            if (i11 == 1 || yiVar.f29410t1 != null) {
                i28 = (int) (qiVar2.getTranslationY() + i28);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i28;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i12 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            float f16 = 1.0f;
            if (h == 2) {
                if (i28 < i12) {
                    float f17 = i12 - i28;
                    i26 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    f13 = Math.max(0.0f, 1.0f - (f17 / i26));
                } else {
                    f13 = 1.0f;
                }
                f11 = 0.0f;
            } else {
                float f18 = i27;
                f11 = 0.0f;
                if (qiVar2 == yiVar.f29392o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (qiVar2 == yiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (qiVar2 == yiVar.f29389n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f18 - dp2;
                    float alpha3 = yiVar.X0.getAlpha();
                    int i29 = (int) (((i12 - f12) + AndroidUtilities.statusBarHeight) * alpha3);
                    i28 -= i29;
                    dp5 -= i29;
                    f13 = 1.0f - alpha3;
                }
                f12 = f18 + dp;
                float alpha32 = yiVar.X0.getAlpha();
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
            if (yiVar.f29427y0.f()) {
                q12 = yiVar.f29427y0.getCustomBackground();
            } else {
                q12 = yiVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.h3) yiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.h3) yiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i28, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.h3) yiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f25809x0;
            if (h == 2) {
                org.telegram.ui.ActionBar.j6.f18212t0.setColor(q12);
                org.telegram.ui.ActionBar.j6.f18212t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                f14 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i28);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != 1.0f && h != 2) || yiVar.f29427y0.e()) {
                Paint paint = org.telegram.ui.ActionBar.j6.f18212t0;
                if (yiVar.f29427y0.e()) {
                    q12 = yiVar.f29427y0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.j6.f18212t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth5 - i20, AndroidUtilities.dp(f14) + i21 + i28);
            }
            if (yiVar.f29427y0.e()) {
                org.telegram.ui.ActionBar.j6.f18212t0.setColor(yiVar.f29427y0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.j6.f18212t0.setAlpha(alpha2);
                int p13 = yiVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i28) * f13, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.j6.f18212t0);
                canvas.restore();
            }
            if ((aiVar == null || aiVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f16 = f13;
                } else if (yiVar.f29427y0.e()) {
                    int customActionBarBackground = yiVar.f29427y0.getCustomActionBarBackground();
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
                    themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    if (aiVar != null) {
                        alpha = aiVar.getAlpha();
                        f16 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.j6.f18212t0.setColor(themedColor);
                org.telegram.ui.ActionBar.j6.f18212t0.setAlpha((int) (qiVar2.getAlpha() * alpha4 * f16 * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f18212t0);
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
        qi qiVar;
        int i30;
        yi yiVar = this.B0;
        boolean z11 = yiVar.f29369g0;
        bi.n7 n7Var = yiVar.O0;
        bh.d dVar = yiVar.A0;
        ai aiVar = yiVar.f29376i1;
        y7 y7Var = yiVar.X0;
        if ((view instanceof qi) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, yiVar.f29385l2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            qi qiVar2 = (qi) view;
            int h = qiVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (aiVar != null) {
                i14 = AndroidUtilities.dp(aiVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i31 = dp5 + i14;
            if (n7Var != null) {
                f13 = n7Var.getAlpha() * n7Var.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i32 = i31 + ((int) f13);
            if (qiVar2 == yiVar.f29427y0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int p12 = yiVar.p1(i15);
            i16 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
            int i33 = (p12 - i16) - i32;
            i17 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType;
            if (i17 == 1 || yiVar.f29410t1 != null) {
                i33 = (int) (view.getTranslationY() + i33);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i33;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
            int i34 = i18 + dp7;
            if (h == 0) {
                i19 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            int i35 = i19;
            if (h != 2) {
                i20 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                f14 = 0.0f;
                if (i20 + i33 < i35) {
                    float f17 = i32;
                    if (qiVar2 == yiVar.f29392o0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (qiVar2 == yiVar.m0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (qiVar2 == yiVar.f29389n0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f15 = f17 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                        int i36 = (int) ((i35 - f15) * min);
                        i33 -= i36;
                        dp6 -= i36;
                        i34 += i36;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i35 - i33) - i21) / f15);
                    int i362 = (int) ((i35 - f15) * min2);
                    i33 -= i362;
                    dp6 -= i362;
                    i34 += i362;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            } else if (i33 < i35) {
                i30 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
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
            if (yiVar.f29427y0.f()) {
                q12 = yiVar.f29427y0.getCustomBackground();
            } else {
                q12 = yiVar.q1(true);
            }
            qi qiVar3 = yiVar.f29427y0;
            xm xmVar = yiVar.f29398q0;
            if (qiVar3 != xmVar && (qiVar = yiVar.f29430z0) != xmVar && (qiVar3 != yiVar.f29378j0 || qiVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f25809x0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.h3) yiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.h3) yiVar).shadowDrawable;
                drawable2.setBounds(0, i33, getMeasuredWidth(), i38);
                drawable3 = ((org.telegram.ui.ActionBar.h3) yiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(q12);
                    org.telegram.ui.ActionBar.j6.f18212t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i33, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i33);
                }
            }
            if (view != yiVar.f29381k0 && view != yiVar.f29406s0 && view != yiVar.f29384l0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f16 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(q12);
                    org.telegram.ui.ActionBar.j6.f18212t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i33, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i33);
                }
                if ((aiVar == null || aiVar.getAlpha() != 1.0f) && f16 != f14) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f16;
                    } else {
                        themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                        if (aiVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - aiVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.j6.f18212t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f18212t0);
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
            qi qiVar4 = yiVar.f29427y0;
            if (qiVar4 != null) {
                int h10 = qiVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (aiVar != null) {
                    f10 = aiVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
                if (n7Var != null) {
                    f11 = n7Var.getAlpha() * n7Var.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i39 = dp10 + ((int) f11);
                int p13 = yiVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                int i40 = (p13 - i10) - i39;
                i11 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType;
                if (i11 == 1 || yiVar.f29410t1 != null) {
                    i40 = (int) (qiVar4.getTranslationY() + i40);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i40;
                if (h10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                }
                if (h10 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                    if (i13 + i40 < i12) {
                        float f18 = i39;
                        if (qiVar4 == yiVar.f29392o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (qiVar4 == yiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (qiVar4 == yiVar.f29389n0) {
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
        } else if ((view instanceof rz) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.h.f2264k);
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
        niVar.f18594b = this;
        niVar.c();
        yi yiVar = this.B0;
        yiVar.E0.setAdjustPanLayoutHelper(niVar);
        yiVar.P0.setAdjustPanLayoutHelper(niVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.f29369g0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f7;
        yi yiVar = this.B0;
        int[] iArr = yiVar.f29354b2;
        if (yiVar.f29427y0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                bi.n7 n7Var = yiVar.O0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ai aiVar = yiVar.f29376i1;
                if (aiVar != null) {
                    i11 = AndroidUtilities.dp(aiVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (n7Var != null) {
                    f7 = n7Var.getAlpha() * n7Var.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f7));
                if (!yiVar.f29369g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && yiVar.X0.getAlpha() == 0.0f) {
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
        zn znVar;
        zn znVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        oi oiVar = this;
        yi yiVar = oiVar.B0;
        boolean z11 = yiVar.f29369g0;
        org.telegram.ui.ActionBar.w0 w0Var = yiVar.f29350a1;
        if (oiVar.getLayoutParams().height > 0) {
            size = oiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z11) {
            oiVar.f25810y0 = true;
            i18 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
            oiVar.setPadding(i18, 0, i19, 0);
            oiVar.f25810y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) yiVar.f29367f1.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        oiVar.f25810y0 = true;
        int min = (int) (i20 / Math.min(4.5f, yiVar.A1.h()));
        if (yiVar.Y1 != min) {
            yiVar.Y1 = min;
            AndroidUtilities.runOnUIThread(new rg(oiVar, 21));
        }
        oiVar.f25810y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        oiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.h3) yiVar).backgroundPaddingLeft;
        gi giVar = yiVar.P0;
        di diVar = yiVar.E0;
        int i21 = size3 - (i13 * 2);
        if (!diVar.N && AndroidUtilities.dp(20.0f) >= 0 && !diVar.e && !diVar.O) {
            oiVar.f25810y0 = true;
            diVar.j();
            oiVar.f25810y0 = false;
        }
        if (!giVar.N && AndroidUtilities.dp(20.0f) >= 0 && !giVar.e && !giVar.O) {
            oiVar.f25810y0 = true;
            giVar.j();
            oiVar.f25810y0 = false;
        }
        if (yiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            zn znVar3 = yiVar.m0;
            if (!znVar3.G && !znVar3.f29733a1 && !znVar3.f29743f1 && !znVar3.f29747h1) {
                oiVar.f25810y0 = true;
                znVar3.a0();
                oiVar.f25810y0 = false;
            }
        }
        if (yiVar.f29389n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            zn znVar4 = yiVar.f29389n0;
            if (!znVar4.G && !znVar4.f29733a1 && !znVar4.f29743f1 && !znVar4.f29747h1) {
                oiVar.f25810y0 = true;
                znVar4.a0();
                oiVar.f25810y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.h3) yiVar).keyboardVisible;
            if (z10) {
                qi qiVar = yiVar.f29427y0;
                zn znVar5 = yiVar.m0;
                if (qiVar == znVar5 && znVar5.E != null && znVar5.f29747h1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    zn znVar6 = yiVar.f29389n0;
                    if (qiVar == znVar6 && znVar6.E != null && znVar6.f29747h1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = yiVar.o1();
            }
            r0.l1 f10 = r0.i0.f(oiVar);
            if (f10 != null) {
                i15 = f10.f41074a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.l1 f11 = r0.i0.f(oiVar);
            if (f11 != null) {
                i16 = f11.f41074a.f(527).d;
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
            oiVar.f25810y0 = true;
            qi qiVar2 = yiVar.f29427y0;
            if (qiVar2.f26424f) {
                qiVar2.e = AndroidUtilities.dp(62.0f) + max;
                yiVar.f29427y0.y(i21, size4);
            } else {
                qiVar2.e = AndroidUtilities.navigationBarHeight;
                qiVar2.y(i21, size4 - o12);
            }
            qi qiVar3 = yiVar.f29430z0;
            if (qiVar3 != null) {
                if (qiVar3.f26424f) {
                    qiVar3.e = AndroidUtilities.dp(62.0f) + max;
                    yiVar.f29430z0.y(i21, size4);
                } else {
                    qiVar3.e = AndroidUtilities.navigationBarHeight;
                    qiVar3.y(i21, size4 - o12);
                }
            }
            oiVar.f25810y0 = false;
        }
        int childCount = oiVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = oiVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == yiVar.f29416v1) {
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
                    if (qiVar4.f26424f) {
                        i25 = 0;
                    }
                }
                if (!diVar.l(childAt) && !giVar.l(childAt) && (((znVar = yiVar.m0) == null || childAt != znVar.E) && ((znVar2 = yiVar.f29389n0) == null || childAt != znVar2.E))) {
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
        bh.d dVar = this.B0.A0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.B0;
        if (yiVar.f29427y0.l(motionEvent)) {
            return true;
        }
        if (!yiVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f25810y0) {
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
        ai aiVar = yiVar.f29424x1;
        float f10 = f7 + yiVar.f29385l2;
        i10 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f25811z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                yiVar.f29427y0.setTranslationY(f10);
                if (yiVar.Q0 != 0 || yiVar.T0) {
                    yiVar.f29376i1.setTranslationY((yiVar.f29396p1 + f10) - yiVar.f29385l2);
                }
                aiVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                yiVar.f29427y0.setTranslationY(0.0f);
                aiVar.setTranslationY(((f10 / this.f25811z0) * aiVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - yiVar.f29385l2);
        i12 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType;
        if (i12 != 1) {
            yiVar.f29427y0.k(yiVar.f29385l2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
