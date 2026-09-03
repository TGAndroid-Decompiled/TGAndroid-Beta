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
public final class gt0 extends ql0 {
    public final Context f25235c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final yu0 f25236f;

    public gt0(yu0 yu0Var, Context context) {
        this.f25236f = yu0Var;
        this.f25235c = context;
        E(false);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(boolean z4) {
        yu0 yu0Var = this.f25236f;
        long j10 = yu0Var.f31130g1;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
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
            this.e = i10;
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
        if (this.e > 0 && i10 == this.d.size() - 1) {
            return 18;
        }
        return 17;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.g6 g6Var;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 == 17) {
            if (view instanceof org.telegram.ui.Cells.g6) {
                g6Var = (org.telegram.ui.Cells.g6) view;
            } else {
                return;
            }
        } else if (i11 == 18) {
            if (view instanceof ut0) {
                g6Var = ((ut0) view).f29296a;
            } else {
                return;
            }
        } else {
            g6Var = null;
        }
        org.telegram.ui.Cells.g6 g6Var2 = g6Var;
        if (g6Var2 != null) {
            ArrayList arrayList = this.d;
            g6Var2.t(arrayList.get(i10), null, null, null, false, false);
            boolean z4 = true;
            if (i10 == arrayList.size() - 1) {
                z4 = false;
            }
            g6Var2.J = z4;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View g6Var;
        int currentAccount;
        boolean z4;
        yu0 yu0Var = this.f25236f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
            if (p2Var == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = p2Var.getCurrentAccount();
            }
            int i11 = currentAccount;
            if (yu0Var.f31130g1 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            g6Var = new ut0(i11, this.f25235c, z4, yu0Var.C1, new nq0(this, 3));
        } else {
            g6Var = new org.telegram.ui.Cells.g6(this.f25235c, yu0Var.C1);
        }
        g6Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(g6Var);
    }
}
