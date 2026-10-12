package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n60 extends org.telegram.ui.Components.vm0 {
    public ChatObject.Call f40235c;
    public final int d;
    public ArrayList f40237f;
    public a40 h;
    public final i60 f40238n;
    public final ArrayList f40236e = new ArrayList();
    public boolean f40239r = false;

    public n60(ChatObject.Call call, int i10, i60 i60Var) {
        this.f40235c = call;
        this.d = i10;
        this.f40238n = i60Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f40237f, this.h, null, null, lVar, lVar.getParticipant(), this.f40235c, this.f40238n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.wm0 wm0Var = this.f40238n.f38732n2;
        int size = this.f40236e.size();
        if (size <= 1) {
            return wm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return wm0Var.getMeasuredHeight() / 2;
        }
        return (int) (wm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a40 a40Var) {
        this.f40237f = arrayList;
        this.h = a40Var;
    }

    public final void H(org.telegram.ui.Components.wm0 wm0Var, boolean z10, boolean z11) {
        this.f40239r = z10;
        if (z11) {
            for (int i10 = 0; i10 < wm0Var.getChildCount(); i10++) {
                View childAt = wm0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.wm0 wm0Var, boolean z10) {
        if (this.f40235c == null) {
            return;
        }
        ArrayList arrayList = this.f40236e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f40235c.visibleVideoParticipants);
            s4.o.c(new m60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(wm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f40235c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f40236e.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) d1Var.f47889a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f40236e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f31782a = i11;
        lVar.f31783b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f40235c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f31785e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new l60(this, viewGroup.getContext()));
    }
}
