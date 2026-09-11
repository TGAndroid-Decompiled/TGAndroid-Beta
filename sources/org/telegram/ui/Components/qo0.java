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
public final class qo0 extends kl0 {
    public final org.telegram.ui.ActionBar.f6 f29785c;
    public final List d;
    public final MessagesController f29786e;
    public final int f29787f;
    public final TLRPC.Peer h;

    public qo0(org.telegram.ui.ActionBar.f6 f6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f29785c = f6Var;
        this.d = list;
        this.f29786e = messagesController;
        this.f29787f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        long j3;
        String str;
        uo0 uo0Var = (uo0) c1Var.f45738a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j10 = peer.channel_id;
        if (j10 != 0) {
            j3 = -j10;
        } else {
            j3 = 0;
        }
        if (j3 == 0) {
            long j11 = peer.user_id;
            if (j11 != 0) {
                j3 = j11;
            }
        }
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.f29786e;
        boolean z10 = true;
        if (j3 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = uo0Var.f30932b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f29787f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    nq nqVar = new nq(R.drawable.msg_mini_premiumlock, 0);
                    nqVar.setTopOffset(1);
                    nqVar.setSize(AndroidUtilities.dp(14.0f));
                    nqVar.setColorKey(org.telegram.ui.ActionBar.j6.C6);
                    spannableString.setSpan(nqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    uo0Var.f30932b.setEllipsize(TextUtils.TruncateAt.END);
                    uo0Var.f30932b.setText(chat.title);
                }
                TextView textView2 = uo0Var.f30933c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                uo0Var.f30931a.setAvatar(chat);
            }
            ev0 ev0Var = uo0Var.f30931a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            ev0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            uo0Var.f30932b.setText(UserObject.getUserName(user));
            uo0Var.f30933c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            uo0Var.f30931a.setAvatar(user);
        }
        ev0 ev0Var2 = uo0Var.f30931a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        ev0Var2.a(z10, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new uo0(viewGroup.getContext(), this.f29785c));
    }
}
