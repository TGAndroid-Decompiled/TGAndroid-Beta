package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class m0 implements DialogInterface.OnDismissListener {
    public final int f37019a;
    public final Object f37020b;

    public m0(Object obj, int i7) {
        this.f37019a = i7;
        this.f37020b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f37019a;
        Object obj = this.f37020b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.uf) obj).run();
                return;
            case 1:
                org.telegram.messenger.g0.v1((s4) obj);
                return;
            case 2:
                org.telegram.messenger.g0.v1((z3) obj);
                return;
            case 3:
                ((ki) obj).A4 = false;
                return;
            case 4:
                qk qkVar = (qk) obj;
                qkVar.U0 = null;
                qkVar.T.post(new kk(qkVar, 2));
                return;
            case 5:
                ft ftVar = (ft) obj;
                ftVar.f34690b2 = null;
                ftVar.requestFocus();
                return;
            case 6:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                ul0.I = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                org.telegram.messenger.g0.v1((ol0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((gz0) obj).d;
                themeEditorView.f32759n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.x3(themeEditorView.f32755j, themeEditorView.f32750c, themeEditorView.f32754i);
                    try {
                        themeEditorView.f32755j.addView(themeEditorView.f32750c, themeEditorView.f32754i);
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
