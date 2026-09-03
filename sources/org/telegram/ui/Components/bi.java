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
public final class bi extends qv0 {
    public int f23692t0;
    public final RectF f23693u0;
    public boolean f23694v0;
    public float f23695w0;
    public final ai f23696x0;
    public final li f23697y0;

    public bi(li liVar, Context context) {
        super(context, null);
        this.f23697y0 = liVar;
        this.f23693u0 = new RectF();
        this.f23696x0 = new ai(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        float f12;
        int dp;
        int dp2;
        float f13;
        float f14;
        int q12;
        Drawable drawable;
        Drawable drawable2;
        int i13;
        Drawable drawable3;
        float f15;
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
        di diVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        li liVar = this.f23697y0;
        sg.d dVar = liVar.B2;
        sg.d dVar2 = liVar.A2;
        if (Build.VERSION.SDK_INT >= 31 && liVar.f26761z2 != null) {
            liVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        di diVar2 = liVar.f26744v0;
        nm nmVar = liVar.f26718n0;
        if ((diVar2 == nmVar || (diVar = liVar.f26748w0) == nmVar || (diVar2 == liVar.f26698g0 && diVar == null)) && diVar2 != null) {
            canvas.save();
            float f16 = liVar.f26706i2;
            boolean z4 = liVar.f26688d0;
            ah.e eVar = liVar.L0;
            mh mhVar = liVar.f26696f1;
            canvas.translate(0.0f, f16);
            int alpha2 = (int) (diVar2.getAlpha() * 255.0f);
            int h = diVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f);
            if (mhVar != null) {
                f10 = mhVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int dp4 = dp3 + ((int) (f10 * AndroidUtilities.dp(26.0f)));
            if (eVar != null) {
                f11 = eVar.getAlpha() * eVar.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i27 = dp4 + ((int) f11);
            int p12 = liVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            int i28 = (p12 - i10) - i27;
            i11 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
            if (i11 == 1 || liVar.f26728q1 != null) {
                i28 = (int) (diVar2.getTranslationY() + i28);
            }
            int dp5 = AndroidUtilities.dp(20.0f) + i28;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            if (h == 0) {
                i12 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            } else {
                i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            float f17 = 1.0f;
            if (h == 2) {
                if (i28 < i12) {
                    float f18 = i12 - i28;
                    i26 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    f14 = Math.max(0.0f, 1.0f - (f18 / i26));
                } else {
                    f14 = 1.0f;
                }
                f12 = 0.0f;
            } else {
                float f19 = i27;
                f12 = 0.0f;
                if (diVar2 == liVar.f26713l0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (diVar2 == liVar.f26707j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (diVar2 == liVar.f26710k0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f13 = f19 - dp2;
                    float alpha3 = liVar.U0.getAlpha();
                    int i29 = (int) (((i12 - f13) + AndroidUtilities.statusBarHeight) * alpha3);
                    i28 -= i29;
                    dp5 -= i29;
                    f14 = 1.0f - alpha3;
                }
                f13 = f19 + dp;
                float alpha32 = liVar.U0.getAlpha();
                int i292 = (int) (((i12 - f13) + AndroidUtilities.statusBarHeight) * alpha32);
                i28 -= i292;
                dp5 -= i292;
                f14 = 1.0f - alpha32;
            }
            if (!z4) {
                int i30 = AndroidUtilities.statusBarHeight;
                i28 += i30;
                dp5 += i30;
            }
            if (liVar.f26744v0.f()) {
                q12 = liVar.f26744v0.getCustomBackground();
            } else {
                q12 = liVar.q1(true);
            }
            drawable = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp6 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i13 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            drawable2.setBounds(0, i28, measuredWidth3, i13 + dp6);
            drawable3 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.f23693u0;
            if (h == 2) {
                org.telegram.ui.ActionBar.j6.f20160t0.setColor(q12);
                org.telegram.ui.ActionBar.j6.f20160t0.setAlpha(alpha2);
                i22 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                f15 = 24.0f;
                int measuredWidth4 = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i25 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, measuredWidth4 - i24, AndroidUtilities.dp(24.0f) + i25 + i28);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != 1.0f && h != 2) || liVar.f26744v0.e()) {
                Paint paint = org.telegram.ui.ActionBar.j6.f20160t0;
                if (liVar.f26744v0.e()) {
                    q12 = liVar.f26744v0.getCustomActionBarBackground();
                }
                paint.setColor(q12);
                org.telegram.ui.ActionBar.j6.f20160t0.setAlpha(alpha2);
                i18 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, measuredWidth5 - i20, AndroidUtilities.dp(f15) + i21 + i28);
            }
            if (liVar.f26744v0.e()) {
                org.telegram.ui.ActionBar.j6.f20160t0.setColor(liVar.f26744v0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.j6.f20160t0.setAlpha(alpha2);
                int p13 = liVar.p1(0);
                if (!z4) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i15 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int dp7 = AndroidUtilities.dp(12.0f);
                int measuredWidth6 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                rectF.set(i15, (dp7 + i16 + i28) * f14, measuredWidth6 - i17, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.j6.f20160t0);
                canvas.restore();
            }
            if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f14 != f12) {
                int dp8 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp8) / 2, dp5, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp5);
                if (h == 2) {
                    themedColor = 536870912;
                    f17 = f14;
                } else if (liVar.f26744v0.e()) {
                    int customActionBarBackground = liVar.f26744v0.getCustomActionBarBackground();
                    if (i0.a.f(customActionBarBackground) < 0.5d) {
                        i14 = -1;
                    } else {
                        i14 = -16777216;
                    }
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i14);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f17 = 1.0f - alpha;
                    }
                } else {
                    themedColor = liVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f17 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.j6.f20160t0.setColor(themedColor);
                org.telegram.ui.ActionBar.j6.f20160t0.setAlpha((int) (diVar2.getAlpha() * alpha4 * f17 * f14));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20160t0);
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
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int dp2;
        float f13;
        int i14;
        float f14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f15;
        int dp3;
        int dp4;
        float f16;
        int i21;
        float f17;
        int q12;
        boolean z4;
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
        di diVar;
        int i30;
        li liVar = this.f23697y0;
        boolean z10 = liVar.f26688d0;
        ah.e eVar = liVar.L0;
        pg.b bVar = liVar.f26752x0;
        mh mhVar = liVar.f26696f1;
        eg.l1 l1Var = liVar.U0;
        if ((view instanceof di) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, liVar.f26706i2);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            di diVar2 = (di) view;
            int h = diVar2.h();
            int dp5 = AndroidUtilities.dp(13.0f);
            if (mhVar != null) {
                i14 = AndroidUtilities.dp(mhVar.getAlpha() * 26.0f);
            } else {
                i14 = 0;
            }
            int i31 = dp5 + i14;
            if (eVar != null) {
                f14 = eVar.getAlpha() * eVar.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i32 = i31 + ((int) f14);
            if (diVar2 == liVar.f26744v0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int p12 = liVar.p1(i15);
            i16 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            int i33 = (p12 - i16) - i32;
            i17 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
            if (i17 == 1 || liVar.f26728q1 != null) {
                i33 = (int) (view.getTranslationY() + i33);
            }
            int dp6 = AndroidUtilities.dp(20.0f) + i33;
            int dp7 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i18 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            int i34 = i18 + dp7;
            if (h == 0) {
                i19 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            } else {
                i19 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            int i35 = i19;
            if (h != 2) {
                i20 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                f15 = 0.0f;
                if (i20 + i33 < i35) {
                    float f18 = i32;
                    if (diVar2 == liVar.f26713l0) {
                        dp3 = AndroidUtilities.dp(11.0f);
                    } else {
                        if (diVar2 == liVar.f26707j0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else if (diVar2 == liVar.f26710k0) {
                            dp4 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp3 = AndroidUtilities.dp(4.0f);
                        }
                        f16 = f18 - dp4;
                        i21 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                        float min = Math.min(1.0f, ((i35 - i33) - i21) / f16);
                        int i36 = (int) ((i35 - f16) * min);
                        i33 -= i36;
                        dp6 -= i36;
                        i34 += i36;
                        f17 = 1.0f - min;
                    }
                    f16 = f18 + dp3;
                    i21 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    float min2 = Math.min(1.0f, ((i35 - i33) - i21) / f16);
                    int i362 = (int) ((i35 - f16) * min2);
                    i33 -= i362;
                    dp6 -= i362;
                    i34 += i362;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            } else if (i33 < i35) {
                i30 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                f17 = Math.max(0.0f, 1.0f - ((i35 - i33) / i30));
                f15 = 0.0f;
            } else {
                f15 = 0.0f;
                f17 = 1.0f;
            }
            if (!z10) {
                int i37 = AndroidUtilities.statusBarHeight;
                i33 += i37;
                dp6 += i37;
                i34 -= i37;
            }
            int i38 = i34;
            if (liVar.f26744v0.f()) {
                q12 = liVar.f26744v0.getCustomBackground();
            } else {
                q12 = liVar.q1(true);
            }
            di diVar3 = liVar.f26744v0;
            nm nmVar = liVar.f26718n0;
            if (diVar3 != nmVar && (diVar = liVar.f26748w0) != nmVar && (diVar3 != liVar.f26698g0 || diVar != null)) {
                z4 = true;
            } else {
                z4 = false;
            }
            RectF rectF = this.f23693u0;
            if (z4) {
                drawable = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
                drawable.setAlpha(alpha2);
                drawable2 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
                drawable2.setBounds(0, i33, getMeasuredWidth(), i38);
                drawable3 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
                drawable3.draw(canvas);
                if (h == 2) {
                    org.telegram.ui.ActionBar.j6.f20160t0.setColor(q12);
                    org.telegram.ui.ActionBar.j6.f20160t0.setAlpha(alpha2);
                    i26 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                    i27 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i28 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                    i29 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    rectF.set(i26, i27 + i33, measuredWidth - i28, AndroidUtilities.dp(24.0f) + i29 + i33);
                }
            }
            if (view != liVar.f26701h0 && view != liVar.f26724p0 && view != liVar.f26704i0) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z4) {
                if (f17 != 1.0f && h != 2) {
                    org.telegram.ui.ActionBar.j6.f20160t0.setColor(q12);
                    org.telegram.ui.ActionBar.j6.f20160t0.setAlpha(alpha2);
                    i22 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                    i23 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    int measuredWidth2 = getMeasuredWidth();
                    i24 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                    i25 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    rectF.set(i22, i23 + i33, measuredWidth2 - i24, AndroidUtilities.dp(24.0f) + i25 + i33);
                }
                if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f17 != f15) {
                    int dp8 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp8) / 2, dp6, (getMeasuredWidth() + dp8) / 2, AndroidUtilities.dp(4.0f) + dp6);
                    if (h == 2) {
                        themedColor = 536870912;
                        alpha = f17;
                    } else {
                        themedColor = liVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                        if (mhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - mhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f20160t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.j6.f20160t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20160t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == l1Var) {
            float alpha4 = l1Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = l1Var.getX();
            di diVar4 = liVar.f26744v0;
            if (diVar4 != null) {
                int h9 = diVar4.h();
                int dp9 = AndroidUtilities.dp(13.0f);
                if (mhVar != null) {
                    f11 = mhVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int dp10 = dp9 + ((int) (f11 * AndroidUtilities.dp(26.0f)));
                if (eVar != null) {
                    f12 = eVar.getAlpha() * eVar.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i39 = dp10 + ((int) f12);
                int p13 = liVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int i40 = (p13 - i10) - i39;
                i11 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
                if (i11 == 1 || liVar.f26728q1 != null) {
                    i40 = (int) (diVar4.getTranslationY() + i40);
                }
                int dp11 = AndroidUtilities.dp(20.0f) + i40;
                if (h9 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                } else {
                    i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                }
                if (h9 != 2) {
                    i13 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    if (i13 + i40 < i12) {
                        float f19 = i39;
                        if (diVar4 == liVar.f26713l0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (diVar4 == liVar.f26707j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (diVar4 == liVar.f26710k0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f13 = f19 - dp2;
                            dp11 -= (int) (l1Var.getAlpha() * ((i12 - f13) + AndroidUtilities.statusBarHeight));
                        }
                        f13 = f19 + dp;
                        dp11 -= (int) (l1Var.getAlpha() * ((i12 - f13) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp11 += AndroidUtilities.statusBarHeight;
                }
                f10 = dp11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, l1Var.getX() + l1Var.getWidth(), l1Var.getY() + l1Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof kz) && bVar != null) {
            canvas.save();
            bVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(bVar.h.f41237k);
            bVar.draw(canvas);
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
        ai aiVar = this.f23696x0;
        aiVar.f20520b = this;
        aiVar.c();
        li liVar = this.f23697y0;
        liVar.B0.setAdjustPanLayoutHelper(aiVar);
        liVar.M0.setAdjustPanLayoutHelper(aiVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23696x0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4 = this.f23697y0.f26688d0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        li liVar = this.f23697y0;
        int[] iArr = liVar.Y1;
        if (liVar.f26744v0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i11 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ah.e eVar = liVar.L0;
                int i12 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int i13 = i12 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                mh mhVar = liVar.f26696f1;
                if (mhVar != null) {
                    i11 = AndroidUtilities.dp(mhVar.getAlpha() * 26.0f);
                }
                int i14 = i13 - (dp + i11);
                if (eVar != null) {
                    f10 = eVar.getAlpha() * eVar.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int dp2 = AndroidUtilities.dp(20.0f) + (i14 - ((int) f10));
                if (!liVar.f26688d0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y10 < dp2 && liVar.U0.getAlpha() == 0.0f) {
                    liVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        int i13;
        int i14;
        float f10;
        pn pnVar;
        pn pnVar2;
        boolean z4;
        int o12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        bi biVar = this;
        li liVar = biVar.f23697y0;
        boolean z10 = liVar.f26688d0;
        org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
        if (biVar.getLayoutParams().height > 0) {
            size = biVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z10) {
            biVar.f23694v0 = true;
            i18 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
            biVar.setPadding(i18, 0, i19, 0);
            biVar.f23694v0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) liVar.f26686c1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        biVar.f23694v0 = true;
        int min = (int) (i20 / Math.min(4.5f, liVar.f26753x1.h()));
        if (liVar.V1 != min) {
            liVar.V1 = min;
            AndroidUtilities.runOnUIThread(new fg(biVar, 21));
        }
        biVar.f23694v0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        biVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
        th thVar = liVar.M0;
        qh qhVar = liVar.B0;
        int i21 = size3 - (i13 * 2);
        if (!qhVar.K && AndroidUtilities.dp(20.0f) >= 0 && !qhVar.e && !qhVar.L) {
            biVar.f23694v0 = true;
            qhVar.j();
            biVar.f23694v0 = false;
        }
        if (!thVar.K && AndroidUtilities.dp(20.0f) >= 0 && !thVar.e && !thVar.L) {
            biVar.f23694v0 = true;
            thVar.j();
            biVar.f23694v0 = false;
        }
        if (liVar.f26707j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            pn pnVar3 = liVar.f26707j0;
            if (!pnVar3.D && !pnVar3.X0 && !pnVar3.f27937c1 && !pnVar3.f27941e1) {
                biVar.f23694v0 = true;
                pnVar3.a0();
                biVar.f23694v0 = false;
            }
        }
        if (liVar.f26710k0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            pn pnVar4 = liVar.f26710k0;
            if (!pnVar4.D && !pnVar4.X0 && !pnVar4.f27937c1 && !pnVar4.f27941e1) {
                biVar.f23694v0 = true;
                pnVar4.a0();
                biVar.f23694v0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z4 = ((org.telegram.ui.ActionBar.g3) liVar).keyboardVisible;
            if (z4) {
                di diVar = liVar.f26744v0;
                pn pnVar5 = liVar.f26707j0;
                if (diVar == pnVar5 && pnVar5.B != null && pnVar5.f27941e1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    pn pnVar6 = liVar.f26710k0;
                    if (diVar == pnVar6 && pnVar6.B != null && pnVar6.f27941e1) {
                        o12 = AndroidUtilities.dp(120.0f);
                    } else {
                        o12 = 0;
                    }
                }
            } else {
                o12 = liVar.o1();
            }
            r0.m1 f11 = r0.j0.f(biVar);
            if (f11 != null) {
                i15 = f11.f43154a.f(8).d;
            } else {
                i15 = 0;
            }
            r0.m1 f12 = r0.j0.f(biVar);
            if (f12 != null) {
                i16 = f12.f43154a.f(527).d;
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
            biVar.f23694v0 = true;
            di diVar2 = liVar.f26744v0;
            if (diVar2.f24284f) {
                diVar2.e = AndroidUtilities.dp(62.0f) + max;
                liVar.f26744v0.y(i21, size4);
            } else {
                diVar2.e = AndroidUtilities.navigationBarHeight;
                diVar2.y(i21, size4 - o12);
            }
            di diVar3 = liVar.f26748w0;
            if (diVar3 != null) {
                if (diVar3.f24284f) {
                    diVar3.e = AndroidUtilities.dp(62.0f) + max;
                    liVar.f26748w0.y(i21, size4);
                } else {
                    diVar3.e = AndroidUtilities.navigationBarHeight;
                    diVar3.y(i21, size4 - o12);
                }
            }
            biVar.f23694v0 = false;
        }
        int childCount = biVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            int i23 = i22;
            View childAt = biVar.getChildAt(i23);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i23;
            } else if (childAt == liVar.f26736s1) {
                i14 = i23;
                biVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i23;
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof di) {
                    di diVar4 = (di) childAt;
                    if (diVar4.h) {
                        i24 = 0;
                    }
                    if (diVar4.f24284f) {
                        i25 = 0;
                    }
                }
                if (!qhVar.l(childAt) && !thVar.l(childAt) && (((pnVar = liVar.f26707j0) == null || childAt != pnVar.B) && ((pnVar2 = liVar.f26710k0) == null || childAt != pnVar2.B))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i24 + i25);
                } else if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    if (AndroidUtilities.isTablet()) {
                        f10 = 200.0f;
                    } else {
                        f10 = 320.0f;
                    }
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), 1073741824));
                }
            }
            i22 = i14 + 1;
            biVar = this;
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
        pg.b bVar = this.f23697y0.f26752x0;
        if (bVar != null) {
            bVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        li liVar = this.f23697y0;
        if (liVar.f26744v0.l(motionEvent)) {
            return true;
        }
        if (!liVar.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f23694v0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        li liVar = this.f23697y0;
        mh mhVar = liVar.f26742u1;
        float f11 = f10 + liVar.f26706i2;
        i10 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.f23695w0 = f11;
        }
        i11 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f11 < 0.0f) {
                liVar.f26744v0.setTranslationY(f11);
                if (liVar.N0 != 0 || liVar.Q0) {
                    liVar.f26696f1.setTranslationY((liVar.f26715m1 + f11) - liVar.f26706i2);
                }
                mhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                liVar.f26744v0.setTranslationY(0.0f);
                mhVar.setTranslationY(((f11 / this.f23695w0) * mhVar.getMeasuredHeight()) + (-f11));
            }
            viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f11 - liVar.f26706i2);
        i12 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i12 != 1) {
            liVar.f26744v0.k(liVar.f26706i2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
    }
}
