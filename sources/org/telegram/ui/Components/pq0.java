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
public final class pq0 extends ul0 {
    public final Context f26234c;
    public boolean d;
    public boolean e;
    public ArrayList f26235f;
    public final sq0 h;

    public pq0(sq0 sq0Var, Context context) {
        this.h = sq0Var;
        this.f26234c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f26235f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f26235f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f26235f;
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
        if (c1Var.f41613f == 0) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) c1Var.f41610a;
            if (i10 == 1 && this.d) {
                i7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f26235f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                sq0 sq0Var = this.h;
                TLRPC.Dialog dialog = sq0Var.C0;
                if (E != null && sq0Var.U.h(E.f17247id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.f7 f7Var = i7Var.f19313b;
                int i11 = i7Var.f19315f;
                w9 w9Var = i7Var.f19312a;
                TextView textView = i7Var.f19314c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f17199id));
                    String str = "";
                    if (dialog.f17199id > 0) {
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
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, i7Var.h));
                            f7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            w9Var.e(user, f7Var);
                            w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            f7Var.k(i11, chat2);
                            w9Var.e(chat, f7Var);
                        }
                    } else if (E.icon_emoji_id != 0) {
                        w9Var.setImageDrawable(null);
                        w9Var.setAnimatedEmojiDrawable(new p5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        w9Var.setAnimatedEmojiDrawable(null);
                        mg.a aVar = new mg.a(E.icon_color);
                        v80 v80Var = new v80(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        v80Var.a(str);
                        v80Var.f27884i = 1.8f;
                        vq vqVar = new vq(aVar, v80Var, 0, 0);
                        vqVar.f28580w = true;
                        w9Var.setImageDrawable(vqVar);
                    }
                    if (chat != null && chat.forum && !z11) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    w9Var.setRoundRadius(dp);
                    i7Var.d = dialog.f17199id;
                    i7Var.e = E.f17247id;
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View i7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f26234c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.h3) this.h).resourcesProvider;
            i7Var = new org.telegram.ui.Cells.i7(context, f6Var);
            i7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            i7Var = new View(context);
            i7Var.setLayoutParams(new s4.p0(-1, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
        }
        return new s4.c1(i7Var);
    }
}
