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
public class dg1 extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.ActionBar.k0 E;
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
    public org.telegram.ui.Components.ak0 f38865a;
    public String f38866a0;
    public TextView f38867b;
    public k6.c f38868b0;
    public TextView f38869c;
    public org.telegram.ui.Components.j20 f38870c0;
    public xh.n d;
    public org.telegram.ui.Components.m41 f38871d0;
    public TextView e;
    public org.telegram.ui.Components.hs f38872e0;
    public TextView f38873f;
    public org.telegram.ui.Components.xj0[] f38874f0;
    public vf1 f38875g0;
    public TextView h;
    public final Runnable f38876h0;
    public final Runnable f38877i0;
    public hb0 f38878j0;
    public EditTextBoldCursor f38879n;
    public EditTextBoldCursor f38880r;
    public org.telegram.ui.Components.rd0 f38881s;
    public org.telegram.ui.Components.rd0 v;
    public ld0 f38882w;
    public cg1 f38883x;
    public fi.f6 f38884y;

    public dg1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f38876h0 = new vf1(this, 2);
        this.f38877i0 = new vf1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new wf1(this, 0), 10);
            }
        }
    }

    public static void V(dg1 dg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = dg1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(dg1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = dg1Var.U.new_algo;
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
        jg.n0 n0Var = new jg.n0(dg1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = dg1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = dg1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(dg1Var.X, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = dg1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = dg1Var.U.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        n0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(dg1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            n0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(dg1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
    }

    public static void W(dg1 dg1Var) {
        ConnectionsManager.getInstance(dg1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new di.d6(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        dg1Var.showDialog(alertDialog$Builder.f22368a);
    }

    public static void X(dg1 dg1Var, byte[] bArr) {
        ArrayList arrayList = dg1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.r2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = dg1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = dg1Var.U;
        if (bArr == null) {
            bArr = dg1Var.V;
        }
        twoStepVerificationActivity.w0(password2, bArr, dg1Var.W, dg1Var.X);
        twoStepVerificationActivity.X = dg1Var.G;
        dg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
        hb0 hb0Var = dg1Var.f38878j0;
        if (hb0Var != null) {
            AndroidUtilities.runOnUIThread(hb0Var);
            dg1Var.f38878j0 = null;
        }
    }

    public static void Y(dg1 dg1Var) {
        ArrayList arrayList = dg1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.r2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(dg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = dg1Var.V;
        TL_account.Password password = dg1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, dg1Var.R, dg1Var.Q, null, dg1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = dg1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.w0(password2, dg1Var.V, dg1Var.W, dg1Var.X);
        twoStepVerificationActivity.X = dg1Var.G;
        dg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
        hb0 hb0Var = dg1Var.f38878j0;
        if (hb0Var != null) {
            AndroidUtilities.runOnUIThread(hb0Var);
            dg1Var.f38878j0 = null;
        }
    }

    public static void Z(dg1 dg1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = dg1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        l71 l71Var = new l71(8, dg1Var, bArr2);
        TL_account.Password password = dg1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                l71Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(dg1Var.currentAccount).sendRequest(getpasswordsettings, l71Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        l71Var.run(null, tL_error2);
    }

    public static void a0(dg1 dg1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(dg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new wf1(dg1Var, 4), 8);
            return;
        }
        dg1Var.x0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            dg1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            org.telegram.ui.ActionBar.f7.V(dg1Var.d, org.telegram.ui.ActionBar.y6.f23581p7, null);
            dg1Var.A0(dg1Var.f38881s, dg1Var.f38879n, true);
            dg1Var.I0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            dg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            dg1Var.H0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void b0(dg1 dg1Var) {
        ArrayList arrayList = dg1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.r2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        dg1Var.finishFragment();
    }

    public static void c0(dg1 dg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            dg1Var.U = password;
            if (!TwoStepVerificationActivity.j0(password, false)) {
                org.telegram.ui.Components.g5.w0(dg1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            dg1Var.T = !TextUtils.isEmpty(dg1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.n0(dg1Var.U);
            if (!dg1Var.S && dg1Var.Y) {
                TL_account.Password password2 = dg1Var.U;
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
                    if (!dg1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        dg1Var.finishFragment();
                    }
                }
            }
            if (dg1Var.N) {
                dg1Var.x0();
                dg1Var.D0();
            }
            NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
        }
    }

    public static void d0(dg1 dg1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            dg1Var.U = password;
            TwoStepVerificationActivity.n0(password);
            dg1Var.F0(z10);
            NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
        }
    }

    public static void e0(dg1 dg1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = dg1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(dg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new fi.m3(12, dg1Var, z10), 8);
            return;
        }
        dg1Var.x0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            dg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.r2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                dg1Var.finishFragment();
            } else if (dg1Var.getParentActivity() != null) {
                if (dg1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new af0(29, dg1Var, bArr));
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    if (str == null && (password = dg1Var.U) != null && password.has_password) {
                        e2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    e2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = dg1Var.showDialog(e2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((org.telegram.ui.ActionBar.r2) arrayList.get(i11)).removeSelfFromStack();
                }
                TL_account.Password password2 = dg1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (dg1Var.Y) {
                    NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                dg1 dg1Var2 = new dg1(7, dg1Var.U);
                dg1Var2.H = dg1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = dg1Var.V;
                }
                dg1Var2.E0(bArr3, dg1Var.W, dg1Var.X, dg1Var.Z);
                dg1Var2.Y = dg1Var.Y;
                dg1Var2.G = dg1Var.G;
                dg1Var.presentFragment(dg1Var2, true);
                NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    dg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    dg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.EmailNotAllowed));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    dg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    dg1Var.H0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.r2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(dg1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = dg1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = dg1Var.R;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, dg1Var.Q, str2, dg1Var.P);
            TL_account.Password password4 = dg1Var.U;
            password4.email_unconfirmed_pattern = dg1Var.R;
            dg1 dg1Var3 = new dg1(5, password4);
            dg1Var3.H = dg1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = dg1Var.V;
            }
            dg1Var3.E0(bArr2, dg1Var.W, dg1Var.X, dg1Var.Z);
            dg1Var3.Y = dg1Var.Y;
            dg1Var3.G = dg1Var.G;
            dg1Var.presentFragment(dg1Var3, true);
        }
    }

    public static void f0(dg1 dg1Var, TLRPC.TL_error tL_error) {
        dg1Var.x0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = dg1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.w0(password, dg1Var.V, dg1Var.W, dg1Var.X);
            twoStepVerificationActivity.X = dg1Var.G;
            dg1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            hb0 hb0Var = dg1Var.f38878j0;
            if (hb0Var != null) {
                AndroidUtilities.runOnUIThread(hb0Var);
                dg1Var.f38878j0 = null;
            }
        }
    }

    public static void g0(dg1 dg1Var) {
        ArrayList arrayList = dg1Var.J;
        if (dg1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new uf1(dg1Var, 4));
            boolean z10 = dg1Var.U.has_recovery;
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            if (z10) {
                e2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                e2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            e2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = dg1Var.showDialog(e2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.r2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = dg1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        dg1 dg1Var2 = new dg1(7, password);
        dg1Var2.H = dg1Var.H;
        dg1Var2.E0(dg1Var.V, dg1Var.W, dg1Var.X, dg1Var.Z);
        dg1Var2.J.addAll(arrayList);
        dg1Var2.Y = dg1Var.Y;
        dg1Var2.G = dg1Var.G;
        dg1Var.presentFragment(dg1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(dg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = dg1Var.V;
        TL_account.Password password2 = dg1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, dg1Var.R, dg1Var.Q, null, dg1Var.P);
        NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
    }

    public static void h0(dg1 dg1Var, String str) {
        dg1 dg1Var2 = new dg1(dg1Var.currentAccount, 0, dg1Var.U);
        dg1Var2.H = dg1Var.H;
        dg1Var2.J.addAll(dg1Var.J);
        dg1Var2.J.add(dg1Var);
        dg1Var2.f38866a0 = str;
        dg1Var2.G = dg1Var.G;
        dg1Var.presentFragment(dg1Var2, true);
    }

    public static void i0(dg1 dg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            dg1Var.U = password;
            TwoStepVerificationActivity.n0(password);
            NotificationCenter.getInstance(dg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, dg1Var.U);
            dg1Var.D0();
        }
    }

    public final void A0(org.telegram.ui.Components.rd0 rd0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(rd0Var, 5.0f);
    }

    public final void B0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            dg1 dg1Var = new dg1(this.currentAccount, 3, password);
            dg1Var.H = this.H;
            dg1Var.E0(this.V, this.W, this.X, this.Z);
            dg1Var.P = this.P;
            dg1Var.Q = this.Q;
            dg1Var.J.addAll(this.J);
            dg1Var.J.add(this);
            dg1Var.Y = this.Y;
            dg1Var.G = this.G;
            presentFragment(dg1Var);
            return;
        }
        this.R = "";
        F0(false);
    }

    public final void D0() {
        if (getParentActivity() != null) {
            int i10 = 1;
            switch (this.O) {
                case 0:
                case 1:
                    if (this.f38879n.length() == 0) {
                        A0(this.f38881s, this.f38879n, false);
                        return;
                    } else if (!this.f38879n.getText().toString().equals(this.P) && this.O == 1) {
                        AndroidUtilities.shakeViewSpring(this.f38881s, 5.0f);
                        try {
                            this.f38881s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else {
                        int i11 = this.currentAccount;
                        if (this.O != 0) {
                            i10 = 2;
                        }
                        dg1 dg1Var = new dg1(i11, i10, this.U);
                        dg1Var.H = this.H;
                        dg1Var.P = this.f38879n.getText().toString();
                        dg1Var.E0(this.V, this.W, this.X, this.Z);
                        dg1Var.f38866a0 = this.f38866a0;
                        dg1Var.J.addAll(this.J);
                        dg1Var.J.add(this);
                        dg1Var.Y = this.Y;
                        dg1Var.G = this.G;
                        presentFragment(dg1Var);
                        return;
                    }
                case 2:
                    String obj = this.f38879n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        A0(this.f38881s, this.f38879n, false);
                        return;
                    }
                    B0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f38879n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            F0(false);
                            return;
                        }
                    }
                    A0(this.f38881s, this.f38879n, false);
                    return;
                case 4:
                    String code = this.f38882w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new l71(7, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f38882w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new wf1(this, 2), 10);
                    y0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        y0();
                        this.N = true;
                        return;
                    }
                    dg1 dg1Var2 = new dg1(this.currentAccount, 0, password);
                    dg1Var2.H = this.H;
                    dg1Var2.Y = this.Y;
                    dg1Var2.G = this.G;
                    presentFragment(dg1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle i12 = a1.g.i("afterSignup", true);
                        pg0 pg0Var = new pg0();
                        pg0Var.i0(i12);
                        presentFragment(pg0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.w0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        hb0 hb0Var = this.f38878j0;
                        if (hb0Var != null) {
                            AndroidUtilities.runOnUIThread(hb0Var);
                            this.f38878j0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.U == null) {
                        y0();
                        this.N = true;
                        return;
                    }
                    String obj3 = this.f38879n.getText().toString();
                    if (obj3.length() == 0) {
                        A0(this.f38881s, this.f38879n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    y0();
                    Utilities.globalQueue.postRunnable(new xf1(this, stringBytes, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void E0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j10;
        this.Z = z10;
    }

    public final void F0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            y0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new wf1(this, 3));
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
        if (this.f38866a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f38866a0;
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
        y0();
        Utilities.globalQueue.postRunnable(new fi.r1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void G0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dg1.G0(boolean):void");
    }

    public final void H0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.R = str;
        e2Var.T = str2;
        showDialog(e2Var);
    }

    public final void I0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f38867b.getTag() != null) {
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
        TextView textView = this.f38867b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f38867b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f38867b, property, 1.0f), ObjectAnimator.ofFloat(this.f38867b, property2, 1.0f), ObjectAnimator.ofFloat(this.f38867b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f38867b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f38867b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f38867b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.I.addListener(new q40(12, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void J0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22368a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new uf1(this, 0));
        org.telegram.ui.ActionBar.f7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.y6.f23598q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        ?? r82;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.m(kVar, 5, i15, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, i15, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23675u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new bg1(this));
        int i16 = this.O;
        if (i16 == 5) {
            this.actionBar.l().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.f38870c0 = j20Var;
        this.f38868b0 = new k6.c(j20Var);
        this.f38870c0.setOnClickListener(new View.OnClickListener(this) {
            public final dg1 f43146b;

            {
                this.f43146b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43146b.D0();
                        return;
                    case 1:
                        dg1 dg1Var = this.f43146b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.T = string;
                        dg1Var.showDialog(e2Var);
                        return;
                    case 2:
                        dg1.W(this.f43146b);
                        return;
                    case 3:
                        dg1 dg1Var2 = this.f43146b;
                        if (dg1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = dg1Var2.O;
                            if (i17 == 0) {
                                dg1Var2.y0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                dg1Var2.showDialog(e2Var2);
                                TextView textView = (TextView) e2Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                dg1Var2.B0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        dg1 dg1Var3 = this.f43146b;
                        if (dg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = dg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = dg1Var3.G;
                            dg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = dg1Var3.f38878j0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                dg1Var3.f38878j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f43146b.D0();
                        return;
                    default:
                        dg1 dg1Var4 = this.f43146b;
                        int i18 = dg1Var4.O;
                        dg1Var4.M = true;
                        if (dg1Var4.f38879n.getTransformationMethod() == null) {
                            dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(-1);
                                org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var = dg1Var4.f38874f0[3];
                                if (animatedDrawable != xj0Var) {
                                    dg1Var4.f38865a.setAnimation(xj0Var);
                                    dg1Var4.f38874f0[3].N(18, false, false);
                                }
                                dg1Var4.f38865a.d();
                            }
                        } else {
                            dg1Var4.f38879n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(18);
                                org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                if (animatedDrawable2 != xj0Var2) {
                                    dg1Var4.f38865a.setAnimation(xj0Var2);
                                }
                                dg1Var4.f38874f0[3].T(0.0f, false);
                                dg1Var4.f38865a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = dg1Var4.f38879n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        dg1Var4.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(context);
        this.f38871d0 = m41Var;
        m41Var.setTransformType(1);
        this.f38871d0.setProgress(0.0f);
        this.f38871d0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false));
        this.f38871d0.setDrawBackground(false);
        this.f38870c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.f38870c0.addView(this.f38871d0, org.telegram.ui.Components.gb1.i(56, 56, 17));
        this.f38870c0.a(this.f38871d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23560o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        k6.c.h(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final dg1 f43146b;

            {
                this.f43146b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43146b.D0();
                        return;
                    case 1:
                        dg1 dg1Var = this.f43146b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.T = string;
                        dg1Var.showDialog(e2Var);
                        return;
                    case 2:
                        dg1.W(this.f43146b);
                        return;
                    case 3:
                        dg1 dg1Var2 = this.f43146b;
                        if (dg1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = dg1Var2.O;
                            if (i17 == 0) {
                                dg1Var2.y0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                dg1Var2.showDialog(e2Var2);
                                TextView textView2 = (TextView) e2Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                dg1Var2.B0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        dg1 dg1Var3 = this.f43146b;
                        if (dg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = dg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = dg1Var3.G;
                            dg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = dg1Var3.f38878j0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                dg1Var3.f38878j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f43146b.D0();
                        return;
                    default:
                        dg1 dg1Var4 = this.f43146b;
                        int i18 = dg1Var4.O;
                        dg1Var4.M = true;
                        if (dg1Var4.f38879n.getTransformationMethod() == null) {
                            dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(-1);
                                org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var = dg1Var4.f38874f0[3];
                                if (animatedDrawable != xj0Var) {
                                    dg1Var4.f38865a.setAnimation(xj0Var);
                                    dg1Var4.f38874f0[3].N(18, false, false);
                                }
                                dg1Var4.f38865a.d();
                            }
                        } else {
                            dg1Var4.f38879n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(18);
                                org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                if (animatedDrawable2 != xj0Var2) {
                                    dg1Var4.f38865a.setAnimation(xj0Var2);
                                }
                                dg1Var4.f38874f0[3].T(0.0f, false);
                                dg1Var4.f38865a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = dg1Var4.f38879n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        dg1Var4.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f38865a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f38865a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.ak0 ak0Var = this.f38865a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            ak0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f38869c = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i15, null);
        this.f38869c.setGravity(1);
        this.f38869c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f38869c.setTextSize(1, 24.0f);
        xh.n nVar = new xh.n(context);
        this.d = nVar;
        int i17 = org.telegram.ui.ActionBar.y6.D6;
        org.telegram.ui.ActionBar.f7.V(nVar, i17, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i17, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final dg1 f43146b;

            {
                this.f43146b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43146b.D0();
                        return;
                    case 1:
                        dg1 dg1Var = this.f43146b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.T = string;
                        dg1Var.showDialog(e2Var);
                        return;
                    case 2:
                        dg1.W(this.f43146b);
                        return;
                    case 3:
                        dg1 dg1Var2 = this.f43146b;
                        if (dg1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = dg1Var2.O;
                            if (i172 == 0) {
                                dg1Var2.y0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                dg1Var2.showDialog(e2Var2);
                                TextView textView22 = (TextView) e2Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                dg1Var2.B0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        dg1 dg1Var3 = this.f43146b;
                        if (dg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = dg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = dg1Var3.G;
                            dg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = dg1Var3.f38878j0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                dg1Var3.f38878j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f43146b.D0();
                        return;
                    default:
                        dg1 dg1Var4 = this.f43146b;
                        int i18 = dg1Var4.O;
                        dg1Var4.M = true;
                        if (dg1Var4.f38879n.getTransformationMethod() == null) {
                            dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(-1);
                                org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var = dg1Var4.f38874f0[3];
                                if (animatedDrawable != xj0Var) {
                                    dg1Var4.f38865a.setAnimation(xj0Var);
                                    dg1Var4.f38874f0[3].N(18, false, false);
                                }
                                dg1Var4.f38865a.d();
                            }
                        } else {
                            dg1Var4.f38879n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(18);
                                org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                if (animatedDrawable2 != xj0Var2) {
                                    dg1Var4.f38865a.setAnimation(xj0Var2);
                                }
                                dg1Var4.f38874f0[3].T(0.0f, false);
                                dg1Var4.f38865a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = dg1Var4.f38879n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        dg1Var4.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f38867b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f38867b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f38867b.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(this.f38867b, org.telegram.ui.ActionBar.y6.Sh, null);
        this.f38867b.setTextSize(1, 15.0f);
        this.f38867b.setTypeface(AndroidUtilities.bold());
        this.f38867b.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{24.0f}, org.telegram.ui.ActionBar.y6.Oh));
        this.f38867b.setOnClickListener(new View.OnClickListener(this) {
            public final dg1 f43146b;

            {
                this.f43146b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43146b.D0();
                        return;
                    case 1:
                        dg1 dg1Var = this.f43146b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.T = string;
                        dg1Var.showDialog(e2Var);
                        return;
                    case 2:
                        dg1.W(this.f43146b);
                        return;
                    case 3:
                        dg1 dg1Var2 = this.f43146b;
                        if (dg1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = dg1Var2.O;
                            if (i172 == 0) {
                                dg1Var2.y0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                dg1Var2.showDialog(e2Var2);
                                TextView textView22 = (TextView) e2Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                dg1Var2.B0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        dg1 dg1Var3 = this.f43146b;
                        if (dg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = dg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = dg1Var3.G;
                            dg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = dg1Var3.f38878j0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                dg1Var3.f38878j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f43146b.D0();
                        return;
                    default:
                        dg1 dg1Var4 = this.f43146b;
                        int i18 = dg1Var4.O;
                        dg1Var4.M = true;
                        if (dg1Var4.f38879n.getTransformationMethod() == null) {
                            dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(-1);
                                org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var = dg1Var4.f38874f0[3];
                                if (animatedDrawable != xj0Var) {
                                    dg1Var4.f38865a.setAnimation(xj0Var);
                                    dg1Var4.f38874f0[3].N(18, false, false);
                                }
                                dg1Var4.f38865a.d();
                            }
                        } else {
                            dg1Var4.f38879n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                dg1Var4.f38874f0[3].P(18);
                                org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                if (animatedDrawable2 != xj0Var2) {
                                    dg1Var4.f38865a.setAnimation(xj0Var2);
                                }
                                dg1Var4.f38874f0[3].T(0.0f, false);
                                dg1Var4.f38865a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = dg1Var4.f38879n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        dg1Var4.M = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f38869c.setTypeface(AndroidUtilities.bold());
            this.f38869c.setTextSize(1, 18.0f);
        } else {
            this.f38869c.setTypeface(Typeface.DEFAULT);
            this.f38869c.setTextSize(1, 24.0f);
        }
        switch (i16) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                k0 k0Var = new k0(this, context, 28);
                jl0 jl0Var = new jl0(this, context, k0Var, 1);
                jl0Var.addView(k0Var);
                v9 v9Var = new v9(this, context, jl0Var);
                cg1 cg1Var = new cg1(this, context);
                this.f38883x = cg1Var;
                cg1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.f38883x, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                k0Var.addView(this.h, org.telegram.ui.Components.gb1.h(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                k0Var.addView(this.f38870c0, org.telegram.ui.Components.j20.b());
                v9Var.addView(jl0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                xa1 xa1Var = new xa1(this, context, 18);
                xa1Var.setOrientation(1);
                this.f38883x.addView(xa1Var, org.telegram.ui.Components.gb1.B(-1, -1, 51));
                xa1Var.addView(this.f38865a, org.telegram.ui.Components.gb1.x(-2, -2, 49, 0, 69, 0, 0));
                xa1Var.addView(this.f38869c, org.telegram.ui.Components.gb1.x(-2, -2, 49, 0, 8, 0, 0));
                xa1Var.addView(this.d, org.telegram.ui.Components.gb1.x(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(context, null);
                this.f38881s = rd0Var;
                rd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f38879n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f38879n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f38879n;
                int i18 = org.telegram.ui.ActionBar.y6.f23502l6;
                org.telegram.ui.ActionBar.f7.w(editTextBoldCursor2, i18, null);
                org.telegram.ui.ActionBar.f7.V(this.f38879n, i15, null);
                this.f38879n.setBackground(null);
                this.f38879n.setMaxLines(1);
                this.f38879n.setLines(1);
                this.f38879n.setGravity(3);
                this.f38879n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f38879n.setSingleLine(true);
                this.f38879n.setCursorWidth(1.5f);
                this.f38879n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final dg1 f43499b;

                    {
                        this.f43499b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                dg1 dg1Var = this.f43499b;
                                dg1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                dg1Var.D0();
                                return true;
                            default:
                                dg1 dg1Var2 = this.f43499b;
                                dg1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (dg1Var2.v.getVisibility() == 0) {
                                    dg1Var2.f38880r.requestFocus();
                                } else {
                                    dg1Var2.D0();
                                }
                                return true;
                        }
                    }
                });
                this.f38881s.e(this.f38879n);
                this.f38879n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final dg1 f43833b;

                    {
                        this.f43833b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.rd0 rd0Var2 = this.f43833b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                rd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                dg1 dg1Var = this.f43833b;
                                if (z11) {
                                    dg1Var.f38872e0.setEditText((EditText) view);
                                    dg1Var.f38872e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                dg1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.rd0 rd0Var3 = this.f43833b.f38881s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                rd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f38879n, org.telegram.ui.Components.gb1.p(1.0f, 0, -2));
                org.telegram.ui.ActionBar.k0 k0Var2 = new org.telegram.ui.ActionBar.k0(this, context, 3);
                this.E = k0Var2;
                k0Var2.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                org.telegram.ui.ActionBar.k0 k0Var3 = this.E;
                int i19 = org.telegram.ui.ActionBar.y6.f23448i6;
                org.telegram.ui.ActionBar.f7.R(k0Var3, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i19, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i19), null);
                org.telegram.ui.ActionBar.f7.t(this.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final dg1 f43146b;

                    {
                        this.f43146b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f43146b.D0();
                                return;
                            case 1:
                                dg1 dg1Var = this.f43146b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                e2Var.T = string;
                                dg1Var.showDialog(e2Var);
                                return;
                            case 2:
                                dg1.W(this.f43146b);
                                return;
                            case 3:
                                dg1 dg1Var2 = this.f43146b;
                                if (dg1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = dg1Var2.O;
                                    if (i172 == 0) {
                                        dg1Var2.y0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                        dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                        alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                        dg1Var2.showDialog(e2Var2);
                                        TextView textView22 = (TextView) e2Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        dg1Var2.B0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                dg1 dg1Var3 = this.f43146b;
                                if (dg1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = dg1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = dg1Var3.G;
                                    dg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    hb0 hb0Var = dg1Var3.f38878j0;
                                    if (hb0Var != null) {
                                        AndroidUtilities.runOnUIThread(hb0Var);
                                        dg1Var3.f38878j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f43146b.D0();
                                return;
                            default:
                                dg1 dg1Var4 = this.f43146b;
                                int i182 = dg1Var4.O;
                                dg1Var4.M = true;
                                if (dg1Var4.f38879n.getTransformationMethod() == null) {
                                    dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                        dg1Var4.f38874f0[3].P(-1);
                                        org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xj0 xj0Var = dg1Var4.f38874f0[3];
                                        if (animatedDrawable != xj0Var) {
                                            dg1Var4.f38865a.setAnimation(xj0Var);
                                            dg1Var4.f38874f0[3].N(18, false, false);
                                        }
                                        dg1Var4.f38865a.d();
                                    }
                                } else {
                                    dg1Var4.f38879n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                        dg1Var4.f38874f0[3].P(18);
                                        org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                        if (animatedDrawable2 != xj0Var2) {
                                            dg1Var4.f38865a.setAnimation(xj0Var2);
                                        }
                                        dg1Var4.f38874f0[3].T(0.0f, false);
                                        dg1Var4.f38865a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = dg1Var4.f38879n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                dg1Var4.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, org.telegram.ui.Components.gb1.x(24, 24, 16, 0, 0, 16, 0));
                this.f38879n.addTextChangedListener(new ag1(this, 2));
                this.f38881s.addView(linearLayout, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                xa1Var.addView(this.f38881s, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.rd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f38880r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f38880r.setPadding(dp2, dp2, dp2, dp2);
                org.telegram.ui.ActionBar.f7.w(this.f38880r, i18, null);
                org.telegram.ui.ActionBar.f7.V(this.f38880r, i15, null);
                this.f38880r.setBackground(null);
                this.f38880r.setMaxLines(1);
                this.f38880r.setLines(1);
                this.f38880r.setGravity(3);
                this.f38880r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f38880r.setSingleLine(true);
                this.f38880r.setCursorWidth(1.5f);
                this.f38880r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final dg1 f43499b;

                    {
                        this.f43499b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i192, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                dg1 dg1Var = this.f43499b;
                                dg1Var.getClass();
                                if (i192 != 5 && i192 != 6) {
                                    return false;
                                }
                                dg1Var.D0();
                                return true;
                            default:
                                dg1 dg1Var2 = this.f43499b;
                                dg1Var2.getClass();
                                if (i192 != 5 && i192 != 6) {
                                    return false;
                                }
                                if (dg1Var2.v.getVisibility() == 0) {
                                    dg1Var2.f38880r.requestFocus();
                                } else {
                                    dg1Var2.D0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f38880r);
                this.f38880r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final dg1 f43833b;

                    {
                        this.f43833b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.rd0 rd0Var2 = this.f43833b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                rd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                dg1 dg1Var = this.f43833b;
                                if (z11) {
                                    dg1Var.f38872e0.setEditText((EditText) view);
                                    dg1Var.f38872e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                dg1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.rd0 rd0Var3 = this.f43833b.f38881s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                rd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f38880r, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                xa1Var.addView(this.v, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.hs hsVar = new org.telegram.ui.Components.hs(context);
                this.f38872e0 = hsVar;
                hsVar.setVisibility(8);
                jl0Var.addView(this.f38872e0);
                ld0 ld0Var = new ld0(this, context, 3);
                this.f38882w = ld0Var;
                final int i20 = 1;
                ld0Var.b(6, 1);
                xr[] xrVarArr = this.f38882w.f44897f;
                int length = xrVarArr.length;
                int i21 = 0;
                while (i21 < length) {
                    xr xrVar = xrVarArr[i21];
                    xrVar.setShowSoftInputOnFocusCompat(w0() ^ i20);
                    xrVar.addTextChangedListener(new ag1(this, 0));
                    xrVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final dg1 f43833b;

                        {
                            this.f43833b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f7;
                            float f10;
                            switch (i20) {
                                case 0:
                                    org.telegram.ui.Components.rd0 rd0Var2 = this.f43833b.v;
                                    if (z11) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    rd0Var2.b(f7, f7, true);
                                    return;
                                case 1:
                                    dg1 dg1Var = this.f43833b;
                                    if (z11) {
                                        dg1Var.f38872e0.setEditText((EditText) view);
                                        dg1Var.f38872e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    dg1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.rd0 rd0Var3 = this.f43833b.f38881s;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    rd0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i21++;
                    i20 = 1;
                }
                this.f38882w.setVisibility(8);
                xa1Var.addView(this.f38882w, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                xa1Var.addView(frameLayout, org.telegram.ui.Components.gb1.x(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, org.telegram.ui.Components.gb1.i(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f38873f = textView5;
                    org.telegram.ui.ActionBar.f7.V(textView5, org.telegram.ui.ActionBar.y6.J6, null);
                    this.f38873f.setGravity(1);
                    this.f38873f.setTextSize(1, 14.0f);
                    this.f38873f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f38873f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f38873f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    xa1Var.addView(this.f38873f, org.telegram.ui.Components.gb1.x(-2, -2, 49, 0, 0, 0, 25));
                    this.f38873f.setOnClickListener(new View.OnClickListener(this) {
                        public final dg1 f43146b;

                        {
                            this.f43146b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f43146b.D0();
                                    return;
                                case 1:
                                    dg1 dg1Var = this.f43146b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                    e2Var.T = string;
                                    dg1Var.showDialog(e2Var);
                                    return;
                                case 2:
                                    dg1.W(this.f43146b);
                                    return;
                                case 3:
                                    dg1 dg1Var2 = this.f43146b;
                                    if (dg1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = dg1Var2.O;
                                        if (i172 == 0) {
                                            dg1Var2.y0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                            dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                            alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                            dg1Var2.showDialog(e2Var2);
                                            TextView textView22 = (TextView) e2Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            dg1Var2.B0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    dg1 dg1Var3 = this.f43146b;
                                    if (dg1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = dg1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = dg1Var3.G;
                                        dg1Var3.presentFragment(twoStepVerificationActivity, true);
                                        hb0 hb0Var = dg1Var3.f38878j0;
                                        if (hb0Var != null) {
                                            AndroidUtilities.runOnUIThread(hb0Var);
                                            dg1Var3.f38878j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f43146b.D0();
                                    return;
                                default:
                                    dg1 dg1Var4 = this.f43146b;
                                    int i182 = dg1Var4.O;
                                    dg1Var4.M = true;
                                    if (dg1Var4.f38879n.getTransformationMethod() == null) {
                                        dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                            dg1Var4.f38874f0[3].P(-1);
                                            org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                            org.telegram.ui.Components.xj0 xj0Var = dg1Var4.f38874f0[3];
                                            if (animatedDrawable != xj0Var) {
                                                dg1Var4.f38865a.setAnimation(xj0Var);
                                                dg1Var4.f38874f0[3].N(18, false, false);
                                            }
                                            dg1Var4.f38865a.d();
                                        }
                                    } else {
                                        dg1Var4.f38879n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                            dg1Var4.f38874f0[3].P(18);
                                            org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                            org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                            if (animatedDrawable2 != xj0Var2) {
                                                dg1Var4.f38865a.setAnimation(xj0Var2);
                                            }
                                            dg1Var4.f38874f0[3].T(0.0f, false);
                                            dg1Var4.f38865a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = dg1Var4.f38879n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    dg1Var4.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = v9Var;
                fi.f6 f6Var = new fi.f6(this, context);
                this.f38884y = f6Var;
                f6Var.setAlpha(0.0f);
                v9Var.addView(this.f38884y);
                v9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23502l6, false));
                k0Var.addView(this.L, org.telegram.ui.Components.gb1.h(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(this, context, 3);
                eVar.setOnTouchListener(new ei.d(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.f38865a);
                eVar.addView(this.f38869c);
                eVar.addView(this.d);
                eVar.addView(this.f38867b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, this.fragmentView, null);
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f38869c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f38869c.setText(string);
                }
                if (!TextUtils.isEmpty(this.f38866a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.rd0 rd0Var2 = this.f38881s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                rd0Var2.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f38879n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f38879n.setImeOptions(268435461);
                this.f38879n.setInputType(129);
                this.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f38879n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.xj0[] xj0VarArr = new org.telegram.ui.Components.xj0[7];
                this.f38874f0 = xj0VarArr;
                xj0VarArr[0] = new org.telegram.ui.Components.xj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38874f0[1] = new org.telegram.ui.Components.xj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38874f0[2] = new org.telegram.ui.Components.xj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38874f0[3] = new org.telegram.ui.Components.xj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38874f0[4] = new org.telegram.ui.Components.xj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38874f0[5] = new org.telegram.ui.Components.xj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38874f0[6] = new org.telegram.ui.Components.xj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.xj0 xj0Var = this.f38874f0[6];
                xj0Var.h = true;
                xj0Var.P(19);
                this.f38874f0[2].S(97, this.f38877i0);
                G0(true);
                if (i16 == 1) {
                    vf1 vf1Var = this.f38875g0;
                    if (vf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(vf1Var);
                    }
                    this.f38865a.setAnimation(this.f38874f0[6]);
                    this.f38865a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f38879n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    G0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f38869c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f38881s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f38879n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f38879n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f38865a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f38865a.d();
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
                this.f38869c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f38881s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f38879n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f38879n.setImeOptions(268435461);
                this.f38879n.setInputType(33);
                this.v.setVisibility(8);
                this.f38865a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f38865a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f38869c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f38872e0.setVisibility(0);
                this.f38881s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f34907a |= 256;
                    obj.f34908b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj.f34909c = i22;
                    r82 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.z11(obj, 0), indexOf, i22, 0);
                } else {
                    r82 = 0;
                }
                xh.n nVar2 = this.d;
                String string2 = LocaleController.getString(R.string.RestoreEmailSent);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r82] = valueOf;
                nVar2.setText(AndroidUtilities.formatSpannable(string2, charSequenceArr));
                this.d.setVisibility(r82);
                this.f38870c0.e(r82, r82);
                this.f38882w.setVisibility(r82);
                this.f38865a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f38865a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f38869c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f38881s.setVisibility(8);
                this.f38872e0.setVisibility(0);
                xh.n nVar3 = this.d;
                int i23 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                nVar3.setText(LocaleController.formatString("EmailPasswordConfirmText2", i23, str));
                this.d.setVisibility(0);
                this.f38870c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final dg1 f43146b;

                    {
                        this.f43146b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f43146b.D0();
                                return;
                            case 1:
                                dg1 dg1Var = this.f43146b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uf1(dg1Var, 1));
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetPassword);
                                String string3 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                e2Var.T = string3;
                                dg1Var.showDialog(e2Var);
                                return;
                            case 2:
                                dg1.W(this.f43146b);
                                return;
                            case 3:
                                dg1 dg1Var2 = this.f43146b;
                                if (dg1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = dg1Var2.O;
                                    if (i172 == 0) {
                                        dg1Var2.y0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = dg1Var2.f38866a0;
                                        dg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new wf1(dg1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg1Var2.getParentActivity());
                                        alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new uf1(dg1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                        dg1Var2.showDialog(e2Var2);
                                        TextView textView22 = (TextView) e2Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.f23598q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        dg1Var2.B0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                dg1 dg1Var3 = this.f43146b;
                                if (dg1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = dg1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = dg1Var3.G;
                                    dg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    hb0 hb0Var = dg1Var3.f38878j0;
                                    if (hb0Var != null) {
                                        AndroidUtilities.runOnUIThread(hb0Var);
                                        dg1Var3.f38878j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f43146b.D0();
                                return;
                            default:
                                dg1 dg1Var4 = this.f43146b;
                                int i182 = dg1Var4.O;
                                dg1Var4.M = true;
                                if (dg1Var4.f38879n.getTransformationMethod() == null) {
                                    dg1Var4.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                        dg1Var4.f38874f0[3].P(-1);
                                        org.telegram.ui.Components.xj0 animatedDrawable = dg1Var4.f38865a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xj0 xj0Var2 = dg1Var4.f38874f0[3];
                                        if (animatedDrawable != xj0Var2) {
                                            dg1Var4.f38865a.setAnimation(xj0Var2);
                                            dg1Var4.f38874f0[3].N(18, false, false);
                                        }
                                        dg1Var4.f38865a.d();
                                    }
                                } else {
                                    dg1Var4.f38879n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.f7.t(dg1Var4.E, org.telegram.ui.ActionBar.y6.Yd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && dg1Var4.f38879n.length() > 0 && dg1Var4.f38879n.hasFocus()) {
                                        dg1Var4.f38874f0[3].P(18);
                                        org.telegram.ui.Components.xj0 animatedDrawable2 = dg1Var4.f38865a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xj0 xj0Var22 = dg1Var4.f38874f0[3];
                                        if (animatedDrawable2 != xj0Var22) {
                                            dg1Var4.f38865a.setAnimation(xj0Var22);
                                        }
                                        dg1Var4.f38874f0[3].T(0.0f, false);
                                        dg1Var4.f38865a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = dg1Var4.f38879n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                dg1Var4.M = false;
                                return;
                        }
                    }
                });
                this.f38882w.setVisibility(0);
                this.f38865a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f38865a.d();
                i14 = 1;
                break;
            case 6:
                this.f38869c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f38867b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f38865a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f38865a.d();
                i14 = 1;
                break;
            case 7:
                this.f38869c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.Y) {
                    this.f38867b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
                    this.f38867b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f38867b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f38865a.f(R.raw.wallet_allset, 160, 160, null);
                this.f38865a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f38869c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                org.telegram.ui.ActionBar.f7.V(this.e, org.telegram.ui.ActionBar.y6.f23560o6, null);
                this.f38881s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f38879n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f38879n.setImeOptions(268435462);
                this.f38879n.setInputType(129);
                this.f38879n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f38879n.setTypeface(Typeface.DEFAULT);
                this.f38865a.f(R.raw.wallet_science, 120, 120, null);
                this.f38865a.d();
                i14 = 1;
                break;
            case 9:
                this.f38869c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f38867b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f38865a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f38865a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f38879n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new ag1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.r2 r2Var : getParentLayout().getFragmentStack()) {
            if (r2Var != this && (r2Var instanceof dg1)) {
                ((org.telegram.ui.Components.e81) ((dg1) r2Var).f38868b0.f16406b).f27759b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23299a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38869c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38879n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38879n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23484k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38879n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23502l6));
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
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, true)) > 0.699999988079071d) {
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
                J0();
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
        if (this.f38865a != null) {
            int i12 = this.O;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f38865a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.ak0 ak0Var = this.f38865a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                ak0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.hs hsVar = this.f38872e0;
        if (hsVar != null) {
            if (!w0()) {
                i11 = 8;
            }
            hsVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        vf1 vf1Var = this.f38875g0;
        if (vf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vf1Var);
            this.f38875g0 = null;
        }
        if (this.f38874f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.xj0[] xj0VarArr = this.f38874f0;
                if (i10 >= xj0VarArr.length) {
                    break;
                }
                xj0VarArr[i10].C(false);
                i10++;
            }
            this.f38874f0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (w0()) {
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
        if (w0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.m41 m41Var = this.f38871d0;
            if (m41Var != null) {
                m41Var.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23502l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f38879n != null && !w0()) {
                AndroidUtilities.runOnUIThread(new vf1(this, 0), 200L);
            }
            ld0 ld0Var = this.f38882w;
            if (ld0Var != null && ld0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new vf1(this, 1), 200L);
            }
        }
    }

    public final void v0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            ld0 ld0Var = this.f38882w;
            xr[] xrVarArr = ld0Var.f44897f;
            if (i10 < xrVarArr.length) {
                xr xrVar = xrVarArr[i10];
                xrVar.postDelayed(new il0(xrVar, 1), i10 * 75);
                i10++;
            } else {
                ld0Var.postDelayed(new zc1(9, this, runnable), (xrVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean w0() {
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

    public final void x0() {
        this.f38870c0.f(false, true);
    }

    public final void y0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f38870c0.f(true, true);
        }
    }

    public final void z0() {
        xr[] xrVarArr;
        for (xr xrVar : this.f38882w.f44897f) {
            xrVar.setText("");
            xrVar.i(1.0f);
        }
        this.f38882w.f44897f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f38882w, 8.0f, new vf1(this, 6));
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = a1.g.i("afterSignup", true);
            pg0 pg0Var = new pg0();
            pg0Var.i0(i10);
            presentFragment(pg0Var, true);
            return;
        }
        super.finishFragment();
    }

    public dg1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f38876h0 = new vf1(this, 2);
        this.f38877i0 = new vf1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new wf1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void C0() {
    }
}
