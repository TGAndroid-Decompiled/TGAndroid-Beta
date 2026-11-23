package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hc0 extends org.telegram.ui.Components.iu0 {
    public final de0 E;
    public final mb0 f48283a;
    public final TextView f48284b;
    public final TextView f48285c;
    public final xh.l d;
    public final org.telegram.ui.Components.rh0 f48286e;
    public Bundle f48287f;
    public String h;
    public boolean f48288n;
    public String f48289r;
    public String f48290s;
    public String f48291w;
    public boolean f48292x;
    public final fc0 f48293y;

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
        this.f48287f = null;
        this.f48288n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f48288n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.N0(2131748533, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.f48288n) {
            return;
        }
        mb0 mb0Var = this.f48283a;
        mb0Var.f46274e = true;
        for (er erVar : mb0Var.f46275f) {
            erVar.B(0.0f);
        }
        String code = mb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f48288n = true;
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
        this.f48287f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f48283a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48283a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f48287f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        mb0 mb0Var = this.f48283a;
        mb0Var.setText("");
        this.f48287f = bundle;
        this.h = bundle.getString("password");
        this.f48289r = this.f48287f.getString("requestPhone");
        this.f48290s = this.f48287f.getString("phoneHash");
        this.f48291w = this.f48287f.getString("phoneCode");
        String string = this.f48287f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f35299a |= 256;
            obj.f35300b = indexOf;
            int i7 = lastIndexOf + 1;
            obj.f35301c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.gz0(obj, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.hd.N0(2131745885, null), valueOf));
        de0.b1(this.E, mb0Var);
        mb0Var.requestFocus();
    }

    public final void n(boolean z10) {
        mb0 mb0Var = this.f48283a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            mb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (er erVar : mb0Var.f46275f) {
                erVar.setText("");
            }
        }
        for (er erVar2 : mb0Var.f46275f) {
            erVar2.A(1.0f);
        }
        mb0Var.f46275f[0].requestFocus();
        org.telegram.messenger.g0.E3(10.0f, mb0Var, new fc0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f48293y);
    }

    @Override
    public final void updateColors() {
        this.f48284b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        this.f48285c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29587q6, false));
        this.f48283a.invalidate();
    }
}
