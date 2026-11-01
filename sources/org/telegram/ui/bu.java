package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bu implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f36113a;
    public final SharedPreferences f36114b;
    public final int f36115c;

    public bu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.f36113a = dataSettingsActivity;
        this.f36114b = sharedPreferences;
        this.f36115c = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.f36113a;
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
            this.f36114b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.U = true;
        }
        fg.j jVar = dataSettingsActivity.f33318a;
        if (jVar != null) {
            jVar.g(this.f36115c);
        }
    }
}
