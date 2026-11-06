package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class m extends mo0 {
    public final g0 R2;

    public m(g0 g0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = g0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String str;
        FrameLayout frameLayout = this.R2.f33726y2;
        if (z9) {
            hc hcVar = new hc(frameLayout, this.I0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.p10.i(this.f28613a).f24486n) {
                    cc G = hcVar.G(2131624190, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754967, new Object[0])));
                    G.f32522r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28613a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    cc G2 = hcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, str)));
                    G2.f32522r = false;
                    G2.j();
                } else {
                    cc G3 = hcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(j3)).first_name)));
                    G3.f32522r = false;
                    G3.j();
                }
            } else {
                cc Q = hcVar.Q(2131624028, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32522r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
