package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hc0 extends org.telegram.ui.Components.wt0 {
    public final ce0 D;
    public final lb0 f46333a;
    public final TextView f46334b;
    public final TextView f46335c;
    public final xh.l d;
    public final org.telegram.ui.Components.ch0 f46336e;
    public Bundle f46337f;
    public String h;
    public boolean f46338n;
    public String f46339r;
    public String f46340s;
    public String f46341w;
    public boolean f46342x;
    public final fc0 f46343y;

    public hc0(org.telegram.ui.ce0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc0.<init>(org.telegram.ui.ce0, android.content.Context):void");
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
    public final boolean c(boolean z9) {
        this.D.C1(true, true);
        this.f46337f = null;
        this.f46338n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f46338n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748727, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f46338n) {
            return;
        }
        lb0 lb0Var = this.f46333a;
        lb0Var.f52288e = true;
        for (br brVar : lb0Var.f52289f) {
            brVar.A(0.0f);
        }
        String code = lb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f46338n = true;
        ce0 ce0Var = this.D;
        ce0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new h50(8, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new fc0(this, 0), ce0.f44760y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f46337f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f46333a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f46333a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f46337f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        lb0 lb0Var = this.f46333a;
        lb0Var.setText("");
        this.f46337f = bundle;
        this.h = bundle.getString("password");
        this.f46339r = this.f46337f.getString("requestPhone");
        this.f46340s = this.f46337f.getString("phoneHash");
        this.f46341w = this.f46337f.getString("phoneCode");
        String string = this.f46337f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f38779a |= 256;
            obj.f38780b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f38781c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746084, null), valueOf));
        ce0.b1(this.D, lb0Var);
        lb0Var.requestFocus();
    }

    public final void n(boolean z9) {
        lb0 lb0Var = this.f46333a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            lb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            for (br brVar : lb0Var.f52289f) {
                brVar.setText("");
            }
        }
        for (br brVar2 : lb0Var.f52289f) {
            brVar2.z(1.0f);
        }
        lb0Var.f52289f[0].requestFocus();
        org.telegram.messenger.g0.G3(10.0f, lb0Var, new fc0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f46343y);
    }

    @Override
    public final void updateColors() {
        this.f46334b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f46335c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28092q6, false));
        this.f46333a.invalidate();
    }
}
