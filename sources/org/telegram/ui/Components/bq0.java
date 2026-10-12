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
public final class bq0 extends vm0 {
    public final org.telegram.ui.ActionBar.c6 f24712c;
    public final List d;
    public final MessagesController f24713e;
    public final int f24714f;
    public final TLRPC.Peer h;

    public bq0(org.telegram.ui.ActionBar.c6 c6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f24712c = c6Var;
        this.d = list;
        this.f24713e = messagesController;
        this.f24714f = i10;
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
        fq0 fq0Var = (fq0) d1Var.f47897a;
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
        MessagesController messagesController = this.f24713e;
        boolean z10 = true;
        if (i11 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = fq0Var.f26156b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f24714f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    gr grVar = new gr(R.drawable.msg_mini_premiumlock, 0);
                    grVar.setTopOffset(1);
                    grVar.setSize(AndroidUtilities.dp(14.0f));
                    grVar.setColorKey(org.telegram.ui.ActionBar.h6.C6);
                    spannableString.setSpan(grVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    fq0Var.f26156b.setEllipsize(TextUtils.TruncateAt.END);
                    fq0Var.f26156b.setText(chat.title);
                }
                TextView textView2 = fq0Var.f26157c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                fq0Var.f26155a.setAvatar(chat);
            }
            ow0 ow0Var = fq0Var.f26155a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            ow0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            fq0Var.f26156b.setText(UserObject.getUserName(user));
            fq0Var.f26157c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            fq0Var.f26155a.setAvatar(user);
        }
        ow0 ow0Var2 = fq0Var.f26155a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        ow0Var2.a(z10, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new fq0(viewGroup.getContext(), this.f24712c));
    }
}
