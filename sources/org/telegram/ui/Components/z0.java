package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements DialogInterface.OnDismissListener {
    public final int f35153a;
    public final Object f35154b;

    public z0(Object obj, int i10) {
        this.f35153a = i10;
        this.f35154b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f35153a;
        Object obj = this.f35154b;
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
                themeEditorView.f26334n = null;
                if (themeEditorView.d != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.f26330j, themeEditorView.f26326c, themeEditorView.f26329i);
                    try {
                        themeEditorView.f26330j.addView(themeEditorView.f26326c, themeEditorView.f26329i);
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
