package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

public final class DataSettingsActivity$$ExternalSyntheticLambda4 implements DialogInterface.OnClickListener {
    public final DataSettingsActivity f$0;
    public final SharedPreferences f$1;
    public final int f$2;

    public DataSettingsActivity$$ExternalSyntheticLambda4(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i) {
        this.f$0 = dataSettingsActivity;
        this.f$1 = sharedPreferences;
        this.f$2 = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        DataSettingsActivity dataSettingsActivity = this.f$0;
        dataSettingsActivity.getClass();
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                if (i != 2) {
                    i2 = i != 3 ? -1 : 2;
                } else {
                    i2 = 1;
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 != -1) {
            this.f$1.edit().putInt("VoipDataSaving", i2).commit();
            dataSettingsActivity.updateVoipUseLessData = true;
        }
        DataSettingsActivity.ListAdapter listAdapter = dataSettingsActivity.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.f$2);
        }
    }
}
