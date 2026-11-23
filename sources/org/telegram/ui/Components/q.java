package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class q extends ap0 {
    public final n0 V2;

    public q(n0 n0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = n0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        FrameLayout frameLayout = this.V2.E2;
        if (z10) {
            lc lcVar = new lc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.k10.i(this.f30173a).f24987n) {
                    gc G = lcVar.G(2131624191, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754967, new Object[0])));
                    G.f35535r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30173a).O0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = O0.title;
                    }
                    gc G2 = lcVar.G(2131624029, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754971, str)));
                    G2.f35535r = false;
                    G2.j();
                } else {
                    gc G3 = lcVar.G(2131624029, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754971, org.telegram.messenger.np.u1(this.f30173a).c2(Long.valueOf(j3)).first_name)));
                    G3.f35535r = false;
                    G3.j();
                }
            } else {
                gc Q = lcVar.Q(2131624029, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f35535r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
