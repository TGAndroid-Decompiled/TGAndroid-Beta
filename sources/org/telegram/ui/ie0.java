package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ie0 extends org.telegram.ui.Components.ow0 {
    public final kd0 f37842a;
    public final TextView f37843b;
    public final TextView f37844c;
    public final wh.n d;
    public final org.telegram.ui.Components.xj0 e;
    public Bundle f37845f;
    public String h;
    public boolean f37846n;
    public String f37847r;
    public String f37848s;
    public String v;
    public boolean f37849w;
    public final ge0 f37850x;
    public final eg0 f37851y;

    public ie0(org.telegram.ui.eg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ie0.<init>(org.telegram.ui.eg0, android.content.Context):void");
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
        this.f37851y.k1(true, true);
        this.f37845f = null;
        this.f37846n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f37846n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f37846n) {
            return;
        }
        kd0 kd0Var = this.f37842a;
        kd0Var.e = true;
        for (vr vrVar : kd0Var.f41477f) {
            vrVar.j(0.0f);
        }
        String code = kd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f37846n = true;
        eg0 eg0Var = this.f37851y;
        eg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new z40(9, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ge0(this, 0), eg0.f36488t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f37845f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f37842a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f37842a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f37845f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        kd0 kd0Var = this.f37842a;
        kd0Var.setText("");
        this.f37845f = bundle;
        this.h = bundle.getString("password");
        this.f37847r = this.f37845f.getString("requestPhone");
        this.f37848s = this.f37845f.getString("phoneHash");
        this.v = this.f37845f.getString("phoneCode");
        String string = this.f37845f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28049a |= 256;
            obj.f28050b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28051c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.m11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        eg0.T0(this.f37851y, kd0Var);
        kd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f37843b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f37844c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f37842a.invalidate();
    }

    public final void o(boolean z10) {
        kd0 kd0Var = this.f37842a;
        if (this.f37851y.getParentActivity() == null) {
            return;
        }
        try {
            kd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (vr vrVar : kd0Var.f41477f) {
                vrVar.setText("");
            }
        }
        for (vr vrVar2 : kd0Var.f41477f) {
            vrVar2.i(1.0f);
        }
        kd0Var.f41477f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(kd0Var, new ge0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f37850x);
    }
}
