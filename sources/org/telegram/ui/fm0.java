package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fm0 implements org.telegram.ui.ActionBar.z1, eu, gn0 {
    public final int f35565a;
    public final sn0 f35566b;

    public fm0(sn0 sn0Var, int i10) {
        this.f35565a = i10;
        this.f35566b = sn0Var;
    }

    @Override
    public void Z0(au auVar) {
        String str;
        switch (this.f35565a) {
            case 2:
                sn0 sn0Var = this.f35566b;
                sn0Var.Y[5].setText(auVar.f34084a);
                sn0Var.f39894s = auVar.d;
                return;
            default:
                sn0 sn0Var2 = this.f35566b;
                sn0Var2.Y[0].setText(auVar.f34084a);
                if (sn0Var2.U0.indexOf(auVar.f34084a) != -1) {
                    sn0Var2.Z0 = true;
                    String str2 = (String) sn0Var2.V0.get(auVar.f34084a);
                    sn0Var2.Y[1].setText(str2);
                    String str3 = (String) sn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = sn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    sn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new cm0(sn0Var2, 3), 300L);
                sn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = sn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void d(String str, String str2) {
        this.f35566b.w1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35565a) {
            case 0:
                sn0 sn0Var = this.f35566b;
                sn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f35566b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                sn0.a0(this.f35566b);
                return;
            case 4:
                sn0.d0(this.f35566b);
                return;
        }
    }
}
