package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tg extends j1.b {
    public final ug f27408o;

    public tg(ug ugVar, ug ugVar2) {
        super(ugVar2);
        this.f27408o = ugVar;
    }

    @Override
    public final int g(float f7, float f10) {
        ug ugVar = this.f27408o;
        ChatActivityEnterView chatActivityEnterView = ugVar.V;
        if (chatActivityEnterView.f20919r4 && chatActivityEnterView.M1 != null && chatActivityEnterView.R3.contains(f7, f10)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.M1 != null && chatActivityEnterView.f20892m4 > 0.1f && ugVar.J.contains(f7, f10)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f27408o.V;
        if (chatActivityEnterView.f20919r4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.M1 != null && chatActivityEnterView.f20892m4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        int i11;
        int i12;
        ug ugVar = this.f27408o;
        ChatActivityEnterView chatActivityEnterView = ugVar.V;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.T3;
            RectF rectF = chatActivityEnterView.R3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.T3);
            if (chatActivityEnterView.f20903o4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            dVar.o(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.T3;
            RectF rectF2 = ugVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.T3);
            if (chatActivityEnterView.O) {
                i11 = R.string.AccActionOnceDeactivate;
            } else {
                i11 = R.string.AccActionOnceActivate;
            }
            dVar.o(LocaleController.getString(i11));
        }
    }
}
