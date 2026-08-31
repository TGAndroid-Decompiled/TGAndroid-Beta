package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xp0 extends qv0 {
    public int A0;
    public int B0;
    public final boolean C0;
    public final z5 D0;
    public final mq0 E0;
    public boolean f33146t0;
    public final RectF f33147u0;
    public boolean f33148v0;
    public int f33149w0;
    public int f33150x0;
    public int f33151y0;
    public int f33152z0;

    public xp0(mq0 mq0Var, Context context) {
        super(context, null);
        this.E0 = mq0Var;
        this.f33146t0 = false;
        this.f33147u0 = new RectF();
        this.E = new wp0(this, this);
        this.C0 = AndroidUtilities.computePerceivedBrightness(mq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5)) > 0.721f;
        this.D0 = new z5(this, 0L, 350L, pr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        mq0 mq0Var = this.E0;
        np0 np0Var = mq0Var.D;
        tl0 tl0Var = mq0Var.B;
        np0 np0Var2 = mq0Var.C;
        if (np0Var2.getVisibility() == 0 && np0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(np0Var2.getX(), np0Var2.getY());
            np0Var2.draw(canvas);
            canvas.restore();
        }
        if (tl0Var.getVisibility() == 0 && tl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tl0Var.getX(), tl0Var.getY());
            tl0Var.draw(canvas);
            canvas.restore();
        }
        if (np0Var.getVisibility() == 0 && np0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(np0Var.getX(), np0Var.getY());
            np0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        mq0 mq0Var = this.E0;
        tg.d dVar = mq0Var.N0;
        tg.d dVar2 = mq0Var.M0;
        if (Build.VERSION.SDK_INT >= 31 && mq0Var.L0 != null) {
            mq0.A0(mq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) mq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) mq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) mq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) mq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + mq0Var.f29216q0, getMeasuredWidth(), getMeasuredHeight() + mq0Var.f29216q0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof mz) {
            mq0 mq0Var = this.E0;
            if (mq0Var.S0 != null) {
                canvas.save();
                mq0Var.S0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(mq0Var.S0.h.f44844k);
                mq0Var.S0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        org.telegram.ui.ActionBar.g6 g6Var;
        g6Var = ((org.telegram.ui.ActionBar.h3) this.E0).resourcesProvider;
        return g6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.r1 r1Var = this.E;
        r1Var.f22251b = this;
        r1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z4;
        float f10;
        boolean z10;
        int i13;
        int dp;
        Paint paint;
        int i14;
        boolean z11;
        int i15;
        int i16;
        canvas.save();
        mq0 mq0Var = this.E0;
        Drawable drawable = mq0Var.O;
        FrameLayout frameLayout = mq0Var.f29224w;
        canvas.translate(0.0f, mq0Var.f29216q0);
        int i17 = mq0Var.m0;
        i10 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f33149w0;
        int i18 = mq0Var.m0;
        i11 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f33149w0;
        mq0Var.U = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z4 = ((org.telegram.ui.ActionBar.h3) mq0Var).isFullscreen;
        boolean z12 = true;
        if (!z4) {
            dp2 += mq0Var.D0.f7758b;
            if (this.f33148v0) {
                i16 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
                if (i16 + dp3 < mq0Var.D0.f7758b) {
                    z11 = true;
                    int i20 = dp3 + mq0Var.D0.f7758b;
                    i15 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
                    f10 = this.D0.e(z11);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f10);
                }
            }
            z11 = false;
            int i202 = dp3 + mq0Var.D0.f7758b;
            i15 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
            f10 = this.D0.e(z11);
            dp3 = AndroidUtilities.lerp(i202, -i15, f10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > mq0Var.D0.f7758b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                ic icVar = ic.f27737w;
                if (icVar != null) {
                    nb nbVar = icVar.f27741e;
                    if (nbVar != null) {
                        nbVar.setTop(true);
                    }
                    icVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            float f11 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f33147u0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.k6.f21939t0.setColor(mq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
            org.telegram.ui.ActionBar.k6.f21939t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21939t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.C0 && 0 > mq0Var.D0.f7758b * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((systemUiVisibility & 8192) <= 0) {
                z12 = false;
            }
            if (z10 != z12) {
                if (z10) {
                    i13 = systemUiVisibility | 8192;
                } else {
                    i13 = systemUiVisibility & (-8193);
                }
                setSystemUiVisibility(i13);
            }
        }
        canvas.restore();
        this.f33150x0 = this.f33149w0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.f33148v0;
        mq0 mq0Var = this.E0;
        if (!z4) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f33149w0 - AndroidUtilities.dp(30.0f)) {
                mq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && mq0Var.m0 != 0 && motionEvent.getY() < mq0Var.m0 - AndroidUtilities.dp(30.0f)) {
            mq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xp0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        boolean z4;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z14;
        int emojiPadding;
        int i19;
        int i20;
        int i21;
        xp0 xp0Var = this;
        mq0 mq0Var = xp0Var.E0;
        np0 np0Var = mq0Var.D;
        FrameLayout frameLayout = mq0Var.Z;
        np0 np0Var2 = mq0Var.C;
        tl0 tl0Var = mq0Var.B;
        if (xp0Var.getLayoutParams().height > 0) {
            size = xp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        f2.w wVar = mq0Var.E;
        int i22 = 0;
        if (xp0Var.getLayoutParams().height <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        wVar.G = z4;
        qz qzVar = mq0Var.G;
        if (xp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qzVar.G = z10;
        z11 = ((org.telegram.ui.ActionBar.h3) mq0Var).isFullscreen;
        if (!z11) {
            xp0Var.f33146t0 = true;
            i20 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingLeft;
            int i23 = mq0Var.D0.f7758b;
            i21 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingLeft;
            xp0Var.setPadding(i20, i23, i21, 0);
            xp0Var.f33146t0 = false;
        }
        int paddingTop = size - xp0Var.getPaddingTop();
        int max = Math.max(mq0Var.J.h(), mq0Var.H.h() - 1);
        int D = org.telegram.messenger.y3.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (tl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.y3.D(103.0f, Math.max(2, (int) Math.ceil((mq0Var.I.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, tl0Var.getAlpha());
            }
        }
        if (i24 < paddingTop) {
            i13 = 0;
        } else {
            i13 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i26 = 48;
        if (frameLayout != null) {
            i14 = 48;
        } else {
            i14 = 0;
        }
        int dp2 = AndroidUtilities.dp(i14 + 100) + mq0Var.D0.d;
        if (np0Var2.getPaddingTop() != i13 || np0Var2.getPaddingBottom() != dp2) {
            xp0Var.f33146t0 = true;
            np0Var2.setPadding(0, i13, 0, dp2);
            tl0Var.setPadding(0, i13, 0, dp2);
            xp0Var.f33146t0 = false;
        }
        z12 = ((org.telegram.ui.ActionBar.h3) mq0Var).keyboardVisible;
        if (z12 && xp0Var.getLayoutParams().height <= 0 && np0Var.getPaddingTop() != i13) {
            xp0Var.f33146t0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            np0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + mq0Var.D0.d);
            xp0Var.f33146t0 = false;
        }
        if (i24 >= size) {
            z13 = true;
        } else {
            z13 = false;
        }
        xp0Var.f33148v0 = z13;
        if (z13) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        xp0Var.f33149w0 = i15;
        xp0Var.f33146t0 = true;
        mq0Var.K0(false);
        xp0Var.f33146t0 = false;
        xp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.h3) mq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = mq0Var.f29217r;
        qp0 qp0Var = mq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = xp0Var.R();
        mq0Var.K0 = R;
        if (!qp0Var.K && R <= AndroidUtilities.dp(20.0f) && !qp0Var.f27004e && !qp0Var.L) {
            xp0Var.f33146t0 = true;
            qp0Var.j();
            xp0Var.f33146t0 = false;
        }
        xp0Var.f33146t0 = true;
        if (mq0Var.K0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z14 = ((org.telegram.ui.ActionBar.h3) mq0Var).keyboardVisible;
                if (z14) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = qp0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (qp0Var.f27004e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!qp0Var.m()) {
                qp0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        xp0Var.f33146t0 = false;
        int childCount = xp0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = xp0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (qp0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), xp0Var.getPaddingTop() + (i29 - mq0Var.D0.f7758b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(xp0Var.getPaddingTop() + (i29 - mq0Var.D0.f7758b), 1073741824));
                    }
                } else {
                    xp0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            xp0Var = this;
        }
        mq0Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.E0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33146t0) {
            return;
        }
        super.requestLayout();
    }
}
