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
public final class je0 extends org.telegram.ui.Components.iw0 {
    public final EditTextBoldCursor f34871a;
    public final TextView f34872b;
    public final TextView f34873c;
    public final TextView d;
    public final org.telegram.ui.Components.oj0 e;
    public Bundle f34874f;
    public boolean h;
    public TL_account.Password f34875n;
    public String f34876r;
    public String f34877s;
    public String v;
    public String f34878w;
    public final org.telegram.ui.Components.md0 f34879x;
    public final qg0 f34880y;

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
        this.f34880y.k1(true, true);
        this.f34874f = null;
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
        if (!this.h && this.f34875n != null) {
            String obj = this.f34871a.getText().toString();
            if (obj.length() == 0) {
                qg0 qg0Var = this.f34880y;
                if (qg0Var.getParentActivity() == null) {
                    return;
                }
                qg0.U0(qg0Var, this.f34879x, true);
                return;
            }
            this.h = true;
            this.f34880y.n1(0, true);
            Utilities.globalQueue.postRunnable(new n80(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 19), qg0.f36984t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f34874f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f34871a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34871a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f34874f;
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
        EditTextBoldCursor editTextBoldCursor = this.f34871a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f34874f = bundle;
        String string = bundle.getString("password");
        this.f34876r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f34875n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f34877s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f34878w = bundle.getString("code");
        TL_account.Password password = this.f34875n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f34875n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f34872b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f34871a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f34873c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f34879x.f();
    }
}
