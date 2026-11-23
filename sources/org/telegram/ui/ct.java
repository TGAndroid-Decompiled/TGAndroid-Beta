package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class ct implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f46866a;
    public final SharedPreferences f46867b;
    public final int f46868c;

    public ct(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f46866a = dataSettingsActivity;
        this.f46867b = sharedPreferences;
        this.f46868c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f46866a;
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
            this.f46867b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.V = true;
        }
        l4 l4Var = dataSettingsActivity.f43132a;
        if (l4Var != null) {
            l4Var.g(this.f46868c);
        }
    }
}
