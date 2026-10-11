package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class am0 implements org.telegram.ui.ActionBar.z1, xt, an0 {
    public final int f36115a;
    public final mn0 f36116b;

    public am0(mn0 mn0Var, int i10) {
        this.f36115a = i10;
        this.f36116b = mn0Var;
    }

    @Override
    public void U0(tt ttVar) {
        String str;
        switch (this.f36115a) {
            case 2:
                mn0 mn0Var = this.f36116b;
                mn0Var.Y[5].setText(ttVar.f42259a);
                mn0Var.f40023s = ttVar.d;
                return;
            default:
                mn0 mn0Var2 = this.f36116b;
                mn0Var2.Y[0].setText(ttVar.f42259a);
                if (mn0Var2.U0.indexOf(ttVar.f42259a) != -1) {
                    mn0Var2.Z0 = true;
                    String str2 = (String) mn0Var2.V0.get(ttVar.f42259a);
                    mn0Var2.Y[1].setText(str2);
                    String str3 = (String) mn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = mn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    mn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new xl0(mn0Var2, 3), 300L);
                mn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = mn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void c(String str, String str2) {
        this.f36116b.w1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36115a) {
            case 0:
                mn0 mn0Var = this.f36116b;
                mn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    mn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.f36116b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                mn0.a0(this.f36116b);
                return;
            case 4:
                mn0.d0(this.f36116b);
                return;
        }
    }
}
