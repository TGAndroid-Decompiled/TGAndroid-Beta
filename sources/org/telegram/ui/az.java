package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class az implements DialogInterface.OnClickListener {
    public final int f31105a;
    public final int f31106b;
    public final Object f31107c;

    public az(Object obj, int i10, int i11) {
        this.f31105a = i11;
        this.f31107c = obj;
        this.f31106b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f31105a) {
            case 0:
                fz fzVar = ((bz) this.f31107c).f31470b;
                if (i10 == 0) {
                    fzVar.e.remove(this.f31106b - fzVar.f32940n);
                    fzVar.Z();
                    ez ezVar = fzVar.f32939f;
                    if (ezVar != null) {
                        ezVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f31107c, this.f31106b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f31107c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                kc1 kc1Var = themeActivity.f30661a;
                if (kc1Var != null) {
                    kc1Var.m(this.f31106b);
                    return;
                }
                return;
        }
    }
}
