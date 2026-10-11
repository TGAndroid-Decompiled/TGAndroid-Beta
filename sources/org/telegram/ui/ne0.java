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
public final class ne0 extends org.telegram.ui.Components.zw0 {
    public final EditTextBoldCursor f40225a;
    public final TextView f40226b;
    public final TextView f40227c;
    public final TextView d;
    public final org.telegram.ui.Components.hk0 f40228e;
    public Bundle f40229f;
    public boolean h;
    public TL_account.Password f40230n;
    public String f40231r;
    public String f40232s;
    public String v;
    public String f40233w;
    public final org.telegram.ui.Components.be0 f40234x;
    public final vg0 f40235y;

    public ne0(org.telegram.ui.vg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ne0.<init>(org.telegram.ui.vg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f40235y.k1(true, true);
        this.f40229f = null;
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
        if (!this.h && this.f40230n != null) {
            String obj = this.f40225a.getText().toString();
            if (obj.length() == 0) {
                vg0 vg0Var = this.f40235y;
                if (vg0Var.getParentActivity() == null) {
                    return;
                }
                vg0.U0(vg0Var, this.f40234x, true);
                return;
            }
            this.h = true;
            this.f40235y.n1(0, true);
            Utilities.globalQueue.postRunnable(new n70(23, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new tz(this, 20), vg0.f43010t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f40229f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f40225a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f40225a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f40229f;
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
        EditTextBoldCursor editTextBoldCursor = this.f40225a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f40229f = bundle;
        String string = bundle.getString("password");
        this.f40231r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f40230n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f40232s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f40233w = bundle.getString("code");
        TL_account.Password password = this.f40230n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f40230n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f40226b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f40225a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f40227c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f40234x.f();
    }
}
