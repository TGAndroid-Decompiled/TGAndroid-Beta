package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class hy implements DialogInterface.OnClickListener {
    public final int f38954a;
    public final int f38955b;
    public final Object f38956c;

    public hy(Object obj, int i9, int i10) {
        this.f38954a = i10;
        this.f38956c = obj;
        this.f38955b = i9;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        switch (this.f38954a) {
            case 0:
                my myVar = ((iy) this.f38956c).f39318b;
                if (i9 == 0) {
                    myVar.f40549e.remove(this.f38955b - myVar.f40551n);
                    myVar.Y();
                    ly lyVar = myVar.f40550f;
                    if (lyVar != null) {
                        lyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.f38956c, this.f38955b, i9);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38956c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i9);
                edit.commit();
                xa1 xa1Var = themeActivity.f36225a;
                if (xa1Var != null) {
                    xa1Var.m(this.f38955b);
                    return;
                }
                return;
        }
    }
}
