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
public final class cr0 extends im0 {
    public final Context f25247c;
    public boolean d;
    public boolean e;
    public ArrayList f25248f;
    public final fr0 h;

    public cr0(fr0 fr0Var, Context context) {
        this.h = fr0Var;
        this.f25247c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45920f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f25248f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f25248f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f25248f;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        long j10;
        int dp;
        if (b1Var.f45920f == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) b1Var.f45917a;
            if (i10 == 1 && this.d) {
                f7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f25248f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                fr0 fr0Var = this.h;
                TLRPC.Dialog dialog = fr0Var.D0;
                if (E != null && fr0Var.V.h(E.f20328id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.c7 c7Var = f7Var.f22256b;
                int i11 = f7Var.f22258f;
                w9 w9Var = f7Var.f22255a;
                TextView textView = f7Var.f22257c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20280id));
                    String str = "";
                    if (dialog.f20280id > 0) {
                        textView.setText(E.title);
                        j10 = 0;
                    } else if (chat != null) {
                        if (chat.monoforum) {
                            j10 = 0;
                            textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                        } else {
                            j10 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j10 = 0;
                        textView.setText("");
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        w9Var.setAnimatedEmojiDrawable(null);
                        w9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, f7Var.h));
                            c7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            w9Var.e(user, c7Var);
                            w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            c7Var.k(i11, chat2);
                            w9Var.e(chat, c7Var);
                        }
                    } else if (E.icon_emoji_id != j10) {
                        w9Var.setImageDrawable(null);
                        w9Var.setAnimatedEmojiDrawable(new r5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        w9Var.setAnimatedEmojiDrawable(null);
                        og.a aVar = new og.a(E.icon_color);
                        f90 f90Var = new f90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        f90Var.a(str);
                        f90Var.f26154i = 1.8f;
                        zq zqVar = new zq(aVar, f90Var, 0, 0);
                        zqVar.f33023w = true;
                        w9Var.setImageDrawable(zqVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    w9Var.setRoundRadius(dp);
                    f7Var.d = dialog.f20280id;
                    f7Var.e = E.f20328id;
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View f7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f25247c;
        if (i10 == 0 || i10 == 2) {
            d6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            f7Var = new org.telegram.ui.Cells.f7(context, d6Var);
            f7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            f7Var = new View(context);
            f7Var.setLayoutParams(new s4.o0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.b1(f7Var);
    }
}
