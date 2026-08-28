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
public class ag1 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.ActionBar.l0 A;
    public boolean B;
    public int C;
    public boolean D;
    public AnimatorSet E;
    public final ArrayList F;
    public AnimatorSet G;
    public RadialProgressView H;
    public boolean I;
    public boolean J;
    public final int K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public boolean P;
    public TL_account.Password Q;
    public byte[] R;
    public long S;
    public byte[] T;
    public boolean U;
    public boolean V;
    public String W;
    public org.telegram.ui.Cells.e3 X;
    public org.telegram.ui.Components.j10 Y;
    public org.telegram.ui.Components.j21 Z;
    public org.telegram.ui.Components.pi0 f36481a;
    public org.telegram.ui.Components.kr f36482a0;
    public TextView f36483b;
    public org.telegram.ui.Components.mi0[] f36484b0;
    public TextView f36485c;
    public sf1 f36486c0;
    public dh.u d;
    public final Runnable f36487d0;
    public TextView f36488e;
    public final Runnable f36489e0;
    public TextView f36490f;
    public fb0 f36491f0;
    public TextView h;
    public EditTextBoldCursor f36492n;
    public EditTextBoldCursor f36493r;
    public org.telegram.ui.Components.fc0 f36494s;
    public org.telegram.ui.Components.fc0 v;
    public ld0 f36495w;
    public zf1 f36496x;
    public kh.h6 f36497y;

    public ag1(int i9, int i10, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.f36487d0 = new sf1(this, 2);
        this.f36489e0 = new sf1(this, 3);
        this.currentAccount = i9;
        this.K = i10;
        this.Q = password;
        this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.Q == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new tf1(this, 0), 10);
            }
        }
    }

    public static void T(ag1 ag1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = ag1Var.Q;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(ag1Var.R, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = ag1Var.Q.new_algo;
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
        eh.g gVar = new eh.g(ag1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = ag1Var.T) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = ag1Var.Q.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(ag1Var.T, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = ag1Var.S;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = ag1Var.Q.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        gVar.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(tLObject, gVar, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            gVar.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(tLObject, gVar, 10);
    }

    public static void U(ag1 ag1Var) {
        ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ih.q5(5));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        ag1Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void V(ag1 ag1Var, byte[] bArr) {
        ArrayList arrayList = ag1Var.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = ag1Var.Q;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = ag1Var.Q;
        if (bArr == null) {
            bArr = ag1Var.R;
        }
        twoStepVerificationActivity.u0(password2, bArr, ag1Var.S, ag1Var.T);
        twoStepVerificationActivity.T = ag1Var.C;
        ag1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        fb0 fb0Var = ag1Var.f36491f0;
        if (fb0Var != null) {
            AndroidUtilities.runOnUIThread(fb0Var);
            ag1Var.f36491f0 = null;
        }
    }

    public static void W(ag1 ag1Var) {
        ArrayList arrayList = ag1Var.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ag1Var.currentAccount);
        int i10 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = ag1Var.R;
        TL_account.Password password = ag1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, bArr, password.new_algo, password.new_secure_algo, password.secure_random, ag1Var.N, ag1Var.M, null, ag1Var.L);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = ag1Var.Q;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.u0(password2, ag1Var.R, ag1Var.S, ag1Var.T);
        twoStepVerificationActivity.T = ag1Var.C;
        ag1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        fb0 fb0Var = ag1Var.f36491f0;
        if (fb0Var != null) {
            AndroidUtilities.runOnUIThread(fb0Var);
            ag1Var.f36491f0 = null;
        }
    }

    public static void X(ag1 ag1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = ag1Var.Q.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        o71 o71Var = new o71(6, ag1Var, bArr2);
        TL_account.Password password = ag1Var.Q;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                o71Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(getpasswordsettings, o71Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        o71Var.run(null, tL_error2);
    }

    public static void Y(ag1 ag1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(new TL_account.getPassword(), new tf1(ag1Var, 4), 8);
            return;
        }
        ag1Var.v0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            ag1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            ag1Var.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            ag1Var.y0(ag1Var.f36494s, ag1Var.f36492n, true);
            ag1Var.G0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            ag1Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void Z(ag1 ag1Var) {
        ArrayList arrayList = ag1Var.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        ag1Var.finishFragment();
    }

    public static void a0(ag1 ag1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ag1Var.Q = password;
            if (!TwoStepVerificationActivity.h0(password, false)) {
                org.telegram.ui.Components.y4.x0(ag1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            ag1Var.P = !TextUtils.isEmpty(ag1Var.Q.email_unconfirmed_pattern);
            TwoStepVerificationActivity.l0(ag1Var.Q);
            if (!ag1Var.O && ag1Var.U) {
                TL_account.Password password2 = ag1Var.Q;
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
                    if (!ag1Var.P && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        ag1Var.finishFragment();
                    }
                }
            }
            if (ag1Var.J) {
                ag1Var.v0();
                ag1Var.B0();
            }
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        }
    }

    public static void b0(ag1 ag1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ag1Var.Q = password;
            TwoStepVerificationActivity.l0(password);
            ag1Var.D0(z10);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        }
    }

    public static void c0(ag1 ag1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = ag1Var.F;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(new TL_account.getPassword(), new kh.o3(12, ag1Var, z10), 8);
            return;
        }
        ag1Var.v0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                ag1Var.finishFragment();
            } else if (ag1Var.getParentActivity() != null) {
                if (ag1Var.Q.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(27, ag1Var, bArr));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    if (str == null && (password = ag1Var.Q) != null && password.has_password) {
                        c2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    c2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = ag1Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
                }
                TL_account.Password password2 = ag1Var.Q;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (ag1Var.U) {
                    NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                ag1 ag1Var2 = new ag1(7, ag1Var.Q);
                ag1Var2.D = ag1Var.D;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = ag1Var.R;
                }
                ag1Var2.C0(bArr3, ag1Var.S, ag1Var.T, ag1Var.V);
                ag1Var2.U = ag1Var.U;
                ag1Var2.C = ag1Var.C;
                ag1Var.presentFragment(ag1Var2, true);
                NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    ag1Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                ((org.telegram.ui.ActionBar.o2) arrayList.get(i11)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(ag1Var.currentAccount);
            int i12 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = ag1Var.Q;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = ag1Var.N;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, ag1Var.M, str2, ag1Var.L);
            TL_account.Password password4 = ag1Var.Q;
            password4.email_unconfirmed_pattern = ag1Var.N;
            ag1 ag1Var3 = new ag1(5, password4);
            ag1Var3.D = ag1Var.D;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = ag1Var.R;
            }
            ag1Var3.C0(bArr2, ag1Var.S, ag1Var.T, ag1Var.V);
            ag1Var3.U = ag1Var.U;
            ag1Var3.C = ag1Var.C;
            ag1Var.presentFragment(ag1Var3, true);
        }
    }

    public static void d0(ag1 ag1Var, TLRPC.TL_error tL_error) {
        ag1Var.v0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = ag1Var.Q;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.u0(password, ag1Var.R, ag1Var.S, ag1Var.T);
            twoStepVerificationActivity.T = ag1Var.C;
            ag1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            fb0 fb0Var = ag1Var.f36491f0;
            if (fb0Var != null) {
                AndroidUtilities.runOnUIThread(fb0Var);
                ag1Var.f36491f0 = null;
            }
        }
    }

    public static void e0(ag1 ag1Var) {
        ArrayList arrayList = ag1Var.F;
        if (ag1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rf1(ag1Var, 4));
            boolean z10 = ag1Var.Q.has_recovery;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            if (z10) {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            c2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = ag1Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        TL_account.Password password = ag1Var.Q;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        ag1 ag1Var2 = new ag1(7, password);
        ag1Var2.D = ag1Var.D;
        ag1Var2.C0(ag1Var.R, ag1Var.S, ag1Var.T, ag1Var.V);
        ag1Var2.F.addAll(arrayList);
        ag1Var2.U = ag1Var.U;
        ag1Var2.C = ag1Var.C;
        ag1Var.presentFragment(ag1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ag1Var.currentAccount);
        int i10 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = ag1Var.R;
        TL_account.Password password2 = ag1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, ag1Var.N, ag1Var.M, null, ag1Var.L);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
    }

    public static void f0(ag1 ag1Var, String str) {
        ag1 ag1Var2 = new ag1(ag1Var.currentAccount, 0, ag1Var.Q);
        ag1Var2.D = ag1Var.D;
        ag1Var2.F.addAll(ag1Var.F);
        ag1Var2.F.add(ag1Var);
        ag1Var2.W = str;
        ag1Var2.C = ag1Var.C;
        ag1Var.presentFragment(ag1Var2, true);
    }

    public static void g0(ag1 ag1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ag1Var.Q = password;
            TwoStepVerificationActivity.l0(password);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
            ag1Var.B0();
        }
    }

    public final void B0() {
        if (getParentActivity() != null) {
            int i9 = 1;
            switch (this.K) {
                case 0:
                case 1:
                    if (this.f36492n.length() == 0) {
                        y0(this.f36494s, this.f36492n, false);
                        return;
                    } else if (!this.f36492n.getText().toString().equals(this.L) && this.K == 1) {
                        AndroidUtilities.shakeViewSpring(this.f36494s, 5.0f);
                        try {
                            this.f36494s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else {
                        int i10 = this.currentAccount;
                        if (this.K != 0) {
                            i9 = 2;
                        }
                        ag1 ag1Var = new ag1(i10, i9, this.Q);
                        ag1Var.D = this.D;
                        ag1Var.L = this.f36492n.getText().toString();
                        ag1Var.C0(this.R, this.S, this.T, this.V);
                        ag1Var.W = this.W;
                        ag1Var.F.addAll(this.F);
                        ag1Var.F.add(this);
                        ag1Var.U = this.U;
                        ag1Var.C = this.C;
                        presentFragment(ag1Var);
                        return;
                    }
                case 2:
                    String obj = this.f36492n.getText().toString();
                    this.M = obj;
                    if (obj.equalsIgnoreCase(this.L)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        y0(this.f36494s, this.f36492n, false);
                        return;
                    }
                    z0();
                    return;
                case 3:
                    if (!this.V && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f36492n.getText().toString();
                    this.N = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            D0(false);
                            return;
                        }
                    }
                    y0(this.f36494s, this.f36492n, false);
                    return;
                case 4:
                    String code = this.f36495w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new o71(5, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f36495w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new tf1(this, 2), 10);
                    w0();
                    return;
                case 6:
                    TL_account.Password password = this.Q;
                    if (password == null) {
                        w0();
                        this.J = true;
                        return;
                    }
                    ag1 ag1Var2 = new ag1(this.currentAccount, 0, password);
                    ag1Var2.D = this.D;
                    ag1Var2.U = this.U;
                    ag1Var2.C = this.C;
                    presentFragment(ag1Var2, true);
                    return;
                case 7:
                    if (this.U) {
                        finishFragment();
                        return;
                    } else if (this.D) {
                        Bundle i11 = aa.d.i("afterSignup", true);
                        ng0 ng0Var = new ng0();
                        ng0Var.k0(i11);
                        presentFragment(ng0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.u0(this.Q, this.R, this.S, this.T);
                        twoStepVerificationActivity.T = this.C;
                        presentFragment(twoStepVerificationActivity, true);
                        fb0 fb0Var = this.f36491f0;
                        if (fb0Var != null) {
                            AndroidUtilities.runOnUIThread(fb0Var);
                            this.f36491f0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.Q == null) {
                        w0();
                        this.J = true;
                        return;
                    }
                    String obj3 = this.f36492n.getText().toString();
                    if (obj3.length() == 0) {
                        y0(this.f36494s, this.f36492n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    w0();
                    Utilities.globalQueue.postRunnable(new uf1(this, stringBytes, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void C0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.R = bArr;
        this.T = bArr2;
        this.S = j10;
        this.V = z10;
    }

    public final void D0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.P && this.Q.has_password) {
            w0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new tf1(this, 3));
            return;
        }
        String str = this.L;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.T = null;
            if (this.P) {
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
            if (this.M == null && (password = this.Q) != null) {
                this.M = password.hint;
            }
            if (this.M == null) {
                this.M = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.M;
                passwordinputsettings.new_algo = this.Q.new_algo;
            }
            if (this.N.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.N.trim();
            }
        }
        if (this.W != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.W;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.R;
            if (bArr == null || bArr.length == 0 || (z10 && this.P)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        w0();
        Utilities.globalQueue.postRunnable(new bg.m(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void E0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ag1.E0(boolean):void");
    }

    public final void F0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void G0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f36483b.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f36483b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.E = new AnimatorSet();
        if (z10) {
            this.f36483b.setVisibility(0);
            AnimatorSet animatorSet2 = this.E;
            TextView textView2 = this.f36488e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f36488e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f36488e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f36483b, property, 1.0f), ObjectAnimator.ofFloat(this.f36483b, property2, 1.0f), ObjectAnimator.ofFloat(this.f36483b, property3, 1.0f));
        } else {
            this.f36488e.setVisibility(0);
            AnimatorSet animatorSet3 = this.E;
            TextView textView5 = this.f36483b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f36483b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f36483b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f36488e, property4, 1.0f), ObjectAnimator.ofFloat(this.f36488e, property5, 1.0f), ObjectAnimator.ofFloat(this.f36488e, property6, 1.0f));
        }
        this.E.addListener(new n60(11, this, z10));
        this.E.setDuration(150L);
        this.E.start();
    }

    public final void H0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.C, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new rf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.f6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i14, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23305u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new yf1(this));
        int i15 = this.K;
        if (i15 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.Y = j10Var;
        this.X = new org.telegram.ui.Cells.e3(j10Var);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final ag1 f41148b;

            {
                this.f41148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41148b.B0();
                        return;
                    case 1:
                        ag1 ag1Var = this.f41148b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        return;
                    case 2:
                        ag1.U(this.f41148b);
                        return;
                    case 3:
                        ag1 ag1Var2 = this.f41148b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i16 = ag1Var2.K;
                            if (i16 == 0) {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                ag1Var2.showDialog(c2Var2);
                                TextView textView = (TextView) c2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                ag1Var2.z0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        ag1 ag1Var3 = this.f41148b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f36491f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f36491f0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41148b.B0();
                        return;
                    default:
                        ag1 ag1Var4 = this.f41148b;
                        int i17 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.f36492n.getTransformationMethod() == null) {
                            ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.f36484b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.f36481a.setAnimation(mi0Var);
                                    ag1Var4.f36484b0[3].L(18, false, false);
                                }
                                ag1Var4.f36481a.d();
                            }
                        } else {
                            ag1Var4.f36492n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.f36481a.setAnimation(mi0Var2);
                                }
                                ag1Var4.f36484b0[3].Q(0.0f, false);
                                ag1Var4.f36481a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.f36492n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.j21 j21Var = new org.telegram.ui.Components.j21(context);
        this.Z = j21Var;
        j21Var.setTransformType(1);
        this.Z.setProgress(0.0f);
        this.Z.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false));
        this.Z.setDrawBackground(false);
        this.Y.setContentDescription(LocaleController.getString(R.string.Next));
        this.Y.addView(this.Z, g7.e6.e(56, 56, 17));
        this.Y.a(this.Z);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        org.telegram.ui.Cells.e3.s2(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ag1 f41148b;

            {
                this.f41148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41148b.B0();
                        return;
                    case 1:
                        ag1 ag1Var = this.f41148b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        return;
                    case 2:
                        ag1.U(this.f41148b);
                        return;
                    case 3:
                        ag1 ag1Var2 = this.f41148b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i16 = ag1Var2.K;
                            if (i16 == 0) {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                ag1Var2.showDialog(c2Var2);
                                TextView textView2 = (TextView) c2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                ag1Var2.z0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        ag1 ag1Var3 = this.f41148b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f36491f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f36491f0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41148b.B0();
                        return;
                    default:
                        ag1 ag1Var4 = this.f41148b;
                        int i17 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.f36492n.getTransformationMethod() == null) {
                            ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.f36484b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.f36481a.setAnimation(mi0Var);
                                    ag1Var4.f36484b0[3].L(18, false, false);
                                }
                                ag1Var4.f36481a.d();
                            }
                        } else {
                            ag1Var4.f36492n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.f36481a.setAnimation(mi0Var2);
                                }
                                ag1Var4.f36484b0[3].Q(0.0f, false);
                                ag1Var4.f36481a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.f36492n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f36481a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i15 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f36481a.setVisibility(8);
        } else if (i15 != 6 && i15 != 9 && i15 != 7) {
            org.telegram.ui.Components.pi0 pi0Var = this.f36481a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            pi0Var.setVisibility(i9);
        }
        TextView textView2 = new TextView(context);
        this.f36485c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.f36485c.setGravity(1);
        this.f36485c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f36485c.setTextSize(1, 24.0f);
        dh.u uVar = new dh.u(context);
        this.d = uVar;
        int i16 = org.telegram.ui.ActionBar.f6.D6;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f36488e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.f36488e.setGravity(1);
        this.f36488e.setTextSize(1, 14.0f);
        this.f36488e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f36488e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f36488e.setVisibility(8);
        this.f36488e.setOnClickListener(new View.OnClickListener(this) {
            public final ag1 f41148b;

            {
                this.f41148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41148b.B0();
                        return;
                    case 1:
                        ag1 ag1Var = this.f41148b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        return;
                    case 2:
                        ag1.U(this.f41148b);
                        return;
                    case 3:
                        ag1 ag1Var2 = this.f41148b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i162 = ag1Var2.K;
                            if (i162 == 0) {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                return;
                            } else if (i162 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                ag1Var2.showDialog(c2Var2);
                                TextView textView22 = (TextView) c2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                            } else if (i162 == 2) {
                                ag1Var2.z0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        ag1 ag1Var3 = this.f41148b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f36491f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f36491f0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41148b.B0();
                        return;
                    default:
                        ag1 ag1Var4 = this.f41148b;
                        int i17 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.f36492n.getTransformationMethod() == null) {
                            ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.f36484b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.f36481a.setAnimation(mi0Var);
                                    ag1Var4.f36484b0[3].L(18, false, false);
                                }
                                ag1Var4.f36481a.d();
                            }
                        } else {
                            ag1Var4.f36492n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.f36481a.setAnimation(mi0Var2);
                                }
                                ag1Var4.f36484b0[3].Q(0.0f, false);
                                ag1Var4.f36481a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.f36492n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f36483b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f36483b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f36483b.setGravity(17);
        this.f36483b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        this.f36483b.setTextSize(1, 15.0f);
        this.f36483b.setTypeface(AndroidUtilities.bold());
        this.f36483b.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.f6.Oh));
        this.f36483b.setOnClickListener(new View.OnClickListener(this) {
            public final ag1 f41148b;

            {
                this.f41148b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41148b.B0();
                        return;
                    case 1:
                        ag1 ag1Var = this.f41148b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        return;
                    case 2:
                        ag1.U(this.f41148b);
                        return;
                    case 3:
                        ag1 ag1Var2 = this.f41148b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i162 = ag1Var2.K;
                            if (i162 == 0) {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                return;
                            } else if (i162 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                ag1Var2.showDialog(c2Var2);
                                TextView textView22 = (TextView) c2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                            } else if (i162 == 2) {
                                ag1Var2.z0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        ag1 ag1Var3 = this.f41148b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f36491f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f36491f0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f41148b.B0();
                        return;
                    default:
                        ag1 ag1Var4 = this.f41148b;
                        int i17 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.f36492n.getTransformationMethod() == null) {
                            ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.f36484b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.f36481a.setAnimation(mi0Var);
                                    ag1Var4.f36484b0[3].L(18, false, false);
                                }
                                ag1Var4.f36481a.d();
                            }
                        } else {
                            ag1Var4.f36492n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i17 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                ag1Var4.f36484b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.f36481a.setAnimation(mi0Var2);
                                }
                                ag1Var4.f36484b0[3].Q(0.0f, false);
                                ag1Var4.f36481a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.f36492n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        return;
                }
            }
        });
        if (i15 != 6 && i15 != 7 && i15 != 9) {
            this.f36485c.setTypeface(AndroidUtilities.bold());
            this.f36485c.setTextSize(1, 18.0f);
        } else {
            this.f36485c.setTypeface(Typeface.DEFAULT);
            this.f36485c.setTextSize(1, 24.0f);
        }
        switch (i15) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                m0 m0Var = new m0(this, context, 26);
                org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(this, context, m0Var, 2);
                e90Var.addView(m0Var);
                p9 p9Var = new p9(this, context, e90Var);
                zf1 zf1Var = new zf1(this, context);
                this.f36496x = zf1Var;
                zf1Var.setVerticalScrollBarEnabled(false);
                m0Var.addView(this.f36496x, g7.e6.c(-1.0f, -1));
                m0Var.addView(this.h, g7.e6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                m0Var.addView(this.Y, org.telegram.ui.Components.j10.b());
                p9Var.addView(e90Var, g7.e6.c(-1.0f, -1));
                ta1 ta1Var = new ta1(this, context, 16);
                ta1Var.setOrientation(1);
                this.f36496x.addView(ta1Var, g7.e6.x(-1, -1, 51));
                ta1Var.addView(this.f36481a, g7.e6.t(-2, -2, 49, 0, 69, 0, 0));
                ta1Var.addView(this.f36485c, g7.e6.t(-2, -2, 49, 0, 8, 0, 0));
                ta1Var.addView(this.d, g7.e6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
                this.f36494s = fc0Var;
                fc0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f36492n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f36492n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f36492n;
                int i17 = org.telegram.ui.ActionBar.f6.f23144l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
                this.f36492n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                this.f36492n.setBackground(null);
                this.f36492n.setMaxLines(1);
                this.f36492n.setLines(1);
                this.f36492n.setGravity(3);
                this.f36492n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f36492n.setSingleLine(true);
                this.f36492n.setCursorWidth(1.5f);
                this.f36492n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final ag1 f41508b;

                    {
                        this.f41508b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i18, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                ag1 ag1Var = this.f41508b;
                                ag1Var.getClass();
                                if (i18 != 5 && i18 != 6) {
                                    return false;
                                }
                                ag1Var.B0();
                                return true;
                            default:
                                ag1 ag1Var2 = this.f41508b;
                                ag1Var2.getClass();
                                if (i18 != 5 && i18 != 6) {
                                    return false;
                                }
                                if (ag1Var2.v.getVisibility() == 0) {
                                    ag1Var2.f36493r.requestFocus();
                                } else {
                                    ag1Var2.B0();
                                }
                                return true;
                        }
                    }
                });
                this.f36494s.e(this.f36492n);
                this.f36492n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final ag1 f41790b;

                    {
                        this.f41790b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.fc0 fc0Var2 = this.f41790b.v;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                fc0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                ag1 ag1Var = this.f41790b;
                                if (z11) {
                                    ag1Var.f36482a0.setEditText((EditText) view);
                                    ag1Var.f36482a0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                ag1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.fc0 fc0Var3 = this.f41790b.f36494s;
                                if (z11) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                fc0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f36492n, g7.e6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, context, 3);
                this.A = l0Var;
                l0Var.setImageResource(R.drawable.msg_message);
                this.A.setScaleType(scaleType);
                this.A.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.A.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 1, -1));
                this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                this.A.setOnClickListener(new View.OnClickListener(this) {
                    public final ag1 f41148b;

                    {
                        this.f41148b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f41148b.B0();
                                return;
                            case 1:
                                ag1 ag1Var = this.f41148b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                c2Var.P = string;
                                ag1Var.showDialog(c2Var);
                                return;
                            case 2:
                                ag1.U(this.f41148b);
                                return;
                            case 3:
                                ag1 ag1Var2 = this.f41148b;
                                if (ag1Var2.h.getAlpha() >= 0.5f) {
                                    int i162 = ag1Var2.K;
                                    if (i162 == 0) {
                                        ag1Var2.w0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = ag1Var2.W;
                                        ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                        ag1Var2.showDialog(c2Var2);
                                        TextView textView22 = (TextView) c2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        ag1Var2.z0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                ag1 ag1Var3 = this.f41148b;
                                if (ag1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = ag1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = ag1Var3.C;
                                    ag1Var3.presentFragment(twoStepVerificationActivity, true);
                                    fb0 fb0Var = ag1Var3.f36491f0;
                                    if (fb0Var != null) {
                                        AndroidUtilities.runOnUIThread(fb0Var);
                                        ag1Var3.f36491f0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f41148b.B0();
                                return;
                            default:
                                ag1 ag1Var4 = this.f41148b;
                                int i172 = ag1Var4.K;
                                ag1Var4.I = true;
                                if (ag1Var4.f36492n.getTransformationMethod() == null) {
                                    ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i172 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                        ag1Var4.f36484b0[3].N(-1);
                                        org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var = ag1Var4.f36484b0[3];
                                        if (animatedDrawable != mi0Var) {
                                            ag1Var4.f36481a.setAnimation(mi0Var);
                                            ag1Var4.f36484b0[3].L(18, false, false);
                                        }
                                        ag1Var4.f36481a.d();
                                    }
                                } else {
                                    ag1Var4.f36492n.setTransformationMethod(null);
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i172 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                        ag1Var4.f36484b0[3].N(18);
                                        org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                        if (animatedDrawable2 != mi0Var2) {
                                            ag1Var4.f36481a.setAnimation(mi0Var2);
                                        }
                                        ag1Var4.f36484b0[3].Q(0.0f, false);
                                        ag1Var4.f36481a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = ag1Var4.f36492n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                ag1Var4.I = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.A, g7.e6.t(24, 24, 16, 0, 0, 16, 0));
                this.f36492n.addTextChangedListener(new xf1(this, 2));
                this.f36494s.addView(linearLayout, g7.e6.c(-2.0f, -1));
                ta1Var.addView(this.f36494s, g7.e6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.fc0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f36493r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f36493r.setPadding(dp2, dp2, dp2, dp2);
                this.f36493r.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
                this.f36493r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                this.f36493r.setBackground(null);
                this.f36493r.setMaxLines(1);
                this.f36493r.setLines(1);
                this.f36493r.setGravity(3);
                this.f36493r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f36493r.setSingleLine(true);
                this.f36493r.setCursorWidth(1.5f);
                this.f36493r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final ag1 f41508b;

                    {
                        this.f41508b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i18, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                ag1 ag1Var = this.f41508b;
                                ag1Var.getClass();
                                if (i18 != 5 && i18 != 6) {
                                    return false;
                                }
                                ag1Var.B0();
                                return true;
                            default:
                                ag1 ag1Var2 = this.f41508b;
                                ag1Var2.getClass();
                                if (i18 != 5 && i18 != 6) {
                                    return false;
                                }
                                if (ag1Var2.v.getVisibility() == 0) {
                                    ag1Var2.f36493r.requestFocus();
                                } else {
                                    ag1Var2.B0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f36493r);
                this.f36493r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final ag1 f41790b;

                    {
                        this.f41790b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.fc0 fc0Var2 = this.f41790b.v;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                fc0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                ag1 ag1Var = this.f41790b;
                                if (z11) {
                                    ag1Var.f36482a0.setEditText((EditText) view);
                                    ag1Var.f36482a0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                ag1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.fc0 fc0Var3 = this.f41790b.f36494s;
                                if (z11) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                fc0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f36493r, g7.e6.c(-2.0f, -1));
                ta1Var.addView(this.v, g7.e6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.kr krVar = new org.telegram.ui.Components.kr(context);
                this.f36482a0 = krVar;
                krVar.setVisibility(8);
                e90Var.addView(this.f36482a0);
                ld0 ld0Var = new ld0(this, context, 3);
                this.f36495w = ld0Var;
                final int i18 = 1;
                ld0Var.b(6, 1);
                vr[] vrVarArr = this.f36495w.f42755f;
                int length = vrVarArr.length;
                int i19 = 0;
                while (i19 < length) {
                    vr vrVar = vrVarArr[i19];
                    vrVar.setShowSoftInputOnFocusCompat(u0() ^ i18);
                    vrVar.addTextChangedListener(new xf1(this, 0));
                    vrVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final ag1 f41790b;

                        {
                            this.f41790b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f10;
                            float f11;
                            switch (i18) {
                                case 0:
                                    org.telegram.ui.Components.fc0 fc0Var2 = this.f41790b.v;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    fc0Var2.b(f10, f10, true);
                                    return;
                                case 1:
                                    ag1 ag1Var = this.f41790b;
                                    if (z11) {
                                        ag1Var.f36482a0.setEditText((EditText) view);
                                        ag1Var.f36482a0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    ag1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.fc0 fc0Var3 = this.f41790b.f36494s;
                                    if (z11) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    fc0Var3.b(f11, f11, true);
                                    return;
                            }
                        }
                    });
                    i19++;
                    i18 = 1;
                }
                this.f36495w.setVisibility(8);
                ta1Var.addView(this.f36495w, g7.e6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                ta1Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f36488e, g7.e6.e(-2, -2, 49));
                if (i15 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f36490f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
                    this.f36490f.setGravity(1);
                    this.f36490f.setTextSize(1, 14.0f);
                    this.f36490f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f36490f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f36490f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    ta1Var.addView(this.f36490f, g7.e6.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f36490f.setOnClickListener(new View.OnClickListener(this) {
                        public final ag1 f41148b;

                        {
                            this.f41148b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41148b.B0();
                                    return;
                                case 1:
                                    ag1 ag1Var = this.f41148b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                    c2Var.P = string;
                                    ag1Var.showDialog(c2Var);
                                    return;
                                case 2:
                                    ag1.U(this.f41148b);
                                    return;
                                case 3:
                                    ag1 ag1Var2 = this.f41148b;
                                    if (ag1Var2.h.getAlpha() >= 0.5f) {
                                        int i162 = ag1Var2.K;
                                        if (i162 == 0) {
                                            ag1Var2.w0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = ag1Var2.W;
                                            ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                            return;
                                        } else if (i162 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                            ag1Var2.showDialog(c2Var2);
                                            TextView textView22 = (TextView) c2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                                return;
                                            }
                                            return;
                                        } else if (i162 == 2) {
                                            ag1Var2.z0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    ag1 ag1Var3 = this.f41148b;
                                    if (ag1Var3.K == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.S = true;
                                        twoStepVerificationActivity.E = ag1Var3.Q;
                                        twoStepVerificationActivity.F = false;
                                        twoStepVerificationActivity.T = ag1Var3.C;
                                        ag1Var3.presentFragment(twoStepVerificationActivity, true);
                                        fb0 fb0Var = ag1Var3.f36491f0;
                                        if (fb0Var != null) {
                                            AndroidUtilities.runOnUIThread(fb0Var);
                                            ag1Var3.f36491f0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f41148b.B0();
                                    return;
                                default:
                                    ag1 ag1Var4 = this.f41148b;
                                    int i172 = ag1Var4.K;
                                    ag1Var4.I = true;
                                    if (ag1Var4.f36492n.getTransformationMethod() == null) {
                                        ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i172 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                            ag1Var4.f36484b0[3].N(-1);
                                            org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                            org.telegram.ui.Components.mi0 mi0Var = ag1Var4.f36484b0[3];
                                            if (animatedDrawable != mi0Var) {
                                                ag1Var4.f36481a.setAnimation(mi0Var);
                                                ag1Var4.f36484b0[3].L(18, false, false);
                                            }
                                            ag1Var4.f36481a.d();
                                        }
                                    } else {
                                        ag1Var4.f36492n.setTransformationMethod(null);
                                        ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i172 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                            ag1Var4.f36484b0[3].N(18);
                                            org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                            org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                            if (animatedDrawable2 != mi0Var2) {
                                                ag1Var4.f36481a.setAnimation(mi0Var2);
                                            }
                                            ag1Var4.f36484b0[3].Q(0.0f, false);
                                            ag1Var4.f36481a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = ag1Var4.f36492n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    ag1Var4.I = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = p9Var;
                kh.h6 h6Var = new kh.h6(this, context);
                this.f36497y = h6Var;
                h6Var.setAlpha(0.0f);
                p9Var.addView(this.f36497y);
                p9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.H = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.H.setAlpha(0.0f);
                this.H.setScaleX(0.1f);
                this.H.setScaleY(0.1f);
                this.H.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false));
                m0Var.addView(this.H, g7.e6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new jh.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.f36481a);
                fVar.addView(this.f36485c);
                fVar.addView(this.d);
                fVar.addView(this.f36483b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        String str = "";
        switch (i15) {
            case 0:
            case 1:
                if (this.Q.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f36485c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i15 == 0) {
                        i10 = R.string.CreatePassword;
                    } else {
                        i10 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i10);
                    this.actionBar.setTitle(string);
                    this.f36485c.setText(string);
                }
                if (!TextUtils.isEmpty(this.W)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.fc0 fc0Var2 = this.f36494s;
                if (i15 == 0) {
                    i11 = R.string.EnterPassword;
                } else {
                    i11 = R.string.ReEnterPassword;
                }
                fc0Var2.setText(LocaleController.getString(i11));
                EditTextBoldCursor editTextBoldCursor4 = this.f36492n;
                if (i15 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i12));
                this.f36492n.setImeOptions(268435461);
                this.f36492n.setInputType(129);
                this.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f36492n.setTypeface(Typeface.DEFAULT);
                if (i15 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.B = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                org.telegram.ui.Components.mi0[] mi0VarArr = new org.telegram.ui.Components.mi0[7];
                this.f36484b0 = mi0VarArr;
                mi0VarArr[0] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_idle1, "" + R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36484b0[1] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_idle2, "" + R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36484b0[2] = new org.telegram.ui.Components.mi0(R.raw.tsv_monkey_close, "" + R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36484b0[3] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_peek, "" + R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36484b0[4] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, "" + R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36484b0[5] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_close_and_peek, "" + R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36484b0[6] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_tracking, "" + R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.mi0 mi0Var = this.f36484b0[6];
                mi0Var.h = true;
                mi0Var.N(19);
                this.f36484b0[2].P(97, this.f36489e0);
                E0(true);
                if (i15 == 1) {
                    sf1 sf1Var = this.f36486c0;
                    if (sf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(sf1Var);
                    }
                    this.f36481a.setAnimation(this.f36484b0[6]);
                    this.f36481a.d();
                    i13 = 1;
                    break;
                } else {
                    this.f36492n.dispatchTextWatchersTextChanged();
                    i13 = 1;
                    E0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f36485c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f36494s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f36492n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f36492n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f36481a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.V) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.f36485c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f36494s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f36492n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f36492n.setImeOptions(268435461);
                this.f36492n.setInputType(33);
                this.v.setVisibility(8);
                this.f36481a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f36485c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f36482a0.setVisibility(0);
                this.f36494s.setVisibility(8);
                String str2 = this.Q.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f34062a |= 256;
                    obj.f34063b = indexOf;
                    int i20 = lastIndexOf + 1;
                    obj.f34064c = i20;
                    valueOf.setSpan(new org.telegram.ui.Components.wz0(obj, 0), indexOf, i20, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.Y.e(false, false);
                this.f36495w.setVisibility(0);
                this.f36481a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f36485c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f36494s.setVisibility(8);
                this.f36482a0.setVisibility(0);
                dh.u uVar2 = this.d;
                int i21 = R.string.EmailPasswordConfirmText2;
                String str3 = this.Q.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                uVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i21, str));
                this.d.setVisibility(0);
                this.Y.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final ag1 f41148b;

                    {
                        this.f41148b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f41148b.B0();
                                return;
                            case 1:
                                ag1 ag1Var = this.f41148b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                c2Var.P = string2;
                                ag1Var.showDialog(c2Var);
                                return;
                            case 2:
                                ag1.U(this.f41148b);
                                return;
                            case 3:
                                ag1 ag1Var2 = this.f41148b;
                                if (ag1Var2.h.getAlpha() >= 0.5f) {
                                    int i162 = ag1Var2.K;
                                    if (i162 == 0) {
                                        ag1Var2.w0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = ag1Var2.W;
                                        ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                        ag1Var2.showDialog(c2Var2);
                                        TextView textView22 = (TextView) c2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        ag1Var2.z0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                ag1 ag1Var3 = this.f41148b;
                                if (ag1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = ag1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = ag1Var3.C;
                                    ag1Var3.presentFragment(twoStepVerificationActivity, true);
                                    fb0 fb0Var = ag1Var3.f36491f0;
                                    if (fb0Var != null) {
                                        AndroidUtilities.runOnUIThread(fb0Var);
                                        ag1Var3.f36491f0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f41148b.B0();
                                return;
                            default:
                                ag1 ag1Var4 = this.f41148b;
                                int i172 = ag1Var4.K;
                                ag1Var4.I = true;
                                if (ag1Var4.f36492n.getTransformationMethod() == null) {
                                    ag1Var4.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i172 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                        ag1Var4.f36484b0[3].N(-1);
                                        org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.f36481a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.f36484b0[3];
                                        if (animatedDrawable != mi0Var2) {
                                            ag1Var4.f36481a.setAnimation(mi0Var2);
                                            ag1Var4.f36484b0[3].L(18, false, false);
                                        }
                                        ag1Var4.f36481a.d();
                                    }
                                } else {
                                    ag1Var4.f36492n.setTransformationMethod(null);
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i172 == 0 && ag1Var4.f36492n.length() > 0 && ag1Var4.f36492n.hasFocus()) {
                                        ag1Var4.f36484b0[3].N(18);
                                        org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.f36481a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var22 = ag1Var4.f36484b0[3];
                                        if (animatedDrawable2 != mi0Var22) {
                                            ag1Var4.f36481a.setAnimation(mi0Var22);
                                        }
                                        ag1Var4.f36484b0[3].Q(0.0f, false);
                                        ag1Var4.f36481a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = ag1Var4.f36492n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                ag1Var4.I = false;
                                return;
                        }
                    }
                });
                this.f36495w.setVisibility(0);
                this.f36481a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 6:
                this.f36485c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f36483b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f36481a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 7:
                this.f36485c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.U) {
                    this.f36483b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.D) {
                    this.f36483b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f36483b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f36481a.f(R.raw.wallet_allset, 160, 160, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f36485c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f36488e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.f36488e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.o6, false));
                this.f36494s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f36492n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f36492n.setImeOptions(268435462);
                this.f36492n.setInputType(129);
                this.f36492n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f36492n.setTypeface(Typeface.DEFAULT);
                this.f36481a.f(R.raw.wallet_science, 120, 120, null);
                this.f36481a.d();
                i13 = 1;
                break;
            case 9:
                this.f36485c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f36483b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f36481a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f36481a.d();
                i13 = 1;
                break;
            default:
                i13 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f36492n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new xf1(this, i13));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
            if (o2Var != this && (o2Var instanceof ag1)) {
                ((org.telegram.ui.Components.v51) ((ag1) o2Var).X.f24286b).f33267b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36485c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36492n, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36492n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36492n, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36492n, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i9 = this.K;
        if (i9 != 7 && i9 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.C >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.C >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z10) {
                H0();
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
        int i9;
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        if (this.f36481a != null) {
            int i11 = this.K;
            if (i11 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f36481a.setVisibility(8);
            } else if (i11 != 6 && i11 != 9 && i11 != 7) {
                org.telegram.ui.Components.pi0 pi0Var = this.f36481a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i9 = 8;
                } else {
                    i9 = 0;
                }
                pi0Var.setVisibility(i9);
            }
        }
        org.telegram.ui.Components.kr krVar = this.f36482a0;
        if (krVar != null) {
            if (!u0()) {
                i10 = 8;
            }
            krVar.setVisibility(i10);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.J = false;
        sf1 sf1Var = this.f36486c0;
        if (sf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sf1Var);
            this.f36486c0 = null;
        }
        if (this.f36484b0 != null) {
            int i9 = 0;
            while (true) {
                org.telegram.ui.Components.mi0[] mi0VarArr = this.f36484b0;
                if (i9 >= mi0VarArr.length) {
                    break;
                }
                mi0VarArr[i9].A(false);
                i9++;
            }
            this.f36484b0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (u0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.O = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.O = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (u0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f36492n != null && !u0()) {
                AndroidUtilities.runOnUIThread(new sf1(this, 0), 200L);
            }
            ld0 ld0Var = this.f36495w;
            if (ld0Var != null && ld0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new sf1(this, 1), 200L);
            }
        }
    }

    public final void t0(Runnable runnable) {
        int i9 = 0;
        while (true) {
            ld0 ld0Var = this.f36495w;
            vr[] vrVarArr = ld0Var.f42755f;
            if (i9 < vrVarArr.length) {
                vr vrVar = vrVarArr[i9];
                vrVar.postDelayed(new wk0(vrVar, 1), i9 * 75);
                i9++;
            } else {
                ld0Var.postDelayed(new n21(25, this, runnable), (vrVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean u0() {
        int i9 = this.K;
        if ((i9 == 5 || i9 == 4) && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v0() {
        this.Y.f(false, true);
    }

    public final void w0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.Y.f(true, true);
        }
    }

    public final void x0() {
        vr[] vrVarArr;
        for (vr vrVar : this.f36495w.f42755f) {
            vrVar.setText("");
            vrVar.i(1.0f);
        }
        this.f36495w.f42755f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f36495w, 8.0f, new sf1(this, 6));
    }

    public final void y0(org.telegram.ui.Components.fc0 fc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(fc0Var, 5.0f);
    }

    public final void z0() {
        TL_account.Password password = this.Q;
        if (!password.has_recovery) {
            ag1 ag1Var = new ag1(this.currentAccount, 3, password);
            ag1Var.D = this.D;
            ag1Var.C0(this.R, this.S, this.T, this.V);
            ag1Var.L = this.L;
            ag1Var.M = this.M;
            ag1Var.F.addAll(this.F);
            ag1Var.F.add(this);
            ag1Var.U = this.U;
            ag1Var.C = this.C;
            presentFragment(ag1Var);
            return;
        }
        this.N = "";
        D0(false);
    }

    @Override
    public final void finishFragment() {
        if (this.C >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i9 = aa.d.i("afterSignup", true);
            ng0 ng0Var = new ng0();
            ng0Var.k0(i9);
            presentFragment(ng0Var, true);
            return;
        }
        super.finishFragment();
    }

    public ag1(int i9, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.f36487d0 = new sf1(this, 2);
        this.f36489e0 = new sf1(this, 3);
        this.K = i9;
        this.Q = password;
        if (password == null && (i9 == 6 || i9 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new tf1(this, 0), 10);
            return;
        }
        this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void A0() {
    }
}
