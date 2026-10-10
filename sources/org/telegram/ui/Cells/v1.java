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
import org.telegram.ui.Components.n71;
public final class v1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final n71 f23534a;
    public final org.telegram.ui.ActionBar.e6 f23535b;
    public int f23536c;
    public int d;
    public l1 f23537e;
    public float f23538f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f23535b = e6Var;
        n71 n71Var = new n71();
        this.f23534a = n71Var;
        n71Var.setCallback(this);
        n71Var.f29033n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        n71Var.f29034o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        n71Var.f29035p = LocaleController.getString(R.string.UnsupportedUpdate);
        n71Var.f29029j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f23535b;
        if (e6Var != null) {
            e6Var.m(0.0f, this.f23538f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, this.f23538f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23536c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23536c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f20869h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23538f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23534a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23536c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        n71 n71Var = this.f23534a;
        n71Var.setBounds(dp, dp2, dp3, dp4);
        n71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23536c = dp;
        int a2 = this.f23534a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23534a.f29028i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23537e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23534a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
