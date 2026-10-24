package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class y20 extends km0 {
    public ChatObject.Call f32789c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.k30 f32791n;
    public final org.telegram.ui.u50 f32792r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f32790f = new ArrayList();
    public boolean f32793s = false;

    public y20(ChatObject.Call call, int i10, org.telegram.ui.u50 u50Var) {
        this.f32789c = call;
        this.d = i10;
        this.f32792r = u50Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.k30 k30Var) {
        this.h = arrayList;
        this.f32791n = k30Var;
    }

    public final void F(org.telegram.ui.g30 g30Var, boolean z10) {
        this.f32793s = z10;
        for (int i10 = 0; i10 < g30Var.getChildCount(); i10++) {
            View childAt = g30Var.getChildAt(i10);
            if (childAt instanceof x20) {
                x20 x20Var = (x20) childAt;
                if (x20Var.getVideoParticipant() != null) {
                    x20Var.b(z10);
                }
            }
        }
    }

    public final void G(lm0 lm0Var, boolean z10) {
        if (this.f32789c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f32790f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f32789c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f32789c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new w20(this, arrayList4, arrayList3), true).c(this);
            AndroidUtilities.updateVisibleRows(lm0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f32789c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f32789c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f32790f.size() + this.e.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        x20 x20Var = (x20) b1Var.f46342a;
        ChatObject.VideoParticipant videoParticipant2 = x20Var.f32487f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f32790f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        x20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && x20Var.K && x20Var.getRenderer() != null) {
            x20Var.b(false);
            if (videoParticipant != null) {
                x20Var.b(true);
            }
        } else if (x20Var.K) {
            if (x20Var.getRenderer() == null && videoParticipant != null && this.f32793s) {
                x20Var.b(true);
            } else if (x20Var.getRenderer() != null && videoParticipant == null) {
                x20Var.b(false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new x20(this, viewGroup.getContext()));
    }
}
