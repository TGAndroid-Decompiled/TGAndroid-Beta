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
public final class lr0 extends rm0 {
    public final Context f28443c;
    public boolean d;
    public boolean f28444e;
    public ArrayList f28445f;
    public final or0 h;

    public lr0(or0 or0Var, Context context) {
        this.h = or0Var;
        this.f28443c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f28445f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f28445f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f28445f;
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
        if (d1Var.f47752f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) d1Var.f47748a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.f28444e);
            } else if (this.f28445f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                or0 or0Var = this.h;
                TLRPC.Dialog dialog = or0Var.C0;
                if (E != null && or0Var.U.h(E.f20084id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.e7 e7Var = h7Var.f22203b;
                int i11 = h7Var.f22206f;
                y9 y9Var = h7Var.f22202a;
                TextView textView = h7Var.f22204c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20036id));
                    String str = "";
                    if (dialog.f20036id > 0) {
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
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20894j5, h7Var.h));
                            e7Var.m(i11, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            y9Var.e(user, e7Var);
                            y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            e7Var.k(i11, chat2);
                            y9Var.e(chat, e7Var);
                        }
                    } else if (E.icon_emoji_id != j3) {
                        y9Var.setImageDrawable(null);
                        y9Var.setAnimatedEmojiDrawable(new s5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                    } else {
                        y9Var.setAnimatedEmojiDrawable(null);
                        ng.a aVar = new ng.a(E.icon_color);
                        o90 o90Var = new o90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        o90Var.a(str);
                        o90Var.f29355i = 1.8f;
                        fr frVar = new fr(aVar, o90Var, 0, 0);
                        frVar.f26475w = true;
                        y9Var.setImageDrawable(frVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    y9Var.setRoundRadius(dp);
                    h7Var.d = dialog.f20036id;
                    h7Var.f22205e = E.f20084id;
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f28443c;
        if (i10 == 0 || i10 == 2) {
            d6Var = ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, d6Var);
            h7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.d1(h7Var);
    }
}
