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
public final class i7 implements RequestDelegate {
    public final int f27092a = 0;
    public final boolean f27093b;
    public final boolean f27094c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f27095f;
    public final Object f27096g;
    public final Object h;

    public i7(k8 k8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = k8Var;
        this.f27093b = z10;
        this.f27095f = messageObject;
        this.f27094c = z11;
        this.f27096g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27092a) {
            case 0:
                k8.A((k8) this.e, this.f27093b, (MessageObject) this.f27095f, this.f27094c, (Runnable) this.f27096g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final th0 th0Var = (th0) this.e;
                final MessagesController messagesController = (MessagesController) this.f27095f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27096g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27093b;
                final boolean z11 = this.f27094c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        th0 th0Var2 = th0.this;
                        int i10 = th0Var2.f30548b;
                        a71 a71Var = th0Var2.f30549c;
                        th0Var2.K = -1;
                        th0Var2.v = false;
                        th0Var2.H.setLoading(false);
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
                                th0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = th0Var2.e;
                            } else {
                                arrayList = th0Var2.f30551n;
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
                                    th0Var2.f30552r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    th0Var2.f30553s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    th0Var2.f30552r = 0;
                                    z12 = true;
                                    th0Var2.f30553s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        th0Var2.f30552r = 0;
                                        th0Var2.f30553s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    th0Var2.f30550f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    th0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    th0Var2.f30550f = 0;
                                    th0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    th0Var2.f30550f = 0;
                                    th0Var2.h = true;
                                }
                            }
                            th0Var2.d();
                            if (isEmpty) {
                                a71Var.u0(0);
                            }
                            a71Var.W2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !th0Var2.f30553s : !th0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new ai.x7(th0Var2, z16, arrayList, 25));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                xc.a0(th0Var2.f30547a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = th0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    th0Var2.d.stars_amount = parseInt2;
                                }
                                th0Var2.d();
                                a71Var.W2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            th0Var2.d();
                            a71Var.W2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            th0Var2.d();
                            a71Var.W2.N(true);
                            ai.ga.y(i10, false).q(true, true, new ai.t3(th0Var2, j11, 26));
                        }
                    }
                });
                return;
        }
    }

    public i7(th0 th0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = th0Var;
        this.f27095f = messagesController;
        this.f27093b = z10;
        this.f27096g = tL_channels_searchPosts;
        this.f27094c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
