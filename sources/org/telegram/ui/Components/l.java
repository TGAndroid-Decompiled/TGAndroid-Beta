package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class l extends mo0 {
    public final f0 U2;

    public l(f0 f0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = f0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String str;
        FrameLayout frameLayout = this.U2.B2;
        if (z9) {
            gc gcVar = new gc(frameLayout, this.I0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.p10.i(this.f28669a).f24493n) {
                    bc G = gcVar.G(2131624190, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754967, new Object[0])));
                    G.f32211r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    bc G2 = gcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754971, str)));
                    G2.f32211r = false;
                    G2.j();
                } else {
                    bc G3 = gcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754971, org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(j3)).first_name)));
                    G3.f32211r = false;
                    G3.j();
                }
            } else {
                bc Q = gcVar.Q(2131624028, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32211r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
