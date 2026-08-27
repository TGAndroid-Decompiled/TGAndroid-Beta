package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class fb0 extends View {

    public final i6 f28340a;

    public final bb0 f28341b;

    public boolean f28342c;
    public boolean d;

    public final String f28343e;

    public final String f28344f;
    public final int h;

    public fb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28342c = true;
        this.f28343e = str;
        this.f28344f = str2;
        setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 2, -1));
        i6 i6Var = new i6(true, true, true, false);
        this.f28340a = i6Var;
        i6Var.k(0.35f, 300L, er.h);
        i6Var.t(AndroidUtilities.dp(16.0f));
        i6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        i6Var.setCallback(this);
        i6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            i6Var.f29239b = 5;
        }
        float fDp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = i6Var.f29238a;
        int iMax = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + fDp);
        this.h = iMax;
        i6Var.G = iMax;
        bb0 bb0Var = new bb0(0);
        oi0 oi0Var = new oi0(i10, AndroidUtilities.dp(24.0f), i0.a.k(i10, ""), AndroidUtilities.dp(24.0f));
        bb0Var.f27061c = oi0Var;
        oi0Var.f31328r0 = this;
        oi0Var.H(true);
        oi0Var.h = true;
        oi0Var.I(0);
        oi0 oi0Var2 = new oi0(i11, AndroidUtilities.dp(24.0f), i0.a.k(i11, ""), AndroidUtilities.dp(24.0f));
        bb0Var.d = oi0Var2;
        oi0Var2.f31328r0 = this;
        oi0Var2.H(true);
        oi0Var2.h = true;
        oi0Var2.I(0);
        bb0Var.f27062e = oi0Var;
        this.f28341b = bb0Var;
        bb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f28342c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.f28343e : this.f28344f;
            boolean z12 = z11 && !LocaleController.isRTL;
            i6 i6Var = this.f28340a;
            i6Var.q(str, z12, true);
            bb0 bb0Var = this.f28341b;
            oi0 oi0Var = (oi0) bb0Var.d;
            oi0 oi0Var2 = (oi0) bb0Var.f27061c;
            bb0Var.f27060b = z10;
            if (z11) {
                bb0Var.f27062e = z10 ? oi0Var2 : oi0Var;
                oi0Var2.K(0);
                oi0Var.K(0);
                ((oi0) bb0Var.f27062e).start();
            } else {
                if (z10) {
                    oi0Var = oi0Var2;
                }
                bb0Var.f27062e = oi0Var;
                oi0Var.K(oi0Var.f31312e[0] - 1);
            }
            this.f28342c = false;
            setContentDescription(i6Var.f29243g);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        i6 i6Var = this.f28340a;
        bb0 bb0Var = this.f28341b;
        if (z10) {
            bb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.rl.x(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            bb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.rl.x(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        i6Var.draw(canvas);
        bb0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.h;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i10), i12) : Math.min(View.MeasureSpec.getSize(i10), i12), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0 || getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f28340a || super.verifyDrawable(drawable);
    }
}
