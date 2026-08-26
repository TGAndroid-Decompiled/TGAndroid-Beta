package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.RendererCapabilities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class ChatUsersActivity$$ExternalSyntheticLambda11 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final long f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Serializable f$6;

    public ChatUsersActivity$$ExternalSyntheticLambda11(int i, long j, Activity activity, ArrayList arrayList, HashMap map, Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        this.f$2 = i;
        this.f$0 = arrayList;
        this.f$1 = j;
        this.f$3 = activity;
        this.f$4 = resourcesProvider;
        this.f$5 = callback;
        this.f$6 = map;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                final ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
                chatUsersActivity.getClass();
                final int iIntValue = ((Integer) obj).intValue();
                boolean z = true;
                final boolean[] zArr = new boolean[1];
                TLObject tLObject = (TLObject) this.f$3;
                if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z = false;
                }
                long j = chatUsersActivity.chatId;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chatUsersActivity.defaultBannedRights;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.f$5;
                String str = (String) this.f$6;
                final long j2 = this.f$1;
                ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j2, j, (TLRPC.TL_chatAdminRights) this.f$4, tL_chatBannedRights, tL_chatBannedRights2, str, iIntValue) {
                    @Override
                    public final void onTransitionAnimationEnd(boolean z2, boolean z3) {
                        if (!z2 && z3 && zArr[0]) {
                            ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                            if (BulletinFactory.canShowBulletin(chatUsersActivity2)) {
                                long j3 = j2;
                                if (j3 > 0) {
                                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                                    if (user != null) {
                                        BulletinFactory.createPromoteToAdminBulletin(chatUsersActivity2, user.first_name).show();
                                        return;
                                    }
                                    return;
                                }
                                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                                if (chat != null) {
                                    BulletinFactory.createPromoteToAdminBulletin(chatUsersActivity2, chat.title).show();
                                }
                            }
                        }
                    }
                };
                final int i = this.f$2;
                final boolean z2 = z;
                chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                    @Override
                    public final void didChangeOwner(TLRPC.User user) {
                        ChatUsersActivity.this.onOwnerChaged(user);
                    }

                    @Override
                    public final void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights3, String str2) {
                        long j3 = j2;
                        ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                        int i3 = iIntValue;
                        if (i3 != 0) {
                            if (i3 == 1 && i2 == 0) {
                                chatUsersActivity2.removeParticipants(j3);
                                return;
                            }
                            return;
                        }
                        for (int i4 = 0; i4 < chatUsersActivity2.participants.size(); i4++) {
                            ArrayList arrayList = chatUsersActivity2.participants;
                            TLObject tLObject2 = (TLObject) arrayList.get(i4);
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer) == j3) {
                                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i2 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights3;
                                    tL_channelParticipantAdmin.inviter_id = chatUsersActivity2.getUserConfig().getClientUserId();
                                    if (j3 > 0) {
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        tL_channelParticipantAdmin.peer = tL_peerUser;
                                        tL_peerUser.user_id = j3;
                                    } else {
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                                        tL_peerChannel.channel_id = -j3;
                                    }
                                    tL_channelParticipantAdmin.date = i;
                                    tL_channelParticipantAdmin.flags |= 4;
                                    tL_channelParticipantAdmin.rank = str2;
                                    arrayList.set(i4, tL_channelParticipantAdmin);
                                    break;
                                }
                            } else if (tLObject2 instanceof TLRPC.ChatParticipant) {
                                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject2;
                                TLRPC.ChatParticipant tL_chatParticipantAdmin = i2 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                                tL_chatParticipantAdmin.date = chatParticipant.date;
                                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                                int iIndexOf = chatUsersActivity2.info.participants.participants.indexOf(chatParticipant);
                                if (iIndexOf >= 0) {
                                    chatUsersActivity2.info.participants.participants.set(iIndexOf, tL_chatParticipantAdmin);
                                }
                                if (!chatUsersActivity2.loadingUsers) {
                                    chatUsersActivity2.contactsEndReached = false;
                                    chatUsersActivity2.botsEndReached = false;
                                    chatUsersActivity2.loadChatParticipants$1();
                                }
                            }
                        }
                        if (i2 != 1 || z2) {
                            return;
                        }
                        zArr[0] = true;
                    }
                };
                chatUsersActivity.presentFragment(chatRightsEditActivity);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final ArrayList arrayList = (ArrayList) this.f$0;
                final int i2 = this.f$2;
                if (zBooleanValue) {
                    SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(i2);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        Long l = (Long) obj2;
                        long jLongValue = l.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i2).getSendPaidMessagesStars(jLongValue);
                        if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i2).isUserContactBlocked(jLongValue));
                        }
                        editorM.putLong(RendererCapabilities.CC.m(jLongValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        StarsController.getInstance(i2, false).justAgreedToNotAskDialogs.put(l, Long.valueOf(System.currentTimeMillis()));
                    }
                    editorM.apply();
                }
                final Utilities.Callback callback = (Utilities.Callback) this.f$5;
                final HashMap map = (HashMap) this.f$6;
                final long j3 = this.f$1;
                final Activity activity = (Activity) this.f$3;
                final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$4;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i4 = i2;
                        long j4 = StarsController.getInstance(i4, false).getBalance().amount;
                        Utilities.Callback callback2 = callback;
                        HashMap map2 = map;
                        long j5 = j3;
                        if (j4 >= j5) {
                            callback2.run(map2);
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null) {
                            return;
                        }
                        long jLongValue2 = ((Long) arrayList.get(0)).longValue();
                        new StarsIntroActivity.StarsNeededSheet(activity2, resourcesProvider, j5, 13, DialogObject.getShortName(i4, jLongValue2), new AlertsCreator$$ExternalSyntheticLambda195(callback2, map2, 0), jLongValue2).show();
                    }
                };
                if (!StarsController.getInstance(i2, false).balanceLoaded) {
                    StarsController starsController = StarsController.getInstance(i2, false);
                    starsController.balanceLoaded = false;
                    starsController.getBalance(false, true, runnable);
                    starsController.balanceLoaded = true;
                } else {
                    runnable.run();
                }
                break;
        }
    }

    public ChatUsersActivity$$ExternalSyntheticLambda11(ChatUsersActivity chatUsersActivity, long j, int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.f$0 = chatUsersActivity;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = tLObject;
        this.f$4 = tL_chatAdminRights;
        this.f$5 = tL_chatBannedRights;
        this.f$6 = str;
    }
}
