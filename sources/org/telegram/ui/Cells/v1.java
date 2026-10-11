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
import org.telegram.ui.Components.o71;
public final class v1 extends View implements org.telegram.ui.ActionBar.x5 {
    public final o71 f23522a;
    public final org.telegram.ui.ActionBar.d6 f23523b;
    public int f23524c;
    public int d;
    public l1 f23525e;
    public float f23526f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f23523b = d6Var;
        o71 o71Var = new o71();
        this.f23522a = o71Var;
        o71Var.setCallback(this);
        o71Var.f29291n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        o71Var.f29292o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        o71Var.f29293p = LocaleController.getString(R.string.UnsupportedUpdate);
        o71Var.f29287j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23523b;
        if (d6Var != null) {
            d6Var.m(0.0f, this.f23526f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, this.f23526f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23524c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (d6Var != null) {
            paint = d6Var.F("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (d6Var != null) {
            b12 = d6Var.k0();
        } else {
            b12 = org.telegram.ui.ActionBar.h6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23524c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f20854h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23526f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23522a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23524c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        o71 o71Var = this.f23522a;
        o71Var.setBounds(dp, dp2, dp3, dp4);
        o71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23524c = dp;
        int a2 = this.f23522a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23522a.f29286i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23525e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23522a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
