package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class gy implements DialogInterface.OnClickListener {
    public final int f37431a;
    public final int f37432b;
    public final Object f37433c;

    public gy(Object obj, int i10, int i11) {
        this.f37431a = i11;
        this.f37433c = obj;
        this.f37432b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37431a) {
            case 0:
                ly lyVar = ((hy) this.f37433c).f37816b;
                if (i10 == 0) {
                    lyVar.e.remove(this.f37432b - lyVar.f39046n);
                    lyVar.Z();
                    ky kyVar = lyVar.f39045f;
                    if (kyVar != null) {
                        kyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f37433c, this.f37432b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37433c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ua1 ua1Var = themeActivity.f33896a;
                if (ua1Var != null) {
                    ua1Var.m(this.f37432b);
                    return;
                }
                return;
        }
    }
}
