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
public final class yq0 extends tw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final g6 G0;
    public final nr0 H0;
    public boolean f33444w0;
    public final RectF f33445x0;
    public boolean f33446y0;
    public int f33447z0;

    public yq0(nr0 nr0Var, Context context) {
        super(context, null);
        this.H0 = nr0Var;
        this.f33444w0 = false;
        this.f33445x0 = new RectF();
        this.H = new xq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(nr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5)) > 0.721f;
        this.G0 = new g6(this, 0L, 350L, is.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        nr0 nr0Var = this.H0;
        pq0 pq0Var = nr0Var.G;
        rm0 rm0Var = nr0Var.E;
        pq0 pq0Var2 = nr0Var.F;
        if (pq0Var2.getVisibility() == 0 && pq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(pq0Var2.getX(), pq0Var2.getY());
            pq0Var2.draw(canvas);
            canvas.restore();
        }
        if (rm0Var.getVisibility() == 0 && rm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(rm0Var.getX(), rm0Var.getY());
            rm0Var.draw(canvas);
            canvas.restore();
        }
        if (pq0Var.getVisibility() == 0 && pq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(pq0Var.getX(), pq0Var.getY());
            pq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        nr0 nr0Var = this.H0;
        fh.d dVar = nr0Var.Q0;
        fh.d dVar2 = nr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && nr0Var.O0 != null) {
            nr0.B0(nr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) nr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) nr0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) nr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) nr0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + nr0Var.f29257t0, getMeasuredWidth(), getMeasuredHeight() + nr0Var.f29257t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof b00) {
            nr0 nr0Var = this.H0;
            if (nr0Var.V0 != null) {
                canvas.save();
                nr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(nr0Var.V0.f4684j.f4672k);
                nr0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        d6Var = ((org.telegram.ui.ActionBar.e3) this.H0).resourcesProvider;
        return d6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f21445b = this;
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
        boolean z11;
        int i13;
        int dp;
        Paint paint;
        int i14;
        boolean z12;
        int i15;
        int i16;
        canvas.save();
        nr0 nr0Var = this.H0;
        Drawable drawable = nr0Var.R;
        FrameLayout frameLayout = nr0Var.f29260w;
        canvas.translate(0.0f, nr0Var.f29257t0);
        int i17 = nr0Var.f29251p0;
        i10 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f33447z0;
        int i18 = nr0Var.f29251p0;
        i11 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f33447z0;
        nr0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.e3) nr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += nr0Var.G0.f11576b;
            if (this.f33446y0) {
                i16 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
                if (i16 + dp3 < nr0Var.G0.f11576b) {
                    z12 = true;
                    int i20 = dp3 + nr0Var.G0.f11576b;
                    i15 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + nr0Var.G0.f11576b;
            i15 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > nr0Var.G0.f11576b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                sc scVar = sc.f30825w;
                if (scVar != null) {
                    wb wbVar = scVar.f30829e;
                    if (wbVar != null) {
                        wbVar.setTop(true);
                    }
                    scVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f33445x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.h6.f21112t0.setColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.f21112t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21112t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (this.F0 && 0 > nr0Var.G0.f11576b * 0.5f) {
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
        this.A0 = this.f33447z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f33446y0;
        nr0 nr0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f33447z0 - AndroidUtilities.dp(30.0f)) {
                nr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && nr0Var.f29251p0 != 0 && motionEvent.getY() < nr0Var.f29251p0 - AndroidUtilities.dp(30.0f)) {
            nr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yq0.onLayout(boolean, int, int, int, int):void");
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
        yq0 yq0Var = this;
        nr0 nr0Var = yq0Var.H0;
        pq0 pq0Var = nr0Var.G;
        FrameLayout frameLayout = nr0Var.f29236c0;
        pq0 pq0Var2 = nr0Var.F;
        rm0 rm0Var = nr0Var.E;
        if (yq0Var.getLayoutParams().height > 0) {
            size = yq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = nr0Var.H;
        int i22 = 0;
        if (yq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        f00 f00Var = nr0Var.J;
        if (yq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f00Var.G = z11;
        z12 = ((org.telegram.ui.ActionBar.e3) nr0Var).isFullscreen;
        if (!z12) {
            yq0Var.f33444w0 = true;
            i20 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingLeft;
            int i23 = nr0Var.G0.f11576b;
            i21 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingLeft;
            yq0Var.setPadding(i20, i23, i21, 0);
            yq0Var.f33444w0 = false;
        }
        int paddingTop = size - yq0Var.getPaddingTop();
        int max = Math.max(nr0Var.M.h(), nr0Var.K.h() - 1);
        int D = org.telegram.messenger.q.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (rm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.q.D(103.0f, Math.max(2, (int) Math.ceil((nr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, rm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + nr0Var.G0.d;
        if (pq0Var2.getPaddingTop() != i13 || pq0Var2.getPaddingBottom() != dp) {
            yq0Var.f33444w0 = true;
            pq0Var2.setPadding(0, i13, 0, dp);
            rm0Var.setPadding(0, i13, 0, dp);
            yq0Var.f33444w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.e3) nr0Var).keyboardVisible;
        if (z13 && yq0Var.getLayoutParams().height <= 0 && pq0Var.getPaddingTop() != i13) {
            yq0Var.f33444w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            pq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + nr0Var.G0.d);
            yq0Var.f33444w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        yq0Var.f33446y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        yq0Var.f33447z0 = i15;
        yq0Var.f33444w0 = true;
        nr0Var.L0(false);
        yq0Var.f33444w0 = false;
        yq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.e3) nr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = nr0Var.f29253r;
        sq0 sq0Var = nr0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = yq0Var.R();
        nr0Var.N0 = R;
        if (!sq0Var.N && R <= AndroidUtilities.dp(20.0f) && !sq0Var.f24682e && !sq0Var.O) {
            yq0Var.f33444w0 = true;
            sq0Var.j();
            yq0Var.f33444w0 = false;
        }
        yq0Var.f33444w0 = true;
        if (nr0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.e3) nr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = sq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (sq0Var.f24682e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!sq0Var.m()) {
                sq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        yq0Var.f33444w0 = false;
        int childCount = yq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = yq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (sq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), yq0Var.getPaddingTop() + (i29 - nr0Var.G0.f11576b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(yq0Var.getPaddingTop() + (i29 - nr0Var.G0.f11576b), 1073741824));
                    }
                } else {
                    yq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            yq0Var = this;
        }
        nr0Var.Z0();
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
        if (this.f33444w0) {
            return;
        }
        super.requestLayout();
    }
}
