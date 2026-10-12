package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public class kh1 extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.ActionBar.j0 E;
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
    public org.telegram.ui.Components.ik0 f39491a;
    public String f39492a0;
    public TextView f39493b;
    public m.f3 f39494b0;
    public TextView f39495c;
    public org.telegram.ui.Components.s20 f39496c0;
    public vh.n d;
    public org.telegram.ui.Components.p41 f39497d0;
    public TextView f39498e;
    public org.telegram.ui.Components.ns f39499e0;
    public TextView f39500f;
    public org.telegram.ui.Components.fk0[] f39501f0;
    public ch1 f39502g0;
    public TextView h;
    public final Runnable f39503h0;
    public final Runnable f39504i0;
    public ac0 f39505j0;
    public EditTextBoldCursor f39506n;
    public EditTextBoldCursor f39507r;
    public org.telegram.ui.Components.de0 f39508s;
    public org.telegram.ui.Components.de0 v;
    public de0 f39509w;
    public jh1 f39510x;
    public ci.r6 f39511y;

    public kh1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f39503h0 = new ch1(this, 2);
        this.f39504i0 = new ch1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new dh1(this, 0), 10);
            }
        }
    }

    public static void U(kh1 kh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = kh1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(kh1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = kh1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        hg.o0 o0Var = new hg.o0(kh1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = kh1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = kh1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(kh1Var.X, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = kh1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = kh1Var.U.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        o0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(kh1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            o0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(kh1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
    }

    public static void V(kh1 kh1Var) {
        ConnectionsManager.getInstance(kh1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ai.v7(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        kh1Var.showDialog(alertDialog$Builder.f20142a);
    }

    public static void W(kh1 kh1Var, byte[] bArr) {
        ArrayList arrayList = kh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = kh1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = kh1Var.U;
        if (bArr == null) {
            bArr = kh1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, kh1Var.W, kh1Var.X);
        twoStepVerificationActivity.X = kh1Var.G;
        kh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
        ac0 ac0Var = kh1Var.f39505j0;
        if (ac0Var != null) {
            AndroidUtilities.runOnUIThread(ac0Var);
            kh1Var.f39505j0 = null;
        }
    }

    public static void X(kh1 kh1Var) {
        ArrayList arrayList = kh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(kh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = kh1Var.V;
        TL_account.Password password = kh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, kh1Var.R, kh1Var.Q, null, kh1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = kh1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, kh1Var.V, kh1Var.W, kh1Var.X);
        twoStepVerificationActivity.X = kh1Var.G;
        kh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
        ac0 ac0Var = kh1Var.f39505j0;
        if (ac0Var != null) {
            AndroidUtilities.runOnUIThread(ac0Var);
            kh1Var.f39505j0 = null;
        }
    }

    public static void Y(kh1 kh1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = kh1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        bc0 bc0Var = new bc0(29, kh1Var, bArr2);
        TL_account.Password password = kh1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                bc0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(kh1Var.currentAccount).sendRequest(getpasswordsettings, bc0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        bc0Var.run(null, tL_error2);
    }

    public static void Z(kh1 kh1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(kh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new dh1(kh1Var, 4), 8);
            return;
        }
        kh1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            kh1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            kh1Var.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20781p7, false));
            kh1Var.z0(kh1Var.f39508s, kh1Var.f39506n, true);
            kh1Var.H0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            kh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            kh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(kh1 kh1Var) {
        ArrayList arrayList = kh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        kh1Var.finishFragment();
    }

    public static void b0(kh1 kh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            kh1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.g5.w0(kh1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            kh1Var.T = !TextUtils.isEmpty(kh1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(kh1Var.U);
            if (!kh1Var.S && kh1Var.Y) {
                TL_account.Password password2 = kh1Var.U;
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
                    if (!kh1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        kh1Var.finishFragment();
                    }
                }
            }
            if (kh1Var.N) {
                kh1Var.w0();
                kh1Var.C0();
            }
            NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
        }
    }

    public static void c0(kh1 kh1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            kh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            kh1Var.E0(z10);
            NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
        }
    }

    public static void d0(kh1 kh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = kh1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(kh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ci.s3(12, kh1Var, z10), 8);
            return;
        }
        kh1Var.w0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            kh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                kh1Var.finishFragment();
            } else if (kh1Var.getParentActivity() != null) {
                if (kh1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ns0(19, kh1Var, bArr));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    if (str == null && (password = kh1Var.U) != null && password.has_password) {
                        a2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    a2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = kh1Var.showDialog(a2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((org.telegram.ui.ActionBar.m2) arrayList.get(i11)).removeSelfFromStack();
                }
                TL_account.Password password2 = kh1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (kh1Var.Y) {
                    NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                kh1 kh1Var2 = new kh1(7, kh1Var.U);
                kh1Var2.H = kh1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = kh1Var.V;
                }
                kh1Var2.D0(bArr3, kh1Var.W, kh1Var.X, kh1Var.Z);
                kh1Var2.Y = kh1Var.Y;
                kh1Var2.G = kh1Var.G;
                kh1Var.presentFragment(kh1Var2, true);
                NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    kh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    kh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    kh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.m2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(kh1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = kh1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = kh1Var.R;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, kh1Var.Q, str2, kh1Var.P);
            TL_account.Password password4 = kh1Var.U;
            password4.email_unconfirmed_pattern = kh1Var.R;
            kh1 kh1Var3 = new kh1(5, password4);
            kh1Var3.H = kh1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = kh1Var.V;
            }
            kh1Var3.D0(bArr2, kh1Var.W, kh1Var.X, kh1Var.Z);
            kh1Var3.Y = kh1Var.Y;
            kh1Var3.G = kh1Var.G;
            kh1Var.presentFragment(kh1Var3, true);
        }
    }

    public static void e0(kh1 kh1Var, TLRPC.TL_error tL_error) {
        kh1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = kh1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, kh1Var.V, kh1Var.W, kh1Var.X);
            twoStepVerificationActivity.X = kh1Var.G;
            kh1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            ac0 ac0Var = kh1Var.f39505j0;
            if (ac0Var != null) {
                AndroidUtilities.runOnUIThread(ac0Var);
                kh1Var.f39505j0 = null;
            }
        }
    }

    public static void f0(kh1 kh1Var) {
        ArrayList arrayList = kh1Var.J;
        if (kh1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new bh1(kh1Var, 4));
            boolean z10 = kh1Var.U.has_recovery;
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            if (z10) {
                a2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                a2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            a2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = kh1Var.showDialog(a2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = kh1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        kh1 kh1Var2 = new kh1(7, password);
        kh1Var2.H = kh1Var.H;
        kh1Var2.D0(kh1Var.V, kh1Var.W, kh1Var.X, kh1Var.Z);
        kh1Var2.J.addAll(arrayList);
        kh1Var2.Y = kh1Var.Y;
        kh1Var2.G = kh1Var.G;
        kh1Var.presentFragment(kh1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(kh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = kh1Var.V;
        TL_account.Password password2 = kh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, kh1Var.R, kh1Var.Q, null, kh1Var.P);
        NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
    }

    public static void g0(kh1 kh1Var, String str) {
        kh1 kh1Var2 = new kh1(kh1Var.currentAccount, 0, kh1Var.U);
        kh1Var2.H = kh1Var.H;
        kh1Var2.J.addAll(kh1Var.J);
        kh1Var2.J.add(kh1Var);
        kh1Var2.f39492a0 = str;
        kh1Var2.G = kh1Var.G;
        kh1Var.presentFragment(kh1Var2, true);
    }

    public static void h0(kh1 kh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            kh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(kh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, kh1Var.U);
            kh1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            kh1 kh1Var = new kh1(this.currentAccount, 3, password);
            kh1Var.H = this.H;
            kh1Var.D0(this.V, this.W, this.X, this.Z);
            kh1Var.P = this.P;
            kh1Var.Q = this.Q;
            kh1Var.J.addAll(this.J);
            kh1Var.J.add(this);
            kh1Var.Y = this.Y;
            kh1Var.G = this.G;
            presentFragment(kh1Var);
            return;
        }
        this.R = "";
        E0(false);
    }

    public final void C0() {
        if (getParentActivity() != null) {
            int i10 = 1;
            switch (this.O) {
                case 0:
                case 1:
                    if (this.f39506n.length() == 0) {
                        z0(this.f39508s, this.f39506n, false);
                        return;
                    } else if (!this.f39506n.getText().toString().equals(this.P) && this.O == 1) {
                        AndroidUtilities.shakeViewSpring(this.f39508s, 5.0f);
                        try {
                            this.f39508s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    } else {
                        int i11 = this.currentAccount;
                        if (this.O != 0) {
                            i10 = 2;
                        }
                        kh1 kh1Var = new kh1(i11, i10, this.U);
                        kh1Var.H = this.H;
                        kh1Var.P = this.f39506n.getText().toString();
                        kh1Var.D0(this.V, this.W, this.X, this.Z);
                        kh1Var.f39492a0 = this.f39492a0;
                        kh1Var.J.addAll(this.J);
                        kh1Var.J.add(this);
                        kh1Var.Y = this.Y;
                        kh1Var.G = this.G;
                        presentFragment(kh1Var);
                        return;
                    }
                case 2:
                    String obj = this.f39506n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        z0(this.f39508s, this.f39506n, false);
                        return;
                    }
                    A0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f39506n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            E0(false);
                            return;
                        }
                    }
                    z0(this.f39508s, this.f39506n, false);
                    return;
                case 4:
                    String code = this.f39509w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new bc0(28, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f39509w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new dh1(this, 2), 10);
                    x0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    kh1 kh1Var2 = new kh1(this.currentAccount, 0, password);
                    kh1Var2.H = this.H;
                    kh1Var2.Y = this.Y;
                    kh1Var2.G = this.G;
                    presentFragment(kh1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle i12 = a1.g.i("afterSignup", true);
                        gh0 gh0Var = new gh0();
                        gh0Var.l0(i12);
                        presentFragment(gh0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        ac0 ac0Var = this.f39505j0;
                        if (ac0Var != null) {
                            AndroidUtilities.runOnUIThread(ac0Var);
                            this.f39505j0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.U == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    String obj3 = this.f39506n.getText().toString();
                    if (obj3.length() == 0) {
                        z0(this.f39508s, this.f39506n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    x0();
                    Utilities.globalQueue.postRunnable(new eh1(this, stringBytes, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void D0(byte[] bArr, long j3, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j3;
        this.Z = z10;
    }

    public final void E0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new dh1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
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
        if (this.f39492a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f39492a0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.V;
            if (bArr == null || bArr.length == 0 || (z10 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        x0();
        Utilities.globalQueue.postRunnable(new ci.t1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void F0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kh1.F0(boolean):void");
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.R = str;
        a2Var.T = str2;
        showDialog(a2Var);
    }

    public final void H0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f39493b.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f39493b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f39493b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.f39498e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f39498e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f39498e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f39493b, property, 1.0f), ObjectAnimator.ofFloat(this.f39493b, property2, 1.0f), ObjectAnimator.ofFloat(this.f39493b, property3, 1.0f));
        } else {
            this.f39498e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f39493b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f39493b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f39493b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f39498e, property4, 1.0f), ObjectAnimator.ofFloat(this.f39498e, property5, 1.0f), ObjectAnimator.ofFloat(this.f39498e, property6, 1.0f));
        }
        this.I.addListener(new h70(11, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f20142a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new bh1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i15, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ih1(this));
        int i16 = this.O;
        if (i16 == 5) {
            this.actionBar.p().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(context, this.resourceProvider, false);
        this.f39496c0 = s20Var;
        this.f39494b0 = new m.f3(s20Var);
        this.f39496c0.setOnClickListener(new View.OnClickListener(this) {
            public final kh1 f44480b;

            {
                this.f44480b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44480b.C0();
                        return;
                    case 1:
                        kh1 kh1Var = this.f44480b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.T = string;
                        kh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        kh1.V(this.f44480b);
                        return;
                    case 3:
                        kh1 kh1Var2 = this.f44480b;
                        if (kh1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = kh1Var2.O;
                            if (i17 == 0) {
                                kh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                kh1Var2.showDialog(a2Var2);
                                TextView textView = (TextView) a2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                kh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        kh1 kh1Var3 = this.f44480b;
                        if (kh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = kh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = kh1Var3.G;
                            kh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = kh1Var3.f39505j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                kh1Var3.f39505j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f44480b.C0();
                        return;
                    default:
                        kh1 kh1Var4 = this.f44480b;
                        int i18 = kh1Var4.O;
                        kh1Var4.M = true;
                        if (kh1Var4.f39506n.getTransformationMethod() == null) {
                            kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(-1);
                                org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var = kh1Var4.f39501f0[3];
                                if (animatedDrawable != fk0Var) {
                                    kh1Var4.f39491a.setAnimation(fk0Var);
                                    kh1Var4.f39501f0[3].N(18, false, false);
                                }
                                kh1Var4.f39491a.d();
                            }
                        } else {
                            kh1Var4.f39506n.setTransformationMethod(null);
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(18);
                                org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                if (animatedDrawable2 != fk0Var2) {
                                    kh1Var4.f39491a.setAnimation(fk0Var2);
                                }
                                kh1Var4.f39501f0[3].T(0.0f, false);
                                kh1Var4.f39491a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = kh1Var4.f39506n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        kh1Var4.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(context);
        this.f39497d0 = p41Var;
        p41Var.setTransformType(1);
        this.f39497d0.setProgress(0.0f);
        this.f39497d0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false));
        this.f39497d0.setDrawBackground(false);
        this.f39496c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.f39496c0.addView(this.f39497d0, w7.w5.e(56, 56, 17));
        this.f39496c0.a(this.f39497d0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20763o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        m.f3.s(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final kh1 f44480b;

            {
                this.f44480b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44480b.C0();
                        return;
                    case 1:
                        kh1 kh1Var = this.f44480b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.T = string;
                        kh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        kh1.V(this.f44480b);
                        return;
                    case 3:
                        kh1 kh1Var2 = this.f44480b;
                        if (kh1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = kh1Var2.O;
                            if (i17 == 0) {
                                kh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                kh1Var2.showDialog(a2Var2);
                                TextView textView2 = (TextView) a2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                kh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        kh1 kh1Var3 = this.f44480b;
                        if (kh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = kh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = kh1Var3.G;
                            kh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = kh1Var3.f39505j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                kh1Var3.f39505j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f44480b.C0();
                        return;
                    default:
                        kh1 kh1Var4 = this.f44480b;
                        int i18 = kh1Var4.O;
                        kh1Var4.M = true;
                        if (kh1Var4.f39506n.getTransformationMethod() == null) {
                            kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(-1);
                                org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var = kh1Var4.f39501f0[3];
                                if (animatedDrawable != fk0Var) {
                                    kh1Var4.f39491a.setAnimation(fk0Var);
                                    kh1Var4.f39501f0[3].N(18, false, false);
                                }
                                kh1Var4.f39491a.d();
                            }
                        } else {
                            kh1Var4.f39506n.setTransformationMethod(null);
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(18);
                                org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                if (animatedDrawable2 != fk0Var2) {
                                    kh1Var4.f39491a.setAnimation(fk0Var2);
                                }
                                kh1Var4.f39501f0[3].T(0.0f, false);
                                kh1Var4.f39491a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = kh1Var4.f39506n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        kh1Var4.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f39491a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f39491a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.ik0 ik0Var = this.f39491a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            ik0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f39495c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f39495c.setGravity(1);
        this.f39495c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f39495c.setTextSize(1, 24.0f);
        vh.n nVar = new vh.n(context);
        this.d = nVar;
        int i17 = org.telegram.ui.ActionBar.h6.D6;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f39498e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.f39498e.setGravity(1);
        this.f39498e.setTextSize(1, 14.0f);
        this.f39498e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f39498e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f39498e.setVisibility(8);
        this.f39498e.setOnClickListener(new View.OnClickListener(this) {
            public final kh1 f44480b;

            {
                this.f44480b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44480b.C0();
                        return;
                    case 1:
                        kh1 kh1Var = this.f44480b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.T = string;
                        kh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        kh1.V(this.f44480b);
                        return;
                    case 3:
                        kh1 kh1Var2 = this.f44480b;
                        if (kh1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = kh1Var2.O;
                            if (i172 == 0) {
                                kh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                kh1Var2.showDialog(a2Var2);
                                TextView textView22 = (TextView) a2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                kh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        kh1 kh1Var3 = this.f44480b;
                        if (kh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = kh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = kh1Var3.G;
                            kh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = kh1Var3.f39505j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                kh1Var3.f39505j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f44480b.C0();
                        return;
                    default:
                        kh1 kh1Var4 = this.f44480b;
                        int i18 = kh1Var4.O;
                        kh1Var4.M = true;
                        if (kh1Var4.f39506n.getTransformationMethod() == null) {
                            kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(-1);
                                org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var = kh1Var4.f39501f0[3];
                                if (animatedDrawable != fk0Var) {
                                    kh1Var4.f39491a.setAnimation(fk0Var);
                                    kh1Var4.f39501f0[3].N(18, false, false);
                                }
                                kh1Var4.f39491a.d();
                            }
                        } else {
                            kh1Var4.f39506n.setTransformationMethod(null);
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(18);
                                org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                if (animatedDrawable2 != fk0Var2) {
                                    kh1Var4.f39491a.setAnimation(fk0Var2);
                                }
                                kh1Var4.f39501f0[3].T(0.0f, false);
                                kh1Var4.f39491a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = kh1Var4.f39506n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        kh1Var4.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f39493b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f39493b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39493b.setGravity(17);
        this.f39493b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.f39493b.setTextSize(1, 15.0f);
        this.f39493b.setTypeface(AndroidUtilities.bold());
        this.f39493b.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{24.0f}, org.telegram.ui.ActionBar.h6.Oh));
        this.f39493b.setOnClickListener(new View.OnClickListener(this) {
            public final kh1 f44480b;

            {
                this.f44480b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44480b.C0();
                        return;
                    case 1:
                        kh1 kh1Var = this.f44480b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.T = string;
                        kh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        kh1.V(this.f44480b);
                        return;
                    case 3:
                        kh1 kh1Var2 = this.f44480b;
                        if (kh1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = kh1Var2.O;
                            if (i172 == 0) {
                                kh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                kh1Var2.showDialog(a2Var2);
                                TextView textView22 = (TextView) a2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                kh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        kh1 kh1Var3 = this.f44480b;
                        if (kh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = kh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = kh1Var3.G;
                            kh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = kh1Var3.f39505j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                kh1Var3.f39505j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f44480b.C0();
                        return;
                    default:
                        kh1 kh1Var4 = this.f44480b;
                        int i18 = kh1Var4.O;
                        kh1Var4.M = true;
                        if (kh1Var4.f39506n.getTransformationMethod() == null) {
                            kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(-1);
                                org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var = kh1Var4.f39501f0[3];
                                if (animatedDrawable != fk0Var) {
                                    kh1Var4.f39491a.setAnimation(fk0Var);
                                    kh1Var4.f39501f0[3].N(18, false, false);
                                }
                                kh1Var4.f39491a.d();
                            }
                        } else {
                            kh1Var4.f39506n.setTransformationMethod(null);
                            kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                kh1Var4.f39501f0[3].P(18);
                                org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                if (animatedDrawable2 != fk0Var2) {
                                    kh1Var4.f39491a.setAnimation(fk0Var2);
                                }
                                kh1Var4.f39501f0[3].T(0.0f, false);
                                kh1Var4.f39491a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = kh1Var4.f39506n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        kh1Var4.M = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f39495c.setTypeface(AndroidUtilities.bold());
            this.f39495c.setTextSize(1, 18.0f);
        } else {
            this.f39495c.setTypeface(Typeface.DEFAULT);
            this.f39495c.setTextSize(1, 24.0f);
        }
        switch (i16) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                k0 k0Var = new k0(this, context, 26);
                org.telegram.ui.Components.bb0 bb0Var = new org.telegram.ui.Components.bb0(this, context, k0Var, 2);
                bb0Var.addView(k0Var);
                u9 u9Var = new u9(this, context, bb0Var);
                jh1 jh1Var = new jh1(this, context);
                this.f39510x = jh1Var;
                jh1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.f39510x, w7.w5.d(-1.0f, -1));
                k0Var.addView(this.h, w7.w5.a(56.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 80));
                k0Var.addView(this.f39496c0, org.telegram.ui.Components.s20.b());
                u9Var.addView(bb0Var, w7.w5.d(-1.0f, -1));
                fc1 fc1Var = new fc1(this, context, 15);
                fc1Var.setOrientation(1);
                this.f39510x.addView(fc1Var, w7.w5.x(-1, -1, 51));
                fc1Var.addView(this.f39491a, w7.w5.t(-2, -2, 49, 0, 69, 0, 0));
                fc1Var.addView(this.f39495c, w7.w5.t(-2, -2, 49, 0, 8, 0, 0));
                fc1Var.addView(this.d, w7.w5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.de0 de0Var = new org.telegram.ui.Components.de0(context, null);
                this.f39508s = de0Var;
                de0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f39506n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f39506n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f39506n;
                int i18 = org.telegram.ui.ActionBar.h6.f20706l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                this.f39506n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                this.f39506n.setBackground(null);
                this.f39506n.setMaxLines(1);
                this.f39506n.setLines(1);
                this.f39506n.setGravity(3);
                this.f39506n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f39506n.setSingleLine(true);
                this.f39506n.setCursorWidth(1.5f);
                this.f39506n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final kh1 f44848b;

                    {
                        this.f44848b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                kh1 kh1Var = this.f44848b;
                                kh1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                kh1Var.C0();
                                return true;
                            default:
                                kh1 kh1Var2 = this.f44848b;
                                kh1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (kh1Var2.v.getVisibility() == 0) {
                                    kh1Var2.f39507r.requestFocus();
                                } else {
                                    kh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f39508s.e(this.f39506n);
                this.f39506n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final kh1 f35813b;

                    {
                        this.f35813b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.de0 de0Var2 = this.f35813b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                de0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                kh1 kh1Var = this.f35813b;
                                if (z11) {
                                    kh1Var.f39499e0.setEditText((EditText) view);
                                    kh1Var.f39499e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                kh1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.de0 de0Var3 = this.f35813b.f39508s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                de0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f39506n, w7.w5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(this, context, 3);
                this.E = j0Var;
                j0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.E.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20651i6, false), 1, -1));
                this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final kh1 f44480b;

                    {
                        this.f44480b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f44480b.C0();
                                return;
                            case 1:
                                kh1 kh1Var = this.f44480b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                                a2Var.T = string;
                                kh1Var.showDialog(a2Var);
                                return;
                            case 2:
                                kh1.V(this.f44480b);
                                return;
                            case 3:
                                kh1 kh1Var2 = this.f44480b;
                                if (kh1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = kh1Var2.O;
                                    if (i172 == 0) {
                                        kh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                        kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                        alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                        kh1Var2.showDialog(a2Var2);
                                        TextView textView22 = (TextView) a2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        kh1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                kh1 kh1Var3 = this.f44480b;
                                if (kh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = kh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = kh1Var3.G;
                                    kh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    ac0 ac0Var = kh1Var3.f39505j0;
                                    if (ac0Var != null) {
                                        AndroidUtilities.runOnUIThread(ac0Var);
                                        kh1Var3.f39505j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f44480b.C0();
                                return;
                            default:
                                kh1 kh1Var4 = this.f44480b;
                                int i182 = kh1Var4.O;
                                kh1Var4.M = true;
                                if (kh1Var4.f39506n.getTransformationMethod() == null) {
                                    kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                        kh1Var4.f39501f0[3].P(-1);
                                        org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                        org.telegram.ui.Components.fk0 fk0Var = kh1Var4.f39501f0[3];
                                        if (animatedDrawable != fk0Var) {
                                            kh1Var4.f39491a.setAnimation(fk0Var);
                                            kh1Var4.f39501f0[3].N(18, false, false);
                                        }
                                        kh1Var4.f39491a.d();
                                    }
                                } else {
                                    kh1Var4.f39506n.setTransformationMethod(null);
                                    kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                        kh1Var4.f39501f0[3].P(18);
                                        org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                        org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                        if (animatedDrawable2 != fk0Var2) {
                                            kh1Var4.f39491a.setAnimation(fk0Var2);
                                        }
                                        kh1Var4.f39501f0[3].T(0.0f, false);
                                        kh1Var4.f39491a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = kh1Var4.f39506n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                kh1Var4.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.w5.t(24, 24, 16, 0, 0, 16, 0));
                this.f39506n.addTextChangedListener(new hh1(this, 2));
                this.f39508s.addView(linearLayout, w7.w5.d(-2.0f, -1));
                fc1Var.addView(this.f39508s, w7.w5.a(-2.0f, 24.0f, 32.0f, 24.0f, 32.0f, -1, 49));
                this.v = new org.telegram.ui.Components.de0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f39507r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f39507r.setPadding(dp2, dp2, dp2, dp2);
                this.f39507r.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                this.f39507r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                this.f39507r.setBackground(null);
                this.f39507r.setMaxLines(1);
                this.f39507r.setLines(1);
                this.f39507r.setGravity(3);
                this.f39507r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f39507r.setSingleLine(true);
                this.f39507r.setCursorWidth(1.5f);
                this.f39507r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final kh1 f44848b;

                    {
                        this.f44848b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                kh1 kh1Var = this.f44848b;
                                kh1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                kh1Var.C0();
                                return true;
                            default:
                                kh1 kh1Var2 = this.f44848b;
                                kh1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (kh1Var2.v.getVisibility() == 0) {
                                    kh1Var2.f39507r.requestFocus();
                                } else {
                                    kh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f39507r);
                this.f39507r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final kh1 f35813b;

                    {
                        this.f35813b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.de0 de0Var2 = this.f35813b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                de0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                kh1 kh1Var = this.f35813b;
                                if (z11) {
                                    kh1Var.f39499e0.setEditText((EditText) view);
                                    kh1Var.f39499e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                kh1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.de0 de0Var3 = this.f35813b.f39508s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                de0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f39507r, w7.w5.d(-2.0f, -1));
                fc1Var.addView(this.v, w7.w5.a(-2.0f, 24.0f, 16.0f, 24.0f, 0.0f, -1, 49));
                this.v.setVisibility(8);
                org.telegram.ui.Components.ns nsVar = new org.telegram.ui.Components.ns(context);
                this.f39499e0 = nsVar;
                nsVar.setVisibility(8);
                bb0Var.addView(this.f39499e0);
                de0 de0Var2 = new de0(this, context, 3);
                this.f39509w = de0Var2;
                final int i19 = 1;
                de0Var2.b(6, 1);
                hs[] hsVarArr = this.f39509w.f37834f;
                int length = hsVarArr.length;
                int i20 = 0;
                while (i20 < length) {
                    hs hsVar = hsVarArr[i20];
                    hsVar.setShowSoftInputOnFocusCompat(v0() ^ i19);
                    hsVar.addTextChangedListener(new hh1(this, 0));
                    hsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final kh1 f35813b;

                        {
                            this.f35813b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f7;
                            float f10;
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.Components.de0 de0Var22 = this.f35813b.v;
                                    if (z11) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    de0Var22.b(f7, f7, true);
                                    return;
                                case 1:
                                    kh1 kh1Var = this.f35813b;
                                    if (z11) {
                                        kh1Var.f39499e0.setEditText((EditText) view);
                                        kh1Var.f39499e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    kh1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.de0 de0Var3 = this.f35813b.f39508s;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    de0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i20++;
                    i19 = 1;
                }
                this.f39509w.setVisibility(8);
                fc1Var.addView(this.f39509w, w7.w5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                fc1Var.addView(frameLayout, w7.w5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f39498e, w7.w5.e(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f39500f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
                    this.f39500f.setGravity(1);
                    this.f39500f.setTextSize(1, 14.0f);
                    this.f39500f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f39500f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f39500f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    fc1Var.addView(this.f39500f, w7.w5.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f39500f.setOnClickListener(new View.OnClickListener(this) {
                        public final kh1 f44480b;

                        {
                            this.f44480b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f44480b.C0();
                                    return;
                                case 1:
                                    kh1 kh1Var = this.f44480b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                                    alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                                    a2Var.T = string;
                                    kh1Var.showDialog(a2Var);
                                    return;
                                case 2:
                                    kh1.V(this.f44480b);
                                    return;
                                case 3:
                                    kh1 kh1Var2 = this.f44480b;
                                    if (kh1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = kh1Var2.O;
                                        if (i172 == 0) {
                                            kh1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                            kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                            alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                            kh1Var2.showDialog(a2Var2);
                                            TextView textView22 = (TextView) a2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            kh1Var2.A0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    kh1 kh1Var3 = this.f44480b;
                                    if (kh1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = kh1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = kh1Var3.G;
                                        kh1Var3.presentFragment(twoStepVerificationActivity, true);
                                        ac0 ac0Var = kh1Var3.f39505j0;
                                        if (ac0Var != null) {
                                            AndroidUtilities.runOnUIThread(ac0Var);
                                            kh1Var3.f39505j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f44480b.C0();
                                    return;
                                default:
                                    kh1 kh1Var4 = this.f44480b;
                                    int i182 = kh1Var4.O;
                                    kh1Var4.M = true;
                                    if (kh1Var4.f39506n.getTransformationMethod() == null) {
                                        kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                            kh1Var4.f39501f0[3].P(-1);
                                            org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                            org.telegram.ui.Components.fk0 fk0Var = kh1Var4.f39501f0[3];
                                            if (animatedDrawable != fk0Var) {
                                                kh1Var4.f39491a.setAnimation(fk0Var);
                                                kh1Var4.f39501f0[3].N(18, false, false);
                                            }
                                            kh1Var4.f39491a.d();
                                        }
                                    } else {
                                        kh1Var4.f39506n.setTransformationMethod(null);
                                        kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                            kh1Var4.f39501f0[3].P(18);
                                            org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                            org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                            if (animatedDrawable2 != fk0Var2) {
                                                kh1Var4.f39491a.setAnimation(fk0Var2);
                                            }
                                            kh1Var4.f39501f0[3].T(0.0f, false);
                                            kh1Var4.f39491a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = kh1Var4.f39506n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    kh1Var4.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = u9Var;
                ci.r6 r6Var = new ci.r6(this, context);
                this.f39511y = r6Var;
                r6Var.setAlpha(0.0f);
                u9Var.addView(this.f39511y);
                u9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20706l6, false));
                k0Var.addView(this.L, w7.w5.a(32.0f, 0.0f, 16.0f, 16.0f, 0.0f, 32, 53));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new bi.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.f39491a);
                fVar.addView(this.f39495c);
                fVar.addView(this.d);
                fVar.addView(this.f39493b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f39495c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f39495c.setText(string);
                }
                if (!TextUtils.isEmpty(this.f39492a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.de0 de0Var3 = this.f39508s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                de0Var3.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f39506n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f39506n.setImeOptions(268435461);
                this.f39506n.setInputType(129);
                this.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f39506n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.fk0[] fk0VarArr = new org.telegram.ui.Components.fk0[7];
                this.f39501f0 = fk0VarArr;
                fk0VarArr[0] = new org.telegram.ui.Components.fk0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39501f0[1] = new org.telegram.ui.Components.fk0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39501f0[2] = new org.telegram.ui.Components.fk0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39501f0[3] = new org.telegram.ui.Components.fk0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39501f0[4] = new org.telegram.ui.Components.fk0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39501f0[5] = new org.telegram.ui.Components.fk0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39501f0[6] = new org.telegram.ui.Components.fk0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.fk0 fk0Var = this.f39501f0[6];
                fk0Var.h = true;
                fk0Var.P(19);
                this.f39501f0[2].S(97, this.f39504i0);
                F0(true);
                if (i16 == 1) {
                    ch1 ch1Var = this.f39502g0;
                    if (ch1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ch1Var);
                    }
                    this.f39491a.setAnimation(this.f39501f0[6]);
                    this.f39491a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f39506n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    F0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f39495c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f39508s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f39506n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f39506n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f39491a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.Z) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.f39495c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f39508s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f39506n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f39506n.setImeOptions(268435461);
                this.f39506n.setInputType(33);
                this.v.setVisibility(8);
                this.f39491a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f39495c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f39499e0.setVisibility(0);
                this.f39508s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f33255a |= 256;
                    obj.f33256b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f33257c = i21;
                    valueOf.setSpan(new org.telegram.ui.Components.a21(obj, 0), indexOf, i21, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.f39496c0.e(false, false);
                this.f39509w.setVisibility(0);
                this.f39491a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f39495c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f39508s.setVisibility(8);
                this.f39499e0.setVisibility(0);
                vh.n nVar2 = this.d;
                int i22 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                nVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i22, str));
                this.d.setVisibility(0);
                this.f39496c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final kh1 f44480b;

                    {
                        this.f44480b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f44480b.C0();
                                return;
                            case 1:
                                kh1 kh1Var = this.f44480b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bh1(kh1Var, 1));
                                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                                a2Var.T = string2;
                                kh1Var.showDialog(a2Var);
                                return;
                            case 2:
                                kh1.V(this.f44480b);
                                return;
                            case 3:
                                kh1 kh1Var2 = this.f44480b;
                                if (kh1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = kh1Var2.O;
                                    if (i172 == 0) {
                                        kh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = kh1Var2.f39492a0;
                                        kh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new dh1(kh1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh1Var2.getParentActivity());
                                        alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new bh1(kh1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20142a;
                                        kh1Var2.showDialog(a2Var2);
                                        TextView textView22 = (TextView) a2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        kh1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                kh1 kh1Var3 = this.f44480b;
                                if (kh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = kh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = kh1Var3.G;
                                    kh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    ac0 ac0Var = kh1Var3.f39505j0;
                                    if (ac0Var != null) {
                                        AndroidUtilities.runOnUIThread(ac0Var);
                                        kh1Var3.f39505j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f44480b.C0();
                                return;
                            default:
                                kh1 kh1Var4 = this.f44480b;
                                int i182 = kh1Var4.O;
                                kh1Var4.M = true;
                                if (kh1Var4.f39506n.getTransformationMethod() == null) {
                                    kh1Var4.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                        kh1Var4.f39501f0[3].P(-1);
                                        org.telegram.ui.Components.fk0 animatedDrawable = kh1Var4.f39491a.getAnimatedDrawable();
                                        org.telegram.ui.Components.fk0 fk0Var2 = kh1Var4.f39501f0[3];
                                        if (animatedDrawable != fk0Var2) {
                                            kh1Var4.f39491a.setAnimation(fk0Var2);
                                            kh1Var4.f39501f0[3].N(18, false, false);
                                        }
                                        kh1Var4.f39491a.d();
                                    }
                                } else {
                                    kh1Var4.f39506n.setTransformationMethod(null);
                                    kh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && kh1Var4.f39506n.length() > 0 && kh1Var4.f39506n.hasFocus()) {
                                        kh1Var4.f39501f0[3].P(18);
                                        org.telegram.ui.Components.fk0 animatedDrawable2 = kh1Var4.f39491a.getAnimatedDrawable();
                                        org.telegram.ui.Components.fk0 fk0Var22 = kh1Var4.f39501f0[3];
                                        if (animatedDrawable2 != fk0Var22) {
                                            kh1Var4.f39491a.setAnimation(fk0Var22);
                                        }
                                        kh1Var4.f39501f0[3].T(0.0f, false);
                                        kh1Var4.f39491a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = kh1Var4.f39506n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                kh1Var4.M = false;
                                return;
                        }
                    }
                });
                this.f39509w.setVisibility(0);
                this.f39491a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 6:
                this.f39495c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f39493b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f39491a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 7:
                this.f39495c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.Y) {
                    this.f39493b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
                    this.f39493b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f39493b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f39491a.f(R.raw.wallet_allset, 160, 160, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f39495c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f39498e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.f39498e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20763o6, false));
                this.f39508s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f39506n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f39506n.setImeOptions(268435462);
                this.f39506n.setInputType(129);
                this.f39506n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f39506n.setTypeface(Typeface.DEFAULT);
                this.f39491a.f(R.raw.wallet_science, 120, 120, null);
                this.f39491a.d();
                i14 = 1;
                break;
            case 9:
                this.f39495c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f39493b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f39491a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f39491a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f39506n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new hh1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
            if (m2Var != this && (m2Var instanceof kh1)) {
                ((org.telegram.ui.Components.b81) ((kh1) m2Var).f39494b0.f15424b).f24574b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39495c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39506n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39506n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39506n, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f20688k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39506n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f20706l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i10 = this.O;
        if (i10 != 7 && i10 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, true)) > 0.699999988079071d) {
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
    public final boolean onBackPressed(boolean z10) {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z10) {
                I0();
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
        int i10;
        super.onConfigurationChanged(configuration);
        int i11 = 0;
        if (this.f39491a != null) {
            int i12 = this.O;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f39491a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.ik0 ik0Var = this.f39491a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                ik0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.ns nsVar = this.f39499e0;
        if (nsVar != null) {
            if (!v0()) {
                i11 = 8;
            }
            nsVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        ch1 ch1Var = this.f39502g0;
        if (ch1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ch1Var);
            this.f39502g0 = null;
        }
        if (this.f39501f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.fk0[] fk0VarArr = this.f39501f0;
                if (i10 >= fk0VarArr.length) {
                    break;
                }
                fk0VarArr[i10].C(false);
                i10++;
            }
            this.f39501f0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
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
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f39506n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new ch1(this, 0), 200L);
            }
            de0 de0Var = this.f39509w;
            if (de0Var != null && de0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new ch1(this, 1), 200L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            de0 de0Var = this.f39509w;
            hs[] hsVarArr = de0Var.f37834f;
            if (i10 < hsVarArr.length) {
                hs hsVar = hsVarArr[i10];
                hsVar.postDelayed(new ql0(hsVar, 1), i10 * 75);
                i10++;
            } else {
                de0Var.postDelayed(new u31(25, this, runnable), (hsVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.O;
        if ((i10 == 5 || i10 == 4) && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w0() {
        this.f39496c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f39496c0.f(true, true);
        }
    }

    public final void y0() {
        hs[] hsVarArr;
        for (hs hsVar : this.f39509w.f37834f) {
            hsVar.setText("");
            hsVar.i(1.0f);
        }
        this.f39509w.f37834f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f39509w, 8.0f, new ch1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.de0 de0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(de0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = a1.g.i("afterSignup", true);
            gh0 gh0Var = new gh0();
            gh0Var.l0(i10);
            presentFragment(gh0Var, true);
            return;
        }
        super.finishFragment();
    }

    public kh1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f39503h0 = new ch1(this, 2);
        this.f39504i0 = new ch1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new dh1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void B0() {
    }
}
