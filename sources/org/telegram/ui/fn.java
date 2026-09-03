package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fn extends org.telegram.ui.Components.lq0 {
    public final MessageObject Y0;
    public final ln Z0;

    public fn(ln lnVar, Activity activity, zn znVar, ArrayList arrayList, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, MessageObject messageObject) {
        super(activity, znVar, arrayList, null, null, z4, null, null, false, false, z10, null, f6Var);
        this.Z0 = lnVar;
        this.Y0 = messageObject;
        this.X = z11;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        ln lnVar = this.Z0;
        zn znVar = lnVar.f35808a;
        int i11 = zn.Ec;
        znVar.Q7();
        if (lnVar.f35808a.f40775v3 != null && z4) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f19163id != lnVar.f35808a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.qc.a0(lnVar.f35808a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).f19163id)) {
                    lnVar.f35808a.f40775v3.k(((TLRPC.Dialog) hVar.n(0)).f19163id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            lnVar.f35808a.f40775v3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        ph.w9 w9Var;
        zn znVar = this.Z0.f35808a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.d7) {
            w9Var = ph.y9.b((org.telegram.ui.Cells.d7) view);
        } else {
            w9Var = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.Y0;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) znVar.f40765u6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ph.da E = ph.da.E(znVar.getParentActivity(), this.currentAccount);
        E.O = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ph.da daVar = E;
                ph.w9 w9Var2 = null;
                if (booleanValue) {
                    fn fnVar = fn.this;
                    AndroidUtilities.runOnUIThread(new hc(24, fnVar, l11));
                    fnVar.dismiss();
                    daVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        w9Var2 = ph.y9.b((org.telegram.ui.Cells.d7) view2);
                    }
                    daVar.Y(w9Var2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(w9Var, ph.t6.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        zn znVar = this.Z0.f35808a;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (znVar.V.getVisibility() == 0) {
            znVar.fragmentView.requestLayout();
        }
    }
}
