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
public final class p70 extends org.telegram.ui.ActionBar.f3 {
    public static final int f31565r = 0;
    public final String f31566b;
    public final org.telegram.ui.ActionBar.o2 f31567c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat f31568e;
    public final TextView f31569f;
    public final RadialProgressView h;
    public oc f31570n;

    public p70(android.content.Context r27, org.telegram.tgnet.TLObject r28, java.lang.String r29, org.telegram.ui.ActionBar.o2 r30, org.telegram.ui.ActionBar.b6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p70.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.b6):void");
    }

    public static void m(p70 p70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        p70 p70Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(p70Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                k70 k70Var = new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                p70Var2 = p70Var;
                AndroidUtilities.runOnUIThread(k70Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.k6(p70Var2, tL_error, updates, tL_messages_importChatInvite, 24));
            }
        }
        p70Var2 = p70Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.k6(p70Var2, tL_error, updates, tL_messages_importChatInvite, 24));
    }

    public static void n(p70 p70Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = p70Var.f31567c;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(p70Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(p70Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f22380id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    p70Var.getClass();
                    Bundle g10 = e2.c.g(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(p70Var.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var2 = p70Var.f31567c;
                    if (messagesController.checkCanOpenChat(g10, o2Var2)) {
                        o2Var2.presentFragment(new o70(p70Var, g10, z10, j10), o2Var2 instanceof org.telegram.ui.qn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            y4.f0(p70Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(p70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(p70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(p70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(p70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(p70 p70Var, long j10) {
        p70Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = p70Var.f31566b;
        ConnectionsManager.getInstance(p70Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new fh.w5(p70Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void r(p70 p70Var, boolean z10, long j10) {
        TLRPC.Chat chat = p70Var.f31568e;
        AndroidUtilities.runOnUIThread(new Runnable(p70Var) {
            public final p70 f31031b;

            {
                this.f31031b = p70Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        p70 p70Var2 = this.f31031b;
                        if (!p70Var2.isDismissed()) {
                            p70Var2.f31569f.setVisibility(4);
                            p70Var2.h.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f31031b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (p70Var.d == null && chat != null) {
            MessagesController.getInstance(p70Var.currentAccount).addUserToChat(chat.f22380id, UserConfig.getInstance(p70Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(p70Var) {
                public final p70 f31031b;

                {
                    this.f31031b = p70Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            p70 p70Var2 = this.f31031b;
                            if (!p70Var2.isDismissed()) {
                                p70Var2.f31569f.setVisibility(4);
                                p70Var2.h.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f31031b.dismiss();
                            return;
                    }
                }
            }, new dh.s(6, p70Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = p70Var.f31566b;
        ConnectionsManager.getInstance(p70Var.currentAccount).sendRequest(tL_messages_importChatInvite, new gh.h(p70Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(p70 p70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        p70 p70Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(p70Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            k70 k70Var = new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            p70Var2 = p70Var;
            AndroidUtilities.runOnUIThread(k70Var);
            AndroidUtilities.runOnUIThread(new bg.d(p70Var2, tL_error, z10, tL_messages_importChatInvite, 16));
        }
        p70Var2 = p70Var;
        AndroidUtilities.runOnUIThread(new bg.d(p70Var2, tL_error, z10, tL_messages_importChatInvite, 16));
    }

    public static void t(p70 p70Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = p70Var.f31567c;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    p70Var.setOnDismissListener(new l70(1, p70Var, z10));
                } else {
                    y4.f0(p70Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            p70Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i9) {
        String str = chatInvite.participants.get(i9).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.o2 o2Var, oc ocVar, boolean z10) {
        String string;
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (ocVar == null) {
            ocVar = oc.a0(o2Var);
        }
        dc dcVar = new dc(context, o2Var.getResourceProvider());
        dcVar.f27703a.f(R.raw.timer_3, 28, 28, null);
        dcVar.f27704b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        dcVar.f27705c.setText(string);
        ocVar.b(dcVar, 2750).j();
    }
}
