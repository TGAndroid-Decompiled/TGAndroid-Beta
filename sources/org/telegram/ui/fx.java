package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class fx implements DialogInterface.OnClickListener {
    public final int f47800a;
    public final int f47801b;
    public final Object f47802c;

    public fx(Object obj, int i7, int i10) {
        this.f47800a = i10;
        this.f47802c = obj;
        this.f47801b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f47800a) {
            case 0:
                kx kxVar = (kx) ((ji.j) this.f47802c).f17946c;
                if (i7 == 0) {
                    kxVar.f49355e.remove(this.f47801b - kxVar.f49357n);
                    kxVar.e0();
                    jx jxVar = kxVar.f49356f;
                    if (jxVar != null) {
                        jxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f47802c, this.f47801b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f47802c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.f43830a;
                if (g61Var != null) {
                    g61Var.g(this.f47801b);
                    return;
                }
                return;
        }
    }
}
