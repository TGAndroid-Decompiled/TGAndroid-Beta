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
public final class mq0 extends mw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final e6 G0;
    public final br0 H0;
    public boolean f28763w0;
    public final RectF f28764x0;
    public boolean f28765y0;
    public int f28766z0;

    public mq0(br0 br0Var, Context context) {
        super(context, null);
        this.H0 = br0Var;
        this.f28763w0 = false;
        this.f28764x0 = new RectF();
        this.H = new lq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(br0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5)) > 0.721f;
        this.G0 = new e6(this, 0L, 350L, tr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        br0 br0Var = this.H0;
        bq0 bq0Var = br0Var.G;
        zl0 zl0Var = br0Var.E;
        bq0 bq0Var2 = br0Var.F;
        if (bq0Var2.getVisibility() == 0 && bq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(bq0Var2.getX(), bq0Var2.getY());
            bq0Var2.draw(canvas);
            canvas.restore();
        }
        if (zl0Var.getVisibility() == 0 && zl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(zl0Var.getX(), zl0Var.getY());
            zl0Var.draw(canvas);
            canvas.restore();
        }
        if (bq0Var.getVisibility() == 0 && bq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(bq0Var.getX(), bq0Var.getY());
            bq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        br0 br0Var = this.H0;
        canvas.clipRect(0.0f, getPaddingTop() + br0Var.f25076t0, getMeasuredWidth(), getMeasuredHeight() + br0Var.f25076t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof nz) {
            br0 br0Var = this.H0;
            if (br0Var.T0 != null) {
                canvas.save();
                br0Var.T0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(br0Var.T0.f4633l.f4622k);
                br0Var.T0.draw(canvas);
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
        p1Var.f21454b = this;
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
        br0 br0Var = this.H0;
        Drawable drawable = br0Var.R;
        FrameLayout frameLayout = br0Var.f25079w;
        canvas.translate(0.0f, br0Var.f25076t0);
        int i17 = br0Var.f25070p0;
        i10 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f28766z0;
        int i18 = br0Var.f25070p0;
        i11 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f28766z0;
        br0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) br0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += br0Var.G0.f11527b;
            if (this.f28765y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
                if (i16 + dp3 < br0Var.G0.f11527b) {
                    z12 = true;
                    int i20 = dp3 + br0Var.G0.f11527b;
                    i15 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + br0Var.G0.f11527b;
            i15 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > br0Var.G0.f11527b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                rc rcVar = rc.f30419w;
                if (rcVar != null) {
                    vb vbVar = rcVar.f30423e;
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
            RectF rectF = this.f28764x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.i6.f21120t0.setColor(br0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
            org.telegram.ui.ActionBar.i6.f21120t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21120t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > br0Var.G0.f11527b * 0.5f) {
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
        this.A0 = this.f28766z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f28765y0;
        br0 br0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f28766z0 - AndroidUtilities.dp(30.0f)) {
                br0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && br0Var.f25070p0 != 0 && motionEvent.getY() < br0Var.f25070p0 - AndroidUtilities.dp(30.0f)) {
            br0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mq0.onLayout(boolean, int, int, int, int):void");
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
        mq0 mq0Var = this;
        br0 br0Var = mq0Var.H0;
        bq0 bq0Var = br0Var.G;
        FrameLayout frameLayout = br0Var.f25055c0;
        bq0 bq0Var2 = br0Var.F;
        zl0 zl0Var = br0Var.E;
        if (mq0Var.getLayoutParams().height > 0) {
            size = mq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = br0Var.H;
        int i22 = 0;
        if (mq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        rz rzVar = br0Var.J;
        if (mq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        rzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) br0Var).isFullscreen;
        if (!z12) {
            mq0Var.f28763w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingLeft;
            int i23 = br0Var.G0.f11527b;
            i21 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingLeft;
            mq0Var.setPadding(i20, i23, i21, 0);
            mq0Var.f28763w0 = false;
        }
        int paddingTop = size - mq0Var.getPaddingTop();
        int max = Math.max(br0Var.M.h(), br0Var.K.h() - 1);
        int D = org.telegram.messenger.q.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (zl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.q.D(103.0f, Math.max(2, (int) Math.ceil((br0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingTop;
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + br0Var.G0.d;
        if (bq0Var2.getPaddingTop() != i13 || bq0Var2.getPaddingBottom() != dp2) {
            mq0Var.f28763w0 = true;
            bq0Var2.setPadding(0, i13, 0, dp2);
            zl0Var.setPadding(0, i13, 0, dp2);
            mq0Var.f28763w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) br0Var).keyboardVisible;
        if (z13 && mq0Var.getLayoutParams().height <= 0 && bq0Var.getPaddingTop() != i13) {
            mq0Var.f28763w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            bq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + br0Var.G0.d);
            mq0Var.f28763w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        mq0Var.f28765y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        mq0Var.f28766z0 = i15;
        mq0Var.f28763w0 = true;
        br0Var.H0(false);
        mq0Var.f28763w0 = false;
        mq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) br0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = br0Var.f25072r;
        fq0 fq0Var = br0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = mq0Var.R();
        br0Var.N0 = R;
        if (!fq0Var.N && R <= AndroidUtilities.dp(20.0f) && !fq0Var.f28796e && !fq0Var.O) {
            mq0Var.f28763w0 = true;
            fq0Var.j();
            mq0Var.f28763w0 = false;
        }
        mq0Var.f28763w0 = true;
        if (br0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) br0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = fq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (fq0Var.f28796e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!fq0Var.m()) {
                fq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        mq0Var.f28763w0 = false;
        int childCount = mq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = mq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (fq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), mq0Var.getPaddingTop() + (i29 - br0Var.G0.f11527b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(mq0Var.getPaddingTop() + (i29 - br0Var.G0.f11527b), 1073741824));
                    }
                } else {
                    mq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            mq0Var = this;
        }
        br0Var.V0();
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
        if (this.f28763w0) {
            return;
        }
        super.requestLayout();
    }
}
