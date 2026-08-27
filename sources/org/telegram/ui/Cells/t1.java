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
import org.telegram.ui.Components.n51;

public final class t1 extends View implements org.telegram.ui.ActionBar.x5 {

    public final n51 f25654a;

    public final org.telegram.ui.ActionBar.c6 f25655b;

    public int f25656c;
    public int d;

    public j1 f25657e;

    public float f25658f;
    public int h;

    public t1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25655b = c6Var;
        n51 n51Var = new n51();
        this.f25654a = n51Var;
        n51Var.setCallback(this);
        n51Var.f30877n = LocaleController.getString(R.string.UnsupportedMessageTitle);
        n51Var.f30878o = LocaleController.getString(R.string.UnsupportedMessageMessage);
        n51Var.f30879p = LocaleController.getString(R.string.UnsupportedUpdate);
        n51Var.f30873j = new g(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f25655b;
        if (c6Var != null) {
            c6Var.m(0.0f, this.f25658f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, this.f25658f, getMeasuredWidth(), this.h);
        }
        float fDp = AndroidUtilities.dp(18.0f);
        float fDp2 = AndroidUtilities.dp(6.0f);
        float fDp3 = AndroidUtilities.dp(18.0f) + this.f25656c;
        float fDp4 = AndroidUtilities.dp(6.0f) + this.d;
        float fDp5 = AndroidUtilities.dp(18.0f);
        float fDp6 = AndroidUtilities.dp(18.0f);
        Paint paintN = c6Var != null ? c6Var.N("paintChatActionBackground") : null;
        if (paintN == null) {
            paintN = org.telegram.ui.ActionBar.g6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(fDp, fDp2, fDp3, fDp4, fDp5, fDp6, paintN);
        if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
            canvas.drawRoundRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f) + this.f25656c, AndroidUtilities.dp(6.0f) + this.d, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.f23121h2);
        }
    }

    public final void b(float f10, int i10) {
        this.f25658f = f10;
        this.h = i10;
    }

    @Override
    public final void d() {
        this.f25654a.b();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(18.0f);
        int iDp2 = AndroidUtilities.dp(6.0f);
        int iDp3 = AndroidUtilities.dp(18.0f) + this.f25656c;
        int iDp4 = AndroidUtilities.dp(6.0f) + this.d;
        n51 n51Var = this.f25654a;
        n51Var.setBounds(iDp, iDp2, iDp3, iDp4);
        n51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = size - AndroidUtilities.dp(36.0f);
        this.f25656c = iDp;
        int iA = this.f25654a.a(iDp);
        this.d = iA;
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + iA);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25654a.f30872i.a(motionEvent, this);
    }

    public void setDelegate(j1 j1Var) {
        this.f25657e = j1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25654a;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
