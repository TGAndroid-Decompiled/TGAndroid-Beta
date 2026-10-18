package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class iy implements DialogInterface.OnClickListener {
    public final int f37992a;
    public final int f37993b;
    public final Object f37994c;

    public iy(Object obj, int i10, int i11) {
        this.f37992a = i11;
        this.f37994c = obj;
        this.f37993b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37992a) {
            case 0:
                ny nyVar = ((jy) this.f37994c).f38357b;
                if (i10 == 0) {
                    nyVar.e.remove(this.f37993b - nyVar.f39593n);
                    nyVar.Z();
                    my myVar = nyVar.f39592f;
                    if (myVar != null) {
                        myVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37994c, this.f37993b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37994c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                wa1 wa1Var = themeActivity.f33882a;
                if (wa1Var != null) {
                    wa1Var.m(this.f37993b);
                    return;
                }
                return;
        }
    }
}
