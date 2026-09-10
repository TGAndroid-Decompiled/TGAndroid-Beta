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
public final class q80 extends org.telegram.ui.ActionBar.h3 {
    public static final int f26337r = 0;
    public final String f26338b;
    public final org.telegram.ui.ActionBar.p2 f26339c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f26340f;
    public final RadialProgressView h;
    public wc f26341n;

    public q80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.p2 r30, org.telegram.ui.ActionBar.f6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.p2, org.telegram.ui.ActionBar.f6):void");
    }

    public static void m(q80 q80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(q80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                AndroidUtilities.runOnUIThread(new j80(q80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1));
            }
            updates = null;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.da(q80Var, tL_error, updates, tL_messages_importChatInvite, false, 21));
    }

    public static void n(q80 q80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = q80Var.f26339c;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(q80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(q80Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f17195id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    q80Var.getClass();
                    Bundle e = w.f.e(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(q80Var.currentAccount);
                    org.telegram.ui.ActionBar.p2 p2Var2 = q80Var.f26339c;
                    if (messagesController.checkCanOpenChat(e, p2Var2)) {
                        p2Var2.presentFragment(new p80(q80Var, e, z10, j3), p2Var2 instanceof org.telegram.ui.eo);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            d5.f0(q80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(q80 q80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(q80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(q80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(q80 q80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(q80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(q80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(q80 q80Var, long j3) {
        q80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = q80Var.f26338b;
        ConnectionsManager.getInstance(q80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new n80(q80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void r(q80 q80Var, boolean z10, long j3) {
        TLRPC.Chat chat = q80Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(q80Var) {
            public final q80 f25696b;

            {
                this.f25696b = q80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        q80 q80Var2 = this.f25696b;
                        if (!q80Var2.isDismissed()) {
                            q80Var2.f26340f.setVisibility(4);
                            q80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f25696b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (q80Var.d == null && chat != null) {
            MessagesController.getInstance(q80Var.currentAccount).addUserToChat(chat.f17195id, UserConfig.getInstance(q80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(q80Var) {
                public final q80 f25696b;

                {
                    this.f25696b = q80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            q80 q80Var2 = this.f25696b;
                            if (!q80Var2.isDismissed()) {
                                q80Var2.f26340f.setVisibility(4);
                                q80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f25696b.dismiss();
                            return;
                    }
                }
            }, new gg.d0(7, q80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = q80Var.f26338b;
        ConnectionsManager.getInstance(q80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.ca(q80Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(q80 q80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        q80 q80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(q80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            j80 j80Var = new j80(q80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            q80Var2 = q80Var;
            AndroidUtilities.runOnUIThread(j80Var);
            AndroidUtilities.runOnUIThread(new bi.g2(q80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
        }
        q80Var2 = q80Var;
        AndroidUtilities.runOnUIThread(new bi.g2(q80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
    }

    public static void t(q80 q80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = q80Var.f26339c;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    q80Var.setOnDismissListener(new k80(1, q80Var, z10));
                } else {
                    d5.f0(q80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            q80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.p2 p2Var, wc wcVar, boolean z10) {
        String string;
        if (context == null) {
            if (p2Var != null) {
                p2Var.getContext();
                return;
            }
            return;
        }
        if (wcVar == null) {
            wcVar = wc.a0(p2Var);
        }
        mc mcVar = new mc(context, p2Var.getResourceProvider());
        mcVar.f25215a.f(R.raw.timer_3, 28, 28, null);
        mcVar.f25216b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        mcVar.f25217c.setText(string);
        wcVar.b(mcVar, 2750).j();
    }
}
