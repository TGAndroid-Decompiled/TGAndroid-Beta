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
public final class c7 implements RequestDelegate {
    public final int f23832a = 0;
    public final boolean f23833b;
    public final boolean f23834c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f23835f;
    public final Object f23836g;
    public final Object h;

    public c7(c8 c8Var, boolean z4, MessageObject messageObject, boolean z10, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = c8Var;
        this.f23833b = z4;
        this.f23835f = messageObject;
        this.f23834c = z10;
        this.f23836g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f23832a) {
            case 0:
                c8.y((c8) this.e, this.f23833b, (MessageObject) this.f23835f, this.f23834c, (Runnable) this.f23836g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final fh0 fh0Var = (fh0) this.e;
                final MessagesController messagesController = (MessagesController) this.f23835f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f23836g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z4 = this.f23833b;
                final boolean z10 = this.f23834c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z11;
                        boolean z12;
                        boolean z13;
                        fh0 fh0Var2 = fh0.this;
                        int i10 = fh0Var2.f24888b;
                        g61 g61Var = fh0Var2.f24889c;
                        fh0Var2.H = -1;
                        fh0Var2.v = false;
                        fh0Var2.E.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (z14) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                            ArrayList<TLRPC.User> arrayList2 = messages_messages.users;
                            MessagesController messagesController2 = messagesController;
                            messagesController2.putUsers(arrayList2, false);
                            messagesController2.putChats(messages_messages.chats, false);
                            TLRPC.SearchPostsFlood searchPostsFlood = messages_messages.search_flood;
                            if (searchPostsFlood != null) {
                                fh0Var2.d = searchPostsFlood;
                            }
                            boolean z15 = z4;
                            if (z15) {
                                arrayList = fh0Var2.e;
                            } else {
                                arrayList = fh0Var2.f24891n;
                            }
                            boolean isEmpty = arrayList.isEmpty();
                            ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                            int size = arrayList3.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.Message message = arrayList3.get(i11);
                                i11++;
                                MessageObject messageObject = new MessageObject(i10, message, false, false);
                                if (!z15) {
                                    messageObject.setQuery(tL_channels_searchPosts.query);
                                }
                                arrayList.add(messageObject);
                            }
                            if (!z15) {
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    fh0Var2.f24892r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    fh0Var2.f24893s = z13;
                                    z11 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    fh0Var2.f24892r = 0;
                                    z11 = true;
                                    fh0Var2.f24893s = true;
                                } else {
                                    z11 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        fh0Var2.f24892r = 0;
                                        fh0Var2.f24893s = true;
                                    }
                                }
                            } else {
                                z11 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    fh0Var2.f24890f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    fh0Var2.h = z12;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    fh0Var2.f24890f = 0;
                                    fh0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    fh0Var2.f24890f = 0;
                                    fh0Var2.h = true;
                                }
                            }
                            fh0Var2.d();
                            if (isEmpty) {
                                g61Var.u0(0);
                            }
                            g61Var.V2.N(z11);
                            if (!arrayList.isEmpty() && (!z15 ? !fh0Var2.f24893s : !fh0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new lh.r5(fh0Var2, z15, arrayList, 18));
                            }
                            if (z10 && j11 > 0 && !z15) {
                                qc.a0(fh0Var2.f24887a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = fh0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    fh0Var2.d.stars_amount = parseInt2;
                                }
                                fh0Var2.d();
                                g61Var.V2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            fh0Var2.d();
                            g61Var.V2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            fh0Var2.d();
                            g61Var.V2.N(true);
                            lh.t7.y(i10, false).q(true, true, new gg.y1(fh0Var2, j11, 18));
                        }
                    }
                });
                return;
        }
    }

    public c7(fh0 fh0Var, MessagesController messagesController, boolean z4, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z10, long j10, ConnectionsManager connectionsManager) {
        this.e = fh0Var;
        this.f23835f = messagesController;
        this.f23833b = z4;
        this.f23836g = tL_channels_searchPosts;
        this.f23834c = z10;
        this.d = j10;
        this.h = connectionsManager;
    }
}
