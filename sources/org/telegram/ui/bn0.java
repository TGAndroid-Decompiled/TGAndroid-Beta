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
    public final boolean f32415a;
    public final byte[] f32416b;
    public final TL_account.getPasswordSettings f32417c;
    public final String d;
    public final pn0 e;

    public bn0(pn0 pn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = pn0Var;
        this.f32415a = z10;
        this.f32416b = bArr;
        this.f32417c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i12;
        pn0 pn0Var = this.e;
        if (pn0Var.Y == null) {
            return;
        }
        if (!this.f32415a) {
            i12 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f32416b, pn0Var.f36533e1);
        }
        AndroidUtilities.hideKeyboard(pn0Var.Y[0]);
        pn0Var.f36536f1 = true;
        long j3 = pn0Var.f36527c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        pn0 pn0Var2 = new pn0(i10, j3, pn0Var.h, pn0Var.f36558r, pn0Var.d, pn0Var.e, pn0Var.f36549n, pn0Var.f36576y, pn0Var.J);
        pn0Var2.f36531d1 = pn0Var.f36531d1;
        i11 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) pn0Var2).currentAccount = i11;
        pn0Var2.f36533e1 = pn0Var.f36533e1;
        pn0Var2.f36529c1 = pn0Var.f36529c1;
        pn0Var2.f36526b1 = pn0Var.f36526b1;
        pn0Var2.C1 = pn0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.n2) pn0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) pn0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                pn0Var.f36540h1 = pn0Var2;
                return;
            }
        }
        pn0Var.presentFragment(pn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        pn0 pn0Var = this.e;
        TL_account.Password password = pn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f32416b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        ConnectionsManager.getInstance(i10).sendRequest(this.f32417c, new zm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.u3(9, this, this.f32415a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.f32415a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new ja0(this, this.f32415a, tL_error, 2));
        }
    }
}
