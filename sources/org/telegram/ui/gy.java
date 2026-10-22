package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f37435a;
    public final int f37436b;
    public final Object f37437c;

    public gy(Object obj, int i10, int i11) {
        this.f37435a = i11;
        this.f37437c = obj;
        this.f37436b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37435a) {
            case 0:
                ly lyVar = ((hy) this.f37437c).f37820b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f37436b - lyVar.f39050n);
                    lyVar.Z();
                    ky kyVar = lyVar.f39049f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37437c, this.f37436b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37437c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ua1 ua1Var = themeActivity.f33900a;
                if (ua1Var != null) {
                    ua1Var.m(this.f37436b);
                    return;
                }
                return;
        }
    }
}
