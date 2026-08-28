package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class je0 extends org.telegram.ui.Components.cv0 {
    public final ld0 f39453a;
    public final TextView f39454b;
    public final TextView f39455c;
    public final dh.u d;
    public final org.telegram.ui.Components.pi0 f39456e;
    public Bundle f39457f;
    public String h;
    public boolean f39458n;
    public String f39459r;
    public String f39460s;
    public String v;
    public boolean f39461w;
    public final he0 f39462x;
    public final fg0 f39463y;

    public je0(org.telegram.ui.fg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je0.<init>(org.telegram.ui.fg0, android.content.Context):void");
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
        this.f39463y.k1(true, true);
        this.f39457f = null;
        this.f39458n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39458n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i9;
        if (this.f39458n) {
            return;
        }
        ld0 ld0Var = this.f39453a;
        ld0Var.f42754e = true;
        for (vr vrVar : ld0Var.f42755f) {
            vrVar.j(0.0f);
        }
        String code = ld0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f39458n = true;
        fg0 fg0Var = this.f39463y;
        fg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_checkRecoveryPassword, new v40(9, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new he0(this, 0), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f39457f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f39453a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39453a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f39457f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ld0 ld0Var = this.f39453a;
        ld0Var.setText("");
        this.f39457f = bundle;
        this.h = bundle.getString("password");
        this.f39459r = this.f39457f.getString("requestPhone");
        this.f39460s = this.f39457f.getString("phoneHash");
        this.v = this.f39457f.getString("phoneCode");
        String string = this.f39457f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f34062a |= 256;
            obj.f34063b = indexOf;
            int i9 = lastIndexOf + 1;
            obj.f34064c = i9;
            valueOf.setSpan(new org.telegram.ui.Components.wz0(obj, 0), indexOf, i9, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        fg0.T0(this.f39463y, ld0Var);
        ld0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f39454b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.f39455c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        this.f39453a.invalidate();
    }

    public final void o(boolean z10) {
        ld0 ld0Var = this.f39453a;
        if (this.f39463y.getParentActivity() == null) {
            return;
        }
        try {
            ld0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (vr vrVar : ld0Var.f42755f) {
                vrVar.setText("");
            }
        }
        for (vr vrVar2 : ld0Var.f42755f) {
            vrVar2.i(1.0f);
        }
        ld0Var.f42755f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ld0Var, new he0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39462x);
    }
}
