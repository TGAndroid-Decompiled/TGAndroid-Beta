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
public final class hm0 implements RequestDelegate {
    public final boolean f38961a;
    public final byte[] f38962b;
    public final TL_account.getPasswordSettings f38963c;
    public final String d;
    public final vm0 f38964e;

    public hm0(vm0 vm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f38964e = vm0Var;
        this.f38961a = z10;
        this.f38962b = bArr;
        this.f38963c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i12;
        vm0 vm0Var = this.f38964e;
        if (vm0Var.U == null) {
            return;
        }
        if (!this.f38961a) {
            i12 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f38962b, vm0Var.f43624a1);
        }
        AndroidUtilities.hideKeyboard(vm0Var.U[0]);
        vm0Var.f43627b1 = true;
        long j10 = vm0Var.f43628c;
        if (j10 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        vm0 vm0Var2 = new vm0(i10, j10, vm0Var.h, vm0Var.f43660r, vm0Var.d, vm0Var.f43633e, vm0Var.f43651n, vm0Var.f43678y, vm0Var.F);
        vm0Var2.Z0 = vm0Var.Z0;
        i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) vm0Var2).currentAccount = i11;
        vm0Var2.f43624a1 = vm0Var.f43624a1;
        vm0Var2.Y0 = vm0Var.Y0;
        vm0Var2.X0 = vm0Var.X0;
        vm0Var2.f43680y1 = vm0Var.f43680y1;
        b5Var = ((org.telegram.ui.ActionBar.o2) vm0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) vm0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                vm0Var.f43632d1 = vm0Var2;
                return;
            }
        }
        vm0Var.presentFragment(vm0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        vm0 vm0Var = this.f38964e;
        TL_account.Password password = vm0Var.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f38962b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f38963c, new fm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.o2) this.f38964e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new nh.l3(9, this, this.f38961a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ag.w0(this, tLObject, this.d, this.f38961a, 22));
        } else {
            AndroidUtilities.runOnUIThread(new jh.r5(this, this.f38961a, tL_error, 29));
        }
    }
}
