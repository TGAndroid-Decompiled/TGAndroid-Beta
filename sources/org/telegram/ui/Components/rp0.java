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
public final class rp0 extends lm0 {
    public final org.telegram.ui.ActionBar.g6 f30240c;
    public final List d;
    public final MessagesController e;
    public final int f30241f;
    public final TLRPC.Peer h;

    public rp0(org.telegram.ui.ActionBar.g6 g6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f30240c = g6Var;
        this.d = list;
        this.e = messagesController;
        this.f30241f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        long j10;
        String str;
        vp0 vp0Var = (vp0) b1Var.f46343a;
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
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.e;
        boolean z10 = true;
        if (i11 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = vp0Var.f32039b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f30241f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    xq xqVar = new xq(R.drawable.msg_mini_premiumlock, 0);
                    xqVar.setTopOffset(1);
                    xqVar.setSize(AndroidUtilities.dp(14.0f));
                    xqVar.setColorKey(org.telegram.ui.ActionBar.k6.C6);
                    spannableString.setSpan(xqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    vp0Var.f32039b.setEllipsize(TextUtils.TruncateAt.END);
                    vp0Var.f32039b.setText(chat.title);
                }
                TextView textView2 = vp0Var.f32040c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                vp0Var.f32038a.setAvatar(chat);
            }
            ew0 ew0Var = vp0Var.f32038a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            ew0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            vp0Var.f32039b.setText(UserObject.getUserName(user));
            vp0Var.f32040c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            vp0Var.f32038a.setAvatar(user);
        }
        ew0 ew0Var2 = vp0Var.f32038a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        ew0Var2.a(z10, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new vp0(viewGroup.getContext(), this.f30240c));
    }
}
