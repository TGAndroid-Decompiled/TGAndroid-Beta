package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class af0 extends org.telegram.ui.Components.dx0 {
    public final de0 f35782a;
    public final TextView f35783b;
    public final TextView f35784c;
    public final vh.n d;
    public final org.telegram.ui.Components.ik0 f35785e;
    public Bundle f35786f;
    public String h;
    public boolean f35787n;
    public String f35788r;
    public String f35789s;
    public String v;
    public boolean f35790w;
    public final ye0 f35791x;
    public final xg0 f35792y;

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
        this.f35792y.k1(true, true);
        this.f35786f = null;
        this.f35787n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f35787n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f35787n) {
            return;
        }
        de0 de0Var = this.f35782a;
        de0Var.f37833e = true;
        for (hs hsVar : de0Var.f37834f) {
            hsVar.j(0.0f);
        }
        String code = de0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f35787n = true;
        xg0 xg0Var = this.f35792y;
        xg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new bc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ye0(this, 0), xg0.f43936t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f35786f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f35782a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f35782a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f35786f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        de0 de0Var = this.f35782a;
        de0Var.setText("");
        this.f35786f = bundle;
        this.h = bundle.getString("password");
        this.f35788r = this.f35786f.getString("requestPhone");
        this.f35789s = this.f35786f.getString("phoneHash");
        this.v = this.f35786f.getString("phoneCode");
        String string = this.f35786f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f33255a |= 256;
            obj.f33256b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f33257c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.a21(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        xg0.T0(this.f35792y, de0Var);
        de0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f35783b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f35784c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f35782a.invalidate();
    }

    public final void o(boolean z10) {
        de0 de0Var = this.f35782a;
        if (this.f35792y.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (hs hsVar : de0Var.f37834f) {
                hsVar.setText("");
            }
        }
        for (hs hsVar2 : de0Var.f37834f) {
            hsVar2.i(1.0f);
        }
        de0Var.f37834f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(de0Var, new ye0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f35791x);
    }
}
