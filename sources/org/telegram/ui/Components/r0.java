package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f29790a;
    public final Object f29791b;

    public r0(Object obj, int i10) {
        this.f29790a = i10;
        this.f29791b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f29790a;
        Object obj = this.f29791b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.lg) obj).run();
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
                ((bi) obj).f24739w4 = false;
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
                rm0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                org.telegram.messenger.i0.v1((lm0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((i01) obj).d;
                themeEditorView.f24218n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.i0.x3(themeEditorView.f24214j, themeEditorView.f24210c, themeEditorView.f24213i);
                    try {
                        themeEditorView.f24214j.addView(themeEditorView.f24210c, themeEditorView.f24213i);
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
