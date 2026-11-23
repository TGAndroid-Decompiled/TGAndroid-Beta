package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class fx implements DialogInterface.OnClickListener {
    public final int f47821a;
    public final int f47822b;
    public final Object f47823c;

    public fx(Object obj, int i7, int i10) {
        this.f47821a = i10;
        this.f47823c = obj;
        this.f47822b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f47821a) {
            case 0:
                kx kxVar = (kx) ((ji.k) this.f47823c).f17943c;
                if (i7 == 0) {
                    kxVar.f49375e.remove(this.f47822b - kxVar.f49377n);
                    kxVar.e0();
                    jx jxVar = kxVar.f49376f;
                    if (jxVar != null) {
                        jxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f47823c, this.f47822b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f47823c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.f43840a;
                if (g61Var != null) {
                    g61Var.g(this.f47822b);
                    return;
                }
                return;
        }
    }
}
