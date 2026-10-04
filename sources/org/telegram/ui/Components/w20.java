package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class w20 extends yl0 {
    public ChatObject.Call f32449c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.a40 f32452n;
    public final org.telegram.ui.h60 f32453r;
    public final ArrayList f32450e = new ArrayList();
    public final ArrayList f32451f = new ArrayList();
    public boolean f32454s = false;

    public w20(ChatObject.Call call, int i10, org.telegram.ui.h60 h60Var) {
        this.f32449c = call;
        this.d = i10;
        this.f32453r = h60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.a40 a40Var) {
        this.h = arrayList;
        this.f32452n = a40Var;
    }

    public final void F(org.telegram.ui.w30 w30Var, boolean z10) {
        this.f32454s = z10;
        for (int i10 = 0; i10 < w30Var.getChildCount(); i10++) {
            View childAt = w30Var.getChildAt(i10);
            if (childAt instanceof v20) {
                v20 v20Var = (v20) childAt;
                if (v20Var.getVideoParticipant() != null) {
                    v20Var.b(z10);
                }
            }
        }
    }

    public final void G(zl0 zl0Var, boolean z10) {
        if (this.f32449c == null) {
            return;
        }
        ArrayList arrayList = this.f32450e;
        ArrayList arrayList2 = this.f32451f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f32449c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f32449c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            s4.o.c(new t20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(zl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f32449c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f32449c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f32451f.size() + this.f32450e.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        v20 v20Var = (v20) c1Var.f46531a;
        ChatObject.VideoParticipant videoParticipant2 = v20Var.f31519f;
        ArrayList arrayList = this.f32450e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f32451f;
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
            if (v20Var.getRenderer() == null && videoParticipant != null && this.f32454s) {
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
