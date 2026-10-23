package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class a30 extends lm0 {
    public ChatObject.Call f24613c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.k30 f24615n;
    public final org.telegram.ui.u50 f24616r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f24614f = new ArrayList();
    public boolean f24617s = false;

    public a30(ChatObject.Call call, int i10, org.telegram.ui.u50 u50Var) {
        this.f24613c = call;
        this.d = i10;
        this.f24616r = u50Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.k30 k30Var) {
        this.h = arrayList;
        this.f24615n = k30Var;
    }

    public final void F(org.telegram.ui.g30 g30Var, boolean z10) {
        this.f24617s = z10;
        for (int i10 = 0; i10 < g30Var.getChildCount(); i10++) {
            View childAt = g30Var.getChildAt(i10);
            if (childAt instanceof z20) {
                z20 z20Var = (z20) childAt;
                if (z20Var.getVideoParticipant() != null) {
                    z20Var.b(z10);
                }
            }
        }
    }

    public final void G(mm0 mm0Var, boolean z10) {
        if (this.f24613c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f24614f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f24613c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f24613c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new y20(this, arrayList4, arrayList3), true).c(this);
            AndroidUtilities.updateVisibleRows(mm0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f24613c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f24613c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f24614f.size() + this.e.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        z20 z20Var = (z20) b1Var.f46343a;
        ChatObject.VideoParticipant videoParticipant2 = z20Var.f33121f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f24614f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        z20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && z20Var.K && z20Var.getRenderer() != null) {
            z20Var.b(false);
            if (videoParticipant != null) {
                z20Var.b(true);
            }
        } else if (z20Var.K) {
            if (z20Var.getRenderer() == null && videoParticipant != null && this.f24617s) {
                z20Var.b(true);
            } else if (z20Var.getRenderer() != null && videoParticipant == null) {
                z20Var.b(false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new z20(this, viewGroup.getContext()));
    }
}
