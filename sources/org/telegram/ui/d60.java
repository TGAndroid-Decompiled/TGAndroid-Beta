package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class d60 extends org.telegram.ui.Components.mm0 {
    public ChatObject.Call f38521c;
    public final int d;
    public ArrayList f38522f;
    public o30 h;
    public final x50 f38523n;
    public final ArrayList e = new ArrayList();
    public boolean f38524r = false;

    public d60(ChatObject.Call call, int i10, x50 x50Var) {
        this.f38521c = call;
        this.d = i10;
        this.f38523n = x50Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f38522f, this.h, null, null, lVar, lVar.getParticipant(), this.f38521c, this.f38523n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.nm0 nm0Var = this.f38523n.f45545n2;
        int size = this.e.size();
        if (size <= 1) {
            return nm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return nm0Var.getMeasuredHeight() / 2;
        }
        return (int) (nm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, o30 o30Var) {
        this.f38522f = arrayList;
        this.h = o30Var;
    }

    public final void H(org.telegram.ui.Components.nm0 nm0Var, boolean z10, boolean z11) {
        this.f38524r = z10;
        if (z11) {
            for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
                View childAt = nm0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.nm0 nm0Var, boolean z10) {
        if (this.f38521c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f38521c.visibleVideoParticipants);
            s4.p.c(new c60(this, arrayList2), true).c(this);
            AndroidUtilities.updateVisibleRows(nm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f38521c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) e1Var.f47773a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f34002a = i11;
        lVar.f34003b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f38521c.selfPeer);
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
        return new s4.e1(new b60(this, viewGroup.getContext()));
    }
}
