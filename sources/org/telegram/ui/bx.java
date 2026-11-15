package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bx implements DialogInterface.OnClickListener {
    public final int f45846a;
    public final int f45847b;
    public final Object f45848c;

    public bx(Object obj, int i7, int i10) {
        this.f45846a = i10;
        this.f45848c = obj;
        this.f45847b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f45846a) {
            case 0:
                gx gxVar = (gx) ((ji.j) this.f45848c).f17556c;
                if (i7 == 0) {
                    gxVar.f47539e.remove(this.f45847b - gxVar.f47541n);
                    gxVar.e0();
                    fx fxVar = gxVar.f47540f;
                    if (fxVar != null) {
                        fxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f45848c, this.f45847b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f45848c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                c61 c61Var = themeActivity.f43384a;
                if (c61Var != null) {
                    c61Var.g(this.f45847b);
                    return;
                }
                return;
        }
    }
}
