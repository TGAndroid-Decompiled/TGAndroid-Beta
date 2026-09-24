package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ae0 extends org.telegram.ui.Components.fw0 {
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
    public final zd0 Q;
    public boolean R;
    public final td0 S;
    public final td0 T;
    public final td0 U;
    public boolean V;
    public final qg0 W;
    public final xd0 f32123a;
    public final TextView f32124b;
    public final vh.n f32125c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f32126f;
    public final FrameLayout h;
    public final ai.p4 f32127n;
    public final ai.p4 f32128r;
    public final TextView f32129s;
    public final org.telegram.ui.Components.u90 v;
    public final org.telegram.ui.Components.lj0 f32130w;
    public boolean f32131x;
    public Bundle f32132y;

    public ae0(org.telegram.ui.qg0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ae0.<init>(org.telegram.ui.qg0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.H != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
        }
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (!this.E) {
            AndroidUtilities.cancelRunOnUIThread(this.T);
            xd0 xd0Var = this.f32123a;
            xd0Var.e = true;
            as[] asVarArr = xd0Var.f40221f;
            if (asVarArr != null) {
                for (as asVar : asVarArr) {
                    asVar.j(0.0f);
                }
            }
            String code = xd0Var.getCode();
            int length = code.length();
            qg0 qg0Var = this.W;
            if (length == 0 && this.F == null) {
                if (qg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    xd0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (as asVar2 : xd0Var.f40221f) {
                    asVar2.i(1.0f);
                }
                xd0Var.f40221f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(xd0Var, new td0(this, 1));
                return;
            }
            this.E = true;
            qg0Var.n1(0, true);
            if (qg0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f5937c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            xd0Var.e = true;
            as[] asVarArr2 = xd0Var.f40221f;
            if (asVarArr2 != null) {
                for (as asVar3 : asVarArr2) {
                    asVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new qd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f32131x) {
            this.f32131x = false;
        } else {
            AndroidUtilities.runOnUIThread(new td0(this, 8), qg0.f36869t0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f32132y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f32123a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f32123a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f32132y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        as[] asVarArr;
        if (bundle != null) {
            this.f32132y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f32132y.getString("phoneHash");
            this.I = this.f32132y.getString("phone");
            this.J = this.f32132y.getString("ephone");
            this.N = this.f32132y.getBoolean("setup");
            this.O = this.f32132y.getInt("length");
            this.K = this.f32132y.getString("email");
            this.G = this.f32132y.getInt("resetAvailablePeriod");
            this.H = this.f32132y.getInt("resetPendingDate");
            qg0 qg0Var = this.W;
            int i12 = qg0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            vh.n nVar = this.f32125c;
            if (i12 == 3) {
                nVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.K));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.P) {
                nVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.K));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                if (this.H == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f32127n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f32128r.setVisibility(i11);
                if (this.H != 0) {
                    r();
                }
            }
            int i14 = this.O;
            xd0 xd0Var = this.f32123a;
            xd0Var.b(i14, 1);
            for (as asVar : xd0Var.f40221f) {
                asVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                asVar.addTextChangedListener(new m0(this, 7));
                asVar.setOnFocusChangeListener(new od(this, 2));
            }
            xd0Var.setText("");
            if (!this.N && qg0Var.F != 3) {
                String string = this.f32132y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f22840a |= 256;
                    obj.f22841b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f22842c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.c11(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            qg0.T0(qg0Var, xd0Var.f40221f[0]);
            xd0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.T, bundle.getInt("timeout"));
            }
            if (this.H != 0) {
                AndroidUtilities.runOnUIThread(this.U, 1000L);
            }
        }
    }

    @Override
    public final void n() {
        this.f32124b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        this.f32125c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.v.a();
        this.f32126f.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.f32127n.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.f32128r.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f32129s.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
        this.f32123a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            xd0 xd0Var = this.f32123a;
            as[] asVarArr = xd0Var.f40221f;
            if (i10 < asVarArr.length) {
                xd0Var.postDelayed(new org.telegram.ui.Components.ld(this, i10, 18), i10 * 75);
                i10++;
            } else {
                xd0Var.postDelayed(new m80(17, this, runnable), (asVarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p() {
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new rd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        boolean z11;
        float f7;
        AndroidUtilities.updateViewVisibilityAnimated(this.f32126f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.u90 u90Var = this.v;
        if (u90Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            u90Var.setLayoutParams(w7.y5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            u90Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        ai.p4 p4Var = this.f32128r;
        if (i10 > 0 && currentTimeMillis > 0) {
            int i11 = R.string.LoginEmailResetInTime;
            int i12 = currentTimeMillis / 86400;
            int i13 = currentTimeMillis % 86400;
            int i14 = i13 / 3600;
            int i15 = i13 % 3600;
            int i16 = i15 / 60;
            int i17 = i15 % 60;
            if (i14 >= 16) {
                i12++;
            }
            if (i12 != 0) {
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i12, new Object[0]));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (i14 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i14));
                }
                sb2.append(str);
                Locale locale = Locale.ROOT;
                sb2.append(String.format(locale, "%02d:", Integer.valueOf(i16)));
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i17)));
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb2.toString());
            }
            String formatString2 = LocaleController.formatString(i11, formatString);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
            int indexOf = formatString2.indexOf(42);
            int lastIndexOf = formatString2.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new ForegroundColorSpan(this.W.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, lastIndexOf - 1, 33);
            }
            p4Var.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        p4Var.setVisibility(0);
        p4Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new td0(this, 0), 1000L);
    }
}
