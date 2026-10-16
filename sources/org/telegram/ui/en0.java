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
public final class en0 implements RequestDelegate {
    public final boolean f35338a;
    public final byte[] f35339b;
    public final TL_account.getPasswordSettings f35340c;
    public final String d;
    public final sn0 e;

    public en0(sn0 sn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = sn0Var;
        this.f35338a = z10;
        this.f35339b = bArr;
        this.f35340c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        sn0 sn0Var = this.e;
        if (sn0Var.Y == null) {
            return;
        }
        if (!this.f35338a) {
            i11 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f35339b, sn0Var.f39866e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(sn0Var.Y[0]);
        sn0Var.f39869f1 = true;
        long j10 = sn0Var.f39860c;
        if (j10 == 0) {
            i12 = 8;
        }
        sn0 sn0Var2 = new sn0(i12, j10, sn0Var.h, sn0Var.f39891r, sn0Var.d, sn0Var.e, sn0Var.f39882n, sn0Var.f39909y, sn0Var.J);
        sn0Var2.f39864d1 = sn0Var.f39864d1;
        i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) sn0Var2).currentAccount = i10;
        sn0Var2.f39866e1 = sn0Var.f39866e1;
        sn0Var2.f39862c1 = sn0Var.f39862c1;
        sn0Var2.f39859b1 = sn0Var.f39859b1;
        sn0Var2.C1 = sn0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) sn0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) sn0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                sn0Var.f39873h1 = sn0Var2;
                return;
            }
        }
        sn0Var.presentFragment(sn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        sn0 sn0Var = this.e;
        TL_account.Password password = sn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f35339b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f35340c, new cn0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.m2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new di.s3(9, this, this.f35338a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new bi.h4(this, tLObject, this.d, this.f35338a, 23));
        } else {
            AndroidUtilities.runOnUIThread(new gm0(this, this.f35338a, tL_error, 1));
        }
    }
}
