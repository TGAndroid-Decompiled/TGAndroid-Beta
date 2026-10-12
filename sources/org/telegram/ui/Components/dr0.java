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
public final class dr0 extends yw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final g6 G0;
    public final sr0 H0;
    public boolean f25454w0;
    public final RectF f25455x0;
    public boolean f25456y0;
    public int f25457z0;

    public dr0(sr0 sr0Var, Context context) {
        super(context, null);
        this.H0 = sr0Var;
        this.f25454w0 = false;
        this.f25455x0 = new RectF();
        this.H = new cr0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(sr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5)) > 0.721f;
        this.G0 = new g6(this, 0L, 350L, js.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        sr0 sr0Var = this.H0;
        uq0 uq0Var = sr0Var.G;
        wm0 wm0Var = sr0Var.E;
        uq0 uq0Var2 = sr0Var.F;
        if (uq0Var2.getVisibility() == 0 && uq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(uq0Var2.getX(), uq0Var2.getY());
            uq0Var2.draw(canvas);
            canvas.restore();
        }
        if (wm0Var.getVisibility() == 0 && wm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(wm0Var.getX(), wm0Var.getY());
            wm0Var.draw(canvas);
            canvas.restore();
        }
        if (uq0Var.getVisibility() == 0 && uq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(uq0Var.getX(), uq0Var.getY());
            uq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        sr0 sr0Var = this.H0;
        fh.d dVar = sr0Var.Q0;
        fh.d dVar2 = sr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && sr0Var.O0 != null) {
            sr0.B0(sr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) sr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) sr0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) sr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) sr0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + sr0Var.f30657t0, getMeasuredWidth(), getMeasuredHeight() + sr0Var.f30657t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof d00) {
            sr0 sr0Var = this.H0;
            if (sr0Var.V0 != null) {
                canvas.save();
                sr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(sr0Var.V0.f4683j.f4671k);
                sr0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        org.telegram.ui.ActionBar.c6 c6Var;
        c6Var = ((org.telegram.ui.ActionBar.e3) this.H0).resourcesProvider;
        return c6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f21184b = this;
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
        sr0 sr0Var = this.H0;
        Drawable drawable = sr0Var.R;
        FrameLayout frameLayout = sr0Var.f30660w;
        canvas.translate(0.0f, sr0Var.f30657t0);
        int i17 = sr0Var.f30651p0;
        i10 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f25457z0;
        int i18 = sr0Var.f30651p0;
        i11 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f25457z0;
        sr0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.e3) sr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += sr0Var.G0.f11575b;
            if (this.f25456y0) {
                i16 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
                if (i16 + dp3 < sr0Var.G0.f11575b) {
                    z12 = true;
                    int i20 = dp3 + sr0Var.G0.f11575b;
                    i15 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + sr0Var.G0.f11575b;
            i15 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > sr0Var.G0.f11575b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                sc scVar = sc.f30528w;
                if (scVar != null) {
                    wb wbVar = scVar.f30532e;
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
            RectF rectF = this.f25455x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.h6.f20851t0.setColor(sr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.f20851t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f20851t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (this.F0 && 0 > sr0Var.G0.f11575b * 0.5f) {
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
        this.A0 = this.f25457z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f25456y0;
        sr0 sr0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f25457z0 - AndroidUtilities.dp(30.0f)) {
                sr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && sr0Var.f30651p0 != 0 && motionEvent.getY() < sr0Var.f30651p0 - AndroidUtilities.dp(30.0f)) {
            sr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dr0.onLayout(boolean, int, int, int, int):void");
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
        dr0 dr0Var = this;
        sr0 sr0Var = dr0Var.H0;
        uq0 uq0Var = sr0Var.G;
        FrameLayout frameLayout = sr0Var.f30636c0;
        uq0 uq0Var2 = sr0Var.F;
        wm0 wm0Var = sr0Var.E;
        if (dr0Var.getLayoutParams().height > 0) {
            size = dr0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = sr0Var.H;
        int i22 = 0;
        if (dr0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        h00 h00Var = sr0Var.J;
        if (dr0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        h00Var.G = z11;
        z12 = ((org.telegram.ui.ActionBar.e3) sr0Var).isFullscreen;
        if (!z12) {
            dr0Var.f25454w0 = true;
            i20 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingLeft;
            int i23 = sr0Var.G0.f11575b;
            i21 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingLeft;
            dr0Var.setPadding(i20, i23, i21, 0);
            dr0Var.f25454w0 = false;
        }
        int paddingTop = size - dr0Var.getPaddingTop();
        int max = Math.max(sr0Var.M.h(), sr0Var.K.h() - 1);
        int D = org.telegram.messenger.v0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (wm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.v0.D(103.0f, Math.max(2, (int) Math.ceil((sr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, wm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + sr0Var.G0.d;
        if (uq0Var2.getPaddingTop() != i13 || uq0Var2.getPaddingBottom() != dp) {
            dr0Var.f25454w0 = true;
            uq0Var2.setPadding(0, i13, 0, dp);
            wm0Var.setPadding(0, i13, 0, dp);
            dr0Var.f25454w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.e3) sr0Var).keyboardVisible;
        if (z13 && dr0Var.getLayoutParams().height <= 0 && uq0Var.getPaddingTop() != i13) {
            dr0Var.f25454w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            uq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + sr0Var.G0.d);
            dr0Var.f25454w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        dr0Var.f25456y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        dr0Var.f25457z0 = i15;
        dr0Var.f25454w0 = true;
        sr0Var.L0(false);
        dr0Var.f25454w0 = false;
        dr0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.e3) sr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = sr0Var.f30653r;
        xq0 xq0Var = sr0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = dr0Var.R();
        sr0Var.N0 = R;
        if (!xq0Var.N && R <= AndroidUtilities.dp(20.0f) && !xq0Var.f25018e && !xq0Var.O) {
            dr0Var.f25454w0 = true;
            xq0Var.j();
            dr0Var.f25454w0 = false;
        }
        dr0Var.f25454w0 = true;
        if (sr0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.e3) sr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = xq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (xq0Var.f25018e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!xq0Var.m()) {
                xq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        dr0Var.f25454w0 = false;
        int childCount = dr0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = dr0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (xq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), dr0Var.getPaddingTop() + (i29 - sr0Var.G0.f11575b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(dr0Var.getPaddingTop() + (i29 - sr0Var.G0.f11575b), 1073741824));
                    }
                } else {
                    dr0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            dr0Var = this;
        }
        sr0Var.Z0();
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
        if (this.f25454w0) {
            return;
        }
        super.requestLayout();
    }
}
