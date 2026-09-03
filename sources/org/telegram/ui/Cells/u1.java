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
import org.telegram.ui.Components.k61;
public final class u1 extends View implements org.telegram.ui.ActionBar.b6 {
    public final k61 f24188a;
    public final org.telegram.ui.ActionBar.g6 f24189b;
    public int f24190c;
    public int d;
    public k1 f24191e;
    public float f24192f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24189b = g6Var;
        k61 k61Var = new k61();
        this.f24188a = k61Var;
        k61Var.setCallback(this);
        k61Var.f28303n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        k61Var.f28304o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        k61Var.f28305p = LocaleController.getString(R.string.UnsupportedUpdate);
        k61Var.f28299j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24189b;
        if (g6Var != null) {
            g6Var.l(0.0f, this.f24192f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, this.f24192f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f24190c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (g6Var != null) {
            paint = g6Var.F("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (g6Var != null) {
            a12 = g6Var.o0();
        } else {
            a12 = org.telegram.ui.ActionBar.k6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f24190c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.f21730h2);
        }
    }

    public final void b(float f10, int i10) {
        this.f24192f = f10;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f24188a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f24190c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        k61 k61Var = this.f24188a;
        k61Var.setBounds(dp, dp2, dp3, dp4);
        k61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f24190c = dp;
        int a2 = this.f24188a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24188a.f28298i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.f24191e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f24188a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
