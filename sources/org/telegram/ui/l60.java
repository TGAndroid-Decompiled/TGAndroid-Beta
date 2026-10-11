package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l60 extends org.telegram.ui.Components.rm0 {
    public ChatObject.Call f39521c;
    public final int d;
    public ArrayList f39523f;
    public y30 h;
    public final g60 f39524n;
    public final ArrayList f39522e = new ArrayList();
    public boolean f39525r = false;

    public l60(ChatObject.Call call, int i10, g60 g60Var) {
        this.f39521c = call;
        this.d = i10;
        this.f39524n = g60Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.m mVar, boolean z10) {
        if (z10 && mVar.getRenderer() == null) {
            mVar.setRenderer(org.telegram.ui.Components.voip.v.c(this.f39523f, this.h, null, null, mVar, mVar.getParticipant(), this.f39521c, this.f39524n));
        } else if (!z10 && mVar.getRenderer() != null) {
            mVar.getRenderer().setTabletGridView(null);
            mVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.sm0 sm0Var = this.f39524n.f37923n2;
        int size = this.f39522e.size();
        if (size <= 1) {
            return sm0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return sm0Var.getMeasuredHeight() / 2;
        }
        return (int) (sm0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, y30 y30Var) {
        this.f39523f = arrayList;
        this.h = y30Var;
    }

    public final void H(org.telegram.ui.Components.sm0 sm0Var, boolean z10, boolean z11) {
        this.f39525r = z10;
        if (z11) {
            for (int i10 = 0; i10 < sm0Var.getChildCount(); i10++) {
                View childAt = sm0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.m) {
                    org.telegram.ui.Components.voip.m mVar = (org.telegram.ui.Components.voip.m) childAt;
                    if (mVar.getParticipant() != null) {
                        E(mVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.sm0 sm0Var, boolean z10) {
        if (this.f39521c == null) {
            return;
        }
        ArrayList arrayList = this.f39522e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f39521c.visibleVideoParticipants);
            s4.o.c(new k60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(sm0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f39521c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f39522e.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Components.voip.m mVar = (org.telegram.ui.Components.voip.m) d1Var.f47748a;
        ChatObject.VideoParticipant participant = mVar.getParticipant();
        ArrayList arrayList = this.f39522e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        mVar.f32096a = i11;
        mVar.f32097b = this;
        if (mVar.getMeasuredHeight() != F()) {
            mVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f39521c.selfPeer);
        mVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && mVar.f32099e && mVar.getRenderer() != null) {
            E(mVar, false);
            E(mVar, true);
        } else if (mVar.getRenderer() != null) {
            mVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new j60(this, viewGroup.getContext()));
    }
}
