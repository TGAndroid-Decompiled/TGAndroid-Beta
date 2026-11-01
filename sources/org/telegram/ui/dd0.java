package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dd0 extends org.telegram.ui.Components.av0 {
    public final gf0 D;
    public final EditTextBoldCursor f36561a;
    public final TextView f36562b;
    public final TextView f36563c;
    public final TextView d;
    public final org.telegram.ui.Components.fi0 e;
    public Bundle f36564f;
    public boolean h;
    public TL_account.Password f36565n;
    public String f36566r;
    public String f36567s;
    public String f36568w;
    public String f36569x;
    public final org.telegram.ui.Components.ec0 f36570y;

    public dd0(org.telegram.ui.gf0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd0.<init>(org.telegram.ui.gf0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.D.t1(true, true);
        this.f36564f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.dd.L0(2131748737, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f36565n != null) {
            String obj = this.f36561a.getText().toString();
            if (obj.length() == 0) {
                gf0 gf0Var = this.D;
                if (gf0Var.getParentActivity() == null) {
                    return;
                }
                gf0.b1(gf0Var, this.f36570y, true);
                return;
            }
            this.h = true;
            this.D.w1(0, true);
            Utilities.e.c(new y60(20, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new yy(this, 22), gf0.f37470y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f36564f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f36561a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36561a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f36564f;
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
        EditTextBoldCursor editTextBoldCursor = this.f36561a;
        if (isEmpty) {
            org.telegram.messenger.i0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f36564f = bundle;
        String string = bundle.getString("password");
        this.f36566r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f36565n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f36567s = bundle.getString("phoneFormated");
        this.f36568w = bundle.getString("phoneHash");
        this.f36569x = bundle.getString("code");
        TL_account.Password password = this.f36565n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f36565n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f36562b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f36561a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.H6, false));
        this.f36563c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f36570y.f();
    }
}
