package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class o0 implements DialogInterface.OnDismissListener {
    public final int f36432a;
    public final Object f36433b;

    public o0(Object obj, int i7) {
        this.f36432a = i7;
        this.f36433b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f36432a;
        Object obj = this.f36433b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.xf) obj).run();
                return;
            case 1:
                org.telegram.messenger.g0.v1((t4) obj);
                return;
            case 2:
                org.telegram.messenger.g0.v1((a4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((ci) obj).f32678z4 = false;
                return;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.T0 = null;
                hkVar.S.post(new bk(hkVar, 2));
                return;
            case 6:
                ys ysVar = (ys) obj;
                ysVar.V1 = null;
                ysVar.requestFocus();
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                ql0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                org.telegram.messenger.g0.v1((kl0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((ez0) obj).d;
                themeEditorView.f31594n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.y3(themeEditorView.f31590j, themeEditorView.f31585c, themeEditorView.f31589i);
                    try {
                        themeEditorView.f31590j.addView(themeEditorView.f31585c, themeEditorView.f31589i);
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
