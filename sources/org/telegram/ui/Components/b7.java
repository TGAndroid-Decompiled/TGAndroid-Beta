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
public final class b7 implements RequestDelegate {
    public final int f27058a = 0;
    public final boolean f27059b;
    public final boolean f27060c;
    public final long d;
    public final KeyEvent.Callback f27061e;
    public final Object f27062f;
    public final Object f27063g;
    public final Object h;

    public b7(c8 c8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.f27061e = c8Var;
        this.f27059b = z10;
        this.f27062f = messageObject;
        this.f27060c = z11;
        this.f27063g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27058a) {
            case 0:
                c8.y((c8) this.f27061e, this.f27059b, (MessageObject) this.f27062f, this.f27060c, (Runnable) this.f27063g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final kg0 kg0Var = (kg0) this.f27061e;
                final MessagesController messagesController = (MessagesController) this.f27062f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27063g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27059b;
                final boolean z11 = this.f27060c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        kg0 kg0Var2 = kg0.this;
                        int i9 = kg0Var2.f30077b;
                        i51 i51Var = kg0Var2.f30078c;
                        kg0Var2.G = -1;
                        kg0Var2.v = false;
                        kg0Var2.D.setLoading(false);
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
                                kg0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = kg0Var2.f30079e;
                            } else {
                                arrayList = kg0Var2.f30081n;
                            }
                            boolean isEmpty = arrayList.isEmpty();
                            ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                            int size = arrayList3.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TLRPC.Message message = arrayList3.get(i10);
                                i10++;
                                MessageObject messageObject = new MessageObject(i9, message, false, false);
                                if (!z16) {
                                    messageObject.setQuery(tL_channels_searchPosts.query);
                                }
                                arrayList.add(messageObject);
                            }
                            if (!z16) {
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    kg0Var2.f30082r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    kg0Var2.f30083s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    kg0Var2.f30082r = 0;
                                    z12 = true;
                                    kg0Var2.f30083s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        kg0Var2.f30082r = 0;
                                        kg0Var2.f30083s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    kg0Var2.f30080f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    kg0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    kg0Var2.f30080f = 0;
                                    kg0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    kg0Var2.f30080f = 0;
                                    kg0Var2.h = true;
                                }
                            }
                            kg0Var2.d();
                            if (isEmpty) {
                                i51Var.u0(0);
                            }
                            i51Var.U2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !kg0Var2.f30083s : !kg0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new gh.u5(kg0Var2, z16, arrayList, 20));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                oc.a0(kg0Var2.f30076a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = kg0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    kg0Var2.d.stars_amount = parseInt2;
                                }
                                kg0Var2.d();
                                i51Var.U2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            kg0Var2.d();
                            i51Var.U2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            kg0Var2.d();
                            i51Var.U2.N(true);
                            gh.v7.y(i9, false).q(true, true, new bg.i2(kg0Var2, j11, 24));
                        }
                    }
                });
                return;
        }
    }

    public b7(kg0 kg0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.f27061e = kg0Var;
        this.f27062f = messagesController;
        this.f27059b = z10;
        this.f27063g = tL_channels_searchPosts;
        this.f27060c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
