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
public final class ee0 extends org.telegram.ui.Components.qw0 {
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
    public final de0 Q;
    public boolean R;
    public final xd0 S;
    public final xd0 T;
    public final xd0 U;
    public boolean V;
    public final ug0 W;
    public final be0 f35995a;
    public final TextView f35996b;
    public final vh.n f35997c;
    public final TextView d;
    public final FrameLayout f35998e;
    public final TextView f35999f;
    public final FrameLayout h;
    public final ai.p4 f36000n;
    public final ai.p4 f36001r;
    public final TextView f36002s;
    public final org.telegram.ui.Components.x90 v;
    public final org.telegram.ui.Components.nj0 f36003w;
    public boolean f36004x;
    public Bundle f36005y;

    public ee0(org.telegram.ui.ug0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ee0.<init>(org.telegram.ui.ug0, android.content.Context, boolean):void");
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
            be0 be0Var = this.f35995a;
            be0Var.f35542e = true;
            es[] esVarArr = be0Var.f35543f;
            if (esVarArr != null) {
                for (es esVar : esVarArr) {
                    esVar.j(0.0f);
                }
            }
            String code = be0Var.getCode();
            int length = code.length();
            ug0 ug0Var = this.W;
            if (length == 0 && this.F == null) {
                if (ug0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    be0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (es esVar2 : be0Var.f35543f) {
                    esVar2.i(1.0f);
                }
                be0Var.f35543f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(be0Var, new xd0(this, 1));
                return;
            }
            this.E = true;
            ug0Var.n1(0, true);
            if (ug0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f6397c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            be0Var.f35542e = true;
            es[] esVarArr2 = be0Var.f35543f;
            if (esVarArr2 != null) {
                for (es esVar3 : esVarArr2) {
                    esVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new ud0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f36004x) {
            this.f36004x = false;
        } else {
            AndroidUtilities.runOnUIThread(new xd0(this, 8), ug0.f41191t0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f36005y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f35995a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f35995a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f36005y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        es[] esVarArr;
        if (bundle != null) {
            this.f36005y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f36005y.getString("phoneHash");
            this.I = this.f36005y.getString("phone");
            this.J = this.f36005y.getString("ephone");
            this.N = this.f36005y.getBoolean("setup");
            this.O = this.f36005y.getInt("length");
            this.K = this.f36005y.getString("email");
            this.G = this.f36005y.getInt("resetAvailablePeriod");
            this.H = this.f36005y.getInt("resetPendingDate");
            ug0 ug0Var = this.W;
            int i12 = ug0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            vh.n nVar = this.f35997c;
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
                this.f36000n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f36001r.setVisibility(i11);
                if (this.H != 0) {
                    r();
                }
            }
            int i14 = this.O;
            be0 be0Var = this.f35995a;
            be0Var.b(i14, 1);
            for (es esVar : be0Var.f35543f) {
                esVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                esVar.addTextChangedListener(new m0(this, 7));
                esVar.setOnFocusChangeListener(new rd(this, 2));
            }
            be0Var.setText("");
            if (!this.N && ug0Var.F != 3) {
                String string = this.f36005y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28496a |= 256;
                    obj.f28497b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f28498c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.n11(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            ug0.T0(ug0Var, be0Var.f35543f[0]);
            be0Var.requestFocus();
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
        this.f35996b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        int i10 = org.telegram.ui.ActionBar.i6.D6;
        this.f35997c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.i6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.v.a();
        this.f35999f.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f36000n.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f36001r.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f36002s.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
        this.f35995a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            be0 be0Var = this.f35995a;
            es[] esVarArr = be0Var.f35543f;
            if (i10 < esVarArr.length) {
                be0Var.postDelayed(new org.telegram.ui.Components.ld(this, i10, 17), i10 * 75);
                i10++;
            } else {
                be0Var.postDelayed(new h90(14, this, runnable), (esVarArr.length * 75) + 400);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new vd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        boolean z11;
        float f7;
        AndroidUtilities.updateViewVisibilityAnimated(this.f35999f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.x90 x90Var = this.v;
        if (x90Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            x90Var.setLayoutParams(w7.z5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            x90Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        ai.p4 p4Var = this.f36001r;
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
                valueOf.setSpan(new ForegroundColorSpan(this.W.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf, lastIndexOf - 1, 33);
            }
            p4Var.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        p4Var.setVisibility(0);
        p4Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new xd0(this, 0), 1000L);
    }
}
