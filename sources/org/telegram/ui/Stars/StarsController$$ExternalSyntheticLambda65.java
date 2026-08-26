package org.telegram.ui.Stars;

import android.content.Context;
import androidx.collection.LongSparseArray;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class StarsController$$ExternalSyntheticLambda65 implements Runnable {
    public final int $r8$classId = 3;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;

    public StarsController$$ExternalSyntheticLambda65(int i, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        this.f$2 = i;
        this.f$0 = context;
        this.f$3 = j;
        this.f$1 = connectedbotstarref;
        this.f$4 = bottomSheet;
        this.f$5 = resourcesProvider;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((GiftSheet$$ExternalSyntheticLambda6) this.f$0).mo1122run((ArrayList) this.f$1, Integer.valueOf(this.f$2), Long.valueOf(this.f$3), (ArrayList) this.f$4, (ArrayList) this.f$5);
                break;
            case 1:
                LongSparseArray longSparseArray = (LongSparseArray) this.f$5;
                ((TopicsController) this.f$0).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.f$1, this.f$3, (TLRPC.TL_messages_forumTopics) this.f$4, longSparseArray, this.f$2);
                break;
            case 2:
                ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher = (ProfileChannelCell.ChannelMessageFetcher) this.f$0;
                channelMessageFetcher.getClass();
                TLObject tLObject = (TLObject) this.f$4;
                boolean z = tLObject instanceof TLRPC.messages_Messages;
                int i = this.f$2;
                if (z) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i2 = channelMessageFetcher.currentAccount;
                    MessagesController.getInstance(i2).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i2).putChats(messages_messages.chats, false);
                    ArrayList<TLRPC.User> arrayList = messages_messages.users;
                    ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                    MessagesStorage messagesStorage = (MessagesStorage) this.f$5;
                    messagesStorage.putUsersAndChats(arrayList, arrayList2, true, true);
                    messagesStorage.putMessages(messages_messages, -this.f$3, 3, 0, false, 0, 0L);
                    if (i == channelMessageFetcher.searchId && !messages_messages.messages.isEmpty()) {
                        ArrayList arrayList3 = channelMessageFetcher.messageObjects;
                        arrayList3.clear();
                        Collections.sort((ArrayList) this.f$1, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(5)));
                        TLRPC.Message message = (TLRPC.Message) zzin.m(1, messages_messages.messages);
                        long j = message.grouped_id;
                        if (j != 0) {
                            ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                            int size = arrayList4.size();
                            int i3 = 0;
                            while (i3 < size) {
                                TLRPC.Message message2 = arrayList4.get(i3);
                                i3++;
                                TLRPC.Message message3 = message2;
                                if (message3.grouped_id == j) {
                                    arrayList3.add(new MessageObject(i2, message3, false, true));
                                }
                            }
                        } else {
                            arrayList3.add(new MessageObject(i2, message, false, true));
                        }
                        if (!arrayList3.isEmpty()) {
                            channelMessageFetcher.done();
                        }
                    }
                    break;
                } else if (i == channelMessageFetcher.searchId) {
                    channelMessageFetcher.done();
                    break;
                }
                break;
            default:
                final int i4 = this.f$2;
                BotStarsController botStarsController = BotStarsController.getInstance(i4);
                final TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f$1;
                long j2 = connectedbotstarref.bot_id;
                final BottomSheet bottomSheet = (BottomSheet) this.f$4;
                final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$5;
                final Context context = (Context) this.f$0;
                final long j3 = this.f$3;
                botStarsController.getConnectedBot(context, j3, j2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                        BottomSheet bottomSheet2 = bottomSheet;
                        int i5 = i4;
                        Context context2 = context;
                        long j4 = j3;
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (connectedbotstarref2 != null) {
                            bottomSheet2.lambda$showGiftOfferSheet$15();
                            ChannelAffiliateProgramsFragment.showShareAffiliateAlert(context2, i5, connectedbotstarref2, j4, resourcesProvider2);
                        } else {
                            TLRPC.User user = MessagesController.getInstance(i5).getUser(Long.valueOf(connectedbotstarref.bot_id));
                            if (user != null) {
                                MessagesController.getInstance(i5).loadFullUser(user, 0, true, new StarsIntroActivity$$ExternalSyntheticLambda38(bottomSheet2, context2, i5, j4, resourcesProvider2, 2));
                            }
                        }
                    }
                });
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda65(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, LongSparseArray longSparseArray, int i) {
        this.f$0 = topicsController;
        this.f$1 = tL_messages_forumTopics;
        this.f$3 = j;
        this.f$4 = tL_messages_forumTopics2;
        this.f$5 = longSparseArray;
        this.f$2 = i;
    }

    public StarsController$$ExternalSyntheticLambda65(ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, TLObject tLObject, MessagesStorage messagesStorage, long j, int i, ArrayList arrayList) {
        this.f$0 = channelMessageFetcher;
        this.f$4 = tLObject;
        this.f$5 = messagesStorage;
        this.f$3 = j;
        this.f$2 = i;
        this.f$1 = arrayList;
    }

    public StarsController$$ExternalSyntheticLambda65(GiftSheet$$ExternalSyntheticLambda6 giftSheet$$ExternalSyntheticLambda6, ArrayList arrayList, int i, long j, ArrayList arrayList2, ArrayList arrayList3) {
        this.f$0 = giftSheet$$ExternalSyntheticLambda6;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = arrayList2;
        this.f$5 = arrayList3;
    }
}
