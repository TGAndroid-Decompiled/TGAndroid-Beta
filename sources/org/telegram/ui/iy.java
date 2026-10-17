package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class iy implements DialogInterface.OnClickListener {
    public final int f37994a;
    public final int f37995b;
    public final Object f37996c;

    public iy(Object obj, int i10, int i11) {
        this.f37994a = i11;
        this.f37996c = obj;
        this.f37995b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37994a) {
            case 0:
                ny nyVar = ((jy) this.f37996c).f38363b;
                if (i10 == 0) {
                    nyVar.e.remove(this.f37995b - nyVar.f39580n);
                    nyVar.Z();
                    my myVar = nyVar.f39579f;
                    if (myVar != null) {
                        myVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37996c, this.f37995b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37996c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                wa1 wa1Var = themeActivity.f33882a;
                if (wa1Var != null) {
                    wa1Var.m(this.f37995b);
                    return;
                }
                return;
        }
    }
}
