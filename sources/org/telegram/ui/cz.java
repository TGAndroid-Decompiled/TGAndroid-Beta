package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class cz implements DialogInterface.OnClickListener {
    public final int f34811a;
    public final int f34812b;
    public final Object f34813c;

    public cz(Object obj, int i10, int i11) {
        this.f34811a = i11;
        this.f34813c = obj;
        this.f34812b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f34811a) {
            case 0:
                hz hzVar = ((dz) this.f34813c).f35155b;
                if (i10 == 0) {
                    hzVar.e.remove(this.f34812b - hzVar.f36674n);
                    hzVar.Z();
                    gz gzVar = hzVar.f36673f;
                    if (gzVar != null) {
                        gzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f34813c, this.f34812b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f34813c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                mc1 mc1Var = themeActivity.f32542a;
                if (mc1Var != null) {
                    mc1Var.m(this.f34812b);
                    return;
                }
                return;
        }
    }
}
