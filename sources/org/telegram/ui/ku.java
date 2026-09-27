package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ku implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f35154a;
    public final SharedPreferences f35155b;
    public final int f35156c;

    public ku(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f35154a = dataSettingsActivity;
        this.f35155b = sharedPreferences;
        this.f35156c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f35154a;
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
            this.f35155b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        lu luVar = dataSettingsActivity.f31067a;
        if (luVar != null) {
            luVar.m(this.f35156c);
        }
    }
}
