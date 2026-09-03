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
public final class ae0 extends org.telegram.ui.Components.vv0 {
    public boolean B;
    public GoogleSignInAccount C;
    public int D;
    public int E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public int L;
    public final boolean M;
    public final zd0 N;
    public boolean O;
    public final td0 P;
    public final td0 Q;
    public final td0 R;
    public boolean S;
    public final pg0 T;
    public final xd0 f32561a;
    public final TextView f32562b;
    public final ih.s f32563c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f32564f;
    public final FrameLayout h;
    public final gg.q f32565n;
    public final gg.q f32566r;
    public final TextView f32567s;
    public final org.telegram.ui.Components.m90 v;
    public final org.telegram.ui.Components.jj0 f32568w;
    public boolean f32569x;
    public Bundle f32570y;

    public ae0(org.telegram.ui.pg0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ae0.<init>(org.telegram.ui.pg0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.E != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
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
        if (!this.B) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
            xd0 xd0Var = this.f32561a;
            xd0Var.e = true;
            ds[] dsVarArr = xd0Var.f32635f;
            if (dsVarArr != null) {
                for (ds dsVar : dsVarArr) {
                    dsVar.j(0.0f);
                }
            }
            String code = xd0Var.getCode();
            int length = code.length();
            pg0 pg0Var = this.T;
            if (length == 0 && this.C == null) {
                if (pg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    xd0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (ds dsVar2 : xd0Var.f32635f) {
                    dsVar2.i(1.0f);
                }
                xd0Var.f32635f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(xd0Var, new td0(this, 1));
                return;
            }
            this.B = true;
            pg0Var.n1(0, true);
            if (pg0Var.C == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.K) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.I;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.J;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.I;
                tL_auth_signIn2.phone_code_hash = this.J;
                if (this.C != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.C.f2633c;
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
            ds[] dsVarArr2 = xd0Var.f32635f;
            if (dsVarArr2 != null) {
                for (ds dsVar3 : dsVarArr2) {
                    dsVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new qd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f32569x) {
            this.f32569x = false;
        } else {
            AndroidUtilities.runOnUIThread(new td0(this, 8), pg0.f37125q0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f32570y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f32561a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f32561a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f32570y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        int i10;
        int i11;
        ds[] dsVarArr;
        if (bundle != null) {
            this.f32570y = bundle;
            this.I = bundle.getString("phoneFormated");
            this.J = this.f32570y.getString("phoneHash");
            this.F = this.f32570y.getString("phone");
            this.G = this.f32570y.getString("ephone");
            this.K = this.f32570y.getBoolean("setup");
            this.L = this.f32570y.getInt("length");
            this.H = this.f32570y.getString("email");
            this.D = this.f32570y.getInt("resetAvailablePeriod");
            this.E = this.f32570y.getInt("resetPendingDate");
            pg0 pg0Var = this.T;
            int i12 = pg0Var.C;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            ih.s sVar = this.f32563c;
            if (i12 == 3) {
                sVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.H));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.M) {
                sVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.H));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                if (this.E == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f32565n.setVisibility(i10);
                if (this.E != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f32566r.setVisibility(i11);
                if (this.E != 0) {
                    r();
                }
            }
            int i14 = this.L;
            xd0 xd0Var = this.f32561a;
            xd0Var.b(i14, 1);
            for (ds dsVar : xd0Var.f32635f) {
                dsVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                dsVar.addTextChangedListener(new p0(this, 7));
                dsVar.setOnFocusChangeListener(new sd(this, 2));
            }
            xd0Var.setText("");
            if (!this.K && pg0Var.C != 3) {
                String string = this.f32570y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28632a |= 256;
                    obj.f28633b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f28634c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i15, 0);
                }
                sVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            pg0.T0(pg0Var, xd0Var.f32635f[0]);
            xd0Var.requestFocus();
            if (!z4 && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.Q, bundle.getInt("timeout"));
            }
            if (this.E != 0) {
                AndroidUtilities.runOnUIThread(this.R, 1000L);
            }
        }
    }

    @Override
    public final void n() {
        this.f32562b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        this.f32563c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.f20115q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.v.a();
        this.f32564f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f32565n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f32566r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f32567s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
        this.f32561a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.C != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            xd0 xd0Var = this.f32561a;
            ds[] dsVarArr = xd0Var.f32635f;
            if (i10 < dsVarArr.length) {
                xd0Var.postDelayed(new org.telegram.ui.Components.dw(this, i10, 15), i10 * 75);
                i10++;
            } else {
                xd0Var.postDelayed(new w10(28, this, runnable), (dsVarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
    }

    public final void p() {
        if (this.S) {
            return;
        }
        this.S = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.F);
        bundle.putString("ephone", this.G);
        bundle.putString("phoneFormated", this.I);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.I;
        tL_auth_resetLoginEmail.phone_code_hash = this.J;
        this.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new rd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z4) {
        boolean z10;
        float f10;
        AndroidUtilities.updateViewVisibilityAnimated(this.f32564f, z4);
        if (!z4 && this.T.C != 3 && !this.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z10);
        org.telegram.ui.Components.m90 m90Var = this.v;
        if (m90Var.getVisibility() != 8) {
            if (z4) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            m90Var.setLayoutParams(k7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            m90Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.E - (System.currentTimeMillis() / 1000));
        int i10 = this.E;
        gg.q qVar = this.f32566r;
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
                StringBuilder sb = new StringBuilder();
                if (i14 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i14));
                }
                sb.append(str);
                Locale locale = Locale.ROOT;
                sb.append(String.format(locale, "%02d:", Integer.valueOf(i16)));
                sb.append(String.format(locale, "%02d", Integer.valueOf(i17)));
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb.toString());
            }
            String formatString2 = LocaleController.formatString(i11, formatString);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
            int indexOf = formatString2.indexOf(42);
            int lastIndexOf = formatString2.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new ForegroundColorSpan(this.T.getThemedColor(org.telegram.ui.ActionBar.j6.f20115q6)), indexOf, lastIndexOf - 1, 33);
            }
            qVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.R, 1000L);
            return;
        }
        qVar.setVisibility(0);
        qVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new td0(this, 0), 1000L);
    }
}
