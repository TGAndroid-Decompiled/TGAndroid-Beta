package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ac0 extends org.telegram.ui.Components.xt0 {
    public final fe0 D;
    public final EditTextBoldCursor f43634a;
    public final TextView f43635b;
    public final TextView f43636c;
    public final TextView d;
    public final org.telegram.ui.Components.ch0 f43637e;
    public Bundle f43638f;
    public boolean h;
    public TL_account.Password f43639n;
    public String f43640r;
    public String f43641s;
    public String f43642w;
    public String f43643x;
    public final org.telegram.ui.Components.lb0 f43644y;

    public ac0(org.telegram.ui.fe0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ac0.<init>(org.telegram.ui.fe0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z9) {
        this.h = false;
        this.D.C1(true, true);
        this.f43638f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748726, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f43639n != null) {
            String obj = this.f43634a.getText().toString();
            if (obj.length() == 0) {
                fe0 fe0Var = this.D;
                if (fe0Var.getParentActivity() == null) {
                    return;
                }
                fe0.c1(fe0Var, this.f43644y, true);
                return;
            }
            this.h = true;
            this.D.F1(0, true);
            Utilities.f21341e.c(new f10(27, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new kz(this, 22), fe0.f45691y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f43638f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f43634a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43634a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f43638f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.f43634a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f43638f = bundle;
        String string = bundle.getString("password");
        this.f43640r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f43639n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f43641s = bundle.getString("phoneFormated");
        this.f43642w = bundle.getString("phoneHash");
        this.f43643x = bundle.getString("code");
        TL_account.Password password = this.f43639n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f43639n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f43635b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f43634a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
        this.f43636c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
        this.f43644y.f();
    }
}
