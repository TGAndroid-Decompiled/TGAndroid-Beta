package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jc0 extends org.telegram.ui.Components.yt0 {
    public final ee0 D;
    public final nb0 f46916a;
    public final TextView f46917b;
    public final TextView f46918c;
    public final xh.l d;
    public final org.telegram.ui.Components.dh0 f46919e;
    public Bundle f46920f;
    public String h;
    public boolean f46921n;
    public String f46922r;
    public String f46923s;
    public String f46924w;
    public boolean f46925x;
    public final hc0 f46926y;

    public jc0(org.telegram.ui.ee0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jc0.<init>(org.telegram.ui.ee0, android.content.Context):void");
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
        this.f46920f = null;
        this.f46921n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f46921n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748726, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f46921n) {
            return;
        }
        nb0 nb0Var = this.f46916a;
        nb0Var.f43767e = true;
        for (dr drVar : nb0Var.f43768f) {
            drVar.A(0.0f);
        }
        String code = nb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f46921n = true;
        ee0 ee0Var = this.D;
        ee0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new j50(8, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new hc0(this, 0), ee0.f45367y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f46920f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f46916a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f46916a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f46920f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        nb0 nb0Var = this.f46916a;
        nb0Var.setText("");
        this.f46920f = bundle;
        this.h = bundle.getString("password");
        this.f46922r = this.f46920f.getString("requestPhone");
        this.f46923s = this.f46920f.getString("phoneHash");
        this.f46924w = this.f46920f.getString("phoneCode");
        String string = this.f46920f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f39836a |= 256;
            obj.f39837b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f39838c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.wy0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746081, null), valueOf));
        ee0.b1(this.D, nb0Var);
        nb0Var.requestFocus();
    }

    public final void n(boolean z9) {
        nb0 nb0Var = this.f46916a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            nb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            for (dr drVar : nb0Var.f43768f) {
                drVar.setText("");
            }
        }
        for (dr drVar2 : nb0Var.f43768f) {
            drVar2.z(1.0f);
        }
        nb0Var.f43768f[0].requestFocus();
        org.telegram.messenger.g0.G3(10.0f, nb0Var, new hc0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f46926y);
    }

    @Override
    public final void updateColors() {
        this.f46917b.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        this.f46918c.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false));
        this.f46916a.invalidate();
    }
}
