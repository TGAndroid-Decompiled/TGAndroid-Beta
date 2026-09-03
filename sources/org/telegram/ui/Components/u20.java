package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class u20 extends ql0 {
    public ChatObject.Call f29084c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.x30 f29086n;
    public final org.telegram.ui.e60 f29087r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f29085f = new ArrayList();
    public boolean f29088s = false;

    public u20(ChatObject.Call call, int i10, org.telegram.ui.e60 e60Var) {
        this.f29084c = call;
        this.d = i10;
        this.f29087r = e60Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.x30 x30Var) {
        this.h = arrayList;
        this.f29086n = x30Var;
    }

    public final void F(org.telegram.ui.t30 t30Var, boolean z4) {
        this.f29088s = z4;
        for (int i10 = 0; i10 < t30Var.getChildCount(); i10++) {
            View childAt = t30Var.getChildAt(i10);
            if (childAt instanceof t20) {
                t20 t20Var = (t20) childAt;
                if (t20Var.getVideoParticipant() != null) {
                    t20Var.b(z4);
                }
            }
        }
    }

    public final void G(rl0 rl0Var, boolean z4) {
        if (this.f29084c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f29085f;
        if (z4) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f29084c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f29084c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            f2.q.c(new r20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(rl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f29084c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f29084c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f29085f.size() + this.e.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        t20 t20Var = (t20) l1Var.f5774a;
        ChatObject.VideoParticipant videoParticipant2 = t20Var.f28875f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f29085f;
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
            if (t20Var.getRenderer() == null && videoParticipant != null && this.f29088s) {
                t20Var.b(true);
            } else if (t20Var.getRenderer() != null && videoParticipant == null) {
                t20Var.b(false);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new t20(this, viewGroup.getContext()));
    }
}
