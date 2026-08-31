package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class lu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f38861a;
    public final SharedPreferences f38862b;
    public final int f38863c;

    public lu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f38861a = dataSettingsActivity;
        this.f38862b = sharedPreferences;
        this.f38863c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f38861a;
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
            this.f38862b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.S = true;
        }
        mu muVar = dataSettingsActivity.f34095a;
        if (muVar != null) {
            muVar.m(this.f38863c);
        }
    }
}
