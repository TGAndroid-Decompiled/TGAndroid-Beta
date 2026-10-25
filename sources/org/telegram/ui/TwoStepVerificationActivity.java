package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.j20 E;
    public org.telegram.ui.Components.m41 F;
    public boolean G;
    public boolean H;
    public TL_account.Password I;
    public boolean J;
    public byte[] K;
    public long L;
    public byte[] M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public final jf1 V;
    public boolean W;
    public int X;
    public nf1 Y;
    public int Z;
    public pf1 f36299a;
    public String f36300a0;
    public org.telegram.ui.Components.mm0 f36301b;
    public qf1 f36302b0;
    public org.telegram.ui.Components.ak0 f36303c;
    public final jf1 f36304c0;
    private int changePasswordRow;
    public TextView d;
    public TextView e;
    public TextView f36305f;
    public TextView h;
    public org.telegram.ui.ActionBar.b6 f36306n;
    public TextView f36307r;
    public EditTextBoldCursor f36308s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.rd0 v;
    public org.telegram.ui.ActionBar.e2 f36309w;
    public org.telegram.ui.Components.uz f36310x;
    public ScrollView f36311y;

    public TwoStepVerificationActivity() {
        super(null);
        this.J = true;
        this.K = new byte[0];
        this.V = new jf1(this, 1);
        this.X = -1;
        this.f36304c0 = new jf1(this, 2);
    }

    public static void V(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            n0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.I);
            twoStepVerificationActivity.l0();
        }
    }

    public static void W(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            n0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.I);
            twoStepVerificationActivity.u0();
        }
    }

    public static void X(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new if1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.p0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.r0(twoStepVerificationActivity.v, twoStepVerificationActivity.f36308s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            twoStepVerificationActivity.x0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            twoStepVerificationActivity.x0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void Y(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.f36302b0 == null || !z10) {
            twoStepVerificationActivity.p0();
        }
        if (z10) {
            twoStepVerificationActivity.K = bArr;
            twoStepVerificationActivity.J = true;
            if (twoStepVerificationActivity.f36302b0 != null) {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36308s);
                twoStepVerificationActivity.f36302b0.j(twoStepVerificationActivity.m0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.I.email_unconfirmed_pattern)) {
                dg1 dg1Var = new dg1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.I);
                dg1Var.E0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
                twoStepVerificationActivity.presentFragment(dg1Var, true);
                return;
            } else {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f36308s);
                TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
                twoStepVerificationActivity2.J = true;
                twoStepVerificationActivity2.K = twoStepVerificationActivity.K;
                twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
                twoStepVerificationActivity2.M = twoStepVerificationActivity.M;
                twoStepVerificationActivity2.L = twoStepVerificationActivity.L;
                twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
                return;
            }
        }
        org.telegram.ui.Components.g5.w0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.I.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        as0 as0Var = new as0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                as0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, as0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        as0Var.run(null, tL_error2);
    }

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new if1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.p0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.K = new byte[0];
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
                twoStepVerificationActivity.x0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                return;
            }
            twoStepVerificationActivity.x0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        boolean z12;
        if (tL_error == null) {
            twoStepVerificationActivity.G = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            if (!j0(password, false)) {
                org.telegram.ui.Components.g5.w0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.K;
                if ((bArr != null && bArr.length > 0) || !twoStepVerificationActivity.I.has_password) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                twoStepVerificationActivity.J = z12;
            }
            n0(twoStepVerificationActivity.I);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.I);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.A0();
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            n0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.I);
            twoStepVerificationActivity.l0();
        }
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 != twoStepVerificationActivity.O && i10 != twoStepVerificationActivity.changePasswordRow) {
            if (i10 != twoStepVerificationActivity.Q && i10 != twoStepVerificationActivity.R) {
                if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                    if (twoStepVerificationActivity.I.has_secure_values) {
                        string = org.telegram.messenger.t.h(R.string.TurnPasswordOffPassport, org.telegram.ui.Components.b10.l(string, "\n\n"));
                    }
                    String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                    String string3 = LocaleController.getString(R.string.Disable);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.T = string;
                    e2Var.R = string2;
                    alertDialog$Builder.k(string3, new hf1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22366a;
                    twoStepVerificationActivity.showDialog(e2Var2);
                    TextView textView = (TextView) e2Var2.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            dg1 dg1Var = new dg1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.I);
            dg1Var.J.add(twoStepVerificationActivity);
            dg1Var.E0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(dg1Var);
            return;
        }
        dg1 dg1Var2 = new dg1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.I);
        dg1Var2.J.add(twoStepVerificationActivity);
        dg1Var2.E0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
        twoStepVerificationActivity.presentFragment(dg1Var2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.I.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new if1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.m0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new if1(twoStepVerificationActivity, 4), 10);
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] computeSHA512;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.M = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                computeSHA512 = Utilities.computePBKDF2(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    computeSHA512 = Utilities.computeSHA512(bArr3, bArr, bArr3);
                }
                AndroidUtilities.runOnUIThread(new d80(twoStepVerificationActivity, z10, bArr2, 11));
            }
            twoStepVerificationActivity.L = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.M;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!in0.Z0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.m0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new di.d6(8));
                twoStepVerificationActivity.M = null;
                twoStepVerificationActivity.L = 0L;
            }
        } else {
            twoStepVerificationActivity.M = null;
            twoStepVerificationActivity.L = 0L;
        }
        z10 = true;
        AndroidUtilities.runOnUIThread(new d80(twoStepVerificationActivity, z10, bArr2, 11));
    }

    public static void g0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        twoStepVerificationActivity.p0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.I;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            of1 of1Var = new of1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            of1Var.J.add(twoStepVerificationActivity);
            of1Var.E0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
            twoStepVerificationActivity.presentFragment(of1Var);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            twoStepVerificationActivity.x0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            twoStepVerificationActivity.x0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static boolean j0(TL_account.Password password, boolean z10) {
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

    public static void n0(TL_account.Password password) {
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

    public final void A0() {
        TL_account.Password password;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O);
        sb2.append(this.P);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.Q);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        this.T = 0;
        this.O = -1;
        this.P = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        if (!this.G && (password = this.I) != null && this.J) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.T = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.T = 3;
                    this.R = 2;
                } else {
                    this.T = 3;
                    this.Q = 2;
                }
                int i10 = this.T;
                this.T = i10 + 1;
                this.S = i10;
            } else {
                this.O = 0;
                this.T = 2;
                this.P = 1;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.O);
        sb3.append(this.P);
        sb3.append(this.changePasswordRow);
        sb3.append(this.turnPasswordOffRow);
        sb3.append(this.Q);
        sb3.append(this.R);
        sb3.append(this.S);
        sb3.append(this.T);
        if (this.f36299a != null && !sb2.toString().equals(sb3.toString())) {
            this.f36299a.l();
        }
        if (this.fragmentView != null) {
            if (!this.G && !this.J) {
                org.telegram.ui.Components.mm0 mm0Var = this.f36301b;
                if (mm0Var != null) {
                    mm0Var.setEmptyView(null);
                    this.f36301b.setVisibility(4);
                    this.f36311y.setVisibility(0);
                    this.f36310x.setVisibility(4);
                }
                if (this.f36308s != null) {
                    this.E.e(true, false);
                    this.f36308s.setVisibility(0);
                    View view = this.fragmentView;
                    int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
                    org.telegram.ui.ActionBar.f7.i(i11, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i11));
                    this.d.setVisibility(0);
                    this.f36306n.setVisibility(0);
                    z0();
                    this.f36305f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.I.hint)) {
                        this.f36308s.setHint(this.I.hint);
                    } else {
                        this.f36308s.setHint((CharSequence) null);
                    }
                    AndroidUtilities.runOnUIThread(new jf1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.mm0 mm0Var2 = this.f36301b;
            if (mm0Var2 != null) {
                mm0Var2.setVisibility(0);
                this.f36311y.setVisibility(4);
                this.f36301b.setEmptyView(this.f36310x);
            }
            if (this.f36308s != null) {
                this.E.e(false, false);
                this.f36308s.setVisibility(4);
                this.d.setVisibility(4);
                this.f36305f.setVisibility(8);
                this.f36306n.setVisibility(4);
                z0();
            }
            View view2 = this.fragmentView;
            int i12 = org.telegram.ui.ActionBar.y6.f23297a7;
            org.telegram.ui.ActionBar.f7.i(i12, view2, null);
            this.fragmentView.setTag(Integer.valueOf(i12));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23579p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Object obj;
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.K = (byte[]) obj;
            }
            o0(false, false, null);
            A0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.X >= 0) {
            Bundle i10 = a1.g.i("afterSignup", true);
            pg0 pg0Var = new pg0();
            pg0Var.i0(i10);
            presentFragment(pg0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36310x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23426h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36308s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23482k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36308s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23500l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void k0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.CancelPasswordResetYes), new hf1(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.CancelReset);
        String string = LocaleController.getString(R.string.CancelPasswordReset);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.T = string;
        showDialog(e2Var);
    }

    public final void l0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.K;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        UserConfig.getInstance(this.currentAccount).resetSavedPassword();
        this.M = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        q0(false);
        Utilities.globalQueue.postRunnable(new zc1(6, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP m0() {
        TL_account.Password password = this.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return SRPHelper.startCheck(this.K, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void o0(boolean z10, boolean z11, Runnable runnable) {
        if (!z11) {
            this.G = true;
            pf1 pf1Var = this.f36299a;
            if (pf1Var != null) {
                pf1Var.l();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new di.o6(this, z11, z10, runnable), 10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.X >= 0) {
            if (z10) {
                y0();
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
        org.telegram.ui.Components.ak0 ak0Var = this.f36303c;
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                ak0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        ak0Var.setVisibility(i10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        t0(null);
        A0();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.f36304c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        this.H = true;
        org.telegram.ui.ActionBar.e2 e2Var = this.f36309w;
        if (e2Var != null) {
            try {
                e2Var.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.f36309w = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.uz uzVar = this.f36310x;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23426h6, false));
            }
            org.telegram.ui.Components.m41 m41Var = this.F;
            if (m41Var != null) {
                m41Var.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false));
            }
            nf1 nf1Var = this.Y;
            if (nf1Var != null) {
                nf1Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23500l6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            if (this.W) {
                s0();
                this.W = false;
            } else if (this.N) {
                v0();
                this.N = false;
            }
        }
    }

    public final void p0() {
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27584f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f36309w;
        if (e2Var == null) {
            return;
        }
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f36309w = null;
    }

    public final void q0(boolean z10) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f36309w == null) {
            if (!this.J) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
            this.f36309w = e2Var;
            e2Var.f22573i0 = false;
            if (z10) {
                e2Var.r(300L);
            } else {
                e2Var.show();
            }
        }
    }

    public final void r0(org.telegram.ui.Components.rd0 rd0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        rd0Var.a(1.0f);
        AndroidUtilities.shakeViewSpring(rd0Var, 5.0f, new jf1(this, 3));
    }

    public final void s0() {
        TL_account.Password password = this.I;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            q0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new if1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.I.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.I.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new hf1(this, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ResetPassword);
                    String string = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.T = string;
                    showDialog(e2Var);
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                        return;
                    }
                    return;
                }
                k0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new hf1(this, 4));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.f22366a.R = LocaleController.getString(R.string.ResetPassword);
            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22366a;
            e2Var2.T = string2;
            showDialog(e2Var2);
        }
    }

    public final void t0(Runnable runnable) {
        boolean z10;
        byte[] bArr;
        TL_account.Password password = this.I;
        if (password != null && password.current_algo != null && (bArr = this.K) != null && bArr.length > 0) {
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
        o0(true, z10, runnable);
    }

    public final void u0() {
        if (!this.J) {
            String obj = this.f36308s.getText().toString();
            if (obj.length() == 0) {
                r0(this.v, this.f36308s, false);
                return;
            }
            byte[] stringBytes = AndroidUtilities.getStringBytes(obj);
            q0(false);
            Utilities.globalQueue.postRunnable(new zc1(5, this, stringBytes));
        }
    }

    public final void v0() {
        q0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new if1(this, 0));
    }

    public final void w0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        boolean z10;
        this.I = password;
        this.K = bArr;
        this.M = bArr2;
        this.L = j10;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = z10;
    }

    public final void x0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = str;
        e2Var.T = str2;
        showDialog(e2Var);
    }

    public final void y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22366a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.X, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new hf1(this, 0));
        org.telegram.ui.ActionBar.f7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.y6.f23596q7, null);
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.z0():void");
    }
}
