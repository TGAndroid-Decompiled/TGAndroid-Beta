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
    public ChatObject.Call f39438c;
    public final int d;
    public ArrayList f39440f;
    public a40 h;
    public final j60 f39441n;
    public final ArrayList f39439e = new ArrayList();
    public boolean f39442r = false;

    public p60(ChatObject.Call call, int i10, j60 j60Var) {
        this.f39438c = call;
        this.d = i10;
        this.f39441n = j60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f39440f, this.h, null, null, lVar, lVar.getParticipant(), this.f39438c, this.f39441n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ll0 ll0Var = this.f39441n.f37595n2;
        int size = this.f39439e.size();
        if (size <= 1) {
            return ll0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return ll0Var.getMeasuredHeight() / 2;
        }
        return (int) (ll0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a40 a40Var) {
        this.f39440f = arrayList;
        this.h = a40Var;
    }

    public final void H(org.telegram.ui.Components.ll0 ll0Var, boolean z10, boolean z11) {
        this.f39442r = z10;
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
        if (this.f39438c == null) {
            return;
        }
        ArrayList arrayList = this.f39439e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f39438c.visibleVideoParticipants);
            s4.o.c(new o60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(ll0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f39438c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f39439e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) c1Var.f45767a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f39439e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f31618a = i11;
        lVar.f31619b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f39438c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f31621e && lVar.getRenderer() != null) {
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
