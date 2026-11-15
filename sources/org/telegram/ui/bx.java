package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bx implements DialogInterface.OnClickListener {
    public final int f45835a;
    public final int f45836b;
    public final Object f45837c;

    public bx(Object obj, int i7, int i10) {
        this.f45835a = i10;
        this.f45837c = obj;
        this.f45836b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f45835a) {
            case 0:
                gx gxVar = (gx) ((ji.j) this.f45837c).f17556c;
                if (i7 == 0) {
                    gxVar.f47529e.remove(this.f45836b - gxVar.f47531n);
                    gxVar.e0();
                    fx fxVar = gxVar.f47530f;
                    if (fxVar != null) {
                        fxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f45837c, this.f45836b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f45837c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                c61 c61Var = themeActivity.f43384a;
                if (c61Var != null) {
                    c61Var.g(this.f45836b);
                    return;
                }
                return;
        }
    }
}
