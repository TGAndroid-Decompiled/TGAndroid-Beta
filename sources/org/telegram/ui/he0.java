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
    public final EditTextBoldCursor f37343a;
    public final TextView f37344b;
    public final TextView f37345c;
    public final TextView d;
    public final org.telegram.ui.Components.kj0 f37346e;
    public Bundle f37347f;
    public boolean h;
    public TL_account.Password f37348n;
    public String f37349r;
    public String f37350s;
    public String v;
    public String f37351w;
    public final org.telegram.ui.Components.cd0 f37352x;
    public final og0 f37353y;

    public he0(org.telegram.ui.og0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.he0.<init>(org.telegram.ui.og0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        this.h = false;
        this.f37353y.k1(true, true);
        this.f37347f = null;
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
        if (!this.h && this.f37348n != null) {
            String obj = this.f37343a.getText().toString();
            if (obj.length() == 0) {
                og0 og0Var = this.f37353y;
                if (og0Var.getParentActivity() == null) {
                    return;
                }
                og0.U0(og0Var, this.f37352x, true);
                return;
            }
            this.h = true;
            this.f37353y.n1(0, true);
            Utilities.globalQueue.postRunnable(new z10(29, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 19), og0.f39709q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f37347f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f37343a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37343a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f37347f;
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
        EditTextBoldCursor editTextBoldCursor = this.f37343a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f37347f = bundle;
        String string = bundle.getString("password");
        this.f37349r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f37348n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f37350s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f37351w = bundle.getString("code");
        TL_account.Password password = this.f37348n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f37348n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f37344b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f37343a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.f37345c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21896q6, false));
        this.f37352x.f();
    }
}
