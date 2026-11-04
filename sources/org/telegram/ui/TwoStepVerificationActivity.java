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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public ScrollView E;
    public org.telegram.ui.Components.l00 F;
    public org.telegram.ui.Components.n11 G;
    public boolean H;
    public boolean I;
    public TL_account.Password J;
    public boolean K;
    public byte[] L;
    public long M;
    public byte[] N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final v91 W;
    public boolean X;
    public int Y;
    public z91 Z;
    public ba1 f42082a;
    public int f42083a0;
    public org.telegram.ui.Components.tj0 f42084b;
    public String f42085b0;
    public org.telegram.ui.Components.fh0 f42086c;
    public ca1 f42087c0;
    private int changePasswordRow;
    public TextView d;
    public final v91 f42088d0;
    public TextView f42089e;
    public TextView f42090f;
    public TextView h;
    public org.telegram.ui.ActionBar.k5 f42091n;
    public TextView f42092r;
    public EditTextBoldCursor f42093s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.gb0 f42094w;
    public org.telegram.ui.ActionBar.s1 f42095x;
    public org.telegram.ui.Components.gy f42096y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new v91(this, 2);
        this.Y = -1;
        this.f42088d0 = new v91(this, 3);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.f23286q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.f23286q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new u91(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.f42094w, twoStepVerificationActivity.f42093s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(2131689472, null), tL_error.text);
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.f42087c0 == null || !z10) {
            twoStepVerificationActivity.t0();
        }
        if (z10) {
            twoStepVerificationActivity.L = bArr;
            twoStepVerificationActivity.K = true;
            if (twoStepVerificationActivity.f42087c0 != null) {
                org.telegram.messenger.g0.v1(twoStepVerificationActivity.f42093s);
                twoStepVerificationActivity.f42087c0.l(twoStepVerificationActivity.q0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.J.email_unconfirmed_pattern)) {
                ra1 ra1Var = new ra1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.J);
                ra1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
                twoStepVerificationActivity.presentFragment(ra1Var, true);
                return;
            } else {
                org.telegram.messenger.g0.v1(twoStepVerificationActivity.f42093s);
                TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
                twoStepVerificationActivity2.K = true;
                twoStepVerificationActivity2.L = twoStepVerificationActivity.L;
                twoStepVerificationActivity2.J = twoStepVerificationActivity.J;
                twoStepVerificationActivity2.N = twoStepVerificationActivity.N;
                twoStepVerificationActivity2.M = twoStepVerificationActivity.M;
                twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
                return;
            }
        }
        org.telegram.ui.Components.t4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.J.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.hv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        co0 co0Var = new co0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                co0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, co0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        co0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new u91(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.J = null;
            twoStepVerificationActivity.L = new byte[0];
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.f23293r0, new Object[0]);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.f23286q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
        } else if (tL_error != null) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                }
                twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                return;
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.t4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.L;
                if ((bArr != null && bArr.length > 0) || !twoStepVerificationActivity.J.has_password) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                twoStepVerificationActivity.K = z12;
            }
            r0(twoStepVerificationActivity.J);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.f23286q0, twoStepVerificationActivity.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.E0();
    }

    public static void g0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.f23286q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        if (i3 != twoStepVerificationActivity.P && i3 != twoStepVerificationActivity.changePasswordRow) {
            if (i3 != twoStepVerificationActivity.R && i3 != twoStepVerificationActivity.S) {
                if (i3 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131743950, null);
                    if (twoStepVerificationActivity.J.has_secure_values) {
                        M0 = k2.p1.k(2131743951, null, t4.c.h(M0, "\n\n"));
                    }
                    String M02 = org.telegram.messenger.bd.M0(2131743949, null);
                    String M03 = org.telegram.messenger.bd.M0(2131751436, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.U = M0;
                    s1Var.S = M02;
                    alertDialog$Builder.k(M03, new t91(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    twoStepVerificationActivity.showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            ra1 ra1Var = new ra1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.J);
            ra1Var.K.add(twoStepVerificationActivity);
            ra1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
            twoStepVerificationActivity.presentFragment(ra1Var);
            return;
        }
        ra1 ra1Var2 = new ra1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.J);
        ra1Var2.K.add(twoStepVerificationActivity);
        ra1Var2.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
        twoStepVerificationActivity.presentFragment(ra1Var2);
    }

    public static void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.J.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new u91(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new u91(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] s6;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.N = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                s6 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s6 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.g0.h3(new a60(twoStepVerificationActivity, z10, bArr2, 11));
            }
            twoStepVerificationActivity.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s6, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s6, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!yj0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ei.u5(9));
                twoStepVerificationActivity.N = null;
                twoStepVerificationActivity.M = 0L;
            }
        } else {
            twoStepVerificationActivity.N = null;
            twoStepVerificationActivity.M = 0L;
        }
        z10 = true;
        org.telegram.messenger.g0.h3(new a60(twoStepVerificationActivity, z10, bArr2, 11));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        twoStepVerificationActivity.t0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.J;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            aa1 aa1Var = new aa1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            aa1Var.K.add(twoStepVerificationActivity);
            aa1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
            twoStepVerificationActivity.presentFragment(aa1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(2131689472, null), tL_error.text);
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
            Utilities.f21385b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.f21385b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        boolean z10;
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j10;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131742958, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743943, null), null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131750595, null), new t91(this, 0));
        org.telegram.ui.ActionBar.r6.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.f28122q7, null);
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.D0():void");
    }

    public final void E0() {
        TL_account.Password password;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.P);
        sb2.append(this.Q);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        sb2.append(this.U);
        this.U = 0;
        this.P = -1;
        this.Q = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        if (!this.H && (password = this.J) != null && this.K) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.U = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.U = 3;
                    this.S = 2;
                } else {
                    this.U = 3;
                    this.R = 2;
                }
                int i3 = this.U;
                this.U = i3 + 1;
                this.T = i3;
            } else {
                this.P = 0;
                this.U = 2;
                this.Q = 1;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.P);
        sb3.append(this.Q);
        sb3.append(this.changePasswordRow);
        sb3.append(this.turnPasswordOffRow);
        sb3.append(this.R);
        sb3.append(this.S);
        sb3.append(this.T);
        sb3.append(this.U);
        if (this.f42082a != null && !sb2.toString().equals(sb3.toString())) {
            this.f42082a.f();
        }
        if (this.fragmentView != null) {
            if (!this.H && !this.K) {
                org.telegram.ui.Components.tj0 tj0Var = this.f42084b;
                if (tj0Var != null) {
                    tj0Var.setEmptyView(null);
                    this.f42084b.setVisibility(4);
                    this.E.setVisibility(0);
                    this.f42096y.setVisibility(4);
                }
                if (this.f42093s != null) {
                    this.F.e(true, false);
                    this.f42093s.setVisibility(0);
                    View view = this.fragmentView;
                    int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
                    org.telegram.ui.ActionBar.r6.i(i10, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i10));
                    this.d.setVisibility(0);
                    this.f42091n.setVisibility(0);
                    D0();
                    this.f42090f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.J.hint)) {
                        this.f42093s.setHint(this.J.hint);
                    } else {
                        this.f42093s.setHint((CharSequence) null);
                    }
                    org.telegram.messenger.g0.i3(new v91(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.tj0 tj0Var2 = this.f42084b;
            if (tj0Var2 != null) {
                tj0Var2.setVisibility(0);
                this.E.setVisibility(4);
                this.f42084b.setEmptyView(this.f42096y);
            }
            if (this.f42093s != null) {
                this.F.e(false, false);
                this.f42093s.setVisibility(4);
                this.d.setVisibility(4);
                this.f42090f.setVisibility(8);
                this.f42091n.setVisibility(4);
                D0();
            }
            View view2 = this.fragmentView;
            int i11 = org.telegram.ui.ActionBar.k6.f27824a7;
            org.telegram.ui.ActionBar.r6.i(i11, view2, null);
            this.fragmentView.setTag(Integer.valueOf(i11));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Object obj;
        if (i3 == org.telegram.messenger.hs.f23280p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.Y >= 0) {
            Bundle k10 = a1.g.k("afterSignup", true);
            ee0 ee0Var = new ee0();
            ee0Var.r0(k10);
            presentFragment(ee0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42096y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42093s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42093s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752575, null), new t91(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752576, null), null);
        String M0 = org.telegram.messenger.bd.M0(2131752571, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752577, null);
        showDialog(s1Var);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.Y >= 0) {
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
        int i3;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.fh0 fh0Var = this.f42086c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i3 = 0;
                fh0Var.setVisibility(i3);
            }
        }
        i3 = 8;
        fh0Var.setVisibility(i3);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23280p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f42088d0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23280p0);
        this.I = true;
        org.telegram.ui.ActionBar.s1 s1Var = this.f42095x;
        if (s1Var != null) {
            try {
                s1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f42095x = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.gy gyVar = this.f42096y;
            if (gyVar != null) {
                gyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
            }
            org.telegram.ui.Components.n11 n11Var = this.G;
            if (n11Var != null) {
                n11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
            z91 z91Var = this.Z;
            if (z91Var != null) {
                z91Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28026l6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            if (this.X) {
                w0();
                this.X = false;
            } else if (this.O) {
                z0();
                this.O = false;
            }
        }
    }

    public final void p0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        org.telegram.messenger.h10.i(this.currentAccount).u();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.f21387e.c(new qv0(28, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return org.telegram.messenger.hv.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void s0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.H = true;
            ba1 ba1Var = this.f42082a;
            if (ba1Var != null) {
                ba1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ei.g6(this, z11, z10, runnable), 10);
    }

    public final void t0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = this.f42095x;
        if (s1Var == null) {
            return;
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f42095x = null;
    }

    public final void u0(boolean z10) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f42095x == null) {
            if (!this.K) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            this.f42095x = s1Var;
            s1Var.f28546j0 = false;
            if (z10) {
                s1Var.r(300L);
            } else {
                s1Var.show();
            }
        }
    }

    public final void v0(org.telegram.ui.Components.gb0 gb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        gb0Var.a(1.0f);
        org.telegram.messenger.g0.G3(5.0f, gb0Var, new v91(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new u91(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.J.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.J.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new t91(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131746076, null);
                    showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                        return;
                    }
                    return;
                }
                o0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746128, null), new t91(this, 4));
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            String M02 = org.telegram.messenger.bd.M0(2131746103, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
            s1Var2.S = M02;
            s1Var2.U = org.telegram.messenger.bd.M0(2131746082, null);
            showDialog(s1Var2);
        }
    }

    public final void x0(Runnable runnable) {
        boolean z10;
        byte[] bArr;
        TL_account.Password password = this.J;
        if (password != null && password.current_algo != null && (bArr = this.L) != null && bArr.length > 0) {
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
        if (!this.K) {
            String obj = this.f42093s.getText().toString();
            if (obj.length() == 0) {
                v0(this.f42094w, this.f42093s, false);
                return;
            }
            byte[] h12 = org.telegram.messenger.g0.h1(obj);
            u0(false);
            Utilities.f21387e.c(new qv0(27, this, h12));
        }
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new u91(this, 0));
    }
}
