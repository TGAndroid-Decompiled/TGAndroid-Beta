package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class cu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f37211a;
    public final SharedPreferences f37212b;
    public final int f37213c;

    public cu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f37211a = dataSettingsActivity;
        this.f37212b = sharedPreferences;
        this.f37213c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f37211a;
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
            this.f37212b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.R = true;
        }
        du duVar = dataSettingsActivity.f35521a;
        if (duVar != null) {
            duVar.m(this.f37213c);
        }
    }
}
