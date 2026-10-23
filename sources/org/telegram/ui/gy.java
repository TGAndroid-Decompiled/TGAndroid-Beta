package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f37436a;
    public final int f37437b;
    public final Object f37438c;

    public gy(Object obj, int i10, int i11) {
        this.f37436a = i11;
        this.f37438c = obj;
        this.f37437b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37436a) {
            case 0:
                ly lyVar = ((hy) this.f37438c).f37821b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f37437b - lyVar.f39051n);
                    lyVar.Z();
                    ky kyVar = lyVar.f39050f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37438c, this.f37437b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37438c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ua1 ua1Var = themeActivity.f33901a;
                if (ua1Var != null) {
                    ua1Var.m(this.f37437b);
                    return;
                }
                return;
        }
    }
}
