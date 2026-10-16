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
public final class je0 extends org.telegram.ui.Components.tw0 {
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
    public final ie0 Q;
    public boolean R;
    public final ce0 S;
    public final ce0 T;
    public final ce0 U;
    public boolean V;
    public final ah0 W;
    public final ge0 f37030a;
    public final TextView f37031b;
    public final wh.n f37032c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f37033f;
    public final FrameLayout h;
    public final bi.f4 f37034n;
    public final bi.f4 f37035r;
    public final TextView f37036s;
    public final org.telegram.ui.Components.ka0 v;
    public final org.telegram.ui.Components.bk0 f37037w;
    public boolean f37038x;
    public Bundle f37039y;

    public je0(org.telegram.ui.ah0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je0.<init>(org.telegram.ui.ah0, android.content.Context, boolean):void");
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
            ge0 ge0Var = this.f37030a;
            ge0Var.e = true;
            ks[] ksVarArr = ge0Var.f36645f;
            if (ksVarArr != null) {
                for (ks ksVar : ksVarArr) {
                    ksVar.j(0.0f);
                }
            }
            String code = ge0Var.getCode();
            int length = code.length();
            ah0 ah0Var = this.W;
            if (length == 0 && this.F == null) {
                if (ah0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    ge0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (ks ksVar2 : ge0Var.f36645f) {
                    ksVar2.i(1.0f);
                }
                ge0Var.f36645f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(ge0Var, new ce0(this, 1));
                return;
            }
            this.E = true;
            ah0Var.n1(0, true);
            if (ah0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f4820c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            ge0Var.e = true;
            ks[] ksVarArr2 = ge0Var.f36645f;
            if (ksVarArr2 != null) {
                for (ks ksVar3 : ksVarArr2) {
                    ksVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new zd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f37038x) {
            this.f37038x = false;
        } else {
            AndroidUtilities.runOnUIThread(new ce0(this, 8), ah0.f33904t0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f37039y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f37030a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f37030a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f37039y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        ks[] ksVarArr;
        if (bundle != null) {
            this.f37039y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f37039y.getString("phoneHash");
            this.I = this.f37039y.getString("phone");
            this.J = this.f37039y.getString("ephone");
            this.N = this.f37039y.getBoolean("setup");
            this.O = this.f37039y.getInt("length");
            this.K = this.f37039y.getString("email");
            this.G = this.f37039y.getInt("resetAvailablePeriod");
            this.H = this.f37039y.getInt("resetPendingDate");
            ah0 ah0Var = this.W;
            int i12 = ah0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            wh.n nVar = this.f37032c;
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
                this.f37034n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f37035r.setVisibility(i11);
                if (this.H != 0) {
                    r();
                }
            }
            int i14 = this.O;
            ge0 ge0Var = this.f37030a;
            ge0Var.b(i14, 1);
            for (ks ksVar : ge0Var.f36645f) {
                ksVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                ksVar.addTextChangedListener(new n0(this, 7));
                ksVar.setOnFocusChangeListener(new vd(this, 2));
            }
            ge0Var.setText("");
            if (!this.N && ah0Var.F != 3) {
                String string = this.f37039y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28163a |= 256;
                    obj.f28164b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f28165c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            ah0.T0(ah0Var, ge0Var.f36645f[0]);
            ge0Var.requestFocus();
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
        this.f37031b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        this.f37032c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.v.a();
        this.f37033f.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.f37034n.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.f37035r.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.f37036s.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
        this.f37030a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            ge0 ge0Var = this.f37030a;
            ks[] ksVarArr = ge0Var.f36645f;
            if (i10 < ksVarArr.length) {
                ge0Var.postDelayed(new org.telegram.ui.Components.o8(this, i10, 19), i10 * 75);
                i10++;
            } else {
                ge0Var.postDelayed(new d20(28, this, runnable), (ksVarArr.length * 75) + 400);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ae0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        boolean z11;
        float f7;
        AndroidUtilities.updateViewVisibilityAnimated(this.f37033f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.ka0 ka0Var = this.v;
        if (ka0Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            ka0Var.setLayoutParams(w7.z5.a(16.0f, 0.0f, 0.0f, 0.0f, f7, -1, 17));
            ka0Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        bi.f4 f4Var = this.f37035r;
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
                valueOf.setSpan(new ForegroundColorSpan(this.W.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf, lastIndexOf - 1, 33);
            }
            f4Var.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        f4Var.setVisibility(0);
        f4Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new ce0(this, 0), 1000L);
    }
}
