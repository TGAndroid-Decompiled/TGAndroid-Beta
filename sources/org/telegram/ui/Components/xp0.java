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
public final class xp0 extends mm0 {
    public final org.telegram.ui.ActionBar.u6 f34833c;
    public final List d;
    public final MessagesController e;
    public final int f34834f;
    public final TLRPC.Peer h;

    public xp0(org.telegram.ui.ActionBar.u6 u6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f34833c = u6Var;
        this.d = list;
        this.e = messagesController;
        this.f34834f = i10;
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
        bq0 bq0Var = (bq0) e1Var.f47773a;
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
                    TextView textView = bq0Var.f26893b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f34834f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
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
                    bq0Var.f26893b.setEllipsize(TextUtils.TruncateAt.END);
                    bq0Var.f26893b.setText(chat.title);
                }
                TextView textView2 = bq0Var.f26894c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                bq0Var.f26892a.setAvatar(chat);
            }
            nw0 nw0Var = bq0Var.f26892a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            nw0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        if (user != null) {
            bq0Var.f26893b.setText(UserObject.getUserName(user));
            bq0Var.f26894c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            bq0Var.f26892a.setAvatar(user);
        }
        nw0 nw0Var2 = bq0Var.f26892a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        nw0Var2.a(z10, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new bq0(viewGroup.getContext(), this.f34833c));
    }
}
