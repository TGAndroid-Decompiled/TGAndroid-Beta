package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ef0 extends org.telegram.ui.Components.tw0 {
    public final ge0 f35277a;
    public final TextView f35278b;
    public final TextView f35279c;
    public final wh.n d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f35280f;
    public String h;
    public boolean f35281n;
    public String f35282r;
    public String f35283s;
    public String v;
    public boolean f35284w;
    public final cf0 f35285x;
    public final ah0 f35286y;

    public ef0(org.telegram.ui.ah0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ef0.<init>(org.telegram.ui.ah0, android.content.Context):void");
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
        this.f35286y.k1(true, true);
        this.f35280f = null;
        this.f35281n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f35281n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f35281n) {
            return;
        }
        ge0 ge0Var = this.f35277a;
        ge0Var.e = true;
        for (ks ksVar : ge0Var.f36645f) {
            ksVar.j(0.0f);
        }
        String code = ge0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f35281n = true;
        ah0 ah0Var = this.f35286y;
        ah0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new ec0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new cf0(this, 0), ah0.f33904t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f35280f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f35277a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f35277a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f35280f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ge0 ge0Var = this.f35277a;
        ge0Var.setText("");
        this.f35280f = bundle;
        this.h = bundle.getString("password");
        this.f35282r = this.f35280f.getString("requestPhone");
        this.f35283s = this.f35280f.getString("phoneHash");
        this.v = this.f35280f.getString("phoneCode");
        String string = this.f35280f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28163a |= 256;
            obj.f28164b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28165c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        ah0.T0(this.f35286y, ge0Var);
        ge0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f35278b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f35279c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f35277a.invalidate();
    }

    public final void o(boolean z10) {
        ge0 ge0Var = this.f35277a;
        if (this.f35286y.getParentActivity() == null) {
            return;
        }
        try {
            ge0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (ks ksVar : ge0Var.f36645f) {
                ksVar.setText("");
            }
        }
        for (ks ksVar2 : ge0Var.f36645f) {
            ksVar2.i(1.0f);
        }
        ge0Var.f36645f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ge0Var, new cf0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f35285x);
    }
}
