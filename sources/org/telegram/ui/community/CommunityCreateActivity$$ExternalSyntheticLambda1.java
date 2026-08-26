package org.telegram.ui.community;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;

public final class CommunityCreateActivity$$ExternalSyntheticLambda1 implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final CommunityCreateActivity f$0;

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$8((UItem) obj);
    }

    @Override
    public void run(String str) {
        CommunityCreateActivity communityCreateActivity = this.f$0;
        communityCreateActivity.getMessagesController().getChat(Long.valueOf(-communityCreateActivity.dialogId));
        communityCreateActivity.showDialog(new CommunityAddOptionsSheet(communityCreateActivity.getContext(), null, communityCreateActivity.dialogId, new GiftSheet$$ExternalSyntheticLambda4(29, communityCreateActivity, str)));
    }
}
