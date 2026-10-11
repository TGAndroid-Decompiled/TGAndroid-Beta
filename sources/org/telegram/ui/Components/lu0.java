package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lu0 extends qm0 {
    public final Context f28620c;
    public final ArrayList d = new ArrayList();
    public int f28621e;
    public final cw0 f28622f;

    public lu0(cw0 cw0Var, Context context) {
        this.f28622f = cw0Var;
        this.f28620c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final void E(boolean z10) {
        cw0 cw0Var = this.f28622f;
        long j3 = cw0Var.f25511j1;
        org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
        if (m2Var != null) {
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(m2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(m2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(m2Var.getCurrentAccount()).getChannelRecommendations(j3);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i10 = 0;
            if (channelRecommendations != null) {
                for (int i11 = 0; i11 < channelRecommendations.chats.size(); i11++) {
                    TLObject tLObject = channelRecommendations.chats.get(i11);
                    if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
                i10 = channelRecommendations.more;
            }
            this.f28621e = i10;
            if (z10) {
                l();
            }
        }
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i10) {
        if (this.f28621e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        int i11 = d1Var.f47786f;
        View view = d1Var.f47782a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.i6) {
                i6Var = (org.telegram.ui.Cells.i6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof zu0) {
                i6Var = ((zu0) view).f33701a;
            } else {
                return;
            }
        } else {
            i6Var = null;
        }
        org.telegram.ui.Cells.i6 i6Var2 = i6Var;
        if (i6Var2 != null) {
            ArrayList arrayList = this.d;
            i6Var2.u(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            i6Var2.M = z10;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View i6Var;
        int currentAccount;
        boolean z10;
        cw0 cw0Var = this.f28622f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
            if (m2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = m2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (cw0Var.f25511j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            i6Var = new zu0(i11, this.f28620c, z11, cw0Var.F1, new pr0(this, 4));
        } else {
            i6Var = new org.telegram.ui.Cells.i6(this.f28620c, cw0Var.F1);
        }
        i6Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(i6Var);
    }
}
