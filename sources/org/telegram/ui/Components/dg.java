package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class dg extends j1.b {

    public final eg f27748o;

    public dg(eg egVar, eg egVar2) {
        super(egVar2);
        this.f27748o = egVar;
    }

    @Override
    public final int g(float f10, float f11) {
        eg egVar = this.f27748o;
        ChatActivityEnterView chatActivityEnterView = egVar.R;
        if (chatActivityEnterView.f26150n4 && chatActivityEnterView.I1 != null && chatActivityEnterView.N3.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.f26126i4 <= 0.1f || !egVar.F.contains(f10, f11)) ? -1 : 4;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f27748o.R;
        if (chatActivityEnterView.f26150n4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.f26126i4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        eg egVar = this.f27748o;
        ChatActivityEnterView chatActivityEnterView = egVar.R;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.P3);
            cVar.o(LocaleController.getString(chatActivityEnterView.f26136k4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF2 = egVar.F;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.P3);
            cVar.o(LocaleController.getString(chatActivityEnterView.K ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
