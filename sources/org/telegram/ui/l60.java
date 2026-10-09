package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l60 extends org.telegram.ui.Components.pm0 {
    public ChatObject.Call f39441c;
    public final int d;
    public ArrayList f39443f;
    public y30 h;
    public final g60 f39444n;
    public final ArrayList f39442e = new ArrayList();
    public boolean f39445r = false;

    public l60(ChatObject.Call call, int i10, g60 g60Var) {
        this.f39441c = call;
        this.d = i10;
        this.f39444n = g60Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f39443f, this.h, null, null, lVar, lVar.getParticipant(), this.f39441c, this.f39444n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.qm0 qm0Var = this.f39444n.f37841n2;
        int size = this.f39442e.size();
        if (size <= 1) {
            return qm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return qm0Var.getMeasuredHeight() / 2;
        }
        return (int) (qm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, y30 y30Var) {
        this.f39443f = arrayList;
        this.h = y30Var;
    }

    public final void H(org.telegram.ui.Components.qm0 qm0Var, boolean z10, boolean z11) {
        this.f39445r = z10;
        if (z11) {
            for (int i10 = 0; i10 < qm0Var.getChildCount(); i10++) {
                View childAt = qm0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.qm0 qm0Var, boolean z10) {
        if (this.f39441c == null) {
            return;
        }
        ArrayList arrayList = this.f39442e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f39441c.visibleVideoParticipants);
            s4.o.c(new k60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(qm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f39441c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f39442e.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) d1Var.f47656a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f39442e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f32037a = i11;
        lVar.f32038b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f39441c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f32040e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new j60(this, viewGroup.getContext()));
    }
}
