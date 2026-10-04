package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class mu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f38754a;
    public final SharedPreferences f38755b;
    public final int f38756c;

    public mu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f38754a = dataSettingsActivity;
        this.f38755b = sharedPreferences;
        this.f38756c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f38754a;
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
            this.f38755b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        nu nuVar = dataSettingsActivity.f33728a;
        if (nuVar != null) {
            nuVar.m(this.f38756c);
        }
    }
}
