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
public final class sp0 extends ov0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final e6 G0;
    public final hq0 H0;
    public boolean f30388w0;
    public final RectF f30389x0;
    public boolean f30390y0;
    public int f30391z0;

    public sp0(hq0 hq0Var, Context context) {
        super(context, null);
        this.H0 = hq0Var;
        this.f30388w0 = false;
        this.f30389x0 = new RectF();
        this.H = new rp0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5)) > 0.721f;
        this.G0 = new e6(this, 0L, 350L, pr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        hq0 hq0Var = this.H0;
        jp0 jp0Var = hq0Var.G;
        ll0 ll0Var = hq0Var.E;
        jp0 jp0Var2 = hq0Var.F;
        if (jp0Var2.getVisibility() == 0 && jp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jp0Var2.getX(), jp0Var2.getY());
            jp0Var2.draw(canvas);
            canvas.restore();
        }
        if (ll0Var.getVisibility() == 0 && ll0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ll0Var.getX(), ll0Var.getY());
            ll0Var.draw(canvas);
            canvas.restore();
        }
        if (jp0Var.getVisibility() == 0 && jp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jp0Var.getX(), jp0Var.getY());
            jp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        hq0 hq0Var = this.H0;
        gh.d dVar = hq0Var.Q0;
        gh.d dVar2 = hq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && hq0Var.O0 != null) {
            hq0.A0(hq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + hq0Var.f26812t0, getMeasuredWidth(), getMeasuredHeight() + hq0Var.f26812t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof kz) {
            hq0 hq0Var = this.H0;
            if (hq0Var.V0 != null) {
                canvas.save();
                hq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(hq0Var.V0.h.f6826k);
                hq0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        f6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return f6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.p1 p1Var = this.H;
        p1Var.f21277b = this;
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
        hq0 hq0Var = this.H0;
        Drawable drawable = hq0Var.R;
        FrameLayout frameLayout = hq0Var.f26815w;
        canvas.translate(0.0f, hq0Var.f26812t0);
        int i17 = hq0Var.f26806p0;
        i10 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f30391z0;
        int i18 = hq0Var.f26806p0;
        i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f30391z0;
        hq0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) hq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += hq0Var.G0.f11426b;
            if (this.f30390y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
                if (i16 + dp3 < hq0Var.G0.f11426b) {
                    z12 = true;
                    int i20 = dp3 + hq0Var.G0.f11426b;
                    i15 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + hq0Var.G0.f11426b;
            i15 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > hq0Var.G0.f11426b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.f29671w;
                if (qcVar != null) {
                    ub ubVar = qcVar.f29675e;
                    if (ubVar != null) {
                        ubVar.setTop(true);
                    }
                    qcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f30389x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.j6.f20948t0.setColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.f20948t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20948t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > hq0Var.G0.f11426b * 0.5f) {
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
        this.A0 = this.f30391z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f30390y0;
        hq0 hq0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f30391z0 - AndroidUtilities.dp(30.0f)) {
                hq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && hq0Var.f26806p0 != 0 && motionEvent.getY() < hq0Var.f26806p0 - AndroidUtilities.dp(30.0f)) {
            hq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp0.onLayout(boolean, int, int, int, int):void");
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
        sp0 sp0Var = this;
        hq0 hq0Var = sp0Var.H0;
        jp0 jp0Var = hq0Var.G;
        FrameLayout frameLayout = hq0Var.f26791c0;
        jp0 jp0Var2 = hq0Var.F;
        ll0 ll0Var = hq0Var.E;
        if (sp0Var.getLayoutParams().height > 0) {
            size = sp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = hq0Var.H;
        int i22 = 0;
        if (sp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        oz ozVar = hq0Var.J;
        if (sp0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ozVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) hq0Var).isFullscreen;
        if (!z12) {
            sp0Var.f30388w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
            int i23 = hq0Var.G0.f11426b;
            i21 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
            sp0Var.setPadding(i20, i23, i21, 0);
            sp0Var.f30388w0 = false;
        }
        int paddingTop = size - sp0Var.getPaddingTop();
        int max = Math.max(hq0Var.M.h(), hq0Var.K.h() - 1);
        int D = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (ll0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil((hq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, ll0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + hq0Var.G0.d;
        if (jp0Var2.getPaddingTop() != i13 || jp0Var2.getPaddingBottom() != dp2) {
            sp0Var.f30388w0 = true;
            jp0Var2.setPadding(0, i13, 0, dp2);
            ll0Var.setPadding(0, i13, 0, dp2);
            sp0Var.f30388w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) hq0Var).keyboardVisible;
        if (z13 && sp0Var.getLayoutParams().height <= 0 && jp0Var.getPaddingTop() != i13) {
            sp0Var.f30388w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            jp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + hq0Var.G0.d);
            sp0Var.f30388w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        sp0Var.f30390y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        sp0Var.f30391z0 = i15;
        sp0Var.f30388w0 = true;
        hq0Var.K0(false);
        sp0Var.f30388w0 = false;
        sp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = hq0Var.f26808r;
        mp0 mp0Var = hq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = sp0Var.R();
        hq0Var.N0 = R;
        if (!mp0Var.N && R <= AndroidUtilities.dp(20.0f) && !mp0Var.f26850e && !mp0Var.O) {
            sp0Var.f30388w0 = true;
            mp0Var.j();
            sp0Var.f30388w0 = false;
        }
        sp0Var.f30388w0 = true;
        if (hq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) hq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = mp0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (mp0Var.f26850e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!mp0Var.m()) {
                mp0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        sp0Var.f30388w0 = false;
        int childCount = sp0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = sp0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (mp0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), sp0Var.getPaddingTop() + (i29 - hq0Var.G0.f11426b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(sp0Var.getPaddingTop() + (i29 - hq0Var.G0.f11426b), 1073741824));
                    }
                } else {
                    sp0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            sp0Var = this;
        }
        hq0Var.Y0();
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
        if (this.f30388w0) {
            return;
        }
        super.requestLayout();
    }
}
