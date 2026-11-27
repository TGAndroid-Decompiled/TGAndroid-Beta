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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public ScrollView E;
    public zp4 F;
    public w2c G;
    public boolean H;
    public boolean I;
    public TL_account.Password J;
    public boolean K;
    public byte[] L;
    public long M;
    public byte[] N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final u6c W;
    public boolean X;
    public int Y;
    public y6c Z;
    public a7c a;
    public byte a0;
    public d79 b;
    public String b0;
    public e29 c;
    public b7c c0;
    private int changePasswordRow;
    public TextView d;
    public final u6c d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public ema n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public lu7 w;
    public id x;
    public b34 y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new u6c(this, (byte) 2);
        this.Y = -1;
        this.d0 = new u6c(this, (byte) 3);
    }

    public static boolean a0(TL_account.Password password, boolean z) {
        if (z) {
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

    public static void e0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(TL_account.Password password, byte[] bArr, long j, byte[] bArr2) {
        boolean z;
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j;
        if ((bArr != null && bArr.length > 0) || !password.has_password) {
            z = true;
        } else {
            z = false;
        }
        this.K = z;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        showDialog(idVar);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131742579, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(ob6.M0(2131743588, null), null);
        alertDialog$Builder.g(ob6.M0(2131750554, null), new t15(this, (byte) 1));
        yob.X((TextView) alertDialog$Builder.o().c(-2), aob.q7, null);
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.D0():void");
    }

    public final void E0() {
        TL_account.Password password;
        StringBuilder sb = new StringBuilder();
        sb.append(this.P);
        sb.append(this.Q);
        sb.append(this.changePasswordRow);
        sb.append(this.turnPasswordOffRow);
        sb.append(this.R);
        sb.append(this.S);
        sb.append(this.T);
        sb.append(this.U);
        this.U = 0;
        this.P = -1;
        this.Q = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        if (!this.H && (password = this.J) != null && this.K) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.U = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.U = 3;
                    this.S = 2;
                } else {
                    this.U = 3;
                    this.R = 2;
                }
                this.U = 4;
                this.T = 3;
            } else {
                this.P = 0;
                this.U = 2;
                this.Q = 1;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.P);
        sb2.append(this.Q);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        sb2.append(this.U);
        if (this.a != null && !sb.toString().equals(sb2.toString())) {
            this.a.f();
        }
        if (this.fragmentView != null) {
            if (!this.H && !this.K) {
                d79 d79Var = this.b;
                if (d79Var != null) {
                    d79Var.setEmptyView(null);
                    this.b.setVisibility(4);
                    this.E.setVisibility(0);
                    this.y.setVisibility(4);
                }
                if (this.s != null) {
                    this.F.e(true, false);
                    this.s.setVisibility(0);
                    View view = this.fragmentView;
                    int i = aob.d6;
                    yob.h(i, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i));
                    this.d.setVisibility(0);
                    this.n.setVisibility(0);
                    D0();
                    this.f.setVisibility(8);
                    boolean isEmpty = TextUtils.isEmpty(this.J.hint);
                    EditTextBoldCursor editTextBoldCursor = this.s;
                    if (!isEmpty) {
                        editTextBoldCursor.setHint(this.J.hint);
                    } else {
                        editTextBoldCursor.setHint((CharSequence) null);
                    }
                    hl.d3(new u6c(this, (byte) 0), 200L);
                    return;
                }
                return;
            }
            d79 d79Var2 = this.b;
            if (d79Var2 != null) {
                d79Var2.setVisibility(0);
                this.E.setVisibility(4);
                this.b.setEmptyView(this.y);
            }
            if (this.s != null) {
                this.F.e(false, false);
                this.s.setVisibility(4);
                this.d.setVisibility(4);
                this.f.setVisibility(8);
                this.n.setVisibility(4);
                D0();
            }
            View view2 = this.fragmentView;
            int i2 = aob.a7;
            yob.h(i2, null, view2);
            this.fragmentView.setTag(Integer.valueOf(i2));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131752556, null), new t15(this, (byte) 2));
        alertDialog$Builder.g(ob6.M0(2131752557, null), null);
        String M0 = ob6.M0(2131752552, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752558, null);
        showDialog(idVar);
    }

    public final void c0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        yac.h(this.currentAccount).t();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        t0(false);
        Utilities.e.c(new hab(this, updatepasswordsettings, (byte) 27));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    public final TLRPC.TL_inputCheckPasswordSRP d0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return es9.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == jn7.p0) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            r0(null, false, false);
            E0();
        }
    }

    public final void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
            c0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.Y >= 0) {
            Bundle l = bs2.l("afterSignup", true);
            fj6 fj6Var = new fj6();
            fj6Var.s0(l);
            presentFragment(fj6Var, true);
            return;
        }
        super.finishFragment();
    }

    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
            c0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D6));
        arrayList.add(new apb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        return arrayList;
    }

    public final void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t6c(this, (byte) 6), 8);
            return;
        }
        s0();
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                this.J = null;
                this.L = new byte[0];
                jn7.f(this.currentAccount).k(jn7.r0, new Object[0]);
                jn7.f(this.currentAccount).k(jn7.q0, new Object[0]);
                finishFragment();
            }
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = ob6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = ob6.G(intValue / 60, "Minutes", new Object[0]);
            }
            B0(ob6.M0(2131689472, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
        } else {
            B0(ob6.M0(2131689472, null), tL_error.text);
        }
    }

    public final void i0(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.J.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t6c(this, (byte) 3), 8);
                return;
            }
            updatepasswordsettings.password = d0();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new t6c(this, (byte) 4), 10);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(int i) {
        if (i != this.P && i != this.changePasswordRow) {
            if (i != this.R && i != this.S) {
                if (i == this.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131743595, null);
                    if (this.J.has_secure_values) {
                        StringBuilder l = c00.l(M0, "\n\n");
                        l.append(ob6.M0(2131743596, null));
                        M0 = l.toString();
                    }
                    String M02 = ob6.M0(2131743594, null);
                    String M03 = ob6.M0(2131751400, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.U = M0;
                    idVar.S = M02;
                    alertDialog$Builder.j(M03, new t15(this, (byte) 3));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar);
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            o7c o7cVar = new o7c(this.currentAccount, 3, this.J);
            o7cVar.K.add(this);
            o7cVar.I0(this.L, this.M, this.N, true);
            presentFragment(o7cVar);
            return;
        }
        o7c o7cVar2 = new o7c(this.currentAccount, 0, this.J);
        o7cVar2.K.add(this);
        o7cVar2.I0(this.L, this.M, this.N, false);
        presentFragment(o7cVar2);
    }

    public final void k0(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        boolean z3;
        if (tL_error == null) {
            this.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            if (!a0(password, false)) {
                jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
                return;
            }
            if (!z || z2) {
                byte[] bArr = this.L;
                if ((bArr != null && bArr.length > 0) || !this.J.has_password) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.K = z3;
            }
            e0(this.J);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        E0();
    }

    public final void l0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        s0();
        if (tL_error == null) {
            TL_account.Password password = this.J;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            z6c z6cVar = new z6c(this, this.currentAccount, password);
            z6cVar.K.add(this);
            z6cVar.I0(this.L, this.M, this.N, false);
            presentFragment(z6cVar);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = ob6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = ob6.G(intValue / 60, "Minutes", new Object[0]);
            }
            B0(ob6.M0(2131689472, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
        } else {
            B0(ob6.M0(2131689472, null), tL_error.text);
        }
    }

    public final void m0(byte[] bArr, boolean z) {
        if (this.c0 == null || !z) {
            s0();
        }
        if (z) {
            this.L = bArr;
            this.K = true;
            if (this.c0 != null) {
                hl.t1(this.s);
                this.c0.h(d0());
                return;
            } else if (!TextUtils.isEmpty(this.J.email_unconfirmed_pattern)) {
                o7c o7cVar = new o7c(this.currentAccount, 5, this.J);
                o7cVar.I0(this.L, this.M, this.N, true);
                presentFragment(o7cVar, true);
                return;
            } else {
                hl.t1(this.s);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.K = true;
                twoStepVerificationActivity.L = this.L;
                twoStepVerificationActivity.J = this.J;
                twoStepVerificationActivity.N = this.N;
                twoStepVerificationActivity.M = this.M;
                presentFragment(twoStepVerificationActivity, true);
                return;
            }
        }
        jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
    }

    public final void n0(byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z;
        byte[] s;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            this.N = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z = false;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                s = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s = Utilities.s(bArr3, bArr, bArr3);
                }
                hl.c3(new yn6(this, z, bArr2, (byte) 26));
            }
            this.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s, 32, bArr5, 0, 16);
            byte[] bArr6 = this.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!b18.S0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = d0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new xe2((byte) 0));
                this.N = null;
                this.M = 0L;
            }
        } else {
            this.N = null;
            this.M = 0L;
        }
        z = true;
        hl.c3(new yn6(this, z, bArr2, (byte) 26));
    }

    public final void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.J);
            y0();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.Y >= 0) {
            if (z) {
                C0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        e29 e29Var = this.c;
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                e29Var.setVisibility(i);
            }
        }
        i = 8;
        e29Var.setVisibility(i);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        jn7.f(this.currentAccount).b(this, jn7.p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        hl.r(this.d0);
        jn7.f(this.currentAccount).n(this, jn7.p0);
        this.I = true;
        id idVar = this.x;
        if (idVar != null) {
            try {
                idVar.dismiss();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.x = null;
        }
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            b34 b34Var = this.y;
            if (b34Var != null) {
                b34Var.setProgressBarColor(aob.w0(null, aob.h6, false));
            }
            w2c w2cVar = this.G;
            if (w2cVar != null) {
                w2cVar.setColor(aob.w0(null, aob.O9, false));
            }
            y6c y6cVar = this.Z;
            if (y6cVar != null) {
                y6cVar.setProgressColor(aob.w0(null, aob.l6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            if (this.X) {
                w0();
                this.X = false;
            } else if (this.O) {
                z0();
                this.O = false;
            }
        }
    }

    public final void p0(TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t6c(this, (byte) 5), 8);
            return;
        }
        s0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            u0(this.w, this.s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = ob6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = ob6.G(intValue / 60, "Minutes", new Object[0]);
            }
            B0(ob6.M0(2131689472, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
        } else {
            B0(ob6.M0(2131689472, null), tL_error.text);
        }
    }

    public final void q0(byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.J.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = es9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        qn8 qn8Var = new qn8(this, bArr, bArr2, (byte) 26);
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = es9.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                qn8Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, qn8Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        qn8Var.run(null, tL_error2);
    }

    public final void r0(Runnable runnable, boolean z, boolean z2) {
        if (!z2) {
            this.H = true;
            a7c a7cVar = this.a;
            if (a7cVar != null) {
                a7cVar.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new l5b(this, z2, z, runnable), 10);
    }

    public final void s0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(k43.f);
            animatorSet.start();
            return;
        }
        id idVar = this.x;
        if (idVar == null) {
            return;
        }
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.x = null;
    }

    public final void t0(boolean z) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.x == null) {
            if (!this.K) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(k43.f);
                animatorSet.start();
                return;
            }
            id idVar = new id(3, null, getParentActivity());
            this.x = idVar;
            idVar.j0 = false;
            if (z) {
                idVar.q(300L);
            } else {
                idVar.show();
            }
        }
    }

    public final void u0(lu7 lu7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        lu7Var.a(1.0f);
        hl.A3(5.0f, lu7Var, new u6c(this, (byte) 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            t0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new t6c(this, (byte) 1), 10);
        } else if (getParentActivity() != null) {
            if (this.J.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.J.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131745845, null), new t15(this, (byte) 4));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    String M0 = ob6.M0(2131745820, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131745793, null);
                    showDialog(idVar);
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
                        return;
                    }
                    return;
                }
                b0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.j(ob6.M0(2131745845, null), new t15(this, (byte) 5));
            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
            String M02 = ob6.M0(2131745820, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M02;
            idVar2.U = ob6.M0(2131745799, null);
            showDialog(idVar2);
        }
    }

    public final void x0(Runnable runnable) {
        boolean z;
        byte[] bArr;
        TL_account.Password password = this.J;
        if (password != null && password.current_algo != null && (bArr = this.L) != null && bArr.length > 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (password != null) {
            z = true;
        } else {
            z = false;
        }
        r0(runnable, true, z);
    }

    public final void y0() {
        if (!this.K) {
            String obj = this.s.getText().toString();
            if (obj.length() == 0) {
                u0(this.w, this.s, false);
                return;
            }
            byte[] g1 = hl.g1(obj);
            t0(false);
            Utilities.e.c(new hab(this, g1, (byte) 25));
        }
    }

    public final void z0() {
        t0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new t6c(this, (byte) 0));
    }
}
