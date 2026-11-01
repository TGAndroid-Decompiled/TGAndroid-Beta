package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class vf extends j1.b {
    public final wf f31279o;

    public vf(wf wfVar, wf wfVar2) {
        super(wfVar2);
        this.f31279o = wfVar;
    }

    @Override
    public final int g(float f7, float f10) {
        wf wfVar = this.f31279o;
        ChatActivityEnterView chatActivityEnterView = wfVar.f32228b0;
        if (chatActivityEnterView.f23788s4 && chatActivityEnterView.N1 != null && chatActivityEnterView.S3.contains(f7, f10)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f23757n4 > 0.1f && wfVar.J.contains(f7, f10)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f31279o.f32228b0;
        if (chatActivityEnterView.f23788s4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f23757n4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        int i11;
        int i12;
        wf wfVar = this.f31279o;
        ChatActivityEnterView chatActivityEnterView = wfVar.f32228b0;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.f23769p4 > 0.5f) {
                i12 = 2131754927;
            } else {
                i12 = 2131754930;
            }
            cVar.o(org.telegram.messenger.dd.L0(i12, null));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF2 = wfVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.O) {
                i11 = 2131754934;
            } else {
                i11 = 2131754935;
            }
            cVar.o(org.telegram.messenger.dd.L0(i11, null));
        }
    }
}
