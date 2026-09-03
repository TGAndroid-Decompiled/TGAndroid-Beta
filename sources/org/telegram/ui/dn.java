package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dn extends org.telegram.ui.Components.lq0 {
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
        xn xnVar = jnVar.f38085a;
        int i11 = xn.Ec;
        xnVar.Q7();
        if (jnVar.f38085a.f43356v3 != null && z4) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f20849id != jnVar.f38085a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.qc.a0(jnVar.f38085a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).f20849id)) {
                    jnVar.f38085a.f43356v3.k(((TLRPC.Dialog) hVar.n(0)).f20849id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            jnVar.f38085a.f43356v3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        qh.t9 t9Var;
        xn xnVar = this.Z0.f38085a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.e7) {
            t9Var = qh.w9.b((org.telegram.ui.Cells.e7) view);
        } else {
            t9Var = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.Y0;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) xnVar.f43346u6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final qh.ba E = qh.ba.E(xnVar.getParentActivity(), this.currentAccount);
        E.O = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                qh.ba baVar = E;
                qh.t9 t9Var2 = null;
                if (booleanValue) {
                    dn dnVar = dn.this;
                    AndroidUtilities.runOnUIThread(new xc(23, dnVar, l11));
                    dnVar.dismiss();
                    baVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        t9Var2 = qh.w9.b((org.telegram.ui.Cells.e7) view2);
                    }
                    baVar.Y(t9Var2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(t9Var, qh.r6.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        xn xnVar = this.Z0.f38085a;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (xnVar.V.getVisibility() == 0) {
            xnVar.fragmentView.requestLayout();
        }
    }
}
