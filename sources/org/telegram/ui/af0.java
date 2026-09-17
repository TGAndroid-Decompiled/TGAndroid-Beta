package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class af0 extends org.telegram.ui.Components.tv0 {
    public final de0 f34427a;
    public final TextView f34428b;
    public final TextView f34429c;
    public final wh.p d;
    public final org.telegram.ui.Components.aj0 f34430e;
    public Bundle f34431f;
    public String h;
    public boolean f34432n;
    public String f34433r;
    public String f34434s;
    public String v;
    public boolean f34435w;
    public final ye0 f34436x;
    public final wg0 f34437y;

    public af0(org.telegram.ui.wg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.af0.<init>(org.telegram.ui.wg0, android.content.Context):void");
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
        this.f34437y.k1(true, true);
        this.f34431f = null;
        this.f34432n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f34432n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f34432n) {
            return;
        }
        de0 de0Var = this.f34427a;
        de0Var.f36190e = true;
        for (gs gsVar : de0Var.f36191f) {
            gsVar.j(0.0f);
        }
        String code = de0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f34432n = true;
        wg0 wg0Var = this.f34437y;
        wg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new bc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ye0(this, 0), wg0.f42386t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f34431f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f34427a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f34427a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f34431f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        de0 de0Var = this.f34427a;
        de0Var.setText("");
        this.f34431f = bundle;
        this.h = bundle.getString("password");
        this.f34433r = this.f34431f.getString("requestPhone");
        this.f34434s = this.f34431f.getString("phoneHash");
        this.v = this.f34431f.getString("phoneCode");
        String string = this.f34431f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28619a |= 256;
            obj.f28620b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28621c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.o01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        wg0.T0(this.f34437y, de0Var);
        de0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f34428b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f34429c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f34427a.invalidate();
    }

    public final void o(boolean z10) {
        de0 de0Var = this.f34427a;
        if (this.f34437y.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (gs gsVar : de0Var.f36191f) {
                gsVar.setText("");
            }
        }
        for (gs gsVar2 : de0Var.f36191f) {
            gsVar2.i(1.0f);
        }
        de0Var.f36191f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(de0Var, new ye0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f34436x);
    }
}
