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
import org.telegram.ui.Components.x61;
public final class v1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final x61 f21676a;
    public final org.telegram.ui.ActionBar.e6 f21677b;
    public int f21678c;
    public int d;
    public l1 e;
    public float f21679f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f21677b = e6Var;
        x61 x61Var = new x61();
        this.f21676a = x61Var;
        x61Var.setCallback(this);
        x61Var.f30327n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        x61Var.f30328o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        x61Var.f30329p = LocaleController.getString(R.string.UnsupportedUpdate);
        x61Var.f30323j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f21677b;
        if (e6Var != null) {
            e6Var.m(0.0f, this.f21679f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f21679f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f21678c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (e6Var != null) {
            paint = e6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (e6Var != null) {
            a12 = e6Var.p0();
        } else {
            a12 = org.telegram.ui.ActionBar.i6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f21678c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f19125h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f21679f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f21676a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f21678c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        x61 x61Var = this.f21676a;
        x61Var.setBounds(dp, dp2, dp3, dp4);
        x61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f21678c = dp;
        int a2 = this.f21676a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21676a.f30322i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f21676a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
