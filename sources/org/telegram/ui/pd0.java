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
public final class pd0 extends org.telegram.ui.Components.mv0 {
    public boolean A;
    public GoogleSignInAccount B;
    public int C;
    public int D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public int K;
    public final boolean L;
    public final od0 M;
    public boolean N;
    public final id0 O;
    public final id0 P;
    public final id0 Q;
    public boolean R;
    public final fg0 S;
    public final md0 f41371a;
    public final TextView f41372b;
    public final gh.s f41373c;
    public final TextView d;
    public final FrameLayout f41374e;
    public final TextView f41375f;
    public final FrameLayout h;
    public final eg.r f41376n;
    public final eg.r f41377r;
    public final TextView f41378s;
    public final org.telegram.ui.Components.f90 v;
    public final org.telegram.ui.Components.aj0 f41379w;
    public boolean f41380x;
    public Bundle f41381y;

    public pd0(org.telegram.ui.fg0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd0.<init>(org.telegram.ui.fg0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.D != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
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
        if (!this.A) {
            AndroidUtilities.cancelRunOnUIThread(this.P);
            md0 md0Var = this.f41371a;
            md0Var.f42454e = true;
            ur[] urVarArr = md0Var.f42455f;
            if (urVarArr != null) {
                for (ur urVar : urVarArr) {
                    urVar.j(0.0f);
                }
            }
            String code = md0Var.getCode();
            int length = code.length();
            fg0 fg0Var = this.S;
            if (length == 0 && this.B == null) {
                if (fg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    md0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (ur urVar2 : md0Var.f42455f) {
                    urVar2.i(1.0f);
                }
                md0Var.f42455f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(md0Var, new id0(this, 1));
                return;
            }
            this.A = true;
            fg0Var.n1(0, true);
            if (fg0Var.B == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.J) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.H;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.I;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.H;
                tL_auth_signIn2.phone_code_hash = this.I;
                if (this.B != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.B.f3680c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            md0Var.f42454e = true;
            ur[] urVarArr2 = md0Var.f42455f;
            if (urVarArr2 != null) {
                for (ur urVar3 : urVarArr2) {
                    urVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new fd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f41380x) {
            this.f41380x = false;
        } else {
            AndroidUtilities.runOnUIThread(new id0(this, 8), fg0.f38150p0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f41381y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f41371a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41371a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f41381y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        ur[] urVarArr;
        if (bundle != null) {
            this.f41381y = bundle;
            this.H = bundle.getString("phoneFormated");
            this.I = this.f41381y.getString("phoneHash");
            this.E = this.f41381y.getString("phone");
            this.F = this.f41381y.getString("ephone");
            this.J = this.f41381y.getBoolean("setup");
            this.K = this.f41381y.getInt("length");
            this.G = this.f41381y.getString("email");
            this.C = this.f41381y.getInt("resetAvailablePeriod");
            this.D = this.f41381y.getInt("resetPendingDate");
            fg0 fg0Var = this.S;
            int i12 = fg0Var.B;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            gh.s sVar = this.f41373c;
            if (i12 == 3) {
                sVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.G));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.L) {
                sVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.G));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                if (this.D == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f41376n.setVisibility(i10);
                if (this.D != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f41377r.setVisibility(i11);
                if (this.D != 0) {
                    r();
                }
            }
            int i14 = this.K;
            md0 md0Var = this.f41371a;
            md0Var.b(i14, 1);
            for (ur urVar : md0Var.f42455f) {
                urVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                urVar.addTextChangedListener(new p0(this, 7));
                urVar.setOnFocusChangeListener(new kd(this, 2));
            }
            md0Var.setText("");
            if (!this.J && fg0Var.B != 3) {
                String string = this.f41381y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f29024a |= 256;
                    obj.f29025b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f29026c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i01(obj, 0), indexOf, i15, 0);
                }
                sVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            fg0.T0(fg0Var, md0Var.f42455f[0]);
            md0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.P, bundle.getInt("timeout"));
            }
            if (this.D != 0) {
                AndroidUtilities.runOnUIThread(this.Q, 1000L);
            }
        }
    }

    @Override
    public final void n() {
        this.f41372b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        this.f41373c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.v.a();
        this.f41375f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f41376n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f41377r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f41378s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        this.f41371a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.B != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            md0 md0Var = this.f41371a;
            ur[] urVarArr = md0Var.f42455f;
            if (i10 < urVarArr.length) {
                md0Var.postDelayed(new org.telegram.ui.Components.i8(this, i10, 19), i10 * 75);
                i10++;
            } else {
                md0Var.postDelayed(new x60(20, this, runnable), (urVarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
        removeCallbacks(this.P);
    }

    public final void p() {
        if (this.R) {
            return;
        }
        this.R = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.E);
        bundle.putString("ephone", this.F);
        bundle.putString("phoneFormated", this.H);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.H;
        tL_auth_resetLoginEmail.phone_code_hash = this.I;
        this.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        boolean z11;
        float f9;
        AndroidUtilities.updateViewVisibilityAnimated(this.f41375f, z10);
        if (!z10 && this.S.B != 3 && !this.L) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.f90 f90Var = this.v;
        if (f90Var.getVisibility() != 8) {
            if (z10) {
                f9 = 8.0f;
            } else {
                f9 = 16.0f;
            }
            f90Var.setLayoutParams(i7.f6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f9));
            f90Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.D - (System.currentTimeMillis() / 1000));
        int i10 = this.D;
        eg.r rVar = this.f41377r;
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
                valueOf.setSpan(new ForegroundColorSpan(this.S.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf, lastIndexOf - 1, 33);
            }
            rVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.Q, 1000L);
            return;
        }
        rVar.setVisibility(0);
        rVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new id0(this, 0), 1000L);
    }
}
