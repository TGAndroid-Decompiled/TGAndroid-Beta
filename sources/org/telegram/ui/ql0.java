package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ql0 implements org.telegram.ui.ActionBar.c2, xt, rm0 {
    public final int f37794a;
    public final dn0 f37795b;

    public ql0(dn0 dn0Var, int i10) {
        this.f37794a = i10;
        this.f37795b = dn0Var;
    }

    @Override
    public void D(String str, String str2) {
        this.f37795b.x1();
    }

    @Override
    public void b1(st stVar) {
        String str;
        switch (this.f37794a) {
            case 2:
                dn0 dn0Var = this.f37795b;
                dn0Var.V[5].setText(stVar.f38435a);
                dn0Var.f33722s = stVar.d;
                return;
            default:
                dn0 dn0Var2 = this.f37795b;
                dn0Var2.V[0].setText(stVar.f38435a);
                if (dn0Var2.R0.indexOf(stVar.f38435a) != -1) {
                    dn0Var2.W0 = true;
                    String str2 = (String) dn0Var2.S0.get(stVar.f38435a);
                    dn0Var2.V[1].setText(str2);
                    String str3 = (String) dn0Var2.U0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = dn0Var2.V[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    dn0Var2.W0 = false;
                }
                AndroidUtilities.runOnUIThread(new nl0(dn0Var2, 3), 300L);
                dn0Var2.V[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = dn0Var2.V[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37794a) {
            case 0:
                dn0 dn0Var = this.f37795b;
                dn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    dn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f37795b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                dn0.a0(this.f37795b);
                return;
            case 4:
                dn0.d0(this.f37795b);
                return;
        }
    }
}
