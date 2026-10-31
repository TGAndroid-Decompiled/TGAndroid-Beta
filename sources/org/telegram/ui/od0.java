package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od0 extends org.telegram.ui.Components.zu0 {
    public final hf0 D;
    public final uc0 f40232a;
    public final TextView f40233b;
    public final TextView f40234c;
    public final nh.p d;
    public final org.telegram.ui.Components.ei0 e;
    public Bundle f40235f;
    public String h;
    public boolean f40236n;
    public String f40237r;
    public String f40238s;
    public String f40239w;
    public boolean f40240x;
    public final md0 f40241y;

    public od0(org.telegram.ui.hf0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.od0.<init>(org.telegram.ui.hf0, android.content.Context):void");
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
        this.D.s1(true, true);
        this.f40235f = null;
        this.f40236n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f40236n = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748737, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f40236n) {
            return;
        }
        uc0 uc0Var = this.f40232a;
        uc0Var.e = true;
        for (bs bsVar : uc0Var.f44219f) {
            bsVar.A(0.0f);
        }
        String code = uc0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f40236n = true;
        hf0 hf0Var = this.D;
        hf0Var.v1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new org.telegram.ui.Components.t20(22, this, code), 10);
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new md0(this, 0), hf0.f37917y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f40235f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f40232a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40232a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f40235f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        uc0 uc0Var = this.f40232a;
        uc0Var.setText("");
        this.f40235f = bundle;
        this.h = bundle.getString("password");
        this.f40237r = this.f40235f.getString("requestPhone");
        this.f40238s = this.f40235f.getString("phoneHash");
        this.f40239w = this.f40235f.getString("phoneCode");
        String string = this.f40235f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f32850a |= 256;
            obj.f32851b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f32852c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.zz0(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746098, null), valueOf));
        hf0.Z0(this.D, uc0Var);
        uc0Var.requestFocus();
    }

    public final void n(boolean z10) {
        uc0 uc0Var = this.f40232a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (bs bsVar : uc0Var.f44219f) {
                bsVar.setText("");
            }
        }
        for (bs bsVar2 : uc0Var.f44219f) {
            bsVar2.z(1.0f);
        }
        uc0Var.f44219f[0].requestFocus();
        org.telegram.messenger.i0.F3(10.0f, uc0Var, new md0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f40241y);
    }

    @Override
    public final void updateColors() {
        this.f40233b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        this.f40234c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f40232a.invalidate();
    }
}
