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
import org.telegram.ui.Components.k71;
public final class v1 extends View implements org.telegram.ui.ActionBar.x5 {
    public final k71 f22262a;
    public final org.telegram.ui.ActionBar.c6 f22263b;
    public int f22264c;
    public int d;
    public l1 e;
    public float f22265f;
    public int h;

    public v1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f22263b = c6Var;
        k71 k71Var = new k71();
        this.f22262a = k71Var;
        k71Var.setCallback(this);
        k71Var.f26244n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        k71Var.f26245o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        k71Var.f26246p = LocaleController.getString(R.string.UnsupportedUpdate);
        k71Var.f26240j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b12;
        org.telegram.ui.ActionBar.c6 c6Var = this.f22263b;
        if (c6Var != null) {
            c6Var.l(0.0f, this.f22265f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, this.f22265f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f22264c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (c6Var != null) {
            paint = c6Var.F("paintChatActionBackground");
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f22264c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f19669h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f22265f = f7;
        this.h = i10;
    }

    @Override
    public final void d() {
        this.f22262a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f22264c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        k71 k71Var = this.f22262a;
        k71Var.setBounds(dp, dp2, dp3, dp4);
        k71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f22264c = dp;
        int a2 = this.f22262a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22262a.f26239i.a(motionEvent, this);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f22262a) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
