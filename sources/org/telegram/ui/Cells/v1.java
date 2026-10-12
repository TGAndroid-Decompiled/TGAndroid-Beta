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
    public final r71 f23303a;
    public final org.telegram.ui.ActionBar.c6 f23304b;
    public int f23305c;
    public int d;
    public l1 f23306e;
    public float f23307f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23304b = c6Var;
        r71 r71Var = new r71();
        this.f23303a = r71Var;
        r71Var.setCallback(this);
        r71Var.f30080n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        r71Var.f30081o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        r71Var.f30082p = LocaleController.getString(R.string.UnsupportedUpdate);
        r71Var.f30076j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23304b;
        if (c6Var != null) {
            c6Var.m(0.0f, this.f23307f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, this.f23307f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23305c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23305c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f20628h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23307f = f7;
        this.h = i10;
    }

    @Override
    public final void e() {
        this.f23303a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23305c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        r71 r71Var = this.f23303a;
        r71Var.setBounds(dp, dp2, dp3, dp4);
        r71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23305c = dp;
        int a2 = this.f23303a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23303a.f30075i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.f23306e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23303a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
