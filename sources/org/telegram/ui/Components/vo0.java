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
public final class vo0 extends sl0 {
    public final org.telegram.ui.ActionBar.g6 f31938c;
    public final List d;
    public final MessagesController f31939e;
    public final int f31940f;
    public final TLRPC.Peer h;

    public vo0(org.telegram.ui.ActionBar.g6 g6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f31938c = g6Var;
        this.d = list;
        this.f31939e = messagesController;
        this.f31940f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        long j10;
        String str;
        zo0 zo0Var = (zo0) m1Var.f5875a;
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
        MessagesController messagesController = this.f31939e;
        boolean z4 = true;
        if (j10 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = zo0Var.f33934b;
                    sb.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f31940f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb.append(" d");
                    SpannableString spannableString = new SpannableString(sb.toString());
                    oq oqVar = new oq(R.drawable.msg_mini_premiumlock, 0);
                    oqVar.setTopOffset(1);
                    oqVar.setSize(AndroidUtilities.dp(14.0f));
                    oqVar.setColorKey(org.telegram.ui.ActionBar.k6.C6);
                    spannableString.setSpan(oqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    zo0Var.f33934b.setEllipsize(TextUtils.TruncateAt.END);
                    zo0Var.f33934b.setText(chat.title);
                }
                TextView textView2 = zo0Var.f33935c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                zo0Var.f33933a.setAvatar(chat);
            }
            gv0 gv0Var = zo0Var.f33933a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z4 = false;
            }
            gv0Var.a(z4, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            zo0Var.f33934b.setText(UserObject.getUserName(user));
            zo0Var.f33935c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            zo0Var.f33933a.setAvatar(user);
        }
        gv0 gv0Var2 = zo0Var.f33933a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z4 = false;
        }
        gv0Var2.a(z4, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new zo0(viewGroup.getContext(), this.f31938c));
    }
}
