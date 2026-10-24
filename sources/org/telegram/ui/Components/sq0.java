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
public final class sq0 extends nw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final d6 F0;
    public final hr0 G0;
    public boolean f30609w0;
    public final RectF f30610x0;
    public boolean f30611y0;
    public int f30612z0;

    public sq0(hr0 hr0Var, Context context) {
        super(context, null);
        this.G0 = hr0Var;
        this.f30609w0 = false;
        this.f30610x0 = new RectF();
        this.H = new rq0(this, this);
        AndroidUtilities.computePerceivedBrightness(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
        this.F0 = new d6(this, 0L, 350L, zr.h);
    }

    @Override
    public final void K(Canvas canvas, ArrayList arrayList) {
        hr0 hr0Var = this.G0;
        kq0 kq0Var = hr0Var.H;
        lm0 lm0Var = hr0Var.F;
        kq0 kq0Var2 = hr0Var.G;
        if (kq0Var2.getVisibility() == 0 && kq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(kq0Var2.getX(), kq0Var2.getY());
            kq0Var2.draw(canvas);
            canvas.restore();
        }
        if (lm0Var.getVisibility() == 0 && lm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(lm0Var.getX(), lm0Var.getY());
            lm0Var.draw(canvas);
            canvas.restore();
        }
        if (kq0Var.getVisibility() == 0 && kq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(kq0Var.getX(), kq0Var.getY());
            kq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        hr0 hr0Var = this.G0;
        gh.d dVar = hr0Var.R0;
        gh.d dVar2 = hr0Var.Q0;
        if (Build.VERSION.SDK_INT >= 31 && hr0Var.P0 != null) {
            hr0.J0(hr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) hr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) hr0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) hr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) hr0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + hr0Var.f27146u0, getMeasuredWidth(), getMeasuredHeight() + hr0Var.f27146u0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof rz) {
            hr0 hr0Var = this.G0;
            if (hr0Var.X0 != null) {
                canvas.save();
                hr0Var.X0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(hr0Var.X0.v.f8015k);
                hr0Var.X0.draw(canvas);
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
        g6Var = ((org.telegram.ui.ActionBar.h3) this.G0).resourcesProvider;
        return g6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f21720b = this;
        o1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f7;
        int i13;
        boolean z11;
        int i14;
        int dp;
        Paint paint;
        int i15;
        boolean z12;
        int i16;
        int i17;
        canvas.save();
        hr0 hr0Var = this.G0;
        Drawable drawable = hr0Var.S;
        FrameLayout frameLayout = hr0Var.f27150x;
        canvas.translate(0.0f, hr0Var.f27146u0);
        int i18 = hr0Var.f27140q0;
        i10 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i18 - i10) + this.f30612z0;
        int i19 = hr0Var.f27140q0;
        i11 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
        int dp3 = ((i19 - i11) - AndroidUtilities.dp(13.0f)) + this.f30612z0;
        hr0Var.Y = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
        int i20 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.h3) hr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += hr0Var.H0.f12316b;
            if (this.f30611y0) {
                i17 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
                if (i17 + dp3 < hr0Var.H0.f12316b) {
                    z12 = true;
                    int i21 = dp3 + hr0Var.H0.f12316b;
                    i16 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
                    f7 = this.F0.e(z12);
                    dp3 = AndroidUtilities.lerp(i21, -i16, f7);
                }
            }
            z12 = false;
            int i212 = dp3 + hr0Var.H0.f12316b;
            i16 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
            f7 = this.F0.e(z12);
            dp3 = AndroidUtilities.lerp(i212, -i16, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i20);
        drawable.draw(canvas);
        i13 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
        float f10 = i13 + dp3 + hr0Var.f27146u0;
        if (hr0Var.f27136n != f10) {
            hr0Var.f27136n = f10;
            hr0Var.f27120b.invalidate();
        }
        if (frameLayout != null) {
            if (dp3 > hr0Var.H0.f12316b || frameLayout.getChildCount() <= 0) {
                i15 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i15 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                oc ocVar = oc.f29196w;
                if (ocVar != null) {
                    sb sbVar = ocVar.e;
                    if (sbVar != null) {
                        sbVar.setTop(true);
                    }
                    ocVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f11 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f30610x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.k6.f21474t0.setColor(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
            org.telegram.ui.ActionBar.k6.f21474t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21474t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (AndroidUtilities.computePerceivedBrightness(hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) > 0.721f && 0 > hr0Var.H0.f12316b * 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z13 = false;
        }
        if (z11 != z13) {
            if (z11) {
                i14 = systemUiVisibility | 8192;
            } else {
                i14 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i14);
        }
        canvas.restore();
        this.A0 = this.f30612z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f30611y0;
        hr0 hr0Var = this.G0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f30612z0 - AndroidUtilities.dp(30.0f)) {
                hr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && hr0Var.f27140q0 != 0 && motionEvent.getY() < hr0Var.f27140q0 - AndroidUtilities.dp(30.0f)) {
            hr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z15;
        int emojiPadding;
        int i19;
        int i20;
        int i21;
        sq0 sq0Var = this;
        hr0 hr0Var = sq0Var.G0;
        kq0 kq0Var = hr0Var.H;
        FrameLayout frameLayout = hr0Var.f27126d0;
        kq0 kq0Var2 = hr0Var.G;
        lm0 lm0Var = hr0Var.F;
        if (sq0Var.getLayoutParams().height > 0) {
            size = sq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = hr0Var.I;
        int i22 = 0;
        if (sq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        vz vzVar = hr0Var.K;
        if (sq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.h3) hr0Var).isFullscreen;
        if (!z12) {
            sq0Var.f30609w0 = true;
            i20 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingLeft;
            int i23 = hr0Var.H0.f12316b;
            i21 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingLeft;
            sq0Var.setPadding(i20, i23, i21, 0);
            sq0Var.f30609w0 = false;
        }
        int paddingTop = size - sq0Var.getPaddingTop();
        int max = Math.max(hr0Var.N.h(), hr0Var.L.h() - 1);
        int D = org.telegram.messenger.v0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (lm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.v0.D(103.0f, Math.max(2, (int) Math.ceil((hr0Var.M.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, lm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + hr0Var.H0.d;
        if (kq0Var2.getPaddingTop() != i13 || kq0Var2.getPaddingBottom() != dp) {
            sq0Var.f30609w0 = true;
            kq0Var2.setPadding(0, i13, 0, dp);
            lm0Var.setPadding(0, i13, 0, dp);
            sq0Var.f30609w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.h3) hr0Var).keyboardVisible;
        if (z13 && sq0Var.getLayoutParams().height <= 0 && kq0Var.getPaddingTop() != i13) {
            sq0Var.f30609w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            kq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + hr0Var.H0.d);
            sq0Var.f30609w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        sq0Var.f30611y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        sq0Var.f30612z0 = i15;
        sq0Var.f30609w0 = true;
        hr0Var.P0(false);
        sq0Var.f30609w0 = false;
        sq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.h3) hr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = hr0Var.f27143s;
        mq0 mq0Var = hr0Var.d;
        int i27 = size2 - (i16 * 2);
        int Q = sq0Var.Q();
        hr0Var.O0 = Q;
        if (!mq0Var.N && Q <= AndroidUtilities.dp(20.0f) && !mq0Var.e && !mq0Var.O) {
            sq0Var.f30609w0 = true;
            mq0Var.j();
            sq0Var.f30609w0 = false;
        }
        sq0Var.f30609w0 = true;
        if (hr0Var.O0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.h3) hr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = mq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (mq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!mq0Var.m()) {
                mq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        sq0Var.f30609w0 = false;
        int childCount = sq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = sq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (mq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), sq0Var.getPaddingTop() + (i29 - hr0Var.H0.f12316b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(sq0Var.getPaddingTop() + (i29 - hr0Var.H0.f12316b), 1073741824));
                    }
                } else {
                    sq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            sq0Var = this;
        }
        hr0Var.e1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f30609w0) {
            return;
        }
        super.requestLayout();
    }
}
