package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vg extends j1.b {
    public final wg f31503o;

    public vg(wg wgVar, wg wgVar2) {
        super(wgVar2);
        this.f31503o = wgVar;
    }

    @Override
    public final int g(float f7, float f10) {
        wg wgVar = this.f31503o;
        ChatActivityEnterView chatActivityEnterView = wgVar.f32382g0;
        if (chatActivityEnterView.V4 && chatActivityEnterView.N1 != null && chatActivityEnterView.f23743u4.contains(f7, f10)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.Q4 > 0.1f && wgVar.P.contains(f7, f10)) {
            return 4;
        }
        if (!chatActivityEnterView.f23749v4.isEmpty() && chatActivityEnterView.f23749v4.contains(f7, f10)) {
            return 5;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f31503o.f32382g0;
        if (chatActivityEnterView.V4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.Q4 > 0.1f) {
            arrayList.add(4);
        }
        if (!chatActivityEnterView.f23749v4.isEmpty()) {
            arrayList.add(5);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i10 == 5 && i11 == 16) {
            ChatActivityEnterView chatActivityEnterView = this.f31503o.f32382g0;
            int i12 = ChatActivityEnterView.S5;
            chatActivityEnterView.A1();
            return true;
        }
        return true;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        boolean z10;
        String string;
        int i11;
        int i12;
        wg wgVar = this.f31503o;
        ChatActivityEnterView chatActivityEnterView = wgVar.f32382g0;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.f23763x4;
            RectF rectF = chatActivityEnterView.f23743u4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.f23763x4);
            if (chatActivityEnterView.S4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            dVar.p(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.f23763x4;
            RectF rectF2 = wgVar.P;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.f23763x4);
            if (chatActivityEnterView.O) {
                i11 = R.string.AccActionOnceDeactivate;
            } else {
                i11 = R.string.AccActionOnceActivate;
            }
            dVar.p(LocaleController.getString(i11));
        } else if (i10 == 5) {
            Rect rect3 = chatActivityEnterView.f23763x4;
            RectF rectF3 = chatActivityEnterView.f23749v4;
            rect3.set((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            dVar.h(chatActivityEnterView.f23763x4);
            if (!chatActivityEnterView.f23660g3 && !chatActivityEnterView.f23672i3) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                string = wgVar.K;
            } else {
                string = LocaleController.getString(R.string.AccActionOpenTranscription);
            }
            dVar.p(string);
            dVar.k(!z10);
        }
    }
}
