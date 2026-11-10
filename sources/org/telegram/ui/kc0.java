package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class kc0 extends org.telegram.ui.Components.xt0 {
    public final fe0 D;
    public final ob0 f47256a;
    public final TextView f47257b;
    public final TextView f47258c;
    public final xh.l d;
    public final org.telegram.ui.Components.ch0 f47259e;
    public Bundle f47260f;
    public String h;
    public boolean f47261n;
    public String f47262r;
    public String f47263s;
    public String f47264w;
    public boolean f47265x;
    public final ic0 f47266y;

    public kc0(org.telegram.ui.fe0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kc0.<init>(org.telegram.ui.fe0, android.content.Context):void");
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
        this.f47260f = null;
        this.f47261n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f47261n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748726, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f47261n) {
            return;
        }
        ob0 ob0Var = this.f47256a;
        ob0Var.f44117e = true;
        for (er erVar : ob0Var.f44118f) {
            erVar.A(0.0f);
        }
        String code = ob0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f47261n = true;
        fe0 fe0Var = this.D;
        fe0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new k50(8, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new ic0(this, 0), fe0.f45691y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f47260f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f47256a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f47256a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f47260f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        ob0 ob0Var = this.f47256a;
        ob0Var.setText("");
        this.f47260f = bundle;
        this.h = bundle.getString("password");
        this.f47262r = this.f47260f.getString("requestPhone");
        this.f47263s = this.f47260f.getString("phoneHash");
        this.f47264w = this.f47260f.getString("phoneCode");
        String string = this.f47260f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f38777a |= 256;
            obj.f38778b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f38779c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746081, null), valueOf));
        fe0.b1(this.D, ob0Var);
        ob0Var.requestFocus();
    }

    public final void n(boolean z9) {
        ob0 ob0Var = this.f47256a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            ob0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            for (er erVar : ob0Var.f44118f) {
                erVar.setText("");
            }
        }
        for (er erVar2 : ob0Var.f44118f) {
            erVar2.z(1.0f);
        }
        ob0Var.f44118f[0].requestFocus();
        org.telegram.messenger.g0.G3(10.0f, ob0Var, new ic0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f47266y);
    }

    @Override
    public final void updateColors() {
        this.f47257b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        this.f47258c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
        this.f47256a.invalidate();
    }
}
