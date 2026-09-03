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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.a20 B;
    public org.telegram.ui.Components.e31 C;
    public boolean D;
    public boolean E;
    public TL_account.Password F;
    public boolean G;
    public byte[] H;
    public long I;
    public byte[] J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final bg1 S;
    public boolean T;
    public int U;
    public fg1 V;
    public int W;
    public String X;
    public ig1 Y;
    public final bg1 Z;
    public hg1 f34911a;
    public org.telegram.ui.Components.sl0 f34912b;
    public org.telegram.ui.Components.kj0 f34913c;
    private int changePasswordRow;
    public TextView d;
    public TextView f34914e;
    public TextView f34915f;
    public TextView h;
    public org.telegram.ui.ActionBar.l5 f34916n;
    public TextView f34917r;
    public EditTextBoldCursor f34918s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.cd0 v;
    public org.telegram.ui.ActionBar.d2 f34919w;
    public org.telegram.ui.Components.oz f34920x;
    public ScrollView f34921y;

    public TwoStepVerificationActivity() {
        super(null);
        this.G = true;
        this.H = new byte[0];
        this.S = new bg1(this, 1);
        this.U = -1;
        this.Z = new bg1(this, 2);
    }

    public static void U(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
            twoStepVerificationActivity.k0();
        }
    }

    public static void V(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
            twoStepVerificationActivity.t0();
        }
    }

    public static void W(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ag1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.q0(twoStepVerificationActivity.v, twoStepVerificationActivity.f34918s, true);
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

    public static void X(TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, byte[] bArr) {
        if (twoStepVerificationActivity.Y == null || !z4) {
            twoStepVerificationActivity.o0();
        }
        if (z4) {
            twoStepVerificationActivity.H = bArr;
            twoStepVerificationActivity.G = true;
            if (twoStepVerificationActivity.Y != null) {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f34918s);
                twoStepVerificationActivity.Y.i(twoStepVerificationActivity.l0());
                return;
            } else if (!TextUtils.isEmpty(twoStepVerificationActivity.F.email_unconfirmed_pattern)) {
                vg1 vg1Var = new vg1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.F);
                vg1Var.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, true);
                twoStepVerificationActivity.presentFragment(vg1Var, true);
                return;
            } else {
                AndroidUtilities.hideKeyboard(twoStepVerificationActivity.f34918s);
                TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
                twoStepVerificationActivity2.G = true;
                twoStepVerificationActivity2.H = twoStepVerificationActivity.H;
                twoStepVerificationActivity2.F = twoStepVerificationActivity.F;
                twoStepVerificationActivity2.J = twoStepVerificationActivity.J;
                twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
                twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
                return;
            }
        }
        org.telegram.ui.Components.z4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
    }

    public static void Y(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.F.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        yr0 yr0Var = new yr0(twoStepVerificationActivity, bArr, bArr2, 12);
        TL_account.Password password = twoStepVerificationActivity.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                yr0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, yr0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        yr0Var.run(null, tL_error2);
    }

    public static void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ag1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.F = null;
            twoStepVerificationActivity.H = new byte[0];
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

    public static void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, boolean z10, Runnable runnable) {
        boolean z11;
        if (tL_error == null) {
            twoStepVerificationActivity.D = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            if (!i0(password, false)) {
                org.telegram.ui.Components.z4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            if (!z4 || z10) {
                byte[] bArr = twoStepVerificationActivity.H;
                if ((bArr != null && bArr.length > 0) || !twoStepVerificationActivity.F.has_password) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                twoStepVerificationActivity.G = z11;
            }
            m0(twoStepVerificationActivity.F);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.z0();
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
            twoStepVerificationActivity.k0();
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 != twoStepVerificationActivity.L && i10 != twoStepVerificationActivity.changePasswordRow) {
            if (i10 != twoStepVerificationActivity.N && i10 != twoStepVerificationActivity.O) {
                if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
                    String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                    if (twoStepVerificationActivity.F.has_secure_values) {
                        string = org.telegram.messenger.y3.h(R.string.TurnPasswordOffPassport, w.c.f(string, "\n\n"));
                    }
                    String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                    String string3 = LocaleController.getString(R.string.Disable);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.Q = string;
                    d2Var.O = string2;
                    alertDialog$Builder.k(string3, new zf1(twoStepVerificationActivity, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21168a;
                    twoStepVerificationActivity.showDialog(d2Var2);
                    TextView textView = (TextView) d2Var2.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
            vg1 vg1Var = new vg1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.F);
            vg1Var.G.add(twoStepVerificationActivity);
            vg1Var.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, true);
            twoStepVerificationActivity.presentFragment(vg1Var);
            return;
        }
        vg1 vg1Var2 = new vg1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.F);
        vg1Var2.G.add(twoStepVerificationActivity);
        vg1Var2.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, false);
        twoStepVerificationActivity.presentFragment(vg1Var2);
    }

    public static void d0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.F.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ag1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.l0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ag1(twoStepVerificationActivity, 4), 10);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z4;
        byte[] computeSHA512;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.J = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z4 = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                computeSHA512 = Utilities.computePBKDF2(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    computeSHA512 = Utilities.computeSHA512(bArr3, bArr, bArr3);
                }
                AndroidUtilities.runOnUIThread(new cr0(twoStepVerificationActivity, z4, bArr2, 4));
            }
            twoStepVerificationActivity.I = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.J;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!fn0.Z0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new oh.p5(4));
                twoStepVerificationActivity.J = null;
                twoStepVerificationActivity.I = 0L;
            }
        } else {
            twoStepVerificationActivity.J = null;
            twoStepVerificationActivity.I = 0L;
        }
        z4 = true;
        AndroidUtilities.runOnUIThread(new cr0(twoStepVerificationActivity, z4, bArr2, 4));
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        String formatPluralString;
        twoStepVerificationActivity.o0();
        if (tL_error == null) {
            TL_account.Password password = twoStepVerificationActivity.F;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            gg1 gg1Var = new gg1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
            gg1Var.G.add(twoStepVerificationActivity);
            gg1Var.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, false);
            twoStepVerificationActivity.presentFragment(gg1Var);
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

    public static boolean i0(TL_account.Password password, boolean z4) {
        if (z4) {
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
                this.H = (byte[]) obj;
            }
            n0(false, false, null);
            z0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.U >= 0) {
            Bundle i10 = android.support.v4.media.a.i("afterSignup", true);
            wg0 wg0Var = new wg0();
            wg0Var.l0(i10);
            presentFragment(wg0Var, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.j3.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34920x, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21734h6));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21878p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 8388608, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34912b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        TextView textView = this.d;
        int i14 = org.telegram.ui.ActionBar.k6.D6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34915f, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34916n, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21896q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34918s, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34918s, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34918s, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21787k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34918s, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21805l6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.CancelPasswordResetYes), new zf1(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.CancelReset);
        String string = LocaleController.getString(R.string.CancelPasswordReset);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.Q = string;
        showDialog(d2Var);
    }

    public final void k0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.H;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        UserConfig.getInstance(this.currentAccount).resetSavedPassword();
        this.J = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        p0(false);
        Utilities.globalQueue.postRunnable(new h21(26, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP l0() {
        TL_account.Password password = this.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return SRPHelper.startCheck(this.H, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    public final void n0(boolean z4, boolean z10, Runnable runnable) {
        if (!z10) {
            this.D = true;
            hg1 hg1Var = this.f34911a;
            if (hg1Var != null) {
                hg1Var.l();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new oh.z5(this, z10, z4, runnable), 10);
    }

    public final void o0() {
        if (!this.G) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.V, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.V, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f34919w;
        if (d2Var == null) {
            return;
        }
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.f34919w = null;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.U >= 0) {
            if (z4) {
                x0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.kj0 kj0Var = this.f34913c;
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                kj0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        kj0Var.setVisibility(i10);
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
        AndroidUtilities.cancelRunOnUIThread(this.Z);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        this.E = true;
        org.telegram.ui.ActionBar.d2 d2Var = this.f34919w;
        if (d2Var != null) {
            try {
                d2Var.dismiss();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.f34919w = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4) {
            if (this.T) {
                r0();
                this.T = false;
            } else if (this.K) {
                u0();
                this.K = false;
            }
        }
    }

    public final void p0(boolean z4) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.f34919w == null) {
            if (!this.G) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.V, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                animatorSet.start();
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.f34919w = d2Var;
            d2Var.f21243d0 = false;
            if (z4) {
                d2Var.q(300L);
            } else {
                d2Var.show();
            }
        }
    }

    public final void q0(org.telegram.ui.Components.cd0 cd0Var, EditTextBoldCursor editTextBoldCursor, boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            editTextBoldCursor.setText("");
        }
        cd0Var.a(1.0f);
        AndroidUtilities.shakeViewSpring(cd0Var, 5.0f, new bg1(this, 3));
    }

    public final void r0() {
        TL_account.Password password = this.F;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            p0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ag1(this, 1), 10);
        } else if (getParentActivity() != null) {
            if (this.F.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.F.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new zf1(this, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ResetPassword);
                    String string = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.Q = string;
                    showDialog(d2Var);
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                        return;
                    }
                    return;
                }
                j0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new zf1(this, 4));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.ResetPassword);
            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
            d2Var2.Q = string2;
            showDialog(d2Var2);
        }
    }

    public final void s0(Runnable runnable) {
        boolean z4;
        byte[] bArr;
        TL_account.Password password = this.F;
        if (password != null && password.current_algo != null && (bArr = this.H) != null && bArr.length > 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (password != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        n0(true, z4, runnable);
    }

    public final void t0() {
        if (!this.G) {
            String obj = this.f34918s.getText().toString();
            if (obj.length() == 0) {
                q0(this.v, this.f34918s, false);
                return;
            }
            byte[] stringBytes = AndroidUtilities.getStringBytes(obj);
            p0(false);
            Utilities.globalQueue.postRunnable(new h21(25, this, stringBytes));
        }
    }

    public final void u0() {
        p0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ag1(this, 0));
    }

    public final void v0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        boolean z4;
        this.F = password;
        this.H = bArr;
        this.J = bArr2;
        this.I = j10;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.G = z4;
    }

    public final void w0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void x0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f21168a.Q = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.U, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new zf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.y0():void");
    }

    public final void z0() {
        TL_account.Password password;
        StringBuilder sb = new StringBuilder();
        sb.append(this.L);
        sb.append(this.M);
        sb.append(this.changePasswordRow);
        sb.append(this.turnPasswordOffRow);
        sb.append(this.N);
        sb.append(this.O);
        sb.append(this.P);
        sb.append(this.Q);
        this.Q = 0;
        this.L = -1;
        this.M = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (!this.D && (password = this.F) != null && this.G) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.Q = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.Q = 3;
                    this.O = 2;
                } else {
                    this.Q = 3;
                    this.N = 2;
                }
                int i10 = this.Q;
                this.Q = i10 + 1;
                this.P = i10;
            } else {
                this.L = 0;
                this.Q = 2;
                this.M = 1;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.L);
        sb2.append(this.M);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.N);
        sb2.append(this.O);
        sb2.append(this.P);
        sb2.append(this.Q);
        if (this.f34911a != null && !sb.toString().equals(sb2.toString())) {
            this.f34911a.l();
        }
        if (this.fragmentView != null) {
            if (!this.D && !this.G) {
                org.telegram.ui.Components.sl0 sl0Var = this.f34912b;
                if (sl0Var != null) {
                    sl0Var.setEmptyView(null);
                    this.f34912b.setVisibility(4);
                    this.f34921y.setVisibility(0);
                    this.f34920x.setVisibility(4);
                }
                if (this.f34918s != null) {
                    this.B.e(true, false);
                    this.f34918s.setVisibility(0);
                    View view = this.fragmentView;
                    int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                    this.fragmentView.setTag(Integer.valueOf(i11));
                    this.d.setVisibility(0);
                    this.f34916n.setVisibility(0);
                    y0();
                    this.f34915f.setVisibility(8);
                    if (!TextUtils.isEmpty(this.F.hint)) {
                        this.f34918s.setHint(this.F.hint);
                    } else {
                        this.f34918s.setHint((CharSequence) null);
                    }
                    AndroidUtilities.runOnUIThread(new bg1(this, 0), 200L);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.sl0 sl0Var2 = this.f34912b;
            if (sl0Var2 != null) {
                sl0Var2.setVisibility(0);
                this.f34921y.setVisibility(4);
                this.f34912b.setEmptyView(this.f34920x);
            }
            if (this.f34918s != null) {
                this.B.e(false, false);
                this.f34918s.setVisibility(4);
                this.d.setVisibility(4);
                this.f34915f.setVisibility(8);
                this.f34916n.setVisibility(4);
                y0();
            }
            View view2 = this.fragmentView;
            int i12 = org.telegram.ui.ActionBar.k6.f21607a7;
            view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
            this.fragmentView.setTag(Integer.valueOf(i12));
        }
    }
}
