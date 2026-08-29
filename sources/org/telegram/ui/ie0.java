package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ie0 extends org.telegram.ui.Components.mv0 {
    public final md0 f39216a;
    public final TextView f39217b;
    public final TextView f39218c;
    public final gh.s d;
    public final org.telegram.ui.Components.aj0 f39219e;
    public Bundle f39220f;
    public String h;
    public boolean f39221n;
    public String f39222r;
    public String f39223s;
    public String v;
    public boolean f39224w;
    public final ge0 f39225x;
    public final fg0 f39226y;

    public ie0(org.telegram.ui.fg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ie0.<init>(org.telegram.ui.fg0, android.content.Context):void");
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
        this.f39226y.k1(true, true);
        this.f39220f = null;
        this.f39221n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39221n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f39221n) {
            return;
        }
        md0 md0Var = this.f39216a;
        md0Var.f42454e = true;
        for (ur urVar : md0Var.f42455f) {
            urVar.j(0.0f);
        }
        String code = md0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f39221n = true;
        fg0 fg0Var = this.f39226y;
        fg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new u80(5, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ge0(this, 0), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f39220f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f39216a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39216a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f39220f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        md0 md0Var = this.f39216a;
        md0Var.setText("");
        this.f39220f = bundle;
        this.h = bundle.getString("password");
        this.f39222r = this.f39220f.getString("requestPhone");
        this.f39223s = this.f39220f.getString("phoneHash");
        this.v = this.f39220f.getString("phoneCode");
        String string = this.f39220f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f29024a |= 256;
            obj.f29025b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f29026c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.i01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        fg0.T0(this.f39226y, md0Var);
        md0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f39217b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f39218c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f39216a.invalidate();
    }

    public final void o(boolean z10) {
        md0 md0Var = this.f39216a;
        if (this.f39226y.getParentActivity() == null) {
            return;
        }
        try {
            md0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (ur urVar : md0Var.f42455f) {
                urVar.setText("");
            }
        }
        for (ur urVar2 : md0Var.f42455f) {
            urVar2.i(1.0f);
        }
        md0Var.f42455f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(md0Var, new ge0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39225x);
    }
}
