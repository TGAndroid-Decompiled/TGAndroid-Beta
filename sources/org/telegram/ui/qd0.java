package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
public final class qd0 extends org.telegram.ui.Components.sw0 {
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
    public final pd0 Q;
    public boolean R;
    public final jd0 S;
    public final jd0 T;
    public final jd0 U;
    public boolean V;
    public final hg0 W;
    public final nd0 f40783a;
    public final TextView f40784b;
    public final wh.n f40785c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f40786f;
    public final FrameLayout h;
    public final ai.wd f40787n;
    public final ai.wd f40788r;
    public final TextView f40789s;
    public final org.telegram.ui.Components.da0 v;
    public final org.telegram.ui.Components.ak0 f40790w;
    public boolean f40791x;
    public Bundle f40792y;

    public qd0(org.telegram.ui.hg0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qd0.<init>(org.telegram.ui.hg0, android.content.Context, boolean):void");
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
            nd0 nd0Var = this.f40783a;
            nd0Var.e = true;
            vr[] vrVarArr = nd0Var.f41792f;
            if (vrVarArr != null) {
                for (vr vrVar : vrVarArr) {
                    vrVar.j(0.0f);
                }
            }
            String code = nd0Var.getCode();
            int length = code.length();
            hg0 hg0Var = this.W;
            if (length == 0 && this.F == null) {
                if (hg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    nd0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (vr vrVar2 : nd0Var.f41792f) {
                    vrVar2.i(1.0f);
                }
                nd0Var.f41792f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(nd0Var, new jd0(this, 1));
                return;
            }
            this.E = true;
            hg0Var.r1(0, true);
            if (hg0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f6288c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            nd0Var.e = true;
            vr[] vrVarArr2 = nd0Var.f41792f;
            if (vrVarArr2 != null) {
                for (vr vrVar3 : vrVarArr2) {
                    vrVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new gd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f40791x) {
            this.f40791x = false;
        } else {
            AndroidUtilities.runOnUIThread(new jd0(this, 8), hg0.f37832x0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f40792y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f40783a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40783a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f40792y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        vr[] vrVarArr;
        if (bundle != null) {
            this.f40792y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f40792y.getString("phoneHash");
            this.I = this.f40792y.getString("phone");
            this.J = this.f40792y.getString("ephone");
            this.N = this.f40792y.getBoolean("setup");
            this.O = this.f40792y.getInt("length");
            this.K = this.f40792y.getString("email");
            this.G = this.f40792y.getInt("resetAvailablePeriod");
            this.H = this.f40792y.getInt("resetPendingDate");
            hg0 hg0Var = this.W;
            int i12 = hg0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            wh.n nVar = this.f40785c;
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
                this.f40787n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f40788r.setVisibility(i11);
                if (this.H != 0) {
                    q();
                }
            }
            int i14 = this.O;
            nd0 nd0Var = this.f40783a;
            nd0Var.b(i14, 1);
            for (vr vrVar : nd0Var.f41792f) {
                vrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                vrVar.addTextChangedListener(new n0(this, 7));
                vrVar.setOnFocusChangeListener(new pd(this, 2));
            }
            nd0Var.setText("");
            if (!this.N && hg0Var.F != 3) {
                String string = this.f40792y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f29448a |= 256;
                    obj.f29449b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f29450c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            hg0.V0(hg0Var, nd0Var.f41792f[0]);
            nd0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.T, bundle.getInt("timeout"));
            }
            if (this.H != 0) {
                AndroidUtilities.runOnUIThread(this.U, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            nd0 nd0Var = this.f40783a;
            vr[] vrVarArr = nd0Var.f41792f;
            if (i10 < vrVarArr.length) {
                nd0Var.postDelayed(new org.telegram.ui.Components.c2(this, i10, 21), i10 * 75);
                i10++;
            } else {
                nd0Var.postDelayed(new f80(16, this, runnable), (vrVarArr.length * 75) + 400);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new hd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p(boolean z10) {
        boolean z11;
        float f7;
        AndroidUtilities.updateViewVisibilityAnimated(this.f40786f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.da0 da0Var = this.v;
        if (da0Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            da0Var.setLayoutParams(w7.z5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            da0Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        ai.wd wdVar = this.f40788r;
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
                valueOf.setSpan(new org.telegram.ui.Components.k10(org.telegram.ui.ActionBar.k6.q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            wdVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        wdVar.setVisibility(0);
        wdVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new jd0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f40784b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        this.f40785c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.v.updateColors();
        this.f40786f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f40787n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f40788r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f40789s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21422q7, false));
        this.f40783a.invalidate();
    }
}
