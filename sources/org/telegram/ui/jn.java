package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class jn extends org.telegram.ui.Components.sq0 {
    public final MessageObject f34139b1;
    public final pn f34140c1;

    public jn(pn pnVar, Activity activity, eo eoVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, eoVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.f34140c1 = pnVar;
        this.f34139b1 = messageObject;
        this.f27166a0 = z12;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        pn pnVar = this.f34140c1;
        eo eoVar = pnVar.f35881a;
        int i11 = eo.Hc;
        eoVar.Q7();
        if (pnVar.f35881a.y3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f17199id != pnVar.f35881a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.wc.a0(pnVar.f35881a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f17199id)) {
                    pnVar.f35881a.y3.k(((TLRPC.Dialog) iVar.n(0)).f17199id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            pnVar.f35881a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        bi.ud udVar;
        eo eoVar = this.f34140c1.f35881a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.h7) {
            udVar = bi.xd.b((org.telegram.ui.Cells.h7) view);
        } else {
            udVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f34139b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) eoVar.f32548x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final bi.ce E = bi.ce.E(eoVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                bi.ce ceVar = E;
                bi.ud udVar2 = null;
                if (booleanValue) {
                    jn jnVar = jn.this;
                    AndroidUtilities.runOnUIThread(new qh(10, jnVar, l10));
                    jnVar.dismiss();
                    ceVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        udVar2 = bi.xd.b((org.telegram.ui.Cells.h7) view2);
                    }
                    ceVar.Y(udVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(udVar, bi.r9.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        eo eoVar = this.f34140c1.f35881a;
        Activity parentActivity = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (eoVar.Y.getVisibility() == 0) {
            eoVar.fragmentView.requestLayout();
        }
    }
}
