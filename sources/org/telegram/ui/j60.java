package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j60 extends org.telegram.ui.Components.wl0 {
    public ChatObject.Call f34657c;
    public final int d;
    public ArrayList f34658f;
    public v30 h;
    public final d60 f34659n;
    public final ArrayList e = new ArrayList();
    public boolean f34660r = false;

    public j60(ChatObject.Call call, int i10, d60 d60Var) {
        this.f34657c = call;
        this.d = i10;
        this.f34659n = d60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f34658f, this.h, null, null, lVar, lVar.getParticipant(), this.f34657c, this.f34659n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.xl0 xl0Var = this.f34659n.f32987n2;
        int size = this.e.size();
        if (size <= 1) {
            return xl0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return xl0Var.getMeasuredHeight() / 2;
        }
        return (int) (xl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, v30 v30Var) {
        this.f34658f = arrayList;
        this.h = v30Var;
    }

    public final void H(org.telegram.ui.Components.xl0 xl0Var, boolean z10, boolean z11) {
        this.f34660r = z10;
        if (z11) {
            for (int i10 = 0; i10 < xl0Var.getChildCount(); i10++) {
                View childAt = xl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.xl0 xl0Var, boolean z10) {
        if (this.f34657c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f34657c.visibleVideoParticipants);
            s4.o.c(new i60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(xl0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f34657c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) c1Var.f42959a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f29360a = i11;
        lVar.f29361b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f34657c.selfPeer);
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
        return new s4.c1(new h60(this, viewGroup.getContext()));
    }
}
