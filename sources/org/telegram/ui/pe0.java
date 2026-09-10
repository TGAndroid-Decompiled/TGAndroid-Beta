package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pe0 extends org.telegram.ui.Components.fw0 {
    public final EditTextBoldCursor f35798a;
    public final TextView f35799b;
    public final TextView f35800c;
    public final TextView d;
    public final org.telegram.ui.Components.kj0 e;
    public Bundle f35801f;
    public boolean h;
    public TL_account.Password f35802n;
    public String f35803r;
    public String f35804s;
    public String v;
    public String f35805w;
    public final org.telegram.ui.Components.hd0 f35806x;
    public final xg0 f35807y;

    public pe0(org.telegram.ui.xg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pe0.<init>(org.telegram.ui.xg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f35807y.k1(true, true);
        this.f35801f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f35802n != null) {
            String obj = this.f35798a.getText().toString();
            if (obj.length() == 0) {
                xg0 xg0Var = this.f35807y;
                if (xg0Var.getParentActivity() == null) {
                    return;
                }
                xg0.U0(xg0Var, this.f35806x, true);
                return;
            }
            this.h = true;
            this.f35807y.n1(0, true);
            Utilities.globalQueue.postRunnable(new h90(16, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new i10(this, 19), xg0.f38716t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f35801f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f35798a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35798a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f35801f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.f35798a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f35801f = bundle;
        String string = bundle.getString("password");
        this.f35803r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f35802n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f35804s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f35805w = bundle.getString("code");
        TL_account.Password password = this.f35802n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f35802n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f35799b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f35798a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.f35800c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f35806x.f();
    }
}
