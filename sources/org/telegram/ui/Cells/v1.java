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
import org.telegram.ui.Components.g71;
public final class v1 extends View implements org.telegram.ui.ActionBar.y5 {
    public final g71 f23540a;
    public final org.telegram.ui.ActionBar.d6 f23541b;
    public int f23542c;
    public int d;
    public l1 f23543e;
    public float f23544f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f23541b = d6Var;
        g71 g71Var = new g71();
        this.f23540a = g71Var;
        g71Var.setCallback(this);
        g71Var.f26700n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        g71Var.f26701o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        g71Var.f26702p = LocaleController.getString(R.string.UnsupportedUpdate);
        g71Var.f26696j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23541b;
        if (d6Var != null) {
            d6Var.m(0.0f, this.f23544f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f23544f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23542c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (d6Var != null) {
            paint = d6Var.H("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (d6Var != null) {
            a12 = d6Var.r0();
        } else {
            a12 = org.telegram.ui.ActionBar.i6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23542c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f20886h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23544f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23540a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23542c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        g71 g71Var = this.f23540a;
        g71Var.setBounds(dp, dp2, dp3, dp4);
        g71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23542c = dp;
        int a2 = this.f23540a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23540a.f26695i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23543e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23540a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
