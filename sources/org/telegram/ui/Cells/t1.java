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
import org.telegram.ui.Components.j61;
public final class t1 extends View implements org.telegram.ui.ActionBar.a6 {
    public final j61 f22315a;
    public final org.telegram.ui.ActionBar.f6 f22316b;
    public int f22317c;
    public int d;
    public j1 e;
    public float f22318f;
    public int h;

    public t1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22316b = f6Var;
        j61 j61Var = new j61();
        this.f22315a = j61Var;
        j61Var.setCallback(this);
        j61Var.f25882n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        j61Var.f25883o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        j61Var.f25884p = LocaleController.getString(R.string.UnsupportedUpdate);
        j61Var.f25878j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22316b;
        if (f6Var != null) {
            f6Var.l(0.0f, this.f22318f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, this.f22318f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f22317c;
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
            a12 = f6Var.m0();
        } else {
            a12 = org.telegram.ui.ActionBar.j6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f22317c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f19949h2);
        }
    }

    public final void b(float f10, int i10) {
        this.f22318f = f10;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f22315a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f22317c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        j61 j61Var = this.f22315a;
        j61Var.setBounds(dp, dp2, dp3, dp4);
        j61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f22317c = dp;
        int a2 = this.f22315a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22315a.f25877i.a(motionEvent, this);
    }

    public void setDelegate(j1 j1Var) {
        this.e = j1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f22315a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
