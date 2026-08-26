package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda22;
import org.telegram.ui.Stars.StarsController$PendingPaidReactions$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$$ExternalSyntheticLambda177 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;

    public PhotoViewer$$ExternalSyntheticLambda177(Object obj, long j, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    @Override
    public final void run() {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String forcedFirstName;
        int i = 2;
        int i2 = 3;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        sQLitePreparedStatementExecuteFast = null;
        int i3 = 0;
        int i4 = 1;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f$1;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    break;
                }
                photoEntry.coverSavedPosition = this.f$2;
                photoEntry.coverPath = (String) this.f$3;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.coverEditor.button.setLoading(false);
                PhotoViewer.PhotoViewerProvider photoViewerProvider = photoViewer.placeProvider;
                if (photoViewerProvider != null) {
                    photoViewerProvider.updatePhotoAtIndex(photoViewer.currentIndex);
                }
                PhotoViewer.AnonymousClass28 anonymousClass28 = photoViewer.editCoverButton;
                if (anonymousClass28 != null) {
                    anonymousClass28.setImage((Bitmap) this.f$4);
                }
                photoViewer.switchToEditMode(0);
                CheckBox checkBox = photoViewer.checkImageView;
                if (checkBox.isChecked) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 1:
                ((ConferenceCall) this.f$0).lambda$requestLastBlock$2(this.f$2, (TLObject) this.f$1, (TLRPC.TL_error) this.f$3, (Runnable) this.f$4);
                return;
            case 2:
                final ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
                ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(this.f$2, chatUsersActivity.chatId, null, chatUsersActivity.defaultBannedRights, (TLRPC.TL_chatBannedRights) this.f$1, (String) this.f$3, 1, true, false, null);
                final TLObject tLObject = (TLObject) this.f$4;
                chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                    @Override
                    public final void didChangeOwner(TLRPC.User user) {
                        ChatUsersActivity.this.onOwnerChaged(user);
                    }

                    @Override
                    public final void didSetRights(int i5, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
                        TLObject tLObject2 = tLObject;
                        if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                            channelParticipant.admin_rights = tL_chatAdminRights;
                            channelParticipant.banned_rights = tL_chatBannedRights;
                            channelParticipant.rank = str;
                            ChatUsersActivity.access$12100(ChatUsersActivity.this, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
                        }
                    }
                };
                chatUsersActivity.presentFragment(chatRightsEditActivity);
                return;
            case 3:
                final ChatUsersActivity chatUsersActivity2 = (ChatUsersActivity) this.f$0;
                ChatRightsEditActivity chatRightsEditActivity2 = new ChatRightsEditActivity(this.f$2, chatUsersActivity2.chatId, (TLRPC.TL_chatAdminRights) this.f$1, null, null, (String) this.f$3, 0, true, false, null);
                final TLObject tLObject2 = (TLObject) this.f$4;
                chatRightsEditActivity2.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                    @Override
                    public final void didChangeOwner(TLRPC.User user) {
                        ChatUsersActivity.this.onOwnerChaged(user);
                    }

                    @Override
                    public final void didSetRights(int i5, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
                        TLObject tLObject3 = tLObject2;
                        if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject3;
                            channelParticipant.admin_rights = tL_chatAdminRights;
                            channelParticipant.banned_rights = tL_chatBannedRights;
                            channelParticipant.rank = str;
                            ChatUsersActivity.access$12100(ChatUsersActivity.this, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
                        }
                    }
                };
                chatUsersActivity2.presentFragment(chatRightsEditActivity2);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.f$4;
                long j = this.f$2;
                String str = (String) this.f$3;
                DialogsBotsAdapter.PopularBots popularBots = (DialogsBotsAdapter.PopularBots) this.f$0;
                popularBots.getClass();
                SQLiteDatabase database = ((MessagesStorage) this.f$1).getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i3 < arrayList.size()) {
                            sQLitePreparedStatementExecuteFast.requery();
                            sQLitePreparedStatementExecuteFast.bindLong(1, ((Long) arrayList.get(i3)).longValue());
                            sQLitePreparedStatementExecuteFast.bindLong(2, j);
                            sQLitePreparedStatementExecuteFast.bindString(3, str);
                            sQLitePreparedStatementExecuteFast.bindInteger(4, i3);
                            sQLitePreparedStatementExecuteFast.step();
                            i3++;
                        }
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    }
                    AndroidUtilities.runOnUIThread(new DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0(popularBots, 1));
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                    throw th;
                }
            case 5:
                DialogsBotsAdapter.PopularBots popularBots2 = (DialogsBotsAdapter.PopularBots) this.f$0;
                MessagesController messagesController = MessagesController.getInstance(popularBots2.currentAccount);
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.f$1;
                messagesController.putUsers(arrayList2, true);
                popularBots2.bots.addAll(arrayList2);
                popularBots2.cacheTime = this.f$2;
                String str2 = (String) this.f$3;
                popularBots2.lastOffset = str2;
                popularBots2.endReached = TextUtils.isEmpty(str2);
                popularBots2.cacheLoaded = true;
                ((DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0) this.f$4).run();
                return;
            case 6:
                try {
                    ((AlertDialog) this.f$0).dismiss();
                    break;
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                TLObject tLObject3 = (TLObject) this.f$1;
                if (tLObject3 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject3;
                    JoinCallAlert.cachedChats = joinaspeers.peers;
                    JoinCallAlert.lastCacheDid = this.f$2;
                    JoinCallAlert.lastCacheTime = SystemClock.elapsedRealtime();
                    AccountInstance accountInstance = (AccountInstance) this.f$3;
                    JoinCallAlert.lastCachedAccount = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    ((MessagesStorage.BooleanCallback) this.f$4).run(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 7:
                GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                int i5 = 0;
                while (i5 < i) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(i5 == 1 ? LocaleController.getString(R.string.Gift2StarsCollectibleInfo) : LocaleController.formatString(R.string.Gift2StarsInfo, giftSheet.name)));
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    int i6 = 0;
                    while (true) {
                        StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$1;
                        if (i6 < giftsList.gifts.size() && hashSet.size() < i2) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) giftsList.gifts.get(i6);
                            if (savedStarGift != null && (starGift = savedStarGift.gift) != null && (document = starGift.getDocument()) != null && !hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                            i6++;
                        }
                    }
                    int size = hashSet2.size();
                    TextView textView = giftSheet.subtitleStarsView;
                    if (size > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i7 = R.string.Gift2StarsInfoProfileLink;
                        long j2 = this.f$2;
                        spannableStringBuilder2.append(LocaleController.formatString(i7, DialogObject.getShortName(j2)).replaceAll(" ", " "));
                        spannableStringBuilder2.append(" ");
                        for (Iterator it = hashSet2.iterator(); it.hasNext(); it = it) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append("\u2060e");
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document2.id, 1.2f, textView.getPaint().getFontMetricsInt());
                            animatedEmojiSpan.document = document2;
                            spannableStringBuilder2.setSpan(animatedEmojiSpan, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append(" >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new PollItemMenu$$ExternalSyntheticLambda12(giftSheet, (Utilities.Callback) this.f$3, j2, 17)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new OAuthSheet$$ExternalSyntheticLambda0((Context) this.f$4, 8)), true));
                    }
                    if (i5 != 0) {
                        textView = giftSheet.subtitleCollectiblesStarsView;
                    }
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
                    i5++;
                    i = 2;
                    i2 = 3;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                ((boolean[]) this.f$1)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(profileActivity.applyBulletin);
                int i8 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) this.f$3;
                    if (i8 >= arrayList3.size()) {
                        profileActivity.getMessagesController().getStoriesController().updateStoriesInLists(this.f$2, arrayList3, false);
                        return;
                    } else {
                        ((TL_stories.StoryItem) arrayList3.get(i8)).pinned = ((boolean[]) this.f$4)[i8];
                        i8++;
                    }
                }
                break;
            case 9:
                BotStarsController botStarsController = (BotStarsController) this.f$0;
                botStarsController.getClass();
                ((AlertDialog) this.f$1).dismiss();
                TLObject tLObject4 = (TLObject) this.f$3;
                boolean z = tLObject4 instanceof TL_payments.connectedStarRefBots;
                Utilities.Callback callback = (Utilities.Callback) this.f$4;
                if (z) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject4;
                    MessagesController.getInstance(botStarsController.currentAccount).putUsers(connectedstarrefbots.users, false);
                    for (int i9 = 0; i9 < connectedstarrefbots.connected_bots.size(); i9++) {
                        if (connectedstarrefbots.connected_bots.get(i9).bot_id == this.f$2 && !connectedstarrefbots.connected_bots.get(i9).revoked) {
                            callback.run(connectedstarrefbots.connected_bots.get(i9));
                            return;
                        }
                    }
                }
                callback.run(null);
                return;
            case 10:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                TLObject tLObject5 = (TLObject) this.f$1;
                boolean z2 = tLObject5 instanceof TLRPC.TL_messages_messages;
                Runnable runnable = (Runnable) this.f$4;
                if (!z2) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject5;
                int i10 = starsController.currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i10).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                }
                TLRPC.Message message = tL_messages_messages.messages.get(0);
                MessageObject messageObject = (MessageObject) this.f$3;
                messageObject.messageOwner = message;
                starsController.updateMediaPrice(messageObject, this.f$2, runnable, true);
                return;
            case 11:
                StarsController starsController2 = (StarsController) this.f$0;
                boolean z3 = starsController2.balanceLoaded;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$1;
                if (z3) {
                    starsController2.buyPremiumGift(callback2, this.f$2, (TLObject) this.f$3, (TLRPC.TL_textWithEntities) this.f$4);
                    return;
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    callback2.run(Boolean.FALSE, null);
                    return;
                }
            case 12:
                StarsController starsController3 = (StarsController) this.f$0;
                boolean z4 = starsController3.balanceLoaded;
                Utilities.Callback2 callback3 = (Utilities.Callback2) this.f$1;
                if (z4) {
                    starsController3.buyResellingGift((TLRPC.TL_payments_paymentFormStarGift) this.f$3, (TL_stars.TL_starGiftUnique) this.f$4, this.f$2, null, true, callback3);
                    return;
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    callback3.run(Boolean.FALSE, null);
                    return;
                }
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f$0;
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda22(profileActivity2, i3), 200L);
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(profileActivity2);
                TLRPC.Document document3 = ((TL_stars.StarGift) this.f$1).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                SpannableStringBuilder spannableStringBuilderReplaceTags = (SpannableStringBuilder) this.f$4;
                if (spannableStringBuilderReplaceTags == null) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) this.f$2, (String) this.f$3));
                }
                bulletinFactoryOf.createEmojiBulletin(document3, string, spannableStringBuilderReplaceTags).show(false);
                return;
            case 14:
                StarsController.PendingPaidReactions pendingPaidReactions = (StarsController.PendingPaidReactions) this.f$0;
                TLObject tLObject6 = (TLObject) this.f$1;
                MessagesController messagesController2 = (MessagesController) this.f$3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$4;
                long j3 = this.f$2;
                pendingPaidReactions.getClass();
                if (tLObject6 != null) {
                    Utilities.stageQueue.postRunnable(new StickersActivity$$ExternalSyntheticLambda18(11, messagesController2, tLObject6));
                    return;
                }
                if (tL_error != null) {
                    pendingPaidReactions.messageObject.addPaidReactions((int) (-pendingPaidReactions.amount), pendingPaidReactions.wasChosen, pendingPaidReactions.getPeerId());
                    NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(pendingPaidReactions.messageObject.getDialogId()), Integer.valueOf(pendingPaidReactions.messageObject.getId()), pendingPaidReactions.messageObject.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (pendingPaidReactions.message.did >= 0) {
                            forcedFirstName = UserObject.getForcedFirstName(pendingPaidReactions.chatActivity.getMessagesController().getUser(Long.valueOf(pendingPaidReactions.message.did)));
                        } else {
                            TLRPC.Chat chat = pendingPaidReactions.chatActivity.getMessagesController().getChat(Long.valueOf(-pendingPaidReactions.message.did));
                            forcedFirstName = chat == null ? "" : chat.title;
                        }
                        String str3 = forcedFirstName;
                        Context parentActivity = pendingPaidReactions.chatActivity.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.instance;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new StarsIntroActivity.StarsNeededSheet(parentActivity, pendingPaidReactions.chatActivity.getResourceProvider(), j3, 5, str3, new StarsController$PendingPaidReactions$$ExternalSyntheticLambda0(pendingPaidReactions, j3, i4), 0L).show();
                    }
                    StarsController.this.invalidateTransactions(false);
                    StarsController.this.invalidateBalance();
                    return;
                }
                return;
            default:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) this.f$0;
                LiveCommentsView$$ExternalSyntheticLambda9 liveCommentsView$$ExternalSyntheticLambda9 = starsReactionsSheet.onSendListener;
                long j4 = this.f$2;
                if (liveCommentsView$$ExternalSyntheticLambda9 == null) {
                    StarsController.PendingPaidReactions pendingPaidReactionsSendPaidReaction = ((StarsController) this.f$1).sendPaidReaction((MessageObject) this.f$3, (ChatActivity) this.f$4, j4, false, true, Long.valueOf(starsReactionsSheet.peer));
                    if (pendingPaidReactionsSendPaidReaction == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(14, starsReactionsSheet, pendingPaidReactionsSendPaidReaction));
                    return;
                }
                int iIntValue = liveCommentsView$$ExternalSyntheticLambda9.f$0.lambda$openStarsSheet$11(Long.valueOf(j4)).intValue();
                starsReactionsSheet.sentMessageId = iIntValue;
                if (iIntValue == Integer.MIN_VALUE) {
                    starsReactionsSheet.lambda$showGiftOfferSheet$15();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda11(starsReactionsSheet, i3));
                    return;
                }
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda177(Object obj, Object obj2, long j, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public PhotoViewer$$ExternalSyntheticLambda177(Object obj, Object obj2, Object obj3, long j, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = j;
        this.f$4 = obj4;
    }

    public PhotoViewer$$ExternalSyntheticLambda177(Object obj, Object obj2, Object obj3, long j, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = obj3;
        this.f$2 = j;
        this.f$3 = str;
    }

    public PhotoViewer$$ExternalSyntheticLambda177(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$2 = j;
    }
}
