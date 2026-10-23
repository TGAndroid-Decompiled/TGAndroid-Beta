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
    public final int f27229a = 0;
    public final boolean f27230b;
    public final boolean f27231c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f27232f;
    public final Object f27233g;
    public final Object h;

    public i7(k8 k8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = k8Var;
        this.f27230b = z10;
        this.f27232f = messageObject;
        this.f27231c = z11;
        this.f27233g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f27229a) {
            case 0:
                k8.p((k8) this.e, this.f27230b, (MessageObject) this.f27232f, this.f27231c, (Runnable) this.f27233g, this.d, (TLRPC.Document) this.h, tL_error);
                return;
            default:
                final xh0 xh0Var = (xh0) this.e;
                final MessagesController messagesController = (MessagesController) this.f27232f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f27233g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f27230b;
                final boolean z11 = this.f27231c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArrayList arrayList;
                        boolean z12;
                        boolean z13;
                        boolean z14;
                        xh0 xh0Var2 = xh0.this;
                        int i10 = xh0Var2.f32568b;
                        j71 j71Var = xh0Var2.f32569c;
                        xh0Var2.K = -1;
                        xh0Var2.v = false;
                        xh0Var2.H.setLoading(false);
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
                                xh0Var2.d = searchPostsFlood;
                            }
                            boolean z16 = z10;
                            if (z16) {
                                arrayList = xh0Var2.e;
                            } else {
                                arrayList = xh0Var2.f32571n;
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
                                    xh0Var2.f32572r = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    xh0Var2.f32573s = z14;
                                    z12 = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    xh0Var2.f32572r = 0;
                                    z12 = true;
                                    xh0Var2.f32573s = true;
                                } else {
                                    z12 = true;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        xh0Var2.f32572r = 0;
                                        xh0Var2.f32573s = true;
                                    }
                                }
                            } else {
                                z12 = true;
                                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                    xh0Var2.f32570f = messages_messages.next_rate;
                                    if ((messages_messages.flags & 1) == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    xh0Var2.h = z13;
                                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    xh0Var2.f32570f = 0;
                                    xh0Var2.h = true;
                                } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    xh0Var2.f32570f = 0;
                                    xh0Var2.h = true;
                                }
                            }
                            xh0Var2.d();
                            if (isEmpty) {
                                j71Var.u0(0);
                            }
                            j71Var.Z2.N(z12);
                            if (!arrayList.isEmpty() && (!z16 ? !xh0Var2.f32573s : !xh0Var2.h)) {
                                AndroidUtilities.runOnUIThread(new ai.y7(xh0Var2, z16, arrayList, 24));
                            }
                            if (z11 && j11 > 0 && !z16) {
                                xc.a0(xh0Var2.f32567a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
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
                                TLRPC.SearchPostsFlood searchPostsFlood2 = xh0Var2.d;
                                if (searchPostsFlood2 != null) {
                                    searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                                    searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                    xh0Var2.d.stars_amount = parseInt2;
                                }
                                xh0Var2.d();
                                j71Var.Z2.N(true);
                            }
                        } else if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                            xh0Var2.d();
                            j71Var.Z2.N(true);
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                            xh0Var2.d();
                            j71Var.Z2.N(true);
                            ai.ha.y(i10, false).q(true, true, new ai.v3(xh0Var2, j11, 26));
                        }
                    }
                });
                return;
        }
    }

    public i7(xh0 xh0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = xh0Var;
        this.f27232f = messagesController;
        this.f27230b = z10;
        this.f27233g = tL_channels_searchPosts;
        this.f27231c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
