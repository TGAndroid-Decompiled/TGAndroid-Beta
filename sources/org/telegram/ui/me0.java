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
public final class me0 extends org.telegram.ui.Components.hw0 {
    public final EditTextBoldCursor f35667a;
    public final TextView f35668b;
    public final TextView f35669c;
    public final TextView d;
    public final org.telegram.ui.Components.nj0 e;
    public Bundle f35670f;
    public boolean h;
    public TL_account.Password f35671n;
    public String f35672r;
    public String f35673s;
    public String v;
    public String f35674w;
    public final org.telegram.ui.Components.jd0 f35675x;
    public final tg0 f35676y;

    public me0(org.telegram.ui.tg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me0.<init>(org.telegram.ui.tg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f35676y.k1(true, true);
        this.f35670f = null;
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
        if (!this.h && this.f35671n != null) {
            String obj = this.f35667a.getText().toString();
            if (obj.length() == 0) {
                tg0 tg0Var = this.f35676y;
                if (tg0Var.getParentActivity() == null) {
                    return;
                }
                tg0.U0(tg0Var, this.f35675x, true);
                return;
            }
            this.h = true;
            this.f35676y.n1(0, true);
            Utilities.globalQueue.postRunnable(new ea0(14, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new f10(this, 19), tg0.f37783t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f35670f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f35667a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35667a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f35670f;
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
        EditTextBoldCursor editTextBoldCursor = this.f35667a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f35670f = bundle;
        String string = bundle.getString("password");
        this.f35672r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f35671n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f35673s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f35674w = bundle.getString("code");
        TL_account.Password password = this.f35671n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f35671n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f35668b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f35667a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
        this.f35669c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f35675x.f();
    }
}
