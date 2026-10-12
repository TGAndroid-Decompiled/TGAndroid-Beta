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
import org.telegram.ui.Components.r71;
public final class v1 extends View implements org.telegram.ui.ActionBar.x5 {
    public final r71 f23302a;
    public final org.telegram.ui.ActionBar.c6 f23303b;
    public int f23304c;
    public int d;
    public l1 f23305e;
    public float f23306f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23303b = c6Var;
        r71 r71Var = new r71();
        this.f23302a = r71Var;
        r71Var.setCallback(this);
        r71Var.f30079n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        r71Var.f30080o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        r71Var.f30081p = LocaleController.getString(R.string.UnsupportedUpdate);
        r71Var.f30075j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23303b;
        if (c6Var != null) {
            c6Var.m(0.0f, this.f23306f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, this.f23306f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23304c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (c6Var != null) {
            paint = c6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (c6Var != null) {
            b12 = c6Var.l0();
        } else {
            b12 = org.telegram.ui.ActionBar.h6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23304c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f20627h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23306f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23302a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23304c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        r71 r71Var = this.f23302a;
        r71Var.setBounds(dp, dp2, dp3, dp4);
        r71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23304c = dp;
        int a2 = this.f23302a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23302a.f30074i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23305e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23302a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
