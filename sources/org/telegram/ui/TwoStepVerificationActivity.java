package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
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

public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.m10 A;
    public org.telegram.ui.Components.l21 B;
    public boolean C;
    public boolean D;
    public TL_account.Password E;
    public boolean F;
    public byte[] G;
    public long H;
    public byte[] I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public final ff1 R;
    public boolean S;
    public int T;
    public jf1 U;
    public int V;
    public String W;
    public mf1 X;
    public final ff1 Y;

    public lf1 f36269a;

    public org.telegram.ui.Components.zk0 f36270b;

    public org.telegram.ui.Components.ri0 f36271c;
    private int changePasswordRow;
    public TextView d;

    public TextView f36272e;

    public TextView f36273f;
    public TextView h;

    public org.telegram.ui.ActionBar.h5 f36274n;

    public TextView f36275r;

    public EditTextBoldCursor f36276s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.jc0 v;

    public org.telegram.ui.ActionBar.b2 f36277w;

    public org.telegram.ui.Components.az f36278x;

    public ScrollView f36279y;

    public TwoStepVerificationActivity() {
        super(null);
        this.F = true;
        this.G = new byte[0];
        this.R = new ff1(this, 1);
        this.T = -1;
        this.Y = new ff1(this, 2);
    }

    public static void U(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
            twoStepVerificationActivity.k0();
        }
    }

    public static void V(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
            twoStepVerificationActivity.t0();
        }
    }

    public static void W(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ef1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.q0(twoStepVerificationActivity.v, twoStepVerificationActivity.f36276s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public static void X(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.X == null || !z10) {
            twoStepVerificationActivity.o0();
        }
        if (!z10) {
            org.telegram.ui.Components.y4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
            return;
        }
        twoStepVerificationActivity.G = bArr;
        twoStepVerificationActivity.F = true;
        if (twoStepVerificationActivity.X != null) {
            AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36276s);
            twoStepVerificationActivity.X.h(twoStepVerificationActivity.l0());
            return;
        }
        if (!TextUtils.isEmpty(twoStepVerificationActivity.E.email_unconfirmed_pattern)) {
            zf1 zf1Var = new zf1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.E);
            zf1Var.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, true);
            twoStepVerificationActivity.presentFragment(zf1Var, true);
            return;
        }
        AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36276s);
        TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
        twoStepVerificationActivity2.F = true;
        twoStepVerificationActivity2.G = twoStepVerificationActivity.G;
        twoStepVerificationActivity2.E = twoStepVerificationActivity.E;
        twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
        twoStepVerificationActivity2.H = twoStepVerificationActivity.H;
        twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
    }

    public static void Y(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.E.current_algo;
        byte[] x8 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        lr0 lr0Var = new lr0(twoStepVerificationActivity, bArr, x8, 12);
        TL_account.Password password = twoStepVerificationActivity.E;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            lr0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x8, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, lr0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        lr0Var.run(null, tL_error2);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ef1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.E = null;
            twoStepVerificationActivity.G = new byte[0];
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            twoStepVerificationActivity.finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
            }
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        if (tL_error == null) {
            twoStepVerificationActivity.C = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            if (!i0(password, false)) {
                org.telegram.ui.Components.y4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.G;
                twoStepVerificationActivity.F = (bArr != null && bArr.length > 0) || !twoStepVerificationActivity.E.has_password;
            }
            m0(twoStepVerificationActivity.E);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.z0();
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
            twoStepVerificationActivity.k0();
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 == twoStepVerificationActivity.K || i10 == twoStepVerificationActivity.changePasswordRow) {
            zf1 zf1Var = new zf1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.E);
            zf1Var.F.add(twoStepVerificationActivity);
            zf1Var.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, false);
            twoStepVerificationActivity.presentFragment(zf1Var);
            return;
        }
        if (i10 == twoStepVerificationActivity.M || i10 == twoStepVerificationActivity.N) {
            zf1 zf1Var2 = new zf1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.E);
            zf1Var2.F.add(twoStepVerificationActivity);
            zf1Var2.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, true);
            twoStepVerificationActivity.presentFragment(zf1Var2);
            return;
        }
        if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
            String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
            if (twoStepVerificationActivity.E.has_secure_values) {
                string = org.telegram.messenger.y1.i(R.string.TurnPasswordOffPassport, s3.c.f(string, "\n\n"));
            }
            String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
            String string3 = LocaleController.getString(R.string.Disable);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.P = string;
            b2Var.N = string2;
            alertDialog$Builder.k(string3, new df1(twoStepVerificationActivity, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
            twoStepVerificationActivity.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.E.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ef1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.l0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ef1(twoStepVerificationActivity, 4), 10);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] bArrComputeSHA512;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.I = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    bArrComputeSHA512 = Utilities.computeSHA512(bArr3, bArr, bArr3);
                }
                AndroidUtilities.runOnUIThread(new op0(twoStepVerificationActivity, z10, bArr2, 6));
            }
            bArrComputeSHA512 = Utilities.computePBKDF2(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            twoStepVerificationActivity.H = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArrComputeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(bArrComputeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.I;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!xm0.Z0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.l0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new jh.m5(5));
                twoStepVerificationActivity.I = null;
                twoStepVerificationActivity.H = 0L;
            }
        } else {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.H = 0L;
        }
        z10 = true;
        AndroidUtilities.runOnUIThread(new op0(twoStepVerificationActivity, z10, bArr2, 6));
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationActivity.o0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
                return;
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                return;
            }
        }
        TL_account.Password password = twoStepVerificationActivity.E;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        kf1 kf1Var = new kf1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
        kf1Var.F.add(twoStepVerificationActivity);
        kf1Var.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, false);
        twoStepVerificationActivity.presentFragment(kf1Var);
    }

    public static boolean i0(TL_account.Password password, boolean z10) {
        if (z10) {
            return !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown);
        }
        return ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
    }

    public static void m0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.random.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.random.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        if (!this.F || this.X != null) {
            this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.g6.G6;
            kVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23359u8, false), false);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ed1(2, this));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        ScrollView scrollView = new ScrollView(context);
        this.f36279y = scrollView;
        final int i14 = 1;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.f36279y, h7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.f36279y.addView(linearLayout, h7.z5.x(-1, -2, 51));
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f36271c = ri0Var;
        ri0Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.f36271c.d();
        org.telegram.ui.Components.ri0 ri0Var2 = this.f36271c;
        if (AndroidUtilities.isSmallScreen()) {
            i10 = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
        }
        ri0Var2.setVisibility(i10);
        linearLayout.addView(this.f36271c, h7.z5.q(100, 100, 1));
        TextView textView = new TextView(context);
        this.d = textView;
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(AndroidUtilities.bold());
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, this.d, h7.z5.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.f36272e = textViewI;
        int i16 = org.telegram.ui.ActionBar.g6.D6;
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.f36272e.setTextSize(1, 15.0f);
        this.f36272e.setGravity(1);
        this.f36272e.setVisibility(8);
        linearLayout.addView(this.f36272e, h7.z5.t(-2, -2, 1, 42, 8, 42, 0));
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
        this.v = jc0Var;
        jc0Var.setText(LocaleController.getString(R.string.EnterPassword));
        this.v.b(1.0f, 1.0f, false);
        linearLayout.addView(this.v, h7.z5.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36276s = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        this.f36276s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f36276s.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        this.f36276s.setBackground(null);
        this.f36276s.setSingleLine(true);
        this.f36276s.setInputType(129);
        this.f36276s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.f36276s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor2 = this.f36276s;
        int i17 = org.telegram.ui.ActionBar.g6.f23198l6;
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.f36276s.setCursorWidth(1.5f);
        this.f36276s.setContentDescription(LocaleController.getString(R.string.EnterPassword));
        int iDp = AndroidUtilities.dp(16.0f);
        this.f36276s.setPadding(iDp, iDp, iDp, iDp);
        this.v.addView(this.f36276s, h7.z5.c(-2.0f, -1));
        this.v.e(this.f36276s);
        int i18 = 12;
        this.f36276s.setOnFocusChangeListener(new ld(this, i18));
        this.f36276s.setOnEditorActionListener(new fa(this, i18));
        this.f36276s.addTextChangedListener(new p0(this, 17));
        TextView textView2 = new TextView(context);
        this.f36273f = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.f36273f.setTextSize(1, 14.0f);
        this.f36273f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f36273f.setText(LocaleController.getString(R.string.YourEmailInfo));
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayout, this.f36273f, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = textViewI2;
        textViewI2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayout.addView(this.h, h7.z5.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(80);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, h7.z5.l(1.0f, -1, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f36274n = h5Var;
        h5Var.setTextSize(15);
        this.f36274n.setGravity(19);
        this.f36274n.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        frameLayout.addView(this.f36274n, h7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.f36274n.setOnClickListener(new View.OnClickListener(this) {

            public final TwoStepVerificationActivity f39074b;

            {
                this.f39074b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f39074b.r0();
                        break;
                    case 1:
                        this.f39074b.j0();
                        break;
                    default:
                        this.f39074b.t0();
                        break;
                }
            }
        });
        i6.q2(this.f36274n);
        TextView textView3 = new TextView(context);
        this.f36275r = textView3;
        textView3.setTextSize(1, 15.0f);
        this.f36275r.setGravity(19);
        this.f36275r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f36275r.setText(LocaleController.getString(R.string.CancelReset));
        this.f36275r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f36275r.setVisibility(8);
        frameLayout.addView(this.f36275r, h7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.f36275r.setOnClickListener(new View.OnClickListener(this) {

            public final TwoStepVerificationActivity f39074b;

            {
                this.f39074b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f39074b.r0();
                        break;
                    case 1:
                        this.f39074b.j0();
                        break;
                    default:
                        this.f39074b.t0();
                        break;
                }
            }
        });
        i6.q2(this.f36275r);
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.A = m10Var;
        i6.q2(m10Var);
        final int i19 = 2;
        this.A.setOnClickListener(new View.OnClickListener(this) {

            public final TwoStepVerificationActivity f39074b;

            {
                this.f39074b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.f39074b.r0();
                        break;
                    case 1:
                        this.f39074b.j0();
                        break;
                    default:
                        this.f39074b.t0();
                        break;
                }
            }
        });
        org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(context);
        this.B = l21Var;
        l21Var.setTransformType(1);
        this.B.setProgress(0.0f);
        this.B.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.B.setDrawBackground(false);
        this.A.setContentDescription(LocaleController.getString(R.string.Next));
        this.A.addView(this.B, h7.z5.e(56, 56, 17));
        this.A.a(this.B);
        frameLayout.addView(this.A, org.telegram.ui.Components.m10.b());
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.f36278x = azVar;
        azVar.b();
        frameLayout.addView(this.f36278x, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f36270b = zk0Var;
        zk0Var.setSections(true);
        this.f36270b.setLayoutManager(new f2.k0(1, false));
        this.f36270b.setEmptyView(this.f36278x);
        this.f36270b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f36270b, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var2 = this.f36270b;
        lf1 lf1Var = new lf1(this, context);
        this.f36269a = lf1Var;
        zk0Var2.setAdapter(lf1Var);
        this.f36270b.setOnItemClickListener(new b21(this, 10));
        jf1 jf1Var = new jf1(context, null);
        this.U = jf1Var;
        jf1Var.setSize(AndroidUtilities.dp(20.0f));
        this.U.setAlpha(0.0f);
        this.U.setScaleX(0.1f);
        this.U.setScaleY(0.1f);
        this.U.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.actionBar.addView(this.U, h7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        z0();
        if (this.F && this.X == null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
        } else {
            this.actionBar.setTitle(null);
        }
        if (this.X != null) {
            this.d.setText(LocaleController.getString(R.string.YourPassword));
            int i20 = this.V;
            if (i20 == 1) {
                this.f36272e.setText(LocaleController.getString(R.string.PleaseEnterCurrentPasswordWithdraw));
            } else if (i20 == 2) {
                org.telegram.messenger.rl.n(R.string.PleaseEnterCurrentPasswordGiftTransfer, new Object[]{this.W}, this.f36272e);
            } else {
                this.f36272e.setText(LocaleController.getString(R.string.PleaseEnterCurrentPasswordTransfer));
            }
            this.f36272e.setVisibility(0);
        } else {
            this.d.setText(LocaleController.getString(R.string.YourPassword));
            this.f36272e.setVisibility(0);
            this.f36272e.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
        }
        if (this.F) {
            View view = this.fragmentView;
            int i21 = org.telegram.ui.ActionBar.g6.f22999a7;
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            this.fragmentView.setTag(Integer.valueOf(i21));
        } else {
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            this.fragmentView.setTag(Integer.valueOf(i13));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Object obj;
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.G = (byte[]) obj;
            }
            n0(false, false, null);
            z0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.T < 0) {
            super.finishFragment();
            return;
        }
        Bundle bundleH = a9.p.h("afterSignup", true);
        qg0 qg0Var = new qg0();
        qg0Var.l0(bundleH);
        presentFragment(qg0Var, true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.h3.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36278x, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 4, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 8388608, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36270b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        TextView textView = this.d;
        int i14 = org.telegram.ui.ActionBar.g6.D6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36273f, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36274n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36276s, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36276s, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36276s, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36276s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    public final void j0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.CancelPasswordResetYes), new df1(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.CancelReset);
        String string = LocaleController.getString(R.string.CancelPasswordReset);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = string;
        showDialog(b2Var);
    }

    public final void k0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.G;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        UserConfig.getInstance(this.currentAccount).resetSavedPassword();
        this.I = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        p0(false);
        Utilities.globalQueue.postRunnable(new m21(22, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP l0() {
        TL_account.Password password = this.E;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return SRPHelper.startCheck(this.G, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    public final void n0(boolean z10, boolean z11, Runnable runnable) {
        if (!z11) {
            this.C = true;
            lf1 lf1Var = this.f36269a;
            if (lf1Var != null) {
                lf1Var.l();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new jh.x5(this, z11, z10, runnable), 10);
    }

    public final void o0() {
        if (!this.F) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.U, (Property<jf1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<jf1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.U, (Property<jf1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f28122f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f36277w;
        if (b2Var == null) {
            return;
        }
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.f36277w = null;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.T < 0) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        x0();
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ri0 ri0Var = this.f36271c;
        if (AndroidUtilities.isSmallScreen()) {
            i10 = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
        }
        ri0Var.setVisibility(i10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        s0(null);
        z0();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Y);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        this.D = true;
        org.telegram.ui.ActionBar.b2 b2Var = this.f36277w;
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.f36277w = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            if (this.S) {
                r0();
                this.S = false;
            } else if (this.J) {
                u0();
                this.J = false;
            }
        }
    }

    public final void p0(boolean z10) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.f36277w != null) {
            return;
        }
        if (!this.F) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.U, (Property<jf1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<jf1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<jf1, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f28122f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        this.f36277w = b2Var;
        b2Var.f22747c0 = false;
        if (z10) {
            b2Var.q(300L);
        } else {
            b2Var.show();
        }
    }

    public final void q0(org.telegram.ui.Components.jc0 jc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        jc0Var.a(1.0f);
        AndroidUtilities.shakeViewSpring(jc0Var, 5.0f, new ff1(this, 3));
    }

    public final void r0() {
        TL_account.Password password = this.E;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            p0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ef1(this, 1), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.E.pending_reset_date == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new df1(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.P = string;
            showDialog(b2Var);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.E.pending_reset_date) {
            j0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new df1(this, 3));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ResetPassword);
        String string2 = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
        b2Var2.P = string2;
        showDialog(b2Var2);
        TextView textView = (TextView) b2Var2.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public final void s0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.E;
        if (password == null || password.current_algo == null || (bArr = this.G) == null || bArr.length <= 0) {
            n0(true, password != null, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void t0() {
        if (this.F) {
            return;
        }
        String string = this.f36276s.getText().toString();
        if (string.length() == 0) {
            q0(this.v, this.f36276s, false);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(string);
        p0(false);
        Utilities.globalQueue.postRunnable(new m21(21, this, stringBytes));
    }

    public final void u0() {
        p0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ef1(this, 0));
    }

    public final void v0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        this.E = password;
        this.G = bArr;
        this.I = bArr2;
        this.H = j10;
        this.F = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void w0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = str2;
        showDialog(b2Var);
    }

    public final void x0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.T, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new df1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
    }

    public final void y0() {
        String pluralString;
        if (this.F) {
            return;
        }
        int i10 = this.E.pending_reset_date;
        ff1 ff1Var = this.Y;
        if (i10 != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i11 = this.E.pending_reset_date;
            if (currentTime > i11) {
                if (this.h.getVisibility() != 8) {
                    this.h.setVisibility(8);
                }
                if (this.E.pending_reset_date == 0) {
                    this.f36274n.l(LocaleController.getString(R.string.ForgotPassword), false);
                    this.f36275r.setVisibility(8);
                    this.f36274n.setVisibility(0);
                } else {
                    this.f36274n.l(LocaleController.getString(R.string.ResetPassword), false);
                    this.f36275r.setVisibility(0);
                    this.f36274n.setVisibility(0);
                }
                this.f36274n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
                AndroidUtilities.cancelRunOnUIThread(ff1Var);
            } else {
                int iMax = Math.max(1, i11 - getConnectionsManager().getCurrentTime());
                if (iMax > 86400) {
                    pluralString = LocaleController.formatPluralString("Days", iMax / 86400, new Object[0]);
                } else {
                    pluralString = iMax >= 3600 ? LocaleController.formatPluralString("Hours", iMax / 3600, new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(iMax / 60), Integer.valueOf(iMax % 60));
                }
                this.h.setText(LocaleController.formatString("RestorePasswordResetIn", R.string.RestorePasswordResetIn, pluralString));
                this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
                if (this.f36274n.getVisibility() != 8) {
                    this.f36274n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.f36275r.setVisibility(0);
                AndroidUtilities.cancelRunOnUIThread(ff1Var);
                AndroidUtilities.runOnUIThread(ff1Var, 1000L);
            }
        } else {
            if (this.h.getVisibility() != 8) {
                this.h.setVisibility(8);
            }
            if (this.E.pending_reset_date == 0) {
                this.f36274n.l(LocaleController.getString(R.string.ForgotPassword), false);
                this.f36275r.setVisibility(8);
                this.f36274n.setVisibility(0);
            } else {
                this.f36274n.l(LocaleController.getString(R.string.ResetPassword), false);
                this.f36275r.setVisibility(0);
                this.f36274n.setVisibility(0);
            }
            this.f36274n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            AndroidUtilities.cancelRunOnUIThread(ff1Var);
        }
        if (this.E == null || this.f36274n == null || this.h.getVisibility() != 0) {
            AndroidUtilities.cancelRunOnUIThread(ff1Var);
            TextView textView = this.f36275r;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public final void z0() {
        TL_account.Password password;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.K);
        sb2.append(this.L);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.M);
        sb2.append(this.N);
        sb2.append(this.O);
        sb2.append(this.P);
        this.P = 0;
        this.K = -1;
        this.L = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        if (!this.C && (password = this.E) != null && this.F) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.P = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.P = 3;
                    this.N = 2;
                } else {
                    this.P = 3;
                    this.M = 2;
                }
                int i10 = this.P;
                this.P = i10 + 1;
                this.O = i10;
            } else {
                this.K = 0;
                this.P = 2;
                this.L = 1;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.K);
        sb3.append(this.L);
        sb3.append(this.changePasswordRow);
        sb3.append(this.turnPasswordOffRow);
        sb3.append(this.M);
        sb3.append(this.N);
        sb3.append(this.O);
        sb3.append(this.P);
        if (this.f36269a != null && !sb2.toString().equals(sb3.toString())) {
            this.f36269a.l();
        }
        if (this.fragmentView != null) {
            if (this.C || this.F) {
                org.telegram.ui.Components.zk0 zk0Var = this.f36270b;
                if (zk0Var != null) {
                    zk0Var.setVisibility(0);
                    this.f36279y.setVisibility(4);
                    this.f36270b.setEmptyView(this.f36278x);
                }
                if (this.f36276s != null) {
                    this.A.e(false, false);
                    this.f36276s.setVisibility(4);
                    this.d.setVisibility(4);
                    this.f36273f.setVisibility(8);
                    this.f36274n.setVisibility(4);
                    y0();
                }
                View view = this.fragmentView;
                int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                this.fragmentView.setTag(Integer.valueOf(i11));
                return;
            }
            org.telegram.ui.Components.zk0 zk0Var2 = this.f36270b;
            if (zk0Var2 != null) {
                zk0Var2.setEmptyView(null);
                this.f36270b.setVisibility(4);
                this.f36279y.setVisibility(0);
                this.f36278x.setVisibility(4);
            }
            if (this.f36276s != null) {
                this.A.e(true, false);
                this.f36276s.setVisibility(0);
                View view2 = this.fragmentView;
                int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
                view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.fragmentView.setTag(Integer.valueOf(i12));
                this.d.setVisibility(0);
                this.f36274n.setVisibility(0);
                y0();
                this.f36273f.setVisibility(8);
                if (TextUtils.isEmpty(this.E.hint)) {
                    this.f36276s.setHint((CharSequence) null);
                } else {
                    this.f36276s.setHint(this.E.hint);
                }
                AndroidUtilities.runOnUIThread(new ff1(this, 0), 200L);
            }
        }
    }
}
