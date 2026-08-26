package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarLayout;

public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public int creatingAppWidgetId = 0;

    @Override
    public final void handleIntent$1(int i, Intent intent, boolean z, boolean z2, boolean z3, int i2) {
        if (checkPasscode(i, intent, z, z2, z3, i2)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.creatingAppWidgetId = extras.getInt("appWidgetId", 0);
            }
            if (this.creatingAppWidgetId == 0) {
                finish();
                return;
            }
            TelegramMediaSession$$ExternalSyntheticOutline0.m(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            EditWidgetActivity editWidgetActivity = new EditWidgetActivity(0, this.creatingAppWidgetId);
            editWidgetActivity.delegate = new ChatActivity$$ExternalSyntheticLambda356(this, 21);
            if (AndroidUtilities.isTablet()) {
                if (this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout = this.layersActionBarLayout;
                    actionBarLayout.getClass();
                    actionBarLayout.addFragmentToStack(-1, editWidgetActivity);
                }
            } else if (this.actionBarLayout.getFragmentStack().isEmpty()) {
                ActionBarLayout actionBarLayout2 = this.actionBarLayout;
                actionBarLayout2.getClass();
                actionBarLayout2.addFragmentToStack(-1, editWidgetActivity);
            }
            if (!AndroidUtilities.isTablet()) {
                this.backgroundTablet.setVisibility(8);
            }
            this.actionBarLayout.showLastFragment();
            if (AndroidUtilities.isTablet()) {
                this.layersActionBarLayout.showLastFragment();
            }
            intent.setAction(null);
        }
    }
}
