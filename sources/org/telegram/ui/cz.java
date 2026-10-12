package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class cz implements DialogInterface.OnClickListener {
    public final int f35091a;
    public final int f35092b;
    public final Object f35093c;

    public cz(Object obj, int i10, int i11) {
        this.f35091a = i11;
        this.f35093c = obj;
        this.f35092b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f35091a) {
            case 0:
                hz hzVar = ((dz) this.f35093c).f35406b;
                if (i10 == 0) {
                    hzVar.e.remove(this.f35092b - hzVar.f36988n);
                    hzVar.Z();
                    gz gzVar = hzVar.f36987f;
                    if (gzVar != null) {
                        gzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f35093c, this.f35092b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f35093c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                mc1 mc1Var = themeActivity.f32840a;
                if (mc1Var != null) {
                    mc1Var.m(this.f35092b);
                    return;
                }
                return;
        }
    }
}
