package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ku implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39451a;
    public final SharedPreferences f39452b;
    public final int f39453c;

    public ku(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39451a = dataSettingsActivity;
        this.f39452b = sharedPreferences;
        this.f39453c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39451a;
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
            this.f39452b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        lu luVar = dataSettingsActivity.f33800a;
        if (luVar != null) {
            luVar.m(this.f39453c);
        }
    }
}
