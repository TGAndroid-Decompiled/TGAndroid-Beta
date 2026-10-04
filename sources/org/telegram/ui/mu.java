package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class mu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f38760a;
    public final SharedPreferences f38761b;
    public final int f38762c;

    public mu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f38760a = dataSettingsActivity;
        this.f38761b = sharedPreferences;
        this.f38762c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f38760a;
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
            this.f38761b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        nu nuVar = dataSettingsActivity.f33735a;
        if (nuVar != null) {
            nuVar.m(this.f38762c);
        }
    }
}
