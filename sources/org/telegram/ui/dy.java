package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class dy implements DialogInterface.OnClickListener {
    public final int f36693a;
    public final int f36694b;
    public final Object f36695c;

    public dy(Object obj, int i10, int i11) {
        this.f36693a = i11;
        this.f36695c = obj;
        this.f36694b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f36693a) {
            case 0:
                hy hyVar = (hy) ((m5.e) this.f36695c).f13015c;
                if (i10 == 0) {
                    hyVar.e.remove(this.f36694b - hyVar.f37886n);
                    hyVar.e0();
                    gy gyVar = hyVar.f37885f;
                    if (gyVar != null) {
                        gyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f36695c, this.f36694b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f36695c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                v71 v71Var = themeActivity.f34094a;
                if (v71Var != null) {
                    v71Var.g(this.f36694b);
                    return;
                }
                return;
        }
    }
}
