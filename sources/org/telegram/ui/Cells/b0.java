package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.nz0;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.b6 f24118a;
    public final c0 f24119b;
    public final h11 f24120c;
    public int d;
    public float f24121e;

    public b0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24118a = b6Var;
        this.f24119b = new c0(context, i9, b6Var);
        h11 h11Var = new h11(i9, this, b6Var, true);
        this.f24120c = h11Var;
        h11Var.f28933e = new nz0("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f10, int i9) {
        this.d = i9;
        this.f24121e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f24119b;
        int i9 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24118a;
        if (b6Var != null) {
            b6Var.o(f11, this.f24121e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.f6.q(f11, this.f24121e, measuredWidth2, this.d);
        }
        this.f24120c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i9, dp, c0Var.h + i9, c0Var.f24178i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), ll.C(40.0f, this.f24119b.f24178i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f24119b;
        nz0 nz0Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f24173b).getUser(Long.valueOf(j10));
        nz0 nz0Var2 = c0Var.f24175e;
        nz0Var2.n(1);
        nz0Var2.q(9999.0f);
        nz0Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (nz0Var2.b() / 2.0f) * 1.2f;
        nz0Var2.n(4);
        float f10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        nz0Var2.q(Math.min(f10, b10));
        if (nz0Var2.f31222b.getLineCount() > 2) {
            nz0Var2.q(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, nz0Var2.b()), nz0Var.b()) + AndroidUtilities.dp(32.0f), f10);
        float j11 = nz0Var.j();
        float j12 = nz0Var2.j();
        c0Var.h = (int) min;
        c0Var.f24178i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
