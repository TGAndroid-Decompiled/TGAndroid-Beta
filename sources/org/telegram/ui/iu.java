package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class iu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f34577a;
    public final SharedPreferences f34578b;
    public final int f34579c;

    public iu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f34577a = dataSettingsActivity;
        this.f34578b = sharedPreferences;
        this.f34579c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f34577a;
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
            this.f34578b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        ju juVar = dataSettingsActivity.f31065a;
        if (juVar != null) {
            juVar.m(this.f34579c);
        }
    }
}
