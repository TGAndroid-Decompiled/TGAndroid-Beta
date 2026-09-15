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
public final class pe0 extends org.telegram.ui.Components.uv0 {
    public final EditTextBoldCursor f36550a;
    public final TextView f36551b;
    public final TextView f36552c;
    public final TextView d;
    public final org.telegram.ui.Components.aj0 e;
    public Bundle f36553f;
    public boolean h;
    public TL_account.Password f36554n;
    public String f36555r;
    public String f36556s;
    public String v;
    public String f36557w;
    public final org.telegram.ui.Components.yc0 f36558x;
    public final wg0 f36559y;

    public pe0(org.telegram.ui.wg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pe0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f36559y.k1(true, true);
        this.f36553f = null;
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
        if (!this.h && this.f36554n != null) {
            String obj = this.f36550a.getText().toString();
            if (obj.length() == 0) {
                wg0 wg0Var = this.f36559y;
                if (wg0Var.getParentActivity() == null) {
                    return;
                }
                wg0.U0(wg0Var, this.f36558x, true);
                return;
            }
            this.h = true;
            this.f36559y.n1(0, true);
            Utilities.globalQueue.postRunnable(new ma0(13, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new g10(this, 19), wg0.f39192t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f36553f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f36550a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36550a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f36553f;
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
        EditTextBoldCursor editTextBoldCursor = this.f36550a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f36553f = bundle;
        String string = bundle.getString("password");
        this.f36555r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f36554n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f36556s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f36557w = bundle.getString("code");
        TL_account.Password password = this.f36554n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f36554n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f36551b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f36550a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
        this.f36552c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f36558x.f();
    }
}
