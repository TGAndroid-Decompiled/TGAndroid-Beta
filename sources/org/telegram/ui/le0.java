package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class le0 extends org.telegram.ui.Components.sw0 {
    public final nd0 f39215a;
    public final TextView f39216b;
    public final TextView f39217c;
    public final wh.n d;
    public final org.telegram.ui.Components.ak0 e;
    public Bundle f39218f;
    public String h;
    public boolean f39219n;
    public String f39220r;
    public String f39221s;
    public String v;
    public boolean f39222w;
    public final je0 f39223x;
    public final hg0 f39224y;

    public le0(org.telegram.ui.hg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.<init>(org.telegram.ui.hg0, android.content.Context):void");
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
        this.f39224y.o1(true, true);
        this.f39218f = null;
        this.f39219n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39219n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f39219n) {
            return;
        }
        nd0 nd0Var = this.f39215a;
        nd0Var.e = true;
        for (vr vrVar : nd0Var.f41792f) {
            vrVar.j(0.0f);
        }
        String code = nd0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f39219n = true;
        hg0 hg0Var = this.f39224y;
        hg0Var.r1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new a50(9, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new je0(this, 0), hg0.f37832x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f39218f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f39215a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39215a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f39218f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        nd0 nd0Var = this.f39215a;
        nd0Var.setText("");
        this.f39218f = bundle;
        this.h = bundle.getString("password");
        this.f39220r = this.f39218f.getString("requestPhone");
        this.f39221s = this.f39218f.getString("phoneHash");
        this.v = this.f39218f.getString("phoneCode");
        String string = this.f39218f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f29448a |= 256;
            obj.f29449b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f29450c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        hg0.V0(this.f39224y, nd0Var);
        nd0Var.requestFocus();
    }

    public final void n(boolean z10) {
        nd0 nd0Var = this.f39215a;
        if (this.f39224y.getParentActivity() == null) {
            return;
        }
        try {
            nd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (vr vrVar : nd0Var.f41792f) {
                vrVar.setText("");
            }
        }
        for (vr vrVar2 : nd0Var.f41792f) {
            vrVar2.i(1.0f);
        }
        nd0Var.f41792f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(nd0Var, new je0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39223x);
    }

    @Override
    public final void updateColors() {
        this.f39216b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f39217c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f39215a.invalidate();
    }
}
