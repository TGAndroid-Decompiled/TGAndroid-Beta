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
    public final int f23256a = 1;
    public final boolean f23257b;
    public final boolean f23258c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f23259f;
    public final Object f23260g;
    public final Object h;

    public g7(j8 j8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.e = j8Var;
        this.f23257b = z10;
        this.f23259f = messageObject;
        this.f23258c = z11;
        this.f23260g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f23256a) {
            case 0:
                j8.y((j8) this.e, this.f23257b, (MessageObject) this.f23259f, this.f23258c, (Runnable) this.f23260g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final ih0 ih0Var = (ih0) this.e;
                final MessagesController messagesController = (MessagesController) this.f23259f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f23260g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f23257b;
                final boolean z11 = this.f23258c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        ih0 ih0Var2 = ih0.this;
                        int i10 = ih0Var2.f24021b;
                        r61 r61Var = ih0Var2.f24022c;
                        ih0Var2.K = -1;
                        ih0Var2.v = false;
                        ih0Var2.H.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z15 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j10 = j3;
                        if (z15) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                            ArrayList<TLRPC.User> arrayList2 = messages_messages.users;
                            MessagesController messagesController2 = messagesController;
                            messagesController2.putUsers(arrayList2, false);
                            messagesController2.putChats(messages_messages.chats, false);
                            TLRPC.SearchPostsFlood searchPostsFlood = messages_messages.search_flood;
                            if (searchPostsFlood != null) {
                                ih0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = ih0Var2.e;
                            } else {
                                arrayList = ih0Var2.f24024n;
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
                                    ih0Var2.f24025r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    ih0Var2.f24026s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    ih0Var2.f24025r = 0;
                                    z12 = true;
                                    ih0Var2.f24026s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        ih0Var2.f24025r = 0;
                                        ih0Var2.f24026s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    ih0Var2.f24023f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    ih0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    ih0Var2.f24023f = 0;
                                    ih0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    ih0Var2.f24023f = 0;
                                    ih0Var2.h = true;
                                }
                            }
                            ih0Var2.d();
                            if (isEmpty) {
                                r61Var.u0(0);
                            }
                            r61Var.Y2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !ih0Var2.f24026s : !ih0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new bi.c1(ih0Var2, z16, arrayList, 22));
                            }
                            if (z11 && j10 > 0 && !z16) {
                                wc.a0(ih0Var2.f24020a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = ih0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    ih0Var2.d.stars_amount = parseInt2;
                                }
                                ih0Var2.d();
                                r61Var.Y2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            ih0Var2.d();
                            r61Var.Y2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            ih0Var2.d();
                            r61Var.Y2.N(true);
                            xh.v5.y(i10, false).q(true, true, new bi.va(ih0Var2, j10, 17));
                        }
                    }
                });
                return;
        }
    }

    public g7(ih0 ih0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.e = ih0Var;
        this.f23259f = messagesController;
        this.f23257b = z10;
        this.f23260g = tL_channels_searchPosts;
        this.f23258c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
