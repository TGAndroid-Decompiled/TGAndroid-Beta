package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class b30 extends ul0 {
    public ChatObject.Call f21693c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b40 f21695n;
    public final org.telegram.ui.j60 f21696r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f21694f = new ArrayList();
    public boolean f21697s = false;

    public b30(ChatObject.Call call, int i10, org.telegram.ui.j60 j60Var) {
        this.f21693c = call;
        this.d = i10;
        this.f21696r = j60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b40 b40Var) {
        this.h = arrayList;
        this.f21695n = b40Var;
    }

    public final void F(org.telegram.ui.x30 x30Var, boolean z10) {
        this.f21697s = z10;
        for (int i10 = 0; i10 < x30Var.getChildCount(); i10++) {
            View childAt = x30Var.getChildAt(i10);
            if (childAt instanceof a30) {
                a30 a30Var = (a30) childAt;
                if (a30Var.getVideoParticipant() != null) {
                    a30Var.b(z10);
                }
            }
        }
    }

    public final void G(vl0 vl0Var, boolean z10) {
        if (this.f21693c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f21694f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f21693c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f21693c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new y20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(vl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f21693c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f21693c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f21694f.size() + this.e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        a30 a30Var = (a30) c1Var.f41610a;
        ChatObject.VideoParticipant videoParticipant2 = a30Var.f21369f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f21694f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        a30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && a30Var.K && a30Var.getRenderer() != null) {
            a30Var.b(false);
            if (videoParticipant != null) {
                a30Var.b(true);
            }
        } else if (a30Var.K) {
            if (a30Var.getRenderer() == null && videoParticipant != null && this.f21697s) {
                a30Var.b(true);
            } else if (a30Var.getRenderer() != null && videoParticipant == null) {
                a30Var.b(false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new a30(this, viewGroup.getContext()));
    }
}
