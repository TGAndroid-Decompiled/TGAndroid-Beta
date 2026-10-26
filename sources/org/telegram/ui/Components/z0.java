package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements DialogInterface.OnDismissListener {
    public final int f35156a;
    public final Object f35157b;

    public z0(Object obj, int i10) {
        this.f35156a = i10;
        this.f35157b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f35156a;
        Object obj = this.f35157b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.jg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((f5) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((h4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((ti) obj).F2 = false;
                return;
            case 5:
                al alVar = (al) obj;
                alVar.T0 = null;
                alVar.S.post(new uk(alVar, 2));
                return;
            case 6:
                ju.i((ju) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                oo0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((io0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((h21) obj).d;
                themeEditorView.f26336n = null;
                if (themeEditorView.d != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.f26332j, themeEditorView.f26328c, themeEditorView.f26331i);
                    try {
                        themeEditorView.f26332j.addView(themeEditorView.f26328c, themeEditorView.f26331i);
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
