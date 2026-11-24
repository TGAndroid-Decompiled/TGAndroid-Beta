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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public ScrollView E;
    public wp4 F;
    public x0c G;
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
    public final u4c W;
    public boolean X;
    public int Y;
    public z4c Z;
    public b5c a;
    public byte a0;
    public r59 b;
    public String b0;
    public s09 c;
    public c5c c0;
    private int changePasswordRow;
    public TextView d;
    public final u4c d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public lka n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public gt7 w;
    public he x;
    public r34 y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new u4c(this, (byte) 2);
        this.Y = -1;
        this.d0 = new u4c(this, (byte) 3);
    }

    public static boolean b0(TL_account.Password password, boolean z) {
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

    public static void f0(TL_account.Password password) {
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
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        showDialog(heVar);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131742611, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(jb6.M0(2131743620, null), null);
        alertDialog$Builder.g(jb6.M0(2131750526, null), new o15(this, (byte) 1));
        anb.X((TextView) alertDialog$Builder.o().c(-2), cmb.p7, null);
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
                r59 r59Var = this.b;
                if (r59Var != null) {
                    r59Var.setEmptyView(null);
                    this.b.setVisibility(4);
                    this.E.setVisibility(0);
                    this.y.setVisibility(4);
                }
                if (this.s != null) {
                    this.F.e(true, false);
                    this.s.setVisibility(0);
                    View view = this.fragmentView;
                    int i = cmb.c6;
                    anb.h(i, null, view);
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
                    gm.d3(new u4c(this, (byte) 0), 200L);
                    return;
                }
                return;
            }
            r59 r59Var2 = this.b;
            if (r59Var2 != null) {
                r59Var2.setVisibility(0);
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
            int i2 = cmb.Z6;
            anb.h(i2, null, view2);
            this.fragmentView.setTag(Integer.valueOf(i2));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131752528, null), new o15(this, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752529, null), null);
        String M0 = jb6.M0(2131752524, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752530, null);
        showDialog(heVar);
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        z8c.h(this.currentAccount).t();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new x4c(this, updatepasswordsettings, (byte) 0));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == nm7.p0) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    public final TLRPC.TL_inputCheckPasswordSRP e0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return nq9.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    @Override
    public final void finishFragment() {
        if (this.Y >= 0) {
            Bundle l = ts2.l("afterSignup", true);
            bj6 bj6Var = new bj6();
            bj6Var.n0(l);
            presentFragment(bj6Var, true);
            return;
        }
        super.finishFragment();
    }

    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
            d0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        arrayList.add(new cnb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        return arrayList;
    }

    public final void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
            d0();
        }
    }

    public final void i0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t4c(this, (byte) 6), 8);
            return;
        }
        t0();
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                this.J = null;
                this.L = new byte[0];
                nm7.f(this.currentAccount).k(nm7.r0, new Object[0]);
                nm7.f(this.currentAccount).k(nm7.q0, new Object[0]);
                finishFragment();
            }
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            B0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
        } else {
            B0(jb6.M0(2131689472, null), tL_error.text);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.J.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t4c(this, (byte) 3), 8);
                return;
            }
            updatepasswordsettings.password = e0();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new t4c(this, (byte) 4), 10);
    }

    public final void k0(int i) {
        if (i != this.P && i != this.changePasswordRow) {
            if (i != this.R && i != this.S) {
                if (i == this.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131743627, null);
                    if (this.J.has_secure_values) {
                        StringBuilder k = b10.k(M0, "\n\n");
                        k.append(jb6.M0(2131743628, null));
                        M0 = k.toString();
                    }
                    String M02 = jb6.M0(2131743626, null);
                    String M03 = jb6.M0(2131751372, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.U = M0;
                    heVar.S = M02;
                    alertDialog$Builder.j(M03, new o15(this, (byte) 3));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    showDialog(heVar);
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            p5c p5cVar = new p5c(this.currentAccount, 3, this.J);
            p5cVar.K.add(this);
            p5cVar.I0(this.L, this.M, this.N, true);
            presentFragment(p5cVar);
            return;
        }
        p5c p5cVar2 = new p5c(this.currentAccount, 0, this.J);
        p5cVar2.K.add(this);
        p5cVar2.I0(this.L, this.M, this.N, false);
        presentFragment(p5cVar2);
    }

    public final void l0(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        boolean z3;
        if (tL_error == null) {
            this.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            if (!b0(password, false)) {
                ik.u0(getParentActivity(), jb6.M0(2131743507, null), true);
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
            f0(this.J);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        E0();
    }

    public final void m0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        t0();
        if (tL_error == null) {
            TL_account.Password password = this.J;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            a5c a5cVar = new a5c(this, this.currentAccount, password);
            a5cVar.K.add(this);
            a5cVar.I0(this.L, this.M, this.N, false);
            presentFragment(a5cVar);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            B0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
        } else {
            B0(jb6.M0(2131689472, null), tL_error.text);
        }
    }

    public final void n0(byte[] bArr, boolean z) {
        if (this.c0 == null || !z) {
            t0();
        }
        if (z) {
            this.L = bArr;
            this.K = true;
            if (this.c0 != null) {
                gm.t1(this.s);
                this.c0.h(e0());
                return;
            } else if (!TextUtils.isEmpty(this.J.email_unconfirmed_pattern)) {
                p5c p5cVar = new p5c(this.currentAccount, 5, this.J);
                p5cVar.I0(this.L, this.M, this.N, true);
                presentFragment(p5cVar, true);
                return;
            } else {
                gm.t1(this.s);
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
        ik.u0(getParentActivity(), jb6.M0(2131743507, null), true);
    }

    public final void o0(byte[] bArr, TLObject tLObject, byte[] bArr2) {
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
                gm.c3(new yl6(this, z, bArr2, (byte) 27));
            }
            this.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s, 32, bArr5, 0, 16);
            byte[] bArr6 = this.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!xz7.S0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = e0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new nf2((byte) 0));
                this.N = null;
                this.M = 0L;
            }
        } else {
            this.N = null;
            this.M = 0L;
        }
        z = true;
        gm.c3(new yl6(this, z, bArr2, (byte) 27));
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
        s09 s09Var = this.c;
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                s09Var.setVisibility(i);
            }
        }
        i = 8;
        s09Var.setVisibility(i);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        nm7.f(this.currentAccount).b(this, nm7.p0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        gm.r(this.d0);
        nm7.f(this.currentAccount).n(this, nm7.p0);
        this.I = true;
        he heVar = this.x;
        if (heVar != null) {
            try {
                heVar.dismiss();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.x = null;
        }
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r34 r34Var = this.y;
            if (r34Var != null) {
                r34Var.setProgressBarColor(cmb.w0(null, cmb.g6, false));
            }
            x0c x0cVar = this.G;
            if (x0cVar != null) {
                x0cVar.setColor(cmb.w0(null, cmb.N9, false));
            }
            z4c z4cVar = this.Z;
            if (z4cVar != null) {
                z4cVar.setProgressColor(cmb.w0(null, cmb.k6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
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

    public final void p0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.J);
            y0();
        }
    }

    public final void q0(TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t4c(this, (byte) 5), 8);
            return;
        }
        t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            v0(this.w, this.s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            B0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
        } else {
            B0(jb6.M0(2131689472, null), tL_error.text);
        }
    }

    public final void r0(byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.J.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = nq9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        fm8 fm8Var = new fm8(this, bArr, bArr2, (byte) 26);
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = nq9.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                fm8Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, fm8Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        fm8Var.run(null, tL_error2);
    }

    public final void s0(Runnable runnable, boolean z, boolean z2) {
        if (!z2) {
            this.H = true;
            b5c b5cVar = this.a;
            if (b5cVar != null) {
                b5cVar.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new p3b(this, z2, z, runnable), 10);
    }

    public final void t0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(d53.f);
            animatorSet.start();
            return;
        }
        he heVar = this.x;
        if (heVar == null) {
            return;
        }
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.x = null;
    }

    public final void u0(boolean z) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.x == null) {
            if (!this.K) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(d53.f);
                animatorSet.start();
                return;
            }
            he heVar = new he(3, null, getParentActivity());
            this.x = heVar;
            heVar.j0 = false;
            if (z) {
                heVar.q(300L);
            } else {
                heVar.show();
            }
        }
    }

    public final void v0(gt7 gt7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
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
        gt7Var.a(1.0f);
        gm.A3(5.0f, gt7Var, new u4c(this, (byte) 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new t4c(this, (byte) 1), 10);
        } else if (getParentActivity() != null) {
            if (this.J.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.J.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.j(jb6.M0(2131745851, null), new o15(this, (byte) 4));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    String M0 = jb6.M0(2131745826, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131745799, null);
                    showDialog(heVar);
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, null);
                        return;
                    }
                    return;
                }
                c0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.j(jb6.M0(2131745851, null), new o15(this, (byte) 5));
            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
            String M02 = jb6.M0(2131745826, null);
            he heVar2 = alertDialog$Builder2.a;
            heVar2.S = M02;
            heVar2.U = jb6.M0(2131745805, null);
            showDialog(heVar2);
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
        s0(runnable, true, z);
    }

    public final void y0() {
        if (!this.K) {
            String obj = this.s.getText().toString();
            if (obj.length() == 0) {
                v0(this.w, this.s, false);
                return;
            }
            byte[] g1 = gm.g1(obj);
            u0(false);
            Utilities.e.c(new b7b(this, g1, (byte) 29));
        }
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new t4c(this, (byte) 0));
    }
}
