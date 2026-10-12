package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ou implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f40771a;
    public final SharedPreferences f40772b;
    public final int f40773c;

    public ou(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f40771a = dataSettingsActivity;
        this.f40772b = sharedPreferences;
        this.f40773c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f40771a;
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
            this.f40772b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        pu puVar = dataSettingsActivity.f33575a;
        if (puVar != null) {
            puVar.m(this.f40773c);
        }
    }
}
