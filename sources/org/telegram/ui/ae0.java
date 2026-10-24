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
public final class ae0 extends org.telegram.ui.Components.sw0 {
    public final EditTextBoldCursor f35737a;
    public final TextView f35738b;
    public final TextView f35739c;
    public final TextView d;
    public final org.telegram.ui.Components.ak0 e;
    public Bundle f35740f;
    public boolean h;
    public TL_account.Password f35741n;
    public String f35742r;
    public String f35743s;
    public String v;
    public String f35744w;
    public final org.telegram.ui.Components.td0 f35745x;
    public final hg0 f35746y;

    public ae0(org.telegram.ui.hg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ae0.<init>(org.telegram.ui.hg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f35746y.o1(true, true);
        this.f35740f = null;
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
        if (!this.h && this.f35741n != null) {
            String obj = this.f35737a.getText().toString();
            if (obj.length() == 0) {
                hg0 hg0Var = this.f35746y;
                if (hg0Var.getParentActivity() == null) {
                    return;
                }
                hg0.W0(hg0Var, this.f35745x, true);
                return;
            }
            this.h = true;
            this.f35746y.r1(0, true);
            Utilities.globalQueue.postRunnable(new f80(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new fz(this, 21), hg0.f37832x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f35740f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f35737a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35737a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f35740f;
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
        EditTextBoldCursor editTextBoldCursor = this.f35737a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f35740f = bundle;
        String string = bundle.getString("password");
        this.f35742r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f35741n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f35743s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f35744w = bundle.getString("code");
        TL_account.Password password = this.f35741n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f35741n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f35738b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f35737a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.f35739c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f35745x.f();
    }
}
