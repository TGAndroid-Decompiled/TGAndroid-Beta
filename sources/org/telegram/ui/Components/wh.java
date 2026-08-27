package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class wh extends zu0 {

    public int f34177s0;

    public final RectF f34178t0;

    public boolean f34179u0;

    public float f34180v0;

    public final vh f34181w0;

    public final gi f34182x0;

    public wh(gi giVar, Context context) {
        super(context, null);
        this.f34182x0 = giVar;
        this.f34178t0 = new RectF();
        this.f34181w0 = new vh(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int iDp;
        float f11;
        float fMax;
        float f12;
        int themedColor;
        float alpha;
        yh yhVar;
        gi giVar = this.f34182x0;
        og.d dVar = giVar.A2;
        og.d dVar2 = giVar.f28716z2;
        if (Build.VERSION.SDK_INT >= 31 && giVar.f28713y2 != null) {
            giVar.Z0();
            if (dVar2 != null) {
                dVar2.h(((org.telegram.ui.ActionBar.e3) giVar).containerView.getMeasuredWidth(), ((org.telegram.ui.ActionBar.e3) giVar).containerView.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                dVar.h(((org.telegram.ui.ActionBar.e3) giVar).containerView.getMeasuredWidth(), ((org.telegram.ui.ActionBar.e3) giVar).containerView.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        yh yhVar2 = giVar.f28696u0;
        em emVar = giVar.m0;
        if ((yhVar2 == emVar || (yhVar = giVar.f28699v0) == emVar || (yhVar2 == giVar.f28650f0 && yhVar == null)) && yhVar2 != null) {
            canvas.save();
            float f13 = giVar.f28658h2;
            boolean z10 = giVar.f28639c0;
            ag.y1 y1Var = giVar.K0;
            ih ihVar = giVar.f28647e1;
            canvas.translate(0.0f, f13);
            int alpha2 = (int) (yhVar2.getAlpha() * 255.0f);
            int iH = yhVar2.h();
            int iDp2 = AndroidUtilities.dp(13.0f) + ((int) ((ihVar != null ? ihVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f));
            int iP1 = (giVar.p1(0) - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop) - iDp2;
            if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType == 1 || giVar.f28680p1 != null) {
                iP1 = (int) (yhVar2.getTranslationY() + iP1);
            }
            int iDp3 = AndroidUtilities.dp(20.0f) + iP1;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = iH != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
            float f14 = 1.0f;
            if (iH == 2) {
                fMax = iP1 < currentActionBarHeight ? Math.max(0.0f, 1.0f - ((currentActionBarHeight - iP1) / ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop)) : 1.0f;
                f10 = 0.0f;
            } else {
                float f15 = iDp2;
                f10 = 0.0f;
                if (yhVar2 == giVar.f28665k0) {
                    iDp = AndroidUtilities.dp(11.0f);
                } else if (yhVar2 == giVar.f28659i0 || yhVar2 == giVar.f28662j0) {
                    int iDp4 = AndroidUtilities.dp(3.0f);
                    f11 = f15 - iDp4;
                    float alpha3 = giVar.T0.getAlpha();
                    int i10 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha3);
                    iP1 -= i10;
                    iDp3 -= i10;
                    fMax = 1.0f - alpha3;
                } else {
                    iDp = AndroidUtilities.dp(4.0f);
                }
                f11 = f15 + iDp;
                float alpha4 = giVar.T0.getAlpha();
                int i11 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha4);
                iP1 -= i11;
                iDp3 -= i11;
                fMax = 1.0f - alpha4;
            }
            if (!z10) {
                int i12 = AndroidUtilities.statusBarHeight;
                iP1 += i12;
                iDp3 += i12;
            }
            int customBackground = giVar.f28696u0.f() ? giVar.f28696u0.getCustomBackground() : giVar.q1(true);
            ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable.setAlpha(alpha2);
            ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable.setBounds(0, iP1, getMeasuredWidth(), ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + AndroidUtilities.dp(45.0f) + getMeasuredHeight());
            ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable.draw(canvas);
            RectF rectF = this.f34178t0;
            if (iH == 2) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha(alpha2);
                f12 = 24.0f;
                rectF.set(((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP1, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP1);
            } else {
                f12 = 24.0f;
            }
            if ((fMax != 1.0f && iH != 2) || giVar.f28696u0.e()) {
                Paint paint = org.telegram.ui.ActionBar.g6.f23333t0;
                if (giVar.f28696u0.e()) {
                    customBackground = giVar.f28696u0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha(alpha2);
                rectF.set(((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP1, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, AndroidUtilities.dp(f12) + ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP1);
            }
            if (giVar.f28696u0.e()) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(giVar.f28696u0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha(alpha2);
                int iP2 = giVar.p1(0);
                if (!z10) {
                    iP2 += AndroidUtilities.statusBarHeight;
                }
                rectF.set(((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, (AndroidUtilities.dp(12.0f) + ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP1) * fMax, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + iP2);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.g6.f23333t0);
                canvas.restore();
            }
            if ((ihVar == null || ihVar.getAlpha() != 1.0f) && fMax != f10) {
                int iDp5 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - iDp5) / 2, iDp3, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + iDp3);
                if (iH == 2) {
                    themedColor = 536870912;
                    f14 = fMax;
                } else if (giVar.f28696u0.e()) {
                    int customActionBarBackground = giVar.f28696u0.getCustomActionBarBackground();
                    themedColor = i0.b.d(0.5f, customActionBarBackground, i0.b.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (ihVar != null) {
                        alpha = ihVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                } else {
                    themedColor = giVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    if (ihVar != null) {
                        alpha = ihVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                }
                int iAlpha = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha((int) (yhVar2.getAlpha() * iAlpha * f14 * fMax));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        int iDp;
        float f11;
        float f12;
        int iDp2;
        float f13;
        float fMax;
        boolean zDrawChild;
        int themedColor;
        float alpha;
        yh yhVar;
        gi giVar = this.f34182x0;
        boolean z10 = giVar.f28639c0;
        ag.y1 y1Var = giVar.K0;
        lg.d dVar = giVar.f28703w0;
        ih ihVar = giVar.f28647e1;
        ag.d2 d2Var = giVar.T0;
        if (!(view instanceof yh) || view.getAlpha() <= 0.0f) {
            if (view != d2Var) {
                if (!(view instanceof yy) || dVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dVar.h.f15588k);
                dVar.draw(canvas);
                boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild2;
            }
            float alpha2 = d2Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x8 = d2Var.getX();
            yh yhVar2 = giVar.f28696u0;
            if (yhVar2 != null) {
                int iH = yhVar2.h();
                int iDp3 = AndroidUtilities.dp(13.0f) + ((int) ((ihVar != null ? ihVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f));
                int iP1 = (giVar.p1(0) - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop) - iDp3;
                if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType == 1 || giVar.f28680p1 != null) {
                    iP1 = (int) (yhVar2.getTranslationY() + iP1);
                }
                int iDp4 = AndroidUtilities.dp(20.0f) + iP1;
                int currentActionBarHeight = iH != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                if (iH != 2 && ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP1 < currentActionBarHeight) {
                    float f14 = iDp3;
                    if (yhVar2 == giVar.f28665k0) {
                        iDp = AndroidUtilities.dp(11.0f);
                    } else if (yhVar2 == giVar.f28659i0 || yhVar2 == giVar.f28662j0) {
                        int iDp5 = AndroidUtilities.dp(3.0f);
                        f11 = f14 - iDp5;
                        iDp4 -= (int) (d2Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                    } else {
                        iDp = AndroidUtilities.dp(4.0f);
                    }
                    f11 = f14 + iDp;
                    iDp4 -= (int) (d2Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                }
                if (!z10) {
                    iDp4 += AndroidUtilities.statusBarHeight;
                }
                f10 = iDp4;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x8, f10, d2Var.getX() + d2Var.getWidth(), d2Var.getY() + d2Var.getHeight());
            boolean zDrawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return zDrawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, giVar.f28658h2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        yh yhVar3 = (yh) view;
        int iH2 = yhVar3.h();
        int iDp6 = AndroidUtilities.dp(13.0f) + (ihVar != null ? AndroidUtilities.dp(ihVar.getAlpha() * 26.0f) : 0) + ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f));
        int iP2 = (giVar.p1(yhVar3 == giVar.f28696u0 ? 0 : 1) - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop) - iDp6;
        if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType == 1 || giVar.f28680p1 != null) {
            iP2 = (int) (view.getTranslationY() + iP2);
        }
        int iDp7 = AndroidUtilities.dp(20.0f) + iP2;
        int iDp8 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        int currentActionBarHeight2 = iH2 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
        if (iH2 != 2) {
            f12 = 0.0f;
            if (((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP2 < currentActionBarHeight2) {
                float f15 = iDp6;
                if (yhVar3 == giVar.f28665k0) {
                    iDp2 = AndroidUtilities.dp(11.0f);
                } else if (yhVar3 == giVar.f28659i0 || yhVar3 == giVar.f28662j0) {
                    int iDp9 = AndroidUtilities.dp(3.0f);
                    f13 = f15 - iDp9;
                    float fMin = Math.min(1.0f, ((currentActionBarHeight2 - iP2) - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop) / f13);
                    int i10 = (int) ((currentActionBarHeight2 - f13) * fMin);
                    iP2 -= i10;
                    iDp7 -= i10;
                    iDp8 += i10;
                    fMax = 1.0f - fMin;
                } else {
                    iDp2 = AndroidUtilities.dp(4.0f);
                }
                f13 = f15 + iDp2;
                float fMin2 = Math.min(1.0f, ((currentActionBarHeight2 - iP2) - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop) / f13);
                int i11 = (int) ((currentActionBarHeight2 - f13) * fMin2);
                iP2 -= i11;
                iDp7 -= i11;
                iDp8 += i11;
                fMax = 1.0f - fMin2;
            } else {
                fMax = 1.0f;
            }
        } else if (iP2 < currentActionBarHeight2) {
            fMax = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - iP2) / ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop));
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            fMax = 1.0f;
        }
        if (!z10) {
            int i12 = AndroidUtilities.statusBarHeight;
            iP2 += i12;
            iDp7 += i12;
            iDp8 -= i12;
        }
        int i13 = iDp8;
        int customBackground = giVar.f28696u0.f() ? giVar.f28696u0.getCustomBackground() : giVar.q1(true);
        yh yhVar4 = giVar.f28696u0;
        em emVar = giVar.m0;
        boolean z11 = (yhVar4 == emVar || (yhVar = giVar.f28699v0) == emVar || (yhVar4 == giVar.f28650f0 && yhVar == null)) ? false : true;
        RectF rectF = this.f34178t0;
        if (z11) {
            ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable.setAlpha(alpha3);
            ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable.setBounds(0, iP2, getMeasuredWidth(), i13);
            ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable.draw(canvas);
            if (iH2 == 2) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha(alpha3);
                rectF.set(((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP2, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP2);
            }
        }
        if (view == giVar.f28653g0 || view == giVar.f28676o0 || view == giVar.f28656h0) {
            zDrawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            zDrawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (fMax != 1.0f && iH2 != 2) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha(alpha3);
                rectF.set(((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP2, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop + iP2);
            }
            if ((ihVar == null || ihVar.getAlpha() != 1.0f) && fMax != f12) {
                int iDp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - iDp10) / 2, iDp7, (getMeasuredWidth() + iDp10) / 2, AndroidUtilities.dp(4.0f) + iDp7);
                if (iH2 == 2) {
                    themedColor = 536870912;
                    alpha = fMax;
                } else {
                    themedColor = giVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    alpha = ihVar == null ? 1.0f : 1.0f - ihVar.getAlpha();
                }
                int iAlpha = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.f23333t0.setAlpha((int) (view.getAlpha() * iAlpha * alpha * fMax));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
            }
        }
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vh vhVar = this.f34181w0;
        vhVar.f23708b = this;
        vhVar.c();
        gi giVar = this.f34182x0;
        giVar.A0.setAdjustPanLayoutHelper(vhVar);
        giVar.L0.setAdjustPanLayoutHelper(vhVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34181w0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f34182x0.f28639c0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gi giVar = this.f34182x0;
        int[] iArr = giVar.X1;
        if (giVar.f28696u0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ag.y1 y1Var = giVar.K0;
                int i10 = iArr[0] - (((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop * 2);
                int iDp = AndroidUtilities.dp(13.0f);
                ih ihVar = giVar.f28647e1;
                int iDp2 = AndroidUtilities.dp(20.0f) + ((i10 - (iDp + (ihVar != null ? AndroidUtilities.dp(ihVar.getAlpha() * 26.0f) : 0))) - ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f)));
                if (!giVar.f28639c0) {
                    iDp2 += AndroidUtilities.statusBarHeight;
                }
                if (y10 < iDp2 && giVar.T0.getAlpha() == 0.0f) {
                    giVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gl glVar;
        int paddingRight;
        int i14;
        int paddingLeft;
        int i15;
        int i16;
        int i17;
        mh mhVar;
        ph phVar;
        in inVar;
        in inVar2;
        int i18;
        int iMax;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        wh whVar = this;
        gi giVar = whVar.f34182x0;
        ag.y1 y1Var = giVar.K0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
        int i19 = i12 - i10;
        if (whVar.f34177s0 != i19) {
            whVar.f34177s0 = i19;
            ye yeVar = giVar.f28642d0;
            if (yeVar != null && !yeVar.m0) {
                yeVar.dismiss();
            }
        }
        int childCount = whVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            giVar.f28655g2.set(i10, i11, i12, i13);
            whVar.setSystemGestureExclusionRects(giVar.f28652f2);
        }
        r0.m1 m1VarF = r0.j0.f(whVar);
        int i20 = 8;
        int i21 = m1VarF != null ? m1VarF.f46619a.f(8).d : 0;
        int paddingBottom = whVar.getPaddingBottom();
        if (!((org.telegram.ui.ActionBar.e3) giVar).keyboardVisible) {
            in inVar3 = giVar.f28659i0;
            if (inVar3 == null || giVar.f28696u0 != inVar3 || inVar3.A == null) {
                in inVar4 = giVar.f28662j0;
                if (inVar4 == null || giVar.f28696u0 != inVar4 || inVar4.A == null) {
                    if (i21 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                        emojiPadding = 0;
                    } else {
                        emojiPadding = giVar.m1().getEmojiPadding();
                    }
                } else if (i21 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = giVar.f28662j0.getEmojiPadding();
                }
            } else if (i21 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                emojiPadding = 0;
            } else {
                emojiPadding = giVar.f28659i0.getEmojiPadding();
            }
            if (emojiPadding > 0) {
                paddingBottom += emojiPadding;
            }
        }
        whVar.setBottomClip(paddingBottom);
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = whVar.getChildAt(i22);
            if (childAt.getVisibility() != i20) {
                int i23 = AndroidUtilities.statusBarHeight;
                int iMax2 = i21 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof yh) {
                    yh yhVar = (yh) childAt;
                    if (yhVar.h) {
                        i23 = 0;
                    }
                    if (yhVar.f34903f) {
                        iMax2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i24 = layoutParams.gravity;
                if (i24 == -1) {
                    i24 = 51;
                }
                int i25 = i24 & 112;
                int i26 = i24 & 7;
                if (i26 != 1) {
                    if (i26 != 5) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                    } else {
                        paddingRight = ((i19 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                        i14 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                    }
                    if (i25 != 16) {
                        if (i25 != 48) {
                            i17 = layoutParams.topMargin + i23;
                        } else if (i25 != 80) {
                            i17 = layoutParams.topMargin;
                        } else {
                            i15 = ((i13 - iMax2) - i11) - measuredHeight3;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (childAt != giVar.T0 || childAt == giVar.f28687r1) {
                            i17 = 0;
                        }
                        mhVar = giVar.A0;
                        if ((mhVar == null && mhVar.l(childAt)) || (((phVar = giVar.L0) != null && phVar.l(childAt)) || (((inVar = giVar.f28659i0) != null && childAt == inVar.A) || ((inVar2 = giVar.f28662j0) != null && childAt == inVar2.A)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i21;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i17 = measuredHeight - measuredHeight2;
                        } else if (childAt == giVar.f28709x2) {
                            if (giVar.Y) {
                                i18 = AndroidUtilities.statusBarHeight;
                                iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i17 = i18 + iMax;
                            }
                        } else if (childAt == giVar.f28691s1) {
                            i18 = i17 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(i21, giVar.o1());
                            i17 = i18 + iMax;
                        }
                        childAt.layout(paddingLeft, i17, measuredWidth + paddingLeft, i17 + measuredHeight3);
                    } else {
                        i15 = ((((i13 - iMax2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    i17 = i15 - i16;
                    if (childAt != giVar.T0) {
                        i17 = 0;
                    } else {
                        i17 = 0;
                    }
                    mhVar = giVar.A0;
                    if (mhVar == null) {
                        if (childAt == giVar.f28709x2) {
                            if (giVar.Y) {
                                i18 = AndroidUtilities.statusBarHeight;
                                iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i17 = i18 + iMax;
                            }
                        } else if (childAt == giVar.f28691s1) {
                            i18 = i17 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(i21, giVar.o1());
                            i17 = i18 + iMax;
                        }
                    } else if (childAt == giVar.f28709x2) {
                        if (giVar.Y) {
                            i18 = AndroidUtilities.statusBarHeight;
                            iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            i17 = i18 + iMax;
                        }
                    } else if (childAt == giVar.f28691s1) {
                        i18 = i17 + AndroidUtilities.navigationBarHeight;
                        iMax = Math.max(i21, giVar.o1());
                        i17 = i18 + iMax;
                    }
                    childAt.layout(paddingLeft, i17, measuredWidth + paddingLeft, i17 + measuredHeight3);
                } else {
                    paddingRight = ((i19 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                }
                paddingLeft = paddingRight - i14;
                if (i25 != 16) {
                    if (i25 != 48) {
                        i17 = layoutParams.topMargin + i23;
                    } else if (i25 != 80) {
                        i17 = layoutParams.topMargin;
                    } else {
                        i15 = ((i13 - iMax2) - i11) - measuredHeight3;
                        i16 = layoutParams.bottomMargin;
                    }
                    if (childAt != giVar.T0) {
                        i17 = 0;
                    } else {
                        i17 = 0;
                    }
                    mhVar = giVar.A0;
                    if (mhVar == null) {
                        if (childAt == giVar.f28709x2) {
                            if (giVar.Y) {
                                i18 = AndroidUtilities.statusBarHeight;
                                iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i17 = i18 + iMax;
                            }
                        } else if (childAt == giVar.f28691s1) {
                            i18 = i17 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(i21, giVar.o1());
                            i17 = i18 + iMax;
                        }
                    } else if (childAt == giVar.f28709x2) {
                        if (giVar.Y) {
                            i18 = AndroidUtilities.statusBarHeight;
                            iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            i17 = i18 + iMax;
                        }
                    } else if (childAt == giVar.f28691s1) {
                        i18 = i17 + AndroidUtilities.navigationBarHeight;
                        iMax = Math.max(i21, giVar.o1());
                        i17 = i18 + iMax;
                    }
                    childAt.layout(paddingLeft, i17, measuredWidth + paddingLeft, i17 + measuredHeight3);
                } else {
                    i15 = ((((i13 - iMax2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                    i16 = layoutParams.bottomMargin;
                }
                i17 = i15 - i16;
                if (childAt != giVar.T0) {
                    i17 = 0;
                } else {
                    i17 = 0;
                }
                mhVar = giVar.A0;
                if (mhVar == null) {
                    if (childAt == giVar.f28709x2) {
                        if (giVar.Y) {
                            i18 = AndroidUtilities.statusBarHeight;
                            iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            i17 = i18 + iMax;
                        }
                    } else if (childAt == giVar.f28691s1) {
                        i18 = i17 + AndroidUtilities.navigationBarHeight;
                        iMax = Math.max(i21, giVar.o1());
                        i17 = i18 + iMax;
                    }
                } else if (childAt == giVar.f28709x2) {
                    if (giVar.Y) {
                        i18 = AndroidUtilities.statusBarHeight;
                        iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        i17 = i18 + iMax;
                    }
                } else if (childAt == giVar.f28691s1) {
                    i18 = i17 + AndroidUtilities.navigationBarHeight;
                    iMax = Math.max(i21, giVar.o1());
                    i17 = i18 + iMax;
                }
                childAt.layout(paddingLeft, i17, measuredWidth + paddingLeft, i17 + measuredHeight3);
            }
            i22++;
            whVar = this;
            i20 = 8;
        }
        S();
        giVar.X1(giVar.f28696u0, 0);
        giVar.X1(giVar.f28699v0, 0);
        if (giVar.Y) {
            giVar.U1();
        }
        if (chatAttachAlertPhotoLayout == null || (glVar = chatAttachAlertPhotoLayout.A) == null || glVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.A.getFastScroll().f29386d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1 + (giVar.Y ? (int) (y1Var.getAlpha() * y1Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.A.getFastScroll().invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        in inVar;
        in inVar2;
        int iO1;
        wh whVar = this;
        gi giVar = whVar.f34182x0;
        boolean z10 = giVar.f28639c0;
        org.telegram.ui.ActionBar.v0 v0Var = giVar.W0;
        int size = whVar.getLayoutParams().height > 0 ? whVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z10) {
            whVar.f34179u0 = true;
            whVar.setPadding(((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, 0, ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft, 0);
            whVar.f34179u0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10) - (((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft * 2);
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
        ((FrameLayout.LayoutParams) giVar.f28636b1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        whVar.f34179u0 = true;
        int iMin = (int) (size2 / Math.min(4.5f, giVar.f28704w1.h()));
        if (giVar.U1 != iMin) {
            giVar.U1 = iMin;
            AndroidUtilities.runOnUIThread(new bg(whVar, 21));
        }
        whVar.f34179u0 = false;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(iMakeMeasureSpec);
        whVar.setMeasuredDimension(size3, size4);
        int i13 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
        ph phVar = giVar.L0;
        mh mhVar = giVar.A0;
        int i14 = size3 - (i13 * 2);
        if (!mhVar.J && AndroidUtilities.dp(20.0f) >= 0 && !mhVar.f32878e && !mhVar.K) {
            whVar.f34179u0 = true;
            mhVar.j();
            whVar.f34179u0 = false;
        }
        if (!phVar.J && AndroidUtilities.dp(20.0f) >= 0 && !phVar.f32878e && !phVar.K) {
            whVar.f34179u0 = true;
            phVar.j();
            whVar.f34179u0 = false;
        }
        if (giVar.f28659i0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            in inVar3 = giVar.f28659i0;
            if (!inVar3.C && !inVar3.W0 && !inVar3.f29413b1 && !inVar3.f29417d1) {
                whVar.f34179u0 = true;
                inVar3.a0();
                whVar.f34179u0 = false;
            }
        }
        if (giVar.f28662j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            in inVar4 = giVar.f28662j0;
            if (!inVar4.C && !inVar4.W0 && !inVar4.f29413b1 && !inVar4.f29417d1) {
                whVar.f34179u0 = true;
                inVar4.a0();
                whVar.f34179u0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            if (((org.telegram.ui.ActionBar.e3) giVar).keyboardVisible) {
                yh yhVar = giVar.f28696u0;
                in inVar5 = giVar.f28659i0;
                if (yhVar == inVar5 && inVar5.A != null && inVar5.f29417d1) {
                    iO1 = AndroidUtilities.dp(120.0f);
                } else {
                    in inVar6 = giVar.f28662j0;
                    iO1 = (yhVar == inVar6 && inVar6.A != null && inVar6.f29417d1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                iO1 = giVar.o1();
            }
            r0.m1 m1VarF = r0.j0.f(whVar);
            int i15 = m1VarF != null ? m1VarF.f46619a.f(8).d : 0;
            r0.m1 m1VarF2 = r0.j0.f(whVar);
            Math.max(m1VarF2 != null ? m1VarF2.f46619a.f(527).d : 0, iO1);
            int iMax = Math.max(i15 > 0 ? 0 : AndroidUtilities.navigationBarHeight, iO1);
            whVar.f34179u0 = true;
            yh yhVar2 = giVar.f28696u0;
            if (yhVar2.f34903f) {
                yhVar2.f34902e = AndroidUtilities.dp(62.0f) + iMax;
                giVar.f28696u0.z(i14, size4);
            } else {
                yhVar2.f34902e = AndroidUtilities.navigationBarHeight;
                yhVar2.z(i14, size4 - iO1);
            }
            yh yhVar3 = giVar.f28699v0;
            if (yhVar3 != null) {
                if (yhVar3.f34903f) {
                    yhVar3.f34902e = AndroidUtilities.dp(62.0f) + iMax;
                    giVar.f28699v0.z(i14, size4);
                } else {
                    yhVar3.f34902e = AndroidUtilities.navigationBarHeight;
                    yhVar3.z(i14, size4 - iO1);
                }
            }
            whVar.f34179u0 = false;
        }
        int childCount = whVar.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            int i17 = i16;
            View childAt = whVar.getChildAt(i17);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i17;
            } else if (childAt == giVar.f28687r1) {
                i12 = i17;
                whVar.measureChildWithMargins(childAt, i10, 0, iMakeMeasureSpec, 0);
            } else {
                i12 = i17;
                int i18 = AndroidUtilities.statusBarHeight;
                int i19 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof yh) {
                    yh yhVar4 = (yh) childAt;
                    if (yhVar4.h) {
                        i18 = 0;
                    }
                    if (yhVar4.f34903f) {
                        i19 = 0;
                    }
                }
                if (!mhVar.l(childAt) && !phVar.l(childAt) && (((inVar = giVar.f28659i0) == null || childAt != inVar.A) && ((inVar2 = giVar.f28662j0) == null || childAt != inVar2.A))) {
                    measureChildWithMargins(childAt, i10, 0, iMakeMeasureSpec, i18 + i19);
                } else if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), 1073741824));
                }
            }
            i16 = i12 + 1;
            whVar = this;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int radius;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i10, i11, i12, i13);
        int radius2 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            radius = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            radius = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                radius2 = roundedCorner2.getRadius();
            }
        }
        lg.d dVar = this.f34182x0.f28703w0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius2, radius);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gi giVar = this.f34182x0;
        if (giVar.f28696u0.l(motionEvent)) {
            return true;
        }
        return !giVar.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f34179u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        gi giVar = this.f34182x0;
        ih ihVar = giVar.f28694t1;
        float f11 = f10 + giVar.f28658h2;
        if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType == 0) {
            this.f34180v0 = f11;
        }
        if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType == 1) {
            if (f11 < 0.0f) {
                giVar.f28696u0.setTranslationY(f11);
                if (giVar.M0 != 0 || giVar.P0) {
                    giVar.f28647e1.setTranslationY((giVar.l1 + f11) - giVar.f28658h2);
                }
                ihVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                giVar.f28696u0.setTranslationY(0.0f);
                ihVar.setTranslationY(((f11 / this.f34180v0) * ihVar.getMeasuredHeight()) + (-f11));
            }
            ((org.telegram.ui.ActionBar.e3) giVar).containerView.invalidate();
        }
        super.setTranslationY(f11 - giVar.f28658h2);
        if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType != 1) {
            giVar.f28696u0.k(giVar.f28658h2);
        }
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
