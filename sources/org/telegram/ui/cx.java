package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class cx implements DialogInterface.OnClickListener {
    public final int f44821a;
    public final int f44822b;
    public final Object f44823c;

    public cx(Object obj, int i7, int i10) {
        this.f44821a = i10;
        this.f44823c = obj;
        this.f44822b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f44821a) {
            case 0:
                hx hxVar = (hx) ((j2.n) this.f44823c).f16457c;
                if (i7 == 0) {
                    hxVar.f46439e.remove(this.f44822b - hxVar.f46441n);
                    hxVar.e0();
                    gx gxVar = hxVar.f46440f;
                    if (gxVar != null) {
                        gxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f44823c, this.f44822b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44823c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                h61 h61Var = themeActivity.f42009a;
                if (h61Var != null) {
                    h61Var.g(this.f44822b);
                    return;
                }
                return;
        }
    }
}
