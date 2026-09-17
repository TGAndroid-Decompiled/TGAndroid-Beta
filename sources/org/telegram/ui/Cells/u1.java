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
import org.telegram.ui.Components.g61;
public final class u1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final g61 f23311a;
    public final org.telegram.ui.ActionBar.f6 f23312b;
    public int f23313c;
    public int d;
    public k1 f23314e;
    public float f23315f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23312b = f6Var;
        g61 g61Var = new g61();
        this.f23311a = g61Var;
        g61Var.setCallback(this);
        g61Var.f26278n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        g61Var.f26279o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        g61Var.f26280p = LocaleController.getString(R.string.UnsupportedUpdate);
        g61Var.f26274j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23312b;
        if (f6Var != null) {
            f6Var.l(0.0f, this.f23315f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, this.f23315f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23313c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (f6Var != null) {
            paint = f6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (f6Var != null) {
            a12 = f6Var.o0();
        } else {
            a12 = org.telegram.ui.ActionBar.j6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23313c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f20732h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23315f = f7;
        this.h = i10;
    }

    @Override
    public final void d() {
        this.f23311a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23313c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        g61 g61Var = this.f23311a;
        g61Var.setBounds(dp, dp2, dp3, dp4);
        g61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23313c = dp;
        int a2 = this.f23311a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23311a.f26273i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.f23314e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23311a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
