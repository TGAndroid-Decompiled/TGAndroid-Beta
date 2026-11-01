package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f29848a;
    public final Object f29849b;

    public r0(Object obj, int i10) {
        this.f29848a = i10;
        this.f29849b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f29848a;
        Object obj = this.f29849b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ng) obj).run();
                return;
            case 1:
                org.telegram.messenger.i0.v1((r4) obj);
                return;
            case 2:
                org.telegram.messenger.i0.v1((y3) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((bi) obj).f24830w4 = false;
                return;
            case 5:
                kk kkVar = (kk) obj;
                kkVar.T0 = null;
                kkVar.S.post(new ek(kkVar, 2));
                return;
            case 6:
                mt mtVar = (mt) obj;
                mtVar.V1 = null;
                mtVar.requestFocus();
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                sm0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                org.telegram.messenger.i0.v1((mm0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((j01) obj).d;
                themeEditorView.f24219n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.i0.x3(themeEditorView.f24215j, themeEditorView.f24211c, themeEditorView.f24214i);
                    try {
                        themeEditorView.f24215j.addView(themeEditorView.f24211c, themeEditorView.f24214i);
                        themeEditorView.e();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
