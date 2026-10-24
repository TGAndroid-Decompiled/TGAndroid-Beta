package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class iy implements DialogInterface.OnClickListener {
    public final int f38403a;
    public final int f38404b;
    public final Object f38405c;

    public iy(Object obj, int i10, int i11) {
        this.f38403a = i11;
        this.f38405c = obj;
        this.f38404b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38403a) {
            case 0:
                ny nyVar = ((jy) this.f38405c).f38702b;
                if (i10 == 0) {
                    nyVar.e.remove(this.f38404b - nyVar.f40021n);
                    nyVar.Z();
                    my myVar = nyVar.f40020f;
                    if (myVar != null) {
                        myVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38405c, this.f38404b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38405c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ya1 ya1Var = themeActivity.f34200a;
                if (ya1Var != null) {
                    ya1Var.m(this.f38404b);
                    return;
                }
                return;
        }
    }
}
