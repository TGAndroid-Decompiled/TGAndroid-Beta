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
public final class ae0 extends org.telegram.ui.Components.bx0 {
    public final EditTextBoldCursor f37748a;
    public final TextView f37749b;
    public final TextView f37750c;
    public final TextView d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f37751f;
    public boolean h;
    public TL_account.Password f37752n;
    public String f37753r;
    public String f37754s;
    public String v;
    public String f37755w;
    public final org.telegram.ui.Components.sd0 f37756x;
    public final ig0 f37757y;

    public ae0(org.telegram.ui.ig0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ae0.<init>(org.telegram.ui.ig0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f37757y.p1(true, true);
        this.f37751f = null;
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
        if (!this.h && this.f37752n != null) {
            String obj = this.f37748a.getText().toString();
            if (obj.length() == 0) {
                ig0 ig0Var = this.f37757y;
                if (ig0Var.getParentActivity() == null) {
                    return;
                }
                ig0.X0(ig0Var, this.f37756x, true);
                return;
            }
            this.h = true;
            this.f37757y.s1(0, true);
            Utilities.globalQueue.postRunnable(new kb0(6, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new r00(this, 21), ig0.f40139y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f37751f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f37748a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37748a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f37751f;
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
        EditTextBoldCursor editTextBoldCursor = this.f37748a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f37751f = bundle;
        String string = bundle.getString("password");
        this.f37753r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f37752n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f37754s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f37755w = bundle.getString("code");
        TL_account.Password password = this.f37752n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f37752n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f37749b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f37748a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
        this.f37750c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false));
        this.f37756x.f();
    }
}
