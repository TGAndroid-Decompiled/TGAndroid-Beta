package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class am0 implements org.telegram.ui.ActionBar.a2, zt, cn0 {
    public final int f31870a;
    public final on0 f31871b;

    public am0(on0 on0Var, int i10) {
        this.f31870a = i10;
        this.f31871b = on0Var;
    }

    @Override
    public void a1(vt vtVar) {
        String str;
        switch (this.f31870a) {
            case 2:
                on0 on0Var = this.f31871b;
                on0Var.Y[5].setText(vtVar.f38680a);
                on0Var.f36293s = vtVar.d;
                return;
            default:
                on0 on0Var2 = this.f31871b;
                on0Var2.Y[0].setText(vtVar.f38680a);
                if (on0Var2.U0.indexOf(vtVar.f38680a) != -1) {
                    on0Var2.Z0 = true;
                    String str2 = (String) on0Var2.V0.get(vtVar.f38680a);
                    on0Var2.Y[1].setText(str2);
                    String str3 = (String) on0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = on0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    on0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new xl0(on0Var2, 3), 300L);
                on0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = on0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void b(String str, String str2) {
        this.f31871b.x1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31870a) {
            case 0:
                on0 on0Var = this.f31871b;
                on0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    on0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f31871b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                on0.a0(this.f31871b);
                return;
            case 4:
                on0.d0(this.f31871b);
                return;
        }
    }
}
