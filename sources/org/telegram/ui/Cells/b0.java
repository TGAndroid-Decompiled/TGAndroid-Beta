package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.pz0;

public abstract class b0 extends View {

    public final org.telegram.ui.ActionBar.c6 f24088a;

    public final c0 f24089b;

    public final j11 f24090c;
    public int d;

    public float f24091e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24088a = c6Var;
        this.f24089b = new c0(context, i10, c6Var);
        j11 j11Var = new j11(i10, this, c6Var, true);
        this.f24090c = j11Var;
        j11Var.f29541e = new pz0("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f10, int i10) {
        this.d = i10;
        this.f24091e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f24089b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int iDp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24088a;
        if (c6Var != null) {
            c6Var.m(f11, this.f24091e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.g6.q(f11, this.f24091e, measuredWidth2, this.d);
        }
        this.f24090c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, iDp, c0Var.h + i10, c0Var.f24147i + iDp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), rl.B(40.0f, this.f24089b.f24147i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f24089b;
        pz0 pz0Var = c0Var.d;
        int i10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        TLRPC.User user = MessagesController.getInstance(c0Var.f24142b).getUser(Long.valueOf(j10));
        pz0 pz0Var2 = c0Var.f24144e;
        pz0Var2.n(1);
        pz0Var2.q(9999.0f);
        pz0Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float fB = (pz0Var2.b() / 2.0f) * 1.2f;
        pz0Var2.n(4);
        float f10 = i10;
        pz0Var2.q(Math.min(f10, fB));
        if (pz0Var2.f31696b.getLineCount() > 2) {
            pz0Var2.q(Math.min(f10, fB * 1.2f));
        }
        float fMin = Math.min(Math.max(Math.max(0.0f, pz0Var2.b()), pz0Var.b()) + AndroidUtilities.dp(32.0f), f10);
        float fJ = pz0Var2.j() + pz0Var.j() + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        c0Var.h = (int) fMin;
        c0Var.f24147i = (int) fJ;
    }
}
