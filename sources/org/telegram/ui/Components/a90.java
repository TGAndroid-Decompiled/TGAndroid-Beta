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
public final class a90 extends org.telegram.ui.ActionBar.f3 {
    public static final int f24545r = 0;
    public final String f24546b;
    public final org.telegram.ui.ActionBar.n2 f24547c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f24548f;
    public final RadialProgressView h;
    public xc f24549n;

    public a90(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void n(a90 a90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        a90 a90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(a90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                v80 v80Var = new v80(a90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                a90Var2 = a90Var;
                AndroidUtilities.runOnUIThread(v80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(a90Var2, tL_error, updates, tL_messages_importChatInvite, 29));
            }
        }
        a90Var2 = a90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(a90Var2, tL_error, updates, tL_messages_importChatInvite, 29));
    }

    public static void o(a90 a90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = a90Var.f24547c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(a90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(a90Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f20272id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    a90Var.getClass();
                    Bundle a2 = z7.g5.a(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(a90Var.currentAccount);
                    org.telegram.ui.ActionBar.n2 n2Var2 = a90Var.f24547c;
                    if (messagesController.checkCanOpenChat(a2, n2Var2)) {
                        n2Var2.presentFragment(new z80(a90Var, a2, z10, j10), n2Var2 instanceof org.telegram.ui.sn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            f5.e0(a90Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void p(a90 a90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(a90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(a90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(a90 a90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(a90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(a90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(a90 a90Var, long j10) {
        a90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = a90Var.f24546b;
        ConnectionsManager.getInstance(a90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new ai.sc(a90Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void s(a90 a90Var, boolean z10, long j10) {
        TLRPC.Chat chat = a90Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(a90Var) {
            public final a90 f32570b;

            {
                this.f32570b = a90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a90 a90Var2 = this.f32570b;
                        if (!a90Var2.isDismissed()) {
                            a90Var2.f24548f.setVisibility(4);
                            a90Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f32570b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (a90Var.d == null && chat != null) {
            MessagesController.getInstance(a90Var.currentAccount).addUserToChat(chat.f20272id, UserConfig.getInstance(a90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(a90Var) {
                public final a90 f32570b;

                {
                    this.f32570b = a90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            a90 a90Var2 = this.f32570b;
                            if (!a90Var2.isDismissed()) {
                                a90Var2.f24548f.setVisibility(4);
                                a90Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f32570b.dismiss();
                            return;
                    }
                }
            }, new ci.f(9, a90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = a90Var.f24546b;
        ConnectionsManager.getInstance(a90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new ai.l(a90Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void t(a90 a90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        a90 a90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(a90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            v80 v80Var = new v80(a90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            a90Var2 = a90Var;
            AndroidUtilities.runOnUIThread(v80Var);
            AndroidUtilities.runOnUIThread(new ai.y3(a90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        a90Var2 = a90Var;
        AndroidUtilities.runOnUIThread(new ai.y3(a90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void v(a90 a90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = a90Var.f24547c;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    a90Var.setOnDismissListener(new w80(1, a90Var, z10));
                } else {
                    f5.e0(a90Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            a90Var.dismiss();
        }
    }

    public static CharSequence x(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void y(Context context, org.telegram.ui.ActionBar.n2 n2Var, xc xcVar, boolean z10) {
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
        ncVar.f28729a.f(R.raw.timer_3, 28, 28, null);
        ncVar.f28730b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        ncVar.f28731c.setText(string);
        xcVar.b(ncVar, 2750).j();
    }
}
