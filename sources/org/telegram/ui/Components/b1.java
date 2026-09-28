package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22833a;
    public final Object f22834b;

    public b1(Object obj, int i10) {
        this.f22833a = i10;
        this.f22834b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22833a;
        Object obj = this.f22834b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.rg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((f4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((wi) obj).f30008z2 = false;
                return;
            case 5:
                du.i((du) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.P0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                wn0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((qn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((n11) obj).d;
                themeEditorView.f22439l = null;
                if (themeEditorView.f22432b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22431a, themeEditorView.f22435g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22431a, themeEditorView.f22435g);
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
