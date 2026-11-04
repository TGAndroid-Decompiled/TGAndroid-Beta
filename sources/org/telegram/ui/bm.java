package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bm extends org.telegram.ui.Components.oo0 {
    public final org.telegram.messenger.zi S2;
    public final hm T2;

    public bm(hm hmVar, Activity activity, wm wmVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, org.telegram.messenger.zi ziVar) {
        super(activity, wmVar, arrayList, null, null, z10, null, null, false, false, z11, null, e6Var);
        this.T2 = hmVar;
        this.S2 = ziVar;
        this.T1 = z12;
    }

    @Override
    public final void K() {
        int i3;
        wm wmVar = this.T2.f45934a;
        Activity parentActivity = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i3);
        super.K();
        if (wmVar.f51237a0.getVisibility() == 0) {
            wmVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        hm hmVar = this.T2;
        wm wmVar = hmVar.f45934a;
        int i10 = wm.f51227jd;
        wmVar.f8();
        if (hmVar.f45934a.N3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f27005id != hmVar.f45934a.getUserConfig().e() || !org.telegram.ui.Components.fc.a0(hmVar.f45934a).g0(i3, ((TLRPC.Dialog) hVar.n(0)).f27005id)) {
                    hmVar.f45934a.N3.k(((TLRPC.Dialog) hVar.n(0)).f27005id, 53, Integer.valueOf(i3), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            hmVar.f45934a.N3.k(0L, 53, Integer.valueOf(i3), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        gi.oa oaVar;
        wm wmVar = this.T2.f45934a;
        org.telegram.messenger.ui uiVar = null;
        if (view instanceof org.telegram.ui.Cells.c7) {
            oaVar = gi.qa.b((org.telegram.ui.Cells.c7) view);
        } else {
            oaVar = null;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.zi ziVar = this.S2;
        if (ziVar.d1() != 0) {
            uiVar = (org.telegram.messenger.ui) wmVar.O6.f(ziVar.d1());
        }
        if (uiVar != null) {
            arrayList.addAll(uiVar.d);
        } else {
            arrayList.add(ziVar);
        }
        final gi.va D = gi.va.D(wmVar.getParentActivity(), this.f28583a);
        D.S = new org.telegram.messenger.r10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                gi.va vaVar = D;
                gi.oa oaVar2 = null;
                if (booleanValue) {
                    bm bmVar = bm.this;
                    org.telegram.messenger.g0.h3(new sc(23, bmVar, l11));
                    bmVar.dismiss();
                    vaVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        oaVar2 = gi.qa.b((org.telegram.ui.Cells.c7) view2);
                    }
                    vaVar.X(oaVar2);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(oaVar, gi.f7.y(arrayList));
    }
}
