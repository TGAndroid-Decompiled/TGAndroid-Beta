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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public ScrollView E;
    public org.telegram.ui.Components.a10 F;
    public org.telegram.ui.Components.j21 G;
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
    public final fa1 W;
    public boolean X;
    public int Y;
    public ja1 Z;
    public la1 f43997a;
    public int f43998a0;
    public org.telegram.ui.Components.ek0 f43999b;
    public String f44000b0;
    public org.telegram.ui.Components.qh0 f44001c;
    public ma1 f44002c0;
    private int changePasswordRow;
    public TextView d;
    public final fa1 f44003d0;
    public TextView f44004e;
    public TextView f44005f;
    public TextView h;
    public org.telegram.ui.ActionBar.n5 f44006n;
    public TextView f44007r;
    public EditTextBoldCursor f44008s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.vb0 f44009w;
    public org.telegram.ui.ActionBar.t1 f44010x;
    public org.telegram.ui.Components.sy f44011y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new fa1(this, 2);
        this.Y = -1;
        this.f44003d0 = new fa1(this, 3);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.ks.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ks.f25270q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.ks.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ks.f25270q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ea1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.f44009w, twoStepVerificationActivity.f44008s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.gd.N0(2131689472, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.gd.N0(2131689472, null), tL_error.text);
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.f44002c0 == null || !z10) {
            twoStepVerificationActivity.t0();
        }
        if (z10) {
            twoStepVerificationActivity.L = bArr;
            twoStepVerificationActivity.K = true;
            if (twoStepVerificationActivity.f44002c0 != null) {
                org.telegram.messenger.g0.v1(twoStepVerificationActivity.f44008s);
                twoStepVerificationActivity.f44002c0.j(twoStepVerificationActivity.q0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.J.email_unconfirmed_pattern)) {
                za1 za1Var = new za1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.J);
                za1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
                twoStepVerificationActivity.presentFragment(za1Var, true);
                return;
            } else {
                org.telegram.messenger.g0.v1(twoStepVerificationActivity.f44008s);
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
        org.telegram.ui.Components.b5.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.J.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.jv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        mo0 mo0Var = new mo0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                mo0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, mo0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        mo0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ea1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.J = null;
            twoStepVerificationActivity.L = new byte[0];
            org.telegram.messenger.ks.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ks.f25277r0, new Object[0]);
            org.telegram.messenger.ks.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ks.f25270q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
        } else if (tL_error != null) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                }
                twoStepVerificationActivity.B0(org.telegram.messenger.gd.N0(2131689472, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
                return;
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.gd.N0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.b5.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
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
            org.telegram.messenger.ks.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ks.f25270q0, twoStepVerificationActivity.J);
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
            org.telegram.messenger.ks.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ks.f25270q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        if (i7 != twoStepVerificationActivity.P && i7 != twoStepVerificationActivity.changePasswordRow) {
            if (i7 != twoStepVerificationActivity.R && i7 != twoStepVerificationActivity.S) {
                if (i7 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131743693, null);
                    if (twoStepVerificationActivity.J.has_secure_values) {
                        N0 = i5.c.k(2131743694, null, p5.c.n(N0, "\n\n"));
                    }
                    String N02 = org.telegram.messenger.gd.N0(2131743692, null);
                    String N03 = org.telegram.messenger.gd.N0(2131751423, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.U = N0;
                    t1Var.S = N02;
                    alertDialog$Builder.k(N03, new da1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    twoStepVerificationActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            za1 za1Var = new za1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.J);
            za1Var.K.add(twoStepVerificationActivity);
            za1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
            twoStepVerificationActivity.presentFragment(za1Var);
            return;
        }
        za1 za1Var2 = new za1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.J);
        za1Var2.K.add(twoStepVerificationActivity);
        za1Var2.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
        twoStepVerificationActivity.presentFragment(za1Var2);
    }

    public static void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.J.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ea1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ea1(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] s5;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.N = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                s5 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s5 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.g0.g3(new a80(twoStepVerificationActivity, z10, bArr2, 10));
            }
            twoStepVerificationActivity.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s5, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s5, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!fk0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new fi.l5(9));
                twoStepVerificationActivity.N = null;
                twoStepVerificationActivity.M = 0L;
            }
        } else {
            twoStepVerificationActivity.N = null;
            twoStepVerificationActivity.M = 0L;
        }
        z10 = true;
        org.telegram.messenger.g0.g3(new a80(twoStepVerificationActivity, z10, bArr2, 10));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        twoStepVerificationActivity.t0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.J;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            ka1 ka1Var = new ka1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            ka1Var.K.add(twoStepVerificationActivity);
            ka1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
            twoStepVerificationActivity.presentFragment(ka1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.gd.N0(2131689472, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.gd.N0(2131689472, null), tL_error.text);
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
            Utilities.f22875b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.f22875b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(TL_account.Password password, byte[] bArr, long j3, byte[] bArr2) {
        boolean z10;
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j3;
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
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = str;
        t1Var.U = str2;
        showDialog(t1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131742677, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743686, null), null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131750577, null), new da1(this, 0));
        org.telegram.ui.ActionBar.u6.U((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.n6.f29692q7, null);
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
                int i7 = this.U;
                this.U = i7 + 1;
                this.T = i7;
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
        if (this.f43997a != null && !sb2.toString().equals(sb3.toString())) {
            this.f43997a.f();
        }
        if (this.fragmentView != null) {
            if (!this.H && !this.K) {
                org.telegram.ui.Components.ek0 ek0Var = this.f43999b;
                if (ek0Var != null) {
                    ek0Var.setEmptyView(null);
                    this.f43999b.setVisibility(4);
                    this.E.setVisibility(0);
                    this.f44011y.setVisibility(4);
                }
                if (this.f44008s != null) {
                    this.F.e(true, false);
                    this.f44008s.setVisibility(0);
                    View view = this.fragmentView;
                    int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
                    org.telegram.ui.ActionBar.u6.h(i10, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i10));
                    this.d.setVisibility(0);
                    this.f44006n.setVisibility(0);
                    D0();
                    this.f44005f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.J.hint)) {
                        this.f44008s.setHint(this.J.hint);
                    } else {
                        this.f44008s.setHint((CharSequence) null);
                    }
                    org.telegram.messenger.g0.h3(new fa1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ek0 ek0Var2 = this.f43999b;
            if (ek0Var2 != null) {
                ek0Var2.setVisibility(0);
                this.E.setVisibility(4);
                this.f43999b.setEmptyView(this.f44011y);
            }
            if (this.f44008s != null) {
                this.F.e(false, false);
                this.f44008s.setVisibility(4);
                this.d.setVisibility(4);
                this.f44005f.setVisibility(8);
                this.f44006n.setVisibility(4);
                D0();
            }
            View view2 = this.fragmentView;
            int i11 = org.telegram.ui.ActionBar.n6.f29394a7;
            org.telegram.ui.ActionBar.u6.h(i11, view2, null);
            this.fragmentView.setTag(Integer.valueOf(i11));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29672p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        if (i7 == org.telegram.messenger.ks.f25264p0) {
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
            Bundle k10 = a8.p0.k("afterSignup", true);
            le0 le0Var = new le0();
            le0Var.r0(k10);
            presentFragment(le0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44011y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44008s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29580k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f44008s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29598l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752563, null), new da1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752564, null), null);
        String N0 = org.telegram.messenger.gd.N0(2131752559, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752565, null);
        showDialog(t1Var);
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
        int i7;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.qh0 qh0Var = this.f44001c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                qh0Var.setVisibility(i7);
            }
        }
        i7 = 8;
        qh0Var.setVisibility(i7);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25264p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f44003d0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25264p0);
        this.I = true;
        org.telegram.ui.ActionBar.t1 t1Var = this.f44010x;
        if (t1Var != null) {
            try {
                t1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f44010x = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.sy syVar = this.f44011y;
            if (syVar != null) {
                syVar.setProgressBarColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29525h6, false));
            }
            org.telegram.ui.Components.j21 j21Var = this.G;
            if (j21Var != null) {
                j21Var.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false));
            }
            ja1 ja1Var = this.Z;
            if (ja1Var != null) {
                ja1Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29598l6, false));
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
        org.telegram.messenger.i10.i(this.currentAccount).u();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.f22877e.c(new iy0(21, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return org.telegram.messenger.jv.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void s0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.H = true;
            la1 la1Var = this.f43997a;
            if (la1Var != null) {
                la1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new fi.w5(this, z11, z10, runnable), 10);
    }

    public final void t0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.f44010x;
        if (t1Var == null) {
            return;
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f44010x = null;
    }

    public final void u0(boolean z10) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f44010x == null) {
            if (!this.K) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.f44010x = t1Var;
            t1Var.f30091j0 = false;
            if (z10) {
                t1Var.r(300L);
            } else {
                t1Var.show();
            }
        }
    }

    public final void v0(org.telegram.ui.Components.vb0 vb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        vb0Var.a(1.0f);
        org.telegram.messenger.g0.E3(5.0f, vb0Var, new fa1(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ea1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.J.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.J.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745922, null), new da1(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    String N0 = org.telegram.messenger.gd.N0(2131745897, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131745870, null);
                    showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                        return;
                    }
                    return;
                }
                o0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131745922, null), new da1(this, 4));
            alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            String N02 = org.telegram.messenger.gd.N0(2131745897, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
            t1Var2.S = N02;
            t1Var2.U = org.telegram.messenger.gd.N0(2131745876, null);
            showDialog(t1Var2);
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
            String obj = this.f44008s.getText().toString();
            if (obj.length() == 0) {
                v0(this.f44009w, this.f44008s, false);
                return;
            }
            byte[] h12 = org.telegram.messenger.g0.h1(obj);
            u0(false);
            Utilities.f22877e.c(new iy0(20, this, h12));
        }
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ea1(this, 0));
    }
}
