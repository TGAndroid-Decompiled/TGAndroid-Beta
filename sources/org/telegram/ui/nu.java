package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class nu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39019a;
    public final SharedPreferences f39020b;
    public final int f39021c;

    public nu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39019a = dataSettingsActivity;
        this.f39020b = sharedPreferences;
        this.f39021c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39019a;
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
            this.f39020b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        ou ouVar = dataSettingsActivity.f33385a;
        if (ouVar != null) {
            ouVar.m(this.f39021c);
        }
    }
}
