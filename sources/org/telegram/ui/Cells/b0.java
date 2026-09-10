package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.t01;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.f6 f18903a;
    public final c0 f18904b;
    public final p21 f18905c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f18903a = f6Var;
        this.f18904b = new c0(context, i10, f6Var);
        p21 p21Var = new p21(i10, this, f6Var, true);
        this.f18905c = p21Var;
        p21Var.e = new t01("", 14.0f, AndroidUtilities.bold());
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
        c0 c0Var = this.f18904b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f18903a;
        if (f6Var != null) {
            f6Var.l(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f18905c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f18956i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), em.C(40.0f, this.f18904b.f18956i, 1073741824));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.f18904b;
        t01 t01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f18952b).getUser(Long.valueOf(j3));
        t01 t01Var2 = c0Var.e;
        t01Var2.n(1);
        t01Var2.q(9999.0f);
        t01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (t01Var2.b() / 2.0f) * 1.2f;
        t01Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        t01Var2.q(Math.min(f7, b10));
        if (t01Var2.f27246b.getLineCount() > 2) {
            t01Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, t01Var2.b()), t01Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = t01Var.j();
        float j11 = t01Var2.j();
        c0Var.h = (int) min;
        c0Var.f18956i = (int) (j11 + j10 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
