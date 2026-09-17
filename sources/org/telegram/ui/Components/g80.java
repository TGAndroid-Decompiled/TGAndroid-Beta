package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g80 extends org.telegram.ui.ActionBar.g3 {
    public static final int f24112r = 0;
    public final String f24113b;
    public final org.telegram.ui.ActionBar.o2 f24114c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f24115f;
    public final RadialProgressView h;
    public vc f24116n;

    public g80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.o2 r30, org.telegram.ui.ActionBar.f6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.f6):void");
    }

    public static void m(g80 g80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        g80 g80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(g80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                a80 a80Var = new a80(g80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                g80Var2 = g80Var;
                AndroidUtilities.runOnUIThread(a80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) g80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        g80Var2 = g80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) g80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void n(g80 g80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = g80Var.f24114c;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(g80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(g80Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f18121id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    g80Var.getClass();
                    Bundle e = w.f.e(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(g80Var.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var2 = g80Var.f24114c;
                    if (messagesController.checkCanOpenChat(e, o2Var2)) {
                        o2Var2.presentFragment(new f80(g80Var, e, z10, j3), o2Var2 instanceof org.telegram.ui.bo);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            c5.f0(g80Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(g80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(g80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(g80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(g80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(g80 g80Var, long j3) {
        g80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = g80Var.f24113b;
        ConnectionsManager.getInstance(g80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new d80(g80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void r(g80 g80Var, boolean z10, long j3) {
        TLRPC.Chat chat = g80Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(g80Var) {
            public final g80 f23509b;

            {
                this.f23509b = g80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g80 g80Var2 = this.f23509b;
                        if (!g80Var2.isDismissed()) {
                            g80Var2.f24115f.setVisibility(4);
                            g80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f23509b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (g80Var.d == null && chat != null) {
            MessagesController.getInstance(g80Var.currentAccount).addUserToChat(chat.f18121id, UserConfig.getInstance(g80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(g80Var) {
                public final g80 f23509b;

                {
                    this.f23509b = g80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            g80 g80Var2 = this.f23509b;
                            if (!g80Var2.isDismissed()) {
                                g80Var2.f24115f.setVisibility(4);
                                g80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f23509b.dismiss();
                            return;
                    }
                }
            }, new ai.k(8, g80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = g80Var.f24113b;
        ConnectionsManager.getInstance(g80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.v9(g80Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        g80 g80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(g80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            a80 a80Var = new a80(g80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            g80Var2 = g80Var;
            AndroidUtilities.runOnUIThread(a80Var);
            AndroidUtilities.runOnUIThread(new ai.s4(g80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
        }
        g80Var2 = g80Var;
        AndroidUtilities.runOnUIThread(new ai.s4(g80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
    }

    public static void t(g80 g80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = g80Var.f24114c;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    g80Var.setOnDismissListener(new b80(1, g80Var, z10));
                } else {
                    c5.f0(g80Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            g80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.o2 o2Var, vc vcVar, boolean z10) {
        String string;
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (vcVar == null) {
            vcVar = vc.a0(o2Var);
        }
        lc lcVar = new lc(context, o2Var.getResourceProvider());
        lcVar.f25887a.f(R.raw.timer_3, 28, 28, null);
        lcVar.f25888b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        lcVar.f25889c.setText(string);
        vcVar.b(lcVar, 2750).j();
    }
}
