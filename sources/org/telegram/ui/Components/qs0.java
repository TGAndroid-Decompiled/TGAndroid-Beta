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

public final class qs0 extends yk0 {

    public final Context f31969c;
    public TLRPC.ChatFull d;

    public ArrayList f31970e;

    public final hu0 f31971f;

    public qs0(hu0 hu0Var, Context context) {
        this.f31971f = hu0Var;
        this.f31969c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
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
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        hu0 hu0Var = this.f31971f;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            TLRPC.ChatParticipant chatParticipant = !this.f31970e.isEmpty() ? this.d.participants.participants.get(((Integer) this.f31970e.get(i10)).intValue()) : this.d.participants.participants.get(i10);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String string = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(string)) {
                            string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        z13 = false;
                        z14 = true;
                        z15 = true;
                    } else {
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(string)) {
                                string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            z13 = channelParticipant.promoted_by == n2Var.getUserConfig().getClientUserId();
                            z14 = true;
                        } else {
                            z13 = false;
                            z14 = false;
                        }
                        z15 = false;
                    }
                    boolean z16 = z15;
                    z12 = z13;
                    z10 = z14;
                    z11 = z16;
                    str = string;
                } else {
                    String string2 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(string2)) {
                            string2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                        }
                        str = string2;
                        z10 = true;
                        z11 = true;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(string2)) {
                            string2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z12 = chatParticipant.inviter_id == n2Var.getUserConfig().getClientUserId();
                        str = string2;
                        z10 = true;
                        z11 = false;
                    } else {
                        str = string2;
                        z10 = false;
                        z11 = false;
                    }
                    z12 = false;
                }
                TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                saVar.a(str, z10, z11, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(n2Var.getMessagesController().getChat(Long.valueOf(-hu0Var.f29121f1))), new v50(this, user, str, z10, z11, z12, 1));
                saVar.e(user, null, null, i10 != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.f31971f;
        if (i10 != 20) {
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(9, 0, this.f31969c, hu0Var.B1, true, false);
            saVar.setLayoutParams(new f2.y0(-1, -2));
            return new lk0(saVar);
        }
        ts0 ts0VarM = hu0.M(7, hu0Var.f29121f1, this.f31969c, hu0Var.B1);
        ts0VarM.setLayoutParams(new f2.y0(-1, -1));
        return new lk0(ts0VarM);
    }
}
