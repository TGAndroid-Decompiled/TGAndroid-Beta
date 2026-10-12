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
public class oh1 extends org.telegram.ui.ActionBar.m2 {
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
    public org.telegram.ui.Components.bk0 f38960a;
    public String f38961a0;
    public TextView f38962b;
    public li.k f38963b0;
    public TextView f38964c;
    public org.telegram.ui.Components.l20 f38965c0;
    public wh.n d;
    public org.telegram.ui.Components.g41 f38966d0;
    public TextView e;
    public org.telegram.ui.Components.is f38967e0;
    public TextView f38968f;
    public org.telegram.ui.Components.yj0[] f38969f0;
    public gh1 f38970g0;
    public TextView h;
    public final Runnable f38971h0;
    public final Runnable f38972i0;
    public ec0 f38973j0;
    public EditTextBoldCursor f38974n;
    public EditTextBoldCursor f38975r;
    public org.telegram.ui.Components.yd0 f38976s;
    public org.telegram.ui.Components.yd0 v;
    public ie0 f38977w;
    public nh1 f38978x;
    public di.p6 f38979y;

    public oh1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f38971h0 = new gh1(this, 2);
        this.f38972i0 = new gh1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new hh1(this, 0), 10);
            }
        }
    }

    public static void U(oh1 oh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = oh1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(oh1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = oh1Var.U.new_algo;
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
        ig.n0 n0Var = new ig.n0(oh1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = oh1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = oh1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(oh1Var.X, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = oh1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = oh1Var.U.new_algo;
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
                ConnectionsManager.getInstance(oh1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            n0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(oh1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
    }

    public static void V(oh1 oh1Var) {
        ConnectionsManager.getInstance(oh1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new bi.g7(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        oh1Var.showDialog(alertDialog$Builder.f19548a);
    }

    public static void W(oh1 oh1Var, byte[] bArr) {
        ArrayList arrayList = oh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = oh1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = oh1Var.U;
        if (bArr == null) {
            bArr = oh1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, oh1Var.W, oh1Var.X);
        twoStepVerificationActivity.X = oh1Var.G;
        oh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
        ec0 ec0Var = oh1Var.f38973j0;
        if (ec0Var != null) {
            AndroidUtilities.runOnUIThread(ec0Var);
            oh1Var.f38973j0 = null;
        }
    }

    public static void X(oh1 oh1Var) {
        ArrayList arrayList = oh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(oh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = oh1Var.V;
        TL_account.Password password = oh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, oh1Var.R, oh1Var.Q, null, oh1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = oh1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, oh1Var.V, oh1Var.W, oh1Var.X);
        twoStepVerificationActivity.X = oh1Var.G;
        oh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
        ec0 ec0Var = oh1Var.f38973j0;
        if (ec0Var != null) {
            AndroidUtilities.runOnUIThread(ec0Var);
            oh1Var.f38973j0 = null;
        }
    }

    public static void Y(oh1 oh1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = oh1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        fc0 fc0Var = new fc0(29, oh1Var, bArr2);
        TL_account.Password password = oh1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                fc0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(oh1Var.currentAccount).sendRequest(getpasswordsettings, fc0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        fc0Var.run(null, tL_error2);
    }

    public static void Z(oh1 oh1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(oh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new hh1(oh1Var, 4), 8);
            return;
        }
        oh1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            oh1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            oh1Var.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
            oh1Var.z0(oh1Var.f38976s, oh1Var.f38974n, true);
            oh1Var.H0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            oh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            oh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(oh1 oh1Var) {
        ArrayList arrayList = oh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        oh1Var.finishFragment();
    }

    public static void b0(oh1 oh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            oh1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.g5.w0(oh1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            oh1Var.T = !TextUtils.isEmpty(oh1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(oh1Var.U);
            if (!oh1Var.S && oh1Var.Y) {
                TL_account.Password password2 = oh1Var.U;
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
                    if (!oh1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        oh1Var.finishFragment();
                    }
                }
            }
            if (oh1Var.N) {
                oh1Var.w0();
                oh1Var.C0();
            }
            NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
        }
    }

    public static void c0(oh1 oh1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            oh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            oh1Var.E0(z10);
            NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
        }
    }

    public static void d0(oh1 oh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = oh1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(oh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new di.s3(12, oh1Var, z10), 8);
            return;
        }
        oh1Var.w0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            oh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.m2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                oh1Var.finishFragment();
            } else if (oh1Var.getParentActivity() != null) {
                if (oh1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new cs0(22, oh1Var, bArr));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    if (str == null && (password = oh1Var.U) != null && password.has_password) {
                        a2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    a2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = oh1Var.showDialog(a2Var);
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
                TL_account.Password password2 = oh1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (oh1Var.Y) {
                    NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                oh1 oh1Var2 = new oh1(7, oh1Var.U);
                oh1Var2.H = oh1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = oh1Var.V;
                }
                oh1Var2.D0(bArr3, oh1Var.W, oh1Var.X, oh1Var.Z);
                oh1Var2.Y = oh1Var.Y;
                oh1Var2.G = oh1Var.G;
                oh1Var.presentFragment(oh1Var2, true);
                NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    oh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    oh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    oh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.m2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(oh1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = oh1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = oh1Var.R;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, oh1Var.Q, str2, oh1Var.P);
            TL_account.Password password4 = oh1Var.U;
            password4.email_unconfirmed_pattern = oh1Var.R;
            oh1 oh1Var3 = new oh1(5, password4);
            oh1Var3.H = oh1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = oh1Var.V;
            }
            oh1Var3.D0(bArr2, oh1Var.W, oh1Var.X, oh1Var.Z);
            oh1Var3.Y = oh1Var.Y;
            oh1Var3.G = oh1Var.G;
            oh1Var.presentFragment(oh1Var3, true);
        }
    }

    public static void e0(oh1 oh1Var, TLRPC.TL_error tL_error) {
        oh1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = oh1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, oh1Var.V, oh1Var.W, oh1Var.X);
            twoStepVerificationActivity.X = oh1Var.G;
            oh1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            ec0 ec0Var = oh1Var.f38973j0;
            if (ec0Var != null) {
                AndroidUtilities.runOnUIThread(ec0Var);
                oh1Var.f38973j0 = null;
            }
        }
    }

    public static void f0(oh1 oh1Var) {
        ArrayList arrayList = oh1Var.J;
        if (oh1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new fh1(oh1Var, 4));
            boolean z10 = oh1Var.U.has_recovery;
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            if (z10) {
                a2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                a2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            a2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = oh1Var.showDialog(a2Var);
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
        TL_account.Password password = oh1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        oh1 oh1Var2 = new oh1(7, password);
        oh1Var2.H = oh1Var.H;
        oh1Var2.D0(oh1Var.V, oh1Var.W, oh1Var.X, oh1Var.Z);
        oh1Var2.J.addAll(arrayList);
        oh1Var2.Y = oh1Var.Y;
        oh1Var2.G = oh1Var.G;
        oh1Var.presentFragment(oh1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(oh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = oh1Var.V;
        TL_account.Password password2 = oh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, oh1Var.R, oh1Var.Q, null, oh1Var.P);
        NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
    }

    public static void g0(oh1 oh1Var, String str) {
        oh1 oh1Var2 = new oh1(oh1Var.currentAccount, 0, oh1Var.U);
        oh1Var2.H = oh1Var.H;
        oh1Var2.J.addAll(oh1Var.J);
        oh1Var2.J.add(oh1Var);
        oh1Var2.f38961a0 = str;
        oh1Var2.G = oh1Var.G;
        oh1Var.presentFragment(oh1Var2, true);
    }

    public static void h0(oh1 oh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            oh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(oh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, oh1Var.U);
            oh1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            oh1 oh1Var = new oh1(this.currentAccount, 3, password);
            oh1Var.H = this.H;
            oh1Var.D0(this.V, this.W, this.X, this.Z);
            oh1Var.P = this.P;
            oh1Var.Q = this.Q;
            oh1Var.J.addAll(this.J);
            oh1Var.J.add(this);
            oh1Var.Y = this.Y;
            oh1Var.G = this.G;
            presentFragment(oh1Var);
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
                    if (this.f38974n.length() == 0) {
                        z0(this.f38976s, this.f38974n, false);
                        return;
                    } else if (!this.f38974n.getText().toString().equals(this.P) && this.O == 1) {
                        AndroidUtilities.shakeViewSpring(this.f38976s, 5.0f);
                        try {
                            this.f38976s.performHapticFeedback(3, 2);
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
                        oh1 oh1Var = new oh1(i11, i10, this.U);
                        oh1Var.H = this.H;
                        oh1Var.P = this.f38974n.getText().toString();
                        oh1Var.D0(this.V, this.W, this.X, this.Z);
                        oh1Var.f38961a0 = this.f38961a0;
                        oh1Var.J.addAll(this.J);
                        oh1Var.J.add(this);
                        oh1Var.Y = this.Y;
                        oh1Var.G = this.G;
                        presentFragment(oh1Var);
                        return;
                    }
                case 2:
                    String obj = this.f38974n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        z0(this.f38976s, this.f38974n, false);
                        return;
                    }
                    A0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f38974n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            E0(false);
                            return;
                        }
                    }
                    z0(this.f38976s, this.f38974n, false);
                    return;
                case 4:
                    String code = this.f38977w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new fc0(28, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f38977w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new hh1(this, 2), 10);
                    x0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    oh1 oh1Var2 = new oh1(this.currentAccount, 0, password);
                    oh1Var2.H = this.H;
                    oh1Var2.Y = this.Y;
                    oh1Var2.G = this.G;
                    presentFragment(oh1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle h = a1.g.h("afterSignup", true);
                        kh0 kh0Var = new kh0();
                        kh0Var.l0(h);
                        presentFragment(kh0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        ec0 ec0Var = this.f38973j0;
                        if (ec0Var != null) {
                            AndroidUtilities.runOnUIThread(ec0Var);
                            this.f38973j0 = null;
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
                    String obj3 = this.f38974n.getText().toString();
                    if (obj3.length() == 0) {
                        z0(this.f38976s, this.f38974n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    x0();
                    Utilities.globalQueue.postRunnable(new ih1(this, stringBytes, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j10;
        this.Z = z10;
    }

    public final void E0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new hh1(this, 3));
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
        if (this.f38961a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f38961a0;
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
        Utilities.globalQueue.postRunnable(new di.t1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void F0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oh1.F0(boolean):void");
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = str;
        a2Var.T = str2;
        showDialog(a2Var);
    }

    public final void H0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f38962b.getTag() != null) {
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
        TextView textView = this.f38962b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f38962b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f38962b, property, 1.0f), ObjectAnimator.ofFloat(this.f38962b, property2, 1.0f), ObjectAnimator.ofFloat(this.f38962b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f38962b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f38962b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f38962b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.I.addListener(new i50(12, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f19548a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new fh1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
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
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i15, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20218u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new mh1(this));
        int i16 = this.O;
        if (i16 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, this.resourceProvider, false);
        this.f38965c0 = l20Var;
        this.f38963b0 = new li.k(l20Var);
        this.f38965c0.setOnClickListener(new View.OnClickListener(this) {
            public final oh1 f34952b;

            {
                this.f34952b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34952b.C0();
                        return;
                    case 1:
                        oh1 oh1Var = this.f34952b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.T = string;
                        oh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        oh1.V(this.f34952b);
                        return;
                    case 3:
                        oh1 oh1Var2 = this.f34952b;
                        if (oh1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = oh1Var2.O;
                            if (i17 == 0) {
                                oh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                oh1Var2.showDialog(a2Var2);
                                TextView textView = (TextView) a2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                oh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        oh1 oh1Var3 = this.f34952b;
                        if (oh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = oh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = oh1Var3.G;
                            oh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ec0 ec0Var = oh1Var3.f38973j0;
                            if (ec0Var != null) {
                                AndroidUtilities.runOnUIThread(ec0Var);
                                oh1Var3.f38973j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f34952b.C0();
                        return;
                    default:
                        oh1 oh1Var4 = this.f34952b;
                        int i18 = oh1Var4.O;
                        oh1Var4.M = true;
                        if (oh1Var4.f38974n.getTransformationMethod() == null) {
                            oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = oh1Var4.f38969f0[3];
                                if (animatedDrawable != yj0Var) {
                                    oh1Var4.f38960a.setAnimation(yj0Var);
                                    oh1Var4.f38969f0[3].N(18, false, false);
                                }
                                oh1Var4.f38960a.d();
                            }
                        } else {
                            oh1Var4.f38974n.setTransformationMethod(null);
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    oh1Var4.f38960a.setAnimation(yj0Var2);
                                }
                                oh1Var4.f38969f0[3].T(0.0f, false);
                                oh1Var4.f38960a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = oh1Var4.f38974n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        oh1Var4.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.g41 g41Var = new org.telegram.ui.Components.g41(context);
        this.f38966d0 = g41Var;
        g41Var.setTransformType(1);
        this.f38966d0.setProgress(0.0f);
        this.f38966d0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.f38966d0.setDrawBackground(false);
        this.f38965c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.f38965c0.addView(this.f38966d0, w7.a6.e(56, 56, 17));
        this.f38965c0.a(this.f38966d0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20104o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        li.k.o(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final oh1 f34952b;

            {
                this.f34952b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34952b.C0();
                        return;
                    case 1:
                        oh1 oh1Var = this.f34952b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.T = string;
                        oh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        oh1.V(this.f34952b);
                        return;
                    case 3:
                        oh1 oh1Var2 = this.f34952b;
                        if (oh1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = oh1Var2.O;
                            if (i17 == 0) {
                                oh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                oh1Var2.showDialog(a2Var2);
                                TextView textView2 = (TextView) a2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                oh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        oh1 oh1Var3 = this.f34952b;
                        if (oh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = oh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = oh1Var3.G;
                            oh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ec0 ec0Var = oh1Var3.f38973j0;
                            if (ec0Var != null) {
                                AndroidUtilities.runOnUIThread(ec0Var);
                                oh1Var3.f38973j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f34952b.C0();
                        return;
                    default:
                        oh1 oh1Var4 = this.f34952b;
                        int i18 = oh1Var4.O;
                        oh1Var4.M = true;
                        if (oh1Var4.f38974n.getTransformationMethod() == null) {
                            oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = oh1Var4.f38969f0[3];
                                if (animatedDrawable != yj0Var) {
                                    oh1Var4.f38960a.setAnimation(yj0Var);
                                    oh1Var4.f38969f0[3].N(18, false, false);
                                }
                                oh1Var4.f38960a.d();
                            }
                        } else {
                            oh1Var4.f38974n.setTransformationMethod(null);
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    oh1Var4.f38960a.setAnimation(yj0Var2);
                                }
                                oh1Var4.f38969f0[3].T(0.0f, false);
                                oh1Var4.f38960a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = oh1Var4.f38974n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        oh1Var4.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f38960a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f38960a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.bk0 bk0Var = this.f38960a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            bk0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f38964c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        this.f38964c.setGravity(1);
        this.f38964c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f38964c.setTextSize(1, 24.0f);
        wh.n nVar = new wh.n(context);
        this.d = nVar;
        int i17 = org.telegram.ui.ActionBar.g6.D6;
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final oh1 f34952b;

            {
                this.f34952b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34952b.C0();
                        return;
                    case 1:
                        oh1 oh1Var = this.f34952b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.T = string;
                        oh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        oh1.V(this.f34952b);
                        return;
                    case 3:
                        oh1 oh1Var2 = this.f34952b;
                        if (oh1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = oh1Var2.O;
                            if (i172 == 0) {
                                oh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                oh1Var2.showDialog(a2Var2);
                                TextView textView22 = (TextView) a2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                oh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        oh1 oh1Var3 = this.f34952b;
                        if (oh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = oh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = oh1Var3.G;
                            oh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ec0 ec0Var = oh1Var3.f38973j0;
                            if (ec0Var != null) {
                                AndroidUtilities.runOnUIThread(ec0Var);
                                oh1Var3.f38973j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f34952b.C0();
                        return;
                    default:
                        oh1 oh1Var4 = this.f34952b;
                        int i18 = oh1Var4.O;
                        oh1Var4.M = true;
                        if (oh1Var4.f38974n.getTransformationMethod() == null) {
                            oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = oh1Var4.f38969f0[3];
                                if (animatedDrawable != yj0Var) {
                                    oh1Var4.f38960a.setAnimation(yj0Var);
                                    oh1Var4.f38969f0[3].N(18, false, false);
                                }
                                oh1Var4.f38960a.d();
                            }
                        } else {
                            oh1Var4.f38974n.setTransformationMethod(null);
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    oh1Var4.f38960a.setAnimation(yj0Var2);
                                }
                                oh1Var4.f38969f0[3].T(0.0f, false);
                                oh1Var4.f38960a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = oh1Var4.f38974n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        oh1Var4.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f38962b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f38962b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f38962b.setGravity(17);
        this.f38962b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f38962b.setTextSize(1, 15.0f);
        this.f38962b.setTypeface(AndroidUtilities.bold());
        this.f38962b.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.Oh));
        this.f38962b.setOnClickListener(new View.OnClickListener(this) {
            public final oh1 f34952b;

            {
                this.f34952b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34952b.C0();
                        return;
                    case 1:
                        oh1 oh1Var = this.f34952b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.T = string;
                        oh1Var.showDialog(a2Var);
                        return;
                    case 2:
                        oh1.V(this.f34952b);
                        return;
                    case 3:
                        oh1 oh1Var2 = this.f34952b;
                        if (oh1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = oh1Var2.O;
                            if (i172 == 0) {
                                oh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                oh1Var2.showDialog(a2Var2);
                                TextView textView22 = (TextView) a2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                oh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        oh1 oh1Var3 = this.f34952b;
                        if (oh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = oh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = oh1Var3.G;
                            oh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ec0 ec0Var = oh1Var3.f38973j0;
                            if (ec0Var != null) {
                                AndroidUtilities.runOnUIThread(ec0Var);
                                oh1Var3.f38973j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f34952b.C0();
                        return;
                    default:
                        oh1 oh1Var4 = this.f34952b;
                        int i18 = oh1Var4.O;
                        oh1Var4.M = true;
                        if (oh1Var4.f38974n.getTransformationMethod() == null) {
                            oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = oh1Var4.f38969f0[3];
                                if (animatedDrawable != yj0Var) {
                                    oh1Var4.f38960a.setAnimation(yj0Var);
                                    oh1Var4.f38969f0[3].N(18, false, false);
                                }
                                oh1Var4.f38960a.d();
                            }
                        } else {
                            oh1Var4.f38974n.setTransformationMethod(null);
                            oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                oh1Var4.f38969f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    oh1Var4.f38960a.setAnimation(yj0Var2);
                                }
                                oh1Var4.f38969f0[3].T(0.0f, false);
                                oh1Var4.f38960a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = oh1Var4.f38974n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        oh1Var4.M = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f38964c.setTypeface(AndroidUtilities.bold());
            this.f38964c.setTextSize(1, 18.0f);
        } else {
            this.f38964c.setTypeface(Typeface.DEFAULT);
            this.f38964c.setTextSize(1, 24.0f);
        }
        switch (i16) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                l0 l0Var = new l0(this, context, 26);
                org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(this, context, l0Var, 2);
                wa0Var.addView(l0Var);
                v9 v9Var = new v9(this, context, wa0Var);
                nh1 nh1Var = new nh1(this, context);
                this.f38978x = nh1Var;
                nh1Var.setVerticalScrollBarEnabled(false);
                l0Var.addView(this.f38978x, w7.a6.d(-1.0f, -1));
                l0Var.addView(this.h, w7.a6.a(56.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 80));
                l0Var.addView(this.f38965c0, org.telegram.ui.Components.l20.b());
                v9Var.addView(wa0Var, w7.a6.d(-1.0f, -1));
                ic1 ic1Var = new ic1(this, context, 15);
                ic1Var.setOrientation(1);
                this.f38978x.addView(ic1Var, w7.a6.x(-1, -1, 51));
                ic1Var.addView(this.f38960a, w7.a6.t(-2, -2, 49, 0, 69, 0, 0));
                ic1Var.addView(this.f38964c, w7.a6.t(-2, -2, 49, 0, 8, 0, 0));
                ic1Var.addView(this.d, w7.a6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(context, null);
                this.f38976s = yd0Var;
                yd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f38974n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f38974n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f38974n;
                int i18 = org.telegram.ui.ActionBar.g6.f20045l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
                this.f38974n.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                this.f38974n.setBackground(null);
                this.f38974n.setMaxLines(1);
                this.f38974n.setLines(1);
                this.f38974n.setGravity(3);
                this.f38974n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f38974n.setSingleLine(true);
                this.f38974n.setCursorWidth(1.5f);
                this.f38974n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final oh1 f35263b;

                    {
                        this.f35263b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                oh1 oh1Var = this.f35263b;
                                oh1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                oh1Var.C0();
                                return true;
                            default:
                                oh1 oh1Var2 = this.f35263b;
                                oh1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (oh1Var2.v.getVisibility() == 0) {
                                    oh1Var2.f38975r.requestFocus();
                                } else {
                                    oh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f38976s.e(this.f38974n);
                this.f38974n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final oh1 f35581b;

                    {
                        this.f35581b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.yd0 yd0Var2 = this.f35581b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                yd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                oh1 oh1Var = this.f35581b;
                                if (z11) {
                                    oh1Var.f38967e0.setEditText((EditText) view);
                                    oh1Var.f38967e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                oh1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.yd0 yd0Var3 = this.f35581b.f38976s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                yd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f38974n, w7.a6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(this, context, 3);
                this.E = j0Var;
                j0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.E.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 1, -1));
                this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final oh1 f34952b;

                    {
                        this.f34952b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f34952b.C0();
                                return;
                            case 1:
                                oh1 oh1Var = this.f34952b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                a2Var.T = string;
                                oh1Var.showDialog(a2Var);
                                return;
                            case 2:
                                oh1.V(this.f34952b);
                                return;
                            case 3:
                                oh1 oh1Var2 = this.f34952b;
                                if (oh1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = oh1Var2.O;
                                    if (i172 == 0) {
                                        oh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                        oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                        oh1Var2.showDialog(a2Var2);
                                        TextView textView22 = (TextView) a2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        oh1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                oh1 oh1Var3 = this.f34952b;
                                if (oh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = oh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = oh1Var3.G;
                                    oh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    ec0 ec0Var = oh1Var3.f38973j0;
                                    if (ec0Var != null) {
                                        AndroidUtilities.runOnUIThread(ec0Var);
                                        oh1Var3.f38973j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f34952b.C0();
                                return;
                            default:
                                oh1 oh1Var4 = this.f34952b;
                                int i182 = oh1Var4.O;
                                oh1Var4.M = true;
                                if (oh1Var4.f38974n.getTransformationMethod() == null) {
                                    oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                        oh1Var4.f38969f0[3].P(-1);
                                        org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var = oh1Var4.f38969f0[3];
                                        if (animatedDrawable != yj0Var) {
                                            oh1Var4.f38960a.setAnimation(yj0Var);
                                            oh1Var4.f38969f0[3].N(18, false, false);
                                        }
                                        oh1Var4.f38960a.d();
                                    }
                                } else {
                                    oh1Var4.f38974n.setTransformationMethod(null);
                                    oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                        oh1Var4.f38969f0[3].P(18);
                                        org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                        if (animatedDrawable2 != yj0Var2) {
                                            oh1Var4.f38960a.setAnimation(yj0Var2);
                                        }
                                        oh1Var4.f38969f0[3].T(0.0f, false);
                                        oh1Var4.f38960a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = oh1Var4.f38974n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                oh1Var4.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.a6.t(24, 24, 16, 0, 0, 16, 0));
                this.f38974n.addTextChangedListener(new lh1(this, 2));
                this.f38976s.addView(linearLayout, w7.a6.d(-2.0f, -1));
                ic1Var.addView(this.f38976s, w7.a6.a(-2.0f, 24.0f, 32.0f, 24.0f, 32.0f, -1, 49));
                this.v = new org.telegram.ui.Components.yd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f38975r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f38975r.setPadding(dp2, dp2, dp2, dp2);
                this.f38975r.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
                this.f38975r.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                this.f38975r.setBackground(null);
                this.f38975r.setMaxLines(1);
                this.f38975r.setLines(1);
                this.f38975r.setGravity(3);
                this.f38975r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f38975r.setSingleLine(true);
                this.f38975r.setCursorWidth(1.5f);
                this.f38975r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final oh1 f35263b;

                    {
                        this.f35263b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                oh1 oh1Var = this.f35263b;
                                oh1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                oh1Var.C0();
                                return true;
                            default:
                                oh1 oh1Var2 = this.f35263b;
                                oh1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (oh1Var2.v.getVisibility() == 0) {
                                    oh1Var2.f38975r.requestFocus();
                                } else {
                                    oh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f38975r);
                this.f38975r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final oh1 f35581b;

                    {
                        this.f35581b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.yd0 yd0Var2 = this.f35581b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                yd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                oh1 oh1Var = this.f35581b;
                                if (z11) {
                                    oh1Var.f38967e0.setEditText((EditText) view);
                                    oh1Var.f38967e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                oh1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.yd0 yd0Var3 = this.f35581b.f38976s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                yd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f38975r, w7.a6.d(-2.0f, -1));
                ic1Var.addView(this.v, w7.a6.a(-2.0f, 24.0f, 16.0f, 24.0f, 0.0f, -1, 49));
                this.v.setVisibility(8);
                org.telegram.ui.Components.is isVar = new org.telegram.ui.Components.is(context);
                this.f38967e0 = isVar;
                isVar.setVisibility(8);
                wa0Var.addView(this.f38967e0);
                ie0 ie0Var = new ie0(this, context, 3);
                this.f38977w = ie0Var;
                final int i19 = 1;
                ie0Var.b(6, 1);
                ks[] ksVarArr = this.f38977w.f36949f;
                int length = ksVarArr.length;
                int i20 = 0;
                while (i20 < length) {
                    ks ksVar = ksVarArr[i20];
                    ksVar.setShowSoftInputOnFocusCompat(v0() ^ i19);
                    ksVar.addTextChangedListener(new lh1(this, 0));
                    ksVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final oh1 f35581b;

                        {
                            this.f35581b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f7;
                            float f10;
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.Components.yd0 yd0Var2 = this.f35581b.v;
                                    if (z11) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    yd0Var2.b(f7, f7, true);
                                    return;
                                case 1:
                                    oh1 oh1Var = this.f35581b;
                                    if (z11) {
                                        oh1Var.f38967e0.setEditText((EditText) view);
                                        oh1Var.f38967e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    oh1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.yd0 yd0Var3 = this.f35581b.f38976s;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    yd0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i20++;
                    i19 = 1;
                }
                this.f38977w.setVisibility(8);
                ic1Var.addView(this.f38977w, w7.a6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                ic1Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.a6.e(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f38968f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    this.f38968f.setGravity(1);
                    this.f38968f.setTextSize(1, 14.0f);
                    this.f38968f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f38968f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f38968f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    ic1Var.addView(this.f38968f, w7.a6.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f38968f.setOnClickListener(new View.OnClickListener(this) {
                        public final oh1 f34952b;

                        {
                            this.f34952b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f34952b.C0();
                                    return;
                                case 1:
                                    oh1 oh1Var = this.f34952b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                    a2Var.T = string;
                                    oh1Var.showDialog(a2Var);
                                    return;
                                case 2:
                                    oh1.V(this.f34952b);
                                    return;
                                case 3:
                                    oh1 oh1Var2 = this.f34952b;
                                    if (oh1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = oh1Var2.O;
                                        if (i172 == 0) {
                                            oh1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                            oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                            alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                            oh1Var2.showDialog(a2Var2);
                                            TextView textView22 = (TextView) a2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            oh1Var2.A0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    oh1 oh1Var3 = this.f34952b;
                                    if (oh1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = oh1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = oh1Var3.G;
                                        oh1Var3.presentFragment(twoStepVerificationActivity, true);
                                        ec0 ec0Var = oh1Var3.f38973j0;
                                        if (ec0Var != null) {
                                            AndroidUtilities.runOnUIThread(ec0Var);
                                            oh1Var3.f38973j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f34952b.C0();
                                    return;
                                default:
                                    oh1 oh1Var4 = this.f34952b;
                                    int i182 = oh1Var4.O;
                                    oh1Var4.M = true;
                                    if (oh1Var4.f38974n.getTransformationMethod() == null) {
                                        oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                            oh1Var4.f38969f0[3].P(-1);
                                            org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                            org.telegram.ui.Components.yj0 yj0Var = oh1Var4.f38969f0[3];
                                            if (animatedDrawable != yj0Var) {
                                                oh1Var4.f38960a.setAnimation(yj0Var);
                                                oh1Var4.f38969f0[3].N(18, false, false);
                                            }
                                            oh1Var4.f38960a.d();
                                        }
                                    } else {
                                        oh1Var4.f38974n.setTransformationMethod(null);
                                        oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                            oh1Var4.f38969f0[3].P(18);
                                            org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                            org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                            if (animatedDrawable2 != yj0Var2) {
                                                oh1Var4.f38960a.setAnimation(yj0Var2);
                                            }
                                            oh1Var4.f38969f0[3].T(0.0f, false);
                                            oh1Var4.f38960a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = oh1Var4.f38974n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    oh1Var4.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = v9Var;
                di.p6 p6Var = new di.p6(this, context);
                this.f38979y = p6Var;
                p6Var.setAlpha(0.0f);
                v9Var.addView(this.f38979y);
                v9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20045l6, false));
                l0Var.addView(this.L, w7.a6.a(32.0f, 0.0f, 16.0f, 16.0f, 0.0f, 32, 53));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new ci.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.f38960a);
                fVar.addView(this.f38964c);
                fVar.addView(this.d);
                fVar.addView(this.f38962b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f38964c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f38964c.setText(string);
                }
                if (!TextUtils.isEmpty(this.f38961a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.yd0 yd0Var2 = this.f38976s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                yd0Var2.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f38974n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f38974n.setImeOptions(268435461);
                this.f38974n.setInputType(129);
                this.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f38974n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.yj0[] yj0VarArr = new org.telegram.ui.Components.yj0[7];
                this.f38969f0 = yj0VarArr;
                yj0VarArr[0] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38969f0[1] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38969f0[2] = new org.telegram.ui.Components.yj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38969f0[3] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38969f0[4] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38969f0[5] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f38969f0[6] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.yj0 yj0Var = this.f38969f0[6];
                yj0Var.h = true;
                yj0Var.P(19);
                this.f38969f0[2].S(97, this.f38972i0);
                F0(true);
                if (i16 == 1) {
                    gh1 gh1Var = this.f38970g0;
                    if (gh1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(gh1Var);
                    }
                    this.f38960a.setAnimation(this.f38969f0[6]);
                    this.f38960a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f38974n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    F0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f38964c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f38976s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f38974n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f38974n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f38960a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f38960a.d();
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
                this.f38964c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f38976s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f38974n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f38974n.setImeOptions(268435461);
                this.f38974n.setInputType(33);
                this.v.setVisibility(8);
                this.f38960a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f38960a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f38964c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f38967e0.setVisibility(0);
                this.f38976s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28135a |= 256;
                    obj.f28136b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f28137c = i21;
                    valueOf.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i21, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.f38965c0.e(false, false);
                this.f38977w.setVisibility(0);
                this.f38960a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f38960a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f38964c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f38976s.setVisibility(8);
                this.f38967e0.setVisibility(0);
                wh.n nVar2 = this.d;
                int i22 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                nVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i22, str));
                this.d.setVisibility(0);
                this.f38965c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final oh1 f34952b;

                    {
                        this.f34952b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f34952b.C0();
                                return;
                            case 1:
                                oh1 oh1Var = this.f34952b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fh1(oh1Var, 1));
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                a2Var.T = string2;
                                oh1Var.showDialog(a2Var);
                                return;
                            case 2:
                                oh1.V(this.f34952b);
                                return;
                            case 3:
                                oh1 oh1Var2 = this.f34952b;
                                if (oh1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = oh1Var2.O;
                                    if (i172 == 0) {
                                        oh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = oh1Var2.f38961a0;
                                        oh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new hh1(oh1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(oh1Var2.getParentActivity());
                                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new fh1(oh1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                                        oh1Var2.showDialog(a2Var2);
                                        TextView textView22 = (TextView) a2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        oh1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                oh1 oh1Var3 = this.f34952b;
                                if (oh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = oh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = oh1Var3.G;
                                    oh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    ec0 ec0Var = oh1Var3.f38973j0;
                                    if (ec0Var != null) {
                                        AndroidUtilities.runOnUIThread(ec0Var);
                                        oh1Var3.f38973j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f34952b.C0();
                                return;
                            default:
                                oh1 oh1Var4 = this.f34952b;
                                int i182 = oh1Var4.O;
                                oh1Var4.M = true;
                                if (oh1Var4.f38974n.getTransformationMethod() == null) {
                                    oh1Var4.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                        oh1Var4.f38969f0[3].P(-1);
                                        org.telegram.ui.Components.yj0 animatedDrawable = oh1Var4.f38960a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var2 = oh1Var4.f38969f0[3];
                                        if (animatedDrawable != yj0Var2) {
                                            oh1Var4.f38960a.setAnimation(yj0Var2);
                                            oh1Var4.f38969f0[3].N(18, false, false);
                                        }
                                        oh1Var4.f38960a.d();
                                    }
                                } else {
                                    oh1Var4.f38974n.setTransformationMethod(null);
                                    oh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && oh1Var4.f38974n.length() > 0 && oh1Var4.f38974n.hasFocus()) {
                                        oh1Var4.f38969f0[3].P(18);
                                        org.telegram.ui.Components.yj0 animatedDrawable2 = oh1Var4.f38960a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var22 = oh1Var4.f38969f0[3];
                                        if (animatedDrawable2 != yj0Var22) {
                                            oh1Var4.f38960a.setAnimation(yj0Var22);
                                        }
                                        oh1Var4.f38969f0[3].T(0.0f, false);
                                        oh1Var4.f38960a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = oh1Var4.f38974n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                oh1Var4.M = false;
                                return;
                        }
                    }
                });
                this.f38977w.setVisibility(0);
                this.f38960a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f38960a.d();
                i14 = 1;
                break;
            case 6:
                this.f38964c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f38962b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f38960a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f38960a.d();
                i14 = 1;
                break;
            case 7:
                this.f38964c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.Y) {
                    this.f38962b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
                    this.f38962b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f38962b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f38960a.f(R.raw.wallet_allset, 160, 160, null);
                this.f38960a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f38964c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.e.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20104o6, false));
                this.f38976s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f38974n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f38974n.setImeOptions(268435462);
                this.f38974n.setInputType(129);
                this.f38974n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f38974n.setTypeface(Typeface.DEFAULT);
                this.f38960a.f(R.raw.wallet_science, 120, 120, null);
                this.f38960a.d();
                i14 = 1;
                break;
            case 9:
                this.f38964c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f38962b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f38960a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f38960a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f38974n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new lh1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
            if (m2Var != this && (m2Var instanceof oh1)) {
                ((org.telegram.ui.Components.t71) ((oh1) m2Var).f38963b0.f14820b).f29290b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38964c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38974n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38974n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38974n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f20028k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38974n, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f20045l6));
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
        if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, true)) > 0.699999988079071d) {
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
        if (this.f38960a != null) {
            int i12 = this.O;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f38960a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.bk0 bk0Var = this.f38960a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                bk0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.is isVar = this.f38967e0;
        if (isVar != null) {
            if (!v0()) {
                i11 = 8;
            }
            isVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        gh1 gh1Var = this.f38970g0;
        if (gh1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gh1Var);
            this.f38970g0 = null;
        }
        if (this.f38969f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.yj0[] yj0VarArr = this.f38969f0;
                if (i10 >= yj0VarArr.length) {
                    break;
                }
                yj0VarArr[i10].C(false);
                i10++;
            }
            this.f38969f0 = null;
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
            if (this.f38974n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new gh1(this, 0), 200L);
            }
            ie0 ie0Var = this.f38977w;
            if (ie0Var != null && ie0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new gh1(this, 1), 200L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            ie0 ie0Var = this.f38977w;
            ks[] ksVarArr = ie0Var.f36949f;
            if (i10 < ksVarArr.length) {
                ks ksVar = ksVarArr[i10];
                ksVar.postDelayed(new vl0(ksVar, 1), i10 * 75);
                i10++;
            } else {
                ie0Var.postDelayed(new je1(8, this, runnable), (ksVarArr.length * 75) + 350);
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
        this.f38965c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f38965c0.f(true, true);
        }
    }

    public final void y0() {
        ks[] ksVarArr;
        for (ks ksVar : this.f38977w.f36949f) {
            ksVar.setText("");
            ksVar.i(1.0f);
        }
        this.f38977w.f36949f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f38977w, 8.0f, new gh1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.yd0 yd0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(yd0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle h = a1.g.h("afterSignup", true);
            kh0 kh0Var = new kh0();
            kh0Var.l0(h);
            presentFragment(kh0Var, true);
            return;
        }
        super.finishFragment();
    }

    public oh1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f38971h0 = new gh1(this, 2);
        this.f38972i0 = new gh1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new hh1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void B0() {
    }
}
