package org.telegram.ui.community;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.UItem;

public final class CommunityEditActivity$$ExternalSyntheticLambda1 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final CommunityEditActivity f$0;

    public CommunityEditActivity$$ExternalSyntheticLambda1(CommunityEditActivity communityEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = communityEditActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                CommunityEditActivity communityEditActivity = this.f$0;
                CommunityEditActivity.CommunityHeaderView communityHeaderView = communityEditActivity.communityHeaderView;
                UItem uItem = new UItem(-4);
                uItem.id = 140;
                uItem.view = communityHeaderView;
                uItem.intValue = -1;
                arrayList2.add(uItem);
                int i = 0;
                if (ChatObject.canUserDoAdminAction(communityEditActivity.currentChat, 1)) {
                    UItem uItemAsButton = UItem.asButton(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(communityEditActivity.currentChat) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    uItemAsButton.accent = true;
                    arrayList2.add(uItemAsButton);
                    arrayList2.add(UItem.asSpace(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(UItem.asHeader(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(UItem.asCustom(7, communityEditActivity.editTextCell));
                    arrayList2.add(UItem.asSpace(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(communityEditActivity.currentChat)) {
                    arrayList2.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    String string = LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers);
                    String string2 = LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo);
                    UItem uItem2 = new UItem(44);
                    uItem2.id = 150;
                    uItem2.text = string;
                    uItem2.textValue = string2;
                    uItem2.setChecked(communityEditActivity.canAllManageLinkedPeers);
                    arrayList2.add(uItem2);
                    String string3 = LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins);
                    String string4 = LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo);
                    UItem uItem3 = new UItem(44);
                    uItem3.id = 151;
                    uItem3.text = string3;
                    uItem3.textValue = string4;
                    uItem3.setChecked(!communityEditActivity.canAllManageLinkedPeers);
                    arrayList2.add(uItem3);
                    arrayList2.add(UItem.asSpace(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(communityEditActivity.currentChat)) {
                    int i2 = R.drawable.msg_admins;
                    String string5 = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = communityEditActivity.info;
                    arrayList2.add(UItem.asButton(142, i2, string5, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i3 = R.drawable.community_requests_outline_24;
                    String string6 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = communityEditActivity.info;
                    arrayList2.add(UItem.asButton(143, i3, string6, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i4 = R.drawable.msg_user_remove;
                    String string7 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = communityEditActivity.info;
                    arrayList2.add(UItem.asButton(144, i4, string7, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(UItem.asSpace(5, AndroidUtilities.dp(14.0f)));
                UItem uItemAsButton2 = UItem.asButton(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                uItemAsButton2.accent = true;
                arrayList2.add(uItemAsButton2);
                TLRPC.ChatFull chatFull4 = communityEditActivity.info;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i);
                        i++;
                        TLObject userOrChat = communityEditActivity.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer));
                        UItem uItem4 = new UItem(32);
                        uItem4.object = userOrChat;
                        arrayList2.add(uItem4);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                CommunityEditActivity communityEditActivity2 = this.f$0;
                communityEditActivity2.getClass();
                if (tL_error != null) {
                    BulletinFactory.of(communityEditActivity2).showForError(false, tL_error);
                }
                break;
        }
    }
}
