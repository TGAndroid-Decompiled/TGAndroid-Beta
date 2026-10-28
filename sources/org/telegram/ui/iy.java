package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class iy implements DialogInterface.OnClickListener {
    public final int f40287a;
    public final int f40288b;
    public final Object f40289c;

    public iy(Object obj, int i10, int i11) {
        this.f40287a = i11;
        this.f40289c = obj;
        this.f40288b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f40287a) {
            case 0:
                ny nyVar = ((jy) this.f40289c).f40626b;
                if (i10 == 0) {
                    nyVar.e.remove(this.f40288b - nyVar.f41920n);
                    nyVar.a0();
                    my myVar = nyVar.f41919f;
                    if (myVar != null) {
                        myVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.Y((NotificationsSettingsActivity) this.f40289c, this.f40288b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f40289c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                db1 db1Var = themeActivity.f36287a;
                if (db1Var != null) {
                    db1Var.m(this.f40288b);
                    return;
                }
                return;
        }
    }
}
