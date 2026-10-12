package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 implements org.telegram.ui.ActionBar.z1, bu, dn0 {
    public final int f36458a;
    public final pn0 f36459b;

    public cm0(pn0 pn0Var, int i10) {
        this.f36458a = i10;
        this.f36459b = pn0Var;
    }

    @Override
    public void V0(xt xtVar) {
        String str;
        switch (this.f36458a) {
            case 2:
                pn0 pn0Var = this.f36459b;
                pn0Var.Y[5].setText(xtVar.f44156a);
                pn0Var.f41040s = xtVar.d;
                return;
            default:
                pn0 pn0Var2 = this.f36459b;
                pn0Var2.Y[0].setText(xtVar.f44156a);
                if (pn0Var2.U0.indexOf(xtVar.f44156a) != -1) {
                    pn0Var2.Z0 = true;
                    String str2 = (String) pn0Var2.V0.get(xtVar.f44156a);
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
    public void c(String str, String str2) {
        this.f36459b.w1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36458a) {
            case 0:
                pn0 pn0Var = this.f36459b;
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
                this.f36459b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                pn0.a0(this.f36459b);
                return;
            case 4:
                pn0.d0(this.f36459b);
                return;
        }
    }
}
