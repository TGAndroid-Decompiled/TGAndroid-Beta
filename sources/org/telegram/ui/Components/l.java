package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class l extends po0 {
    public final d0 V2;

    public l(d0 d0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = d0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        FrameLayout frameLayout = this.V2.C2;
        if (z10) {
            cc ccVar = new cc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.m10.i(this.f29679a).f24959n) {
                    xb G = ccVar.G(2131624191, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754967, new Object[0])));
                    G.f41643r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    xb G2 = ccVar.G(2131624029, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, str)));
                    G2.f41643r = false;
                    G2.j();
                } else {
                    xb G3 = ccVar.G(2131624029, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(j3)).first_name)));
                    G3.f41643r = false;
                    G3.j();
                }
            } else {
                xb Q = ccVar.Q(2131624029, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f41643r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
