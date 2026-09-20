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
import org.telegram.ui.Components.v61;
public final class v1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final v61 f21664a;
    public final org.telegram.ui.ActionBar.f6 f21665b;
    public int f21666c;
    public int d;
    public l1 e;
    public float f21667f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21665b = f6Var;
        v61 v61Var = new v61();
        this.f21664a = v61Var;
        v61Var.setCallback(this);
        v61Var.f28950n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        v61Var.f28951o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        v61Var.f28952p = LocaleController.getString(R.string.UnsupportedUpdate);
        v61Var.f28946j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21665b;
        if (f6Var != null) {
            f6Var.m(0.0f, this.f21667f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, this.f21667f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f21666c;
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
            a12 = f6Var.n0();
        } else {
            a12 = org.telegram.ui.ActionBar.j6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f21666c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f19162h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f21667f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f21664a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f21666c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        v61 v61Var = this.f21664a;
        v61Var.setBounds(dp, dp2, dp3, dp4);
        v61Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f21666c = dp;
        int a2 = this.f21664a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21664a.f28945i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f21664a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
