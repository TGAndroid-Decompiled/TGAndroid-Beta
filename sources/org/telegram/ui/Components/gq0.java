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
public final class gq0 extends bw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final e6 G0;
    public final vq0 H0;
    public boolean f24569w0;
    public final RectF f24570x0;
    public boolean f24571y0;
    public int f24572z0;

    public gq0(vq0 vq0Var, Context context) {
        super(context, null);
        this.H0 = vq0Var;
        this.f24569w0 = false;
        this.f24570x0 = new RectF();
        this.H = new fq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(vq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5)) > 0.721f;
        this.G0 = new e6(this, 0L, 350L, sr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        vq0 vq0Var = this.H0;
        xp0 xp0Var = vq0Var.G;
        xl0 xl0Var = vq0Var.E;
        xp0 xp0Var2 = vq0Var.F;
        if (xp0Var2.getVisibility() == 0 && xp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(xp0Var2.getX(), xp0Var2.getY());
            xp0Var2.draw(canvas);
            canvas.restore();
        }
        if (xl0Var.getVisibility() == 0 && xl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(xl0Var.getX(), xl0Var.getY());
            xl0Var.draw(canvas);
            canvas.restore();
        }
        if (xp0Var.getVisibility() == 0 && xp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(xp0Var.getX(), xp0Var.getY());
            xp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        vq0 vq0Var = this.H0;
        fh.d dVar = vq0Var.Q0;
        fh.d dVar2 = vq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && vq0Var.O0 != null) {
            vq0.A0(vq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) vq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) vq0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) vq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) vq0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + vq0Var.f29739t0, getMeasuredWidth(), getMeasuredHeight() + vq0Var.f29739t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof mz) {
            vq0 vq0Var = this.H0;
            if (vq0Var.V0 != null) {
                canvas.save();
                vq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(vq0Var.V0.f4280j.f4269k);
                vq0Var.V0.draw(canvas);
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
        d6Var = ((org.telegram.ui.ActionBar.e3) this.H0).resourcesProvider;
        return d6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f19670b = this;
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
        vq0 vq0Var = this.H0;
        Drawable drawable = vq0Var.R;
        FrameLayout frameLayout = vq0Var.f29742w;
        canvas.translate(0.0f, vq0Var.f29739t0);
        int i17 = vq0Var.f29733p0;
        i10 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f24572z0;
        int i18 = vq0Var.f29733p0;
        i11 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f24572z0;
        vq0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.e3) vq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += vq0Var.G0.f10577b;
            if (this.f24571y0) {
                i16 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
                if (i16 + dp3 < vq0Var.G0.f10577b) {
                    z12 = true;
                    int i20 = dp3 + vq0Var.G0.f10577b;
                    i15 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + vq0Var.G0.f10577b;
            i15 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > vq0Var.G0.f10577b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.f27628w;
                if (qcVar != null) {
                    ub ubVar = qcVar.e;
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
            RectF rectF = this.f24570x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.h6.f19348t0.setColor(vq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.f19348t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19348t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > vq0Var.G0.f10577b * 0.5f) {
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
        this.A0 = this.f24572z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f24571y0;
        vq0 vq0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f24572z0 - AndroidUtilities.dp(30.0f)) {
                vq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && vq0Var.f29733p0 != 0 && motionEvent.getY() < vq0Var.f29733p0 - AndroidUtilities.dp(30.0f)) {
            vq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gq0.onLayout(boolean, int, int, int, int):void");
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
        gq0 gq0Var = this;
        vq0 vq0Var = gq0Var.H0;
        xp0 xp0Var = vq0Var.G;
        FrameLayout frameLayout = vq0Var.f29719c0;
        xp0 xp0Var2 = vq0Var.F;
        xl0 xl0Var = vq0Var.E;
        if (gq0Var.getLayoutParams().height > 0) {
            size = gq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = vq0Var.H;
        int i22 = 0;
        if (gq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        qz qzVar = vq0Var.J;
        if (gq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        qzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.e3) vq0Var).isFullscreen;
        if (!z12) {
            gq0Var.f24569w0 = true;
            i20 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingLeft;
            int i23 = vq0Var.G0.f10577b;
            i21 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingLeft;
            gq0Var.setPadding(i20, i23, i21, 0);
            gq0Var.f24569w0 = false;
        }
        int paddingTop = size - gq0Var.getPaddingTop();
        int max = Math.max(vq0Var.M.h(), vq0Var.K.h() - 1);
        int D = org.telegram.messenger.f0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (xl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.f0.D(103.0f, Math.max(2, (int) Math.ceil((vq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, xl0Var.getAlpha());
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
        int dp2 = AndroidUtilities.dp(i14 + 100) + vq0Var.G0.d;
        if (xp0Var2.getPaddingTop() != i13 || xp0Var2.getPaddingBottom() != dp2) {
            gq0Var.f24569w0 = true;
            xp0Var2.setPadding(0, i13, 0, dp2);
            xl0Var.setPadding(0, i13, 0, dp2);
            gq0Var.f24569w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.e3) vq0Var).keyboardVisible;
        if (z13 && gq0Var.getLayoutParams().height <= 0 && xp0Var.getPaddingTop() != i13) {
            gq0Var.f24569w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            xp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + vq0Var.G0.d);
            gq0Var.f24569w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        gq0Var.f24571y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        gq0Var.f24572z0 = i15;
        gq0Var.f24569w0 = true;
        vq0Var.K0(false);
        gq0Var.f24569w0 = false;
        gq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.e3) vq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = vq0Var.f29735r;
        aq0 aq0Var = vq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = gq0Var.R();
        vq0Var.N0 = R;
        if (!aq0Var.N && R <= AndroidUtilities.dp(20.0f) && !aq0Var.e && !aq0Var.O) {
            gq0Var.f24569w0 = true;
            aq0Var.j();
            gq0Var.f24569w0 = false;
        }
        gq0Var.f24569w0 = true;
        if (vq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.e3) vq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = aq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (aq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!aq0Var.m()) {
                aq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        gq0Var.f24569w0 = false;
        int childCount = gq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = gq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (aq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), gq0Var.getPaddingTop() + (i29 - vq0Var.G0.f10577b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(gq0Var.getPaddingTop() + (i29 - vq0Var.G0.f10577b), 1073741824));
                    }
                } else {
                    gq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            gq0Var = this;
        }
        vq0Var.Y0();
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
        if (this.f24569w0) {
            return;
        }
        super.requestLayout();
    }
}
