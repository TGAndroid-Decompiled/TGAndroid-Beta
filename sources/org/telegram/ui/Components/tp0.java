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
public final class tp0 extends qv0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final c6 G0;
    public final iq0 H0;
    public boolean f28178w0;
    public final RectF f28179x0;
    public boolean f28180y0;
    public int f28181z0;

    public tp0(iq0 iq0Var, Context context) {
        super(context, null);
        this.H0 = iq0Var;
        this.f28178w0 = false;
        this.f28179x0 = new RectF();
        this.H = new sp0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5)) > 0.721f;
        this.G0 = new c6(this, 0L, 350L, qr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        iq0 iq0Var = this.H0;
        kp0 kp0Var = iq0Var.G;
        ml0 ml0Var = iq0Var.E;
        kp0 kp0Var2 = iq0Var.F;
        if (kp0Var2.getVisibility() == 0 && kp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(kp0Var2.getX(), kp0Var2.getY());
            kp0Var2.draw(canvas);
            canvas.restore();
        }
        if (ml0Var.getVisibility() == 0 && ml0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ml0Var.getX(), ml0Var.getY());
            ml0Var.draw(canvas);
            canvas.restore();
        }
        if (kp0Var.getVisibility() == 0 && kp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(kp0Var.getX(), kp0Var.getY());
            kp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        iq0 iq0Var = this.H0;
        fh.d dVar = iq0Var.Q0;
        fh.d dVar2 = iq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && iq0Var.O0 != null) {
            iq0.A0(iq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + iq0Var.f25008t0, getMeasuredWidth(), getMeasuredHeight() + iq0Var.f25008t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof kz) {
            iq0 iq0Var = this.H0;
            if (iq0Var.V0 != null) {
                canvas.save();
                iq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(iq0Var.V0.f4288j.f4277k);
                iq0Var.V0.draw(canvas);
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
        f6Var = ((org.telegram.ui.ActionBar.g3) this.H0).resourcesProvider;
        return f6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.H;
        q1Var.f19509b = this;
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
        boolean z11;
        int i13;
        int dp;
        Paint paint;
        int i14;
        boolean z12;
        int i15;
        int i16;
        canvas.save();
        iq0 iq0Var = this.H0;
        Drawable drawable = iq0Var.R;
        FrameLayout frameLayout = iq0Var.f25011w;
        canvas.translate(0.0f, iq0Var.f25008t0);
        int i17 = iq0Var.f25002p0;
        i10 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f28181z0;
        int i18 = iq0Var.f25002p0;
        i11 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f28181z0;
        iq0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.g3) iq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += iq0Var.G0.f10592b;
            if (this.f28180y0) {
                i16 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
                if (i16 + dp3 < iq0Var.G0.f10592b) {
                    z12 = true;
                    int i20 = dp3 + iq0Var.G0.f10592b;
                    i15 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + iq0Var.G0.f10592b;
            i15 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > iq0Var.G0.f10592b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                oc ocVar = oc.f26695w;
                if (ocVar != null) {
                    sb sbVar = ocVar.e;
                    if (sbVar != null) {
                        sbVar.setTop(true);
                    }
                    ocVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f28179x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.j6.f19150t0.setColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.f19150t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19150t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > iq0Var.G0.f10592b * 0.5f) {
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
        this.A0 = this.f28181z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f28180y0;
        iq0 iq0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f28181z0 - AndroidUtilities.dp(30.0f)) {
                iq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && iq0Var.f25002p0 != 0 && motionEvent.getY() < iq0Var.f25002p0 - AndroidUtilities.dp(30.0f)) {
            iq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tp0.onLayout(boolean, int, int, int, int):void");
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
        tp0 tp0Var = this;
        iq0 iq0Var = tp0Var.H0;
        kp0 kp0Var = iq0Var.G;
        FrameLayout frameLayout = iq0Var.f24988c0;
        kp0 kp0Var2 = iq0Var.F;
        ml0 ml0Var = iq0Var.E;
        if (tp0Var.getLayoutParams().height > 0) {
            size = tp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = iq0Var.H;
        int i22 = 0;
        if (tp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        oz ozVar = iq0Var.J;
        if (tp0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ozVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.g3) iq0Var).isFullscreen;
        if (!z12) {
            tp0Var.f28178w0 = true;
            i20 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
            int i23 = iq0Var.G0.f10592b;
            i21 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
            tp0Var.setPadding(i20, i23, i21, 0);
            tp0Var.f28178w0 = false;
        }
        int paddingTop = size - tp0Var.getPaddingTop();
        int max = Math.max(iq0Var.M.h(), iq0Var.K.h() - 1);
        int D = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (ml0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil((iq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, ml0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + iq0Var.G0.d;
        if (kp0Var2.getPaddingTop() != i13 || kp0Var2.getPaddingBottom() != dp2) {
            tp0Var.f28178w0 = true;
            kp0Var2.setPadding(0, i13, 0, dp2);
            ml0Var.setPadding(0, i13, 0, dp2);
            tp0Var.f28178w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.g3) iq0Var).keyboardVisible;
        if (z13 && tp0Var.getLayoutParams().height <= 0 && kp0Var.getPaddingTop() != i13) {
            tp0Var.f28178w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            kp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + iq0Var.G0.d);
            tp0Var.f28178w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        tp0Var.f28180y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        tp0Var.f28181z0 = i15;
        tp0Var.f28178w0 = true;
        iq0Var.K0(false);
        tp0Var.f28178w0 = false;
        tp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = iq0Var.f25004r;
        np0 np0Var = iq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = tp0Var.R();
        iq0Var.N0 = R;
        if (!np0Var.N && R <= AndroidUtilities.dp(20.0f) && !np0Var.e && !np0Var.O) {
            tp0Var.f28178w0 = true;
            np0Var.j();
            tp0Var.f28178w0 = false;
        }
        tp0Var.f28178w0 = true;
        if (iq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.g3) iq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = np0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (np0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!np0Var.m()) {
                np0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        tp0Var.f28178w0 = false;
        int childCount = tp0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = tp0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (np0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), tp0Var.getPaddingTop() + (i29 - iq0Var.G0.f10592b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(tp0Var.getPaddingTop() + (i29 - iq0Var.G0.f10592b), 1073741824));
                    }
                } else {
                    tp0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            tp0Var = this;
        }
        iq0Var.Y0();
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
        if (this.f28178w0) {
            return;
        }
        super.requestLayout();
    }
}
