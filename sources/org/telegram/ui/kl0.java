package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kl0 implements org.telegram.ui.ActionBar.a2, nt, km0 {
    public final int f38630a;
    public final vm0 f38631b;

    public kl0(vm0 vm0Var, int i10) {
        this.f38630a = i10;
        this.f38631b = vm0Var;
    }

    @Override
    public void L0(ht htVar) {
        String str;
        switch (this.f38630a) {
            case 2:
                vm0 vm0Var = this.f38631b;
                vm0Var.Y[5].setText(htVar.f37777a);
                vm0Var.f42315s = htVar.d;
                return;
            default:
                vm0 vm0Var2 = this.f38631b;
                vm0Var2.Y[0].setText(htVar.f37777a);
                if (vm0Var2.U0.indexOf(htVar.f37777a) != -1) {
                    vm0Var2.Z0 = true;
                    String str2 = (String) vm0Var2.V0.get(htVar.f37777a);
                    vm0Var2.Y[1].setText(str2);
                    String str3 = (String) vm0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = vm0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    vm0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new hl0(vm0Var2, 3), 300L);
                vm0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = vm0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38630a) {
            case 0:
                vm0 vm0Var = this.f38631b;
                vm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vm0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f38631b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                vm0.a0(this.f38631b);
                return;
            case 4:
                vm0.d0(this.f38631b);
                return;
        }
    }

    @Override
    public void p(String str, String str2) {
        this.f38631b.w1();
    }
}
