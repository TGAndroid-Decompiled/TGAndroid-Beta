package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f37432a;
    public final int f37433b;
    public final Object f37434c;

    public gy(Object obj, int i10, int i11) {
        this.f37432a = i11;
        this.f37434c = obj;
        this.f37433b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37432a) {
            case 0:
                ly lyVar = ((hy) this.f37434c).f37817b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f37433b - lyVar.f39047n);
                    lyVar.Z();
                    ky kyVar = lyVar.f39046f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37434c, this.f37433b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37434c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ua1 ua1Var = themeActivity.f33897a;
                if (ua1Var != null) {
                    ua1Var.m(this.f37433b);
                    return;
                }
                return;
        }
    }
}
