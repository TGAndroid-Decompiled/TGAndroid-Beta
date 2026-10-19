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
public final class im0 implements RequestDelegate {
    public final boolean f38021a;
    public final byte[] f38022b;
    public final TL_account.getPasswordSettings f38023c;
    public final String d;
    public final vm0 e;

    public im0(vm0 vm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = vm0Var;
        this.f38021a = z10;
        this.f38022b = bArr;
        this.f38023c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i11;
        vm0 vm0Var = this.e;
        if (vm0Var.Y == null) {
            return;
        }
        if (!this.f38021a) {
            i11 = ((org.telegram.ui.ActionBar.n2) vm0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f38022b, vm0Var.f42287e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(vm0Var.Y[0]);
        vm0Var.f42290f1 = true;
        long j10 = vm0Var.f42281c;
        if (j10 == 0) {
            i12 = 8;
        }
        vm0 vm0Var2 = new vm0(i12, j10, vm0Var.h, vm0Var.f42312r, vm0Var.d, vm0Var.e, vm0Var.f42303n, vm0Var.f42330y, vm0Var.J);
        vm0Var2.f42285d1 = vm0Var.f42285d1;
        i10 = ((org.telegram.ui.ActionBar.n2) vm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) vm0Var2).currentAccount = i10;
        vm0Var2.f42287e1 = vm0Var.f42287e1;
        vm0Var2.f42283c1 = vm0Var.f42283c1;
        vm0Var2.f42280b1 = vm0Var.f42280b1;
        vm0Var2.C1 = vm0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.n2) vm0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) vm0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                vm0Var.f42294h1 = vm0Var2;
                return;
            }
        }
        vm0Var.presentFragment(vm0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        vm0 vm0Var = this.e;
        TL_account.Password password = vm0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f38022b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.n2) vm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f38023c, new gm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ei.o3(9, this, this.f38021a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.x9((Object) this, tLObject, (Object) this.d, this.f38021a, 24));
        } else {
            AndroidUtilities.runOnUIThread(new x70(this, this.f38021a, tL_error, 4));
        }
    }
}
