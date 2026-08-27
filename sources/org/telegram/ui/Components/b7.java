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

    public final int f26954a = 0;

    public final boolean f26955b;

    public final boolean f26956c;
    public final long d;

    public final KeyEvent.Callback f26957e;

    public final Object f26958f;

    public final Object f26959g;
    public final Object h;

    public b7(b8 b8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.f26957e = b8Var;
        this.f26955b = z10;
        this.f26958f = messageObject;
        this.f26956c = z11;
        this.f26959g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f26954a) {
            case 0:
                b8.z((b8) this.f26957e, this.f26955b, (MessageObject) this.f26958f, this.f26956c, (Runnable) this.f26959g, this.d, (TLRPC.Document) this.h, tL_error);
                break;
            default:
                final mg0 mg0Var = (mg0) this.f26957e;
                final MessagesController messagesController = (MessagesController) this.f26958f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f26959g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f26955b;
                final boolean z11 = this.f26956c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z12;
                        mg0 mg0Var2 = mg0Var;
                        int i10 = mg0Var2.f30676b;
                        k51 k51Var = mg0Var2.f30677c;
                        mg0Var2.G = -1;
                        mg0Var2.v = false;
                        mg0Var2.D.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    mg0Var2.d();
                                    k51Var.U2.N(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    mg0Var2.d();
                                    k51Var.U2.N(true);
                                    hh.u7.y(i10, false).q(true, true, new cg.b2(mg0Var2, j11, 24));
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int i11 = Integer.parseInt(matcher.group(1));
                            int i12 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = mg0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + i11;
                                mg0Var2.d.stars_amount = i12;
                            }
                            mg0Var2.d();
                            k51Var.U2.N(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        MessagesController messagesController2 = messagesController;
                        messagesController2.putUsers(arrayList, false);
                        messagesController2.putChats(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            mg0Var2.d = searchPostsFlood2;
                        }
                        boolean z14 = z10;
                        ArrayList arrayList2 = z14 ? mg0Var2.f30678e : mg0Var2.f30680n;
                        boolean zIsEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList3.get(i13);
                            i13++;
                            MessageObject messageObject = new MessageObject(i10, message, false, false);
                            if (!z14) {
                                messageObject.setQuery(tL_channels_searchPosts.query);
                            }
                            arrayList2.add(messageObject);
                        }
                        if (z14) {
                            z12 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                mg0Var2.f30679f = messages_messages.next_rate;
                                mg0Var2.h = (messages_messages.flags & 1) == 0;
                            } else if ((messages_messages instanceof TLRPC.TL_messages_messages) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) {
                                mg0Var2.f30679f = 0;
                                mg0Var2.h = true;
                            }
                        } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            mg0Var2.f30681r = messages_messages.next_rate;
                            mg0Var2.f30682s = (messages_messages.flags & 1) == 0;
                            z12 = true;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            mg0Var2.f30681r = 0;
                            z12 = true;
                            mg0Var2.f30682s = true;
                        } else {
                            z12 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                mg0Var2.f30681r = 0;
                                mg0Var2.f30682s = true;
                            }
                        }
                        mg0Var2.d();
                        if (zIsEmpty) {
                            k51Var.u0(0);
                        }
                        k51Var.U2.N(z12);
                        if (!arrayList2.isEmpty() && (!z14 ? !mg0Var2.f30682s : !mg0Var2.h)) {
                            AndroidUtilities.runOnUIThread(new hh.t5(mg0Var2, z14, arrayList2, 20));
                        }
                        if (!z11 || j11 <= 0 || z14) {
                            return;
                        }
                        mc.a0(mg0Var2.f30675a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
                    }
                });
                break;
        }
    }

    public b7(mg0 mg0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.f26957e = mg0Var;
        this.f26958f = messagesController;
        this.f26955b = z10;
        this.f26959g = tL_channels_searchPosts;
        this.f26956c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
