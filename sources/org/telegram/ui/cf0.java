package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cf0 extends org.telegram.ui.Components.vv0 {
    public final fe0 f32776a;
    public final TextView f32777b;
    public final TextView f32778c;
    public final vh.o d;
    public final org.telegram.ui.Components.bj0 e;
    public Bundle f32779f;
    public String h;
    public boolean f32780n;
    public String f32781r;
    public String f32782s;
    public String v;
    public boolean f32783w;
    public final af0 f32784x;
    public final yg0 f32785y;

    public cf0(org.telegram.ui.yg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.<init>(org.telegram.ui.yg0, android.content.Context):void");
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
        this.f32785y.k1(true, true);
        this.f32779f = null;
        this.f32780n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f32780n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f32780n) {
            return;
        }
        fe0 fe0Var = this.f32776a;
        fe0Var.e = true;
        for (is isVar : fe0Var.f33749f) {
            isVar.j(0.0f);
        }
        String code = fe0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f32780n = true;
        yg0 yg0Var = this.f32785y;
        yg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new dc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new af0(this, 0), yg0.f39882t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f32779f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f32776a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f32776a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f32779f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        fe0 fe0Var = this.f32776a;
        fe0Var.setText("");
        this.f32779f = bundle;
        this.h = bundle.getString("password");
        this.f32781r = this.f32779f.getString("requestPhone");
        this.f32782s = this.f32779f.getString("phoneHash");
        this.v = this.f32779f.getString("phoneCode");
        String string = this.f32779f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f26905a |= 256;
            obj.f26906b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f26907c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.q01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        yg0.T0(this.f32785y, fe0Var);
        fe0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f32777b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f32778c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f32776a.invalidate();
    }

    public final void o(boolean z10) {
        fe0 fe0Var = this.f32776a;
        if (this.f32785y.getParentActivity() == null) {
            return;
        }
        try {
            fe0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (is isVar : fe0Var.f33749f) {
                isVar.setText("");
            }
        }
        for (is isVar2 : fe0Var.f33749f) {
            isVar2.i(1.0f);
        }
        fe0Var.f33749f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(fe0Var, new af0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f32784x);
    }
}
