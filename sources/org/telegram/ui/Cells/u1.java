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
import org.telegram.ui.Components.h61;
public final class u1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final h61 f21419a;
    public final org.telegram.ui.ActionBar.e6 f21420b;
    public int f21421c;
    public int d;
    public k1 e;
    public float f21422f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f21420b = e6Var;
        h61 h61Var = new h61();
        this.f21419a = h61Var;
        h61Var.setCallback(this);
        h61Var.f24535n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        h61Var.f24536o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        h61Var.f24537p = LocaleController.getString(R.string.UnsupportedUpdate);
        h61Var.f24531j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f21420b;
        if (e6Var != null) {
            e6Var.m(0.0f, this.f21422f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f21422f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f21421c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f21421c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f18904h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f21422f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f21419a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f21421c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        h61 h61Var = this.f21419a;
        h61Var.setBounds(dp, dp2, dp3, dp4);
        h61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f21421c = dp;
        int a2 = this.f21419a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21419a.f24530i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f21419a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
