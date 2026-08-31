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
import org.telegram.ui.Components.l61;
public final class u1 extends View implements org.telegram.ui.ActionBar.b6 {
    public final l61 f24186a;
    public final org.telegram.ui.ActionBar.g6 f24187b;
    public int f24188c;
    public int d;
    public k1 f24189e;
    public float f24190f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24187b = g6Var;
        l61 l61Var = new l61();
        this.f24186a = l61Var;
        l61Var.setCallback(this);
        l61Var.f28623n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        l61Var.f28624o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        l61Var.f28625p = LocaleController.getString(R.string.UnsupportedUpdate);
        l61Var.f28619j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24187b;
        if (g6Var != null) {
            g6Var.l(0.0f, this.f24190f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, this.f24190f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f24188c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f24188c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.f21728h2);
        }
    }

    public final void b(float f10, int i10) {
        this.f24190f = f10;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f24186a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f24188c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        l61 l61Var = this.f24186a;
        l61Var.setBounds(dp, dp2, dp3, dp4);
        l61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f24188c = dp;
        int a2 = this.f24186a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24186a.f28618i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.f24189e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f24186a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
