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
public final class ap0 extends ul0 {
    public final org.telegram.ui.ActionBar.f6 f21557c;
    public final List d;
    public final MessagesController e;
    public final int f21558f;
    public final TLRPC.Peer h;

    public ap0(org.telegram.ui.ActionBar.f6 f6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f21557c = f6Var;
        this.d = list;
        this.e = messagesController;
        this.f21558f = i10;
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
        ep0 ep0Var = (ep0) c1Var.f41610a;
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
        MessagesController messagesController = this.e;
        boolean z10 = true;
        if (j3 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = ep0Var.f22740b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f21558f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    uq uqVar = new uq(R.drawable.msg_mini_premiumlock, 0);
                    uqVar.setTopOffset(1);
                    uqVar.setSize(AndroidUtilities.dp(14.0f));
                    uqVar.setColorKey(org.telegram.ui.ActionBar.j6.C6);
                    spannableString.setSpan(uqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    ep0Var.f22740b.setEllipsize(TextUtils.TruncateAt.END);
                    ep0Var.f22740b.setText(chat.title);
                }
                TextView textView2 = ep0Var.f22741c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                ep0Var.f22739a.setAvatar(chat);
            }
            pv0 pv0Var = ep0Var.f22739a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            pv0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            ep0Var.f22740b.setText(UserObject.getUserName(user));
            ep0Var.f22741c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            ep0Var.f22739a.setAvatar(user);
        }
        pv0 pv0Var2 = ep0Var.f22739a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        pv0Var2.a(z10, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new ep0(viewGroup.getContext(), this.f21557c));
    }
}
