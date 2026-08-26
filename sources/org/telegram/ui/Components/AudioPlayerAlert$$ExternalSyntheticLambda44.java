package org.telegram.ui.Components;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.Stars.StarsController;

public final class AudioPlayerAlert$$ExternalSyntheticLambda44 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final boolean f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final long f$5;
    public final Object f$6;

    public AudioPlayerAlert$$ExternalSyntheticLambda44(AudioPlayerAlert audioPlayerAlert, boolean z, MessageObject messageObject, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.f$0 = audioPlayerAlert;
        this.f$1 = z;
        this.f$2 = messageObject;
        this.f$3 = z2;
        this.f$4 = runnable;
        this.f$5 = j;
        this.f$6 = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) this.f$6;
                ((AudioPlayerAlert) this.f$0).lambda$saveToProfile$31(this.f$1, (MessageObject) this.f$2, this.f$3, (Runnable) this.f$4, this.f$5, document, tL_error);
                break;
            default:
                final PostsSearchContainer postsSearchContainer = (PostsSearchContainer) this.f$0;
                postsSearchContainer.getClass();
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f$4;
                final long j = this.f$5;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.f$6;
                final MessagesController messagesController = (MessagesController) this.f$2;
                final boolean z = this.f$1;
                final boolean z2 = this.f$3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z3;
                        PostsSearchContainer postsSearchContainer2 = postsSearchContainer;
                        postsSearchContainer2.reqId = -1;
                        postsSearchContainer2.loading = false;
                        postsSearchContainer2.emptyButton.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z4 = tLObject2 instanceof TLRPC.messages_Messages;
                        UniversalRecyclerView universalRecyclerView = postsSearchContainer2.listView;
                        long j2 = j;
                        int i = postsSearchContainer2.currentAccount;
                        if (!z4) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    postsSearchContainer2.updateEmptyView();
                                    universalRecyclerView.adapter.update(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    postsSearchContainer2.updateEmptyView();
                                    universalRecyclerView.adapter.update(true);
                                    StarsController.getInstance(i, false).getBalance(true, true, new LinkManager$3$$ExternalSyntheticLambda0(postsSearchContainer2, j2, 13));
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int i2 = Integer.parseInt(matcher.group(1));
                            int i3 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = postsSearchContainer2.flood;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + i2;
                                postsSearchContainer2.flood.stars_amount = i3;
                            }
                            postsSearchContainer2.updateEmptyView();
                            universalRecyclerView.adapter.update(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        MessagesController messagesController2 = messagesController;
                        messagesController2.putUsers(arrayList, false);
                        messagesController2.putChats(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            postsSearchContainer2.flood = searchPostsFlood2;
                        }
                        boolean z5 = z;
                        ArrayList arrayList2 = z5 ? postsSearchContainer2.newsMessages : postsSearchContainer2.messages;
                        boolean zIsEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            TLRPC.Message message = arrayList3.get(i4);
                            i4++;
                            MessageObject messageObject = new MessageObject(i, message, false, false);
                            if (!z5) {
                                messageObject.setQuery(tL_channels_searchPosts.query);
                            }
                            arrayList2.add(messageObject);
                        }
                        if (z5) {
                            z3 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                postsSearchContainer2.newsMessagesLastRate = messages_messages.next_rate;
                                postsSearchContainer2.newsMessagesEndReached = (messages_messages.flags & 1) == 0;
                            } else if ((messages_messages instanceof TLRPC.TL_messages_messages) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) {
                                postsSearchContainer2.newsMessagesLastRate = 0;
                                postsSearchContainer2.newsMessagesEndReached = true;
                            }
                        } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            postsSearchContainer2.lastRate = messages_messages.next_rate;
                            postsSearchContainer2.endReached = (messages_messages.flags & 1) == 0;
                            z3 = true;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            postsSearchContainer2.lastRate = 0;
                            z3 = true;
                            postsSearchContainer2.endReached = true;
                        } else {
                            z3 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                postsSearchContainer2.lastRate = 0;
                                postsSearchContainer2.endReached = true;
                            }
                        }
                        postsSearchContainer2.updateEmptyView();
                        if (zIsEmpty) {
                            universalRecyclerView.scrollToPosition(0);
                        }
                        universalRecyclerView.adapter.update(z3);
                        if (!arrayList2.isEmpty() && (!z5 ? !postsSearchContainer2.endReached : !postsSearchContainer2.newsMessagesEndReached)) {
                            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(postsSearchContainer2, z5, arrayList2, 18));
                        }
                        if (!z2 || j2 <= 0 || z5) {
                            return;
                        }
                        BulletinFactory.of(postsSearchContainer2.fragment).createSimpleBulletinWithIconSize(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j2))).show();
                    }
                });
                break;
        }
    }

    public AudioPlayerAlert$$ExternalSyntheticLambda44(PostsSearchContainer postsSearchContainer, MessagesController messagesController, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.f$0 = postsSearchContainer;
        this.f$2 = messagesController;
        this.f$1 = z;
        this.f$4 = tL_channels_searchPosts;
        this.f$3 = z2;
        this.f$5 = j;
        this.f$6 = connectionsManager;
    }
}
