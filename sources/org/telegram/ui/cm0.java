package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 implements org.telegram.ui.ActionBar.b2, bu, en0 {
    public final int f32839a;
    public final qn0 f32840b;

    public cm0(qn0 qn0Var, int i10) {
        this.f32839a = i10;
        this.f32840b = qn0Var;
    }

    @Override
    public void a1(xt xtVar) {
        String str;
        switch (this.f32839a) {
            case 2:
                qn0 qn0Var = this.f32840b;
                qn0Var.Y[5].setText(xtVar.f39700a);
                qn0Var.f36987s = xtVar.d;
                return;
            default:
                qn0 qn0Var2 = this.f32840b;
                qn0Var2.Y[0].setText(xtVar.f39700a);
                if (qn0Var2.U0.indexOf(xtVar.f39700a) != -1) {
                    qn0Var2.Z0 = true;
                    String str2 = (String) qn0Var2.V0.get(xtVar.f39700a);
                    qn0Var2.Y[1].setText(str2);
                    String str3 = (String) qn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = qn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    qn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new zl0(qn0Var2, 3), 300L);
                qn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = qn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void b(String str, String str2) {
        this.f32840b.x1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32839a) {
            case 0:
                qn0 qn0Var = this.f32840b;
                qn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    qn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f32840b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                qn0.a0(this.f32840b);
                return;
            case 4:
                qn0.d0(this.f32840b);
                return;
        }
    }
}
