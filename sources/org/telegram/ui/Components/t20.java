package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class t20 extends vl0 {
    public ChatObject.Call f28387c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.v30 f28389n;
    public final org.telegram.ui.d60 f28390r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28388f = new ArrayList();
    public boolean f28391s = false;

    public t20(ChatObject.Call call, int i10, org.telegram.ui.d60 d60Var) {
        this.f28387c = call;
        this.d = i10;
        this.f28390r = d60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.v30 v30Var) {
        this.h = arrayList;
        this.f28389n = v30Var;
    }

    public final void F(org.telegram.ui.r30 r30Var, boolean z10) {
        this.f28391s = z10;
        for (int i10 = 0; i10 < r30Var.getChildCount(); i10++) {
            View childAt = r30Var.getChildAt(i10);
            if (childAt instanceof s20) {
                s20 s20Var = (s20) childAt;
                if (s20Var.getVideoParticipant() != null) {
                    s20Var.b(z10);
                }
            }
        }
    }

    public final void G(wl0 wl0Var, boolean z10) {
        if (this.f28387c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f28388f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f28387c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f28387c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new q20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(wl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f28387c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f28387c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28388f.size() + this.e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        s20 s20Var = (s20) c1Var.f42960a;
        ChatObject.VideoParticipant videoParticipant2 = s20Var.f28110f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28388f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        s20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && s20Var.K && s20Var.getRenderer() != null) {
            s20Var.b(false);
            if (videoParticipant != null) {
                s20Var.b(true);
            }
        } else if (s20Var.K) {
            if (s20Var.getRenderer() == null && videoParticipant != null && this.f28391s) {
                s20Var.b(true);
            } else if (s20Var.getRenderer() != null && videoParticipant == null) {
                s20Var.b(false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new s20(this, viewGroup.getContext()));
    }
}
