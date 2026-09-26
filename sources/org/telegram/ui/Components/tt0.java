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
public final class tt0 extends wl0 {
    public final Context f28611c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final kv0 f28612f;

    public tt0(kv0 kv0Var, Context context) {
        this.f28612f = kv0Var;
        this.f28611c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        kv0 kv0Var = this.f28612f;
        long j3 = kv0Var.f25841j1;
        org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
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
        org.telegram.ui.Cells.i6 i6Var;
        int i11 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.i6) {
                i6Var = (org.telegram.ui.Cells.i6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof hu0) {
                i6Var = ((hu0) view).f24870a;
            } else {
                return;
            }
        } else {
            i6Var = null;
        }
        org.telegram.ui.Cells.i6 i6Var2 = i6Var;
        if (i6Var2 != null) {
            ArrayList arrayList = this.d;
            i6Var2.t(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            i6Var2.M = z10;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View i6Var;
        int currentAccount;
        boolean z10;
        kv0 kv0Var = this.f28612f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
            if (m2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = m2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (kv0Var.f25841j1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var = new hu0(i11, this.f28611c, z10, kv0Var.F1, new xq0(this, 4));
        } else {
            i6Var = new org.telegram.ui.Cells.i6(this.f28611c, kv0Var.F1);
        }
        i6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(i6Var);
    }
}
