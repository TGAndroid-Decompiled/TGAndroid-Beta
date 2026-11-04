package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lb0 extends org.telegram.ui.Components.vt0 {
    public Bundle E;
    public boolean F;
    public GoogleSignInAccount G;
    public int H;
    public int I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public int P;
    public final boolean Q;
    public final kb0 R;
    public boolean S;
    public final db0 T;
    public final db0 U;
    public final db0 V;
    public boolean W;
    public final ib0 f47283a;
    public final xd0 f47284a0;
    public final TextView f47285b;
    public final yh.l f47286c;
    public final TextView d;
    public final FrameLayout f47287e;
    public final TextView f47288f;
    public final FrameLayout h;
    public final jb0 f47289n;
    public final jb0 f47290r;
    public final TextView f47291s;
    public final org.telegram.ui.Components.z70 f47292w;
    public final org.telegram.ui.Components.fh0 f47293x;
    public boolean f47294y;

    public lb0(org.telegram.ui.xd0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb0.<init>(org.telegram.ui.xd0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.I != 0) {
            org.telegram.messenger.g0.r(this.V);
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131743629, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i3;
        if (!this.F) {
            org.telegram.messenger.g0.r(this.U);
            ib0 ib0Var = this.f47283a;
            ib0Var.f52077e = true;
            zq[] zqVarArr = ib0Var.f52078f;
            if (zqVarArr != null) {
                for (zq zqVar : zqVarArr) {
                    zqVar.A(0.0f);
                }
            }
            String code = ib0Var.getCode();
            int length = code.length();
            xd0 xd0Var = this.f47284a0;
            if (length == 0 && this.G == null) {
                if (xd0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    ib0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (zq zqVar2 : ib0Var.f52078f) {
                    zqVar2.z(1.0f);
                }
                ib0Var.f52078f[0].requestFocus();
                org.telegram.messenger.g0.G3(10.0f, ib0Var, new db0(this, 1));
                return;
            }
            this.F = true;
            xd0Var.w1(0, true);
            if (xd0Var.G == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.O) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.M;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.N;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.M;
                tL_auth_signIn2.phone_code_hash = this.N;
                if (this.G != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.G.f6505b;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            ib0Var.f52077e = true;
            zq[] zqVarArr2 = ib0Var.f52078f;
            if (zqVarArr2 != null) {
                for (zq zqVar3 : zqVarArr2) {
                    zqVar3.A(0.0f);
                }
            }
            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new ab0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f47294y) {
            this.f47294y = false;
        } else {
            org.telegram.messenger.g0.i3(new db0(this, 8), xd0.f51945z0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.E = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f47283a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f47283a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.E;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i3;
        int i10;
        zq[] zqVarArr;
        if (bundle != null) {
            this.E = bundle;
            this.M = bundle.getString("phoneFormated");
            this.N = this.E.getString("phoneHash");
            this.J = this.E.getString("phone");
            this.K = this.E.getString("ephone");
            this.O = this.E.getBoolean("setup");
            this.P = this.E.getInt("length");
            this.L = this.E.getString("email");
            this.H = this.E.getInt("resetAvailablePeriod");
            this.I = this.E.getInt("resetPendingDate");
            xd0 xd0Var = this.f47284a0;
            int i11 = xd0Var.G;
            int i12 = 8;
            FrameLayout frameLayout = this.h;
            yh.l lVar = this.f47286c;
            if (i11 == 3) {
                lVar.setText(org.telegram.messenger.bd.a0(null, null, 2131752142, this.L));
                org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                lVar.setText(org.telegram.messenger.bd.a0(null, null, 2131743628, this.L));
                org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
            } else {
                org.telegram.messenger.g0.Z3(frameLayout, true, 1.0f, true, false);
                if (this.I == 0) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                this.f47289n.setVisibility(i3);
                if (this.I != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f47290r.setVisibility(i10);
                if (this.I != 0) {
                    q();
                }
            }
            int i13 = this.P;
            ib0 ib0Var = this.f47283a;
            ib0Var.b(i13, 1);
            for (zq zqVar : ib0Var.f52078f) {
                zqVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                zqVar.addTextChangedListener(new n0(this, 9));
                zqVar.setOnFocusChangeListener(new ed(this, 2));
            }
            ib0Var.setText("");
            if (!this.O && xd0Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f38578a |= 256;
                    obj.f38579b = indexOf;
                    int i14 = lastIndexOf + 1;
                    obj.f38580c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i14, 0);
                }
                lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131752144, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.lt.f24103b.hasServices()) {
                i12 = 0;
            }
            this.f47292w.setVisibility(i12);
            this.d.setVisibility(i12);
            xd0.a1(xd0Var, ib0Var.f52078f[0]);
            ib0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                org.telegram.messenger.g0.i3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                org.telegram.messenger.g0.i3(this.V, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.G != null) {
            runnable.run();
            return;
        }
        int i3 = 0;
        while (true) {
            ib0 ib0Var = this.f47283a;
            zq[] zqVarArr = ib0Var.f52078f;
            if (i3 < zqVarArr.length) {
                ib0Var.postDelayed(new org.telegram.ui.Components.o2(this, i3, 18), i3 * 75);
                i3++;
            } else {
                ib0Var.postDelayed(new ly(29, this, runnable), (zqVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void o() {
        if (this.W) {
            return;
        }
        this.W = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.J);
        bundle.putString("ephone", this.K);
        bundle.putString("phoneFormated", this.M);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.M;
        tL_auth_resetLoginEmail.phone_code_hash = this.N;
        this.f47284a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new bb0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z10) {
        boolean z11;
        float f10;
        org.telegram.messenger.g0.X3(this.f47288f, z10);
        if (!z10 && this.f47284a0.G != 3 && !this.Q) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.X3(this.h, z11);
        org.telegram.ui.Components.z70 z70Var = this.f47292w;
        if (z70Var.getVisibility() != 8) {
            if (z10) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            z70Var.setLayoutParams(b8.mf.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            z70Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a02;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i3 = this.I;
        jb0 jb0Var = this.f47290r;
        if (i3 > 0 && currentTimeMillis > 0) {
            int i10 = currentTimeMillis / 86400;
            int i11 = currentTimeMillis % 86400;
            int i12 = i11 / 3600;
            int i13 = i11 % 3600;
            int i14 = i13 / 60;
            int i15 = i13 % 60;
            if (i12 >= 16) {
                i10++;
            }
            if (i10 != 0) {
                a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i10, "Days", new Object[0]));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (i12 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i12));
                }
                sb2.append(str);
                Locale locale = Locale.ROOT;
                sb2.append(String.format(locale, "%02d:", Integer.valueOf(i14)));
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i15)));
                a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, sb2.toString());
            }
            String a03 = org.telegram.messenger.bd.a0(null, null, 2131748741, a02);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
            int indexOf = a03.indexOf(42);
            int lastIndexOf = a03.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28121q6, this.f47284a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            jb0Var.setText(valueOf);
            org.telegram.messenger.g0.i3(this.V, 1000L);
            return;
        }
        jb0Var.setVisibility(0);
        jb0Var.setText(org.telegram.messenger.bd.M0(2131748739, null));
        org.telegram.messenger.g0.i3(new db0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f47285b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i3 = org.telegram.ui.ActionBar.k6.D6;
        this.f47286c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int i10 = org.telegram.ui.ActionBar.k6.f28121q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f47292w.updateColors();
        this.f47288f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f47289n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f47290r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f47291s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false));
        this.f47283a.invalidate();
    }
}
