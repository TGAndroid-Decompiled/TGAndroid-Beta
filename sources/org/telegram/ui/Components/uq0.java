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
public final class uq0 extends ow0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final g6 G0;
    public final jr0 H0;
    public boolean f29751w0;
    public final RectF f29752x0;
    public boolean f29753y0;
    public int f29754z0;

    public uq0(jr0 jr0Var, Context context) {
        super(context, null);
        this.H0 = jr0Var;
        this.f29751w0 = false;
        this.f29752x0 = new RectF();
        this.H = new tq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5)) > 0.721f;
        this.G0 = new g6(this, 0L, 350L, es.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        jr0 jr0Var = this.H0;
        lq0 lq0Var = jr0Var.G;
        mm0 mm0Var = jr0Var.E;
        lq0 lq0Var2 = jr0Var.F;
        if (lq0Var2.getVisibility() == 0 && lq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(lq0Var2.getX(), lq0Var2.getY());
            lq0Var2.draw(canvas);
            canvas.restore();
        }
        if (mm0Var.getVisibility() == 0 && mm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mm0Var.getX(), mm0Var.getY());
            mm0Var.draw(canvas);
            canvas.restore();
        }
        if (lq0Var.getVisibility() == 0 && lq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(lq0Var.getX(), lq0Var.getY());
            lq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        jr0 jr0Var = this.H0;
        gh.d dVar = jr0Var.Q0;
        gh.d dVar2 = jr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && jr0Var.O0 != null) {
            jr0.B0(jr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) jr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) jr0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) jr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) jr0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + jr0Var.f26481t0, getMeasuredWidth(), getMeasuredHeight() + jr0Var.f26481t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof wz) {
            jr0 jr0Var = this.H0;
            if (jr0Var.V0 != null) {
                canvas.save();
                jr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(jr0Var.V0.f6558j.f6547k);
                jr0Var.V0.draw(canvas);
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
        c6Var = ((org.telegram.ui.ActionBar.e3) this.H0).resourcesProvider;
        return c6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f20556b = this;
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
        jr0 jr0Var = this.H0;
        Drawable drawable = jr0Var.R;
        FrameLayout frameLayout = jr0Var.f26484w;
        canvas.translate(0.0f, jr0Var.f26481t0);
        int i17 = jr0Var.f26475p0;
        i10 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f29754z0;
        int i18 = jr0Var.f26475p0;
        i11 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f29754z0;
        jr0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.e3) jr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += jr0Var.G0.f10889b;
            if (this.f29753y0) {
                i16 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
                if (i16 + dp3 < jr0Var.G0.f10889b) {
                    z12 = true;
                    int i20 = dp3 + jr0Var.G0.f10889b;
                    i15 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + jr0Var.G0.f10889b;
            i15 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > jr0Var.G0.f10889b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                sc scVar = sc.f29095w;
                if (scVar != null) {
                    wb wbVar = scVar.e;
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
            RectF rectF = this.f29752x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.g6.f20191t0.setColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            org.telegram.ui.ActionBar.g6.f20191t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f20191t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (this.F0 && 0 > jr0Var.G0.f10889b * 0.5f) {
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
        this.A0 = this.f29754z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f29753y0;
        jr0 jr0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f29754z0 - AndroidUtilities.dp(30.0f)) {
                jr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && jr0Var.f26475p0 != 0 && motionEvent.getY() < jr0Var.f26475p0 - AndroidUtilities.dp(30.0f)) {
            jr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uq0.onLayout(boolean, int, int, int, int):void");
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
        uq0 uq0Var = this;
        jr0 jr0Var = uq0Var.H0;
        lq0 lq0Var = jr0Var.G;
        FrameLayout frameLayout = jr0Var.f26461c0;
        lq0 lq0Var2 = jr0Var.F;
        mm0 mm0Var = jr0Var.E;
        if (uq0Var.getLayoutParams().height > 0) {
            size = uq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = jr0Var.H;
        int i22 = 0;
        if (uq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        a00 a00Var = jr0Var.J;
        if (uq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a00Var.G = z11;
        z12 = ((org.telegram.ui.ActionBar.e3) jr0Var).isFullscreen;
        if (!z12) {
            uq0Var.f29751w0 = true;
            i20 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingLeft;
            int i23 = jr0Var.G0.f10889b;
            i21 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingLeft;
            uq0Var.setPadding(i20, i23, i21, 0);
            uq0Var.f29751w0 = false;
        }
        int paddingTop = size - uq0Var.getPaddingTop();
        int max = Math.max(jr0Var.M.h(), jr0Var.K.h() - 1);
        int y3 = org.telegram.messenger.yh.y(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
        int i24 = i12 + y3;
        if (mm0Var.getVisibility() != 8) {
            int y10 = org.telegram.messenger.yh.y(103.0f, Math.max(2, (int) Math.ceil((jr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingTop;
            int i25 = i19 + y10;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, mm0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + jr0Var.G0.d;
        if (lq0Var2.getPaddingTop() != i13 || lq0Var2.getPaddingBottom() != dp) {
            uq0Var.f29751w0 = true;
            lq0Var2.setPadding(0, i13, 0, dp);
            mm0Var.setPadding(0, i13, 0, dp);
            uq0Var.f29751w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.e3) jr0Var).keyboardVisible;
        if (z13 && uq0Var.getLayoutParams().height <= 0 && lq0Var.getPaddingTop() != i13) {
            uq0Var.f29751w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            lq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + jr0Var.G0.d);
            uq0Var.f29751w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        uq0Var.f29753y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        uq0Var.f29754z0 = i15;
        uq0Var.f29751w0 = true;
        jr0Var.L0(false);
        uq0Var.f29751w0 = false;
        uq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.e3) jr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = jr0Var.f26477r;
        oq0 oq0Var = jr0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = uq0Var.R();
        jr0Var.N0 = R;
        if (!oq0Var.N && R <= AndroidUtilities.dp(20.0f) && !oq0Var.e && !oq0Var.O) {
            uq0Var.f29751w0 = true;
            oq0Var.j();
            uq0Var.f29751w0 = false;
        }
        uq0Var.f29751w0 = true;
        if (jr0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.e3) jr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = oq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (oq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!oq0Var.m()) {
                oq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        uq0Var.f29751w0 = false;
        int childCount = uq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = uq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (oq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), uq0Var.getPaddingTop() + (i29 - jr0Var.G0.f10889b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(uq0Var.getPaddingTop() + (i29 - jr0Var.G0.f10889b), 1073741824));
                    }
                } else {
                    uq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            uq0Var = this;
        }
        jr0Var.Z0();
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
        if (this.f29751w0) {
            return;
        }
        super.requestLayout();
    }
}
