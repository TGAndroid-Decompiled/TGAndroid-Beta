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

public final class ao0 extends yk0 {

    public final org.telegram.ui.ActionBar.c6 f26773c;
    public final List d;

    public final MessagesController f26774e;

    public final int f26775f;
    public final TLRPC.Peer h;

    public ao0(org.telegram.ui.ActionBar.c6 c6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f26773c = c6Var;
        this.d = list;
        this.f26774e = messagesController;
        this.f26775f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        eo0 eo0Var = (eo0) o1Var.f5789a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j10 = peer.channel_id;
        long j11 = j10 != 0 ? -j10 : 0L;
        if (j11 == 0) {
            long j12 = peer.user_id;
            if (j12 != 0) {
                j11 = j12;
            }
        }
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.f26774e;
        boolean z10 = true;
        if (j11 >= 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j11));
            if (user != null) {
                eo0Var.f28108b.setText(UserObject.getUserName(user));
                eo0Var.f28109c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                eo0Var.f28107a.setAvatar(user);
            }
            pu0 pu0Var = eo0Var.f28107a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            pu0Var.a(z10, false);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j11));
        if (chat != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = chat.title;
                TextView textView = eo0Var.f28108b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f26775f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                cq cqVar = new cq(R.drawable.msg_mini_premiumlock, 0);
                cqVar.setTopOffset(1);
                cqVar.setSize(AndroidUtilities.dp(14.0f));
                cqVar.setColorKey(org.telegram.ui.ActionBar.g6.C6);
                spannableString.setSpan(cqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                eo0Var.f28108b.setEllipsize(TextUtils.TruncateAt.END);
                eo0Var.f28108b.setText(chat.title);
            }
            eo0Var.f28109c.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
            eo0Var.f28107a.setAvatar(chat);
        }
        pu0 pu0Var2 = eo0Var.f28107a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        pu0Var2.a(z10, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new eo0(viewGroup.getContext(), this.f26773c));
    }
}
