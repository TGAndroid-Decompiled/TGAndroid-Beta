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
public final class ns0 extends vk0 {
    public final Context f31177c;
    public final ArrayList d = new ArrayList();
    public int f31178e;
    public final eu0 f31179f;

    public ns0(eu0 eu0Var, Context context) {
        this.f31179f = eu0Var;
        this.f31177c = context;
        E(false);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(boolean z10) {
        eu0 eu0Var = this.f31179f;
        long j10 = eu0Var.f28136f1;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        if (o2Var != null) {
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(o2Var.getCurrentAccount()).getChannelRecommendations(j10);
            ArrayList arrayList = this.d;
            arrayList.clear();
            int i9 = 0;
            if (channelRecommendations != null) {
                for (int i10 = 0; i10 < channelRecommendations.chats.size(); i10++) {
                    TLObject tLObject = channelRecommendations.chats.get(i10);
                    if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
                i9 = channelRecommendations.more;
            }
            this.f31178e = i9;
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
    public final int j(int i9) {
        if (this.f31178e > 0 && i9 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.h6 h6Var;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i10 == 18) {
            if (view instanceof bt0) {
                h6Var = ((bt0) view).f27277a;
            } else {
                return;
            }
        } else {
            h6Var = null;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.t(arrayList.get(i9), null, null, null, false, false);
            boolean z10 = true;
            if (i9 == arrayList.size() - 1) {
                z10 = false;
            }
            h6Var2.I = z10;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View h6Var;
        int currentAccount;
        boolean z10;
        eu0 eu0Var = this.f31179f;
        if (i9 == 18) {
            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
            if (o2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = o2Var.getCurrentAccount();
            }
            int i10 = currentAccount;
            if (eu0Var.f28136f1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h6Var = new bt0(i10, this.f31177c, z10, eu0Var.B1, new tp0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f31177c, eu0Var.B1);
        }
        h6Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(h6Var);
    }
}
