package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FeedWidgetProvider;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.INavigationLayout;

public class FeedWidgetConfigActivity extends ExternalActionActivity {
    private int creatingAppWidgetId = 0;

    public boolean lambda$handleIntent$0(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        AccountInstance.getInstance(dialogsActivity.getCurrentAccount()).getMessagesStorage().putWidgetDialogs(this.creatingAppWidgetId, arrayList);
        SharedPreferences.Editor editorEdit = getSharedPreferences("shortcut_widget", 0).edit();
        editorEdit.putInt("account" + this.creatingAppWidgetId, dialogsActivity.getCurrentAccount());
        editorEdit.putLong("dialogId" + this.creatingAppWidgetId, ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        editorEdit.commit();
        FeedWidgetProvider.updateWidget(this, AppWidgetManager.getInstance(this), this.creatingAppWidgetId);
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.creatingAppWidgetId);
        setResult(-1, intent);
        finish();
        return true;
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
        Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 5, true);
        bundleM.putBoolean("allowSwitchAccount", true);
        bundleM.putBoolean("checkCanWrite", false);
        DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
        dialogsActivity.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 5));
        if (AndroidUtilities.isTablet()) {
            if (((ActionBarLayout) this.layersActionBarLayout).getFragmentStack().isEmpty()) {
                INavigationLayout iNavigationLayout = this.layersActionBarLayout;
                iNavigationLayout.getClass();
                ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, dialogsActivity);
            }
        } else if (((ActionBarLayout) this.actionBarLayout).getFragmentStack().isEmpty()) {
            INavigationLayout iNavigationLayout2 = this.actionBarLayout;
            iNavigationLayout2.getClass();
            ((ActionBarLayout) iNavigationLayout2).addFragmentToStack(-1, dialogsActivity);
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
