package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k60 extends org.telegram.ui.Components.ql0 {
    public ChatObject.Call f35431c;
    public final int d;
    public ArrayList f35432f;
    public x30 h;
    public final e60 f35433n;
    public final ArrayList e = new ArrayList();
    public boolean f35434r = false;

    public k60(ChatObject.Call call, int i10, e60 e60Var) {
        this.f35431c = call;
        this.d = i10;
        this.f35433n = e60Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z4) {
        if (z4 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f35432f, this.h, null, null, lVar, lVar.getParticipant(), this.f35431c, this.f35433n));
        } else if (!z4 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.rl0 rl0Var = this.f35433n.f33660k2;
        int size = this.e.size();
        if (size <= 1) {
            return rl0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return rl0Var.getMeasuredHeight() / 2;
        }
        return (int) (rl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, x30 x30Var) {
        this.f35432f = arrayList;
        this.h = x30Var;
    }

    public final void H(org.telegram.ui.Components.rl0 rl0Var, boolean z4, boolean z10) {
        this.f35434r = z4;
        if (z10) {
            for (int i10 = 0; i10 < rl0Var.getChildCount(); i10++) {
                View childAt = rl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z4);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.rl0 rl0Var, boolean z4) {
        if (this.f35431c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z4) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f35431c.visibleVideoParticipants);
            f2.q.c(new j60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(rl0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f35431c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) l1Var.f5774a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f29727a = i11;
        lVar.f29728b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f35431c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new i60(this, viewGroup.getContext()));
    }
}
