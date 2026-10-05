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
public final class ne0 extends org.telegram.ui.Components.rw0 {
    public final EditTextBoldCursor f38938a;
    public final TextView f38939b;
    public final TextView f38940c;
    public final TextView d;
    public final org.telegram.ui.Components.nj0 f38941e;
    public Bundle f38942f;
    public boolean h;
    public TL_account.Password f38943n;
    public String f38944r;
    public String f38945s;
    public String v;
    public String f38946w;
    public final org.telegram.ui.Components.ld0 f38947x;
    public final ug0 f38948y;

    public ne0(org.telegram.ui.ug0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ne0.<init>(org.telegram.ui.ug0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f38948y.k1(true, true);
        this.f38942f = null;
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
        if (!this.h && this.f38943n != null) {
            String obj = this.f38938a.getText().toString();
            if (obj.length() == 0) {
                ug0 ug0Var = this.f38948y;
                if (ug0Var.getParentActivity() == null) {
                    return;
                }
                ug0.U0(ug0Var, this.f38947x, true);
                return;
            }
            this.h = true;
            this.f38948y.n1(0, true);
            Utilities.globalQueue.postRunnable(new h90(16, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new g10(this, 19), ug0.f41235t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f38942f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f38938a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f38938a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f38942f;
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
        EditTextBoldCursor editTextBoldCursor = this.f38938a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f38942f = bundle;
        String string = bundle.getString("password");
        this.f38944r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f38943n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f38945s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f38946w = bundle.getString("code");
        TL_account.Password password = this.f38943n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f38943n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f38939b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f38938a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
        this.f38940c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f38947x.f();
    }
}
