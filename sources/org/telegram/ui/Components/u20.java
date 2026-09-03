package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class u20 extends rl0 {
    public ChatObject.Call f31479c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.w30 f31482n;
    public final org.telegram.ui.d60 f31483r;
    public final ArrayList f31480e = new ArrayList();
    public final ArrayList f31481f = new ArrayList();
    public boolean f31484s = false;

    public u20(ChatObject.Call call, int i10, org.telegram.ui.d60 d60Var) {
        this.f31479c = call;
        this.d = i10;
        this.f31483r = d60Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.w30 w30Var) {
        this.h = arrayList;
        this.f31482n = w30Var;
    }

    public final void F(org.telegram.ui.s30 s30Var, boolean z4) {
        this.f31484s = z4;
        for (int i10 = 0; i10 < s30Var.getChildCount(); i10++) {
            View childAt = s30Var.getChildAt(i10);
            if (childAt instanceof t20) {
                t20 t20Var = (t20) childAt;
                if (t20Var.getVideoParticipant() != null) {
                    t20Var.b(z4);
                }
            }
        }
    }

    public final void G(sl0 sl0Var, boolean z4) {
        if (this.f31479c == null) {
            return;
        }
        ArrayList arrayList = this.f31480e;
        ArrayList arrayList2 = this.f31481f;
        if (z4) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f31479c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f31479c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            f2.q.c(new r20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(sl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f31479c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f31479c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f31481f.size() + this.f31480e.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        t20 t20Var = (t20) m1Var.f5875a;
        ChatObject.VideoParticipant videoParticipant2 = t20Var.f31253f;
        ArrayList arrayList = this.f31480e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f31481f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        t20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && t20Var.H && t20Var.getRenderer() != null) {
            t20Var.b(false);
            if (videoParticipant != null) {
                t20Var.b(true);
            }
        } else if (t20Var.H) {
            if (t20Var.getRenderer() == null && videoParticipant != null && this.f31484s) {
                t20Var.b(true);
            } else if (t20Var.getRenderer() != null && videoParticipant == null) {
                t20Var.b(false);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new t20(this, viewGroup.getContext()));
    }
}
