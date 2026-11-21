package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class z0 implements DialogInterface.OnDismissListener {
    public final int f42616a;
    public final Object f42617b;

    public z0(Object obj, int i7) {
        this.f42616a = i7;
        this.f42617b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f42616a;
        Object obj = this.f42617b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.vf) obj).run();
                return;
            case 1:
                org.telegram.messenger.g0.v1((b5) obj);
                return;
            case 2:
                org.telegram.messenger.g0.v1((i4) obj);
                return;
            case 3:
                ((ui) obj).A4 = false;
                return;
            case 4:
                zk zkVar = (zk) obj;
                zkVar.U0 = null;
                zkVar.T.post(new tk(zkVar, 2));
                return;
            case 5:
                ot otVar = (ot) obj;
                otVar.f38353b2 = null;
                otVar.requestFocus();
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
                ThemeEditorView themeEditorView = ((pz0) obj).d;
                themeEditorView.f33189n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.w3(themeEditorView.f33185j, themeEditorView.f33180c, themeEditorView.f33184i);
                    try {
                        themeEditorView.f33185j.addView(themeEditorView.f33180c, themeEditorView.f33184i);
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
