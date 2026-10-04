package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class en extends org.telegram.ui.Components.zq0 {
    public final MessageObject X0;
    public final kn Y0;

    public en(kn knVar, Activity activity, yn ynVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, ynVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.Y0 = knVar;
        this.X0 = messageObject;
        this.f33596a0 = z12;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        kn knVar = this.Y0;
        yn ynVar = knVar.f38003a;
        int i11 = yn.Bc;
        ynVar.Q7();
        if (knVar.f38003a.f43542w3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f20042id != knVar.f38003a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.yc.a0(knVar.f38003a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f20042id)) {
                    knVar.f38003a.f43542w3.k(((TLRPC.Dialog) iVar.n(0)).f20042id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            knVar.f38003a.f43542w3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void P0(final View view) {
        ci.dc dcVar;
        yn ynVar = this.Y0.f38003a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.g7) {
            dcVar = ci.fc.b((org.telegram.ui.Cells.g7) view);
        } else {
            dcVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) ynVar.f43532v6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.kc E = ci.kc.E(ynVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ci.kc kcVar = E;
                ci.dc dcVar2 = null;
                if (booleanValue) {
                    en enVar = en.this;
                    AndroidUtilities.runOnUIThread(new oh(11, enVar, l10));
                    enVar.dismiss();
                    kcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        dcVar2 = ci.fc.b((org.telegram.ui.Cells.g7) view2);
                    }
                    kcVar.Y(dcVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(dcVar, ci.k8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        yn ynVar = this.Y0.f38003a;
        Activity parentActivity = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (ynVar.W.getVisibility() == 0) {
            ynVar.fragmentView.requestLayout();
        }
    }
}
