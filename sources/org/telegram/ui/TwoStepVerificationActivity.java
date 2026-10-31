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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public ScrollView D;
    public org.telegram.ui.Components.f10 E;
    public org.telegram.ui.Components.v21 F;
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
    public final yb1 V;
    public boolean W;
    public int X;
    public dc1 Y;
    public int Z;
    public fc1 f34126a;
    public String f34127a0;
    public org.telegram.ui.Components.tk0 f34128b;
    public gc1 f34129b0;
    public org.telegram.ui.Components.ei0 f34130c;
    public final yb1 f34131c0;
    private int changePasswordRow;
    public TextView d;
    public TextView e;
    public TextView f34132f;
    public TextView h;
    public org.telegram.ui.ActionBar.u5 f34133n;
    public TextView f34134r;
    public EditTextBoldCursor f34135s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.ec0 f34136w;
    public org.telegram.ui.ActionBar.x1 f34137x;
    public org.telegram.ui.Components.xy f34138y;

    public TwoStepVerificationActivity() {
        super(null);
        this.J = true;
        this.K = new byte[0];
        this.V = new yb1(this, 2);
        this.X = -1;
        this.f34131c0 = new yb1(this, 3);
    }

    public static void Y(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            q0(password);
            org.telegram.messenger.zs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.zs.f19670q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.o0();
        }
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            q0(password);
            org.telegram.messenger.zs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.zs.f19670q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.x0();
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new xb1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.s0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.u0(twoStepVerificationActivity.f34136w, twoStepVerificationActivity.f34135s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.A0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            twoStepVerificationActivity.A0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.f34129b0 == null || !z10) {
            twoStepVerificationActivity.s0();
        }
        if (z10) {
            twoStepVerificationActivity.K = bArr;
            twoStepVerificationActivity.J = true;
            if (twoStepVerificationActivity.f34129b0 != null) {
                org.telegram.messenger.i0.v1(twoStepVerificationActivity.f34135s);
                twoStepVerificationActivity.f34129b0.m(twoStepVerificationActivity.p0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.I.email_unconfirmed_pattern)) {
                tc1 tc1Var = new tc1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.I);
                tc1Var.H0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
                twoStepVerificationActivity.presentFragment(tc1Var, true);
                return;
            } else {
                org.telegram.messenger.i0.v1(twoStepVerificationActivity.f34135s);
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
        org.telegram.ui.Components.s4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.I.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.aw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        vp0 vp0Var = new vp0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                vp0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, vp0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        vp0Var.run(null, tL_error2);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new xb1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.s0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.K = new byte[0];
            org.telegram.messenger.zs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.zs.f19677r0, new Object[0]);
            org.telegram.messenger.zs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.zs.f19670q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
        } else if (tL_error != null) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                }
                twoStepVerificationActivity.A0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                return;
            }
            twoStepVerificationActivity.A0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
        }
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.G = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            if (!m0(password, false)) {
                org.telegram.ui.Components.s4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
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
            q0(twoStepVerificationActivity.I);
            org.telegram.messenger.zs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.zs.f19670q0, twoStepVerificationActivity.I);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.D0();
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            q0(password);
            org.telegram.messenger.zs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.zs.f19670q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.o0();
        }
    }

    public static void g0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 != twoStepVerificationActivity.O && i10 != twoStepVerificationActivity.changePasswordRow) {
            if (i10 != twoStepVerificationActivity.Q && i10 != twoStepVerificationActivity.R) {
                if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131743965, null);
                    if (twoStepVerificationActivity.I.has_secure_values) {
                        L0 = a1.g.m(null, 2131743966, sc.e.i(L0, "\n\n"));
                    }
                    String L02 = org.telegram.messenger.cd.L0(2131743964, null);
                    String L03 = org.telegram.messenger.cd.L0(2131751436, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.T = L0;
                    x1Var.R = L02;
                    alertDialog$Builder.k(L03, new wb1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    twoStepVerificationActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            tc1 tc1Var = new tc1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.I);
            tc1Var.J.add(twoStepVerificationActivity);
            tc1Var.H0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(tc1Var);
            return;
        }
        tc1 tc1Var2 = new tc1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.I);
        tc1Var2.J.add(twoStepVerificationActivity);
        tc1Var2.H0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
        twoStepVerificationActivity.presentFragment(tc1Var2);
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.I.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new xb1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.p0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new xb1(twoStepVerificationActivity, 4), 10);
    }

    public static void i0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
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
                org.telegram.messenger.i0.g3(new bk0(twoStepVerificationActivity, z10, bArr2, 8));
            }
            twoStepVerificationActivity.L = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s10, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s10, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.M;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!ll0.c1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.p0();
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
        org.telegram.messenger.i0.g3(new bk0(twoStepVerificationActivity, z10, bArr2, 8));
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        twoStepVerificationActivity.s0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.I;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            ec1 ec1Var = new ec1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            ec1Var.J.add(twoStepVerificationActivity);
            ec1Var.H0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
            twoStepVerificationActivity.presentFragment(ec1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.A0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            twoStepVerificationActivity.A0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
        }
    }

    public static boolean m0(TL_account.Password password, boolean z10) {
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

    public static void q0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.f14519b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.f14519b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void B0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131742974, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.G(this.X, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743958, null), null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131750595, null), new wb1(this, 0));
        org.telegram.ui.ActionBar.a7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.t6.f21170q7, null);
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.C0():void");
    }

    public final void D0() {
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
        if (this.f34126a != null && !sb2.toString().equals(sb3.toString())) {
            this.f34126a.f();
        }
        if (this.fragmentView != null) {
            if (!this.G && !this.J) {
                org.telegram.ui.Components.tk0 tk0Var = this.f34128b;
                if (tk0Var != null) {
                    tk0Var.setEmptyView(null);
                    this.f34128b.setVisibility(4);
                    this.D.setVisibility(0);
                    this.f34138y.setVisibility(4);
                }
                if (this.f34135s != null) {
                    this.E.e(true, false);
                    this.f34135s.setVisibility(0);
                    View view = this.fragmentView;
                    int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
                    org.telegram.ui.ActionBar.a7.i(i11, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i11));
                    this.d.setVisibility(0);
                    this.f34133n.setVisibility(0);
                    C0();
                    this.f34132f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.I.hint)) {
                        this.f34135s.setHint(this.I.hint);
                    } else {
                        this.f34135s.setHint((CharSequence) null);
                    }
                    org.telegram.messenger.i0.h3(new yb1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.tk0 tk0Var2 = this.f34128b;
            if (tk0Var2 != null) {
                tk0Var2.setVisibility(0);
                this.D.setVisibility(4);
                this.f34128b.setEmptyView(this.f34138y);
            }
            if (this.f34135s != null) {
                this.E.e(false, false);
                this.f34135s.setVisibility(4);
                this.d.setVisibility(4);
                this.f34132f.setVisibility(8);
                this.f34133n.setVisibility(4);
                C0();
            }
            View view2 = this.fragmentView;
            int i12 = org.telegram.ui.ActionBar.t6.f20872a7;
            org.telegram.ui.ActionBar.a7.i(i12, view2, null);
            this.fragmentView.setTag(Integer.valueOf(i12));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Object obj;
        if (i10 == org.telegram.messenger.zs.f19665p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.K = (byte[]) obj;
            }
            r0(null, false, false);
            D0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.X >= 0) {
            Bundle g10 = a1.g.g("afterSignup", true);
            pf0 pf0Var = new pf0();
            pf0Var.q0(g10);
            presentFragment(pf0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34138y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34135s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34135s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void n0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752575, null), new wb1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752576, null), null);
        String L0 = org.telegram.messenger.cd.L0(2131752571, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752577, null);
        showDialog(x1Var);
    }

    public final void o0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.K;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        org.telegram.messenger.d20.i(this.currentAccount).u();
        this.M = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        t0(false);
        Utilities.e.c(new t11(16, this, updatepasswordsettings));
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.X >= 0) {
            if (z10) {
                B0();
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
        org.telegram.ui.Components.ei0 ei0Var = this.f34130c;
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                ei0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        ei0Var.setVisibility(i10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0(null);
        D0();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19665p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.r(this.f34131c0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19665p0);
        this.H = true;
        org.telegram.ui.ActionBar.x1 x1Var = this.f34137x;
        if (x1Var != null) {
            try {
                x1Var.dismiss();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.f34137x = null;
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
            org.telegram.ui.Components.xy xyVar = this.f34138y;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
            }
            org.telegram.ui.Components.v21 v21Var = this.F;
            if (v21Var != null) {
                v21Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
            }
            dc1 dc1Var = this.Y;
            if (dc1Var != null) {
                dc1Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l6, false));
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
                v0();
                this.W = false;
            } else if (this.N) {
                y0();
                this.N = false;
            }
        }
    }

    public final TLRPC.TL_inputCheckPasswordSRP p0() {
        TL_account.Password password = this.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return org.telegram.messenger.aw.d(this.K, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void r0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.G = true;
            fc1 fc1Var = this.f34126a;
            if (fc1Var != null) {
                fc1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new zb1(this, z11, z10, runnable), 10);
    }

    public final void s0() {
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.f34137x;
        if (x1Var == null) {
            return;
        }
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f34137x = null;
    }

    public final void t0(boolean z10) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f34137x == null) {
            if (!this.J) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.f34137x = x1Var;
            x1Var.f21488i0 = false;
            if (z10) {
                x1Var.r(300L);
            } else {
                x1Var.show();
            }
        }
    }

    public final void u0(org.telegram.ui.Components.ec0 ec0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        org.telegram.messenger.i0.F3(5.0f, ec0Var, new yb1(this, 1));
    }

    public final void v0() {
        TL_account.Password password = this.I;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            t0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new xb1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.I.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.I.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new wb1(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131746083, null);
                    showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                        return;
                    }
                    return;
                }
                n0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746135, null), new wb1(this, 4));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            String L02 = org.telegram.messenger.cd.L0(2131746110, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
            x1Var2.R = L02;
            x1Var2.T = org.telegram.messenger.cd.L0(2131746089, null);
            showDialog(x1Var2);
        }
    }

    public final void w0(Runnable runnable) {
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
        r0(runnable, true, z10);
    }

    public final void x0() {
        if (!this.J) {
            String obj = this.f34135s.getText().toString();
            if (obj.length() == 0) {
                u0(this.f34136w, this.f34135s, false);
                return;
            }
            byte[] h12 = org.telegram.messenger.i0.h1(obj);
            t0(false);
            Utilities.e.c(new t11(15, this, h12));
        }
    }

    public final void y0() {
        t0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new xb1(this, 0));
    }

    public final void z0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
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
}
