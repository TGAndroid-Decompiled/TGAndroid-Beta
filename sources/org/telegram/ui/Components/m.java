package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class m extends oo0 {
    public final e0 S2;

    public m(e0 e0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = e0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        FrameLayout frameLayout = this.S2.f33258z2;
        if (z10) {
            fc fcVar = new fc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == org.telegram.messenger.h10.i(this.f28583a).f22848n) {
                    ac G = fcVar.G(2131624190, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754967, new Object[0])));
                    G.f31800r = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    ac G2 = fcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754971, str)));
                    G2.f31800r = false;
                    G2.j();
                } else {
                    ac G3 = fcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754971, org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(j10)).first_name)));
                    G3.f31800r = false;
                    G3.j();
                }
            } else {
                ac Q = fcVar.Q(2131624028, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f31800r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
