package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l31;
import org.telegram.ui.Components.q11;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.u6 f23837a;
    public final b0 f23838b;
    public final l31 f23839c;
    public int d;
    public float e;

    public a0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f23837a = u6Var;
        this.f23838b = new b0(context, i10, u6Var);
        l31 l31Var = new l31(i10, this, u6Var, true);
        this.f23839c = l31Var;
        l31Var.e = new q11("", 14.0f, AndroidUtilities.bold());
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
        b0 b0Var = this.f23838b;
        int i10 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.u6 u6Var = this.f23837a;
        if (u6Var != null) {
            u6Var.b(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.y6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f23839c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i10, dp, b0Var.h + i10, b0Var.f23892i + dp);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), vh.D(40.0f, this.f23838b.f23892i, 1073741824));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.f23838b;
        q11 q11Var = b0Var.d;
        TLRPC.User user = MessagesController.getInstance(b0Var.f23888b).getUser(Long.valueOf(j10));
        q11 q11Var2 = b0Var.e;
        q11Var2.n(1);
        q11Var2.q(9999.0f);
        q11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (q11Var2.b() / 2.0f) * 1.2f;
        q11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        q11Var2.q(Math.min(f7, b10));
        if (q11Var2.f31789b.getLineCount() > 2) {
            q11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, q11Var2.b()), q11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j11 = q11Var.j();
        float j12 = q11Var2.j();
        b0Var.h = (int) min;
        b0Var.f23892i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
