package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class aq0 extends il0 {
    public final Context f26833c;
    public boolean d;
    public boolean f26834e;
    public ArrayList f26835f;
    public final dq0 h;

    public aq0(dq0 dq0Var, Context context) {
        this.h = dq0Var;
        this.f26833c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f26835f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f26835f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f26835f;
        if (arrayList != null) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        return i10 + (this.d ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        int dp;
        if (n1Var.f6436f == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) n1Var.f6432a;
            if (i10 == 1 && this.d) {
                d7Var.setAsNewBotForumTopic(this.f26834e);
            } else if (this.f26835f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                dq0 dq0Var = this.h;
                TLRPC.Dialog dialog = dq0Var.f27860y0;
                if (E != null && dq0Var.Q.h(E.f22444id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a7 a7Var = d7Var.f24235b;
                int i11 = d7Var.f24238f;
                t9 t9Var = d7Var.f24234a;
                TextView textView = d7Var.f24236c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f22396id));
                    String str = "";
                    if (dialog.f22396id > 0) {
                        textView.setText(E.title);
                        z11 = z10;
                    } else if (chat != null) {
                        if (chat.monoforum) {
                            z11 = z10;
                            textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                        } else {
                            z11 = z10;
                            textView.setText(E.title);
                        }
                    } else {
                        z11 = z10;
                        textView.setText("");
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        t9Var.setAnimatedEmojiDrawable(null);
                        t9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, d7Var.h));
                            a7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            t9Var.e(user, a7Var);
                            t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            a7Var.k(i11, chat2);
                            t9Var.e(chat, a7Var);
                        }
                    } else if (E.icon_emoji_id != 0) {
                        t9Var.setImageDrawable(null);
                        t9Var.setAnimatedEmojiDrawable(new p5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        t9Var.setAnimatedEmojiDrawable(null);
                        yf.b bVar = new yf.b(E.icon_color);
                        h80 h80Var = new h80(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        h80Var.a(str);
                        h80Var.f29135i = 1.8f;
                        jq jqVar = new jq(bVar, h80Var, 0, 0);
                        jqVar.f29792w = true;
                        t9Var.setImageDrawable(jqVar);
                    }
                    if (chat != null && chat.forum && !z11) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    t9Var.setRoundRadius(dp);
                    d7Var.d = dialog.f22396id;
                    d7Var.f24237e = E.f22444id;
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View d7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f26833c;
        if (i10 == 0 || i10 == 2) {
            c6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            d7Var = new org.telegram.ui.Cells.d7(context, c6Var);
            d7Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            d7Var = new View(context);
            d7Var.setLayoutParams(new f2.x0(-1, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
        }
        return new f2.n1(d7Var);
    }
}
