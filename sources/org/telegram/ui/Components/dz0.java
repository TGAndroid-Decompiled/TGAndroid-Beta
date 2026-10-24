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
public final class dz0 {
    public final int f25864a;
    public final org.telegram.ui.Cells.v0 f25865b;
    public final org.telegram.ui.ActionBar.g6 f25866c;
    public final xj0 d;
    public TL_account.TL_birthday e;
    public h11 f25867f;
    public h11[] f25868g;
    public h11[] h;
    public boolean f25869i;
    public h11 f25870j;
    public final RectF f25871k = new RectF();
    public final Paint f25872l = new Paint(1);
    public final wc f25873m;

    public dz0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f25864a = i10;
        this.f25865b = v0Var;
        this.f25866c = g6Var;
        xj0 xj0Var = new xj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = xj0Var;
        xj0Var.H(false);
        this.f25873m = new wc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f25865b;
        int width = (v0Var.getWidth() - dp) / 2;
        xj0 xj0Var = this.d;
        xj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        xj0Var.draw(canvas);
        this.f25867f.c((v0Var.getWidth() - this.f25867f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f25867f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25868g.length; i11++) {
            i10 = (int) (Math.max(this.f25868g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f25868g.length) {
            float max = Math.max(this.f25868g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            h11 h11Var = this.f25868g[i12];
            h11Var.c(f10 - (h11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            h11 h11Var2 = this.h[i12];
            h11Var2.c(f10 - (h11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f25869i) {
            canvas.save();
            float l4 = this.f25870j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f25871k;
            rectF.set((v0Var.getWidth() - l4) / 2.0f, dp3, (v0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f25873m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f25872l);
            this.f25870j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        d5.l(this.f25865b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 12), null, true, false, this.f25866c).f20729a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String k10;
        boolean q6;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        h11 h11Var = new h11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        h11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h11Var.a();
        h11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f25867f = h11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        h11[] h11VarArr = new h11[i10];
        this.f25868g = h11VarArr;
        this.h = new h11[i10];
        h11VarArr[0] = new h11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new h11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f25868g[1] = new h11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        h11[] h11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i12 >= 0 && i12 < 12) {
            k10 = LocaleController.getString(iArr[i12]);
        } else {
            k10 = i2.o1.k(i12, "");
        }
        sb2.append(k10);
        h11VarArr2[1] = new h11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f25868g[2] = new h11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new h11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f25869i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.g6 g6Var = this.f25866c;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (q6) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f25872l.setColor(org.telegram.ui.ActionBar.k6.o1(0.12f, i11));
        this.f25870j = new h11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
