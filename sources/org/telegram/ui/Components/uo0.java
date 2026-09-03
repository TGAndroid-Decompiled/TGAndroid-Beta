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
public final class uo0 extends rl0 {
    public final org.telegram.ui.ActionBar.g6 f31658c;
    public final List d;
    public final MessagesController f31659e;
    public final int f31660f;
    public final TLRPC.Peer h;

    public uo0(org.telegram.ui.ActionBar.g6 g6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f31658c = g6Var;
        this.d = list;
        this.f31659e = messagesController;
        this.f31660f = i10;
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
        yo0 yo0Var = (yo0) m1Var.f5875a;
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
        MessagesController messagesController = this.f31659e;
        boolean z4 = true;
        if (j10 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = yo0Var.f33580b;
                    sb.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f31660f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
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
                    yo0Var.f33580b.setEllipsize(TextUtils.TruncateAt.END);
                    yo0Var.f33580b.setText(chat.title);
                }
                TextView textView2 = yo0Var.f33581c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                yo0Var.f33579a.setAvatar(chat);
            }
            fv0 fv0Var = yo0Var.f33579a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z4 = false;
            }
            fv0Var.a(z4, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            yo0Var.f33580b.setText(UserObject.getUserName(user));
            yo0Var.f33581c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            yo0Var.f33579a.setAvatar(user);
        }
        fv0 fv0Var2 = yo0Var.f33579a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z4 = false;
        }
        fv0Var2.a(z4, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new yo0(viewGroup.getContext(), this.f31658c));
    }
}
