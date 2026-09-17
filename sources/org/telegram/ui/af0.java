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
    public final de0 f34400a;
    public final TextView f34401b;
    public final TextView f34402c;
    public final wh.p d;
    public final org.telegram.ui.Components.aj0 f34403e;
    public Bundle f34404f;
    public String h;
    public boolean f34405n;
    public String f34406r;
    public String f34407s;
    public String v;
    public boolean f34408w;
    public final ye0 f34409x;
    public final wg0 f34410y;

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
        this.f34410y.k1(true, true);
        this.f34404f = null;
        this.f34405n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f34405n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f34405n) {
            return;
        }
        de0 de0Var = this.f34400a;
        de0Var.f36163e = true;
        for (gs gsVar : de0Var.f36164f) {
            gsVar.j(0.0f);
        }
        String code = de0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f34405n = true;
        wg0 wg0Var = this.f34410y;
        wg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new bc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ye0(this, 0), wg0.f42359t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f34404f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f34400a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f34400a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f34404f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        de0 de0Var = this.f34400a;
        de0Var.setText("");
        this.f34404f = bundle;
        this.h = bundle.getString("password");
        this.f34406r = this.f34404f.getString("requestPhone");
        this.f34407s = this.f34404f.getString("phoneHash");
        this.v = this.f34404f.getString("phoneCode");
        String string = this.f34404f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28592a |= 256;
            obj.f28593b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28594c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.o01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        wg0.T0(this.f34410y, de0Var);
        de0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f34401b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f34402c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f34400a.invalidate();
    }

    public final void o(boolean z10) {
        de0 de0Var = this.f34400a;
        if (this.f34410y.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (gs gsVar : de0Var.f36164f) {
                gsVar.setText("");
            }
        }
        for (gs gsVar2 : de0Var.f36164f) {
            gsVar2.i(1.0f);
        }
        de0Var.f36164f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(de0Var, new ye0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f34409x);
    }
}
