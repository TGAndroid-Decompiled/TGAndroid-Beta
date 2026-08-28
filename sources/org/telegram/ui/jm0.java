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
public final class jm0 implements RequestDelegate {
    public final boolean f39528a;
    public final byte[] f39529b;
    public final TL_account.getPasswordSettings f39530c;
    public final String d;
    public final wm0 f39531e;

    public jm0(wm0 wm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f39531e = wm0Var;
        this.f39528a = z10;
        this.f39529b = bArr;
        this.f39530c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i9;
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        wm0 wm0Var = this.f39531e;
        if (wm0Var.U == null) {
            return;
        }
        if (!this.f39528a) {
            i11 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f39529b, wm0Var.f44150a1);
        }
        AndroidUtilities.hideKeyboard(wm0Var.U[0]);
        wm0Var.f44153b1 = true;
        long j10 = wm0Var.f44154c;
        if (j10 == 0) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        wm0 wm0Var2 = new wm0(i9, j10, wm0Var.h, wm0Var.f44186r, wm0Var.d, wm0Var.f44159e, wm0Var.f44177n, wm0Var.f44204y, wm0Var.F);
        wm0Var2.Z0 = wm0Var.Z0;
        i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) wm0Var2).currentAccount = i10;
        wm0Var2.f44150a1 = wm0Var.f44150a1;
        wm0Var2.Y0 = wm0Var.Y0;
        wm0Var2.X0 = wm0Var.X0;
        wm0Var2.f44206y1 = wm0Var.f44206y1;
        b5Var = ((org.telegram.ui.ActionBar.o2) wm0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) wm0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                wm0Var.f44158d1 = wm0Var2;
                return;
            }
        }
        wm0Var.presentFragment(wm0Var2, true);
    }

    public final void b() {
        int i9;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        wm0 wm0Var = this.f39531e;
        TL_account.Password password = wm0Var.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f39529b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(this.f39530c, new hm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i9 = ((org.telegram.ui.ActionBar.o2) this.f39531e).currentAccount;
            ConnectionsManager.getInstance(i9).sendRequest(getpassword, new kh.o3(9, this, this.f39528a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new bg.d(this, tLObject, this.d, this.f39528a, 22));
        } else {
            AndroidUtilities.runOnUIThread(new gh.u5(this, this.f39528a, tL_error, 29));
        }
    }
}
