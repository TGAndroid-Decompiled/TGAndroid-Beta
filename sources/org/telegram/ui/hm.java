package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hm extends org.telegram.ui.Components.no0 {
    public final org.telegram.messenger.ij R2;
    public final nm S2;

    public hm(nm nmVar, Activity activity, cn cnVar, ArrayList arrayList, boolean z9, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, boolean z11, org.telegram.messenger.ij ijVar) {
        super(activity, cnVar, arrayList, null, null, z9, null, null, false, false, z10, null, g6Var);
        this.S2 = nmVar;
        this.R2 = ijVar;
        this.S1 = z11;
    }

    @Override
    public final void K() {
        int i7;
        cn cnVar = this.S2.f48207a;
        Activity parentActivity = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i7);
        super.K();
        if (cnVar.Z.getVisibility() == 0) {
            cnVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        nm nmVar = this.S2;
        cn cnVar = nmVar.f48207a;
        int i10 = cn.f44367kd;
        cnVar.g8();
        if (nmVar.f48207a.M3 != null && z9) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f26960id != nmVar.f48207a.getUserConfig().e() || !org.telegram.ui.Components.hc.a0(nmVar.f48207a).g0(i7, ((TLRPC.Dialog) hVar.n(0)).f26960id)) {
                    nmVar.f48207a.M3.k(((TLRPC.Dialog) hVar.n(0)).f26960id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            nmVar.f48207a.M3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        fi.oa oaVar;
        cn cnVar = this.S2.f48207a;
        org.telegram.messenger.dj djVar = null;
        if (view instanceof org.telegram.ui.Cells.d7) {
            oaVar = fi.qa.b((org.telegram.ui.Cells.d7) view);
        } else {
            oaVar = null;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ij ijVar = this.R2;
        if (ijVar.c1() != 0) {
            djVar = (org.telegram.messenger.dj) cnVar.N6.f(ijVar.c1());
        }
        if (djVar != null) {
            arrayList.addAll(djVar.d);
        } else {
            arrayList.add(ijVar);
        }
        final fi.va D = fi.va.D(cnVar.getParentActivity(), this.f28621a);
        D.R = new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.va vaVar = D;
                fi.oa oaVar2 = null;
                if (booleanValue) {
                    hm hmVar = hm.this;
                    org.telegram.messenger.g0.h3(new rf(18, hmVar, l11));
                    hmVar.dismiss();
                    vaVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        oaVar2 = fi.qa.b((org.telegram.ui.Cells.d7) view2);
                    }
                    vaVar.X(oaVar2);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(oaVar, fi.e7.y(arrayList));
    }
}
