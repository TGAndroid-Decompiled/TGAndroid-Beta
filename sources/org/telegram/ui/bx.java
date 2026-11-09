package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bx implements DialogInterface.OnClickListener {
    public final int f44149a;
    public final int f44150b;
    public final Object f44151c;

    public bx(Object obj, int i7, int i10) {
        this.f44149a = i10;
        this.f44151c = obj;
        this.f44150b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f44149a) {
            case 0:
                gx gxVar = (gx) ((j2.n) this.f44151c).f16457c;
                if (i7 == 0) {
                    gxVar.f46084e.remove(this.f44150b - gxVar.f46086n);
                    gxVar.e0();
                    fx fxVar = gxVar.f46085f;
                    if (fxVar != null) {
                        fxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f44151c, this.f44150b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44151c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.f42018a;
                if (g61Var != null) {
                    g61Var.g(this.f44150b);
                    return;
                }
                return;
        }
    }
}
