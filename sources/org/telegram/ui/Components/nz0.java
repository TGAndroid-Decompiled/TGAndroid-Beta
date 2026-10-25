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
public final class nz0 {
    public final int f31100a;
    public final org.telegram.ui.Cells.v0 f31101b;
    public final org.telegram.ui.ActionBar.u6 f31102c;
    public final xj0 d;
    public TL_account.TL_birthday e;
    public q11 f31103f;
    public q11[] f31104g;
    public q11[] h;
    public boolean f31105i;
    public q11 f31106j;
    public final RectF f31107k = new RectF();
    public final Paint f31108l = new Paint(1);
    public final xc f31109m;

    public nz0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f31100a = i10;
        this.f31101b = v0Var;
        this.f31102c = u6Var;
        xj0 xj0Var = new xj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = xj0Var;
        xj0Var.H(false);
        this.f31109m = new xc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f31101b;
        int width = (v0Var.getWidth() - dp) / 2;
        xj0 xj0Var = this.d;
        xj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        xj0Var.draw(canvas);
        this.f31103f.c((v0Var.getWidth() - this.f31103f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f31103f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f31104g.length; i11++) {
            i10 = (int) (Math.max(this.f31104g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f31104g.length) {
            float max = Math.max(this.f31104g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            q11 q11Var = this.f31104g[i12];
            q11Var.c(f10 - (q11Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            q11 q11Var2 = this.h[i12];
            q11Var2.c(f10 - (q11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f31105i) {
            canvas.save();
            float l4 = this.f31106j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f31107k;
            rectF.set((v0Var.getWidth() - l4) / 2.0f, dp3, (v0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f31109m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f31108l);
            this.f31106j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        g5.l(this.f31101b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new b3(this, 11), null, true, false, this.f31102c).f22599a.show();
    }

    public final void c(MessageObject messageObject) {
        int i10;
        String i11;
        boolean q5;
        int i12;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject.messageOwner.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        q11 q11Var = new q11(TextUtils.concat(messageObject.messageText, ":"), 13.0f, null);
        q11Var.n(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        q11Var.a();
        q11Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
        this.f31103f = q11Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        q11[] q11VarArr = new q11[i10];
        this.f31104g = q11VarArr;
        this.h = new q11[i10];
        q11VarArr[0] = new q11(LocaleController.getString(R.string.DateDay), 11.0f, null);
        this.h[0] = new q11("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
        this.f31104g[1] = new q11(LocaleController.getString(R.string.DateMonth), 11.0f, null);
        q11[] q11VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i13 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December};
        if (i13 >= 0 && i13 < 12) {
            i11 = LocaleController.getString(iArr[i13]);
        } else {
            i11 = ic.a.i(i13, "");
        }
        sb2.append(i11);
        q11VarArr2[1] = new q11(sb2.toString(), 11.0f, AndroidUtilities.bold());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f31104g[2] = new q11(LocaleController.getString(R.string.DateYear), 11.0f, null);
            this.h[2] = new q11("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
        }
        this.f31105i = !messageObject.isOutOwner();
        org.telegram.ui.ActionBar.u6 u6Var = this.f31102c;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        if (q5) {
            i12 = -1;
        } else {
            i12 = -16777216;
        }
        this.f31108l.setColor(org.telegram.ui.ActionBar.y6.o1(0.12f, i12));
        this.f31106j = new q11(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
    }
}
