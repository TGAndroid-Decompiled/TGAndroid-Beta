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
public final class kz0 {
    public final int f28118a;
    public final org.telegram.ui.Cells.w0 f28119b;
    public final org.telegram.ui.ActionBar.d6 f28120c;
    public final ek0 d;
    public TL_account.TL_birthday f28121e;
    public n11 f28122f;
    public n11[] f28123g;
    public n11[] h;
    public boolean f28124i;
    public n11 f28125j;
    public final RectF f28126k = new RectF();
    public final Paint f28127l = new Paint(1);
    public final bd f28128m;

    public kz0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28118a = i10;
        this.f28119b = w0Var;
        this.f28120c = d6Var;
        ek0 ek0Var = new ek0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = ek0Var;
        ek0Var.H(false);
        this.f28128m = new bd(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f28119b;
        int width = (w0Var.getWidth() - dp) / 2;
        ek0 ek0Var = this.d;
        ek0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        ek0Var.draw(canvas);
        this.f28122f.c((w0Var.getWidth() - this.f28122f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f28122f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28123g.length; i11++) {
            i10 = (int) (Math.max(this.f28123g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f28123g.length) {
            float max = Math.max(this.f28123g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            n11 n11Var = this.f28123g[i12];
            n11Var.c(f10 - (n11Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            n11 n11Var2 = this.h[i12];
            n11Var2.c(f10 - (n11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f28124i) {
            canvas.save();
            float l4 = this.f28125j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f28126k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f28128m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f28127l);
            this.f28125j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        g5.l(this.f28119b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f28121e, new a3(this, 12), null, true, false, this.f28120c).f21710a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String h;
        boolean q6;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.f28121e = tL_messageActionSuggestBirthday.birthday;
        n11 n11Var = new n11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        n11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        n11Var.a();
        n11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f28122f = n11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        n11[] n11VarArr = new n11[i10];
        this.f28123g = n11VarArr;
        this.h = new n11[i10];
        n11VarArr[0] = new n11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new n11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f28123g[1] = new n11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        n11[] n11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i12 >= 0 && i12 < 12) {
            h = LocaleController.getString(iArr[i12]);
        } else {
            h = hg.c.h(i12, "");
        }
        sb2.append(h);
        n11VarArr2[1] = new n11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f28123g[2] = new n11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new n11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f28124i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.d6 d6Var = this.f28120c;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        if (q6) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f28127l.setColor(org.telegram.ui.ActionBar.h6.m1(0.12f, i11));
        this.f28125j = new n11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
