package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class jy implements DialogInterface.OnClickListener {
    public final int f39702a;
    public final int f39703b;
    public final Object f39704c;

    public jy(Object obj, int i10, int i11) {
        this.f39702a = i11;
        this.f39704c = obj;
        this.f39703b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39702a) {
            case 0:
                oy oyVar = ((ky) this.f39704c).f40039b;
                if (i10 == 0) {
                    oyVar.f41240e.remove(this.f39703b - oyVar.f41242n);
                    oyVar.Z();
                    ny nyVar = oyVar.f41241f;
                    if (nyVar != null) {
                        nyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f39704c, this.f39703b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f39704c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                ya1 ya1Var = themeActivity.f36290a;
                if (ya1Var != null) {
                    ya1Var.m(this.f39703b);
                    return;
                }
                return;
        }
    }
}
