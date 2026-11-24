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
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public ScrollView E;
    public un4 F;
    public wyb G;
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
    public final u2c W;
    public boolean X;
    public int Y;
    public y2c Z;
    public a3c a;
    public byte a0;
    public o39 b;
    public String b0;
    public ry8 c;
    public b3c c0;
    private int changePasswordRow;
    public TextView d;
    public final u2c d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public jia n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public er7 w;
    public hd x;
    public g24 y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new u2c(this, (byte) 2);
        this.Y = -1;
        this.d0 = new u2c(this, (byte) 3);
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

    public final void A0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        showDialog(hdVar);
    }

    public final void B0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131742685, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(k96.M0(2131743694, null), null);
        alertDialog$Builder.g(k96.M0(2131750577, null), new pz4(this, (byte) 1));
        zkb.X((TextView) alertDialog$Builder.o().c(-2), bkb.p7, null);
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.C0():void");
    }

    public final void D0() {
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
                o39 o39Var = this.b;
                if (o39Var != null) {
                    o39Var.setEmptyView(null);
                    this.b.setVisibility(4);
                    this.E.setVisibility(0);
                    this.y.setVisibility(4);
                }
                if (this.s != null) {
                    this.F.e(true, false);
                    this.s.setVisibility(0);
                    View view = this.fragmentView;
                    int i = bkb.c6;
                    zkb.h(i, null, view);
                    this.fragmentView.setTag(Integer.valueOf(i));
                    this.d.setVisibility(0);
                    this.n.setVisibility(0);
                    C0();
                    this.f.setVisibility(8);
                    boolean isEmpty = TextUtils.isEmpty(this.J.hint);
                    EditTextBoldCursor editTextBoldCursor = this.s;
                    if (!isEmpty) {
                        editTextBoldCursor.setHint(this.J.hint);
                    } else {
                        editTextBoldCursor.setHint((CharSequence) null);
                    }
                    gl.e3(new u2c(this, (byte) 0), 200L);
                    return;
                }
                return;
            }
            o39 o39Var2 = this.b;
            if (o39Var2 != null) {
                o39Var2.setVisibility(0);
                this.E.setVisibility(4);
                this.b.setEmptyView(this.y);
            }
            if (this.s != null) {
                this.F.e(false, false);
                this.s.setVisibility(4);
                this.d.setVisibility(4);
                this.f.setVisibility(8);
                this.n.setVisibility(4);
                C0();
            }
            View view2 = this.fragmentView;
            int i2 = bkb.Z6;
            zkb.h(i2, null, view2);
            this.fragmentView.setTag(Integer.valueOf(i2));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131752563, null), new pz4(this, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752564, null), null);
        String M0 = k96.M0(2131752559, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752565, null);
        showDialog(hdVar);
    }

    public final void c0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        y6c.h(this.currentAccount).t();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        t0(false);
        Utilities.e.c(new a5b(this, updatepasswordsettings, (byte) 28));
    }

    @Override
    public final android.view.View createView(android.content.Context r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TwoStepVerificationActivity.createView(android.content.Context):android.view.View");
    }

    public final TLRPC.TL_inputCheckPasswordSRP d0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            return mo9.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == kk7.o0) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            r0(null, false, false);
            D0();
        }
    }

    public final void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
            c0();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.Y >= 0) {
            Bundle l = ir2.l("afterSignup", true);
            ah6 ah6Var = new ah6();
            ah6Var.q0(l);
            presentFragment(ah6Var, true);
            return;
        }
        super.finishFragment();
    }

    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
            c0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        arrayList.add(new blb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        return arrayList;
    }

    public final void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t2c(this, (byte) 6), 8);
            return;
        }
        s0();
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                this.J = null;
                this.L = new byte[0];
                kk7.f(this.currentAccount).k(kk7.q0, new Object[0]);
                kk7.f(this.currentAccount).k(kk7.p0, new Object[0]);
                finishFragment();
            }
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = k96.G(intValue, "Seconds", new Object[0]);
            } else {
                G = k96.G(intValue / 60, "Minutes", new Object[0]);
            }
            A0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            A0(k96.M0(2131689472, null), tL_error.text);
        }
    }

    public final void i0(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.J.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t2c(this, (byte) 3), 8);
                return;
            }
            updatepasswordsettings.password = d0();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new t2c(this, (byte) 4), 10);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(int i) {
        if (i != this.P && i != this.changePasswordRow) {
            if (i != this.R && i != this.S) {
                if (i == this.turnPasswordOffRow) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131743701, null);
                    if (this.J.has_secure_values) {
                        StringBuilder k = b00.k(M0, "\n\n");
                        k.append(k96.M0(2131743702, null));
                        M0 = k.toString();
                    }
                    String M02 = k96.M0(2131743700, null);
                    String M03 = k96.M0(2131751423, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.U = M0;
                    hdVar.S = M02;
                    alertDialog$Builder.j(M03, new pz4(this, (byte) 3));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(hdVar);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            p3c p3cVar = new p3c(this.currentAccount, 3, this.J);
            p3cVar.K.add(this);
            p3cVar.H0(this.L, this.M, this.N, true);
            presentFragment(p3cVar);
            return;
        }
        p3c p3cVar2 = new p3c(this.currentAccount, 0, this.J);
        p3cVar2.K.add(this);
        p3cVar2.H0(this.L, this.M, this.N, false);
        presentFragment(p3cVar2);
    }

    public final void k0(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        boolean z3;
        if (tL_error == null) {
            this.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            if (!a0(password, false)) {
                ij.u0(getParentActivity(), k96.M0(2131743581, null), true);
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
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        D0();
    }

    public final void l0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        s0();
        if (tL_error == null) {
            TL_account.Password password = this.J;
            password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
            z2c z2cVar = new z2c(this, this.currentAccount, password);
            z2cVar.K.add(this);
            z2cVar.H0(this.L, this.M, this.N, false);
            presentFragment(z2cVar);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = k96.G(intValue, "Seconds", new Object[0]);
            } else {
                G = k96.G(intValue / 60, "Minutes", new Object[0]);
            }
            A0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            A0(k96.M0(2131689472, null), tL_error.text);
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
                gl.t1(this.s);
                this.c0.g(d0());
                return;
            } else if (!TextUtils.isEmpty(this.J.email_unconfirmed_pattern)) {
                p3c p3cVar = new p3c(this.currentAccount, 5, this.J);
                p3cVar.H0(this.L, this.M, this.N, true);
                presentFragment(p3cVar, true);
                return;
            } else {
                gl.t1(this.s);
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
        ij.u0(getParentActivity(), k96.M0(2131743581, null), true);
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
                gl.d3(new vj6(this, z, bArr2, (byte) 27));
            }
            this.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s, 32, bArr5, 0, 16);
            byte[] bArr6 = this.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!vx7.R0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new ce2((byte) 0));
                this.N = null;
                this.M = 0L;
            }
        } else {
            this.N = null;
            this.M = 0L;
        }
        z = true;
        gl.d3(new vj6(this, z, bArr2, (byte) 27));
    }

    public final void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.J = password;
            e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.J);
            x0();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.Y >= 0) {
            if (z) {
                B0();
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
        ry8 ry8Var = this.c;
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                ry8Var.setVisibility(i);
            }
        }
        i = 8;
        ry8Var.setVisibility(i);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0(null);
        D0();
        kk7.f(this.currentAccount).b(this, kk7.o0);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        gl.r(this.d0);
        kk7.f(this.currentAccount).n(this, kk7.o0);
        this.I = true;
        hd hdVar = this.x;
        if (hdVar != null) {
            try {
                hdVar.dismiss();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.x = null;
        }
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gl.W2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g24 g24Var = this.y;
            if (g24Var != null) {
                g24Var.setProgressBarColor(bkb.w0(null, bkb.g6, false));
            }
            wyb wybVar = this.G;
            if (wybVar != null) {
                wybVar.setColor(bkb.w0(null, bkb.N9, false));
            }
            y2c y2cVar = this.Z;
            if (y2cVar != null) {
                y2cVar.setProgressColor(bkb.w0(null, bkb.k6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            if (this.X) {
                v0();
                this.X = false;
            } else if (this.O) {
                y0();
                this.O = false;
            }
        }
    }

    public final void p0(TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new t2c(this, (byte) 5), 8);
            return;
        }
        s0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            u0(this.w, this.s, true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = k96.G(intValue, "Seconds", new Object[0]);
            } else {
                G = k96.G(intValue / 60, "Minutes", new Object[0]);
            }
            A0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            A0(k96.M0(2131689472, null), tL_error.text);
        }
    }

    public final void q0(byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.J.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = mo9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        ck8 ck8Var = new ck8(this, bArr, bArr2, (byte) 26);
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = mo9.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                ck8Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, ck8Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        ck8Var.run(null, tL_error2);
    }

    public final void r0(Runnable runnable, boolean z, boolean z2) {
        if (!z2) {
            this.H = true;
            a3c a3cVar = this.a;
            if (a3cVar != null) {
                a3cVar.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new n1b(this, z2, z, runnable), 10);
    }

    public final void s0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(s33.f);
            animatorSet.start();
            return;
        }
        hd hdVar = this.x;
        if (hdVar == null) {
            return;
        }
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.x = null;
    }

    public final void t0(boolean z) {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.x == null) {
            if (!this.K) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 1.0f));
                animatorSet.setInterpolator(s33.f);
                animatorSet.start();
                return;
            }
            hd hdVar = new hd(3, null, getParentActivity());
            this.x = hdVar;
            hdVar.j0 = false;
            if (z) {
                hdVar.q(300L);
            } else {
                hdVar.show();
            }
        }
    }

    public final void u0(er7 er7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
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
        er7Var.a(1.0f);
        gl.B3(5.0f, er7Var, new u2c(this, (byte) 1));
    }

    public final void v0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            t0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new t2c(this, (byte) 1), 10);
        } else if (getParentActivity() != null) {
            if (this.J.pending_reset_date != 0) {
                if (getConnectionsManager().getCurrentTime() > this.J.pending_reset_date) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131745925, null), new pz4(this, (byte) 4));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    String M0 = k96.M0(2131745900, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131745873, null);
                    showDialog(hdVar);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                        return;
                    }
                    return;
                }
                b0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder2.j(k96.M0(2131745925, null), new pz4(this, (byte) 5));
            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
            String M02 = k96.M0(2131745900, null);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = M02;
            hdVar2.U = k96.M0(2131745879, null);
            showDialog(hdVar2);
        }
    }

    public final void w0(Runnable runnable) {
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

    public final void x0() {
        if (!this.K) {
            String obj = this.s.getText().toString();
            if (obj.length() == 0) {
                u0(this.w, this.s, false);
                return;
            }
            byte[] g1 = gl.g1(obj);
            t0(false);
            Utilities.e.c(new a5b(this, g1, (byte) 27));
        }
    }

    public final void y0() {
        t0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new t2c(this, (byte) 0));
    }

    public final void z0(TL_account.Password password, byte[] bArr, long j, byte[] bArr2) {
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
}
