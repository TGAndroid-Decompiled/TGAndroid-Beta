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
public final class cp0 extends xu0 {
    public int A0;
    public final boolean B0;
    public final y5 C0;
    public final rp0 D0;
    public boolean f27534s0;
    public final RectF f27535t0;
    public boolean f27536u0;
    public int f27537v0;
    public int f27538w0;
    public int f27539x0;
    public int f27540y0;
    public int f27541z0;

    public cp0(rp0 rp0Var, Context context) {
        super(context, null);
        this.D0 = rp0Var;
        this.f27534s0 = false;
        this.f27535t0 = new RectF();
        this.D = new bp0(this, this);
        this.B0 = AndroidUtilities.computePerceivedBrightness(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)) > 0.721f;
        this.C0 = new y5(this, 0L, 350L, gr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        rp0 rp0Var = this.D0;
        so0 so0Var = rp0Var.C;
        wk0 wk0Var = rp0Var.A;
        so0 so0Var2 = rp0Var.B;
        if (so0Var2.getVisibility() == 0 && so0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(so0Var2.getX(), so0Var2.getY());
            so0Var2.draw(canvas);
            canvas.restore();
        }
        if (wk0Var.getVisibility() == 0 && wk0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(wk0Var.getX(), wk0Var.getY());
            wk0Var.draw(canvas);
            canvas.restore();
        }
        if (so0Var.getVisibility() == 0 && so0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(so0Var.getX(), so0Var.getY());
            so0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        rp0 rp0Var = this.D0;
        ng.d dVar = rp0Var.M0;
        ng.d dVar2 = rp0Var.L0;
        if (Build.VERSION.SDK_INT >= 31 && rp0Var.K0 != null) {
            rp0.z0(rp0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + rp0Var.f32260p0, getMeasuredWidth(), getMeasuredHeight() + rp0Var.f32260p0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof wy) {
            rp0 rp0Var = this.D0;
            if (rp0Var.R0 != null) {
                canvas.save();
                rp0Var.R0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(rp0Var.R0.h.f14810k);
                rp0Var.R0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        org.telegram.ui.ActionBar.b6 b6Var;
        b6Var = ((org.telegram.ui.ActionBar.f3) this.D0).resourcesProvider;
        return b6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.D;
        q1Var.f23715b = this;
        q1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        boolean z10;
        float f10;
        boolean z11;
        int i12;
        int dp;
        Paint paint;
        int i13;
        boolean z12;
        int i14;
        int i15;
        canvas.save();
        rp0 rp0Var = this.D0;
        Drawable drawable = rp0Var.N;
        FrameLayout frameLayout = rp0Var.f32269w;
        canvas.translate(0.0f, rp0Var.f32260p0);
        int i16 = rp0Var.f32256l0;
        i9 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i16 - i9) + this.f27537v0;
        int i17 = rp0Var.f32256l0;
        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int dp3 = ((i17 - i10) - AndroidUtilities.dp(13.0f)) + this.f27537v0;
        rp0Var.T = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int i18 = i11 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) rp0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += rp0Var.C0.f10849b;
            if (this.f27536u0) {
                i15 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
                if (i15 + dp3 < rp0Var.C0.f10849b) {
                    z12 = true;
                    int i19 = dp3 + rp0Var.C0.f10849b;
                    i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
                    f10 = this.C0.e(z12);
                    dp3 = AndroidUtilities.lerp(i19, -i14, f10);
                }
            }
            z12 = false;
            int i192 = dp3 + rp0Var.C0.f10849b;
            i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
            f10 = this.C0.e(z12);
            dp3 = AndroidUtilities.lerp(i192, -i14, f10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i18);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > rp0Var.C0.f10849b || frameLayout.getChildCount() <= 0) {
                i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i13 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                gc gcVar = gc.f28729w;
                if (gcVar != null) {
                    lb lbVar = gcVar.f28733e;
                    if (lbVar != null) {
                        lbVar.setTop(true);
                    }
                    gcVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            float f11 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f27535t0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.f6.f23279t0.setColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
            org.telegram.ui.ActionBar.f6.f23279t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.B0 && 0 > rp0Var.C0.f10849b * 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((systemUiVisibility & 8192) <= 0) {
                z13 = false;
            }
            if (z11 != z13) {
                if (z11) {
                    i12 = systemUiVisibility | 8192;
                } else {
                    i12 = systemUiVisibility & (-8193);
                }
                setSystemUiVisibility(i12);
            }
        }
        canvas.restore();
        this.f27538w0 = this.f27537v0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f27536u0;
        rp0 rp0Var = this.D0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f27537v0 - AndroidUtilities.dp(30.0f)) {
                rp0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && rp0Var.f32256l0 != 0 && motionEvent.getY() < rp0Var.f32256l0 - AndroidUtilities.dp(30.0f)) {
            rp0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cp0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        int emojiPadding;
        int i18;
        int i19;
        int i20;
        cp0 cp0Var = this;
        rp0 rp0Var = cp0Var.D0;
        so0 so0Var = rp0Var.C;
        FrameLayout frameLayout = rp0Var.Y;
        so0 so0Var2 = rp0Var.B;
        wk0 wk0Var = rp0Var.A;
        if (cp0Var.getLayoutParams().height > 0) {
            size = cp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        f2.y yVar = rp0Var.D;
        int i21 = 0;
        if (cp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.G = z10;
        az azVar = rp0Var.F;
        if (cp0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        azVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) rp0Var).isFullscreen;
        if (!z12) {
            cp0Var.f27534s0 = true;
            i19 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
            int i22 = rp0Var.C0.f10849b;
            i20 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
            cp0Var.setPadding(i19, i22, i20, 0);
            cp0Var.f27534s0 = false;
        }
        int paddingTop = size - cp0Var.getPaddingTop();
        int max = Math.max(rp0Var.I.h(), rp0Var.G.h() - 1);
        int D = org.telegram.messenger.l0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int i23 = i11 + D;
        if (wk0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.l0.D(103.0f, Math.max(2, (int) Math.ceil((rp0Var.H.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i18 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
            int i24 = i18 + D2;
            if (i24 > i23) {
                i23 = AndroidUtilities.lerp(i23, i24, wk0Var.getAlpha());
            }
        }
        if (i23 < paddingTop) {
            i12 = 0;
        } else {
            i12 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i25 = 48;
        if (frameLayout != null) {
            i13 = 48;
        } else {
            i13 = 0;
        }
        int dp2 = AndroidUtilities.dp(i13 + 100) + rp0Var.C0.d;
        if (so0Var2.getPaddingTop() != i12 || so0Var2.getPaddingBottom() != dp2) {
            cp0Var.f27534s0 = true;
            so0Var2.setPadding(0, i12, 0, dp2);
            wk0Var.setPadding(0, i12, 0, dp2);
            cp0Var.f27534s0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) rp0Var).keyboardVisible;
        if (z13 && cp0Var.getLayoutParams().height <= 0 && so0Var.getPaddingTop() != i12) {
            cp0Var.f27534s0 = true;
            if (frameLayout == null) {
                i25 = 0;
            }
            so0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i25 + 60) + rp0Var.C0.d);
            cp0Var.f27534s0 = false;
        }
        if (i23 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        cp0Var.f27536u0 = z14;
        if (z14) {
            i14 = 0;
        } else {
            i14 = size - i23;
        }
        cp0Var.f27537v0 = i14;
        cp0Var.f27534s0 = true;
        rp0Var.K0(false);
        cp0Var.f27534s0 = false;
        cp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i9), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i9);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i15 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = rp0Var.f32262r;
        vo0 vo0Var = rp0Var.d;
        int i26 = size2 - (i15 * 2);
        int R = cp0Var.R();
        rp0Var.J0 = R;
        if (!vo0Var.J && R <= AndroidUtilities.dp(20.0f) && !vo0Var.f33124e && !vo0Var.K) {
            cp0Var.f27534s0 = true;
            vo0Var.j();
            cp0Var.f27534s0 = false;
        }
        cp0Var.f27534s0 = true;
        if (rp0Var.J0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) rp0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = vo0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (vo0Var.f33124e) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i17);
            }
            i16 = 8;
        } else {
            if (!vo0Var.m()) {
                vo0Var.j();
            }
            i16 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i27 = makeMeasureSpec;
        int i28 = size3;
        cp0Var.f27534s0 = false;
        int childCount = cp0Var.getChildCount();
        while (i21 < childCount) {
            View childAt = cp0Var.getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != i16) {
                if (vo0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), cp0Var.getPaddingTop() + (i28 - rp0Var.C0.f10849b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(cp0Var.getPaddingTop() + (i28 - rp0Var.C0.f10849b), 1073741824));
                    }
                } else {
                    cp0Var.measureChildWithMargins(childAt, i9, 0, i27, 0);
                }
            }
            i21++;
            cp0Var = this;
        }
        rp0Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.D0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27534s0) {
            return;
        }
        super.requestLayout();
    }
}
