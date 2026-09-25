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
public final class je0 extends org.telegram.ui.Components.fw0 {
    public final EditTextBoldCursor f34779a;
    public final TextView f34780b;
    public final TextView f34781c;
    public final TextView d;
    public final org.telegram.ui.Components.lj0 e;
    public Bundle f34782f;
    public boolean h;
    public TL_account.Password f34783n;
    public String f34784r;
    public String f34785s;
    public String v;
    public String f34786w;
    public final org.telegram.ui.Components.jd0 f34787x;
    public final qg0 f34788y;

    public je0(org.telegram.ui.qg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je0.<init>(org.telegram.ui.qg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f34788y.k1(true, true);
        this.f34782f = null;
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
        if (!this.h && this.f34783n != null) {
            String obj = this.f34779a.getText().toString();
            if (obj.length() == 0) {
                qg0 qg0Var = this.f34788y;
                if (qg0Var.getParentActivity() == null) {
                    return;
                }
                qg0.U0(qg0Var, this.f34787x, true);
                return;
            }
            this.h = true;
            this.f34788y.n1(0, true);
            Utilities.globalQueue.postRunnable(new n80(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 19), qg0.f36885t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f34782f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f34779a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34779a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f34782f;
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
        EditTextBoldCursor editTextBoldCursor = this.f34779a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f34782f = bundle;
        String string = bundle.getString("password");
        this.f34784r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f34783n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f34785s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f34786w = bundle.getString("code");
        TL_account.Password password = this.f34783n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f34783n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f34780b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f34779a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f34781c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f34787x.f();
    }
}
