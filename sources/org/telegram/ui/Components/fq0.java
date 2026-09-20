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
public final class fq0 extends aw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final d6 G0;
    public final uq0 H0;
    public boolean f24152w0;
    public final RectF f24153x0;
    public boolean f24154y0;
    public int f24155z0;

    public fq0(uq0 uq0Var, Context context) {
        super(context, null);
        this.H0 = uq0Var;
        this.f24152w0 = false;
        this.f24153x0 = new RectF();
        this.H = new eq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(uq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19165h5)) > 0.721f;
        this.G0 = new d6(this, 0L, 350L, qr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        uq0 uq0Var = this.H0;
        wp0 wp0Var = uq0Var.G;
        vl0 vl0Var = uq0Var.E;
        wp0 wp0Var2 = uq0Var.F;
        if (wp0Var2.getVisibility() == 0 && wp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(wp0Var2.getX(), wp0Var2.getY());
            wp0Var2.draw(canvas);
            canvas.restore();
        }
        if (vl0Var.getVisibility() == 0 && vl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(vl0Var.getX(), vl0Var.getY());
            vl0Var.draw(canvas);
            canvas.restore();
        }
        if (wp0Var.getVisibility() == 0 && wp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(wp0Var.getX(), wp0Var.getY());
            wp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        uq0 uq0Var = this.H0;
        fh.d dVar = uq0Var.Q0;
        fh.d dVar2 = uq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && uq0Var.O0 != null) {
            uq0.A0(uq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) uq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) uq0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) uq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) uq0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + uq0Var.f28828t0, getMeasuredWidth(), getMeasuredHeight() + uq0Var.f28828t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof kz) {
            uq0 uq0Var = this.H0;
            if (uq0Var.V0 != null) {
                canvas.save();
                uq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(uq0Var.V0.f4289j.f4278k);
                uq0Var.V0.draw(canvas);
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
        p1Var.f19701b = this;
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
        uq0 uq0Var = this.H0;
        Drawable drawable = uq0Var.R;
        FrameLayout frameLayout = uq0Var.f28831w;
        canvas.translate(0.0f, uq0Var.f28828t0);
        int i17 = uq0Var.f28822p0;
        i10 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f24155z0;
        int i18 = uq0Var.f28822p0;
        i11 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f24155z0;
        uq0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) uq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += uq0Var.G0.f10593b;
            if (this.f24154y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
                if (i16 + dp3 < uq0Var.G0.f10593b) {
                    z12 = true;
                    int i20 = dp3 + uq0Var.G0.f10593b;
                    i15 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + uq0Var.G0.f10593b;
            i15 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > uq0Var.G0.f10593b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                pc pcVar = pc.f27245w;
                if (pcVar != null) {
                    tb tbVar = pcVar.e;
                    if (tbVar != null) {
                        tbVar.setTop(true);
                    }
                    pcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f24153x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.j6.f19383t0.setColor(uq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.f19383t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19383t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > uq0Var.G0.f10593b * 0.5f) {
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
        this.A0 = this.f24155z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f24154y0;
        uq0 uq0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f24155z0 - AndroidUtilities.dp(30.0f)) {
                uq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && uq0Var.f28822p0 != 0 && motionEvent.getY() < uq0Var.f28822p0 - AndroidUtilities.dp(30.0f)) {
            uq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fq0.onLayout(boolean, int, int, int, int):void");
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
        fq0 fq0Var = this;
        uq0 uq0Var = fq0Var.H0;
        wp0 wp0Var = uq0Var.G;
        FrameLayout frameLayout = uq0Var.f28808c0;
        wp0 wp0Var2 = uq0Var.F;
        vl0 vl0Var = uq0Var.E;
        if (fq0Var.getLayoutParams().height > 0) {
            size = fq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = uq0Var.H;
        int i22 = 0;
        if (fq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        oz ozVar = uq0Var.J;
        if (fq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ozVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) uq0Var).isFullscreen;
        if (!z12) {
            fq0Var.f24152w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingLeft;
            int i23 = uq0Var.G0.f10593b;
            i21 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingLeft;
            fq0Var.setPadding(i20, i23, i21, 0);
            fq0Var.f24152w0 = false;
        }
        int paddingTop = size - fq0Var.getPaddingTop();
        int max = Math.max(uq0Var.M.h(), uq0Var.K.h() - 1);
        int D = org.telegram.messenger.l0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (vl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.l0.D(103.0f, Math.max(2, (int) Math.ceil((uq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, vl0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + uq0Var.G0.d;
        if (wp0Var2.getPaddingTop() != i13 || wp0Var2.getPaddingBottom() != dp2) {
            fq0Var.f24152w0 = true;
            wp0Var2.setPadding(0, i13, 0, dp2);
            vl0Var.setPadding(0, i13, 0, dp2);
            fq0Var.f24152w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) uq0Var).keyboardVisible;
        if (z13 && fq0Var.getLayoutParams().height <= 0 && wp0Var.getPaddingTop() != i13) {
            fq0Var.f24152w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            wp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + uq0Var.G0.d);
            fq0Var.f24152w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        fq0Var.f24154y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        fq0Var.f24155z0 = i15;
        fq0Var.f24152w0 = true;
        uq0Var.K0(false);
        fq0Var.f24152w0 = false;
        fq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) uq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = uq0Var.f28824r;
        zp0 zp0Var = uq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = fq0Var.R();
        uq0Var.N0 = R;
        if (!zp0Var.N && R <= AndroidUtilities.dp(20.0f) && !zp0Var.e && !zp0Var.O) {
            fq0Var.f24152w0 = true;
            zp0Var.j();
            fq0Var.f24152w0 = false;
        }
        fq0Var.f24152w0 = true;
        if (uq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) uq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = zp0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (zp0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!zp0Var.m()) {
                zp0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        fq0Var.f24152w0 = false;
        int childCount = fq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = fq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (zp0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), fq0Var.getPaddingTop() + (i29 - uq0Var.G0.f10593b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(fq0Var.getPaddingTop() + (i29 - uq0Var.G0.f10593b), 1073741824));
                    }
                } else {
                    fq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            fq0Var = this;
        }
        uq0Var.Y0();
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
        if (this.f24152w0) {
            return;
        }
        super.requestLayout();
    }
}
