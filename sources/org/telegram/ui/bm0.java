package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bm0 implements org.telegram.ui.ActionBar.a2, yt, bn0 {
    public final int f36355a;
    public final nn0 f36356b;

    public bm0(nn0 nn0Var, int i10) {
        this.f36355a = i10;
        this.f36356b = nn0Var;
    }

    @Override
    public void U0(ut utVar) {
        String str;
        switch (this.f36355a) {
            case 2:
                nn0 nn0Var = this.f36356b;
                nn0Var.Y[5].setText(utVar.f42547a);
                nn0Var.f40279s = utVar.d;
                return;
            default:
                nn0 nn0Var2 = this.f36356b;
                nn0Var2.Y[0].setText(utVar.f42547a);
                if (nn0Var2.U0.indexOf(utVar.f42547a) != -1) {
                    nn0Var2.Z0 = true;
                    String str2 = (String) nn0Var2.V0.get(utVar.f42547a);
                    nn0Var2.Y[1].setText(str2);
                    String str3 = (String) nn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = nn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    nn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new yl0(nn0Var2, 3), 300L);
                nn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = nn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void c(String str, String str2) {
        this.f36356b.w1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36355a) {
            case 0:
                nn0 nn0Var = this.f36356b;
                nn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    nn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.f36356b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                nn0.a0(this.f36356b);
                return;
            case 4:
                nn0.d0(this.f36356b);
                return;
        }
    }
}
