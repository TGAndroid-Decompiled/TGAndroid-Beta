package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pi0 implements org.telegram.ui.ActionBar.p1, ns, nj0 {
    public final int f48599a;
    public final yj0 f48600b;

    public pi0(yj0 yj0Var, int i3) {
        this.f48599a = i3;
        this.f48600b = yj0Var;
    }

    @Override
    public void c(ks ksVar) {
        String str;
        switch (this.f48599a) {
            case 2:
                yj0 yj0Var = this.f48600b;
                yj0Var.Z[5].setText(ksVar.f47004a);
                yj0Var.f52324s = ksVar.d;
                return;
            default:
                yj0 yj0Var2 = this.f48600b;
                yj0Var2.Z[0].setText(ksVar.f47004a);
                if (yj0Var2.V0.indexOf(ksVar.f47004a) != -1) {
                    yj0Var2.f52286a1 = true;
                    String str2 = (String) yj0Var2.W0.get(ksVar.f47004a);
                    yj0Var2.Z[1].setText(str2);
                    String str3 = (String) yj0Var2.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = yj0Var2.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    yj0Var2.f52286a1 = false;
                }
                org.telegram.messenger.g0.i3(new mi0(yj0Var2, 3), 300L);
                yj0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = yj0Var2.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void f(String str, String str2) {
        this.f48600b.B1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f48599a) {
            case 0:
                yj0 yj0Var = this.f48600b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    yj0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f48600b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                yj0.f0(this.f48600b);
                return;
            case 4:
                yj0.i0(this.f48600b);
                return;
        }
    }
}
