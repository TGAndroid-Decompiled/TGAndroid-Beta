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
public final class j90 extends org.telegram.ui.ActionBar.e3 {
    public static final int f27627r = 0;
    public final String f27628b;
    public final org.telegram.ui.ActionBar.m2 f27629c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f27630e;
    public final TextView f27631f;
    public final RadialProgressView h;
    public ad f27632n;

    public j90(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.m2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void o(j90 j90Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        j90 j90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(j90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                d90 d90Var = new d90(j90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                j90Var2 = j90Var;
                AndroidUtilities.runOnUIThread(d90Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) j90Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        j90Var2 = j90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) j90Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void p(j90 j90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = j90Var.f27629c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(j90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(j90Var.currentAccount).putChats(updates.chats, false);
                    long j3 = chat.f20032id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    j90Var.getClass();
                    Bundle f7 = sc.v.f(j3, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(j90Var.currentAccount);
                    org.telegram.ui.ActionBar.m2 m2Var2 = j90Var.f27629c;
                    if (messagesController.checkCanOpenChat(f7, m2Var2)) {
                        m2Var2.presentFragment(new i90(j90Var, f7, z10, j3), m2Var2 instanceof org.telegram.ui.zn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            g5.e0(j90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void q(j90 j90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(j90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(j90Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(j90 j90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(j90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(j90Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void s(j90 j90Var, long j3) {
        j90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = j90Var.f27628b;
        ConnectionsManager.getInstance(j90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new g90(j90Var, j3, tL_messages_importChatInvite), 2);
    }

    public static void t(j90 j90Var, boolean z10, long j3) {
        TLRPC.Chat chat = j90Var.f27630e;
        AndroidUtilities.runOnUIThread(new Runnable(j90Var) {
            public final j90 f26933b;

            {
                this.f26933b = j90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j90 j90Var2 = this.f26933b;
                        if (!j90Var2.isDismissed()) {
                            j90Var2.f27631f.setVisibility(4);
                            j90Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f26933b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (j90Var.d == null && chat != null) {
            MessagesController.getInstance(j90Var.currentAccount).addUserToChat(chat.f20032id, UserConfig.getInstance(j90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(j90Var) {
                public final j90 f26933b;

                {
                    this.f26933b = j90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            j90 j90Var2 = this.f26933b;
                            if (!j90Var2.isDismissed()) {
                                j90Var2.f27631f.setVisibility(4);
                                j90Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f26933b.dismiss();
                            return;
                    }
                }
            }, new ai.k(9, j90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = j90Var.f27628b;
        ConnectionsManager.getInstance(j90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.y9(j90Var, j3, z10, tL_messages_importChatInvite), 2);
    }

    public static void u(j90 j90Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        j90 j90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(j90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            d90 d90Var = new d90(j90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            j90Var2 = j90Var;
            AndroidUtilities.runOnUIThread(d90Var);
            AndroidUtilities.runOnUIThread(new ai.t4(j90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        j90Var2 = j90Var;
        AndroidUtilities.runOnUIThread(new ai.t4(j90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void v(j90 j90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = j90Var.f27629c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    j90Var.setOnDismissListener(new e90(1, j90Var, z10));
                } else {
                    g5.e0(j90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            j90Var.dismiss();
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
        pcVar.f29710a.f(R.raw.timer_3, 28, 28, null);
        pcVar.f29711b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        pcVar.f29712c.setText(string);
        adVar.b(pcVar, 2750).j();
    }
}
