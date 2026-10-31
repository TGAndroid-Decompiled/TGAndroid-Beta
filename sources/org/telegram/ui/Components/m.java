package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class m extends op0 {
    public final g0 R2;

    public m(g0 g0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = g0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        FrameLayout frameLayout = this.R2.f26202y2;
        if (z10) {
            cc ccVar = new cc(frameLayout, this.I0);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == org.telegram.messenger.d20.i(this.f21583a).f15165n) {
                    wb G = ccVar.G(2131624188, 5000, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754967, new Object[0])));
                    G.f32143r = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = L0.title;
                    }
                    wb G2 = ccVar.G(2131624027, 5000, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754971, str)));
                    G2.f32143r = false;
                    G2.j();
                } else {
                    wb G3 = ccVar.G(2131624027, 5000, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754971, org.telegram.messenger.vp.r1(this.f21583a).Z1(Long.valueOf(j10)).first_name)));
                    G3.f32143r = false;
                    G3.j();
                }
            } else {
                wb Q = ccVar.Q(2131624027, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32143r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
