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
public final class os0 extends vk0 {
    public final Context f31436c;
    public TLRPC.ChatFull d;
    public ArrayList f31437e;
    public final eu0 f31438f;

    public os0(eu0 eu0Var, Context context) {
        this.f31438f = eu0Var;
        this.f31436c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
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
    public final int j(int i9) {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 20;
        }
        return 21;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
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
        eu0 eu0Var = this.f31438f;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.va) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            if (!this.f31437e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f31437e.get(i9)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i9);
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
                            if (channelParticipant.promoted_by == o2Var.getUserConfig().getClientUserId()) {
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
                        if (chatParticipant.inviter_id == o2Var.getUserConfig().getClientUserId()) {
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
                TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (UserObject.isUserSelf(user) && ChatObject.canManageMyTag(o2Var.getMessagesController().getChat(Long.valueOf(-eu0Var.f28136f1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                vaVar.a(str, z10, z11, z14, new q50(this, user, str, z10, z11, z13, 1));
                if (i9 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                vaVar.e(user, null, null, z18);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.f31438f;
        if (i9 == 20) {
            rs0 M = eu0.M(7, eu0Var.f28136f1, this.f31436c, eu0Var.B1);
            M.setLayoutParams(new f2.a1(-1, -1));
            return new f2.q1(M);
        }
        org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(9, 0, this.f31436c, eu0Var.B1, true, false);
        vaVar.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(vaVar);
    }
}
