package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class fx implements DialogInterface.OnClickListener {
    public final int f47836a;
    public final int f47837b;
    public final Object f47838c;

    public fx(Object obj, int i7, int i10) {
        this.f47836a = i10;
        this.f47838c = obj;
        this.f47837b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f47836a) {
            case 0:
                kx kxVar = (kx) ((ji.j) this.f47838c).f17949c;
                if (i7 == 0) {
                    kxVar.f49349e.remove(this.f47837b - kxVar.f49351n);
                    kxVar.e0();
                    jx jxVar = kxVar.f49350f;
                    if (jxVar != null) {
                        jxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f47838c, this.f47837b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f47838c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.f43830a;
                if (g61Var != null) {
                    g61Var.g(this.f47837b);
                    return;
                }
                return;
        }
    }
}
