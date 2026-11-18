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
public class bb1 extends org.telegram.ui.ActionBar.h2 {
    public hi.m5 E;
    public org.telegram.ui.ActionBar.g0 F;
    public boolean G;
    public int H;
    public boolean I;
    public AnimatorSet J;
    public final ArrayList K;
    public AnimatorSet L;
    public RadialProgressView M;
    public boolean N;
    public boolean O;
    public final int P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public TL_account.Password V;
    public byte[] W;
    public long X;
    public byte[] Y;
    public boolean Z;
    public org.telegram.ui.Components.ph0 f45799a;
    public boolean f45800a0;
    public TextView f45801b;
    public String f45802b0;
    public TextView f45803c;
    public h6.m f45804c0;
    public xh.l d;
    public org.telegram.ui.Components.a10 f45805d0;
    public TextView f45806e;
    public org.telegram.ui.Components.h21 f45807e0;
    public TextView f45808f;
    public org.telegram.ui.Components.pr f45809f0;
    public org.telegram.ui.Components.mh0[] f45810g0;
    public TextView h;
    public sa1 f45811h0;
    public final Runnable f45812i0;
    public final Runnable f45813j0;
    public l90 f45814k0;
    public EditTextBoldCursor f45815n;
    public EditTextBoldCursor f45816r;
    public org.telegram.ui.Components.xb0 f45817s;
    public org.telegram.ui.Components.xb0 f45818w;
    public mb0 f45819x;
    public ab1 f45820y;

    public bb1(int i7, int i10, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.f45812i0 = new sa1(this, 0);
        this.f45813j0 = new sa1(this, 1);
        this.currentAccount = i7;
        this.P = i10;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ua1(this, 0), 10);
            }
        }
    }

    public static void Z(bb1 bb1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = bb1Var.V;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = org.telegram.messenger.jv.d(bb1Var.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] h12 = org.telegram.messenger.g0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = bb1Var.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.jv.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        kg.o0 o0Var = new kg.o0(bb1Var, z10, bArr, str, passwordinputsettings);
        if (!z10) {
            if (str != null && (bArr3 = bb1Var.Y) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = bb1Var.V.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(m10, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(m10, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(bb1Var.Y, 0, bArr6, 0, 32);
                    Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = bb1Var.X;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = bb1Var.V.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] b10 = org.telegram.messenger.jv.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b10;
                    if (b10 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        o0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            o0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
    }

    public static void a0(bb1 bb1Var) {
        ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new fi.k5(9));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131745925, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.U = M0;
        u1Var.S = org.telegram.messenger.gd.M0(2131743694, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
        bb1Var.showDialog(u1Var);
    }

    public static void b0(bb1 bb1Var, byte[] bArr) {
        ArrayList arrayList = bb1Var.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.h2) arrayList.get(i7)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = bb1Var.V;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = bb1Var.V;
        if (bArr == null) {
            bArr = bb1Var.W;
        }
        twoStepVerificationActivity.A0(password2, bArr, bb1Var.X, bb1Var.Y);
        twoStepVerificationActivity.Y = bb1Var.H;
        bb1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25171q0, bb1Var.V);
        l90 l90Var = bb1Var.f45814k0;
        if (l90Var != null) {
            org.telegram.messenger.g0.g3(l90Var);
            bb1Var.f45814k0 = null;
        }
    }

    public static void c0(bb1 bb1Var) {
        ArrayList arrayList = bb1Var.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.h2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(bb1Var.currentAccount);
        byte[] bArr = bb1Var.W;
        TL_account.Password password = bb1Var.V;
        f10.k(org.telegram.messenger.ks.f25165p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, bb1Var.S, bb1Var.R, null, bb1Var.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = bb1Var.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, bb1Var.W, bb1Var.X, bb1Var.Y);
        twoStepVerificationActivity.Y = bb1Var.H;
        bb1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25171q0, bb1Var.V);
        l90 l90Var = bb1Var.f45814k0;
        if (l90Var != null) {
            org.telegram.messenger.g0.g3(l90Var);
            bb1Var.f45814k0 = null;
        }
    }

    public static void d0(bb1 bb1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = bb1Var.V.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.jv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        e31 e31Var = new e31(7, bb1Var, bArr2);
        TL_account.Password password = bb1Var.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                e31Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(getpasswordsettings, e31Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        e31Var.run(null, tL_error2);
    }

    public static void e0(bb1 bb1Var, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ua1(bb1Var, 4), 8);
            return;
        }
        bb1Var.B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            bb1Var.d.setText(org.telegram.messenger.gd.M0(2131752146, null));
            org.telegram.ui.ActionBar.u6.U(bb1Var.d, org.telegram.ui.ActionBar.n6.f29615p7, null);
            bb1Var.E0(bb1Var.f45817s, bb1Var.f45815n, true);
            bb1Var.M0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
            }
            bb1Var.L0(org.telegram.messenger.gd.M0(2131689472, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, G));
        } else {
            bb1Var.L0(org.telegram.messenger.gd.M0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(bb1 bb1Var) {
        ArrayList arrayList = bb1Var.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.h2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25165p0, new Object[0]);
        bb1Var.finishFragment();
    }

    public static void g0(bb1 bb1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bb1Var.V = password;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.b5.u0(bb1Var.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, null), true);
                return;
            }
            bb1Var.U = !TextUtils.isEmpty(bb1Var.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.r0(bb1Var.V);
            if (!bb1Var.T && bb1Var.Z) {
                TL_account.Password password2 = bb1Var.V;
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
                    if (!bb1Var.U && passwordKdfAlgo != null) {
                        org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25165p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        bb1Var.finishFragment();
                    }
                }
            }
            if (bb1Var.O) {
                bb1Var.B0();
                bb1Var.H0();
            }
            org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25171q0, bb1Var.V);
        }
    }

    public static void h0(bb1 bb1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bb1Var.V = password;
            TwoStepVerificationActivity.r0(password);
            bb1Var.J0(z10);
            org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25171q0, bb1Var.V);
        }
    }

    public static void i0(bb1 bb1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = bb1Var.K;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bb1Var.currentAccount).sendRequest(new TL_account.getPassword(), new hi.c3(11, bb1Var, z10), 8);
            return;
        }
        bb1Var.B0();
        int i7 = org.telegram.messenger.ks.f25165p0;
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            bb1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
            int i10 = org.telegram.messenger.ks.f25171q0;
            if (z10) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.h2) arrayList.get(i11)).removeSelfFromStack();
                }
                org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25178r0, new Object[0]);
                org.telegram.messenger.ks.f(bb1Var.currentAccount).k(i10, new Object[0]);
                bb1Var.finishFragment();
            } else if (bb1Var.getParentActivity() != null) {
                if (bb1Var.V.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new aj0(25, bb1Var, bArr));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    if (str == null && (password = bb1Var.V) != null && password.has_password) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131742555, null);
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131742546, null);
                    }
                    u1Var.S = org.telegram.messenger.gd.M0(2131742540, null);
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
                    ((org.telegram.ui.ActionBar.h2) arrayList.get(i12)).removeSelfFromStack();
                }
                TL_account.Password password2 = bb1Var.V;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (bb1Var.Z) {
                    org.telegram.messenger.ks.f(bb1Var.currentAccount).k(i7, new Object[0]);
                }
                bb1 bb1Var2 = new bb1(7, bb1Var.V);
                bb1Var2.I = bb1Var.I;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = bb1Var.W;
                }
                bb1Var2.I0(bArr3, bb1Var.X, bb1Var.Y, bb1Var.f45800a0);
                bb1Var2.Z = bb1Var.Z;
                bb1Var2.H = bb1Var.H;
                bb1Var.presentFragment(bb1Var2, true);
                org.telegram.messenger.ks.f(bb1Var.currentAccount).k(i10, bb1Var.V);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    bb1Var.L0(org.telegram.messenger.gd.M0(2131689472, null), org.telegram.messenger.gd.M0(2131747252, null));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    bb1Var.L0(org.telegram.messenger.gd.M0(2131689472, null), org.telegram.messenger.gd.M0(2131751189, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    bb1Var.L0(org.telegram.messenger.gd.M0(2131689472, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, G));
                    return;
                } else {
                    bb1Var.L0(org.telegram.messenger.gd.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            org.telegram.messenger.ks.f(bb1Var.currentAccount).k(i7, new Object[0]);
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((org.telegram.ui.ActionBar.h2) arrayList.get(i13)).removeSelfFromStack();
            }
            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(bb1Var.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = bb1Var.V;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = bb1Var.S;
            f10.k(i7, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, bb1Var.R, str2, bb1Var.Q);
            TL_account.Password password4 = bb1Var.V;
            password4.email_unconfirmed_pattern = bb1Var.S;
            bb1 bb1Var3 = new bb1(5, password4);
            bb1Var3.I = bb1Var.I;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = bb1Var.W;
            }
            bb1Var3.I0(bArr2, bb1Var.X, bb1Var.Y, bb1Var.f45800a0);
            bb1Var3.Z = bb1Var.Z;
            bb1Var3.H = bb1Var.H;
            bb1Var.presentFragment(bb1Var3, true);
        }
    }

    public static void j0(bb1 bb1Var, TLRPC.TL_error tL_error) {
        bb1Var.B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = bb1Var.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, bb1Var.W, bb1Var.X, bb1Var.Y);
            twoStepVerificationActivity.Y = bb1Var.H;
            bb1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25178r0, new Object[0]);
            l90 l90Var = bb1Var.f45814k0;
            if (l90Var != null) {
                org.telegram.messenger.g0.g3(l90Var);
                bb1Var.f45814k0 = null;
            }
        }
    }

    public static void k0(bb1 bb1Var) {
        ArrayList arrayList = bb1Var.K;
        if (bb1Var.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new ta1(bb1Var, 4));
            boolean z10 = bb1Var.V.has_recovery;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            if (z10) {
                u1Var.U = org.telegram.messenger.gd.M0(2131742556, null);
            } else {
                u1Var.U = org.telegram.messenger.gd.M0(2131742555, null);
            }
            u1Var.S = org.telegram.messenger.gd.M0(2131742540, null);
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
            ((org.telegram.ui.ActionBar.h2) arrayList.get(i7)).removeSelfFromStack();
        }
        TL_account.Password password = bb1Var.V;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        bb1 bb1Var2 = new bb1(7, password);
        bb1Var2.I = bb1Var.I;
        bb1Var2.I0(bb1Var.W, bb1Var.X, bb1Var.Y, bb1Var.f45800a0);
        bb1Var2.K.addAll(arrayList);
        bb1Var2.Z = bb1Var.Z;
        bb1Var2.H = bb1Var.H;
        bb1Var.presentFragment(bb1Var2, true);
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(bb1Var.currentAccount);
        byte[] bArr = bb1Var.W;
        TL_account.Password password2 = bb1Var.V;
        f10.k(org.telegram.messenger.ks.f25165p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, bb1Var.S, bb1Var.R, null, bb1Var.Q);
        org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25171q0, bb1Var.V);
    }

    public static void l0(bb1 bb1Var, String str) {
        bb1 bb1Var2 = new bb1(bb1Var.currentAccount, 0, bb1Var.V);
        bb1Var2.I = bb1Var.I;
        bb1Var2.K.addAll(bb1Var.K);
        bb1Var2.K.add(bb1Var);
        bb1Var2.f45802b0 = str;
        bb1Var2.H = bb1Var.H;
        bb1Var.presentFragment(bb1Var2, true);
    }

    public static void m0(bb1 bb1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bb1Var.V = password;
            TwoStepVerificationActivity.r0(password);
            org.telegram.messenger.ks.f(bb1Var.currentAccount).k(org.telegram.messenger.ks.f25171q0, bb1Var.V);
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
        int i7 = this.P;
        if ((i7 == 5 || i7 == 4) && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24118q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        this.f45805d0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f45805d0.f(true, true);
        }
    }

    public final void D0() {
        er[] erVarArr;
        for (er erVar : this.f45819x.f46274f) {
            erVar.setText("");
            erVar.A(1.0f);
        }
        this.f45819x.f46274f[0].requestFocus();
        org.telegram.messenger.g0.E3(8.0f, this.f45819x, new sa1(this, 6));
    }

    public final void E0(org.telegram.ui.Components.xb0 xb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        org.telegram.messenger.g0.E3(5.0f, xb0Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.V;
        if (!password.has_recovery) {
            bb1 bb1Var = new bb1(this.currentAccount, 3, password);
            bb1Var.I = this.I;
            bb1Var.I0(this.W, this.X, this.Y, this.f45800a0);
            bb1Var.Q = this.Q;
            bb1Var.R = this.R;
            bb1Var.K.addAll(this.K);
            bb1Var.K.add(this);
            bb1Var.Z = this.Z;
            bb1Var.H = this.H;
            presentFragment(bb1Var);
            return;
        }
        this.S = "";
        J0(false);
    }

    public final void H0() {
        if (getParentActivity() != null) {
            int i7 = 2;
            switch (this.P) {
                case 0:
                case 1:
                    if (this.f45815n.length() == 0) {
                        E0(this.f45817s, this.f45815n, false);
                        return;
                    } else if (!this.f45815n.getText().toString().equals(this.Q) && this.P == 1) {
                        org.telegram.messenger.g0.E3(5.0f, this.f45817s, null);
                        try {
                            this.f45817s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.gd.M0(2131747253, null), 0).show();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else {
                        int i10 = this.currentAccount;
                        if (this.P == 0) {
                            i7 = 1;
                        }
                        bb1 bb1Var = new bb1(i10, i7, this.V);
                        bb1Var.I = this.I;
                        bb1Var.Q = this.f45815n.getText().toString();
                        bb1Var.I0(this.W, this.X, this.Y, this.f45800a0);
                        bb1Var.f45802b0 = this.f45802b0;
                        bb1Var.K.addAll(this.K);
                        bb1Var.K.add(this);
                        bb1Var.Z = this.Z;
                        bb1Var.H = this.H;
                        presentFragment(bb1Var);
                        return;
                    }
                case 2:
                    String obj = this.f45815n.getText().toString();
                    this.R = obj;
                    if (obj.equalsIgnoreCase(this.Q)) {
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.gd.M0(2131747255, null), 0).show();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        E0(this.f45817s, this.f45815n, false);
                        return;
                    }
                    F0();
                    return;
                case 3:
                    if (!this.f45800a0 && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f45815n.getText().toString();
                    this.S = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            J0(false);
                            return;
                        }
                    }
                    E0(this.f45817s, this.f45815n, false);
                    return;
                case 4:
                    String code = this.f45819x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new e31(6, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f45819x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ua1(this, 2), 10);
                    C0();
                    return;
                case 6:
                    TL_account.Password password = this.V;
                    if (password == null) {
                        C0();
                        this.O = true;
                        return;
                    }
                    bb1 bb1Var2 = new bb1(this.currentAccount, 0, password);
                    bb1Var2.I = this.I;
                    bb1Var2.Z = this.Z;
                    bb1Var2.H = this.H;
                    presentFragment(bb1Var2, true);
                    return;
                case 7:
                    if (this.Z) {
                        finishFragment();
                        return;
                    } else if (this.I) {
                        Bundle k10 = a8.p0.k("afterSignup", true);
                        me0 me0Var = new me0();
                        me0Var.r0(k10);
                        presentFragment(me0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.V, this.W, this.X, this.Y);
                        twoStepVerificationActivity.Y = this.H;
                        presentFragment(twoStepVerificationActivity, true);
                        l90 l90Var = this.f45814k0;
                        if (l90Var != null) {
                            org.telegram.messenger.g0.g3(l90Var);
                            this.f45814k0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.V == null) {
                        C0();
                        this.O = true;
                        return;
                    }
                    String obj3 = this.f45815n.getText().toString();
                    if (obj3.length() == 0) {
                        E0(this.f45817s, this.f45815n, false);
                        return;
                    }
                    byte[] h12 = org.telegram.messenger.g0.h1(obj3);
                    C0();
                    Utilities.f22779e.c(new va1(this, h12, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void I0(byte[] bArr, long j3, byte[] bArr2, boolean z10) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j3;
        this.f45800a0 = z10;
    }

    public final void J0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.U && this.V.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new ua1(this, 3));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            org.telegram.messenger.j10.i(this.currentAccount).u();
            this.Y = null;
            if (this.U) {
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
            if (this.R == null && (password = this.V) != null) {
                this.R = password.hint;
            }
            if (this.R == null) {
                this.R = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.R;
                passwordinputsettings.new_algo = this.V.new_algo;
            }
            if (this.S.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.S.trim();
            }
        }
        if (this.f45802b0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f45802b0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.W;
            if (bArr == null || bArr.length == 0 || (z10 && this.U)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.f22779e.c(new ai.n(this, updatepasswordsettings3, z10, str, passwordinputsettings, 15));
    }

    public final void K0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bb1.K0(boolean):void");
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = str;
        u1Var.U = str2;
        showDialog(u1Var);
    }

    public final void M0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f45801b.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f45801b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.J = new AnimatorSet();
        if (z10) {
            this.f45801b.setVisibility(0);
            AnimatorSet animatorSet2 = this.J;
            TextView textView2 = this.f45806e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f45806e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f45806e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f45801b, property, 1.0f), ObjectAnimator.ofFloat(this.f45801b, property2, 1.0f), ObjectAnimator.ofFloat(this.f45801b, property3, 1.0f));
        } else {
            this.f45806e.setVisibility(0);
            AnimatorSet animatorSet3 = this.J;
            TextView textView5 = this.f45801b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f45801b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f45801b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f45806e, property4, 1.0f), ObjectAnimator.ofFloat(this.f45806e, property5, 1.0f), ObjectAnimator.ofFloat(this.f45806e, property6, 1.0f));
        }
        this.J.addListener(new c30(12, this, z10));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131742690, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131743696, null), null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131750578, null), new ta1(this, 0));
        org.telegram.ui.ActionBar.u6.U((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.n6.f29635q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        ?? r12;
        ?? r92;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.l(kVar, 5, i13, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i13, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.f29712u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new za1(this));
        int i14 = this.P;
        if (i14 == 5) {
            this.actionBar.t().a(0, 2131231244).g(1, org.telegram.messenger.gd.M0(2131754947, null));
        }
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.f45805d0 = a10Var;
        this.f45804c0 = new h6.m(a10Var);
        this.f45805d0.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f50784b;

            {
                this.f50784b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                bb1 bb1Var = this.f50784b;
                switch (i15) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.gd.M0(2131745898, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.P;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.gd.M0(2131742557, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                u1Var2.U = M02;
                                u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView = (TextView) u1Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                        if (bb1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = bb1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = bb1Var.H;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = bb1Var.f45814k0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.g3(l90Var);
                                bb1Var.f45814k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.P;
                        bb1Var.N = true;
                        if (bb1Var.f45815n.getTransformationMethod() == null) {
                            bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(-1);
                                org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var = bb1Var.f45810g0[3];
                                if (animatedDrawable != mh0Var) {
                                    bb1Var.f45799a.setAnimation(mh0Var);
                                    bb1Var.f45810g0[3].N(18, false, false);
                                }
                                bb1Var.f45799a.d();
                            }
                        } else {
                            bb1Var.f45815n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(18);
                                org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                if (animatedDrawable2 != mh0Var2) {
                                    bb1Var.f45799a.setAnimation(mh0Var2);
                                }
                                bb1Var.f45810g0[3].T(false, 0.0f);
                                bb1Var.f45799a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f45815n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.N = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.h21 h21Var = new org.telegram.ui.Components.h21(context);
        this.f45807e0 = h21Var;
        h21Var.setTransformType(1);
        this.f45807e0.setProgress(0.0f);
        this.f45807e0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false));
        this.f45807e0.setDrawBackground(false);
        this.f45805d0.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
        this.f45805d0.addView(this.f45807e0, c8.ma.e(56, 56, 17));
        this.f45805d0.a(this.f45807e0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29594o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        h6.m.i(this.h);
        this.h.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f50784b;

            {
                this.f50784b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                bb1 bb1Var = this.f50784b;
                switch (i15) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.gd.M0(2131745898, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.P;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.gd.M0(2131742557, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                u1Var2.U = M02;
                                u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView2 = (TextView) u1Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                        if (bb1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = bb1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = bb1Var.H;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = bb1Var.f45814k0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.g3(l90Var);
                                bb1Var.f45814k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.P;
                        bb1Var.N = true;
                        if (bb1Var.f45815n.getTransformationMethod() == null) {
                            bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(-1);
                                org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var = bb1Var.f45810g0[3];
                                if (animatedDrawable != mh0Var) {
                                    bb1Var.f45799a.setAnimation(mh0Var);
                                    bb1Var.f45810g0[3].N(18, false, false);
                                }
                                bb1Var.f45799a.d();
                            }
                        } else {
                            bb1Var.f45815n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(18);
                                org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                if (animatedDrawable2 != mh0Var2) {
                                    bb1Var.f45799a.setAnimation(mh0Var2);
                                }
                                bb1Var.f45810g0[3].T(false, 0.0f);
                                bb1Var.f45799a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f45815n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.N = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f45799a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i14 == 2 && org.telegram.messenger.g0.O1()) {
            this.f45799a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.ph0 ph0Var = this.f45799a;
            Point point = org.telegram.messenger.g0.f24118q;
            if (point.x > point.y) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            ph0Var.setVisibility(i7);
        }
        TextView textView2 = new TextView(context);
        this.f45803c = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i13, null);
        this.f45803c.setGravity(1);
        this.f45803c.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f45803c.setTextSize(1, 24.0f);
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        int i15 = org.telegram.ui.ActionBar.n6.D6;
        org.telegram.ui.ActionBar.u6.U(lVar, i15, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f45806e = textView3;
        org.telegram.ui.ActionBar.u6.U(textView3, i15, null);
        this.f45806e.setGravity(1);
        this.f45806e.setTextSize(1, 14.0f);
        this.f45806e.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f45806e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f45806e.setVisibility(8);
        this.f45806e.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f50784b;

            {
                this.f50784b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                bb1 bb1Var = this.f50784b;
                switch (i152) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.gd.M0(2131745898, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.P;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.gd.M0(2131742557, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                u1Var2.U = M02;
                                u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView22 = (TextView) u1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                        if (bb1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = bb1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = bb1Var.H;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = bb1Var.f45814k0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.g3(l90Var);
                                bb1Var.f45814k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.P;
                        bb1Var.N = true;
                        if (bb1Var.f45815n.getTransformationMethod() == null) {
                            bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(-1);
                                org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var = bb1Var.f45810g0[3];
                                if (animatedDrawable != mh0Var) {
                                    bb1Var.f45799a.setAnimation(mh0Var);
                                    bb1Var.f45810g0[3].N(18, false, false);
                                }
                                bb1Var.f45799a.d();
                            }
                        } else {
                            bb1Var.f45815n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(18);
                                org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                if (animatedDrawable2 != mh0Var2) {
                                    bb1Var.f45799a.setAnimation(mh0Var2);
                                }
                                bb1Var.f45810g0[3].T(false, 0.0f);
                                bb1Var.f45799a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f45815n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.N = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f45801b = textView4;
        textView4.setMinWidth(org.telegram.messenger.g0.L(220.0f));
        this.f45801b.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f45801b.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(this.f45801b, org.telegram.ui.ActionBar.n6.Ji, null);
        this.f45801b.setTextSize(1, 15.0f);
        this.f45801b.setTypeface(org.telegram.messenger.g0.o());
        this.f45801b.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 24.0f));
        this.f45801b.setOnClickListener(new View.OnClickListener(this) {
            public final bb1 f50784b;

            {
                this.f50784b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                bb1 bb1Var = this.f50784b;
                switch (i152) {
                    case 0:
                        bb1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                        String M0 = org.telegram.messenger.gd.M0(2131745898, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                        bb1Var.showDialog(u1Var);
                        return;
                    case 2:
                        bb1.a0(bb1Var);
                        return;
                    case 3:
                        if (bb1Var.h.getAlpha() >= 0.5f) {
                            int i16 = bb1Var.P;
                            if (i16 == 0) {
                                bb1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                String M02 = org.telegram.messenger.gd.M0(2131742557, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                u1Var2.U = M02;
                                u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                bb1Var.showDialog(u1Var2);
                                TextView textView22 = (TextView) u1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                        if (bb1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = bb1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = bb1Var.H;
                            bb1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = bb1Var.f45814k0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.g3(l90Var);
                                bb1Var.f45814k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        bb1Var.H0();
                        return;
                    default:
                        int i17 = bb1Var.P;
                        bb1Var.N = true;
                        if (bb1Var.f45815n.getTransformationMethod() == null) {
                            bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(-1);
                                org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var = bb1Var.f45810g0[3];
                                if (animatedDrawable != mh0Var) {
                                    bb1Var.f45799a.setAnimation(mh0Var);
                                    bb1Var.f45810g0[3].N(18, false, false);
                                }
                                bb1Var.f45799a.d();
                            }
                        } else {
                            bb1Var.f45815n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                bb1Var.f45810g0[3].P(18);
                                org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                if (animatedDrawable2 != mh0Var2) {
                                    bb1Var.f45799a.setAnimation(mh0Var2);
                                }
                                bb1Var.f45810g0[3].T(false, 0.0f);
                                bb1Var.f45799a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bb1Var.f45815n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bb1Var.N = false;
                        return;
                }
            }
        });
        if (i14 != 6 && i14 != 7 && i14 != 9) {
            this.f45803c.setTypeface(org.telegram.messenger.g0.o());
            this.f45803c.setTextSize(1, 18.0f);
        } else {
            this.f45803c.setTypeface(Typeface.DEFAULT);
            this.f45803c.setTextSize(1, 24.0f);
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
                li0 li0Var = new li0(this, context, k0Var, 1);
                li0Var.addView(k0Var);
                q9 q9Var = new q9(this, context, li0Var);
                ab1 ab1Var = new ab1(this, context);
                this.f45820y = ab1Var;
                ab1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.f45820y, c8.ma.c(-1.0f, -1));
                k0Var.addView(this.h, c8.ma.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                k0Var.addView(this.f45805d0, org.telegram.ui.Components.a10.b());
                q9Var.addView(li0Var, c8.ma.c(-1.0f, -1));
                d61 d61Var = new d61(22, context, this);
                d61Var.setOrientation(1);
                this.f45820y.addView(d61Var, c8.ma.x(-1, -1, 51));
                d61Var.addView(this.f45799a, c8.ma.t(-2, -2, 49, 0, 69, 0, 0));
                d61Var.addView(this.f45803c, c8.ma.t(-2, -2, 49, 0, 8, 0, 0));
                d61Var.addView(this.d, c8.ma.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0(context, null);
                this.f45817s = xb0Var;
                xb0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f45815n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.g0.L(16.0f);
                this.f45815n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.f45815n;
                int i16 = org.telegram.ui.ActionBar.n6.f29541l6;
                org.telegram.ui.ActionBar.u6.v(editTextBoldCursor2, i16, null);
                org.telegram.ui.ActionBar.u6.U(this.f45815n, i13, null);
                this.f45815n.setBackground(null);
                this.f45815n.setMaxLines(1);
                this.f45815n.setLines(1);
                this.f45815n.setGravity(3);
                this.f45815n.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f45815n.setSingleLine(true);
                this.f45815n.setCursorWidth(1.5f);
                this.f45815n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final bb1 f51143b;

                    {
                        this.f51143b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i17, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                bb1 bb1Var = this.f51143b;
                                bb1Var.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                bb1Var.H0();
                                return true;
                            default:
                                bb1 bb1Var2 = this.f51143b;
                                bb1Var2.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                if (bb1Var2.f45818w.getVisibility() == 0) {
                                    bb1Var2.f45816r.requestFocus();
                                } else {
                                    bb1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f45817s.e(this.f45815n);
                this.f45815n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final bb1 f51539b;

                    {
                        this.f51539b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z12) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.xb0 xb0Var2 = this.f51539b.f45818w;
                                if (z12) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                xb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                bb1 bb1Var = this.f51539b;
                                if (z12) {
                                    bb1Var.f45809f0.setEditText((EditText) view);
                                    bb1Var.f45809f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                bb1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.xb0 xb0Var3 = this.f51539b.f45817s;
                                if (z12) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                xb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f45815n, c8.ma.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(4, context, this);
                this.F = g0Var;
                g0Var.setImageResource(2131232226);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(org.telegram.messenger.gd.M0(2131743695, null));
                org.telegram.ui.ActionBar.g0 g0Var2 = this.F;
                int i17 = org.telegram.ui.ActionBar.n6.f29486i6;
                org.telegram.ui.ActionBar.u6.Q(g0Var2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i17, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i17), null);
                org.telegram.ui.ActionBar.u6.s(this.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.g0.X3(this.F, false, 0.1f, true, false);
                this.F.setOnClickListener(new View.OnClickListener(this) {
                    public final bb1 f50784b;

                    {
                        this.f50784b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        bb1 bb1Var = this.f50784b;
                        switch (i152) {
                            case 0:
                                bb1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                                String M0 = org.telegram.messenger.gd.M0(2131745898, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                u1Var.S = M0;
                                u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                                bb1Var.showDialog(u1Var);
                                return;
                            case 2:
                                bb1.a0(bb1Var);
                                return;
                            case 3:
                                if (bb1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = bb1Var.P;
                                    if (i162 == 0) {
                                        bb1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                        bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                        String M02 = org.telegram.messenger.gd.M0(2131742557, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                        u1Var2.U = M02;
                                        u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                        bb1Var.showDialog(u1Var2);
                                        TextView textView22 = (TextView) u1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                                if (bb1Var.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = bb1Var.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = bb1Var.H;
                                    bb1Var.presentFragment(twoStepVerificationActivity, true);
                                    l90 l90Var = bb1Var.f45814k0;
                                    if (l90Var != null) {
                                        org.telegram.messenger.g0.g3(l90Var);
                                        bb1Var.f45814k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                bb1Var.H0();
                                return;
                            default:
                                int i172 = bb1Var.P;
                                bb1Var.N = true;
                                if (bb1Var.f45815n.getTransformationMethod() == null) {
                                    bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                        bb1Var.f45810g0[3].P(-1);
                                        org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mh0 mh0Var = bb1Var.f45810g0[3];
                                        if (animatedDrawable != mh0Var) {
                                            bb1Var.f45799a.setAnimation(mh0Var);
                                            bb1Var.f45810g0[3].N(18, false, false);
                                        }
                                        bb1Var.f45799a.d();
                                    }
                                } else {
                                    bb1Var.f45815n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                        bb1Var.f45810g0[3].P(18);
                                        org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                        if (animatedDrawable2 != mh0Var2) {
                                            bb1Var.f45799a.setAnimation(mh0Var2);
                                        }
                                        bb1Var.f45810g0[3].T(false, 0.0f);
                                        bb1Var.f45799a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = bb1Var.f45815n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                bb1Var.N = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.F, c8.ma.t(24, 24, 16, 0, 0, 16, 0));
                this.f45815n.addTextChangedListener(new ya1(this, 2));
                this.f45817s.addView(linearLayout, c8.ma.c(-2.0f, -1));
                d61Var.addView(this.f45817s, c8.ma.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.f45818w = new org.telegram.ui.Components.xb0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f45816r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.f45816r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.u6.v(this.f45816r, i16, null);
                org.telegram.ui.ActionBar.u6.U(this.f45816r, i13, null);
                this.f45816r.setBackground(null);
                this.f45816r.setMaxLines(1);
                this.f45816r.setLines(1);
                this.f45816r.setGravity(3);
                this.f45816r.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f45816r.setSingleLine(true);
                this.f45816r.setCursorWidth(1.5f);
                this.f45816r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final bb1 f51143b;

                    {
                        this.f51143b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i172, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                bb1 bb1Var = this.f51143b;
                                bb1Var.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                bb1Var.H0();
                                return true;
                            default:
                                bb1 bb1Var2 = this.f51143b;
                                bb1Var2.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                if (bb1Var2.f45818w.getVisibility() == 0) {
                                    bb1Var2.f45816r.requestFocus();
                                } else {
                                    bb1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f45818w.e(this.f45816r);
                this.f45816r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final bb1 f51539b;

                    {
                        this.f51539b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z12) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.xb0 xb0Var2 = this.f51539b.f45818w;
                                if (z12) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                xb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                bb1 bb1Var = this.f51539b;
                                if (z12) {
                                    bb1Var.f45809f0.setEditText((EditText) view);
                                    bb1Var.f45809f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                bb1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.xb0 xb0Var3 = this.f51539b.f45817s;
                                if (z12) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                xb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                this.f45818w.addView(this.f45816r, c8.ma.c(-2.0f, -1));
                d61Var.addView(this.f45818w, c8.ma.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.f45818w.setVisibility(8);
                org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
                this.f45809f0 = prVar;
                prVar.setVisibility(8);
                li0Var.addView(this.f45809f0);
                mb0 mb0Var = new mb0(3, context, this);
                this.f45819x = mb0Var;
                final int i18 = 1;
                mb0Var.b(6, 1);
                er[] erVarArr = this.f45819x.f46274f;
                int length = erVarArr.length;
                int i19 = 0;
                while (i19 < length) {
                    er erVar = erVarArr[i19];
                    erVar.setShowSoftInputOnFocusCompat(A0() ^ i18);
                    erVar.addTextChangedListener(new ya1(this, 0));
                    erVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final bb1 f51539b;

                        {
                            this.f51539b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z12) {
                            float f10;
                            float f11;
                            switch (i18) {
                                case 0:
                                    org.telegram.ui.Components.xb0 xb0Var2 = this.f51539b.f45818w;
                                    if (z12) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    xb0Var2.b(f10, f10, true);
                                    return;
                                case 1:
                                    bb1 bb1Var = this.f51539b;
                                    if (z12) {
                                        bb1Var.f45809f0.setEditText((EditText) view);
                                        bb1Var.f45809f0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    bb1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.xb0 xb0Var3 = this.f51539b.f45817s;
                                    if (z12) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    xb0Var3.b(f11, f11, true);
                                    return;
                            }
                        }
                    });
                    i19++;
                    i18 = 1;
                }
                this.f45819x.setVisibility(8);
                d61Var.addView(this.f45819x, c8.ma.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                d61Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f45806e, c8.ma.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f45808f = textView5;
                    org.telegram.ui.ActionBar.u6.U(textView5, org.telegram.ui.ActionBar.n6.J6, null);
                    this.f45808f.setGravity(1);
                    this.f45808f.setTextSize(1, 14.0f);
                    this.f45808f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.f45808f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    this.f45808f.setText(org.telegram.messenger.gd.M0(2131745881, null));
                    d61Var.addView(this.f45808f, c8.ma.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f45808f.setOnClickListener(new View.OnClickListener(this) {
                        public final bb1 f50784b;

                        {
                            this.f50784b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i152 = r2;
                            bb1 bb1Var = this.f50784b;
                            switch (i152) {
                                case 0:
                                    bb1Var.H0();
                                    return;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                                    String M0 = org.telegram.messenger.gd.M0(2131745898, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                    u1Var.S = M0;
                                    u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                                    bb1Var.showDialog(u1Var);
                                    return;
                                case 2:
                                    bb1.a0(bb1Var);
                                    return;
                                case 3:
                                    if (bb1Var.h.getAlpha() >= 0.5f) {
                                        int i162 = bb1Var.P;
                                        if (i162 == 0) {
                                            bb1Var.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                            bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                            return;
                                        } else if (i162 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                            String M02 = org.telegram.messenger.gd.M0(2131742557, null);
                                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                            u1Var2.U = M02;
                                            u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                            bb1Var.showDialog(u1Var2);
                                            TextView textView22 = (TextView) u1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                                    if (bb1Var.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = bb1Var.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = bb1Var.H;
                                        bb1Var.presentFragment(twoStepVerificationActivity, true);
                                        l90 l90Var = bb1Var.f45814k0;
                                        if (l90Var != null) {
                                            org.telegram.messenger.g0.g3(l90Var);
                                            bb1Var.f45814k0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    bb1Var.H0();
                                    return;
                                default:
                                    int i172 = bb1Var.P;
                                    bb1Var.N = true;
                                    if (bb1Var.f45815n.getTransformationMethod() == null) {
                                        bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                            bb1Var.f45810g0[3].P(-1);
                                            org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                            org.telegram.ui.Components.mh0 mh0Var = bb1Var.f45810g0[3];
                                            if (animatedDrawable != mh0Var) {
                                                bb1Var.f45799a.setAnimation(mh0Var);
                                                bb1Var.f45810g0[3].N(18, false, false);
                                            }
                                            bb1Var.f45799a.d();
                                        }
                                    } else {
                                        bb1Var.f45815n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                            bb1Var.f45810g0[3].P(18);
                                            org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                            org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                            if (animatedDrawable2 != mh0Var2) {
                                                bb1Var.f45799a.setAnimation(mh0Var2);
                                            }
                                            bb1Var.f45810g0[3].T(false, 0.0f);
                                            bb1Var.f45799a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = bb1Var.f45815n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    bb1Var.N = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = q9Var;
                hi.m5 m5Var = new hi.m5(this, context);
                this.E = m5Var;
                m5Var.setAlpha(0.0f);
                q9Var.addView(this.E);
                q9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29541l6, false));
                k0Var.addView(this.M, c8.ma.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(1, context, this);
                eVar.setOnTouchListener(new gi.a(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.f45799a);
                eVar.addView(this.f45803c);
                eVar.addView(this.d);
                eVar.addView(this.f45801b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, this.fragmentView, null);
        String str = "";
        switch (i14) {
            case 0:
            case 1:
                int i20 = 2131746218;
                if (this.V.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747018, null));
                    this.f45803c.setText(org.telegram.messenger.gd.M0(2131747018, null));
                } else {
                    if (i14 == 0) {
                        i10 = 2131751694;
                    } else {
                        i10 = 2131746218;
                    }
                    String M0 = org.telegram.messenger.gd.M0(i10, null);
                    this.actionBar.setTitle(M0);
                    this.f45803c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.f45802b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.gd.M0(2131742559, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.xb0 xb0Var2 = this.f45817s;
                if (i14 == 0) {
                    i11 = 2131751105;
                } else {
                    i11 = 2131746218;
                }
                xb0Var2.setText(org.telegram.messenger.gd.M0(i11, null));
                EditTextBoldCursor editTextBoldCursor4 = this.f45815n;
                if (i14 == 0) {
                    i20 = 2131751105;
                }
                editTextBoldCursor4.setContentDescription(org.telegram.messenger.gd.M0(i20, null));
                this.f45815n.setImeOptions(268435461);
                this.f45815n.setInputType(129);
                this.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f45815n.setTypeface(Typeface.DEFAULT);
                if (i14 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.G = z10;
                org.telegram.messenger.g0.X3(this.F, false, 0.1f, true, false);
                org.telegram.ui.Components.mh0[] mh0VarArr = new org.telegram.ui.Components.mh0[7];
                this.f45810g0 = mh0VarArr;
                mh0VarArr[0] = new org.telegram.ui.Components.mh0(2131624310, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f45810g0[1] = new org.telegram.ui.Components.mh0(2131624311, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f45810g0[2] = new org.telegram.ui.Components.mh0(2131624303, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f45810g0[3] = new org.telegram.ui.Components.mh0(2131624312, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f45810g0[4] = new org.telegram.ui.Components.mh0(2131624309, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f45810g0[5] = new org.telegram.ui.Components.mh0(2131624308, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f45810g0[6] = new org.telegram.ui.Components.mh0(2131624313, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                org.telegram.ui.Components.mh0 mh0Var = this.f45810g0[6];
                mh0Var.h = true;
                mh0Var.P(19);
                this.f45810g0[2].S(97, this.f45813j0);
                K0(true);
                if (i14 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    sa1 sa1Var = this.f45811h0;
                    if (sa1Var != null) {
                        org.telegram.messenger.g0.r(sa1Var);
                    }
                    this.f45799a.setAnimation(this.f45810g0[6]);
                    this.f45799a.d();
                    i12 = 1;
                    break;
                } else {
                    EditTextBoldCursor editTextBoldCursor5 = this.f45815n;
                    ArrayList arrayList = editTextBoldCursor5.f32916g1;
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
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747251, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.gd.M0(2131742559, null));
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131747251, null));
                this.d.setText(org.telegram.messenger.gd.M0(2131747250, null));
                this.d.setVisibility(0);
                this.f45817s.setText(org.telegram.messenger.gd.M0(2131747249, null));
                this.f45815n.setContentDescription(org.telegram.messenger.gd.M0(2131747249, null));
                this.f45815n.setImeOptions(268435461);
                this.f45818w.setVisibility(8);
                this.f45799a.f(2131624305, 120, 120, null);
                this.f45799a.d();
                i12 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131746149, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.f45800a0) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.gd.M0(2131742559, null));
                } else {
                    r12 = 0;
                }
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131746149, r12));
                this.d.setText(org.telegram.messenger.gd.M0(2131746150, r12));
                this.d.setVisibility(0);
                this.f45817s.setText(org.telegram.messenger.gd.M0(2131747183, r12));
                this.f45815n.setContentDescription(org.telegram.messenger.gd.M0(2131747183, r12));
                this.f45815n.setImeOptions(268435461);
                this.f45815n.setInputType(33);
                this.f45818w.setVisibility(8);
                this.f45799a.f(2131624304, 120, 120, r12);
                this.f45799a.d();
                i12 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747244, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131747244, null));
                this.f45809f0.setVisibility(0);
                this.f45817s.setVisibility(8);
                String str2 = this.V.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj2 = new Object();
                    obj2.f34537a |= 256;
                    obj2.f34538b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj2.f34539c = i22;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.ez0(obj2, 0), indexOf, i22, 0);
                } else {
                    r92 = 0;
                }
                xh.l lVar2 = this.d;
                String M02 = org.telegram.messenger.gd.M0(2131745885, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                lVar2.setText(org.telegram.messenger.g0.m0(M02, charSequenceArr));
                this.d.setVisibility(r92);
                this.f45805d0.e(r92, r92);
                this.f45819x.setVisibility(r92);
                this.f45799a.f(2131624307, 120, 120, null);
                this.f45799a.d();
                i12 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131743382, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131743382, null));
                this.f45817s.setVisibility(8);
                this.f45809f0.setVisibility(0);
                xh.l lVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                lVar3.setText(org.telegram.messenger.gd.a0("EmailPasswordConfirmText2", null, 2131751188, str));
                this.d.setVisibility(0);
                this.f45805d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.gd.M0(2131745926, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final bb1 f50784b;

                    {
                        this.f50784b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        bb1 bb1Var = this.f50784b;
                        switch (i152) {
                            case 0:
                                bb1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745923, null), new ta1(bb1Var, 1));
                                String M03 = org.telegram.messenger.gd.M0(2131745898, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                u1Var.S = M03;
                                u1Var.U = org.telegram.messenger.gd.M0(2131745879, null);
                                bb1Var.showDialog(u1Var);
                                return;
                            case 2:
                                bb1.a0(bb1Var);
                                return;
                            case 3:
                                if (bb1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = bb1Var.P;
                                    if (i162 == 0) {
                                        bb1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = bb1Var.f45802b0;
                                        bb1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ua1(bb1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bb1Var.getParentActivity());
                                        String M022 = org.telegram.messenger.gd.M0(2131742557, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                                        u1Var2.U = M022;
                                        u1Var2.S = org.telegram.messenger.gd.M0(2131742558, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131742559, null), new ta1(bb1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                        bb1Var.showDialog(u1Var2);
                                        TextView textView22 = (TextView) u1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                                if (bb1Var.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = bb1Var.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = bb1Var.H;
                                    bb1Var.presentFragment(twoStepVerificationActivity, true);
                                    l90 l90Var = bb1Var.f45814k0;
                                    if (l90Var != null) {
                                        org.telegram.messenger.g0.g3(l90Var);
                                        bb1Var.f45814k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                bb1Var.H0();
                                return;
                            default:
                                int i172 = bb1Var.P;
                                bb1Var.N = true;
                                if (bb1Var.f45815n.getTransformationMethod() == null) {
                                    bb1Var.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                        bb1Var.f45810g0[3].P(-1);
                                        org.telegram.ui.Components.mh0 animatedDrawable = bb1Var.f45799a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mh0 mh0Var2 = bb1Var.f45810g0[3];
                                        if (animatedDrawable != mh0Var2) {
                                            bb1Var.f45799a.setAnimation(mh0Var2);
                                            bb1Var.f45810g0[3].N(18, false, false);
                                        }
                                        bb1Var.f45799a.d();
                                    }
                                } else {
                                    bb1Var.f45815n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.u6.s(bb1Var.F, org.telegram.ui.ActionBar.n6.Pe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && bb1Var.f45815n.length() > 0 && bb1Var.f45815n.hasFocus()) {
                                        bb1Var.f45810g0[3].P(18);
                                        org.telegram.ui.Components.mh0 animatedDrawable2 = bb1Var.f45799a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mh0 mh0Var22 = bb1Var.f45810g0[3];
                                        if (animatedDrawable2 != mh0Var22) {
                                            bb1Var.f45799a.setAnimation(mh0Var22);
                                        }
                                        bb1Var.f45810g0[3].T(false, 0.0f);
                                        bb1Var.f45799a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = bb1Var.f45815n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                bb1Var.N = false;
                                return;
                        }
                    }
                });
                this.f45819x.setVisibility(0);
                this.f45799a.f(2131624307, 120, 120, null);
                this.f45799a.d();
                i12 = 1;
                break;
            case 6:
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131743694, null));
                this.d.setText(org.telegram.messenger.gd.M0(2131745353, null));
                this.f45801b.setText(org.telegram.messenger.gd.M0(2131743696, null));
                this.d.setVisibility(0);
                this.f45799a.f(2131624306, 140, 140, null);
                this.f45799a.d();
                i12 = 1;
                break;
            case 7:
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131743698, null));
                this.d.setText(org.telegram.messenger.gd.M0(2131743697, null));
                if (this.Z) {
                    this.f45801b.setText(org.telegram.messenger.gd.M0(2131743700, null));
                } else if (this.I) {
                    this.f45801b.setText(org.telegram.messenger.gd.M0(2131751760, null));
                } else {
                    this.f45801b.setText(org.telegram.messenger.gd.M0(2131743699, null));
                }
                this.d.setVisibility(0);
                this.f45799a.f(2131624354, 160, 160, null);
                this.f45799a.d();
                i12 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131747024, null));
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131747024, null));
                this.d.setText(org.telegram.messenger.gd.M0(2131752149, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45806e.setText(org.telegram.messenger.gd.M0(2131750575, null));
                org.telegram.ui.ActionBar.u6.U(this.f45806e, org.telegram.ui.ActionBar.n6.f29594o6, null);
                this.f45817s.setText(org.telegram.messenger.gd.M0(2131748534, null));
                this.f45815n.setContentDescription(org.telegram.messenger.gd.M0(2131748534, null));
                this.f45815n.setImeOptions(268435462);
                this.f45815n.setInputType(129);
                this.f45815n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f45815n.setTypeface(Typeface.DEFAULT);
                this.f45799a.f(2131624360, 120, 120, null);
                this.f45799a.d();
                i12 = 1;
                break;
            case 9:
                this.f45803c.setText(org.telegram.messenger.gd.M0(2131752148, null));
                this.d.setText(org.telegram.messenger.gd.M0(2131752147, null));
                this.f45801b.setText(org.telegram.messenger.gd.M0(2131752150, null));
                this.d.setVisibility(0);
                this.f45799a.f(2131624359, 140, 140, null);
                this.f45799a.d();
                i12 = 1;
                break;
            default:
                i12 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor6 = this.f45815n;
        if (editTextBoldCursor6 != null) {
            editTextBoldCursor6.addTextChangedListener(new ya1(this, i12));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.h2 h2Var : getParentLayout().getFragmentStack()) {
            if (h2Var != this && (h2Var instanceof bb1)) {
                ((org.telegram.ui.Components.r51) ((bb1) h2Var).f45804c0.f13936b).f39044b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29337a7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45803c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45815n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45815n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29523k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45815n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29541l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i7 = this.P;
        if (i7 != 7 && i7 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z10) {
                N0();
                return false;
            }
            return false;
        }
        if (z10) {
            finishFragment();
        }
        return true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        if (this.f45799a != null) {
            int i11 = this.P;
            if (i11 == 2 && org.telegram.messenger.g0.O1()) {
                this.f45799a.setVisibility(8);
            } else if (i11 != 6 && i11 != 9 && i11 != 7) {
                org.telegram.ui.Components.ph0 ph0Var = this.f45799a;
                Point point = org.telegram.messenger.g0.f24118q;
                if (point.x > point.y) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                ph0Var.setVisibility(i7);
            }
        }
        org.telegram.ui.Components.pr prVar = this.f45809f0;
        if (prVar != null) {
            if (!A0()) {
                i10 = 8;
            }
            prVar.setVisibility(i10);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        sa1 sa1Var = this.f45811h0;
        if (sa1Var != null) {
            org.telegram.messenger.g0.r(sa1Var);
            this.f45811h0 = null;
        }
        if (this.f45810g0 != null) {
            int i7 = 0;
            while (true) {
                org.telegram.ui.Components.mh0[] mh0VarArr = this.f45810g0;
                if (i7 >= mh0VarArr.length) {
                    break;
                }
                mh0VarArr[i7].C(false);
                i7++;
            }
            this.f45810g0 = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T = false;
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.v1(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.h21 h21Var = this.f45807e0;
            if (h21Var != null) {
                h21Var.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29541l6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f45815n != null && !A0()) {
                org.telegram.messenger.g0.h3(new sa1(this, 2), 200L);
            }
            mb0 mb0Var = this.f45819x;
            if (mb0Var != null && mb0Var.getVisibility() == 0) {
                org.telegram.messenger.g0.h3(new sa1(this, 3), 200L);
            }
        }
    }

    public final void z0(Runnable runnable) {
        int i7 = 0;
        while (true) {
            mb0 mb0Var = this.f45819x;
            er[] erVarArr = mb0Var.f46274f;
            if (i7 < erVarArr.length) {
                er erVar = erVarArr[i7];
                erVar.postDelayed(new ki0(erVar, 1), i7 * 75);
                i7++;
            } else {
                mb0Var.postDelayed(new b31(18, this, runnable), (erVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle k10 = a8.p0.k("afterSignup", true);
            me0 me0Var = new me0();
            me0Var.r0(k10);
            presentFragment(me0Var, true);
            return;
        }
        super.finishFragment();
    }

    public bb1(int i7, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.f45812i0 = new sa1(this, 0);
        this.f45813j0 = new sa1(this, 1);
        this.P = i7;
        this.V = password;
        if (password == null && (i7 == 6 || i7 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ua1(this, 0), 10);
            return;
        }
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void G0() {
    }
}
