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
public final class u80 extends org.telegram.ui.ActionBar.f3 {
    public static final int f31319r = 0;
    public final String f31320b;
    public final org.telegram.ui.ActionBar.n2 f31321c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f31322e;
    public final TextView f31323f;
    public final RadialProgressView h;
    public yc f31324n;

    public u80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void m(u80 u80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        u80 u80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(u80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                o80 o80Var = new o80(u80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                u80Var2 = u80Var;
                AndroidUtilities.runOnUIThread(o80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) u80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        u80Var2 = u80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) u80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void n(u80 u80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = u80Var.f31321c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(u80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(u80Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f20038id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    u80Var.getClass();
                    Bundle f7 = t8.b.f(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(u80Var.currentAccount);
                    org.telegram.ui.ActionBar.n2 n2Var2 = u80Var.f31321c;
                    if (messagesController.checkCanOpenChat(f7, n2Var2)) {
                        n2Var2.presentFragment(new t80(u80Var, f7, z10, j3), n2Var2 instanceof org.telegram.ui.yn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            e5.f0(u80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(u80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(u80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(u80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(u80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(u80 u80Var, long j3) {
        u80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = u80Var.f31320b;
        ConnectionsManager.getInstance(u80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new r80(u80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void r(u80 u80Var, boolean z10, long j3) {
        TLRPC.Chat chat = u80Var.f31322e;
        AndroidUtilities.runOnUIThread(new Runnable(u80Var) {
            public final u80 f30649b;

            {
                this.f30649b = u80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u80 u80Var2 = this.f30649b;
                        if (!u80Var2.isDismissed()) {
                            u80Var2.f31323f.setVisibility(4);
                            u80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f30649b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (u80Var.d == null && chat != null) {
            MessagesController.getInstance(u80Var.currentAccount).addUserToChat(chat.f20038id, UserConfig.getInstance(u80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(u80Var) {
                public final u80 f30649b;

                {
                    this.f30649b = u80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            u80 u80Var2 = this.f30649b;
                            if (!u80Var2.isDismissed()) {
                                u80Var2.f31323f.setVisibility(4);
                                u80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f30649b.dismiss();
                            return;
                    }
                }
            }, new ai.k(9, u80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = u80Var.f31320b;
        ConnectionsManager.getInstance(u80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.v9(u80Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(u80 u80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        u80 u80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(u80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            o80 o80Var = new o80(u80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            u80Var2 = u80Var;
            AndroidUtilities.runOnUIThread(o80Var);
            AndroidUtilities.runOnUIThread(new ai.s4(u80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        u80Var2 = u80Var;
        AndroidUtilities.runOnUIThread(new ai.s4(u80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void t(u80 u80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = u80Var.f31321c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    u80Var.setOnDismissListener(new p80(1, u80Var, z10));
                } else {
                    e5.f0(u80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            u80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.n2 n2Var, yc ycVar, boolean z10) {
        String string;
        if (context == null) {
            if (n2Var != null) {
                n2Var.getContext();
                return;
            }
            return;
        }
        if (ycVar == null) {
            ycVar = yc.a0(n2Var);
        }
        oc ocVar = new oc(context, n2Var.getResourceProvider());
        ocVar.f29328a.f(R.raw.timer_3, 28, 28, null);
        ocVar.f29329b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        ocVar.f29330c.setText(string);
        ycVar.b(ocVar, 2750).j();
    }
}
