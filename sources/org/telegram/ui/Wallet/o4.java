package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
public final class o4 extends EditTextBoldCursor {
    public int f37056b;
    public final org.telegram.ui.Components.j5 f37057c;
    public final org.telegram.ui.Components.r6 d;
    public final org.telegram.ui.ActionBar.u6 e;

    public o4(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = u6Var;
        this.f37056b = 960;
        this.f37057c = new org.telegram.ui.Components.j5(this);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.d = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f32119b = 5;
        r6Var.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f37056b <= 0) {
            i10 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.P5;
        }
        int a2 = this.f37057c.a(org.telegram.ui.ActionBar.y6.w0(i10, this.e), false);
        org.telegram.ui.Components.r6 r6Var = this.d;
        r6Var.u(a2);
        int scrollX = getScrollX();
        int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        r6Var.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
        r6Var.draw(canvas);
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
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (r6Var == null) {
            return;
        }
        this.f37056b = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        r6Var.a();
        int i13 = this.f37056b;
        if (i13 <= 100) {
            str = Integer.toString(i13);
        } else {
            str = "";
        }
        r6Var.t(str, isAttachedToWindow(), true);
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
