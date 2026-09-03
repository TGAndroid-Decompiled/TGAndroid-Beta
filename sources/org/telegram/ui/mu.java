package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class mu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36201a;
    public final SharedPreferences f36202b;
    public final int f36203c;

    public mu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36201a = dataSettingsActivity;
        this.f36202b = sharedPreferences;
        this.f36203c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36201a;
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
            this.f36202b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.S = true;
        }
        nu nuVar = dataSettingsActivity.f31551a;
        if (nuVar != null) {
            nuVar.m(this.f36203c);
        }
    }
}
