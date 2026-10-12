package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.js;
public final class g4 extends EditTextBoldCursor {
    public int f34790b;
    public final org.telegram.ui.Components.j5 f34791c;
    public final org.telegram.ui.Components.q6 d;
    public final org.telegram.ui.ActionBar.c6 f34792e;

    public g4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f34792e = c6Var;
        this.f34790b = 960;
        this.f34791c = new org.telegram.ui.Components.j5(this);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.d = q6Var;
        q6Var.n(0.2f, 160L, js.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.f29690b = 5;
        q6Var.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f34790b <= 0) {
            i10 = org.telegram.ui.ActionBar.h6.f20781p7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.P5;
        }
        int a2 = this.f34791c.a(org.telegram.ui.ActionBar.h6.w0(i10, this.f34792e), false);
        org.telegram.ui.Components.q6 q6Var = this.d;
        q6Var.u(a2);
        int scrollX = getScrollX();
        int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        q6Var.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
        q6Var.draw(canvas);
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
        org.telegram.ui.Components.q6 q6Var = this.d;
        if (q6Var == null) {
            return;
        }
        this.f34790b = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        q6Var.a();
        int i13 = this.f34790b;
        if (i13 <= 100) {
            str = Integer.toString(i13);
        } else {
            str = "";
        }
        q6Var.t(str, isAttachedToWindow(), true);
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
