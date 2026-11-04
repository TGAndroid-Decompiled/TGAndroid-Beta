package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
public final class p0 implements DialogInterface.OnDismissListener {
    public final int f37001a;
    public final Object f37002b;

    public p0(Object obj, int i3) {
        this.f37001a = i3;
        this.f37002b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i3 = this.f37001a;
        Object obj = this.f37002b;
        switch (i3) {
            case 0:
                ((org.telegram.ui.tf) obj).run();
                return;
            case 1:
                org.telegram.messenger.g0.v1((s4) obj);
                return;
            case 2:
                org.telegram.messenger.g0.v1((z3) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).M0 = null;
                return;
            case 4:
                ((bi) obj).f32293x4 = false;
                return;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.U0 = null;
                hkVar.T.post(new bk(hkVar, 2));
                return;
            case 6:
                xs xsVar = (xs) obj;
                xsVar.W1 = null;
                xsVar.requestFocus();
                return;
            case 7:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                tl0.I = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                org.telegram.messenger.g0.v1((nl0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((dz0) obj).d;
                themeEditorView.f31652n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.y3(themeEditorView.f31648j, themeEditorView.f31643c, themeEditorView.f31647i);
                    try {
                        themeEditorView.f31648j.addView(themeEditorView.f31643c, themeEditorView.f31647i);
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
