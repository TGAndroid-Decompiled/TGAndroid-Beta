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
public final class he0 extends org.telegram.ui.Components.vv0 {
    public final EditTextBoldCursor f34835a;
    public final TextView f34836b;
    public final TextView f34837c;
    public final TextView d;
    public final org.telegram.ui.Components.jj0 e;
    public Bundle f34838f;
    public boolean h;
    public TL_account.Password f34839n;
    public String f34840r;
    public String f34841s;
    public String v;
    public String f34842w;
    public final org.telegram.ui.Components.ad0 f34843x;
    public final ng0 f34844y;

    public he0(org.telegram.ui.ng0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.he0.<init>(org.telegram.ui.ng0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        this.h = false;
        this.f34844y.k1(true, true);
        this.f34838f = null;
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
        if (!this.h && this.f34839n != null) {
            String obj = this.f34835a.getText().toString();
            if (obj.length() == 0) {
                ng0 ng0Var = this.f34844y;
                if (ng0Var.getParentActivity() == null) {
                    return;
                }
                ng0.U0(ng0Var, this.f34843x, true);
                return;
            }
            this.h = true;
            this.f34844y.n1(0, true);
            Utilities.globalQueue.postRunnable(new fe0(1, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 19), ng0.f36621q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f34838f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f34835a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34835a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f34838f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.f34835a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f34838f = bundle;
        String string = bundle.getString("password");
        this.f34840r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f34839n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f34841s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f34842w = bundle.getString("code");
        TL_account.Password password = this.f34839n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f34839n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f34836b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f34835a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.f34837c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false));
        this.f34843x.f();
    }
}
