package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f39798a;
    public final int f39799b;
    public final Object f39800c;

    public gy(Object obj, int i10, int i11) {
        this.f39798a = i11;
        this.f39800c = obj;
        this.f39799b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39798a) {
            case 0:
                ly lyVar = ((hy) this.f39800c).f40103b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f39799b - lyVar.f41396n);
                    lyVar.a0();
                    ky kyVar = lyVar.f41395f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.Y((NotificationsSettingsActivity) this.f39800c, this.f39799b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f39800c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                bb1 bb1Var = themeActivity.f36263a;
                if (bb1Var != null) {
                    bb1Var.m(this.f39799b);
                    return;
                }
                return;
        }
    }
}
