package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class hn extends org.telegram.ui.Components.hq0 {
    public final MessageObject f34316b1;
    public final nn f34317c1;

    public hn(nn nnVar, Activity activity, bo boVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, MessageObject messageObject) {
        super(activity, boVar, arrayList, null, null, z10, null, null, false, false, z11, null, e6Var);
        this.f34317c1 = nnVar;
        this.f34316b1 = messageObject;
        this.f24748a0 = z12;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        nn nnVar = this.f34317c1;
        bo boVar = nnVar.f36012a;
        int i11 = bo.Hc;
        boVar.Q7();
        if (nnVar.f36012a.y3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f18116id != nnVar.f36012a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.vc.a0(nnVar.f36012a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f18116id)) {
                    nnVar.f36012a.y3.k(((TLRPC.Dialog) iVar.n(0)).f18116id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            nnVar.f36012a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        ci.hc hcVar;
        bo boVar = this.f34317c1.f36012a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.f7) {
            hcVar = ci.jc.b((org.telegram.ui.Cells.f7) view);
        } else {
            hcVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f34316b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) boVar.f32530x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ci.oc E = ci.oc.E(boVar.getParentActivity(), this.currentAccount);
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
                    hn hnVar = hn.this;
                    AndroidUtilities.runOnUIThread(new uh(7, hnVar, l10));
                    hnVar.dismiss();
                    ocVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        hcVar2 = ci.jc.b((org.telegram.ui.Cells.f7) view2);
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
        bo boVar = this.f34317c1.f36012a;
        Activity parentActivity = boVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (boVar.Y.getVisibility() == 0) {
            boVar.fragmentView.requestLayout();
        }
    }
}
