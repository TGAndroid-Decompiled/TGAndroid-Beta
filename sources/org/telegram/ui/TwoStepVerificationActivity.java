package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public ScrollView D;
    public org.telegram.ui.Components.f10 E;
    public org.telegram.ui.Components.w21 F;
    public boolean G;
    public boolean H;
    public TL_account.Password I;
    public boolean J;
    public byte[] K;
    public long L;
    public byte[] M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public final wb1 V;
    public boolean W;
    public int X;
    public bc1 Y;
    public int Z;
    public dc1 f34133a;
    public String f34134a0;
    public org.telegram.ui.Components.uk0 f34135b;
    public ec1 f34136b0;
    public org.telegram.ui.Components.fi0 f34137c;
    public final wb1 f34138c0;
    private int changePasswordRow;
    public TextView d;
    public TextView e;
    public TextView f34139f;
    public TextView h;
    public org.telegram.ui.ActionBar.u5 f34140n;
    public TextView f34141r;
    public EditTextBoldCursor f34142s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.ec0 f34143w;
    public org.telegram.ui.ActionBar.x1 f34144x;
    public org.telegram.ui.Components.xy f34145y;

    public TwoStepVerificationActivity() {
        super(null);
        this.J = true;
        this.K = new byte[0];
        this.V = new wb1(this, 2);
        this.X = -1;
        this.f34138c0 = new wb1(this, 3);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.f14766q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.f14766q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new vb1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.f34143w, twoStepVerificationActivity.f34142s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(2131689472, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(2131689472, null), tL_error.text);
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.f34136b0 == null || !z10) {
            twoStepVerificationActivity.t0();
        }
        if (z10) {
            twoStepVerificationActivity.K = bArr;
            twoStepVerificationActivity.J = true;
            if (twoStepVerificationActivity.f34136b0 != null) {
                org.telegram.messenger.i0.v1(twoStepVerificationActivity.f34142s);
                twoStepVerificationActivity.f34136b0.m(twoStepVerificationActivity.q0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.I.email_unconfirmed_pattern)) {
                rc1 rc1Var = new rc1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.I);
                rc1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
                twoStepVerificationActivity.presentFragment(rc1Var, true);
                return;
            } else {
                org.telegram.messenger.i0.v1(twoStepVerificationActivity.f34142s);
                TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
                twoStepVerificationActivity2.J = true;
                twoStepVerificationActivity2.K = twoStepVerificationActivity.K;
                twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
                twoStepVerificationActivity2.M = twoStepVerificationActivity.M;
                twoStepVerificationActivity2.L = twoStepVerificationActivity.L;
                twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
                return;
            }
        }
        org.telegram.ui.Components.s4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.I.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.bw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        tp0 tp0Var = new tp0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.bw.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                tp0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, tp0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        tp0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new vb1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.K = new byte[0];
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.f14773r0, new Object[0]);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.f14766q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
        } else if (tL_error != null) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                }
                twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(2131689472, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                return;
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.G = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.s4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.K;
                if ((bArr != null && bArr.length > 0) || !twoStepVerificationActivity.I.has_password) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                twoStepVerificationActivity.J = z12;
            }
            r0(twoStepVerificationActivity.I);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.f14766q0, twoStepVerificationActivity.I);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.E0();
    }

    public static void g0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.f14766q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 != twoStepVerificationActivity.O && i10 != twoStepVerificationActivity.changePasswordRow) {
            if (i10 != twoStepVerificationActivity.Q && i10 != twoStepVerificationActivity.R) {
                if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131743965, null);
                    if (twoStepVerificationActivity.I.has_secure_values) {
                        L0 = a1.g.m(null, 2131743966, sc.e.i(L0, "\n\n"));
                    }
                    String L02 = org.telegram.messenger.dd.L0(2131743964, null);
                    String L03 = org.telegram.messenger.dd.L0(2131751436, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.T = L0;
                    x1Var.R = L02;
                    alertDialog$Builder.k(L03, new ub1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    twoStepVerificationActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            rc1 rc1Var = new rc1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.I);
            rc1Var.J.add(twoStepVerificationActivity);
            rc1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(rc1Var);
            return;
        }
        rc1 rc1Var2 = new rc1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.I);
        rc1Var2.J.add(twoStepVerificationActivity);
        rc1Var2.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
        twoStepVerificationActivity.presentFragment(rc1Var2);
    }

    public static void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.I.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new vb1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new vb1(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] s10;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.M = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                s10 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s10 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.i0.g3(new zj0(twoStepVerificationActivity, z10, bArr2, 8));
            }
            twoStepVerificationActivity.L = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s10, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s10, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.M;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!jl0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.q0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ag.c3(4));
                twoStepVerificationActivity.M = null;
                twoStepVerificationActivity.L = 0L;
            }
        } else {
            twoStepVerificationActivity.M = null;
            twoStepVerificationActivity.L = 0L;
        }
        z10 = true;
        org.telegram.messenger.i0.g3(new zj0(twoStepVerificationActivity, z10, bArr2, 8));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        twoStepVerificationActivity.t0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.I;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            cc1 cc1Var = new cc1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            cc1Var.J.add(twoStepVerificationActivity);
            cc1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
            twoStepVerificationActivity.presentFragment(cc1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(2131689472, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(2131689472, null), tL_error.text);
        }
    }

    public static boolean n0(TL_account.Password password, boolean z10) {
        if (z10) {
            if (!(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown)) {
                return true;
            }
            return false;
        } else if (!(password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) && !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) && !(password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) {
            return true;
        } else {
            return false;
        }
    }

    public static void r0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.f14520b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.f14520b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        boolean z10;
        this.I = password;
        this.K = bArr;
        this.M = bArr2;
        this.L = j10;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = z10;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131742974, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.G(this.X, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131743958, null), null);
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131750595, null), new ub1(this, 0));
        org.telegram.ui.ActionBar.a7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.t6.f21171q7, null);
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.D0():void");
    }

    public final void E0() {
        TL_account.Password password;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O);
        sb2.append(this.P);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.Q);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        this.T = 0;
        this.O = -1;
        this.P = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        if (!this.G && (password = this.I) != null && this.J) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.T = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.T = 3;
                    this.R = 2;
                } else {
                    this.T = 3;
                    this.Q = 2;
                }
                int i10 = this.T;
                this.T = i10 + 1;
                this.S = i10;
            } else {
                this.O = 0;
                this.T = 2;
                this.P = 1;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.O);
        sb3.append(this.P);
        sb3.append(this.changePasswordRow);
        sb3.append(this.turnPasswordOffRow);
        sb3.append(this.Q);
        sb3.append(this.R);
        sb3.append(this.S);
        sb3.append(this.T);
        if (this.f34133a != null && !sb2.toString().equals(sb3.toString())) {
            this.f34133a.f();
        }
        if (this.fragmentView != null) {
            if (!this.G && !this.J) {
                org.telegram.ui.Components.uk0 uk0Var = this.f34135b;
                if (uk0Var != null) {
                    uk0Var.setEmptyView(null);
                    this.f34135b.setVisibility(4);
                    this.D.setVisibility(0);
                    this.f34145y.setVisibility(4);
                }
                if (this.f34142s != null) {
                    this.E.e(true, false);
                    this.f34142s.setVisibility(0);
                    View view = this.fragmentView;
                    int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
                    org.telegram.ui.ActionBar.a7.i(i11, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i11));
                    this.d.setVisibility(0);
                    this.f34140n.setVisibility(0);
                    D0();
                    this.f34139f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.I.hint)) {
                        this.f34142s.setHint(this.I.hint);
                    } else {
                        this.f34142s.setHint((CharSequence) null);
                    }
                    org.telegram.messenger.i0.h3(new wb1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.uk0 uk0Var2 = this.f34135b;
            if (uk0Var2 != null) {
                uk0Var2.setVisibility(0);
                this.D.setVisibility(4);
                this.f34135b.setEmptyView(this.f34145y);
            }
            if (this.f34142s != null) {
                this.E.e(false, false);
                this.f34142s.setVisibility(4);
                this.d.setVisibility(4);
                this.f34139f.setVisibility(8);
                this.f34140n.setVisibility(4);
                D0();
            }
            View view2 = this.fragmentView;
            int i12 = org.telegram.ui.ActionBar.t6.f20873a7;
            org.telegram.ui.ActionBar.a7.i(i12, view2, null);
            this.fragmentView.setTag(Integer.valueOf(i12));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Object obj;
        if (i10 == org.telegram.messenger.at.f14761p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.K = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.X >= 0) {
            Bundle g10 = a1.g.g("afterSignup", true);
            of0 of0Var = new of0();
            of0Var.r0(g10);
            presentFragment(of0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34145y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34142s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34142s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752575, null), new ub1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752576, null), null);
        String L0 = org.telegram.messenger.dd.L0(2131752571, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131752577, null);
        showDialog(x1Var);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.X >= 0) {
            if (z10) {
                C0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.fi0 fi0Var = this.f34137c;
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                fi0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        fi0Var.setVisibility(i10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14761p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.r(this.f34138c0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14761p0);
        this.H = true;
        org.telegram.ui.ActionBar.x1 x1Var = this.f34144x;
        if (x1Var != null) {
            try {
                x1Var.dismiss();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.f34144x = null;
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.xy xyVar = this.f34145y;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
            }
            org.telegram.ui.Components.w21 w21Var = this.F;
            if (w21Var != null) {
                w21Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
            }
            bc1 bc1Var = this.Y;
            if (bc1Var != null) {
                bc1Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21077l6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            if (this.W) {
                w0();
                this.W = false;
            } else if (this.N) {
                z0();
                this.N = false;
            }
        }
    }

    public final void p0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.K;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        org.telegram.messenger.e20.i(this.currentAccount).u();
        this.M = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new y01(17, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return org.telegram.messenger.bw.d(this.K, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void s0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.G = true;
            dc1 dc1Var = this.f34133a;
            if (dc1Var != null) {
                dc1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new xb1(this, z11, z10, runnable), 10);
    }

    public final void t0() {
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.f34144x;
        if (x1Var == null) {
            return;
        }
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f34144x = null;
    }

    public final void u0(boolean z10) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f34144x == null) {
            if (!this.J) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.f34144x = x1Var;
            x1Var.f21489i0 = false;
            if (z10) {
                x1Var.r(300L);
            } else {
                x1Var.show();
            }
        }
    }

    public final void v0(org.telegram.ui.Components.ec0 ec0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            editTextBoldCursor.setText("");
        }
        ec0Var.a(1.0f);
        org.telegram.messenger.i0.F3(5.0f, ec0Var, new wb1(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.I;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new vb1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.I.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.I.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746135, null), new ub1(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    String L0 = org.telegram.messenger.dd.L0(2131746110, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.dd.L0(2131746083, null);
                    showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                        return;
                    }
                    return;
                }
                o0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746135, null), new ub1(this, 4));
            alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            String L02 = org.telegram.messenger.dd.L0(2131746110, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
            x1Var2.R = L02;
            x1Var2.T = org.telegram.messenger.dd.L0(2131746089, null);
            showDialog(x1Var2);
        }
    }

    public final void x0(Runnable runnable) {
        boolean z10;
        byte[] bArr;
        TL_account.Password password = this.I;
        if (password != null && password.current_algo != null && (bArr = this.K) != null && bArr.length > 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (password != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s0(runnable, true, z10);
    }

    public final void y0() {
        if (!this.J) {
            String obj = this.f34142s.getText().toString();
            if (obj.length() == 0) {
                v0(this.f34143w, this.f34142s, false);
                return;
            }
            byte[] h12 = org.telegram.messenger.i0.h1(obj);
            u0(false);
            Utilities.e.c(new y01(16, this, h12));
        }
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new vb1(this, 0));
    }
}
