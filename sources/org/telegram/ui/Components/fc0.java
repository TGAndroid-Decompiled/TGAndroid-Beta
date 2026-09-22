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
public final class fc0 extends View {
    public final n6 f24157a;
    public final bc0 f24158b;
    public boolean f24159c;
    public boolean d;
    public final String e;
    public final String f24160f;
    public final int h;

    public fc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24159c = true;
        this.e = str;
        this.f24160f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, f6Var), 2, -1));
        n6 n6Var = new n6(true, true, true, false);
        this.f24157a = n6Var;
        n6Var.k(0.35f, 300L, qr.h);
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        n6Var.setCallback(this);
        n6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            n6Var.f26643b = 5;
        }
        TextPaint textPaint = n6Var.f26642a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        n6Var.G = max;
        bc0 bc0Var = new bc0(0);
        kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        bc0Var.f22943c = kj0Var;
        kj0Var.R(this);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.K(0);
        kj0 kj0Var2 = new kj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        bc0Var.d = kj0Var2;
        kj0Var2.R(this);
        kj0Var2.J(true);
        kj0Var2.h = true;
        kj0Var2.K(0);
        bc0Var.e = kj0Var;
        this.f24158b = bc0Var;
        bc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        kj0 kj0Var;
        if (!this.f24159c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f24160f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        n6 n6Var = this.f24157a;
        n6Var.q(str, z12, true);
        bc0 bc0Var = this.f24158b;
        kj0 kj0Var2 = (kj0) bc0Var.d;
        kj0 kj0Var3 = (kj0) bc0Var.f22943c;
        bc0Var.f22942b = z10;
        if (z11) {
            if (z10) {
                kj0Var = kj0Var3;
            } else {
                kj0Var = kj0Var2;
            }
            bc0Var.e = kj0Var;
            kj0Var3.M(0);
            kj0Var2.M(0);
            ((kj0) bc0Var.e).start();
        } else {
            if (z10) {
                kj0Var2 = kj0Var3;
            }
            bc0Var.e = kj0Var2;
            kj0Var2.M(kj0Var2.e[0] - 1);
        }
        this.f24159c = false;
        setContentDescription(n6Var.f26646g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        n6 n6Var = this.f24157a;
        bc0 bc0Var = this.f24158b;
        if (z10) {
            bc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.rk.z(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            bc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.rk.z(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
        bc0Var.draw(canvas);
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
        if (drawable != this.f24157a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
