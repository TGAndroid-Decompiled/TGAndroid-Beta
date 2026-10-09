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
public final class oe0 extends org.telegram.ui.Components.xw0 {
    public final EditTextBoldCursor f40504a;
    public final TextView f40505b;
    public final TextView f40506c;
    public final TextView d;
    public final org.telegram.ui.Components.fk0 f40507e;
    public Bundle f40508f;
    public boolean h;
    public TL_account.Password f40509n;
    public String f40510r;
    public String f40511s;
    public String v;
    public String f40512w;
    public final org.telegram.ui.Components.zd0 f40513x;
    public final wg0 f40514y;

    public oe0(org.telegram.ui.wg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oe0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f40514y.k1(true, true);
        this.f40508f = null;
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
        if (!this.h && this.f40509n != null) {
            String obj = this.f40504a.getText().toString();
            if (obj.length() == 0) {
                wg0 wg0Var = this.f40514y;
                if (wg0Var.getParentActivity() == null) {
                    return;
                }
                wg0.U0(wg0Var, this.f40513x, true);
                return;
            }
            this.h = true;
            this.f40514y.n1(0, true);
            Utilities.globalQueue.postRunnable(new m70(24, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new uz(this, 20), wg0.f43571t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f40508f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f40504a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f40504a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f40508f;
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
        EditTextBoldCursor editTextBoldCursor = this.f40504a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f40508f = bundle;
        String string = bundle.getString("password");
        this.f40510r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f40509n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f40511s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f40512w = bundle.getString("code");
        TL_account.Password password = this.f40509n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f40509n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.f40505b.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f40504a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
        this.f40506c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f40513x.f();
    }
}
