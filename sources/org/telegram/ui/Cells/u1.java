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
import org.telegram.ui.Components.u61;
public final class u1 extends View implements org.telegram.ui.ActionBar.a6 {
    public final u61 f20470a;
    public final org.telegram.ui.ActionBar.f6 f20471b;
    public int f20472c;
    public int d;
    public k1 e;
    public float f20473f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f20471b = f6Var;
        u61 u61Var = new u61();
        this.f20470a = u61Var;
        u61Var.setCallback(this);
        u61Var.f27584n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        u61Var.f27585o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        u61Var.f27586p = LocaleController.getString(R.string.UnsupportedUpdate);
        u61Var.f27580j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f20471b;
        if (f6Var != null) {
            f6Var.l(0.0f, this.f20473f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, this.f20473f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f20472c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (f6Var != null) {
            paint = f6Var.F("paintChatActionBackground");
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f20472c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f17995h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f20473f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f20470a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f20472c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        u61 u61Var = this.f20470a;
        u61Var.setBounds(dp, dp2, dp3, dp4);
        u61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f20472c = dp;
        int a2 = this.f20470a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f20470a.f27579i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f20470a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
