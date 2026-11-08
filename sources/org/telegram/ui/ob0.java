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
public final class ob0 extends org.telegram.ui.Components.wt0 {
    public Bundle D;
    public boolean E;
    public GoogleSignInAccount F;
    public int G;
    public int H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public boolean N;
    public int O;
    public final boolean P;
    public final nb0 Q;
    public boolean R;
    public final hb0 S;
    public final hb0 T;
    public final hb0 U;
    public boolean V;
    public final ce0 W;
    public final lb0 f48350a;
    public final TextView f48351b;
    public final xh.l f48352c;
    public final TextView d;
    public final FrameLayout f48353e;
    public final TextView f48354f;
    public final FrameLayout h;
    public final mb0 f48355n;
    public final mb0 f48356r;
    public final TextView f48357s;
    public final org.telegram.ui.Components.d80 f48358w;
    public final org.telegram.ui.Components.ch0 f48359x;
    public boolean f48360y;

    public ob0(org.telegram.ui.ce0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob0.<init>(org.telegram.ui.ce0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.H != 0) {
            org.telegram.messenger.g0.r(this.U);
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131743622, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i7;
        if (!this.E) {
            org.telegram.messenger.g0.r(this.T);
            lb0 lb0Var = this.f48350a;
            lb0Var.f52288e = true;
            br[] brVarArr = lb0Var.f52289f;
            if (brVarArr != null) {
                for (br brVar : brVarArr) {
                    brVar.A(0.0f);
                }
            }
            String code = lb0Var.getCode();
            int length = code.length();
            ce0 ce0Var = this.W;
            if (length == 0 && this.F == null) {
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    lb0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (br brVar2 : lb0Var.f52289f) {
                    brVar2.z(1.0f);
                }
                lb0Var.f52289f[0].requestFocus();
                org.telegram.messenger.g0.G3(10.0f, lb0Var, new hb0(this, 1));
                return;
            }
            this.E = true;
            ce0Var.F1(0, true);
            if (ce0Var.F == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.N) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.L;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.M;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.L;
                tL_auth_signIn2.phone_code_hash = this.M;
                if (this.F != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.F.f6453b;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            lb0Var.f52288e = true;
            br[] brVarArr2 = lb0Var.f52289f;
            if (brVarArr2 != null) {
                for (br brVar3 : brVarArr2) {
                    brVar3.A(0.0f);
                }
            }
            i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_signIn, new eb0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f48360y) {
            this.f48360y = false;
        } else {
            org.telegram.messenger.g0.i3(new hb0(this, 8), ce0.f44760y0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f48350a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48350a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.D;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        int i7;
        int i10;
        br[] brVarArr;
        if (bundle != null) {
            this.D = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.D.getString("phoneHash");
            this.I = this.D.getString("phone");
            this.J = this.D.getString("ephone");
            this.N = this.D.getBoolean("setup");
            this.O = this.D.getInt("length");
            this.K = this.D.getString("email");
            this.G = this.D.getInt("resetAvailablePeriod");
            this.H = this.D.getInt("resetPendingDate");
            ce0 ce0Var = this.W;
            int i11 = ce0Var.F;
            int i12 = 8;
            FrameLayout frameLayout = this.h;
            xh.l lVar = this.f48352c;
            if (i11 == 3) {
                lVar.setText(org.telegram.messenger.id.a0(null, null, 2131752142, this.K));
                org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
            } else if (this.P) {
                lVar.setText(org.telegram.messenger.id.a0(null, null, 2131743621, this.K));
                org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
            } else {
                org.telegram.messenger.g0.Z3(frameLayout, true, 1.0f, true, false);
                if (this.H == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                this.f48355n.setVisibility(i7);
                if (this.H != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f48356r.setVisibility(i10);
                if (this.H != 0) {
                    q();
                }
            }
            int i13 = this.O;
            lb0 lb0Var = this.f48350a;
            lb0Var.b(i13, 1);
            for (br brVar : lb0Var.f52289f) {
                brVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                brVar.addTextChangedListener(new m0(this, 9));
                brVar.setOnFocusChangeListener(new fd(this, 2));
            }
            lb0Var.setText("");
            if (!this.N && ce0Var.F != 3) {
                String string = this.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f38779a |= 256;
                    obj.f38780b = indexOf;
                    int i14 = lastIndexOf + 1;
                    obj.f38781c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i14, 0);
                }
                lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131752144, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.f25661b.hasServices()) {
                i12 = 0;
            }
            this.f48358w.setVisibility(i12);
            this.d.setVisibility(i12);
            ce0.b1(ce0Var, lb0Var.f52289f[0]);
            lb0Var.requestFocus();
            if (!z9 && bundle.containsKey("nextType")) {
                org.telegram.messenger.g0.i3(this.T, bundle.getInt("timeout"));
            }
            if (this.H != 0) {
                org.telegram.messenger.g0.i3(this.U, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            lb0 lb0Var = this.f48350a;
            br[] brVarArr = lb0Var.f52289f;
            if (i7 < brVarArr.length) {
                lb0Var.postDelayed(new org.telegram.ui.Components.r2(this, i7, 18), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new q10(24, this, runnable), (brVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void o() {
        if (this.V) {
            return;
        }
        this.V = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.I);
        bundle.putString("ephone", this.J);
        bundle.putString("phoneFormated", this.L);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.L;
        tL_auth_resetLoginEmail.phone_code_hash = this.M;
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fb0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p(boolean z9) {
        boolean z10;
        float f10;
        org.telegram.messenger.g0.X3(this.f48354f, z9);
        if (!z9 && this.W.F != 3 && !this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.X3(this.h, z10);
        org.telegram.ui.Components.d80 d80Var = this.f48358w;
        if (d80Var.getVisibility() != 8) {
            if (z9) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            d80Var.setLayoutParams(c8.ha.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            d80Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a02;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i7 = this.H;
        mb0 mb0Var = this.f48356r;
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
                a02 = org.telegram.messenger.id.a0(null, null, 2131748735, org.telegram.messenger.id.G(i10, "Days", new Object[0]));
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
                a02 = org.telegram.messenger.id.a0(null, null, 2131748735, sb2.toString());
            }
            String a03 = org.telegram.messenger.id.a0(null, null, 2131748734, a02);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
            int indexOf = a03.indexOf(42);
            int lastIndexOf = a03.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.f28092q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            mb0Var.setText(valueOf);
            org.telegram.messenger.g0.i3(this.U, 1000L);
            return;
        }
        mb0Var.setVisibility(0);
        mb0Var.setText(org.telegram.messenger.id.M0(2131748732, null));
        org.telegram.messenger.g0.i3(new hb0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f48351b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i7 = org.telegram.ui.ActionBar.k6.D6;
        this.f48352c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.k6.f28092q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f48358w.updateColors();
        this.f48354f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f48355n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f48356r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f48357s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28093q7, false));
        this.f48350a.invalidate();
    }
}
