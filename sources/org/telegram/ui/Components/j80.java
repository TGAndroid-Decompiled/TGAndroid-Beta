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
public final class j80 extends org.telegram.ui.ActionBar.h3 {
    public static final int f28068r = 0;
    public final String f28069b;
    public final org.telegram.ui.ActionBar.p2 f28070c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f28071e;
    public final TextView f28072f;
    public final RadialProgressView h;
    public qc f28073n;

    public j80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.p2 r30, org.telegram.ui.ActionBar.g6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.p2, org.telegram.ui.ActionBar.g6):void");
    }

    public static void m(j80 j80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        j80 j80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(j80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                e80 e80Var = new e80(j80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                j80Var2 = j80Var;
                AndroidUtilities.runOnUIThread(e80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ih((Object) j80Var2, (Object) tL_error, (TLObject) updates, (Object) tL_messages_importChatInvite, 16));
            }
        }
        j80Var2 = j80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ih((Object) j80Var2, (Object) tL_error, (TLObject) updates, (Object) tL_messages_importChatInvite, 16));
    }

    public static void n(j80 j80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = j80Var.f28070c;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(j80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(j80Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f20843id;
                    boolean z4 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    j80Var.getClass();
                    Bundle g10 = l.d.g(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(j80Var.currentAccount);
                    org.telegram.ui.ActionBar.p2 p2Var2 = j80Var.f28070c;
                    if (messagesController.checkCanOpenChat(g10, p2Var2)) {
                        p2Var2.presentFragment(new i80(j80Var, g10, z4, j10), p2Var2 instanceof org.telegram.ui.xn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            z4.f0(j80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(j80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(j80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(j80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(j80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(j80 j80Var, long j10) {
        j80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = j80Var.f28069b;
        ConnectionsManager.getInstance(j80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new lh.i5(j80Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void r(j80 j80Var, boolean z4, long j10) {
        TLRPC.Chat chat = j80Var.f28071e;
        AndroidUtilities.runOnUIThread(new Runnable(j80Var) {
            public final j80 f27409b;

            {
                this.f27409b = j80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j80 j80Var2 = this.f27409b;
                        if (!j80Var2.isDismissed()) {
                            j80Var2.f28072f.setVisibility(4);
                            j80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f27409b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (j80Var.d == null && chat != null) {
            MessagesController.getInstance(j80Var.currentAccount).addUserToChat(chat.f20843id, UserConfig.getInstance(j80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(j80Var) {
                public final j80 f27409b;

                {
                    this.f27409b = j80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            j80 j80Var2 = this.f27409b;
                            if (!j80Var2.isDismissed()) {
                                j80Var2.f28072f.setVisibility(4);
                                j80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f27409b.dismiss();
                            return;
                    }
                }
            }, new jh.q(6, j80Var, z4));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = j80Var.f28069b;
        ConnectionsManager.getInstance(j80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new mh.h(j80Var, j10, z4, tL_messages_importChatInvite), 2);
    }

    public static void s(j80 j80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        j80 j80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(j80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            e80 e80Var = new e80(j80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            j80Var2 = j80Var;
            AndroidUtilities.runOnUIThread(e80Var);
            AndroidUtilities.runOnUIThread(new dg.t0(j80Var2, tL_error, z4, tL_messages_importChatInvite, 14));
        }
        j80Var2 = j80Var;
        AndroidUtilities.runOnUIThread(new dg.t0(j80Var2, tL_error, z4, tL_messages_importChatInvite, 14));
    }

    public static void t(j80 j80Var, TLRPC.TL_error tL_error, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = j80Var.f28070c;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    j80Var.setOnDismissListener(new f80(1, j80Var, z4));
                } else {
                    z4.f0(j80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            j80Var.dismiss();
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
        fcVar.f26861a.f(R.raw.timer_3, 28, 28, null);
        fcVar.f26862b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z4) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        fcVar.f26863c.setText(string);
        qcVar.b(fcVar, 2750).j();
    }
}
