package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class NotificationsCustomSettingsActivity$$ExternalSyntheticLambda17 implements DialogsActivity.DialogsActivityDelegate, AlertDialog.OnButtonClickListener, ProfileNotificationsActivity.ProfileNotificationsActivityDelegate {
    public final NotificationsCustomSettingsActivity f$0;

    public NotificationsCustomSettingsActivity$$ExternalSyntheticLambda17(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f$0 = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f$0;
        notificationsCustomSettingsActivity.exceptions.add(0, notificationException);
        notificationsCustomSettingsActivity.updateRows(true);
    }

    @Override
    public void didRemoveException() {
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f$0;
        notificationsCustomSettingsActivity.getClass();
        int i3 = 0;
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (notificationsCustomSettingsActivity.currentType != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            bundle.putBoolean("exception", true);
            ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            profileNotificationsActivity.delegate = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda17(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(profileNotificationsActivity, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.autoExceptions;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((NotificationsSettingsActivity.NotificationException) it.next()).did == j) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.exceptions;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((NotificationsSettingsActivity.NotificationException) it2.next()).did == j) {
                    it2.remove();
                }
            }
        }
        NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
        notificationException.did = j;
        notificationException.story = true;
        Boolean bool = notificationsCustomSettingsActivity.storiesEnabled;
        if (bool != null && bool.booleanValue()) {
            i3 = Integer.MAX_VALUE;
        }
        notificationException.notify = i3;
        if (notificationsCustomSettingsActivity.exceptions == null) {
            notificationsCustomSettingsActivity.exceptions = new ArrayList();
        }
        notificationsCustomSettingsActivity.exceptions.add(notificationException);
        notificationsCustomSettingsActivity.updateRows(true);
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f$0;
        SharedPreferences.Editor editorEdit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.exceptions.size();
        for (int i2 = 0; i2 < size; i2++) {
            NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) notificationsCustomSettingsActivity.exceptions.get(i2);
            if (notificationsCustomSettingsActivity.currentType == 3) {
                editorEdit.remove("stories_" + notificationException.did);
            } else {
                editorEdit.remove("notify2_" + notificationException.did).remove("custom_" + notificationException.did);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(notificationException.did, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.get(notificationException.did);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        editorEdit.commit();
        int size2 = notificationsCustomSettingsActivity.exceptions.size();
        for (int i3 = 0; i3 < size2; i3++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((NotificationsSettingsActivity.NotificationException) notificationsCustomSettingsActivity.exceptions.get(i3)).did, 0, false);
        }
        notificationsCustomSettingsActivity.exceptions.clear();
        notificationsCustomSettingsActivity.exceptionsDict.clear();
        notificationsCustomSettingsActivity.updateRows(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }
}
