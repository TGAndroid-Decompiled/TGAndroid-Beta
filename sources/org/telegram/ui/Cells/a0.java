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
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.r11;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.u6 f23838a;
    public final b0 f23839b;
    public final m31 f23840c;
    public int d;
    public float e;

    public a0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f23838a = u6Var;
        this.f23839b = new b0(context, i10, u6Var);
        m31 m31Var = new m31(i10, this, u6Var, true);
        this.f23840c = m31Var;
        m31Var.e = new r11("", 14.0f, AndroidUtilities.bold());
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
        b0 b0Var = this.f23839b;
        int i10 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.u6 u6Var = this.f23838a;
        if (u6Var != null) {
            u6Var.b(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.y6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.f23840c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i10, dp, b0Var.h + i10, b0Var.f23893i + dp);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), wh.D(40.0f, this.f23839b.f23893i, 1073741824));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.f23839b;
        r11 r11Var = b0Var.d;
        TLRPC.User user = MessagesController.getInstance(b0Var.f23889b).getUser(Long.valueOf(j10));
        r11 r11Var2 = b0Var.e;
        r11Var2.n(1);
        r11Var2.q(9999.0f);
        r11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (r11Var2.b() / 2.0f) * 1.2f;
        r11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        r11Var2.q(Math.min(f7, b10));
        if (r11Var2.f32089b.getLineCount() > 2) {
            r11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, r11Var2.b()), r11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j11 = r11Var.j();
        float j12 = r11Var2.j();
        b0Var.h = (int) min;
        b0Var.f23893i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
