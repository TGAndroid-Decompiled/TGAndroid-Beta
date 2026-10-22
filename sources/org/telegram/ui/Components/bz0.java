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
public final class bz0 {
    public final int f25062a;
    public final org.telegram.ui.Cells.w0 f25063b;
    public final org.telegram.ui.ActionBar.d6 f25064c;
    public final vj0 d;
    public TL_account.TL_birthday e;
    public f11 f25065f;
    public f11[] f25066g;
    public f11[] h;
    public boolean f25067i;
    public f11 f25068j;
    public final RectF f25069k = new RectF();
    public final Paint f25070l = new Paint(1);
    public final yc f25071m;

    public bz0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25062a = i10;
        this.f25063b = w0Var;
        this.f25064c = d6Var;
        vj0 vj0Var = new vj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = vj0Var;
        vj0Var.H(false);
        this.f25071m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f25063b;
        int width = (w0Var.getWidth() - dp) / 2;
        vj0 vj0Var = this.d;
        vj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        vj0Var.draw(canvas);
        this.f25065f.c((w0Var.getWidth() - this.f25065f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f25065f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25066g.length; i11++) {
            i10 = (int) (Math.max(this.f25066g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f25066g.length) {
            float max = Math.max(this.f25066g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            f11 f11Var = this.f25066g[i12];
            f11Var.c(f10 - (f11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            f11 f11Var2 = this.h[i12];
            f11Var2.c(f10 - (f11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f25067i) {
            canvas.save();
            float l4 = this.f25068j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f25069k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f25071m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f25070l);
            this.f25068j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        f5.l(this.f25063b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new z2(this, 12), null, true, false, this.f25064c).f20616a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String j10;
        boolean q6;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        f11 f11Var = new f11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        f11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f11Var.a();
        f11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f25065f = f11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        f11[] f11VarArr = new f11[i10];
        this.f25066g = f11VarArr;
        this.h = new f11[i10];
        f11VarArr[0] = new f11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new f11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f25066g[1] = new f11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        f11[] f11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i12 >= 0 && i12 < 12) {
            j10 = LocaleController.getString(iArr[i12]);
        } else {
            j10 = i2.e.j(i12, "");
        }
        sb2.append(j10);
        f11VarArr2[1] = new f11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f25066g[2] = new f11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new f11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f25067i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.d6 d6Var = this.f25064c;
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
        this.f25070l.setColor(org.telegram.ui.ActionBar.h6.m1(0.12f, i11));
        this.f25068j = new f11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
