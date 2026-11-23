package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class dt implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f47033a;
    public final SharedPreferences f47034b;
    public final int f47035c;

    public dt(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f47033a = dataSettingsActivity;
        this.f47034b = sharedPreferences;
        this.f47035c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f47033a;
        dataSettingsActivity.getClass();
        if (i7 != 0) {
            i10 = 3;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        i10 = -1;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 != -1) {
            this.f47034b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.V = true;
        }
        l4 l4Var = dataSettingsActivity.f43057a;
        if (l4Var != null) {
            l4Var.g(this.f47035c);
        }
    }
}
