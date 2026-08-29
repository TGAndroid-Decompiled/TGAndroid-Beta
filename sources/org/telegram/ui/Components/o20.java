package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class o20 extends il0 {
    public ChatObject.Call f31235c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.j30 f31238n;
    public final org.telegram.ui.r50 f31239r;
    public final ArrayList f31236e = new ArrayList();
    public final ArrayList f31237f = new ArrayList();
    public boolean f31240s = false;

    public o20(ChatObject.Call call, int i10, org.telegram.ui.r50 r50Var) {
        this.f31235c = call;
        this.d = i10;
        this.f31239r = r50Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.j30 j30Var) {
        this.h = arrayList;
        this.f31238n = j30Var;
    }

    public final void F(org.telegram.ui.f30 f30Var, boolean z10) {
        this.f31240s = z10;
        for (int i10 = 0; i10 < f30Var.getChildCount(); i10++) {
            View childAt = f30Var.getChildAt(i10);
            if (childAt instanceof n20) {
                n20 n20Var = (n20) childAt;
                if (n20Var.getVideoParticipant() != null) {
                    n20Var.b(z10);
                }
            }
        }
    }

    public final void G(jl0 jl0Var, boolean z10) {
        if (this.f31235c == null) {
            return;
        }
        ArrayList arrayList = this.f31236e;
        ArrayList arrayList2 = this.f31237f;
        if (z10) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f31235c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f31235c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            f2.q.c(new l20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(jl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f31235c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f31235c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f31237f.size() + this.f31236e.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        n20 n20Var = (n20) n1Var.f6432a;
        ChatObject.VideoParticipant videoParticipant2 = n20Var.f30830f;
        ArrayList arrayList = this.f31236e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f31237f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        n20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && n20Var.G && n20Var.getRenderer() != null) {
            n20Var.b(false);
            if (videoParticipant != null) {
                n20Var.b(true);
            }
        } else if (n20Var.G) {
            if (n20Var.getRenderer() == null && videoParticipant != null && this.f31240s) {
                n20Var.b(true);
            } else if (n20Var.getRenderer() != null && videoParticipant == null) {
                n20Var.b(false);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new n20(this, viewGroup.getContext()));
    }
}
