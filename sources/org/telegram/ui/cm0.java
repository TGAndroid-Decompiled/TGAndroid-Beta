package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 implements org.telegram.ui.ActionBar.a2, au, dn0 {
    public final int f35205a;
    public final pn0 f35206b;

    public cm0(pn0 pn0Var, int i10) {
        this.f35205a = i10;
        this.f35206b = pn0Var;
    }

    @Override
    public void a1(vt vtVar) {
        String str;
        switch (this.f35205a) {
            case 2:
                pn0 pn0Var = this.f35206b;
                pn0Var.Y[5].setText(vtVar.f41720a);
                pn0Var.f39616s = vtVar.d;
                return;
            default:
                pn0 pn0Var2 = this.f35206b;
                pn0Var2.Y[0].setText(vtVar.f41720a);
                if (pn0Var2.U0.indexOf(vtVar.f41720a) != -1) {
                    pn0Var2.Z0 = true;
                    String str2 = (String) pn0Var2.V0.get(vtVar.f41720a);
                    pn0Var2.Y[1].setText(str2);
                    String str3 = (String) pn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = pn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    pn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new zl0(pn0Var2, 3), 300L);
                pn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = pn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void b(String str, String str2) {
        this.f35206b.x1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35205a) {
            case 0:
                pn0 pn0Var = this.f35206b;
                pn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.f35206b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                pn0.a0(this.f35206b);
                return;
            case 4:
                pn0.d0(this.f35206b);
                return;
        }
    }
}
