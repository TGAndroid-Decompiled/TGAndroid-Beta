package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fn extends org.telegram.ui.Components.uq0 {
    public final MessageObject f33696b1;
    public final ln f33697c1;

    public fn(ln lnVar, Activity activity, zn znVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, znVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.f33697c1 = lnVar;
        this.f33696b1 = messageObject;
        this.f28804a0 = z12;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        ln lnVar = this.f33697c1;
        zn znVar = lnVar.f35482a;
        int i11 = zn.Gc;
        znVar.Q7();
        if (lnVar.f35482a.y3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f18332id != lnVar.f35482a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.xc.a0(lnVar.f35482a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f18332id)) {
                    lnVar.f35482a.y3.k(((TLRPC.Dialog) iVar.n(0)).f18332id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            lnVar.f35482a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        ci.hc hcVar;
        zn znVar = this.f33697c1.f35482a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.h7) {
            hcVar = ci.jc.b((org.telegram.ui.Cells.h7) view);
        } else {
            hcVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f33696b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) znVar.f40536x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.oc E = ci.oc.E(znVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.oc ocVar = E;
                ci.hc hcVar2 = null;
                if (booleanValue) {
                    fn fnVar = fn.this;
                    AndroidUtilities.runOnUIThread(new gh(13, fnVar, l10));
                    fnVar.dismiss();
                    ocVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        hcVar2 = ci.jc.b((org.telegram.ui.Cells.h7) view2);
                    }
                    ocVar.Y(hcVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(hcVar, ci.o8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        zn znVar = this.f33697c1.f35482a;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (znVar.Y.getVisibility() == 0) {
            znVar.fragmentView.requestLayout();
        }
    }
}
