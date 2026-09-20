package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class o60 extends org.telegram.ui.Components.ul0 {
    public ChatObject.Call f36192c;
    public final int d;
    public ArrayList f36193f;
    public a40 h;
    public final i60 f36194n;
    public final ArrayList e = new ArrayList();
    public boolean f36195r = false;

    public o60(ChatObject.Call call, int i10, i60 i60Var) {
        this.f36192c = call;
        this.d = i10;
        this.f36194n = i60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f36193f, this.h, null, null, lVar, lVar.getParticipant(), this.f36192c, this.f36194n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.vl0 vl0Var = this.f36194n.f34413n2;
        int size = this.e.size();
        if (size <= 1) {
            return vl0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return vl0Var.getMeasuredHeight() / 2;
        }
        return (int) (vl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a40 a40Var) {
        this.f36193f = arrayList;
        this.h = a40Var;
    }

    public final void H(org.telegram.ui.Components.vl0 vl0Var, boolean z10, boolean z11) {
        this.f36195r = z10;
        if (z11) {
            for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
                View childAt = vl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.vl0 vl0Var, boolean z10) {
        if (this.f36192c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f36192c.visibleVideoParticipants);
            s4.o.c(new n60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(vl0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f36192c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) c1Var.f42974a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f29445a = i11;
        lVar.f29446b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f36192c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new m60(this, viewGroup.getContext()));
    }
}
