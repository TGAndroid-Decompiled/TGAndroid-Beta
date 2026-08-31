package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j60 extends org.telegram.ui.Components.sl0 {
    public ChatObject.Call f38020c;
    public final int d;
    public ArrayList f38022f;
    public w30 h;
    public final d60 f38023n;
    public final ArrayList f38021e = new ArrayList();
    public boolean f38024r = false;

    public j60(ChatObject.Call call, int i10, d60 d60Var) {
        this.f38020c = call;
        this.d = i10;
        this.f38023n = d60Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z4) {
        if (z4 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f38022f, this.h, null, null, lVar, lVar.getParticipant(), this.f38020c, this.f38023n));
        } else if (!z4 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.tl0 tl0Var = this.f38023n.f36055k2;
        int size = this.f38021e.size();
        if (size <= 1) {
            return tl0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return tl0Var.getMeasuredHeight() / 2;
        }
        return (int) (tl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, w30 w30Var) {
        this.f38022f = arrayList;
        this.h = w30Var;
    }

    public final void H(org.telegram.ui.Components.tl0 tl0Var, boolean z4, boolean z10) {
        this.f38024r = z4;
        if (z10) {
            for (int i10 = 0; i10 < tl0Var.getChildCount(); i10++) {
                View childAt = tl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z4);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.tl0 tl0Var, boolean z4) {
        if (this.f38020c == null) {
            return;
        }
        ArrayList arrayList = this.f38021e;
        if (z4) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f38020c.visibleVideoParticipants);
            f2.q.c(new i60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(tl0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f38020c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f38021e.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) m1Var.f5875a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f38021e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f32133a = i11;
        lVar.f32134b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f38020c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f32136e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new h60(this, viewGroup.getContext()));
    }
}
