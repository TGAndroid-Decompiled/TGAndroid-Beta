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
import org.telegram.ui.Components.v71;
public final class t1 extends View implements org.telegram.ui.ActionBar.p6 {
    public final v71 f25433a;
    public final org.telegram.ui.ActionBar.u6 f25434b;
    public int f25435c;
    public int d;
    public j1 e;
    public float f25436f;
    public int h;

    public t1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f25434b = u6Var;
        v71 v71Var = new v71();
        this.f25433a = v71Var;
        v71Var.setCallback(this);
        v71Var.f33593n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        v71Var.f33594o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        v71Var.f33595p = LocaleController.getString(R.string.UnsupportedUpdate);
        v71Var.f33589j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean c12;
        org.telegram.ui.ActionBar.u6 u6Var = this.f25434b;
        if (u6Var != null) {
            u6Var.b(0.0f, this.f25436f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.y6.q(0.0f, this.f25436f, getMeasuredWidth(), this.h);
        }
        float dp = AndroidUtilities.dp(18.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        float dp3 = AndroidUtilities.dp(18.0f) + this.f25435c;
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
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f25435c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.f23425h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f25436f = f7;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(18.0f) + this.f25435c;
        int dp4 = AndroidUtilities.dp(6.0f) + this.d;
        v71 v71Var = this.f25433a;
        v71Var.setBounds(dp, dp2, dp3, dp4);
        v71Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(36.0f);
        this.f25435c = dp;
        int a2 = this.f25433a.a(dp);
        this.d = a2;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + a2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25433a.f33588i.a(motionEvent, this);
    }

    public void setDelegate(j1 j1Var) {
        this.e = j1Var;
    }

    @Override
    public final void updateColors() {
        this.f25433a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25433a) {
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
