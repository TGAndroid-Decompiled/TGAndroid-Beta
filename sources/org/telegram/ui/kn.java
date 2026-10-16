package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class kn extends org.telegram.ui.Components.ir0 {
    public final MessageObject f37463b1;
    public final qn f37464c1;

    public kn(qn qnVar, Activity activity, fo foVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, MessageObject messageObject) {
        super(activity, foVar, arrayList, null, null, z10, null, null, false, false, z11, null, c6Var);
        this.f37464c1 = qnVar;
        this.f37463b1 = messageObject;
        this.f25740a0 = z12;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        qn qnVar = this.f37464c1;
        fo foVar = qnVar.f39190a;
        int i11 = fo.Hc;
        foVar.T7();
        if (qnVar.f39190a.y3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f18920id != qnVar.f39190a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.zc.a0(qnVar.f39190a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).f18920id)) {
                    qnVar.f39190a.y3.k(((TLRPC.Dialog) hVar.n(0)).f18920id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            qnVar.f39190a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void T0(final View view) {
        di.dc dcVar;
        fo foVar = this.f37464c1.f39190a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.f7) {
            dcVar = di.fc.b((org.telegram.ui.Cells.f7) view);
        } else {
            dcVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f37463b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) foVar.f35867x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final di.kc D = di.kc.D(foVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                di.kc kcVar = D;
                di.dc dcVar2 = null;
                if (booleanValue) {
                    kn knVar = kn.this;
                    AndroidUtilities.runOnUIThread(new jd(21, knVar, l10));
                    knVar.dismiss();
                    kcVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        dcVar2 = di.fc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    kcVar.X(dcVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(dcVar, di.k8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        fo foVar = this.f37464c1.f39190a;
        Activity parentActivity = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (foVar.Y.getVisibility() == 0) {
            foVar.fragmentView.requestLayout();
        }
    }
}
