package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class cu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36549a;
    public final SharedPreferences f36550b;
    public final int f36551c;

    public cu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36549a = dataSettingsActivity;
        this.f36550b = sharedPreferences;
        this.f36551c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36549a;
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
            this.f36550b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.U = true;
        }
        fg.j jVar = dataSettingsActivity.f33311a;
        if (jVar != null) {
            jVar.g(this.f36551c);
        }
    }
}
