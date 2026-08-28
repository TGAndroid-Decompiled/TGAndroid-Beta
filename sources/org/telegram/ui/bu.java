package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36975a;
    public final SharedPreferences f36976b;
    public final int f36977c;

    public bu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i9) {
        this.f36975a = dataSettingsActivity;
        this.f36976b = sharedPreferences;
        this.f36977c = i9;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f36975a;
        dataSettingsActivity.getClass();
        if (i9 != 0) {
            i10 = 3;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        i10 = -1;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 != -1) {
            this.f36976b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.R = true;
        }
        cu cuVar = dataSettingsActivity.f35454a;
        if (cuVar != null) {
            cuVar.m(this.f36977c);
        }
    }
}
