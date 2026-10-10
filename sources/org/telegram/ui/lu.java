package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class lu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39720a;
    public final SharedPreferences f39721b;
    public final int f39722c;

    public lu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39720a = dataSettingsActivity;
        this.f39721b = sharedPreferences;
        this.f39722c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39720a;
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
            this.f39721b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        mu muVar = dataSettingsActivity.f33776a;
        if (muVar != null) {
            muVar.m(this.f39722c);
        }
    }
}
