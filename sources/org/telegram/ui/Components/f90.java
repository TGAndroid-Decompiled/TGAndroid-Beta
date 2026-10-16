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
public final class f90 extends org.telegram.ui.ActionBar.e3 {
    public static final int f24660r = 0;
    public final String f24661b;
    public final org.telegram.ui.ActionBar.m2 f24662c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f24663f;
    public final RadialProgressView h;
    public zc f24664n;

    public f90(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.m2 r30, org.telegram.ui.ActionBar.c6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.c6):void");
    }

    public static void n(f90 f90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        f90 f90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(f90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                z80 z80Var = new z80(f90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                f90Var2 = f90Var;
                AndroidUtilities.runOnUIThread(z80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6(f90Var2, tL_error, updates, tL_messages_importChatInvite, 23));
            }
        }
        f90Var2 = f90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.p6(f90Var2, tL_error, updates, tL_messages_importChatInvite, 23));
    }

    public static void o(f90 f90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = f90Var.f24662c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(f90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(f90Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f18916id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    f90Var.getClass();
                    Bundle e = t8.b.e(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(f90Var.currentAccount);
                    org.telegram.ui.ActionBar.m2 m2Var2 = f90Var.f24662c;
                    if (messagesController.checkCanOpenChat(e, m2Var2)) {
                        m2Var2.presentFragment(new e90(f90Var, e, z10, j10), m2Var2 instanceof org.telegram.ui.fo);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            g5.e0(f90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void q(f90 f90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(f90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(f90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(f90 f90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(f90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(f90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void s(f90 f90Var, long j10) {
        f90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = f90Var.f24661b;
        ConnectionsManager.getInstance(f90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new c90(f90Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void t(f90 f90Var, boolean z10, long j10) {
        TLRPC.Chat chat = f90Var.e;
        AndroidUtilities.runOnUIThread(new Runnable(f90Var) {
            public final f90 f24017b;

            {
                this.f24017b = f90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        f90 f90Var2 = this.f24017b;
                        if (!f90Var2.isDismissed()) {
                            f90Var2.f24663f.setVisibility(4);
                            f90Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f24017b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (f90Var.d == null && chat != null) {
            MessagesController.getInstance(f90Var.currentAccount).addUserToChat(chat.f18916id, UserConfig.getInstance(f90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(f90Var) {
                public final f90 f24017b;

                {
                    this.f24017b = f90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            f90 f90Var2 = this.f24017b;
                            if (!f90Var2.isDismissed()) {
                                f90Var2.f24663f.setVisibility(4);
                                f90Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f24017b.dismiss();
                            return;
                    }
                }
            }, new bi.h(9, f90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = f90Var.f24661b;
        ConnectionsManager.getInstance(f90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.ba(f90Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void u(f90 f90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        f90 f90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(f90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            z80 z80Var = new z80(f90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            f90Var2 = f90Var;
            AndroidUtilities.runOnUIThread(z80Var);
            AndroidUtilities.runOnUIThread(new bi.h4(f90Var2, tL_error, z10, tL_messages_importChatInvite, 17));
        }
        f90Var2 = f90Var;
        AndroidUtilities.runOnUIThread(new bi.h4(f90Var2, tL_error, z10, tL_messages_importChatInvite, 17));
    }

    public static void v(f90 f90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.m2 m2Var = f90Var.f24662c;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    f90Var.setOnDismissListener(new a90(1, f90Var, z10));
                } else {
                    g5.e0(f90Var.currentAccount, tL_error, m2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            f90Var.dismiss();
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
        pcVar.f27959a.f(R.raw.timer_3, 28, 28, null);
        pcVar.f27960b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        pcVar.f27961c.setText(string);
        zcVar.b(pcVar, 2750).j();
    }
}
