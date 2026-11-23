package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class y0 implements DialogInterface.OnDismissListener {
    public final int f42255a;
    public final Object f42256b;

    public y0(Object obj, int i7) {
        this.f42255a = i7;
        this.f42256b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f42255a;
        Object obj = this.f42256b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.vf) obj).run();
                return;
            case 1:
                org.telegram.messenger.g0.v1((a5) obj);
                return;
            case 2:
                org.telegram.messenger.g0.v1((h4) obj);
                return;
            case 3:
                ((ti) obj).A4 = false;
                return;
            case 4:
                xk xkVar = (xk) obj;
                xkVar.U0 = null;
                xkVar.T.post(new rk(xkVar, 2));
                return;
            case 5:
                mt mtVar = (mt) obj;
                mtVar.f37536b2 = null;
                mtVar.requestFocus();
                return;
            case 6:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                em0.I = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                org.telegram.messenger.g0.v1((yl0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((oz0) obj).d;
                themeEditorView.f33256n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.w3(themeEditorView.f33252j, themeEditorView.f33247c, themeEditorView.f33251i);
                    try {
                        themeEditorView.f33252j.addView(themeEditorView.f33247c, themeEditorView.f33251i);
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
