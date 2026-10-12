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
    public final int f26593a = 0;
    public final boolean f26594b;
    public final boolean f26595c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f26596f;
    public final Object f26597g;
    public final Object h;

    public k7(m8 m8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = m8Var;
        this.f26594b = z10;
        this.f26596f = messageObject;
        this.f26595c = z11;
        this.f26597g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f26593a) {
            case 0:
                m8.A((m8) this.e, this.f26594b, (MessageObject) this.f26596f, this.f26595c, (Runnable) this.f26597g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final zh0 zh0Var = (zh0) this.e;
                final MessagesController messagesController = (MessagesController) this.f26596f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f26597g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f26594b;
                final boolean z11 = this.f26595c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        zh0 zh0Var2 = zh0.this;
                        int i10 = zh0Var2.f31869b;
                        h71 h71Var = zh0Var2.f31870c;
                        zh0Var2.K = -1;
                        zh0Var2.v = false;
                        zh0Var2.H.setLoading(false);
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
                                zh0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = zh0Var2.e;
                            } else {
                                arrayList = zh0Var2.f31872n;
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
                                    zh0Var2.f31873r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    zh0Var2.f31874s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    zh0Var2.f31873r = 0;
                                    z12 = true;
                                    zh0Var2.f31874s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        zh0Var2.f31873r = 0;
                                        zh0Var2.f31874s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    zh0Var2.f31871f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    zh0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    zh0Var2.f31871f = 0;
                                    zh0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    zh0Var2.f31871f = 0;
                                    zh0Var2.h = true;
                                }
                            }
                            zh0Var2.d();
                            if (isEmpty) {
                                h71Var.u0(0);
                            }
                            h71Var.W2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !zh0Var2.f31874s : !zh0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new di.x0(zh0Var2, z16, arrayList, 24));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                zc.a0(zh0Var2.f31868a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = zh0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    zh0Var2.d.stars_amount = parseInt2;
                                }
                                zh0Var2.d();
                                h71Var.W2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            zh0Var2.d();
                            h71Var.W2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            zh0Var2.d();
                            h71Var.W2.N(true);
                            zh.n5.y(i10, false).q(true, true, new bi.g(zh0Var2, j11, 24));
                        }
                    }
                });
                return;
        }
    }

    public k7(zh0 zh0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = zh0Var;
        this.f26596f = messagesController;
        this.f26594b = z10;
        this.f26597g = tL_channels_searchPosts;
        this.f26595c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
