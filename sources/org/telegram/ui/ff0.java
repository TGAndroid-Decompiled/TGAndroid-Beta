package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ff0 extends org.telegram.ui.Components.tw0 {
    public final ie0 f35813a;
    public final TextView f35814b;
    public final TextView f35815c;
    public final wh.n d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f35816f;
    public String h;
    public boolean f35817n;
    public String f35818r;
    public String f35819s;
    public String v;
    public boolean f35820w;
    public final df0 f35821x;
    public final bh0 f35822y;

    public ff0(org.telegram.ui.bh0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.<init>(org.telegram.ui.bh0, android.content.Context):void");
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
        this.f35822y.k1(true, true);
        this.f35816f = null;
        this.f35817n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f35817n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f35817n) {
            return;
        }
        ie0 ie0Var = this.f35813a;
        ie0Var.e = true;
        for (ks ksVar : ie0Var.f36949f) {
            ksVar.j(0.0f);
        }
        String code = ie0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f35817n = true;
        bh0 bh0Var = this.f35822y;
        bh0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new fc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new df0(this, 0), bh0.f34542t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f35816f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f35813a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f35813a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f35816f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ie0 ie0Var = this.f35813a;
        ie0Var.setText("");
        this.f35816f = bundle;
        this.h = bundle.getString("password");
        this.f35818r = this.f35816f.getString("requestPhone");
        this.f35819s = this.f35816f.getString("phoneHash");
        this.v = this.f35816f.getString("phoneCode");
        String string = this.f35816f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28135a |= 256;
            obj.f28136b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28137c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        bh0.T0(this.f35822y, ie0Var);
        ie0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f35814b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f35815c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f35813a.invalidate();
    }

    public final void o(boolean z10) {
        ie0 ie0Var = this.f35813a;
        if (this.f35822y.getParentActivity() == null) {
            return;
        }
        try {
            ie0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (ks ksVar : ie0Var.f36949f) {
                ksVar.setText("");
            }
        }
        for (ks ksVar2 : ie0Var.f36949f) {
            ksVar2.i(1.0f);
        }
        ie0Var.f36949f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ie0Var, new df0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f35821x);
    }
}
