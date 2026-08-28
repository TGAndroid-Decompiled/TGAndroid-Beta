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
public final class op0 extends vk0 {
    public final Context f31421c;
    public boolean d;
    public boolean f31422e;
    public ArrayList f31423f;
    public final rp0 h;

    public op0(rp0 rp0Var, Context context) {
        this.h = rp0Var;
        this.f31421c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i9) {
        int i10 = i9 - 1;
        if (this.d) {
            i10 = i9 - 2;
        }
        ArrayList arrayList = this.f31423f;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f31423f.get(i10);
        }
        return null;
    }

    @Override
    public final int h() {
        int i9;
        ArrayList arrayList = this.f31423f;
        if (arrayList != null) {
            i9 = arrayList.size() + 1;
        } else {
            i9 = 0;
        }
        return i9 + (this.d ? 1 : 0);
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        int dp;
        if (q1Var.f5505f == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) q1Var.f5501a;
            if (i9 == 1 && this.d) {
                f7Var.setAsNewBotForumTopic(this.f31422e);
            } else if (this.f31423f != null) {
                TLRPC.TL_forumTopic E = E(i9);
                rp0 rp0Var = this.h;
                TLRPC.Dialog dialog = rp0Var.f32274y0;
                if (E != null && rp0Var.Q.h(E.f22432id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.c7 c7Var = f7Var.f24342b;
                int i10 = f7Var.f24345f;
                o9 o9Var = f7Var.f24341a;
                TextView textView = f7Var.f24343c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22384id));
                    String str = "";
                    if (dialog.f22384id > 0) {
                        textView.setText(E.title);
                        z11 = z10;
                    } else if (chat != null) {
                        if (chat.monoforum) {
                            z11 = z10;
                            textView.setText(MessagesController.getInstance(i10).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                        } else {
                            z11 = z10;
                            textView.setText(E.title);
                        }
                    } else {
                        z11 = z10;
                        textView.setText("");
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        o9Var.setAnimatedEmojiDrawable(null);
                        o9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, f7Var.h));
                            c7Var.m(i10, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            o9Var.e(user, c7Var);
                            o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            c7Var.k(i10, chat2);
                            o9Var.e(chat, c7Var);
                        }
                    } else if (E.icon_emoji_id != 0) {
                        o9Var.setImageDrawable(null);
                        o9Var.setAnimatedEmojiDrawable(new k5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        o9Var.setAnimatedEmojiDrawable(null);
                        vf.a aVar = new vf.a(E.icon_color);
                        u70 u70Var = new u70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        u70Var.a(str);
                        u70Var.f32947i = 1.8f;
                        fq fqVar = new fq(aVar, u70Var, 0, 0);
                        fqVar.f28550w = true;
                        o9Var.setImageDrawable(fqVar);
                    }
                    if (chat != null && chat.forum && !z11) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    o9Var.setRoundRadius(dp);
                    f7Var.d = dialog.f22384id;
                    f7Var.f24344e = E.f22432id;
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View f7Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.f31421c;
        if (i9 == 0 || i9 == 2) {
            b6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            f7Var = new org.telegram.ui.Cells.f7(context, b6Var);
            f7Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(100.0f)));
        } else {
            f7Var = new View(context);
            f7Var.setLayoutParams(new f2.a1(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new f2.q1(f7Var);
    }
}
