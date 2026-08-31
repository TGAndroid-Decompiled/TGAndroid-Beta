package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class it0 extends sl0 {
    public final Context f27901c;
    public TLRPC.ChatFull d;
    public ArrayList f27902e;
    public final zu0 f27903f;

    public it0(zu0 zu0Var, Context context) {
        this.f27903f = zu0Var;
        this.f27901c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 1;
        }
        TLRPC.ChatFull chatFull2 = this.d;
        if (chatFull2 != null) {
            return chatFull2.participants.participants.size();
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 20;
        }
        return 21;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        zu0 zu0Var = this.f27903f;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            if (!this.f27902e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f27902e.get(i10)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i10);
            }
            if (chatParticipant != null) {
                boolean z17 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        z14 = false;
                        z15 = true;
                        z16 = true;
                    } else {
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            if (channelParticipant.promoted_by == p2Var.getUserConfig().getClientUserId()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = true;
                        } else {
                            z14 = false;
                            z15 = false;
                        }
                        z16 = false;
                    }
                    boolean z18 = z16;
                    z12 = z14;
                    z4 = z15;
                    z10 = z18;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = str3;
                        z4 = true;
                        z10 = true;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        if (chatParticipant.inviter_id == p2Var.getUserConfig().getClientUserId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11;
                        str = str3;
                        z4 = true;
                        z10 = false;
                    } else {
                        str = str3;
                        z4 = false;
                        z10 = false;
                    }
                    z12 = false;
                }
                TLRPC.User user = p2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (UserObject.isUserSelf(user) && ChatObject.canManageMyTag(p2Var.getMessagesController().getChat(Long.valueOf(-zu0Var.f33979g1)))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                vaVar.a(str, z4, z10, z13, new k60(this, user, str, z4, z10, z12, 1));
                if (i10 == this.d.participants.participants.size() - 1) {
                    z17 = false;
                }
                vaVar.d(user, null, null, z17);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.f27903f;
        if (i10 == 20) {
            lt0 M = zu0.M(7, zu0Var.f33979g1, this.f27901c, zu0Var.C1);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new f2.m1(M);
        }
        org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(9, 0, this.f27901c, zu0Var.C1, true, false);
        vaVar.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(vaVar);
    }
}
