package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bf0 extends org.telegram.ui.Components.gw0 {
    public final ee0 f32354a;
    public final TextView f32355b;
    public final TextView f32356c;
    public final vh.o d;
    public final org.telegram.ui.Components.lj0 e;
    public Bundle f32357f;
    public String h;
    public boolean f32358n;
    public String f32359r;
    public String f32360s;
    public String v;
    public boolean f32361w;
    public final ze0 f32362x;
    public final xg0 f32363y;

    public bf0(org.telegram.ui.xg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf0.<init>(org.telegram.ui.xg0, android.content.Context):void");
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
        this.f32363y.k1(true, true);
        this.f32357f = null;
        this.f32358n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f32358n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f32358n) {
            return;
        }
        ee0 ee0Var = this.f32354a;
        ee0Var.e = true;
        for (gs gsVar : ee0Var.f33074f) {
            gsVar.j(0.0f);
        }
        String code = ee0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f32358n = true;
        xg0 xg0Var = this.f32363y;
        xg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new cc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ze0(this, 0), xg0.f39460t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f32357f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f32354a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f32354a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f32357f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ee0 ee0Var = this.f32354a;
        ee0Var.setText("");
        this.f32357f = bundle;
        this.h = bundle.getString("password");
        this.f32359r = this.f32357f.getString("requestPhone");
        this.f32360s = this.f32357f.getString("phoneHash");
        this.v = this.f32357f.getString("phoneCode");
        String string = this.f32357f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f23395a |= 256;
            obj.f23396b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f23397c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        xg0.T0(this.f32363y, ee0Var);
        ee0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f32355b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f32356c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f32354a.invalidate();
    }

    public final void o(boolean z10) {
        ee0 ee0Var = this.f32354a;
        if (this.f32363y.getParentActivity() == null) {
            return;
        }
        try {
            ee0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (gs gsVar : ee0Var.f33074f) {
                gsVar.setText("");
            }
        }
        for (gs gsVar2 : ee0Var.f33074f) {
            gsVar2.i(1.0f);
        }
        ee0Var.f33074f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ee0Var, new ze0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f32362x);
    }
}
