package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.zz0;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.c6 f24107a;
    public final c0 f24108b;
    public final t11 f24109c;
    public int d;
    public float f24110e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24107a = c6Var;
        this.f24108b = new c0(context, i10, c6Var);
        t11 t11Var = new t11(i10, this, c6Var, true);
        this.f24109c = t11Var;
        t11Var.f32806e = new zz0("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f9, int i10) {
        this.d = i10;
        this.f24110e = f9;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f24108b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f9 = sideMenuWidth;
        float f10 = f9 / 2.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24107a;
        if (c6Var != null) {
            c6Var.l(f10, this.f24110e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.g6.q(f10, this.f24110e, measuredWidth2, this.d);
        }
        this.f24109c.c(canvas, getWidth(), f9, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f24145i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.ui.b.B(40.0f, this.f24108b.f24145i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f24108b;
        zz0 zz0Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f24140b).getUser(Long.valueOf(j10));
        zz0 zz0Var2 = c0Var.f24142e;
        zz0Var2.n(1);
        zz0Var2.q(9999.0f);
        zz0Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (zz0Var2.b() / 2.0f) * 1.2f;
        zz0Var2.n(4);
        float f9 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        zz0Var2.q(Math.min(f9, b10));
        if (zz0Var2.f35461b.getLineCount() > 2) {
            zz0Var2.q(Math.min(f9, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, zz0Var2.b()), zz0Var.b()) + AndroidUtilities.dp(32.0f), f9);
        float j11 = zz0Var.j();
        float j12 = zz0Var2.j();
        c0Var.h = (int) min;
        c0Var.f24145i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
