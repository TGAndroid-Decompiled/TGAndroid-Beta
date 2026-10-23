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
    public final int f26102a;
    public final org.telegram.ui.Cells.v0 f26103b;
    public final org.telegram.ui.ActionBar.g6 f26104c;
    public final yj0 d;
    public TL_account.TL_birthday e;
    public i11 f26105f;
    public i11[] f26106g;
    public i11[] h;
    public boolean f26107i;
    public i11 f26108j;
    public final RectF f26109k = new RectF();
    public final Paint f26110l = new Paint(1);
    public final yc f26111m;

    public ez0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26102a = i10;
        this.f26103b = v0Var;
        this.f26104c = g6Var;
        yj0 yj0Var = new yj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = yj0Var;
        yj0Var.H(false);
        this.f26111m = new yc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f26103b;
        int width = (v0Var.getWidth() - dp) / 2;
        yj0 yj0Var = this.d;
        yj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        yj0Var.draw(canvas);
        this.f26105f.c((v0Var.getWidth() - this.f26105f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f26105f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26106g.length; i11++) {
            i10 = (int) (Math.max(this.f26106g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f26106g.length) {
            float max = Math.max(this.f26106g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            i11 i11Var = this.f26106g[i12];
            i11Var.c(f10 - (i11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            i11 i11Var2 = this.h[i12];
            i11Var2.c(f10 - (i11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f26107i) {
            canvas.save();
            float l4 = this.f26108j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f26109k;
            rectF.set((v0Var.getWidth() - l4) / 2.0f, dp3, (v0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f26111m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f26110l);
            this.f26108j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        f5.m(this.f26103b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new y2(this, 12), null, true, false, this.f26104c).f20728a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String k10;
        boolean q6;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        i11 i11Var = new i11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        i11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var.a();
        i11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f26105f = i11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        i11[] i11VarArr = new i11[i10];
        this.f26106g = i11VarArr;
        this.h = new i11[i10];
        i11VarArr[0] = new i11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new i11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f26106g[1] = new i11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        i11[] i11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i12 >= 0 && i12 < 12) {
            k10 = LocaleController.getString(iArr[i12]);
        } else {
            k10 = i2.o1.k(i12, "");
        }
        sb2.append(k10);
        i11VarArr2[1] = new i11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f26106g[2] = new i11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new i11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f26107i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.g6 g6Var = this.f26104c;
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
        this.f26110l.setColor(org.telegram.ui.ActionBar.k6.o1(0.12f, i11));
        this.f26108j = new i11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
