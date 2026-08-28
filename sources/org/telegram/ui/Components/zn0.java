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
public final class zn0 extends vk0 {
    public final org.telegram.ui.ActionBar.b6 f35343c;
    public final List d;
    public final MessagesController f35344e;
    public final int f35345f;
    public final TLRPC.Peer h;

    public zn0(org.telegram.ui.ActionBar.b6 b6Var, List list, MessagesController messagesController, int i9, TLRPC.Peer peer) {
        this.f35343c = b6Var;
        this.d = list;
        this.f35344e = messagesController;
        this.f35345f = i9;
        this.h = peer;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        long j10;
        String str;
        do0 do0Var = (do0) q1Var.f5501a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i9);
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
        MessagesController messagesController = this.f35344e;
        boolean z10 = true;
        if (j10 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = do0Var.f27779b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f35345f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    eq eqVar = new eq(R.drawable.msg_mini_premiumlock, 0);
                    eqVar.setTopOffset(1);
                    eqVar.setSize(AndroidUtilities.dp(14.0f));
                    eqVar.setColorKey(org.telegram.ui.ActionBar.f6.C6);
                    spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    do0Var.f27779b.setEllipsize(TextUtils.TruncateAt.END);
                    do0Var.f27779b.setText(chat.title);
                }
                TextView textView2 = do0Var.f27780c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                do0Var.f27778a.setAvatar(chat);
            }
            mu0 mu0Var = do0Var.f27778a;
            if (peer2 == null ? i9 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            mu0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            do0Var.f27779b.setText(UserObject.getUserName(user));
            do0Var.f27780c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            do0Var.f27778a.setAvatar(user);
        }
        mu0 mu0Var2 = do0Var.f27778a;
        if (peer2 == null ? i9 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        mu0Var2.a(z10, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new do0(viewGroup.getContext(), this.f35343c));
    }
}
