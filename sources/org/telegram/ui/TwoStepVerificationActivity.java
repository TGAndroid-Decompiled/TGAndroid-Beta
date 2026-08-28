package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.j10 A;
    public org.telegram.ui.Components.j21 B;
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
    public final gf1 R;
    public boolean S;
    public int T;
    public kf1 U;
    public int V;
    public String W;
    public nf1 X;
    public final gf1 Y;
    public mf1 f36266a;
    public org.telegram.ui.Components.wk0 f36267b;
    public org.telegram.ui.Components.pi0 f36268c;
    private int changePasswordRow;
    public TextView d;
    public TextView f36269e;
    public TextView f36270f;
    public TextView h;
    public org.telegram.ui.ActionBar.h5 f36271n;
    public TextView f36272r;
    public EditTextBoldCursor f36273s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.fc0 v;
    public org.telegram.ui.ActionBar.c2 f36274w;
    public org.telegram.ui.Components.yy f36275x;
    public ScrollView f36276y;

    public TwoStepVerificationActivity() {
        super(null);
        this.F = true;
        this.G = new byte[0];
        this.R = new gf1(this, 1);
        this.T = -1;
        this.Y = new gf1(this, 2);
    }

    public static void T(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            l0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
            twoStepVerificationActivity.j0();
        }
    }

    public static void U(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            l0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
            twoStepVerificationActivity.s0();
        }
    }

    public static void V(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ff1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.n0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.p0(twoStepVerificationActivity.v, twoStepVerificationActivity.f36273s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            twoStepVerificationActivity.v0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            twoStepVerificationActivity.v0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void W(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.X == null || !z10) {
            twoStepVerificationActivity.n0();
        }
        if (z10) {
            twoStepVerificationActivity.G = bArr;
            twoStepVerificationActivity.F = true;
            if (twoStepVerificationActivity.X != null) {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36273s);
                twoStepVerificationActivity.X.h(twoStepVerificationActivity.k0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.E.email_unconfirmed_pattern)) {
                ag1 ag1Var = new ag1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.E);
                ag1Var.C0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, true);
                twoStepVerificationActivity.presentFragment(ag1Var, true);
                return;
            } else {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36273s);
                TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
                twoStepVerificationActivity2.F = true;
                twoStepVerificationActivity2.G = twoStepVerificationActivity.G;
                twoStepVerificationActivity2.E = twoStepVerificationActivity.E;
                twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
                twoStepVerificationActivity2.H = twoStepVerificationActivity.H;
                twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
                return;
            }
        }
        org.telegram.ui.Components.y4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
    }

    public static void X(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.E.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        kr0 kr0Var = new kr0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.E;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                kr0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, kr0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        kr0Var.run(null, tL_error2);
    }

    public static void Y(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ff1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.n0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.E = null;
            twoStepVerificationActivity.G = new byte[0];
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            twoStepVerificationActivity.finishFragment();
        } else if (tL_error != null) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (intValue < 60) {
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                twoStepVerificationActivity.v0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                return;
            }
            twoStepVerificationActivity.v0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.C = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            if (!h0(password, false)) {
                org.telegram.ui.Components.y4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.G;
                if ((bArr != null && bArr.length > 0) || !twoStepVerificationActivity.E.has_password) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                twoStepVerificationActivity.F = z12;
            }
            l0(twoStepVerificationActivity.E);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.y0();
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            l0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.E);
            twoStepVerificationActivity.j0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        if (i9 != twoStepVerificationActivity.K && i9 != twoStepVerificationActivity.changePasswordRow) {
            if (i9 != twoStepVerificationActivity.M && i9 != twoStepVerificationActivity.N) {
                if (i9 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                    if (twoStepVerificationActivity.E.has_secure_values) {
                        string = org.telegram.messenger.l0.h(R.string.TurnPasswordOffPassport, ta.b.e(string, "\n\n"));
                    }
                    String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                    String string3 = LocaleController.getString(R.string.Disable);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.P = string;
                    c2Var.N = string2;
                    alertDialog$Builder.k(string3, new ef1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
                    twoStepVerificationActivity.showDialog(c2Var2);
                    TextView textView = (TextView) c2Var2.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
            ag1 ag1Var = new ag1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.E);
            ag1Var.F.add(twoStepVerificationActivity);
            ag1Var.C0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, true);
            twoStepVerificationActivity.presentFragment(ag1Var);
            return;
        }
        ag1 ag1Var2 = new ag1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.E);
        ag1Var2.F.add(twoStepVerificationActivity);
        ag1Var2.C0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, false);
        twoStepVerificationActivity.presentFragment(ag1Var2);
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.E.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ff1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.k0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ff1(twoStepVerificationActivity, 4), 10);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] computeSHA512;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.I = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                computeSHA512 = Utilities.computePBKDF2(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    computeSHA512 = Utilities.computeSHA512(bArr3, bArr, bArr3);
                }
                AndroidUtilities.runOnUIThread(new np0(twoStepVerificationActivity, z10, bArr2, 6));
            }
            twoStepVerificationActivity.H = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.I;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!wm0.Z0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.k0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ih.q5(5));
                twoStepVerificationActivity.I = null;
                twoStepVerificationActivity.H = 0L;
            }
        } else {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.H = 0L;
        }
        z10 = true;
        AndroidUtilities.runOnUIThread(new np0(twoStepVerificationActivity, z10, bArr2, 6));
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        twoStepVerificationActivity.n0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.E;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            lf1 lf1Var = new lf1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            lf1Var.F.add(twoStepVerificationActivity);
            lf1Var.C0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, false);
            twoStepVerificationActivity.presentFragment(lf1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            twoStepVerificationActivity.v0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            twoStepVerificationActivity.v0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static boolean h0(TL_account.Password password, boolean z10) {
        if (z10) {
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

    public static void l0(TL_account.Password password) {
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
    public final android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Object obj;
        if (i9 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.G = (byte[]) obj;
            }
            m0(false, false, null);
            y0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.T >= 0) {
            Bundle i9 = aa.d.i("afterSignup", true);
            ng0 ng0Var = new ng0();
            ng0Var.k0(i9);
            presentFragment(ng0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.k3.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36275x, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 8388608, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36267b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        TextView textView = this.d;
        int i13 = org.telegram.ui.ActionBar.f6.D6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36270f, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36271n, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23229q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36273s, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36273s, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36273s, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36273s, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
        return arrayList;
    }

    public final void i0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.CancelPasswordResetYes), new ef1(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.CancelReset);
        String string = LocaleController.getString(R.string.CancelPasswordReset);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.P = string;
        showDialog(c2Var);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0() {
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
        o0(false);
        Utilities.globalQueue.postRunnable(new n21(22, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP k0() {
        TL_account.Password password = this.E;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return SRPHelper.startCheck(this.G, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void m0(boolean z10, boolean z11, Runnable runnable) {
        if (!z11) {
            this.C = true;
            mf1 mf1Var = this.f36266a;
            if (mf1Var != null) {
                mf1Var.l();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ih.b6(this, z11, z10, runnable), 10);
    }

    public final void n0() {
        if (!this.F) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.U, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.U, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f36274w;
        if (c2Var == null) {
            return;
        }
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f36274w = null;
    }

    public final void o0(boolean z10) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f36274w == null) {
            if (!this.F) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.U, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.f36274w = c2Var;
            c2Var.f22766c0 = false;
            if (z10) {
                c2Var.q(300L);
            } else {
                c2Var.show();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.T >= 0) {
            if (z10) {
                w0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i9;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.pi0 pi0Var = this.f36268c;
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i9 = 0;
                pi0Var.setVisibility(i9);
            }
        }
        i9 = 8;
        pi0Var.setVisibility(i9);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0(null);
        y0();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Y);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        this.D = true;
        org.telegram.ui.ActionBar.c2 c2Var = this.f36274w;
        if (c2Var != null) {
            try {
                c2Var.dismiss();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.f36274w = null;
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
                q0();
                this.S = false;
            } else if (this.J) {
                t0();
                this.J = false;
            }
        }
    }

    public final void p0(org.telegram.ui.Components.fc0 fc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        fc0Var.a(1.0f);
        AndroidUtilities.shakeViewSpring(fc0Var, 5.0f, new gf1(this, 3));
    }

    public final void q0() {
        TL_account.Password password = this.E;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            o0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ff1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.E.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.E.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new ef1(this, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                    String string = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.P = string;
                    showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                }
                i0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ef1(this, 4));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ResetPassword);
            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
            c2Var2.P = string2;
            showDialog(c2Var2);
        }
    }

    public final void r0(Runnable runnable) {
        boolean z10;
        byte[] bArr;
        TL_account.Password password = this.E;
        if (password != null && password.current_algo != null && (bArr = this.G) != null && bArr.length > 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (password != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0(true, z10, runnable);
    }

    public final void s0() {
        if (!this.F) {
            String obj = this.f36273s.getText().toString();
            if (obj.length() == 0) {
                p0(this.v, this.f36273s, false);
                return;
            }
            byte[] stringBytes = AndroidUtilities.getStringBytes(obj);
            o0(false);
            Utilities.globalQueue.postRunnable(new n21(21, this, stringBytes));
        }
    }

    public final void t0() {
        o0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ff1(this, 0));
    }

    public final void u0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        boolean z10;
        this.E = password;
        this.G = bArr;
        this.I = bArr2;
        this.H = j10;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F = z10;
    }

    public final void v0(String str, String str2) {
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

    public final void w0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.T, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new ef1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.x0():void");
    }

    public final void y0() {
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
                int i9 = this.P;
                this.P = i9 + 1;
                this.O = i9;
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
        if (this.f36266a != null && !sb2.toString().equals(sb3.toString())) {
            this.f36266a.l();
        }
        if (this.fragmentView != null) {
            if (!this.C && !this.F) {
                org.telegram.ui.Components.wk0 wk0Var = this.f36267b;
                if (wk0Var != null) {
                    wk0Var.setEmptyView(null);
                    this.f36267b.setVisibility(4);
                    this.f36276y.setVisibility(0);
                    this.f36275x.setVisibility(4);
                }
                if (this.f36273s != null) {
                    this.A.e(true, false);
                    this.f36273s.setVisibility(0);
                    View view = this.fragmentView;
                    int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                    this.fragmentView.setTag(Integer.valueOf(i10));
                    this.d.setVisibility(0);
                    this.f36271n.setVisibility(0);
                    x0();
                    this.f36270f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.E.hint)) {
                        this.f36273s.setHint(this.E.hint);
                    } else {
                        this.f36273s.setHint((CharSequence) null);
                    }
                    AndroidUtilities.runOnUIThread(new gf1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.wk0 wk0Var2 = this.f36267b;
            if (wk0Var2 != null) {
                wk0Var2.setVisibility(0);
                this.f36276y.setVisibility(4);
                this.f36267b.setEmptyView(this.f36275x);
            }
            if (this.f36273s != null) {
                this.A.e(false, false);
                this.f36273s.setVisibility(4);
                this.d.setVisibility(4);
                this.f36270f.setVisibility(8);
                this.f36271n.setVisibility(4);
                x0();
            }
            View view2 = this.fragmentView;
            int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
            view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.fragmentView.setTag(Integer.valueOf(i11));
        }
    }
}
