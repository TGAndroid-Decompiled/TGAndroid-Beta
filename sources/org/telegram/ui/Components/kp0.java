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
public final class kp0 extends yl0 {
    public final org.telegram.ui.ActionBar.d6 f28269c;
    public final List d;
    public final MessagesController f28270e;
    public final int f28271f;
    public final TLRPC.Peer h;

    public kp0(org.telegram.ui.ActionBar.d6 d6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f28269c = d6Var;
        this.d = list;
        this.f28270e = messagesController;
        this.f28271f = i10;
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
        op0 op0Var = (op0) c1Var.f46538a;
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
        MessagesController messagesController = this.f28270e;
        boolean z10 = true;
        if (j3 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = op0Var.f29533b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f28271f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    rq rqVar = new rq(R.drawable.msg_mini_premiumlock, 0);
                    rqVar.setTopOffset(1);
                    rqVar.setSize(AndroidUtilities.dp(14.0f));
                    rqVar.setColorKey(org.telegram.ui.ActionBar.i6.C6);
                    spannableString.setSpan(rqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    op0Var.f29533b.setEllipsize(TextUtils.TruncateAt.END);
                    op0Var.f29533b.setText(chat.title);
                }
                TextView textView2 = op0Var.f29534c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                op0Var.f29532a.setAvatar(chat);
            }
            cw0 cw0Var = op0Var.f29532a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            cw0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            op0Var.f29533b.setText(UserObject.getUserName(user));
            op0Var.f29534c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            op0Var.f29532a.setAvatar(user);
        }
        cw0 cw0Var2 = op0Var.f29532a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        cw0Var2.a(z10, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new op0(viewGroup.getContext(), this.f28269c));
    }
}
