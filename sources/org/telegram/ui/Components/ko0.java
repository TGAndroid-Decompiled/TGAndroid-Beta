package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class ko0 extends il0 {
    public final org.telegram.ui.ActionBar.c6 f30118c;
    public final List d;
    public final MessagesController f30119e;
    public final int f30120f;
    public final TLRPC.Peer h;

    public ko0(org.telegram.ui.ActionBar.c6 c6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f30118c = c6Var;
        this.d = list;
        this.f30119e = messagesController;
        this.f30120f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        long j10;
        String str;
        oo0 oo0Var = (oo0) n1Var.f6432a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j11 = peer.channel_id;
        if (j11 != 0) {
            j10 = -j11;
        } else {
            j10 = 0;
        }
        if (j10 == 0) {
            long j12 = peer.user_id;
            if (j12 != 0) {
                j10 = j12;
            }
        }
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.f30119e;
        boolean z10 = true;
        if (j10 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = oo0Var.f31443b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f30120f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    iq iqVar = new iq(R.drawable.msg_mini_premiumlock, 0);
                    iqVar.setTopOffset(1);
                    iqVar.setSize(AndroidUtilities.dp(14.0f));
                    iqVar.setColorKey(org.telegram.ui.ActionBar.g6.C6);
                    spannableString.setSpan(iqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    oo0Var.f31443b.setEllipsize(TextUtils.TruncateAt.END);
                    oo0Var.f31443b.setText(chat.title);
                }
                TextView textView2 = oo0Var.f31444c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                oo0Var.f31442a.setAvatar(chat);
            }
            xu0 xu0Var = oo0Var.f31442a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            xu0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            oo0Var.f31443b.setText(UserObject.getUserName(user));
            oo0Var.f31444c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            oo0Var.f31442a.setAvatar(user);
        }
        xu0 xu0Var2 = oo0Var.f31442a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        xu0Var2.a(z10, false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new oo0(viewGroup.getContext(), this.f30118c));
    }
}
