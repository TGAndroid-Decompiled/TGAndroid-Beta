package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cn extends org.telegram.ui.Components.vq0 {
    public final MessageObject f32748b1;
    public final in f32749c1;

    public cn(in inVar, Activity activity, wn wnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, wnVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.f32749c1 = inVar;
        this.f32748b1 = messageObject;
        this.f29715a0 = z12;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        in inVar = this.f32749c1;
        wn wnVar = inVar.f34556a;
        int i11 = wn.Gc;
        wnVar.Q7();
        if (inVar.f34556a.y3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f18339id != inVar.f34556a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.xc.a0(inVar.f34556a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f18339id)) {
                    inVar.f34556a.y3.k(((TLRPC.Dialog) iVar.n(0)).f18339id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            inVar.f34556a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        ci.ec ecVar;
        wn wnVar = this.f32749c1.f34556a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.g7) {
            ecVar = ci.gc.b((org.telegram.ui.Cells.g7) view);
        } else {
            ecVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f32748b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) wnVar.f39700x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.lc E = ci.lc.E(wnVar.getParentActivity(), this.currentAccount);
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
                    cn cnVar = cn.this;
                    AndroidUtilities.runOnUIThread(new fh(12, cnVar, l10));
                    cnVar.dismiss();
                    lcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        ecVar2 = ci.gc.b((org.telegram.ui.Cells.g7) view2);
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
        wn wnVar = this.f32749c1.f34556a;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (wnVar.Y.getVisibility() == 0) {
            wnVar.fragmentView.requestLayout();
        }
    }
}
