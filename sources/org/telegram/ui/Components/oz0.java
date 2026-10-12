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
public final class oz0 {
    public final int f29325a;
    public final org.telegram.ui.Cells.w0 f29326b;
    public final org.telegram.ui.ActionBar.c6 f29327c;
    public final fk0 d;
    public TL_account.TL_birthday f29328e;
    public r11 f29329f;
    public r11[] f29330g;
    public r11[] h;
    public boolean f29331i;
    public r11 f29332j;
    public final RectF f29333k = new RectF();
    public final Paint f29334l = new Paint(1);
    public final ad f29335m;

    public oz0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29325a = i10;
        this.f29326b = w0Var;
        this.f29327c = c6Var;
        fk0 fk0Var = new fk0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = fk0Var;
        fk0Var.H(false);
        this.f29335m = new ad(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f29326b;
        int width = (w0Var.getWidth() - dp) / 2;
        fk0 fk0Var = this.d;
        fk0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        fk0Var.draw(canvas);
        this.f29329f.c((w0Var.getWidth() - this.f29329f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f29329f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29330g.length; i11++) {
            i10 = (int) (Math.max(this.f29330g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f29330g.length) {
            float max = Math.max(this.f29330g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            r11 r11Var = this.f29330g[i12];
            r11Var.c(f10 - (r11Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            r11 r11Var2 = this.h[i12];
            r11Var2.c(f10 - (r11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f29331i) {
            canvas.save();
            float l4 = this.f29332j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f29333k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f29335m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f29334l);
            this.f29332j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        g5.l(this.f29326b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f29328e, new a3(this, 12), null, true, false, this.f29327c).f21484a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String i11;
        boolean q6;
        int i12;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.f29328e = tL_messageActionSuggestBirthday.birthday;
        r11 r11Var = new r11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        r11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r11Var.a();
        r11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f29329f = r11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        r11[] r11VarArr = new r11[i10];
        this.f29330g = r11VarArr;
        this.h = new r11[i10];
        r11VarArr[0] = new r11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new r11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f29330g[1] = new r11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        r11[] r11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i13 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i13 >= 0 && i13 < 12) {
            i11 = LocaleController.getString(iArr[i13]);
        } else {
            i11 = hg.c.i(i13, "");
        }
        sb2.append(i11);
        r11VarArr2[1] = new r11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f29330g[2] = new r11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new r11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f29331i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.c6 c6Var = this.f29327c;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        if (q6) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        this.f29334l.setColor(org.telegram.ui.ActionBar.h6.m1(0.12f, i12));
        this.f29332j = new r11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
