package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xq0 extends vw0 {
    public boolean f34794l0;
    public final RectF m0;
    public boolean f34795n0;
    public int f34796o0;
    public int f34797p0;
    public int f34798q0;
    public int f34799r0;
    public int f34800s0;
    public int f34801t0;
    public final h6 f34802u0;
    public final mr0 f34803v0;

    public xq0(mr0 mr0Var, Context context) {
        super(context, null);
        this.f34803v0 = mr0Var;
        this.f34794l0 = false;
        this.m0 = new RectF();
        this.H = new wq0(this, this);
        AndroidUtilities.computePerceivedBrightness(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5));
        this.f34802u0 = new h6(this, 0L, 350L, ds.h);
    }

    @Override
    public final void K(Canvas canvas, ArrayList arrayList) {
        mr0 mr0Var = this.f34803v0;
        nq0 nq0Var = mr0Var.H;
        mm0 mm0Var = mr0Var.F;
        nq0 nq0Var2 = mr0Var.G;
        if (nq0Var2.getVisibility() == 0 && nq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(nq0Var2.getX(), nq0Var2.getY());
            nq0Var2.draw(canvas);
            canvas.restore();
        }
        if (mm0Var.getVisibility() == 0 && mm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mm0Var.getX(), mm0Var.getY());
            mm0Var.draw(canvas);
            canvas.restore();
        }
        if (nq0Var.getVisibility() == 0 && nq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(nq0Var.getX(), nq0Var.getY());
            nq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        mr0 mr0Var = this.f34803v0;
        canvas.clipRect(0.0f, getPaddingTop() + mr0Var.f30722u0, getMeasuredWidth(), getMeasuredHeight() + mr0Var.f30722u0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof sz) {
            mr0 mr0Var = this.f34803v0;
            if (mr0Var.V0 != null) {
                canvas.save();
                mr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(mr0Var.V0.f9966x.f9956k);
                mr0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        org.telegram.ui.ActionBar.u6 u6Var;
        u6Var = ((org.telegram.ui.ActionBar.k3) this.f34803v0).resourcesProvider;
        return u6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.H;
        q1Var.f22963b = this;
        q1Var.c();
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
        mr0 mr0Var = this.f34803v0;
        Drawable drawable = mr0Var.S;
        FrameLayout frameLayout = mr0Var.f30726x;
        canvas.translate(0.0f, mr0Var.f30722u0);
        int i18 = mr0Var.f30716q0;
        i10 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i18 - i10) + this.f34796o0;
        int i19 = mr0Var.f30716q0;
        i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
        int dp3 = ((i19 - i11) - AndroidUtilities.dp(13.0f)) + this.f34796o0;
        mr0Var.Y = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
        int i20 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.k3) mr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += mr0Var.H0.f13451b;
            if (this.f34795n0) {
                i17 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
                if (i17 + dp3 < mr0Var.H0.f13451b) {
                    z12 = true;
                    int i21 = dp3 + mr0Var.H0.f13451b;
                    i16 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
                    f7 = this.f34802u0.e(z12);
                    dp3 = AndroidUtilities.lerp(i21, -i16, f7);
                }
            }
            z12 = false;
            int i212 = dp3 + mr0Var.H0.f13451b;
            i16 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
            f7 = this.f34802u0.e(z12);
            dp3 = AndroidUtilities.lerp(i212, -i16, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i20);
        drawable.draw(canvas);
        i13 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
        float f10 = i13 + dp3 + mr0Var.f30722u0;
        if (mr0Var.f30712n != f10) {
            mr0Var.f30712n = f10;
            mr0Var.f30698b.invalidate();
        }
        if (frameLayout != null) {
            if (dp3 > mr0Var.H0.f13451b || frameLayout.getChildCount() <= 0) {
                i15 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i15 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.f31880x;
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
            RectF rectF = this.m0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.y6.f23646t0.setColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii));
            org.telegram.ui.ActionBar.y6.f23646t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23646t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (AndroidUtilities.computePerceivedBrightness(mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5)) > 0.721f && 0 > mr0Var.H0.f13451b * 0.5f) {
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
        this.f34797p0 = this.f34796o0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f34795n0;
        mr0 mr0Var = this.f34803v0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f34796o0 - AndroidUtilities.dp(30.0f)) {
                mr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && mr0Var.f30716q0 != 0 && motionEvent.getY() < mr0Var.f30716q0 - AndroidUtilities.dp(30.0f)) {
            mr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xq0.onLayout(boolean, int, int, int, int):void");
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
        xq0 xq0Var = this;
        mr0 mr0Var = xq0Var.f34803v0;
        nq0 nq0Var = mr0Var.H;
        FrameLayout frameLayout = mr0Var.f30702d0;
        nq0 nq0Var2 = mr0Var.G;
        mm0 mm0Var = mr0Var.F;
        if (xq0Var.getLayoutParams().height > 0) {
            size = xq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.t tVar = mr0Var.I;
        int i22 = 0;
        if (xq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tVar.G = z10;
        xz xzVar = mr0Var.K;
        if (xq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.k3) mr0Var).isFullscreen;
        if (!z12) {
            xq0Var.f34794l0 = true;
            i20 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingLeft;
            int i23 = mr0Var.H0.f13451b;
            i21 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingLeft;
            xq0Var.setPadding(i20, i23, i21, 0);
            xq0Var.f34794l0 = false;
        }
        int paddingTop = size - xq0Var.getPaddingTop();
        int max = Math.max(mr0Var.N.h(), mr0Var.L.h() - 1);
        int b10 = org.telegram.messenger.vh.b(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
        int i24 = i12 + b10;
        if (mm0Var.getVisibility() != 8) {
            int b11 = org.telegram.messenger.vh.b(103.0f, Math.max(2, (int) Math.ceil((mr0Var.M.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingTop;
            int i25 = i19 + b11;
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
        int dp = AndroidUtilities.dp(i14 + 100) + mr0Var.H0.d;
        if (nq0Var2.getPaddingTop() != i13 || nq0Var2.getPaddingBottom() != dp) {
            xq0Var.f34794l0 = true;
            nq0Var2.setPadding(0, i13, 0, dp);
            mm0Var.setPadding(0, i13, 0, dp);
            xq0Var.f34794l0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.k3) mr0Var).keyboardVisible;
        if (z13 && xq0Var.getLayoutParams().height <= 0 && nq0Var.getPaddingTop() != i13) {
            xq0Var.f34794l0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            nq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + mr0Var.H0.d);
            xq0Var.f34794l0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        xq0Var.f34795n0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        xq0Var.f34796o0 = i15;
        xq0Var.f34794l0 = true;
        mr0Var.M0(false);
        xq0Var.f34794l0 = false;
        xq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.k3) mr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = mr0Var.f30719s;
        rq0 rq0Var = mr0Var.d;
        int i27 = size2 - (i16 * 2);
        int Q = xq0Var.Q();
        mr0Var.O0 = Q;
        if (!rq0Var.N && Q <= AndroidUtilities.dp(20.0f) && !rq0Var.e && !rq0Var.O) {
            xq0Var.f34794l0 = true;
            rq0Var.j();
            xq0Var.f34794l0 = false;
        }
        xq0Var.f34794l0 = true;
        if (mr0Var.O0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.k3) mr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = rq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (rq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!rq0Var.m()) {
                rq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        xq0Var.f34794l0 = false;
        int childCount = xq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = xq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (rq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), xq0Var.getPaddingTop() + (i29 - mr0Var.H0.f13451b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(xq0Var.getPaddingTop() + (i29 - mr0Var.H0.f13451b), 1073741824));
                    }
                } else {
                    xq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            xq0Var = this;
        }
        mr0Var.b1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34803v0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34794l0) {
            return;
        }
        super.requestLayout();
    }
}
