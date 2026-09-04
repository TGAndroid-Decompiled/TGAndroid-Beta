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
public final class ht0 extends kl0 {
    public final Context f26844c;
    public TLRPC.ChatFull d;
    public ArrayList f26845e;
    public final xu0 f26846f;

    public ht0(xu0 xu0Var, Context context) {
        this.f26846f = xu0Var;
        this.f26844c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
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
        xu0 xu0Var = this.f26846f;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.za) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            if (!this.f26845e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f26845e.get(i10)).intValue());
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
                        z15 = false;
                        z16 = true;
                        z17 = true;
                    } else {
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            if (channelParticipant.promoted_by == n2Var.getUserConfig().getClientUserId()) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = true;
                        } else {
                            z15 = false;
                            z16 = false;
                        }
                        z17 = false;
                    }
                    boolean z19 = z17;
                    z13 = z15;
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
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        if (chatParticipant.inviter_id == n2Var.getUserConfig().getClientUserId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z12;
                        str = str3;
                        z10 = true;
                        z11 = false;
                    } else {
                        str = str3;
                        z10 = false;
                        z11 = false;
                    }
                    z13 = false;
                }
                TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (UserObject.isUserSelf(user) && ChatObject.canManageMyTag(n2Var.getMessagesController().getChat(Long.valueOf(-xu0Var.f32701j1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zaVar.a(str, z10, z11, z14, new h60(this, user, str, z10, z11, z13, 1));
                if (i10 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                zaVar.e(user, null, null, z18);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        xu0 xu0Var = this.f26846f;
        if (i10 == 20) {
            kt0 M = xu0.M(7, xu0Var.f32701j1, this.f26844c, xu0Var.F1);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.za zaVar = new org.telegram.ui.Cells.za(9, 0, this.f26844c, xu0Var.F1, true, false);
        zaVar.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(zaVar);
    }
}
