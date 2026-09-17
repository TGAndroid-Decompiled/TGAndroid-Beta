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
public final class cn0 implements RequestDelegate {
    public final boolean f32840a;
    public final byte[] f32841b;
    public final TL_account.getPasswordSettings f32842c;
    public final String d;
    public final qn0 e;

    public cn0(qn0 qn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = qn0Var;
        this.f32840a = z10;
        this.f32841b = bArr;
        this.f32842c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        int i12;
        qn0 qn0Var = this.e;
        if (qn0Var.Y == null) {
            return;
        }
        if (!this.f32840a) {
            i12 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f32841b, qn0Var.f36954e1);
        }
        AndroidUtilities.hideKeyboard(qn0Var.Y[0]);
        qn0Var.f36957f1 = true;
        long j3 = qn0Var.f36948c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        qn0 qn0Var2 = new qn0(i10, j3, qn0Var.h, qn0Var.f36979r, qn0Var.d, qn0Var.e, qn0Var.f36970n, qn0Var.f36997y, qn0Var.J);
        qn0Var2.f36952d1 = qn0Var.f36952d1;
        i11 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) qn0Var2).currentAccount = i11;
        qn0Var2.f36954e1 = qn0Var.f36954e1;
        qn0Var2.f36950c1 = qn0Var.f36950c1;
        qn0Var2.f36947b1 = qn0Var.f36947b1;
        qn0Var2.C1 = qn0Var.C1;
        e5Var = ((org.telegram.ui.ActionBar.o2) qn0Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.o2) qn0Var).parentLayout;
            if (((ActionBarLayout) e5Var2).j()) {
                qn0Var.f36961h1 = qn0Var2;
                return;
            }
        }
        qn0Var.presentFragment(qn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        qn0 qn0Var = this.e;
        TL_account.Password password = qn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f32841b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f32842c, new an0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.o2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.u3(9, this, this.f32840a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.f32840a, 24));
        } else {
            AndroidUtilities.runOnUIThread(new dm0(this, this.f32840a, tL_error, 1));
        }
    }
}
