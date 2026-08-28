package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class c20 extends vk0 {
    public ChatObject.Call f27349c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.g30 f27352n;
    public final org.telegram.ui.o50 f27353r;
    public final ArrayList f27350e = new ArrayList();
    public final ArrayList f27351f = new ArrayList();
    public boolean f27354s = false;

    public c20(ChatObject.Call call, int i9, org.telegram.ui.o50 o50Var) {
        this.f27349c = call;
        this.d = i9;
        this.f27353r = o50Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.g30 g30Var) {
        this.h = arrayList;
        this.f27352n = g30Var;
    }

    public final void F(org.telegram.ui.c30 c30Var, boolean z10) {
        this.f27354s = z10;
        for (int i9 = 0; i9 < c30Var.getChildCount(); i9++) {
            View childAt = c30Var.getChildAt(i9);
            if (childAt instanceof b20) {
                b20 b20Var = (b20) childAt;
                if (b20Var.getVideoParticipant() != null) {
                    b20Var.b(z10);
                }
            }
        }
    }

    public final void G(wk0 wk0Var, boolean z10) {
        if (this.f27349c == null) {
            return;
        }
        ArrayList arrayList = this.f27350e;
        ArrayList arrayList2 = this.f27351f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f27349c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f27349c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            f2.s.c(new a20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(wk0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f27349c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f27349c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27351f.size() + this.f27350e.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        b20 b20Var = (b20) q1Var.f5501a;
        ChatObject.VideoParticipant videoParticipant2 = b20Var.f26991f;
        ArrayList arrayList = this.f27350e;
        if (i9 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i9);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i9)).participant;
        } else {
            int size = i9 - arrayList.size();
            ArrayList arrayList2 = this.f27351f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i9 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        b20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && b20Var.G && b20Var.getRenderer() != null) {
            b20Var.b(false);
            if (videoParticipant != null) {
                b20Var.b(true);
            }
        } else if (b20Var.G) {
            if (b20Var.getRenderer() == null && videoParticipant != null && this.f27354s) {
                b20Var.b(true);
            } else if (b20Var.getRenderer() != null && videoParticipant == null) {
                b20Var.b(false);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new b20(this, viewGroup.getContext()));
    }
}
