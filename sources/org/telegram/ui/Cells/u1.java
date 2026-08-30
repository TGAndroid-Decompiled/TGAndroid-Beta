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
public final class u1 extends View implements org.telegram.ui.ActionBar.a6 {
    public final j61 f22381a;
    public final org.telegram.ui.ActionBar.f6 f22382b;
    public int f22383c;
    public int d;
    public k1 e;
    public float f22384f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22382b = f6Var;
        j61 j61Var = new j61();
        this.f22381a = j61Var;
        j61Var.setCallback(this);
        j61Var.f25915n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        j61Var.f25916o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        j61Var.f25917p = LocaleController.getString(R.string.UnsupportedUpdate);
        j61Var.f25911j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22382b;
        if (f6Var != null) {
            f6Var.l(0.0f, this.f22384f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, this.f22384f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f22383c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f22383c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f19974h2);
        }
    }

    public final void b(float f10, int i10) {
        this.f22384f = f10;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f22381a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f22383c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        j61 j61Var = this.f22381a;
        j61Var.setBounds(dp, dp2, dp3, dp4);
        j61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f22383c = dp;
        int a2 = this.f22381a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22381a.f25910i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f22381a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
