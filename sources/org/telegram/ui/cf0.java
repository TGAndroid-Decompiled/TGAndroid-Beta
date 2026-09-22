package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cf0 extends org.telegram.ui.Components.hw0 {
    public final fe0 f32754a;
    public final TextView f32755b;
    public final TextView f32756c;
    public final vh.n d;
    public final org.telegram.ui.Components.nj0 e;
    public Bundle f32757f;
    public String h;
    public boolean f32758n;
    public String f32759r;
    public String f32760s;
    public String v;
    public boolean f32761w;
    public final af0 f32762x;
    public final yg0 f32763y;

    public cf0(org.telegram.ui.yg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.<init>(org.telegram.ui.yg0, android.content.Context):void");
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.f32763y.k1(true, true);
        this.f32757f = null;
        this.f32758n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f32758n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f32758n) {
            return;
        }
        fe0 fe0Var = this.f32754a;
        fe0Var.e = true;
        for (gs gsVar : fe0Var.f33145f) {
            gsVar.j(0.0f);
        }
        String code = fe0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f32758n = true;
        yg0 yg0Var = this.f32763y;
        yg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new dc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new af0(this, 0), yg0.f39928t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f32757f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f32754a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f32754a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f32757f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        fe0 fe0Var = this.f32754a;
        fe0Var.setText("");
        this.f32757f = bundle;
        this.h = bundle.getString("password");
        this.f32759r = this.f32757f.getString("requestPhone");
        this.f32760s = this.f32757f.getString("phoneHash");
        this.v = this.f32757f.getString("phoneCode");
        String string = this.f32757f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f23827a |= 256;
            obj.f23828b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f23829c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.f11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        yg0.T0(this.f32763y, fe0Var);
        fe0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f32755b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f32756c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f32754a.invalidate();
    }

    public final void o(boolean z10) {
        fe0 fe0Var = this.f32754a;
        if (this.f32763y.getParentActivity() == null) {
            return;
        }
        try {
            fe0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (gs gsVar : fe0Var.f33145f) {
                gsVar.setText("");
            }
        }
        for (gs gsVar2 : fe0Var.f33145f) {
            gsVar2.i(1.0f);
        }
        fe0Var.f33145f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(fe0Var, new af0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f32762x);
    }
}
