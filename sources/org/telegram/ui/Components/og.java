package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class og extends k1.b {
    public final pg f38099o;

    public og(pg pgVar, pg pgVar2) {
        super(pgVar2);
        this.f38099o = pgVar;
    }

    @Override
    public final int g(float f10, float f11) {
        pg pgVar = this.f38099o;
        ChatActivityEnterView chatActivityEnterView = pgVar.Q0;
        if (chatActivityEnterView.f32596g5 && chatActivityEnterView.B2 != null && chatActivityEnterView.G4.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.B2 != null && chatActivityEnterView.f32554b5 > 0.1f && pgVar.K.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f38099o.Q0;
        if (chatActivityEnterView.f32596g5) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.B2 != null && chatActivityEnterView.f32554b5 > 0.1f) {
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
        pg pgVar = this.f38099o;
        ChatActivityEnterView chatActivityEnterView = pgVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.I4;
            RectF rectF = chatActivityEnterView.G4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.I4);
            if (chatActivityEnterView.f32570d5 > 0.5f) {
                i11 = 2131754927;
            } else {
                i11 = 2131754930;
            }
            cVar.o(org.telegram.messenger.gd.M0(i11, null));
        } else if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.I4;
            RectF rectF2 = pgVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.I4);
            if (chatActivityEnterView.P) {
                i10 = 2131754934;
            } else {
                i10 = 2131754935;
            }
            cVar.o(org.telegram.messenger.gd.M0(i10, null));
        }
    }
}
