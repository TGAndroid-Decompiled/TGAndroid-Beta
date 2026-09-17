package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class nu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39046a;
    public final SharedPreferences f39047b;
    public final int f39048c;

    public nu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39046a = dataSettingsActivity;
        this.f39047b = sharedPreferences;
        this.f39048c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39046a;
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
            this.f39047b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        ou ouVar = dataSettingsActivity.f33412a;
        if (ouVar != null) {
            ouVar.m(this.f39048c);
        }
    }
}
