package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class mu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f35805a;
    public final SharedPreferences f35806b;
    public final int f35807c;

    public mu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f35805a = dataSettingsActivity;
        this.f35806b = sharedPreferences;
        this.f35807c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f35805a;
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
            this.f35806b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        nu nuVar = dataSettingsActivity.f30779a;
        if (nuVar != null) {
            nuVar.m(this.f35807c);
        }
    }
}
