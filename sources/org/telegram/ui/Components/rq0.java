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
public final class rq0 extends vl0 {
    public final Context f28029c;
    public boolean d;
    public boolean e;
    public ArrayList f28030f;
    public final uq0 h;

    public rq0(uq0 uq0Var, Context context) {
        this.h = uq0Var;
        this.f28029c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f28030f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f28030f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f28030f;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        int dp;
        if (c1Var.f42964f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) c1Var.f42961a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f28030f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                uq0 uq0Var = this.h;
                TLRPC.Dialog dialog = uq0Var.C0;
                if (E != null && uq0Var.U.h(E.f18388id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.e7 e7Var = h7Var.f20405b;
                int i11 = h7Var.f20407f;
                w9 w9Var = h7Var.f20404a;
                TextView textView = h7Var.f20406c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18340id));
                    String str = "";
                    if (dialog.f18340id > 0) {
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
                        w9Var.setAnimatedEmojiDrawable(null);
                        w9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, h7Var.h));
                            e7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            w9Var.e(user, e7Var);
                            w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            e7Var.k(i11, chat2);
                            w9Var.e(chat, e7Var);
                        }
                    } else if (E.icon_emoji_id != 0) {
                        w9Var.setImageDrawable(null);
                        w9Var.setAnimatedEmojiDrawable(new q5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        w9Var.setAnimatedEmojiDrawable(null);
                        ng.a aVar = new ng.a(E.icon_color);
                        w80 w80Var = new w80(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        w80Var.a(str);
                        w80Var.f29932i = 1.8f;
                        qq qqVar = new qq(aVar, w80Var, 0, 0);
                        qqVar.f27740w = true;
                        w9Var.setImageDrawable(qqVar);
                    }
                    if (chat != null && chat.forum && !z11) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    w9Var.setRoundRadius(dp);
                    h7Var.d = dialog.f18340id;
                    h7Var.e = E.f18388id;
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f28029c;
        if (i10 == 0 || i10 == 2) {
            d6Var = ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, d6Var);
            h7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.c1(h7Var);
    }
}
