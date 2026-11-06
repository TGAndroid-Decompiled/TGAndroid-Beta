package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class zf extends k1.b {
    public final ag f40934o;

    public zf(ag agVar, ag agVar2) {
        super(agVar2);
        this.f40934o = agVar;
    }

    @Override
    public final int g(float f10, float f11) {
        ag agVar = this.f40934o;
        ChatActivityEnterView chatActivityEnterView = agVar.f31804b0;
        if (chatActivityEnterView.f31122s4 && chatActivityEnterView.N1 != null && chatActivityEnterView.S3.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f31091n4 > 0.1f && agVar.J.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f40934o.f31804b0;
        if (chatActivityEnterView.f31122s4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f31091n4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        int i10;
        int i11;
        ag agVar = this.f40934o;
        ChatActivityEnterView chatActivityEnterView = agVar.f31804b0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.f31102p4 > 0.5f) {
                i11 = 2131754927;
            } else {
                i11 = 2131754930;
            }
            dVar.o(org.telegram.messenger.hd.M0(i11, null));
        } else if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF2 = agVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.O) {
                i10 = 2131754934;
            } else {
                i10 = 2131754935;
            }
            dVar.o(org.telegram.messenger.hd.M0(i10, null));
        }
    }
}
