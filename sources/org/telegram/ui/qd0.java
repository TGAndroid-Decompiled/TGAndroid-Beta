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
public final class qd0 extends org.telegram.ui.Components.bx0 {
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
    public final ig0 W;
    public final nd0 f42672a;
    public final TextView f42673b;
    public final xh.n f42674c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f42675f;
    public final FrameLayout h;
    public final bi.md f42676n;
    public final bi.md f42677r;
    public final TextView f42678s;
    public final org.telegram.ui.Components.ha0 v;
    public final org.telegram.ui.Components.bk0 f42679w;
    public boolean f42680x;
    public Bundle f42681y;

    public qd0(org.telegram.ui.ig0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qd0.<init>(org.telegram.ui.ig0, android.content.Context, boolean):void");
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
            nd0 nd0Var = this.f42672a;
            nd0Var.e = true;
            zr[] zrVarArr = nd0Var.f45772f;
            if (zrVarArr != null) {
                for (zr zrVar : zrVarArr) {
                    zrVar.j(0.0f);
                }
            }
            String code = nd0Var.getCode();
            int length = code.length();
            ig0 ig0Var = this.W;
            if (length == 0 && this.F == null) {
                if (ig0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    nd0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (zr zrVar2 : nd0Var.f45772f) {
                    zrVar2.i(1.0f);
                }
                nd0Var.f45772f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(nd0Var, new jd0(this, 1));
                return;
            }
            this.E = true;
            ig0Var.s1(0, true);
            if (ig0Var.F == 3) {
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
            nd0Var.e = true;
            zr[] zrVarArr2 = nd0Var.f45772f;
            if (zrVarArr2 != null) {
                for (zr zrVar3 : zrVarArr2) {
                    zrVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new gd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f42680x) {
            this.f42680x = false;
        } else {
            AndroidUtilities.runOnUIThread(new jd0(this, 8), ig0.f40139y0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f42681y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f42672a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f42672a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f42681y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        zr[] zrVarArr;
        if (bundle != null) {
            this.f42681y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f42681y.getString("phoneHash");
            this.I = this.f42681y.getString("phone");
            this.J = this.f42681y.getString("ephone");
            this.N = this.f42681y.getBoolean("setup");
            this.O = this.f42681y.getInt("length");
            this.K = this.f42681y.getString("email");
            this.G = this.f42681y.getInt("resetAvailablePeriod");
            this.H = this.f42681y.getInt("resetPendingDate");
            ig0 ig0Var = this.W;
            int i12 = ig0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            xh.n nVar = this.f42674c;
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
                this.f42676n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f42677r.setVisibility(i11);
                if (this.H != 0) {
                    q();
                }
            }
            int i14 = this.O;
            nd0 nd0Var = this.f42672a;
            nd0Var.b(i14, 1);
            for (zr zrVar : nd0Var.f45772f) {
                zrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                zrVar.addTextChangedListener(new m0(this, 7));
                zrVar.setOnFocusChangeListener(new rd(this, 2));
            }
            nd0Var.setText("");
            if (!this.N && ig0Var.F != 3) {
                String string = this.f42681y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f35208a |= 256;
                    obj.f35209b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f35210c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.a21(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            ig0.W0(ig0Var, nd0Var.f45772f[0]);
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
            nd0 nd0Var = this.f42672a;
            zr[] zrVarArr = nd0Var.f45772f;
            if (i10 < zrVarArr.length) {
                nd0Var.postDelayed(new org.telegram.ui.Components.h2(this, i10, 20), i10 * 75);
                i10++;
            } else {
                nd0Var.postDelayed(new kb0(4, this, runnable), (zrVarArr.length * 75) + 400);
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
        AndroidUtilities.updateViewVisibilityAnimated(this.f42675f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.ha0 ha0Var = this.v;
        if (ha0Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            ha0Var.setLayoutParams(org.telegram.ui.Components.kb1.h(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            ha0Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        bi.md mdVar = this.f42677r;
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
                valueOf.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23598q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            mdVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        mdVar.setVisibility(0);
        mdVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new jd0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f42673b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        int i10 = org.telegram.ui.ActionBar.y6.D6;
        this.f42674c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.y6.f23598q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.v.updateColors();
        this.f42675f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f42676n.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f42677r.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f42678s.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23599q7, false));
        this.f42672a.invalidate();
    }
}
