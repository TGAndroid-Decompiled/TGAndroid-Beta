package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class fg extends k1.b {
    public final gg f34602o;

    public fg(gg ggVar, gg ggVar2) {
        super(ggVar2);
        this.f34602o = ggVar;
    }

    @Override
    public final int g(float f10, float f11) {
        gg ggVar = this.f34602o;
        ChatActivityEnterView chatActivityEnterView = ggVar.Q0;
        if (chatActivityEnterView.f32159a5 && chatActivityEnterView.f32302v2 != null && chatActivityEnterView.A4.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.f32302v2 != null && chatActivityEnterView.V4 > 0.1f && ggVar.K.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f34602o.Q0;
        if (chatActivityEnterView.f32159a5) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.f32302v2 != null && chatActivityEnterView.V4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        int i10;
        int i11;
        gg ggVar = this.f34602o;
        ChatActivityEnterView chatActivityEnterView = ggVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.C4;
            RectF rectF = chatActivityEnterView.A4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.C4);
            if (chatActivityEnterView.X4 > 0.5f) {
                i11 = 2131754927;
            } else {
                i11 = 2131754930;
            }
            cVar.o(org.telegram.messenger.hd.M0(i11, null));
        } else if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.C4;
            RectF rectF2 = ggVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.C4);
            if (chatActivityEnterView.P) {
                i10 = 2131754934;
            } else {
                i10 = 2131754935;
            }
            cVar.o(org.telegram.messenger.hd.M0(i10, null));
        }
    }
}
