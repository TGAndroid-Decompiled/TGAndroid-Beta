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
public final class o80 extends org.telegram.ui.ActionBar.f3 {
    public static final int f26833r = 0;
    public final String f26834b;
    public final org.telegram.ui.ActionBar.n2 f26835c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f26836f;
    public final RadialProgressView h;
    public xc f26837n;

    public o80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.f6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.f6):void");
    }

    public static void m(o80 o80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        o80 o80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(o80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                i80 i80Var = new i80(o80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                o80Var2 = o80Var;
                AndroidUtilities.runOnUIThread(i80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) o80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        o80Var2 = o80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) o80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void n(o80 o80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = o80Var.f26835c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(o80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(o80Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f18328id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    o80Var.getClass();
                    Bundle e = v7.j0.e(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(o80Var.currentAccount);
                    org.telegram.ui.ActionBar.n2 n2Var2 = o80Var.f26835c;
                    if (messagesController.checkCanOpenChat(e, n2Var2)) {
                        n2Var2.presentFragment(new n80(o80Var, e, z10, j3), n2Var2 instanceof org.telegram.ui.zn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            d5.f0(o80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(o80 o80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(o80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(o80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(o80 o80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(o80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(o80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(o80 o80Var, long j3) {
        o80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = o80Var.f26834b;
        ConnectionsManager.getInstance(o80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new l80(o80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void r(o80 o80Var, boolean z10, long j3) {
        TLRPC.Chat chat = o80Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(o80Var) {
            public final o80 f26346b;

            {
                this.f26346b = o80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o80 o80Var2 = this.f26346b;
                        if (!o80Var2.isDismissed()) {
                            o80Var2.f26836f.setVisibility(4);
                            o80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f26346b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (o80Var.d == null && chat != null) {
            MessagesController.getInstance(o80Var.currentAccount).addUserToChat(chat.f18328id, UserConfig.getInstance(o80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(o80Var) {
                public final o80 f26346b;

                {
                    this.f26346b = o80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            o80 o80Var2 = this.f26346b;
                            if (!o80Var2.isDismissed()) {
                                o80Var2.f26836f.setVisibility(4);
                                o80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f26346b.dismiss();
                            return;
                    }
                }
            }, new ai.k(8, o80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = o80Var.f26834b;
        ConnectionsManager.getInstance(o80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.v9(o80Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(o80 o80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        o80 o80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(o80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            i80 i80Var = new i80(o80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            o80Var2 = o80Var;
            AndroidUtilities.runOnUIThread(i80Var);
            AndroidUtilities.runOnUIThread(new ai.s4(o80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        o80Var2 = o80Var;
        AndroidUtilities.runOnUIThread(new ai.s4(o80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void t(o80 o80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = o80Var.f26835c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    o80Var.setOnDismissListener(new j80(1, o80Var, z10));
                } else {
                    d5.f0(o80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            o80Var.dismiss();
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
        mc mcVar = new mc(context, n2Var.getResourceProvider());
        mcVar.f26377a.f(R.raw.timer_3, 28, 28, null);
        mcVar.f26378b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        mcVar.f26379c.setText(string);
        xcVar.b(mcVar, 2750).j();
    }
}
