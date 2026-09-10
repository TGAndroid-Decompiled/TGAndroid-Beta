package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class af0 extends org.telegram.ui.Components.fw0 {
    public final de0 f30986a;
    public final TextView f30987b;
    public final TextView f30988c;
    public final uh.o d;
    public final org.telegram.ui.Components.kj0 e;
    public Bundle f30989f;
    public String h;
    public boolean f30990n;
    public String f30991r;
    public String f30992s;
    public String v;
    public boolean f30993w;
    public final ye0 f30994x;
    public final xg0 f30995y;

    public af0(org.telegram.ui.xg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.af0.<init>(org.telegram.ui.xg0, android.content.Context):void");
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
        this.f30995y.k1(true, true);
        this.f30989f = null;
        this.f30990n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f30990n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f30990n) {
            return;
        }
        de0 de0Var = this.f30986a;
        de0Var.e = true;
        for (hs hsVar : de0Var.f32906f) {
            hsVar.j(0.0f);
        }
        String code = de0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f30990n = true;
        xg0 xg0Var = this.f30995y;
        xg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new org.telegram.ui.Components.th(27, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ye0(this, 0), xg0.f38716t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f30989f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f30986a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f30986a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f30989f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        de0 de0Var = this.f30986a;
        de0Var.setText("");
        this.f30989f = bundle;
        this.h = bundle.getString("password");
        this.f30991r = this.f30989f.getString("requestPhone");
        this.f30992s = this.f30989f.getString("phoneHash");
        this.v = this.f30989f.getString("phoneCode");
        String string = this.f30989f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f21677a |= 256;
            obj.f21678b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f21679c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.c11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        xg0.T0(this.f30995y, de0Var);
        de0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f30987b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f30988c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f30986a.invalidate();
    }

    public final void o(boolean z10) {
        de0 de0Var = this.f30986a;
        if (this.f30995y.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (hs hsVar : de0Var.f32906f) {
                hsVar.setText("");
            }
        }
        for (hs hsVar2 : de0Var.f32906f) {
            hsVar2.i(1.0f);
        }
        de0Var.f32906f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(de0Var, new ye0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f30994x);
    }
}
