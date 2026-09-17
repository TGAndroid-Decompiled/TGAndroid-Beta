package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class az implements DialogInterface.OnClickListener {
    public final int f32002a;
    public final int f32003b;
    public final Object f32004c;

    public az(Object obj, int i10, int i11) {
        this.f32002a = i11;
        this.f32004c = obj;
        this.f32003b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f32002a) {
            case 0:
                fz fzVar = ((bz) this.f32004c).f32603b;
                if (i10 == 0) {
                    fzVar.e.remove(this.f32003b - fzVar.f33796n);
                    fzVar.Z();
                    ez ezVar = fzVar.f33795f;
                    if (ezVar != null) {
                        ezVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f32004c, this.f32003b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f32004c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f31562a;
                if (hc1Var != null) {
                    hc1Var.m(this.f32003b);
                    return;
                }
                return;
        }
    }
}
