package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f24758a;
    public final Object f24759b;

    public b1(Object obj, int i10) {
        this.f24758a = i10;
        this.f24759b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24758a;
        Object obj = this.f24759b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.mg) obj).run();
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
                fo0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((zn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((u11) obj).d;
                themeEditorView.f24391l = null;
                if (themeEditorView.f24384b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24383a, themeEditorView.f24387g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24383a, themeEditorView.f24387g);
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
