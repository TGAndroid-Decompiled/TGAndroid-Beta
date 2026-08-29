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
    public org.telegram.ui.Components.u10 A;
    public org.telegram.ui.Components.u21 B;
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
    public final if1 R;
    public boolean S;
    public int T;
    public mf1 U;
    public int V;
    public String W;
    public pf1 X;
    public final if1 Y;
    public of1 f36331a;
    public org.telegram.ui.Components.jl0 f36332b;
    public org.telegram.ui.Components.aj0 f36333c;
    private int changePasswordRow;
    public TextView d;
    public TextView f36334e;
    public TextView f36335f;
    public TextView h;
    public org.telegram.ui.ActionBar.h5 f36336n;
    public TextView f36337r;
    public EditTextBoldCursor f36338s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.uc0 v;
    public org.telegram.ui.ActionBar.c2 f36339w;
    public org.telegram.ui.Components.hz f36340x;
    public ScrollView f36341y;

    public TwoStepVerificationActivity() {
        super(null);
        this.F = true;
        this.G = new byte[0];
        this.R = new if1(this, 1);
        this.T = -1;
        this.Y = new if1(this, 2);
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
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new hf1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.q0(twoStepVerificationActivity.v, twoStepVerificationActivity.f36338s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void X(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.X == null || !z10) {
            twoStepVerificationActivity.o0();
        }
        if (z10) {
            twoStepVerificationActivity.G = bArr;
            twoStepVerificationActivity.F = true;
            if (twoStepVerificationActivity.X != null) {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36338s);
                twoStepVerificationActivity.X.i(twoStepVerificationActivity.l0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.E.email_unconfirmed_pattern)) {
                cg1 cg1Var = new cg1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.E);
                cg1Var.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, true);
                twoStepVerificationActivity.presentFragment(cg1Var, true);
                return;
            } else {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36338s);
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
        org.telegram.ui.Components.c5.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
    }

    public static void Y(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.E.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        jr0 jr0Var = new jr0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.E;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                jr0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, jr0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        jr0Var.run(null, tL_error2);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new hf1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.o0();
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
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                return;
            }
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.C = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.E = password;
            if (!i0(password, false)) {
                org.telegram.ui.Components.c5.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
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
        if (i10 != twoStepVerificationActivity.K && i10 != twoStepVerificationActivity.changePasswordRow) {
            if (i10 != twoStepVerificationActivity.M && i10 != twoStepVerificationActivity.N) {
                if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                    if (twoStepVerificationActivity.E.has_secure_values) {
                        string = org.telegram.messenger.x3.i(R.string.TurnPasswordOffPassport, u3.c.f(string, "\n\n"));
                    }
                    String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                    String string3 = LocaleController.getString(R.string.Disable);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.P = string;
                    c2Var.N = string2;
                    alertDialog$Builder.k(string3, new gf1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
                    twoStepVerificationActivity.showDialog(c2Var2);
                    TextView textView = (TextView) c2Var2.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
            cg1 cg1Var = new cg1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.E);
            cg1Var.F.add(twoStepVerificationActivity);
            cg1Var.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, true);
            twoStepVerificationActivity.presentFragment(cg1Var);
            return;
        }
        cg1 cg1Var2 = new cg1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.E);
        cg1Var2.F.add(twoStepVerificationActivity);
        cg1Var2.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, false);
        twoStepVerificationActivity.presentFragment(cg1Var2);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.E.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new hf1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.l0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new hf1(twoStepVerificationActivity, 4), 10);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
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
                AndroidUtilities.runOnUIThread(new mp0(twoStepVerificationActivity, z10, bArr2, 6));
            }
            twoStepVerificationActivity.H = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.I;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!vm0.Z0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new lh.o5(5));
                twoStepVerificationActivity.I = null;
                twoStepVerificationActivity.H = 0L;
            }
        } else {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.H = 0L;
        }
        z10 = true;
        AndroidUtilities.runOnUIThread(new mp0(twoStepVerificationActivity, z10, bArr2, 6));
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        twoStepVerificationActivity.o0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.E;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            nf1 nf1Var = new nf1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            nf1Var.F.add(twoStepVerificationActivity);
            nf1Var.D0(twoStepVerificationActivity.G, twoStepVerificationActivity.H, twoStepVerificationActivity.I, false);
            twoStepVerificationActivity.presentFragment(nf1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static boolean i0(TL_account.Password password, boolean z10) {
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
    public final android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
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
        if (this.T >= 0) {
            Bundle i10 = a4.w.i("afterSignup", true);
            ng0 ng0Var = new ng0();
            ng0Var.l0(i10);
            presentFragment(ng0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.h3.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36340x, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23279p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 4, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 8388608, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36332b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        TextView textView = this.d;
        int i14 = org.telegram.ui.ActionBar.g6.D6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36335f, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36336n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36338s, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36338s, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36338s, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36338s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.CancelPasswordResetYes), new gf1(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.CancelReset);
        String string = LocaleController.getString(R.string.CancelPasswordReset);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.P = string;
        showDialog(c2Var);
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
        Utilities.globalQueue.postRunnable(new t31(19, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP l0() {
        TL_account.Password password = this.E;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return SRPHelper.startCheck(this.G, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void n0(boolean z10, boolean z11, Runnable runnable) {
        if (!z11) {
            this.C = true;
            of1 of1Var = this.f36331a;
            if (of1Var != null) {
                of1Var.l();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new lh.y5(this, z11, z10, runnable), 10);
    }

    public final void o0() {
        if (!this.F) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.U, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.U, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f36339w;
        if (c2Var == null) {
            return;
        }
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f36339w = null;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.T >= 0) {
            if (z10) {
                x0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.aj0 aj0Var = this.f36333c;
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                aj0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        aj0Var.setVisibility(i10);
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
        org.telegram.ui.ActionBar.c2 c2Var = this.f36339w;
        if (c2Var != null) {
            try {
                c2Var.dismiss();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.f36339w = null;
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
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f36339w == null) {
            if (!this.F) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.U, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.f36339w = c2Var;
            c2Var.f22783c0 = false;
            if (z10) {
                c2Var.q(300L);
            } else {
                c2Var.show();
            }
        }
    }

    public final void q0(org.telegram.ui.Components.uc0 uc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        uc0Var.a(1.0f);
        AndroidUtilities.shakeViewSpring(uc0Var, 5.0f, new if1(this, 3));
    }

    public final void r0() {
        TL_account.Password password = this.E;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            p0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new hf1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.E.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.E.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new gf1(this, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ResetPassword);
                    String string = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.P = string;
                    showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                        return;
                    }
                    return;
                }
                j0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new gf1(this, 4));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.ResetPassword);
            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
            c2Var2.P = string2;
            showDialog(c2Var2);
        }
    }

    public final void s0(Runnable runnable) {
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
        n0(true, z10, runnable);
    }

    public final void t0() {
        if (!this.F) {
            String obj = this.f36338s.getText().toString();
            if (obj.length() == 0) {
                q0(this.v, this.f36338s, false);
                return;
            }
            byte[] stringBytes = AndroidUtilities.getStringBytes(obj);
            p0(false);
            Utilities.globalQueue.postRunnable(new t31(18, this, stringBytes));
        }
    }

    public final void u0() {
        p0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new hf1(this, 0));
    }

    public final void v0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
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

    public final void w0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void x0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.T, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new gf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.y0():void");
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
        if (this.f36331a != null && !sb2.toString().equals(sb3.toString())) {
            this.f36331a.l();
        }
        if (this.fragmentView != null) {
            if (!this.C && !this.F) {
                org.telegram.ui.Components.jl0 jl0Var = this.f36332b;
                if (jl0Var != null) {
                    jl0Var.setEmptyView(null);
                    this.f36332b.setVisibility(4);
                    this.f36341y.setVisibility(0);
                    this.f36340x.setVisibility(4);
                }
                if (this.f36338s != null) {
                    this.A.e(true, false);
                    this.f36338s.setVisibility(0);
                    View view = this.fragmentView;
                    int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    this.fragmentView.setTag(Integer.valueOf(i11));
                    this.d.setVisibility(0);
                    this.f36336n.setVisibility(0);
                    y0();
                    this.f36335f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.E.hint)) {
                        this.f36338s.setHint(this.E.hint);
                    } else {
                        this.f36338s.setHint((CharSequence) null);
                    }
                    AndroidUtilities.runOnUIThread(new if1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.jl0 jl0Var2 = this.f36332b;
            if (jl0Var2 != null) {
                jl0Var2.setVisibility(0);
                this.f36341y.setVisibility(4);
                this.f36332b.setEmptyView(this.f36340x);
            }
            if (this.f36338s != null) {
                this.A.e(false, false);
                this.f36338s.setVisibility(4);
                this.d.setVisibility(4);
                this.f36335f.setVisibility(8);
                this.f36336n.setVisibility(4);
                y0();
            }
            View view2 = this.fragmentView;
            int i12 = org.telegram.ui.ActionBar.g6.f23009a7;
            view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.fragmentView.setTag(Integer.valueOf(i12));
        }
    }
}
