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
public final class np0 extends hv0 {
    public int A0;
    public final boolean B0;
    public final d6 C0;
    public final dq0 D0;
    public boolean f31110s0;
    public final RectF f31111t0;
    public boolean f31112u0;
    public int f31113v0;
    public int f31114w0;
    public int f31115x0;
    public int f31116y0;
    public int f31117z0;

    public np0(dq0 dq0Var, Context context) {
        super(context, null);
        this.D0 = dq0Var;
        this.f31110s0 = false;
        this.f31111t0 = new RectF();
        this.D = new mp0(this, this);
        this.B0 = AndroidUtilities.computePerceivedBrightness(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5)) > 0.721f;
        this.C0 = new d6(this, 0L, 350L, jr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        dq0 dq0Var = this.D0;
        dp0 dp0Var = dq0Var.C;
        jl0 jl0Var = dq0Var.A;
        dp0 dp0Var2 = dq0Var.B;
        if (dp0Var2.getVisibility() == 0 && dp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(dp0Var2.getX(), dp0Var2.getY());
            dp0Var2.draw(canvas);
            canvas.restore();
        }
        if (jl0Var.getVisibility() == 0 && jl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jl0Var.getX(), jl0Var.getY());
            jl0Var.draw(canvas);
            canvas.restore();
        }
        if (dp0Var.getVisibility() == 0 && dp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(dp0Var.getX(), dp0Var.getY());
            dp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        dq0 dq0Var = this.D0;
        qg.d dVar = dq0Var.M0;
        qg.d dVar2 = dq0Var.L0;
        if (Build.VERSION.SDK_INT >= 31 && dq0Var.K0 != null) {
            dq0.A0(dq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + dq0Var.f27846p0, getMeasuredWidth(), getMeasuredHeight() + dq0Var.f27846p0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof fz) {
            dq0 dq0Var = this.D0;
            if (dq0Var.R0 != null) {
                canvas.save();
                dq0Var.R0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dq0Var.R0.h.f17334k);
                dq0Var.R0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        org.telegram.ui.ActionBar.c6 c6Var;
        c6Var = ((org.telegram.ui.ActionBar.f3) this.D0).resourcesProvider;
        return c6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.D;
        q1Var.f23737b = this;
        q1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f9;
        boolean z11;
        int i13;
        int dp;
        Paint paint;
        int i14;
        boolean z12;
        int i15;
        int i16;
        canvas.save();
        dq0 dq0Var = this.D0;
        Drawable drawable = dq0Var.N;
        FrameLayout frameLayout = dq0Var.f27855w;
        canvas.translate(0.0f, dq0Var.f27846p0);
        int i17 = dq0Var.f27842l0;
        i10 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f31113v0;
        int i18 = dq0Var.f27842l0;
        i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f31113v0;
        dq0Var.T = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) dq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += dq0Var.C0.f8187b;
            if (this.f31112u0) {
                i16 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
                if (i16 + dp3 < dq0Var.C0.f8187b) {
                    z12 = true;
                    int i20 = dp3 + dq0Var.C0.f8187b;
                    i15 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
                    f9 = this.C0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f9);
                }
            }
            z12 = false;
            int i202 = dp3 + dq0Var.C0.f8187b;
            i15 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
            f9 = this.C0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f9);
        } else {
            f9 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > dq0Var.C0.f8187b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                mc mcVar = mc.f30644w;
                if (mcVar != null) {
                    rb rbVar = mcVar.f30648e;
                    if (rbVar != null) {
                        rbVar.setTop(true);
                    }
                    mcVar.b();
                }
            }
        }
        if (f9 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f31111t0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.g6.f23340t0.setColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            org.telegram.ui.ActionBar.g6.f23340t0.setAlpha((int) ((1.0f - f9) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.B0 && 0 > dq0Var.C0.f8187b * 0.5f) {
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
        }
        canvas.restore();
        this.f31114w0 = this.f31113v0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f31112u0;
        dq0 dq0Var = this.D0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f31113v0 - AndroidUtilities.dp(30.0f)) {
                dq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && dq0Var.f27842l0 != 0 && motionEvent.getY() < dq0Var.f27842l0 - AndroidUtilities.dp(30.0f)) {
            dq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.np0.onLayout(boolean, int, int, int, int):void");
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
        np0 np0Var = this;
        dq0 dq0Var = np0Var.D0;
        dp0 dp0Var = dq0Var.C;
        FrameLayout frameLayout = dq0Var.Y;
        dp0 dp0Var2 = dq0Var.B;
        jl0 jl0Var = dq0Var.A;
        if (np0Var.getLayoutParams().height > 0) {
            size = np0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        f2.w wVar = dq0Var.D;
        int i22 = 0;
        if (np0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wVar.G = z10;
        jz jzVar = dq0Var.F;
        if (np0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        jzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) dq0Var).isFullscreen;
        if (!z12) {
            np0Var.f31110s0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
            int i23 = dq0Var.C0.f8187b;
            i21 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
            np0Var.setPadding(i20, i23, i21, 0);
            np0Var.f31110s0 = false;
        }
        int paddingTop = size - np0Var.getPaddingTop();
        int max = Math.max(dq0Var.I.h(), dq0Var.G.h() - 1);
        int D = org.telegram.messenger.x3.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (jl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.x3.D(103.0f, Math.max(2, (int) Math.ceil((dq0Var.H.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, jl0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + dq0Var.C0.d;
        if (dp0Var2.getPaddingTop() != i13 || dp0Var2.getPaddingBottom() != dp2) {
            np0Var.f31110s0 = true;
            dp0Var2.setPadding(0, i13, 0, dp2);
            jl0Var.setPadding(0, i13, 0, dp2);
            np0Var.f31110s0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) dq0Var).keyboardVisible;
        if (z13 && np0Var.getLayoutParams().height <= 0 && dp0Var.getPaddingTop() != i13) {
            np0Var.f31110s0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            dp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + dq0Var.C0.d);
            np0Var.f31110s0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        np0Var.f31112u0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        np0Var.f31113v0 = i15;
        np0Var.f31110s0 = true;
        dq0Var.K0(false);
        np0Var.f31110s0 = false;
        np0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = dq0Var.f27848r;
        gp0 gp0Var = dq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = np0Var.R();
        dq0Var.J0 = R;
        if (!gp0Var.J && R <= AndroidUtilities.dp(20.0f) && !gp0Var.f26885e && !gp0Var.K) {
            np0Var.f31110s0 = true;
            gp0Var.j();
            np0Var.f31110s0 = false;
        }
        np0Var.f31110s0 = true;
        if (dq0Var.J0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) dq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = gp0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (gp0Var.f26885e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!gp0Var.m()) {
                gp0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        np0Var.f31110s0 = false;
        int childCount = np0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = np0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (gp0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), np0Var.getPaddingTop() + (i29 - dq0Var.C0.f8187b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(np0Var.getPaddingTop() + (i29 - dq0Var.C0.f8187b), 1073741824));
                    }
                } else {
                    np0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            np0Var = this;
        }
        dq0Var.Y0();
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
        if (this.f31110s0) {
            return;
        }
        super.requestLayout();
    }
}
