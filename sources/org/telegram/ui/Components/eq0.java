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
public final class eq0 extends kl0 {
    public final Context f25752c;
    public boolean d;
    public boolean f25753e;
    public ArrayList f25754f;
    public final hq0 h;

    public eq0(hq0 hq0Var, Context context) {
        this.h = hq0Var;
        this.f25752c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f25754f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f25754f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f25754f;
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
        if (c1Var.f45742f == 0) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) c1Var.f45738a;
            if (i10 == 1 && this.d) {
                g7Var.setAsNewBotForumTopic(this.f25753e);
            } else if (this.f25754f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                hq0 hq0Var = this.h;
                TLRPC.Dialog dialog = hq0Var.C0;
                if (E != null && hq0Var.U.h(E.f19921id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.d7 d7Var = g7Var.f21985b;
                int i11 = g7Var.f21988f;
                x9 x9Var = g7Var.f21984a;
                TextView textView = g7Var.f21986c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19873id));
                    String str = "";
                    if (dialog.f19873id > 0) {
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
                        x9Var.setAnimatedEmojiDrawable(null);
                        x9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, g7Var.h));
                            d7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            x9Var.e(user, d7Var);
                            x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            d7Var.k(i11, chat2);
                            x9Var.e(chat, d7Var);
                        }
                    } else if (E.icon_emoji_id != 0) {
                        x9Var.setImageDrawable(null);
                        x9Var.setAnimatedEmojiDrawable(new q5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        x9Var.setAnimatedEmojiDrawable(null);
                        og.a aVar = new og.a(E.icon_color);
                        l80 l80Var = new l80(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        l80Var.a(str);
                        l80Var.f28113i = 1.8f;
                        oq oqVar = new oq(aVar, l80Var, 0, 0);
                        oqVar.f29167w = true;
                        x9Var.setImageDrawable(oqVar);
                    }
                    if (chat != null && chat.forum && !z11) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    x9Var.setRoundRadius(dp);
                    g7Var.d = dialog.f19873id;
                    g7Var.f21987e = E.f19921id;
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f25752c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            g7Var = new org.telegram.ui.Cells.g7(context, f6Var);
            g7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            g7Var = new View(context);
            g7Var.setLayoutParams(new s4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.c1(g7Var);
    }
}
