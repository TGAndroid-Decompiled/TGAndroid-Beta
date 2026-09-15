package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class af0 extends org.telegram.ui.Components.uv0 {
    public final de0 f31805a;
    public final TextView f31806b;
    public final TextView f31807c;
    public final vh.o d;
    public final org.telegram.ui.Components.aj0 e;
    public Bundle f31808f;
    public String h;
    public boolean f31809n;
    public String f31810r;
    public String f31811s;
    public String v;
    public boolean f31812w;
    public final ye0 f31813x;
    public final wg0 f31814y;

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
        this.f31814y.k1(true, true);
        this.f31808f = null;
        this.f31809n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f31809n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f31809n) {
            return;
        }
        de0 de0Var = this.f31805a;
        de0Var.e = true;
        for (gs gsVar : de0Var.f33120f) {
            gsVar.j(0.0f);
        }
        String code = de0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f31809n = true;
        wg0 wg0Var = this.f31814y;
        wg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new bc0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ye0(this, 0), wg0.f39192t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f31808f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f31805a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f31805a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f31808f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        de0 de0Var = this.f31805a;
        de0Var.setText("");
        this.f31808f = bundle;
        this.h = bundle.getString("password");
        this.f31810r = this.f31808f.getString("requestPhone");
        this.f31811s = this.f31808f.getString("phoneHash");
        this.v = this.f31808f.getString("phoneCode");
        String string = this.f31808f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f26643a |= 256;
            obj.f26644b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f26645c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.p01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        wg0.T0(this.f31814y, de0Var);
        de0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f31806b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f31807c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f31805a.invalidate();
    }

    public final void o(boolean z10) {
        de0 de0Var = this.f31805a;
        if (this.f31814y.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (gs gsVar : de0Var.f33120f) {
                gsVar.setText("");
            }
        }
        for (gs gsVar2 : de0Var.f33120f) {
            gsVar2.i(1.0f);
        }
        de0Var.f33120f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(de0Var, new ye0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f31813x);
    }
}
