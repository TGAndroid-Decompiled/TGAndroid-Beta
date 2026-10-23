package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.i11;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.g6 f22071a;
    public final b0 f22072b;
    public final c31 f22073c;
    public int d;
    public float e;

    public a0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22071a = g6Var;
        this.f22072b = new b0(context, i10, g6Var);
        c31 c31Var = new c31(i10, this, g6Var, true);
        this.f22073c = c31Var;
        c31Var.e = new i11("", 14.0f, AndroidUtilities.bold());
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
        b0 b0Var = this.f22072b;
        int i10 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22071a;
        if (g6Var != null) {
            g6Var.b(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f22073c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i10, dp, b0Var.h + i10, b0Var.f22124i + dp);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), sl.C(40.0f, this.f22072b.f22124i, 1073741824));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.f22072b;
        i11 i11Var = b0Var.d;
        TLRPC.User user = MessagesController.getInstance(b0Var.f22120b).getUser(Long.valueOf(j10));
        i11 i11Var2 = b0Var.e;
        i11Var2.n(1);
        i11Var2.q(9999.0f);
        i11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (i11Var2.b() / 2.0f) * 1.2f;
        i11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        i11Var2.q(Math.min(f7, b10));
        if (i11Var2.f27163b.getLineCount() > 2) {
            i11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, i11Var2.b()), i11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j11 = i11Var.j();
        float j12 = i11Var2.j();
        b0Var.h = (int) min;
        b0Var.f22124i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
