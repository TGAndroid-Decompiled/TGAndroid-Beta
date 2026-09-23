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
public final class ke0 extends org.telegram.ui.Components.uv0 {
    public final EditTextBoldCursor f34688a;
    public final TextView f34689b;
    public final TextView f34690c;
    public final TextView d;
    public final org.telegram.ui.Components.bj0 e;
    public Bundle f34691f;
    public boolean h;
    public TL_account.Password f34692n;
    public String f34693r;
    public String f34694s;
    public String v;
    public String f34695w;
    public final org.telegram.ui.Components.yc0 f34696x;
    public final rg0 f34697y;

    public ke0(org.telegram.ui.rg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ke0.<init>(org.telegram.ui.rg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f34697y.k1(true, true);
        this.f34691f = null;
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
        if (!this.h && this.f34692n != null) {
            String obj = this.f34688a.getText().toString();
            if (obj.length() == 0) {
                rg0 rg0Var = this.f34697y;
                if (rg0Var.getParentActivity() == null) {
                    return;
                }
                rg0.U0(rg0Var, this.f34696x, true);
                return;
            }
            this.h = true;
            this.f34697y.n1(0, true);
            Utilities.globalQueue.postRunnable(new ia0(13, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new d10(this, 19), rg0.f36817t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f34691f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f34688a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34688a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f34691f;
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
        EditTextBoldCursor editTextBoldCursor = this.f34688a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f34691f = bundle;
        String string = bundle.getString("password");
        this.f34693r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f34692n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f34694s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f34695w = bundle.getString("code");
        TL_account.Password password = this.f34692n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f34692n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f34689b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f34688a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f34690c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f34696x.f();
    }
}
