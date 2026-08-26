package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.collection.LongSparseArray;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.PhotoUtilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Storage.CacheModel;

public final class ChatActivity$$ExternalSyntheticLambda102 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda102(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        MediaMetadataRetriever mediaMetadataRetriever;
        String strExtractMetadata;
        MediaMetadataRetriever mediaMetadataRetriever2;
        boolean z;
        TLRPC.Document document;
        char c;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        int size;
        int i;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int size2;
        int i2;
        TLObject tLObject;
        long peerId;
        TLRPC.ChannelParticipant channelParticipant;
        int i3 = 17;
        String strExtractMetadata2 = "";
        int i4 = 27;
        int i5 = 2;
        boolean z2 = false;
        int i6 = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj5;
                chatActivity.currentUser = ((MessagesStorage) obj3).getUser(chatActivity.currentEncryptedChat.user_id);
                ((CountDownLatch) obj4).countDown();
                return;
            case 1:
                CacheModel.FileInfo fileInfo = (CacheModel.FileInfo) obj3;
                CachedMediaLayout cachedMediaLayout = (CachedMediaLayout) obj5;
                cachedMediaLayout.getClass();
                try {
                    try {
                        mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(cachedMediaLayout.getContext(), Uri.fromFile(fileInfo.file));
                                strExtractMetadata = mediaMetadataRetriever2.extractMetadata(7);
                                try {
                                    strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(2);
                                    mediaMetadataRetriever2.release();
                                } catch (Exception e) {
                                    e = e;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    try {
                                        FileLog.e(e);
                                        if (mediaMetadataRetriever != null) {
                                            mediaMetadataRetriever.release();
                                        }
                                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(cachedMediaLayout, fileInfo, (TLRPC.TL_documentAttributeAudio) obj4, strExtractMetadata, strExtractMetadata2, 6));
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                                        if (mediaMetadataRetriever2 != null) {
                                            try {
                                                mediaMetadataRetriever2.release();
                                                break;
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                strExtractMetadata = "";
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (mediaMetadataRetriever2 != null) {
                                mediaMetadataRetriever2.release();
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    strExtractMetadata = "";
                    mediaMetadataRetriever = null;
                } catch (Throwable th3) {
                    th = th3;
                    mediaMetadataRetriever = null;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    if (mediaMetadataRetriever2 != null) {
                        mediaMetadataRetriever2.release();
                        break;
                    }
                    throw th;
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(cachedMediaLayout, fileInfo, (TLRPC.TL_documentAttributeAudio) obj4, strExtractMetadata, strExtractMetadata2, 6));
                return;
            case 2:
                CalendarActivity.this.finishFragment();
                ((ChatActivity) obj5).jumpToDate(((CalendarActivity.PeriodDay) obj4).date);
                return;
            case 3:
                ((CallLogActivity) obj5).lambda$getCalls$20((TLObject) obj4, (TLRPC.TL_error) obj3);
                return;
            case 4:
                AndroidUtilities.addToClipboard(((String[]) obj5)[0]);
                zzkn.m(R.string.LinkCopied, new BulletinFactory(((BottomSheet) obj3).topBulletinContainer, (Theme.ResourcesProvider) obj4));
                return;
            case 5:
                ChatActionCell chatActionCell = (ChatActionCell) obj5;
                chatActionCell.delegate.didOpenPremiumGift(chatActionCell, (TLRPC.TL_premiumGiftOption) obj3, (String) obj4);
                return;
            case 6:
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj3;
                themeInfo.badWallpaper = !themeInfo.createBackground((File) obj4, themeInfo.pathToWallpaper);
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(3, (ThemesHorizontalListCell) obj5, themeInfo));
                return;
            case 7:
                ((ChangeUsernameActivity) obj5).lambda$saveName$6((AlertDialog) obj3, (TLRPC.User) obj4);
                return;
            case 8:
                ((ChannelAdminLogActivity) obj5).lambda$loadAdmins$21((TLObject) obj4, (TLRPC.TL_error) obj3);
                return;
            case 9:
                ChannelColorActivity.ThemeChooser themeChooser = (ChannelColorActivity.ThemeChooser) obj5;
                themeChooser.getClass();
                TLObject tLObject2 = (TLObject) obj3;
                Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) obj4;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    themeInfo2.badWallpaper = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                HashMap map = themeChooser.loadingThemes;
                if (map.containsKey(attachFileName)) {
                    return;
                }
                map.put(attachFileName, themeInfo2);
                FileLoader.getInstance(themeInfo2.account).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 10:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    channelCreateActivity.getClass();
                    z = false;
                    channelCreateActivity.invite = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) ((TLObject) obj4)).invites.get(0);
                } else {
                    z = false;
                }
                channelCreateActivity.loadingInvite = z;
                LinkActionView linkActionView = channelCreateActivity.permanentLinkView;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = channelCreateActivity.invite;
                linkActionView.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 11:
                ((StatisticActivity) obj5).showDialog(ChannelMonetizationLayout.makeLearnSheet((Activity) obj3, (Theme.ResourcesProvider) obj4, false));
                return;
            case 12:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) obj5;
                channelMonetizationLayout.getClass();
                TLObject tLObject3 = (TLObject) obj3;
                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    Browser.openUrl((Activity) obj4, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject3).url);
                }
                AndroidUtilities.runOnUIThread(new ChannelMonetizationLayout$$ExternalSyntheticLambda3(channelMonetizationLayout, 5), 1000L);
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(i3, (ChatActivity$$ExternalSyntheticLambda155) obj4, ((ChatActivity) obj5).getMessagesStorage().getUser(((TLRPC.TL_contact) obj3).user_id)));
                return;
            case 14:
                ((ChatActivity) obj5).lambda$updateTopPanel$239((TLRPC.User) obj3, (TLRPC.EmojiStatus) obj4);
                return;
            case 15:
                ChatActivity chatActivity2 = (ChatActivity) obj5;
                chatActivity2.getClass();
                ((ScrimOptions) obj3).dismiss();
                chatActivity2.presentFragment(ProfileActivity.of(((TLRPC.User) obj4).id));
                return;
            case 16:
                ChatActivity chatActivity3 = (ChatActivity) obj5;
                chatActivity3.getClass();
                ((ItemOptions) obj3).dismiss();
                NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(chatActivity3.getParentActivity(), chatActivity3);
                newContactBottomSheet.setInitialPhoneNumber((String) obj4, false);
                newContactBottomSheet.show();
                return;
            case 17:
                ChatActivity chatActivity4 = (ChatActivity) obj5;
                Activity parentActivity = chatActivity4.getParentActivity();
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj3;
                long j = suggestedPost != null ? suggestedPost.schedule_date : 0L;
                ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda248 = new ChatActivity$$ExternalSyntheticLambda248(chatActivity4, suggestedPost, (MessageObject) obj4, 13);
                Theme.ResourcesProvider resourceProvider = chatActivity4.getResourceProvider();
                Pattern pattern = AlertsCreator.URL_PATTERN;
                AlertsCreator.createSuggestedMessageDatePickerDialog(parentActivity, j, chatActivity$$ExternalSyntheticLambda248, new AlertsCreator.ScheduleDatePickerColors(null), resourceProvider, 0).bottomSheet.show();
                return;
            case 18:
                ((ChatActivity) obj5).lambda$checkStarsNeedSheet$358((AmountUtils$Amount) obj3, (Runnable) obj4);
                return;
            case 19:
                ((ChatActivity) obj5).lambda$openAttachBotLayout$216((TLObject) obj3, (TLRPC.User) obj4);
                return;
            case 20:
                ((ChatActivity) obj5).lambda$processSelectedOption$342((TLRPC.TL_error) obj3, (TLRPC.TL_messages_editMessage) obj4);
                return;
            case 21:
                ChatActivity.ChatActivityAdapter.AnonymousClass2.C00072 c00072 = (ChatActivity.ChatActivityAdapter.AnonymousClass2.C00072) obj5;
                c00072.getClass();
                TLObject tLObject4 = (TLObject) obj3;
                MessageObject messageObject = (MessageObject) obj4;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    ChatActivity.ChatActivityAdapter.AnonymousClass2 anonymousClass2 = ChatActivity.ChatActivityAdapter.AnonymousClass2.this;
                    ChatActivity.this.getMessagesController().putUsers(tL_photos_photo.users, false);
                    ChatActivity chatActivity5 = ChatActivity.this;
                    TLRPC.User user = chatActivity5.getMessagesController().getUser(Long.valueOf(chatActivity5.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user != null) {
                        PhotoUtilities.applyPhotoToUser(messageObject.messageOwner.action.photo, user, false);
                        chatActivity5.getUserConfig().setCurrentUser(user);
                        chatActivity5.getUserConfig().saveConfig(true);
                        BulletinFactory.of(chatActivity5).createUsersBulletin(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ChatActivity$$ExternalSyntheticLambda174(c00072, i3)), null).show();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 22:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) obj5;
                chatMessageCellDelegate.getClass();
                TLRPC.User user2 = (TLRPC.User) obj4;
                if (user2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    BaseFragment baseFragment = ChatActivity.this;
                    if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment, ((ChatMessageCell) obj3).getMessageObject())) {
                        baseFragment.presentFragment(new ChatActivity(bundle));
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = (ChatActivity.ChatMessageCellDelegate) obj5;
                ChatActivity chatActivity6 = ChatActivity.this;
                if (chatActivity6.getParentActivity() == null || (document = (TLRPC.Document) obj4) == null) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 23 && ((i7 <= 28 || BuildVars.NO_SCOPED_STORAGE) && chatActivity6.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    chatActivity6.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) obj3;
                MessageObject messageObject2 = chatMessageCell == null ? null : chatMessageCell.getMessageObject();
                if (messageObject2 == null || messageObject2.messageOwner == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject2.isOutOwner();
                tL_message.id = messageObject2.getId();
                tL_message.realId = messageObject2.getRealId();
                tL_message.dialog_id = messageObject2.getDialogId();
                TLRPC.Message message = messageObject2.messageOwner;
                tL_message.peer_id = message.peer_id;
                tL_message.from_id = message.from_id;
                tL_message.date = message.date;
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                int i8 = tL_message.flags;
                tL_message.flags = i8 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i8 | 768;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MessageObject(((BaseFragment) chatActivity6).currentAccount, tL_message, false, true));
                MediaController.saveFilesFromMessages(chatActivity6.getParentActivity(), chatActivity6.getAccountInstance(), arrayList2, new PhotoViewer$$ExternalSyntheticLambda156(chatMessageCellDelegate2, 2));
                return;
            case 24:
                ((ChatActivity.ChatMessageCellDelegate) obj5).openChat((ChatMessageCell) obj3, (TLRPC.Chat) obj4, 0, false);
                return;
            case 25:
                ChatEditActivity chatEditActivity = (ChatEditActivity) obj5;
                chatEditActivity.getClass();
                if (((TLRPC.TL_error) obj3) == null) {
                    chatEditActivity.info.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) ((TLObject) obj4)).count;
                    chatEditActivity.getMessagesStorage().saveChatLinksCount(chatEditActivity.chatId, chatEditActivity.info.invitesCount);
                    chatEditActivity.updateFields(false, false);
                    return;
                }
                return;
            case 26:
                ChatLinkActivity.SearchAdapter searchAdapter = (ChatLinkActivity.SearchAdapter) obj5;
                searchAdapter.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(searchAdapter, new ArrayList(), new ArrayList(), i4));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i9 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i9];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList5 = (ArrayList) obj4;
                    if (i10 >= arrayList5.size()) {
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(searchAdapter, arrayList3, arrayList4, 27));
                        return;
                    }
                    TLRPC.Chat chat2 = (TLRPC.Chat) arrayList5.get(i10);
                    String lowerCase2 = chat2.title.toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    char c2 = 0;
                    String str = null;
                    for (int i11 = 0; i11 < i9; i11++) {
                        String str2 = strArr[i11];
                        if (lowerCase2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) {
                            c = 1;
                            c2 = 1;
                        } else {
                            String str3 = chat2.username;
                            if (str3 == null || !str3.startsWith(str2)) {
                                ArrayList<TLRPC.TL_username> arrayList6 = chat2.usernames;
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < chat2.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat2.usernames.get(i12);
                                            if (tL_username.active && tL_username.username.startsWith(str2)) {
                                                str = tL_username.username;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                }
                                c = 1;
                            } else {
                                str = chat2.username;
                            }
                            c = 1;
                            c2 = 2;
                        }
                        if (c2 != 0) {
                            if (c2 == c) {
                                arrayList4.add(AndroidUtilities.generateSearchName(chat2.title, null, str2));
                            } else {
                                arrayList4.add(AndroidUtilities.generateSearchName(zzil.m("@", str), null, "@" + str2));
                            }
                            arrayList3.add(chat2);
                            i10++;
                        }
                    }
                    i10++;
                }
                break;
            case 27:
                ChatLinkActivity.SearchAdapter searchAdapter2 = (ChatLinkActivity.SearchAdapter) obj5;
                ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                if (chatLinkActivity.searching) {
                    searchAdapter2.searchResult = (ArrayList) obj3;
                    searchAdapter2.searchResultNames = (ArrayList) obj4;
                    if (chatLinkActivity.listView.getAdapter() == chatLinkActivity.searchAdapter) {
                        chatLinkActivity.emptyView.showTextView();
                    }
                    searchAdapter2.mObservable.notifyChanged();
                    return;
                }
                return;
            case 28:
                ChatUsersActivity chatUsersActivity = (ChatUsersActivity) obj5;
                chatUsersActivity.getClass();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList7 = (ArrayList) obj3;
                    int size3 = arrayList7.size();
                    int i15 = chatUsersActivity.type;
                    if (i14 >= size3) {
                        if (i15 != 2 || chatUsersActivity.delayResults <= 0) {
                            ChatUsersActivity.ListAdapter listAdapter = chatUsersActivity.listViewAdapter;
                            chatUsersActivity.showItemsAnimated(listAdapter != null ? ChatUsersActivity.this.rowCount : 0);
                            chatUsersActivity.loadingUsers = false;
                            chatUsersActivity.firstLoaded = true;
                            ActionBarMenuItem actionBarMenuItem = chatUsersActivity.searchItem;
                            if (actionBarMenuItem != null) {
                                actionBarMenuItem.setVisibility((i15 != 0 || i13 > 5) ? 0 : 8);
                            }
                        }
                        chatUsersActivity.updateRows$4();
                        ChatUsersActivity.ListAdapter listAdapter2 = chatUsersActivity.listViewAdapter;
                        if (listAdapter2 != null) {
                            ChatActivity.AnonymousClass34 anonymousClass34 = chatUsersActivity.listView;
                            anonymousClass34.animateEmptyView = chatUsersActivity.openTransitionStarted;
                            anonymousClass34.emptyViewAnimationType = 0;
                            listAdapter2.mObservable.notifyChanged();
                            StickerEmptyView stickerEmptyView = chatUsersActivity.emptyView;
                            if (stickerEmptyView != null && ChatUsersActivity.this.rowCount == 0 && chatUsersActivity.firstLoaded) {
                                stickerEmptyView.showProgress(false, true);
                            }
                        }
                        chatUsersActivity.resumeDelayedFragmentAnimation();
                        return;
                    }
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList7.get(i14);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) ((ArrayList) obj4).get(i14);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        obj = obj3;
                        obj2 = obj4;
                    } else {
                        if (i15 == i6) {
                            chatUsersActivity.getMessagesController().processLoadedAdminsResponse(chatUsersActivity.chatId, tL_channels_channelParticipants);
                        }
                        chatUsersActivity.getMessagesController().putUsers(tL_channels_channelParticipants.users, z2);
                        chatUsersActivity.getMessagesController().putChats(tL_channels_channelParticipants.chats, z2);
                        long clientUserId = chatUsersActivity.getUserConfig().getClientUserId();
                        int i16 = chatUsersActivity.selectType;
                        if (i16 != 0) {
                            for (?? r11 = z2; r11 < tL_channels_channelParticipants.participants.size(); r11 += i6) {
                                if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(r11).peer) == clientUserId) {
                                    tL_channels_channelParticipants.participants.remove((int) r11);
                                }
                            }
                        }
                        ArrayList arrayList8 = chatUsersActivity.participants;
                        LongSparseArray longSparseArray2 = chatUsersActivity.botsMap;
                        LongSparseArray longSparseArray3 = chatUsersActivity.contactsMap;
                        LongSparseArray longSparseArray4 = chatUsersActivity.participantsMap;
                        if (i15 == i5) {
                            chatUsersActivity.delayResults--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList = chatUsersActivity.contacts;
                                longSparseArray = longSparseArray3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList = chatUsersActivity.bots;
                                longSparseArray = longSparseArray2;
                            }
                            arrayList.clear();
                            arrayList.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i = 0;
                            while (i < size) {
                                channelParticipant = tL_channels_channelParticipants.participants.get(i);
                                Object obj6 = obj3;
                                Object obj7 = obj4;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList.remove(channelParticipant);
                                } else {
                                    longSparseArray.put(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i++;
                                obj4 = obj7;
                                obj3 = obj6;
                            }
                            obj = obj3;
                            obj2 = obj4;
                            int size4 = arrayList.size() + i13;
                            if (i15 == 2) {
                                size2 = arrayList8.size();
                                i2 = 0;
                                while (i2 < size2) {
                                    tLObject = (TLObject) arrayList8.get(i2);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (longSparseArray3.get(peerId) == null || longSparseArray2.get(peerId) != null || (i16 == 1 && peerId > 0 && UserObject.isDeleted(chatUsersActivity.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList8.remove(i2);
                                            longSparseArray4.remove(peerId);
                                            i2--;
                                            size2--;
                                        }
                                    } else {
                                        arrayList8.remove(i2);
                                        i2--;
                                        size2--;
                                    }
                                    i2++;
                                }
                            }
                            if ((i15 != 0 || i15 == 3 || i15 == 2) && (chat = chatUsersActivity.currentChat) != null && chat.megagroup) {
                                chatFull = chatUsersActivity.info;
                                if (!(chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    Collections.sort(arrayList, new ChatUsersActivity$$ExternalSyntheticLambda10(chatUsersActivity, chatUsersActivity.getConnectionsManager().getCurrentTime(), 0));
                                } else if (i15 == 1) {
                                    try {
                                        try {
                                            Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(8));
                                        } catch (Exception e4) {
                                            e = e4;
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                    }
                                }
                                break;
                            } else if (i15 == 1) {
                                Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(8));
                                break;
                            }
                            i13 = size4;
                        } else {
                            longSparseArray4.clear();
                        }
                        longSparseArray = longSparseArray4;
                        arrayList = arrayList8;
                        arrayList.clear();
                        arrayList.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i = 0;
                        while (i < size) {
                            channelParticipant = tL_channels_channelParticipants.participants.get(i);
                            Object obj8 = obj3;
                            Object obj9 = obj4;
                            if (channelParticipant.user_id == clientUserId) {
                                arrayList.remove(channelParticipant);
                            } else {
                                longSparseArray.put(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                            }
                            i++;
                            obj4 = obj9;
                            obj3 = obj8;
                        }
                        obj = obj3;
                        obj2 = obj4;
                        int size5 = arrayList.size() + i13;
                        if (i15 == 2) {
                            size2 = arrayList8.size();
                            i2 = 0;
                            while (i2 < size2) {
                                tLObject = (TLObject) arrayList8.get(i2);
                                if (tLObject instanceof TLRPC.ChannelParticipant) {
                                    arrayList8.remove(i2);
                                    i2--;
                                    size2--;
                                } else {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                    if (longSparseArray3.get(peerId) == null) {
                                        arrayList8.remove(i2);
                                        longSparseArray4.remove(peerId);
                                        i2--;
                                        size2--;
                                    } else {
                                        arrayList8.remove(i2);
                                        longSparseArray4.remove(peerId);
                                        i2--;
                                        size2--;
                                    }
                                }
                                i2++;
                            }
                        }
                        if (i15 != 0) {
                            chatFull = chatUsersActivity.info;
                            if (!(chatFull instanceof TLRPC.TL_channelFull)) {
                                if (i15 == 1) {
                                    Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(8));
                                }
                            } else if (i15 == 1) {
                                Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(8));
                            }
                            i13 = size5;
                        } else {
                            chatFull = chatUsersActivity.info;
                            if (!(chatFull instanceof TLRPC.TL_channelFull)) {
                                if (i15 == 1) {
                                    Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(8));
                                }
                            } else if (i15 == 1) {
                                Collections.sort(arrayList8, new ChatActivity$$ExternalSyntheticLambda18(8));
                            }
                            i13 = size5;
                        }
                        i13 = size5;
                    }
                    i14++;
                    obj4 = obj2;
                    obj3 = obj;
                    i5 = 2;
                    z2 = false;
                    i6 = 1;
                    break;
                }
                break;
            default:
                AIEditorAlert aIEditorAlert = (AIEditorAlert) obj5;
                AlertsCreator.createScheduleDatePickerDialog((Context) obj3, aIEditorAlert.dialogId, -1L, 0, new ChatActivity.AnonymousClass1(aIEditorAlert, 21), null, (Theme.ResourcesProvider) obj4);
                return;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda102(CalendarActivity.MonthView.AnonymousClass2 anonymousClass2, ChatActivity chatActivity, CalendarActivity.PeriodDay periodDay) {
        this.$r8$classId = 2;
        this.f$1 = anonymousClass2;
        this.f$0 = chatActivity;
        this.f$2 = periodDay;
    }
}
