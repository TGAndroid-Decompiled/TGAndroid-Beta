package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class in extends org.telegram.ui.Components.hq0 {
    public final MessageObject f37412b1;
    public final on f37413c1;

    public in(on onVar, Activity activity, co coVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, MessageObject messageObject) {
        super(activity, coVar, arrayList, null, null, z10, null, null, false, false, z11, null, f6Var);
        this.f37413c1 = onVar;
        this.f37412b1 = messageObject;
        this.f26787a0 = z12;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        on onVar = this.f37413c1;
        co coVar = onVar.f39283a;
        int i11 = co.Hc;
        coVar.Q7();
        if (onVar.f39283a.y3 != null && z10) {
            if (iVar.m() == 1) {
                if (((TLRPC.Dialog) iVar.n(0)).f19873id != onVar.f39283a.getUserConfig().getClientUserId() || !org.telegram.ui.Components.yc.a0(onVar.f39283a).e0(i10, ((TLRPC.Dialog) iVar.n(0)).f19873id)) {
                    onVar.f39283a.y3.k(((TLRPC.Dialog) iVar.n(0)).f19873id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            onVar.f39283a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        di.ic icVar;
        co coVar = this.f37413c1.f39283a;
        MessageObject.GroupedMessages groupedMessages = null;
        if (view instanceof org.telegram.ui.Cells.f7) {
            icVar = di.kc.b((org.telegram.ui.Cells.f7) view);
        } else {
            icVar = null;
        }
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.f37412b1;
        if (messageObject.getGroupId() != 0) {
            groupedMessages = (MessageObject.GroupedMessages) coVar.f35479x6.f(messageObject.getGroupId());
        }
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final di.pc E = di.pc.E(coVar.getParentActivity(), this.currentAccount);
        E.R = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                di.pc pcVar = E;
                di.ic icVar2 = null;
                if (booleanValue) {
                    in inVar = in.this;
                    AndroidUtilities.runOnUIThread(new fh(13, inVar, l10));
                    inVar.dismiss();
                    pcVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        icVar2 = di.kc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    pcVar.Y(icVar2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(icVar, di.o8.y(arrayList));
    }

    @Override
    public final void dismissInternal() {
        int i10;
        co coVar = this.f37413c1.f39283a;
        Activity parentActivity = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (coVar.Y.getVisibility() == 0) {
            coVar.fragmentView.requestLayout();
        }
    }
}
