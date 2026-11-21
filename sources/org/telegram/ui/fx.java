package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class fx implements DialogInterface.OnClickListener {
    public final int f47867a;
    public final int f47868b;
    public final Object f47869c;

    public fx(Object obj, int i7, int i10) {
        this.f47867a = i10;
        this.f47869c = obj;
        this.f47868b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f47867a) {
            case 0:
                kx kxVar = (kx) ((ji.l) this.f47869c).f17977c;
                if (i7 == 0) {
                    kxVar.f49396e.remove(this.f47868b - kxVar.f49398n);
                    kxVar.e0();
                    jx jxVar = kxVar.f49397f;
                    if (jxVar != null) {
                        jxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f47869c, this.f47868b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f47869c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.f43871a;
                if (g61Var != null) {
                    g61Var.g(this.f47868b);
                    return;
                }
                return;
        }
    }
}
