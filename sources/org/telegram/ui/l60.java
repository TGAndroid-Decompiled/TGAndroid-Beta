package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l60 extends org.telegram.ui.Components.qm0 {
    public ChatObject.Call f39487c;
    public final int d;
    public ArrayList f39489f;
    public y30 h;
    public final g60 f39490n;
    public final ArrayList f39488e = new ArrayList();
    public boolean f39491r = false;

    public l60(ChatObject.Call call, int i10, g60 g60Var) {
        this.f39487c = call;
        this.d = i10;
        this.f39490n = g60Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f39489f, this.h, null, null, lVar, lVar.getParticipant(), this.f39487c, this.f39490n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.rm0 rm0Var = this.f39490n.f37887n2;
        int size = this.f39488e.size();
        if (size <= 1) {
            return rm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return rm0Var.getMeasuredHeight() / 2;
        }
        return (int) (rm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, y30 y30Var) {
        this.f39489f = arrayList;
        this.h = y30Var;
    }

    public final void H(org.telegram.ui.Components.rm0 rm0Var, boolean z10, boolean z11) {
        this.f39491r = z10;
        if (z11) {
            for (int i10 = 0; i10 < rm0Var.getChildCount(); i10++) {
                View childAt = rm0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.rm0 rm0Var, boolean z10) {
        if (this.f39487c == null) {
            return;
        }
        ArrayList arrayList = this.f39488e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f39487c.visibleVideoParticipants);
            s4.o.c(new k60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(rm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f39487c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f39488e.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) d1Var.f47702a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f39488e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f32102a = i11;
        lVar.f32103b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f39487c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f32105e && lVar.getRenderer() != null) {
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
