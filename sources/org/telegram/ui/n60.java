package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n60 extends org.telegram.ui.Components.yl0 {
    public ChatObject.Call f38812c;
    public final int d;
    public ArrayList f38814f;
    public a40 h;
    public final h60 f38815n;
    public final ArrayList f38813e = new ArrayList();
    public boolean f38816r = false;

    public n60(ChatObject.Call call, int i10, h60 h60Var) {
        this.f38812c = call;
        this.d = i10;
        this.f38815n = h60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f38814f, this.h, null, null, lVar, lVar.getParticipant(), this.f38812c, this.f38815n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.zl0 zl0Var = this.f38815n.f36960n2;
        int size = this.f38813e.size();
        if (size <= 1) {
            return zl0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return zl0Var.getMeasuredHeight() / 2;
        }
        return (int) (zl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a40 a40Var) {
        this.f38814f = arrayList;
        this.h = a40Var;
    }

    public final void H(org.telegram.ui.Components.zl0 zl0Var, boolean z10, boolean z11) {
        this.f38816r = z10;
        if (z11) {
            for (int i10 = 0; i10 < zl0Var.getChildCount(); i10++) {
                View childAt = zl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.zl0 zl0Var, boolean z10) {
        if (this.f38812c == null) {
            return;
        }
        ArrayList arrayList = this.f38813e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f38812c.visibleVideoParticipants);
            s4.o.c(new m60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(zl0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f38812c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f38813e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) c1Var.f46538a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f38813e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f32029a = i11;
        lVar.f32030b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f38812c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f32032e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new l60(this, viewGroup.getContext()));
    }
}
