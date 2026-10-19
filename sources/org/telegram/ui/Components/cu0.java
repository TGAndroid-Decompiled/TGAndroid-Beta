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
public final class cu0 extends hm0 {
    public final Context f25343c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final tv0 f25344f;

    public cu0(tv0 tv0Var, Context context) {
        this.f25344f = tv0Var;
        this.f25343c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(boolean z10) {
        tv0 tv0Var = this.f25344f;
        long j10 = tv0Var.f30707j1;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
        if (n2Var != null) {
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(n2Var.getCurrentAccount()).getChannelRecommendations(j10);
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
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = b1Var.f45915f;
        View view = b1Var.f45912a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof qu0) {
                h6Var = ((qu0) view).f29707a;
            } else {
                return;
            }
        } else {
            h6Var = null;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.u(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            h6Var2.M = z10;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h6Var;
        int currentAccount;
        boolean z10;
        tv0 tv0Var = this.f25344f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
            if (n2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = n2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (tv0Var.f30707j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            h6Var = new qu0(i11, this.f25343c, z11, tv0Var.F1, new gr0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f25343c, tv0Var.F1);
        }
        h6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(h6Var);
    }
}
