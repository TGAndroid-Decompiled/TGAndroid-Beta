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
public final class ie0 extends org.telegram.ui.Components.wv0 {
    public final EditTextBoldCursor f37809a;
    public final TextView f37810b;
    public final TextView f37811c;
    public final TextView d;
    public final org.telegram.ui.Components.lj0 f37812e;
    public Bundle f37813f;
    public boolean h;
    public TL_account.Password f37814n;
    public String f37815r;
    public String f37816s;
    public String v;
    public String f37817w;
    public final org.telegram.ui.Components.cd0 f37818x;
    public final og0 f37819y;

    public ie0(org.telegram.ui.og0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ie0.<init>(org.telegram.ui.og0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        this.h = false;
        this.f37819y.k1(true, true);
        this.f37813f = null;
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
        if (!this.h && this.f37814n != null) {
            String obj = this.f37809a.getText().toString();
            if (obj.length() == 0) {
                og0 og0Var = this.f37819y;
                if (og0Var.getParentActivity() == null) {
                    return;
                }
                og0.U0(og0Var, this.f37818x, true);
                return;
            }
            this.h = true;
            this.f37819y.n1(0, true);
            Utilities.globalQueue.postRunnable(new he0(0, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 19), og0.f39749q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f37813f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f37809a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37809a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f37813f;
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
        EditTextBoldCursor editTextBoldCursor = this.f37809a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f37813f = bundle;
        String string = bundle.getString("password");
        this.f37815r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f37814n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f37816s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f37817w = bundle.getString("code");
        TL_account.Password password = this.f37814n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f37814n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f37810b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f37809a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.f37811c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false));
        this.f37818x.f();
    }
}
