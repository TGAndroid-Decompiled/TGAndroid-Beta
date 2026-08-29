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
public final class c80 extends org.telegram.ui.ActionBar.f3 {
    public static final int f27367r = 0;
    public final String f27368b;
    public final org.telegram.ui.ActionBar.o2 f27369c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f27370e;
    public final TextView f27371f;
    public final RadialProgressView h;
    public tc f27372n;

    public c80(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.o2 r30, org.telegram.ui.ActionBar.c6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.c6):void");
    }

    public static void m(c80 c80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        c80 c80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(c80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                x70 x70Var = new x70(c80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                c80Var2 = c80Var;
                AndroidUtilities.runOnUIThread(x70Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gg(c80Var2, tL_error, updates, tL_messages_importChatInvite, 18));
            }
        }
        c80Var2 = c80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gg(c80Var2, tL_error, updates, tL_messages_importChatInvite, 18));
    }

    public static void n(c80 c80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = c80Var.f27369c;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(c80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(c80Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f22392id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    c80Var.getClass();
                    Bundle g10 = j7.l1.g(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(c80Var.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var2 = c80Var.f27369c;
                    if (messagesController.checkCanOpenChat(g10, o2Var2)) {
                        o2Var2.presentFragment(new b80(c80Var, g10, z10, j10), o2Var2 instanceof org.telegram.ui.tn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            c5.f0(c80Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(c80 c80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(c80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(c80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(c80 c80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(c80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(c80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(c80 c80Var, long j10) {
        c80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = c80Var.f27368b;
        ConnectionsManager.getInstance(c80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new ih.i5(c80Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void r(c80 c80Var, boolean z10, long j10) {
        TLRPC.Chat chat = c80Var.f27370e;
        AndroidUtilities.runOnUIThread(new Runnable(c80Var) {
            public final c80 f26695b;

            {
                this.f26695b = c80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        c80 c80Var2 = this.f26695b;
                        if (!c80Var2.isDismissed()) {
                            c80Var2.f27371f.setVisibility(4);
                            c80Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f26695b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (c80Var.d == null && chat != null) {
            MessagesController.getInstance(c80Var.currentAccount).addUserToChat(chat.f22392id, UserConfig.getInstance(c80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(c80Var) {
                public final c80 f26695b;

                {
                    this.f26695b = c80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            c80 c80Var2 = this.f26695b;
                            if (!c80Var2.isDismissed()) {
                                c80Var2.f27371f.setVisibility(4);
                                c80Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f26695b.dismiss();
                            return;
                    }
                }
            }, new gh.q(6, c80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = c80Var.f27368b;
        ConnectionsManager.getInstance(c80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new jh.h(c80Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(c80 c80Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        c80 c80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(c80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            x70 x70Var = new x70(c80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            c80Var2 = c80Var;
            AndroidUtilities.runOnUIThread(x70Var);
            AndroidUtilities.runOnUIThread(new ag.w0(c80Var2, tL_error, z10, tL_messages_importChatInvite, 16));
        }
        c80Var2 = c80Var;
        AndroidUtilities.runOnUIThread(new ag.w0(c80Var2, tL_error, z10, tL_messages_importChatInvite, 16));
    }

    public static void t(c80 c80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = c80Var.f27369c;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    c80Var.setOnDismissListener(new y70(1, c80Var, z10));
                } else {
                    c5.f0(c80Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            c80Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.o2 o2Var, tc tcVar, boolean z10) {
        String string;
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (tcVar == null) {
            tcVar = tc.a0(o2Var);
        }
        jc jcVar = new jc(context, o2Var.getResourceProvider());
        jcVar.f29637a.f(R.raw.timer_3, 28, 28, null);
        jcVar.f29638b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        jcVar.f29639c.setText(string);
        tcVar.b(jcVar, 2750).j();
    }
}
