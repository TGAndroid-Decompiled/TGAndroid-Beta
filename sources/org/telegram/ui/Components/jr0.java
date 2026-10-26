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
public final class jr0 extends lm0 {
    public final Context f29710c;
    public boolean d;
    public boolean e;
    public ArrayList f29711f;
    public final mr0 h;

    public jr0(mr0 mr0Var, Context context) {
        this.h = mr0Var;
        this.f29710c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f29711f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f29711f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f29711f;
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        long j10;
        int dp;
        if (e1Var.f47741f == 0) {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) e1Var.f47738a;
            if (i10 == 1 && this.d) {
                l7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f29711f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                mr0 mr0Var = this.h;
                TLRPC.Dialog dialog = mr0Var.D0;
                if (E != null && mr0Var.V.h(E.f22079id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.i7 i7Var = l7Var.f24392b;
                int i11 = l7Var.f24394f;
                y9 y9Var = l7Var.f24391a;
                TextView textView = l7Var.f24393c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f22031id));
                    String str = "";
                    if (dialog.f22031id > 0) {
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
                        y9Var.setAnimatedEmojiDrawable(null);
                        y9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, l7Var.h);
                            i7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            y9Var.f(user, i7Var);
                            y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            i7Var.k(i11, chat2);
                            y9Var.f(chat, i7Var);
                        }
                    } else if (E.icon_emoji_id != j10) {
                        y9Var.setImageDrawable(null);
                        y9Var.setAnimatedEmojiDrawable(new t5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        y9Var.setAnimatedEmojiDrawable(null);
                        pg.a aVar = new pg.a(E.icon_color);
                        h90 h90Var = new h90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        h90Var.a(str);
                        h90Var.f28878i = 1.8f;
                        ar arVar = new ar(aVar, h90Var, 0, 0);
                        arVar.f26599w = true;
                        y9Var.setImageDrawable(arVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    y9Var.setRoundRadius(dp);
                    l7Var.d = dialog.f22031id;
                    l7Var.e = E.f22079id;
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View l7Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = this.f29710c;
        if (i10 == 0 || i10 == 2) {
            u6Var = ((org.telegram.ui.ActionBar.k3) this.h).resourcesProvider;
            l7Var = new org.telegram.ui.Cells.l7(context, u6Var);
            l7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            l7Var = new View(context);
            l7Var.setLayoutParams(new s4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.e1(l7Var);
    }
}
