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
public final class lm0 implements RequestDelegate {
    public final boolean f39316a;
    public final byte[] f39317b;
    public final TL_account.getPasswordSettings f39318c;
    public final String d;
    public final zm0 e;

    public lm0(zm0 zm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = zm0Var;
        this.f39316a = z10;
        this.f39317b = bArr;
        this.f39318c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        int i11;
        zm0 zm0Var = this.e;
        if (zm0Var.Y == null) {
            return;
        }
        if (!this.f39316a) {
            i11 = ((org.telegram.ui.ActionBar.o2) zm0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f39317b, zm0Var.f44136e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(zm0Var.Y[0]);
        zm0Var.f44139f1 = true;
        long j10 = zm0Var.f44130c;
        if (j10 == 0) {
            i12 = 8;
        }
        zm0 zm0Var2 = new zm0(i12, j10, zm0Var.h, zm0Var.f44161r, zm0Var.d, zm0Var.e, zm0Var.f44152n, zm0Var.f44179y, zm0Var.J);
        zm0Var2.f44134d1 = zm0Var.f44134d1;
        i10 = ((org.telegram.ui.ActionBar.o2) zm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) zm0Var2).currentAccount = i10;
        zm0Var2.f44136e1 = zm0Var.f44136e1;
        zm0Var2.f44132c1 = zm0Var.f44132c1;
        zm0Var2.f44129b1 = zm0Var.f44129b1;
        zm0Var2.C1 = zm0Var.C1;
        h5Var = ((org.telegram.ui.ActionBar.o2) zm0Var).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) zm0Var).parentLayout;
            if (((ActionBarLayout) h5Var2).i()) {
                zm0Var.f44143h1 = zm0Var2;
                return;
            }
        }
        zm0Var.presentFragment(zm0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        zm0 zm0Var = this.e;
        TL_account.Password password = zm0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f39317b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.o2) zm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f39318c, new jm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.o2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ei.o3(9, this, this.f39316a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.x9((Object) this, tLObject, (Object) this.d, this.f39316a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new v90(this, this.f39316a, tL_error, 3));
        }
    }
}
