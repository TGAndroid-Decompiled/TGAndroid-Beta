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
public final class fr0 extends lm0 {
    public final Context f24805c;
    public boolean d;
    public boolean e;
    public ArrayList f24806f;
    public final ir0 h;

    public fr0(ir0 ir0Var, Context context) {
        this.h = ir0Var;
        this.f24805c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f24806f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f24806f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f24806f;
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
        if (b1Var.f44841f == 0) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) b1Var.f44838a;
            if (i10 == 1 && this.d) {
                g7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f24806f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                ir0 ir0Var = this.h;
                TLRPC.Dialog dialog = ir0Var.C0;
                if (E != null && ir0Var.U.h(E.f18968id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.d7 d7Var = g7Var.f20932b;
                int i11 = g7Var.f20934f;
                z9 z9Var = g7Var.f20931a;
                TextView textView = g7Var.f20933c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18920id));
                    String str = "";
                    if (dialog.f18920id > 0) {
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
                        z9Var.setAnimatedEmojiDrawable(null);
                        z9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, g7Var.h));
                            d7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            z9Var.e(user, d7Var);
                            z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            d7Var.k(i11, chat2);
                            z9Var.e(chat, d7Var);
                        }
                    } else if (E.icon_emoji_id != j10) {
                        z9Var.setImageDrawable(null);
                        z9Var.setAnimatedEmojiDrawable(new s5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        z9Var.setAnimatedEmojiDrawable(null);
                        og.a aVar = new og.a(E.icon_color);
                        m90 m90Var = new m90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        m90Var.a(str);
                        m90Var.f27039i = 1.8f;
                        cr crVar = new cr(aVar, m90Var, 0, 0);
                        crVar.f23883w = true;
                        z9Var.setImageDrawable(crVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    z9Var.setRoundRadius(dp);
                    g7Var.d = dialog.f18920id;
                    g7Var.e = E.f18968id;
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View g7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f24805c;
        if (i10 == 0 || i10 == 2) {
            c6Var = ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider;
            g7Var = new org.telegram.ui.Cells.g7(context, c6Var);
            g7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            g7Var = new View(context);
            g7Var.setLayoutParams(new s4.o0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.b1(g7Var);
    }
}
