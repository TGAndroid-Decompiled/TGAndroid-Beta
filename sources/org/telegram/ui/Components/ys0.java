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
public final class ys0 extends il0 {
    public final Context f35127c;
    public final ArrayList d = new ArrayList();
    public int f35128e;
    public final qu0 f35129f;

    public ys0(qu0 qu0Var, Context context) {
        this.f35129f = qu0Var;
        this.f35127c = context;
        E(false);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E(boolean z10) {
        qu0 qu0Var = this.f35129f;
        long j10 = qu0Var.f32069f1;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
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
            this.f35128e = i10;
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
        if (this.f35128e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Cells.f6 f6Var;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.f6) {
                f6Var = (org.telegram.ui.Cells.f6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof mt0) {
                f6Var = ((mt0) view).f30763a;
            } else {
                return;
            }
        } else {
            f6Var = null;
        }
        org.telegram.ui.Cells.f6 f6Var2 = f6Var;
        if (f6Var2 != null) {
            ArrayList arrayList = this.d;
            f6Var2.t(arrayList.get(i10), null, null, null, false, false);
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            f6Var2.I = z10;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View f6Var;
        int currentAccount;
        boolean z10;
        qu0 qu0Var = this.f35129f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
            if (o2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = o2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (qu0Var.f32069f1 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f6Var = new mt0(i11, this.f35127c, z10, qu0Var.B1, new fq0(this, 3));
        } else {
            f6Var = new org.telegram.ui.Cells.f6(this.f35127c, qu0Var.B1);
        }
        f6Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(f6Var);
    }
}
