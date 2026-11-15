package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bt implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f45814a;
    public final SharedPreferences f45815b;
    public final int f45816c;

    public bt(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f45814a = dataSettingsActivity;
        this.f45815b = sharedPreferences;
        this.f45816c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f45814a;
        dataSettingsActivity.getClass();
        if (i7 != 0) {
            i10 = 3;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
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
            this.f45815b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.V = true;
        }
        l4 l4Var = dataSettingsActivity.f42568a;
        if (l4Var != null) {
            l4Var.g(this.f45816c);
        }
    }
}
