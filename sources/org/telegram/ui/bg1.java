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
public class bg1 extends org.telegram.ui.ActionBar.o2 {
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
    public org.telegram.ui.Components.bk0 f36080a;
    public String f36081a0;
    public TextView f36082b;
    public m.g3 f36083b0;
    public TextView f36084c;
    public org.telegram.ui.Components.h20 f36085c0;
    public wh.n d;
    public org.telegram.ui.Components.f41 f36086d0;
    public TextView e;
    public org.telegram.ui.Components.fs f36087e0;
    public TextView f36088f;
    public org.telegram.ui.Components.yj0[] f36089f0;
    public tf1 f36090g0;
    public TextView h;
    public final Runnable f36091h0;
    public final Runnable f36092i0;
    public kb0 f36093j0;
    public EditTextBoldCursor f36094n;
    public EditTextBoldCursor f36095r;
    public org.telegram.ui.Components.vd0 f36096s;
    public org.telegram.ui.Components.vd0 v;
    public od0 f36097w;
    public ag1 f36098x;
    public ei.g6 f36099y;

    public bg1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f36091h0 = new tf1(this, 2);
        this.f36092i0 = new tf1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new uf1(this, 0), 10);
            }
        }
    }

    public static void U(bg1 bg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = bg1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(bg1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = bg1Var.U.new_algo;
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
        ig.n0 n0Var = new ig.n0(bg1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = bg1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = bg1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(bg1Var.X, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = bg1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = bg1Var.U.new_algo;
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
                ConnectionsManager.getInstance(bg1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            n0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(bg1Var.currentAccount).sendRequest(tLObject, n0Var, 10);
    }

    public static void V(bg1 bg1Var) {
        ConnectionsManager.getInstance(bg1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ci.d6(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        bg1Var.showDialog(alertDialog$Builder.f20678a);
    }

    public static void W(bg1 bg1Var, byte[] bArr) {
        ArrayList arrayList = bg1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = bg1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = bg1Var.U;
        if (bArr == null) {
            bArr = bg1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, bg1Var.W, bg1Var.X);
        twoStepVerificationActivity.X = bg1Var.G;
        bg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
        kb0 kb0Var = bg1Var.f36093j0;
        if (kb0Var != null) {
            AndroidUtilities.runOnUIThread(kb0Var);
            bg1Var.f36093j0 = null;
        }
    }

    public static void X(bg1 bg1Var) {
        ArrayList arrayList = bg1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(bg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = bg1Var.V;
        TL_account.Password password = bg1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, bg1Var.R, bg1Var.Q, null, bg1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = bg1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, bg1Var.V, bg1Var.W, bg1Var.X);
        twoStepVerificationActivity.X = bg1Var.G;
        bg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
        kb0 kb0Var = bg1Var.f36093j0;
        if (kb0Var != null) {
            AndroidUtilities.runOnUIThread(kb0Var);
            bg1Var.f36093j0 = null;
        }
    }

    public static void Y(bg1 bg1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = bg1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        q71 q71Var = new q71(6, bg1Var, bArr2);
        TL_account.Password password = bg1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                q71Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(bg1Var.currentAccount).sendRequest(getpasswordsettings, q71Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        q71Var.run(null, tL_error2);
    }

    public static void Z(bg1 bg1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new uf1(bg1Var, 4), 8);
            return;
        }
        bg1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            bg1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            org.telegram.ui.ActionBar.r6.W(bg1Var.d, org.telegram.ui.ActionBar.k6.f21404p7, null);
            bg1Var.z0(bg1Var.f36096s, bg1Var.f36094n, true);
            bg1Var.H0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            bg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            bg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(bg1 bg1Var) {
        ArrayList arrayList = bg1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        bg1Var.finishFragment();
    }

    public static void b0(bg1 bg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bg1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.f5.x0(bg1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            bg1Var.T = !TextUtils.isEmpty(bg1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(bg1Var.U);
            if (!bg1Var.S && bg1Var.Y) {
                TL_account.Password password2 = bg1Var.U;
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
                    if (!bg1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        bg1Var.finishFragment();
                    }
                }
            }
            if (bg1Var.N) {
                bg1Var.w0();
                bg1Var.C0();
            }
            NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
        }
    }

    public static void c0(bg1 bg1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bg1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            bg1Var.E0(z10);
            NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
        }
    }

    public static void d0(bg1 bg1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = bg1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ei.o3(12, bg1Var, z10), 8);
            return;
        }
        bg1Var.w0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            bg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                bg1Var.finishFragment();
            } else if (bg1Var.getParentActivity() != null) {
                if (bg1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ql0(25, bg1Var, bArr));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    if (str == null && (password = bg1Var.U) != null && password.has_password) {
                        c2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    c2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = bg1Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((org.telegram.ui.ActionBar.o2) arrayList.get(i11)).removeSelfFromStack();
                }
                TL_account.Password password2 = bg1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (bg1Var.Y) {
                    NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                bg1 bg1Var2 = new bg1(7, bg1Var.U);
                bg1Var2.H = bg1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = bg1Var.V;
                }
                bg1Var2.D0(bArr3, bg1Var.W, bg1Var.X, bg1Var.Z);
                bg1Var2.Y = bg1Var.Y;
                bg1Var2.G = bg1Var.G;
                bg1Var.presentFragment(bg1Var2, true);
                NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    bg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    bg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.EmailNotAllowed));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    bg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    bg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.o2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(bg1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = bg1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = bg1Var.R;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, bg1Var.Q, str2, bg1Var.P);
            TL_account.Password password4 = bg1Var.U;
            password4.email_unconfirmed_pattern = bg1Var.R;
            bg1 bg1Var3 = new bg1(5, password4);
            bg1Var3.H = bg1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = bg1Var.V;
            }
            bg1Var3.D0(bArr2, bg1Var.W, bg1Var.X, bg1Var.Z);
            bg1Var3.Y = bg1Var.Y;
            bg1Var3.G = bg1Var.G;
            bg1Var.presentFragment(bg1Var3, true);
        }
    }

    public static void e0(bg1 bg1Var, TLRPC.TL_error tL_error) {
        bg1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = bg1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, bg1Var.V, bg1Var.W, bg1Var.X);
            twoStepVerificationActivity.X = bg1Var.G;
            bg1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            kb0 kb0Var = bg1Var.f36093j0;
            if (kb0Var != null) {
                AndroidUtilities.runOnUIThread(kb0Var);
                bg1Var.f36093j0 = null;
            }
        }
    }

    public static void f0(bg1 bg1Var) {
        ArrayList arrayList = bg1Var.J;
        if (bg1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new sf1(bg1Var, 4));
            boolean z10 = bg1Var.U.has_recovery;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            if (z10) {
                c2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                c2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            c2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = bg1Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = bg1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        bg1 bg1Var2 = new bg1(7, password);
        bg1Var2.H = bg1Var.H;
        bg1Var2.D0(bg1Var.V, bg1Var.W, bg1Var.X, bg1Var.Z);
        bg1Var2.J.addAll(arrayList);
        bg1Var2.Y = bg1Var.Y;
        bg1Var2.G = bg1Var.G;
        bg1Var.presentFragment(bg1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(bg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = bg1Var.V;
        TL_account.Password password2 = bg1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, bg1Var.R, bg1Var.Q, null, bg1Var.P);
        NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
    }

    public static void g0(bg1 bg1Var, String str) {
        bg1 bg1Var2 = new bg1(bg1Var.currentAccount, 0, bg1Var.U);
        bg1Var2.H = bg1Var.H;
        bg1Var2.J.addAll(bg1Var.J);
        bg1Var2.J.add(bg1Var);
        bg1Var2.f36081a0 = str;
        bg1Var2.G = bg1Var.G;
        bg1Var.presentFragment(bg1Var2, true);
    }

    public static void h0(bg1 bg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            bg1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(bg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, bg1Var.U);
            bg1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            bg1 bg1Var = new bg1(this.currentAccount, 3, password);
            bg1Var.H = this.H;
            bg1Var.D0(this.V, this.W, this.X, this.Z);
            bg1Var.P = this.P;
            bg1Var.Q = this.Q;
            bg1Var.J.addAll(this.J);
            bg1Var.J.add(this);
            bg1Var.Y = this.Y;
            bg1Var.G = this.G;
            presentFragment(bg1Var);
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
                    if (this.f36094n.length() == 0) {
                        z0(this.f36096s, this.f36094n, false);
                        return;
                    } else if (!this.f36094n.getText().toString().equals(this.P) && this.O == 1) {
                        AndroidUtilities.shakeViewSpring(this.f36096s, 5.0f);
                        try {
                            this.f36096s.performHapticFeedback(3, 2);
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
                        bg1 bg1Var = new bg1(i11, i10, this.U);
                        bg1Var.H = this.H;
                        bg1Var.P = this.f36094n.getText().toString();
                        bg1Var.D0(this.V, this.W, this.X, this.Z);
                        bg1Var.f36081a0 = this.f36081a0;
                        bg1Var.J.addAll(this.J);
                        bg1Var.J.add(this);
                        bg1Var.Y = this.Y;
                        bg1Var.G = this.G;
                        presentFragment(bg1Var);
                        return;
                    }
                case 2:
                    String obj = this.f36094n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        z0(this.f36096s, this.f36094n, false);
                        return;
                    }
                    A0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f36094n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            E0(false);
                            return;
                        }
                    }
                    z0(this.f36096s, this.f36094n, false);
                    return;
                case 4:
                    String code = this.f36097w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new q71(5, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f36097w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new uf1(this, 2), 10);
                    x0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    bg1 bg1Var2 = new bg1(this.currentAccount, 0, password);
                    bg1Var2.H = this.H;
                    bg1Var2.Y = this.Y;
                    bg1Var2.G = this.G;
                    presentFragment(bg1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle h = a1.g.h("afterSignup", true);
                        rg0 rg0Var = new rg0();
                        rg0Var.l0(h);
                        presentFragment(rg0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        kb0 kb0Var = this.f36093j0;
                        if (kb0Var != null) {
                            AndroidUtilities.runOnUIThread(kb0Var);
                            this.f36093j0 = null;
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
                    String obj3 = this.f36094n.getText().toString();
                    if (obj3.length() == 0) {
                        z0(this.f36096s, this.f36094n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    x0();
                    Utilities.globalQueue.postRunnable(new vf1(this, stringBytes, 0));
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new uf1(this, 3));
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
        if (this.f36081a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f36081a0;
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
        Utilities.globalQueue.postRunnable(new ei.s1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void F0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bg1.F0(boolean):void");
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = str;
        c2Var.T = str2;
        showDialog(c2Var);
    }

    public final void H0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f36082b.getTag() != null) {
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
        TextView textView = this.f36082b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f36082b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f36082b, property, 1.0f), ObjectAnimator.ofFloat(this.f36082b, property2, 1.0f), ObjectAnimator.ofFloat(this.f36082b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f36082b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f36082b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f36082b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.I.addListener(new o40(12, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new sf1(this, 0));
        org.telegram.ui.ActionBar.r6.W((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.f21421q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        ?? r13;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i15, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i15, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21501u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new zf1(this));
        int i16 = this.O;
        if (i16 == 5) {
            this.actionBar.m().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f36085c0 = h20Var;
        this.f36083b0 = new m.g3(h20Var);
        this.f36085c0.setOnClickListener(new View.OnClickListener(this) {
            public final bg1 f40473b;

            {
                this.f40473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40473b.C0();
                        return;
                    case 1:
                        bg1 bg1Var = this.f40473b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.T = string;
                        bg1Var.showDialog(c2Var);
                        return;
                    case 2:
                        bg1.V(this.f40473b);
                        return;
                    case 3:
                        bg1 bg1Var2 = this.f40473b;
                        if (bg1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = bg1Var2.O;
                            if (i17 == 0) {
                                bg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                bg1Var2.showDialog(c2Var2);
                                TextView textView = (TextView) c2Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                bg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        bg1 bg1Var3 = this.f40473b;
                        if (bg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bg1Var3.G;
                            bg1Var3.presentFragment(twoStepVerificationActivity, true);
                            kb0 kb0Var = bg1Var3.f36093j0;
                            if (kb0Var != null) {
                                AndroidUtilities.runOnUIThread(kb0Var);
                                bg1Var3.f36093j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f40473b.C0();
                        return;
                    default:
                        bg1 bg1Var4 = this.f40473b;
                        int i18 = bg1Var4.O;
                        bg1Var4.M = true;
                        if (bg1Var4.f36094n.getTransformationMethod() == null) {
                            bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = bg1Var4.f36089f0[3];
                                if (animatedDrawable != yj0Var) {
                                    bg1Var4.f36080a.setAnimation(yj0Var);
                                    bg1Var4.f36089f0[3].N(18, false, false);
                                }
                                bg1Var4.f36080a.d();
                            }
                        } else {
                            bg1Var4.f36094n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    bg1Var4.f36080a.setAnimation(yj0Var2);
                                }
                                bg1Var4.f36089f0[3].T(0.0f, false);
                                bg1Var4.f36080a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bg1Var4.f36094n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bg1Var4.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(context);
        this.f36086d0 = f41Var;
        f41Var.setTransformType(1);
        this.f36086d0.setProgress(0.0f);
        this.f36086d0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.f36086d0.setDrawBackground(false);
        this.f36085c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.f36085c0.addView(this.f36086d0, w7.z5.e(56, 56, 17));
        this.f36085c0.a(this.f36086d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21386o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        m.g3.p(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final bg1 f40473b;

            {
                this.f40473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40473b.C0();
                        return;
                    case 1:
                        bg1 bg1Var = this.f40473b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.T = string;
                        bg1Var.showDialog(c2Var);
                        return;
                    case 2:
                        bg1.V(this.f40473b);
                        return;
                    case 3:
                        bg1 bg1Var2 = this.f40473b;
                        if (bg1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = bg1Var2.O;
                            if (i17 == 0) {
                                bg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                bg1Var2.showDialog(c2Var2);
                                TextView textView2 = (TextView) c2Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                bg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        bg1 bg1Var3 = this.f40473b;
                        if (bg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bg1Var3.G;
                            bg1Var3.presentFragment(twoStepVerificationActivity, true);
                            kb0 kb0Var = bg1Var3.f36093j0;
                            if (kb0Var != null) {
                                AndroidUtilities.runOnUIThread(kb0Var);
                                bg1Var3.f36093j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f40473b.C0();
                        return;
                    default:
                        bg1 bg1Var4 = this.f40473b;
                        int i18 = bg1Var4.O;
                        bg1Var4.M = true;
                        if (bg1Var4.f36094n.getTransformationMethod() == null) {
                            bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = bg1Var4.f36089f0[3];
                                if (animatedDrawable != yj0Var) {
                                    bg1Var4.f36080a.setAnimation(yj0Var);
                                    bg1Var4.f36089f0[3].N(18, false, false);
                                }
                                bg1Var4.f36080a.d();
                            }
                        } else {
                            bg1Var4.f36094n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    bg1Var4.f36080a.setAnimation(yj0Var2);
                                }
                                bg1Var4.f36089f0[3].T(0.0f, false);
                                bg1Var4.f36080a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bg1Var4.f36094n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bg1Var4.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f36080a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f36080a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.bk0 bk0Var = this.f36080a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            bk0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f36084c = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i15, null);
        this.f36084c.setGravity(1);
        this.f36084c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f36084c.setTextSize(1, 24.0f);
        wh.n nVar = new wh.n(context);
        this.d = nVar;
        int i17 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.W(nVar, i17, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i17, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final bg1 f40473b;

            {
                this.f40473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40473b.C0();
                        return;
                    case 1:
                        bg1 bg1Var = this.f40473b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.T = string;
                        bg1Var.showDialog(c2Var);
                        return;
                    case 2:
                        bg1.V(this.f40473b);
                        return;
                    case 3:
                        bg1 bg1Var2 = this.f40473b;
                        if (bg1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = bg1Var2.O;
                            if (i172 == 0) {
                                bg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                bg1Var2.showDialog(c2Var2);
                                TextView textView22 = (TextView) c2Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                bg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        bg1 bg1Var3 = this.f40473b;
                        if (bg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bg1Var3.G;
                            bg1Var3.presentFragment(twoStepVerificationActivity, true);
                            kb0 kb0Var = bg1Var3.f36093j0;
                            if (kb0Var != null) {
                                AndroidUtilities.runOnUIThread(kb0Var);
                                bg1Var3.f36093j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f40473b.C0();
                        return;
                    default:
                        bg1 bg1Var4 = this.f40473b;
                        int i18 = bg1Var4.O;
                        bg1Var4.M = true;
                        if (bg1Var4.f36094n.getTransformationMethod() == null) {
                            bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = bg1Var4.f36089f0[3];
                                if (animatedDrawable != yj0Var) {
                                    bg1Var4.f36080a.setAnimation(yj0Var);
                                    bg1Var4.f36089f0[3].N(18, false, false);
                                }
                                bg1Var4.f36080a.d();
                            }
                        } else {
                            bg1Var4.f36094n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    bg1Var4.f36080a.setAnimation(yj0Var2);
                                }
                                bg1Var4.f36089f0[3].T(0.0f, false);
                                bg1Var4.f36080a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bg1Var4.f36094n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bg1Var4.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f36082b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f36082b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f36082b.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(this.f36082b, org.telegram.ui.ActionBar.k6.Sh, null);
        this.f36082b.setTextSize(1, 15.0f);
        this.f36082b.setTypeface(AndroidUtilities.bold());
        this.f36082b.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{24.0f}, org.telegram.ui.ActionBar.k6.Oh));
        this.f36082b.setOnClickListener(new View.OnClickListener(this) {
            public final bg1 f40473b;

            {
                this.f40473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40473b.C0();
                        return;
                    case 1:
                        bg1 bg1Var = this.f40473b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.T = string;
                        bg1Var.showDialog(c2Var);
                        return;
                    case 2:
                        bg1.V(this.f40473b);
                        return;
                    case 3:
                        bg1 bg1Var2 = this.f40473b;
                        if (bg1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = bg1Var2.O;
                            if (i172 == 0) {
                                bg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                bg1Var2.showDialog(c2Var2);
                                TextView textView22 = (TextView) c2Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                bg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        bg1 bg1Var3 = this.f40473b;
                        if (bg1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = bg1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = bg1Var3.G;
                            bg1Var3.presentFragment(twoStepVerificationActivity, true);
                            kb0 kb0Var = bg1Var3.f36093j0;
                            if (kb0Var != null) {
                                AndroidUtilities.runOnUIThread(kb0Var);
                                bg1Var3.f36093j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f40473b.C0();
                        return;
                    default:
                        bg1 bg1Var4 = this.f40473b;
                        int i18 = bg1Var4.O;
                        bg1Var4.M = true;
                        if (bg1Var4.f36094n.getTransformationMethod() == null) {
                            bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(-1);
                                org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var = bg1Var4.f36089f0[3];
                                if (animatedDrawable != yj0Var) {
                                    bg1Var4.f36080a.setAnimation(yj0Var);
                                    bg1Var4.f36089f0[3].N(18, false, false);
                                }
                                bg1Var4.f36080a.d();
                            }
                        } else {
                            bg1Var4.f36094n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                bg1Var4.f36089f0[3].P(18);
                                org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                if (animatedDrawable2 != yj0Var2) {
                                    bg1Var4.f36080a.setAnimation(yj0Var2);
                                }
                                bg1Var4.f36089f0[3].T(0.0f, false);
                                bg1Var4.f36080a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = bg1Var4.f36094n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        bg1Var4.M = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f36084c.setTypeface(AndroidUtilities.bold());
            this.f36084c.setTextSize(1, 18.0f);
        } else {
            this.f36084c.setTypeface(Typeface.DEFAULT);
            this.f36084c.setTextSize(1, 24.0f);
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
                org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0(this, context, l0Var, 2);
                ra0Var.addView(l0Var);
                t9 t9Var = new t9(this, context, ra0Var);
                ag1 ag1Var = new ag1(this, context);
                this.f36098x = ag1Var;
                ag1Var.setVerticalScrollBarEnabled(false);
                l0Var.addView(this.f36098x, w7.z5.c(-1.0f, -1));
                l0Var.addView(this.h, w7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                l0Var.addView(this.f36085c0, org.telegram.ui.Components.h20.b());
                t9Var.addView(ra0Var, w7.z5.c(-1.0f, -1));
                va1 va1Var = new va1(this, context, 17);
                va1Var.setOrientation(1);
                this.f36098x.addView(va1Var, w7.z5.x(-1, -1, 51));
                va1Var.addView(this.f36080a, w7.z5.t(-2, -2, 49, 0, 69, 0, 0));
                va1Var.addView(this.f36084c, w7.z5.t(-2, -2, 49, 0, 8, 0, 0));
                va1Var.addView(this.d, w7.z5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context, null);
                this.f36096s = vd0Var;
                vd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f36094n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f36094n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f36094n;
                int i18 = org.telegram.ui.ActionBar.k6.f21327l6;
                org.telegram.ui.ActionBar.r6.x(editTextBoldCursor2, i18, null);
                org.telegram.ui.ActionBar.r6.W(this.f36094n, i15, null);
                this.f36094n.setBackground(null);
                this.f36094n.setMaxLines(1);
                this.f36094n.setLines(1);
                this.f36094n.setGravity(3);
                this.f36094n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f36094n.setSingleLine(true);
                this.f36094n.setCursorWidth(1.5f);
                this.f36094n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final bg1 f40801b;

                    {
                        this.f40801b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                bg1 bg1Var = this.f40801b;
                                bg1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                bg1Var.C0();
                                return true;
                            default:
                                bg1 bg1Var2 = this.f40801b;
                                bg1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (bg1Var2.v.getVisibility() == 0) {
                                    bg1Var2.f36095r.requestFocus();
                                } else {
                                    bg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f36096s.e(this.f36094n);
                this.f36094n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final bg1 f41128b;

                    {
                        this.f41128b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.vd0 vd0Var2 = this.f41128b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                vd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                bg1 bg1Var = this.f41128b;
                                if (z11) {
                                    bg1Var.f36087e0.setEditText((EditText) view);
                                    bg1Var.f36087e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                bg1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.vd0 vd0Var3 = this.f41128b.f36096s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                vd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f36094n, w7.z5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(this, context, 3);
                this.E = j0Var;
                j0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                org.telegram.ui.ActionBar.j0 j0Var2 = this.E;
                int i19 = org.telegram.ui.ActionBar.k6.f21272i6;
                org.telegram.ui.ActionBar.r6.S(j0Var2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i19), null);
                org.telegram.ui.ActionBar.r6.t(this.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final bg1 f40473b;

                    {
                        this.f40473b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f40473b.C0();
                                return;
                            case 1:
                                bg1 bg1Var = this.f40473b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                c2Var.T = string;
                                bg1Var.showDialog(c2Var);
                                return;
                            case 2:
                                bg1.V(this.f40473b);
                                return;
                            case 3:
                                bg1 bg1Var2 = this.f40473b;
                                if (bg1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = bg1Var2.O;
                                    if (i172 == 0) {
                                        bg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                        bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                        alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                        bg1Var2.showDialog(c2Var2);
                                        TextView textView22 = (TextView) c2Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        bg1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                bg1 bg1Var3 = this.f40473b;
                                if (bg1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = bg1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = bg1Var3.G;
                                    bg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    kb0 kb0Var = bg1Var3.f36093j0;
                                    if (kb0Var != null) {
                                        AndroidUtilities.runOnUIThread(kb0Var);
                                        bg1Var3.f36093j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f40473b.C0();
                                return;
                            default:
                                bg1 bg1Var4 = this.f40473b;
                                int i182 = bg1Var4.O;
                                bg1Var4.M = true;
                                if (bg1Var4.f36094n.getTransformationMethod() == null) {
                                    bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                        bg1Var4.f36089f0[3].P(-1);
                                        org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var = bg1Var4.f36089f0[3];
                                        if (animatedDrawable != yj0Var) {
                                            bg1Var4.f36080a.setAnimation(yj0Var);
                                            bg1Var4.f36089f0[3].N(18, false, false);
                                        }
                                        bg1Var4.f36080a.d();
                                    }
                                } else {
                                    bg1Var4.f36094n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                        bg1Var4.f36089f0[3].P(18);
                                        org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                        if (animatedDrawable2 != yj0Var2) {
                                            bg1Var4.f36080a.setAnimation(yj0Var2);
                                        }
                                        bg1Var4.f36089f0[3].T(0.0f, false);
                                        bg1Var4.f36080a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = bg1Var4.f36094n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                bg1Var4.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.z5.t(24, 24, 16, 0, 0, 16, 0));
                this.f36094n.addTextChangedListener(new yf1(this, 2));
                this.f36096s.addView(linearLayout, w7.z5.c(-2.0f, -1));
                va1Var.addView(this.f36096s, w7.z5.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.vd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f36095r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f36095r.setPadding(dp2, dp2, dp2, dp2);
                org.telegram.ui.ActionBar.r6.x(this.f36095r, i18, null);
                org.telegram.ui.ActionBar.r6.W(this.f36095r, i15, null);
                this.f36095r.setBackground(null);
                this.f36095r.setMaxLines(1);
                this.f36095r.setLines(1);
                this.f36095r.setGravity(3);
                this.f36095r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f36095r.setSingleLine(true);
                this.f36095r.setCursorWidth(1.5f);
                this.f36095r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final bg1 f40801b;

                    {
                        this.f40801b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i192, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                bg1 bg1Var = this.f40801b;
                                bg1Var.getClass();
                                if (i192 != 5 && i192 != 6) {
                                    return false;
                                }
                                bg1Var.C0();
                                return true;
                            default:
                                bg1 bg1Var2 = this.f40801b;
                                bg1Var2.getClass();
                                if (i192 != 5 && i192 != 6) {
                                    return false;
                                }
                                if (bg1Var2.v.getVisibility() == 0) {
                                    bg1Var2.f36095r.requestFocus();
                                } else {
                                    bg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f36095r);
                this.f36095r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final bg1 f41128b;

                    {
                        this.f41128b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.vd0 vd0Var2 = this.f41128b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                vd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                bg1 bg1Var = this.f41128b;
                                if (z11) {
                                    bg1Var.f36087e0.setEditText((EditText) view);
                                    bg1Var.f36087e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                bg1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.vd0 vd0Var3 = this.f41128b.f36096s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                vd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f36095r, w7.z5.c(-2.0f, -1));
                va1Var.addView(this.v, w7.z5.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
                this.f36087e0 = fsVar;
                fsVar.setVisibility(8);
                ra0Var.addView(this.f36087e0);
                od0 od0Var = new od0(this, context, 3);
                this.f36097w = od0Var;
                final int i20 = 1;
                od0Var.b(6, 1);
                vr[] vrVarArr = this.f36097w.f41793f;
                int length = vrVarArr.length;
                int i21 = 0;
                while (i21 < length) {
                    vr vrVar = vrVarArr[i21];
                    vrVar.setShowSoftInputOnFocusCompat(v0() ^ i20);
                    vrVar.addTextChangedListener(new yf1(this, 0));
                    vrVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final bg1 f41128b;

                        {
                            this.f41128b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f7;
                            float f10;
                            switch (i20) {
                                case 0:
                                    org.telegram.ui.Components.vd0 vd0Var2 = this.f41128b.v;
                                    if (z11) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    vd0Var2.b(f7, f7, true);
                                    return;
                                case 1:
                                    bg1 bg1Var = this.f41128b;
                                    if (z11) {
                                        bg1Var.f36087e0.setEditText((EditText) view);
                                        bg1Var.f36087e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    bg1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.vd0 vd0Var3 = this.f41128b.f36096s;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    vd0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i21++;
                    i20 = 1;
                }
                this.f36097w.setVisibility(8);
                va1Var.addView(this.f36097w, w7.z5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                va1Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.z5.e(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f36088f = textView5;
                    org.telegram.ui.ActionBar.r6.W(textView5, org.telegram.ui.ActionBar.k6.J6, null);
                    this.f36088f.setGravity(1);
                    this.f36088f.setTextSize(1, 14.0f);
                    this.f36088f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f36088f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f36088f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    va1Var.addView(this.f36088f, w7.z5.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f36088f.setOnClickListener(new View.OnClickListener(this) {
                        public final bg1 f40473b;

                        {
                            this.f40473b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f40473b.C0();
                                    return;
                                case 1:
                                    bg1 bg1Var = this.f40473b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                    c2Var.T = string;
                                    bg1Var.showDialog(c2Var);
                                    return;
                                case 2:
                                    bg1.V(this.f40473b);
                                    return;
                                case 3:
                                    bg1 bg1Var2 = this.f40473b;
                                    if (bg1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = bg1Var2.O;
                                        if (i172 == 0) {
                                            bg1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                            bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                            alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                            bg1Var2.showDialog(c2Var2);
                                            TextView textView22 = (TextView) c2Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            bg1Var2.A0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    bg1 bg1Var3 = this.f40473b;
                                    if (bg1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = bg1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = bg1Var3.G;
                                        bg1Var3.presentFragment(twoStepVerificationActivity, true);
                                        kb0 kb0Var = bg1Var3.f36093j0;
                                        if (kb0Var != null) {
                                            AndroidUtilities.runOnUIThread(kb0Var);
                                            bg1Var3.f36093j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f40473b.C0();
                                    return;
                                default:
                                    bg1 bg1Var4 = this.f40473b;
                                    int i182 = bg1Var4.O;
                                    bg1Var4.M = true;
                                    if (bg1Var4.f36094n.getTransformationMethod() == null) {
                                        bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                            bg1Var4.f36089f0[3].P(-1);
                                            org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                            org.telegram.ui.Components.yj0 yj0Var = bg1Var4.f36089f0[3];
                                            if (animatedDrawable != yj0Var) {
                                                bg1Var4.f36080a.setAnimation(yj0Var);
                                                bg1Var4.f36089f0[3].N(18, false, false);
                                            }
                                            bg1Var4.f36080a.d();
                                        }
                                    } else {
                                        bg1Var4.f36094n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                            bg1Var4.f36089f0[3].P(18);
                                            org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                            org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                            if (animatedDrawable2 != yj0Var2) {
                                                bg1Var4.f36080a.setAnimation(yj0Var2);
                                            }
                                            bg1Var4.f36089f0[3].T(0.0f, false);
                                            bg1Var4.f36080a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = bg1Var4.f36094n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    bg1Var4.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = t9Var;
                ei.g6 g6Var = new ei.g6(this, context);
                this.f36099y = g6Var;
                g6Var.setAlpha(0.0f);
                t9Var.addView(this.f36099y);
                t9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21327l6, false));
                l0Var.addView(this.L, w7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(this, context, 3);
                eVar.setOnTouchListener(new di.d(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.f36080a);
                eVar.addView(this.f36084c);
                eVar.addView(this.d);
                eVar.addView(this.f36082b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, this.fragmentView, null);
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f36084c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f36084c.setText(string);
                }
                if (!TextUtils.isEmpty(this.f36081a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.vd0 vd0Var2 = this.f36096s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                vd0Var2.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f36094n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f36094n.setImeOptions(268435461);
                this.f36094n.setInputType(129);
                this.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f36094n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.yj0[] yj0VarArr = new org.telegram.ui.Components.yj0[7];
                this.f36089f0 = yj0VarArr;
                yj0VarArr[0] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36089f0[1] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36089f0[2] = new org.telegram.ui.Components.yj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36089f0[3] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36089f0[4] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36089f0[5] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f36089f0[6] = new org.telegram.ui.Components.yj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.yj0 yj0Var = this.f36089f0[6];
                yj0Var.h = true;
                yj0Var.P(19);
                this.f36089f0[2].S(97, this.f36092i0);
                F0(true);
                if (i16 == 1) {
                    tf1 tf1Var = this.f36090g0;
                    if (tf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(tf1Var);
                    }
                    this.f36080a.setAnimation(this.f36089f0[6]);
                    this.f36080a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f36094n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    F0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f36084c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f36096s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f36094n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f36094n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f36080a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f36080a.d();
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
                this.f36084c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f36096s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f36094n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f36094n.setImeOptions(268435461);
                this.f36094n.setInputType(33);
                this.v.setVisibility(8);
                this.f36080a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f36080a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f36084c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f36087e0.setVisibility(0);
                this.f36096s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f29754a |= 256;
                    obj.f29755b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj.f29756c = i22;
                    r13 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i22, 0);
                } else {
                    r13 = 0;
                }
                wh.n nVar2 = this.d;
                String string2 = LocaleController.getString(R.string.RestoreEmailSent);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r13] = valueOf;
                nVar2.setText(AndroidUtilities.formatSpannable(string2, charSequenceArr));
                this.d.setVisibility(r13);
                this.f36085c0.e(r13, r13);
                this.f36097w.setVisibility(r13);
                this.f36080a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f36080a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f36084c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f36096s.setVisibility(8);
                this.f36087e0.setVisibility(0);
                wh.n nVar3 = this.d;
                int i23 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                nVar3.setText(LocaleController.formatString("EmailPasswordConfirmText2", i23, str));
                this.d.setVisibility(0);
                this.f36085c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final bg1 f40473b;

                    {
                        this.f40473b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f40473b.C0();
                                return;
                            case 1:
                                bg1 bg1Var = this.f40473b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new sf1(bg1Var, 1));
                                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetPassword);
                                String string3 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                c2Var.T = string3;
                                bg1Var.showDialog(c2Var);
                                return;
                            case 2:
                                bg1.V(this.f40473b);
                                return;
                            case 3:
                                bg1 bg1Var2 = this.f40473b;
                                if (bg1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = bg1Var2.O;
                                    if (i172 == 0) {
                                        bg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = bg1Var2.f36081a0;
                                        bg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new uf1(bg1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg1Var2.getParentActivity());
                                        alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new sf1(bg1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                                        bg1Var2.showDialog(c2Var2);
                                        TextView textView22 = (TextView) c2Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        bg1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                bg1 bg1Var3 = this.f40473b;
                                if (bg1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = bg1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = bg1Var3.G;
                                    bg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    kb0 kb0Var = bg1Var3.f36093j0;
                                    if (kb0Var != null) {
                                        AndroidUtilities.runOnUIThread(kb0Var);
                                        bg1Var3.f36093j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f40473b.C0();
                                return;
                            default:
                                bg1 bg1Var4 = this.f40473b;
                                int i182 = bg1Var4.O;
                                bg1Var4.M = true;
                                if (bg1Var4.f36094n.getTransformationMethod() == null) {
                                    bg1Var4.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Xd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                        bg1Var4.f36089f0[3].P(-1);
                                        org.telegram.ui.Components.yj0 animatedDrawable = bg1Var4.f36080a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var2 = bg1Var4.f36089f0[3];
                                        if (animatedDrawable != yj0Var2) {
                                            bg1Var4.f36080a.setAnimation(yj0Var2);
                                            bg1Var4.f36089f0[3].N(18, false, false);
                                        }
                                        bg1Var4.f36080a.d();
                                    }
                                } else {
                                    bg1Var4.f36094n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(bg1Var4.E, org.telegram.ui.ActionBar.k6.Yd, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && bg1Var4.f36094n.length() > 0 && bg1Var4.f36094n.hasFocus()) {
                                        bg1Var4.f36089f0[3].P(18);
                                        org.telegram.ui.Components.yj0 animatedDrawable2 = bg1Var4.f36080a.getAnimatedDrawable();
                                        org.telegram.ui.Components.yj0 yj0Var22 = bg1Var4.f36089f0[3];
                                        if (animatedDrawable2 != yj0Var22) {
                                            bg1Var4.f36080a.setAnimation(yj0Var22);
                                        }
                                        bg1Var4.f36089f0[3].T(0.0f, false);
                                        bg1Var4.f36080a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = bg1Var4.f36094n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                bg1Var4.M = false;
                                return;
                        }
                    }
                });
                this.f36097w.setVisibility(0);
                this.f36080a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f36080a.d();
                i14 = 1;
                break;
            case 6:
                this.f36084c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f36082b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f36080a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f36080a.d();
                i14 = 1;
                break;
            case 7:
                this.f36084c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.Y) {
                    this.f36082b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
                    this.f36082b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f36082b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f36080a.f(R.raw.wallet_allset, 160, 160, null);
                this.f36080a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f36084c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                org.telegram.ui.ActionBar.r6.W(this.e, org.telegram.ui.ActionBar.k6.f21386o6, null);
                this.f36096s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f36094n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f36094n.setImeOptions(268435462);
                this.f36094n.setInputType(129);
                this.f36094n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f36094n.setTypeface(Typeface.DEFAULT);
                this.f36080a.f(R.raw.wallet_science, 120, 120, null);
                this.f36080a.d();
                i14 = 1;
                break;
            case 9:
                this.f36084c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f36082b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f36080a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f36080a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f36094n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new yf1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
            if (o2Var != this && (o2Var instanceof bg1)) {
                ((org.telegram.ui.Components.v71) ((bg1) o2Var).f36083b0.f16265b).f31378b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21125a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36084c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36094n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36094n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21310k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36094n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21327l6));
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
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, true)) > 0.699999988079071d) {
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
        if (this.f36080a != null) {
            int i12 = this.O;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f36080a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.bk0 bk0Var = this.f36080a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                bk0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.fs fsVar = this.f36087e0;
        if (fsVar != null) {
            if (!v0()) {
                i11 = 8;
            }
            fsVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        tf1 tf1Var = this.f36090g0;
        if (tf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tf1Var);
            this.f36090g0 = null;
        }
        if (this.f36089f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.yj0[] yj0VarArr = this.f36089f0;
                if (i10 >= yj0VarArr.length) {
                    break;
                }
                yj0VarArr[i10].C(false);
                i10++;
            }
            this.f36089f0 = null;
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
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.f41 f41Var = this.f36086d0;
            if (f41Var != null) {
                f41Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21327l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f36094n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new tf1(this, 0), 200L);
            }
            od0 od0Var = this.f36097w;
            if (od0Var != null && od0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new tf1(this, 1), 200L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            od0 od0Var = this.f36097w;
            vr[] vrVarArr = od0Var.f41793f;
            if (i10 < vrVarArr.length) {
                vr vrVar = vrVarArr[i10];
                vrVar.postDelayed(new bl0(vrVar, 1), i10 * 75);
                i10++;
            } else {
                od0Var.postDelayed(new o71(19, this, runnable), (vrVarArr.length * 75) + 350);
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
        this.f36085c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f36085c0.f(true, true);
        }
    }

    public final void y0() {
        vr[] vrVarArr;
        for (vr vrVar : this.f36097w.f41793f) {
            vrVar.setText("");
            vrVar.i(1.0f);
        }
        this.f36097w.f41793f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f36097w, 8.0f, new tf1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.vd0 vd0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(vd0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle h = a1.g.h("afterSignup", true);
            rg0 rg0Var = new rg0();
            rg0Var.l0(h);
            presentFragment(rg0Var, true);
            return;
        }
        super.finishFragment();
    }

    public bg1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f36091h0 = new tf1(this, 2);
        this.f36092i0 = new tf1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new uf1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void B0() {
    }
}
