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
public final class m90 extends org.telegram.ui.ActionBar.e3 {
    public static final int f28448r = 0;
    public final String f28449b;
    public final org.telegram.ui.ActionBar.m2 f28450c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f28451e;
    public final TextView f28452f;
    public final RadialProgressView h;
    public zc f28453n;

    public m90(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.m2 r30, org.telegram.ui.ActionBar.c6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.c6):void");
    }

    public static void o(m90 m90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        m90 m90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(m90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                g90 g90Var = new g90(m90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                m90Var2 = m90Var;
                AndroidUtilities.runOnUIThread(g90Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) m90Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        m90Var2 = m90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) m90Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void p(m90 m90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = m90Var.f28450c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(m90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(m90Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f19802id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    m90Var.getClass();
                    Bundle f7 = sc.v.f(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(m90Var.currentAccount);
                    org.telegram.ui.ActionBar.m2 m2Var2 = m90Var.f28450c;
                    if (messagesController.checkCanOpenChat(f7, m2Var2)) {
                        m2Var2.presentFragment(new l90(m90Var, f7, z10, j3), m2Var2 instanceof org.telegram.ui.eo);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            g5.e0(m90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void q(m90 m90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(m90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(m90Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(m90 m90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(m90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(m90Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void s(m90 m90Var, long j3) {
        m90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = m90Var.f28449b;
        ConnectionsManager.getInstance(m90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new j90(m90Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void t(m90 m90Var, boolean z10, long j3) {
        TLRPC.Chat chat = m90Var.f28451e;
        AndroidUtilities.runOnUIThread(new Runnable(m90Var) {
            public final m90 f27792b;

            {
                this.f27792b = m90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m90 m90Var2 = this.f27792b;
                        if (!m90Var2.isDismissed()) {
                            m90Var2.f28452f.setVisibility(4);
                            m90Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f27792b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (m90Var.d == null && chat != null) {
            MessagesController.getInstance(m90Var.currentAccount).addUserToChat(chat.f19802id, UserConfig.getInstance(m90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(m90Var) {
                public final m90 f27792b;

                {
                    this.f27792b = m90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            m90 m90Var2 = this.f27792b;
                            if (!m90Var2.isDismissed()) {
                                m90Var2.f28452f.setVisibility(4);
                                m90Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f27792b.dismiss();
                            return;
                    }
                }
            }, new ai.k(9, m90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = m90Var.f28449b;
        ConnectionsManager.getInstance(m90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.ba(m90Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void u(m90 m90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        m90 m90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(m90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            g90 g90Var = new g90(m90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            m90Var2 = m90Var;
            AndroidUtilities.runOnUIThread(g90Var);
            AndroidUtilities.runOnUIThread(new ai.t4(m90Var2, tL_error, z10, tL_messages_importChatInvite, 18));
        }
        m90Var2 = m90Var;
        AndroidUtilities.runOnUIThread(new ai.t4(m90Var2, tL_error, z10, tL_messages_importChatInvite, 18));
    }

    public static void v(m90 m90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = m90Var.f28450c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    m90Var.setOnDismissListener(new h90(1, m90Var, z10));
                } else {
                    g5.e0(m90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            m90Var.dismiss();
        }
    }

    public static CharSequence x(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void y(Context context, org.telegram.ui.ActionBar.m2 m2Var, zc zcVar, boolean z10) {
        String string;
        if (context == null) {
            if (m2Var != null) {
                m2Var.getContext();
                return;
            }
            return;
        }
        if (zcVar == null) {
            zcVar = zc.a0(m2Var);
        }
        pc pcVar = new pc(context, m2Var.getResourceProvider());
        pcVar.f29480a.f(R.raw.timer_3, 28, 28, null);
        pcVar.f29481b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        pcVar.f29482c.setText(string);
        zcVar.b(pcVar, 2750).j();
    }
}
