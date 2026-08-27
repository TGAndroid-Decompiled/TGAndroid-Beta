package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class kl0 implements org.telegram.ui.ActionBar.a2, st, mm0 {

    public final int f39805a;

    public final xm0 f39806b;

    public kl0(xm0 xm0Var, int i10) {
        this.f39805a = i10;
        this.f39806b = xm0Var;
    }

    @Override
    public void S(String str, String str2) {
        this.f39806b.x1();
    }

    @Override
    public void Z0(nt ntVar) {
        switch (this.f39805a) {
            case 2:
                xm0 xm0Var = this.f39806b;
                xm0Var.U[5].setText(ntVar.f40915a);
                xm0Var.f44520s = ntVar.d;
                break;
            default:
                xm0 xm0Var2 = this.f39806b;
                xm0Var2.U[0].setText(ntVar.f40915a);
                if (xm0Var2.Q0.indexOf(ntVar.f40915a) != -1) {
                    xm0Var2.V0 = true;
                    String str = (String) xm0Var2.R0.get(ntVar.f40915a);
                    xm0Var2.U[1].setText(str);
                    String str2 = (String) xm0Var2.T0.get(str);
                    xm0Var2.U[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    xm0Var2.V0 = false;
                }
                AndroidUtilities.runOnUIThread(new hl0(xm0Var2, 3), 300L);
                xm0Var2.U[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = xm0Var2.U[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39805a) {
            case 0:
                xm0 xm0Var = this.f39806b;
                xm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    xm0Var.getParentActivity().startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                this.f39806b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                xm0.a0(this.f39806b);
                break;
            case 4:
                xm0 xm0Var2 = this.f39806b;
                we.e.s(xm0Var2.getParentActivity(), "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(xm0Var2.currentAccount).getClientPhone());
                break;
        }
    }
}
