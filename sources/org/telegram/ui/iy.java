package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class iy implements DialogInterface.OnClickListener {
    public final int f38010a;
    public final int f38011b;
    public final Object f38012c;

    public iy(Object obj, int i10, int i11) {
        this.f38010a = i11;
        this.f38012c = obj;
        this.f38011b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38010a) {
            case 0:
                ny nyVar = ((jy) this.f38012c).f38372b;
                if (i10 == 0) {
                    nyVar.e.remove(this.f38011b - nyVar.f39601n);
                    nyVar.Z();
                    my myVar = nyVar.f39600f;
                    if (myVar != null) {
                        myVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38012c, this.f38011b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38012c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                wa1 wa1Var = themeActivity.f33889a;
                if (wa1Var != null) {
                    wa1Var.m(this.f38011b);
                    return;
                }
                return;
        }
    }
}
