package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class le0 extends org.telegram.ui.Components.bx0 {
    public final nd0 f41092a;
    public final TextView f41093b;
    public final TextView f41094c;
    public final xh.n d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f41095f;
    public String h;
    public boolean f41096n;
    public String f41097r;
    public String f41098s;
    public String v;
    public boolean f41099w;
    public final je0 f41100x;
    public final ig0 f41101y;

    public le0(org.telegram.ui.ig0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.<init>(org.telegram.ui.ig0, android.content.Context):void");
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
        this.f41101y.p1(true, true);
        this.f41095f = null;
        this.f41096n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f41096n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f41096n) {
            return;
        }
        nd0 nd0Var = this.f41092a;
        nd0Var.e = true;
        for (zr zrVar : nd0Var.f45772f) {
            zrVar.j(0.0f);
        }
        String code = nd0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.f41096n = true;
        ig0 ig0Var = this.f41101y;
        ig0Var.s1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new l10(10, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new je0(this, 0), ig0.f40139y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f41095f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f41092a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41092a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f41095f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        nd0 nd0Var = this.f41092a;
        nd0Var.setText("");
        this.f41095f = bundle;
        this.h = bundle.getString("password");
        this.f41097r = this.f41095f.getString("requestPhone");
        this.f41098s = this.f41095f.getString("phoneHash");
        this.v = this.f41095f.getString("phoneCode");
        String string = this.f41095f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f35208a |= 256;
            obj.f35209b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f35210c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.a21(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        ig0.W0(this.f41101y, nd0Var);
        nd0Var.requestFocus();
    }

    public final void n(boolean z10) {
        nd0 nd0Var = this.f41092a;
        if (this.f41101y.getParentActivity() == null) {
            return;
        }
        try {
            nd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (zr zrVar : nd0Var.f45772f) {
                zrVar.setText("");
            }
        }
        for (zr zrVar2 : nd0Var.f45772f) {
            zrVar2.i(1.0f);
        }
        nd0Var.f45772f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(nd0Var, new je0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f41100x);
    }

    @Override
    public final void updateColors() {
        this.f41093b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        this.f41094c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false));
        this.f41092a.invalidate();
    }
}
