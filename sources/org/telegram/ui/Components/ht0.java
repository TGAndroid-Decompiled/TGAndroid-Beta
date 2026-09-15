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
public final class ht0 extends kl0 {
    public final Context f24800c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final yu0 f24801f;

    public ht0(yu0 yu0Var, Context context) {
        this.f24801f = yu0Var;
        this.f24800c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        yu0 yu0Var = this.f24801f;
        long j3 = yu0Var.f30367j1;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
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
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = c1Var.f42678f;
        View view = c1Var.f42675a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof vt0) {
                h6Var = ((vt0) view).f29429a;
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
        yu0 yu0Var = this.f24801f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
            if (n2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = n2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (yu0Var.f30367j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h6Var = new vt0(i11, this.f24800c, z10, yu0Var.F1, new jq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f24800c, yu0Var.F1);
        }
        h6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(h6Var);
    }
}
