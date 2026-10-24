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
public final class gu0 extends km0 {
    public final Context f26791c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final wv0 f26792f;

    public gu0(wv0 wv0Var, Context context) {
        this.f26792f = wv0Var;
        this.f26791c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
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
        wv0 wv0Var = this.f26792f;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.wa) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            if (!this.e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.e.get(i10)).intValue());
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
                        if (channelParticipant.promoted_by == o2Var.getUserConfig().getClientUserId()) {
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
                        if (chatParticipant.inviter_id == o2Var.getUserConfig().getClientUserId()) {
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
                TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (UserObject.isUserSelf(user) && ChatObject.canManageMyTag(o2Var.getMessagesController().getChat(Long.valueOf(-wv0Var.f32385j1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                waVar.a(str, z10, z11, z14, new a70(this, user, str, z10, z11, z12, 1));
                if (i10 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                waVar.d(user, null, null, z18);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        wv0 wv0Var = this.f26792f;
        if (i10 == 20) {
            ju0 N = wv0.N(7, wv0Var.f32385j1, this.f26791c, wv0Var.F1);
            N.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(N);
        }
        org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(9, 0, this.f26791c, wv0Var.F1, true, false);
        waVar.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(waVar);
    }
}
