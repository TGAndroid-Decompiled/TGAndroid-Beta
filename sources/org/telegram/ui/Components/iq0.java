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
public final class iq0 extends rl0 {
    public final Context f25774c;
    public boolean d;
    public boolean e;
    public ArrayList f25775f;
    public final lq0 h;

    public iq0(lq0 lq0Var, Context context) {
        this.h = lq0Var;
        this.f25774c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f25775f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f25775f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f25775f;
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        int dp;
        if (l1Var.f5788f == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) l1Var.f5785a;
            if (i10 == 1 && this.d) {
                f7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f25775f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                lq0 lq0Var = this.h;
                TLRPC.Dialog dialog = lq0Var.f26875z0;
                if (E != null && lq0Var.R.h(E.f19236id) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Cells.c7 c7Var = f7Var.f21065b;
                int i11 = f7Var.f21067f;
                p9 p9Var = f7Var.f21064a;
                TextView textView = f7Var.f21066c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19188id));
                    String str = "";
                    if (dialog.f19188id > 0) {
                        textView.setText(E.title);
                        z10 = z4;
                    } else if (chat != null) {
                        if (chat.monoforum) {
                            z10 = z4;
                            textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                        } else {
                            z10 = z4;
                            textView.setText(E.title);
                        }
                    } else {
                        z10 = z4;
                        textView.setText("");
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        p9Var.setAnimatedEmojiDrawable(null);
                        p9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f7Var.h));
                            c7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            p9Var.e(user, c7Var);
                            p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            c7Var.k(i11, chat2);
                            p9Var.e(chat, c7Var);
                        }
                    } else if (E.icon_emoji_id != 0) {
                        p9Var.setImageDrawable(null);
                        p9Var.setAnimatedEmojiDrawable(new l5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        p9Var.setAnimatedEmojiDrawable(null);
                        ag.b bVar = new ag.b(E.icon_color);
                        n80 n80Var = new n80(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        n80Var.a(str);
                        n80Var.f27224i = 1.8f;
                        nq nqVar = new nq(bVar, n80Var, 0, 0);
                        nqVar.f27342w = true;
                        p9Var.setImageDrawable(nqVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    p9Var.setRoundRadius(dp);
                    f7Var.d = dialog.f19188id;
                    f7Var.e = E.f19236id;
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View f7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f25774c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.g3) this.h).resourcesProvider;
            f7Var = new org.telegram.ui.Cells.f7(context, f6Var);
            f7Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            f7Var = new View(context);
            f7Var.setLayoutParams(new f2.w0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new f2.l1(f7Var);
    }
}
