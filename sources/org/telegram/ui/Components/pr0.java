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
public final class pr0 extends vm0 {
    public final Context f29577c;
    public boolean d;
    public boolean f29578e;
    public ArrayList f29579f;
    public final sr0 h;

    public pr0(sr0 sr0Var, Context context) {
        this.h = sr0Var;
        this.f29577c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f29579f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f29579f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f29579f;
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        long j3;
        int dp;
        if (d1Var.f47893f == 0) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) d1Var.f47889a;
            if (i10 == 1 && this.d) {
                g7Var.setAsNewBotForumTopic(this.f29578e);
            } else if (this.f29579f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                sr0 sr0Var = this.h;
                TLRPC.Dialog dialog = sr0Var.C0;
                if (E != null && sr0Var.U.h(E.f19854id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.d7 d7Var = g7Var.f21917b;
                int i11 = g7Var.f21920f;
                y9 y9Var = g7Var.f21916a;
                TextView textView = g7Var.f21918c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19806id));
                    String str = "";
                    if (dialog.f19806id > 0) {
                        textView.setText(E.title);
                        j3 = 0;
                    } else if (chat != null) {
                        if (chat.monoforum) {
                            j3 = 0;
                            textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                        } else {
                            j3 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j3 = 0;
                        textView.setText("");
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        y9Var.setAnimatedEmojiDrawable(null);
                        y9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, g7Var.h));
                            d7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            y9Var.e(user, d7Var);
                            y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            d7Var.k(i11, chat2);
                            y9Var.e(chat, d7Var);
                        }
                    } else if (E.icon_emoji_id != j3) {
                        y9Var.setImageDrawable(null);
                        y9Var.setAnimatedEmojiDrawable(new s5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        y9Var.setAnimatedEmojiDrawable(null);
                        ng.a aVar = new ng.a(E.icon_color);
                        r90 r90Var = new r90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        r90Var.a(str);
                        r90Var.f30107i = 1.8f;
                        hr hrVar = new hr(aVar, r90Var, 0, 0);
                        hrVar.f26897w = true;
                        y9Var.setImageDrawable(hrVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    y9Var.setRoundRadius(dp);
                    g7Var.d = dialog.f19806id;
                    g7Var.f21919e = E.f19854id;
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View g7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f29577c;
        if (i10 == 0 || i10 == 2) {
            c6Var = ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider;
            g7Var = new org.telegram.ui.Cells.g7(context, c6Var);
            g7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            g7Var = new View(context);
            g7Var.setLayoutParams(new s4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.d1(g7Var);
    }
}
