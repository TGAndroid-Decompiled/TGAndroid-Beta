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
import org.telegram.ui.Components.w61;
public final class v1 extends View implements org.telegram.ui.ActionBar.x5 {
    public final w61 f21675a;
    public final org.telegram.ui.ActionBar.d6 f21676b;
    public int f21677c;
    public int d;
    public l1 e;
    public float f21678f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f21676b = d6Var;
        w61 w61Var = new w61();
        this.f21675a = w61Var;
        w61Var.setCallback(this);
        w61Var.f29828n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        w61Var.f29829o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        w61Var.f29830p = LocaleController.getString(R.string.UnsupportedUpdate);
        w61Var.f29824j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.d6 d6Var = this.f21676b;
        if (d6Var != null) {
            d6Var.m(0.0f, this.f21678f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, this.f21678f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f21677c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (d6Var != null) {
            paint = d6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (d6Var != null) {
            a12 = d6Var.p0();
        } else {
            a12 = org.telegram.ui.ActionBar.h6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f21677c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f19128h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f21678f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f21675a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f21677c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        w61 w61Var = this.f21675a;
        w61Var.setBounds(dp, dp2, dp3, dp4);
        w61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f21677c = dp;
        int a2 = this.f21675a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21675a.f29823i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f21675a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
