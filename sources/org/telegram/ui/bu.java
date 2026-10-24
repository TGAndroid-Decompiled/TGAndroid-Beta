package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36139a;
    public final SharedPreferences f36140b;
    public final int f36141c;

    public bu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36139a = dataSettingsActivity;
        this.f36140b = sharedPreferences;
        this.f36141c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36139a;
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
            this.f36140b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        cu cuVar = dataSettingsActivity.f33424a;
        if (cuVar != null) {
            cuVar.m(this.f36141c);
        }
    }
}
