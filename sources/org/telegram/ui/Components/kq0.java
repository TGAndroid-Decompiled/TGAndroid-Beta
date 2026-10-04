package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class kq0 extends lw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final e6 G0;
    public final zq0 H0;
    public boolean f28181w0;
    public final RectF f28182x0;
    public boolean f28183y0;
    public int f28184z0;

    public kq0(zq0 zq0Var, Context context) {
        super(context, null);
        this.H0 = zq0Var;
        this.f28181w0 = false;
        this.f28182x0 = new RectF();
        this.H = new jq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20890h5)) > 0.721f;
        this.G0 = new e6(this, 0L, 350L, tr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        zq0 zq0Var = this.H0;
        aq0 aq0Var = zq0Var.G;
        zl0 zl0Var = zq0Var.E;
        aq0 aq0Var2 = zq0Var.F;
        if (aq0Var2.getVisibility() == 0 && aq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(aq0Var2.getX(), aq0Var2.getY());
            aq0Var2.draw(canvas);
            canvas.restore();
        }
        if (zl0Var.getVisibility() == 0 && zl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(zl0Var.getX(), zl0Var.getY());
            zl0Var.draw(canvas);
            canvas.restore();
        }
        if (aq0Var.getVisibility() == 0 && aq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(aq0Var.getX(), aq0Var.getY());
            aq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        zq0 zq0Var = this.H0;
        canvas.clipRect(0.0f, getPaddingTop() + zq0Var.f33621t0, getMeasuredWidth(), getMeasuredHeight() + zq0Var.f33621t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof nz) {
            zq0 zq0Var = this.H0;
            if (zq0Var.T0 != null) {
                canvas.save();
                zq0Var.T0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(zq0Var.T0.f4632l.f4621k);
                zq0Var.T0.draw(canvas);
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
        d6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return d6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.p1 p1Var = this.H;
        p1Var.f21446b = this;
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
        zq0 zq0Var = this.H0;
        Drawable drawable = zq0Var.R;
        FrameLayout frameLayout = zq0Var.f33624w;
        canvas.translate(0.0f, zq0Var.f33621t0);
        int i17 = zq0Var.f33615p0;
        i10 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f28184z0;
        int i18 = zq0Var.f33615p0;
        i11 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f28184z0;
        zq0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) zq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += zq0Var.G0.f11526b;
            if (this.f28183y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
                if (i16 + dp3 < zq0Var.G0.f11526b) {
                    z12 = true;
                    int i20 = dp3 + zq0Var.G0.f11526b;
                    i15 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + zq0Var.G0.f11526b;
            i15 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > zq0Var.G0.f11526b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                rc rcVar = rc.f30331w;
                if (rcVar != null) {
                    vb vbVar = rcVar.f30335e;
                    if (vbVar != null) {
                        vbVar.setTop(true);
                    }
                    rcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f28182x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.i6.f21111t0.setColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
            org.telegram.ui.ActionBar.i6.f21111t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21111t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > zq0Var.G0.f11526b * 0.5f) {
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
        this.A0 = this.f28184z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f28183y0;
        zq0 zq0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f28184z0 - AndroidUtilities.dp(30.0f)) {
                zq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && zq0Var.f33615p0 != 0 && motionEvent.getY() < zq0Var.f33615p0 - AndroidUtilities.dp(30.0f)) {
            zq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq0.onLayout(boolean, int, int, int, int):void");
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
        kq0 kq0Var = this;
        zq0 zq0Var = kq0Var.H0;
        aq0 aq0Var = zq0Var.G;
        FrameLayout frameLayout = zq0Var.f33600c0;
        aq0 aq0Var2 = zq0Var.F;
        zl0 zl0Var = zq0Var.E;
        if (kq0Var.getLayoutParams().height > 0) {
            size = kq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = zq0Var.H;
        int i22 = 0;
        if (kq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        rz rzVar = zq0Var.J;
        if (kq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        rzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) zq0Var).isFullscreen;
        if (!z12) {
            kq0Var.f28181w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingLeft;
            int i23 = zq0Var.G0.f11526b;
            i21 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingLeft;
            kq0Var.setPadding(i20, i23, i21, 0);
            kq0Var.f28181w0 = false;
        }
        int paddingTop = size - kq0Var.getPaddingTop();
        int max = Math.max(zq0Var.M.h(), zq0Var.K.h() - 1);
        int D = org.telegram.messenger.f0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (zl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.f0.D(103.0f, Math.max(2, (int) Math.ceil((zq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, zl0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + zq0Var.G0.d;
        if (aq0Var2.getPaddingTop() != i13 || aq0Var2.getPaddingBottom() != dp2) {
            kq0Var.f28181w0 = true;
            aq0Var2.setPadding(0, i13, 0, dp2);
            zl0Var.setPadding(0, i13, 0, dp2);
            kq0Var.f28181w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) zq0Var).keyboardVisible;
        if (z13 && kq0Var.getLayoutParams().height <= 0 && aq0Var.getPaddingTop() != i13) {
            kq0Var.f28181w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            aq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + zq0Var.G0.d);
            kq0Var.f28181w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        kq0Var.f28183y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        kq0Var.f28184z0 = i15;
        kq0Var.f28181w0 = true;
        zq0Var.H0(false);
        kq0Var.f28181w0 = false;
        kq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) zq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = zq0Var.f33617r;
        eq0 eq0Var = zq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = kq0Var.R();
        zq0Var.N0 = R;
        if (!eq0Var.N && R <= AndroidUtilities.dp(20.0f) && !eq0Var.f28708e && !eq0Var.O) {
            kq0Var.f28181w0 = true;
            eq0Var.j();
            kq0Var.f28181w0 = false;
        }
        kq0Var.f28181w0 = true;
        if (zq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) zq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = eq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (eq0Var.f28708e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!eq0Var.m()) {
                eq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        kq0Var.f28181w0 = false;
        int childCount = kq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = kq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (eq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), kq0Var.getPaddingTop() + (i29 - zq0Var.G0.f11526b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(kq0Var.getPaddingTop() + (i29 - zq0Var.G0.f11526b), 1073741824));
                    }
                } else {
                    kq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            kq0Var = this;
        }
        zq0Var.V0();
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
        if (this.f28181w0) {
            return;
        }
        super.requestLayout();
    }
}
