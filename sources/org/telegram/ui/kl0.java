package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kl0 implements org.telegram.ui.ActionBar.b2, pt, lm0 {
    public final int f39868a;
    public final wm0 f39869b;

    public kl0(wm0 wm0Var, int i9) {
        this.f39868a = i9;
        this.f39869b = wm0Var;
    }

    @Override
    public void T(String str, String str2) {
        this.f39869b.x1();
    }

    @Override
    public void a1(lt ltVar) {
        String str;
        switch (this.f39868a) {
            case 2:
                wm0 wm0Var = this.f39869b;
                wm0Var.U[5].setText(ltVar.f40225a);
                wm0Var.f44189s = ltVar.d;
                return;
            default:
                wm0 wm0Var2 = this.f39869b;
                wm0Var2.U[0].setText(ltVar.f40225a);
                if (wm0Var2.Q0.indexOf(ltVar.f40225a) != -1) {
                    wm0Var2.V0 = true;
                    String str2 = (String) wm0Var2.R0.get(ltVar.f40225a);
                    wm0Var2.U[1].setText(str2);
                    String str3 = (String) wm0Var2.T0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = wm0Var2.U[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    wm0Var2.V0 = false;
                }
                AndroidUtilities.runOnUIThread(new hl0(wm0Var2, 3), 300L);
                wm0Var2.U[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = wm0Var2.U[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f39868a) {
            case 0:
                wm0 wm0Var = this.f39869b;
                wm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    wm0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                this.f39869b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                wm0.Z(this.f39869b);
                return;
            case 4:
                wm0.c0(this.f39869b);
                return;
        }
    }
}
