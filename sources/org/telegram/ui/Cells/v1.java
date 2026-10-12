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
import org.telegram.ui.Components.j71;
public final class v1 extends View implements org.telegram.ui.ActionBar.x5 {
    public final j71 f22556a;
    public final org.telegram.ui.ActionBar.c6 f22557b;
    public int f22558c;
    public int d;
    public l1 e;
    public float f22559f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f22557b = c6Var;
        j71 j71Var = new j71();
        this.f22556a = j71Var;
        j71Var.setCallback(this);
        j71Var.f26223n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        j71Var.f26224o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        j71Var.f26225p = LocaleController.getString(R.string.UnsupportedUpdate);
        j71Var.f26219j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.c6 c6Var = this.f22557b;
        if (c6Var != null) {
            c6Var.l(0.0f, this.f22559f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, this.f22559f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f22558c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (c6Var != null) {
            paint = c6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (c6Var != null) {
            b12 = c6Var.m0();
        } else {
            b12 = org.telegram.ui.ActionBar.g6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f22558c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f19969h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f22559f = f7;
        this.h = i10;
    }

    @Override
    public final void d() {
        this.f22556a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f22558c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        j71 j71Var = this.f22556a;
        j71Var.setBounds(dp, dp2, dp3, dp4);
        j71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f22558c = dp;
        int a2 = this.f22556a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22556a.f26218i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f22556a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
