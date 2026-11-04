package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class mj0 implements RequestDelegate {
    public final boolean f47685a;
    public final byte[] f47686b;
    public final TL_account.getPasswordSettings f47687c;
    public final String d;
    public final yj0 f47688e;

    public mj0(yj0 yj0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f47688e = yj0Var;
        this.f47685a = z10;
        this.f47686b = bArr;
        this.f47687c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i3;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i10;
        yj0 yj0Var = this.f47688e;
        if (yj0Var.Z == null) {
            return;
        }
        if (!this.f47685a) {
            i10 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
            org.telegram.messenger.h10 i11 = org.telegram.messenger.h10.i(i10);
            byte[] bArr = this.f47686b;
            byte[] bArr2 = this.f47688e.f52300f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.f22846k0 = bArr;
            i11.f22847l0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f47688e.Z[0]);
        yj0 yj0Var2 = this.f47688e;
        yj0Var2.f52302g1 = true;
        long j10 = yj0Var2.f52290c;
        if (j10 == 0) {
            i12 = 8;
        }
        yj0 yj0Var3 = new yj0(i12, j10, yj0Var2.h, yj0Var2.f52321r, yj0Var2.d, yj0Var2.f52295e, yj0Var2.f52312n, yj0Var2.E, yj0Var2.K);
        yj0 yj0Var4 = this.f47688e;
        yj0Var3.f52297e1 = yj0Var4.f52297e1;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.d2) yj0Var3).currentAccount = i3;
        yj0 yj0Var5 = this.f47688e;
        yj0Var3.f52300f1 = yj0Var5.f52300f1;
        yj0Var3.f52294d1 = yj0Var5.f52294d1;
        yj0Var3.f52292c1 = yj0Var5.f52292c1;
        yj0Var3.D1 = yj0Var5.D1;
        q4Var = ((org.telegram.ui.ActionBar.d2) yj0Var5).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) this.f47688e).parentLayout;
            if (((ActionBarLayout) q4Var2).i()) {
                this.f47688e.f52306i1 = yj0Var3;
                return;
            }
        }
        this.f47688e.presentFragment(yj0Var3, true);
    }

    public final void b() {
        int i3;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        yj0 yj0Var = this.f47688e;
        TL_account.Password password = yj0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.hv.d(this.f47686b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        updatepasswordsettings.new_settings = passwordinputsettings;
        passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
        tL_secureSecretSettings.secure_secret = new byte[0];
        tL_secureSecretSettings.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
        TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
        passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
        passwordinputsettings2.flags |= 4;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(this.f47687c, new kj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i3 = ((org.telegram.ui.ActionBar.d2) this.f47688e).currentAccount;
            ConnectionsManager.getInstance(i3).sendRequest(getpassword, new gi.b3(8, this, this.f47685a), 8);
        } else if (tL_error == null) {
            Utilities.f21387e.c(new rn((Object) this, tLObject, (Object) this.d, this.f47685a, 11));
        } else {
            org.telegram.messenger.g0.h3(new a60(this, this.f47685a, tL_error, 4));
        }
    }
}
