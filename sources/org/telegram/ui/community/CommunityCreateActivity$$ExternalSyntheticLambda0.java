package org.telegram.ui.community;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.UItem;

public final class CommunityCreateActivity$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final CommunityCreateActivity f$0;

    public CommunityCreateActivity$$ExternalSyntheticLambda0(CommunityCreateActivity communityCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = communityCreateActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                CommunityCreateActivity communityCreateActivity = this.f$0;
                CommunityCreateActivity.CommunityHeaderView communityHeaderView = communityCreateActivity.communityHeaderView;
                UItem uItem = new UItem(-4);
                uItem.id = 0;
                uItem.view = communityHeaderView;
                uItem.intValue = -1;
                arrayList.add(uItem);
                UItem uItemAsButton = UItem.asButton(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                uItemAsButton.accent = true;
                arrayList.add(uItemAsButton);
                arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = communityCreateActivity.joinedCommunities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = communityCreateActivity.joinedCommunities;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = communityCreateActivity.getMessagesController().getChatFull(chat.id);
                        UItem uItem2 = new UItem(32);
                        uItem2.object = chat;
                        long j = chat.id;
                        uItem2.id = (int) (j ^ (j >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            string = LocaleController.formatPluralString("Chats", arrayList4 != null ? arrayList4.size() : 0, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        uItem2.subtext = string;
                        arrayList.add(uItem2);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                CommunityCreateActivity communityCreateActivity2 = this.f$0;
                if (tL_error == null) {
                    CommunityUtils.onCommunityLinkSuccess(communityCreateActivity2, communityCreateActivity2.dialogId, 0);
                } else {
                    communityCreateActivity2.getClass();
                    BulletinFactory.of(communityCreateActivity2).showForError(false, tL_error);
                }
                break;
        }
    }
}
