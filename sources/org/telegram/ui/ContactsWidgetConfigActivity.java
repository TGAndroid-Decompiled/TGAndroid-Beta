package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.INavigationLayout;

public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    private int creatingAppWidgetId = 0;

    public void lambda$handleIntent$0(ArrayList arrayList) {
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.creatingAppWidgetId);
        setResult(-1, intent);
        finish();
    }

    @Override
    public boolean handleIntent(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) {
        if (!checkPasscode(intent, z, z2, z3, i, i2)) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.creatingAppWidgetId = extras.getInt("appWidgetId", 0);
        }
        if (this.creatingAppWidgetId == 0) {
            finish();
            return true;
        }
        TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 10, true).putBoolean("allowSwitchAccount", true);
        EditWidgetActivity editWidgetActivity = new EditWidgetActivity(1, this.creatingAppWidgetId);
        editWidgetActivity.setDelegate(new BoostsActivity$$ExternalSyntheticLambda4(this, 14));
        if (AndroidUtilities.isTablet()) {
            if (((ActionBarLayout) this.layersActionBarLayout).getFragmentStack().isEmpty()) {
                INavigationLayout iNavigationLayout = this.layersActionBarLayout;
                iNavigationLayout.getClass();
                ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, editWidgetActivity);
            }
        } else if (((ActionBarLayout) this.actionBarLayout).getFragmentStack().isEmpty()) {
            INavigationLayout iNavigationLayout2 = this.actionBarLayout;
            iNavigationLayout2.getClass();
            ((ActionBarLayout) iNavigationLayout2).addFragmentToStack(-1, editWidgetActivity);
        }
        if (!AndroidUtilities.isTablet()) {
            this.backgroundTablet.setVisibility(8);
        }
        ((ActionBarLayout) this.actionBarLayout).showLastFragment();
        if (AndroidUtilities.isTablet()) {
            ((ActionBarLayout) this.layersActionBarLayout).showLastFragment();
        }
        intent.setAction(null);
        return true;
    }
}
