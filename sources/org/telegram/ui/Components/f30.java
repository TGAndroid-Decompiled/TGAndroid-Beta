package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class f30 extends lm0 {
    public ChatObject.Call f24873c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.e40 f24875n;
    public final org.telegram.ui.n60 f24876r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f24874f = new ArrayList();
    public boolean f24877s = false;

    public f30(ChatObject.Call call, int i10, org.telegram.ui.n60 n60Var) {
        this.f24873c = call;
        this.d = i10;
        this.f24876r = n60Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.e40 e40Var) {
        this.h = arrayList;
        this.f24875n = e40Var;
    }

    public final void F(org.telegram.ui.a40 a40Var, boolean z10) {
        this.f24877s = z10;
        for (int i10 = 0; i10 < a40Var.getChildCount(); i10++) {
            View childAt = a40Var.getChildAt(i10);
            if (childAt instanceof e30) {
                e30 e30Var = (e30) childAt;
                if (e30Var.getVideoParticipant() != null) {
                    e30Var.b(z10);
                }
            }
        }
    }

    public final void G(mm0 mm0Var, boolean z10) {
        if (this.f24873c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f24874f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f24873c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f24873c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new c30(this, arrayList4, arrayList3), true).c(this);
            AndroidUtilities.updateVisibleRows(mm0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f24873c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f24873c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f24874f.size() + this.e.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        e30 e30Var = (e30) b1Var.f44838a;
        ChatObject.VideoParticipant videoParticipant2 = e30Var.f24576f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f24874f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        e30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && e30Var.K && e30Var.getRenderer() != null) {
            e30Var.b(false);
            if (videoParticipant != null) {
                e30Var.b(true);
            }
        } else if (e30Var.K) {
            if (e30Var.getRenderer() == null && videoParticipant != null && this.f24877s) {
                e30Var.b(true);
            } else if (e30Var.getRenderer() != null && videoParticipant == null) {
                e30Var.b(false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new e30(this, viewGroup.getContext()));
    }
}
