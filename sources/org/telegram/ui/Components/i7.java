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
    public final int f26977a = 0;
    public final boolean f26978b;
    public final boolean f26979c;
    public final long d;
    public final KeyEvent.Callback f26980e;
    public final Object f26981f;
    public final Object f26982g;
    public final Object h;

    public i7(k8 k8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f26980e = k8Var;
        this.f26978b = z10;
        this.f26981f = messageObject;
        this.f26979c = z11;
        this.f26982g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f26977a) {
            case 0:
                k8.y((k8) this.f26980e, this.f26978b, (MessageObject) this.f26981f, this.f26979c, (Runnable) this.f26982g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final yg0 yg0Var = (yg0) this.f26980e;
                final MessagesController messagesController = (MessagesController) this.f26981f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f26982g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f26978b;
                final boolean z11 = this.f26979c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        yg0 yg0Var2 = yg0.this;
                        int i10 = yg0Var2.f32908b;
                        d61 d61Var = yg0Var2.f32909c;
                        yg0Var2.K = -1;
                        yg0Var2.v = false;
                        yg0Var2.H.setLoading(false);
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
                                yg0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = yg0Var2.f32910e;
                            } else {
                                arrayList = yg0Var2.f32912n;
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
                                    yg0Var2.f32913r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    yg0Var2.f32914s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    yg0Var2.f32913r = 0;
                                    z12 = true;
                                    yg0Var2.f32914s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        yg0Var2.f32913r = 0;
                                        yg0Var2.f32914s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    yg0Var2.f32911f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    yg0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    yg0Var2.f32911f = 0;
                                    yg0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    yg0Var2.f32911f = 0;
                                    yg0Var2.h = true;
                                }
                            }
                            yg0Var2.d();
                            if (isEmpty) {
                                d61Var.u0(0);
                            }
                            d61Var.Y2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !yg0Var2.f32914s : !yg0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new di.y0(yg0Var2, z16, arrayList, 22));
                            }
                            if (z11 && j10 > 0 && !z16) {
                                yc.a0(yg0Var2.f32907a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = yg0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    yg0Var2.d.stars_amount = parseInt2;
                                }
                                yg0Var2.d();
                                d61Var.Y2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            yg0Var2.d();
                            d61Var.Y2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            yg0Var2.d();
                            d61Var.Y2.N(true);
                            zh.s5.y(i10, false).q(true, true, new bi.g(yg0Var2, j10, 22));
                        }
                    }
                });
                return;
        }
    }

    public i7(yg0 yg0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f26980e = yg0Var;
        this.f26981f = messagesController;
        this.f26978b = z10;
        this.f26982g = tL_channels_searchPosts;
        this.f26979c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
