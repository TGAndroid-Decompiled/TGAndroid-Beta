package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class cp0 extends zu0 {
    public int A0;
    public final boolean B0;
    public final y5 C0;
    public final sp0 D0;

    public boolean f27524s0;

    public final RectF f27525t0;

    public boolean f27526u0;

    public int f27527v0;

    public int f27528w0;

    public int f27529x0;

    public int f27530y0;

    public int f27531z0;

    public cp0(sp0 sp0Var, Context context) {
        super(context, null);
        this.D0 = sp0Var;
        this.f27524s0 = false;
        this.f27525t0 = new RectF();
        this.D = new bp0(this, this);
        this.B0 = AndroidUtilities.computePerceivedBrightness(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f;
        this.C0 = new y5(this, 0L, 350L, er.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        sp0 sp0Var = this.D0;
        so0 so0Var = sp0Var.C;
        zk0 zk0Var = sp0Var.A;
        so0 so0Var2 = sp0Var.B;
        if (so0Var2.getVisibility() == 0 && so0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(so0Var2.getX(), so0Var2.getY());
            so0Var2.draw(canvas);
            canvas.restore();
        }
        if (zk0Var.getVisibility() == 0 && zk0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(zk0Var.getX(), zk0Var.getY());
            zk0Var.draw(canvas);
            canvas.restore();
        }
        if (so0Var.getVisibility() != 0 || so0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(so0Var.getX(), so0Var.getY());
        so0Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sp0 sp0Var = this.D0;
        og.d dVar = sp0Var.M0;
        og.d dVar2 = sp0Var.L0;
        if (Build.VERSION.SDK_INT >= 31 && sp0Var.K0 != null) {
            sp0.A0(sp0Var);
            if (dVar2 != null) {
                dVar2.h(((org.telegram.ui.ActionBar.e3) sp0Var).containerView.getMeasuredWidth(), ((org.telegram.ui.ActionBar.e3) sp0Var).containerView.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                dVar.h(((org.telegram.ui.ActionBar.e3) sp0Var).containerView.getMeasuredWidth(), ((org.telegram.ui.ActionBar.e3) sp0Var).containerView.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + sp0Var.f32538p0, getMeasuredWidth(), getMeasuredHeight() + sp0Var.f32538p0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof yy) {
            sp0 sp0Var = this.D0;
            if (sp0Var.R0 != null) {
                canvas.save();
                sp0Var.R0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(sp0Var.R0.h.f15588k);
                sp0Var.R0.draw(canvas);
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return ((org.telegram.ui.ActionBar.e3) this.D0).resourcesProvider;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.p1 p1Var = this.D;
        p1Var.f23708b = this;
        p1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fE;
        canvas.save();
        sp0 sp0Var = this.D0;
        Drawable drawable = sp0Var.N;
        FrameLayout frameLayout = sp0Var.f32547w;
        canvas.translate(0.0f, sp0Var.f32538p0);
        int iDp = AndroidUtilities.dp(6.0f) + (sp0Var.f32534l0 - ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop) + this.f27527v0;
        int iDp2 = ((sp0Var.f32534l0 - ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + this.f27527v0;
        sp0Var.T = iDp2;
        int iDp3 = ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop + AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        if (((org.telegram.ui.ActionBar.e3) sp0Var).isFullscreen) {
            fE = 0.0f;
        } else {
            iDp += sp0Var.C0.f10490b;
            boolean z10 = this.f27526u0 && ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop + iDp2 < sp0Var.C0.f10490b;
            int i10 = iDp2 + sp0Var.C0.f10490b;
            int i11 = -((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop;
            fE = this.C0.e(z10);
            iDp2 = AndroidUtilities.lerp(i10, i11, fE);
        }
        drawable.setBounds(0, iDp2, getMeasuredWidth(), iDp3);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (iDp2 > sp0Var.C0.f10490b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop + iDp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                ec ecVar = ec.f28012w;
                if (ecVar != null) {
                    jb jbVar = ecVar.f28016e;
                    if (jbVar != null) {
                        jbVar.setTop(true);
                    }
                    ecVar.b();
                }
            }
        }
        if (fE < 1.0f) {
            int iDp4 = AndroidUtilities.dp(36.0f);
            float measuredWidth = (getMeasuredWidth() - iDp4) / 2;
            float f10 = iDp;
            float measuredWidth2 = (getMeasuredWidth() + iDp4) / 2;
            float fDp = AndroidUtilities.dp(4.0f) + iDp;
            RectF rectF = this.f27525t0;
            rectF.set(measuredWidth, f10, measuredWidth2, fDp);
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            Paint paint = org.telegram.ui.ActionBar.g6.f23333t0;
            paint.setAlpha((int) ((1.0f - fE) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            boolean z11 = this.B0 && ((float) 0) > ((float) sp0Var.C0.f10490b) * 0.5f;
            if (z11 != ((systemUiVisibility & 8192) > 0)) {
                setSystemUiVisibility(z11 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
        canvas.restore();
        this.f27528w0 = this.f27527v0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f27526u0;
        sp0 sp0Var = this.D0;
        if (z10) {
            if (motionEvent.getAction() == 0 && sp0Var.f32534l0 != 0 && motionEvent.getY() < sp0Var.f32534l0 - AndroidUtilities.dp(30.0f)) {
                sp0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f27527v0 - AndroidUtilities.dp(30.0f)) {
            sp0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingRight;
        int i14;
        int paddingLeft;
        int i15;
        int i16;
        int paddingTop;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int iR = R();
        sp0 sp0Var = this.D0;
        vo0 vo0Var = sp0Var.d;
        int iMax = (((org.telegram.ui.ActionBar.e3) sp0Var).keyboardVisible || iR > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(sp0Var.C0.d, vo0Var.getEmojiPadding());
        setBottomClip(iMax);
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i18 = layoutParams.gravity;
                if (i18 == -1) {
                    i18 = 51;
                }
                int i19 = i18 & 112;
                int i20 = i18 & 7;
                if (i20 != 1) {
                    if (i20 != 5) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                    } else {
                        paddingRight = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                        i14 = ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingLeft;
                    }
                    if (i19 != 16) {
                        if (i19 != 48) {
                            paddingTop = this.f27527v0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i19 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i15 = ((i13 - iMax) - i11) - measuredHeight3;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (vo0Var != null && vo0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iR;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        if (childAt == sp0Var.f32535n) {
                            paddingTop += sp0Var.C0.d;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i15 = ((((i13 - iMax) - (this.f27527v0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    paddingTop = i15 - i16;
                    if (vo0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight() + iR;
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    if (childAt == sp0Var.f32535n) {
                        paddingTop += sp0Var.C0.d;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    paddingRight = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                }
                paddingLeft = paddingRight - i14;
                if (i19 != 16) {
                    if (i19 != 48) {
                        paddingTop = this.f27527v0 + getPaddingTop() + layoutParams.topMargin;
                    } else if (i19 != 80) {
                        paddingTop = layoutParams.topMargin;
                    } else {
                        i15 = ((i13 - iMax) - i11) - measuredHeight3;
                        i16 = layoutParams.bottomMargin;
                    }
                    if (vo0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight() + iR;
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    if (childAt == sp0Var.f32535n) {
                        paddingTop += sp0Var.C0.d;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    i15 = ((((i13 - iMax) - (this.f27527v0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                    i16 = layoutParams.bottomMargin;
                }
                paddingTop = i15 - i16;
                if (vo0Var != null) {
                    if (AndroidUtilities.isTablet()) {
                        measuredHeight = getMeasuredHeight();
                        measuredHeight2 = childAt.getMeasuredHeight();
                    } else {
                        measuredHeight = getMeasuredHeight() + iR;
                        measuredHeight2 = childAt.getMeasuredHeight();
                    }
                    paddingTop = measuredHeight - measuredHeight2;
                }
                if (childAt == sp0Var.f32535n) {
                    paddingTop += sp0Var.C0.d;
                }
                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
            }
        }
        S();
        sp0Var.Y0();
        sp0.s0(sp0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        cp0 cp0Var = this;
        sp0 sp0Var = cp0Var.D0;
        so0 so0Var = sp0Var.C;
        FrameLayout frameLayout = sp0Var.Y;
        so0 so0Var2 = sp0Var.B;
        zk0 zk0Var = sp0Var.A;
        int size = cp0Var.getLayoutParams().height > 0 ? cp0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i13 = 0;
        sp0Var.D.G = cp0Var.getLayoutParams().height <= 0;
        sp0Var.F.G = cp0Var.getLayoutParams().height <= 0;
        if (!((org.telegram.ui.ActionBar.e3) sp0Var).isFullscreen) {
            cp0Var.f27524s0 = true;
            cp0Var.setPadding(((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingLeft, sp0Var.C0.f10490b, ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingLeft, 0);
            cp0Var.f27524s0 = false;
        }
        int paddingTop = size - cp0Var.getPaddingTop();
        int iD = ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop + org.telegram.messenger.y1.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(sp0Var.I.h(), sp0Var.G.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        if (zk0Var.getVisibility() != 8) {
            int iD2 = ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingTop + org.telegram.messenger.y1.D(103.0f, Math.max(2, (int) Math.ceil((sp0Var.H.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            if (iD2 > iD) {
                iD = AndroidUtilities.lerp(iD, iD2, zk0Var.getAlpha());
            }
        }
        int i14 = iD < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int iDp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + sp0Var.C0.d;
        if (so0Var2.getPaddingTop() != i14 || so0Var2.getPaddingBottom() != iDp) {
            cp0Var.f27524s0 = true;
            so0Var2.setPadding(0, i14, 0, iDp);
            zk0Var.setPadding(0, i14, 0, iDp);
            cp0Var.f27524s0 = false;
        }
        if (((org.telegram.ui.ActionBar.e3) sp0Var).keyboardVisible && cp0Var.getLayoutParams().height <= 0 && so0Var.getPaddingTop() != i14) {
            cp0Var.f27524s0 = true;
            so0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + sp0Var.C0.d);
            cp0Var.f27524s0 = false;
        }
        boolean z10 = iD >= size;
        cp0Var.f27526u0 = z10;
        cp0Var.f27527v0 = z10 ? 0 : size - iD;
        cp0Var.f27524s0 = true;
        sp0Var.K0(false);
        cp0Var.f27524s0 = false;
        cp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(iMakeMeasureSpec);
        int i15 = ((org.telegram.ui.ActionBar.e3) sp0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = sp0Var.f32540r;
        vo0 vo0Var = sp0Var.d;
        int i16 = size2 - (i15 * 2);
        int iR = cp0Var.R();
        sp0Var.J0 = iR;
        if (!vo0Var.J && iR <= AndroidUtilities.dp(20.0f) && !vo0Var.f32878e && !vo0Var.K) {
            cp0Var.f27524s0 = true;
            vo0Var.j();
            cp0Var.f27524s0 = false;
        }
        cp0Var.f27524s0 = true;
        if (sp0Var.J0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                size3 -= ((org.telegram.ui.ActionBar.e3) sp0Var).keyboardVisible ? 0 : vo0Var.getEmojiPadding();
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            int i17 = vo0Var.f32878e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i12 = 8;
        } else {
            if (!vo0Var.m()) {
                vo0Var.j();
            }
            i12 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i18 = iMakeMeasureSpec;
        int i19 = size3;
        cp0Var.f27524s0 = false;
        int childCount = cp0Var.getChildCount();
        while (i13 < childCount) {
            View childAt = cp0Var.getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != i12) {
                if (!vo0Var.l(childAt)) {
                    cp0Var.measureChildWithMargins(childAt, i10, 0, i18, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), cp0Var.getPaddingTop() + (i19 - sp0Var.C0.f10490b)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(cp0Var.getPaddingTop() + (i19 - sp0Var.C0.f10490b), 1073741824));
                }
            }
            i13++;
            cp0Var = this;
        }
        sp0Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.D0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f27524s0) {
            return;
        }
        super.requestLayout();
    }
}
