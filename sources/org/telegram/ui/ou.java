package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ou implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36423a;
    public final SharedPreferences f36424b;
    public final int f36425c;

    public ou(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36423a = dataSettingsActivity;
        this.f36424b = sharedPreferences;
        this.f36425c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36423a;
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
            this.f36424b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        pu puVar = dataSettingsActivity.f30793a;
        if (puVar != null) {
            puVar.m(this.f36425c);
        }
    }
}
