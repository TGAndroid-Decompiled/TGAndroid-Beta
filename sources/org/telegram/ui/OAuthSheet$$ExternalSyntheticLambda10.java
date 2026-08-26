package org.telegram.ui;

import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;

public final class OAuthSheet$$ExternalSyntheticLambda10 implements Comparator {
    public final int $r8$classId;

    public OAuthSheet$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return OAuthSheet.lambda$handle$1((Integer) obj, (Integer) obj2);
            case 1:
                return DataUsage2Activity.ListView.lambda$setup$2((DataUsage2Activity.ListView.Size) obj, (DataUsage2Activity.ListView.Size) obj2);
            case 2:
                return ProfileActivity.AnonymousClass7.lambda$$1((View) obj, (View) obj2);
            case 3:
                return CacheControlActivity.lambda$sort$9((CacheControlActivity.DialogFileEntities) obj, (CacheControlActivity.DialogFileEntities) obj2);
            case 4:
                return CacheControlActivity.lambda$updateRows$10((CacheControlActivity.ItemInner) obj, (CacheControlActivity.ItemInner) obj2);
            case 5:
                return ChatActivity.lambda$updateFilteredMessages$85((MessageObject) obj, (MessageObject) obj2);
            case 6:
                return ChatActivity.lambda$updateFilteredMessages$86((MessageObject) obj, (MessageObject) obj2);
            case 7:
                return ChatActivity.lambda$didReceivedNotification5$186((Integer) obj, (Integer) obj2);
            case 8:
                return ChatActivity.lambda$checkGroupMessagesOrder$407((MessageObject) obj, (MessageObject) obj2);
            case 9:
                return ChatUsersActivity.lambda$sortAdmins$8((TLObject) obj, (TLObject) obj2);
            case 10:
                return ChatUsersActivity.lambda$onOwnerChaged$9((TLObject) obj, (TLObject) obj2);
            case 11:
                return DataAutoDownloadActivity.lambda$fillPresets$5((DownloadController.Preset) obj, (DownloadController.Preset) obj2);
            case 12:
                return DialogsActivity.lambda$openAccountSelector$175((Integer) obj, (Integer) obj2);
            case 13:
                return InviteContactsActivity.lambda$fetchContacts$4((ContactsController.Contact) obj, (ContactsController.Contact) obj2);
            case 14:
                return MainTabsActivity.lambda$openAccountSelector$8((Integer) obj, (Integer) obj2);
            case 15:
                return ((String) obj).compareTo((String) obj2);
            case 16:
                return PhotoViewer.lambda$onPhotoShow$131((MessageObject) obj, (MessageObject) obj2);
            case 17:
                return SettingsActivity.lambda$fillItems$6((Integer) obj, (Integer) obj2);
            case 18:
                return ThemeActivity.lambda$updateRows$0((Theme.ThemeInfo) obj, (Theme.ThemeInfo) obj2);
            case 19:
                return UserInfoActivity.lambda$updateAccounts$0((Integer) obj, (Integer) obj2);
            default:
                return WearAuthSheet.lambda$show$0((Integer) obj, (Integer) obj2);
        }
    }
}
