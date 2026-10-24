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
public final class z80 extends org.telegram.ui.ActionBar.h3 {
    public static final int f33173s = 0;
    public int f33174b;
    public final String f33175c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.ChatInvite e;
    public final TLRPC.Chat f33176f;
    public final TextView h;
    public final RadialProgressView f33177n;
    public vc f33178r;

    public z80(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.o2 r36, org.telegram.ui.ActionBar.g6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z80.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.g6):void");
    }

    public static void m(z80 z80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        z80 z80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(z80Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                u80 u80Var = new u80(z80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                z80Var2 = z80Var;
                AndroidUtilities.runOnUIThread(u80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(z80Var2, tL_error, updates, tL_messages_importChatInvite, 29));
            }
        }
        z80Var2 = z80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(z80Var2, tL_error, updates, tL_messages_importChatInvite, 29));
    }

    public static void n(z80 z80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = z80Var.d;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(z80Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(z80Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f20344id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    z80Var.getClass();
                    Bundle e = si.o0.e(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(z80Var.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var2 = z80Var.d;
                    if (messagesController.checkCanOpenChat(e, o2Var2)) {
                        o2Var2.presentFragment(new y80(z80Var, e, z10, j10), o2Var2 instanceof org.telegram.ui.sn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            d5.e0(z80Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void p(z80 z80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(z80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(z80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(z80 z80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(z80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(z80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(z80 z80Var, long j10) {
        z80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = z80Var.f33175c;
        ConnectionsManager.getInstance(z80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new ai.uc(z80Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void s(z80 z80Var, boolean z10, long j10) {
        TLRPC.Chat chat = z80Var.f33176f;
        AndroidUtilities.runOnUIThread(new Runnable(z80Var) {
            public final z80 f32537b;

            {
                this.f32537b = z80Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        z80 z80Var2 = this.f32537b;
                        if (!z80Var2.isDismissed()) {
                            z80Var2.h.setVisibility(4);
                            z80Var2.f33177n.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f32537b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (z80Var.e == null && chat != null) {
            MessagesController.getInstance(z80Var.currentAccount).addUserToChat(chat.f20344id, UserConfig.getInstance(z80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(z80Var) {
                public final z80 f32537b;

                {
                    this.f32537b = z80Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            z80 z80Var2 = this.f32537b;
                            if (!z80Var2.isDismissed()) {
                                z80Var2.h.setVisibility(4);
                                z80Var2.f33177n.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f32537b.dismiss();
                            return;
                    }
                }
            }, new ci.f(9, z80Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = z80Var.f33175c;
        ConnectionsManager.getInstance(z80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new ai.l(z80Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void t(z80 z80Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        z80 z80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(z80Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            u80 u80Var = new u80(z80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            z80Var2 = z80Var;
            AndroidUtilities.runOnUIThread(u80Var);
            AndroidUtilities.runOnUIThread(new ai.x9(z80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        z80Var2 = z80Var;
        AndroidUtilities.runOnUIThread(new ai.x9(z80Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void u(z80 z80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = z80Var.d;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    z80Var.setOnDismissListener(new v80(1, z80Var, z10));
                } else {
                    d5.e0(z80Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            z80Var.dismiss();
        }
    }

    public static CharSequence w(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void x(Context context, org.telegram.ui.ActionBar.o2 o2Var, vc vcVar, boolean z10) {
        String string;
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (vcVar == null) {
            vcVar = vc.a0(o2Var);
        }
        lc lcVar = new lc(context, o2Var.getResourceProvider());
        lcVar.f28317a.f(R.raw.timer_3, 28, 28, null);
        lcVar.f28318b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        lcVar.f28319c.setText(string);
        vcVar.b(lcVar, 2750).j();
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor == this.f33174b && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6)) != this.navBarColor) {
                fixNavigationBar(themedColor);
                this.f33174b = this.navBarColor;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
