package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.i11;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.c6 f20632a;
    public final c0 f20633b;
    public final d31 f20634c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f20632a = c6Var;
        this.f20633b = new c0(context, i10, c6Var);
        d31 d31Var = new d31(i10, this, c6Var, true);
        this.f20634c = d31Var;
        d31Var.e = new i11("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f7, int i10) {
        this.d = i10;
        this.e = f7;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f20633b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f20632a;
        if (c6Var != null) {
            c6Var.l(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.g6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f20634c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f20702i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), sk.C(40.0f, this.f20633b.f20702i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f20633b;
        i11 i11Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f20698b).getUser(Long.valueOf(j10));
        i11 i11Var2 = c0Var.e;
        i11Var2.n(1);
        i11Var2.q(9999.0f);
        i11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (i11Var2.b() / 2.0f) * 1.2f;
        i11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        i11Var2.q(Math.min(f7, b10));
        if (i11Var2.f25454b.getLineCount() > 2) {
            i11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, i11Var2.b()), i11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j11 = i11Var.j();
        float j12 = i11Var2.j();
        c0Var.h = (int) min;
        c0Var.f20702i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
