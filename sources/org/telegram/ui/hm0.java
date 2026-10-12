package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hm0 implements org.telegram.ui.ActionBar.z1, eu, hn0 {
    public final int f36885a;
    public final un0 f36886b;

    public hm0(un0 un0Var, int i10) {
        this.f36885a = i10;
        this.f36886b = un0Var;
    }

    @Override
    public void a1(au auVar) {
        String str;
        switch (this.f36885a) {
            case 2:
                un0 un0Var = this.f36886b;
                un0Var.Y[5].setText(auVar.f34339a);
                un0Var.f40759s = auVar.d;
                return;
            default:
                un0 un0Var2 = this.f36886b;
                un0Var2.Y[0].setText(auVar.f34339a);
                if (un0Var2.U0.indexOf(auVar.f34339a) != -1) {
                    un0Var2.Z0 = true;
                    String str2 = (String) un0Var2.V0.get(auVar.f34339a);
                    un0Var2.Y[1].setText(str2);
                    String str3 = (String) un0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = un0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    un0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new em0(un0Var2, 3), 300L);
                un0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = un0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36885a) {
            case 0:
                un0 un0Var = this.f36886b;
                un0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    un0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f36886b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                un0.a0(this.f36886b);
                return;
            case 4:
                un0.d0(this.f36886b);
                return;
        }
    }

    @Override
    public void o(String str, String str2) {
        this.f36886b.w1();
    }
}
