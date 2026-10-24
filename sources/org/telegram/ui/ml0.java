package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ml0 implements org.telegram.ui.ActionBar.z1, qt, nm0 {
    public final int f39619a;
    public final zm0 f39620b;

    public ml0(zm0 zm0Var, int i10) {
        this.f39619a = i10;
        this.f39620b = zm0Var;
    }

    @Override
    public void L0(lt ltVar) {
        String str;
        switch (this.f39619a) {
            case 2:
                zm0 zm0Var = this.f39620b;
                zm0Var.Y[5].setText(ltVar.f39375a);
                zm0Var.f44164s = ltVar.d;
                return;
            default:
                zm0 zm0Var2 = this.f39620b;
                zm0Var2.Y[0].setText(ltVar.f39375a);
                if (zm0Var2.U0.indexOf(ltVar.f39375a) != -1) {
                    zm0Var2.Z0 = true;
                    String str2 = (String) zm0Var2.V0.get(ltVar.f39375a);
                    zm0Var2.Y[1].setText(str2);
                    String str3 = (String) zm0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = zm0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    zm0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new jl0(zm0Var2, 3), 300L);
                zm0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = zm0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void a(String str, String str2) {
        this.f39620b.w1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39619a) {
            case 0:
                zm0 zm0Var = this.f39620b;
                zm0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    zm0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f39620b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                zm0.a0(this.f39620b);
                return;
            case 4:
                zm0.d0(this.f39620b);
                return;
        }
    }
}
