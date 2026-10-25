package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class je0 extends org.telegram.ui.Components.ax0 {
    public final ld0 f40572a;
    public final TextView f40573b;
    public final TextView f40574c;
    public final xh.n d;
    public final org.telegram.ui.Components.ak0 e;
    public Bundle f40575f;
    public String h;
    public boolean f40576n;
    public String f40577r;
    public String f40578s;
    public String v;
    public boolean f40579w;
    public final he0 f40580x;
    public final gg0 f40581y;

    public je0(org.telegram.ui.gg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je0.<init>(org.telegram.ui.gg0, android.content.Context):void");
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
        this.f40581y.p1(true, true);
        this.f40575f = null;
        this.f40576n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f40576n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f40576n) {
            return;
        }
        ld0 ld0Var = this.f40572a;
        ld0Var.e = true;
        for (xr xrVar : ld0Var.f44894f) {
            xrVar.j(0.0f);
        }
        String code = ld0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f40576n = true;
        gg0 gg0Var = this.f40581y;
        gg0Var.s1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new j10(10, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new he0(this, 0), gg0.f39647x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f40575f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f40572a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40572a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f40575f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ld0 ld0Var = this.f40572a;
        ld0Var.setText("");
        this.f40575f = bundle;
        this.h = bundle.getString("password");
        this.f40577r = this.f40575f.getString("requestPhone");
        this.f40578s = this.f40575f.getString("phoneHash");
        this.v = this.f40575f.getString("phoneCode");
        String string = this.f40575f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f34904a |= 256;
            obj.f34905b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f34906c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.z11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        gg0.W0(this.f40581y, ld0Var);
        ld0Var.requestFocus();
    }

    public final void n(boolean z10) {
        ld0 ld0Var = this.f40572a;
        if (this.f40581y.getParentActivity() == null) {
            return;
        }
        try {
            ld0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (xr xrVar : ld0Var.f44894f) {
                xrVar.setText("");
            }
        }
        for (xr xrVar2 : ld0Var.f44894f) {
            xrVar2.i(1.0f);
        }
        ld0Var.f44894f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ld0Var, new he0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f40580x);
    }

    @Override
    public final void updateColors() {
        this.f40573b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        this.f40574c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23595q6, false));
        this.f40572a.invalidate();
    }
}
