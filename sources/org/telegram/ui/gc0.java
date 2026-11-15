package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class gc0 extends org.telegram.ui.Components.xt0 {
    public final ce0 E;
    public final lb0 f47411a;
    public final TextView f47412b;
    public final TextView f47413c;
    public final xh.l d;
    public final org.telegram.ui.Components.fh0 f47414e;
    public Bundle f47415f;
    public String h;
    public boolean f47416n;
    public String f47417r;
    public String f47418s;
    public String f47419w;
    public boolean f47420x;
    public final ec0 f47421y;

    public gc0(org.telegram.ui.ce0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc0.<init>(org.telegram.ui.ce0, android.content.Context):void");
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
        this.f47415f = null;
        this.f47416n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f47416n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131748726, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f47416n) {
            return;
        }
        lb0 lb0Var = this.f47411a;
        lb0Var.f45490e = true;
        for (dr drVar : lb0Var.f45491f) {
            drVar.B(0.0f);
        }
        String code = lb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f47416n = true;
        ce0 ce0Var = this.E;
        ce0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new b00(10, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new ec0(this, 0), ce0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f47415f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f47411a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f47411a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f47415f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        lb0 lb0Var = this.f47411a;
        lb0Var.setText("");
        this.f47415f = bundle;
        this.h = bundle.getString("password");
        this.f47417r = this.f47415f.getString("requestPhone");
        this.f47418s = this.f47415f.getString("phoneHash");
        this.f47419w = this.f47415f.getString("phoneCode");
        String string = this.f47415f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f41484a |= 256;
            obj.f41485b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f41486c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.xy0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.hd.M0(2131746081, null), valueOf));
        ce0.b1(this.E, lb0Var);
        lb0Var.requestFocus();
    }

    public final void n(boolean z10) {
        lb0 lb0Var = this.f47411a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            lb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (dr drVar : lb0Var.f45491f) {
                drVar.setText("");
            }
        }
        for (dr drVar2 : lb0Var.f45491f) {
            drVar2.A(1.0f);
        }
        lb0Var.f45491f[0].requestFocus();
        org.telegram.messenger.g0.F3(10.0f, lb0Var, new ec0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f47421y);
    }

    @Override
    public final void updateColors() {
        this.f47412b.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f47413c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
        this.f47411a.invalidate();
    }
}
