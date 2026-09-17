package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p60 extends org.telegram.ui.Components.kl0 {
    public ChatObject.Call f39411c;
    public final int d;
    public ArrayList f39413f;
    public a40 h;
    public final j60 f39414n;
    public final ArrayList f39412e = new ArrayList();
    public boolean f39415r = false;

    public p60(ChatObject.Call call, int i10, j60 j60Var) {
        this.f39411c = call;
        this.d = i10;
        this.f39414n = j60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f39413f, this.h, null, null, lVar, lVar.getParticipant(), this.f39411c, this.f39414n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ll0 ll0Var = this.f39414n.f37568n2;
        int size = this.f39412e.size();
        if (size <= 1) {
            return ll0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return ll0Var.getMeasuredHeight() / 2;
        }
        return (int) (ll0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a40 a40Var) {
        this.f39413f = arrayList;
        this.h = a40Var;
    }

    public final void H(org.telegram.ui.Components.ll0 ll0Var, boolean z10, boolean z11) {
        this.f39415r = z10;
        if (z11) {
            for (int i10 = 0; i10 < ll0Var.getChildCount(); i10++) {
                View childAt = ll0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.ll0 ll0Var, boolean z10) {
        if (this.f39411c == null) {
            return;
        }
        ArrayList arrayList = this.f39412e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f39411c.visibleVideoParticipants);
            s4.o.c(new o60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(ll0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f39411c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f39412e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) c1Var.f45739a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f39412e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f31591a = i11;
        lVar.f31592b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f39411c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f31594e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new n60(this, viewGroup.getContext()));
    }
}
