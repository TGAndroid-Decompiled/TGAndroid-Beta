package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class nu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f35337a;
    public final SharedPreferences f35338b;
    public final int f35339c;

    public nu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f35337a = dataSettingsActivity;
        this.f35338b = sharedPreferences;
        this.f35339c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f35337a;
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
            this.f35338b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        pu puVar = dataSettingsActivity.f29892a;
        if (puVar != null) {
            puVar.m(this.f35339c);
        }
    }
}
