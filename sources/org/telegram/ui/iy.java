package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class iy implements DialogInterface.OnClickListener {
    public final int f38412a;
    public final int f38413b;
    public final Object f38414c;

    public iy(Object obj, int i10, int i11) {
        this.f38412a = i11;
        this.f38414c = obj;
        this.f38413b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38412a) {
            case 0:
                ny nyVar = ((jy) this.f38414c).f38724b;
                if (i10 == 0) {
                    nyVar.e.remove(this.f38413b - nyVar.f40008n);
                    nyVar.Z();
                    my myVar = nyVar.f40007f;
                    if (myVar != null) {
                        myVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38414c, this.f38413b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38414c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                za1 za1Var = themeActivity.f34198a;
                if (za1Var != null) {
                    za1Var.m(this.f38413b);
                    return;
                }
                return;
        }
    }
}
