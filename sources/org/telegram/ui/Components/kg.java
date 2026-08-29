package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kg extends j1.b {
    public final lg f30036o;

    public kg(lg lgVar, lg lgVar2) {
        super(lgVar2);
        this.f30036o = lgVar;
    }

    @Override
    public final int g(float f9, float f10) {
        lg lgVar = this.f30036o;
        ChatActivityEnterView chatActivityEnterView = lgVar.R;
        if (chatActivityEnterView.f26165n4 && chatActivityEnterView.I1 != null && chatActivityEnterView.N3.contains(f9, f10)) {
            return 2;
        }
        if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26141i4 > 0.1f && lgVar.F.contains(f9, f10)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f30036o.R;
        if (chatActivityEnterView.f26165n4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26141i4 > 0.1f) {
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
        lg lgVar = this.f30036o;
        ChatActivityEnterView chatActivityEnterView = lgVar.R;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.P3);
            if (chatActivityEnterView.f26151k4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            cVar.o(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF2 = lgVar.F;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.P3);
            if (chatActivityEnterView.K) {
                i11 = R.string.AccActionOnceDeactivate;
            } else {
                i11 = R.string.AccActionOnceActivate;
            }
            cVar.o(LocaleController.getString(i11));
        }
    }
}
