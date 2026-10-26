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
public final class k7 implements RequestDelegate {
    public final int f29824a = 0;
    public final boolean f29825b;
    public final boolean f29826c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f29827f;
    public final Object f29828g;
    public final Object h;

    public k7(m8 m8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = m8Var;
        this.f29825b = z10;
        this.f29827f = messageObject;
        this.f29826c = z11;
        this.f29828g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f29824a) {
            case 0:
                m8.o((m8) this.e, this.f29825b, (MessageObject) this.f29827f, this.f29826c, (Runnable) this.f29828g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final wh0 wh0Var = (wh0) this.e;
                final MessagesController messagesController = (MessagesController) this.f29827f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f29828g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f29825b;
                final boolean z11 = this.f29826c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        wh0 wh0Var2 = wh0.this;
                        int i10 = wh0Var2.f34443b;
                        r71 r71Var = wh0Var2.f34444c;
                        wh0Var2.K = -1;
                        wh0Var2.v = false;
                        wh0Var2.H.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z15 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (z15) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                            ArrayList<TLRPC.User> arrayList2 = messages_messages.users;
                            MessagesController messagesController2 = messagesController;
                            messagesController2.putUsers(arrayList2, false);
                            messagesController2.putChats(messages_messages.chats, false);
                            TLRPC.SearchPostsFlood searchPostsFlood = messages_messages.search_flood;
                            if (searchPostsFlood != null) {
                                wh0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = wh0Var2.e;
                            } else {
                                arrayList = wh0Var2.f34446n;
                            }
                            boolean isEmpty = arrayList.isEmpty();
                            ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                            int size = arrayList3.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.Message message = arrayList3.get(i11);
                                i11++;
                                MessageObject messageObject = new MessageObject(i10, message, false, false);
                                if (!z16) {
                                    messageObject.setQuery(tL_channels_searchPosts.query);
                                }
                                arrayList.add(messageObject);
                            }
                            if (!z16) {
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    wh0Var2.f34447r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    wh0Var2.f34448s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    wh0Var2.f34447r = 0;
                                    z12 = true;
                                    wh0Var2.f34448s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        wh0Var2.f34447r = 0;
                                        wh0Var2.f34448s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    wh0Var2.f34445f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    wh0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    wh0Var2.f34445f = 0;
                                    wh0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    wh0Var2.f34445f = 0;
                                    wh0Var2.h = true;
                                }
                            }
                            wh0Var2.d();
                            if (isEmpty) {
                                r71Var.v0(0);
                            }
                            r71Var.f32152g3.O(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !wh0Var2.f34448s : !wh0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new bi.u7(wh0Var2, z16, arrayList, 24));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                wc.b0(wh0Var2.f34442a).R(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_error tL_error2 = tL_error;
                        if (tL_error2 != null && tL_error2.text.startsWith("FLOOD_WAIT_") && tL_error2.text.contains("_OR_STARS_")) {
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher != null && matcher.matches()) {
                                int parseInt = Integer.parseInt(matcher.group(1));
                                int parseInt2 = Integer.parseInt(matcher.group(2));
                                TLRPC.SearchPostsFlood searchPostsFlood2 = wh0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    wh0Var2.d.stars_amount = parseInt2;
                                }
                                wh0Var2.d();
                                r71Var.f32152g3.O(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            wh0Var2.d();
                            r71Var.f32152g3.O(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            wh0Var2.d();
                            r71Var.f32152g3.O(true);
                            bi.ca.y(i10, false).q(true, true, new bi.r3(wh0Var2, j11, 26));
                        }
                    }
                });
                return;
        }
    }

    public k7(wh0 wh0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = wh0Var;
        this.f29827f = messagesController;
        this.f29825b = z10;
        this.f29828g = tL_channels_searchPosts;
        this.f29826c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
