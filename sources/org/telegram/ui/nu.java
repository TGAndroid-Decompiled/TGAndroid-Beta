package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class nu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36127a;
    public final SharedPreferences f36128b;
    public final int f36129c;

    public nu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36127a = dataSettingsActivity;
        this.f36128b = sharedPreferences;
        this.f36129c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36127a;
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
            this.f36128b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        ou ouVar = dataSettingsActivity.f31063a;
        if (ouVar != null) {
            ouVar.m(this.f36129c);
        }
    }
}
