package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd0 extends org.telegram.ui.Components.av0 {
    public final gf0 D;
    public final tc0 f39859a;
    public final TextView f39860b;
    public final TextView f39861c;
    public final nh.p d;
    public final org.telegram.ui.Components.fi0 e;
    public Bundle f39862f;
    public String h;
    public boolean f39863n;
    public String f39864r;
    public String f39865s;
    public String f39866w;
    public boolean f39867x;
    public final ld0 f39868y;

    public nd0(org.telegram.ui.gf0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nd0.<init>(org.telegram.ui.gf0, android.content.Context):void");
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
        this.D.t1(true, true);
        this.f39862f = null;
        this.f39863n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39863n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.dd.L0(2131748737, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f39863n) {
            return;
        }
        tc0 tc0Var = this.f39859a;
        tc0Var.e = true;
        for (bs bsVar : tc0Var.f44045f) {
            bsVar.A(0.0f);
        }
        String code = tc0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f39863n = true;
        gf0 gf0Var = this.D;
        gf0Var.w1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new org.telegram.ui.Components.t20(22, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new ld0(this, 0), gf0.f37470y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f39862f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f39859a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39859a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f39862f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        tc0 tc0Var = this.f39859a;
        tc0Var.setText("");
        this.f39862f = bundle;
        this.h = bundle.getString("password");
        this.f39864r = this.f39862f.getString("requestPhone");
        this.f39865s = this.f39862f.getString("phoneHash");
        this.f39866w = this.f39862f.getString("phoneCode");
        String string = this.f39862f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f33282a |= 256;
            obj.f33283b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f33284c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.a01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746098, null), valueOf));
        gf0.a1(this.D, tc0Var);
        tc0Var.requestFocus();
    }

    public final void n(boolean z10) {
        tc0 tc0Var = this.f39859a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            tc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (bs bsVar : tc0Var.f44045f) {
                bsVar.setText("");
            }
        }
        for (bs bsVar2 : tc0Var.f44045f) {
            bsVar2.z(1.0f);
        }
        tc0Var.f44045f[0].requestFocus();
        org.telegram.messenger.i0.F3(10.0f, tc0Var, new ld0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39868y);
    }

    @Override
    public final void updateColors() {
        this.f39860b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        this.f39861c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f39859a.invalidate();
    }
}
