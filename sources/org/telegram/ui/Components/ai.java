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
public final class ai extends xu0 {
    public int f26815s0;
    public final RectF f26816t0;
    public boolean f26817u0;
    public float f26818v0;
    public final zh f26819w0;
    public final ki f26820x0;

    public ai(ki kiVar, Context context) {
        super(context, null);
        this.f26820x0 = kiVar;
        this.f26816t0 = new RectF();
        this.f26819w0 = new zh(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i9;
        int i10;
        int i11;
        float f12;
        int dp;
        int dp2;
        float f13;
        float f14;
        int q12;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        Drawable drawable3;
        float f15;
        int themedColor;
        float alpha;
        int i13;
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
        ci ciVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ki kiVar = this.f26820x0;
        ng.d dVar = kiVar.A2;
        ng.d dVar2 = kiVar.f30180z2;
        if (Build.VERSION.SDK_INT >= 31 && kiVar.f30177y2 != null) {
            kiVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        ci ciVar2 = kiVar.f30160u0;
        hm hmVar = kiVar.m0;
        if ((ciVar2 == hmVar || (ciVar = kiVar.f30163v0) == hmVar || (ciVar2 == kiVar.f30114f0 && ciVar == null)) && ciVar2 != null) {
            canvas.save();
            float f16 = kiVar.f30122h2;
            boolean z10 = kiVar.f30103c0;
            fh.v vVar = kiVar.K0;
            mh mhVar = kiVar.f30111e1;
            canvas.translate(0.0f, f16);
            int alpha2 = (int) (ciVar2.getAlpha() * 255.0f);
            int h = ciVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (mhVar != null) {
                f10 = mhVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
            if (vVar != null) {
                f11 = vVar.getAlpha() * vVar.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i26 = dp4 + ((int) f11);
            int p12 = kiVar.p1(0);
            i9 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            int i27 = (p12 - i9) - i26;
            i10 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
            if (i10 == 1 || kiVar.f30144p1 != null) {
                i27 = (int) (ciVar2.getTranslationY() + i27);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i27;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i11 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            } else {
                i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f17 = 1.0f;
            if (h == 2) {
                if (i27 < i11) {
                    float f18 = i11 - i27;
                    i25 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    f14 = Math.max(0.0f, 1.0f - (f18 / i25));
                } else {
                    f14 = 1.0f;
                }
                f12 = 0.0f;
            } else {
                float f19 = i26;
                f12 = 0.0f;
                if (ciVar2 == kiVar.f30129k0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (ciVar2 == kiVar.f30123i0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (ciVar2 == kiVar.f30126j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f13 = f19 - dp2;
                    float alpha3 = kiVar.T0.getAlpha();
                    int i28 = (int) (((i11 - f13) + AndroidUtilities.statusBarHeight) * alpha3);
                    i27 -= i28;
                    dp5 -= i28;
                    f14 = 1.0f - alpha3;
                }
                f13 = f19 + dp;
                float alpha32 = kiVar.T0.getAlpha();
                int i282 = (int) (((i11 - f13) + AndroidUtilities.statusBarHeight) * alpha32);
                i27 -= i282;
                dp5 -= i282;
                f14 = 1.0f - alpha32;
            }
            if (!z10) {
                int i29 = AndroidUtilities.statusBarHeight;
                i27 += i29;
                dp5 += i29;
            }
            if (kiVar.f30160u0.f()) {
                q12 = kiVar.f30160u0.getCustomBackground();
            } else {
                q12 = kiVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i27, measuredWidth3, i12 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f26816t0;
            if (h == 2) {
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(q12);
                org.telegram.ui.ActionBar.f6.f23279t0.setAlpha(alpha2);
                i21 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i22 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                f15 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i23 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i24 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                rectF.set(i21, i22 + i27, measuredWidth4 - i23, AndroidUtilities.dp(24.0f) + i24 + i27);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != 1.0f && h != 2) || kiVar.f30160u0.e()) {
                Paint paint = org.telegram.ui.ActionBar.f6.f23279t0;
                if (kiVar.f30160u0.e()) {
                    q12 = kiVar.f30160u0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.f6.f23279t0.setAlpha(alpha2);
                i17 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i18 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i19 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i20 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                rectF.set(i17, i18 + i27, measuredWidth5 - i19, AndroidUtilities.dp(f15) + i20 + i27);
            }
            if (kiVar.f30160u0.e()) {
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(kiVar.f30160u0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.f6.f23279t0.setAlpha(alpha2);
                int p13 = kiVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i14 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i15 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i16 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                rectF.set(i14, (dp7 + i15 + i27) * f14, measuredWidth6 - i16, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.f6.f23279t0);
                canvas.restore();
            }
            if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f14 != f12) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f17 = f14;
                } else if (kiVar.f30160u0.e()) {
                    int customActionBarBackground = kiVar.f30160u0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i13 = -1;
                    } else {
                        i13 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i13);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f17 = 1.0f - alpha;
                    }
                } else {
                    themedColor = kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f17 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(themedColor);
                org.telegram.ui.ActionBar.f6.f23279t0.setAlpha((int) (ciVar2.getAlpha() * alpha4 * f17 * f14));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        float f11;
        float f12;
        int i9;
        int i10;
        int i11;
        int i12;
        int dp;
        int dp2;
        float f13;
        int i13;
        float f14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f15;
        int dp3;
        int dp4;
        float f16;
        int i20;
        float f17;
        int q12;
        boolean z10;
        boolean drawChild;
        int themedColor;
        float alpha;
        int i21;
        int i22;
        int i23;
        int i24;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i25;
        int i26;
        int i27;
        int i28;
        ci ciVar;
        int i29;
        ki kiVar = this.f26820x0;
        boolean z11 = kiVar.f30103c0;
        fh.v vVar = kiVar.K0;
        kg.d dVar = kiVar.f30167w0;
        mh mhVar = kiVar.f30111e1;
        r7 r7Var = kiVar.T0;
        if ((view instanceof ci) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, kiVar.f30122h2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            ci ciVar2 = (ci) view;
            int h = ciVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (mhVar != null) {
                i13 = AndroidUtilities.dp(mhVar.getAlpha() * 26.0f);
            } else {
                i13 = 0;
            }
            int i30 = dp5 + i13;
            if (vVar != null) {
                f14 = vVar.getAlpha() * vVar.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i31 = i30 + ((int) f14);
            if (ciVar2 == kiVar.f30160u0) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            int p12 = kiVar.p1(i14);
            i15 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            int i32 = (p12 - i15) - i31;
            i16 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
            if (i16 == 1 || kiVar.f30144p1 != null) {
                i32 = (int) (view.getTranslationY() + i32);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i32;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i17 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            int i33 = i17 + dp7;
            if (h == 0) {
                i18 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            } else {
                i18 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i34 = i18;
            if (h != 2) {
                i19 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                f15 = 0.0f;
                if (i19 + i32 < i34) {
                    float f18 = i31;
                    if (ciVar2 == kiVar.f30129k0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (ciVar2 == kiVar.f30123i0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (ciVar2 == kiVar.f30126j0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f16 = f18 - dp4;
                        i20 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i34 - i32) - i20) / f16);
                        int i35 = (int) ((i34 - f16) * min);
                        i32 -= i35;
                        dp6 -= i35;
                        i33 += i35;
                        f17 = 1.0f - min;
                    }
                    f16 = f18 + dp3;
                    i20 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i34 - i32) - i20) / f16);
                    int i352 = (int) ((i34 - f16) * min2);
                    i32 -= i352;
                    dp6 -= i352;
                    i33 += i352;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            } else if (i32 < i34) {
                i29 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                f17 = Math.max(0.0f, 1.0f - ((i34 - i32) / i29));
                f15 = 0.0f;
            } else {
                f15 = 0.0f;
                f17 = 1.0f;
            }
            if (!z11) {
                int i36 = AndroidUtilities.statusBarHeight;
                i32 += i36;
                dp6 += i36;
                i33 -= i36;
            }
            int i37 = i33;
            if (kiVar.f30160u0.f()) {
                q12 = kiVar.f30160u0.getCustomBackground();
            } else {
                q12 = kiVar.q1(true);
            }
            ci ciVar3 = kiVar.f30160u0;
            hm hmVar = kiVar.m0;
            if (ciVar3 != hmVar && (ciVar = kiVar.f30163v0) != hmVar && (ciVar3 != kiVar.f30114f0 || ciVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f26816t0;
            if (z10) {
                drawable = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
                drawable2.setBounds(0, i32, getMeasuredWidth(), i37);
                drawable3 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(q12);
                    org.telegram.ui.ActionBar.f6.f23279t0.setAlpha(alpha2);
                    i25 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                    i26 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i27 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                    i28 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    rectF.set(i25, i26 + i32, measuredWidth - i27, AndroidUtilities.dp(24.0f) + i28 + i32);
                }
            }
            if (view != kiVar.f30117g0 && view != kiVar.f30140o0 && view != kiVar.f30120h0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f17 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(q12);
                    org.telegram.ui.ActionBar.f6.f23279t0.setAlpha(alpha2);
                    i21 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                    i22 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i23 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                    i24 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    rectF.set(i21, i22 + i32, measuredWidth2 - i23, AndroidUtilities.dp(24.0f) + i24 + i32);
                }
                if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f17 != f15) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f17;
                    } else {
                        themedColor = kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                        if (mhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - mhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.f6.f23279t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == r7Var) {
            float alpha4 = r7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = r7Var.getX();
            ci ciVar4 = kiVar.f30160u0;
            if (ciVar4 != null) {
                int h10 = ciVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (mhVar != null) {
                    f11 = mhVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f11 * AndroidUtilities.dp(26.0f)));
                if (vVar != null) {
                    f12 = vVar.getAlpha() * vVar.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i38 = dp10 + ((int) f12);
                int p13 = kiVar.p1(0);
                i9 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int i39 = (p13 - i9) - i38;
                i10 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
                if (i10 == 1 || kiVar.f30144p1 != null) {
                    i39 = (int) (ciVar4.getTranslationY() + i39);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i39;
                if (h10 == 0) {
                    i11 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                } else {
                    i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (h10 != 2) {
                    i12 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    if (i12 + i39 < i11) {
                        float f19 = i38;
                        if (ciVar4 == kiVar.f30129k0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (ciVar4 == kiVar.f30123i0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (ciVar4 == kiVar.f30126j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f13 = f19 - dp2;
                            dp11 -= (int) (r7Var.getAlpha() * ((i11 - f13) + AndroidUtilities.statusBarHeight));
                        }
                        f13 = f19 + dp;
                        dp11 -= (int) (r7Var.getAlpha() * ((i11 - f13) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z11) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f10 = dp11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, r7Var.getX() + r7Var.getWidth(), r7Var.getY() + r7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof wy) && dVar != null) {
            canvas.save();
            dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(dVar.h.f14810k);
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
        zh zhVar = this.f26819w0;
        zhVar.f23715b = this;
        zhVar.c();
        ki kiVar = this.f26820x0;
        kiVar.A0.setAdjustPanLayoutHelper(zhVar);
        kiVar.L0.setAdjustPanLayoutHelper(zhVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26819w0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f26820x0.f30103c0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i9;
        float f10;
        ki kiVar = this.f26820x0;
        int[] iArr = kiVar.X1;
        if (kiVar.f30160u0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i10 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                fh.v vVar = kiVar.K0;
                int i11 = iArr[0];
                i9 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int i12 = i11 - (i9 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                mh mhVar = kiVar.f30111e1;
                if (mhVar != null) {
                    i10 = AndroidUtilities.dp(mhVar.getAlpha() * 26.0f);
                }
                int i13 = i12 - (dp + i10);
                if (vVar != null) {
                    f10 = vVar.getAlpha() * vVar.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i13 - ((int) f10));
                if (!kiVar.f30103c0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y10 < dp2 && kiVar.T0.getAlpha() == 0.0f) {
                    kiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size;
        int i11;
        int i12;
        int i13;
        float f10;
        jn jnVar;
        jn jnVar2;
        boolean z10;
        int o12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ai aiVar = this;
        ki kiVar = aiVar.f26820x0;
        boolean z11 = kiVar.f30103c0;
        org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
        if (aiVar.getLayoutParams().height > 0) {
            size = aiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z11) {
            aiVar.f26817u0 = true;
            i17 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
            i18 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
            aiVar.setPadding(i17, 0, i18, 0);
            aiVar.f26817u0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i9);
        i11 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
        int i19 = size2 - (i11 * 2);
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
        ((FrameLayout.LayoutParams) kiVar.f30100b1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        aiVar.f26817u0 = true;
        int min = (int) (i19 / Math.min(4.5f, kiVar.f30168w1.h()));
        if (kiVar.U1 != min) {
            kiVar.U1 = min;
            AndroidUtilities.runOnUIThread(new fg(aiVar, 21));
        }
        aiVar.f26817u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i9);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        aiVar.setMeasuredDimension(size3, size4);
        i12 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
        th thVar = kiVar.L0;
        qh qhVar = kiVar.A0;
        int i20 = size3 - (i12 * 2);
        if (!qhVar.J && AndroidUtilities.dp(20.0f) >= 0 && !qhVar.f33124e && !qhVar.K) {
            aiVar.f26817u0 = true;
            qhVar.j();
            aiVar.f26817u0 = false;
        }
        if (!thVar.J && AndroidUtilities.dp(20.0f) >= 0 && !thVar.f33124e && !thVar.K) {
            aiVar.f26817u0 = true;
            thVar.j();
            aiVar.f26817u0 = false;
        }
        if (kiVar.f30123i0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            jn jnVar3 = kiVar.f30123i0;
            if (!jnVar3.C && !jnVar3.W0 && !jnVar3.f29767b1 && !jnVar3.f29771d1) {
                aiVar.f26817u0 = true;
                jnVar3.Z();
                aiVar.f26817u0 = false;
            }
        }
        if (kiVar.f30126j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            jn jnVar4 = kiVar.f30126j0;
            if (!jnVar4.C && !jnVar4.W0 && !jnVar4.f29767b1 && !jnVar4.f29771d1) {
                aiVar.f26817u0 = true;
                jnVar4.Z();
                aiVar.f26817u0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) kiVar).keyboardVisible;
            if (z10) {
                ci ciVar = kiVar.f30160u0;
                jn jnVar5 = kiVar.f30123i0;
                if (ciVar == jnVar5 && jnVar5.A != null && jnVar5.f29771d1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    jn jnVar6 = kiVar.f30126j0;
                    if (ciVar == jnVar6 && jnVar6.A != null && jnVar6.f29771d1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = kiVar.o1();
            }
            r0.m1 f11 = r0.j0.f(aiVar);
            if (f11 != null) {
                i14 = f11.f46929a.f(8).d;
            } else {
                i14 = 0;
            }
            r0.m1 f12 = r0.j0.f(aiVar);
            if (f12 != null) {
                i15 = f12.f46929a.f(527).d;
            } else {
                i15 = 0;
            }
            Math.max(i15, o12);
            if (i14 > 0) {
                i16 = 0;
            } else {
                i16 = AndroidUtilities.navigationBarHeight;
            }
            int max = Math.max(i16, o12);
            aiVar.f26817u0 = true;
            ci ciVar2 = kiVar.f30160u0;
            if (ciVar2.f27496f) {
                ciVar2.f27495e = AndroidUtilities.dp(62.0f) + max;
                kiVar.f30160u0.y(i20, size4);
            } else {
                ciVar2.f27495e = AndroidUtilities.navigationBarHeight;
                ciVar2.y(i20, size4 - o12);
            }
            ci ciVar3 = kiVar.f30163v0;
            if (ciVar3 != null) {
                if (ciVar3.f27496f) {
                    ciVar3.f27495e = AndroidUtilities.dp(62.0f) + max;
                    kiVar.f30163v0.y(i20, size4);
                } else {
                    ciVar3.f27495e = AndroidUtilities.navigationBarHeight;
                    ciVar3.y(i20, size4 - o12);
                }
            }
            aiVar.f26817u0 = false;
        }
        int childCount = aiVar.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            int i22 = i21;
            View childAt = aiVar.getChildAt(i22);
            if (childAt == null || childAt.getVisibility() == 8) {
                i13 = i22;
            } else if (childAt == kiVar.f30151r1) {
                i13 = i22;
                aiVar.measureChildWithMargins(childAt, i9, 0, makeMeasureSpec, 0);
            } else {
                i13 = i22;
                int i23 = AndroidUtilities.statusBarHeight;
                int i24 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof ci) {
                    ci ciVar4 = (ci) childAt;
                    if (ciVar4.h) {
                        i23 = 0;
                    }
                    if (ciVar4.f27496f) {
                        i24 = 0;
                    }
                }
                if (!qhVar.l(childAt) && !thVar.l(childAt) && (((jnVar = kiVar.f30123i0) == null || childAt != jnVar.A) && ((jnVar2 = kiVar.f30126j0) == null || childAt != jnVar2.A))) {
                    measureChildWithMargins(childAt, i9, 0, makeMeasureSpec, i23 + i24);
                } else if (z11) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    if (AndroidUtilities.isTablet()) {
                        f10 = 200.0f;
                    } else {
                        f10 = 320.0f;
                    }
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), 1073741824));
                }
            }
            i21 = i13 + 1;
            aiVar = this;
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int i13;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i9, i10, i11, i12);
        int i14 = 0;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            if (roundedCorner == null) {
                i13 = 0;
            } else {
                i13 = roundedCorner.getRadius();
            }
            if (roundedCorner2 != null) {
                i14 = roundedCorner2.getRadius();
            }
        } else {
            i13 = 0;
        }
        kg.d dVar = this.f26820x0.f30167w0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i14, i13);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.f26820x0;
        if (kiVar.f30160u0.l(motionEvent)) {
            return true;
        }
        if (!kiVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f26817u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        int i9;
        int i10;
        int i11;
        ViewGroup viewGroup;
        ki kiVar = this.f26820x0;
        mh mhVar = kiVar.f30158t1;
        float f11 = f10 + kiVar.f30122h2;
        i9 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i9 == 0) {
            this.f26818v0 = f11;
        }
        i10 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i10 == 1) {
            if (f11 < 0.0f) {
                kiVar.f30160u0.setTranslationY(f11);
                if (kiVar.M0 != 0 || kiVar.P0) {
                    kiVar.f30111e1.setTranslationY((kiVar.l1 + f11) - kiVar.f30122h2);
                }
                mhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                kiVar.f30160u0.setTranslationY(0.0f);
                mhVar.setTranslationY(((f11 / this.f26818v0) * mhVar.getMeasuredHeight()) + (-f11));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f11 - kiVar.f30122h2);
        i11 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i11 != 1) {
            kiVar.f30160u0.k(kiVar.f30122h2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
