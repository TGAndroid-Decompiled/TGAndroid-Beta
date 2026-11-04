package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fc0 extends org.telegram.ui.Components.vt0 {
    public final xd0 E;
    public final ib0 f45247a;
    public final TextView f45248b;
    public final TextView f45249c;
    public final yh.l d;
    public final org.telegram.ui.Components.fh0 f45250e;
    public Bundle f45251f;
    public String h;
    public boolean f45252n;
    public String f45253r;
    public String f45254s;
    public String f45255w;
    public boolean f45256x;
    public final dc0 f45257y;

    public fc0(org.telegram.ui.xd0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc0.<init>(org.telegram.ui.xd0, android.content.Context):void");
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
        this.E.t1(true, true);
        this.f45251f = null;
        this.f45252n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f45252n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131748734, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i3;
        if (this.f45252n) {
            return;
        }
        ib0 ib0Var = this.f45247a;
        ib0Var.f52077e = true;
        for (zq zqVar : ib0Var.f52078f) {
            zqVar.A(0.0f);
        }
        String code = ib0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f45252n = true;
        xd0 xd0Var = this.E;
        xd0Var.w1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_checkRecoveryPassword, new xy(11, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new dc0(this, 0), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f45251f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f45247a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f45247a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f45251f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ib0 ib0Var = this.f45247a;
        ib0Var.setText("");
        this.f45251f = bundle;
        this.h = bundle.getString("password");
        this.f45253r = this.f45251f.getString("requestPhone");
        this.f45254s = this.f45251f.getString("phoneHash");
        this.f45255w = this.f45251f.getString("phoneCode");
        String string = this.f45251f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f38578a |= 256;
            obj.f38579b = indexOf;
            int i3 = lastIndexOf + 1;
            obj.f38580c = i3;
            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i3, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746091, null), valueOf));
        xd0.a1(this.E, ib0Var);
        ib0Var.requestFocus();
    }

    public final void n(boolean z10) {
        ib0 ib0Var = this.f45247a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            ib0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (zq zqVar : ib0Var.f52078f) {
                zqVar.setText("");
            }
        }
        for (zq zqVar2 : ib0Var.f52078f) {
            zqVar2.z(1.0f);
        }
        ib0Var.f52078f[0].requestFocus();
        org.telegram.messenger.g0.G3(10.0f, ib0Var, new dc0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f45257y);
    }

    @Override
    public final void updateColors() {
        this.f45248b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f45249c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        this.f45247a.invalidate();
    }
}
