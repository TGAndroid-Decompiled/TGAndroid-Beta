package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ml0 implements org.telegram.ui.ActionBar.a2, pt, mm0 {
    public final int f39242a;
    public final xm0 f39243b;

    public ml0(xm0 xm0Var, int i10) {
        this.f39242a = i10;
        this.f39243b = xm0Var;
    }

    @Override
    public void L0(kt ktVar) {
        String str;
        switch (this.f39242a) {
            case 2:
                xm0 xm0Var = this.f39243b;
                xm0Var.Y[5].setText(ktVar.f38669a);
                xm0Var.f43223s = ktVar.d;
                return;
            default:
                xm0 xm0Var2 = this.f39243b;
                xm0Var2.Y[0].setText(ktVar.f38669a);
                if (xm0Var2.U0.indexOf(ktVar.f38669a) != -1) {
                    xm0Var2.Z0 = true;
                    String str2 = (String) xm0Var2.V0.get(ktVar.f38669a);
                    xm0Var2.Y[1].setText(str2);
                    String str3 = (String) xm0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = xm0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    xm0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new jl0(xm0Var2, 3), 300L);
                xm0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = xm0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39242a) {
            case 0:
                xm0 xm0Var = this.f39243b;
                xm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    xm0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f39243b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                xm0.a0(this.f39243b);
                return;
            case 4:
                xm0.d0(this.f39243b);
                return;
        }
    }

    @Override
    public void p(String str, String str2) {
        this.f39243b.w1();
    }
}
