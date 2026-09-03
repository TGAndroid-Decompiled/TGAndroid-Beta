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
public final class wp0 extends pv0 {
    public int A0;
    public int B0;
    public final boolean C0;
    public final z5 D0;
    public final lq0 E0;
    public boolean f32808t0;
    public final RectF f32809u0;
    public boolean f32810v0;
    public int f32811w0;
    public int f32812x0;
    public int f32813y0;
    public int f32814z0;

    public wp0(lq0 lq0Var, Context context) {
        super(context, null);
        this.E0 = lq0Var;
        this.f32808t0 = false;
        this.f32809u0 = new RectF();
        this.E = new vp0(this, this);
        this.C0 = AndroidUtilities.computePerceivedBrightness(lq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5)) > 0.721f;
        this.D0 = new z5(this, 0L, 350L, pr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        lq0 lq0Var = this.E0;
        mp0 mp0Var = lq0Var.D;
        sl0 sl0Var = lq0Var.B;
        mp0 mp0Var2 = lq0Var.C;
        if (mp0Var2.getVisibility() == 0 && mp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mp0Var2.getX(), mp0Var2.getY());
            mp0Var2.draw(canvas);
            canvas.restore();
        }
        if (sl0Var.getVisibility() == 0 && sl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(sl0Var.getX(), sl0Var.getY());
            sl0Var.draw(canvas);
            canvas.restore();
        }
        if (mp0Var.getVisibility() == 0 && mp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mp0Var.getX(), mp0Var.getY());
            mp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        lq0 lq0Var = this.E0;
        tg.d dVar = lq0Var.N0;
        tg.d dVar2 = lq0Var.M0;
        if (Build.VERSION.SDK_INT >= 31 && lq0Var.L0 != null) {
            lq0.A0(lq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + lq0Var.f28845q0, getMeasuredWidth(), getMeasuredHeight() + lq0Var.f28845q0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof mz) {
            lq0 lq0Var = this.E0;
            if (lq0Var.S0 != null) {
                canvas.save();
                lq0Var.S0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(lq0Var.S0.h.f44875k);
                lq0Var.S0.draw(canvas);
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
        r1Var.f22253b = this;
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
        lq0 lq0Var = this.E0;
        Drawable drawable = lq0Var.O;
        FrameLayout frameLayout = lq0Var.f28853w;
        canvas.translate(0.0f, lq0Var.f28845q0);
        int i17 = lq0Var.m0;
        i10 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f32811w0;
        int i18 = lq0Var.m0;
        i11 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f32811w0;
        lq0Var.U = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z4 = ((org.telegram.ui.ActionBar.h3) lq0Var).isFullscreen;
        boolean z12 = true;
        if (!z4) {
            dp2 += lq0Var.D0.f7758b;
            if (this.f32810v0) {
                i16 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
                if (i16 + dp3 < lq0Var.D0.f7758b) {
                    z11 = true;
                    int i20 = dp3 + lq0Var.D0.f7758b;
                    i15 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
                    f10 = this.D0.e(z11);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f10);
                }
            }
            z11 = false;
            int i202 = dp3 + lq0Var.D0.f7758b;
            i15 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
            f10 = this.D0.e(z11);
            dp3 = AndroidUtilities.lerp(i202, -i15, f10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > lq0Var.D0.f7758b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                ic icVar = ic.f27770w;
                if (icVar != null) {
                    nb nbVar = icVar.f27774e;
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
            RectF rectF = this.f32809u0;
            rectF.set((getMeasuredWidth() - dp) / 2, f11, measuredWidth, dp5);
            org.telegram.ui.ActionBar.k6.f21941t0.setColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
            org.telegram.ui.ActionBar.k6.f21941t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21941t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.C0 && 0 > lq0Var.D0.f7758b * 0.5f) {
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
        this.f32812x0 = this.f32811w0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.f32810v0;
        lq0 lq0Var = this.E0;
        if (!z4) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f32811w0 - AndroidUtilities.dp(30.0f)) {
                lq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && lq0Var.m0 != 0 && motionEvent.getY() < lq0Var.m0 - AndroidUtilities.dp(30.0f)) {
            lq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp0.onLayout(boolean, int, int, int, int):void");
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
        wp0 wp0Var = this;
        lq0 lq0Var = wp0Var.E0;
        mp0 mp0Var = lq0Var.D;
        FrameLayout frameLayout = lq0Var.Z;
        mp0 mp0Var2 = lq0Var.C;
        sl0 sl0Var = lq0Var.B;
        if (wp0Var.getLayoutParams().height > 0) {
            size = wp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        f2.w wVar = lq0Var.E;
        int i22 = 0;
        if (wp0Var.getLayoutParams().height <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        wVar.G = z4;
        qz qzVar = lq0Var.G;
        if (wp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qzVar.G = z10;
        z11 = ((org.telegram.ui.ActionBar.h3) lq0Var).isFullscreen;
        if (!z11) {
            wp0Var.f32808t0 = true;
            i20 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
            int i23 = lq0Var.D0.f7758b;
            i21 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
            wp0Var.setPadding(i20, i23, i21, 0);
            wp0Var.f32808t0 = false;
        }
        int paddingTop = size - wp0Var.getPaddingTop();
        int max = Math.max(lq0Var.J.h(), lq0Var.H.h() - 1);
        int D = org.telegram.messenger.y3.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (sl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.y3.D(103.0f, Math.max(2, (int) Math.ceil((lq0Var.I.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, sl0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + lq0Var.D0.d;
        if (mp0Var2.getPaddingTop() != i13 || mp0Var2.getPaddingBottom() != dp2) {
            wp0Var.f32808t0 = true;
            mp0Var2.setPadding(0, i13, 0, dp2);
            sl0Var.setPadding(0, i13, 0, dp2);
            wp0Var.f32808t0 = false;
        }
        z12 = ((org.telegram.ui.ActionBar.h3) lq0Var).keyboardVisible;
        if (z12 && wp0Var.getLayoutParams().height <= 0 && mp0Var.getPaddingTop() != i13) {
            wp0Var.f32808t0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            mp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + lq0Var.D0.d);
            wp0Var.f32808t0 = false;
        }
        if (i24 >= size) {
            z13 = true;
        } else {
            z13 = false;
        }
        wp0Var.f32810v0 = z13;
        if (z13) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        wp0Var.f32811w0 = i15;
        wp0Var.f32808t0 = true;
        lq0Var.K0(false);
        wp0Var.f32808t0 = false;
        wp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = lq0Var.f28846r;
        pp0 pp0Var = lq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = wp0Var.R();
        lq0Var.K0 = R;
        if (!pp0Var.K && R <= AndroidUtilities.dp(20.0f) && !pp0Var.f27000e && !pp0Var.L) {
            wp0Var.f32808t0 = true;
            pp0Var.j();
            wp0Var.f32808t0 = false;
        }
        wp0Var.f32808t0 = true;
        if (lq0Var.K0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z14 = ((org.telegram.ui.ActionBar.h3) lq0Var).keyboardVisible;
                if (z14) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = pp0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (pp0Var.f27000e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!pp0Var.m()) {
                pp0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        wp0Var.f32808t0 = false;
        int childCount = wp0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = wp0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (pp0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), wp0Var.getPaddingTop() + (i29 - lq0Var.D0.f7758b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(wp0Var.getPaddingTop() + (i29 - lq0Var.D0.f7758b), 1073741824));
                    }
                } else {
                    wp0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            wp0Var = this;
        }
        lq0Var.Y0();
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
        if (this.f32808t0) {
            return;
        }
        super.requestLayout();
    }
}
