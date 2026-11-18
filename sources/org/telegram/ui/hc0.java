package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hc0 extends org.telegram.ui.Components.fu0 {
    public final ee0 E;
    public final mb0 f48240a;
    public final TextView f48241b;
    public final TextView f48242c;
    public final xh.l d;
    public final org.telegram.ui.Components.ph0 f48243e;
    public Bundle f48244f;
    public String h;
    public boolean f48245n;
    public String f48246r;
    public String f48247s;
    public String f48248w;
    public boolean f48249x;
    public final fc0 f48250y;

    public hc0(org.telegram.ui.ee0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc0.<init>(org.telegram.ui.ee0, android.content.Context):void");
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
        this.f48244f = null;
        this.f48245n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f48245n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.M0(2131748534, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f48245n) {
            return;
        }
        mb0 mb0Var = this.f48240a;
        mb0Var.f46273e = true;
        for (er erVar : mb0Var.f46274f) {
            erVar.B(0.0f);
        }
        String code = mb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f48245n = true;
        ee0 ee0Var = this.E;
        ee0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new e00(10, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new fc0(this, 0), ee0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f48244f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f48240a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48240a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f48244f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        mb0 mb0Var = this.f48240a;
        mb0Var.setText("");
        this.f48244f = bundle;
        this.h = bundle.getString("password");
        this.f48246r = this.f48244f.getString("requestPhone");
        this.f48247s = this.f48244f.getString("phoneHash");
        this.f48248w = this.f48244f.getString("phoneCode");
        String string = this.f48244f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f34537a |= 256;
            obj.f34538b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f34539c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.ez0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.gd.M0(2131745886, null), valueOf));
        ee0.b1(this.E, mb0Var);
        mb0Var.requestFocus();
    }

    public final void n(boolean z10) {
        mb0 mb0Var = this.f48240a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            mb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (er erVar : mb0Var.f46274f) {
                erVar.setText("");
            }
        }
        for (er erVar2 : mb0Var.f46274f) {
            erVar2.A(1.0f);
        }
        mb0Var.f46274f[0].requestFocus();
        org.telegram.messenger.g0.E3(10.0f, mb0Var, new fc0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f48250y);
    }

    @Override
    public final void updateColors() {
        this.f48241b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        this.f48242c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29634q6, false));
        this.f48240a.invalidate();
    }
}
