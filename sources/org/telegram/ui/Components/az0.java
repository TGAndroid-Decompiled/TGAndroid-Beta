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
public final class az0 {
    public final int f24742a;
    public final org.telegram.ui.Cells.w0 f24743b;
    public final org.telegram.ui.ActionBar.d6 f24744c;
    public final uj0 d;
    public TL_account.TL_birthday e;
    public e11 f24745f;
    public e11[] f24746g;
    public e11[] h;
    public boolean f24747i;
    public e11 f24748j;
    public final RectF f24749k = new RectF();
    public final Paint f24750l = new Paint(1);
    public final yc f24751m;

    public az0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24742a = i10;
        this.f24743b = w0Var;
        this.f24744c = d6Var;
        uj0 uj0Var = new uj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = uj0Var;
        uj0Var.H(false);
        this.f24751m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f24743b;
        int width = (w0Var.getWidth() - dp) / 2;
        uj0 uj0Var = this.d;
        uj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        uj0Var.draw(canvas);
        this.f24745f.c((w0Var.getWidth() - this.f24745f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f24745f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24746g.length; i11++) {
            i10 = (int) (Math.max(this.f24746g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f24746g.length) {
            float max = Math.max(this.f24746g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            e11 e11Var = this.f24746g[i12];
            e11Var.c(f10 - (e11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            e11 e11Var2 = this.h[i12];
            e11Var2.c(f10 - (e11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f24747i) {
            canvas.save();
            float l4 = this.f24748j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f24749k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f24751m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f24750l);
            this.f24748j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        f5.l(this.f24743b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new z2(this, 12), null, true, false, this.f24744c).f20612a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String j10;
        boolean q6;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        e11 e11Var = new e11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        e11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        e11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f24745f = e11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        e11[] e11VarArr = new e11[i10];
        this.f24746g = e11VarArr;
        this.h = new e11[i10];
        e11VarArr[0] = new e11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new e11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f24746g[1] = new e11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        e11[] e11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i12 >= 0 && i12 < 12) {
            j10 = LocaleController.getString(iArr[i12]);
        } else {
            j10 = i2.e.j(i12, "");
        }
        sb2.append(j10);
        e11VarArr2[1] = new e11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f24746g[2] = new e11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new e11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f24747i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24744c;
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
        this.f24750l.setColor(org.telegram.ui.ActionBar.h6.m1(0.12f, i11));
        this.f24748j = new e11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
