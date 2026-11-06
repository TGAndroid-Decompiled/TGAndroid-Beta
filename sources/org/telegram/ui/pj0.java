package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pj0 implements RequestDelegate {
    public final boolean f48842a;
    public final byte[] f48843b;
    public final TL_account.getPasswordSettings f48844c;
    public final String d;
    public final bk0 f48845e;

    public pj0(bk0 bk0Var, boolean z9, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f48845e = bk0Var;
        this.f48842a = z9;
        this.f48843b = bArr;
        this.f48844c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i10;
        bk0 bk0Var = this.f48845e;
        if (bk0Var.Y == null) {
            return;
        }
        if (!this.f48842a) {
            i10 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
            org.telegram.messenger.p10 i11 = org.telegram.messenger.p10.i(i10);
            byte[] bArr = this.f48843b;
            byte[] bArr2 = this.f48845e.f44373e1;
            i11.f24477l0 = SystemClock.elapsedRealtime();
            i11.f24475j0 = bArr;
            i11.f24476k0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f48845e.Y[0]);
        bk0 bk0Var2 = this.f48845e;
        bk0Var2.f44376f1 = true;
        long j3 = bk0Var2.f44366c;
        if (j3 == 0) {
            i12 = 8;
        }
        bk0 bk0Var3 = new bk0(i12, j3, bk0Var2.h, bk0Var2.f44397r, bk0Var2.d, bk0Var2.f44371e, bk0Var2.f44389n, bk0Var2.D, bk0Var2.J);
        bk0 bk0Var4 = this.f48845e;
        bk0Var3.f44370d1 = bk0Var4.f44370d1;
        i7 = ((org.telegram.ui.ActionBar.f2) bk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.f2) bk0Var3).currentAccount = i7;
        bk0 bk0Var5 = this.f48845e;
        bk0Var3.f44373e1 = bk0Var5.f44373e1;
        bk0Var3.f44368c1 = bk0Var5.f44368c1;
        bk0Var3.f44365b1 = bk0Var5.f44365b1;
        bk0Var3.C1 = bk0Var5.C1;
        q4Var = ((org.telegram.ui.ActionBar.f2) bk0Var5).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) this.f48845e).parentLayout;
            if (((ActionBarLayout) q4Var2).i()) {
                this.f48845e.f44380h1 = bk0Var3;
                return;
            }
        }
        this.f48845e.presentFragment(bk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        bk0 bk0Var = this.f48845e;
        TL_account.Password password = bk0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.pv.d(this.f48843b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f48844c, new nj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.f2) this.f48845e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new fi.d3(8, this, this.f48842a), 8);
        } else if (tL_error == null) {
            Utilities.f21333e.c(new vn((Object) this, tLObject, (Object) this.d, this.f48842a, 11));
        } else {
            org.telegram.messenger.g0.h3(new g60(this, this.f48842a, tL_error, 4));
        }
    }
}
