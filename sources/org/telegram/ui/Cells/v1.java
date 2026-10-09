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
import org.telegram.ui.Components.m71;
public final class v1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final m71 f23530a;
    public final org.telegram.ui.ActionBar.e6 f23531b;
    public int f23532c;
    public int d;
    public l1 f23533e;
    public float f23534f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f23531b = e6Var;
        m71 m71Var = new m71();
        this.f23530a = m71Var;
        m71Var.setCallback(this);
        m71Var.f28726n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        m71Var.f28727o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        m71Var.f28728p = LocaleController.getString(R.string.UnsupportedUpdate);
        m71Var.f28722j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f23531b;
        if (e6Var != null) {
            e6Var.m(0.0f, this.f23534f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f23534f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23532c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (e6Var != null) {
            paint = e6Var.F("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.i6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (e6Var != null) {
            b12 = e6Var.k0();
        } else {
            b12 = org.telegram.ui.ActionBar.i6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23532c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f20865h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23534f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23530a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23532c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        m71 m71Var = this.f23530a;
        m71Var.setBounds(dp, dp2, dp3, dp4);
        m71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23532c = dp;
        int a2 = this.f23530a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23530a.f28721i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23533e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23530a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
