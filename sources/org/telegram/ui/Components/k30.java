package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class k30 extends qm0 {
    public ChatObject.Call f27872c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.y30 f27875n;
    public final org.telegram.ui.g60 f27876r;
    public final ArrayList f27873e = new ArrayList();
    public final ArrayList f27874f = new ArrayList();
    public boolean f27877s = false;

    public k30(ChatObject.Call call, int i10, org.telegram.ui.g60 g60Var) {
        this.f27872c = call;
        this.d = i10;
        this.f27876r = g60Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.y30 y30Var) {
        this.h = arrayList;
        this.f27875n = y30Var;
    }

    public final void F(org.telegram.ui.u30 u30Var, boolean z10) {
        this.f27877s = z10;
        for (int i10 = 0; i10 < u30Var.getChildCount(); i10++) {
            View childAt = u30Var.getChildAt(i10);
            if (childAt instanceof j30) {
                j30 j30Var = (j30) childAt;
                if (j30Var.getVideoParticipant() != null) {
                    j30Var.b(z10);
                }
            }
        }
    }

    public final void G(rm0 rm0Var, boolean z10) {
        if (this.f27872c == null) {
            return;
        }
        ArrayList arrayList = this.f27873e;
        ArrayList arrayList2 = this.f27874f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f27872c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f27872c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new h30(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(rm0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f27872c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f27872c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27874f.size() + this.f27873e.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        j30 j30Var = (j30) d1Var.f47702a;
        ChatObject.VideoParticipant videoParticipant2 = j30Var.f27518f;
        ArrayList arrayList = this.f27873e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f27874f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        j30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && j30Var.K && j30Var.getRenderer() != null) {
            j30Var.b(false);
            if (videoParticipant != null) {
                j30Var.b(true);
            }
        } else if (j30Var.K) {
            if (j30Var.getRenderer() == null && videoParticipant != null && this.f27877s) {
                j30Var.b(true);
            } else if (j30Var.getRenderer() != null && videoParticipant == null) {
                j30Var.b(false);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new j30(this, viewGroup.getContext()));
    }
}
