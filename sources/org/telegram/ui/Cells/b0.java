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
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.l01;
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.g6 f22582a;
    public final c0 f22583b;
    public final e21 f22584c;
    public int d;
    public float f22585e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22582a = g6Var;
        this.f22583b = new c0(context, i10, g6Var);
        e21 e21Var = new e21(i10, this, g6Var, true);
        this.f22584c = e21Var;
        e21Var.f26382e = new l01("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f10, int i10) {
        this.d = i10;
        this.f22585e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.f22583b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22582a;
        if (g6Var != null) {
            g6Var.l(f11, this.f22585e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(f11, this.f22585e, measuredWidth2, this.d);
        }
        this.f22584c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.f22629i + dp);
        c0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.ui.b.B(40.0f, this.f22583b.f22629i, 1073741824));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.f22583b;
        l01 l01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.f22624b).getUser(Long.valueOf(j10));
        l01 l01Var2 = c0Var.f22626e;
        l01Var2.n(1);
        l01Var2.q(9999.0f);
        l01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (l01Var2.b() / 2.0f) * 1.2f;
        l01Var2.n(4);
        float f10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        l01Var2.q(Math.min(f10, b10));
        if (l01Var2.f28520b.getLineCount() > 2) {
            l01Var2.q(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, l01Var2.b()), l01Var.b()) + AndroidUtilities.dp(32.0f), f10);
        float j11 = l01Var.j();
        float j12 = l01Var2.j();
        c0Var.h = (int) min;
        c0Var.f22629i = (int) (j12 + j11 + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f));
    }
}
