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
public final class i80 extends org.telegram.ui.ActionBar.g3 {
    public static final int f25638r = 0;
    public final String f25639b;
    public final org.telegram.ui.ActionBar.p2 f25640c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f25641f;
    public final RadialProgressView h;
    public qc f25642n;

    public i80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.p2 r30, org.telegram.ui.ActionBar.f6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.p2, org.telegram.ui.ActionBar.f6):void");
    }

    public static void m(i80 i80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        i80 i80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(i80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                d80 d80Var = new d80(i80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                i80Var2 = i80Var;
                AndroidUtilities.runOnUIThread(d80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.kh((Object) i80Var2, (Object) tL_error, (TLObject) updates, (Object) tL_messages_importChatInvite, 16));
            }
        }
        i80Var2 = i80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.kh((Object) i80Var2, (Object) tL_error, (TLObject) updates, (Object) tL_messages_importChatInvite, 16));
    }

    public static void n(i80 i80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = i80Var.f25640c;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(i80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(i80Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f19159id;
                    boolean z4 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    i80Var.getClass();
                    Bundle g10 = kf.k0.g(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(i80Var.currentAccount);
                    org.telegram.ui.ActionBar.p2 p2Var2 = i80Var.f25640c;
                    if (messagesController.checkCanOpenChat(g10, p2Var2)) {
                        p2Var2.presentFragment(new h80(i80Var, g10, z4, j10), p2Var2 instanceof org.telegram.ui.zn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            z4.f0(i80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(i80 i80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(i80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(i80 i80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(i80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(i80 i80Var, long j10) {
        i80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = i80Var.f25639b;
        ConnectionsManager.getInstance(i80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new kh.h5(i80Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void r(i80 i80Var, boolean z4, long j10) {
        TLRPC.Chat chat = i80Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(i80Var) {
            public final i80 f25085b;

            {
                this.f25085b = i80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i80 i80Var2 = this.f25085b;
                        if (!i80Var2.isDismissed()) {
                            i80Var2.f25641f.setVisibility(4);
                            i80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f25085b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (i80Var.d == null && chat != null) {
            MessagesController.getInstance(i80Var.currentAccount).addUserToChat(chat.f19159id, UserConfig.getInstance(i80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(i80Var) {
                public final i80 f25085b;

                {
                    this.f25085b = i80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            i80 i80Var2 = this.f25085b;
                            if (!i80Var2.isDismissed()) {
                                i80Var2.f25641f.setVisibility(4);
                                i80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f25085b.dismiss();
                            return;
                    }
                }
            }, new ih.q(6, i80Var, z4));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = i80Var.f25639b;
        ConnectionsManager.getInstance(i80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new lh.i(i80Var, j10, z4, tL_messages_importChatInvite), 2);
    }

    public static void s(i80 i80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        i80 i80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(i80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            d80 d80Var = new d80(i80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            i80Var2 = i80Var;
            AndroidUtilities.runOnUIThread(d80Var);
            AndroidUtilities.runOnUIThread(new cg.u0(i80Var2, tL_error, z4, tL_messages_importChatInvite, 14));
        }
        i80Var2 = i80Var;
        AndroidUtilities.runOnUIThread(new cg.u0(i80Var2, tL_error, z4, tL_messages_importChatInvite, 14));
    }

    public static void t(i80 i80Var, TLRPC.TL_error tL_error, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = i80Var.f25640c;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    i80Var.setOnDismissListener(new e80(1, i80Var, z4));
                } else {
                    z4.f0(i80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            i80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.p2 p2Var, qc qcVar, boolean z4) {
        String string;
        if (context == null) {
            if (p2Var != null) {
                p2Var.getContext();
                return;
            }
            return;
        }
        if (qcVar == null) {
            qcVar = qc.a0(p2Var);
        }
        fc fcVar = new fc(context, p2Var.getResourceProvider());
        fcVar.f24858a.f(R.raw.timer_3, 28, 28, null);
        fcVar.f24859b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z4) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        fcVar.f24860c.setText(string);
        qcVar.b(fcVar, 2750).j();
    }
}
