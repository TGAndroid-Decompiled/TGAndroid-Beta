package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bn extends org.telegram.ui.Components.nr0 {
    public final MessageObject f38070a1;
    public final hn f38071b1;

    public bn(hn hnVar, Activity activity, wn wnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12, MessageObject messageObject) {
        super(activity, wnVar, arrayList, null, null, z10, null, null, false, false, z11, null, u6Var);
        this.f38071b1 = hnVar;
        this.f38070a1 = messageObject;
        this.f31032b0 = z12;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        hn hnVar = this.f38071b1;
        wn wnVar = hnVar.f39938a;
        int i11 = wn.f45035fd;
        wnVar.Z7();
        if (hnVar.f39938a.K3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f22032id != hnVar.f39938a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.wc.b0(hnVar.f39938a).h0(i10, ((TLRPC.Dialog) hVar.n(0)).f22032id)) {
                    hnVar.f39938a.K3.k(((TLRPC.Dialog) hVar.n(0)).f22032id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            hnVar.f39938a.K3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void U0(final View view) {
        fi.lb lbVar;
        wn wnVar = this.f38071b1.f39938a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.k7) {
            lbVar = fi.nb.b((org.telegram.ui.Cells.k7) view);
        } else {
            lbVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f38070a1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final fi.sb D = fi.sb.D(wnVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.sb sbVar = D;
                fi.lb lbVar2 = null;
                if (booleanValue) {
                    bn bnVar = bn.this;
                    AndroidUtilities.runOnUIThread(new ed(21, bnVar, l10));
                    bnVar.dismiss();
                    sbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.k7) && view2.isAttachedToWindow()) {
                        lbVar2 = fi.nb.b((org.telegram.ui.Cells.k7) view2);
                    }
                    sbVar.X(lbVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(lbVar, fi.w7.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        wn wnVar = this.f38071b1.f39938a;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (wnVar.Y.getVisibility() == 0) {
            wnVar.fragmentView.requestLayout();
        }
    }
}
