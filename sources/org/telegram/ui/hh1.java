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
public class hh1 extends org.telegram.ui.ActionBar.n2 {
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
    public org.telegram.ui.Components.aj0 f37029a;
    public String f37030a0;
    public TextView f37031b;
    public n7.z0 f37032b0;
    public TextView f37033c;
    public org.telegram.ui.Components.y10 f37034c0;
    public wh.p d;
    public org.telegram.ui.Components.e31 f37035d0;
    public TextView f37036e;
    public org.telegram.ui.Components.tr f37037e0;
    public TextView f37038f;
    public org.telegram.ui.Components.xi0[] f37039f0;
    public zg1 f37040g0;
    public TextView h;
    public final Runnable f37041h0;
    public final Runnable f37042i0;
    public ac0 f37043j0;
    public EditTextBoldCursor f37044n;
    public EditTextBoldCursor f37045r;
    public org.telegram.ui.Components.zc0 f37046s;
    public org.telegram.ui.Components.zc0 v;
    public de0 f37047w;
    public gh1 f37048x;
    public di.r6 f37049y;

    public hh1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f37041h0 = new zg1(this, 2);
        this.f37042i0 = new zg1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ah1(this, 0), 10);
            }
        }
    }

    public static void U(hh1 hh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = hh1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(hh1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = hh1Var.U.new_algo;
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
        ig.n0 n0Var = new ig.n0(hh1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = hh1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = hh1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(hh1Var.X, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = hh1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = hh1Var.U.new_algo;
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
                ConnectionsManager.getInstance(hh1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            n0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(hh1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
    }

    public static void V(hh1 hh1Var) {
        ConnectionsManager.getInstance(hh1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new bi.c7(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        hh1Var.showDialog(alertDialog$Builder.f20225a);
    }

    public static void W(hh1 hh1Var, byte[] bArr) {
        ArrayList arrayList = hh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = hh1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = hh1Var.U;
        if (bArr == null) {
            bArr = hh1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, hh1Var.W, hh1Var.X);
        twoStepVerificationActivity.X = hh1Var.G;
        hh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
        ac0 ac0Var = hh1Var.f37043j0;
        if (ac0Var != null) {
            AndroidUtilities.runOnUIThread(ac0Var);
            hh1Var.f37043j0 = null;
        }
    }

    public static void X(hh1 hh1Var) {
        ArrayList arrayList = hh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(hh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = hh1Var.V;
        TL_account.Password password = hh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, hh1Var.R, hh1Var.Q, null, hh1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = hh1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, hh1Var.V, hh1Var.W, hh1Var.X);
        twoStepVerificationActivity.X = hh1Var.G;
        hh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
        ac0 ac0Var = hh1Var.f37043j0;
        if (ac0Var != null) {
            AndroidUtilities.runOnUIThread(ac0Var);
            hh1Var.f37043j0 = null;
        }
    }

    public static void Y(hh1 hh1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = hh1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        bc0 bc0Var = new bc0(29, hh1Var, bArr2);
        TL_account.Password password = hh1Var.U;
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
            ConnectionsManager.getInstance(hh1Var.currentAccount).sendRequest(getpasswordsettings, bc0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        bc0Var.run(null, tL_error2);
    }

    public static void Z(hh1 hh1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(hh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ah1(hh1Var, 4), 8);
            return;
        }
        hh1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            hh1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            hh1Var.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20907p7, false));
            hh1Var.z0(hh1Var.f37046s, hh1Var.f37044n, true);
            hh1Var.H0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            hh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            hh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(hh1 hh1Var) {
        ArrayList arrayList = hh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        hh1Var.finishFragment();
    }

    public static void b0(hh1 hh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            hh1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.e5.x0(hh1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            hh1Var.T = !TextUtils.isEmpty(hh1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(hh1Var.U);
            if (!hh1Var.S && hh1Var.Y) {
                TL_account.Password password2 = hh1Var.U;
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
                    if (!hh1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        hh1Var.finishFragment();
                    }
                }
            }
            if (hh1Var.N) {
                hh1Var.w0();
                hh1Var.C0();
            }
            NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
        }
    }

    public static void c0(hh1 hh1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            hh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            hh1Var.E0(z10);
            NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
        }
    }

    public static void d0(hh1 hh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = hh1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(hh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new di.u3(12, hh1Var, z10), 8);
            return;
        }
        hh1Var.w0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            hh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                hh1Var.finishFragment();
            } else if (hh1Var.getParentActivity() != null) {
                if (hh1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qv0(18, hh1Var, bArr));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                    if (str == null && (password = hh1Var.U) != null && password.has_password) {
                        b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = hh1Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i11)).removeSelfFromStack();
                }
                TL_account.Password password2 = hh1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (hh1Var.Y) {
                    NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                hh1 hh1Var2 = new hh1(7, hh1Var.U);
                hh1Var2.H = hh1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = hh1Var.V;
                }
                hh1Var2.D0(bArr3, hh1Var.W, hh1Var.X, hh1Var.Z);
                hh1Var2.Y = hh1Var.Y;
                hh1Var2.G = hh1Var.G;
                hh1Var.presentFragment(hh1Var2, true);
                NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    hh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    hh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    hh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.n2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(hh1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = hh1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = hh1Var.R;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, hh1Var.Q, str2, hh1Var.P);
            TL_account.Password password4 = hh1Var.U;
            password4.email_unconfirmed_pattern = hh1Var.R;
            hh1 hh1Var3 = new hh1(5, password4);
            hh1Var3.H = hh1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = hh1Var.V;
            }
            hh1Var3.D0(bArr2, hh1Var.W, hh1Var.X, hh1Var.Z);
            hh1Var3.Y = hh1Var.Y;
            hh1Var3.G = hh1Var.G;
            hh1Var.presentFragment(hh1Var3, true);
        }
    }

    public static void e0(hh1 hh1Var, TLRPC.TL_error tL_error) {
        hh1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = hh1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, hh1Var.V, hh1Var.W, hh1Var.X);
            twoStepVerificationActivity.X = hh1Var.G;
            hh1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            ac0 ac0Var = hh1Var.f37043j0;
            if (ac0Var != null) {
                AndroidUtilities.runOnUIThread(ac0Var);
                hh1Var.f37043j0 = null;
            }
        }
    }

    public static void f0(hh1 hh1Var) {
        ArrayList arrayList = hh1Var.J;
        if (hh1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new yg1(hh1Var, 4));
            boolean z10 = hh1Var.U.has_recovery;
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            if (z10) {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = hh1Var.showDialog(b2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = hh1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        hh1 hh1Var2 = new hh1(7, password);
        hh1Var2.H = hh1Var.H;
        hh1Var2.D0(hh1Var.V, hh1Var.W, hh1Var.X, hh1Var.Z);
        hh1Var2.J.addAll(arrayList);
        hh1Var2.Y = hh1Var.Y;
        hh1Var2.G = hh1Var.G;
        hh1Var.presentFragment(hh1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(hh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = hh1Var.V;
        TL_account.Password password2 = hh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, hh1Var.R, hh1Var.Q, null, hh1Var.P);
        NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
    }

    public static void g0(hh1 hh1Var, String str) {
        hh1 hh1Var2 = new hh1(hh1Var.currentAccount, 0, hh1Var.U);
        hh1Var2.H = hh1Var.H;
        hh1Var2.J.addAll(hh1Var.J);
        hh1Var2.J.add(hh1Var);
        hh1Var2.f37030a0 = str;
        hh1Var2.G = hh1Var.G;
        hh1Var.presentFragment(hh1Var2, true);
    }

    public static void h0(hh1 hh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            hh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(hh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, hh1Var.U);
            hh1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            hh1 hh1Var = new hh1(this.currentAccount, 3, password);
            hh1Var.H = this.H;
            hh1Var.D0(this.V, this.W, this.X, this.Z);
            hh1Var.P = this.P;
            hh1Var.Q = this.Q;
            hh1Var.J.addAll(this.J);
            hh1Var.J.add(this);
            hh1Var.Y = this.Y;
            hh1Var.G = this.G;
            presentFragment(hh1Var);
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
                    if (this.f37044n.length() == 0) {
                        z0(this.f37046s, this.f37044n, false);
                        return;
                    } else if (!this.f37044n.getText().toString().equals(this.P) && this.O == 1) {
                        AndroidUtilities.shakeViewSpring(this.f37046s, 5.0f);
                        try {
                            this.f37046s.performHapticFeedback(3, 2);
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
                        hh1 hh1Var = new hh1(i11, i10, this.U);
                        hh1Var.H = this.H;
                        hh1Var.P = this.f37044n.getText().toString();
                        hh1Var.D0(this.V, this.W, this.X, this.Z);
                        hh1Var.f37030a0 = this.f37030a0;
                        hh1Var.J.addAll(this.J);
                        hh1Var.J.add(this);
                        hh1Var.Y = this.Y;
                        hh1Var.G = this.G;
                        presentFragment(hh1Var);
                        return;
                    }
                case 2:
                    String obj = this.f37044n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        z0(this.f37046s, this.f37044n, false);
                        return;
                    }
                    A0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f37044n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            E0(false);
                            return;
                        }
                    }
                    z0(this.f37046s, this.f37044n, false);
                    return;
                case 4:
                    String code = this.f37047w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new bc0(28, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f37047w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ah1(this, 2), 10);
                    x0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    hh1 hh1Var2 = new hh1(this.currentAccount, 0, password);
                    hh1Var2.H = this.H;
                    hh1Var2.Y = this.Y;
                    hh1Var2.G = this.G;
                    presentFragment(hh1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle i12 = a4.a.i("afterSignup", true);
                        eh0 eh0Var = new eh0();
                        eh0Var.l0(i12);
                        presentFragment(eh0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        ac0 ac0Var = this.f37043j0;
                        if (ac0Var != null) {
                            AndroidUtilities.runOnUIThread(ac0Var);
                            this.f37043j0 = null;
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
                    String obj3 = this.f37044n.getText().toString();
                    if (obj3.length() == 0) {
                        z0(this.f37046s, this.f37044n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    x0();
                    Utilities.globalQueue.postRunnable(new bh1(this, stringBytes, 0));
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new ah1(this, 3));
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
        if (this.f37030a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f37030a0;
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
        Utilities.globalQueue.postRunnable(new di.u1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void F0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hh1.F0(boolean):void");
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = str;
        b2Var.T = str2;
        showDialog(b2Var);
    }

    public final void H0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f37031b.getTag() != null) {
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
        TextView textView = this.f37031b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f37031b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.f37036e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f37036e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f37036e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f37031b, property, 1.0f), ObjectAnimator.ofFloat(this.f37031b, property2, 1.0f), ObjectAnimator.ofFloat(this.f37031b, property3, 1.0f));
        } else {
            this.f37036e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f37031b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f37031b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f37031b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f37036e, property4, 1.0f), ObjectAnimator.ofFloat(this.f37036e, property5, 1.0f), ObjectAnimator.ofFloat(this.f37036e, property6, 1.0f));
        }
        this.I.addListener(new e50(12, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f20225a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new yg1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
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
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i15, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21001u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new fh1(this));
        int i16 = this.O;
        if (i16 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f37034c0 = y10Var;
        this.f37032b0 = new n7.z0(y10Var);
        this.f37034c0.setOnClickListener(new View.OnClickListener(this) {
            public final hh1 f41575b;

            {
                this.f41575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41575b.C0();
                        return;
                    case 1:
                        hh1 hh1Var = this.f41575b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.T = string;
                        hh1Var.showDialog(b2Var);
                        return;
                    case 2:
                        hh1.V(this.f41575b);
                        return;
                    case 3:
                        hh1 hh1Var2 = this.f41575b;
                        if (hh1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = hh1Var2.O;
                            if (i17 == 0) {
                                hh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                hh1Var2.showDialog(b2Var2);
                                TextView textView = (TextView) b2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                hh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        hh1 hh1Var3 = this.f41575b;
                        if (hh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = hh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = hh1Var3.G;
                            hh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = hh1Var3.f37043j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                hh1Var3.f37043j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41575b.C0();
                        return;
                    default:
                        hh1 hh1Var4 = this.f41575b;
                        int i18 = hh1Var4.O;
                        hh1Var4.M = true;
                        if (hh1Var4.f37044n.getTransformationMethod() == null) {
                            hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = hh1Var4.f37039f0[3];
                                if (animatedDrawable != xi0Var) {
                                    hh1Var4.f37029a.setAnimation(xi0Var);
                                    hh1Var4.f37039f0[3].L(18, false, false);
                                }
                                hh1Var4.f37029a.d();
                            }
                        } else {
                            hh1Var4.f37044n.setTransformationMethod(null);
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    hh1Var4.f37029a.setAnimation(xi0Var2);
                                }
                                hh1Var4.f37039f0[3].Q(0.0f, false);
                                hh1Var4.f37029a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = hh1Var4.f37044n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        hh1Var4.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(context);
        this.f37035d0 = e31Var;
        e31Var.setTransformType(1);
        this.f37035d0.setProgress(0.0f);
        this.f37035d0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.f37035d0.setDrawBackground(false);
        this.f37034c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.f37034c0.addView(this.f37035d0, w7.x5.e(56, 56, 17));
        this.f37034c0.a(this.f37035d0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20889o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        n7.z0.g(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final hh1 f41575b;

            {
                this.f41575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41575b.C0();
                        return;
                    case 1:
                        hh1 hh1Var = this.f41575b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.T = string;
                        hh1Var.showDialog(b2Var);
                        return;
                    case 2:
                        hh1.V(this.f41575b);
                        return;
                    case 3:
                        hh1 hh1Var2 = this.f41575b;
                        if (hh1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = hh1Var2.O;
                            if (i17 == 0) {
                                hh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                hh1Var2.showDialog(b2Var2);
                                TextView textView2 = (TextView) b2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                hh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        hh1 hh1Var3 = this.f41575b;
                        if (hh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = hh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = hh1Var3.G;
                            hh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = hh1Var3.f37043j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                hh1Var3.f37043j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41575b.C0();
                        return;
                    default:
                        hh1 hh1Var4 = this.f41575b;
                        int i18 = hh1Var4.O;
                        hh1Var4.M = true;
                        if (hh1Var4.f37044n.getTransformationMethod() == null) {
                            hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = hh1Var4.f37039f0[3];
                                if (animatedDrawable != xi0Var) {
                                    hh1Var4.f37029a.setAnimation(xi0Var);
                                    hh1Var4.f37039f0[3].L(18, false, false);
                                }
                                hh1Var4.f37029a.d();
                            }
                        } else {
                            hh1Var4.f37044n.setTransformationMethod(null);
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    hh1Var4.f37029a.setAnimation(xi0Var2);
                                }
                                hh1Var4.f37039f0[3].Q(0.0f, false);
                                hh1Var4.f37029a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = hh1Var4.f37044n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        hh1Var4.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f37029a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f37029a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.aj0 aj0Var = this.f37029a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            aj0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f37033c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f37033c.setGravity(1);
        this.f37033c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f37033c.setTextSize(1, 24.0f);
        wh.p pVar = new wh.p(context);
        this.d = pVar;
        int i17 = org.telegram.ui.ActionBar.j6.D6;
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f37036e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f37036e.setGravity(1);
        this.f37036e.setTextSize(1, 14.0f);
        this.f37036e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f37036e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f37036e.setVisibility(8);
        this.f37036e.setOnClickListener(new View.OnClickListener(this) {
            public final hh1 f41575b;

            {
                this.f41575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41575b.C0();
                        return;
                    case 1:
                        hh1 hh1Var = this.f41575b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.T = string;
                        hh1Var.showDialog(b2Var);
                        return;
                    case 2:
                        hh1.V(this.f41575b);
                        return;
                    case 3:
                        hh1 hh1Var2 = this.f41575b;
                        if (hh1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = hh1Var2.O;
                            if (i172 == 0) {
                                hh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                hh1Var2.showDialog(b2Var2);
                                TextView textView22 = (TextView) b2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                hh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        hh1 hh1Var3 = this.f41575b;
                        if (hh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = hh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = hh1Var3.G;
                            hh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = hh1Var3.f37043j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                hh1Var3.f37043j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41575b.C0();
                        return;
                    default:
                        hh1 hh1Var4 = this.f41575b;
                        int i18 = hh1Var4.O;
                        hh1Var4.M = true;
                        if (hh1Var4.f37044n.getTransformationMethod() == null) {
                            hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = hh1Var4.f37039f0[3];
                                if (animatedDrawable != xi0Var) {
                                    hh1Var4.f37029a.setAnimation(xi0Var);
                                    hh1Var4.f37039f0[3].L(18, false, false);
                                }
                                hh1Var4.f37029a.d();
                            }
                        } else {
                            hh1Var4.f37044n.setTransformationMethod(null);
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    hh1Var4.f37029a.setAnimation(xi0Var2);
                                }
                                hh1Var4.f37039f0[3].Q(0.0f, false);
                                hh1Var4.f37029a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = hh1Var4.f37044n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        hh1Var4.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f37031b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f37031b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f37031b.setGravity(17);
        this.f37031b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f37031b.setTextSize(1, 15.0f);
        this.f37031b.setTypeface(AndroidUtilities.bold());
        this.f37031b.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f37031b.setOnClickListener(new View.OnClickListener(this) {
            public final hh1 f41575b;

            {
                this.f41575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41575b.C0();
                        return;
                    case 1:
                        hh1 hh1Var = this.f41575b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.T = string;
                        hh1Var.showDialog(b2Var);
                        return;
                    case 2:
                        hh1.V(this.f41575b);
                        return;
                    case 3:
                        hh1 hh1Var2 = this.f41575b;
                        if (hh1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = hh1Var2.O;
                            if (i172 == 0) {
                                hh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                hh1Var2.showDialog(b2Var2);
                                TextView textView22 = (TextView) b2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                hh1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        hh1 hh1Var3 = this.f41575b;
                        if (hh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = hh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = hh1Var3.G;
                            hh1Var3.presentFragment(twoStepVerificationActivity, true);
                            ac0 ac0Var = hh1Var3.f37043j0;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                hh1Var3.f37043j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41575b.C0();
                        return;
                    default:
                        hh1 hh1Var4 = this.f41575b;
                        int i18 = hh1Var4.O;
                        hh1Var4.M = true;
                        if (hh1Var4.f37044n.getTransformationMethod() == null) {
                            hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = hh1Var4.f37039f0[3];
                                if (animatedDrawable != xi0Var) {
                                    hh1Var4.f37029a.setAnimation(xi0Var);
                                    hh1Var4.f37039f0[3].L(18, false, false);
                                }
                                hh1Var4.f37029a.d();
                            }
                        } else {
                            hh1Var4.f37044n.setTransformationMethod(null);
                            hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                hh1Var4.f37039f0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    hh1Var4.f37029a.setAnimation(xi0Var2);
                                }
                                hh1Var4.f37039f0[3].Q(0.0f, false);
                                hh1Var4.f37029a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = hh1Var4.f37044n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        hh1Var4.M = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f37033c.setTypeface(AndroidUtilities.bold());
            this.f37033c.setTextSize(1, 18.0f);
        } else {
            this.f37033c.setTypeface(Typeface.DEFAULT);
            this.f37033c.setTextSize(1, 24.0f);
        }
        switch (i16) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                j0 j0Var = new j0(this, context, 26);
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(this, context, j0Var, 2);
                w90Var.addView(j0Var);
                r9 r9Var = new r9(this, context, w90Var);
                gh1 gh1Var = new gh1(this, context);
                this.f37048x = gh1Var;
                gh1Var.setVerticalScrollBarEnabled(false);
                j0Var.addView(this.f37048x, w7.x5.c(-1.0f, -1));
                j0Var.addView(this.h, w7.x5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                j0Var.addView(this.f37034c0, org.telegram.ui.Components.y10.b());
                r9Var.addView(w90Var, w7.x5.c(-1.0f, -1));
                cc1 cc1Var = new cc1(this, context, 15);
                cc1Var.setOrientation(1);
                this.f37048x.addView(cc1Var, w7.x5.x(-1, -1, 51));
                cc1Var.addView(this.f37029a, w7.x5.t(-2, -2, 49, 0, 69, 0, 0));
                cc1Var.addView(this.f37033c, w7.x5.t(-2, -2, 49, 0, 8, 0, 0));
                cc1Var.addView(this.d, w7.x5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(context, null);
                this.f37046s = zc0Var;
                zc0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f37044n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f37044n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f37044n;
                int i18 = org.telegram.ui.ActionBar.j6.f20836l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                this.f37044n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.f37044n.setBackground(null);
                this.f37044n.setMaxLines(1);
                this.f37044n.setLines(1);
                this.f37044n.setGravity(3);
                this.f37044n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f37044n.setSingleLine(true);
                this.f37044n.setCursorWidth(1.5f);
                this.f37044n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final hh1 f42416b;

                    {
                        this.f42416b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                hh1 hh1Var = this.f42416b;
                                hh1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                hh1Var.C0();
                                return true;
                            default:
                                hh1 hh1Var2 = this.f42416b;
                                hh1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (hh1Var2.v.getVisibility() == 0) {
                                    hh1Var2.f37045r.requestFocus();
                                } else {
                                    hh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f37046s.e(this.f37044n);
                this.f37044n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final hh1 f42753b;

                    {
                        this.f42753b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.zc0 zc0Var2 = this.f42753b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                zc0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                hh1 hh1Var = this.f42753b;
                                if (z11) {
                                    hh1Var.f37037e0.setEditText((EditText) view);
                                    hh1Var.f37037e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                hh1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.zc0 zc0Var3 = this.f42753b.f37046s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                zc0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f37044n, w7.x5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, context, 3);
                this.E = k0Var;
                k0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.E.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20780i6, false), 1, -1));
                this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final hh1 f41575b;

                    {
                        this.f41575b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f41575b.C0();
                                return;
                            case 1:
                                hh1 hh1Var = this.f41575b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                b2Var.T = string;
                                hh1Var.showDialog(b2Var);
                                return;
                            case 2:
                                hh1.V(this.f41575b);
                                return;
                            case 3:
                                hh1 hh1Var2 = this.f41575b;
                                if (hh1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = hh1Var2.O;
                                    if (i172 == 0) {
                                        hh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                        hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                        alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                        hh1Var2.showDialog(b2Var2);
                                        TextView textView22 = (TextView) b2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        hh1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                hh1 hh1Var3 = this.f41575b;
                                if (hh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = hh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = hh1Var3.G;
                                    hh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    ac0 ac0Var = hh1Var3.f37043j0;
                                    if (ac0Var != null) {
                                        AndroidUtilities.runOnUIThread(ac0Var);
                                        hh1Var3.f37043j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f41575b.C0();
                                return;
                            default:
                                hh1 hh1Var4 = this.f41575b;
                                int i182 = hh1Var4.O;
                                hh1Var4.M = true;
                                if (hh1Var4.f37044n.getTransformationMethod() == null) {
                                    hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                        hh1Var4.f37039f0[3].N(-1);
                                        org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var = hh1Var4.f37039f0[3];
                                        if (animatedDrawable != xi0Var) {
                                            hh1Var4.f37029a.setAnimation(xi0Var);
                                            hh1Var4.f37039f0[3].L(18, false, false);
                                        }
                                        hh1Var4.f37029a.d();
                                    }
                                } else {
                                    hh1Var4.f37044n.setTransformationMethod(null);
                                    hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                        hh1Var4.f37039f0[3].N(18);
                                        org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                        if (animatedDrawable2 != xi0Var2) {
                                            hh1Var4.f37029a.setAnimation(xi0Var2);
                                        }
                                        hh1Var4.f37039f0[3].Q(0.0f, false);
                                        hh1Var4.f37029a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = hh1Var4.f37044n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                hh1Var4.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.x5.t(24, 24, 16, 0, 0, 16, 0));
                this.f37044n.addTextChangedListener(new eh1(this, 2));
                this.f37046s.addView(linearLayout, w7.x5.c(-2.0f, -1));
                cc1Var.addView(this.f37046s, w7.x5.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.zc0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f37045r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f37045r.setPadding(dp2, dp2, dp2, dp2);
                this.f37045r.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                this.f37045r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.f37045r.setBackground(null);
                this.f37045r.setMaxLines(1);
                this.f37045r.setLines(1);
                this.f37045r.setGravity(3);
                this.f37045r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f37045r.setSingleLine(true);
                this.f37045r.setCursorWidth(1.5f);
                this.f37045r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final hh1 f42416b;

                    {
                        this.f42416b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                hh1 hh1Var = this.f42416b;
                                hh1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                hh1Var.C0();
                                return true;
                            default:
                                hh1 hh1Var2 = this.f42416b;
                                hh1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (hh1Var2.v.getVisibility() == 0) {
                                    hh1Var2.f37045r.requestFocus();
                                } else {
                                    hh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f37045r);
                this.f37045r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final hh1 f42753b;

                    {
                        this.f42753b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.zc0 zc0Var2 = this.f42753b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                zc0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                hh1 hh1Var = this.f42753b;
                                if (z11) {
                                    hh1Var.f37037e0.setEditText((EditText) view);
                                    hh1Var.f37037e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                hh1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.zc0 zc0Var3 = this.f42753b.f37046s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                zc0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f37045r, w7.x5.c(-2.0f, -1));
                cc1Var.addView(this.v, w7.x5.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.tr trVar = new org.telegram.ui.Components.tr(context);
                this.f37037e0 = trVar;
                trVar.setVisibility(8);
                w90Var.addView(this.f37037e0);
                de0 de0Var = new de0(this, context, 3);
                this.f37047w = de0Var;
                final int i19 = 1;
                de0Var.b(6, 1);
                gs[] gsVarArr = this.f37047w.f36190f;
                int length = gsVarArr.length;
                int i20 = 0;
                while (i20 < length) {
                    gs gsVar = gsVarArr[i20];
                    gsVar.setShowSoftInputOnFocusCompat(v0() ^ i19);
                    gsVar.addTextChangedListener(new eh1(this, 0));
                    gsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final hh1 f42753b;

                        {
                            this.f42753b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f7;
                            float f10;
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.Components.zc0 zc0Var2 = this.f42753b.v;
                                    if (z11) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    zc0Var2.b(f7, f7, true);
                                    return;
                                case 1:
                                    hh1 hh1Var = this.f42753b;
                                    if (z11) {
                                        hh1Var.f37037e0.setEditText((EditText) view);
                                        hh1Var.f37037e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    hh1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.zc0 zc0Var3 = this.f42753b.f37046s;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    zc0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i20++;
                    i19 = 1;
                }
                this.f37047w.setVisibility(8);
                cc1Var.addView(this.f37047w, w7.x5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                cc1Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f37036e, w7.x5.e(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f37038f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
                    this.f37038f.setGravity(1);
                    this.f37038f.setTextSize(1, 14.0f);
                    this.f37038f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f37038f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f37038f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    cc1Var.addView(this.f37038f, w7.x5.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f37038f.setOnClickListener(new View.OnClickListener(this) {
                        public final hh1 f41575b;

                        {
                            this.f41575b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41575b.C0();
                                    return;
                                case 1:
                                    hh1 hh1Var = this.f41575b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                    b2Var.T = string;
                                    hh1Var.showDialog(b2Var);
                                    return;
                                case 2:
                                    hh1.V(this.f41575b);
                                    return;
                                case 3:
                                    hh1 hh1Var2 = this.f41575b;
                                    if (hh1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = hh1Var2.O;
                                        if (i172 == 0) {
                                            hh1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                            hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                            alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                            hh1Var2.showDialog(b2Var2);
                                            TextView textView22 = (TextView) b2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            hh1Var2.A0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    hh1 hh1Var3 = this.f41575b;
                                    if (hh1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = hh1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = hh1Var3.G;
                                        hh1Var3.presentFragment(twoStepVerificationActivity, true);
                                        ac0 ac0Var = hh1Var3.f37043j0;
                                        if (ac0Var != null) {
                                            AndroidUtilities.runOnUIThread(ac0Var);
                                            hh1Var3.f37043j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f41575b.C0();
                                    return;
                                default:
                                    hh1 hh1Var4 = this.f41575b;
                                    int i182 = hh1Var4.O;
                                    hh1Var4.M = true;
                                    if (hh1Var4.f37044n.getTransformationMethod() == null) {
                                        hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                            hh1Var4.f37039f0[3].N(-1);
                                            org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                            org.telegram.ui.Components.xi0 xi0Var = hh1Var4.f37039f0[3];
                                            if (animatedDrawable != xi0Var) {
                                                hh1Var4.f37029a.setAnimation(xi0Var);
                                                hh1Var4.f37039f0[3].L(18, false, false);
                                            }
                                            hh1Var4.f37029a.d();
                                        }
                                    } else {
                                        hh1Var4.f37044n.setTransformationMethod(null);
                                        hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                            hh1Var4.f37039f0[3].N(18);
                                            org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                            org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                            if (animatedDrawable2 != xi0Var2) {
                                                hh1Var4.f37029a.setAnimation(xi0Var2);
                                            }
                                            hh1Var4.f37039f0[3].Q(0.0f, false);
                                            hh1Var4.f37029a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = hh1Var4.f37044n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    hh1Var4.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = r9Var;
                di.r6 r6Var = new di.r6(this, context);
                this.f37049y = r6Var;
                r6Var.setAlpha(0.0f);
                r9Var.addView(this.f37049y);
                r9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20836l6, false));
                j0Var.addView(this.L, w7.x5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new ci.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.f37029a);
                fVar.addView(this.f37033c);
                fVar.addView(this.d);
                fVar.addView(this.f37031b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f37033c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f37033c.setText(string);
                }
                if (!TextUtils.isEmpty(this.f37030a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.zc0 zc0Var2 = this.f37046s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                zc0Var2.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f37044n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f37044n.setImeOptions(268435461);
                this.f37044n.setInputType(129);
                this.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f37044n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.xi0[] xi0VarArr = new org.telegram.ui.Components.xi0[7];
                this.f37039f0 = xi0VarArr;
                xi0VarArr[0] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f37039f0[1] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f37039f0[2] = new org.telegram.ui.Components.xi0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f37039f0[3] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f37039f0[4] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f37039f0[5] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f37039f0[6] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.xi0 xi0Var = this.f37039f0[6];
                xi0Var.h = true;
                xi0Var.N(19);
                this.f37039f0[2].P(97, this.f37042i0);
                F0(true);
                if (i16 == 1) {
                    zg1 zg1Var = this.f37040g0;
                    if (zg1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(zg1Var);
                    }
                    this.f37029a.setAnimation(this.f37039f0[6]);
                    this.f37029a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f37044n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    F0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f37033c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f37046s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f37044n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f37044n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f37029a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f37029a.d();
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
                this.f37033c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f37046s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f37044n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f37044n.setImeOptions(268435461);
                this.f37044n.setInputType(33);
                this.v.setVisibility(8);
                this.f37029a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f37029a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f37033c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f37037e0.setVisibility(0);
                this.f37046s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28618a |= 256;
                    obj.f28619b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f28620c = i21;
                    valueOf.setSpan(new org.telegram.ui.Components.o01(obj, 0), indexOf, i21, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.f37034c0.e(false, false);
                this.f37047w.setVisibility(0);
                this.f37029a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f37029a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f37033c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f37046s.setVisibility(8);
                this.f37037e0.setVisibility(0);
                wh.p pVar2 = this.d;
                int i22 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                pVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i22, str));
                this.d.setVisibility(0);
                this.f37034c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final hh1 f41575b;

                    {
                        this.f41575b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f41575b.C0();
                                return;
                            case 1:
                                hh1 hh1Var = this.f41575b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yg1(hh1Var, 1));
                                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                b2Var.T = string2;
                                hh1Var.showDialog(b2Var);
                                return;
                            case 2:
                                hh1.V(this.f41575b);
                                return;
                            case 3:
                                hh1 hh1Var2 = this.f41575b;
                                if (hh1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = hh1Var2.O;
                                    if (i172 == 0) {
                                        hh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = hh1Var2.f37030a0;
                                        hh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ah1(hh1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hh1Var2.getParentActivity());
                                        alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new yg1(hh1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                                        hh1Var2.showDialog(b2Var2);
                                        TextView textView22 = (TextView) b2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        hh1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                hh1 hh1Var3 = this.f41575b;
                                if (hh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = hh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = hh1Var3.G;
                                    hh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    ac0 ac0Var = hh1Var3.f37043j0;
                                    if (ac0Var != null) {
                                        AndroidUtilities.runOnUIThread(ac0Var);
                                        hh1Var3.f37043j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f41575b.C0();
                                return;
                            default:
                                hh1 hh1Var4 = this.f41575b;
                                int i182 = hh1Var4.O;
                                hh1Var4.M = true;
                                if (hh1Var4.f37044n.getTransformationMethod() == null) {
                                    hh1Var4.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                        hh1Var4.f37039f0[3].N(-1);
                                        org.telegram.ui.Components.xi0 animatedDrawable = hh1Var4.f37029a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var2 = hh1Var4.f37039f0[3];
                                        if (animatedDrawable != xi0Var2) {
                                            hh1Var4.f37029a.setAnimation(xi0Var2);
                                            hh1Var4.f37039f0[3].L(18, false, false);
                                        }
                                        hh1Var4.f37029a.d();
                                    }
                                } else {
                                    hh1Var4.f37044n.setTransformationMethod(null);
                                    hh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && hh1Var4.f37044n.length() > 0 && hh1Var4.f37044n.hasFocus()) {
                                        hh1Var4.f37039f0[3].N(18);
                                        org.telegram.ui.Components.xi0 animatedDrawable2 = hh1Var4.f37029a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var22 = hh1Var4.f37039f0[3];
                                        if (animatedDrawable2 != xi0Var22) {
                                            hh1Var4.f37029a.setAnimation(xi0Var22);
                                        }
                                        hh1Var4.f37039f0[3].Q(0.0f, false);
                                        hh1Var4.f37029a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = hh1Var4.f37044n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                hh1Var4.M = false;
                                return;
                        }
                    }
                });
                this.f37047w.setVisibility(0);
                this.f37029a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f37029a.d();
                i14 = 1;
                break;
            case 6:
                this.f37033c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f37031b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f37029a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f37029a.d();
                i14 = 1;
                break;
            case 7:
                this.f37033c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.Y) {
                    this.f37031b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
                    this.f37031b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f37031b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f37029a.f(R.raw.wallet_allset, 160, 160, null);
                this.f37029a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f37033c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f37036e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.f37036e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20889o6, false));
                this.f37046s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f37044n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f37044n.setImeOptions(268435462);
                this.f37044n.setInputType(129);
                this.f37044n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f37044n.setTypeface(Typeface.DEFAULT);
                this.f37029a.f(R.raw.wallet_science, 120, 120, null);
                this.f37029a.d();
                i14 = 1;
                break;
            case 9:
                this.f37033c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f37031b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f37029a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f37029a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f37044n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new eh1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var != this && (n2Var instanceof hh1)) {
                ((org.telegram.ui.Components.r61) ((hh1) n2Var).f37032b0.f16730b).f29990b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f20690d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20964s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37033c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37044n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37044n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37044n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20818k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37044n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20836l6));
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
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, true)) > 0.699999988079071d) {
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
        if (this.f37029a != null) {
            int i12 = this.O;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f37029a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.aj0 aj0Var = this.f37029a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                aj0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.tr trVar = this.f37037e0;
        if (trVar != null) {
            if (!v0()) {
                i11 = 8;
            }
            trVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        zg1 zg1Var = this.f37040g0;
        if (zg1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zg1Var);
            this.f37040g0 = null;
        }
        if (this.f37039f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.xi0[] xi0VarArr = this.f37039f0;
                if (i10 >= xi0VarArr.length) {
                    break;
                }
                xi0VarArr[i10].A(false);
                i10++;
            }
            this.f37039f0 = null;
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
            if (this.f37044n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new zg1(this, 0), 200L);
            }
            de0 de0Var = this.f37047w;
            if (de0Var != null && de0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new zg1(this, 1), 200L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            de0 de0Var = this.f37047w;
            gs[] gsVarArr = de0Var.f36190f;
            if (i10 < gsVarArr.length) {
                gs gsVar = gsVarArr[i10];
                gsVar.postDelayed(new ol0(gsVar, 1), i10 * 75);
                i10++;
            } else {
                de0Var.postDelayed(new w81(19, this, runnable), (gsVarArr.length * 75) + 350);
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
        this.f37034c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f37034c0.f(true, true);
        }
    }

    public final void y0() {
        gs[] gsVarArr;
        for (gs gsVar : this.f37047w.f36190f) {
            gsVar.setText("");
            gsVar.i(1.0f);
        }
        this.f37047w.f36190f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f37047w, 8.0f, new zg1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.zc0 zc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(zc0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = a4.a.i("afterSignup", true);
            eh0 eh0Var = new eh0();
            eh0Var.l0(i10);
            presentFragment(eh0Var, true);
            return;
        }
        super.finishFragment();
    }

    public hh1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f37041h0 = new zg1(this, 2);
        this.f37042i0 = new zg1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ah1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void B0() {
    }
}
