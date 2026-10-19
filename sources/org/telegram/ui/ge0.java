package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ge0 extends org.telegram.ui.Components.pw0 {
    public final id0 f37292a;
    public final TextView f37293b;
    public final TextView f37294c;
    public final wh.n d;
    public final org.telegram.ui.Components.xj0 e;
    public Bundle f37295f;
    public String h;
    public boolean f37296n;
    public String f37297r;
    public String f37298s;
    public String v;
    public boolean f37299w;
    public final ee0 f37300x;
    public final dg0 f37301y;

    public ge0(org.telegram.ui.dg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ge0.<init>(org.telegram.ui.dg0, android.content.Context):void");
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
        this.f37301y.k1(true, true);
        this.f37295f = null;
        this.f37296n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f37296n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f37296n) {
            return;
        }
        id0 id0Var = this.f37292a;
        id0Var.e = true;
        for (tr trVar : id0Var.f40953f) {
            trVar.j(0.0f);
        }
        String code = id0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f37296n = true;
        dg0 dg0Var = this.f37301y;
        dg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new x40(9, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ee0(this, 0), dg0.f36359t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f37295f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f37292a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f37292a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f37295f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        id0 id0Var = this.f37292a;
        id0Var.setText("");
        this.f37295f = bundle;
        this.h = bundle.getString("password");
        this.f37297r = this.f37295f.getString("requestPhone");
        this.f37298s = this.f37295f.getString("phoneHash");
        this.v = this.f37295f.getString("phoneCode");
        String string = this.f37295f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28357a |= 256;
            obj.f28358b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28359c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.n11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        dg0.T0(this.f37301y, id0Var);
        id0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f37293b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f37294c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f37292a.invalidate();
    }

    public final void o(boolean z10) {
        id0 id0Var = this.f37292a;
        if (this.f37301y.getParentActivity() == null) {
            return;
        }
        try {
            id0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (tr trVar : id0Var.f40953f) {
                trVar.setText("");
            }
        }
        for (tr trVar2 : id0Var.f40953f) {
            trVar2.i(1.0f);
        }
        id0Var.f40953f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(id0Var, new ee0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f37300x);
    }
}
