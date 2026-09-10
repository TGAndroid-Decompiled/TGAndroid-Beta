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
public final class qt0 extends ul0 {
    public final Context f26485c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final iv0 f26486f;

    public qt0(iv0 iv0Var, Context context) {
        this.f26486f = iv0Var;
        this.f26485c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        iv0 iv0Var = this.f26486f;
        long j3 = iv0Var.f24106j1;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        if (p2Var != null) {
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(p2Var.getCurrentAccount()).getChannelRecommendations(j3);
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
            if (!arrayList.isEmpty() && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
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
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.j6) {
                j6Var = (org.telegram.ui.Cells.j6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof eu0) {
                j6Var = ((eu0) view).f22757a;
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
        iv0 iv0Var = this.f26486f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
            if (p2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = p2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (iv0Var.f24106j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var = new eu0(i11, this.f26485c, z10, iv0Var.F1, new uq0(this, 3));
        } else {
            j6Var = new org.telegram.ui.Cells.j6(this.f26485c, iv0Var.F1);
        }
        j6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(j6Var);
    }
}
