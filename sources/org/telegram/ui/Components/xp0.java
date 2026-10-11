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
public final class xp0 extends rm0 {
    public final org.telegram.ui.ActionBar.d6 f33002c;
    public final List d;
    public final MessagesController f33003e;
    public final int f33004f;
    public final TLRPC.Peer h;

    public xp0(org.telegram.ui.ActionBar.d6 d6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.f33002c = d6Var;
        this.d = list;
        this.f33003e = messagesController;
        this.f33004f = i10;
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
        bq0 bq0Var = (bq0) d1Var.f47748a;
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
        MessagesController messagesController = this.f33003e;
        boolean z10 = true;
        if (i11 < 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
            if (chat != null) {
                if (tL_sendAsPeer.premium_required) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = chat.title;
                    TextView textView = bq0Var.f25007b;
                    sb2.append((Object) TextUtils.ellipsize(str2, textView.getPaint(), this.f33004f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                    sb2.append(" d");
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    er erVar = new er(R.drawable.msg_mini_premiumlock, 0);
                    erVar.setTopOffset(1);
                    erVar.setSize(AndroidUtilities.dp(14.0f));
                    erVar.setColorKey(org.telegram.ui.ActionBar.h6.C6);
                    spannableString.setSpan(erVar, spannableString.length() - 1, spannableString.length(), 33);
                    textView.setEllipsize(null);
                    textView.setText(spannableString);
                } else {
                    bq0Var.f25007b.setEllipsize(TextUtils.TruncateAt.END);
                    bq0Var.f25007b.setText(chat.title);
                }
                TextView textView2 = bq0Var.f25008c;
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    str = "Subscribers";
                } else {
                    str = "Members";
                }
                textView2.setText(LocaleController.formatPluralString(str, chat.participants_count, new Object[0]));
                bq0Var.f25006a.setAvatar(chat);
            }
            kw0 kw0Var = bq0Var.f25006a;
            if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
                z10 = false;
            }
            kw0Var.a(z10, false);
            return;
        }
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        if (user != null) {
            bq0Var.f25007b.setText(UserObject.getUserName(user));
            bq0Var.f25008c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            bq0Var.f25006a.setAvatar(user);
        }
        kw0 kw0Var2 = bq0Var.f25006a;
        if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
            z10 = false;
        }
        kw0Var2.a(z10, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new bq0(viewGroup.getContext(), this.f33002c));
    }
}
