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
import org.telegram.ui.Components.l71;
public final class u1 extends View implements org.telegram.ui.ActionBar.b6 {
    public final l71 f23721a;
    public final org.telegram.ui.ActionBar.g6 f23722b;
    public int f23723c;
    public int d;
    public k1 e;
    public float f23724f;
    public int h;

    public u1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f23722b = g6Var;
        l71 l71Var = new l71();
        this.f23721a = l71Var;
        l71Var.setCallback(this);
        l71Var.f28249n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        l71Var.f28250o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        l71Var.f28251p = LocaleController.getString(R.string.UnsupportedUpdate);
        l71Var.f28245j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean c12;
        org.telegram.ui.ActionBar.g6 g6Var = this.f23722b;
        if (g6Var != null) {
            g6Var.b(0.0f, this.f23724f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, this.f23724f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f23723c;
        float dp4 = AndroidUtilities.dp(6.0f) + this.d;
        float dp5 = AndroidUtilities.dp(18.0f);
        float dp6 = AndroidUtilities.dp(18.0f);
        if (g6Var != null) {
            paint = g6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.U0("paintChatActionBackground");
        }
        canvas.drawRoundRect(dp, dp2, dp3, dp4, dp5, dp6, paint);
        if (g6Var != null) {
            c12 = g6Var.f();
        } else {
            c12 = org.telegram.ui.ActionBar.k6.c1();
        }
        if (c12) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f23723c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.f21251h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f23724f = f7;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f23723c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        l71 l71Var = this.f23721a;
        l71Var.setBounds(dp, dp2, dp3, dp4);
        l71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f23723c = dp;
        int a2 = this.f23721a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23721a.f28244i.a(motionEvent, this);
    }

    public void setDelegate(k1 k1Var) {
        this.e = k1Var;
    }

    @Override
    public final void updateColors() {
        this.f23721a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23721a) {
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
