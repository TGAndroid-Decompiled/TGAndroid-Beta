package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.f01;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.f6 f21629a;
    public final c0 f21630b;
    public final a21 f21631c;
    public int d;
    public float f21632e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21629a = f6Var;
        this.f21630b = new c0(context, i10, f6Var);
        a21 a21Var = new a21(i10, this, f6Var, true);
        this.f21631c = a21Var;
        a21Var.f24237e = new f01("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f7, int i10) {
        this.d = i10;
        this.f21632e = f7;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f21630b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21629a;
        if (f6Var != null) {
            f6Var.l(f10, this.f21632e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, this.f21632e, measuredWidth2, this.d);
        }
        this.f21631c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f21670i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), vl.C(40.0f, this.f21630b.f21670i, 1073741824));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.f21630b;
        f01 f01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f21665b).getUser(Long.valueOf(j3));
        f01 f01Var2 = c0Var.f21667e;
        f01Var2.n(1);
        f01Var2.q(9999.0f);
        f01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (f01Var2.b() / 2.0f) * 1.2f;
        f01Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        f01Var2.q(Math.min(f7, b10));
        if (f01Var2.f25846b.getLineCount() > 2) {
            f01Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, f01Var2.b()), f01Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = f01Var.j();
        float j11 = f01Var2.j();
        c0Var.h = (int) min;
        c0Var.f21670i = (int) (j11 + j10 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
