package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hl0 implements org.telegram.ui.ActionBar.b2, qt, jm0 {
    public final int f38956a;
    public final vm0 f38957b;

    public hl0(vm0 vm0Var, int i10) {
        this.f38956a = i10;
        this.f38957b = vm0Var;
    }

    @Override
    public void M(String str, String str2) {
        this.f38957b.x1();
    }

    @Override
    public void Z0(lt ltVar) {
        String str;
        switch (this.f38956a) {
            case 2:
                vm0 vm0Var = this.f38957b;
                vm0Var.U[5].setText(ltVar.f40272a);
                vm0Var.f43663s = ltVar.d;
                return;
            default:
                vm0 vm0Var2 = this.f38957b;
                vm0Var2.U[0].setText(ltVar.f40272a);
                if (vm0Var2.Q0.indexOf(ltVar.f40272a) != -1) {
                    vm0Var2.V0 = true;
                    String str2 = (String) vm0Var2.R0.get(ltVar.f40272a);
                    vm0Var2.U[1].setText(str2);
                    String str3 = (String) vm0Var2.T0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = vm0Var2.U[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    vm0Var2.V0 = false;
                }
                AndroidUtilities.runOnUIThread(new el0(vm0Var2, 3), 300L);
                vm0Var2.U[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = vm0Var2.U[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38956a) {
            case 0:
                vm0 vm0Var = this.f38957b;
                vm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vm0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                this.f38957b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                vm0.a0(this.f38957b);
                return;
            case 4:
                vm0.d0(this.f38957b);
                return;
        }
    }
}
