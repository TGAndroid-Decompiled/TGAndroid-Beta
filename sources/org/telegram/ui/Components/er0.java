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
public final class er0 extends km0 {
    public final Context f26104c;
    public boolean d;
    public boolean e;
    public ArrayList f26105f;
    public final hr0 h;

    public er0(hr0 hr0Var, Context context) {
        this.h = hr0Var;
        this.f26104c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f26105f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f26105f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f26105f;
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
        if (b1Var.f46345f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) b1Var.f46342a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f26105f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                hr0 hr0Var = this.h;
                TLRPC.Dialog dialog = hr0Var.D0;
                if (E != null && hr0Var.V.h(E.f20396id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.e7 e7Var = h7Var.f22474b;
                int i11 = h7Var.f22476f;
                u9 u9Var = h7Var.f22473a;
                TextView textView = h7Var.f22475c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20348id));
                    String str = "";
                    if (dialog.f20348id > 0) {
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
                        u9Var.setAnimatedEmojiDrawable(null);
                        u9Var.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                        if (DialogObject.isUserDialog(peerDialogId)) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, h7Var.h);
                            e7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            u9Var.e(user, e7Var);
                            u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            e7Var.k(i11, chat2);
                            u9Var.e(chat, e7Var);
                        }
                    } else if (E.icon_emoji_id != j10) {
                        u9Var.setImageDrawable(null);
                        u9Var.setAnimatedEmojiDrawable(new p5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        u9Var.setAnimatedEmojiDrawable(null);
                        og.a aVar = new og.a(E.icon_color);
                        e90 e90Var = new e90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        e90Var.a(str);
                        e90Var.f26004i = 1.8f;
                        wq wqVar = new wq(aVar, e90Var, 0, 0);
                        wqVar.f32329w = true;
                        u9Var.setImageDrawable(wqVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    u9Var.setRoundRadius(dp);
                    h7Var.d = dialog.f20348id;
                    h7Var.e = E.f20396id;
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f26104c;
        if (i10 == 0 || i10 == 2) {
            g6Var = ((org.telegram.ui.ActionBar.h3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, g6Var);
            h7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.o0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.b1(h7Var);
    }
}
