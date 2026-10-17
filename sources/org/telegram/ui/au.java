package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class au implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f35492a;
    public final SharedPreferences f35493b;
    public final int f35494c;

    public au(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f35492a = dataSettingsActivity;
        this.f35493b = sharedPreferences;
        this.f35494c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f35492a;
        dataSettingsActivity.getClass();
        if (i10 != 0) {
            i11 = 3;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = -1;
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 1;
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 != -1) {
            this.f35493b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        bu buVar = dataSettingsActivity.f33108a;
        if (buVar != null) {
            buVar.m(this.f35494c);
        }
    }
}
