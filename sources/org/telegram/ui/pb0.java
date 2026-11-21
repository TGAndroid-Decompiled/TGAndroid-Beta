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
public final class pb0 extends org.telegram.ui.Components.iu0 {
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
    public final ob0 R;
    public boolean S;
    public final ib0 T;
    public final ib0 U;
    public final ib0 V;
    public boolean W;
    public final mb0 f50829a;
    public final de0 f50830a0;
    public final TextView f50831b;
    public final xh.l f50832c;
    public final TextView d;
    public final FrameLayout f50833e;
    public final TextView f50834f;
    public final FrameLayout h;
    public final nb0 f50835n;
    public final nb0 f50836r;
    public final TextView f50837s;
    public final org.telegram.ui.Components.t80 f50838w;
    public final org.telegram.ui.Components.rh0 f50839x;
    public boolean f50840y;

    public pb0(org.telegram.ui.de0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb0.<init>(org.telegram.ui.de0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.I != 0) {
            org.telegram.messenger.g0.r(this.V);
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131743376, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i7;
        if (!this.F) {
            org.telegram.messenger.g0.r(this.U);
            mb0 mb0Var = this.f50829a;
            mb0Var.f46296e = true;
            er[] erVarArr = mb0Var.f46297f;
            if (erVarArr != null) {
                for (er erVar : erVarArr) {
                    erVar.B(0.0f);
                }
            }
            String code = mb0Var.getCode();
            int length = code.length();
            de0 de0Var = this.f50830a0;
            if (length == 0 && this.G == null) {
                if (de0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    mb0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (er erVar2 : mb0Var.f46297f) {
                    erVar2.A(1.0f);
                }
                mb0Var.f46297f[0].requestFocus();
                org.telegram.messenger.g0.E3(10.0f, mb0Var, new ib0(this, 1));
                return;
            }
            this.F = true;
            de0Var.F1(0, true);
            if (de0Var.G == 3) {
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
                    tL_emailVerificationGoogle.token = this.G.f6147b;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            mb0Var.f46296e = true;
            er[] erVarArr2 = mb0Var.f46297f;
            if (erVarArr2 != null) {
                for (er erVar3 : erVarArr2) {
                    erVar3.B(0.0f);
                }
            }
            i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_signIn, new fb0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f50840y) {
            this.f50840y = false;
        } else {
            org.telegram.messenger.g0.h3(new ib0(this, 8), de0.A0);
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
            this.f50829a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f50829a.getCode();
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
        er[] erVarArr;
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
            de0 de0Var = this.f50830a0;
            int i11 = de0Var.G;
            int i12 = 8;
            FrameLayout frameLayout = this.h;
            xh.l lVar = this.f50832c;
            if (i11 == 3) {
                lVar.setText(org.telegram.messenger.gd.a0(null, null, 2131752130, this.L));
                org.telegram.messenger.g0.X3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                lVar.setText(org.telegram.messenger.gd.a0(null, null, 2131743375, this.L));
                org.telegram.messenger.g0.X3(frameLayout, false, 1.0f, true, false);
            } else {
                org.telegram.messenger.g0.X3(frameLayout, true, 1.0f, true, false);
                if (this.I == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                this.f50835n.setVisibility(i7);
                if (this.I != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f50836r.setVisibility(i10);
                if (this.I != 0) {
                    q();
                }
            }
            int i13 = this.P;
            mb0 mb0Var = this.f50829a;
            mb0Var.b(i13, 1);
            for (er erVar : mb0Var.f46297f) {
                erVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                erVar.addTextChangedListener(new m0(this, 9));
                erVar.setOnFocusChangeListener(new ed(this, 2));
            }
            mb0Var.setText("");
            if (!this.O && de0Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f35335a |= 256;
                    obj.f35336b = indexOf;
                    int i14 = lastIndexOf + 1;
                    obj.f35337c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.gz0(obj, 0), indexOf, i14, 0);
                }
                lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.gd.N0(2131752132, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.nt.f25994b.hasServices()) {
                i12 = 0;
            }
            this.f50838w.setVisibility(i12);
            this.d.setVisibility(i12);
            de0.b1(de0Var, mb0Var.f46297f[0]);
            mb0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                org.telegram.messenger.g0.h3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                org.telegram.messenger.g0.h3(this.V, 1000L);
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
            mb0 mb0Var = this.f50829a;
            er[] erVarArr = mb0Var.f46297f;
            if (i7 < erVarArr.length) {
                mb0Var.postDelayed(new ii(this, i7, 24), i7 * 75);
                i7++;
            } else {
                mb0Var.postDelayed(new h60(17, this, runnable), (erVarArr.length * 75) + 400);
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
        this.f50830a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gb0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
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
        org.telegram.messenger.g0.V3(this.f50834f, z10);
        if (!z10 && this.f50830a0.G != 3 && !this.Q) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.V3(this.h, z11);
        org.telegram.ui.Components.t80 t80Var = this.f50838w;
        if (t80Var.getVisibility() != 8) {
            if (z10) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            t80Var.setLayoutParams(c8.ma.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            t80Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a02;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i7 = this.I;
        nb0 nb0Var = this.f50836r;
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
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748541, org.telegram.messenger.gd.G(i10, "Days", new Object[0]));
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
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748541, sb2.toString());
            }
            String a03 = org.telegram.messenger.gd.a0(null, null, 2131748540, a02);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
            int indexOf = a03.indexOf(42);
            int lastIndexOf = a03.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.f29618q6, this.f50830a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            nb0Var.setText(valueOf);
            org.telegram.messenger.g0.h3(this.V, 1000L);
            return;
        }
        nb0Var.setVisibility(0);
        nb0Var.setText(org.telegram.messenger.gd.N0(2131748538, null));
        org.telegram.messenger.g0.h3(new ib0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f50831b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        this.f50832c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.f29618q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f50838w.updateColors();
        this.f50834f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f50835n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f50836r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f50837s.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29619q7, false));
        this.f50829a.invalidate();
    }
}
