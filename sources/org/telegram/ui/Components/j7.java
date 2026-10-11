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
    public final int f27589a = 1;
    public final boolean f27590b;
    public final boolean f27591c;
    public final long d;
    public final KeyEvent.Callback f27592e;
    public final Object f27593f;
    public final Object f27594g;
    public final Object h;

    public j7(l8 l8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f27592e = l8Var;
        this.f27590b = z10;
        this.f27593f = messageObject;
        this.f27591c = z11;
        this.f27594g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27589a) {
            case 0:
                l8.B((l8) this.f27592e, this.f27590b, (MessageObject) this.f27593f, this.f27591c, (Runnable) this.f27594g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final ei0 ei0Var = (ei0) this.f27592e;
                final MessagesController messagesController = (MessagesController) this.f27593f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27594g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27590b;
                final boolean z11 = this.f27591c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        ei0 ei0Var2 = ei0.this;
                        int i10 = ei0Var2.f26017b;
                        m71 m71Var = ei0Var2.f26018c;
                        ei0Var2.K = -1;
                        ei0Var2.v = false;
                        ei0Var2.H.setLoading(false);
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
                                ei0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = ei0Var2.f26019e;
                            } else {
                                arrayList = ei0Var2.f26021n;
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
                                    ei0Var2.f26022r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    ei0Var2.f26023s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    ei0Var2.f26022r = 0;
                                    z12 = true;
                                    ei0Var2.f26023s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        ei0Var2.f26022r = 0;
                                        ei0Var2.f26023s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    ei0Var2.f26020f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    ei0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    ei0Var2.f26020f = 0;
                                    ei0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    ei0Var2.f26020f = 0;
                                    ei0Var2.h = true;
                                }
                            }
                            ei0Var2.d();
                            if (isEmpty) {
                                m71Var.u0(0);
                            }
                            m71Var.W2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !ei0Var2.f26023s : !ei0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new ci.x0(ei0Var2, z16, arrayList, 23));
                            }
                            if (z11 && j10 > 0 && !z16) {
                                ad.a0(ei0Var2.f26016a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = ei0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    ei0Var2.d.stars_amount = parseInt2;
                                }
                                ei0Var2.d();
                                m71Var.W2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            ei0Var2.d();
                            m71Var.W2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            ei0Var2.d();
                            m71Var.W2.N(true);
                            yh.n5.y(i10, false).q(true, true, new ai.j(ei0Var2, j10, 24));
                        }
                    }
                });
                return;
        }
    }

    public j7(ei0 ei0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f27592e = ei0Var;
        this.f27593f = messagesController;
        this.f27590b = z10;
        this.f27594g = tL_channels_searchPosts;
        this.f27591c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
