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
public final class wp0 extends lm0 {
    public final org.telegram.ui.ActionBar.u6 f34516c;
    public final List d;
    public final MessagesController e;
    public final int f34517f;
    public final TLRPC.Peer h;

    public wp0(org.telegram.ui.ActionBar.u6 u6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f34516c = u6Var;
        this.d = list;
        this.e = messagesController;
        this.f34517f = i10;
        this.h = peer;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        String str;
        aq0 aq0Var = (aq0) e1Var.f47735a;
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
                    TextView textView = aq0Var.f26588b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f34517f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    zq zqVar = new zq(R.drawable.msg_mini_premiumlock, 0);
                    zqVar.setTopOffset(1);
                    zqVar.setSize(AndroidUtilities.dp(14.0f));
                    zqVar.setColorKey(org.telegram.ui.ActionBar.y6.C6);
                    spannableString.setSpan(zqVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    aq0Var.f26588b.setEllipsize(TextUtils.TruncateAt.END);
                    aq0Var.f26588b.setText(chat.title);
                }
                TextView textView2 = aq0Var.f26589c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                aq0Var.f26587a.setAvatar(chat);
            }
            mw0 mw0Var = aq0Var.f26587a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            mw0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            aq0Var.f26588b.setText(UserObject.getUserName(user));
            aq0Var.f26589c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            aq0Var.f26587a.setAvatar(user);
        }
        mw0 mw0Var2 = aq0Var.f26587a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        mw0Var2.a(z10, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new aq0(viewGroup.getContext(), this.f34516c));
    }
}
