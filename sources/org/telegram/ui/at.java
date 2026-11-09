package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class at implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f43776a;
    public final SharedPreferences f43777b;
    public final int f43778c;

    public at(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.f43776a = dataSettingsActivity;
        this.f43777b = sharedPreferences;
        this.f43778c = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.f43776a;
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
            this.f43777b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.U = true;
        }
        l4 l4Var = dataSettingsActivity.f41221a;
        if (l4Var != null) {
            l4Var.g(this.f43778c);
        }
    }
}
