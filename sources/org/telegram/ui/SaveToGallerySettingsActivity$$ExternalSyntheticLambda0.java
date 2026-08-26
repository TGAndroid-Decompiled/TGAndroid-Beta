package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.RecyclerListView;

public final class SaveToGallerySettingsActivity$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListenerExtended, DialogsActivity.DialogsActivityDelegate {
    public final SaveToGallerySettingsActivity f$0;

    public SaveToGallerySettingsActivity$$ExternalSyntheticLambda0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f$0 = saveToGallerySettingsActivity;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f$0;
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        bundle.putInt("type", saveToGallerySettingsActivity.type);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f$0;
        if (i == saveToGallerySettingsActivity.savePhotosRow) {
            SaveToGallerySettingsHelper.Settings settings = saveToGallerySettingsActivity.getSettings();
            settings.savePhoto = !settings.savePhoto;
            saveToGallerySettingsActivity.onSettingsUpdated();
            saveToGallerySettingsActivity.updateRows$28();
            return;
        }
        if (i == saveToGallerySettingsActivity.saveVideosRow) {
            SaveToGallerySettingsHelper.Settings settings2 = saveToGallerySettingsActivity.getSettings();
            settings2.saveVideo = !settings2.saveVideo;
            saveToGallerySettingsActivity.onSettingsUpdated();
            saveToGallerySettingsActivity.updateRows$28();
            return;
        }
        ArrayList arrayList = saveToGallerySettingsActivity.items;
        if (((SaveToGallerySettingsActivity.Item) arrayList.get(i)).viewType != 1) {
            if (((SaveToGallerySettingsActivity.Item) arrayList.get(i)).viewType == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((SaveToGallerySettingsActivity.Item) arrayList.get(i)).exception.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.type);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (((SaveToGallerySettingsActivity.Item) arrayList.get(i)).viewType == 4) {
                AlertDialog alertDialog = AlertsCreator.createSimpleAlert(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ProfileActivity$9$$ExternalSyntheticLambda1(saveToGallerySettingsActivity, 8), null).alertDialog;
                alertDialog.show();
                alertDialog.redPositive();
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        int i2 = saveToGallerySettingsActivity.type;
        if (i2 == 2) {
            bundle2.putInt("dialogsType", 6);
        } else if (i2 == 4) {
            bundle2.putInt("dialogsType", 5);
        } else {
            bundle2.putInt("dialogsType", 4);
        }
        bundle2.putBoolean("allowGlobalSearch", false);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle2);
        dialogsActivity.delegate = new SaveToGallerySettingsActivity$$ExternalSyntheticLambda0(saveToGallerySettingsActivity);
        saveToGallerySettingsActivity.presentFragment(dialogsActivity);
    }

    @Override
    public void onLongClickRelease() {
    }

    @Override
    public void onMove(float f) {
    }

    @Override
    public boolean mo1082onItemClick(View view, int i, float f, float f2) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f$0;
        ArrayList arrayList = saveToGallerySettingsActivity.items;
        if (((SaveToGallerySettingsActivity.Item) arrayList.get(i)).viewType != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = ((SaveToGallerySettingsActivity.Item) arrayList.get(i)).exception;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity());
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i2 = Theme.key_text_RedRegular;
        int color = Theme.getColor(null, i2, false);
        int color2 = Theme.getColor(null, i2, false);
        actionBarMenuSubItemAddItem2.setTextColor(color);
        actionBarMenuSubItemAddItem2.setIconColor(color2);
        ActionBarPopupWindow actionBarPopupWindowCreateSimplePopup = AlertsCreator.createSimplePopup(saveToGallerySettingsActivity, actionBarPopupWindowLayout, view, f, f2);
        actionBarPopupWindowLayout.setParentWindow(actionBarPopupWindowCreateSimplePopup);
        actionBarMenuSubItemAddItem.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(saveToGallerySettingsActivity, actionBarPopupWindowCreateSimplePopup, i, 18));
        actionBarMenuSubItemAddItem2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(saveToGallerySettingsActivity, actionBarPopupWindowCreateSimplePopup, dialogException, 11));
        return true;
    }
}
