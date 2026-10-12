package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.r11;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.c6 f21590a;
    public final c0 f21591b;
    public final m31 f21592c;
    public int d;
    public float f21593e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21590a = c6Var;
        this.f21591b = new c0(context, i10, c6Var);
        m31 m31Var = new m31(i10, this, c6Var, true);
        this.f21592c = m31Var;
        m31Var.f28374e = new r11("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f7, int i10) {
        this.d = i10;
        this.f21593e = f7;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f21591b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f21590a;
        if (c6Var != null) {
            c6Var.m(f10, this.f21593e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(f10, this.f21593e, measuredWidth2, this.d);
        }
        this.f21592c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f21665i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), am.C(40.0f, this.f21591b.f21665i, 1073741824));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.f21591b;
        r11 r11Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f21660b).getUser(Long.valueOf(j3));
        r11 r11Var2 = c0Var.f21662e;
        r11Var2.n(1);
        r11Var2.q(9999.0f);
        r11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (r11Var2.b() / 2.0f) * 1.2f;
        r11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        r11Var2.q(Math.min(f7, b10));
        if (r11Var2.f29988b.getLineCount() > 2) {
            r11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, r11Var2.b()), r11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = r11Var.j();
        float j11 = r11Var2.j();
        c0Var.h = (int) min;
        c0Var.f21665i = (int) (j11 + j10 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
