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
public final class t80 extends org.telegram.ui.ActionBar.e3 {
    public static final int f28494r = 0;
    public final String f28495b;
    public final org.telegram.ui.ActionBar.m2 f28496c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f28497f;
    public final RadialProgressView h;
    public yc f28498n;

    public t80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.m2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void m(t80 t80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        t80 t80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(t80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                n80 n80Var = new n80(t80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                t80Var2 = t80Var;
                AndroidUtilities.runOnUIThread(n80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(t80Var2, tL_error, updates, tL_messages_importChatInvite, 26));
            }
        }
        t80Var2 = t80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(t80Var2, tL_error, updates, tL_messages_importChatInvite, 26));
    }

    public static void n(t80 t80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = t80Var.f28496c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(t80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(t80Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f18337id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    t80Var.getClass();
                    Bundle e = v7.j.e(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(t80Var.currentAccount);
                    org.telegram.ui.ActionBar.m2 m2Var2 = t80Var.f28496c;
                    if (messagesController.checkCanOpenChat(e, m2Var2)) {
                        m2Var2.presentFragment(new s80(t80Var, e, z10, j3), m2Var2 instanceof org.telegram.ui.wn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            e5.f0(t80Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(t80 t80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(t80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(t80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(t80 t80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(t80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(t80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(t80 t80Var, long j3) {
        t80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = t80Var.f28495b;
        ConnectionsManager.getInstance(t80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new q80(t80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void r(t80 t80Var, boolean z10, long j3) {
        TLRPC.Chat chat = t80Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(t80Var) {
            public final t80 f27922b;

            {
                this.f27922b = t80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t80 t80Var2 = this.f27922b;
                        if (!t80Var2.isDismissed()) {
                            t80Var2.f28497f.setVisibility(4);
                            t80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f27922b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (t80Var.d == null && chat != null) {
            MessagesController.getInstance(t80Var.currentAccount).addUserToChat(chat.f18337id, UserConfig.getInstance(t80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(t80Var) {
                public final t80 f27922b;

                {
                    this.f27922b = t80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            t80 t80Var2 = this.f27922b;
                            if (!t80Var2.isDismissed()) {
                                t80Var2.f28497f.setVisibility(4);
                                t80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f27922b.dismiss();
                            return;
                    }
                }
            }, new ai.k(9, t80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = t80Var.f28495b;
        ConnectionsManager.getInstance(t80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.v9(t80Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(t80 t80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        t80 t80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(t80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            n80 n80Var = new n80(t80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            t80Var2 = t80Var;
            AndroidUtilities.runOnUIThread(n80Var);
            AndroidUtilities.runOnUIThread(new ai.s4(t80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        t80Var2 = t80Var;
        AndroidUtilities.runOnUIThread(new ai.s4(t80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void t(t80 t80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = t80Var.f28496c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    t80Var.setOnDismissListener(new o80(1, t80Var, z10));
                } else {
                    e5.f0(t80Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            t80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.m2 m2Var, yc ycVar, boolean z10) {
        String string;
        if (context == null) {
            if (m2Var != null) {
                m2Var.getContext();
                return;
            }
            return;
        }
        if (ycVar == null) {
            ycVar = yc.a0(m2Var);
        }
        nc ncVar = new nc(context, m2Var.getResourceProvider());
        ncVar.f26735a.f(R.raw.timer_3, 28, 28, null);
        ncVar.f26736b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        ncVar.f26737c.setText(string);
        ycVar.b(ncVar, 2750).j();
    }
}
