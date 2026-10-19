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
import org.telegram.ui.Components.d71;
public final class v1 extends View implements org.telegram.ui.ActionBar.y5 {
    public final d71 f23619a;
    public final org.telegram.ui.ActionBar.d6 f23620b;
    public int f23621c;
    public int d;
    public l1 e;
    public float f23622f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f23620b = d6Var;
        d71 d71Var = new d71();
        this.f23619a = d71Var;
        d71Var.setCallback(this);
        d71Var.f25447n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        d71Var.f25448o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        d71Var.f25449p = LocaleController.getString(R.string.UnsupportedUpdate);
        d71Var.f25443j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23620b;
        if (d6Var != null) {
            d6Var.d(0.0f, this.f23622f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, this.f23622f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23621c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (d6Var != null) {
            paint = d6Var.n("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (d6Var != null) {
            b12 = d6Var.s();
        } else {
            b12 = org.telegram.ui.ActionBar.h6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23621c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f21055h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23622f = f7;
        this.h = i10;
    }

    @Override
    public final void d() {
        this.f23619a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23621c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        d71 d71Var = this.f23619a;
        d71Var.setBounds(dp, dp2, dp3, dp4);
        d71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23621c = dp;
        int a2 = this.f23619a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23619a.f25442i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23619a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
