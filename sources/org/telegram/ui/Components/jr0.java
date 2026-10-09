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
public final class jr0 extends pm0 {
    public final Context f27770c;
    public boolean d;
    public boolean f27771e;
    public ArrayList f27772f;
    public final mr0 h;

    public jr0(mr0 mr0Var, Context context) {
        this.h = mr0Var;
        this.f27770c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f27772f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f27772f.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        int i10;
        ArrayList arrayList = this.f27772f;
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
        if (d1Var.f47662f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) d1Var.f47658a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.f27771e);
            } else if (this.f27772f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                mr0 mr0Var = this.h;
                TLRPC.Dialog dialog = mr0Var.C0;
                if (E != null && mr0Var.U.h(E.f20090id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.e7 e7Var = h7Var.f22211b;
                int i11 = h7Var.f22214f;
                y9 y9Var = h7Var.f22210a;
                TextView textView = h7Var.f22212c;
                if (dialog != null) {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20042id));
                    String str = "";
                    if (dialog.f20042id > 0) {
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
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, h7Var.h));
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
                        n90 n90Var = new n90(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        n90Var.a(str);
                        n90Var.f29093i = 1.8f;
                        fr frVar = new fr(aVar, n90Var, 0, 0);
                        frVar.f26471w = true;
                        y9Var.setImageDrawable(frVar);
                    }
                    if (chat != null && chat.forum && !z10) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(28.0f);
                    }
                    y9Var.setRoundRadius(dp);
                    h7Var.d = dialog.f20042id;
                    h7Var.f22213e = E.f20090id;
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f27770c;
        if (i10 == 0 || i10 == 2) {
            e6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, e6Var);
            h7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new s4.d1(h7Var);
    }
}
