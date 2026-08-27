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

public final class pp0 extends yk0 {

    public final Context f31647c;
    public boolean d;

    public boolean f31648e;

    public ArrayList f31649f;
    public final sp0 h;

    public pp0(sp0 sp0Var, Context context) {
        this.h = sp0Var;
        this.f31647c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f31649f;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f31649f.get(i11);
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f31649f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) o1Var.f5789a;
            if (i10 == 1 && this.d) {
                c7Var.setAsNewBotForumTopic(this.f31648e);
                return;
            }
            if (this.f31649f != null) {
                TLRPC.TL_forumTopic tL_forumTopicE = E(i10);
                sp0 sp0Var = this.h;
                TLRPC.Dialog dialog = sp0Var.f32552y0;
                boolean z10 = tL_forumTopicE != null && sp0Var.Q.h((long) tL_forumTopicE.f22432id) >= 0;
                org.telegram.ui.Cells.z6 z6Var = c7Var.f24163b;
                int i11 = c7Var.f24166f;
                n9 n9Var = c7Var.f24162a;
                TextView textView = c7Var.f24164c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f22384id));
                if (dialog.f22384id > 0) {
                    textView.setText(tL_forumTopicE.title);
                } else if (chat == null) {
                    textView.setText("");
                } else if (chat.monoforum) {
                    textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(tL_forumTopicE.from_id)));
                } else {
                    textView.setText(tL_forumTopicE.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    n9Var.setAnimatedEmojiDrawable(null);
                    n9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopicE.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c7Var.h));
                        z6Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        n9Var.e(user, z6Var);
                        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        z6Var.k(i11, chat2);
                        n9Var.e(chat, z6Var);
                    }
                } else if (tL_forumTopicE.icon_emoji_id != 0) {
                    n9Var.setImageDrawable(null);
                    n9Var.setAnimatedEmojiDrawable(new k5(13, UserConfig.selectedAccount, tL_forumTopicE.icon_emoji_id));
                } else {
                    n9Var.setAnimatedEmojiDrawable(null);
                    wf.a aVar = new wf.a(tL_forumTopicE.icon_color);
                    y70 y70Var = new y70(1, null);
                    String upperCase = tL_forumTopicE.title.trim().toUpperCase();
                    y70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    y70Var.f34843i = 1.8f;
                    dq dqVar = new dq(aVar, y70Var, 0, 0);
                    dqVar.f27828w = true;
                    n9Var.setImageDrawable(dqVar);
                }
                n9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                c7Var.d = dialog.f22384id;
                c7Var.f24165e = tL_forumTopicE.f22432id;
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        Context context = this.f31647c;
        if (i10 == 0 || i10 == 2) {
            c7Var = new org.telegram.ui.Cells.c7(context, ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider);
            c7Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            c7Var = new View(context);
            c7Var.setLayoutParams(new f2.y0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new lk0(c7Var);
    }
}
