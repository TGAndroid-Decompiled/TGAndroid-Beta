package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dn extends org.telegram.ui.Components.mq0 {
    public final MessageObject Y0;
    public final jn Z0;

    public dn(jn jnVar, Activity activity, xn xnVar, ArrayList arrayList, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, boolean z11, MessageObject messageObject) {
        super(activity, xnVar, arrayList, null, null, z4, null, null, false, false, z10, null, g6Var);
        this.Z0 = jnVar;
        this.Y0 = messageObject;
        this.X = z11;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        jn jnVar = this.Z0;
        xn xnVar = jnVar.f38188a;
        int i11 = xn.Ec;
        xnVar.Q7();
        if (jnVar.f38188a.f43378v3 != null && z4) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f20847id != jnVar.f38188a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.qc.a0(jnVar.f38188a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).f20847id)) {
                    jnVar.f38188a.f43378v3.k(((TLRPC.Dialog) hVar.n(0)).f20847id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            jnVar.f38188a.f43378v3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        qh.u9 u9Var;
        xn xnVar = this.Z0.f38188a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.e7) {
            u9Var = qh.x9.b((org.telegram.ui.Cells.e7) view);
        } else {
            u9Var = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.Y0;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) xnVar.f43368u6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final qh.ca E = qh.ca.E(xnVar.getParentActivity(), this.currentAccount);
        E.O = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                qh.ca caVar = E;
                qh.u9 u9Var2 = null;
                if (booleanValue) {
                    dn dnVar = dn.this;
                    AndroidUtilities.runOnUIThread(new fc(24, dnVar, l11));
                    dnVar.dismiss();
                    caVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        u9Var2 = qh.x9.b((org.telegram.ui.Cells.e7) view2);
                    }
                    caVar.Y(u9Var2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(u9Var, qh.s6.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        xn xnVar = this.Z0.f38188a;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (xnVar.V.getVisibility() == 0) {
            xnVar.fragmentView.requestLayout();
        }
    }
}
