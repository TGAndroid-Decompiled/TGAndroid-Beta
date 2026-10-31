package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ey implements DialogInterface.OnClickListener {
    public final int f37125a;
    public final int f37126b;
    public final Object f37127c;

    public ey(Object obj, int i10, int i11) {
        this.f37125a = i11;
        this.f37127c = obj;
        this.f37126b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f37125a) {
            case 0:
                iy iyVar = (iy) ((m5.e) this.f37127c).f13014c;
                if (i10 == 0) {
                    iyVar.e.remove(this.f37126b - iyVar.f38368n);
                    iyVar.d0();
                    hy hyVar = iyVar.f38367f;
                    if (hyVar != null) {
                        hyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.f37127c, this.f37126b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f37127c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                x71 x71Var = themeActivity.f34087a;
                if (x71Var != null) {
                    x71Var.g(this.f37126b);
                    return;
                }
                return;
        }
    }
}
