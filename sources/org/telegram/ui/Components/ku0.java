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
public final class ku0 extends mm0 {
    public final Context f30032c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final bw0 f30033f;

    public ku0(bw0 bw0Var, Context context) {
        this.f30033f = bw0Var;
        this.f30032c = context;
        E(false);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(boolean z10) {
        bw0 bw0Var = this.f30033f;
        long j10 = bw0Var.l1;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        if (r2Var != null) {
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(r2Var.getCurrentAccount()).getChat(Long.valueOf(-j10));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(r2Var.getCurrentAccount()).getUser(Long.valueOf(j10)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(r2Var.getCurrentAccount()).getChannelRecommendations(j10);
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
            if (!arrayList.isEmpty() && !UserConfig.getInstance(r2Var.getCurrentAccount()).isPremium()) {
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
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Cells.m6 m6Var;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.m6) {
                m6Var = (org.telegram.ui.Cells.m6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof yu0) {
                m6Var = ((yu0) view).f35168b;
            } else {
                return;
            }
        } else {
            m6Var = null;
        }
        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
        if (m6Var2 != null) {
            ArrayList arrayList = this.d;
            m6Var2.s(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            m6Var2.M = z10;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View m6Var;
        int currentAccount;
        boolean z10;
        bw0 bw0Var = this.f30033f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
            if (r2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = r2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (bw0Var.l1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            m6Var = new yu0(i11, this.f30032c, z11, bw0Var.H1, new np0(this, 7));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(this.f30032c, bw0Var.H1);
        }
        m6Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(m6Var);
    }
}
