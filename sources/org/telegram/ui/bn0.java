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
    public final boolean f34846a;
    public final byte[] f34847b;
    public final TL_account.getPasswordSettings f34848c;
    public final String d;
    public final pn0 f34849e;

    public bn0(pn0 pn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f34849e = pn0Var;
        this.f34846a = z10;
        this.f34847b = bArr;
        this.f34848c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i12;
        pn0 pn0Var = this.f34849e;
        if (pn0Var.Y == null) {
            return;
        }
        if (!this.f34846a) {
            i12 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f34847b, pn0Var.f39561e1);
        }
        AndroidUtilities.hideKeyboard(pn0Var.Y[0]);
        pn0Var.f39564f1 = true;
        long j3 = pn0Var.f39554c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        pn0 pn0Var2 = new pn0(i10, j3, pn0Var.h, pn0Var.f39586r, pn0Var.d, pn0Var.f39559e, pn0Var.f39577n, pn0Var.f39604y, pn0Var.J);
        pn0Var2.f39558d1 = pn0Var.f39558d1;
        i11 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) pn0Var2).currentAccount = i11;
        pn0Var2.f39561e1 = pn0Var.f39561e1;
        pn0Var2.f39556c1 = pn0Var.f39556c1;
        pn0Var2.f39553b1 = pn0Var.f39553b1;
        pn0Var2.C1 = pn0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.n2) pn0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) pn0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                pn0Var.f39568h1 = pn0Var2;
                return;
            }
        }
        pn0Var.presentFragment(pn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        pn0 pn0Var = this.f34849e;
        TL_account.Password password = pn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f34847b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f34848c, new zm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.f34849e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new di.u3(9, this, this.f34846a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new bi.e4(this, tLObject, this.d, this.f34846a, 24));
        } else {
            AndroidUtilities.runOnUIThread(new dm0(this, this.f34846a, tL_error, 1));
        }
    }
}
