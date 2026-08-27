package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

public final class k00 extends yk0 {

    public final q00 f29870c;

    public k00(q00 q00Var) {
        this.f29870c = q00Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        if (o1Var.f5793f != 2) {
            return false;
        }
        int iB = o1Var.b();
        q00 q00Var = this.f29870c;
        return iB >= q00Var.f31734n0 && o1Var.b() <= q00Var.f31735o0;
    }

    @Override
    public final int h() {
        return this.f29870c.f31732k0;
    }

    @Override
    public final int j(int i10) {
        q00 q00Var = this.f29870c;
        q00Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == q00Var.f31733l0 || i10 == q00Var.f31736p0 || i10 == q00Var.f31740t0) {
            return 1;
        }
        return (i10 == q00Var.m0 || i10 == q00Var.f31737q0) ? 3 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        String userName;
        String string;
        String string2;
        TLRPC.Chat chat;
        q00 q00Var = this.f29870c;
        ArrayList arrayList2 = q00Var.f31724c0;
        org.telegram.ui.ActionBar.n2 n2Var = q00Var.f31855n;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                n00 n00Var = (n00) view;
                if (i10 == q00Var.f31737q0) {
                    n00Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    n00Var.a("", null);
                    return;
                } else {
                    q00Var.f31741u0 = n00Var;
                    q00Var.V();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    q00Var.f31731j0 = (p00) view;
                    q00Var.U(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setForeground(org.telegram.ui.ActionBar.g6.V0(q00Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
            if (i10 == q00Var.f31740t0 || i10 == q00Var.f31733l0 || arrayList2 == null || arrayList2.isEmpty()) {
                x8Var.setFixedSize(12);
                x8Var.setText("");
                return;
            }
            x8Var.setFixedSize(0);
            if (q00Var.X) {
                x8Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                x8Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        int i12 = q00Var.f31734n0;
        if (i10 < i12 || i10 > q00Var.f31735o0) {
            int i13 = q00Var.f31738r0;
            if (i10 < i13 || i10 > q00Var.f31739s0 || (arrayList = q00Var.f31727f0) == null) {
                peer = null;
            } else {
                peer = (TLRPC.Peer) arrayList.get(i10 - i13);
            }
        } else if (arrayList2 != null) {
            peer = (TLRPC.Peer) arrayList2.get(i10 - i12);
        } else {
            peer = null;
        }
        if (peer == null) {
            j10 = 0;
            userName = null;
            string = null;
        } else if (peer instanceof TLRPC.TL_peerUser) {
            j10 = peer.user_id;
            user = n2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
            userName = UserObject.getUserName(user);
            string = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
        } else {
            if (peer instanceof TLRPC.TL_peerChat) {
                j10 = -peer.chat_id;
                chat = n2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
            } else if (peer instanceof TLRPC.TL_peerChannel) {
                j10 = -peer.channel_id;
                chat = n2Var.getMessagesController().getChat(Long.valueOf(peer.channel_id));
            } else {
                j10 = 0;
                userName = null;
                string = null;
            }
            string = null;
            user = chat;
            userName = null;
        }
        if (user instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) user;
            String str = chat2.title;
            if (chat2.participants_count != 0) {
                string2 = ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count) : LocaleController.formatPluralStringComma("Members", chat2.participants_count);
            } else {
                string2 = ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.getString(R.string.ChannelPublic) : LocaleController.getString(R.string.MegaPublic);
            }
            string = string2;
            userName = str;
        }
        d4Var.setTag(Long.valueOf(j10));
        CheckBoxBase checkBoxBase = d4Var.getCheckBox().getCheckBoxBase();
        float f10 = q00Var.f31725d0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
        if (checkBoxBase.h != f10) {
            checkBoxBase.h = f10;
            checkBoxBase.b();
        }
        d4Var.c(q00Var.f31726e0.contains(Long.valueOf(j10)), false);
        d4Var.d(user, userName, string);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View n00Var;
        q00 q00Var = this.f29870c;
        if (i10 == 0) {
            p00 p00Var = new p00(q00Var, q00Var.getContext(), (q00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || q00Var.W != null, q00Var.f31723b0, q00Var.Z, q00Var.f31722a0);
            q00Var.f31731j0 = p00Var;
            view = p00Var;
        } else {
            view = null;
            if (i10 == 1) {
                n00Var = new org.telegram.ui.Cells.x8(q00Var.getContext());
                n00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
            } else if (i10 == 2) {
                org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(q00Var.getContext(), 1, 0, false);
                d4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                view = d4Var;
            } else if (i10 == 3) {
                n00Var = new n00(q00Var.getContext());
                n00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            }
            view = n00Var;
        }
        return new lk0(view);
    }
}
