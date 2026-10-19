package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f37425a;
    public final int f37426b;
    public final Object f37427c;

    public gy(Object obj, int i10, int i11) {
        this.f37425a = i11;
        this.f37427c = obj;
        this.f37426b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37425a) {
            case 0:
                ly lyVar = ((hy) this.f37427c).f37810b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f37426b - lyVar.f39040n);
                    lyVar.Z();
                    ky kyVar = lyVar.f39039f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37427c, this.f37426b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37427c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ua1 ua1Var = themeActivity.f33890a;
                if (ua1Var != null) {
                    ua1Var.m(this.f37426b);
                    return;
                }
                return;
        }
    }
}
