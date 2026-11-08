package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class p0 implements DialogInterface.OnDismissListener {
    public final int f36742a;
    public final Object f36743b;

    public p0(Object obj, int i7) {
        this.f36742a = i7;
        this.f36743b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f36742a;
        Object obj = this.f36743b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.xf) obj).run();
                return;
            case 1:
                org.telegram.messenger.g0.v1((u4) obj);
                return;
            case 2:
                org.telegram.messenger.g0.v1((b4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((di) obj).f33010w4 = false;
                return;
            case 5:
                ik ikVar = (ik) obj;
                ikVar.T0 = null;
                ikVar.S.post(new ck(ikVar, 2));
                return;
            case 6:
                zs zsVar = (zs) obj;
                zsVar.V1 = null;
                zsVar.requestFocus();
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
                themeEditorView.f31578n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.y3(themeEditorView.f31574j, themeEditorView.f31569c, themeEditorView.f31573i);
                    try {
                        themeEditorView.f31574j.addView(themeEditorView.f31569c, themeEditorView.f31573i);
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
