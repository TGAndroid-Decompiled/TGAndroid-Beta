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
public final class st0 extends ul0 {
    public final Context f28212c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final jv0 f28213f;

    public st0(jv0 jv0Var, Context context) {
        this.f28213f = jv0Var;
        this.f28212c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        jv0 jv0Var = this.f28213f;
        long j3 = jv0Var.f25503j1;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
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
            this.e = i10;
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
        if (this.e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.j6 j6Var;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.j6) {
                j6Var = (org.telegram.ui.Cells.j6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof gu0) {
                j6Var = ((gu0) view).f24456a;
            } else {
                return;
            }
        } else {
            j6Var = null;
        }
        org.telegram.ui.Cells.j6 j6Var2 = j6Var;
        if (j6Var2 != null) {
            ArrayList arrayList = this.d;
            j6Var2.t(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            j6Var2.M = z10;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View j6Var;
        int currentAccount;
        boolean z10;
        jv0 jv0Var = this.f28213f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
            if (n2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = n2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (jv0Var.f25503j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var = new gu0(i11, this.f28212c, z10, jv0Var.F1, new wq0(this, 3));
        } else {
            j6Var = new org.telegram.ui.Cells.j6(this.f28212c, jv0Var.F1);
        }
        j6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(j6Var);
    }
}
