package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
public final class q4 extends EditTextBoldCursor {
    public int f35068b;
    public final org.telegram.ui.Components.i5 f35069c;
    public final org.telegram.ui.Components.p6 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public q4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = g6Var;
        this.f35068b = 960;
        this.f35069c = new org.telegram.ui.Components.i5(this);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.d = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.f29437b = 5;
        p6Var.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f35068b <= 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21404p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a2 = this.f35069c.a(org.telegram.ui.ActionBar.k6.w0(i10, this.e), false);
        org.telegram.ui.Components.p6 p6Var = this.d;
        p6Var.u(a2);
        int scrollX = getScrollX();
        int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        p6Var.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
        p6Var.draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String str;
        super.onTextChanged(charSequence, i10, i11, i12);
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (p6Var == null) {
            return;
        }
        this.f35068b = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        p6Var.a();
        int i13 = this.f35068b;
        if (i13 <= 100) {
            str = Integer.toString(i13);
        } else {
            str = "";
        }
        p6Var.t(str, isAttachedToWindow(), true);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
