package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class iu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f34563a;
    public final SharedPreferences f34564b;
    public final int f34565c;

    public iu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f34563a = dataSettingsActivity;
        this.f34564b = sharedPreferences;
        this.f34565c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f34563a;
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
            this.f34564b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        ju juVar = dataSettingsActivity.f31051a;
        if (juVar != null) {
            juVar.m(this.f34565c);
        }
    }
}
