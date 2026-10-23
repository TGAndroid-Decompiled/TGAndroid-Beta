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
    public final int f27144a = 0;
    public final boolean f27145b;
    public final boolean f27146c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f27147f;
    public final Object f27148g;
    public final Object h;

    public i7(k8 k8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = k8Var;
        this.f27145b = z10;
        this.f27147f = messageObject;
        this.f27146c = z11;
        this.f27148g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27144a) {
            case 0:
                k8.A((k8) this.e, this.f27145b, (MessageObject) this.f27147f, this.f27146c, (Runnable) this.f27148g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final uh0 uh0Var = (uh0) this.e;
                final MessagesController messagesController = (MessagesController) this.f27147f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27148g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27145b;
                final boolean z11 = this.f27146c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        uh0 uh0Var2 = uh0.this;
                        int i10 = uh0Var2.f30939b;
                        c71 c71Var = uh0Var2.f30940c;
                        uh0Var2.K = -1;
                        uh0Var2.v = false;
                        uh0Var2.H.setLoading(false);
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
                                uh0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = uh0Var2.e;
                            } else {
                                arrayList = uh0Var2.f30942n;
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
                                    uh0Var2.f30943r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    uh0Var2.f30944s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    uh0Var2.f30943r = 0;
                                    z12 = true;
                                    uh0Var2.f30944s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        uh0Var2.f30943r = 0;
                                        uh0Var2.f30944s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    uh0Var2.f30941f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    uh0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    uh0Var2.f30941f = 0;
                                    uh0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    uh0Var2.f30941f = 0;
                                    uh0Var2.h = true;
                                }
                            }
                            uh0Var2.d();
                            if (isEmpty) {
                                c71Var.u0(0);
                            }
                            c71Var.W2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !uh0Var2.f30944s : !uh0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new ai.y7(uh0Var2, z16, arrayList, 25));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                xc.a0(uh0Var2.f30938a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = uh0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    uh0Var2.d.stars_amount = parseInt2;
                                }
                                uh0Var2.d();
                                c71Var.W2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            uh0Var2.d();
                            c71Var.W2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            uh0Var2.d();
                            c71Var.W2.N(true);
                            ai.ga.y(i10, false).q(true, true, new ai.v3(uh0Var2, j11, 26));
                        }
                    }
                });
                return;
        }
    }

    public i7(uh0 uh0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = uh0Var;
        this.f27147f = messagesController;
        this.f27145b = z10;
        this.f27148g = tL_channels_searchPosts;
        this.f27146c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
