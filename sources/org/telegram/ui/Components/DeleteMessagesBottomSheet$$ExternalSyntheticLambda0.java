package org.telegram.ui.Components;

import com.google.android.exoplayer2.RendererCapabilities;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final DeleteMessagesBottomSheet f$0;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda0(DeleteMessagesBottomSheet deleteMessagesBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = deleteMessagesBottomSheet;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        float f;
        boolean z;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        int size;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                DeleteMessagesBottomSheet deleteMessagesBottomSheet = this.f$0;
                if (deleteMessagesBottomSheet.messages != null) {
                    int iDp = AndroidUtilities.dp(12.0f);
                    UItem uItem = new UItem(28);
                    uItem.intValue = iDp;
                    arrayList.add(uItem);
                    String string = LocaleController.getString(R.string.DeleteAdditionalActions);
                    UItem uItem2 = new UItem(0);
                    uItem2.text = string;
                    arrayList.add(uItem2);
                    deleteMessagesBottomSheet.fillAction(arrayList, deleteMessagesBottomSheet.report);
                    boolean z2 = deleteMessagesBottomSheet.isSingleUsersMode;
                    DeleteMessagesBottomSheet.Action action = deleteMessagesBottomSheet.deleteAll;
                    if (z2) {
                        action.updateTitle();
                        int i = (deleteMessagesBottomSheet.restrictUserDeleteAllMessages ? 1 : 0) + (deleteMessagesBottomSheet.restrictUserDeleteAllReactions ? 1 : 0);
                        String str = action.title;
                        Locale locale = Locale.US;
                        String strM = RendererCapabilities.CC.m(i, "/2");
                        UItem uItem3 = new UItem(41);
                        uItem3.id = 100;
                        uItem3.text = str;
                        uItem3.animatedText = strM;
                        uItem3.setChecked(i == 2);
                        uItem3.collapsed = deleteMessagesBottomSheet.restrictUserCollapsed;
                        uItem3.clickCallback = new ItemOptions$$ExternalSyntheticLambda7(21, deleteMessagesBottomSheet, universalAdapter);
                        arrayList.add(uItem3);
                        if (!deleteMessagesBottomSheet.restrictUserCollapsed) {
                            UItem uItemAsRoundCheckbox = UItem.asRoundCheckbox(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            uItemAsRoundCheckbox.setChecked(deleteMessagesBottomSheet.restrictUserDeleteAllMessages);
                            uItemAsRoundCheckbox.pad = 1;
                            arrayList.add(uItemAsRoundCheckbox);
                            UItem uItemAsRoundCheckbox2 = UItem.asRoundCheckbox(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            uItemAsRoundCheckbox2.setChecked(deleteMessagesBottomSheet.restrictUserDeleteAllReactions);
                            uItemAsRoundCheckbox2.pad = 1;
                            arrayList.add(uItemAsRoundCheckbox2);
                        }
                    } else {
                        deleteMessagesBottomSheet.fillAction(arrayList, action);
                        deleteMessagesBottomSheet.fillAction(arrayList, deleteMessagesBottomSheet.deleteAllReactions);
                    }
                    DeleteMessagesBottomSheet.Action action2 = deleteMessagesBottomSheet.banOrRestrict;
                    deleteMessagesBottomSheet.fillAction(arrayList, action2);
                    if (!deleteMessagesBottomSheet.monoforum && action2.isPresent()) {
                        if (deleteMessagesBottomSheet.restrict) {
                            UItem uItem4 = new UItem(7);
                            uItem4.text = null;
                            arrayList.add(uItem4);
                            if (action2.isExpandable()) {
                                String pluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", action2.selectedCount, new Object[0]);
                                UItem uItem5 = new UItem(42);
                                uItem5.id = 0;
                                uItem5.animatedText = pluralString;
                                arrayList.add(uItem5);
                            } else {
                                String string2 = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                UItem uItem6 = new UItem(42);
                                uItem6.id = 0;
                                uItem6.animatedText = string2;
                                arrayList.add(uItem6);
                            }
                            String string3 = LocaleController.getString(R.string.UserRestrictionsSend);
                            UItem uItem7 = new UItem(39);
                            uItem7.id = 0;
                            uItem7.text = string3;
                            uItem7.intValue = 1;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = deleteMessagesBottomSheet.bannedRights;
                            boolean z3 = tL_chatBannedRights.send_plain;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = deleteMessagesBottomSheet.defaultBannedRights;
                            uItem7.setChecked((z3 || tL_chatBannedRights2.send_plain) ? false : true);
                            uItem7.locked = tL_chatBannedRights2.send_plain;
                            arrayList.add(uItem7);
                            int i2 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i2++;
                            }
                            String string4 = LocaleController.getString(R.string.UserRestrictionsSendMedia);
                            Locale locale2 = Locale.US;
                            f = 12.0f;
                            String strM2 = RendererCapabilities.CC.m(i2, "/10");
                            UItem uItem8 = new UItem(40);
                            uItem8.id = 1;
                            uItem8.text = string4;
                            uItem8.animatedText = strM2;
                            uItem8.setChecked(i2 > 0);
                            uItem8.locked = deleteMessagesBottomSheet.allDefaultMediaBanned$1();
                            uItem8.collapsed = deleteMessagesBottomSheet.sendMediaCollapsed;
                            uItem8.clickCallback = new WearAuthSheet$$ExternalSyntheticLambda6(deleteMessagesBottomSheet, i2, universalAdapter, 7);
                            arrayList.add(uItem8);
                            if (!deleteMessagesBottomSheet.sendMediaCollapsed) {
                                UItem uItemAsRoundCheckbox3 = UItem.asRoundCheckbox(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                uItemAsRoundCheckbox3.setChecked((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                uItemAsRoundCheckbox3.locked = tL_chatBannedRights2.send_photos;
                                uItemAsRoundCheckbox3.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox3);
                                UItem uItemAsRoundCheckbox4 = UItem.asRoundCheckbox(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                uItemAsRoundCheckbox4.setChecked((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                uItemAsRoundCheckbox4.locked = tL_chatBannedRights2.send_videos;
                                uItemAsRoundCheckbox4.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox4);
                                UItem uItemAsRoundCheckbox5 = UItem.asRoundCheckbox(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                uItemAsRoundCheckbox5.setChecked((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                uItemAsRoundCheckbox5.locked = tL_chatBannedRights2.send_docs;
                                uItemAsRoundCheckbox5.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox5);
                                UItem uItemAsRoundCheckbox6 = UItem.asRoundCheckbox(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                uItemAsRoundCheckbox6.setChecked((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                uItemAsRoundCheckbox6.locked = tL_chatBannedRights2.send_audios;
                                uItemAsRoundCheckbox6.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox6);
                                UItem uItemAsRoundCheckbox7 = UItem.asRoundCheckbox(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                uItemAsRoundCheckbox7.setChecked((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                uItemAsRoundCheckbox7.locked = tL_chatBannedRights2.send_voices;
                                uItemAsRoundCheckbox7.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox7);
                                UItem uItemAsRoundCheckbox8 = UItem.asRoundCheckbox(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                uItemAsRoundCheckbox8.setChecked((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                uItemAsRoundCheckbox8.locked = tL_chatBannedRights2.send_roundvideos;
                                uItemAsRoundCheckbox8.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox8);
                                UItem uItemAsRoundCheckbox9 = UItem.asRoundCheckbox(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                uItemAsRoundCheckbox9.setChecked((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                uItemAsRoundCheckbox9.locked = tL_chatBannedRights2.send_stickers;
                                uItemAsRoundCheckbox9.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox9);
                                UItem uItemAsRoundCheckbox10 = UItem.asRoundCheckbox(13, LocaleController.getString(R.string.SendMediaPolls));
                                uItemAsRoundCheckbox10.setChecked((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                uItemAsRoundCheckbox10.locked = tL_chatBannedRights2.send_polls;
                                uItemAsRoundCheckbox10.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox10);
                                UItem uItemAsRoundCheckbox11 = UItem.asRoundCheckbox(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                uItemAsRoundCheckbox11.setChecked((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                uItemAsRoundCheckbox11.locked = tL_chatBannedRights2.embed_links;
                                uItemAsRoundCheckbox11.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox11);
                                UItem uItemAsRoundCheckbox12 = UItem.asRoundCheckbox(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                uItemAsRoundCheckbox12.setChecked((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                uItemAsRoundCheckbox12.locked = tL_chatBannedRights2.send_reactions;
                                uItemAsRoundCheckbox12.pad = 1;
                                arrayList.add(uItemAsRoundCheckbox12);
                            }
                            String string5 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            UItem uItem9 = new UItem(39);
                            uItem9.id = 2;
                            uItem9.text = string5;
                            uItem9.intValue = 1;
                            uItem9.setChecked((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            uItem9.locked = tL_chatBannedRights2.invite_users;
                            arrayList.add(uItem9);
                            String string6 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                            UItem uItem10 = new UItem(39);
                            uItem10.id = 3;
                            uItem10.text = string6;
                            uItem10.intValue = 1;
                            uItem10.setChecked((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            uItem10.locked = tL_chatBannedRights2.pin_messages;
                            arrayList.add(uItem10);
                            String string7 = LocaleController.getString(R.string.UserRestrictionsChangeInfo);
                            UItem uItem11 = new UItem(39);
                            uItem11.id = 4;
                            uItem11.text = string7;
                            uItem11.intValue = 1;
                            uItem11.setChecked((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            uItem11.locked = tL_chatBannedRights2.change_info;
                            arrayList.add(uItem11);
                            if (deleteMessagesBottomSheet.isForum) {
                                String string8 = LocaleController.getString(R.string.CreateTopicsPermission);
                                UItem uItem12 = new UItem(39);
                                uItem12.id = 5;
                                uItem12.text = string8;
                                uItem12.intValue = 1;
                                uItem12.setChecked((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                uItem12.locked = tL_chatBannedRights2.manage_topics;
                                arrayList.add(uItem12);
                            }
                        } else {
                            f = 12.0f;
                        }
                        if (deleteMessagesBottomSheet.canRestrict) {
                            String string9 = LocaleController.getString(action2.isExpandable() ? deleteMessagesBottomSheet.restrict ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers : deleteMessagesBottomSheet.restrict ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser);
                            UItem uItem13 = new UItem(38);
                            uItem13.id = 1;
                            uItem13.animatedText = string9;
                            uItem13.collapsed = !deleteMessagesBottomSheet.restrict;
                            uItem13.accent = true;
                            arrayList.add(uItem13);
                            z = false;
                        }
                        if (deleteMessagesBottomSheet.banFromCommunityDialogId != 0) {
                            if (z) {
                                int iDp2 = AndroidUtilities.dp(f);
                                UItem uItem14 = new UItem(28);
                                uItem14.intValue = iDp2;
                                arrayList.add(uItem14);
                            }
                            String string10 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                            UItem uItem15 = new UItem(39);
                            uItem15.id = 103;
                            uItem15.text = string10;
                            uItem15.intValue = 0;
                            uItem15.setChecked(deleteMessagesBottomSheet.banFromCommunity);
                            arrayList.add(uItem15);
                            participantJoinedChats = deleteMessagesBottomSheet.banFromCommunityChats;
                            if (participantJoinedChats != null) {
                                size = participantJoinedChats.joined_chat_ids.size();
                            } else {
                                size = 1;
                            }
                            arrayList.add(UItem.asShadow(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", size, new Object[0]), new DeleteMessagesBottomSheet$$ExternalSyntheticLambda8(deleteMessagesBottomSheet, 0)), true)));
                        }
                    } else {
                        f = 12.0f;
                    }
                    z = true;
                    if (deleteMessagesBottomSheet.banFromCommunityDialogId != 0) {
                        if (z) {
                            int iDp3 = AndroidUtilities.dp(f);
                            UItem uItem16 = new UItem(28);
                            uItem16.intValue = iDp3;
                            arrayList.add(uItem16);
                        }
                        String string11 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                        UItem uItem17 = new UItem(39);
                        uItem17.id = 103;
                        uItem17.text = string11;
                        uItem17.intValue = 0;
                        uItem17.setChecked(deleteMessagesBottomSheet.banFromCommunity);
                        arrayList.add(uItem17);
                        participantJoinedChats = deleteMessagesBottomSheet.banFromCommunityChats;
                        if (participantJoinedChats != null) {
                            size = participantJoinedChats.joined_chat_ids.size();
                        } else {
                            size = 1;
                        }
                        arrayList.add(UItem.asShadow(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", size, new Object[0]), new DeleteMessagesBottomSheet$$ExternalSyntheticLambda8(deleteMessagesBottomSheet, 0)), true)));
                    }
                    break;
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                DeleteMessagesBottomSheet deleteMessagesBottomSheet2 = this.f$0;
                if (participantJoinedChats2 == null) {
                    deleteMessagesBottomSheet2.getClass();
                } else {
                    deleteMessagesBottomSheet2.banFromCommunityChats = participantJoinedChats2;
                    deleteMessagesBottomSheet2.adapter.update(true);
                }
                break;
        }
    }
}
