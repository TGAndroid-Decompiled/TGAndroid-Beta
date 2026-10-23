package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nl0 implements org.telegram.ui.ActionBar.z1, qt, om0 {
    public final int f39925a;
    public final an0 f39926b;

    public nl0(an0 an0Var, int i10) {
        this.f39925a = i10;
        this.f39926b = an0Var;
    }

    @Override
    public void L0(lt ltVar) {
        String str;
        switch (this.f39925a) {
            case 2:
                an0 an0Var = this.f39926b;
                an0Var.Y[5].setText(ltVar.f39322a);
                an0Var.f35741s = ltVar.d;
                return;
            default:
                an0 an0Var2 = this.f39926b;
                an0Var2.Y[0].setText(ltVar.f39322a);
                if (an0Var2.U0.indexOf(ltVar.f39322a) != -1) {
                    an0Var2.Z0 = true;
                    String str2 = (String) an0Var2.V0.get(ltVar.f39322a);
                    an0Var2.Y[1].setText(str2);
                    String str3 = (String) an0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = an0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    an0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new kl0(an0Var2, 3), 300L);
                an0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = an0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void a(String str, String str2) {
        this.f39926b.w1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39925a) {
            case 0:
                an0 an0Var = this.f39926b;
                an0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    an0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f39926b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                an0.a0(this.f39926b);
                return;
            case 4:
                an0.d0(this.f39926b);
                return;
        }
    }
}
