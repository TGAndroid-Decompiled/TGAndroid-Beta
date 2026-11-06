package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fm extends org.telegram.ui.Components.mo0 {
    public final org.telegram.messenger.ij R2;
    public final lm S2;

    public fm(lm lmVar, Activity activity, an anVar, ArrayList arrayList, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, org.telegram.messenger.ij ijVar) {
        super(activity, anVar, arrayList, null, null, z9, null, null, false, false, z10, null, f6Var);
        this.S2 = lmVar;
        this.R2 = ijVar;
        this.S1 = z11;
    }

    @Override
    public final void K() {
        int i7;
        an anVar = this.S2.f47534a;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i7);
        super.K();
        if (anVar.Z.getVisibility() == 0) {
            anVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        lm lmVar = this.S2;
        an anVar = lmVar.f47534a;
        int i10 = an.f43682id;
        anVar.f8();
        if (lmVar.f47534a.M3 != null && z9) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f26956id != lmVar.f47534a.getUserConfig().e() || !org.telegram.ui.Components.hc.a0(lmVar.f47534a).g0(i7, ((TLRPC.Dialog) hVar.n(0)).f26956id)) {
                    lmVar.f47534a.M3.k(((TLRPC.Dialog) hVar.n(0)).f26956id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            lmVar.f47534a.M3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        fi.oa oaVar;
        an anVar = this.S2.f47534a;
        org.telegram.messenger.dj djVar = null;
        if (view instanceof org.telegram.ui.Cells.d7) {
            oaVar = fi.qa.b((org.telegram.ui.Cells.d7) view);
        } else {
            oaVar = null;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ij ijVar = this.R2;
        if (ijVar.d1() != 0) {
            djVar = (org.telegram.messenger.dj) anVar.N6.f(ijVar.d1());
        }
        if (djVar != null) {
            arrayList.addAll(djVar.d);
        } else {
            arrayList.add(ijVar);
        }
        final fi.va D = fi.va.D(anVar.getParentActivity(), this.f28612a);
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
                    fm fmVar = fm.this;
                    org.telegram.messenger.g0.h3(new qf(18, fmVar, l11));
                    fmVar.dismiss();
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
