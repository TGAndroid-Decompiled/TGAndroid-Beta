package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.x51;
public final class t1 extends View implements org.telegram.ui.ActionBar.x5 {
    public final x51 f25685a;
    public final org.telegram.ui.ActionBar.c6 f25686b;
    public int f25687c;
    public int d;
    public j1 f25688e;
    public float f25689f;
    public int h;

    public t1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25686b = c6Var;
        x51 x51Var = new x51();
        this.f25685a = x51Var;
        x51Var.setCallback(this);
        x51Var.f34591n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        x51Var.f34592o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        x51Var.f34593p = LocaleController.getString(R.string.UnsupportedUpdate);
        x51Var.f34587j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25686b;
        if (c6Var != null) {
            c6Var.l(0.0f, this.f25689f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, this.f25689f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f25687c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (c6Var != null) {
            paint = c6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (c6Var != null) {
            a12 = c6Var.l0();
        } else {
            a12 = org.telegram.ui.ActionBar.g6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f25687c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f23130h2);
        }
    }

    public final void b(float f9, int i10) {
        this.f25689f = f9;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f25685a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f25687c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        x51 x51Var = this.f25685a;
        x51Var.setBounds(dp, dp2, dp3, dp4);
        x51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f25687c = dp;
        int a2 = this.f25685a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25685a.f34586i.a(motionEvent, this);
    }

    public void setDelegate(j1 j1Var) {
        this.f25688e = j1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25685a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
