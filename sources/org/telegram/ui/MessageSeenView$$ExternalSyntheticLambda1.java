package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import androidx.collection.LongSparseArray;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda5;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class MessageSeenView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId = 5;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;
    public final int f$4;
    public final Object f$5;

    public MessageSeenView$$ExternalSyntheticLambda1(int i, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        this.f$4 = i;
        this.f$0 = context;
        this.f$3 = j;
        this.f$1 = connectedbotstarref;
        this.f$2 = bottomSheet;
        this.f$5 = resourcesProvider;
    }

    @Override
    public final void run() throws Throwable {
        int i;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                final MessageSeenView messageSeenView = (MessageSeenView) this.f$0;
                if (tL_error == null) {
                    messageSeenView.getClass();
                    TLObject tLObject = (TLObject) this.f$2;
                    if (tLObject instanceof Vector) {
                        Vector vector = (Vector) tLObject;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final HashMap map = new HashMap();
                        final ArrayList arrayList3 = new ArrayList();
                        int size = vector.objects.size();
                        int i2 = 0;
                        while (true) {
                            final int i3 = this.f$4;
                            if (i2 < size) {
                                Object obj = vector.objects.get(i2);
                                boolean z = obj instanceof TLRPC.TL_readParticipantDate;
                                long j = this.f$3;
                                if (z) {
                                    TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj;
                                    int i4 = tL_readParticipantDate.date;
                                    i = i2;
                                    long j2 = tL_readParticipantDate.user_id;
                                    Long lValueOf = Long.valueOf(j2);
                                    if (j != j2) {
                                        MessagesController.getInstance(i3).getUser(lValueOf);
                                        arrayList3.add(new Pair(lValueOf, Integer.valueOf(i4)));
                                        arrayList.add(lValueOf);
                                    }
                                } else {
                                    i = i2;
                                    if (obj instanceof Long) {
                                        Long l = (Long) obj;
                                        if (j != l.longValue()) {
                                            if (l.longValue() > 0) {
                                                MessagesController.getInstance(i3).getUser(l);
                                                arrayList3.add(new Pair(l, 0));
                                                arrayList.add(l);
                                            } else {
                                                MessagesController.getInstance(i3).getChat(Long.valueOf(-l.longValue()));
                                                arrayList3.add(new Pair(l, 0));
                                                arrayList2.add(l);
                                            }
                                        }
                                    }
                                }
                                i2 = i + 1;
                            } else if (arrayList.isEmpty()) {
                                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                    Pair pair = (Pair) arrayList3.get(i5);
                                    messageSeenView.peerIds.add((Long) pair.first);
                                    messageSeenView.dates.add((Integer) pair.second);
                                    messageSeenView.users.add((TLObject) map.get(pair.first));
                                }
                                messageSeenView.updateView();
                            } else {
                                TLRPC.Chat chat = (TLRPC.Chat) this.f$5;
                                if (ChatObject.isChannel(chat)) {
                                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                                    tL_channels_getParticipants.limit = MessagesController.getInstance(i3).chatReadMarkSizeThreshold;
                                    tL_channels_getParticipants.offset = 0;
                                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                                    tL_channels_getParticipants.channel = MessagesController.getInstance(i3).getInputChannel(chat.id);
                                    final int i6 = 0;
                                    ConnectionsManager.getInstance(i3).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                                        @Override
                                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                            switch (i6) {
                                                case 0:
                                                    final MessageSeenView messageSeenView2 = messageSeenView;
                                                    messageSeenView2.getClass();
                                                    final HashMap map2 = map;
                                                    final ArrayList arrayList4 = arrayList3;
                                                    final int i7 = i3;
                                                    final int i8 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i8) {
                                                                case 0:
                                                                    MessageSeenView messageSeenView3 = messageSeenView2;
                                                                    TLObject tLObject3 = tLObject2;
                                                                    if (tLObject3 != null) {
                                                                        messageSeenView3.getClass();
                                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                                        int i9 = 0;
                                                                        int i10 = 0;
                                                                        while (true) {
                                                                            int size2 = tL_channels_channelParticipants.users.size();
                                                                            HashMap map3 = map2;
                                                                            if (i10 < size2) {
                                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i10);
                                                                                MessagesController.getInstance(i7).putUser(user, false);
                                                                                map3.put(Long.valueOf(user.id), user);
                                                                                i10++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList5 = arrayList4;
                                                                                    if (i9 < arrayList5.size()) {
                                                                                        Pair pair2 = (Pair) arrayList5.get(i9);
                                                                                        messageSeenView3.peerIds.add((Long) pair2.first);
                                                                                        messageSeenView3.dates.add((Integer) pair2.second);
                                                                                        messageSeenView3.users.add((TLObject) map3.get(pair2.first));
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView3.updateView();
                                                                    break;
                                                                default:
                                                                    MessageSeenView messageSeenView4 = messageSeenView2;
                                                                    TLObject tLObject4 = tLObject2;
                                                                    if (tLObject4 != null) {
                                                                        messageSeenView4.getClass();
                                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                                        int i11 = 0;
                                                                        int i12 = 0;
                                                                        while (true) {
                                                                            int size3 = tL_messages_chatFull.users.size();
                                                                            HashMap map4 = map2;
                                                                            if (i12 < size3) {
                                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i12);
                                                                                MessagesController.getInstance(i7).putUser(user2, false);
                                                                                map4.put(Long.valueOf(user2.id), user2);
                                                                                i12++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList6 = arrayList4;
                                                                                    if (i11 < arrayList6.size()) {
                                                                                        Pair pair3 = (Pair) arrayList6.get(i11);
                                                                                        messageSeenView4.peerIds.add((Long) pair3.first);
                                                                                        messageSeenView4.dates.add((Integer) pair3.second);
                                                                                        messageSeenView4.users.add((TLObject) map4.get(pair3.first));
                                                                                        i11++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView4.updateView();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final MessageSeenView messageSeenView3 = messageSeenView;
                                                    messageSeenView3.getClass();
                                                    final HashMap map3 = map;
                                                    final ArrayList arrayList5 = arrayList3;
                                                    final int i9 = i3;
                                                    final int i10 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i10) {
                                                                case 0:
                                                                    MessageSeenView messageSeenView4 = messageSeenView3;
                                                                    TLObject tLObject3 = tLObject2;
                                                                    if (tLObject3 != null) {
                                                                        messageSeenView4.getClass();
                                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                                        int i11 = 0;
                                                                        int i12 = 0;
                                                                        while (true) {
                                                                            int size2 = tL_channels_channelParticipants.users.size();
                                                                            HashMap map4 = map3;
                                                                            if (i12 < size2) {
                                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i12);
                                                                                MessagesController.getInstance(i9).putUser(user, false);
                                                                                map4.put(Long.valueOf(user.id), user);
                                                                                i12++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList6 = arrayList5;
                                                                                    if (i11 < arrayList6.size()) {
                                                                                        Pair pair2 = (Pair) arrayList6.get(i11);
                                                                                        messageSeenView4.peerIds.add((Long) pair2.first);
                                                                                        messageSeenView4.dates.add((Integer) pair2.second);
                                                                                        messageSeenView4.users.add((TLObject) map4.get(pair2.first));
                                                                                        i11++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView4.updateView();
                                                                    break;
                                                                default:
                                                                    MessageSeenView messageSeenView5 = messageSeenView3;
                                                                    TLObject tLObject4 = tLObject2;
                                                                    if (tLObject4 != null) {
                                                                        messageSeenView5.getClass();
                                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                                        int i13 = 0;
                                                                        int i14 = 0;
                                                                        while (true) {
                                                                            int size3 = tL_messages_chatFull.users.size();
                                                                            HashMap map5 = map3;
                                                                            if (i14 < size3) {
                                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i14);
                                                                                MessagesController.getInstance(i9).putUser(user2, false);
                                                                                map5.put(Long.valueOf(user2.id), user2);
                                                                                i14++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList7 = arrayList5;
                                                                                    if (i13 < arrayList7.size()) {
                                                                                        Pair pair3 = (Pair) arrayList7.get(i13);
                                                                                        messageSeenView5.peerIds.add((Long) pair3.first);
                                                                                        messageSeenView5.dates.add((Integer) pair3.second);
                                                                                        messageSeenView5.users.add((TLObject) map5.get(pair3.first));
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView5.updateView();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                                    tL_messages_getFullChat.chat_id = chat.id;
                                    final int i7 = 1;
                                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                                        @Override
                                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                            switch (i7) {
                                                case 0:
                                                    final MessageSeenView messageSeenView2 = messageSeenView;
                                                    messageSeenView2.getClass();
                                                    final HashMap map2 = map;
                                                    final ArrayList arrayList4 = arrayList3;
                                                    final int i8 = i3;
                                                    final int i9 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i9) {
                                                                case 0:
                                                                    MessageSeenView messageSeenView4 = messageSeenView2;
                                                                    TLObject tLObject3 = tLObject2;
                                                                    if (tLObject3 != null) {
                                                                        messageSeenView4.getClass();
                                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                                        int i11 = 0;
                                                                        int i12 = 0;
                                                                        while (true) {
                                                                            int size2 = tL_channels_channelParticipants.users.size();
                                                                            HashMap map4 = map2;
                                                                            if (i12 < size2) {
                                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i12);
                                                                                MessagesController.getInstance(i8).putUser(user, false);
                                                                                map4.put(Long.valueOf(user.id), user);
                                                                                i12++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList6 = arrayList4;
                                                                                    if (i11 < arrayList6.size()) {
                                                                                        Pair pair2 = (Pair) arrayList6.get(i11);
                                                                                        messageSeenView4.peerIds.add((Long) pair2.first);
                                                                                        messageSeenView4.dates.add((Integer) pair2.second);
                                                                                        messageSeenView4.users.add((TLObject) map4.get(pair2.first));
                                                                                        i11++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView4.updateView();
                                                                    break;
                                                                default:
                                                                    MessageSeenView messageSeenView5 = messageSeenView2;
                                                                    TLObject tLObject4 = tLObject2;
                                                                    if (tLObject4 != null) {
                                                                        messageSeenView5.getClass();
                                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                                        int i13 = 0;
                                                                        int i14 = 0;
                                                                        while (true) {
                                                                            int size3 = tL_messages_chatFull.users.size();
                                                                            HashMap map5 = map2;
                                                                            if (i14 < size3) {
                                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i14);
                                                                                MessagesController.getInstance(i8).putUser(user2, false);
                                                                                map5.put(Long.valueOf(user2.id), user2);
                                                                                i14++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList7 = arrayList4;
                                                                                    if (i13 < arrayList7.size()) {
                                                                                        Pair pair3 = (Pair) arrayList7.get(i13);
                                                                                        messageSeenView5.peerIds.add((Long) pair3.first);
                                                                                        messageSeenView5.dates.add((Integer) pair3.second);
                                                                                        messageSeenView5.users.add((TLObject) map5.get(pair3.first));
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView5.updateView();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final MessageSeenView messageSeenView3 = messageSeenView;
                                                    messageSeenView3.getClass();
                                                    final HashMap map3 = map;
                                                    final ArrayList arrayList5 = arrayList3;
                                                    final int i10 = i3;
                                                    final int i11 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i11) {
                                                                case 0:
                                                                    MessageSeenView messageSeenView4 = messageSeenView3;
                                                                    TLObject tLObject3 = tLObject2;
                                                                    if (tLObject3 != null) {
                                                                        messageSeenView4.getClass();
                                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                                        int i12 = 0;
                                                                        int i13 = 0;
                                                                        while (true) {
                                                                            int size2 = tL_channels_channelParticipants.users.size();
                                                                            HashMap map4 = map3;
                                                                            if (i13 < size2) {
                                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i13);
                                                                                MessagesController.getInstance(i10).putUser(user, false);
                                                                                map4.put(Long.valueOf(user.id), user);
                                                                                i13++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList6 = arrayList5;
                                                                                    if (i12 < arrayList6.size()) {
                                                                                        Pair pair2 = (Pair) arrayList6.get(i12);
                                                                                        messageSeenView4.peerIds.add((Long) pair2.first);
                                                                                        messageSeenView4.dates.add((Integer) pair2.second);
                                                                                        messageSeenView4.users.add((TLObject) map4.get(pair2.first));
                                                                                        i12++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView4.updateView();
                                                                    break;
                                                                default:
                                                                    MessageSeenView messageSeenView5 = messageSeenView3;
                                                                    TLObject tLObject4 = tLObject2;
                                                                    if (tLObject4 != null) {
                                                                        messageSeenView5.getClass();
                                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                                        int i14 = 0;
                                                                        int i15 = 0;
                                                                        while (true) {
                                                                            int size3 = tL_messages_chatFull.users.size();
                                                                            HashMap map5 = map3;
                                                                            if (i15 < size3) {
                                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i15);
                                                                                MessagesController.getInstance(i10).putUser(user2, false);
                                                                                map5.put(Long.valueOf(user2.id), user2);
                                                                                i15++;
                                                                            } else {
                                                                                while (true) {
                                                                                    ArrayList arrayList7 = arrayList5;
                                                                                    if (i14 < arrayList7.size()) {
                                                                                        Pair pair3 = (Pair) arrayList7.get(i14);
                                                                                        messageSeenView5.peerIds.add((Long) pair3.first);
                                                                                        messageSeenView5.dates.add((Integer) pair3.second);
                                                                                        messageSeenView5.users.add((TLObject) map5.get(pair3.first));
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    messageSeenView5.updateView();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
                messageSeenView.updateView();
                break;
            case 1:
                LongSparseArray longSparseArray = (LongSparseArray) this.f$5;
                ((TopicsController) this.f$0).lambda$loadTopics$5((TLRPC.TL_messages_forumTopics) this.f$1, this.f$3, (TLRPC.TL_messages_forumTopics) this.f$2, longSparseArray, this.f$4);
                break;
            case 2:
                ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher = (ProfileChannelCell.ChannelMessageFetcher) this.f$0;
                channelMessageFetcher.getClass();
                TLObject tLObject2 = (TLObject) this.f$2;
                boolean z2 = tLObject2 instanceof TLRPC.messages_Messages;
                int i8 = this.f$4;
                if (z2) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    int i9 = channelMessageFetcher.currentAccount;
                    MessagesController.getInstance(i9).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i9).putChats(messages_messages.chats, false);
                    ArrayList<TLRPC.User> arrayList4 = messages_messages.users;
                    ArrayList<TLRPC.Chat> arrayList5 = messages_messages.chats;
                    MessagesStorage messagesStorage = (MessagesStorage) this.f$1;
                    messagesStorage.putUsersAndChats(arrayList4, arrayList5, true, true);
                    messagesStorage.putMessages(messages_messages, -this.f$3, 3, 0, false, 0, 0L);
                    if (i8 == channelMessageFetcher.searchId && !messages_messages.messages.isEmpty()) {
                        ArrayList arrayList6 = channelMessageFetcher.messageObjects;
                        arrayList6.clear();
                        Collections.sort((ArrayList) this.f$5, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(5)));
                        TLRPC.Message message = (TLRPC.Message) zziq.m(1, messages_messages.messages);
                        long j3 = message.grouped_id;
                        if (j3 != 0) {
                            ArrayList<TLRPC.Message> arrayList7 = messages_messages.messages;
                            int size2 = arrayList7.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                TLRPC.Message message2 = arrayList7.get(i10);
                                i10++;
                                TLRPC.Message message3 = message2;
                                if (message3.grouped_id == j3) {
                                    arrayList6.add(new MessageObject(i9, message3, false, true));
                                }
                            }
                        } else {
                            arrayList6.add(new MessageObject(i9, message, false, true));
                        }
                        if (!arrayList6.isEmpty()) {
                            channelMessageFetcher.done();
                        }
                    }
                    break;
                } else if (i8 == channelMessageFetcher.searchId) {
                    channelMessageFetcher.done();
                    break;
                }
                break;
            case 3:
                TLObject tLObject3 = (TLObject) this.f$2;
                int i11 = this.f$4;
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                BottomSheet bottomSheet = (BottomSheet) this.f$5;
                long j4 = this.f$3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$1;
                TLRPC.GroupCall groupCall = null;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = arrayListFindUpdates.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj2 = arrayListFindUpdates.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    Utilities.stageQueue.postRunnable(new ConnectionsManager$$ExternalSyntheticLambda5(i11, updates, 1));
                    if (groupCall == null || LaunchActivity.instance == null) {
                        buttonWithCounterView.setLoading(false);
                    } else {
                        bottomSheet.lambda$showGiftOfferSheet$15();
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j4));
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            if (safeLastFragment instanceof ChatActivity) {
                                ChatActivity chatActivity = (ChatActivity) safeLastFragment;
                                if (chatActivity.getDialogId() == j4 && chatActivity.chatMode == 0) {
                                }
                            }
                            safeLastFragment.presentFragment(ChatActivity.of(j4));
                        }
                    }
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    MessagesController.getInstance(i11).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i11).putChats(groupcall.chats, false);
                    if (LaunchActivity.instance == null) {
                        buttonWithCounterView.setLoading(false);
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall.id = groupCall2.id;
                        tL_inputGroupCall.access_hash = groupCall2.access_hash;
                        bottomSheet.lambda$showGiftOfferSheet$15();
                        VoIPHelper.joinConference(LaunchActivity.instance, i11, tL_inputGroupCall, false, groupcall.call, null);
                        SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j4));
                    }
                } else if (tL_error2 != null) {
                    zzlu.m(bottomSheet.topBulletinContainer, null, tL_error2);
                }
                break;
            case 4:
                ((StoriesViewPager$$ExternalSyntheticLambda0) this.f$0).mo1067run((ArrayList) this.f$1, Integer.valueOf(this.f$4), Long.valueOf(this.f$3), (ArrayList) this.f$2, (ArrayList) this.f$5);
                break;
            default:
                int i13 = this.f$4;
                BotStarsController botStarsController = BotStarsController.getInstance(i13);
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f$1;
                long j5 = connectedbotstarref.bot_id;
                BottomSheet bottomSheet2 = (BottomSheet) this.f$2;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$5;
                Context context = (Context) this.f$0;
                long j6 = this.f$3;
                botStarsController.getConnectedBot(context, j6, j5, new TopicsFragment$2$$ExternalSyntheticLambda4(i13, j6, context, connectedbotstarref, bottomSheet2, resourcesProvider));
                break;
        }
    }

    public MessageSeenView$$ExternalSyntheticLambda1(TopicsController topicsController, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, LongSparseArray longSparseArray, int i) {
        this.f$0 = topicsController;
        this.f$1 = tL_messages_forumTopics;
        this.f$3 = j;
        this.f$2 = tL_messages_forumTopics2;
        this.f$5 = longSparseArray;
        this.f$4 = i;
    }

    public MessageSeenView$$ExternalSyntheticLambda1(TLObject tLObject, int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, TLRPC.TL_error tL_error) {
        this.f$2 = tLObject;
        this.f$4 = i;
        this.f$0 = buttonWithCounterView;
        this.f$5 = bottomSheet;
        this.f$3 = j;
        this.f$1 = tL_error;
    }

    public MessageSeenView$$ExternalSyntheticLambda1(ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, TLObject tLObject, MessagesStorage messagesStorage, long j, int i, ArrayList arrayList) {
        this.f$0 = channelMessageFetcher;
        this.f$2 = tLObject;
        this.f$1 = messagesStorage;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = arrayList;
    }

    public MessageSeenView$$ExternalSyntheticLambda1(MessageSeenView messageSeenView, TLRPC.TL_error tL_error, TLObject tLObject, long j, int i, TLRPC.Chat chat) {
        this.f$0 = messageSeenView;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = chat;
    }

    public MessageSeenView$$ExternalSyntheticLambda1(StoriesViewPager$$ExternalSyntheticLambda0 storiesViewPager$$ExternalSyntheticLambda0, ArrayList arrayList, int i, long j, ArrayList arrayList2, ArrayList arrayList3) {
        this.f$0 = storiesViewPager$$ExternalSyntheticLambda0;
        this.f$1 = arrayList;
        this.f$4 = i;
        this.f$3 = j;
        this.f$2 = arrayList2;
        this.f$5 = arrayList3;
    }
}
