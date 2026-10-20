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
public final class pq0 extends lw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final f6 G0;
    public final fr0 H0;
    public boolean f29358w0;
    public final RectF f29359x0;
    public boolean f29360y0;
    public int f29361z0;

    public pq0(fr0 fr0Var, Context context) {
        super(context, null);
        this.H0 = fr0Var;
        this.f29358w0 = false;
        this.f29359x0 = new RectF();
        this.H = new oq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5)) > 0.721f;
        this.G0 = new f6(this, 0L, 350L, bs.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        fr0 fr0Var = this.H0;
        hq0 hq0Var = fr0Var.H;
        jm0 jm0Var = fr0Var.F;
        hq0 hq0Var2 = fr0Var.G;
        if (hq0Var2.getVisibility() == 0 && hq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(hq0Var2.getX(), hq0Var2.getY());
            hq0Var2.draw(canvas);
            canvas.restore();
        }
        if (jm0Var.getVisibility() == 0 && jm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jm0Var.getX(), jm0Var.getY());
            jm0Var.draw(canvas);
            canvas.restore();
        }
        if (hq0Var.getVisibility() == 0 && hq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(hq0Var.getX(), hq0Var.getY());
            hq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        fr0 fr0Var = this.H0;
        gh.d dVar = fr0Var.R0;
        gh.d dVar2 = fr0Var.Q0;
        if (Build.VERSION.SDK_INT >= 31 && fr0Var.P0 != null) {
            fr0.E0(fr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + fr0Var.f26389u0, getMeasuredWidth(), getMeasuredHeight() + fr0Var.f26389u0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof tz) {
            fr0 fr0Var = this.H0;
            if (fr0Var.W0 != null) {
                canvas.save();
                fr0Var.W0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(fr0Var.W0.f8014j.f8003k);
                fr0Var.W0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        d6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return d6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f21634b = this;
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
        fr0 fr0Var = this.H0;
        Drawable drawable = fr0Var.S;
        FrameLayout frameLayout = fr0Var.f26393x;
        canvas.translate(0.0f, fr0Var.f26389u0);
        int i18 = fr0Var.f26383q0;
        i10 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i18 - i10) + this.f29361z0;
        int i19 = fr0Var.f26383q0;
        i11 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int dp3 = ((i19 - i11) - AndroidUtilities.dp(13.0f)) + this.f29361z0;
        fr0Var.Y = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int i20 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) fr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += fr0Var.H0.f12284b;
            if (this.f29360y0) {
                i17 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
                if (i17 + dp3 < fr0Var.H0.f12284b) {
                    z12 = true;
                    int i21 = dp3 + fr0Var.H0.f12284b;
                    i16 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i21, -i16, f7);
                }
            }
            z12 = false;
            int i212 = dp3 + fr0Var.H0.f12284b;
            i16 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i212, -i16, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i20);
        drawable.draw(canvas);
        i13 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        float f10 = i13 + dp3 + fr0Var.f26389u0;
        if (fr0Var.f26379n != f10) {
            fr0Var.f26379n = f10;
            fr0Var.f26365b.invalidate();
        }
        if (frameLayout != null) {
            if (dp3 > fr0Var.H0.f12284b || frameLayout.getChildCount() <= 0) {
                i15 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i15 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.f29523w;
                if (qcVar != null) {
                    ub ubVar = qcVar.e;
                    if (ubVar != null) {
                        ubVar.setTop(true);
                    }
                    qcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f11 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f29359x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.h6.f21280t0.setColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.f21280t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21280t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (this.F0 && 0 > fr0Var.H0.f12284b * 0.5f) {
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
        this.A0 = this.f29361z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f29360y0;
        fr0 fr0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f29361z0 - AndroidUtilities.dp(30.0f)) {
                fr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && fr0Var.f26383q0 != 0 && motionEvent.getY() < fr0Var.f26383q0 - AndroidUtilities.dp(30.0f)) {
            fr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pq0.onLayout(boolean, int, int, int, int):void");
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
        pq0 pq0Var = this;
        fr0 fr0Var = pq0Var.H0;
        hq0 hq0Var = fr0Var.H;
        FrameLayout frameLayout = fr0Var.f26369d0;
        hq0 hq0Var2 = fr0Var.G;
        jm0 jm0Var = fr0Var.F;
        if (pq0Var.getLayoutParams().height > 0) {
            size = pq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = fr0Var.I;
        int i22 = 0;
        if (pq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        xz xzVar = fr0Var.K;
        if (pq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) fr0Var).isFullscreen;
        if (!z12) {
            pq0Var.f29358w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
            int i23 = fr0Var.H0.f12284b;
            i21 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
            pq0Var.setPadding(i20, i23, i21, 0);
            pq0Var.f29358w0 = false;
        }
        int paddingTop = size - pq0Var.getPaddingTop();
        int max = Math.max(fr0Var.N.h(), fr0Var.L.h() - 1);
        int D = org.telegram.messenger.g0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (jm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.g0.D(103.0f, Math.max(2, (int) Math.ceil((fr0Var.M.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, jm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + fr0Var.H0.d;
        if (hq0Var2.getPaddingTop() != i13 || hq0Var2.getPaddingBottom() != dp) {
            pq0Var.f29358w0 = true;
            hq0Var2.setPadding(0, i13, 0, dp);
            jm0Var.setPadding(0, i13, 0, dp);
            pq0Var.f29358w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) fr0Var).keyboardVisible;
        if (z13 && pq0Var.getLayoutParams().height <= 0 && hq0Var.getPaddingTop() != i13) {
            pq0Var.f29358w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            hq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + fr0Var.H0.d);
            pq0Var.f29358w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        pq0Var.f29360y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        pq0Var.f29361z0 = i15;
        pq0Var.f29358w0 = true;
        fr0Var.M0(false);
        pq0Var.f29358w0 = false;
        pq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = fr0Var.f26386s;
        jq0 jq0Var = fr0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = pq0Var.R();
        fr0Var.O0 = R;
        if (!jq0Var.N && R <= AndroidUtilities.dp(20.0f) && !jq0Var.e && !jq0Var.O) {
            pq0Var.f29358w0 = true;
            jq0Var.j();
            pq0Var.f29358w0 = false;
        }
        pq0Var.f29358w0 = true;
        if (fr0Var.O0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) fr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = jq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (jq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!jq0Var.m()) {
                jq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        pq0Var.f29358w0 = false;
        int childCount = pq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = pq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (jq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), pq0Var.getPaddingTop() + (i29 - fr0Var.H0.f12284b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(pq0Var.getPaddingTop() + (i29 - fr0Var.H0.f12284b), 1073741824));
                    }
                } else {
                    pq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            pq0Var = this;
        }
        fr0Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.H0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29358w0) {
            return;
        }
        super.requestLayout();
    }
}
