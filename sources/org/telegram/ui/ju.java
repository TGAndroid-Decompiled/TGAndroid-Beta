package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ju implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f34508a;
    public final SharedPreferences f34509b;
    public final int f34510c;

    public ju(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f34508a = dataSettingsActivity;
        this.f34509b = sharedPreferences;
        this.f34510c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f34508a;
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
            this.f34509b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        ku kuVar = dataSettingsActivity.f30750a;
        if (kuVar != null) {
            kuVar.m(this.f34510c);
        }
    }
}
