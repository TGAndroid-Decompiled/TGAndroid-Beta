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
public final class mm0 implements RequestDelegate {
    public final boolean f39627a;
    public final byte[] f39628b;
    public final TL_account.getPasswordSettings f39629c;
    public final String d;
    public final an0 e;

    public mm0(an0 an0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = an0Var;
        this.f39627a = z10;
        this.f39628b = bArr;
        this.f39629c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        int i11;
        an0 an0Var = this.e;
        if (an0Var.Y == null) {
            return;
        }
        if (!this.f39627a) {
            i11 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f39628b, an0Var.f35713e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(an0Var.Y[0]);
        an0Var.f35716f1 = true;
        long j10 = an0Var.f35707c;
        if (j10 == 0) {
            i12 = 8;
        }
        an0 an0Var2 = new an0(i12, j10, an0Var.h, an0Var.f35738r, an0Var.d, an0Var.e, an0Var.f35729n, an0Var.f35756y, an0Var.J);
        an0Var2.f35711d1 = an0Var.f35711d1;
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) an0Var2).currentAccount = i10;
        an0Var2.f35713e1 = an0Var.f35713e1;
        an0Var2.f35709c1 = an0Var.f35709c1;
        an0Var2.f35706b1 = an0Var.f35706b1;
        an0Var2.C1 = an0Var.C1;
        h5Var = ((org.telegram.ui.ActionBar.o2) an0Var).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) an0Var).parentLayout;
            if (((ActionBarLayout) h5Var2).i()) {
                an0Var.f35720h1 = an0Var2;
                return;
            }
        }
        an0Var.presentFragment(an0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        an0 an0Var = this.e;
        TL_account.Password password = an0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f39628b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f39629c, new km0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.o2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ei.o3(9, this, this.f39627a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.x9((Object) this, tLObject, (Object) this.d, this.f39627a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new v90(this, this.f39627a, tL_error, 3));
        }
    }
}
