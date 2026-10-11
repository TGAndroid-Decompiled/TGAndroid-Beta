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
public final class j7 implements RequestDelegate {
    public final int f27625a = 1;
    public final boolean f27626b;
    public final boolean f27627c;
    public final long d;
    public final KeyEvent.Callback f27628e;
    public final Object f27629f;
    public final Object f27630g;
    public final Object h;

    public j7(l8 l8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f27628e = l8Var;
        this.f27626b = z10;
        this.f27629f = messageObject;
        this.f27627c = z11;
        this.f27630g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27625a) {
            case 0:
                l8.B((l8) this.f27628e, this.f27626b, (MessageObject) this.f27629f, this.f27627c, (Runnable) this.f27630g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final di0 di0Var = (di0) this.f27628e;
                final MessagesController messagesController = (MessagesController) this.f27629f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27630g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27626b;
                final boolean z11 = this.f27627c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        di0 di0Var2 = di0.this;
                        int i10 = di0Var2.f25780b;
                        l71 l71Var = di0Var2.f25781c;
                        di0Var2.K = -1;
                        di0Var2.v = false;
                        di0Var2.H.setLoading(false);
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
                                di0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = di0Var2.f25782e;
                            } else {
                                arrayList = di0Var2.f25784n;
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
                                    di0Var2.f25785r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    di0Var2.f25786s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    di0Var2.f25785r = 0;
                                    z12 = true;
                                    di0Var2.f25786s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        di0Var2.f25785r = 0;
                                        di0Var2.f25786s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    di0Var2.f25783f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    di0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    di0Var2.f25783f = 0;
                                    di0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    di0Var2.f25783f = 0;
                                    di0Var2.h = true;
                                }
                            }
                            di0Var2.d();
                            if (isEmpty) {
                                l71Var.u0(0);
                            }
                            l71Var.W2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !di0Var2.f25786s : !di0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new ci.x0(di0Var2, z16, arrayList, 24));
                            }
                            if (z11 && j10 > 0 && !z16) {
                                ad.a0(di0Var2.f25779a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = di0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    di0Var2.d.stars_amount = parseInt2;
                                }
                                di0Var2.d();
                                l71Var.W2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            di0Var2.d();
                            l71Var.W2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            di0Var2.d();
                            l71Var.W2.N(true);
                            yh.n5.y(i10, false).q(true, true, new ai.j(di0Var2, j10, 24));
                        }
                    }
                });
                return;
        }
    }

    public j7(di0 di0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f27628e = di0Var;
        this.f27629f = messagesController;
        this.f27626b = z10;
        this.f27630g = tL_channels_searchPosts;
        this.f27627c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
