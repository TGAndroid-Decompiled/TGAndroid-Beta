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
public final class g7 implements RequestDelegate {
    public final int f28770a = 0;
    public final boolean f28771b;
    public final boolean f28772c;
    public final long d;
    public final KeyEvent.Callback f28773e;
    public final Object f28774f;
    public final Object f28775g;
    public final Object h;

    public g7(g8 g8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.f28773e = g8Var;
        this.f28771b = z10;
        this.f28774f = messageObject;
        this.f28772c = z11;
        this.f28775g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f28770a) {
            case 0:
                g8.y((g8) this.f28773e, this.f28771b, (MessageObject) this.f28774f, this.f28772c, (Runnable) this.f28775g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final ug0 ug0Var = (ug0) this.f28773e;
                final MessagesController messagesController = (MessagesController) this.f28774f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f28775g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f28771b;
                final boolean z11 = this.f28772c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        ug0 ug0Var2 = ug0.this;
                        int i10 = ug0Var2.f33223b;
                        u51 u51Var = ug0Var2.f33224c;
                        ug0Var2.G = -1;
                        ug0Var2.v = false;
                        ug0Var2.D.setLoading(false);
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
                                ug0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = ug0Var2.f33225e;
                            } else {
                                arrayList = ug0Var2.f33227n;
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
                                    ug0Var2.f33228r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    ug0Var2.f33229s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    ug0Var2.f33228r = 0;
                                    z12 = true;
                                    ug0Var2.f33229s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        ug0Var2.f33228r = 0;
                                        ug0Var2.f33229s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    ug0Var2.f33226f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    ug0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    ug0Var2.f33226f = 0;
                                    ug0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    ug0Var2.f33226f = 0;
                                    ug0Var2.h = true;
                                }
                            }
                            ug0Var2.d();
                            if (isEmpty) {
                                u51Var.u0(0);
                            }
                            u51Var.U2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !ug0Var2.f33229s : !ug0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new jh.r5(ug0Var2, z16, arrayList, 20));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                tc.a0(ug0Var2.f33222a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = ug0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    ug0Var2.d.stars_amount = parseInt2;
                                }
                                ug0Var2.d();
                                u51Var.U2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            ug0Var2.d();
                            u51Var.U2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            ug0Var2.d();
                            u51Var.U2.N(true);
                            jh.s7.y(i10, false).q(true, true, new eg.z1(ug0Var2, j11, 22));
                        }
                    }
                });
                return;
        }
    }

    public g7(ug0 ug0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.f28773e = ug0Var;
        this.f28774f = messagesController;
        this.f28771b = z10;
        this.f28775g = tL_channels_searchPosts;
        this.f28772c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
