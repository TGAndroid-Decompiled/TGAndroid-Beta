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
public final class jp0 extends yl0 {
    public final org.telegram.ui.ActionBar.d6 f27871c;
    public final List d;
    public final MessagesController f27872e;
    public final int f27873f;
    public final TLRPC.Peer h;

    public jp0(org.telegram.ui.ActionBar.d6 d6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f27871c = d6Var;
        this.d = list;
        this.f27872e = messagesController;
        this.f27873f = i10;
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
        np0 np0Var = (np0) c1Var.f46523a;
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
        MessagesController messagesController = this.f27872e;
        boolean z10 = true;
        if (j3 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = np0Var.f29040b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f27873f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
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
                    np0Var.f29040b.setEllipsize(TextUtils.TruncateAt.END);
                    np0Var.f29040b.setText(chat.title);
                }
                TextView textView2 = np0Var.f29041c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                np0Var.f29039a.setAvatar(chat);
            }
            bw0 bw0Var = np0Var.f29039a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            bw0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            np0Var.f29040b.setText(UserObject.getUserName(user));
            np0Var.f29041c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            np0Var.f29039a.setAvatar(user);
        }
        bw0 bw0Var2 = np0Var.f29039a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        bw0Var2.a(z10, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new np0(viewGroup.getContext(), this.f27871c));
    }
}
