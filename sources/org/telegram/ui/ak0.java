package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ak0 implements org.telegram.ui.ActionBar.u1, qt, zk0 {
    public final int f35667a;
    public final ll0 f35668b;

    public ak0(ll0 ll0Var, int i10) {
        this.f35667a = i10;
        this.f35668b = ll0Var;
    }

    @Override
    public void c(nt ntVar) {
        String str;
        switch (this.f35667a) {
            case 2:
                ll0 ll0Var = this.f35668b;
                ll0Var.Y[5].setText(ntVar.f40047a);
                ll0Var.f39297s = ntVar.d;
                return;
            default:
                ll0 ll0Var2 = this.f35668b;
                ll0Var2.Y[0].setText(ntVar.f40047a);
                if (ll0Var2.U0.indexOf(ntVar.f40047a) != -1) {
                    ll0Var2.Z0 = true;
                    String str2 = (String) ll0Var2.V0.get(ntVar.f40047a);
                    ll0Var2.Y[1].setText(str2);
                    String str3 = (String) ll0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = ll0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    ll0Var2.Z0 = false;
                }
                org.telegram.messenger.i0.h3(new xj0(ll0Var2, 3), 300L);
                ll0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = ll0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void d(String str, String str2) {
        this.f35668b.A1();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f35667a) {
            case 0:
                ll0 ll0Var = this.f35668b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    ll0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                this.f35668b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                ll0.e0(this.f35668b);
                return;
            case 4:
                ll0.h0(this.f35668b);
                return;
        }
    }
}
