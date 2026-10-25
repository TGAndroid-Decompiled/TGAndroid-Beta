package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c90 extends org.telegram.ui.ActionBar.k3 {
    public static final int f27095s = 0;
    public int f27096b;
    public final String f27097c;
    public final org.telegram.ui.ActionBar.r2 d;
    public final TLRPC.ChatInvite e;
    public final TLRPC.Chat f27098f;
    public final TextView h;
    public final RadialProgressView f27099n;
    public wc f27100r;

    public c90(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.r2 r36, org.telegram.ui.ActionBar.u6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.r2, org.telegram.ui.ActionBar.u6):void");
    }

    public static void m(c90 c90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        c90 c90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(c90Var.currentAccount).lambda$processUpdates$379(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                x80 x80Var = new x80(c90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                c90Var2 = c90Var;
                AndroidUtilities.runOnUIThread(x80Var);
                AndroidUtilities.runOnUIThread(new e10(c90Var2, tL_error, updates, tL_messages_importChatInvite, 2));
            }
        }
        c90Var2 = c90Var;
        AndroidUtilities.runOnUIThread(new e10(c90Var2, tL_error, updates, tL_messages_importChatInvite, 2));
    }

    public static void n(c90 c90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.r2 r2Var = c90Var.d;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(c90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(c90Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f22027id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    c90Var.getClass();
                    Bundle h = a1.g.h(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(c90Var.currentAccount);
                    org.telegram.ui.ActionBar.r2 r2Var2 = c90Var.d;
                    if (messagesController.checkCanOpenChat(h, r2Var2)) {
                        r2Var2.presentFragment(new b90(c90Var, h, z10, j10), r2Var2 instanceof org.telegram.ui.un);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            g5.e0(c90Var.currentAccount, tL_error, r2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void o(c90 c90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(c90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(c90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void p(c90 c90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(c90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(c90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(c90 c90Var, long j10) {
        c90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = c90Var.f27097c;
        ConnectionsManager.getInstance(c90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new bi.lc(c90Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void r(c90 c90Var, boolean z10, long j10) {
        TLRPC.Chat chat = c90Var.f27098f;
        AndroidUtilities.runOnUIThread(new Runnable(c90Var) {
            public final c90 f26435b;

            {
                this.f26435b = c90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        c90 c90Var2 = this.f26435b;
                        if (!c90Var2.isDismissed()) {
                            c90Var2.h.setVisibility(4);
                            c90Var2.f27099n.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f26435b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (c90Var.e == null && chat != null) {
            MessagesController.getInstance(c90Var.currentAccount).addUserToChat(chat.f22027id, UserConfig.getInstance(c90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(c90Var) {
                public final c90 f26435b;

                {
                    this.f26435b = c90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            c90 c90Var2 = this.f26435b;
                            if (!c90Var2.isDismissed()) {
                                c90Var2.h.setVisibility(4);
                                c90Var2.f27099n.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f26435b.dismiss();
                            return;
                    }
                }
            }, new di.f(9, c90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = c90Var.f27097c;
        ConnectionsManager.getInstance(c90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new bi.m(c90Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void s(c90 c90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        c90 c90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(c90Var.currentAccount).lambda$processUpdates$379(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            x80 x80Var = new x80(c90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            c90Var2 = c90Var;
            AndroidUtilities.runOnUIThread(x80Var);
            AndroidUtilities.runOnUIThread(new bi.s9(c90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        c90Var2 = c90Var;
        AndroidUtilities.runOnUIThread(new bi.s9(c90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void t(c90 c90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.r2 r2Var = c90Var.d;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    c90Var.setOnDismissListener(new y80(1, c90Var, z10));
                } else {
                    g5.e0(c90Var.currentAccount, tL_error, r2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            c90Var.dismiss();
        }
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.r2 r2Var, wc wcVar, boolean z10) {
        String string;
        if (context == null) {
            if (r2Var != null) {
                r2Var.getContext();
                return;
            }
            return;
        }
        if (wcVar == null) {
            wcVar = wc.b0(r2Var);
        }
        nc ncVar = new nc(context, r2Var.getResourceProvider());
        ncVar.f30951a.f(R.raw.timer_3, 28, 28, null);
        ncVar.f30952b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        ncVar.f30953c.setText(string);
        wcVar.b(ncVar, 2750).j();
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor == this.f27096b && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6)) != this.navBarColor) {
                fixNavigationBar(themedColor);
                this.f27096b = this.navBarColor;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
