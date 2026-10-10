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
public final class mu0 extends qm0 {
    public final Context f28899c;
    public TLRPC.ChatFull d;
    public ArrayList f28900e;
    public final cw0 f28901f;

    public mu0(cw0 cw0Var, Context context) {
        this.f28901f = cw0Var;
        this.f28899c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
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
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        cw0 cw0Var = this.f28901f;
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.xa) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            if (!this.f28900e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f28900e.get(i10)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i10);
            }
            if (chatParticipant != null) {
                boolean z18 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        z16 = true;
                        z17 = true;
                        z15 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        if (channelParticipant.promoted_by == n2Var.getUserConfig().getClientUserId()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = true;
                        z17 = false;
                    } else {
                        z15 = false;
                        z16 = false;
                        z17 = false;
                    }
                    boolean z19 = z17;
                    z12 = z15;
                    z10 = z16;
                    z11 = z19;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        if (chatParticipant.inviter_id == n2Var.getUserConfig().getClientUserId()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z12 = z13;
                        str = str3;
                        z10 = true;
                        z11 = false;
                    } else {
                        str = str3;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                    }
                }
                TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (UserObject.isUserSelf(user) && ChatObject.canManageMyTag(n2Var.getMessagesController().getChat(Long.valueOf(-cw0Var.f25449j1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                xaVar.a(str, z10, z11, z14, new k70(this, user, str, z10, z11, z12, 1));
                if (i10 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                xaVar.d(user, null, null, z18);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var = this.f28901f;
        if (i10 == 20) {
            pu0 M = cw0.M(7, cw0Var.f25449j1, this.f28899c, cw0Var.F1);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        org.telegram.ui.Cells.xa xaVar = new org.telegram.ui.Cells.xa(9, 0, this.f28899c, cw0Var.F1, true, false);
        xaVar.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(xaVar);
    }
}
