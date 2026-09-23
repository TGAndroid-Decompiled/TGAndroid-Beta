package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dn extends org.telegram.ui.Components.hq0 {
    public final MessageObject f32686b1;
    public final jn f32687c1;

    public dn(jn jnVar, Activity activity, xn xnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, xnVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.f32687c1 = jnVar;
        this.f32686b1 = messageObject;
        this.f24773a0 = z12;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        jn jnVar = this.f32687c1;
        xn xnVar = jnVar.f34487a;
        int i11 = xn.Gc;
        xnVar.Q7();
        if (jnVar.f34487a.y3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f18087id != jnVar.f34487a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.xc.a0(jnVar.f34487a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f18087id)) {
                    jnVar.f34487a.y3.k(((TLRPC.Dialog) iVar.n(0)).f18087id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            jnVar.f34487a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        ci.ec ecVar;
        xn xnVar = this.f32687c1.f34487a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.f7) {
            ecVar = ci.gc.b((org.telegram.ui.Cells.f7) view);
        } else {
            ecVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f32686b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) xnVar.f39602x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.lc E = ci.lc.E(xnVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.lc lcVar = E;
                ci.ec ecVar2 = null;
                if (booleanValue) {
                    dn dnVar = dn.this;
                    AndroidUtilities.runOnUIThread(new rh(7, dnVar, l10));
                    dnVar.dismiss();
                    lcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        ecVar2 = ci.gc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    lcVar.Y(ecVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(ecVar, ci.l8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        xn xnVar = this.f32687c1.f34487a;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (xnVar.Y.getVisibility() == 0) {
            xnVar.fragmentView.requestLayout();
        }
    }
}
