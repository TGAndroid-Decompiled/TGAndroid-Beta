package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f37451a;
    public final int f37452b;
    public final Object f37453c;

    public gy(Object obj, int i10, int i11) {
        this.f37451a = i11;
        this.f37453c = obj;
        this.f37452b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37451a) {
            case 0:
                ly lyVar = ((hy) this.f37453c).f37839b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f37452b - lyVar.f39075n);
                    lyVar.Z();
                    ky kyVar = lyVar.f39074f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37453c, this.f37452b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37453c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ua1 ua1Var = themeActivity.f33888a;
                if (ua1Var != null) {
                    ua1Var.m(this.f37452b);
                    return;
                }
                return;
        }
    }
}
