package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class w20 extends yl0 {
    public ChatObject.Call f29798c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.v30 f29800n;
    public final org.telegram.ui.d60 f29801r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f29799f = new ArrayList();
    public boolean f29802s = false;

    public w20(ChatObject.Call call, int i10, org.telegram.ui.d60 d60Var) {
        this.f29798c = call;
        this.d = i10;
        this.f29801r = d60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.v30 v30Var) {
        this.h = arrayList;
        this.f29800n = v30Var;
    }

    public final void F(org.telegram.ui.r30 r30Var, boolean z10) {
        this.f29802s = z10;
        for (int i10 = 0; i10 < r30Var.getChildCount(); i10++) {
            View childAt = r30Var.getChildAt(i10);
            if (childAt instanceof v20) {
                v20 v20Var = (v20) childAt;
                if (v20Var.getVideoParticipant() != null) {
                    v20Var.b(z10);
                }
            }
        }
    }

    public final void G(zl0 zl0Var, boolean z10) {
        if (this.f29798c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f29799f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f29798c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f29798c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new t20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(zl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f29798c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f29798c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f29799f.size() + this.e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        v20 v20Var = (v20) c1Var.f43068a;
        ChatObject.VideoParticipant videoParticipant2 = v20Var.f28997f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f29799f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        v20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && v20Var.K && v20Var.getRenderer() != null) {
            v20Var.b(false);
            if (videoParticipant != null) {
                v20Var.b(true);
            }
        } else if (v20Var.K) {
            if (v20Var.getRenderer() == null && videoParticipant != null && this.f29802s) {
                v20Var.b(true);
            } else if (v20Var.getRenderer() != null && videoParticipant == null) {
                v20Var.b(false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new v20(this, viewGroup.getContext()));
    }
}
