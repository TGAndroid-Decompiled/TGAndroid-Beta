package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u71;
public final class t1 extends View implements org.telegram.ui.ActionBar.p6 {
    public final u71 f25431a;
    public final org.telegram.ui.ActionBar.u6 f25432b;
    public int f25433c;
    public int d;
    public j1 e;
    public float f25434f;
    public int h;

    public t1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f25432b = u6Var;
        u71 u71Var = new u71();
        this.f25431a = u71Var;
        u71Var.setCallback(this);
        u71Var.f33279n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        u71Var.f33280o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        u71Var.f33281p = LocaleController.getString(R.string.UnsupportedUpdate);
        u71Var.f33275j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean c12;
        org.telegram.ui.ActionBar.u6 u6Var = this.f25432b;
        if (u6Var != null) {
            u6Var.b(0.0f, this.f25434f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.y6.q(0.0f, this.f25434f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f25433c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (u6Var != null) {
            paint = u6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.y6.U0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (u6Var != null) {
            c12 = u6Var.f();
        } else {
            c12 = org.telegram.ui.ActionBar.y6.c1();
        }
        if (c12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f25433c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.f23424h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f25434f = f7;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f25433c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        u71 u71Var = this.f25431a;
        u71Var.setBounds(dp, dp2, dp3, dp4);
        u71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f25433c = dp;
        int a2 = this.f25431a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25431a.f33274i.a(motionEvent, this);
    }

    public void setDelegate(j1 j1Var) {
        this.e = j1Var;
    }

    @Override
    public final void updateColors() {
        this.f25431a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25431a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
