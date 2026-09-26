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
public final class je0 extends org.telegram.ui.Components.gw0 {
    public final EditTextBoldCursor f34777a;
    public final TextView f34778b;
    public final TextView f34779c;
    public final TextView d;
    public final org.telegram.ui.Components.mj0 e;
    public Bundle f34780f;
    public boolean h;
    public TL_account.Password f34781n;
    public String f34782r;
    public String f34783s;
    public String v;
    public String f34784w;
    public final org.telegram.ui.Components.kd0 f34785x;
    public final qg0 f34786y;

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
        this.f34786y.k1(true, true);
        this.f34780f = null;
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
        if (!this.h && this.f34781n != null) {
            String obj = this.f34777a.getText().toString();
            if (obj.length() == 0) {
                qg0 qg0Var = this.f34786y;
                if (qg0Var.getParentActivity() == null) {
                    return;
                }
                qg0.U0(qg0Var, this.f34785x, true);
                return;
            }
            this.h = true;
            this.f34786y.n1(0, true);
            Utilities.globalQueue.postRunnable(new n80(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 19), qg0.f36883t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f34780f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f34777a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34777a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f34780f;
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
        EditTextBoldCursor editTextBoldCursor = this.f34777a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f34780f = bundle;
        String string = bundle.getString("password");
        this.f34782r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f34781n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f34783s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f34784w = bundle.getString("code");
        TL_account.Password password = this.f34781n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f34781n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f34778b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f34777a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f34779c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f34785x.f();
    }
}
