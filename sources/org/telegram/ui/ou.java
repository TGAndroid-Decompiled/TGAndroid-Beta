package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ou implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36428a;
    public final SharedPreferences f36429b;
    public final int f36430c;

    public ou(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36428a = dataSettingsActivity;
        this.f36429b = sharedPreferences;
        this.f36430c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36428a;
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
            this.f36429b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        pu puVar = dataSettingsActivity.f30796a;
        if (puVar != null) {
            puVar.m(this.f36430c);
        }
    }
}
