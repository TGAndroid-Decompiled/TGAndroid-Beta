package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pm0 implements RequestDelegate {
    public final boolean f37375a;
    public final byte[] f37376b;
    public final TL_account.getPasswordSettings f37377c;
    public final String d;
    public final dn0 e;

    public pm0(dn0 dn0Var, boolean z4, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = dn0Var;
        this.f37375a = z4;
        this.f37376b = bArr;
        this.f37377c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        int i12;
        dn0 dn0Var = this.e;
        if (dn0Var.V == null) {
            return;
        }
        if (!this.f37375a) {
            i12 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f37376b, dn0Var.f33687b1);
        }
        AndroidUtilities.hideKeyboard(dn0Var.V[0]);
        dn0Var.f33690c1 = true;
        long j10 = dn0Var.f33688c;
        if (j10 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        dn0 dn0Var2 = new dn0(i10, j10, dn0Var.h, dn0Var.f33719r, dn0Var.d, dn0Var.e, dn0Var.f33710n, dn0Var.f33737y, dn0Var.G);
        dn0Var2.f33684a1 = dn0Var.f33684a1;
        i11 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.p2) dn0Var2).currentAccount = i11;
        dn0Var2.f33687b1 = dn0Var.f33687b1;
        dn0Var2.Z0 = dn0Var.Z0;
        dn0Var2.Y0 = dn0Var.Y0;
        dn0Var2.f33741z1 = dn0Var.f33741z1;
        e5Var = ((org.telegram.ui.ActionBar.p2) dn0Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) dn0Var).parentLayout;
            if (((ActionBarLayout) e5Var2).j()) {
                dn0Var.f33694e1 = dn0Var2;
                return;
            }
        }
        dn0Var.presentFragment(dn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        dn0 dn0Var = this.e;
        TL_account.Password password = dn0Var.G;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f37376b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f37377c, new nm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.p2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new org.telegram.messenger.zd(8, this, this.f37375a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new cg.u0(this, tLObject, this.d, this.f37375a, 20));
        } else {
            AndroidUtilities.runOnUIThread(new lh.r5(this, this.f37375a, tL_error, 27));
        }
    }
}
