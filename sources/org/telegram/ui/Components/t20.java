package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class t20 extends rl0 {
    public ChatObject.Call f28871c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.v30 f28873n;
    public final org.telegram.ui.c60 f28874r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28872f = new ArrayList();
    public boolean f28875s = false;

    public t20(ChatObject.Call call, int i10, org.telegram.ui.c60 c60Var) {
        this.f28871c = call;
        this.d = i10;
        this.f28874r = c60Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.v30 v30Var) {
        this.h = arrayList;
        this.f28873n = v30Var;
    }

    public final void F(org.telegram.ui.r30 r30Var, boolean z4) {
        this.f28875s = z4;
        for (int i10 = 0; i10 < r30Var.getChildCount(); i10++) {
            View childAt = r30Var.getChildAt(i10);
            if (childAt instanceof s20) {
                s20 s20Var = (s20) childAt;
                if (s20Var.getVideoParticipant() != null) {
                    s20Var.b(z4);
                }
            }
        }
    }

    public final void G(sl0 sl0Var, boolean z4) {
        if (this.f28871c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f28872f;
        if (z4) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            ChatObject.Call call = this.f28871c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.f28871c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            f2.q.c(new q20(this, arrayList4, arrayList3), true).b(this);
            AndroidUtilities.updateVisibleRows(sl0Var);
            return;
        }
        arrayList2.clear();
        ChatObject.Call call3 = this.f28871c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.f28871c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28872f.size() + this.e.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        s20 s20Var = (s20) l1Var.f5785a;
        ChatObject.VideoParticipant videoParticipant2 = s20Var.f28607f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28872f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
                videoParticipant = null;
            } else {
                return;
            }
        }
        s20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && s20Var.H && s20Var.getRenderer() != null) {
            s20Var.b(false);
            if (videoParticipant != null) {
                s20Var.b(true);
            }
        } else if (s20Var.H) {
            if (s20Var.getRenderer() == null && videoParticipant != null && this.f28875s) {
                s20Var.b(true);
            } else if (s20Var.getRenderer() != null && videoParticipant == null) {
                s20Var.b(false);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new s20(this, viewGroup.getContext()));
    }
}
