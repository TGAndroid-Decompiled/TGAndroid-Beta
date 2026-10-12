package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ez0 {
    public final int f24827a;
    public final org.telegram.ui.Cells.x0 f24828b;
    public final org.telegram.ui.ActionBar.c6 f24829c;
    public final yj0 d;
    public TL_account.TL_birthday e;
    public h11 f24830f;
    public h11[] f24831g;
    public h11[] h;
    public boolean f24832i;
    public h11 f24833j;
    public final RectF f24834k = new RectF();
    public final Paint f24835l = new Paint(1);
    public final ad f24836m;

    public ez0(int i10, org.telegram.ui.Cells.x0 x0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f24827a = i10;
        this.f24828b = x0Var;
        this.f24829c = c6Var;
        yj0 yj0Var = new yj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = yj0Var;
        yj0Var.H(false);
        this.f24836m = new ad(x0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.x0 x0Var = this.f24828b;
        int width = (x0Var.getWidth() - dp) / 2;
        yj0 yj0Var = this.d;
        yj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        yj0Var.draw(canvas);
        this.f24830f.c((x0Var.getWidth() - this.f24830f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f24830f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24831g.length; i11++) {
            i10 = (int) (Math.max(this.f24831g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (x0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f24831g.length) {
            float max = Math.max(this.f24831g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            h11 h11Var = this.f24831g[i12];
            h11Var.c(f10 - (h11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            h11 h11Var2 = this.h[i12];
            h11Var2.c(f10 - (h11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f24832i) {
            canvas.save();
            float l4 = this.f24833j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f24834k;
            rectF.set((x0Var.getWidth() - l4) / 2.0f, dp3, (x0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f24836m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f24835l);
            this.f24833j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        g5.l(this.f24828b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new a3(this, 12), null, true, false, this.f24829c).f20838a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String i11;
        boolean q6;
        int i12;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        h11 h11Var = new h11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        h11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h11Var.a();
        h11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f24830f = h11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        h11[] h11VarArr = new h11[i10];
        this.f24831g = h11VarArr;
        this.h = new h11[i10];
        h11VarArr[0] = new h11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new h11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f24831g[1] = new h11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        h11[] h11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i13 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i13 >= 0 && i13 < 12) {
            i11 = LocaleController.getString(iArr[i13]);
        } else {
            i11 = i2.d.i(i13, "");
        }
        sb2.append(i11);
        h11VarArr2[1] = new h11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f24831g[2] = new h11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new h11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f24832i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.c6 c6Var = this.f24829c;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        if (q6) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        this.f24835l.setColor(org.telegram.ui.ActionBar.g6.m1(0.12f, i12));
        this.f24833j = new h11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
