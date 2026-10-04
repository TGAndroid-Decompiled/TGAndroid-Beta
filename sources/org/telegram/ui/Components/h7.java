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
public final class h7 implements RequestDelegate {
    public final int f27030a = 0;
    public final boolean f27031b;
    public final boolean f27032c;
    public final long d;
    public final KeyEvent.Callback f27033e;
    public final Object f27034f;
    public final Object f27035g;
    public final Object h;

    public h7(j8 j8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f27033e = j8Var;
        this.f27031b = z10;
        this.f27034f = messageObject;
        this.f27032c = z11;
        this.f27035g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27030a) {
            case 0:
                j8.y((j8) this.f27033e, this.f27031b, (MessageObject) this.f27034f, this.f27032c, (Runnable) this.f27035g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final lh0 lh0Var = (lh0) this.f27033e;
                final MessagesController messagesController = (MessagesController) this.f27034f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27035g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27031b;
                final boolean z11 = this.f27032c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        lh0 lh0Var2 = lh0.this;
                        int i10 = lh0Var2.f28365b;
                        c71 c71Var = lh0Var2.f28366c;
                        lh0Var2.K = -1;
                        lh0Var2.v = false;
                        lh0Var2.H.setLoading(false);
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
                                lh0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = lh0Var2.f28367e;
                            } else {
                                arrayList = lh0Var2.f28369n;
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
                                    lh0Var2.f28370r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    lh0Var2.f28371s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    lh0Var2.f28370r = 0;
                                    z12 = true;
                                    lh0Var2.f28371s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        lh0Var2.f28370r = 0;
                                        lh0Var2.f28371s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    lh0Var2.f28368f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    lh0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    lh0Var2.f28368f = 0;
                                    lh0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    lh0Var2.f28368f = 0;
                                    lh0Var2.h = true;
                                }
                            }
                            lh0Var2.d();
                            if (isEmpty) {
                                c71Var.v0(0);
                            }
                            c71Var.f25244f3.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !lh0Var2.f28371s : !lh0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new ci.y0(lh0Var2, z16, arrayList, 23));
                            }
                            if (z11 && j10 > 0 && !z16) {
                                yc.a0(lh0Var2.f28364a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = lh0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    lh0Var2.d.stars_amount = parseInt2;
                                }
                                lh0Var2.d();
                                c71Var.f25244f3.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            lh0Var2.d();
                            c71Var.f25244f3.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            lh0Var2.d();
                            c71Var.f25244f3.N(true);
                            yh.t5.y(i10, false).q(true, true, new ai.j(lh0Var2, j10, 22));
                        }
                    }
                });
                return;
        }
    }

    public h7(lh0 lh0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f27033e = lh0Var;
        this.f27034f = messagesController;
        this.f27031b = z10;
        this.f27035g = tL_channels_searchPosts;
        this.f27032c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
