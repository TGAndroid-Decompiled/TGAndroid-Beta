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
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.k01;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.f6 f20856a;
    public final c0 f20857b;
    public final d21 f20858c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f20856a = f6Var;
        this.f20857b = new c0(context, i10, f6Var);
        d21 d21Var = new d21(i10, this, f6Var, true);
        this.f20858c = d21Var;
        d21Var.e = new k01("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f10, int i10) {
        this.d = i10;
        this.e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f20857b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f20856a;
        if (f6Var != null) {
            f6Var.l(f11, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(f11, this.e, measuredWidth2, this.d);
        }
        this.f20858c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f20898i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.ui.b.B(40.0f, this.f20857b.f20898i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f20857b;
        k01 k01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f20894b).getUser(Long.valueOf(j10));
        k01 k01Var2 = c0Var.e;
        k01Var2.n(1);
        k01Var2.q(9999.0f);
        k01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (k01Var2.b() / 2.0f) * 1.2f;
        k01Var2.n(4);
        float f10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        k01Var2.q(Math.min(f10, b10));
        if (k01Var2.f26083b.getLineCount() > 2) {
            k01Var2.q(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, k01Var2.b()), k01Var.b()) + AndroidUtilities.dp(32.0f), f10);
        float j11 = k01Var.j();
        float j12 = k01Var2.j();
        c0Var.h = (int) min;
        c0Var.f20898i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
