package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class fx implements DialogInterface.OnClickListener {
    public final int f47871a;
    public final int f47872b;
    public final Object f47873c;

    public fx(Object obj, int i7, int i10) {
        this.f47871a = i10;
        this.f47873c = obj;
        this.f47872b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f47871a) {
            case 0:
                kx kxVar = (kx) ((ji.l) this.f47873c).f17980c;
                if (i7 == 0) {
                    kxVar.f49400e.remove(this.f47872b - kxVar.f49402n);
                    kxVar.e0();
                    jx jxVar = kxVar.f49401f;
                    if (jxVar != null) {
                        jxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f47873c, this.f47872b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f47873c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.f43875a;
                if (g61Var != null) {
                    g61Var.g(this.f47872b);
                    return;
                }
                return;
        }
    }
}
