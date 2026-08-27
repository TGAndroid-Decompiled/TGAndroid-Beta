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

    public final boolean f39807a;

    public final byte[] f39808b;

    public final TL_account.getPasswordSettings f39809c;
    public final String d;

    public final xm0 f39810e;

    public km0(xm0 xm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f39810e = xm0Var;
        this.f39807a = z10;
        this.f39808b = bArr;
        this.f39809c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        xm0 xm0Var = this.f39810e;
        if (xm0Var.U == null) {
            return;
        }
        if (!this.f39807a) {
            UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).savePassword(this.f39808b, xm0Var.f44481a1);
        }
        AndroidUtilities.hideKeyboard(xm0Var.U[0]);
        xm0Var.f44484b1 = true;
        long j10 = xm0Var.f44485c;
        xm0 xm0Var2 = new xm0(j10 == 0 ? 8 : 0, j10, xm0Var.h, xm0Var.f44517r, xm0Var.d, xm0Var.f44490e, xm0Var.f44508n, xm0Var.f44535y, xm0Var.F);
        xm0Var2.Z0 = xm0Var.Z0;
        ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        xm0Var2.f44481a1 = xm0Var.f44481a1;
        xm0Var2.Y0 = xm0Var.Y0;
        xm0Var2.X0 = xm0Var.X0;
        xm0Var2.f44537y1 = xm0Var.f44537y1;
        if (((org.telegram.ui.ActionBar.n2) xm0Var).parentLayout == null || !((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) xm0Var).parentLayout).j()) {
            xm0Var.presentFragment(xm0Var2, true);
        } else {
            xm0Var.f44489d1 = xm0Var2;
        }
    }

    public final void b() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        xm0 xm0Var = this.f39810e;
        TL_account.Password password = xm0Var.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f39808b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(this.f39809c, new im0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) this.f39810e).currentAccount).sendRequest(new TL_account.getPassword(), new lh.n3(9, this, this.f39807a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new cg.c(this, tLObject, this.d, this.f39807a, 21));
        } else {
            AndroidUtilities.runOnUIThread(new hh.t5(this, this.f39807a, tL_error, 29));
        }
    }
}
