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
public final class wp0 extends qm0 {
    public final org.telegram.ui.ActionBar.e6 f32724c;
    public final List d;
    public final MessagesController f32725e;
    public final int f32726f;
    public final TLRPC.Peer h;

    public wp0(org.telegram.ui.ActionBar.e6 e6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f32724c = e6Var;
        this.d = list;
        this.f32725e = messagesController;
        this.f32726f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        long j3;
        String str;
        aq0 aq0Var = (aq0) d1Var.f47702a;
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
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.f32725e;
        boolean z10 = true;
        if (i11 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = aq0Var.f24609b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f32726f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    er erVar = new er(R.drawable.msg_mini_premiumlock, 0);
                    erVar.setTopOffset(1);
                    erVar.setSize(AndroidUtilities.dp(14.0f));
                    erVar.setColorKey(org.telegram.ui.ActionBar.i6.C6);
                    spannableString.setSpan(erVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    aq0Var.f24609b.setEllipsize(TextUtils.TruncateAt.END);
                    aq0Var.f24609b.setText(chat.title);
                }
                TextView textView2 = aq0Var.f24610c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                aq0Var.f24608a.setAvatar(chat);
            }
            jw0 jw0Var = aq0Var.f24608a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            jw0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            aq0Var.f24609b.setText(UserObject.getUserName(user));
            aq0Var.f24610c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            aq0Var.f24608a.setAvatar(user);
        }
        jw0 jw0Var2 = aq0Var.f24608a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        jw0Var2.a(z10, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new aq0(viewGroup.getContext(), this.f32724c));
    }
}
