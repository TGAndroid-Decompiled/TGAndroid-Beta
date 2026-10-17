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
public final class km0 implements RequestDelegate {
    public final boolean f38577a;
    public final byte[] f38578b;
    public final TL_account.getPasswordSettings f38579c;
    public final String d;
    public final xm0 e;

    public km0(xm0 xm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = xm0Var;
        this.f38577a = z10;
        this.f38578b = bArr;
        this.f38579c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i11;
        xm0 xm0Var = this.e;
        if (xm0Var.Y == null) {
            return;
        }
        if (!this.f38577a) {
            i11 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f38578b, xm0Var.f43175e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(xm0Var.Y[0]);
        xm0Var.f43178f1 = true;
        long j10 = xm0Var.f43169c;
        if (j10 == 0) {
            i12 = 8;
        }
        xm0 xm0Var2 = new xm0(i12, j10, xm0Var.h, xm0Var.f43200r, xm0Var.d, xm0Var.e, xm0Var.f43191n, xm0Var.f43218y, xm0Var.J);
        xm0Var2.f43173d1 = xm0Var.f43173d1;
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount = i10;
        xm0Var2.f43175e1 = xm0Var.f43175e1;
        xm0Var2.f43171c1 = xm0Var.f43171c1;
        xm0Var2.f43168b1 = xm0Var.f43168b1;
        xm0Var2.C1 = xm0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.n2) xm0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) xm0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                xm0Var.f43182h1 = xm0Var2;
                return;
            }
        }
        xm0Var.presentFragment(xm0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        xm0 xm0Var = this.e;
        TL_account.Password password = xm0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f38578b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f38579c, new im0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ei.o3(9, this, this.f38577a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.y3(this, tLObject, this.d, this.f38577a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new z70(this, this.f38577a, tL_error, 4));
        }
    }
}
