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
public final class tq0 extends ow0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final f6 F0;
    public final ir0 G0;
    public boolean f30889w0;
    public final RectF f30890x0;
    public boolean f30891y0;
    public int f30892z0;

    public tq0(ir0 ir0Var, Context context) {
        super(context, null);
        this.G0 = ir0Var;
        this.f30889w0 = false;
        this.f30890x0 = new RectF();
        this.H = new sq0(this, this);
        AndroidUtilities.computePerceivedBrightness(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5));
        this.F0 = new f6(this, 0L, 350L, bs.h);
    }

    @Override
    public final void K(Canvas canvas, ArrayList arrayList) {
        ir0 ir0Var = this.G0;
        lq0 lq0Var = ir0Var.H;
        mm0 mm0Var = ir0Var.F;
        lq0 lq0Var2 = ir0Var.G;
        if (lq0Var2.getVisibility() == 0 && lq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(lq0Var2.getX(), lq0Var2.getY());
            lq0Var2.draw(canvas);
            canvas.restore();
        }
        if (mm0Var.getVisibility() == 0 && mm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mm0Var.getX(), mm0Var.getY());
            mm0Var.draw(canvas);
            canvas.restore();
        }
        if (lq0Var.getVisibility() == 0 && lq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(lq0Var.getX(), lq0Var.getY());
            lq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ir0 ir0Var = this.G0;
        gh.d dVar = ir0Var.R0;
        gh.d dVar2 = ir0Var.Q0;
        if (Build.VERSION.SDK_INT >= 31 && ir0Var.P0 != null) {
            ir0.J0(ir0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ir0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) ir0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) ir0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) ir0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + ir0Var.f27434u0, getMeasuredWidth(), getMeasuredHeight() + ir0Var.f27434u0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof tz) {
            ir0 ir0Var = this.G0;
            if (ir0Var.X0 != null) {
                canvas.save();
                ir0Var.X0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ir0Var.X0.v.f8015k);
                ir0Var.X0.draw(canvas);
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
        o1Var.f21719b = this;
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
        ir0 ir0Var = this.G0;
        Drawable drawable = ir0Var.S;
        FrameLayout frameLayout = ir0Var.f27438x;
        canvas.translate(0.0f, ir0Var.f27434u0);
        int i18 = ir0Var.f27428q0;
        i10 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i18 - i10) + this.f30892z0;
        int i19 = ir0Var.f27428q0;
        i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
        int dp3 = ((i19 - i11) - AndroidUtilities.dp(13.0f)) + this.f30892z0;
        ir0Var.Y = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
        int i20 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.h3) ir0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += ir0Var.H0.f12316b;
            if (this.f30891y0) {
                i17 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
                if (i17 + dp3 < ir0Var.H0.f12316b) {
                    z12 = true;
                    int i21 = dp3 + ir0Var.H0.f12316b;
                    i16 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
                    f7 = this.F0.e(z12);
                    dp3 = AndroidUtilities.lerp(i21, -i16, f7);
                }
            }
            z12 = false;
            int i212 = dp3 + ir0Var.H0.f12316b;
            i16 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
            f7 = this.F0.e(z12);
            dp3 = AndroidUtilities.lerp(i212, -i16, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i20);
        drawable.draw(canvas);
        i13 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
        float f10 = i13 + dp3 + ir0Var.f27434u0;
        if (ir0Var.f27424n != f10) {
            ir0Var.f27424n = f10;
            ir0Var.f27408b.invalidate();
        }
        if (frameLayout != null) {
            if (dp3 > ir0Var.H0.f12316b || frameLayout.getChildCount() <= 0) {
                i15 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i15 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.f29825w;
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
            RectF rectF = this.f30890x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.k6.f21473t0.setColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
            org.telegram.ui.ActionBar.k6.f21473t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21473t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (AndroidUtilities.computePerceivedBrightness(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5)) > 0.721f && 0 > ir0Var.H0.f12316b * 0.5f) {
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
        this.A0 = this.f30892z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f30891y0;
        ir0 ir0Var = this.G0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f30892z0 - AndroidUtilities.dp(30.0f)) {
                ir0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && ir0Var.f27428q0 != 0 && motionEvent.getY() < ir0Var.f27428q0 - AndroidUtilities.dp(30.0f)) {
            ir0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tq0.onLayout(boolean, int, int, int, int):void");
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
        tq0 tq0Var = this;
        ir0 ir0Var = tq0Var.G0;
        lq0 lq0Var = ir0Var.H;
        FrameLayout frameLayout = ir0Var.f27414d0;
        lq0 lq0Var2 = ir0Var.G;
        mm0 mm0Var = ir0Var.F;
        if (tq0Var.getLayoutParams().height > 0) {
            size = tq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = ir0Var.I;
        int i22 = 0;
        if (tq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        xz xzVar = ir0Var.K;
        if (tq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.h3) ir0Var).isFullscreen;
        if (!z12) {
            tq0Var.f30889w0 = true;
            i20 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingLeft;
            int i23 = ir0Var.H0.f12316b;
            i21 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingLeft;
            tq0Var.setPadding(i20, i23, i21, 0);
            tq0Var.f30889w0 = false;
        }
        int paddingTop = size - tq0Var.getPaddingTop();
        int max = Math.max(ir0Var.N.h(), ir0Var.L.h() - 1);
        int D = org.telegram.messenger.v0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (mm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.v0.D(103.0f, Math.max(2, (int) Math.ceil((ir0Var.M.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, mm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + ir0Var.H0.d;
        if (lq0Var2.getPaddingTop() != i13 || lq0Var2.getPaddingBottom() != dp) {
            tq0Var.f30889w0 = true;
            lq0Var2.setPadding(0, i13, 0, dp);
            mm0Var.setPadding(0, i13, 0, dp);
            tq0Var.f30889w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.h3) ir0Var).keyboardVisible;
        if (z13 && tq0Var.getLayoutParams().height <= 0 && lq0Var.getPaddingTop() != i13) {
            tq0Var.f30889w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            lq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + ir0Var.H0.d);
            tq0Var.f30889w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        tq0Var.f30891y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        tq0Var.f30892z0 = i15;
        tq0Var.f30889w0 = true;
        ir0Var.P0(false);
        tq0Var.f30889w0 = false;
        tq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.h3) ir0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = ir0Var.f27431s;
        nq0 nq0Var = ir0Var.d;
        int i27 = size2 - (i16 * 2);
        int Q = tq0Var.Q();
        ir0Var.O0 = Q;
        if (!nq0Var.N && Q <= AndroidUtilities.dp(20.0f) && !nq0Var.e && !nq0Var.O) {
            tq0Var.f30889w0 = true;
            nq0Var.j();
            tq0Var.f30889w0 = false;
        }
        tq0Var.f30889w0 = true;
        if (ir0Var.O0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.h3) ir0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = nq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (nq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!nq0Var.m()) {
                nq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        tq0Var.f30889w0 = false;
        int childCount = tq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = tq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (nq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), tq0Var.getPaddingTop() + (i29 - ir0Var.H0.f12316b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(tq0Var.getPaddingTop() + (i29 - ir0Var.H0.f12316b), 1073741824));
                    }
                } else {
                    tq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            tq0Var = this;
        }
        ir0Var.e1();
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
        if (this.f30889w0) {
            return;
        }
        super.requestLayout();
    }
}
