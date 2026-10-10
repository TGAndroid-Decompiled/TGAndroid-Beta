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
public final class oe0 extends org.telegram.ui.Components.yw0 {
    public final EditTextBoldCursor f40550a;
    public final TextView f40551b;
    public final TextView f40552c;
    public final TextView d;
    public final org.telegram.ui.Components.gk0 f40553e;
    public Bundle f40554f;
    public boolean h;
    public TL_account.Password f40555n;
    public String f40556r;
    public String f40557s;
    public String v;
    public String f40558w;
    public final org.telegram.ui.Components.ae0 f40559x;
    public final wg0 f40560y;

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
        this.f40560y.k1(true, true);
        this.f40554f = null;
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
        if (!this.h && this.f40555n != null) {
            String obj = this.f40550a.getText().toString();
            if (obj.length() == 0) {
                wg0 wg0Var = this.f40560y;
                if (wg0Var.getParentActivity() == null) {
                    return;
                }
                wg0.U0(wg0Var, this.f40559x, true);
                return;
            }
            this.h = true;
            this.f40560y.n1(0, true);
            Utilities.globalQueue.postRunnable(new m70(24, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new uz(this, 20), wg0.f43617t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f40554f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f40550a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f40550a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f40554f;
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
        EditTextBoldCursor editTextBoldCursor = this.f40550a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f40554f = bundle;
        String string = bundle.getString("password");
        this.f40556r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f40555n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f40557s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f40558w = bundle.getString("code");
        TL_account.Password password = this.f40555n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f40555n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.f40551b.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f40550a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
        this.f40552c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f40559x.f();
    }
}
