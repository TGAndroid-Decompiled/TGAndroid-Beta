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
public final class i90 extends org.telegram.ui.ActionBar.e3 {
    public static final int f27372r = 0;
    public final String f27373b;
    public final org.telegram.ui.ActionBar.m2 f27374c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f27375e;
    public final TextView f27376f;
    public final RadialProgressView h;
    public ad f27377n;

    public i90(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.m2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void o(i90 i90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        i90 i90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(i90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                c90 c90Var = new c90(i90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                i90Var2 = i90Var;
                AndroidUtilities.runOnUIThread(c90Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) i90Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        i90Var2 = i90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) i90Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void p(i90 i90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = i90Var.f27374c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(i90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(i90Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f20068id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    i90Var.getClass();
                    Bundle f7 = sc.v.f(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(i90Var.currentAccount);
                    org.telegram.ui.ActionBar.m2 m2Var2 = i90Var.f27374c;
                    if (messagesController.checkCanOpenChat(f7, m2Var2)) {
                        m2Var2.presentFragment(new h90(i90Var, f7, z10, j3), m2Var2 instanceof org.telegram.ui.zn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            g5.e0(i90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void q(i90 i90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(i90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i90Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(i90 i90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(i90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i90Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void s(i90 i90Var, long j3) {
        i90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = i90Var.f27373b;
        ConnectionsManager.getInstance(i90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new f90(i90Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void t(i90 i90Var, boolean z10, long j3) {
        TLRPC.Chat chat = i90Var.f27375e;
        AndroidUtilities.runOnUIThread(new Runnable(i90Var) {
            public final i90 f26701b;

            {
                this.f26701b = i90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i90 i90Var2 = this.f26701b;
                        if (!i90Var2.isDismissed()) {
                            i90Var2.f27376f.setVisibility(4);
                            i90Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f26701b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (i90Var.d == null && chat != null) {
            MessagesController.getInstance(i90Var.currentAccount).addUserToChat(chat.f20068id, UserConfig.getInstance(i90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(i90Var) {
                public final i90 f26701b;

                {
                    this.f26701b = i90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            i90 i90Var2 = this.f26701b;
                            if (!i90Var2.isDismissed()) {
                                i90Var2.f27376f.setVisibility(4);
                                i90Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f26701b.dismiss();
                            return;
                    }
                }
            }, new ai.k(9, i90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = i90Var.f27373b;
        ConnectionsManager.getInstance(i90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.y9(i90Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void u(i90 i90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        i90 i90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(i90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            c90 c90Var = new c90(i90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            i90Var2 = i90Var;
            AndroidUtilities.runOnUIThread(c90Var);
            AndroidUtilities.runOnUIThread(new ai.t4(i90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        i90Var2 = i90Var;
        AndroidUtilities.runOnUIThread(new ai.t4(i90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void v(i90 i90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = i90Var.f27374c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    i90Var.setOnDismissListener(new d90(1, i90Var, z10));
                } else {
                    g5.e0(i90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            i90Var.dismiss();
        }
    }

    public static CharSequence x(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void y(Context context, org.telegram.ui.ActionBar.m2 m2Var, ad adVar, boolean z10) {
        String string;
        if (context == null) {
            if (m2Var != null) {
                m2Var.getContext();
                return;
            }
            return;
        }
        if (adVar == null) {
            adVar = ad.a0(m2Var);
        }
        pc pcVar = new pc(context, m2Var.getResourceProvider());
        pcVar.f29839a.f(R.raw.timer_3, 28, 28, null);
        pcVar.f29840b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        pcVar.f29841c.setText(string);
        adVar.b(pcVar, 2750).j();
    }
}
