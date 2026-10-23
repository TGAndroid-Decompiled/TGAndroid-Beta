package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.y21;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.d6 f22033a;
    public final c0 f22034b;
    public final y21 f22035c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22033a = d6Var;
        this.f22034b = new c0(context, i10, d6Var);
        y21 y21Var = new y21(i10, this, d6Var, true);
        this.f22035c = y21Var;
        y21Var.e = new f11("", 14.0f, AndroidUtilities.bold());
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
        c0 c0Var = this.f22034b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22033a;
        if (d6Var != null) {
            d6Var.d(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f22035c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f22084i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), nk.C(40.0f, this.f22034b.f22084i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f22034b;
        f11 f11Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f22080b).getUser(Long.valueOf(j10));
        f11 f11Var2 = c0Var.e;
        f11Var2.n(1);
        f11Var2.q(9999.0f);
        f11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (f11Var2.b() / 2.0f) * 1.2f;
        f11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        f11Var2.q(Math.min(f7, b10));
        if (f11Var2.f26024b.getLineCount() > 2) {
            f11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, f11Var2.b()), f11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j11 = f11Var.j();
        float j12 = f11Var2.j();
        c0Var.h = (int) min;
        c0Var.f22084i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
