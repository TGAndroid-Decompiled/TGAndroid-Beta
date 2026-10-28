package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class au implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f37822a;
    public final SharedPreferences f37823b;
    public final int f37824c;

    public au(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f37822a = dataSettingsActivity;
        this.f37823b = sharedPreferences;
        this.f37824c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f37822a;
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
            this.f37823b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.U = true;
        }
        bu buVar = dataSettingsActivity.f35512a;
        if (buVar != null) {
            buVar.m(this.f37824c);
        }
    }
}
