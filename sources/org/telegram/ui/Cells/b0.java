package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q21;
import org.telegram.ui.Components.v01;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.e6 f20003a;
    public final c0 f20004b;
    public final q21 f20005c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f20003a = e6Var;
        this.f20004b = new c0(context, i10, e6Var);
        q21 q21Var = new q21(i10, this, e6Var, true);
        this.f20005c = q21Var;
        q21Var.e = new v01("", 14.0f, AndroidUtilities.bold());
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
        c0 c0Var = this.f20004b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.e6 e6Var = this.f20003a;
        if (e6Var != null) {
            e6Var.m(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f20005c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f20044i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), wh.C(40.0f, this.f20004b.f20044i, 1073741824));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.f20004b;
        v01 v01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f20040b).getUser(Long.valueOf(j3));
        v01 v01Var2 = c0Var.e;
        v01Var2.n(1);
        v01Var2.q(9999.0f);
        v01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (v01Var2.b() / 2.0f) * 1.2f;
        v01Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        v01Var2.q(Math.min(f7, b10));
        if (v01Var2.f28867b.getLineCount() > 2) {
            v01Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, v01Var2.b()), v01Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = v01Var.j();
        float j11 = v01Var2.j();
        c0Var.h = (int) min;
        c0Var.f20044i = (int) (j11 + j10 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
