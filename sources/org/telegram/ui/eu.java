package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

public final class eu implements DialogInterface.OnClickListener {

    public final DataSettingsActivity f37841a;

    public final SharedPreferences f37842b;

    public final int f37843c;

    public eu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f37841a = dataSettingsActivity;
        this.f37842b = sharedPreferences;
        this.f37843c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f37841a;
        dataSettingsActivity.getClass();
        if (i10 != 0) {
            i11 = 3;
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = i10 != 3 ? -1 : 2;
                } else {
                    i11 = 1;
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 != -1) {
            this.f37842b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.R = true;
        }
        fu fuVar = dataSettingsActivity.f35457a;
        if (fuVar != null) {
            fuVar.m(this.f37843c);
        }
    }
}
