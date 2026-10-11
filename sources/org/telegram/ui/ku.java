package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ku implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f39417a;
    public final SharedPreferences f39418b;
    public final int f39419c;

    public ku(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f39417a = dataSettingsActivity;
        this.f39418b = sharedPreferences;
        this.f39419c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f39417a;
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
            this.f39418b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        lu luVar = dataSettingsActivity.f33766a;
        if (luVar != null) {
            luVar.m(this.f39419c);
        }
    }
}
