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
public final class h80 extends org.telegram.ui.ActionBar.f3 {
    public static final int f24563r = 0;
    public final String f24564b;
    public final org.telegram.ui.ActionBar.n2 f24565c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f24566f;
    public final RadialProgressView h;
    public xc f24567n;

    public h80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void m(h80 h80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        h80 h80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(h80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                b80 b80Var = new b80(h80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                h80Var2 = h80Var;
                AndroidUtilities.runOnUIThread(b80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) h80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        h80Var2 = h80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) h80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void n(h80 h80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = h80Var.f24565c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(h80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(h80Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f18083id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    h80Var.getClass();
                    Bundle e = w.c.e(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(h80Var.currentAccount);
                    org.telegram.ui.ActionBar.n2 n2Var2 = h80Var.f24565c;
                    if (messagesController.checkCanOpenChat(e, n2Var2)) {
                        n2Var2.presentFragment(new g80(h80Var, e, z10, j3), n2Var2 instanceof org.telegram.ui.xn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            e5.f0(h80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(h80 h80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(h80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(h80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(h80 h80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(h80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(h80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(h80 h80Var, long j3) {
        h80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = h80Var.f24564b;
        ConnectionsManager.getInstance(h80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new e80(h80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void r(h80 h80Var, boolean z10, long j3) {
        TLRPC.Chat chat = h80Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(h80Var) {
            public final h80 f23903b;

            {
                this.f23903b = h80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h80 h80Var2 = this.f23903b;
                        if (!h80Var2.isDismissed()) {
                            h80Var2.f24566f.setVisibility(4);
                            h80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f23903b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (h80Var.d == null && chat != null) {
            MessagesController.getInstance(h80Var.currentAccount).addUserToChat(chat.f18083id, UserConfig.getInstance(h80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(h80Var) {
                public final h80 f23903b;

                {
                    this.f23903b = h80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            h80 h80Var2 = this.f23903b;
                            if (!h80Var2.isDismissed()) {
                                h80Var2.f24566f.setVisibility(4);
                                h80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f23903b.dismiss();
                            return;
                    }
                }
            }, new ai.k(9, h80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = h80Var.f24564b;
        ConnectionsManager.getInstance(h80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.v9(h80Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(h80 h80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        h80 h80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(h80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            b80 b80Var = new b80(h80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            h80Var2 = h80Var;
            AndroidUtilities.runOnUIThread(b80Var);
            AndroidUtilities.runOnUIThread(new ai.s4(h80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
        }
        h80Var2 = h80Var;
        AndroidUtilities.runOnUIThread(new ai.s4(h80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
    }

    public static void t(h80 h80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = h80Var.f24565c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    h80Var.setOnDismissListener(new c80(1, h80Var, z10));
                } else {
                    e5.f0(h80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            h80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.n2 n2Var, xc xcVar, boolean z10) {
        String string;
        if (context == null) {
            if (n2Var != null) {
                n2Var.getContext();
                return;
            }
            return;
        }
        if (xcVar == null) {
            xcVar = xc.a0(n2Var);
        }
        nc ncVar = new nc(context, n2Var.getResourceProvider());
        ncVar.f26407a.f(R.raw.timer_3, 28, 28, null);
        ncVar.f26408b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        ncVar.f26409c.setText(string);
        xcVar.b(ncVar, 2750).j();
    }
}
