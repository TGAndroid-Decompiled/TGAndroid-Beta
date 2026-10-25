package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f39795a;
    public final int f39796b;
    public final Object f39797c;

    public gy(Object obj, int i10, int i11) {
        this.f39795a = i11;
        this.f39797c = obj;
        this.f39796b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39795a) {
            case 0:
                ly lyVar = ((hy) this.f39797c).f40100b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f39796b - lyVar.f41393n);
                    lyVar.a0();
                    ky kyVar = lyVar.f41392f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.Y((NotificationsSettingsActivity) this.f39797c, this.f39796b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f39797c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                bb1 bb1Var = themeActivity.f36260a;
                if (bb1Var != null) {
                    bb1Var.m(this.f39796b);
                    return;
                }
                return;
        }
    }
}
