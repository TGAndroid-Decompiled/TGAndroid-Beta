package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class u20 extends wl0 {
    public ChatObject.Call f28680c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.v30 f28682n;
    public final org.telegram.ui.d60 f28683r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28681f = new ArrayList();
    public boolean f28684s = false;

    public u20(ChatObject.Call call, int i10, org.telegram.ui.d60 d60Var) {
        this.f28680c = call;
        this.d = i10;
        this.f28683r = d60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.v30 v30Var) {
        this.h = arrayList;
        this.f28682n = v30Var;
    }

    public final void F(org.telegram.ui.r30 r30Var, boolean z10) {
        this.f28684s = z10;
        for (int i10 = 0; i10 < r30Var.getChildCount(); i10++) {
            View childAt = r30Var.getChildAt(i10);
            if (childAt instanceof t20) {
                t20 t20Var = (t20) childAt;
                if (t20Var.getVideoParticipant() != null) {
                    t20Var.b(z10);
                }
            }
        }
    }

    public final void G(xl0 xl0Var, boolean z10) {
        if (this.f28680c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f28681f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f28680c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f28680c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new r20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(xl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f28680c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f28680c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28681f.size() + this.e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        t20 t20Var = (t20) c1Var.f42959a;
        ChatObject.VideoParticipant videoParticipant2 = t20Var.f28419f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28681f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        t20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && t20Var.K && t20Var.getRenderer() != null) {
            t20Var.b(false);
            if (videoParticipant != null) {
                t20Var.b(true);
            }
        } else if (t20Var.K) {
            if (t20Var.getRenderer() == null && videoParticipant != null && this.f28684s) {
                t20Var.b(true);
            } else if (t20Var.getRenderer() != null && videoParticipant == null) {
                t20Var.b(false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new t20(this, viewGroup.getContext()));
    }
}
