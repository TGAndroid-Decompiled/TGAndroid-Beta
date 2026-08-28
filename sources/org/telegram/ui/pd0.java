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
public final class pd0 extends org.telegram.ui.Components.cv0 {
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
    public final hd0 O;
    public final hd0 P;
    public final hd0 Q;
    public boolean R;
    public final fg0 S;
    public final ld0 f41482a;
    public final TextView f41483b;
    public final dh.u f41484c;
    public final TextView d;
    public final FrameLayout f41485e;
    public final TextView f41486f;
    public final FrameLayout h;
    public final bg.t f41487n;
    public final nd0 f41488r;
    public final TextView f41489s;
    public final org.telegram.ui.Components.s80 v;
    public final org.telegram.ui.Components.pi0 f41490w;
    public boolean f41491x;
    public Bundle f41492y;

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
        int i9;
        if (!this.A) {
            AndroidUtilities.cancelRunOnUIThread(this.P);
            ld0 ld0Var = this.f41482a;
            ld0Var.f42754e = true;
            vr[] vrVarArr = ld0Var.f42755f;
            if (vrVarArr != null) {
                for (vr vrVar : vrVarArr) {
                    vrVar.j(0.0f);
                }
            }
            String code = ld0Var.getCode();
            int length = code.length();
            fg0 fg0Var = this.S;
            if (length == 0 && this.B == null) {
                if (fg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    ld0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (vr vrVar2 : ld0Var.f42755f) {
                    vrVar2.i(1.0f);
                }
                ld0Var.f42755f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(ld0Var, new hd0(this, 1));
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
                    tL_emailVerificationGoogle.token = this.B.f2666c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            ld0Var.f42754e = true;
            vr[] vrVarArr2 = ld0Var.f42755f;
            if (vrVarArr2 != null) {
                for (vr vrVar3 : vrVarArr2) {
                    vrVar3.j(0.0f);
                }
            }
            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i9).sendRequest(tL_auth_signIn, new ed0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f41491x) {
            this.f41491x = false;
        } else {
            AndroidUtilities.runOnUIThread(new hd0(this, 8), fg0.f38258p0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f41492y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f41482a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41482a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f41492y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i9;
        int i10;
        vr[] vrVarArr;
        if (bundle != null) {
            this.f41492y = bundle;
            this.H = bundle.getString("phoneFormated");
            this.I = this.f41492y.getString("phoneHash");
            this.E = this.f41492y.getString("phone");
            this.F = this.f41492y.getString("ephone");
            this.J = this.f41492y.getBoolean("setup");
            this.K = this.f41492y.getInt("length");
            this.G = this.f41492y.getString("email");
            this.C = this.f41492y.getInt("resetAvailablePeriod");
            this.D = this.f41492y.getInt("resetPendingDate");
            fg0 fg0Var = this.S;
            int i11 = fg0Var.B;
            int i12 = 8;
            FrameLayout frameLayout = this.h;
            dh.u uVar = this.f41484c;
            if (i11 == 3) {
                uVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.G));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.L) {
                uVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.G));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                if (this.D == 0) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                this.f41487n.setVisibility(i9);
                if (this.D != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f41488r.setVisibility(i10);
                if (this.D != 0) {
                    r();
                }
            }
            int i13 = this.K;
            ld0 ld0Var = this.f41482a;
            ld0Var.b(i13, 1);
            for (vr vrVar : ld0Var.f42755f) {
                vrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                vrVar.addTextChangedListener(new o0(this, 7));
                vrVar.setOnFocusChangeListener(new ld(this, 2));
            }
            ld0Var.setText("");
            if (!this.J && fg0Var.B != 3) {
                String string = this.f41492y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f34062a |= 256;
                    obj.f34063b = indexOf;
                    int i14 = lastIndexOf + 1;
                    obj.f34064c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.wz0(obj, 0), indexOf, i14, 0);
                }
                uVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i12 = 0;
            }
            this.v.setVisibility(i12);
            this.d.setVisibility(i12);
            fg0.T0(fg0Var, ld0Var.f42755f[0]);
            ld0Var.requestFocus();
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
        this.f41483b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int i9 = org.telegram.ui.ActionBar.f6.D6;
        this.f41484c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int i10 = org.telegram.ui.ActionBar.f6.f23229q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.v.a();
        this.f41486f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f41487n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f41488r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f41489s.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        this.f41482a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.B != null) {
            runnable.run();
            return;
        }
        int i9 = 0;
        while (true) {
            ld0 ld0Var = this.f41482a;
            vr[] vrVarArr = ld0Var.f42755f;
            if (i9 < vrVarArr.length) {
                ld0Var.postDelayed(new org.telegram.ui.Components.qd(this, i9, 17), i9 * 75);
                i9++;
            } else {
                ld0Var.postDelayed(new x20(23, this, runnable), (vrVarArr.length * 75) + 400);
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
        this.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        boolean z11;
        float f10;
        AndroidUtilities.updateViewVisibilityAnimated(this.f41486f, z10);
        if (!z10 && this.S.B != 3 && !this.L) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.s80 s80Var = this.v;
        if (s80Var.getVisibility() != 8) {
            if (z10) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            s80Var.setLayoutParams(g7.e6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            s80Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.D - (System.currentTimeMillis() / 1000));
        int i9 = this.D;
        nd0 nd0Var = this.f41488r;
        if (i9 > 0 && currentTimeMillis > 0) {
            int i10 = R.string.LoginEmailResetInTime;
            int i11 = currentTimeMillis / 86400;
            int i12 = currentTimeMillis % 86400;
            int i13 = i12 / 3600;
            int i14 = i12 % 3600;
            int i15 = i14 / 60;
            int i16 = i14 % 60;
            if (i13 >= 16) {
                i11++;
            }
            if (i11 != 0) {
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i11, new Object[0]));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (i13 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i13));
                }
                sb2.append(str);
                Locale locale = Locale.ROOT;
                sb2.append(String.format(locale, "%02d:", Integer.valueOf(i15)));
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i16)));
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb2.toString());
            }
            String formatString2 = LocaleController.formatString(i10, formatString);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
            int indexOf = formatString2.indexOf(42);
            int lastIndexOf = formatString2.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new ForegroundColorSpan(this.S.getThemedColor(org.telegram.ui.ActionBar.f6.f23229q6)), indexOf, lastIndexOf - 1, 33);
            }
            nd0Var.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.Q, 1000L);
            return;
        }
        nd0Var.setVisibility(0);
        nd0Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new hd0(this, 0), 1000L);
    }
}
