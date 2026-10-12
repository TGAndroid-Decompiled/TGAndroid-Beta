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
public final class bn0 implements RequestDelegate {
    public final boolean f36210a;
    public final byte[] f36211b;
    public final TL_account.getPasswordSettings f36212c;
    public final String d;
    public final pn0 f36213e;

    public bn0(pn0 pn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f36213e = pn0Var;
        this.f36210a = z10;
        this.f36211b = bArr;
        this.f36212c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        pn0 pn0Var = this.f36213e;
        if (pn0Var.Y == null) {
            return;
        }
        if (!this.f36210a) {
            i11 = ((org.telegram.ui.ActionBar.m2) pn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f36211b, pn0Var.f41012e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(pn0Var.Y[0]);
        pn0Var.f41015f1 = true;
        long j3 = pn0Var.f41005c;
        if (j3 == 0) {
            i12 = 8;
        }
        pn0 pn0Var2 = new pn0(i12, j3, pn0Var.h, pn0Var.f41037r, pn0Var.d, pn0Var.f41010e, pn0Var.f41028n, pn0Var.f41055y, pn0Var.J);
        pn0Var2.f41009d1 = pn0Var.f41009d1;
        i10 = ((org.telegram.ui.ActionBar.m2) pn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) pn0Var2).currentAccount = i10;
        pn0Var2.f41012e1 = pn0Var.f41012e1;
        pn0Var2.f41007c1 = pn0Var.f41007c1;
        pn0Var2.f41004b1 = pn0Var.f41004b1;
        pn0Var2.C1 = pn0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) pn0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) pn0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                pn0Var.f41019h1 = pn0Var2;
                return;
            }
        }
        pn0Var.presentFragment(pn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        pn0 pn0Var = this.f36213e;
        TL_account.Password password = pn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f36211b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.m2) pn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f36212c, new zm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.m2) this.f36213e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.s3(9, this, this.f36210a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.t4(this, tLObject, this.d, this.f36210a, 24));
        } else {
            AndroidUtilities.runOnUIThread(new dm0(this, this.f36210a, tL_error, 1));
        }
    }
}
