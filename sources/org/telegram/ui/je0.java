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
public final class je0 extends org.telegram.ui.Components.vv0 {
    public final EditTextBoldCursor f35252a;
    public final TextView f35253b;
    public final TextView f35254c;
    public final TextView d;
    public final org.telegram.ui.Components.jj0 e;
    public Bundle f35255f;
    public boolean h;
    public TL_account.Password f35256n;
    public String f35257r;
    public String f35258s;
    public String v;
    public String f35259w;
    public final org.telegram.ui.Components.bd0 f35260x;
    public final pg0 f35261y;

    public je0(org.telegram.ui.pg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je0.<init>(org.telegram.ui.pg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        this.h = false;
        this.f35261y.k1(true, true);
        this.f35255f = null;
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
        if (!this.h && this.f35256n != null) {
            String obj = this.f35252a.getText().toString();
            if (obj.length() == 0) {
                pg0 pg0Var = this.f35261y;
                if (pg0Var.getParentActivity() == null) {
                    return;
                }
                pg0.U0(pg0Var, this.f35260x, true);
                return;
            }
            this.h = true;
            this.f35261y.n1(0, true);
            Utilities.globalQueue.postRunnable(new ie0(0, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new d10(this, 19), pg0.f37125q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f35255f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f35252a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35252a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f35255f;
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
        EditTextBoldCursor editTextBoldCursor = this.f35252a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f35255f = bundle;
        String string = bundle.getString("password");
        this.f35257r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f35256n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f35258s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f35259w = bundle.getString("code");
        TL_account.Password password = this.f35256n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f35256n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f35253b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f35252a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.f35254c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
        this.f35260x.f();
    }
}
