package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class az implements DialogInterface.OnClickListener {
    public final int f32006a;
    public final int f32007b;
    public final Object f32008c;

    public az(Object obj, int i10, int i11) {
        this.f32006a = i11;
        this.f32008c = obj;
        this.f32007b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f32006a) {
            case 0:
                fz fzVar = ((bz) this.f32008c).f32607b;
                if (i10 == 0) {
                    fzVar.e.remove(this.f32007b - fzVar.f33800n);
                    fzVar.Z();
                    ez ezVar = fzVar.f33799f;
                    if (ezVar != null) {
                        ezVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f32008c, this.f32007b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f32008c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f31566a;
                if (hc1Var != null) {
                    hc1Var.m(this.f32007b);
                    return;
                }
                return;
        }
    }
}
