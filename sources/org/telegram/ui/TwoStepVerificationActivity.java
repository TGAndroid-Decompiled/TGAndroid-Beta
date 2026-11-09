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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public ScrollView D;
    public org.telegram.ui.Components.q00 E;
    public org.telegram.ui.Components.u11 F;
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
    public final ha1 V;
    public boolean W;
    public int X;
    public la1 Y;
    public int Z;
    public na1 f42059a;
    public String f42060a0;
    public org.telegram.ui.Components.qj0 f42061b;
    public oa1 f42062b0;
    public org.telegram.ui.Components.dh0 f42063c;
    public final ha1 f42064c0;
    private int changePasswordRow;
    public TextView d;
    public TextView f42065e;
    public TextView f42066f;
    public TextView h;
    public org.telegram.ui.ActionBar.l5 f42067n;
    public TextView f42068r;
    public EditTextBoldCursor f42069s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.mb0 f42070w;
    public org.telegram.ui.ActionBar.u1 f42071x;
    public org.telegram.ui.Components.jy f42072y;

    public TwoStepVerificationActivity() {
        super(null);
        this.J = true;
        this.K = new byte[0];
        this.V = new ha1(this, 2);
        this.X = -1;
        this.f42064c0 = new ha1(this, 3);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.f25057q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.f25057q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ga1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.f42070w, twoStepVerificationActivity.f42069s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, byte[] bArr) {
        if (twoStepVerificationActivity.f42062b0 == null || !z9) {
            twoStepVerificationActivity.t0();
        }
        if (z9) {
            twoStepVerificationActivity.K = bArr;
            twoStepVerificationActivity.J = true;
            if (twoStepVerificationActivity.f42062b0 != null) {
                org.telegram.messenger.g0.v1(twoStepVerificationActivity.f42069s);
                twoStepVerificationActivity.f42062b0.j(twoStepVerificationActivity.q0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.I.email_unconfirmed_pattern)) {
                bb1 bb1Var = new bb1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.I);
                bb1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
                twoStepVerificationActivity.presentFragment(bb1Var, true);
                return;
            } else {
                org.telegram.messenger.g0.v1(twoStepVerificationActivity.f42069s);
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
        org.telegram.ui.Components.v4.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.I.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        no0 no0Var = new no0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                no0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, no0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        no0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ga1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.K = new byte[0];
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.f25064r0, new Object[0]);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.f25057q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
        } else if (tL_error != null) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                }
                twoStepVerificationActivity.B0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                return;
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, boolean z10, Runnable runnable) {
        boolean z11;
        if (tL_error == null) {
            twoStepVerificationActivity.G = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.v4.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                return;
            }
            if (!z9 || z10) {
                byte[] bArr = twoStepVerificationActivity.K;
                if ((bArr != null && bArr.length > 0) || !twoStepVerificationActivity.I.has_password) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                twoStepVerificationActivity.J = z11;
            }
            r0(twoStepVerificationActivity.I);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.f25057q0, twoStepVerificationActivity.I);
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
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.f25057q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        if (i7 != twoStepVerificationActivity.O && i7 != twoStepVerificationActivity.changePasswordRow) {
            if (i7 != twoStepVerificationActivity.Q && i7 != twoStepVerificationActivity.R) {
                if (i7 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131743940, null);
                    if (twoStepVerificationActivity.I.has_secure_values) {
                        M0 = jg.g.l(2131743941, null, rf.b.j(M0, "\n\n"));
                    }
                    String M02 = org.telegram.messenger.id.M0(2131743939, null);
                    String M03 = org.telegram.messenger.id.M0(2131751435, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.T = M0;
                    u1Var.R = M02;
                    alertDialog$Builder.k(M03, new fa1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    twoStepVerificationActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            bb1 bb1Var = new bb1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.I);
            bb1Var.J.add(twoStepVerificationActivity);
            bb1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(bb1Var);
            return;
        }
        bb1 bb1Var2 = new bb1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.I);
        bb1Var2.J.add(twoStepVerificationActivity);
        bb1Var2.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
        twoStepVerificationActivity.presentFragment(bb1Var2);
    }

    public static void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.I.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ga1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ga1(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z9;
        byte[] s5;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.M = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z9 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                s5 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s5 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.g0.h3(new i60(twoStepVerificationActivity, z9, bArr2, 11));
            }
            twoStepVerificationActivity.L = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s5, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s5, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.M;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!dk0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new di.v5(9));
                twoStepVerificationActivity.M = null;
                twoStepVerificationActivity.L = 0L;
            }
        } else {
            twoStepVerificationActivity.M = null;
            twoStepVerificationActivity.L = 0L;
        }
        z9 = true;
        org.telegram.messenger.g0.h3(new i60(twoStepVerificationActivity, z9, bArr2, 11));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String G;
        twoStepVerificationActivity.t0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.I;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            ma1 ma1Var = new ma1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            ma1Var.J.add(twoStepVerificationActivity);
            ma1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
            twoStepVerificationActivity.presentFragment(ma1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
            }
            twoStepVerificationActivity.B0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
        } else {
            twoStepVerificationActivity.B0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
        }
    }

    public static boolean n0(TL_account.Password password, boolean z9) {
        if (z9) {
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
            Utilities.f21334b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.f21334b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(TL_account.Password password, byte[] bArr, long j3, byte[] bArr2) {
        boolean z9;
        this.I = password;
        this.K = bArr;
        this.M = bArr2;
        this.L = j3;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.J = z9;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131742948, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.G(this.X, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743933, null), null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131750594, null), new fa1(this, 0));
        org.telegram.ui.ActionBar.s6.U((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.l6.f28106q7, null);
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
                int i7 = this.T;
                this.T = i7 + 1;
                this.S = i7;
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
        if (this.f42059a != null && !sb2.toString().equals(sb3.toString())) {
            this.f42059a.f();
        }
        if (this.fragmentView != null) {
            if (!this.G && !this.J) {
                org.telegram.ui.Components.qj0 qj0Var = this.f42061b;
                if (qj0Var != null) {
                    qj0Var.setEmptyView(null);
                    this.f42061b.setVisibility(4);
                    this.D.setVisibility(0);
                    this.f42072y.setVisibility(4);
                }
                if (this.f42069s != null) {
                    this.E.e(true, false);
                    this.f42069s.setVisibility(0);
                    View view = this.fragmentView;
                    int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
                    org.telegram.ui.ActionBar.s6.h(i10, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i10));
                    this.d.setVisibility(0);
                    this.f42067n.setVisibility(0);
                    D0();
                    this.f42066f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.I.hint)) {
                        this.f42069s.setHint(this.I.hint);
                    } else {
                        this.f42069s.setHint((CharSequence) null);
                    }
                    org.telegram.messenger.g0.i3(new ha1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.qj0 qj0Var2 = this.f42061b;
            if (qj0Var2 != null) {
                qj0Var2.setVisibility(0);
                this.D.setVisibility(4);
                this.f42061b.setEmptyView(this.f42072y);
            }
            if (this.f42069s != null) {
                this.E.e(false, false);
                this.f42069s.setVisibility(4);
                this.d.setVisibility(4);
                this.f42066f.setVisibility(8);
                this.f42067n.setVisibility(4);
                D0();
            }
            View view2 = this.fragmentView;
            int i11 = org.telegram.ui.ActionBar.l6.f27809a7;
            org.telegram.ui.ActionBar.s6.h(i11, view2, null);
            this.fragmentView.setTag(Integer.valueOf(i11));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28086p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        if (i7 == org.telegram.messenger.qs.f25051p0) {
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
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42072y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27939h6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42069s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27994k6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f42069s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28012l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752575, null), new fa1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752576, null), null);
        String M0 = org.telegram.messenger.id.M0(2131752571, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752577, null);
        showDialog(u1Var);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.X >= 0) {
            if (z9) {
                C0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.dh0 dh0Var = this.f42063c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                dh0Var.setVisibility(i7);
            }
        }
        i7 = 8;
        dh0Var.setVisibility(i7);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25051p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f42064c0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25051p0);
        this.H = true;
        org.telegram.ui.ActionBar.u1 u1Var = this.f42071x;
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f42071x = null;
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
            org.telegram.ui.Components.jy jyVar = this.f42072y;
            if (jyVar != null) {
                jyVar.setProgressBarColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27939h6, false));
            }
            org.telegram.ui.Components.u11 u11Var = this.F;
            if (u11Var != null) {
                u11Var.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O9, false));
            }
            la1 la1Var = this.Y;
            if (la1Var != null) {
                la1Var.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28012l6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9) {
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
        org.telegram.messenger.p10.i(this.currentAccount).u();
        this.M = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.f21336e.c(new ax0(24, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return org.telegram.messenger.pv.d(this.K, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void s0(Runnable runnable, boolean z9, boolean z10) {
        if (!z10) {
            this.G = true;
            na1 na1Var = this.f42059a;
            if (na1Var != null) {
                na1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new di.g6(this, z10, z9, runnable), 10);
    }

    public final void t0() {
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.f42071x;
        if (u1Var == null) {
            return;
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f42071x = null;
    }

    public final void u0(boolean z9) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f42071x == null) {
            if (!this.J) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            this.f42071x = u1Var;
            u1Var.f28563i0 = false;
            if (z9) {
                u1Var.r(300L);
            } else {
                u1Var.show();
            }
        }
    }

    public final void v0(org.telegram.ui.Components.mb0 mb0Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            editTextBoldCursor.setText("");
        }
        mb0Var.a(1.0f);
        org.telegram.messenger.g0.G3(5.0f, mb0Var, new ha1(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.I;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ga1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.I.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.I.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new fa1(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    String M0 = org.telegram.messenger.id.M0(2131746093, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131746066, null);
                    showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                        return;
                    }
                    return;
                }
                o0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746118, null), new fa1(this, 4));
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
            String M02 = org.telegram.messenger.id.M0(2131746093, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
            u1Var2.R = M02;
            u1Var2.T = org.telegram.messenger.id.M0(2131746072, null);
            showDialog(u1Var2);
        }
    }

    public final void x0(Runnable runnable) {
        boolean z9;
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
            z9 = true;
        } else {
            z9 = false;
        }
        s0(runnable, true, z9);
    }

    public final void y0() {
        if (!this.J) {
            String obj = this.f42069s.getText().toString();
            if (obj.length() == 0) {
                v0(this.f42070w, this.f42069s, false);
                return;
            }
            byte[] h12 = org.telegram.messenger.g0.h1(obj);
            u0(false);
            Utilities.f21336e.c(new ax0(23, this, h12));
        }
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ga1(this, 0));
    }
}
