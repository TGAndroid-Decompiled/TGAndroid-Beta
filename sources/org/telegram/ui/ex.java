package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ex implements DialogInterface.OnClickListener {
    public final int f47639a;
    public final int f47640b;
    public final Object f47641c;

    public ex(Object obj, int i7, int i10) {
        this.f47639a = i10;
        this.f47641c = obj;
        this.f47640b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f47639a) {
            case 0:
                jx jxVar = (jx) ((j6.k) this.f47641c).f17344c;
                if (i7 == 0) {
                    jxVar.f49222e.remove(this.f47640b - jxVar.f49224n);
                    jxVar.e0();
                    ix ixVar = jxVar.f49223f;
                    if (ixVar != null) {
                        ixVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f47641c, this.f47640b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f47641c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                e61 e61Var = themeActivity.f43956a;
                if (e61Var != null) {
                    e61Var.g(this.f47640b);
                    return;
                }
                return;
        }
    }
}
