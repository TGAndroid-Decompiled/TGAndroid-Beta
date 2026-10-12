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
public final class fn0 implements RequestDelegate {
    public final boolean f35867a;
    public final byte[] f35868b;
    public final TL_account.getPasswordSettings f35869c;
    public final String d;
    public final un0 e;

    public fn0(un0 un0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = un0Var;
        this.f35867a = z10;
        this.f35868b = bArr;
        this.f35869c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        un0 un0Var = this.e;
        if (un0Var.Y == null) {
            return;
        }
        if (!this.f35867a) {
            i11 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f35868b, un0Var.f40731e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(un0Var.Y[0]);
        un0Var.f40734f1 = true;
        long j10 = un0Var.f40725c;
        if (j10 == 0) {
            i12 = 8;
        }
        un0 un0Var2 = new un0(i12, j10, un0Var.h, un0Var.f40756r, un0Var.d, un0Var.e, un0Var.f40747n, un0Var.f40774y, un0Var.J);
        un0Var2.f40729d1 = un0Var.f40729d1;
        i10 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) un0Var2).currentAccount = i10;
        un0Var2.f40731e1 = un0Var.f40731e1;
        un0Var2.f40727c1 = un0Var.f40727c1;
        un0Var2.f40724b1 = un0Var.f40724b1;
        un0Var2.C1 = un0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) un0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) un0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                un0Var.f40738h1 = un0Var2;
                return;
            }
        }
        un0Var.presentFragment(un0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        un0 un0Var = this.e;
        TL_account.Password password = un0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f35868b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f35869c, new dn0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.m2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new di.s3(9, this, this.f35867a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new bi.h4(this, tLObject, this.d, this.f35867a, 24));
        } else {
            AndroidUtilities.runOnUIThread(new ma0(this, this.f35867a, tL_error, 3));
        }
    }
}
