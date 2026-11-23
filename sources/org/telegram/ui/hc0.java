package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hc0 extends org.telegram.ui.Components.iu0 {
    public final de0 E;
    public final mb0 f48318a;
    public final TextView f48319b;
    public final TextView f48320c;
    public final xh.l d;
    public final org.telegram.ui.Components.rh0 f48321e;
    public Bundle f48322f;
    public String h;
    public boolean f48323n;
    public String f48324r;
    public String f48325s;
    public String f48326w;
    public boolean f48327x;
    public final fc0 f48328y;

    public hc0(org.telegram.ui.de0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc0.<init>(org.telegram.ui.de0, android.content.Context):void");
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
        this.f48322f = null;
        this.f48323n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f48323n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.N0(2131748533, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f48323n) {
            return;
        }
        mb0 mb0Var = this.f48318a;
        mb0Var.f46300e = true;
        for (er erVar : mb0Var.f46301f) {
            erVar.B(0.0f);
        }
        String code = mb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f48323n = true;
        de0 de0Var = this.E;
        de0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new e00(10, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new fc0(this, 0), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f48322f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f48318a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48318a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f48322f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        mb0 mb0Var = this.f48318a;
        mb0Var.setText("");
        this.f48322f = bundle;
        this.h = bundle.getString("password");
        this.f48324r = this.f48322f.getString("requestPhone");
        this.f48325s = this.f48322f.getString("phoneHash");
        this.f48326w = this.f48322f.getString("phoneCode");
        String string = this.f48322f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f35337a |= 256;
            obj.f35338b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f35339c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.gz0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.hd.N0(2131745885, null), valueOf));
        de0.b1(this.E, mb0Var);
        mb0Var.requestFocus();
    }

    public final void n(boolean z10) {
        mb0 mb0Var = this.f48318a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            mb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (er erVar : mb0Var.f46301f) {
                erVar.setText("");
            }
        }
        for (er erVar2 : mb0Var.f46301f) {
            erVar2.A(1.0f);
        }
        mb0Var.f46301f[0].requestFocus();
        org.telegram.messenger.g0.E3(10.0f, mb0Var, new fc0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f48328y);
    }

    @Override
    public final void updateColors() {
        this.f48319b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        this.f48320c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29621q6, false));
        this.f48318a.invalidate();
    }
}
