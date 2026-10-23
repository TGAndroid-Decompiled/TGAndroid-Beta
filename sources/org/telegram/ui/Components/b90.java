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
public final class b90 extends org.telegram.ui.ActionBar.h3 {
    public static final int f25000s = 0;
    public int f25001b;
    public final String f25002c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.ChatInvite e;
    public final TLRPC.Chat f25003f;
    public final TextView h;
    public final RadialProgressView f25004n;
    public xc f25005r;

    public b90(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.o2 r36, org.telegram.ui.ActionBar.g6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b90.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.g6):void");
    }

    public static void m(b90 b90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        b90 b90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(b90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                w80 w80Var = new w80(b90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                b90Var2 = b90Var;
                AndroidUtilities.runOnUIThread(w80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(b90Var2, tL_error, updates, tL_messages_importChatInvite, 29));
            }
        }
        b90Var2 = b90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(b90Var2, tL_error, updates, tL_messages_importChatInvite, 29));
    }

    public static void n(b90 b90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = b90Var.d;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    MessagesController.getInstance(b90Var.currentAccount).putUsers(updates.users, false);
                    MessagesController.getInstance(b90Var.currentAccount).putChats(updates.chats, false);
                    long j10 = chat.f20343id;
                    boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
                    b90Var.getClass();
                    Bundle e = si.o0.e(j10, "chat_id");
                    MessagesController messagesController = MessagesController.getInstance(b90Var.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var2 = b90Var.d;
                    if (messagesController.checkCanOpenChat(e, o2Var2)) {
                        o2Var2.presentFragment(new a90(b90Var, e, z10, j10), o2Var2 instanceof org.telegram.ui.sn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            f5.f0(b90Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    public static void p(b90 b90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(b90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(b90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(b90 b90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(b90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(b90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(b90 b90Var, long j10) {
        b90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = b90Var.f25002c;
        ConnectionsManager.getInstance(b90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new ai.uc(b90Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void s(b90 b90Var, boolean z10, long j10) {
        TLRPC.Chat chat = b90Var.f25003f;
        AndroidUtilities.runOnUIThread(new Runnable(b90Var) {
            public final b90 f33168b;

            {
                this.f33168b = b90Var;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        b90 b90Var2 = this.f33168b;
                        if (!b90Var2.isDismissed()) {
                            b90Var2.h.setVisibility(4);
                            b90Var2.f25004n.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f33168b.dismiss();
                        return;
                }
            }
        }, 400L);
        if (b90Var.e == null && chat != null) {
            MessagesController.getInstance(b90Var.currentAccount).addUserToChat(chat.f20343id, UserConfig.getInstance(b90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(b90Var) {
                public final b90 f33168b;

                {
                    this.f33168b = b90Var;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            b90 b90Var2 = this.f33168b;
                            if (!b90Var2.isDismissed()) {
                                b90Var2.h.setVisibility(4);
                                b90Var2.f25004n.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            this.f33168b.dismiss();
                            return;
                    }
                }
            }, new ci.f(9, b90Var, z10));
            return;
        }
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = b90Var.f25002c;
        ConnectionsManager.getInstance(b90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new ai.l(b90Var, j10, z10, tL_messages_importChatInvite), 2);
    }

    public static void t(b90 b90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        b90 b90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(b90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            w80 w80Var = new w80(b90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            b90Var2 = b90Var;
            AndroidUtilities.runOnUIThread(w80Var);
            AndroidUtilities.runOnUIThread(new ai.x9(b90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        b90Var2 = b90Var;
        AndroidUtilities.runOnUIThread(new ai.x9(b90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static void u(b90 b90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = b90Var.d;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (tL_error != null) {
                if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                    b90Var.setOnDismissListener(new x80(1, b90Var, z10));
                } else {
                    f5.f0(b90Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
                }
            }
            b90Var.dismiss();
        }
    }

    public static CharSequence w(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void x(Context context, org.telegram.ui.ActionBar.o2 o2Var, xc xcVar, boolean z10) {
        String string;
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (xcVar == null) {
            xcVar = xc.a0(o2Var);
        }
        nc ncVar = new nc(context, o2Var.getResourceProvider());
        ncVar.f28932a.f(R.raw.timer_3, 28, 28, null);
        ncVar.f28933b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z10) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        ncVar.f28934c.setText(string);
        xcVar.b(ncVar, 2750).j();
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor == this.f25001b && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6)) != this.navBarColor) {
                fixNavigationBar(themedColor);
                this.f25001b = this.navBarColor;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
