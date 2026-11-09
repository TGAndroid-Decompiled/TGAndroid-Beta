package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public class bb1 extends org.telegram.ui.ActionBar.f2 {
    public fi.p5 D;
    public org.telegram.ui.ActionBar.f0 E;
    public boolean F;
    public int G;
    public boolean H;
    public AnimatorSet I;
    public final ArrayList J;
    public AnimatorSet K;
    public RadialProgressView L;
    public boolean M;
    public boolean N;
    public final int O;
    public String P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public TL_account.Password U;
    public byte[] V;
    public long W;
    public byte[] X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.Components.dh0 f43950a;
    public String f43951a0;
    public TextView f43952b;
    public h6.m f43953b0;
    public TextView f43954c;
    public org.telegram.ui.Components.q00 f43955c0;
    public xh.l d;
    public org.telegram.ui.Components.u11 f43956d0;
    public TextView f43957e;
    public org.telegram.ui.Components.br f43958e0;
    public TextView f43959f;
    public org.telegram.ui.Components.ah0[] f43960f0;
    public sa1 f43961g0;
    public TextView h;
    public final Runnable f43962h0;
    public final Runnable f43963i0;
    public n90 f43964j0;
    public EditTextBoldCursor f43965n;
    public EditTextBoldCursor f43966r;
    public org.telegram.ui.Components.mb0 f43967s;
    public org.telegram.ui.Components.mb0 f43968w;
    public nb0 f43969x;
    public ab1 f43970y;

    public bb1(int i7, int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f43962h0 = new sa1(this, 0);
        this.f43963i0 = new sa1(this, 1);
        this.currentAccount = i7;
        this.O = i10;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ua1(this, 0), 10);
            }
        }
    }

    public static void Z(bb1 bb1Var, TLObject tLObject, boolean z9, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = bb1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = org.telegram.messenger.pv.d(bb1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z9 && str != null) {
            byte[] h12 = org.telegram.messenger.g0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = bb1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.pv.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        kg.l0 l0Var = new kg.l0(bb1Var, z9, bArr, str, passwordinputsettings);
        if (!z9) {
            if (str != null && (bArr3 = bb1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = bb1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(m10, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(m10, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(bb1Var.X, 0, bArr6, 0, 32);
                    Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = bb1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = bb1Var.U.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] b10 = org.telegram.messenger.pv.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b10;
                    if (b10 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        l0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            l0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
    }

    public static void a0(bb1 bb1Var) {
        ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new di.v5(9));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131746120, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131743931, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
        bb1Var.showDialog(u1Var);
    }

    public static void b0(bb1 bb1Var, byte[] bArr) {
        ArrayList arrayList = bb1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = bb1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = bb1Var.U;
        if (bArr == null) {
            bArr = bb1Var.V;
        }
        twoStepVerificationActivity.A0(password2, bArr, bb1Var.W, bb1Var.X);
        twoStepVerificationActivity.X = bb1Var.G;
        bb1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, bb1Var.U);
        n90 n90Var = bb1Var.f43964j0;
        if (n90Var != null) {
            org.telegram.messenger.g0.h3(n90Var);
            bb1Var.f43964j0 = null;
        }
    }

    public static void c0(bb1 bb1Var) {
        ArrayList arrayList = bb1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(bb1Var.currentAccount);
        byte[] bArr = bb1Var.V;
        TL_account.Password password = bb1Var.U;
        f10.k(org.telegram.messenger.qs.f25051p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, bb1Var.R, bb1Var.Q, null, bb1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = bb1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, bb1Var.V, bb1Var.W, bb1Var.X);
        twoStepVerificationActivity.X = bb1Var.G;
        bb1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, bb1Var.U);
        n90 n90Var = bb1Var.f43964j0;
        if (n90Var != null) {
            org.telegram.messenger.g0.h3(n90Var);
            bb1Var.f43964j0 = null;
        }
    }

    public static void d0(bb1 bb1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = bb1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        o41 o41Var = new o41(5, bb1Var, bArr2);
        TL_account.Password password = bb1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                o41Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(getpasswordsettings, o41Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        o41Var.run(null, tL_error2);
    }

    public static void e0(bb1 bb1Var, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ua1(bb1Var, 4), 8);
            return;
        }
        bb1Var.B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            bb1Var.d.setText(org.telegram.messenger.id.M0(2131752157, null));
            org.telegram.ui.ActionBar.s6.U(bb1Var.d, org.telegram.ui.ActionBar.l6.f28086p7, null);
            bb1Var.E0(bb1Var.f43967s, bb1Var.f43965n, true);
            bb1Var.M0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
            }
            bb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
        } else {
            bb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(bb1 bb1Var) {
        ArrayList arrayList = bb1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25051p0, new Object[0]);
        bb1Var.finishFragment();
    }

    public static void g0(bb1 bb1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bb1Var.U = password;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.v4.u0(bb1Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                return;
            }
            bb1Var.T = !TextUtils.isEmpty(bb1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.r0(bb1Var.U);
            if (!bb1Var.S && bb1Var.Y) {
                TL_account.Password password2 = bb1Var.U;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    if (password2.has_recovery) {
                        str = "1";
                    } else {
                        str = null;
                    }
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!bb1Var.T && passwordKdfAlgo != null) {
                        org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25051p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        bb1Var.finishFragment();
                    }
                }
            }
            if (bb1Var.N) {
                bb1Var.B0();
                bb1Var.H0();
            }
            org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, bb1Var.U);
        }
    }

    public static void h0(bb1 bb1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bb1Var.U = password;
            TwoStepVerificationActivity.r0(password);
            bb1Var.J0(z9);
            org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, bb1Var.U);
        }
    }

    public static void i0(bb1 bb1Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = bb1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(new TL_account.getPassword(), new fi.d3(11, bb1Var, z9), 8);
            return;
        }
        bb1Var.B0();
        int i7 = org.telegram.messenger.qs.f25051p0;
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            bb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
            int i10 = org.telegram.messenger.qs.f25057q0;
            if (z9) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.f2) arrayList.get(i11)).removeSelfFromStack();
                }
                org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25064r0, new Object[0]);
                org.telegram.messenger.qs.f(bb1Var.currentAccount).k(i10, new Object[0]);
                bb1Var.finishFragment();
            } else if (bb1Var.getParentActivity() != null) {
                if (bb1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new nk0(22, bb1Var, bArr));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    if (str == null && (password = bb1Var.U) != null && password.has_password) {
                        u1Var.T = org.telegram.messenger.id.M0(2131742813, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131742804, null);
                    }
                    u1Var.R = org.telegram.messenger.id.M0(2131742798, null);
                    Dialog showDialog = bb1Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((org.telegram.ui.ActionBar.f2) arrayList.get(i12)).removeSelfFromStack();
                }
                TL_account.Password password2 = bb1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (bb1Var.Y) {
                    org.telegram.messenger.qs.f(bb1Var.currentAccount).k(i7, new Object[0]);
                }
                bb1 bb1Var2 = new bb1(7, bb1Var.U);
                bb1Var2.H = bb1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = bb1Var.V;
                }
                bb1Var2.I0(bArr3, bb1Var.W, bb1Var.X, bb1Var.Z);
                bb1Var2.Y = bb1Var.Y;
                bb1Var2.G = bb1Var.G;
                bb1Var.presentFragment(bb1Var2, true);
                org.telegram.messenger.qs.f(bb1Var.currentAccount).k(i10, bb1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    bb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.M0(2131747445, null));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    bb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.M0(2131751200, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    bb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                    return;
                } else {
                    bb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            org.telegram.messenger.qs.f(bb1Var.currentAccount).k(i7, new Object[0]);
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((org.telegram.ui.ActionBar.f2) arrayList.get(i13)).removeSelfFromStack();
            }
            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(bb1Var.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = bb1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = bb1Var.R;
            f10.k(i7, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, bb1Var.Q, str2, bb1Var.P);
            TL_account.Password password4 = bb1Var.U;
            password4.email_unconfirmed_pattern = bb1Var.R;
            bb1 bb1Var3 = new bb1(5, password4);
            bb1Var3.H = bb1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = bb1Var.V;
            }
            bb1Var3.I0(bArr2, bb1Var.W, bb1Var.X, bb1Var.Z);
            bb1Var3.Y = bb1Var.Y;
            bb1Var3.G = bb1Var.G;
            bb1Var.presentFragment(bb1Var3, true);
        }
    }

    public static void j0(bb1 bb1Var, TLRPC.TL_error tL_error) {
        bb1Var.B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = bb1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, bb1Var.V, bb1Var.W, bb1Var.X);
            twoStepVerificationActivity.X = bb1Var.G;
            bb1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25064r0, new Object[0]);
            n90 n90Var = bb1Var.f43964j0;
            if (n90Var != null) {
                org.telegram.messenger.g0.h3(n90Var);
                bb1Var.f43964j0 = null;
            }
        }
    }

    public static void k0(bb1 bb1Var) {
        ArrayList arrayList = bb1Var.J;
        if (bb1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new ta1(bb1Var, 4));
            boolean z9 = bb1Var.U.has_recovery;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            if (z9) {
                u1Var.T = org.telegram.messenger.id.M0(2131742814, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131742813, null);
            }
            u1Var.R = org.telegram.messenger.id.M0(2131742798, null);
            Dialog showDialog = bb1Var.showDialog(u1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        TL_account.Password password = bb1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        bb1 bb1Var2 = new bb1(7, password);
        bb1Var2.H = bb1Var.H;
        bb1Var2.I0(bb1Var.V, bb1Var.W, bb1Var.X, bb1Var.Z);
        bb1Var2.J.addAll(arrayList);
        bb1Var2.Y = bb1Var.Y;
        bb1Var2.G = bb1Var.G;
        bb1Var.presentFragment(bb1Var2, true);
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(bb1Var.currentAccount);
        byte[] bArr = bb1Var.V;
        TL_account.Password password2 = bb1Var.U;
        f10.k(org.telegram.messenger.qs.f25051p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, bb1Var.R, bb1Var.Q, null, bb1Var.P);
        org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, bb1Var.U);
    }

    public static void l0(bb1 bb1Var, String str) {
        bb1 bb1Var2 = new bb1(bb1Var.currentAccount, 0, bb1Var.U);
        bb1Var2.H = bb1Var.H;
        bb1Var2.J.addAll(bb1Var.J);
        bb1Var2.J.add(bb1Var);
        bb1Var2.f43951a0 = str;
        bb1Var2.G = bb1Var.G;
        bb1Var.presentFragment(bb1Var2, true);
    }

    public static void m0(bb1 bb1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bb1Var.U = password;
            TwoStepVerificationActivity.r0(password);
            org.telegram.messenger.qs.f(bb1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, bb1Var.U);
            bb1Var.H0();
        }
    }

    public static org.telegram.ui.ActionBar.k o0(bb1 bb1Var) {
        return bb1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k p0(bb1 bb1Var) {
        return bb1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k y0(bb1 bb1Var) {
        return bb1Var.actionBar;
    }

    public final boolean A0() {
        int i7 = this.O;
        if ((i7 == 5 || i7 == 4) && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        this.f43955c0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f43955c0.f(true, true);
        }
    }

    public final void D0() {
        dr[] drVarArr;
        for (dr drVar : this.f43969x.f43768f) {
            drVar.setText("");
            drVar.z(1.0f);
        }
        this.f43969x.f43768f[0].requestFocus();
        org.telegram.messenger.g0.G3(8.0f, this.f43969x, new sa1(this, 6));
    }

    public final void E0(org.telegram.ui.Components.mb0 mb0Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
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
        org.telegram.messenger.g0.G3(5.0f, mb0Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            bb1 bb1Var = new bb1(this.currentAccount, 3, password);
            bb1Var.H = this.H;
            bb1Var.I0(this.V, this.W, this.X, this.Z);
            bb1Var.P = this.P;
            bb1Var.Q = this.Q;
            bb1Var.J.addAll(this.J);
            bb1Var.J.add(this);
            bb1Var.Y = this.Y;
            bb1Var.G = this.G;
            presentFragment(bb1Var);
            return;
        }
        this.R = "";
        J0(false);
    }

    public final void H0() {
        if (getParentActivity() != null) {
            int i7 = 2;
            switch (this.O) {
                case 0:
                case 1:
                    if (this.f43965n.length() == 0) {
                        E0(this.f43967s, this.f43965n, false);
                        return;
                    } else if (!this.f43965n.getText().toString().equals(this.P) && this.O == 1) {
                        org.telegram.messenger.g0.G3(5.0f, this.f43967s, null);
                        try {
                            this.f43967s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131747446, null), 0).show();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else {
                        int i10 = this.currentAccount;
                        if (this.O == 0) {
                            i7 = 1;
                        }
                        bb1 bb1Var = new bb1(i10, i7, this.U);
                        bb1Var.H = this.H;
                        bb1Var.P = this.f43965n.getText().toString();
                        bb1Var.I0(this.V, this.W, this.X, this.Z);
                        bb1Var.f43951a0 = this.f43951a0;
                        bb1Var.J.addAll(this.J);
                        bb1Var.J.add(this);
                        bb1Var.Y = this.Y;
                        bb1Var.G = this.G;
                        presentFragment(bb1Var);
                        return;
                    }
                case 2:
                    String obj = this.f43965n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131747448, null), 0).show();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        E0(this.f43967s, this.f43965n, false);
                        return;
                    }
                    F0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f43965n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            J0(false);
                            return;
                        }
                    }
                    E0(this.f43967s, this.f43965n, false);
                    return;
                case 4:
                    String code = this.f43969x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new o41(4, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f43969x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ua1(this, 2), 10);
                    C0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        C0();
                        this.N = true;
                        return;
                    }
                    bb1 bb1Var2 = new bb1(this.currentAccount, 0, password);
                    bb1Var2.H = this.H;
                    bb1Var2.Y = this.Y;
                    bb1Var2.G = this.G;
                    presentFragment(bb1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle k10 = a8.p0.k("afterSignup", true);
                        le0 le0Var = new le0();
                        le0Var.r0(k10);
                        presentFragment(le0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        n90 n90Var = this.f43964j0;
                        if (n90Var != null) {
                            org.telegram.messenger.g0.h3(n90Var);
                            this.f43964j0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.U == null) {
                        C0();
                        this.N = true;
                        return;
                    }
                    String obj3 = this.f43965n.getText().toString();
                    if (obj3.length() == 0) {
                        E0(this.f43967s, this.f43965n, false);
                        return;
                    }
                    byte[] h12 = org.telegram.messenger.g0.h1(obj3);
                    C0();
                    Utilities.f21336e.c(new va1(this, h12, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void I0(byte[] bArr, long j3, byte[] bArr2, boolean z9) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j3;
        this.Z = z9;
    }

    public final void J0(boolean z9) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z9 && this.T && this.U.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new ua1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z9) {
            org.telegram.messenger.p10.i(this.currentAccount).u();
            this.X = null;
            if (this.T) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            if (this.Q == null && (password = this.U) != null) {
                this.Q = password.hint;
            }
            if (this.Q == null) {
                this.Q = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.Q;
                passwordinputsettings.new_algo = this.U.new_algo;
            }
            if (this.R.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.R.trim();
            }
        }
        if (this.f43951a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f43951a0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.V;
            if (bArr == null || bArr.length == 0 || (z9 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.f21336e.c(new fi.q1(this, updatepasswordsettings3, z9, str, passwordinputsettings));
    }

    public final void K0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bb1.K0(boolean):void");
    }

    public final void L0(String str, String str2) {
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

    public final void M0(boolean z9) {
        boolean z10;
        Integer num;
        if (this.f43952b.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f43952b;
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z9) {
            this.f43952b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.f43957e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f43957e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f43957e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f43952b, property, 1.0f), ObjectAnimator.ofFloat(this.f43952b, property2, 1.0f), ObjectAnimator.ofFloat(this.f43952b, property3, 1.0f));
        } else {
            this.f43957e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f43952b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f43952b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f43952b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f43957e, property4, 1.0f), ObjectAnimator.ofFloat(this.f43957e, property5, 1.0f), ObjectAnimator.ofFloat(this.f43957e, property6, 1.0f));
        }
        this.I.addListener(new b50(11, this, z9));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131742948, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.G(this.G, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743933, null), null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131750594, null), new ta1(this, 0));
        org.telegram.ui.ActionBar.s6.U((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.l6.f28106q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        ?? r12;
        ?? r92;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.l(kVar, 5, i13, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 1, i13, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, org.telegram.ui.ActionBar.l6.f28183u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new za1(this));
        int i14 = this.O;
        if (i14 == 5) {
            this.actionBar.r().a(0, 2131231244).f(1, org.telegram.messenger.id.M0(2131754947, null));
        }
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.f43955c0 = q00Var;
        this.f43953b0 = new h6.m(q00Var);
        this.f43955c0.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f48681b;

            {
                this.f48681b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                bb1 bb1Var = this.f48681b;
                switch (i15) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746093, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.O;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742815, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView = (TextView) u1Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                bb1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (bb1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bb1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bb1Var.G;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            n90 n90Var = bb1Var.f43964j0;
                            if (n90Var != null) {
                                org.telegram.messenger.g0.h3(n90Var);
                                bb1Var.f43964j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.O;
                        bb1Var.M = true;
                        if (bb1Var.f43965n.getTransformationMethod() == null) {
                            bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(-1);
                                org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var = bb1Var.f43960f0[3];
                                if (animatedDrawable != ah0Var) {
                                    bb1Var.f43950a.setAnimation(ah0Var);
                                    bb1Var.f43960f0[3].N(18, false, false);
                                }
                                bb1Var.f43950a.d();
                            }
                        } else {
                            bb1Var.f43965n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(18);
                                org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                if (animatedDrawable2 != ah0Var2) {
                                    bb1Var.f43950a.setAnimation(ah0Var2);
                                }
                                bb1Var.f43960f0[3].T(false, 0.0f);
                                bb1Var.f43950a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f43965n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.u11 u11Var = new org.telegram.ui.Components.u11(context);
        this.f43956d0 = u11Var;
        u11Var.setTransformType(1);
        this.f43956d0.setProgress(0.0f);
        this.f43956d0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O9, false));
        this.f43956d0.setDrawBackground(false);
        this.f43955c0.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.f43955c0.addView(this.f43956d0, c8.ha.e(56, 56, 17));
        this.f43955c0.a(this.f43956d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28065o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        h6.m.g(this.h);
        this.h.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f48681b;

            {
                this.f48681b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                bb1 bb1Var = this.f48681b;
                switch (i15) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746093, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.O;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742815, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView2 = (TextView) u1Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                bb1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (bb1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bb1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bb1Var.G;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            n90 n90Var = bb1Var.f43964j0;
                            if (n90Var != null) {
                                org.telegram.messenger.g0.h3(n90Var);
                                bb1Var.f43964j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.O;
                        bb1Var.M = true;
                        if (bb1Var.f43965n.getTransformationMethod() == null) {
                            bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(-1);
                                org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var = bb1Var.f43960f0[3];
                                if (animatedDrawable != ah0Var) {
                                    bb1Var.f43950a.setAnimation(ah0Var);
                                    bb1Var.f43960f0[3].N(18, false, false);
                                }
                                bb1Var.f43950a.d();
                            }
                        } else {
                            bb1Var.f43965n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(18);
                                org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                if (animatedDrawable2 != ah0Var2) {
                                    bb1Var.f43950a.setAnimation(ah0Var2);
                                }
                                bb1Var.f43960f0[3].T(false, 0.0f);
                                bb1Var.f43950a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f43965n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f43950a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i14 == 2 && org.telegram.messenger.g0.O1()) {
            this.f43950a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.dh0 dh0Var = this.f43950a;
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            dh0Var.setVisibility(i7);
        }
        TextView textView2 = new TextView(context);
        this.f43954c = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, i13, null);
        this.f43954c.setGravity(1);
        this.f43954c.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f43954c.setTextSize(1, 24.0f);
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        int i15 = org.telegram.ui.ActionBar.l6.D6;
        org.telegram.ui.ActionBar.s6.U(lVar, i15, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f43957e = textView3;
        org.telegram.ui.ActionBar.s6.U(textView3, i15, null);
        this.f43957e.setGravity(1);
        this.f43957e.setTextSize(1, 14.0f);
        this.f43957e.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f43957e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f43957e.setVisibility(8);
        this.f43957e.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f48681b;

            {
                this.f48681b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                bb1 bb1Var = this.f48681b;
                switch (i152) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746093, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.O;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742815, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView22 = (TextView) u1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView22, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                bb1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (bb1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bb1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bb1Var.G;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            n90 n90Var = bb1Var.f43964j0;
                            if (n90Var != null) {
                                org.telegram.messenger.g0.h3(n90Var);
                                bb1Var.f43964j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.O;
                        bb1Var.M = true;
                        if (bb1Var.f43965n.getTransformationMethod() == null) {
                            bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(-1);
                                org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var = bb1Var.f43960f0[3];
                                if (animatedDrawable != ah0Var) {
                                    bb1Var.f43950a.setAnimation(ah0Var);
                                    bb1Var.f43960f0[3].N(18, false, false);
                                }
                                bb1Var.f43950a.d();
                            }
                        } else {
                            bb1Var.f43965n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(18);
                                org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                if (animatedDrawable2 != ah0Var2) {
                                    bb1Var.f43950a.setAnimation(ah0Var2);
                                }
                                bb1Var.f43960f0[3].T(false, 0.0f);
                                bb1Var.f43950a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f43965n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f43952b = textView4;
        textView4.setMinWidth(org.telegram.messenger.g0.L(220.0f));
        this.f43952b.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f43952b.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(this.f43952b, org.telegram.ui.ActionBar.l6.Gi, null);
        this.f43952b.setTextSize(1, 15.0f);
        this.f43952b.setTypeface(org.telegram.messenger.g0.o());
        this.f43952b.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 24.0f));
        this.f43952b.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f48681b;

            {
                this.f48681b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                bb1 bb1Var = this.f48681b;
                switch (i152) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746093, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.O;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742815, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView22 = (TextView) u1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView22, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                bb1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (bb1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bb1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bb1Var.G;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            n90 n90Var = bb1Var.f43964j0;
                            if (n90Var != null) {
                                org.telegram.messenger.g0.h3(n90Var);
                                bb1Var.f43964j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.O;
                        bb1Var.M = true;
                        if (bb1Var.f43965n.getTransformationMethod() == null) {
                            bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(-1);
                                org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var = bb1Var.f43960f0[3];
                                if (animatedDrawable != ah0Var) {
                                    bb1Var.f43950a.setAnimation(ah0Var);
                                    bb1Var.f43960f0[3].N(18, false, false);
                                }
                                bb1Var.f43950a.d();
                            }
                        } else {
                            bb1Var.f43965n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                bb1Var.f43960f0[3].P(18);
                                org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                if (animatedDrawable2 != ah0Var2) {
                                    bb1Var.f43950a.setAnimation(ah0Var2);
                                }
                                bb1Var.f43960f0[3].T(false, 0.0f);
                                bb1Var.f43950a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f43965n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.M = false;
                        return;
                }
            }
        });
        if (i14 != 6 && i14 != 7 && i14 != 9) {
            this.f43954c.setTypeface(org.telegram.messenger.g0.o());
            this.f43954c.setTextSize(1, 18.0f);
        } else {
            this.f43954c.setTypeface(Typeface.DEFAULT);
            this.f43954c.setTextSize(1, 24.0f);
        }
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                k0 k0Var = new k0(28, context, this);
                ii0 ii0Var = new ii0(this, context, k0Var, 1);
                ii0Var.addView(k0Var);
                p9 p9Var = new p9(this, context, ii0Var);
                ab1 ab1Var = new ab1(this, context);
                this.f43970y = ab1Var;
                ab1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.f43970y, c8.ha.c(-1.0f, -1));
                k0Var.addView(this.h, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                k0Var.addView(this.f43955c0, org.telegram.ui.Components.q00.b());
                p9Var.addView(ii0Var, c8.ha.c(-1.0f, -1));
                d61 d61Var = new d61(21, context, this);
                d61Var.setOrientation(1);
                this.f43970y.addView(d61Var, c8.ha.x(-1, -1, 51));
                d61Var.addView(this.f43950a, c8.ha.t(-2, -2, 49, 0, 69, 0, 0));
                d61Var.addView(this.f43954c, c8.ha.t(-2, -2, 49, 0, 8, 0, 0));
                d61Var.addView(this.d, c8.ha.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
                this.f43967s = mb0Var;
                mb0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f43965n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.g0.L(16.0f);
                this.f43965n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.f43965n;
                int i16 = org.telegram.ui.ActionBar.l6.f28012l6;
                org.telegram.ui.ActionBar.s6.v(editTextBoldCursor2, i16, null);
                org.telegram.ui.ActionBar.s6.U(this.f43965n, i13, null);
                this.f43965n.setBackground(null);
                this.f43965n.setMaxLines(1);
                this.f43965n.setLines(1);
                this.f43965n.setGravity(3);
                this.f43965n.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f43965n.setSingleLine(true);
                this.f43965n.setCursorWidth(1.5f);
                this.f43965n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final bb1 f48997b;

                    {
                        this.f48997b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i17, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                bb1 bb1Var = this.f48997b;
                                bb1Var.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                bb1Var.H0();
                                return true;
                            default:
                                bb1 bb1Var2 = this.f48997b;
                                bb1Var2.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                if (bb1Var2.f43968w.getVisibility() == 0) {
                                    bb1Var2.f43966r.requestFocus();
                                } else {
                                    bb1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f43967s.e(this.f43965n);
                this.f43965n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final bb1 f49395b;

                    {
                        this.f49395b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.mb0 mb0Var2 = this.f49395b.f43968w;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                mb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                bb1 bb1Var = this.f49395b;
                                if (z11) {
                                    bb1Var.f43958e0.setEditText((EditText) view);
                                    bb1Var.f43958e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                bb1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.mb0 mb0Var3 = this.f49395b.f43967s;
                                if (z11) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                mb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f43965n, c8.ha.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(4, context, this);
                this.E = f0Var;
                f0Var.setImageResource(2131232224);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(org.telegram.messenger.id.M0(2131743932, null));
                org.telegram.ui.ActionBar.f0 f0Var2 = this.E;
                int i17 = org.telegram.ui.ActionBar.l6.f27957i6;
                org.telegram.ui.ActionBar.s6.Q(f0Var2, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i17, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i17), null);
                org.telegram.ui.ActionBar.s6.s(this.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.g0.Z3(this.E, false, 0.1f, true, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final bb1 f48681b;

                    {
                        this.f48681b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        bb1 bb1Var = this.f48681b;
                        switch (i152) {
                            case 0:
                                bb1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                                String M0 = org.telegram.messenger.id.M0(2131746093, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                                bb1Var.showDialog(u1Var);
                                return;
                            case 2:
                                bb1.a0(bb1Var);
                                return;
                            case 3:
                                if (bb1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = bb1Var.O;
                                    if (i162 == 0) {
                                        bb1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                        bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                        String M02 = org.telegram.messenger.id.M0(2131742815, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.T = M02;
                                        u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        bb1Var.showDialog(u1Var2);
                                        TextView textView22 = (TextView) u1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.s6.U(textView22, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        bb1Var.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (bb1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = bb1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = bb1Var.G;
                                    bb1Var.presentFragment(twoStepVerificationActivity, true);
                                    n90 n90Var = bb1Var.f43964j0;
                                    if (n90Var != null) {
                                        org.telegram.messenger.g0.h3(n90Var);
                                        bb1Var.f43964j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                bb1Var.H0();
                                return;
                            default:
                                int i172 = bb1Var.O;
                                bb1Var.M = true;
                                if (bb1Var.f43965n.getTransformationMethod() == null) {
                                    bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                        bb1Var.f43960f0[3].P(-1);
                                        org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ah0 ah0Var = bb1Var.f43960f0[3];
                                        if (animatedDrawable != ah0Var) {
                                            bb1Var.f43950a.setAnimation(ah0Var);
                                            bb1Var.f43960f0[3].N(18, false, false);
                                        }
                                        bb1Var.f43950a.d();
                                    }
                                } else {
                                    bb1Var.f43965n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                        bb1Var.f43960f0[3].P(18);
                                        org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                        if (animatedDrawable2 != ah0Var2) {
                                            bb1Var.f43950a.setAnimation(ah0Var2);
                                        }
                                        bb1Var.f43960f0[3].T(false, 0.0f);
                                        bb1Var.f43950a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = bb1Var.f43965n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                bb1Var.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, c8.ha.t(24, 24, 16, 0, 0, 16, 0));
                this.f43965n.addTextChangedListener(new ya1(this, 2));
                this.f43967s.addView(linearLayout, c8.ha.c(-2.0f, -1));
                d61Var.addView(this.f43967s, c8.ha.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.f43968w = new org.telegram.ui.Components.mb0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f43966r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.f43966r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.s6.v(this.f43966r, i16, null);
                org.telegram.ui.ActionBar.s6.U(this.f43966r, i13, null);
                this.f43966r.setBackground(null);
                this.f43966r.setMaxLines(1);
                this.f43966r.setLines(1);
                this.f43966r.setGravity(3);
                this.f43966r.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f43966r.setSingleLine(true);
                this.f43966r.setCursorWidth(1.5f);
                this.f43966r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final bb1 f48997b;

                    {
                        this.f48997b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i172, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                bb1 bb1Var = this.f48997b;
                                bb1Var.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                bb1Var.H0();
                                return true;
                            default:
                                bb1 bb1Var2 = this.f48997b;
                                bb1Var2.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                if (bb1Var2.f43968w.getVisibility() == 0) {
                                    bb1Var2.f43966r.requestFocus();
                                } else {
                                    bb1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f43968w.e(this.f43966r);
                this.f43966r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final bb1 f49395b;

                    {
                        this.f49395b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.mb0 mb0Var2 = this.f49395b.f43968w;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                mb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                bb1 bb1Var = this.f49395b;
                                if (z11) {
                                    bb1Var.f43958e0.setEditText((EditText) view);
                                    bb1Var.f43958e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                bb1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.mb0 mb0Var3 = this.f49395b.f43967s;
                                if (z11) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                mb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                this.f43968w.addView(this.f43966r, c8.ha.c(-2.0f, -1));
                d61Var.addView(this.f43968w, c8.ha.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.f43968w.setVisibility(8);
                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
                this.f43958e0 = brVar;
                brVar.setVisibility(8);
                ii0Var.addView(this.f43958e0);
                nb0 nb0Var = new nb0(3, context, this);
                this.f43969x = nb0Var;
                final int i18 = 1;
                nb0Var.b(6, 1);
                dr[] drVarArr = this.f43969x.f43768f;
                int length = drVarArr.length;
                int i19 = 0;
                while (i19 < length) {
                    dr drVar = drVarArr[i19];
                    drVar.setShowSoftInputOnFocusCompat(A0() ^ i18);
                    drVar.addTextChangedListener(new ya1(this, 0));
                    drVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final bb1 f49395b;

                        {
                            this.f49395b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f10;
                            float f11;
                            switch (i18) {
                                case 0:
                                    org.telegram.ui.Components.mb0 mb0Var2 = this.f49395b.f43968w;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    mb0Var2.b(f10, f10, true);
                                    return;
                                case 1:
                                    bb1 bb1Var = this.f49395b;
                                    if (z11) {
                                        bb1Var.f43958e0.setEditText((EditText) view);
                                        bb1Var.f43958e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    bb1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.mb0 mb0Var3 = this.f49395b.f43967s;
                                    if (z11) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    mb0Var3.b(f11, f11, true);
                                    return;
                            }
                        }
                    });
                    i19++;
                    i18 = 1;
                }
                this.f43969x.setVisibility(8);
                d61Var.addView(this.f43969x, c8.ha.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                d61Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f43957e, c8.ha.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f43959f = textView5;
                    org.telegram.ui.ActionBar.s6.U(textView5, org.telegram.ui.ActionBar.l6.J6, null);
                    this.f43959f.setGravity(1);
                    this.f43959f.setTextSize(1, 14.0f);
                    this.f43959f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.f43959f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    this.f43959f.setText(org.telegram.messenger.id.M0(2131746076, null));
                    d61Var.addView(this.f43959f, c8.ha.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f43959f.setOnClickListener(new View.OnClickListener(this) {
                        public final bb1 f48681b;

                        {
                            this.f48681b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i152 = r2;
                            bb1 bb1Var = this.f48681b;
                            switch (i152) {
                                case 0:
                                    bb1Var.H0();
                                    return;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                                    String M0 = org.telegram.messenger.id.M0(2131746093, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                                    bb1Var.showDialog(u1Var);
                                    return;
                                case 2:
                                    bb1.a0(bb1Var);
                                    return;
                                case 3:
                                    if (bb1Var.h.getAlpha() >= 0.5f) {
                                        int i162 = bb1Var.O;
                                        if (i162 == 0) {
                                            bb1Var.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                            bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                            return;
                                        } else if (i162 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                            String M02 = org.telegram.messenger.id.M0(2131742815, null);
                                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                            u1Var2.T = M02;
                                            u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                            bb1Var.showDialog(u1Var2);
                                            TextView textView22 = (TextView) u1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.s6.U(textView22, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                                return;
                                            }
                                            return;
                                        } else if (i162 == 2) {
                                            bb1Var.F0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    if (bb1Var.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = bb1Var.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = bb1Var.G;
                                        bb1Var.presentFragment(twoStepVerificationActivity, true);
                                        n90 n90Var = bb1Var.f43964j0;
                                        if (n90Var != null) {
                                            org.telegram.messenger.g0.h3(n90Var);
                                            bb1Var.f43964j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    bb1Var.H0();
                                    return;
                                default:
                                    int i172 = bb1Var.O;
                                    bb1Var.M = true;
                                    if (bb1Var.f43965n.getTransformationMethod() == null) {
                                        bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                            bb1Var.f43960f0[3].P(-1);
                                            org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ah0 ah0Var = bb1Var.f43960f0[3];
                                            if (animatedDrawable != ah0Var) {
                                                bb1Var.f43950a.setAnimation(ah0Var);
                                                bb1Var.f43960f0[3].N(18, false, false);
                                            }
                                            bb1Var.f43950a.d();
                                        }
                                    } else {
                                        bb1Var.f43965n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                            bb1Var.f43960f0[3].P(18);
                                            org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                            if (animatedDrawable2 != ah0Var2) {
                                                bb1Var.f43950a.setAnimation(ah0Var2);
                                            }
                                            bb1Var.f43960f0[3].T(false, 0.0f);
                                            bb1Var.f43950a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = bb1Var.f43965n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    bb1Var.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = p9Var;
                fi.p5 p5Var = new fi.p5(this, context);
                this.D = p5Var;
                p5Var.setAlpha(0.0f);
                p9Var.addView(this.D);
                p9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28012l6, false));
                k0Var.addView(this.L, c8.ha.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(1, context, this);
                eVar.setOnTouchListener(new ei.b(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.f43950a);
                eVar.addView(this.f43954c);
                eVar.addView(this.d);
                eVar.addView(this.f43952b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, this.fragmentView, null);
        String str = "";
        switch (i14) {
            case 0:
            case 1:
                int i20 = 2131746413;
                if (this.U.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747211, null));
                    this.f43954c.setText(org.telegram.messenger.id.M0(2131747211, null));
                } else {
                    if (i14 == 0) {
                        i10 = 2131751705;
                    } else {
                        i10 = 2131746413;
                    }
                    String M0 = org.telegram.messenger.id.M0(i10, null);
                    this.actionBar.setTitle(M0);
                    this.f43954c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.f43951a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.id.M0(2131742817, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.mb0 mb0Var2 = this.f43967s;
                if (i14 == 0) {
                    i11 = 2131751116;
                } else {
                    i11 = 2131746413;
                }
                mb0Var2.setText(org.telegram.messenger.id.M0(i11, null));
                EditTextBoldCursor editTextBoldCursor4 = this.f43965n;
                if (i14 == 0) {
                    i20 = 2131751116;
                }
                editTextBoldCursor4.setContentDescription(org.telegram.messenger.id.M0(i20, null));
                this.f43965n.setImeOptions(268435461);
                this.f43965n.setInputType(129);
                this.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f43965n.setTypeface(Typeface.DEFAULT);
                if (i14 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.F = z9;
                org.telegram.messenger.g0.Z3(this.E, false, 0.1f, true, false);
                org.telegram.ui.Components.ah0[] ah0VarArr = new org.telegram.ui.Components.ah0[7];
                this.f43960f0 = ah0VarArr;
                ah0VarArr[0] = new org.telegram.ui.Components.ah0(2131624309, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f43960f0[1] = new org.telegram.ui.Components.ah0(2131624310, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f43960f0[2] = new org.telegram.ui.Components.ah0(2131624302, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f43960f0[3] = new org.telegram.ui.Components.ah0(2131624311, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f43960f0[4] = new org.telegram.ui.Components.ah0(2131624308, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f43960f0[5] = new org.telegram.ui.Components.ah0(2131624307, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f43960f0[6] = new org.telegram.ui.Components.ah0(2131624312, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                org.telegram.ui.Components.ah0 ah0Var = this.f43960f0[6];
                ah0Var.h = true;
                ah0Var.P(19);
                this.f43960f0[2].S(97, this.f43963i0);
                K0(true);
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    sa1 sa1Var = this.f43961g0;
                    if (sa1Var != null) {
                        org.telegram.messenger.g0.r(sa1Var);
                    }
                    this.f43950a.setAnimation(this.f43960f0[6]);
                    this.f43950a.d();
                    i12 = 1;
                    break;
                } else {
                    EditTextBoldCursor editTextBoldCursor5 = this.f43965n;
                    ArrayList arrayList = editTextBoldCursor5.f31346f1;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.onTextChanged(editTextBoldCursor5.getText(), 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.afterTextChanged(editTextBoldCursor5.getText());
                    }
                    i12 = 1;
                    K0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747444, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.id.M0(2131742817, null));
                this.f43954c.setText(org.telegram.messenger.id.M0(2131747444, null));
                this.d.setText(org.telegram.messenger.id.M0(2131747443, null));
                this.d.setVisibility(0);
                this.f43967s.setText(org.telegram.messenger.id.M0(2131747442, null));
                this.f43965n.setContentDescription(org.telegram.messenger.id.M0(2131747442, null));
                this.f43965n.setImeOptions(268435461);
                this.f43968w.setVisibility(8);
                this.f43950a.f(2131624304, 120, 120, null);
                this.f43950a.d();
                i12 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131746344, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.Z) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.id.M0(2131742817, null));
                } else {
                    r12 = 0;
                }
                this.f43954c.setText(org.telegram.messenger.id.M0(2131746344, r12));
                this.d.setText(org.telegram.messenger.id.M0(2131746345, r12));
                this.d.setVisibility(0);
                this.f43967s.setText(org.telegram.messenger.id.M0(2131747376, r12));
                this.f43965n.setContentDescription(org.telegram.messenger.id.M0(2131747376, r12));
                this.f43965n.setImeOptions(268435461);
                this.f43965n.setInputType(33);
                this.f43968w.setVisibility(8);
                this.f43950a.f(2131624303, 120, 120, r12);
                this.f43950a.d();
                i12 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747437, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f43954c.setText(org.telegram.messenger.id.M0(2131747437, null));
                this.f43958e0.setVisibility(0);
                this.f43967s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj2 = new Object();
                    obj2.f39836a |= 256;
                    obj2.f39837b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj2.f39838c = i22;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.wy0(obj2, 0), indexOf, i22, 0);
                } else {
                    r92 = 0;
                }
                xh.l lVar2 = this.d;
                String M02 = org.telegram.messenger.id.M0(2131746080, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                lVar2.setText(org.telegram.messenger.g0.m0(M02, charSequenceArr));
                this.d.setVisibility(r92);
                this.f43955c0.e(r92, r92);
                this.f43969x.setVisibility(r92);
                this.f43950a.f(2131624306, 120, 120, null);
                this.f43950a.d();
                i12 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131743619, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f43954c.setText(org.telegram.messenger.id.M0(2131743619, null));
                this.f43967s.setVisibility(8);
                this.f43958e0.setVisibility(0);
                xh.l lVar3 = this.d;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                lVar3.setText(org.telegram.messenger.id.a0("EmailPasswordConfirmText2", null, 2131751199, str));
                this.d.setVisibility(0);
                this.f43955c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.id.M0(2131746121, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final bb1 f48681b;

                    {
                        this.f48681b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        bb1 bb1Var = this.f48681b;
                        switch (i152) {
                            case 0:
                                bb1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new ta1(bb1Var, 1));
                                String M03 = org.telegram.messenger.id.M0(2131746093, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M03;
                                u1Var.T = org.telegram.messenger.id.M0(2131746074, null);
                                bb1Var.showDialog(u1Var);
                                return;
                            case 2:
                                bb1.a0(bb1Var);
                                return;
                            case 3:
                                if (bb1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = bb1Var.O;
                                    if (i162 == 0) {
                                        bb1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = bb1Var.f43951a0;
                                        bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                        String M022 = org.telegram.messenger.id.M0(2131742815, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.T = M022;
                                        u1Var2.R = org.telegram.messenger.id.M0(2131742816, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742817, null), new ta1(bb1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        bb1Var.showDialog(u1Var2);
                                        TextView textView22 = (TextView) u1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.s6.U(textView22, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        bb1Var.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (bb1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = bb1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = bb1Var.G;
                                    bb1Var.presentFragment(twoStepVerificationActivity, true);
                                    n90 n90Var = bb1Var.f43964j0;
                                    if (n90Var != null) {
                                        org.telegram.messenger.g0.h3(n90Var);
                                        bb1Var.f43964j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                bb1Var.H0();
                                return;
                            default:
                                int i172 = bb1Var.O;
                                bb1Var.M = true;
                                if (bb1Var.f43965n.getTransformationMethod() == null) {
                                    bb1Var.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                        bb1Var.f43960f0[3].P(-1);
                                        org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ah0 ah0Var2 = bb1Var.f43960f0[3];
                                        if (animatedDrawable != ah0Var2) {
                                            bb1Var.f43950a.setAnimation(ah0Var2);
                                            bb1Var.f43960f0[3].N(18, false, false);
                                        }
                                        bb1Var.f43950a.d();
                                    }
                                } else {
                                    bb1Var.f43965n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.s6.s(bb1Var.E, org.telegram.ui.ActionBar.l6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f43965n.length() > 0 && bb1Var.f43965n.hasFocus()) {
                                        bb1Var.f43960f0[3].P(18);
                                        org.telegram.ui.Components.ah0 animatedDrawable2 = bb1Var.f43950a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ah0 ah0Var22 = bb1Var.f43960f0[3];
                                        if (animatedDrawable2 != ah0Var22) {
                                            bb1Var.f43950a.setAnimation(ah0Var22);
                                        }
                                        bb1Var.f43960f0[3].T(false, 0.0f);
                                        bb1Var.f43950a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = bb1Var.f43965n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                bb1Var.M = false;
                                return;
                        }
                    }
                });
                this.f43969x.setVisibility(0);
                this.f43950a.f(2131624306, 120, 120, null);
                this.f43950a.d();
                i12 = 1;
                break;
            case 6:
                this.f43954c.setText(org.telegram.messenger.id.M0(2131743931, null));
                this.d.setText(org.telegram.messenger.id.M0(2131745548, null));
                this.f43952b.setText(org.telegram.messenger.id.M0(2131743933, null));
                this.d.setVisibility(0);
                this.f43950a.f(2131624305, 140, 140, null);
                this.f43950a.d();
                i12 = 1;
                break;
            case 7:
                this.f43954c.setText(org.telegram.messenger.id.M0(2131743935, null));
                this.d.setText(org.telegram.messenger.id.M0(2131743934, null));
                if (this.Y) {
                    this.f43952b.setText(org.telegram.messenger.id.M0(2131743937, null));
                } else if (this.H) {
                    this.f43952b.setText(org.telegram.messenger.id.M0(2131751771, null));
                } else {
                    this.f43952b.setText(org.telegram.messenger.id.M0(2131743936, null));
                }
                this.d.setVisibility(0);
                this.f43950a.f(2131624353, 160, 160, null);
                this.f43950a.d();
                i12 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747217, null));
                this.f43954c.setText(org.telegram.messenger.id.M0(2131747217, null));
                this.d.setText(org.telegram.messenger.id.M0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f43957e.setText(org.telegram.messenger.id.M0(2131750591, null));
                org.telegram.ui.ActionBar.s6.U(this.f43957e, org.telegram.ui.ActionBar.l6.f28065o6, null);
                this.f43967s.setText(org.telegram.messenger.id.M0(2131748726, null));
                this.f43965n.setContentDescription(org.telegram.messenger.id.M0(2131748726, null));
                this.f43965n.setImeOptions(268435462);
                this.f43965n.setInputType(129);
                this.f43965n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f43965n.setTypeface(Typeface.DEFAULT);
                this.f43950a.f(2131624359, 120, 120, null);
                this.f43950a.d();
                i12 = 1;
                break;
            case 9:
                this.f43954c.setText(org.telegram.messenger.id.M0(2131752159, null));
                this.d.setText(org.telegram.messenger.id.M0(2131752158, null));
                this.f43952b.setText(org.telegram.messenger.id.M0(2131752161, null));
                this.d.setVisibility(0);
                this.f43950a.f(2131624358, 140, 140, null);
                this.f43950a.d();
                i12 = 1;
                break;
            default:
                i12 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor6 = this.f43965n;
        if (editTextBoldCursor6 != null) {
            editTextBoldCursor6.addTextChangedListener(new ya1(this, i12));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z9) {
        for (org.telegram.ui.ActionBar.f2 f2Var : getParentLayout().getFragmentStack()) {
            if (f2Var != this && (f2Var instanceof bb1)) {
                ((org.telegram.ui.Components.f51) ((bb1) f2Var).f43953b0.f14264b).f33585b = true;
            }
        }
        return super.finishFragment(z9);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27809a7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f43954c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f43965n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f43965n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27994k6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f43965n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28012l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i7 = this.O;
        if (i7 != 7 && i7 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z9) {
                N0();
                return false;
            }
            return false;
        }
        if (z9) {
            finishFragment();
        }
        return true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        if (this.f43950a != null) {
            int i11 = this.O;
            if (i11 == 2 && org.telegram.messenger.g0.O1()) {
                this.f43950a.setVisibility(8);
            } else if (i11 != 6 && i11 != 9 && i11 != 7) {
                org.telegram.ui.Components.dh0 dh0Var = this.f43950a;
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                dh0Var.setVisibility(i7);
            }
        }
        org.telegram.ui.Components.br brVar = this.f43958e0;
        if (brVar != null) {
            if (!A0()) {
                i10 = 8;
            }
            brVar.setVisibility(i10);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        sa1 sa1Var = this.f43961g0;
        if (sa1Var != null) {
            org.telegram.messenger.g0.r(sa1Var);
            this.f43961g0 = null;
        }
        if (this.f43960f0 != null) {
            int i7 = 0;
            while (true) {
                org.telegram.ui.Components.ah0[] ah0VarArr = this.f43960f0;
                if (i7 >= ah0VarArr.length) {
                    break;
                }
                ah0VarArr[i7].C(false);
                i7++;
            }
            this.f43960f0 = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.S = false;
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.v1(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.u11 u11Var = this.f43956d0;
            if (u11Var != null) {
                u11Var.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O9, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28012l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            if (this.f43965n != null && !A0()) {
                org.telegram.messenger.g0.i3(new sa1(this, 2), 200L);
            }
            nb0 nb0Var = this.f43969x;
            if (nb0Var != null && nb0Var.getVisibility() == 0) {
                org.telegram.messenger.g0.i3(new sa1(this, 3), 200L);
            }
        }
    }

    public final void z0(Runnable runnable) {
        int i7 = 0;
        while (true) {
            nb0 nb0Var = this.f43969x;
            dr[] drVarArr = nb0Var.f43768f;
            if (i7 < drVarArr.length) {
                dr drVar = drVarArr[i7];
                drVar.postDelayed(new hi0(drVar, 1), i7 * 75);
                i7++;
            } else {
                nb0Var.postDelayed(new ax0(27, this, runnable), (drVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle k10 = a8.p0.k("afterSignup", true);
            le0 le0Var = new le0();
            le0Var.r0(k10);
            presentFragment(le0Var, true);
            return;
        }
        super.finishFragment();
    }

    public bb1(int i7, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f43962h0 = new sa1(this, 0);
        this.f43963i0 = new sa1(this, 1);
        this.O = i7;
        this.U = password;
        if (password == null && (i7 == 6 || i7 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ua1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void G0() {
    }
}
