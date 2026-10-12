package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class m30 extends vm0 {
    public ChatObject.Call f28365c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.a40 f28368n;
    public final org.telegram.ui.i60 f28369r;
    public final ArrayList f28366e = new ArrayList();
    public final ArrayList f28367f = new ArrayList();
    public boolean f28370s = false;

    public m30(ChatObject.Call call, int i10, org.telegram.ui.i60 i60Var) {
        this.f28365c = call;
        this.d = i10;
        this.f28369r = i60Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.a40 a40Var) {
        this.h = arrayList;
        this.f28368n = a40Var;
    }

    public final void F(org.telegram.ui.w30 w30Var, boolean z10) {
        this.f28370s = z10;
        for (int i10 = 0; i10 < w30Var.getChildCount(); i10++) {
            View childAt = w30Var.getChildAt(i10);
            if (childAt instanceof l30) {
                l30 l30Var = (l30) childAt;
                if (l30Var.getVideoParticipant() != null) {
                    l30Var.b(z10);
                }
            }
        }
    }

    public final void G(wm0 wm0Var, boolean z10) {
        if (this.f28365c == null) {
            return;
        }
        ArrayList arrayList = this.f28366e;
        ArrayList arrayList2 = this.f28367f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f28365c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f28365c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new j30(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(wm0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f28365c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f28365c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28367f.size() + this.f28366e.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        l30 l30Var = (l30) d1Var.f47897a;
        ChatObject.VideoParticipant videoParticipant2 = l30Var.f27999f;
        ArrayList arrayList = this.f28366e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28367f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        l30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && l30Var.K && l30Var.getRenderer() != null) {
            l30Var.b(false);
            if (videoParticipant != null) {
                l30Var.b(true);
            }
        } else if (l30Var.K) {
            if (l30Var.getRenderer() == null && videoParticipant != null && this.f28370s) {
                l30Var.b(true);
            } else if (l30Var.getRenderer() != null && videoParticipant == null) {
                l30Var.b(false);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new l30(this, viewGroup.getContext()));
    }
}
