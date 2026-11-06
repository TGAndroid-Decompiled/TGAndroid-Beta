package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
public final class c5 extends EditTextBoldCursor {
    public int G1;
    public final org.telegram.ui.Components.z4 H1;
    public final org.telegram.ui.Components.i6 I1;
    public final org.telegram.ui.ActionBar.f6 J1;

    public c5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.J1 = f6Var;
        this.G1 = 960;
        this.H1 = new org.telegram.ui.Components.z4(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.I1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.f34516b = 5;
        i6Var.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.G1 <= 0) {
            i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.H1.a(org.telegram.ui.ActionBar.k6.w0(i7, this.J1), false);
        org.telegram.ui.Components.i6 i6Var = this.I1;
        i6Var.u(a10);
        int scrollX = getScrollX();
        int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        i6Var.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
        i6Var.draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String str;
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.i6 i6Var = this.I1;
        if (i6Var == null) {
            return;
        }
        this.G1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        i6Var.a();
        int i12 = this.G1;
        if (i12 <= 100) {
            str = Integer.toString(i12);
        } else {
            str = "";
        }
        i6Var.t(str, isAttachedToWindow(), true);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
