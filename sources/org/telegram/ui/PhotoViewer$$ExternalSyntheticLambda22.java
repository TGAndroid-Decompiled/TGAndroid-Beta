package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda18;
import org.telegram.ui.Stars.StarsController$PendingPaidReactions$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;

    public PhotoViewer$$ExternalSyntheticLambda22(Object obj, long j, Object obj2, Object obj3, Object obj4, int i) {
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
        int i = 1;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$24((MediaController.PhotoEntry) this.f$1, this.f$2, (String) this.f$3, (Bitmap) this.f$4);
                break;
            case 1:
                ((ConferenceCall) this.f$0).lambda$requestLastBlock$2(this.f$2, (TLObject) this.f$1, (TLRPC.TL_error) this.f$3, (Runnable) this.f$4);
                break;
            case 2:
                ((ChatUsersActivity) this.f$0).lambda$createMenuForParticipant$15(this.f$2, (TLRPC.TL_chatBannedRights) this.f$1, (String) this.f$3, (TLObject) this.f$4);
                break;
            case 3:
                ((ChatUsersActivity) this.f$0).lambda$createMenuForParticipant$19(this.f$2, (TLRPC.TL_chatAdminRights) this.f$1, (String) this.f$3, (TLObject) this.f$4);
                break;
            case 4:
                ((DialogsBotsAdapter.PopularBots) this.f$0).lambda$saveCache$3((MessagesStorage) this.f$1, (ArrayList) this.f$4, this.f$2, (String) this.f$3);
                break;
            case 5:
                ((DialogsBotsAdapter.PopularBots) this.f$0).lambda$loadCache$0((ArrayList) this.f$1, this.f$2, (String) this.f$3, (Runnable) this.f$4);
                break;
            case 6:
                JoinCallAlert.lambda$checkFewUsers$0((AlertDialog) this.f$0, (TLObject) this.f$1, this.f$2, (AccountInstance) this.f$3, (MessagesStorage.BooleanCallback) this.f$4);
                break;
            case 7:
                GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                int i3 = 0;
                for (int i4 = 2; i3 < i4; i4 = 2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(i3 == 1 ? LocaleController.getString(R.string.Gift2StarsCollectibleInfo) : LocaleController.formatString(R.string.Gift2StarsInfo, giftSheet.name)));
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet<TLRPC.Document> hashSet2 = new HashSet();
                    int i5 = 0;
                    while (true) {
                        StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$1;
                        if (i5 < giftsList.gifts.size() && hashSet.size() < 3) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) giftsList.gifts.get(i5);
                            if (savedStarGift != null && (starGift = savedStarGift.gift) != null && (document = starGift.getDocument()) != null && !hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                            i5++;
                        }
                    }
                    int size = hashSet2.size();
                    TextView textView = giftSheet.subtitleStarsView;
                    if (size > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i6 = R.string.Gift2StarsInfoProfileLink;
                        long j = this.f$2;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatString(i6, DialogObject.getShortName(j)).replaceAll(" ", " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        for (TLRPC.Document document2 : hashSet2) {
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document2, textView.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new GiftSheet$$ExternalSyntheticLambda17(giftSheet, (Utilities.Callback) this.f$3, j, 0)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new GiftSheet$$ExternalSyntheticLambda18((Context) this.f$4, i2)), true));
                    }
                    if (i3 != 0) {
                        textView = giftSheet.subtitleCollectiblesStarsView;
                    }
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
                    i3++;
                }
                break;
            case 8:
                ((ProfileActivity) this.f$0).lambda$createView$9((boolean[]) this.f$1, (ArrayList) this.f$3, (boolean[]) this.f$4, this.f$2);
                break;
            case 9:
                BotStarsController botStarsController = (BotStarsController) this.f$0;
                botStarsController.getClass();
                ((AlertDialog) this.f$1).dismiss();
                TLObject tLObject = (TLObject) this.f$3;
                boolean z = tLObject instanceof TL_payments.connectedStarRefBots;
                Utilities.Callback callback = (Utilities.Callback) this.f$4;
                if (z) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(botStarsController.currentAccount).putUsers(connectedstarrefbots.users, false);
                    while (i2 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i2).bot_id == this.f$2 && !connectedstarrefbots.connected_bots.get(i2).revoked) {
                            callback.run(connectedstarrefbots.connected_bots.get(i2));
                        } else {
                            i2++;
                        }
                    }
                }
                callback.run(null);
                break;
            case 10:
                StarsController starsController = (StarsController) this.f$0;
                boolean z2 = starsController.balanceLoaded;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$1;
                if (z2) {
                    starsController.buyPremiumGift(callback2, this.f$2, (TLObject) this.f$3, (TLRPC.TL_textWithEntities) this.f$4);
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    callback2.run(Boolean.FALSE, null);
                }
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda18(profileActivity, i2), 200L);
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(profileActivity);
                TLRPC.Document document3 = ((TL_stars.StarGift) this.f$1).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                SpannableStringBuilder spannableStringBuilderReplaceTags = (SpannableStringBuilder) this.f$4;
                if (spannableStringBuilderReplaceTags == null) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) this.f$2, (String) this.f$3));
                }
                bulletinFactoryOf.createEmojiBulletin(document3, string, spannableStringBuilderReplaceTags).show(false);
                break;
            case 12:
                StarsController starsController2 = (StarsController) this.f$0;
                boolean z3 = starsController2.balanceLoaded;
                Utilities.Callback2 callback3 = (Utilities.Callback2) this.f$1;
                if (z3) {
                    starsController2.buyResellingGift((TLRPC.TL_payments_paymentFormStarGift) this.f$3, (TL_stars.TL_starGiftUnique) this.f$4, this.f$2, null, true, callback3);
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    callback3.run(Boolean.FALSE, null);
                }
                break;
            case 13:
                StarsController starsController3 = (StarsController) this.f$0;
                starsController3.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                boolean z4 = tLObject2 instanceof TLRPC.TL_messages_messages;
                Runnable runnable = (Runnable) this.f$4;
                if (z4) {
                    TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject2;
                    int i7 = starsController3.currentAccount;
                    MessagesController.getInstance(i7).putUsers(tL_messages_messages.users, false);
                    MessagesController.getInstance(i7).putChats(tL_messages_messages.chats, false);
                    if (tL_messages_messages.messages.size() == 1 && (tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) && (tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        TLRPC.Message message = tL_messages_messages.messages.get(0);
                        MessageObject messageObject = (MessageObject) this.f$3;
                        messageObject.messageOwner = message;
                        starsController3.updateMediaPrice(messageObject, this.f$2, runnable, true);
                    } else {
                        runnable.run();
                    }
                } else {
                    runnable.run();
                }
                break;
            case 14:
                StarsController.PendingPaidReactions pendingPaidReactions = (StarsController.PendingPaidReactions) this.f$0;
                TLObject tLObject3 = (TLObject) this.f$1;
                MessagesController messagesController = (MessagesController) this.f$3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$4;
                long j2 = this.f$2;
                pendingPaidReactions.getClass();
                if (tLObject3 != null) {
                    Utilities.stageQueue.postRunnable(new LivePlayer$$ExternalSyntheticLambda17(14, messagesController, tLObject3));
                } else if (tL_error != null) {
                    pendingPaidReactions.messageObject.addPaidReactions((int) (-pendingPaidReactions.amount), pendingPaidReactions.wasChosen, pendingPaidReactions.getPeerId());
                    NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(pendingPaidReactions.messageObject.getDialogId()), Integer.valueOf(pendingPaidReactions.messageObject.getId()), pendingPaidReactions.messageObject.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (pendingPaidReactions.message.did >= 0) {
                            forcedFirstName = UserObject.getForcedFirstName(pendingPaidReactions.chatActivity.getMessagesController().getUser(Long.valueOf(pendingPaidReactions.message.did)));
                        } else {
                            TLRPC.Chat chat = pendingPaidReactions.chatActivity.getMessagesController().getChat(Long.valueOf(-pendingPaidReactions.message.did));
                            forcedFirstName = chat == null ? "" : chat.title;
                        }
                        String str = forcedFirstName;
                        Context context = pendingPaidReactions.chatActivity.getContext();
                        if (context == null) {
                            context = LaunchActivity.instance;
                        }
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        new StarsIntroActivity.StarsNeededSheet(context, pendingPaidReactions.chatActivity.getResourceProvider(), j2, 5, str, new StarsController$PendingPaidReactions$$ExternalSyntheticLambda0(pendingPaidReactions, j2, i), 0L).show();
                    }
                    StarsController.this.invalidateTransactions(false);
                    StarsController.this.invalidateBalance();
                }
                break;
            default:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) this.f$0;
                LiveCommentsView$$ExternalSyntheticLambda9 liveCommentsView$$ExternalSyntheticLambda9 = starsReactionsSheet.onSendListener;
                long j3 = this.f$2;
                if (liveCommentsView$$ExternalSyntheticLambda9 != null) {
                    int iIntValue = liveCommentsView$$ExternalSyntheticLambda9.f$0.lambda$openStarsSheet$11(Long.valueOf(j3)).intValue();
                    starsReactionsSheet.sentMessageId = iIntValue;
                    if (iIntValue == Integer.MIN_VALUE) {
                        starsReactionsSheet.lambda$showGiftOfferSheet$15();
                    } else {
                        AndroidUtilities.runOnUIThread(new StarsReactionsSheet$$ExternalSyntheticLambda11(starsReactionsSheet, i2));
                    }
                    break;
                } else {
                    StarsController.PendingPaidReactions pendingPaidReactionsSendPaidReaction = ((StarsController) this.f$1).sendPaidReaction((MessageObject) this.f$3, (ChatActivity) this.f$4, j3, false, true, Long.valueOf(starsReactionsSheet.peer));
                    if (pendingPaidReactionsSendPaidReaction != null) {
                        AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(18, starsReactionsSheet, pendingPaidReactionsSendPaidReaction));
                        break;
                    }
                }
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda22(Object obj, Object obj2, long j, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public PhotoViewer$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, long j, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = j;
        this.f$4 = obj4;
    }

    public PhotoViewer$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, long j, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = obj3;
        this.f$2 = j;
        this.f$3 = str;
    }

    public PhotoViewer$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$2 = j;
    }
}
