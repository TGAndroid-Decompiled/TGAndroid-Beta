package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gc0 extends org.telegram.ui.Components.hu0 {
    public final de0 E;
    public final lb0 f48223a;
    public final TextView f48224b;
    public final TextView f48225c;
    public final xh.l d;
    public final org.telegram.ui.Components.qh0 f48226e;
    public Bundle f48227f;
    public String h;
    public boolean f48228n;
    public String f48229r;
    public String f48230s;
    public String f48231w;
    public boolean f48232x;
    public final ec0 f48233y;

    public gc0(org.telegram.ui.de0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc0.<init>(org.telegram.ui.de0, android.content.Context):void");
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
        this.E.C1(true, true);
        this.f48227f = null;
        this.f48228n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f48228n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131748533, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f48228n) {
            return;
        }
        lb0 lb0Var = this.f48223a;
        lb0Var.f46490e = true;
        for (er erVar : lb0Var.f46491f) {
            erVar.B(0.0f);
        }
        String code = lb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f48228n = true;
        de0 de0Var = this.E;
        de0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new d00(10, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new ec0(this, 0), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f48227f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f48223a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48223a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f48227f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        lb0 lb0Var = this.f48223a;
        lb0Var.setText("");
        this.f48227f = bundle;
        this.h = bundle.getString("password");
        this.f48229r = this.f48227f.getString("requestPhone");
        this.f48230s = this.f48227f.getString("phoneHash");
        this.f48231w = this.f48227f.getString("phoneCode");
        String string = this.f48227f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f34924a |= 256;
            obj.f34925b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f34926c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.fz0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.gd.N0(2131745885, null), valueOf));
        de0.b1(this.E, lb0Var);
        lb0Var.requestFocus();
    }

    public final void n(boolean z10) {
        lb0 lb0Var = this.f48223a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            lb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (er erVar : lb0Var.f46491f) {
                erVar.setText("");
            }
        }
        for (er erVar2 : lb0Var.f46491f) {
            erVar2.A(1.0f);
        }
        lb0Var.f46491f[0].requestFocus();
        org.telegram.messenger.g0.E3(10.0f, lb0Var, new ec0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f48233y);
    }

    @Override
    public final void updateColors() {
        this.f48224b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        this.f48225c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29691q6, false));
        this.f48223a.invalidate();
    }
}
