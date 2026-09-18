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
public final class it0 extends ll0 {
    public final Context f25030c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final zu0 f25031f;

    public it0(zu0 zu0Var, Context context) {
        this.f25031f = zu0Var;
        this.f25030c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        zu0 zu0Var = this.f25031f;
        long j3 = zu0Var.f30634j1;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        if (o2Var != null) {
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j3));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j3)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(o2Var.getCurrentAccount()).getChannelRecommendations(j3);
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
            if (!arrayList.isEmpty() && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
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
        int i11 = c1Var.f42705f;
        View view = c1Var.f42702a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                h6Var = (org.telegram.ui.Cells.h6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof wt0) {
                h6Var = ((wt0) view).f29742a;
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
        zu0 zu0Var = this.f25031f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
            if (o2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = o2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (zu0Var.f30634j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h6Var = new wt0(i11, this.f25030c, z10, zu0Var.F1, new kq0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.f25030c, zu0Var.F1);
        }
        h6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(h6Var);
    }
}
