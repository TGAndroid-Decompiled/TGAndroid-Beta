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
public final class sq0 extends wl0 {
    public final Context f28337c;
    public boolean d;
    public boolean e;
    public ArrayList f28338f;
    public final vq0 h;

    public sq0(vq0 vq0Var, Context context) {
        this.h = vq0Var;
        this.f28337c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f28338f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f28338f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f28338f;
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
        if (c1Var.f42962f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) c1Var.f42959a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f28338f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                vq0 vq0Var = this.h;
                TLRPC.Dialog dialog = vq0Var.C0;
                if (E != null && vq0Var.U.h(E.f18387id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.e7 e7Var = h7Var.f20404b;
                int i11 = h7Var.f20406f;
                w9 w9Var = h7Var.f20403a;
                TextView textView = h7Var.f20405c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18339id));
                    String str = "";
                    if (dialog.f18339id > 0) {
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
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165j5, h7Var.h));
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
                        x80 x80Var = new x80(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        x80Var.a(str);
                        x80Var.f30302i = 1.8f;
                        rq rqVar = new rq(aVar, x80Var, 0, 0);
                        rqVar.f28035w = true;
                        w9Var.setImageDrawable(rqVar);
                    }
                    if (chat != null && chat.forum && !z11) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    w9Var.setRoundRadius(dp);
                    h7Var.d = dialog.f18339id;
                    h7Var.e = E.f18387id;
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f28337c;
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
