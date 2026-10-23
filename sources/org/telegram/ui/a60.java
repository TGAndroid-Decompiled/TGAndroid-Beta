package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a60 extends org.telegram.ui.Components.lm0 {
    public ChatObject.Call f35579c;
    public final int d;
    public ArrayList f35580f;
    public k30 h;
    public final u50 f35581n;
    public final ArrayList e = new ArrayList();
    public boolean f35582r = false;

    public a60(ChatObject.Call call, int i10, u50 u50Var) {
        this.f35579c = call;
        this.d = i10;
        this.f35581n = u50Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f35580f, this.h, null, null, lVar, lVar.getParticipant(), this.f35579c, this.f35581n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.mm0 mm0Var = this.f35581n.f42225n2;
        int size = this.e.size();
        if (size <= 1) {
            return mm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return mm0Var.getMeasuredHeight() / 2;
        }
        return (int) (mm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, k30 k30Var) {
        this.f35580f = arrayList;
        this.h = k30Var;
    }

    public final void H(org.telegram.ui.Components.mm0 mm0Var, boolean z10, boolean z11) {
        this.f35582r = z10;
        if (z11) {
            for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                View childAt = mm0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.mm0 mm0Var, boolean z10) {
        if (this.f35579c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f35579c.visibleVideoParticipants);
            s4.o.c(new z50(this, arrayList2), true).c(this);
            AndroidUtilities.updateVisibleRows(mm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f35579c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) b1Var.f46343a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f31694a = i11;
        lVar.f31695b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f35579c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new y50(this, viewGroup.getContext()));
    }
}
