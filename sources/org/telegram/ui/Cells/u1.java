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
import org.telegram.ui.Components.l51;
public final class u1 extends View implements org.telegram.ui.ActionBar.w5 {
    public final l51 f25727a;
    public final org.telegram.ui.ActionBar.b6 f25728b;
    public int f25729c;
    public int d;
    public k1 f25730e;
    public float f25731f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f25728b = b6Var;
        l51 l51Var = new l51();
        this.f25727a = l51Var;
        l51Var.setCallback(this);
        l51Var.f30372n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        l51Var.f30373o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        l51Var.f30374p = LocaleController.getString(R.string.UnsupportedUpdate);
        l51Var.f30368j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean a12;
        org.telegram.ui.ActionBar.b6 b6Var = this.f25728b;
        if (b6Var != null) {
            b6Var.o(0.0f, this.f25731f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.f6.q(0.0f, this.f25731f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f25729c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (b6Var != null) {
            paint = b6Var.O("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (b6Var != null) {
            a12 = b6Var.t0();
        } else {
            a12 = org.telegram.ui.ActionBar.f6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f25729c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.f23069h2);
        }
    }

    public final void b(float f10, int i9) {
        this.f25731f = f10;
        this.h = i9;
    }

    @Override
    public final void d() {
        this.f25727a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f25729c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        l51 l51Var = this.f25727a;
        l51Var.setBounds(dp, dp2, dp3, dp4);
        l51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f25729c = dp;
        int a2 = this.f25727a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25727a.f30367i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.f25730e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25727a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
    }
}
