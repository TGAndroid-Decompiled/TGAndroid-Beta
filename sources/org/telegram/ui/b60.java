package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class b60 extends org.telegram.ui.Components.lm0 {
    public ChatObject.Call f37982c;
    public final int d;
    public ArrayList f37983f;
    public m30 h;
    public final v50 f37984n;
    public final ArrayList e = new ArrayList();
    public boolean f37985r = false;

    public b60(ChatObject.Call call, int i10, v50 v50Var) {
        this.f37982c = call;
        this.d = i10;
        this.f37984n = v50Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f37983f, this.h, null, null, lVar, lVar.getParticipant(), this.f37982c, this.f37984n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.mm0 mm0Var = this.f37984n.f44664n2;
        int size = this.e.size();
        if (size <= 1) {
            return mm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return mm0Var.getMeasuredHeight() / 2;
        }
        return (int) (mm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, m30 m30Var) {
        this.f37983f = arrayList;
        this.h = m30Var;
    }

    public final void H(org.telegram.ui.Components.mm0 mm0Var, boolean z10, boolean z11) {
        this.f37985r = z10;
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
        if (this.f37982c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f37982c.visibleVideoParticipants);
            s4.p.c(new a60(this, arrayList2), true).c(this);
            AndroidUtilities.updateVisibleRows(mm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f37982c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) e1Var.f47738a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f33897a = i11;
        lVar.f33898b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f37982c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new z50(this, viewGroup.getContext()));
    }
}
