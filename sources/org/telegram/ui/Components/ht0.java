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
public final class ht0 extends sl0 {
    public final Context f27585c;
    public final ArrayList d = new ArrayList();
    public int f27586e;
    public final zu0 f27587f;

    public ht0(zu0 zu0Var, Context context) {
        this.f27587f = zu0Var;
        this.f27585c = context;
        E(false);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E(boolean z4) {
        zu0 zu0Var = this.f27587f;
        long j10 = zu0Var.f33979g1;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        if (p2Var != null) {
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(p2Var.getCurrentAccount()).getChannelRecommendations(j10);
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
            this.f27586e = i10;
            if (z4) {
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
        if (this.f27586e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof vt0) {
                h6Var = ((vt0) view).f32535a;
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
            boolean z4 = true;
            if (i10 == arrayList.size() - 1) {
                z4 = false;
            }
            h6Var2.J = z4;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View h6Var;
        int currentAccount;
        boolean z4;
        zu0 zu0Var = this.f27587f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
            if (p2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = p2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (zu0Var.f33979g1 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            h6Var = new vt0(i11, this.f27585c, z4, zu0Var.C1, new oq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f27585c, zu0Var.C1);
        }
        h6Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(h6Var);
    }
}
