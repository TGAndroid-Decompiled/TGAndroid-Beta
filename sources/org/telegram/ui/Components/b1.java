package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f24765a;
    public final Object f24766b;

    public b1(Object obj, int i10) {
        this.f24765a = i10;
        this.f24766b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24765a;
        Object obj = this.f24766b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.kg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((g4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((ti) obj).C2 = false;
                return;
            case 5:
                al alVar = (al) obj;
                alVar.Q0 = null;
                alVar.P.post(new uk(alVar, 2));
                return;
            case 6:
                iu.i((iu) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.Q0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                go0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((ao0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((w11) obj).d;
                themeEditorView.f24395l = null;
                if (themeEditorView.f24388b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24387a, themeEditorView.f24391g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24387a, themeEditorView.f24391g);
                        themeEditorView.d();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
