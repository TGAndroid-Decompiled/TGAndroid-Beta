package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class me0 extends org.telegram.ui.Components.tw0 {
    public final od0 f39523a;
    public final TextView f39524b;
    public final TextView f39525c;
    public final wh.n d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f39526f;
    public String h;
    public boolean f39527n;
    public String f39528r;
    public String f39529s;
    public String v;
    public boolean f39530w;
    public final ke0 f39531x;
    public final ig0 f39532y;

    public me0(org.telegram.ui.ig0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me0.<init>(org.telegram.ui.ig0, android.content.Context):void");
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
        this.f39532y.o1(true, true);
        this.f39526f = null;
        this.f39527n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39527n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f39527n) {
            return;
        }
        od0 od0Var = this.f39523a;
        od0Var.e = true;
        for (vr vrVar : od0Var.f41793f) {
            vrVar.j(0.0f);
        }
        String code = od0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f39527n = true;
        ig0 ig0Var = this.f39532y;
        ig0Var.r1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new a50(9, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ke0(this, 0), ig0.f38191x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f39526f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f39523a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39523a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f39526f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        od0 od0Var = this.f39523a;
        od0Var.setText("");
        this.f39526f = bundle;
        this.h = bundle.getString("password");
        this.f39528r = this.f39526f.getString("requestPhone");
        this.f39529s = this.f39526f.getString("phoneHash");
        this.v = this.f39526f.getString("phoneCode");
        String string = this.f39526f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f29754a |= 256;
            obj.f29755b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f29756c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        ig0.V0(this.f39532y, od0Var);
        od0Var.requestFocus();
    }

    public final void n(boolean z10) {
        od0 od0Var = this.f39523a;
        if (this.f39532y.getParentActivity() == null) {
            return;
        }
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (vr vrVar : od0Var.f41793f) {
                vrVar.setText("");
            }
        }
        for (vr vrVar2 : od0Var.f41793f) {
            vrVar2.i(1.0f);
        }
        od0Var.f41793f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(od0Var, new ke0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39531x);
    }

    @Override
    public final void updateColors() {
        this.f39524b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f39525c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f39523a.invalidate();
    }
}
