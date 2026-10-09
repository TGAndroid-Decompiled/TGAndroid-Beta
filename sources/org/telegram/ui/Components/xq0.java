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
public final class xq0 extends sw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final g6 G0;
    public final mr0 H0;
    public boolean f32992w0;
    public final RectF f32993x0;
    public boolean f32994y0;
    public int f32995z0;

    public xq0(mr0 mr0Var, Context context) {
        super(context, null);
        this.H0 = mr0Var;
        this.f32992w0 = false;
        this.f32993x0 = new RectF();
        this.H = new wq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5)) > 0.721f;
        this.G0 = new g6(this, 0L, 350L, hs.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        mr0 mr0Var = this.H0;
        oq0 oq0Var = mr0Var.G;
        qm0 qm0Var = mr0Var.E;
        oq0 oq0Var2 = mr0Var.F;
        if (oq0Var2.getVisibility() == 0 && oq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(oq0Var2.getX(), oq0Var2.getY());
            oq0Var2.draw(canvas);
            canvas.restore();
        }
        if (qm0Var.getVisibility() == 0 && qm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(qm0Var.getX(), qm0Var.getY());
            qm0Var.draw(canvas);
            canvas.restore();
        }
        if (oq0Var.getVisibility() == 0 && oq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(oq0Var.getX(), oq0Var.getY());
            oq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        mr0 mr0Var = this.H0;
        fh.d dVar = mr0Var.Q0;
        fh.d dVar2 = mr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && mr0Var.O0 != null) {
            mr0.B0(mr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) mr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) mr0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) mr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) mr0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + mr0Var.f28918t0, getMeasuredWidth(), getMeasuredHeight() + mr0Var.f28918t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof a00) {
            mr0 mr0Var = this.H0;
            if (mr0Var.V0 != null) {
                canvas.save();
                mr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(mr0Var.V0.f4685j.f4673k);
                mr0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        org.telegram.ui.ActionBar.e6 e6Var;
        e6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return e6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.p1 p1Var = this.H;
        p1Var.f21457b = this;
        p1Var.c();
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
        boolean z11;
        int i13;
        int dp;
        Paint paint;
        int i14;
        boolean z12;
        int i15;
        int i16;
        canvas.save();
        mr0 mr0Var = this.H0;
        Drawable drawable = mr0Var.R;
        FrameLayout frameLayout = mr0Var.f28921w;
        canvas.translate(0.0f, mr0Var.f28918t0);
        int i17 = mr0Var.f28912p0;
        i10 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f32995z0;
        int i18 = mr0Var.f28912p0;
        i11 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f32995z0;
        mr0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) mr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += mr0Var.G0.f11577b;
            if (this.f32994y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
                if (i16 + dp3 < mr0Var.G0.f11577b) {
                    z12 = true;
                    int i20 = dp3 + mr0Var.G0.f11577b;
                    i15 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + mr0Var.G0.f11577b;
            i15 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > mr0Var.G0.f11577b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                tc tcVar = tc.f31122w;
                if (tcVar != null) {
                    xb xbVar = tcVar.f31126e;
                    if (xbVar != null) {
                        xbVar.setTop(true);
                    }
                    tcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f32993x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.i6.f21086t0.setColor(mr0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
            org.telegram.ui.ActionBar.i6.f21086t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21086t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (this.F0 && 0 > mr0Var.G0.f11577b * 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z13 = false;
        }
        if (z11 != z13) {
            if (z11) {
                i13 = systemUiVisibility | 8192;
            } else {
                i13 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i13);
        }
        canvas.restore();
        this.A0 = this.f32995z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f32994y0;
        mr0 mr0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f32995z0 - AndroidUtilities.dp(30.0f)) {
                mr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && mr0Var.f28912p0 != 0 && motionEvent.getY() < mr0Var.f28912p0 - AndroidUtilities.dp(30.0f)) {
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
        mr0 mr0Var = xq0Var.H0;
        oq0 oq0Var = mr0Var.G;
        FrameLayout frameLayout = mr0Var.f28897c0;
        oq0 oq0Var2 = mr0Var.F;
        qm0 qm0Var = mr0Var.E;
        if (xq0Var.getLayoutParams().height > 0) {
            size = xq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = mr0Var.H;
        int i22 = 0;
        if (xq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        e00 e00Var = mr0Var.J;
        if (xq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e00Var.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) mr0Var).isFullscreen;
        if (!z12) {
            xq0Var.f32992w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingLeft;
            int i23 = mr0Var.G0.f11577b;
            i21 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingLeft;
            xq0Var.setPadding(i20, i23, i21, 0);
            xq0Var.f32992w0 = false;
        }
        int paddingTop = size - xq0Var.getPaddingTop();
        int max = Math.max(mr0Var.M.h(), mr0Var.K.h() - 1);
        int D = org.telegram.messenger.q.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (qm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.q.D(103.0f, Math.max(2, (int) Math.ceil((mr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, qm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + mr0Var.G0.d;
        if (oq0Var2.getPaddingTop() != i13 || oq0Var2.getPaddingBottom() != dp) {
            xq0Var.f32992w0 = true;
            oq0Var2.setPadding(0, i13, 0, dp);
            qm0Var.setPadding(0, i13, 0, dp);
            xq0Var.f32992w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) mr0Var).keyboardVisible;
        if (z13 && xq0Var.getLayoutParams().height <= 0 && oq0Var.getPaddingTop() != i13) {
            xq0Var.f32992w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            oq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + mr0Var.G0.d);
            xq0Var.f32992w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        xq0Var.f32994y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        xq0Var.f32995z0 = i15;
        xq0Var.f32992w0 = true;
        mr0Var.L0(false);
        xq0Var.f32992w0 = false;
        xq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) mr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = mr0Var.f28914r;
        rq0 rq0Var = mr0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = xq0Var.R();
        mr0Var.N0 = R;
        if (!rq0Var.N && R <= AndroidUtilities.dp(20.0f) && !rq0Var.f33652e && !rq0Var.O) {
            xq0Var.f32992w0 = true;
            rq0Var.j();
            xq0Var.f32992w0 = false;
        }
        xq0Var.f32992w0 = true;
        if (mr0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) mr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = rq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (rq0Var.f33652e) {
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
        xq0Var.f32992w0 = false;
        int childCount = xq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = xq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (rq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), xq0Var.getPaddingTop() + (i29 - mr0Var.G0.f11577b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(xq0Var.getPaddingTop() + (i29 - mr0Var.G0.f11577b), 1073741824));
                    }
                } else {
                    xq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            xq0Var = this;
        }
        mr0Var.Z0();
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
        if (this.f32992w0) {
            return;
        }
        super.requestLayout();
    }
}
