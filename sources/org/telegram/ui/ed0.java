package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ed0 extends org.telegram.ui.Components.zu0 {
    public final hf0 D;
    public final EditTextBoldCursor f37023a;
    public final TextView f37024b;
    public final TextView f37025c;
    public final TextView d;
    public final org.telegram.ui.Components.ei0 e;
    public Bundle f37026f;
    public boolean h;
    public TL_account.Password f37027n;
    public String f37028r;
    public String f37029s;
    public String f37030w;
    public String f37031x;
    public final org.telegram.ui.Components.ec0 f37032y;

    public ed0(org.telegram.ui.hf0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed0.<init>(org.telegram.ui.hf0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.D.s1(true, true);
        this.f37026f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748737, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f37027n != null) {
            String obj = this.f37023a.getText().toString();
            if (obj.length() == 0) {
                hf0 hf0Var = this.D;
                if (hf0Var.getParentActivity() == null) {
                    return;
                }
                hf0.a1(hf0Var, this.f37032y, true);
                return;
            }
            this.h = true;
            this.D.v1(0, true);
            Utilities.e.c(new f70(19, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new zy(this, 22), hf0.f37917y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f37026f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f37023a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37023a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f37026f;
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
        EditTextBoldCursor editTextBoldCursor = this.f37023a;
        if (isEmpty) {
            org.telegram.messenger.i0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f37026f = bundle;
        String string = bundle.getString("password");
        this.f37028r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f37027n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f37029s = bundle.getString("phoneFormated");
        this.f37030w = bundle.getString("phoneHash");
        this.f37031x = bundle.getString("code");
        TL_account.Password password = this.f37027n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f37027n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f37024b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f37023a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.H6, false));
        this.f37025c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f37032y.f();
    }
}
