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
public final class vb0 extends View {
    public final p6 f31162a;
    public final rb0 f31163b;
    public boolean f31164c;
    public boolean d;
    public final String f31165e;
    public final String f31166f;
    public final int h;

    public vb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31164c = true;
        this.f31165e = str;
        this.f31166f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), 2, -1));
        p6 p6Var = new p6(true, true, true, false);
        this.f31162a = p6Var;
        p6Var.k(0.35f, 300L, pr.h);
        p6Var.t(AndroidUtilities.dp(16.0f));
        p6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        p6Var.setCallback(this);
        p6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            p6Var.f29285b = 5;
        }
        TextPaint textPaint = p6Var.f29284a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        p6Var.G = max;
        rb0 rb0Var = new rb0(0);
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        rb0Var.f30006c = xi0Var;
        xi0Var.f32578v0 = this;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        rb0Var.d = xi0Var2;
        xi0Var2.f32578v0 = this;
        xi0Var2.H(true);
        xi0Var2.h = true;
        xi0Var2.I(0);
        rb0Var.f30007e = xi0Var;
        this.f31163b = rb0Var;
        rb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        xi0 xi0Var;
        if (!this.f31164c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.f31165e;
        } else {
            str = this.f31166f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        p6 p6Var = this.f31162a;
        p6Var.q(str, z12, true);
        rb0 rb0Var = this.f31163b;
        xi0 xi0Var2 = (xi0) rb0Var.d;
        xi0 xi0Var3 = (xi0) rb0Var.f30006c;
        rb0Var.f30005b = z10;
        if (z11) {
            if (z10) {
                xi0Var = xi0Var3;
            } else {
                xi0Var = xi0Var2;
            }
            rb0Var.f30007e = xi0Var;
            xi0Var3.K(0);
            xi0Var2.K(0);
            ((xi0) rb0Var.f30007e).start();
        } else {
            if (z10) {
                xi0Var2 = xi0Var3;
            }
            rb0Var.f30007e = xi0Var2;
            xi0Var2.K(xi0Var2.f32557e[0] - 1);
        }
        this.f31164c = false;
        setContentDescription(p6Var.f29289g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        p6 p6Var = this.f31162a;
        rb0 rb0Var = this.f31163b;
        if (z10) {
            rb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.wl.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            rb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.wl.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        p6Var.draw(canvas);
        rb0Var.draw(canvas);
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
        if (drawable != this.f31162a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
