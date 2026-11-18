package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class p extends yo0 {
    public final m0 V2;

    public p(m0 m0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = m0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        FrameLayout frameLayout = this.V2.E2;
        if (z10) {
            lc lcVar = new lc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.j10.i(this.f30187a).f24789n) {
                    gc G = lcVar.G(2131624191, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754967, new Object[0])));
                    G.f35469r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f30187a).O0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = O0.title;
                    }
                    gc G2 = lcVar.G(2131624029, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754971, str)));
                    G2.f35469r = false;
                    G2.j();
                } else {
                    gc G3 = lcVar.G(2131624029, 5000, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754971, org.telegram.messenger.mp.u1(this.f30187a).c2(Long.valueOf(j3)).first_name)));
                    G3.f35469r = false;
                    G3.j();
                }
            } else {
                gc Q = lcVar.Q(2131624029, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f35469r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
