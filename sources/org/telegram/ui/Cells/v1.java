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
import org.telegram.ui.Components.h71;
public final class v1 extends View implements org.telegram.ui.ActionBar.y5 {
    public final h71 f23548a;
    public final org.telegram.ui.ActionBar.d6 f23549b;
    public int f23550c;
    public int d;
    public l1 f23551e;
    public float f23552f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f23549b = d6Var;
        h71 h71Var = new h71();
        this.f23548a = h71Var;
        h71Var.setCallback(this);
        h71Var.f27124n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        h71Var.f27125o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        h71Var.f27126p = LocaleController.getString(R.string.UnsupportedUpdate);
        h71Var.f27120j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23549b;
        if (d6Var != null) {
            d6Var.m(0.0f, this.f23552f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f23552f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23550c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23550c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f20896h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23552f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23548a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23550c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        h71 h71Var = this.f23548a;
        h71Var.setBounds(dp, dp2, dp3, dp4);
        h71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23550c = dp;
        int a2 = this.f23548a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23548a.f27119i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23551e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23548a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
