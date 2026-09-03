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
public final class iq0 extends ql0 {
    public final Context f25755c;
    public boolean d;
    public boolean e;
    public ArrayList f25756f;
    public final lq0 h;

    public iq0(lq0 lq0Var, Context context) {
        this.h = lq0Var;
        this.f25755c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f25756f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f25756f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f25756f;
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
        if (l1Var.f5777f == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) l1Var.f5774a;
            if (i10 == 1 && this.d) {
                e7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f25756f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                lq0 lq0Var = this.h;
                TLRPC.Dialog dialog = lq0Var.f26865z0;
                if (E != null && lq0Var.R.h(E.f19211id) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Cells.b7 b7Var = e7Var.f21001b;
                int i11 = e7Var.f21003f;
                p9 p9Var = e7Var.f21000a;
                TextView textView = e7Var.f21002c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19163id));
                    String str = "";
                    if (dialog.f19163id > 0) {
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
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, e7Var.h));
                            b7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            p9Var.e(user, b7Var);
                            p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            b7Var.k(i11, chat2);
                            p9Var.e(chat, b7Var);
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
                        n80Var.f27229i = 1.8f;
                        mq mqVar = new mq(bVar, n80Var, 0, 0);
                        mqVar.f27116w = true;
                        p9Var.setImageDrawable(mqVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    p9Var.setRoundRadius(dp);
                    e7Var.d = dialog.f19163id;
                    e7Var.e = E.f19211id;
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View e7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f25755c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.g3) this.h).resourcesProvider;
            e7Var = new org.telegram.ui.Cells.e7(context, f6Var);
            e7Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            e7Var = new View(context);
            e7Var.setLayoutParams(new f2.w0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new f2.l1(e7Var);
    }
}
