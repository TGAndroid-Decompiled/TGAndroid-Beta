package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ku implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f35814a;
    public final SharedPreferences f35815b;
    public final int f35816c;

    public ku(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f35814a = dataSettingsActivity;
        this.f35815b = sharedPreferences;
        this.f35816c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f35814a;
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
            this.f35815b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.S = true;
        }
        lu luVar = dataSettingsActivity.f31577a;
        if (luVar != null) {
            luVar.m(this.f35816c);
        }
    }
}
