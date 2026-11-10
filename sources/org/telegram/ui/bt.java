package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class bt implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f44126a;
    public final SharedPreferences f44127b;
    public final int f44128c;

    public bt(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f44126a = dataSettingsActivity;
        this.f44127b = sharedPreferences;
        this.f44128c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f44126a;
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
            this.f44127b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.U = true;
        }
        l4 l4Var = dataSettingsActivity.f41212a;
        if (l4Var != null) {
            l4Var.g(this.f44128c);
        }
    }
}
