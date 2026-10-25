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
public final class od0 extends org.telegram.ui.Components.ax0 {
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
    public final nd0 Q;
    public boolean R;
    public final hd0 S;
    public final hd0 T;
    public final hd0 U;
    public boolean V;
    public final gg0 W;
    public final ld0 f42151a;
    public final TextView f42152b;
    public final xh.n f42153c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f42154f;
    public final FrameLayout h;
    public final bi.md f42155n;
    public final bi.md f42156r;
    public final TextView f42157s;
    public final org.telegram.ui.Components.ga0 v;
    public final org.telegram.ui.Components.ak0 f42158w;
    public boolean f42159x;
    public Bundle f42160y;

    public od0(org.telegram.ui.gg0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.od0.<init>(org.telegram.ui.gg0, android.content.Context, boolean):void");
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
            ld0 ld0Var = this.f42151a;
            ld0Var.e = true;
            xr[] xrVarArr = ld0Var.f44894f;
            if (xrVarArr != null) {
                for (xr xrVar : xrVarArr) {
                    xrVar.j(0.0f);
                }
            }
            String code = ld0Var.getCode();
            int length = code.length();
            gg0 gg0Var = this.W;
            if (length == 0 && this.F == null) {
                if (gg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    ld0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (xr xrVar2 : ld0Var.f44894f) {
                    xrVar2.i(1.0f);
                }
                ld0Var.f44894f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(ld0Var, new hd0(this, 1));
                return;
            }
            this.E = true;
            gg0Var.s1(0, true);
            if (gg0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f6398c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            ld0Var.e = true;
            xr[] xrVarArr2 = ld0Var.f44894f;
            if (xrVarArr2 != null) {
                for (xr xrVar3 : xrVarArr2) {
                    xrVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new ed0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f42159x) {
            this.f42159x = false;
        } else {
            AndroidUtilities.runOnUIThread(new hd0(this, 8), gg0.f39647x0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f42160y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f42151a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f42151a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f42160y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        xr[] xrVarArr;
        if (bundle != null) {
            this.f42160y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f42160y.getString("phoneHash");
            this.I = this.f42160y.getString("phone");
            this.J = this.f42160y.getString("ephone");
            this.N = this.f42160y.getBoolean("setup");
            this.O = this.f42160y.getInt("length");
            this.K = this.f42160y.getString("email");
            this.G = this.f42160y.getInt("resetAvailablePeriod");
            this.H = this.f42160y.getInt("resetPendingDate");
            gg0 gg0Var = this.W;
            int i12 = gg0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            xh.n nVar = this.f42153c;
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
                this.f42155n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f42156r.setVisibility(i11);
                if (this.H != 0) {
                    q();
                }
            }
            int i14 = this.O;
            ld0 ld0Var = this.f42151a;
            ld0Var.b(i14, 1);
            for (xr xrVar : ld0Var.f44894f) {
                xrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                xrVar.addTextChangedListener(new m0(this, 7));
                xrVar.setOnFocusChangeListener(new rd(this, 2));
            }
            ld0Var.setText("");
            if (!this.N && gg0Var.F != 3) {
                String string = this.f42160y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f34904a |= 256;
                    obj.f34905b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f34906c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.z11(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            gg0.W0(gg0Var, ld0Var.f44894f[0]);
            ld0Var.requestFocus();
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
            ld0 ld0Var = this.f42151a;
            xr[] xrVarArr = ld0Var.f44894f;
            if (i10 < xrVarArr.length) {
                ld0Var.postDelayed(new org.telegram.ui.Components.h2(this, i10, 20), i10 * 75);
                i10++;
            } else {
                ld0Var.postDelayed(new wb0(3, this, runnable), (xrVarArr.length * 75) + 400);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
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
        AndroidUtilities.updateViewVisibilityAnimated(this.f42154f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.ga0 ga0Var = this.v;
        if (ga0Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            ga0Var.setLayoutParams(org.telegram.ui.Components.gb1.h(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            ga0Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        bi.md mdVar = this.f42156r;
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
                valueOf.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23595q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            mdVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        mdVar.setVisibility(0);
        mdVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new hd0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f42152b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        int i10 = org.telegram.ui.ActionBar.y6.D6;
        this.f42153c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.y6.f23595q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.v.updateColors();
        this.f42154f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f42155n.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f42156r.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f42157s.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23596q7, false));
        this.f42151a.invalidate();
    }
}
