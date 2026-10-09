package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class lu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39676a;
    public final SharedPreferences f39677b;
    public final int f39678c;

    public lu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39676a = dataSettingsActivity;
        this.f39677b = sharedPreferences;
        this.f39678c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39676a;
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
            this.f39677b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        mu muVar = dataSettingsActivity.f33738a;
        if (muVar != null) {
            muVar.m(this.f39678c);
        }
    }
}
