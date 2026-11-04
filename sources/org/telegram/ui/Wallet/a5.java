package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
public final class a5 extends EditTextBoldCursor {
    public int H1;
    public final org.telegram.ui.Components.x4 I1;
    public final org.telegram.ui.Components.g6 J1;
    public final org.telegram.ui.ActionBar.e6 K1;

    public a5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.K1 = e6Var;
        this.H1 = 960;
        this.I1 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.J1 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f33983b = 5;
        g6Var.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        if (this.H1 <= 0) {
            i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.I1.a(org.telegram.ui.ActionBar.k6.w0(i3, this.K1), false);
        org.telegram.ui.Components.g6 g6Var = this.J1;
        g6Var.u(a10);
        int scrollX = getScrollX();
        int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        g6Var.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
        g6Var.draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        String str;
        super.onTextChanged(charSequence, i3, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.J1;
        if (g6Var == null) {
            return;
        }
        this.H1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        g6Var.a();
        int i12 = this.H1;
        if (i12 <= 100) {
            str = Integer.toString(i12);
        } else {
            str = "";
        }
        g6Var.t(str, isAttachedToWindow(), true);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
