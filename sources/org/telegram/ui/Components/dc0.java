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
public final class dc0 extends View {
    public final o6 f23515a;
    public final zb0 f23516b;
    public boolean f23517c;
    public boolean d;
    public final String e;
    public final String f23518f;
    public final int h;

    public dc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f23517c = true;
        this.e = str;
        this.f23518f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19152i6, e6Var), 2, -1));
        o6 o6Var = new o6(true, true, true, false);
        this.f23515a = o6Var;
        o6Var.k(0.35f, 300L, qr.h);
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
        o6Var.setCallback(this);
        o6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            o6Var.f26868b = 5;
        }
        TextPaint textPaint = o6Var.f26867a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        o6Var.G = max;
        zb0 zb0Var = new zb0(0);
        ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        zb0Var.f30767c = ij0Var;
        ij0Var.R(this);
        ij0Var.J(true);
        ij0Var.h = true;
        ij0Var.K(0);
        ij0 ij0Var2 = new ij0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        zb0Var.d = ij0Var2;
        ij0Var2.R(this);
        ij0Var2.J(true);
        ij0Var2.h = true;
        ij0Var2.K(0);
        zb0Var.e = ij0Var;
        this.f23516b = zb0Var;
        zb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ij0 ij0Var;
        if (!this.f23517c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f23518f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        o6 o6Var = this.f23515a;
        o6Var.q(str, z12, true);
        zb0 zb0Var = this.f23516b;
        ij0 ij0Var2 = (ij0) zb0Var.d;
        ij0 ij0Var3 = (ij0) zb0Var.f30767c;
        zb0Var.f30766b = z10;
        if (z11) {
            if (z10) {
                ij0Var = ij0Var3;
            } else {
                ij0Var = ij0Var2;
            }
            zb0Var.e = ij0Var;
            ij0Var3.M(0);
            ij0Var2.M(0);
            ((ij0) zb0Var.e).start();
        } else {
            if (z10) {
                ij0Var2 = ij0Var3;
            }
            zb0Var.e = ij0Var2;
            ij0Var2.M(ij0Var2.e[0] - 1);
        }
        this.f23517c = false;
        setContentDescription(o6Var.f26871g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        o6 o6Var = this.f23515a;
        zb0 zb0Var = this.f23516b;
        if (z10) {
            zb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.wh.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            zb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.wh.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        o6Var.draw(canvas);
        zb0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.h;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i10), i12);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i10), i12);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0 && getAlpha() >= 0.5f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23515a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
