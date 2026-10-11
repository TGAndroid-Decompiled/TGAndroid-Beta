package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i31;
import org.telegram.ui.Components.n11;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.d6 f21817a;
    public final c0 f21818b;
    public final i31 f21819c;
    public int d;
    public float f21820e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f21817a = d6Var;
        this.f21818b = new c0(context, i10, d6Var);
        i31 i31Var = new i31(i10, this, d6Var, true);
        this.f21819c = i31Var;
        i31Var.f27158e = new n11("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f7, int i10) {
        this.d = i10;
        this.f21820e = f7;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f21818b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.d6 d6Var = this.f21817a;
        if (d6Var != null) {
            d6Var.m(f10, this.f21820e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(f10, this.f21820e, measuredWidth2, this.d);
        }
        this.f21819c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f21894i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), ai.C(40.0f, this.f21818b.f21894i, 1073741824));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.f21818b;
        n11 n11Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f21889b).getUser(Long.valueOf(j3));
        n11 n11Var2 = c0Var.f21891e;
        n11Var2.n(1);
        n11Var2.q(9999.0f);
        n11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (n11Var2.b() / 2.0f) * 1.2f;
        n11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        n11Var2.q(Math.min(f7, b10));
        if (n11Var2.f28901b.getLineCount() > 2) {
            n11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, n11Var2.b()), n11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = n11Var.j();
        float j11 = n11Var2.j();
        c0Var.h = (int) min;
        c0Var.f21894i = (int) (j11 + j10 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
