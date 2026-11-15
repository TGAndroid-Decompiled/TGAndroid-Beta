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
public final class ob0 extends org.telegram.ui.Components.xt0 {
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
    public final nb0 R;
    public boolean S;
    public final hb0 T;
    public final hb0 U;
    public final hb0 V;
    public boolean W;
    public final lb0 f49880a;
    public final ce0 f49881a0;
    public final TextView f49882b;
    public final xh.l f49883c;
    public final TextView d;
    public final FrameLayout f49884e;
    public final TextView f49885f;
    public final FrameLayout h;
    public final mb0 f49886n;
    public final mb0 f49887r;
    public final TextView f49888s;
    public final org.telegram.ui.Components.g80 f49889w;
    public final org.telegram.ui.Components.fh0 f49890x;
    public boolean f49891y;

    public ob0(org.telegram.ui.ce0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.<init>(org.telegram.ui.ce0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.I != 0) {
            org.telegram.messenger.g0.r(this.V);
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131743619, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i7;
        if (!this.F) {
            org.telegram.messenger.g0.r(this.U);
            lb0 lb0Var = this.f49880a;
            lb0Var.f45484e = true;
            dr[] drVarArr = lb0Var.f45485f;
            if (drVarArr != null) {
                for (dr drVar : drVarArr) {
                    drVar.B(0.0f);
                }
            }
            String code = lb0Var.getCode();
            int length = code.length();
            ce0 ce0Var = this.f49881a0;
            if (length == 0 && this.G == null) {
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    lb0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (dr drVar2 : lb0Var.f45485f) {
                    drVar2.A(1.0f);
                }
                lb0Var.f45485f[0].requestFocus();
                org.telegram.messenger.g0.F3(10.0f, lb0Var, new hb0(this, 1));
                return;
            }
            this.F = true;
            ce0Var.F1(0, true);
            if (ce0Var.G == 3) {
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
                    tL_emailVerificationGoogle.token = this.G.f5838b;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            lb0Var.f45484e = true;
            dr[] drVarArr2 = lb0Var.f45485f;
            if (drVarArr2 != null) {
                for (dr drVar3 : drVarArr2) {
                    drVar3.B(0.0f);
                }
            }
            i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_signIn, new eb0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f49891y) {
            this.f49891y = false;
        } else {
            org.telegram.messenger.g0.i3(new hb0(this, 8), ce0.A0);
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
            this.f49880a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f49880a.getCode();
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
        int i7;
        int i10;
        dr[] drVarArr;
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
            ce0 ce0Var = this.f49881a0;
            int i11 = ce0Var.G;
            int i12 = 8;
            FrameLayout frameLayout = this.h;
            xh.l lVar = this.f49883c;
            if (i11 == 3) {
                lVar.setText(org.telegram.messenger.hd.a0(null, null, 2131752142, this.L));
                org.telegram.messenger.g0.Y3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                lVar.setText(org.telegram.messenger.hd.a0(null, null, 2131743618, this.L));
                org.telegram.messenger.g0.Y3(frameLayout, false, 1.0f, true, false);
            } else {
                org.telegram.messenger.g0.Y3(frameLayout, true, 1.0f, true, false);
                if (this.I == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                this.f49886n.setVisibility(i7);
                if (this.I != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f49887r.setVisibility(i10);
                if (this.I != 0) {
                    q();
                }
            }
            int i13 = this.P;
            lb0 lb0Var = this.f49880a;
            lb0Var.b(i13, 1);
            for (dr drVar : lb0Var.f45485f) {
                drVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                drVar.addTextChangedListener(new m0(this, 9));
                drVar.setOnFocusChangeListener(new ed(this, 2));
            }
            lb0Var.setText("");
            if (!this.O && ce0Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f41487a |= 256;
                    obj.f41488b = indexOf;
                    int i14 = lastIndexOf + 1;
                    obj.f41489c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy0(obj, 0), indexOf, i14, 0);
                }
                lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.hd.M0(2131752144, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.qt.f26137b.hasServices()) {
                i12 = 0;
            }
            this.f49889w.setVisibility(i12);
            this.d.setVisibility(i12);
            ce0.b1(ce0Var, lb0Var.f45485f[0]);
            lb0Var.requestFocus();
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
        int i7 = 0;
        while (true) {
            lb0 lb0Var = this.f49880a;
            dr[] drVarArr = lb0Var.f45485f;
            if (i7 < drVarArr.length) {
                lb0Var.postDelayed(new org.telegram.ui.Components.a2(this, i7, 21), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new g50(20, this, runnable), (drVarArr.length * 75) + 400);
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
        this.f49881a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fb0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
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
        org.telegram.messenger.g0.W3(this.f49885f, z10);
        if (!z10 && this.f49881a0.G != 3 && !this.Q) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.W3(this.h, z11);
        org.telegram.ui.Components.g80 g80Var = this.f49889w;
        if (g80Var.getVisibility() != 8) {
            if (z10) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            g80Var.setLayoutParams(c8.ja.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            g80Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a02;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i7 = this.I;
        mb0 mb0Var = this.f49887r;
        if (i7 > 0 && currentTimeMillis > 0) {
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
                a02 = org.telegram.messenger.hd.a0(null, null, 2131748734, org.telegram.messenger.hd.G(i10, "Days", new Object[0]));
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
                a02 = org.telegram.messenger.hd.a0(null, null, 2131748734, sb2.toString());
            }
            String a03 = org.telegram.messenger.hd.a0(null, null, 2131748733, a02);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
            int indexOf = a03.indexOf(42);
            int lastIndexOf = a03.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.f29089q6, this.f49881a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            mb0Var.setText(valueOf);
            org.telegram.messenger.g0.i3(this.V, 1000L);
            return;
        }
        mb0Var.setVisibility(0);
        mb0Var.setText(org.telegram.messenger.hd.M0(2131748731, null));
        org.telegram.messenger.g0.i3(new hb0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f49882b.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i7 = org.telegram.ui.ActionBar.j6.D6;
        this.f49883c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.j6.f29089q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        this.f49889w.updateColors();
        this.f49885f.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        this.f49886n.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        this.f49887r.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f49888s.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false));
        this.f49880a.invalidate();
    }
}
