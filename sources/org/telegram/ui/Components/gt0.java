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
public final class gt0 extends kl0 {
    public final Context f26510c;
    public final ArrayList d = new ArrayList();
    public int f26511e;
    public final xu0 f26512f;

    public gt0(xu0 xu0Var, Context context) {
        this.f26512f = xu0Var;
        this.f26510c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        xu0 xu0Var = this.f26512f;
        long j3 = xu0Var.f32701j1;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
        if (n2Var != null) {
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(n2Var.getCurrentAccount()).getChannelRecommendations(j3);
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
            if (!arrayList.isEmpty() && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
                i10 = channelRecommendations.more;
            }
            this.f26511e = i10;
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
        if (this.f26511e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof ut0) {
                h6Var = ((ut0) view).f30970a;
            } else {
                return;
            }
        } else {
            h6Var = null;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.t(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            h6Var2.M = z10;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h6Var;
        int currentAccount;
        boolean z10;
        xu0 xu0Var = this.f26512f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
            if (n2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = n2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (xu0Var.f32701j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h6Var = new ut0(i11, this.f26510c, z10, xu0Var.F1, new jq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f26510c, xu0Var.F1);
        }
        h6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(h6Var);
    }
}
